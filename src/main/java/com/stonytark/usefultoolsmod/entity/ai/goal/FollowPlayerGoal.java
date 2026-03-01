package com.stonytark.usefultoolsmod.entity.ai.goal;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;
import java.util.List;

public class FollowPlayerGoal extends Goal {
    private final MobEntity mob;
    private PlayerEntity targetPlayer;
    private final double speedModifier;
    private final double followRange;
    private final double stopDistance;

    public FollowPlayerGoal(MobEntity mob, double speedModifier, double followRange, double stopDistance) {
        this.mob = mob;
        this.speedModifier = speedModifier;
        this.followRange = followRange;
        this.stopDistance = stopDistance;
        this.setControls(EnumSet.of(Control.MOVE, Control.LOOK));
    }

    @Override
    public boolean canStart() {
        List<PlayerEntity> players = mob.getWorld().getEntitiesByClass(PlayerEntity.class,
                mob.getBoundingBox().expand(followRange),
                player -> player.isAlive() && !player.isSpectator());

        double closestDistance = Double.MAX_VALUE;
        PlayerEntity closestPlayer = null;

        for (PlayerEntity player : players) {
            double dist = mob.squaredDistanceTo(player);
            if (dist < closestDistance && mob.canSee(player)) {
                closestDistance = dist;
                closestPlayer = player;
            }
        }

        if (closestPlayer != null) {
            this.targetPlayer = closestPlayer;
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldContinue() {
        return targetPlayer != null
                && targetPlayer.isAlive()
                && mob.squaredDistanceTo(targetPlayer) > stopDistance * stopDistance
                && mob.canSee(targetPlayer);
    }

    @Override
    public void stop() {
        targetPlayer = null;
        mob.getNavigation().stop();
    }

    @Override
    public void tick() {
        if (targetPlayer == null) return;
        Vec3d targetPos = targetPlayer.getPos();
        mob.getLookControl().lookAt(targetPlayer, 30.0F, 30.0F);
        mob.getNavigation().startMovingTo(targetPos.x, targetPos.y + 1.0D, targetPos.z, speedModifier);
    }
}
