.class public final Ll/᩺ۢۚ;
.super Ljava/lang/Object;
.source "Y6JG"


# instance fields
.field public ֫:I

.field public ۙ:Z

.field public ۚ:I

.field public final ۤ:[B

.field public ۧ:J

.field public final ۫:Ll/ۛۢۚ;

.field public ܳ:J

.field public ᩴ:I

.field public final ᩷:[B

.field public final ᩸:J

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۛۢۚ;J)V
    .locals 1

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1b

    new-array v0, v0, [B

    .line 241
    iput-object v0, p0, Ll/᩺ۢۚ;->᩷:[B

    const/16 v0, 0xff

    new-array v0, v0, [B

    iput-object v0, p0, Ll/᩺ۢۚ;->ۤ:[B

    .line 247
    iput-object p1, p0, Ll/᩺ۢۚ;->۫:Ll/ۛۢۚ;

    .line 248
    iput-wide p2, p0, Ll/᩺ۢۚ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ۙ(I)Ll/᩶ۨۙ;
    .locals 19

    move-object/from16 v0, p0

    .line 252
    new-instance v1, Ll/ۛۚۤ;

    const/16 v2, 0x400

    invoke-direct {v1, v2}, Ll/ۛۚۤ;-><init>(I)V

    const v3, 0xfe01

    new-array v3, v3, [B

    .line 255
    :goto_0
    iget v4, v0, Ll/᩺ۢۚ;->ۚ:I

    iget v5, v0, Ll/᩺ۢۚ;->֫:I

    iget-object v12, v0, Ll/᩺ۢۚ;->۫:Ll/ۛۢۚ;

    iget-object v13, v0, Ll/᩺ۢۚ;->ۤ:[B

    const/4 v14, 0x1

    if-ne v4, v5, :cond_b

    .line 256
    iget-boolean v4, v0, Ll/᩺ۢۚ;->ۙ:Z

    if-nez v4, :cond_a

    iget v4, v0, Ll/᩺ۢۚ;->ᩴ:I

    add-int/2addr v4, v14

    iput v4, v0, Ll/᩺ۢۚ;->ᩴ:I

    if-gt v4, v2, :cond_a

    iget-wide v7, v0, Ll/᩺ۢۚ;->ܳ:J

    iget-wide v4, v0, Ll/᩺ۢۚ;->᩸:J

    sub-long v9, v4, v7

    iget-object v2, v0, Ll/᩺ۢۚ;->᩷:[B

    array-length v6, v2

    int-to-long v14, v6

    cmp-long v6, v9, v14

    if-ltz v6, :cond_a

    const/4 v10, 0x0

    .line 258
    array-length v11, v2

    move-object v6, v12

    move-object v9, v2

    invoke-static/range {v6 .. v11}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    .line 259
    iget-wide v6, v0, Ll/᩺ۢۚ;->ܳ:J

    array-length v8, v2

    int-to-long v8, v8

    add-long/2addr v6, v8

    iput-wide v6, v0, Ll/᩺ۢۚ;->ܳ:J

    const/4 v6, 0x5

    .line 260
    aget-byte v6, v2, v6

    const-string v7, "OggS"

    const/4 v8, 0x0

    .line 261
    invoke-static {v7, v8, v2}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, 0x4

    aget-byte v7, v2, v7

    if-nez v7, :cond_9

    and-int/lit16 v7, v6, 0xf8

    if-nez v7, :cond_9

    and-int/lit8 v7, v6, 0x1

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    .line 262
    :goto_1
    invoke-virtual {v1}, Ll/ۛۚۤ;->size()I

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-ne v7, v8, :cond_9

    const/16 v7, 0xe

    .line 18
    invoke-static {v7, v2}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v7

    int-to-long v7, v7

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    const/16 v11, 0x12

    invoke-static {v11, v2}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v11

    int-to-long v14, v11

    and-long/2addr v14, v9

    .line 265
    iget v11, v0, Ll/᩺ۢۚ;->ᩴ:I

    const/4 v9, 0x1

    if-ne v11, v9, :cond_3

    and-int/lit8 v10, v6, 0x2

    if-eqz v10, :cond_2

    const-wide/16 v10, 0x0

    cmp-long v16, v14, v10

    if-nez v16, :cond_2

    .line 267
    iput-wide v7, v0, Ll/᩺ۢۚ;->᩻:J

    goto :goto_3

    .line 266
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Missing Ogg stream start"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 268
    :cond_3
    iget-wide v10, v0, Ll/᩺ۢۚ;->᩻:J

    cmp-long v16, v7, v10

    if-nez v16, :cond_8

    iget-wide v7, v0, Ll/᩺ۢۚ;->ۧ:J

    cmp-long v10, v14, v7

    if-nez v10, :cond_8

    and-int/lit8 v7, v6, 0x2

    if-nez v7, :cond_8

    :goto_3
    const-wide/16 v7, 0x1

    add-long/2addr v14, v7

    const-wide v7, 0xffffffffL

    and-long/2addr v7, v14

    .line 271
    iput-wide v7, v0, Ll/᩺ۢۚ;->ۧ:J

    and-int/lit8 v6, v6, 0x4

    if-eqz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    .line 272
    :goto_4
    iput-boolean v6, v0, Ll/᩺ۢۚ;->ۙ:Z

    const/16 v6, 0x1a

    .line 273
    aget-byte v2, v2, v6

    and-int/lit16 v11, v2, 0xff

    iput v11, v0, Ll/᩺ۢۚ;->֫:I

    const/4 v2, 0x0

    .line 274
    iput v2, v0, Ll/᩺ۢۚ;->ۚ:I

    int-to-long v6, v11

    .line 275
    iget-wide v14, v0, Ll/᩺ۢۚ;->ܳ:J

    sub-long v17, v4, v14

    cmp-long v2, v6, v17

    if-gtz v2, :cond_7

    const/4 v10, 0x0

    move-object v6, v12

    move-wide v7, v14

    const/4 v2, 0x1

    move-object v9, v13

    .line 276
    invoke-static/range {v6 .. v11}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    .line 277
    iget-wide v6, v0, Ll/᩺ۢۚ;->ܳ:J

    iget v8, v0, Ll/᩺ۢۚ;->֫:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    iput-wide v6, v0, Ll/᩺ۢۚ;->ܳ:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 279
    :goto_5
    iget v8, v0, Ll/᩺ۢۚ;->֫:I

    if-ge v6, v8, :cond_5

    aget-byte v8, v13, v6

    and-int/lit16 v8, v8, 0xff

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_5
    int-to-long v6, v7

    .line 280
    iget-wide v9, v0, Ll/᩺ۢۚ;->ܳ:J

    sub-long/2addr v4, v9

    cmp-long v9, v6, v4

    if-gtz v9, :cond_6

    if-nez v8, :cond_c

    goto :goto_7

    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Truncated Ogg page payload"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 275
    :cond_7
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Truncated Ogg segment table"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 269
    :cond_8
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Ogg stream or sequence changed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 263
    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid Ogg page or continuation"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 257
    :cond_a
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Truncated or excessive Ogg pages"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    const/4 v2, 0x1

    :cond_c
    const/4 v4, 0x0

    .line 285
    :cond_d
    iget v5, v0, Ll/᩺ۢۚ;->ۚ:I

    iget v6, v0, Ll/᩺ۢۚ;->֫:I

    if-ge v5, v6, :cond_e

    add-int/lit8 v6, v5, 0x1

    .line 286
    iput v6, v0, Ll/᩺ۢۚ;->ۚ:I

    aget-byte v5, v13, v5

    const/16 v6, 0xff

    and-int/2addr v5, v6

    add-int/2addr v4, v5

    if-ge v5, v6, :cond_d

    move v2, v4

    const/4 v14, 0x1

    goto :goto_6

    :cond_e
    const/4 v14, 0x0

    move v2, v4

    .line 293
    :goto_6
    invoke-virtual {v1}, Ll/ۛۚۤ;->size()I

    move-result v4

    sub-int v4, p1, v4

    if-gt v2, v4, :cond_10

    .line 294
    iget-wide v5, v0, Ll/᩺ۢۚ;->ܳ:J

    const/4 v8, 0x0

    move-object v4, v12

    move-object v7, v3

    move v9, v2

    invoke-static/range {v4 .. v9}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    .line 295
    iget-wide v4, v0, Ll/᩺ۢۚ;->ܳ:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, v0, Ll/᩺ۢۚ;->ܳ:J

    const/4 v4, 0x0

    .line 296
    invoke-virtual {v1, v3, v4, v2}, Ll/ۛۚۤ;->write([BII)V

    if-eqz v14, :cond_f

    .line 297
    new-instance v2, Ll/᩶ۨۙ;

    invoke-virtual {v1}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v3

    invoke-virtual {v1}, Ll/ۛۚۤ;->size()I

    move-result v1

    invoke-direct {v2, v3, v1}, Ll/᩶ۨۙ;-><init>([BI)V

    return-object v2

    :cond_f
    :goto_7
    const/16 v2, 0x400

    goto/16 :goto_0

    .line 293
    :cond_10
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Ogg packet exceeds limit"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
