package net.leafenzo.template.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.template.Super;
import net.leafenzo.template.block.ModBlocks;
import net.leafenzo.template.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.function.Function;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public static final ArrayList<Block> usedBlocks = new ArrayList<Block>();

    public void addDrop(Block block, ItemConvertible drop) {
        this.addDrop(block, this.drops(drop));
        usedBlocks.add(block);
    }
    public void addDrop(Block block, Function<Block, LootTable.Builder> lootTableFunction) {
        addDrop(block, lootTableFunction.apply(block));
        usedBlocks.add(block);
    }
    public void addDrop(Block block) {
        addDrop(block, block);
        usedBlocks.add(block);
    }
    public void addDrop(Block block, LootTable.Builder lootTable) {
        this.lootTables.put(block.getLootTableId(), lootTable);
        usedBlocks.add(block);
    }

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //this.addDrop(ModBlocks.BLAZE_ROD_BLOCK);
        //this.addDrop(ModBlocks.GRASS_CLIPPINGS_BLOCK, (Block block) -> this.drops((Block)block, block));
        //this.addDrop(ModBlocks.BOOK_BLOCK, (Block block) -> this.drops((Block)block, Items.BOOK, ConstantLootNumberProvider.create(9.0f)));
        //this.addDrop(ModBlocks.COMPRESSED_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));
        //this.addDropWithSilkTouch(ModBlocks.EGG_BLOCK);

        //Automatic
        for(Identifier id : ModUtil.allBlockIdsInNamespace(Super.MOD_ID)) {
            Block block = Registries.BLOCK.get(id);
            if(usedBlocks.contains(block)) { continue; }
            this.addDrop(block);
        }
    }
}
