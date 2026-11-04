.class public final Ll/۟ۡ᩸;
.super Ljava/lang/Object;
.source "O6OW"


# instance fields
.field public volatile ۙ:Z

.field public final ۤ:Ljava/util/concurrent/CountDownLatch;

.field public final ᩷:Ll/᩵֨᩸;

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/᩵֨᩸;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/۟ۡ᩸;->ۤ:Ljava/util/concurrent/CountDownLatch;

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۟ۡ᩸;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    iput-object p1, p0, Ll/۟ۡ᩸;->᩷:Ll/᩵֨᩸;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۟ۡ᩸;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۡ᩸;->ۤ:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method private ۙ()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Ll/۟ۡ᩸;->ۙ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟ۡ᩸;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟ۡ᩸;->᩷:Ll/᩵֨᩸;

    iget-object v0, v0, Ll/᩵֨᩸;->ܰ:Ll/᩻ۡ᩸;

    invoke-static {v0}, Ll/᩻ۡ᩸;->ۤ(Ll/᩻ۡ᩸;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ۤ(Ll/۟ۡ᩸;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟ۡ᩸;->ۙ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/۟ۡ᩸;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۡ᩸;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/᩺ۜ᩸;Ljava/lang/CharSequence;Ll/᩷ۨᩴ;Ll/᩺ۜ᩸;Ljava/lang/CharSequence;Ll/᩷ۨᩴ;)Z
    .locals 5

    .line 25
    new-instance v0, Ll/֡ۡ᩸;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֡ۡ᩸;-><init>(Ll/۟ۡ᩸;Ll/᩺ۜ᩸;Ljava/lang/CharSequence;Ll/᩷ۨᩴ;)V

    .line 26
    new-instance p2, Ll/֡ۡ᩸;

    invoke-direct {p2, p0, p4, p5, p6}, Ll/֡ۡ᩸;-><init>(Ll/۟ۡ᩸;Ll/᩺ۜ᩸;Ljava/lang/CharSequence;Ll/᩷ۨᩴ;)V

    const/4 p3, 0x0

    .line 30
    :try_start_0
    invoke-virtual {v0}, Ll/֡ۡ᩸;->ۙ()V

    .line 31
    invoke-virtual {p2}, Ll/֡ۡ᩸;->ۙ()V

    .line 32
    :goto_0
    iget-object p5, p0, Ll/۟ۡ᩸;->ۤ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p5}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide p5

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    cmp-long v4, p5, v1

    if-eqz v4, :cond_1

    .line 33
    invoke-direct {p0}, Ll/۟ۡ᩸;->ۙ()Z

    move-result p5

    if-eqz p5, :cond_0

    .line 34
    invoke-virtual {v0}, Ll/֡ۡ᩸;->᩷()V

    .line 35
    invoke-virtual {p2}, Ll/֡ۡ᩸;->᩷()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    :cond_0
    :try_start_1
    iget-object p5, p0, Ll/۟ۡ᩸;->ۤ:Ljava/util/concurrent/CountDownLatch;

    sget-object p6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x14

    invoke-virtual {p5, v1, v2, p6}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 38
    :catch_0
    :try_start_2
    iput-boolean v3, p0, Ll/۟ۡ᩸;->ۙ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 41
    :cond_1
    :goto_1
    :try_start_3
    invoke-direct {p0}, Ll/۟ۡ᩸;->ۙ()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ۖ᩷()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p4}, Ll/᩺ۜ᩸;->ۖ᩷()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 42
    :cond_2
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܰ()V

    invoke-virtual {p4}, Ll/᩺ۜ᩸;->ܰ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-wide/16 p5, 0xa

    .line 43
    :try_start_4
    invoke-static {p5, p6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 44
    :catch_1
    :try_start_5
    iput-boolean v3, p0, Ll/۟ۡ᩸;->ۙ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 p3, 0x1

    goto :goto_1

    :goto_2
    const/4 p2, 0x1

    goto :goto_3

    :cond_3
    if-eqz p3, :cond_4

    .line 47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 49
    :cond_4
    iget-object p1, p0, Ll/۟ۡ᩸;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    .line 50
    instance-of p2, p1, Ljava/io/IOException;

    if-nez p2, :cond_7

    .line 51
    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-nez p2, :cond_6

    .line 52
    instance-of p2, p1, Ljava/lang/Error;

    if-nez p2, :cond_5

    .line 53
    invoke-direct {p0}, Ll/۟ۡ᩸;->ۙ()Z

    move-result p1

    xor-int/2addr p1, v3

    return p1

    .line 52
    :cond_5
    check-cast p1, Ljava/lang/Error;

    invoke-static {p1}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw p1

    .line 51
    :cond_6
    check-cast p1, Ljava/lang/RuntimeException;

    invoke-static {p1}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw p1

    .line 50
    :cond_7
    check-cast p1, Ljava/io/IOException;

    invoke-static {p1}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw p1

    :catchall_1
    move-exception p1

    move p2, p3

    :goto_3
    if-eqz p2, :cond_8

    .line 47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 48
    :cond_8
    throw p1
.end method
