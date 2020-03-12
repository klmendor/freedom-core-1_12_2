package ru.imacons.freedomcore.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.imacons.freedomcore.Freedomcore;

public class FreedomcoreItems {

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_sanity")
    public static ProofSanity proofSanity;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_blank")
    public static ProofBlank proofBlank;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_science")
    public static ProofScience proofScience;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_dragon")
    public static ProofDragon proofDragon;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_engineering")
    public static ProofEngineering proofEngineering;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_logistics")
    public static ProofLogistics proofLogistics;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_machinery")
    public static ProofMachinery proofMachinery;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_magic")
    public static ProofMagic proofMagic;

    @GameRegistry.ObjectHolder(Freedomcore.MODID + ":proof_nature")
    public static ProofNature proofNature;


    @SideOnly(Side.CLIENT)
    public static void initModels(){
        proofSanity.initModel();
        proofBlank.initModel();
        proofScience.initModel();
        proofDragon.initModel();
        proofEngineering.initModel();
        proofLogistics.initModel();
        proofMachinery.initModel();
        proofMagic.initModel();
        proofNature.initModel();
    }




}
