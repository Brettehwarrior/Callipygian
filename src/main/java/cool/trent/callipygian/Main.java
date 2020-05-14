package cool.trent.callipygian;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "callipygian";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {
        LOGGER.debug("Howdy y'all");
    }
}
