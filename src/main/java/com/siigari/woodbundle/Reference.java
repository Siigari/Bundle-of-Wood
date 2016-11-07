package com.siigari.woodbundle;

public class Reference {
	
	public static final String MOD_ID = "bundleofwood";
	public static final String NAME = "Bundle of Wood";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.siigari.woodbundle.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.siigari.woodbundle.proxy.ServerProxy";
	
	public static enum TokenItems {
		TOKENWOOD("tokenwood", "ItemTokenWood");
		
		private String unlocalizedName;
		private String registryName;
		
		TokenItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum WoodbundleBlocks {
		WOODBUNDLE("bundleofwood", "BlockBundleofwood");
		
		private String unlocalizedName;
		private String registryName;
		
		WoodbundleBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}

}
