.class public final Ll/ۗۧۚ;
.super Ljava/io/FilterInputStream;
.source "P77N"

# interfaces
.implements Ll/۠ۜ᩹;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 5609
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 5643
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 5647
    invoke-static {v0}, Ll/ܿۧۚ;->ۙ(Ljava/lang/RuntimeException;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5648
    throw v0

    .line 5650
    :cond_0
    new-instance v1, Ll/ۨۧۚ;

    invoke-direct {v1, v0}, Ll/ۨۧۚ;-><init>(Ljava/lang/RuntimeException;)V

    throw v1

    :catch_1
    move-exception v0

    .line 5645
    new-instance v1, Ll/᩵ۧۚ;

    invoke-direct {v1, v0}, Ll/᩵ۧۚ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final read()I
    .locals 2

    .line 5615
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 5619
    invoke-static {v0}, Ll/ܿۧۚ;->ۙ(Ljava/lang/RuntimeException;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5620
    throw v0

    .line 5622
    :cond_0
    new-instance v1, Ll/ۨۧۚ;

    invoke-direct {v1, v0}, Ll/ۨۧۚ;-><init>(Ljava/lang/RuntimeException;)V

    throw v1

    :catch_1
    move-exception v0

    .line 5617
    new-instance v1, Ll/᩵ۧۚ;

    invoke-direct {v1, v0}, Ll/᩵ۧۚ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final read([BII)I
    .locals 0

    .line 5629
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 5633
    invoke-static {p1}, Ll/ܿۧۚ;->ۙ(Ljava/lang/RuntimeException;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 5634
    throw p1

    .line 5636
    :cond_0
    new-instance p2, Ll/ۨۧۚ;

    invoke-direct {p2, p1}, Ll/ۨۧۚ;-><init>(Ljava/lang/RuntimeException;)V

    throw p2

    :catch_1
    move-exception p1

    .line 5631
    new-instance p2, Ll/᩵ۧۚ;

    invoke-direct {p2, p1}, Ll/᩵ۧۚ;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
