package io.gamer4life1.simplelogistics.blocks;

import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Controller extends Block implements ITileEntityProvider
{
    public Controller()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MOD_ID + ".controller");
        setRegistryName("controller");

        setHardness(5.0F);
        //setCreativeTab();
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
