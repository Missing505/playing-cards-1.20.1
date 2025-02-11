package net.missing.playingcards.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.missing.playingcards.PlayingCards;

public class ModItems {
    public static final Item ACE_OF_SPADES = registerItem("ace_of_spades", new Item(new FabricItemSettings()));
    public static final Item TWO_OF_SPADES = registerItem("two_of_spades", new Item(new FabricItemSettings()));
    public static final Item THREE_OF_SPADES = registerItem("three_of_spades", new Item(new FabricItemSettings()));
    public static final Item FOUR_OF_SPADES = registerItem("four_of_spades", new Item(new FabricItemSettings()));
    public static final Item FIVE_OF_SPADES = registerItem("five_of_spades", new Item(new FabricItemSettings()));
    public static final Item SIX_OF_SPADES = registerItem("six_of_spades", new Item(new FabricItemSettings()));
    public static final Item SEVEN_OF_SPADES = registerItem("seven_of_spades", new Item(new FabricItemSettings()));
    public static final Item EIGHT_OF_SPADES = registerItem("eight_of_spades", new Item(new FabricItemSettings()));
    public static final Item NINE_OF_SPADES = registerItem("nine_of_spades", new Item(new FabricItemSettings()));
    public static final Item TEN_OF_SPADES = registerItem("ten_of_spades", new Item(new FabricItemSettings()));
    public static final Item ACE_OF_DIAMONDS = registerItem("ace_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item TWO_OF_DIAMONDS = registerItem("two_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item THREE_OF_DIAMONDS = registerItem("three_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item FOUR_OF_DIAMONDS = registerItem("four_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item FIVE_OF_DIAMONDS = registerItem("five_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item SIX_OF_DIAMONDS = registerItem("six_of_diamonds", new Item(new FabricItemSettings()));
    public static final Item ACE_OF_CLUBS = registerItem("ace_of_clubs", new Item(new FabricItemSettings()));
    public static final Item TWO_OF_CLUBS = registerItem("two_of_clubs", new Item(new FabricItemSettings()));
    public static final Item THREE_OF_CLUBS = registerItem("three_of_clubs", new Item(new FabricItemSettings()));
    public static final Item FOUR_OF_CLUBS = registerItem("four_of_clubs", new Item(new FabricItemSettings()));
    public static final Item FIVE_OF_CLUBS = registerItem("five_of_clubs", new Item(new FabricItemSettings()));
    public static final Item SIX_OF_CLUBS = registerItem("six_of_clubs", new Item(new FabricItemSettings()));
    public static final Item ACE_OF_HEARTS = registerItem("ace_of_hearts", new Item(new FabricItemSettings()));
    public static final Item TWO_OF_HEARTS = registerItem("two_of_hearts", new Item(new FabricItemSettings()));
    public static final Item THREE_OF_HEARTS = registerItem("three_of_hearts", new Item(new FabricItemSettings()));
    public static final Item FOUR_OF_HEARTS = registerItem("four_of_hearts", new Item(new FabricItemSettings()));
    public static final Item FIVE_OF_HEARTS = registerItem("five_of_hearts", new Item(new FabricItemSettings()));
    public static final Item SIX_OF_HEARTS = registerItem("six_of_hearts", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlayingCards.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlayingCards.LOGGER.info("Registering Mod Items for " + PlayingCards.MOD_ID);
    }
}
