package assets.mmt.creativetab;

import com.sevraye.mmt.init.ModBlocks;
import com.sevraye.mmt.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMMT {
	public static final CreativeTabs MMT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.frenchFlag);
		}

	};
}
