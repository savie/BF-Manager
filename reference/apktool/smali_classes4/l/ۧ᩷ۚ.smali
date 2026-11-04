.class public final Ll/ۧ᩷ۚ;
.super Ll/ۧۘᩴ;
.source "I6DO"


# instance fields
.field public final ۙ:Ljava/util/concurrent/CountDownLatch;

.field public ᩷:Landroid/content/Intent;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 334
    invoke-direct {p0}, Ll/ۧۘᩴ;-><init>()V

    .line 335
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Ll/ۧ᩷ۚ;->ۙ:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final declared-synchronized send(Landroid/content/Intent;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 339
    :try_start_0
    iget-object v1, p0, Ll/ۧ᩷ۚ;->᩷:Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 340
    :cond_0
    :try_start_1
    iput-object p1, p0, Ll/ۧ᩷ۚ;->᩷:Landroid/content/Intent;

    .line 341
    iget-object p1, p0, Ll/ۧ᩷ۚ;->ۙ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 342
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
