package fr.silenthill99.arcadia_mod.init.entities.cyclops;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class Cyclops extends MonsterEntity {
    public Cyclops(EntityType<? extends MonsterEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes()
    {
        return MonsterEntity.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 300.0f)
                .add(Attributes.ATTACK_DAMAGE,12.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.5f);
    }

    @Override
    protected void registerGoals()
    {
        super.registerGoals();
    }
}
