.class public final Ll/۬ۚ᩵;
.super Ljava/lang/Object;
.source "BIYL"


# instance fields
.field public final ۙ:Ljava/util/concurrent/ExecutorService;

.field public final ᩷:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/۬ۚ᩵;->᩷:Ljava/util/IdentityHashMap;

    .line 61
    new-instance v0, Ll/ۜۚ᩵;

    invoke-direct {v0}, Ll/ۜۚ᩵;-><init>()V

    .line 30
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۚ᩵;->ۙ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ۙ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 57
    :try_start_0
    iget-object v1, p0, Ll/۬ۚ᩵;->᩷:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
