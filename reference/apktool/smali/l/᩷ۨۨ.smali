.class public Ll/᩷ۨۨ;
.super Ll/ᩴۨۨ;
.source "L2QA"


# static fields
.field public static final synthetic ֨:I


# instance fields
.field public ֡:J

.field public final ۟:J

.field public ۢ:Z

.field public ܿ:J

.field public final ᩳ:Ll/۬ܳܳ;


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 295
    new-instance v0, Ll/ۙۨۨ;

    invoke-direct {v0}, Ll/ۙۨۨ;-><init>()V

    .line 357
    invoke-virtual {v0, p1, p2}, Ll/۬᩵ۨ;->ۙ(J)V

    .line 339
    invoke-direct {p0, p3, v0}, Ll/ᩴۨۨ;-><init>(Ljava/io/InputStream;Ll/ۙۨۨ;)V

    const/4 p1, 0x1

    .line 314
    iput-boolean p1, p0, Ll/᩷ۨۨ;->ۢ:Z

    const-wide/16 p1, 0x0

    .line 340
    iput-wide p1, p0, Ll/᩷ۨۨ;->ܿ:J

    .line 341
    invoke-virtual {v0}, Ll/۬᩵ۨ;->ۧ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩷ۨۨ;->۟:J

    .line 342
    invoke-virtual {v0}, Ll/۬᩵ۨ;->ܺ()Z

    move-result p1

    iput-boolean p1, p0, Ll/᩷ۨۨ;->ۢ:Z

    .line 343
    invoke-virtual {v0}, Ll/۬᩵ۨ;->᩻()Ll/۬ܳܳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۨۨ;->ᩳ:Ll/۬ܳܳ;

    return-void
.end method

.method public constructor <init>(Ll/ۙۨۨ;)V
    .locals 2

    .line 115
    invoke-virtual {p1}, Ll/۫᩵ۨ;->ۚ()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ll/ᩴۨۨ;-><init>(Ljava/io/InputStream;Ll/ۙۨۨ;)V

    const/4 v0, 0x1

    .line 314
    iput-boolean v0, p0, Ll/᩷ۨۨ;->ۢ:Z

    const-wide/16 v0, 0x0

    .line 318
    iput-wide v0, p0, Ll/᩷ۨۨ;->ܿ:J

    .line 319
    invoke-virtual {p1}, Ll/۬᩵ۨ;->ۧ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۨۨ;->۟:J

    .line 320
    invoke-virtual {p1}, Ll/۬᩵ۨ;->ܺ()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩷ۨۨ;->ۢ:Z

    .line 321
    invoke-virtual {p1}, Ll/۬᩵ۨ;->᩻()Ll/۬ܳܳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۨۨ;->ᩳ:Ll/۬ܳܳ;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    const-wide/16 v0, -0x1

    .line 441
    iget-wide v2, p0, Ll/᩷ۨۨ;->۟:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    move-result-wide v0

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    const-wide/32 v2, 0x7fffffff

    .line 378
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 379
    invoke-super {p0}, Ll/ᩴۨۨ;->available()I

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .line 389
    iget-boolean v0, p0, Ll/᩷ۨۨ;->ۢ:Z

    if-eqz v0, :cond_0

    .line 390
    invoke-super {p0}, Ll/ᩴۨۨ;->close()V

    :cond_0
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 464
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1}, Ljava/io/InputStream;->mark(I)V

    .line 465
    iget-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J

    iput-wide v1, p0, Ll/᩷ۨۨ;->֡:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
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

.method public final markSupported()Z
    .locals 1

    .line 475
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 5

    const-wide/16 v0, 0x0

    .line 445
    iget-wide v2, p0, Ll/᩷ۨۨ;->۟:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 504
    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    .line 492
    iget-object v0, p0, Ll/᩷ۨۨ;->ᩳ:Ll/۬ܳܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    return v0

    .line 507
    :cond_0
    invoke-super {p0}, Ll/ᩴۨۨ;->read()I

    move-result v0

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 519
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩷ۨۨ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 7

    .line 445
    iget-wide v0, p0, Ll/᩷ۨۨ;->۟:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-ltz v6, :cond_0

    .line 534
    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    .line 492
    iget-object p1, p0, Ll/᩷ۨۨ;->ᩳ:Ll/۬ܳܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v4, p3

    cmp-long p3, v0, v2

    if-ltz p3, :cond_1

    .line 587
    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :cond_1
    long-to-int p3, v4

    .line 537
    invoke-super {p0, p1, p2, p3}, Ll/ᩴۨۨ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 547
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 548
    iget-wide v1, p0, Ll/᩷ۨۨ;->֡:J

    iput-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
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

.method public final declared-synchronized skip(J)J
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 587
    :try_start_0
    iget-wide v1, p0, Ll/᩷ۨۨ;->۟:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨۨ;->ۙ()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 385
    :cond_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    .line 573
    iget-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 574
    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 597
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ۙ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 401
    :try_start_0
    iget-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ(I)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 370
    :try_start_0
    iget-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ۨۨ;->ܿ:J

    .line 372
    :cond_0
    invoke-super {p0, p1}, Ll/ᩴۨۨ;->ۙ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
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

.method public final declared-synchronized ᩷()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 560
    :try_start_0
    iput-boolean v1, p0, Ll/᩷ۨۨ;->ۢ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
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
