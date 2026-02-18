package me.peanut.hydrogen.module.modules.movement;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.play.client.C03PacketPlayer;
import me.peanut.hydrogen.events.EventUpdate;
import me.peanut.hydrogen.module.Category;
import me.peanut.hydrogen.module.Info;
import me.peanut.hydrogen.module.Module;

@Info(name = "OmniSprint", description = "More Blatant and Powerful version of Sprint: NOTE: ONLY USE ON SERVERS WITH NCP OR NO ANTICHEAT", category = Category.Movement)
public class OmniSprint extends Module {

    public OmniSprint() {}

    @EventTarget
    public void onUpdate(EventUpdate event) {
        // 1. Omni-directional movement check
        boolean isMoving = mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F;
        
        if (isMoving && !mc.thePlayer.isSneaking() && mc.thePlayer.getFoodStats().getFoodLevel() > 6) {
            
            // Set the client-side sprint state
            mc.thePlayer.setSprinting(true);

            // 2. THE PACKET BURST
            // We manually send 3 extra C03 packets to the server 
            // This tricks the server into processing more movement than 1 tick allows.
            for (int i = 0; i < 3; i++) {
                mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(
                    mc.thePlayer.posX, 
                    mc.thePlayer.posY, 
                    mc.thePlayer.posZ, 
                    mc.thePlayer.onGround
                ));
            }
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        // No timer to reset, but good to ensure sprinting stops
        if(mc.thePlayer != null) {
            mc.thePlayer.setSprinting(false);
        }
    }
}
