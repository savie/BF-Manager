.class public final Ll/֫ۗ۫;
.super Landroid/media/MediaDataSource;
.source "56K9"


# instance fields
.field public ֡:J

.field public final ۟:J

.field public ܰ:Ll/ۚۗ۫;

.field public final ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩳ:Ljava/lang/Object;

.field public final ᩶:Ll/۠ۗ۫;


# direct methods
.method public constructor <init>(Ll/ᩳۛ۫;Ll/ۖۗܳ;I)V
    .locals 6

    .line 29
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/֫ۗ۫;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֫ۗ۫;->ᩳ:Ljava/lang/Object;

    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    int-to-long v4, p3

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/֫ۗ۫;->۟:J

    .line 31
    new-instance p3, Ll/۠ۗ۫;

    new-instance v0, Ll/۫ۗ۫;

    invoke-direct {v0, p0, p1, p2}, Ll/۫ۗ۫;-><init>(Ll/֫ۗ۫;Ll/ᩳۛ۫;Ll/ۖۗܳ;)V

    .line 47
    invoke-interface {p2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v1

    invoke-direct {p3, v0, p1, v1, v2}, Ll/۠ۗ۫;-><init>(Ll/ۖۗ۫;Ljava/lang/String;J)V

    iput-object p3, p0, Ll/֫ۗ۫;->᩶:Ll/۠ۗ۫;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫ۗ۫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫ۗ۫;->֡:J

    return-wide v0
.end method

.method public static synthetic ۙ(Ll/֫ۗ۫;Ll/ᩳۛ۫;Ll/ۖۗܳ;J)Ljava/io/InputStream;
    .locals 5

    .line 32
    invoke-direct {p0}, Ll/֫ۗ۫;->ۙ()V

    .line 33
    iget-wide v0, p0, Ll/֫ۗ۫;->֡:J

    const-wide/32 v2, 0x1000000

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    .line 35
    invoke-virtual {p1}, Ll/ᩳۛ۫;->֡()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36
    invoke-direct {p0}, Ll/֫ۗ۫;->ۙ()V

    .line 37
    new-instance v1, Ll/ۚۗ۫;

    invoke-interface {p2}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p4, p2}, Ll/ᩳۛ۫;->ۙ(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/ۚۗ۫;-><init>(Ll/֫ۗ۫;Ljava/io/InputStream;)V

    .line 38
    iget-object p1, p0, Ll/֫ۗ۫;->ᩳ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 39
    :try_start_0
    iget-object p1, p0, Ll/֫ۗ۫;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    iput-object v1, p0, Ll/֫ۗ۫;->ܰ:Ll/ۚۗ۫;

    .line 40
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    iget-object p0, p0, Ll/֫ۗ۫;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_1

    return-object v1

    .line 43
    :cond_1
    invoke-virtual {v1}, Ll/ۚۗ۫;->ۙ()V

    .line 44
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Audio thumbnail source is closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 40
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 35
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Random access is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 33
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Audio thumbnail read limit exceeded"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۙ()V
    .locals 5

    .line 51
    iget-object v0, p0, Ll/֫ۗ۫;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Ll/֫ۗ۫;->۟:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-void

    .line 53
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Audio thumbnail read canceled or timed out"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ۙ(Ll/֫ۗ۫;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫ۗ۫;->֡:J

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/֫ۗ۫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֫ۗ۫;->ۙ()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 70
    iget-object v0, p0, Ll/֫ۗ۫;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Ll/֫ۗ۫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 73
    :try_start_0
    iget-object v1, p0, Ll/֫ۗ۫;->ܰ:Ll/ۚۗ۫;

    const/4 v2, 0x0

    .line 74
    iput-object v2, p0, Ll/֫ۗ۫;->ܰ:Ll/ۚۗ۫;

    .line 75
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    .line 78
    :try_start_1
    invoke-virtual {v1}, Ll/ۚۗ۫;->ۙ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 80
    iget-object v1, p0, Ll/֫ۗ۫;->᩶:Ll/۠ۗ۫;

    invoke-virtual {v1}, Ll/۠ۗ۫;->close()V

    .line 81
    throw v0

    .line 80
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֫ۗ۫;->᩶:Ll/۠ۗ۫;

    invoke-virtual {v0}, Ll/۠ۗ۫;->close()V

    return-void

    :catchall_1
    move-exception v1

    .line 75
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final getSize()J
    .locals 2

    .line 65
    iget-object v0, p0, Ll/֫ۗ۫;->᩶:Ll/۠ۗ۫;

    invoke-virtual {v0}, Ll/۠ۗ۫;->ۤ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 6

    .line 59
    invoke-direct {p0}, Ll/֫ۗ۫;->ۙ()V

    .line 60
    iget-object v0, p0, Ll/֫ۗ۫;->᩶:Ll/۠ۗ۫;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/۠ۗ۫;->ۤ(J[BII)I

    move-result p1

    return p1
.end method
