.class public final Ll/ܰۢۚ;
.super Ljava/lang/Object;
.source "Y6JG"


# direct methods
.method public static ۙ(Ll/᩶ۨۙ;)I
    .locals 4

    .line 226
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 227
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۘ()J

    move-result-wide v0

    const-wide/32 v2, 0xc00000

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    long-to-int p0, v0

    return p0

    .line 228
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Picture length exceeds limit"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 226
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Truncated picture length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(ILl/᩶ۨۙ;)V
    .locals 1

    .line 233
    invoke-virtual {p1}, Ll/᩶ۨۙ;->ۙ()I

    move-result v0

    if-gt p0, v0, :cond_0

    .line 234
    invoke-virtual {p1, p0}, Ll/᩶ۨۙ;->ܳ(I)V

    return-void

    .line 233
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Truncated audio comment or picture"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/ۛۢۚ;JJLl/ۘۢۚ;)V
    .locals 19

    move-object/from16 v0, p5

    const/4 v7, 0x4

    new-array v8, v7, [B

    const/4 v9, 0x0

    const/4 v1, 0x0

    move-wide/from16 v10, p1

    const/4 v12, 0x0

    :goto_0
    const/16 v1, 0x400

    if-ge v12, v1, :cond_9

    sub-long v1, p3, v10

    const-wide/16 v3, 0x4

    cmp-long v5, v1, v3

    if-ltz v5, :cond_8

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-wide v2, v10

    move-object v4, v8

    move v6, v7

    .line 110
    invoke-static/range {v1 .. v6}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    int-to-long v1, v7

    add-long/2addr v10, v1

    .line 112
    aget-byte v1, v8, v9

    const/16 v2, 0x7f

    and-int/2addr v1, v2

    const/4 v3, 0x1

    .line 113
    aget-byte v3, v8, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    const/4 v4, 0x2

    aget-byte v4, v8, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    const/4 v4, 0x3

    aget-byte v4, v8, v4

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v3, v4

    int-to-long v4, v3

    sub-long v13, p3, v10

    cmp-long v6, v4, v13

    if-gtz v6, :cond_7

    if-eq v1, v2, :cond_7

    if-nez v12, :cond_0

    if-nez v1, :cond_7

    const/16 v2, 0x22

    if-ne v3, v2, :cond_7

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_7

    .line 118
    :goto_1
    invoke-static/range {p5 .. p5}, Ll/ۘۢۚ;->ۙ(Ll/ۘۢۚ;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    const/4 v2, 0x4

    const/4 v6, 0x6

    if-eq v1, v2, :cond_2

    if-ne v1, v6, :cond_4

    :cond_2
    const/high16 v2, 0xc00000

    if-gt v3, v2, :cond_4

    .line 122
    new-array v2, v3, [B

    const/16 v17, 0x0

    move-object/from16 v13, p0

    move-wide v14, v10

    move-object/from16 v16, v2

    move/from16 v18, v3

    .line 123
    invoke-static/range {v13 .. v18}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    if-ne v1, v6, :cond_3

    .line 124
    invoke-static {v2, v0}, Ll/ܰۢۚ;->ۙ([BLl/ۘۢۚ;)V

    goto :goto_2

    .line 125
    :cond_3
    new-instance v1, Ll/᩶ۨۙ;

    invoke-direct {v1, v2}, Ll/᩶ۨۙ;-><init>([B)V

    invoke-static {v1, v0}, Ll/ܰۢۚ;->ۙ(Ll/᩶ۨۙ;Ll/ۘۢۚ;)V

    :cond_4
    :goto_2
    add-long/2addr v10, v4

    .line 129
    invoke-static/range {p5 .. p5}, Ll/ۘۢۚ;->ۙ(Ll/ۘۢۚ;)Z

    move-result v1

    if-nez v1, :cond_6

    aget-byte v1, v8, v9

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    :cond_6
    :goto_3
    return-void

    .line 116
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid FLAC metadata block"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated FLAC metadata header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Too many FLAC metadata blocks"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/ۛۢۚ;Ll/ۗ۠ۚ;Ll/ۘۢۚ;)V
    .locals 3

    .line 93
    :try_start_0
    new-instance v0, Ll/ۨۢۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1, v0}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;Ll/ۗ۠ۚ;Ll/ܿ᩻᩷;)Ll/ᩳ᩹ۙ;

    move-result-object p0
    :try_end_0
    .catch Ll/᩵۠ۚ; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 99
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ᩹ۙ;->ۙ()I

    move-result v0

    if-ge p1, v0, :cond_2

    invoke-static {p2}, Ll/ۘۢۚ;->ۙ(Ll/ۘۢۚ;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    invoke-virtual {p0, p1}, Ll/ᩳ᩹ۙ;->ۙ(I)Ll/۟᩹ۙ;

    move-result-object v0

    instance-of v1, v0, Ll/ۨ᩻᩷;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۨ᩻᩷;

    .line 101
    iget v1, v0, Ll/ۨ᩻᩷;->ᩴ:I

    iget-object v2, v0, Ll/ۨ᩻᩷;->ۤ:Ljava/lang/String;

    iget-object v0, v0, Ll/ۨ᩻᩷;->᩸:[B

    invoke-virtual {p2, v2, v1, v0}, Ll/ۘۢۚ;->ۙ(Ljava/lang/String;I[B)V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)V
    .locals 22

    move-wide/from16 v3, p1

    const-wide/16 v0, 0x4

    cmp-long v2, v3, v0

    if-gez v2, :cond_0

    goto/16 :goto_5

    .line 55
    :cond_0
    new-instance v2, Ll/ۛۢۚ;

    move-object/from16 v5, p0

    invoke-direct {v2, v3, v4, v5}, Ll/ۛۢۚ;-><init>(JLl/ۨ۠ۚ;)V

    .line 33
    new-instance v11, Ll/ۘۢۚ;

    move-object/from16 v5, p3

    invoke-direct {v11, v5}, Ll/ۘۢۚ;-><init>(Ljava/util/function/Predicate;)V

    const/4 v10, 0x4

    new-array v12, v10, [B

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    move-object v8, v12

    .line 35
    invoke-static/range {v5 .. v10}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    const-string v13, "ID3"

    const/4 v14, 0x0

    .line 36
    invoke-static {v13, v14, v12}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v5

    const-string v15, "fLaC"

    if-eqz v5, :cond_8

    const/4 v12, 0x4

    new-array v10, v12, [B

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object v9, v5

    :goto_0
    const/16 v5, 0x400

    if-ge v8, v5, :cond_7

    move-object/from16 p3, v15

    sub-long v14, v3, v6

    cmp-long v5, v14, v0

    if-ltz v5, :cond_6

    const/16 v16, 0x0

    move-object v5, v2

    move-wide/from16 v17, v6

    move/from16 v19, v8

    move-object v8, v10

    move-object v0, v9

    move/from16 v9, v16

    move-object v1, v10

    move v10, v12

    .line 73
    invoke-static/range {v5 .. v10}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    const/4 v5, 0x0

    .line 74
    invoke-static {v13, v5, v1}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v6

    if-nez v6, :cond_3

    move-object/from16 v6, p3

    .line 76
    invoke-static {v6, v5, v1}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_5

    :cond_1
    if-eqz v0, :cond_2

    .line 78
    invoke-static {v2, v0, v11}, Ll/ܰۢۚ;->ۙ(Ll/ۛۢۚ;Ll/ۗ۠ۚ;Ll/ۘۢۚ;)V

    :cond_2
    move-wide/from16 v9, v17

    const-wide/16 v7, 0x4

    add-long v5, v9, v7

    move-object v0, v2

    move-wide v1, v5

    move-wide/from16 v3, p1

    move-object v5, v11

    .line 79
    invoke-static/range {v0 .. v5}, Ll/ܰۢۚ;->ۙ(Ll/ۛۢۚ;JJLl/ۘۢۚ;)V

    return-void

    :cond_3
    move-object/from16 v6, p3

    move-wide/from16 v9, v17

    const-wide/16 v7, 0x4

    .line 82
    invoke-static {v2, v9, v10, v14, v15}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;JJ)Ll/ۗ۠ۚ;

    move-result-object v5

    if-nez v0, :cond_4

    move-object v0, v5

    .line 84
    :cond_4
    invoke-virtual {v5}, Ll/ۗ۠ۚ;->ۤ()I

    move-result v5

    int-to-long v14, v5

    add-long/2addr v9, v14

    const-wide/32 v14, 0x800000

    cmp-long v5, v9, v14

    if-gtz v5, :cond_5

    add-int/lit8 v5, v19, 0x1

    move-object v15, v6

    const/4 v14, 0x0

    move-wide/from16 v20, v9

    move-object v9, v0

    move-object v10, v1

    move-wide v0, v7

    move-wide/from16 v6, v20

    move v8, v5

    goto :goto_0

    .line 85
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "FLAC leading ID3 tags exceed limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated FLAC marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Too many leading FLAC ID3 tags"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object v6, v15

    const/4 v0, 0x0

    .line 37
    invoke-static {v6, v0, v12}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v1

    if-eqz v1, :cond_9

    const-wide/16 v5, 0x4

    move-object v0, v2

    move-wide v1, v5

    move-wide/from16 v3, p1

    move-object v5, v11

    invoke-static/range {v0 .. v5}, Ll/ܰۢۚ;->ۙ(Ll/ۛۢۚ;JJLl/ۘۢۚ;)V

    return-void

    :cond_9
    const-string v1, "OggS"

    .line 38
    invoke-static {v1, v0, v12}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 135
    new-instance v1, Ll/᩺ۢۚ;

    invoke-direct {v1, v2, v3, v4}, Ll/᩺ۢۚ;-><init>(Ll/ۛۢۚ;J)V

    const/high16 v2, 0x10000

    .line 136
    invoke-virtual {v1, v2}, Ll/᩺ۢۚ;->ۙ(I)Ll/᩶ۨۙ;

    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v3

    const-string v4, "OpusHead"

    invoke-static {v4, v0, v3}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v3

    const/4 v0, 0x1

    if-eqz v3, :cond_a

    invoke-virtual {v2}, Ll/᩶ۨۙ;->ᩴ()I

    move-result v3

    const/16 v4, 0x13

    if-lt v3, v4, :cond_a

    const/4 v3, 0x1

    goto :goto_1

    :cond_a
    const/4 v3, 0x0

    .line 138
    :goto_1
    invoke-virtual {v2}, Ll/᩶ۨۙ;->ᩴ()I

    move-result v4

    const/16 v5, 0x1e

    const-string v6, "vorbis"

    if-lt v4, v5, :cond_b

    invoke-virtual {v2}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v4

    const/4 v5, 0x0

    aget-byte v4, v4, v5

    if-ne v4, v0, :cond_b

    .line 139
    invoke-virtual {v2}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v2

    invoke-static {v6, v0, v2}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    goto :goto_2

    :cond_b
    const/4 v2, 0x0

    :goto_2
    if-nez v3, :cond_c

    if-nez v2, :cond_c

    goto :goto_5

    :cond_c
    const/high16 v4, 0xc00000

    .line 141
    invoke-virtual {v1, v4}, Ll/᩺ۢۚ;->ۙ(I)Ll/᩶ۨۙ;

    move-result-object v1

    if-eqz v3, :cond_d

    const/16 v4, 0x8

    goto :goto_3

    :cond_d
    const/4 v4, 0x7

    .line 143
    :goto_3
    invoke-virtual {v1}, Ll/᩶ۨۙ;->ᩴ()I

    move-result v5

    if-lt v5, v4, :cond_10

    if-eqz v3, :cond_e

    invoke-virtual {v1}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v3

    const-string v5, "OpusTags"

    const/4 v7, 0x0

    invoke-static {v5, v7, v3}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_4

    :cond_e
    const/4 v7, 0x0

    .line 144
    invoke-virtual {v1}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v3

    aget-byte v3, v3, v7

    const/4 v5, 0x3

    if-ne v3, v5, :cond_10

    invoke-virtual {v1}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v3

    invoke-static {v6, v0, v3}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 146
    :goto_4
    invoke-virtual {v1, v4}, Ll/᩶ۨۙ;->ᩴ(I)V

    .line 147
    invoke-static {v1, v11}, Ll/ܰۢۚ;->ۙ(Ll/᩶ۨۙ;Ll/ۘۢۚ;)V

    if-eqz v2, :cond_11

    .line 148
    invoke-virtual {v1}, Ll/᩶ۨۙ;->ۙ()I

    move-result v2

    if-lt v2, v0, :cond_f

    invoke-virtual {v1}, Ll/᩶ۨۙ;->ۛ()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    goto :goto_5

    .line 149
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid Vorbis comment framing bit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid Ogg comment header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_5
    return-void
.end method

.method public static ۙ(Ll/᩶ۨۙ;Ll/ۘۢۚ;)V
    .locals 7

    .line 154
    invoke-static {p0}, Ll/ܰۢۚ;->᩷(Ll/᩶ۨۙ;)I

    move-result v0

    invoke-static {v0, p0}, Ll/ܰۢۚ;->ۙ(ILl/᩶ۨۙ;)V

    .line 155
    invoke-static {p0}, Ll/ܰۢۚ;->᩷(Ll/᩶ۨۙ;)I

    move-result v0

    const/16 v1, 0x400

    if-gt v0, v1, :cond_3

    .line 156
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    if-gt v0, v1, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 159
    invoke-static {p0}, Ll/ܰۢۚ;->᩷(Ll/᩶ۨۙ;)I

    move-result v3

    .line 160
    invoke-virtual {p0}, Ll/᩶ۨۙ;->᩸()I

    move-result v4

    .line 161
    invoke-static {v3, p0}, Ll/ܰۢۚ;->ۙ(ILl/᩶ۨۙ;)V

    .line 162
    invoke-static {p1}, Ll/ۘۢۚ;->ۙ(Ll/ۘۢۚ;)Z

    move-result v5

    if-nez v5, :cond_1

    const/16 v5, 0x17

    if-lt v3, v5, :cond_1

    .line 163
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v5

    const-string v6, "METADATA_BLOCK_PICTURE="

    invoke-static {v6, v4, v5}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 165
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v5

    add-int/lit8 v4, v4, 0x17

    add-int/lit8 v3, v3, -0x17

    invoke-static {v5, v4, v3, v1}, Landroid/util/Base64;->decode([BIII)[B

    move-result-object v3

    .line 167
    invoke-static {v3, p1}, Ll/ܰۢۚ;->ۙ([BLl/ۘۢۚ;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 157
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Too many audio comments"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ([BLl/ۘۢۚ;)V
    .locals 2

    .line 177
    :try_start_0
    new-instance v0, Ll/᩶ۨۙ;

    invoke-direct {v0, p0}, Ll/᩶ۨۙ;-><init>([B)V

    invoke-static {v0}, Ll/ܰۢۚ;->ۤ(Ll/᩶ۨۙ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 178
    :cond_0
    new-instance v0, Ll/᩶ۨۙ;

    invoke-direct {v0, p0}, Ll/᩶ۨۙ;-><init>([B)V

    invoke-static {v0}, Ll/ܽ᩻᩷;->ۙ(Ll/᩶ۨۙ;)Ll/ܽ᩻᩷;

    move-result-object p0

    .line 179
    iget v0, p0, Ll/ܽ᩻᩷;->۫:I

    iget-object v1, p0, Ll/ܽ᩻᩷;->ᩴ:Ljava/lang/String;

    iget-object p0, p0, Ll/ܽ᩻᩷;->ܳ:[B

    invoke-virtual {p1, v1, v0, p0}, Ll/ۘۢۚ;->ۙ(Ljava/lang/String;I[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public static ۤ(Ll/᩶ۨۙ;)Z
    .locals 6

    .line 206
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x4

    .line 207
    invoke-virtual {p0, v0}, Ll/᩶ۨۙ;->ܳ(I)V

    .line 208
    invoke-static {p0}, Ll/ܰۢۚ;->ۙ(Ll/᩶ۨۙ;)I

    move-result v0

    .line 209
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result v1

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    .line 210
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۤ()[B

    move-result-object v1

    invoke-virtual {p0}, Ll/᩶ۨۙ;->᩸()I

    move-result v4

    const-string v5, "-->"

    invoke-static {v5, v4, v1}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 211
    :goto_0
    invoke-static {v0, p0}, Ll/ܰۢۚ;->ۙ(ILl/᩶ۨۙ;)V

    .line 212
    invoke-static {p0}, Ll/ܰۢۚ;->ۙ(Ll/᩶ۨۙ;)I

    move-result v0

    invoke-static {v0, p0}, Ll/ܰۢۚ;->ۙ(ILl/᩶ۨۙ;)V

    const/16 v0, 0x10

    .line 213
    invoke-static {v0, p0}, Ll/ܰۢۚ;->ۙ(ILl/᩶ۨۙ;)V

    .line 214
    invoke-static {p0}, Ll/ܰۢۚ;->ۙ(Ll/᩶ۨۙ;)I

    move-result v0

    if-nez v1, :cond_3

    if-lez v0, :cond_3

    const/high16 v1, 0x800000

    if-gt v0, v1, :cond_3

    .line 215
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result p0

    if-gt v0, p0, :cond_3

    return v3

    :cond_3
    :goto_1
    return v2
.end method

.method public static ᩷(Ll/᩶ۨۙ;)I
    .locals 4

    .line 219
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ۙ()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 220
    invoke-virtual {p0}, Ll/᩶ۨۙ;->ܺ()J

    move-result-wide v0

    const-wide/32 v2, 0xc00000

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    long-to-int p0, v0

    return p0

    .line 221
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Audio comment length exceeds limit"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 219
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Truncated audio comment length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩷(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)V
    .locals 3

    const-wide/16 v0, 0xa

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-void

    .line 55
    :cond_0
    new-instance v0, Ll/ۛۢۚ;

    invoke-direct {v0, p1, p2, p0}, Ll/ۛۢۚ;-><init>(JLl/ۨ۠ۚ;)V

    const-wide/16 v1, 0x0

    .line 47
    invoke-static {v0, v1, v2, p1, p2}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;JJ)Ll/ۗ۠ۚ;

    move-result-object p0

    .line 48
    new-instance p1, Ll/ۘۢۚ;

    invoke-direct {p1, p3}, Ll/ۘۢۚ;-><init>(Ljava/util/function/Predicate;)V

    if-eqz p0, :cond_1

    .line 49
    invoke-static {v0, p0, p1}, Ll/ܰۢۚ;->ۙ(Ll/ۛۢۚ;Ll/ۗ۠ۚ;Ll/ۘۢۚ;)V

    :cond_1
    return-void
.end method
