package pistonmc.flyingmachine.coremod;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

/**
 * Coremod entry point
 *
 * The coremod is for hooking pistons
 */
@IFMLLoadingPlugin.TransformerExclusions({ CoremodInfo.CoremodGroup })
@IFMLLoadingPlugin.MCVersion("1.7.10")
public class CoremodMain implements IFMLLoadingPlugin {
	public static Logger log = LogManager.getLogger("Flying Machine Backport Core");

	@Override
	public String[] getASMTransformerClass() {
		return new String[] { CoremodInfo.CoremodGroup + ".Transformer" };
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
