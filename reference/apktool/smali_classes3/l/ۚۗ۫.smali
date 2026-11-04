.class public final Ll/ۚۗ۫;
.super Ljava/io/InputStream;
.source "56K9"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ljava/io/InputStream;

.field public final synthetic ܿ:Ll/֫ۗ۫;

.field public final ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/֫ۗ۫;Ljava/io/InputStream;)V
    .locals 0

    .line 89
    iput-object p1, p0, Ll/ۚۗ۫;->ܿ:Ll/֫ۗ۫;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 87
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ll/ۚۗ۫;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 90
    iput-object p2, p0, Ll/ۚۗ۫;->ܰ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 137
    iget-object v2, p0, Ll/ۚۗ۫;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚۗ۫;->ܰ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 96
    invoke-virtual {p0, v1, v2, v0}, Ll/ۚۗ۫;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    .line 101
    iget-object v0, p0, Ll/ۚۗ۫;->ܿ:Ll/֫ۗ۫;

    invoke-static {v0}, Ll/֫ۗ۫;->᩷(Ll/֫ۗ۫;)V

    .line 102
    iget-object v1, p0, Ll/ۚۗ۫;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide/32 v1, 0x1000000

    .line 104
    invoke-static {v0}, Ll/֫ۗ۫;->ۙ(Ll/֫ۗ۫;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    int-to-long v3, p3

    .line 106
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    iget-object v1, p0, Ll/ۚۗ۫;->ܰ:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 107
    invoke-static {v0}, Ll/֫ۗ۫;->ۙ(Ll/֫ۗ۫;)J

    move-result-wide p2

    int-to-long v1, p1

    add-long/2addr p2, v1

    invoke-static {v0, p2, p3}, Ll/֫ۗ۫;->ۙ(Ll/֫ۗ۫;J)V

    .line 108
    :cond_1
    invoke-static {v0}, Ll/֫ۗ۫;->᩷(Ll/֫ۗ۫;)V

    return p1

    .line 105
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Audio thumbnail read limit exceeded"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Audio thumbnail stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final skip(J)J
    .locals 8

    const/16 v0, 0x1000

    new-array v1, v0, [B

    const-wide/16 v2, 0x0

    :goto_0
    cmp-long v4, v2, p1

    if-gez v4, :cond_1

    int-to-long v4, v0

    sub-long v6, p1, v2

    .line 118
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v4, v5}, Ll/ۚۗ۫;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-wide v2
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۙ()V
    .locals 3

    .line 127
    iget-object v0, p0, Ll/ۚۗ۫;->ܰ:Ljava/io/InputStream;

    instance-of v1, v0, Ll/ᩳ֡֫;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ᩳ֡֫;

    .line 128
    iget-object v1, p0, Ll/ۚۗ۫;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 129
    invoke-interface {v0}, Ll/ᩳ֡֫;->cancel()V

    return-void

    .line 131
    :cond_0
    invoke-static {p0}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void
.end method
