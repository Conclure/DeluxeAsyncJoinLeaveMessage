package me.conclure.wtf;

import com.google.common.collect.ForwardingConcurrentMap;
import com.google.common.collect.MapMaker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//make all IDEs stfu
@SuppressWarnings("all")
//make sure our class is never null but also might be null cuz u know async is two things concurrently yekies
@NonNls
@Nullable
@NotNull
public final class FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler
        extends @NotNull @Nullable @NonNls JavaPlugin implements @NotNull @Nullable @NonNls Listener,
        @NotNull @Nullable @NonNls Plugin,
        @NotNull @Nullable @NonNls CommandExecutor,
        @NotNull @Nullable @NonNls TabCompleter,
        @NotNull @Nullable @NonNls Serializable,
        @NotNull @Nullable @NonNls ConfigurationSerializable,
        @NotNull @Nullable @NonNls Executor,
        @NotNull @Nullable @NonNls ExecutorService,
        @NotNull @Nullable @NonNls TabExecutor,
        @NotNull @Nullable @NonNls BiConsumer<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull @Nullable @NonNls BiFunction<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull @Nullable @NonNls Supplier<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>,
        @NotNull @Nullable @NonNls Runnable,
        @NotNull @Nullable @NonNls Iterable<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>{

    //cache constant true and random keywords to make it look better
    @NonNls
    @Nullable
    @NotNull
    public static transient volatile boolean TRUE;
    @NonNls
    @Nullable
    @NotNull
    public static transient volatile long serialVersionUID;
    @NonNls
    @Nullable
    @NotNull
    public static transient volatile ExecutorService EXECUTOR;

    static{
        TRUE=true;
        serialVersionUID=69;
        EXECUTOR=new ForkJoinPool(
                1,
                ForkJoinPool.defaultForkJoinWorkerThreadFactory,
                (t,e)->Thread.dumpStack(),
                FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.TRUE
        );
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final void shutdown(){
        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .shutdown();
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @Nullable
    @NotNull
    @Override
    public final List<@NotNull @Nullable @NonNls Runnable> shutdownNow(){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls Runnable>shutdownNow();
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final boolean isShutdown(){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .isShutdown();
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final boolean isTerminated(){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .isTerminated();
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final boolean awaitTermination(
            final @NotNull @Nullable @NonNls long timeout,
            final @NotNull @Nullable @NonNls TimeUnit unit
    )
            throws InterruptedException{
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .awaitTermination(timeout,unit);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> Future<@NotNull @Nullable @NonNls T> submit(final @Nullable @NotNull Callable<@NotNull @Nullable @NonNls T> task){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>submit(task);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> Future<@NotNull @Nullable @NonNls T> submit(
            final @NotNull @Nullable @NonNls Runnable task,
            final @NotNull @Nullable @NonNls T result
    ){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>submit(task,result);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final Future<@NotNull @Nullable @NonNls ?> submit(final @NotNull @Nullable @NonNls Runnable task){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls Object>submit(task);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> List<@NotNull @Nullable @NonNls Future<@NotNull @Nullable @NonNls T>> invokeAll(
            final @NotNull @Nullable @NonNls Collection<@NotNull @Nullable @NonNls ? extends Callable<@NotNull @Nullable @NonNls T>> tasks
    )
            throws InterruptedException{
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>invokeAll(tasks);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> List<Future<@NotNull @Nullable @NonNls T>> invokeAll(
            final @NotNull @Nullable @NonNls
                    Collection<@NotNull @Nullable @NonNls ? extends Callable<@NotNull @Nullable @NonNls T>> tasks,
            final @NotNull @Nullable @NonNls long timeout,
            final @NotNull @Nullable @NonNls TimeUnit unit
    )
            throws InterruptedException{
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>invokeAll(tasks,timeout,unit);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> T invokeAny(final @NotNull @Nullable @NonNls Collection<@NotNull @Nullable @NonNls ? extends Callable<@NotNull @Nullable @NonNls T>> tasks)
            throws InterruptedException, ExecutionException{
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>invokeAny(tasks);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final <@NotNull @Nullable @NonNls T> T invokeAny(
            final @NotNull @Nullable @NonNls Collection<@NotNull @Nullable @NonNls ? extends Callable<@NotNull @Nullable @NonNls T>> tasks,
            final @NotNull @Nullable @NonNls long timeout,
            final @NotNull @Nullable @NonNls TimeUnit unit
    )
            throws InterruptedException, ExecutionException, TimeoutException{
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .<@NotNull @Nullable @NonNls T>invokeAny(tasks,timeout,unit);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final void execute(final @NotNull @Nullable @NonNls Runnable command){
        FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.EXECUTOR
                .execute(command);
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final Map<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object> serialize(){
        return new ForwardingConcurrentMap<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>(){
            @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
            @Contract("random")
            @NonNls
            @Nullable
            @NotNull
            @Override
            protected final ConcurrentMap<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object> delegate(){
                return new ConcurrentHashMap<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>(new MapMaker()
                        .<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>concurrencyLevel(1)
                        .<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>weakKeys()
                        .<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>weakValues()
                        .<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>initialCapacity(1)
                        .<@NotNull @Nullable @NonNls String,@NotNull @Nullable @NonNls Object>makeMap()
                );
            }
        };
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final void onEnable(){
        try{
            //boostrap our plugin async
            CompletableFuture.<@NotNull @Nullable @NonNls Void>runAsync(
                    ()->{
                        try{
                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.super
                                    .saveDefaultConfig();
                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.super
                                    .reloadConfig();
                            Bukkit.getServer().getPluginManager().registerEvents(
                                    new Listener(){

                                        @Contract("random")
                                        @NonNls
                                        @Nullable
                                        @NotNull
                                        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
                                        public final void onJoin(final @NotNull @Nullable @NonNls PlayerJoinEvent event){
                                            CompletableFuture.<@NotNull @Nullable @NonNls Void>runAsync(
                                                    ()->Bukkit.getServer()
                                                            .<@NotNull @Nullable @NonNls Player>getOnlinePlayers()
                                                            .<@NotNull @Nullable @NonNls Player>stream()
                                                            .<@NotNull @Nullable @NonNls Player>peek(player->player.sendMessage(
                                                                    ChatColor.translateAlternateColorCodes('&',Objects.requireNonNull(
                                                                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                                                                    .getConfig()
                                                                                    .getString("join")))))
                                                            .<@NotNull @Nullable @NonNls Player>close(),
                                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                            ).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PrePreAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PreAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostPreAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new AsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PrePostAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostPostAsyncLeavePlayerEvent(
                                                              event.getPlayer()));
                                            });
                                        }

                                        @Contract("random")
                                        @NonNls
                                        @Nullable
                                        @NotNull
                                        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
                                        public final void onQuit(final @NotNull @Nullable @NonNls PlayerQuitEvent event){
                                            CompletableFuture.<@NotNull @Nullable @NonNls Void>runAsync(
                                                    ()->Bukkit.getServer()
                                                            .<@NotNull @Nullable @NonNls Player>getOnlinePlayers()
                                                            .<@NotNull @Nullable @NonNls Player>stream()
                                                            .<@NotNull @Nullable @NonNls Player>peek(player->player.sendMessage(
                                                                    ChatColor.translateAlternateColorCodes('&',Objects.requireNonNull(
                                                                            FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                                                                    .getConfig()
                                                                                    .getString("quit")))))
                                                            .<@NotNull @Nullable @NonNls Player>close(),
                                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                                            ).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PrePreAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PreAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostPreAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new AsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PrePostAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            }).<@NotNull @Nullable @NonNls Void>thenRunAsync(()->{
                                                Bukkit.getServer()
                                                      .getPluginManager()
                                                      .callEvent(new PostPostAsyncJoinPlayerEvent(
                                                              event.getPlayer()));
                                            });
                                        }
                                    },
                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                            );
                            //handle any possible error asynchronously
                        }catch(Throwable e){
                            Bukkit.getServer().getScheduler().runTaskAsynchronously(
                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this,
                                    ()->{
                                        //This sounds like it has to do with async therefore we use it
                                        throw new ConcurrentModificationException(e);
                                    }
                            );
                        }
                    },
                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
            );
            //handle any possible error asynchronously
        }catch(Throwable e){
            Bukkit.getServer().getScheduler().runTaskAsynchronously(
                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this,
                    ()->{
                        //This sounds like it has to do with async therefore we use it
                        throw new ConcurrentModificationException(e);
                    }
            );
        }
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final void run(){

    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final void accept(
            final @NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,
            final @NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler2
    ){
        CompletableFuture.<@NotNull @Nullable @NonNls Void>runAsync(
                ()->{
                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                            .<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>accept(
                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this,
                                    FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
                            );
                },
                FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this
        );
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler apply(
            final @NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler,
            final @NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler finalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler2
    ){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this;
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler get(){
        return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this;
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    @Contract("random")
    @NonNls
    @Nullable
    @NotNull
    @Override
    public final Iterator<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler> iterator(){
        return new Iterator<@NotNull @Nullable @NonNls FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler>(){

            @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
            @Contract("random")
            @NonNls
            @Nullable
            @NotNull
            @Override
            public final boolean hasNext(){
                return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.TRUE;
            }

            @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
            @Contract("random")
            @NonNls
            @Nullable
            @NotNull
            @Override
            public final FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler next(){
                return FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.this;
            }
        };
    }

    public static abstract class Abstract$Async_Event
            extends @NonNls @Nullable @NotNull Event{

        @NonNls
        @Nullable
        @NotNull
        public volatile transient static HandlerList HANDLER_LIST;
        @NonNls
        @Nullable
        @NotNull
        public static volatile transient AtomicReference<@NonNls @Nullable @NotNull Player> THREAD_SAFE_MAYBE;

        static {
            HANDLER_LIST = new HandlerList();
            THREAD_SAFE_MAYBE=new AtomicReference<@NonNls @Nullable @NotNull Player>();
        }

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Abstract$Async_Event(){
            super(FinalProUltimateDeluxeAsyncChatJoinMessagePluginImplFactoryAbstractCommonMainProviderBootstrapExecutorHandler.TRUE);
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PrePreAsyncJoinPlayerEvent
            extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PrePreAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PreAsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PreAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostPreAsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostPreAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class AsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public AsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PrePostAsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PrePostAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostAsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostPostAsyncJoinPlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostPostAsyncJoinPlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PrePreAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PrePreAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PreAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PreAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostPreAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostPreAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class AsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public AsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PrePostAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PrePostAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }

    @NonNls
    @Nullable
    @NotNull
    public static final class PostPostAsyncLeavePlayerEvent extends @NonNls@Nullable@NotNull Abstract$Async_Event{

        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public PostPostAsyncLeavePlayerEvent(@NonNls @Nullable @NotNull Player who){
            super();
            THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>set(who);
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public Player getPlayer(){
            return THREAD_SAFE_MAYBE.<@NonNls @Nullable @NotNull Player>get();
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        @Override
        public HandlerList getHandlers(){
            return Abstract$Async_Event.HANDLER_LIST;
        }

        @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
        @Contract("random")
        @NonNls
        @Nullable
        @NotNull
        public static HandlerList getHandlerList() {
            return Abstract$Async_Event.HANDLER_LIST;
        }
    }
}
