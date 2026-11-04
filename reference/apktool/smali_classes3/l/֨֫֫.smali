.class public final Ll/֨֫֫;
.super Ljava/io/FilterInputStream;
.source "Q6MT"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public ܰ:J

.field public final ܿ:J

.field public ᩶:Z


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 0

    .line 469
    invoke-direct {p0, p3}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 470
    iput-wide p1, p0, Ll/֨֫֫;->ܿ:J

    return-void
.end method

.method private ᩷(J)V
    .locals 5

    .line 509
    iget-wide v0, p0, Ll/֨֫֫;->ܰ:J

    iget-wide v2, p0, Ll/֨֫֫;->ܿ:J

    sub-long/2addr v2, v0

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll/֨֫֫;->᩶:Z

    goto :goto_0

    :cond_0
    add-long/2addr v0, p1

    .line 510
    iput-wide v0, p0, Ll/֨֫֫;->ܰ:J

    .line 511
    :goto_0
    invoke-virtual {p0}, Ll/֨֫֫;->ۙ()V

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 481
    invoke-virtual {p0}, Ll/֨֫֫;->ۙ()V

    .line 482
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    const-wide/16 v1, 0x1

    .line 483
    invoke-direct {p0, v1, v2}, Ll/֨֫֫;->᩷(J)V

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 7

    .line 489
    invoke-virtual {p0}, Ll/֨֫֫;->ۙ()V

    .line 490
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    int-to-long v1, p3

    .line 504
    iget-wide v3, p0, Ll/֨֫֫;->ܿ:J

    iget-wide v5, p0, Ll/֨֫֫;->ܰ:J

    sub-long/2addr v3, v5

    const-wide v5, 0x7fffffffffffffffL

    cmp-long p3, v3, v5

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    .line 490
    :goto_0
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    int-to-long p2, p1

    .line 491
    invoke-direct {p0, p2, p3}, Ll/֨֫֫;->᩷(J)V

    :cond_1
    return p1
.end method

.method public final skip(J)J
    .locals 6

    .line 497
    invoke-virtual {p0}, Ll/֨֫֫;->ۙ()V

    .line 498
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 504
    iget-wide v1, p0, Ll/֨֫֫;->ܿ:J

    iget-wide v3, p0, Ll/֨֫֫;->ܰ:J

    sub-long/2addr v1, v3

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    .line 498
    :goto_0
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    .line 499
    invoke-direct {p0, p1, p2}, Ll/֨֫֫;->᩷(J)V

    :cond_1
    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۙ()V
    .locals 2

    .line 515
    iget-boolean v0, p0, Ll/֨֫֫;->᩶:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/ۢ֫֫;

    const-string v1, "Image input exceeds byte limit"

    .line 454
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 515
    throw v0
.end method

.method public final ۙ(Ll/ۜ֫֫;)V
    .locals 2

    .line 475
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    instance-of v0, v0, Ljava/io/FileInputStream;

    if-eqz v0, :cond_0

    .line 476
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    check-cast v0, Ljava/io/FileInputStream;

    invoke-static {v0}, Ll/᩻ۗ᩹;->ۙ(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    :cond_0
    return-void
.end method
