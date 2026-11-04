.class public final Ll/ۙۚ᩻;
.super Ll/᩻ܺۨ;
.source "46P2"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۙ:Z

.field public final ۚ:Ll/ۜ᩸᩻;

.field public ۤ:[B

.field public final ۧ:Ljava/lang/CharSequence;

.field public ۫:I

.field public final ܳ:Ll/ܰ۫᩻;

.field public final ܺ:I

.field public ᩴ:[I

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩸:[J

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/ۗܺۨ;Ll/ۜ᩸᩻;ILl/ܰ۫᩻;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۚ᩻;->᩷:Ljava/util/ArrayList;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۚ᩻;->֫:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 34
    iput v0, p0, Ll/ۙۚ᩻;->۫:I

    .line 38
    iput-object p1, p0, Ll/ۙۚ᩻;->ۧ:Ljava/lang/CharSequence;

    .line 40
    invoke-virtual {p2}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    .line 41
    iput-object p3, p0, Ll/ۙۚ᩻;->ۚ:Ll/ۜ᩸᩻;

    .line 42
    iput-object p5, p0, Ll/ۙۚ᩻;->ܳ:Ll/ܰ۫᩻;

    if-nez p5, :cond_0

    .line 43
    sget-object p2, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    if-eq p3, p2, :cond_0

    invoke-static {p1}, Ll/ܰ۫᩻;->ۙ(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ۙۚ᩻;->ۙ:Z

    .line 44
    iput p4, p0, Ll/ۙۚ᩻;->ܺ:I

    return-void
.end method

.method private ۙ(IIZLl/ۖ۫᩻;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    .line 296
    iget-object v4, v0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v6, 0x58

    const/16 v7, 0x5a

    const/16 v8, 0x59

    const/16 v9, 0x5c

    const/16 v10, 0x5b

    if-ne v5, v10, :cond_0

    const/16 v11, 0x5c

    goto :goto_0

    :cond_0
    if-ne v5, v8, :cond_1

    const/16 v11, 0x5a

    goto :goto_0

    :cond_1
    const/16 v11, 0x58

    .line 299
    :goto_0
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۠ܺۨ;

    invoke-interface {v12}, Ll/۠ܺۨ;->getType()I

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-ne v12, v11, :cond_2

    const/4 v11, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_1
    const/4 v12, 0x3

    if-eqz v11, :cond_7

    .line 300
    invoke-virtual/range {p0 .. p1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v15

    if-ne v15, v2, :cond_7

    .line 301
    invoke-direct {v0, v1, v2, v13, v13}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    .line 302
    invoke-virtual/range {p0 .. p2}, Ll/ۙۚ᩻;->᩷(II)Z

    move-result v3

    const/16 v5, 0x8d

    if-eqz v3, :cond_4

    add-int/lit8 v1, v2, -0x1

    .line 304
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    .line 305
    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v3

    if-ne v3, v5, :cond_3

    .line 306
    invoke-interface {v1}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ۚ᩻;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v12, 0x2

    .line 305
    :cond_3
    invoke-direct {v0, v2, v12}, Ll/ۙۚ᩻;->ۤ(II)V

    return-void

    .line 307
    :cond_4
    invoke-direct/range {p0 .. p2}, Ll/ۙۚ᩻;->᩸(II)Z

    move-result v3

    if-eqz v3, :cond_6

    add-int/2addr v1, v14

    :goto_2
    if-ge v1, v2, :cond_5

    .line 310
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܺۨ;

    invoke-interface {v3}, Ll/۠ܺۨ;->getType()I

    move-result v3

    if-ne v3, v5, :cond_5

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 311
    :cond_5
    iget-object v3, v0, Ll/ۙۚ᩻;->ᩴ:[I

    aget v4, v3, v1

    add-int/2addr v4, v14

    aput v4, v3, v1

    .line 312
    aget v1, v3, v2

    sub-int/2addr v1, v14

    aput v1, v3, v2

    .line 313
    invoke-direct {v0, v2}, Ll/ۙۚ᩻;->᩸(I)V

    return-void

    .line 314
    :cond_6
    invoke-direct {v0, v2, v12}, Ll/ۙۚ᩻;->ۤ(II)V

    return-void

    :cond_7
    if-ne v5, v10, :cond_8

    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    const/4 v5, 0x0

    :goto_3
    const/16 v15, 0x5e

    if-eqz p3, :cond_e

    .line 319
    invoke-virtual/range {p0 .. p1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v5

    invoke-direct {v0, v1, v5, v13, v14}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    if-eqz v11, :cond_9

    .line 320
    invoke-virtual {v0, v2}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v5

    invoke-direct {v0, v5, v2, v14, v13}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    :cond_9
    if-eqz v3, :cond_d

    const/4 v5, 0x0

    .line 323
    :goto_4
    iget v12, v3, Ll/ۖ۫᩻;->ܳ:I

    if-ge v5, v12, :cond_d

    .line 324
    invoke-virtual {v3, v5}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v12

    .line 325
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/۠ܺۨ;

    invoke-interface {v13}, Ll/۠ܺۨ;->getType()I

    move-result v13

    if-eq v13, v15, :cond_a

    goto :goto_7

    .line 326
    :cond_a
    invoke-virtual {v0, v12}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v13

    if-eqz v11, :cond_c

    if-eq v13, v2, :cond_b

    goto :goto_5

    :cond_b
    const/4 v15, 0x0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v15, 0x1

    .line 327
    :goto_6
    invoke-direct {v0, v12, v13, v14, v15}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    :goto_7
    add-int/lit8 v5, v5, 0x1

    const/16 v15, 0x5e

    goto :goto_4

    .line 330
    :cond_d
    invoke-virtual/range {p0 .. p1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->᩸(I)V

    .line 331
    iget-object v3, v0, Ll/ۙۚ᩻;->ᩴ:[I

    invoke-virtual/range {p0 .. p1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v5

    aget v12, v3, v5

    add-int/2addr v12, v14

    aput v12, v3, v5

    if-eqz v11, :cond_11

    .line 332
    invoke-direct {v0, v2}, Ll/ۙۚ᩻;->᩸(I)V

    iget-object v3, v0, Ll/ۙۚ᩻;->ᩴ:[I

    aget v5, v3, v2

    sub-int/2addr v5, v14

    aput v5, v3, v2

    goto :goto_9

    .line 334
    :cond_e
    invoke-virtual/range {p0 .. p1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    if-eqz v5, :cond_f

    const/4 v13, 0x1

    goto :goto_8

    :cond_f
    const/4 v13, 0x3

    :goto_8
    invoke-direct {v0, v3, v13}, Ll/ۙۚ᩻;->ۤ(II)V

    if-eqz v11, :cond_11

    if-eqz v5, :cond_10

    const/4 v12, 0x1

    .line 335
    :cond_10
    invoke-direct {v0, v2, v12}, Ll/ۙۚ᩻;->ۤ(II)V

    :cond_11
    :goto_9
    add-int/2addr v1, v14

    const/4 v3, 0x0

    :goto_a
    if-ge v1, v2, :cond_19

    .line 340
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    if-eq v5, v10, :cond_12

    if-eq v5, v8, :cond_12

    const/16 v11, 0x57

    if-ne v5, v11, :cond_13

    :cond_12
    add-int/lit8 v3, v3, 0x1

    :cond_13
    if-eq v5, v9, :cond_14

    if-eq v5, v7, :cond_14

    if-ne v5, v6, :cond_15

    :cond_14
    add-int/lit8 v3, v3, -0x1

    :cond_15
    const/16 v11, 0x5e

    if-nez v3, :cond_18

    if-eq v5, v11, :cond_16

    const/16 v11, 0x5d

    if-ne v5, v11, :cond_18

    .line 344
    :cond_16
    invoke-virtual {v0, v1}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v5

    if-eqz p3, :cond_17

    invoke-direct {v0, v5}, Ll/ۙۚ᩻;->᩸(I)V

    goto :goto_b

    :cond_17
    invoke-direct {v0, v5}, Ll/ۙۚ᩻;->ᩴ(I)V

    :cond_18
    :goto_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_19
    return-void
.end method

.method private ۙ(IIZZ)V
    .locals 2

    .line 351
    iget-object v0, p0, Ll/ۙۚ᩻;->ۚ:Ll/ۜ᩸᩻;

    sget-object v1, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    add-int/lit8 p1, p1, 0x1

    if-gt p1, p2, :cond_4

    .line 354
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 355
    iget-object v0, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܺۨ;

    invoke-interface {v0}, Ll/۠ܺۨ;->getType()I

    move-result v0

    const/16 v1, 0x8d

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_3

    if-ne p1, p2, :cond_2

    if-eqz p4, :cond_3

    :cond_2
    const/16 p3, 0x80

    .line 356
    invoke-direct {p0, p1, p3}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_3
    const/4 p3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method private ۤ(II)V
    .locals 2

    .line 149
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v1, v0, p1

    and-int/lit8 v1, v1, -0x4

    or-int/2addr p2, v1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return-void
.end method

.method private ܳ(II)V
    .locals 2

    .line 151
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v1, v0, p1

    int-to-byte p2, p2

    or-int/2addr p2, v1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return-void
.end method

.method private ᩴ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 372
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    array-length v0, v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Ll/ۙۚ᩻;->ۙ(I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/ۙۚ᩻;->ۤ(II)V

    :cond_0
    return-void
.end method

.method private ᩴ(II)Z
    .locals 3

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    :goto_0
    if-ge p1, p2, :cond_3

    .line 283
    iget-object v1, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    .line 284
    invoke-interface {v1}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩸ۚ᩻;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 286
    :cond_0
    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v0

    const/16 v2, 0x8d

    if-ne v0, v2, :cond_1

    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0x10

    .line 287
    invoke-direct {p0, v0, v1}, Ll/ۙۚ᩻;->ܳ(II)V

    goto :goto_1

    .line 288
    :cond_1
    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/16 v0, 0x20

    .line 289
    invoke-direct {p0, p1, v0}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private ᩸(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 371
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    array-length v0, v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Ll/ۙۚ᩻;->ۤ(II)V

    :cond_0
    return-void
.end method

.method private ᩸(II)Z
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    if-ge p1, p2, :cond_2

    .line 390
    iget-object v1, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ۙ(I)I
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte p1, v0, p1

    and-int/lit8 p1, p1, 0x3

    return p1
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 18

    move-object/from16 v0, p0

    .line 49
    iget-object v1, v0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 50
    new-array v4, v2, [B

    iput-object v4, v0, Ll/ۙۚ᩻;->ۤ:[B

    .line 51
    new-array v4, v2, [I

    iput-object v4, v0, Ll/ۙۚ᩻;->ᩴ:[I

    .line 52
    new-array v2, v2, [J

    iput-object v2, v0, Ll/ۙۚ᩻;->᩸:[J

    const/4 v2, 0x0

    .line 53
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, -0x1

    if-ge v2, v4, :cond_2

    .line 54
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܺۨ;

    .line 57
    iget-object v6, v0, Ll/ۙۚ᩻;->᩸:[J

    add-int/lit8 v7, v2, 0x1

    aget-wide v8, v6, v2

    invoke-interface {v4}, Ll/۠ܺۨ;->getType()I

    move-result v2

    const/16 v10, 0x8d

    if-eq v2, v10, :cond_1

    .line 58
    invoke-interface {v4}, Ll/۠ܺۨ;->getType()I

    move-result v2

    if-ne v2, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v2

    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v4

    sub-int/2addr v2, v4

    int-to-long v4, v2

    const-wide/16 v10, 0x2

    add-long/2addr v4, v10

    goto :goto_2

    :cond_1
    :goto_1
    const-wide/16 v4, 0x0

    :goto_2
    add-long/2addr v8, v4

    aput-wide v8, v6, v7

    move v2, v7

    goto :goto_0

    .line 92
    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_3c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖ۫᩻;

    .line 93
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 155
    iget v7, v4, Ll/ۖ۫᩻;->ۚ:I

    iget v8, v4, Ll/ۖ۫᩻;->᩸:I

    iget v9, v4, Ll/ۖ۫᩻;->֫:I

    iget v10, v4, Ll/ۖ۫᩻;->ۤ:I

    const/16 v11, 0x5d

    const/16 v12, 0x48

    if-ne v10, v12, :cond_5

    if-ltz v7, :cond_5

    .line 156
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v7, v12, :cond_5

    .line 157
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۠ܺۨ;

    invoke-interface {v12}, Ll/۠ܺۨ;->getType()I

    move-result v12

    if-ne v12, v11, :cond_3

    invoke-direct {v0, v7, v5}, Ll/ۙۚ᩻;->ܳ(II)V

    goto :goto_4

    .line 159
    :cond_3
    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v11

    if-ltz v11, :cond_4

    .line 160
    invoke-direct {v0, v11, v6}, Ll/ۙۚ᩻;->ܳ(II)V

    .line 161
    :cond_4
    invoke-direct {v0, v7}, Ll/ۙۚ᩻;->᩸(I)V

    :cond_5
    :goto_4
    if-ltz v7, :cond_3b

    if-lt v9, v7, :cond_3b

    .line 164
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v9, v6, :cond_6

    goto/16 :goto_1e

    :cond_6
    const/4 v6, -0x3

    const/16 v11, 0x2b

    .line 165
    iget v12, v0, Ll/ۙۚ᩻;->ܺ:I

    const/16 v13, 0x18

    const/4 v14, 0x2

    const/4 v15, 0x3

    if-eq v10, v6, :cond_26

    const/4 v6, -0x2

    if-eq v10, v6, :cond_26

    if-eq v10, v3, :cond_1a

    if-eq v10, v14, :cond_19

    if-eq v10, v5, :cond_15

    const/16 v3, 0x9

    const/16 v5, 0x33

    if-eq v10, v3, :cond_12

    const/16 v3, 0xe

    if-eq v10, v3, :cond_15

    if-eq v10, v13, :cond_1a

    const/16 v3, 0x1e

    if-eq v10, v3, :cond_15

    const/16 v3, 0x28

    if-eq v10, v3, :cond_11

    if-eq v10, v11, :cond_11

    const/16 v3, 0x2f

    if-eq v10, v3, :cond_15

    const/16 v3, 0x39

    if-eq v10, v3, :cond_d

    const/16 v3, 0x42

    if-eq v10, v3, :cond_15

    const/16 v3, 0x44

    if-eq v10, v3, :cond_7

    const/16 v3, 0x11

    if-eq v10, v3, :cond_19

    const/16 v3, 0x12

    if-eq v10, v3, :cond_1a

    const/16 v3, 0x32

    if-eq v10, v3, :cond_15

    if-eq v10, v5, :cond_12

    const/16 v3, 0x36

    if-eq v10, v3, :cond_7

    const/16 v3, 0x37

    if-eq v10, v3, :cond_d

    const/16 v3, 0x3f

    if-eq v10, v3, :cond_19

    const/16 v3, 0x40

    if-eq v10, v3, :cond_1a

    goto/16 :goto_e

    :cond_7
    move v3, v7

    :goto_5
    if-gt v3, v9, :cond_c

    .line 210
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v6, 0x91

    if-eq v5, v6, :cond_8

    const/16 v8, 0x8f

    if-eq v5, v8, :cond_8

    const/16 v8, 0x90

    const/16 v11, 0x40

    if-ne v5, v8, :cond_9

    goto :goto_6

    :cond_8
    const/16 v8, 0x90

    const/16 v11, 0x40

    .line 212
    :goto_6
    invoke-direct {v0, v3, v11}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_9
    const/4 v13, 0x7

    if-eq v5, v13, :cond_a

    if-eq v5, v6, :cond_a

    if-ne v5, v8, :cond_b

    :cond_a
    add-int/lit8 v5, v3, 0x1

    .line 214
    invoke-direct {v0, v5, v11}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    const/4 v3, 0x0

    :goto_7
    const/16 v5, 0x40

    .line 216
    iget v6, v4, Ll/ۖ۫᩻;->ܳ:I

    if-ge v3, v6, :cond_18

    .line 217
    invoke-virtual {v4, v3}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v6

    .line 218
    invoke-direct {v0, v6, v5}, Ll/ۙۚ᩻;->ܳ(II)V

    add-int/lit8 v6, v6, 0x1

    .line 219
    invoke-direct {v0, v6, v5}, Ll/ۙۚ᩻;->ܳ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 195
    :cond_d
    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v3

    .line 197
    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->ۙ(I)I

    move-result v5

    if-eq v5, v14, :cond_10

    if-ltz v3, :cond_f

    .line 198
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v6, 0x87

    if-eq v5, v6, :cond_e

    .line 199
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v6, 0x1d

    if-eq v5, v6, :cond_e

    .line 200
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܺۨ;

    invoke-interface {v3}, Ll/۠ܺۨ;->getType()I

    move-result v3

    const/16 v5, 0x1c

    if-ne v3, v5, :cond_f

    :cond_e
    const/4 v3, 0x1

    goto :goto_8

    :cond_f
    const/4 v3, 0x3

    .line 198
    :goto_8
    invoke-direct {v0, v7, v3}, Ll/ۙۚ᩻;->ۤ(II)V

    .line 202
    :cond_10
    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v3, v15}, Ll/ۙۚ᩻;->ۤ(II)V

    .line 203
    invoke-direct {v0, v9, v15}, Ll/ۙۚ᩻;->ۤ(II)V

    .line 205
    iget-boolean v3, v4, Ll/ۖ۫᩻;->۫:Z

    if-eqz v3, :cond_18

    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v9, v3}, Ll/ۙۚ᩻;->ᩴ(II)Z

    goto :goto_e

    .line 190
    :cond_11
    invoke-direct {v0, v7}, Ll/ۙۚ᩻;->ᩴ(I)V

    .line 191
    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->ᩴ(I)V

    add-int/lit8 v3, v7, 0x1

    :goto_9
    if-gt v3, v9, :cond_18

    .line 192
    invoke-direct {v0, v3, v15}, Ll/ۙۚ᩻;->ۤ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_12
    if-eq v10, v5, :cond_14

    .line 373
    iget-object v3, v0, Ll/ۙۚ᩻;->᩸:[J

    add-int/lit8 v5, v9, 0x1

    aget-wide v5, v3, v5

    aget-wide v16, v3, v7

    sub-long v5, v5, v16

    .line 168
    div-int/lit8 v3, v12, 0x2

    int-to-long v14, v3

    cmp-long v3, v5, v14

    if-gtz v3, :cond_14

    invoke-direct {v0, v7, v9}, Ll/ۙۚ᩻;->᩸(II)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_a

    :cond_13
    const/4 v3, 0x0

    goto :goto_b

    :cond_14
    :goto_a
    const/4 v3, 0x1

    .line 167
    :goto_b
    invoke-direct {v0, v7, v9, v3, v4}, Ll/ۙۚ᩻;->ۙ(IIZLl/ۖ۫᩻;)V

    goto :goto_e

    .line 373
    :cond_15
    iget-object v3, v0, Ll/ۙۚ᩻;->᩸:[J

    add-int/lit8 v5, v9, 0x1

    aget-wide v5, v3, v5

    aget-wide v14, v3, v7

    sub-long/2addr v5, v14

    int-to-long v14, v12

    cmp-long v3, v5, v14

    if-gtz v3, :cond_17

    .line 170
    invoke-direct {v0, v7, v9}, Ll/ۙۚ᩻;->᩸(II)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_c

    :cond_16
    const/4 v3, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v3, 0x1

    :goto_d
    invoke-direct {v0, v7, v9, v3, v4}, Ll/ۙۚ᩻;->ۙ(IIZLl/ۖ۫᩻;)V

    :cond_18
    :goto_e
    const/4 v3, 0x2

    goto/16 :goto_18

    :cond_19
    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v6, v3

    const/4 v3, 0x2

    goto/16 :goto_17

    .line 172
    :cond_1a
    invoke-direct {v0, v7}, Ll/ۙۚ᩻;->᩸(I)V

    const/4 v3, 0x1

    if-ne v10, v3, :cond_1b

    const/4 v3, -0x1

    if-eq v8, v3, :cond_1b

    if-eqz v8, :cond_1b

    const/4 v3, 0x2

    if-eq v8, v3, :cond_1c

    const/16 v5, 0x18

    if-ne v8, v5, :cond_1e

    goto :goto_f

    :cond_1b
    const/4 v3, 0x2

    .line 176
    :cond_1c
    :goto_f
    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v5

    if-ltz v5, :cond_1d

    .line 177
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܺۨ;

    invoke-interface {v6}, Ll/۠ܺۨ;->getType()I

    move-result v6

    const/16 v11, 0x5b

    if-eq v6, v11, :cond_1d

    .line 178
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܺۨ;

    invoke-interface {v6}, Ll/۠ܺۨ;->getType()I

    move-result v6

    const/16 v11, 0x5f

    if-eq v6, v11, :cond_1d

    const/4 v6, 0x1

    goto :goto_10

    :cond_1d
    const/4 v6, 0x0

    :goto_10
    const/4 v11, 0x1

    .line 179
    invoke-direct {v0, v5, v7, v6, v11}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    :cond_1e
    const/4 v5, 0x1

    if-ne v10, v5, :cond_25

    const/16 v5, 0x15

    if-eq v8, v5, :cond_20

    const/16 v5, 0x16

    if-ne v8, v5, :cond_1f

    goto :goto_12

    :cond_1f
    :goto_11
    const/4 v5, 0x1

    goto :goto_16

    :cond_20
    :goto_12
    const/16 v5, 0x5d

    .line 182
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    if-ltz v5, :cond_21

    const/4 v5, 0x1

    goto :goto_13

    :cond_21
    const/4 v5, 0x0

    .line 183
    :goto_13
    iget-boolean v6, v4, Ll/ۖ۫᩻;->ۙ:Z

    if-nez v6, :cond_23

    if-eqz v5, :cond_22

    goto :goto_14

    .line 184
    :cond_22
    iget-object v5, v0, Ll/ۙۚ᩻;->ᩴ:[I

    aget v6, v5, v7

    const/4 v11, 0x1

    add-int/2addr v6, v11

    aput v6, v5, v7

    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v6

    aget v14, v5, v6

    sub-int/2addr v14, v11

    aput v14, v5, v6

    goto :goto_11

    :cond_23
    :goto_14
    const/4 v6, 0x1

    if-eqz v5, :cond_24

    const/4 v5, 0x3

    goto :goto_15

    :cond_24
    const/4 v5, 0x1

    .line 183
    :goto_15
    invoke-direct {v0, v7, v5}, Ll/ۙۚ᩻;->ۤ(II)V

    goto :goto_11

    :cond_25
    :goto_16
    if-ne v10, v5, :cond_27

    if-ne v8, v5, :cond_27

    .line 187
    invoke-direct {v0, v7, v5}, Ll/ۙۚ᩻;->ۤ(II)V

    goto :goto_18

    :cond_26
    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 166
    :goto_17
    invoke-direct {v0, v7, v9, v5, v6}, Ll/ۙۚ᩻;->ۙ(IIZLl/ۖ۫᩻;)V

    :cond_27
    :goto_18
    const/16 v5, 0x29

    if-eq v10, v5, :cond_28

    const/16 v5, 0x3a

    if-ne v10, v5, :cond_29

    :cond_28
    const/4 v5, 0x0

    .line 224
    :goto_19
    iget v6, v4, Ll/ۖ۫᩻;->ܳ:I

    if-ge v5, v6, :cond_29

    .line 225
    invoke-virtual {v4, v5}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v6

    invoke-direct {v0, v6}, Ll/ۙۚ᩻;->ᩴ(I)V

    .line 226
    invoke-virtual {v4, v5}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v6

    invoke-direct {v0, v6}, Ll/ۙۚ᩻;->ᩴ(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_19

    :cond_29
    const/16 v5, 0xf

    if-eq v10, v5, :cond_2a

    const/16 v5, 0x40

    if-eq v10, v5, :cond_2a

    const/16 v5, 0x12

    if-eq v10, v5, :cond_2a

    const/16 v5, 0x43

    if-ne v10, v5, :cond_2b

    :cond_2a
    const/4 v5, 0x0

    .line 230
    :goto_1a
    iget v6, v4, Ll/ۖ۫᩻;->ܳ:I

    if-ge v5, v6, :cond_2b

    invoke-virtual {v4, v5}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v6

    const/4 v8, 0x3

    invoke-direct {v0, v6, v8}, Ll/ۙۚ᩻;->ۤ(II)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    :cond_2b
    const/16 v5, 0x22

    if-ne v10, v5, :cond_2c

    const/16 v5, 0x2b

    .line 232
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    if-ltz v5, :cond_2c

    const/16 v5, 0x5b

    .line 233
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    const/16 v6, 0x5c

    invoke-virtual {v4, v6, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v6

    if-ltz v5, :cond_2c

    if-ltz v6, :cond_2c

    const/4 v8, 0x1

    .line 234
    invoke-direct {v0, v5, v6, v8, v4}, Ll/ۙۚ᩻;->ۙ(IIZLl/ۖ۫᩻;)V

    :cond_2c
    const/16 v5, 0x3b

    if-eq v10, v5, :cond_2d

    const/16 v5, 0x3c

    if-ne v10, v5, :cond_30

    .line 373
    :cond_2d
    iget-object v5, v0, Ll/ۙۚ᩻;->᩸:[J

    add-int/lit8 v6, v9, 0x1

    aget-wide v13, v5, v6

    aget-wide v6, v5, v7

    sub-long/2addr v13, v6

    int-to-long v5, v12

    cmp-long v7, v13, v5

    if-lez v7, :cond_30

    const/4 v5, -0x1

    const/4 v6, 0x0

    .line 238
    :goto_1b
    iget v7, v4, Ll/ۖ۫᩻;->ܳ:I

    if-ge v6, v7, :cond_2f

    .line 239
    invoke-virtual {v4, v6}, Ll/ۖ۫᩻;->ۙ(I)I

    move-result v7

    if-ltz v7, :cond_2e

    .line 240
    invoke-direct {v0, v7}, Ll/ۙۚ᩻;->᩸(I)V

    if-gez v5, :cond_2e

    move v5, v7

    :cond_2e
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    :cond_2f
    if-ltz v5, :cond_30

    .line 242
    iget-object v6, v0, Ll/ۙۚ᩻;->ᩴ:[I

    aget v7, v6, v5

    add-int/lit8 v7, v7, 0x1

    aput v7, v6, v5

    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v5

    aget v7, v6, v5

    add-int/lit8 v7, v7, -0x1

    aput v7, v6, v5

    :cond_30
    const/16 v5, 0x15

    if-ne v10, v5, :cond_32

    const/16 v5, 0x12

    .line 245
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    if-ltz v5, :cond_32

    .line 246
    invoke-virtual {v0, v5}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܺۨ;

    invoke-interface {v6}, Ll/۠ܺۨ;->getType()I

    move-result v6

    const/16 v7, 0x5c

    if-ne v6, v7, :cond_31

    const/4 v14, 0x1

    goto :goto_1c

    :cond_31
    const/4 v14, 0x2

    :goto_1c
    invoke-direct {v0, v5, v14}, Ll/ۙۚ᩻;->ۤ(II)V

    :cond_32
    const/16 v3, 0x19

    if-ne v10, v3, :cond_34

    const/16 v3, 0xa

    .line 249
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v3

    const/16 v5, 0x15

    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    if-ltz v3, :cond_33

    .line 250
    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->ᩴ(I)V

    :cond_33
    if-ltz v5, :cond_34

    .line 251
    invoke-direct {v0, v5}, Ll/ۙۚ᩻;->ᩴ(I)V

    :cond_34
    const/16 v3, 0x14

    if-ne v10, v3, :cond_35

    .line 253
    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->᩸(I)V

    :cond_35
    const/16 v3, 0x17

    if-ne v10, v3, :cond_37

    const/16 v3, 0x5b

    .line 255
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v3

    const/16 v5, 0x5c

    invoke-virtual {v4, v5, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v5

    if-ltz v3, :cond_37

    if-gez v5, :cond_36

    move v5, v9

    :cond_36
    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 256
    invoke-direct {v0, v3, v5, v7, v6}, Ll/ۙۚ᩻;->ۙ(IIZLl/ۖ۫᩻;)V

    goto :goto_1d

    :cond_37
    const/4 v7, 0x1

    :goto_1d
    const/16 v3, 0x18

    if-ne v10, v3, :cond_38

    .line 258
    iget v3, v4, Ll/ۖ۫᩻;->᩷:I

    if-ltz v3, :cond_38

    .line 259
    iget-object v5, v0, Ll/ۙۚ᩻;->ᩴ:[I

    aget v6, v5, v3

    add-int/2addr v6, v7

    aput v6, v5, v3

    .line 260
    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    aget v6, v5, v3

    sub-int/2addr v6, v7

    aput v6, v5, v3

    :cond_38
    const/16 v3, 0x16

    if-ne v10, v3, :cond_39

    const/16 v3, 0x11

    .line 262
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_39

    const/16 v3, 0x26

    .line 263
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫᩻;->ۙ(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_39

    .line 264
    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->ᩴ(I)V

    :cond_39
    const/16 v3, 0x48

    if-eq v10, v3, :cond_3a

    const/16 v3, 0x41

    if-ne v10, v3, :cond_3b

    .line 266
    :cond_3a
    invoke-virtual {v0, v9}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/ۙۚ᩻;->᩸(I)V

    :cond_3b
    :goto_1e
    const/4 v3, 0x1

    goto/16 :goto_3

    .line 96
    :cond_3c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    .line 97
    invoke-virtual {v0, v2}, Ll/ۙۚ᩻;->ۤ(I)I

    move-result v3

    if-ltz v3, :cond_3d

    const/4 v4, 0x1

    goto :goto_1f

    :cond_3d
    const/4 v4, 0x0

    :goto_1f
    const/4 v7, 0x0

    .line 98
    invoke-direct {v0, v3, v2, v4, v7}, Ll/ۙۚ᩻;->ۙ(IIZZ)V

    .line 99
    iget-object v2, v0, Ll/ۙۚ᩻;->ۚ:Ll/ۜ᩸᩻;

    sget-object v3, Ll/ۜ᩸᩻;->֡:Ll/ۜ᩸᩻;

    const/4 v4, -0x5

    if-ne v2, v3, :cond_40

    .line 100
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3e
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_40

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ۫᩻;

    .line 101
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 102
    iget v7, v3, Ll/ۖ۫᩻;->ۤ:I

    const/16 v8, 0x3a

    if-ne v7, v8, :cond_3e

    iget v7, v3, Ll/ۖ۫᩻;->᩸:I

    const/16 v8, 0x2a

    if-ne v7, v8, :cond_3e

    iget v7, v3, Ll/ۖ۫᩻;->ۚ:I

    if-ltz v7, :cond_3e

    iget v8, v3, Ll/ۖ۫᩻;->֫:I

    if-lt v8, v7, :cond_3e

    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lt v8, v7, :cond_3f

    goto :goto_20

    .line 104
    :cond_3f
    iget v7, v3, Ll/ۖ۫᩻;->֫:I

    invoke-virtual {v0, v7}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v7

    .line 106
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۠ܺۨ;

    invoke-interface {v8}, Ll/۠ܺۨ;->getType()I

    move-result v8

    const/16 v9, 0x73

    if-ne v8, v9, :cond_3e

    iget v8, v3, Ll/ۖ۫᩻;->֫:I

    invoke-direct {v0, v8, v7}, Ll/ۙۚ᩻;->ᩴ(II)Z

    move-result v7

    if-eqz v7, :cond_3e

    .line 107
    iget v3, v3, Ll/ۖ۫᩻;->֫:I

    .line 152
    iget-object v7, v0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v8, v7, v3

    int-to-byte v9, v4

    and-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, v7, v3

    goto :goto_20

    :cond_40
    const/4 v2, 0x0

    .line 111
    :goto_21
    iget-object v3, v0, Ll/ۙۚ᩻;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v8, v0, Ll/ۙۚ᩻;->֫:Ljava/util/ArrayList;

    const/16 v9, 0x10

    if-ge v2, v7, :cond_44

    .line 112
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺۨ;

    .line 322
    iget-object v7, v3, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 113
    invoke-interface {v7}, Ll/۠ܺۨ;->ۤ()I

    move-result v7

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 328
    iget-object v3, v3, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    if-nez v3, :cond_41

    .line 114
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_22

    :cond_41
    invoke-interface {v3}, Ll/۠ܺۨ;->ۤ()I

    move-result v3

    :goto_22
    move v8, v7

    .line 116
    :goto_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v11, v3, 0x1

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-gt v8, v10, :cond_42

    invoke-direct {v0, v8, v9}, Ll/ۙۚ᩻;->ܳ(II)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_23

    :cond_42
    add-int/lit8 v7, v7, -0x1

    const/4 v8, 0x0

    .line 117
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    :goto_24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-gt v7, v8, :cond_43

    .line 152
    iget-object v8, v0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v9, v8, v7

    int-to-byte v10, v4

    and-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_24

    :cond_43
    add-int/lit8 v2, v2, 0x1

    goto :goto_21

    :cond_44
    const/4 v2, 0x0

    .line 119
    :goto_25
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_4b

    .line 120
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܺۨ;

    invoke-interface {v7}, Ll/۠ܺۨ;->getType()I

    move-result v7

    const/16 v10, 0x91

    if-eq v7, v10, :cond_45

    const/16 v11, 0x8f

    const/16 v12, 0x90

    if-eq v7, v11, :cond_46

    const/16 v11, 0x40

    if-ne v7, v12, :cond_47

    goto :goto_26

    :cond_45
    const/16 v12, 0x90

    :cond_46
    const/16 v11, 0x40

    .line 123
    :goto_26
    invoke-direct {v0, v2, v11}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_47
    const/4 v13, 0x7

    if-eq v7, v10, :cond_48

    if-eq v7, v13, :cond_48

    if-ne v7, v12, :cond_49

    :cond_48
    add-int/lit8 v10, v2, 0x1

    .line 125
    invoke-direct {v0, v10, v11}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_49
    const/16 v10, 0x8e

    if-ne v7, v10, :cond_4a

    .line 127
    invoke-direct {v0, v2, v9}, Ll/ۙۚ᩻;->ܳ(II)V

    add-int/lit8 v7, v2, 0x1

    .line 128
    invoke-direct {v0, v7, v9}, Ll/ۙۚ᩻;->ܳ(II)V

    :cond_4a
    add-int/lit8 v2, v2, 0x1

    goto :goto_25

    :cond_4b
    const/4 v2, 0x0

    .line 131
    :goto_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_52

    .line 132
    invoke-static {}, Ll/ۜ۫᩻;->ۤ()V

    .line 133
    invoke-virtual {v0, v2, v6}, Ll/ۙۚ᩻;->ۙ(II)Z

    move-result v7

    if-nez v7, :cond_4c

    invoke-virtual {v0, v2, v5}, Ll/ۙۚ᩻;->ۙ(II)Z

    move-result v7

    if-nez v7, :cond_4c

    goto :goto_2b

    .line 134
    :cond_4c
    invoke-virtual {v0, v2}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v7

    .line 135
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۠ܺۨ;

    invoke-interface {v10}, Ll/۠ܺۨ;->getType()I

    move-result v10

    const/16 v11, 0x5c

    const/4 v12, -0x1

    if-eq v10, v11, :cond_4e

    if-ne v10, v12, :cond_4d

    goto :goto_28

    :cond_4d
    const/4 v10, 0x0

    goto :goto_29

    :cond_4e
    :goto_28
    const/4 v10, 0x1

    :goto_29
    move v11, v2

    :goto_2a
    if-eqz v10, :cond_4f

    if-gt v11, v7, :cond_4f

    .line 138
    invoke-virtual {v0, v11, v9}, Ll/ۙۚ᩻;->ۙ(II)Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_2a

    :cond_4f
    if-nez v10, :cond_50

    .line 152
    iget-object v7, v0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v11, v7, v2

    const/16 v12, -0x9

    int-to-byte v12, v12

    and-int/2addr v11, v12

    int-to-byte v11, v11

    aput-byte v11, v7, v2

    :cond_50
    if-eqz v10, :cond_51

    iget-object v7, v0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte v10, v7, v2

    int-to-byte v11, v4

    and-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v7, v2

    :cond_51
    :goto_2b
    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_52
    const/4 v1, 0x0

    .line 143
    iput-object v1, v0, Ll/ۙۚ᩻;->᩸:[J

    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 145
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ۙ(Ll/ۡܺۨ;Ljava/lang/Object;IILjava/lang/String;Ll/ۢܺۨ;)V
    .locals 2

    .line 65
    iget-boolean p3, p0, Ll/ۙۚ᩻;->ۙ:Z

    iget-object p4, p0, Ll/ۙۚ᩻;->֫:Ljava/util/ArrayList;

    iget-object p5, p0, Ll/ۙۚ᩻;->᩷:Ljava/util/ArrayList;

    if-eqz p3, :cond_0

    instance-of p3, p2, Ll/۠ܺۨ;

    if-eqz p3, :cond_0

    move-object p3, p2

    check-cast p3, Ll/۠ܺۨ;

    invoke-interface {p3}, Ll/۠ܺۨ;->ۤ()I

    move-result p6

    iget v0, p0, Ll/ۙۚ᩻;->۫:I

    if-le p6, v0, :cond_0

    .line 67
    invoke-interface {p3}, Ll/۠ܺۨ;->ۤ()I

    move-result p3

    iput p3, p0, Ll/ۙۚ᩻;->۫:I

    .line 68
    invoke-virtual {p5}, Ljava/util/ArrayList;->clear()V

    .line 69
    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    .line 71
    :cond_0
    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/16 p6, 0x40

    if-ge p3, p6, :cond_6

    .line 72
    check-cast p1, Ll/ۧ۫᩻;

    invoke-virtual {p1}, Ll/֡ܺۨ;->ܽ()Ll/۟ܺۨ;

    move-result-object p1

    move-object p3, p1

    :goto_0
    if-eqz p1, :cond_2

    .line 77
    instance-of p3, p1, Ll/ۛܳ᩻;

    if-nez p3, :cond_3

    instance-of p3, p1, Ll/᩺ᩴ᩻;

    if-nez p3, :cond_3

    instance-of p3, p1, Ll/ۖܳ᩻;

    if-eqz p3, :cond_1

    goto :goto_1

    .line 115
    :cond_1
    iget-object p3, p1, Ll/ۖܺۨ;->᩷:Ll/۟ܺۨ;

    move-object v1, p3

    move-object p3, p1

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p3

    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    .line 83
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object p1, p0, Ll/ۙۚ᩻;->ۚ:Ll/ۜ᩸᩻;

    sget-object p3, Ll/ۜ᩸᩻;->ܿ:Ll/ۜ᩸᩻;

    const/4 p5, -0x1

    if-ne p1, p3, :cond_4

    instance-of p1, p2, Ll/۠ܺۨ;

    if-eqz p1, :cond_4

    .line 85
    check-cast p2, Ll/۠ܺۨ;

    .line 86
    invoke-interface {p2}, Ll/۠ܺۨ;->getType()I

    move-result p1

    if-ne p1, p5, :cond_4

    invoke-interface {p2}, Ll/۠ܺۨ;->ۤ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 85
    :goto_2
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-void

    .line 71
    :cond_6
    new-instance p1, Ll/۬۫᩻;

    .line 396
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 71
    throw p1
.end method

.method public final ۙ(Ll/ܰ۫᩻;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 272
    :goto_0
    iget-object v1, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 273
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    .line 274
    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v2

    const/16 v3, 0x2c

    if-ne v2, v3, :cond_2

    invoke-interface {v1}, Ll/۠ܺۨ;->᩸()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ܰ۫᩻;->᩷(I)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 275
    :cond_1
    invoke-virtual {p0, v0}, Ll/ۙۚ᩻;->᩷(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/ۙۚ᩻;->ᩴ(II)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ۙ(II)Z
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ۙۚ᩻;->ۤ:[B

    aget-byte p1, v0, p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ(I)I
    .locals 1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 367
    iget-object v0, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܺۨ;

    invoke-interface {v0}, Ll/۠ܺۨ;->᩷()I

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return p1
.end method

.method public final ᩷(I)I
    .locals 2

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 362
    iget-object v0, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    invoke-interface {v1}, Ll/۠ܺۨ;->᩷()I

    move-result v1

    if-nez v1, :cond_0

    .line 363
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final ᩷(II)Z
    .locals 4

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    if-ge p1, p2, :cond_3

    .line 377
    iget-object v1, p0, Ll/ۙۚ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    .line 378
    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 380
    :cond_0
    invoke-interface {v1}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "@ts-"

    .line 381
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "#__PURE__"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "@__PURE__"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "sourceURL="

    .line 382
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "sourceMappingURL="

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "eslint"

    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "prettier"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "istanbul"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
