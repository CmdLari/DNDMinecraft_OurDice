package net.lari;

import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.network.chat.Component;

public class OurDice implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Register client-side command: /roll <dice>
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {

            dispatcher.register(
                    ClientCommandManager.literal("roll")
                            .then(ClientCommandManager.argument("dice", StringArgumentType.string())
                                    .executes(context -> {

                                        String dice = context.getArgument("dice", String.class);

                                        DieLogic logic = new DieLogic(dice);
                                        String result = logic.result;

                                        // Send feedback to client player
                                        context.getSource().sendFeedback(Component.literal(result));

                                        return 1;
                                    })
                            )
            )
        });
    }
}
