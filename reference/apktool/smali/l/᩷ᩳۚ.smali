.class public final Ll/᩷ᩳۚ;
.super Ljava/io/FilterInputStream;
.source "56G1"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final synthetic ֡:Ll/᩸ᩳۚ;

.field public final ܰ:Ll/ܳᩳۚ;

.field public ܿ:J

.field public final ᩶:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>(Ll/᩸ᩳۚ;Ljava/io/InputStream;Ll/ܳᩳۚ;J)V
    .locals 0

    .line 198
    iput-object p1, p0, Ll/᩷ᩳۚ;->֡:Ll/᩸ᩳۚ;

    .line 199
    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 194
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ᩳۚ;->᩶:Ljava/security/MessageDigest;

    .line 200
    iput-object p3, p0, Ll/᩷ᩳۚ;->ܰ:Ll/ܳᩳۚ;

    .line 201
    iput-wide p4, p0, Ll/᩷ᩳۚ;->ܿ:J

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 219
    invoke-virtual {p0, v1, v2, v0}, Ll/᩷ᩳۚ;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 206
    iget-object v0, p0, Ll/᩷ᩳۚ;->֡:Ll/᩸ᩳۚ;

    invoke-static {v0}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩷ᩳۚ;->ܰ:Ll/ܳᩳۚ;

    invoke-virtual {v0, v1}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;)V

    .line 207
    iget-wide v0, p0, Ll/᩷ᩳۚ;->ܿ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p1, -0x1

    return p1

    .line 208
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    int-to-long v1, p3

    iget-wide v3, p0, Ll/᩷ᩳۚ;->ܿ:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    if-lez p3, :cond_1

    .line 210
    iget-wide v0, p0, Ll/᩷ᩳۚ;->ܿ:J

    int-to-long v2, p3

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷ᩳۚ;->ܿ:J

    .line 211
    iget-object v0, p0, Ll/᩷ᩳۚ;->᩶:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    .line 212
    iget-object p1, p0, Ll/᩷ᩳۚ;->֡:Ll/᩸ᩳۚ;

    invoke-static {p1}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object p1

    iget-object p2, p0, Ll/᩷ᩳۚ;->ܰ:Ll/ܳᩳۚ;

    invoke-virtual {p1, p2, p3}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;I)V

    return p3

    .line 209
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Download source ended before Content-Length"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
