.class public final Ll/ۙᩳۚ;
.super Ljava/lang/Object;
.source "56G1"

# interfaces
.implements Ll/᩺ܿۚ;


# instance fields
.field public final synthetic ۙ:Ll/᩸ᩳۚ;

.field public final synthetic ۤ:Ll/۫ᩳۚ;

.field public final synthetic ᩷:Ll/ܳᩳۚ;


# direct methods
.method public constructor <init>(Ll/᩸ᩳۚ;Ll/۫ᩳۚ;Ll/ܳᩳۚ;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙᩳۚ;->ۙ:Ll/᩸ᩳۚ;

    iput-object p2, p0, Ll/ۙᩳۚ;->ۤ:Ll/۫ᩳۚ;

    iput-object p3, p0, Ll/ۙᩳۚ;->᩷:Ll/ܳᩳۚ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/io/BufferedOutputStream;)Ljava/lang/Object;
    .locals 13

    .line 80
    invoke-static {}, Ll/ܳ֫ܺ;->ۤ()Ljava/security/MessageDigest;

    move-result-object v0

    const/high16 v1, 0x10000

    new-array v2, v1, [B

    .line 82
    iget-object v3, p0, Ll/ۙᩳۚ;->ۤ:Ll/۫ᩳۚ;

    iget-wide v4, v3, Ll/۫ᩳۚ;->ܶ:J

    iget-object v3, v3, Ll/۫ᩳۚ;->۫:Ljava/lang/String;

    .line 83
    iget-object v6, p0, Ll/ۙᩳۚ;->᩷:Ll/ܳᩳۚ;

    iget-object v7, v6, Ll/ܳᩳۚ;->ۤ:Ll/ۗ᩻ܳ;

    invoke-virtual {v7}, Ll/ۗ᩻ܳ;->ܳ()Ljava/io/InputStream;

    move-result-object v7

    :goto_0
    const-wide/16 v8, 0x0

    cmp-long v10, v4, v8

    if-lez v10, :cond_1

    .line 85
    iget-object v8, p0, Ll/ۙᩳۚ;->ۙ:Ll/᩸ᩳۚ;

    invoke-static {v8}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v9

    invoke-virtual {v9, v6}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;)V

    int-to-long v9, v1

    .line 86
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v10, v9

    const/4 v9, 0x0

    invoke-virtual {v7, v2, v9, v10}, Ljava/io/InputStream;->read([BII)I

    move-result v10

    if-lez v10, :cond_0

    .line 88
    invoke-virtual {p1, v2, v9, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 89
    invoke-virtual {v0, v2, v9, v10}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v11, v10

    sub-long/2addr v4, v11

    .line 91
    invoke-static {v8}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v8

    invoke-virtual {v8, v6, v10}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;I)V

    goto :goto_0

    .line 87
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Upload ended before Content-Length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_1
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object p1

    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 95
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "TRANSFER_DIGEST_MISMATCH"

    const-string v0, "The uploaded content does not match the expected SHA-256."

    .line 96
    invoke-static {p1, v0}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final ۙ()V
    .locals 3

    .line 103
    iget-object v0, p0, Ll/ۙᩳۚ;->ۙ:Ll/᩸ᩳۚ;

    invoke-static {v0}, Ll/᩸ᩳۚ;->ۙ(Ll/᩸ᩳۚ;)Ll/ۚᩳۚ;

    move-result-object v1

    iget-object v2, p0, Ll/ۙᩳۚ;->᩷:Ll/ܳᩳۚ;

    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 211
    :try_start_0
    invoke-virtual {v1, v2}, Ll/ۚᩳۚ;->ۙ(Ll/ܳᩳۚ;)V

    .line 212
    iget-object v1, v2, Ll/ܳᩳۚ;->ᩴ:Ll/۫ᩳۚ;

    const-string v2, "publishing"

    iput-object v2, v1, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
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
