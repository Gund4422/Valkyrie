package me.peanut.hydrogen.module.modules.player;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.play.client.C03PacketPlayer;
import me.peanut.hydrogen.events.EventUpdate;
import me.peanut.hydrogen.module.Category;
import me.peanut.hydrogen.module.Info;
import me.peanut.hydrogen.module.Module;

@Info(name = "NoFall", description = "Prevents fall damage by spoofing ground packets", category = Category.Player)
public class NoFall extends Module {

    public NoFall() {}

    @EventTarget
    public void onUpdate(EventUpdate event) {
        // Only spoof if we are actually falling
        if (mc.thePlayer.fallDistance > 2.0F) {
            
            // Send a packet telling the server we just touched the ground
            // This resets the server-side fall distance counter
            mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
            
            // Optional: Reset client-side distance to prevent visual glitching
            // mc.thePlayer.fallDistance = 0; 
        }
    }
}
