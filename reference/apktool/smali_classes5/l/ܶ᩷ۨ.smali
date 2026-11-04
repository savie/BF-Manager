.class public final Ll/ܶ᩷ۨ;
.super Ll/ᩳ۠᩵;
.source "VANM"

# interfaces
.implements Ll/ᩴۜ᩵;


# static fields
.field public static final synthetic ֨:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic runningWorkers$volatile:I

.field public final ֡:Ll/ᩳ۠᩵;

.field public final ۟:I

.field public final ۢ:Ljava/lang/Object;

.field public final synthetic ܿ:Ll/ᩴۜ᩵;

.field public final ᩳ:Ll/᩺᩷ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/ܶ᩷ۨ;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܶ᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/ᩳ۠᩵;I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ll/ᩳ۠᩵;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ܶ᩷ۨ;->֡:Ll/ᩳ۠᩵;

    .line 24
    iput p2, p0, Ll/ܶ᩷ۨ;->۟:I

    .line 25
    instance-of p2, p1, Ll/ᩴۜ᩵;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ᩴۜ᩵;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Ll/᩸ۜ᩵;->ۙ()Ll/ᩴۜ᩵;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Ll/ܶ᩷ۨ;->ܿ:Ll/ᩴۜ᩵;

    .line 31
    new-instance p1, Ll/᩺᩷ۨ;

    invoke-direct {p1}, Ll/᩺᩷ۨ;-><init>()V

    iput-object p1, p0, Ll/ܶ᩷ۨ;->ᩳ:Ll/᩺᩷ۨ;

    .line 34
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩷ۨ;->ۢ:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۙ(Ll/ܶ᩷ۨ;)Ll/ᩳ۠᩵;
    .locals 0

    .line 22
    iget-object p0, p0, Ll/ܶ᩷ۨ;->֡:Ll/ᩳ۠᩵;

    return-object p0
.end method

.method private final ܶ()Ljava/lang/Runnable;
    .locals 3

    .line 87
    :goto_0
    iget-object v0, p0, Ll/ܶ᩷ۨ;->ᩳ:Ll/᩺᩷ۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    .line 88
    iget-object v0, p0, Ll/ܶ᩷ۨ;->ۢ:Ljava/lang/Object;

    .line 16
    monitor-enter v0

    .line 0
    :try_start_0
    sget-object v1, Ll/ܶ᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 89
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 90
    iget-object v2, p0, Ll/ܶ᩷ۨ;->ᩳ:Ll/᩺᩷ۨ;

    invoke-virtual {v2}, Ll/᩺᩷ۨ;->᩷()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method public static final synthetic ᩷(Ll/ܶ᩷ۨ;)Ljava/lang/Runnable;
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/ܶ᩷ۨ;->ܶ()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V
    .locals 2

    .line 62
    iget-object p1, p0, Ll/ܶ᩷ۨ;->ᩳ:Ll/᩺᩷ۨ;

    invoke-virtual {p1, p2}, Ll/᩺᩷ۨ;->ۙ(Ljava/lang/Runnable;)Z

    .line 0
    sget-object p1, Ll/ܶ᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 63
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p2

    iget v0, p0, Ll/ܶ᩷ۨ;->۟:I

    if-ge p2, v0, :cond_2

    .line 75
    iget-object p2, p0, Ll/ܶ᩷ۨ;->ۢ:Ljava/lang/Object;

    move-object v0, p2

    .line 16
    monitor-enter v0

    .line 76
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p2

    iget v1, p0, Ll/ܶ᩷ۨ;->۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p2, v1, :cond_0

    monitor-exit v0

    return-void

    .line 77
    :cond_0
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    monitor-exit v0

    .line 67
    invoke-direct {p0}, Ll/ܶ᩷ۨ;->ܶ()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 68
    :cond_1
    new-instance p2, Ll/ܽ᩷ۨ;

    invoke-direct {p2, p0, p1}, Ll/ܽ᩷ۨ;-><init>(Ll/ܶ᩷ۨ;Ljava/lang/Runnable;)V

    .line 45
    iget-object p1, p0, Ll/ܶ᩷ۨ;->֡:Ll/ᩳ۠᩵;

    invoke-virtual {p1, p0, p2}, Ll/ᩳ۠᩵;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 78
    monitor-exit v0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method
