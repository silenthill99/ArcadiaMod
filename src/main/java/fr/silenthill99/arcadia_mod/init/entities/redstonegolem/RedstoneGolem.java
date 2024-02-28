package fr.silenthill99.arcadia_mod.init.entities.redstonegolem;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class RedstoneGolem extends MonsterEntity
{
    public RedstoneGolem(EntityType<? extends MonsterEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes()
    {
        return MonsterEntity.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 200.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.15f)
                .add(Attributes.ATTACK_DAMAGE, 10.0f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
