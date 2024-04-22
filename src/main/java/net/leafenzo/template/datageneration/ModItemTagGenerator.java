package net.leafenzo.template.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leafenzo.template.block.ModBlocks;
import net.leafenzo.template.registration.ModRegistryHelper;
import net.leafenzo.template.registration.WoodSet;
import net.leafenzo.template.registry.tag.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;
import net.leafenzo.template.registration.ModRegistryHelper.*;

public class ModItemTagGenerator extends FabricTagProvider<Item> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, Registries.ITEM.getKey(), registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Vanilla
//        getOrCreateTagBuilder(ModTags.Items.DYES)
//                .add(Items.BLACK_DYE, Items.BLUE_DYE, Items.BROWN_DYE, Items.CYAN_DYE, Items.GRAY_DYE, Items.GREEN_DYE, Items.LIGHT_BLUE_DYE, Items.LIGHT_GRAY_DYE, Items.LIME_DYE, Items.MAGENTA_DYE, Items.ORANGE_DYE, Items.PINK_DYE, Items.PURPLE_DYE, Items.RED_DYE, Items.YELLOW_DYE, Items.WHITE_DYE)
//        ;
//        getOrCreateTagBuilder(ModTags.Items.GOLD_INGOTS)
//                .add(Items.GOLD_INGOT);
//        ;
//        getOrCreateTagBuilder(ModTags.Items.IRON_INGOTS)
//                .add(Items.IRON_INGOT);
//        ;
//        getOrCreateTagBuilder(ModTags.Items.WAX)
//                .add(Items.HONEYCOMB)
//                .add(ModBlocks.HANGING_WAXCAP_WAX.asItem())
//        ;

        // Special
//        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
//        ;


        // Main
        for(WoodSet woodSet : ModBlocks.WOODSETS) {
            getOrCreateTagBuilder(woodSet.getItemLogsTag()).add(woodSet.getLog().asItem());
            getOrCreateTagBuilder(woodSet.getItemLogsTag()).add(woodSet.getStrippedLog().asItem());
            getOrCreateTagBuilder(woodSet.getItemLogsTag()).add(woodSet.getWood().asItem());
            getOrCreateTagBuilder(woodSet.getItemLogsTag()).add(woodSet.getStrippedWood().asItem());
        }

//        for (Block block : ModBlocks.WOOL_CARPET_BLOCKS) {
//            getOrCreateTagBuilder(ItemTags.WOOL_CARPETS).add(block.asItem());  // used for adding a carpet to llamas in LlamaEntity.isHorseArmor()
//        }

//        for (Block block : ModBlocks.WOOL_BLOCKS) {
//            getOrCreateTagBuilder(ItemTags.WOOL).add(block.asItem());
//        }

        for (Block block : ModBlocks.LEAVES) {
            getOrCreateTagBuilder(ItemTags.LEAVES).add(block.asItem());
        }

        for (Block block : ModBlocks.LOGS_THAT_BURN) {
            getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).add(block.asItem());
        }
        for (Block block : ModBlocks.LOGS) {
            getOrCreateTagBuilder(ItemTags.LOGS).add(block.asItem());
        }

        for (Block block : ModBlocks.PLANKS) {
            getOrCreateTagBuilder(ItemTags.PLANKS).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_BUTTONS) {
//            getOrCreateTagBuilder(ItemTags.BUTTONS).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_DOORS) {
//            getOrCreateTagBuilder(ItemTags.DOORS).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_STAIRS) {
//            getOrCreateTagBuilder(ItemTags.STAIRS).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_SLABS) {
//            getOrCreateTagBuilder(ItemTags.SLABS).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_FENCES) {
//            getOrCreateTagBuilder(ItemTags.FENCES).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).add(block.asItem());
        }

        for (Block block : ModBlocks.FENCE_GATES) {
            getOrCreateTagBuilder(ItemTags.FENCE_GATES).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_PRESSURE_PLATES) {
            getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(block.asItem());
        }

        for (Block block : ModBlocks.WOODEN_TRAPDOORS) {
//            getOrCreateTagBuilder(ItemTags.TRAPDOORS).add(block.asItem());
            getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(block.asItem());
        }

        for (Block block : ModBlocks.SAPLINGS) {
            getOrCreateTagBuilder(ItemTags.SAPLINGS).add(block.asItem());
        }

        for (Block block : ModBlocks.STAIRS) {
            getOrCreateTagBuilder(ItemTags.STAIRS).add(block.asItem());
        }
        for (Block block : ModBlocks.SLABS) {
            getOrCreateTagBuilder(ItemTags.SLABS).add(block.asItem());
        }
        for (Block block : ModBlocks.WALLS) {
            getOrCreateTagBuilder(ItemTags.WALLS).add(block.asItem());
        }

        for (Block block : ModBlocks.SMALL_FLOWERS) {
            getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS).add(block.asItem());
        }

//        for (Block block : ModBlocks.CANDLE_BLOCKS) {
//            getOrCreateTagBuilder(ItemTags.CANDLES).add(block.asItem());
//        }

//        for (Item item : ItemRegistry.DYE_ITEMS) {
//            getOrCreateTagBuilder(ModTags.Items.DYES).add(item);
//        }

        for (Block block : ModBlocks.MUSHROOM_PLANTS) {
            getOrCreateTagBuilder(ModTags.Items.MUSHROOMS).add(block.asItem());
        }

        for (Item item : ItemRegistry.SIGN_ITEMS) {
            getOrCreateTagBuilder(ItemTags.SIGNS).add(item);
        }
        for (Item item : ItemRegistry.HANGING_SIGN_ITEMS) {
            getOrCreateTagBuilder(ItemTags.HANGING_SIGNS).add(item);
        }

        for (Item item : ItemRegistry.BOAT_ITEMS) {
            getOrCreateTagBuilder(ItemTags.BOATS).add(item);
        }
        for (Item item : ItemRegistry.CHEST_BOAT_ITEMS) {
            getOrCreateTagBuilder(ItemTags.CHEST_BOATS).add(item);
        }
    }
}
