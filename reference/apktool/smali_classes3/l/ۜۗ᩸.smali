.class public final Ll/ۜۗ᩸;
.super Ljava/lang/Object;
.source "06KD"


# static fields
.field public static final ۛ:Ljava/util/ArrayDeque;

.field public static final ۨ:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۗ:I

.field public ۙ:Ljava/util/function/Supplier;

.field public ۚ:Ljava/lang/String;

.field public ۤ:J

.field public ۧ:I

.field public final ۫:Ljava/lang/String;

.field public final ܳ:Landroid/os/Handler;

.field public final ܶ:J

.field public ܺ:Ljava/lang/String;

.field public ܽ:J

.field public final ᩴ:J

.field public ᩵:J

.field public final ᩷:Ljava/util/LinkedHashMap;

.field public ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;

.field public final ᩻:Ll/ۡۗ᩸;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Ll/ۜۗ᩸;->ۨ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Ll/ۜۗ᩸;->ۛ:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object v0, Ll/ۜۗ᩸;->ۨ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜۗ᩸;->ᩴ:J

    .line 25
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜۗ᩸;->ܶ:J

    .line 26
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Ll/ۜۗ᩸;->ܳ:Landroid/os/Handler;

    .line 27
    new-instance v3, Ll/ۡۗ᩸;

    invoke-direct {v3, p0}, Ll/ۡۗ᩸;-><init>(Ll/ۜۗ᩸;)V

    iput-object v3, p0, Ll/ۜۗ᩸;->᩻:Ll/ۡۗ᩸;

    .line 28
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v4, p0, Ll/ۜۗ᩸;->᩷:Ljava/util/LinkedHashMap;

    const-string v4, "initializing"

    .line 29
    iput-object v4, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    const-string v4, "pending"

    iput-object v4, p0, Ll/ۜۗ᩸;->ۚ:Ljava/lang/String;

    const-string v4, "none"

    iput-object v4, p0, Ll/ۜۗ᩸;->᩸:Ljava/lang/String;

    .line 30
    iput-wide v0, p0, Ll/ۜۗ᩸;->ܽ:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ll/ۜۗ᩸;->ۤ:J

    iput-wide v0, p0, Ll/ۜۗ᩸;->᩵:J

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Ll/ۜۗ᩸;->ۗ:I

    .line 38
    iput-object p1, p0, Ll/ۜۗ᩸;->۫:Ljava/lang/String;

    iput-object p2, p0, Ll/ۜۗ᩸;->᩹:Ljava/lang/String;

    const-wide/16 p1, 0x7d0

    .line 39
    invoke-virtual {v2, v3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "text-load event="

    const-string v1, " "

    .line 0
    invoke-static {v0, p0, v1, p1}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 133
    sget-object p1, Ll/ۜۗ᩸;->ۛ:Ljava/util/ArrayDeque;

    move-object v0, p1

    monitor-enter v0

    .line 134
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 135
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    invoke-static {p0}, Ll/᩵ܶۤ;->ۤ(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    .line 136
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic ۙ(Ll/ۜۗ᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Ll/ۜۗ᩸;->ۙ:Ljava/util/function/Supplier;

    return-void
.end method

.method public static ᩷(Ll/ۜۗ᩸;)V
    .locals 6

    move-object v0, p0

    .line 71
    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-virtual {p0}, Ll/ۜۗ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 73
    iget-object v1, p0, Ll/ۜۗ᩸;->ۙ:Ljava/util/function/Supplier;

    if-eqz v1, :cond_1

    .line 74
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/ۜۗ᩸;->ۙ:Ljava/util/function/Supplier;

    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\ndiagnosticsError="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    const-string p0, "slow_pending"

    .line 77
    invoke-static {p0, v0}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    .line 71
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ᩸()Ljava/lang/String;
    .locals 5

    .line 142
    sget-object v1, Ll/ۜۗ᩸;->ۛ:Ljava/util/ArrayDeque;

    move-object v0, v1

    monitor-enter v0

    .line 143
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\n\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 149
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized ۙ()Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ(I)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 65
    :try_start_0
    iput p1, p0, Ll/ۜۗ᩸;->ۗ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ(Ljava/lang/String;)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 45
    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_2

    iget-object v1, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 47
    iget-object v5, p0, Ll/ۜۗ᩸;->᩷:Ljava/util/LinkedHashMap;

    iget-object v6, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    .line 52
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    if-nez v7, :cond_1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    add-long/2addr v3, v1

    .line 47
    iget-wide v7, p0, Ll/ۜۗ᩸;->ܽ:J

    sub-long/2addr v3, v7

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iput-object p1, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    iput-wide v1, p0, Ll/ۜۗ᩸;->ܽ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit v0

    return-void

    .line 45
    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 7

    .line 93
    :goto_0
    instance-of v0, p1, Ll/ۗܽ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 95
    monitor-enter v0

    .line 96
    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_1

    monitor-exit v0

    return-void

    .line 97
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    .line 98
    iget-object v1, p0, Ll/ۜۗ᩸;->᩷:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    .line 52
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-nez v5, :cond_2

    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 98
    :goto_1
    iget-wide v5, p0, Ll/ۜۗ᩸;->ۤ:J

    add-long/2addr v3, v5

    iget-wide v5, p0, Ll/ۜۗ᩸;->ܽ:J

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_3

    const-string v1, "none"

    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_2
    iput-object v1, p0, Ll/ۜۗ᩸;->᩸:Ljava/lang/String;

    if-nez p1, :cond_4

    const-string p1, "success"

    goto :goto_3

    .line 100
    :cond_4
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p1, :cond_5

    const-string p1, "canceled"

    goto :goto_3

    :cond_5
    const-string p1, "failed"

    :goto_3
    iput-object p1, p0, Ll/ۜۗ᩸;->ۚ:Ljava/lang/String;

    .line 101
    invoke-virtual {p0}, Ll/ۜۗ᩸;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 102
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    iget-object v0, p0, Ll/ۜۗ᩸;->ܳ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۜۗ᩸;->᩻:Ll/ۡۗ᩸;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 105
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_6

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ۜۗ᩸;->ۙ:Ljava/util/function/Supplier;

    goto :goto_4

    .line 106
    :cond_6
    iget-object v0, p0, Ll/ۜۗ᩸;->ܳ:Landroid/os/Handler;

    new-instance v1, Ll/ۖۗ᩸;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۖۗ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_4
    const-string v0, "finished"

    .line 107
    invoke-static {v0, p1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 102
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/util/function/Supplier;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/ۜۗ᩸;->ۙ:Ljava/util/function/Supplier;

    return-void
.end method

.method public final declared-synchronized ۤ()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 66
    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->᩵:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۜۗ᩸;->ܶ:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۜۗ᩸;->᩵:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
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

.method public final declared-synchronized ᩷()Ljava/lang/String;
    .locals 15

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 112
    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 113
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v6, p0, Ll/ۜۗ᩸;->ᩴ:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " mode="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۜۗ᩸;->۫:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " state="

    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۜۗ᩸;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " outcome="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۜۗ᩸;->ۚ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " totalMs="

    .line 115
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Ll/ۜۗ᩸;->ܶ:J

    sub-long v6, v1, v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " slow="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Ll/ۜۗ᩸;->ܶ:J

    sub-long v6, v1, v6

    const-wide/16 v8, 0x7d0

    cmp-long v10, v6, v8

    if-ltz v10, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, " textChars="

    .line 116
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Ll/ۜۗ᩸;->ۗ:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " viewportReadyMs="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Ll/ۜۗ᩸;->᩵:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " failure="

    .line 117
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۜۗ᩸;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " previousCloseFailures="

    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Ll/ۜۗ᩸;->ۧ:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " stage="

    .line 119
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " phasesMs={"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    iget-object v6, p0, Ll/ۜۗ᩸;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/16 v8, 0x2c

    const/16 v9, 0x3d

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 121
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 122
    iget-wide v12, p0, Ll/ۜۗ᩸;->ۤ:J

    cmp-long v14, v12, v3

    if-gez v14, :cond_2

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    iget-object v13, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    iget-wide v12, p0, Ll/ۜۗ᩸;->ܽ:J

    sub-long v12, v1, v12

    add-long/2addr v10, v12

    .line 123
    :cond_2
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 125
    :cond_3
    iget-wide v6, p0, Ll/ۜۗ᩸;->ۤ:J

    cmp-long v10, v6, v3

    if-gez v10, :cond_4

    iget-object v3, p0, Ll/ۜۗ᩸;->᩷:Ljava/util/LinkedHashMap;

    iget-object v4, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Ll/ۜۗ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Ll/ۜۗ᩸;->ܽ:J

    sub-long/2addr v1, v3

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    const/16 v1, 0x7d

    .line 126
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    iget-object v1, p0, Ll/ۜۗ᩸;->֫:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v1, "\npreviousCloseFailure="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۗ᩸;->֫:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷(Ljava/lang/Throwable;)V
    .locals 6

    move-object v0, p0

    .line 83
    monitor-enter v0

    .line 84
    :try_start_0
    iget-wide v1, p0, Ll/ۜۗ᩸;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    monitor-exit v0

    return-void

    .line 85
    :cond_0
    iget v1, p0, Ll/ۜۗ᩸;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۜۗ᩸;->ۧ:I

    .line 86
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۗ᩸;->֫:Ljava/lang/String;

    .line 87
    invoke-virtual {p0}, Ll/ۜۗ᩸;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 88
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "previous_close_failed"

    .line 89
    invoke-static {v0, p1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
