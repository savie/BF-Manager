.class public final Ll/ۙ᩵ۨ;
.super Ljava/lang/Object;
.source "M4LF"


# static fields
.field public static final ۙ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 277
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 294
    sput-object v0, Ll/ۙ᩵ۨ;->ۙ:[B

    .line 316
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 323
    sget-object v0, Ll/᩷᩵ۨ;->۟:Ll/᩷᩵ۨ;

    invoke-virtual {v0}, Ll/᩷᩵ۨ;->getString()Ljava/lang/String;

    .line 330
    sget-object v0, Ll/᩷᩵ۨ;->֡:Ll/᩷᩵ۨ;

    invoke-virtual {v0}, Ll/᩷᩵ۨ;->getString()Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ljava/io/InputStream;[BII)I
    .locals 3

    .line 2117
    invoke-static {p2, p3, p1}, Ll/ۙ᩵ۨ;->ۙ(II[B)V

    move v0, p3

    :goto_0
    if-lez v0, :cond_1

    sub-int v1, p3, v0

    add-int/2addr v1, p2

    .line 2121
    invoke-virtual {p0, p1, v1, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v2, v1, :cond_0

    goto :goto_1

    :cond_0
    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr p3, v0

    return p3
.end method

.method public static ۙ(JLjava/io/InputStream;)J
    .locals 8

    .line 2544
    invoke-static {}, Ll/ۖۗۨ;->᩷()Ll/ۖۗۨ;

    move-result-object v0

    .line 2545
    :try_start_0
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-ltz v3, :cond_2

    move-wide v3, p0

    :goto_0
    cmp-long v5, v3, v1

    if-lez v5, :cond_1

    .line 2586
    invoke-virtual {v0}, Ll/ۖۗۨ;->ۙ()[B

    move-result-object v5

    .line 2588
    array-length v6, v5

    int-to-long v6, v6

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v7, v6

    const/4 v6, 0x0

    invoke-virtual {p2, v5, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v5, v5

    cmp-long v7, v5, v1

    if-gez v7, :cond_0

    goto :goto_1

    :cond_0
    sub-long/2addr v3, v5

    goto :goto_0

    :cond_1
    :goto_1
    sub-long/2addr p0, v3

    .line 2546
    invoke-virtual {v0}, Ll/ۖۗۨ;->close()V

    return-wide p0

    .line 2577
    :cond_2
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Skip count must be non-negative, actual: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_3

    .line 2544
    :try_start_2
    invoke-virtual {v0}, Ll/ۖۗۨ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p0
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    .locals 4

    .line 477
    new-array p2, p2, [B

    const-string v0, "inputStream"

    .line 1730
    invoke-static {p0, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "outputStream"

    .line 1731
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 1734
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v3, v2, :cond_0

    const/4 v3, 0x0

    .line 1735
    invoke-virtual {p1, p2, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 3313
    new-instance v0, Ll/ܺۨۨ;

    invoke-direct {v0}, Ll/ܺۨۨ;-><init>()V

    .line 3314
    invoke-static {p0, v0, p1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 3315
    invoke-virtual {v0}, Ll/ܺۨۨ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/io/InputStream;)Ljava/util/List;
    .locals 3

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2375
    new-instance v1, Ljava/io/InputStreamReader;

    sget v2, Ll/ܿۗۨ;->ۙ:I

    if-nez v0, :cond_0

    .line 234
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    .line 2375
    :cond_0
    invoke-direct {v1, p0, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 2828
    new-instance p0, Ljava/io/BufferedReader;

    invoke-direct {p0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 2413
    invoke-static {p0}, Ll/۟ۜ᩹;->lines(Ljava/io/BufferedReader;)Ll/᩵ܺۗ;

    move-result-object p0

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static ۙ(III)V
    .locals 3

    or-int v0, p0, p1

    or-int/2addr v0, p2

    if-ltz v0, :cond_0

    sub-int v0, p2, p1

    if-lt v0, p0, :cond_0

    return-void

    .line 607
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const-string p0, "Range [%s, %<s + %s) out of bounds for length %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(II[B)V
    .locals 1

    const-string v0, "byte array"

    .line 550
    invoke-static {p2, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p2, [B

    array-length p2, p2

    invoke-static {p0, p1, p2}, Ll/ۙ᩵ۨ;->ۙ(III)V

    return-void
.end method

.method public static ۙ(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 890
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;J)V
    .locals 10

    .line 1762
    invoke-static {}, Ll/ۖۗۨ;->᩷()Ll/ۖۗۨ;

    move-result-object v0

    .line 1763
    :try_start_0
    invoke-virtual {v0}, Ll/ۖۗۨ;->ۙ()[B

    move-result-object v1

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-nez v4, :cond_0

    goto :goto_1

    .line 1795
    :cond_0
    array-length v5, v1

    if-lez v4, :cond_1

    int-to-long v6, v5

    cmp-long v8, p2, v6

    if-gez v8, :cond_1

    long-to-int v6, p2

    goto :goto_0

    :cond_1
    move v6, v5

    :cond_2
    :goto_0
    if-lez v6, :cond_3

    const/4 v7, 0x0

    .line 1802
    invoke-virtual {p0, v1, v7, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v8

    const/4 v9, -0x1

    if-eq v9, v8, :cond_3

    .line 1803
    invoke-virtual {p1, v1, v7, v8}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v7, v8

    add-long/2addr v2, v7

    if-lez v4, :cond_2

    sub-long v6, p2, v2

    int-to-long v8, v5

    .line 1807
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v6, v6

    goto :goto_0

    .line 1764
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ll/ۖۗۨ;->close()V

    return-void

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_4

    .line 1762
    :try_start_1
    invoke-virtual {v0}, Ll/ۖۗۨ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw p0
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x2000

    .line 1710
    invoke-static {p0, p1, v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    return-void
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 3

    .line 1440
    new-instance v0, Ljava/io/InputStreamReader;

    sget v1, Ll/ܿۗۨ;->ۙ:I

    if-nez p2, :cond_0

    .line 234
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p2

    .line 1440
    :cond_0
    invoke-direct {v0, p0, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 1830
    invoke-static {}, Ll/۬ۗۨ;->᩷()Ll/۬ۗۨ;

    move-result-object p0

    .line 1831
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗۨ;->ۙ()[C

    move-result-object p2

    .line 1852
    :goto_0
    invoke-virtual {v0, p2}, Ljava/io/Reader;->read([C)I

    move-result v1

    const/4 v2, -0x1

    if-eq v2, v1, :cond_1

    const/4 v2, 0x0

    .line 1853
    invoke-virtual {p1, p2, v2, v1}, Ljava/io/Writer;->write([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1832
    :cond_1
    invoke-virtual {p0}, Ll/۬ۗۨ;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 1830
    :try_start_1
    invoke-virtual {p0}, Ll/۬ۗۨ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
.end method

.method public static ۙ(Ljava/io/InputStream;[B)V
    .locals 3

    .line 2217
    array-length v0, p1

    const/4 v1, 0x0

    .line 2238
    invoke-static {p0, p1, v1, v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;[BII)I

    move-result p0

    if-ne p0, v0, :cond_0

    return-void

    .line 2240
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string v1, "Length to read: "

    const-string v2, " actual: "

    .line 0
    invoke-static {v1, v0, p0, v2}, Ll/ۜۚ᩸;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2240
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ([CII)V
    .locals 1

    const-string v0, "char array"

    .line 602
    invoke-static {p0, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, [C

    array-length p0, p0

    invoke-static {p1, p2, p0}, Ll/ۙ᩵ۨ;->ۙ(III)V

    return-void
.end method

.method public static ۙ(Ljava/io/InputStream;Ljava/io/InputStream;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 1244
    :cond_0
    invoke-static {p0}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object p0

    invoke-static {p1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۚ᩵ۨ;->ۙ(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/ReadableByteChannel;)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Ljava/io/InputStream;I)[B
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "input"

    .line 2883
    invoke-static {p0, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_3

    if-nez p1, :cond_0

    .line 2962
    sget-object p0, Ll/ۙ᩵ۨ;->ۙ:[B

    return-object p0

    .line 477
    :cond_0
    new-array v2, p1, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    sub-int v4, p1, v3

    .line 2967
    invoke-virtual {p0, v2, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    add-int/2addr v3, v4

    goto :goto_0

    :cond_1
    if-ne v3, p1, :cond_2

    return-object v2

    .line 2971
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    aput-object v2, v3, v0

    const-string p1, "Expected read size: %,d, actual: %,d"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2959
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "size < 0, size = %,d"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩷(JLjava/io/InputStream;)V
    .locals 4

    .line 2681
    invoke-static {p0, p1, p2}, Ll/ۙ᩵ۨ;->ۙ(JLjava/io/InputStream;)J

    move-result-wide v0

    cmp-long p2, v0, p0

    if-nez p2, :cond_0

    return-void

    .line 2683
    :cond_0
    new-instance p2, Ljava/io/EOFException;

    const-string v2, "Bytes to skip: "

    const-string v3, " actual: "

    .line 0
    invoke-static {v2, v3, p0, p1}, Ll/ۖۚ᩷;->ۙ(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 2683
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ᩷(Ljava/io/InputStream;)[B
    .locals 4

    .line 1932
    sget v0, Ll/ܶۨۨ;->ᩳ:I

    .line 102
    new-instance v0, Ll/ܽۨۨ;

    .line 71
    invoke-direct {v0}, Ll/۫᩵ۨ;-><init>()V

    .line 1932
    invoke-virtual {v0}, Ll/۫᩵ۨ;->֫()V

    invoke-virtual {v0}, Ll/ܽۨۨ;->ۧ()Ll/ܶۨۨ;

    move-result-object v0

    .line 1933
    sget v1, Ll/᩷ۨۨ;->֨:I

    .line 295
    new-instance v1, Ll/ۙۨۨ;

    invoke-direct {v1}, Ll/ۙۨۨ;-><init>()V

    const-wide/32 v2, 0x7ffffff8

    .line 1933
    invoke-virtual {v1, v2, v3}, Ll/۬᩵ۨ;->ۙ(J)V

    invoke-virtual {v1}, Ll/۬᩵ۨ;->ܽ()V

    invoke-virtual {v1, p0}, Ll/ᩴ᩵ۨ;->ۙ(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Ll/ۙۨۨ;->ܶ()Ll/᩷ۨۨ;

    move-result-object p0

    .line 1934
    :try_start_0
    invoke-virtual {v0, p0}, Ll/ܳۨۨ;->ۙ(Ll/᩷ۨۨ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1936
    invoke-virtual {p0}, Ll/᩷ۨۨ;->close()V

    .line 2860
    invoke-virtual {v0}, Ll/ܶۨۨ;->size()I

    move-result p0

    const v1, 0x7ffffff7

    if-gt p0, v1, :cond_0

    .line 2863
    invoke-virtual {v0}, Ll/ܶۨۨ;->ۙ()[B

    move-result-object p0

    return-object p0

    .line 2861
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "Cannot read more than %,d into a byte array"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception v0

    .line 1932
    :try_start_1
    invoke-virtual {p0}, Ll/᩷ۨۨ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method
