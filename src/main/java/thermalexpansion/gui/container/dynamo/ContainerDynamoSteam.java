package thermalexpansion.gui.container.dynamo;

import cofh.gui.slot.ISlotValidator;
import cofh.gui.slot.SlotValidated;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import thermalexpansion.block.dynamo.TileDynamoSteam;
import thermalexpansion.gui.container.ContainerTEBase;

public class ContainerDynamoSteam extends ContainerTEBase implements ISlotValidator {

	TileDynamoSteam myTile;

	public ContainerDynamoSteam(InventoryPlayer inventory, TileEntity entity) {

		super(inventory, entity);

		myTile = (TileDynamoSteam) entity;
		addSlotToContainer(new SlotValidated(this, myTile, 0, 44, 35));
	}

	@Override
	public boolean isItemValid(ItemStack stack) {

		return TileDynamoSteam.getItemEnergyValue(stack) > 0;
	}

}
