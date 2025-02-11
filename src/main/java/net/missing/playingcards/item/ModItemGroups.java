package net.missing.playingcards.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.missing.playingcards.PlayingCards;

public class ModItemGroups {
    public static final ItemGroup PLAYINGCARDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlayingCards.MOD_ID, "playingcards"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.playingcards"))
                    .icon(() -> new ItemStack(ModItems.ACE_OF_SPADES)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.ACE_OF_SPADES);
                        entries.add(ModItems.TWO_OF_SPADES);
                        entries.add(ModItems.THREE_OF_SPADES);
                        entries.add(ModItems.FOUR_OF_SPADES);
                        entries.add(ModItems.FIVE_OF_SPADES);
                        entries.add(ModItems.SIX_OF_SPADES);
                        entries.add(ModItems.SEVEN_OF_SPADES);
                        entries.add(ModItems.EIGHT_OF_SPADES);
                        entries.add(ModItems.NINE_OF_SPADES);
                        entries.add(ModItems.TEN_OF_SPADES);
                        entries.add(ModItems.ACE_OF_CLUBS);
                        entries.add(ModItems.TWO_OF_CLUBS);
                        entries.add(ModItems.THREE_OF_CLUBS);
                        entries.add(ModItems.FOUR_OF_CLUBS);
                        entries.add(ModItems.FIVE_OF_CLUBS);
                        entries.add(ModItems.SIX_OF_CLUBS);
                        entries.add(ModItems.ACE_OF_DIAMONDS);
                        entries.add(ModItems.TWO_OF_DIAMONDS);
                        entries.add(ModItems.THREE_OF_DIAMONDS);
                        entries.add(ModItems.FOUR_OF_DIAMONDS);
                        entries.add(ModItems.FIVE_OF_DIAMONDS);
                        entries.add(ModItems.SIX_OF_DIAMONDS);
                        entries.add(ModItems.ACE_OF_HEARTS);
                        entries.add(ModItems.TWO_OF_HEARTS);
                        entries.add(ModItems.THREE_OF_HEARTS);
                        entries.add(ModItems.FOUR_OF_HEARTS);
                        entries.add(ModItems.FIVE_OF_HEARTS);
                        entries.add(ModItems.SIX_OF_HEARTS);

                    })).build());


    public static void registerItemGroups() {
        PlayingCards.LOGGER.info("Registering Item Groups for " + PlayingCards.MOD_ID);
    }
}
