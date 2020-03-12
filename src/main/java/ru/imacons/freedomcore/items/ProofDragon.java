package ru.imacons.freedomcore.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.imacons.freedomcore.Freedomcore;

public class ProofDragon extends Item {

    public ProofDragon(){
        setRegistryName("proof_dragon");
        setUnlocalizedName(Freedomcore.MODID + ".proof_dragon");
        setCreativeTab(CreativeTabs.MISC);
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this,0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return false;
    }

    public boolean isEnchantable(ItemStack stack)
    {
        return false;
    }

}
