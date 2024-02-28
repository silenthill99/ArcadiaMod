package fr.silenthill99.arcadia_mod.tileentity;

import fr.silenthill99.arcadia_mod.init.ModTileEntities;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRedBlock extends TileEntity implements ITickableTileEntity {

    private int counter = 0;

    public TileEntityRedBlock() {
        super(ModTileEntities.RED_BLOCK_TILE_ENTITY.get());
    }


    @Override
    public void load(BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);

        this.setCounter(nbt.getInt("counter"));
    }

    @Override
    public CompoundNBT save(CompoundNBT compound) {
        super.save(compound);

        compound.putInt("counter", this.getCounter());

        return compound;
    }

    @Override
    public void tick() {

        setCounter(getCounter() + 1);

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
