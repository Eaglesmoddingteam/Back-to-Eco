package bte.util.helpers;

import java.util.ArrayList;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class MathHelper {
	public static final MathHelper INSTANCE = new MathHelper();
	
	
	/**
 	* Get Positive Outcome Int 
 	* @param numbers input of numbers you want to get added to the sum, can be negative or positive, negative numbers will get transfered to positive ones.
 	* @return
 	*/
	public static int GPUI(int... numbers){
		int product = 0;
		for(int current : numbers) {
			if(current<0) {
				product += (current*-1);
			} else {
				product += current;
			}
		}
		return product;
	}
	
	/**
 	* Get Positive Outcome Int 
 	* @param numbers input of numbers you want to get added to the sum, can be negative or positive, negative numbers will get transfered to positive ones.
 	* @return
 	*/
	public static int GPUI(double... numbers){
		int product = 0;
		for(double current : numbers) {
			if(current<0) {
				product += (((int)current)*-1);
			} else {
				product += ((int)current);
			}
		}
		return product;
	}
	
	/**
	 * GetBlockFacingOffset
	 * @param position of the first block
	 * @param position of the second block
	 * @return The facing on which the second blockpos is attached to from the first blockpos's perspective
	 */
	public static EnumFacing GBFO(BlockPos pos1, BlockPos pos2) {
		int offsetX = pos1.getX() - pos2.getX();
		int offsetY = pos1.getY() - pos2.getY();
		int offsetZ = pos1.getZ() - pos2.getZ();
		if(offsetX > 0) {
			return EnumFacing.EAST;
		} else if (offsetX < 0) {
			return EnumFacing.WEST;
		} else if(offsetZ > 0) {
			return EnumFacing.SOUTH;
		} else if (offsetZ < 0) {
			return EnumFacing.NORTH;
		} else if (offsetY < 0) {
			return EnumFacing.DOWN;
		} else if (offsetY > 0) {
			return EnumFacing.UP;
		} else {
			return null;
		}
	}

	/**
	 * CreateVectorArray
	 * @param pos
	 * @return A int array including the positions of the blockpos
	 */
	public static int[] CVA(BlockPos pos) {
		if(!(pos != null)) {
			return new int[]{0,0,0};
		}
		int[] CACHE = new int[] {
			pos.getX(),
			pos.getY(),
			pos.getZ()
		};
		return CACHE;
	}
	
	/**
	 * GetBlockposfromVectorArray
	 * @param coords <b>3</b> is the <u>max</u> amount of parameters
	 * @return blockpos from the int array
	 */
	public static BlockPos GBVA(int[] coords) {
		return new BlockPos(coords[0], coords[1], coords[2]);
	}
}
