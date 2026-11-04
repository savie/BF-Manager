.class public final Ll/᩵ܺ֫;
.super Ljava/io/FilterInputStream;
.source "H6IQ"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ll/۟ۧ֫;

.field public ᩶:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/۟ۧ֫;)V
    .locals 2

    .line 138
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/32 v0, 0x20000000

    .line 135
    iput-wide v0, p0, Ll/᩵ܺ֫;->᩶:J

    .line 139
    iput-object p2, p0, Ll/᩵ܺ֫;->ܰ:Ll/۟ۧ֫;

    return-void
.end method

.method private ۙ()V
    .locals 5

    .line 143
    iget-object v0, p0, Ll/᩵ܺ֫;->ܰ:Ll/۟ۧ֫;

    invoke-static {v0}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 144
    iget-wide v0, p0, Ll/᩵ܺ֫;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image metadata scan limit exceeded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final read()I
    .locals 5

    .line 148
    invoke-direct {p0}, Ll/᩵ܺ֫;->ۙ()V

    .line 149
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    .line 150
    iget-wide v1, p0, Ll/᩵ܺ֫;->᩶:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩵ܺ֫;->᩶:J

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 5

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 156
    :cond_0
    invoke-direct {p0}, Ll/᩵ܺ֫;->ۙ()V

    .line 157
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    int-to-long v1, p3

    iget-wide v3, p0, Ll/᩵ܺ֫;->᩶:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 158
    iget-wide p2, p0, Ll/᩵ܺ֫;->᩶:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩵ܺ֫;->᩶:J

    :cond_1
    return p1
.end method

.method public final skip(J)J
    .locals 5

    .line 163
    invoke-direct {p0}, Ll/᩵ܺ֫;->ۙ()V

    .line 164
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-wide v1, p0, Ll/᩵ܺ֫;->᩶:J

    const-wide/32 v3, 0x10000

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    .line 165
    iget-wide v0, p0, Ll/᩵ܺ֫;->᩶:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ll/᩵ܺ֫;->᩶:J

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
