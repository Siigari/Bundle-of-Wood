package com.siigari.woodbundle.proxy;

import com.siigari.woodbundle.init.ModBlocks;
import com.siigari.woodbundle.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
