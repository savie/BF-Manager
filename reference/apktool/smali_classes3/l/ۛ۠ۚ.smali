.class public final Ll/ۛ۠ۚ;
.super Ljava/lang/Object;
.source "X6JI"


# direct methods
.method public static ۙ(Ll/ۨ۠ۚ;JJ)Ll/ۗ۠ۚ;
    .locals 10

    const-wide/16 v0, 0xa

    cmp-long v2, p3, v0

    if-ltz v2, :cond_5

    const/16 v8, 0xa

    new-array v9, v8, [B

    const/4 v7, 0x0

    move-object v3, p0

    move-wide v4, p1

    move-object v6, v9

    .line 33
    invoke-static/range {v3 .. v8}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    const-string p0, "ID3"

    const/4 v0, 0x0

    .line 34
    invoke-static {p0, v0, v9}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 p0, 0x6

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge p0, v0, :cond_2

    .line 37
    aget-byte v0, v9, p0

    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_1

    shl-int/lit8 v1, v4, 0x7

    or-int v4, v1, v0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid ID3 tag size"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 p0, 0x3

    .line 40
    aget-byte p0, v9, p0

    const/4 v1, 0x4

    if-ne p0, v1, :cond_3

    const/4 p0, 0x5

    aget-byte p0, v9, p0

    and-int/lit8 p0, p0, 0x10

    if-eqz p0, :cond_3

    const/16 v0, 0x14

    :cond_3
    const/high16 p0, 0x800000

    sub-int/2addr p0, v0

    if-gt v4, p0, :cond_4

    int-to-long v1, v4

    int-to-long v5, v0

    sub-long/2addr p3, v5

    cmp-long p0, v1, p3

    if-gtz p0, :cond_4

    .line 43
    new-instance p0, Ll/ۗ۠ۚ;

    add-int v5, v4, v0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, v9

    invoke-direct/range {v0 .. v5}, Ll/ۗ۠ۚ;-><init>(J[BII)V

    return-object p0

    .line 42
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "ID3 tag exceeds size limit or source boundary"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 31
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Truncated ID3 header"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/ۨ۠ۚ;Ll/ۗ۠ۚ;Ll/ܿ᩻᩷;)Ll/ᩳ᩹ۙ;
    .locals 16

    .line 48
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->᩷()I

    move-result v0

    const/16 v1, 0xa

    add-int/2addr v0, v1

    new-array v8, v0, [B

    .line 49
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->ۙ()[B

    move-result-object v2

    const/4 v9, 0x0

    invoke-static {v2, v9, v8, v9, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->position()J

    move-result-wide v2

    const-wide/16 v4, 0xa

    add-long v3, v2, v4

    const/16 v6, 0xa

    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->᩷()I

    move-result v7

    move-object/from16 v2, p0

    move-object v5, v8

    invoke-static/range {v2 .. v7}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    .line 51
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->ۤ()I

    move-result v2

    if-eq v2, v0, :cond_3

    const/16 v15, 0xa

    new-array v2, v15, [B

    .line 53
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->position()J

    move-result-wide v3

    int-to-long v5, v0

    add-long v11, v3, v5

    const/4 v14, 0x0

    move-object/from16 v10, p0

    move-object v13, v2

    invoke-static/range {v10 .. v15}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    const-string v3, "3DI"

    .line 54
    invoke-static {v3, v9, v2}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x3

    :goto_0
    if-ge v3, v1, :cond_1

    .line 56
    aget-byte v4, v2, v3

    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠ۚ;->ۙ()[B

    move-result-object v5

    aget-byte v5, v5, v3

    if-ne v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ID3 footer does not match header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v1, 0x5

    .line 59
    aget-byte v2, v8, v1

    and-int/lit8 v2, v2, -0x11

    int-to-byte v2, v2

    aput-byte v2, v8, v1

    goto :goto_1

    .line 54
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid ID3 footer signature"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_3
    :goto_1
    :try_start_0
    new-instance v1, Ll/۟᩻᩷;

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Ll/۟᩻᩷;-><init>(Ll/ܿ᩻᩷;)V

    invoke-virtual {v1, v0, v8}, Ll/۟᩻᩷;->ۙ(I[B)Ll/ᩳ᩹ۙ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 64
    new-instance v1, Ll/᩵۠ۚ;

    const-string v2, "Invalid ID3 tag"

    .line 22
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    throw v1
.end method

.method public static ۙ(Ll/ۨ۠ۚ;J[BII)V
    .locals 6

    :goto_0
    if-lez p5, :cond_2

    .line 83
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 84
    invoke-interface/range {v0 .. v5}, Ll/ۨ۠ۚ;->ۙ(J[BII)I

    move-result v0

    if-lez v0, :cond_0

    if-gt v0, p5, :cond_0

    int-to-long v1, v0

    add-long/2addr p1, v1

    add-int/2addr p4, v0

    sub-int/2addr p5, v0

    goto :goto_0

    .line 85
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Truncated audio metadata or read made no progress"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 83
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Audio metadata read cancelled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void
.end method

.method public static ۙ(Ljava/lang/String;I[B)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p1, :cond_3

    .line 74
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    array-length v2, p2

    sub-int/2addr v2, p1

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 75
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    add-int v2, p1, v1

    .line 76
    aget-byte v2, p2, v2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method
