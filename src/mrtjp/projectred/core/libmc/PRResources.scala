package mrtjp.projectred.core.libmc

import mrtjp.core.resource.ResourceAction
import net.minecraft.util.ResourceLocation

object PRResources
{
    val guiBag = registerPR("textures/gui/bpgui.png")
    val guiChipContainer = registerPR("textures/gui/chipcontainer.png")
    val guiChipUpgrade = registerPR("textures/gui/chipupgradecontainer.png")
    val guiPipeInterface = registerPR("textures/gui/guiinterfacepipe.png")
    val guiPipeCrafting = registerPR("textures/gui/guicraftingpipe.png")
    val guiFurnace = registerPR("textures/gui/furnace.png")
    val guiRouterControl = registerPR("textures/gui/rcontr.png")
    val guiPrototyper = registerPR("textures/gui/guiprototyper.png")

    val icmaptex = registerPR("textures/blocks/circuits/map_background.png")
    val guiBlockPlacer = registerPR("textures/gui/guiplacer.png")
    val guiFilteredImporter = registerPR("textures/gui/guifimporter.png")
    val guiICPrinter = registerPR("textures/gui/icprinter.png")
    val guiBatteryBox = registerPR("textures/gui/batterybox.png")
    val guiElectrotineGenerator = registerPR("textures/gui/electrotine_generator.png")
    val guiCharger = registerPR("textures/gui/charger.png")

    def register(path:String) = new ResourceAction(new ResourceLocation(path))
    def registerPR(path:String) = new ResourceAction(new ResourceLocation("projectred", path))
}