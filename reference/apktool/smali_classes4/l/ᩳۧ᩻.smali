.class public final Ll/ᩳۧ᩻;
.super Ljava/lang/Object;
.source "H6OO"


# instance fields
.field public final ֫:[Z

.field public final ۙ:[Ll/۟ۧ᩻;

.field public final ۚ:Ll/ۤ᩻ᩴ;

.field public final ۤ:[I

.field public final ۧ:I

.field public final ۫:[Ll/۟ۧ᩻;

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:[I

.field public final ᩴ:[Z

.field public ᩷:I

.field public final ᩸:Ljava/lang/String;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;ZILl/ۤ᩻ᩴ;)V
    .locals 3

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p2, p0, Ll/ᩳۧ᩻;->᩻:Ljava/util/List;

    const/4 v0, 0x1

    .line 106
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Ll/ᩳۧ᩻;->ۧ:I

    if-eqz p3, :cond_0

    const-string p3, "\t"

    goto :goto_0

    :cond_0
    const/16 p3, 0x20

    .line 107
    invoke-static {p3, p4}, Ll/᩺ۨۨ;->ۙ(CI)Ljava/lang/String;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Ll/ᩳۧ᩻;->᩸:Ljava/lang/String;

    const/4 p3, 0x0

    .line 355
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    const-string v1, "\n"

    if-ge p3, p4, :cond_4

    .line 356
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    const/16 v2, 0xa

    if-ne p4, v2, :cond_1

    goto :goto_2

    :cond_1
    const/16 v1, 0xd

    if-ne p4, v1, :cond_3

    add-int/2addr p3, v0

    .line 358
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ge p3, p4, :cond_2

    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, v2, :cond_2

    const-string v1, "\r\n"

    goto :goto_2

    :cond_2
    const-string v1, "\r"

    goto :goto_2

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 108
    :cond_4
    :goto_2
    iput-object v1, p0, Ll/ᩳۧ᩻;->ܳ:Ljava/lang/String;

    .line 109
    iput-object p5, p0, Ll/ᩳۧ᩻;->ۚ:Ll/ۤ᩻ᩴ;

    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/۟ۧ᩻;

    iput-object p1, p0, Ll/ᩳۧ᩻;->۫:[Ll/۟ۧ᩻;

    .line 111
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/۟ۧ᩻;

    iput-object p1, p0, Ll/ᩳۧ᩻;->ۙ:[Ll/۟ۧ᩻;

    .line 112
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ᩳۧ᩻;->ᩴ:[Z

    .line 113
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ᩳۧ᩻;->֫:[Z

    .line 114
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ᩳۧ᩻;->ۤ:[I

    .line 115
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/2addr p1, v0

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ᩳۧ᩻;->ܺ:[I

    return-void
.end method

.method public static ۙ()V
    .locals 1

    .line 377
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method private ۙ(Ljava/lang/CharSequence;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 249
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 255
    :goto_0
    iget-object v9, v0, Ll/ᩳۧ᩻;->᩻:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    iget-object v11, v0, Ll/ᩳۧ᩻;->ܳ:Ljava/lang/String;

    const/16 v12, 0xd

    const/16 v13, 0xa

    iget-object v14, v0, Ll/ᩳۧ᩻;->ۚ:Ll/ۤ᩻ᩴ;

    if-ge v3, v10, :cond_1d

    .line 256
    invoke-static {}, Ll/ᩳۧ᩻;->ۙ()V

    .line 257
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܺۨ;

    .line 258
    invoke-interface {v9}, Ll/۠ܺۨ;->getType()I

    move-result v10

    const/4 v15, -0x1

    if-ne v10, v15, :cond_0

    goto/16 :goto_10

    :cond_0
    const/16 v15, 0x35

    if-ne v10, v15, :cond_1

    goto/16 :goto_f

    :cond_1
    const/16 v15, 0x40

    if-ne v10, v15, :cond_5

    .line 263
    invoke-interface {v9}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 365
    :goto_1
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v10, v14, :cond_4

    .line 366
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-eq v14, v13, :cond_2

    if-ne v14, v12, :cond_3

    add-int/lit8 v14, v10, 0x1

    .line 367
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v15

    if-eq v14, v15, :cond_2

    invoke-virtual {v9, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-eq v14, v13, :cond_3

    :cond_2
    add-int/lit8 v11, v11, 0x1

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_4
    add-int/2addr v5, v11

    goto/16 :goto_f

    .line 266
    :cond_5
    iget-object v12, v0, Ll/ᩳۧ᩻;->ۙ:[Ll/۟ۧ᩻;

    aget-object v12, v12, v3

    if-eqz v12, :cond_6

    .line 268
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 269
    iget v8, v12, Ll/۟ۧ᩻;->᩸:I

    .line 271
    :cond_6
    iget-object v13, v0, Ll/ᩳۧ᩻;->ᩴ:[Z

    aget-boolean v15, v13, v3

    const/16 v1, 0x36

    if-eqz v15, :cond_7

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_7

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۟ۧ᩻;

    iget-boolean v15, v15, Ll/۟ۧ᩻;->ᩴ:Z

    if-eqz v15, :cond_7

    if-eq v4, v1, :cond_7

    const/16 v1, 0x3d

    if-eq v4, v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    if-nez v6, :cond_9

    if-nez v7, :cond_9

    if-nez v1, :cond_9

    if-eqz v12, :cond_8

    .line 273
    iget-boolean v15, v12, Ll/۟ۧ᩻;->ᩴ:Z

    if-eqz v15, :cond_8

    goto :goto_3

    :cond_8
    const/4 v15, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v15, 0x1

    :goto_4
    move/from16 v16, v15

    const/16 v15, 0x41

    if-ne v10, v15, :cond_c

    if-nez v6, :cond_b

    if-lez v5, :cond_a

    goto :goto_5

    :cond_a
    const/4 v15, 0x0

    goto :goto_6

    :cond_b
    :goto_5
    const/4 v15, 0x1

    goto :goto_6

    :cond_c
    move/from16 v15, v16

    :goto_6
    move-object/from16 v16, v9

    .line 279
    iget-object v9, v0, Ll/ᩳۧ᩻;->ܺ:[I

    if-nez v15, :cond_d

    move/from16 v17, v15

    iget-object v15, v0, Ll/ᩳۧ᩻;->ۤ:[I

    aget v15, v15, v3

    move-object/from16 v18, v11

    if-eqz v15, :cond_e

    iget v11, v0, Ll/ᩳۧ᩻;->᩷:I

    aget v15, v9, v15

    add-int/2addr v11, v15

    aget v15, v9, v3

    sub-int/2addr v11, v15

    const/16 v15, 0x78

    if-le v11, v15, :cond_e

    add-int/lit8 v11, v8, 0x1

    const/4 v15, 0x1

    goto :goto_7

    :cond_d
    move-object/from16 v18, v11

    move/from16 v17, v15

    :cond_e
    move v11, v8

    move/from16 v15, v17

    :goto_7
    if-eqz v15, :cond_13

    if-nez v12, :cond_10

    if-nez v7, :cond_10

    if-nez v1, :cond_f

    const/16 v1, 0x41

    if-eq v10, v1, :cond_f

    if-eqz v6, :cond_10

    .line 286
    aget-boolean v1, v13, v3

    if-nez v1, :cond_f

    .line 287
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_10

    :cond_f
    if-eqz v4, :cond_10

    .line 288
    invoke-static {v4}, Ll/ᩳۧ᩻;->ۙ(I)Z

    move-result v1

    if-nez v1, :cond_10

    const/16 v1, 0x36

    if-eq v4, v1, :cond_10

    const/16 v1, 0x3d

    if-eq v4, v1, :cond_10

    const/16 v1, 0x3e

    if-eq v4, v1, :cond_10

    const/16 v1, 0x3f

    if-eq v4, v1, :cond_10

    const/4 v1, 0x2

    if-lt v5, v1, :cond_10

    goto :goto_8

    :cond_10
    const/4 v1, 0x1

    .line 329
    :goto_8
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_11

    goto :goto_a

    :cond_11
    const/4 v4, 0x0

    :goto_9
    if-ge v4, v1, :cond_12

    move-object/from16 v5, v18

    .line 330
    invoke-virtual {v14, v5}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    .line 331
    iput v1, v0, Ll/ᩳۧ᩻;->᩷:I

    goto :goto_a

    .line 292
    :cond_13
    iget v1, v0, Ll/ᩳۧ᩻;->᩷:I

    if-lez v1, :cond_16

    .line 293
    invoke-direct {v0, v4, v3}, Ll/ᩳۧ᩻;->ۙ(II)Z

    move-result v1

    if-eqz v1, :cond_14

    const/16 v1, 0x2c

    .line 294
    invoke-virtual {v14, v1}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    .line 295
    iget v1, v0, Ll/ᩳۧ᩻;->᩷:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/ᩳۧ᩻;->᩷:I

    :cond_14
    const/16 v1, 0x41

    if-eq v10, v1, :cond_15

    .line 297
    invoke-static {v4, v10}, Ll/ᩳۧ᩻;->᩷(II)Z

    move-result v1

    if-eqz v1, :cond_16

    :cond_15
    const/16 v1, 0x20

    .line 298
    invoke-virtual {v14, v1}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    .line 299
    iget v1, v0, Ll/ᩳۧ᩻;->᩷:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/ᩳۧ᩻;->᩷:I

    .line 302
    :cond_16
    :goto_a
    iget v1, v0, Ll/ᩳۧ᩻;->᩷:I

    if-nez v1, :cond_18

    const/4 v1, 0x0

    :goto_b
    if-ge v1, v11, :cond_17

    .line 303
    iget-object v4, v0, Ll/ᩳۧ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v14, v4}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    .line 304
    :cond_17
    iget v1, v0, Ll/ᩳۧ᩻;->ۧ:I

    mul-int v11, v11, v1

    iput v11, v0, Ll/ᩳۧ᩻;->᩷:I

    .line 306
    :cond_18
    invoke-interface/range {v16 .. v16}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 307
    iget v1, v0, Ll/ᩳۧ᩻;->᩷:I

    invoke-interface/range {v16 .. v16}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v1

    iput v4, v0, Ll/ᩳۧ᩻;->᩷:I

    .line 308
    iget-object v1, v0, Ll/ᩳۧ᩻;->۫:[Ll/۟ۧ᩻;

    aget-object v1, v1, v3

    if-eqz v1, :cond_1b

    .line 311
    iput v8, v1, Ll/۟ۧ᩻;->᩸:I

    .line 312
    iget-boolean v5, v1, Ll/۟ۧ᩻;->ۤ:Z

    if-eqz v5, :cond_1a

    iget-boolean v5, v1, Ll/۟ۧ᩻;->᩷:Z

    if-nez v5, :cond_19

    iget v5, v1, Ll/۟ۧ᩻;->ۙ:I

    add-int/lit8 v5, v5, 0x1

    aget v5, v9, v5

    add-int/2addr v4, v5

    add-int/lit8 v5, v3, 0x1

    aget v5, v9, v5

    sub-int/2addr v4, v5

    const/16 v5, 0x78

    if-le v4, v5, :cond_1a

    :cond_19
    const/4 v4, 0x1

    goto :goto_c

    :cond_1a
    const/4 v4, 0x0

    :goto_c
    iput-boolean v4, v1, Ll/۟ۧ᩻;->ᩴ:Z

    .line 314
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 315
    iget-boolean v1, v1, Ll/۟ۧ᩻;->ᩴ:Z

    if-eqz v1, :cond_1b

    add-int/lit8 v8, v8, 0x1

    const/4 v1, 0x1

    goto :goto_d

    :cond_1b
    const/4 v1, 0x0

    :goto_d
    const/16 v4, 0x41

    if-ne v10, v4, :cond_1c

    const/4 v4, 0x1

    goto :goto_e

    :cond_1c
    const/4 v4, 0x0

    :goto_e
    const/4 v5, 0x0

    move v7, v1

    move v6, v4

    move v4, v10

    :goto_f
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_1d
    :goto_10
    move-object v5, v11

    if-eqz v4, :cond_1f

    .line 324
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-eq v1, v13, :cond_1e

    .line 325
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v12, :cond_1f

    :cond_1e
    invoke-virtual {v14, v5}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_1f
    return-void
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZILl/ۤ᩻ᩴ;)V
    .locals 12

    .line 65
    invoke-static {}, Ll/ᩳۧ᩻;->ۙ()V

    .line 68
    :try_start_0
    new-instance v0, Ll/ܺܺۨ;

    new-instance v1, Ll/ܽ᩸᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p0, v1}, Ll/ܺܺۨ;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ll/۟ۚ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    new-instance v1, Ll/ۢۧ᩻;

    invoke-direct {v1, v0}, Ll/ۢۧ᩻;-><init>(Ll/ܺܺۨ;)V

    .line 73
    new-instance v0, Ll/֡ۧ᩻;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 80
    invoke-virtual {v1}, Ll/ۡܺۨ;->ۧ()V

    .line 81
    invoke-virtual {v1, v0}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 82
    new-instance v2, Ll/ۗܺۨ;

    invoke-direct {v2, v1}, Ll/ۗܺۨ;-><init>(Ll/ܰܺۨ;)V

    .line 83
    invoke-virtual {v2}, Ll/ۗܺۨ;->ۤ()V

    .line 84
    new-instance v1, Ll/ᩳۧ᩻;

    invoke-virtual {v2}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object v9

    move-object v3, v1

    move-object v4, p0

    move-object v5, v9

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Ll/ᩳۧ᩻;-><init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;ZILl/ۤ᩻ᩴ;)V

    const/4 p1, 0x1

    .line 85
    invoke-virtual {v2, p1}, Ll/ۗܺۨ;->᩷(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    .line 87
    invoke-direct {v1, p0}, Ll/ᩳۧ᩻;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 120
    :cond_0
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, -0x1

    .line 122
    :goto_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v6, 0x35

    const/16 v7, 0x40

    iget-object v8, v1, Ll/ᩳۧ᩻;->ۙ:[Ll/۟ۧ᩻;

    iget-object v10, v1, Ll/ᩳۧ᩻;->۫:[Ll/۟ۧ᩻;

    if-ge v3, v5, :cond_e

    .line 123
    invoke-static {}, Ll/ᩳۧ᩻;->ۙ()V

    .line 124
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    .line 125
    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v11

    if-eq v11, v7, :cond_d

    if-eq v11, v6, :cond_d

    if-ne v11, p3, :cond_1

    goto/16 :goto_3

    :cond_1
    const/16 p3, 0x41

    if-ne v11, p3, :cond_2

    .line 128
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_b

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۟ۧ᩻;

    iput-boolean p1, p3, Ll/۟ۧ᩻;->᩷:Z

    goto/16 :goto_2

    .line 129
    :cond_2
    invoke-static {v11}, Ll/ᩳۧ᩻;->ۙ(I)Z

    move-result p3

    const/16 v6, 0x37

    if-eqz p3, :cond_5

    .line 130
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->size()I

    move-result p3

    const/16 v4, 0x80

    if-ge p3, v4, :cond_4

    .line 131
    new-instance p3, Ll/۟ۧ᩻;

    invoke-direct {p3, v3}, Ll/۟ۧ᩻;-><init>(I)V

    .line 132
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    if-eq v11, v6, :cond_3

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ۧ᩻;

    iput-boolean p1, v4, Ll/۟ۧ᩻;->᩷:Z

    .line 133
    :cond_3
    aput-object p3, v10, v3

    .line 134
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_2

    .line 130
    :cond_4
    new-instance p0, Ll/ܿۧ᩻;

    invoke-interface {v5}, Ll/۠ܺۨ;->getLine()I

    move-result p1

    invoke-interface {v5}, Ll/۠ܺۨ;->ۙ()I

    move-result p2

    const-string p3, "Formatting nesting limit exceeded"

    sget-object v0, Ll/᩶ۧ᩻;->᩶:Ll/᩶ۧ᩻;

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;Ll/᩶ۧ᩻;)V

    throw p0

    :cond_5
    const/16 p1, 0x38

    const/16 p3, 0x3a

    const/16 v7, 0x3c

    if-eq v11, v7, :cond_6

    if-eq v11, p3, :cond_6

    if-ne v11, p1, :cond_b

    .line 136
    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۧ᩻;

    iget p1, p1, Ll/۟ۧ᩻;->ܳ:I

    invoke-virtual {v9, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۨ;

    invoke-interface {p1}, Ll/۠ܺۨ;->getType()I

    move-result p1

    const/16 v10, 0x3b

    if-ne p1, v10, :cond_7

    if-eq v11, v7, :cond_9

    :cond_7
    const/16 v7, 0x39

    if-ne p1, v7, :cond_8

    if-eq v11, p3, :cond_9

    :cond_8
    if-ne p1, v6, :cond_c

    const/16 p1, 0x38

    if-ne v11, p1, :cond_c

    .line 139
    :cond_9
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۧ᩻;

    .line 140
    iput v3, p1, Ll/۟ۧ᩻;->ۙ:I

    .line 141
    iget p3, p1, Ll/۟ۧ᩻;->ܳ:I

    if-eq v4, p3, :cond_a

    const/4 p3, 0x1

    goto :goto_1

    :cond_a
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p1, Ll/۟ۧ᩻;->ۤ:Z

    .line 142
    aput-object p1, v8, v3

    :cond_b
    :goto_2
    move v4, v3

    goto :goto_3

    .line 373
    :cond_c
    new-instance p0, Ll/ܿۧ᩻;

    invoke-interface {v5}, Ll/۠ܺۨ;->getLine()I

    move-result p1

    invoke-interface {v5}, Ll/۠ܺۨ;->ۙ()I

    move-result p2

    const-string p3, "Mismatched closing delimiter"

    invoke-direct {p0, p1, p2, p3}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;)V

    .line 137
    throw p0

    :cond_d
    :goto_3
    add-int/lit8 v3, v3, 0x1

    const/4 p1, 0x1

    const/4 p3, -0x1

    goto/16 :goto_0

    .line 146
    :cond_e
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_24

    .line 92
    new-instance p1, Ll/ۢܺ᩻;

    invoke-direct {p1, v2}, Ll/ۢܺ᩻;-><init>(Ll/ۗܺۨ;)V

    .line 93
    invoke-virtual {p1}, Ll/ۡܺۨ;->ۧ()V

    .line 94
    invoke-virtual {p1, v0}, Ll/ۡܺۨ;->ۙ(Ll/᩻ܺۨ;)V

    .line 95
    invoke-virtual {p1}, Ll/ۢܺ᩻;->ۚۙ()Ll/ۗ᩻᩻;

    move-result-object p1

    const/4 p2, 0x1

    .line 96
    invoke-virtual {v2, p2}, Ll/ۗܺۨ;->᩷(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_23

    .line 155
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 156
    invoke-virtual {p2, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 157
    :cond_f
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1c

    .line 158
    invoke-static {}, Ll/ᩳۧ᩻;->ۙ()V

    .line 159
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩹ۨ;

    .line 160
    instance-of p3, p1, Ll/۟ܺۨ;

    if-eqz p3, :cond_f

    check-cast p1, Ll/۟ܺۨ;

    .line 161
    invoke-virtual {p1}, Ll/ۖܺۨ;->᩷()I

    move-result p3

    .line 162
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result v0

    iget-object v2, v1, Ll/ᩳۧ᩻;->ᩴ:[Z

    const/4 v3, 0x1

    if-le v0, v3, :cond_10

    invoke-virtual {p1, v3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    instance-of v4, v0, Ll/֨᩹ۨ;

    if-eqz v4, :cond_10

    check-cast v0, Ll/֨᩹ۨ;

    .line 163
    invoke-interface {v0}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v0

    invoke-interface {v0}, Ll/۠ܺۨ;->getType()I

    move-result v0

    const/16 v4, 0x36

    if-ne v0, v4, :cond_10

    .line 164
    iget-object v0, p1, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v0}, Ll/۠ܺۨ;->ۤ()I

    move-result v0

    aput-boolean v3, v2, v0

    :cond_10
    const/16 v0, 0x14

    if-ne p3, v0, :cond_13

    const/4 v3, 0x0

    .line 168
    :goto_4
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result v4

    if-ge v3, v4, :cond_13

    .line 169
    invoke-virtual {p1, v3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v4

    instance-of v5, v4, Ll/֨᩹ۨ;

    if-eqz v5, :cond_12

    check-cast v4, Ll/֨᩹ۨ;

    .line 170
    invoke-interface {v4}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v5

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v11, 0x31

    if-eq v5, v11, :cond_11

    .line 171
    invoke-interface {v4}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v5

    invoke-interface {v5}, Ll/۠ܺۨ;->getType()I

    move-result v5

    const/16 v11, 0x33

    if-ne v5, v11, :cond_12

    .line 172
    :cond_11
    invoke-interface {v4}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v4

    invoke-interface {v4}, Ll/۠ܺۨ;->ۤ()I

    move-result v4

    iget-object v5, v1, Ll/ᩳۧ᩻;->֫:[Z

    const/4 v11, 0x1

    aput-boolean v11, v5, v4

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_13
    if-eqz p3, :cond_19

    const/4 v3, 0x5

    if-eq p3, v3, :cond_18

    const/16 v3, 0x9

    if-eq p3, v3, :cond_19

    if-eq p3, v0, :cond_18

    const/16 v0, 0x2f

    if-eq p3, v0, :cond_19

    const/16 v0, 0x32

    if-eq p3, v0, :cond_18

    if-eq p3, v7, :cond_17

    const/16 v0, 0x3d

    if-eq p3, v0, :cond_14

    const/16 v3, 0x3e

    if-eq p3, v3, :cond_14

    packed-switch p3, :pswitch_data_0

    packed-switch p3, :pswitch_data_1

    goto/16 :goto_8

    :cond_14
    :pswitch_0
    const/4 p3, 0x0

    .line 194
    :goto_5
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result v3

    if-ge p3, v3, :cond_1b

    .line 195
    invoke-virtual {p1, p3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v3

    instance-of v4, v3, Ll/֨᩹ۨ;

    if-eqz v4, :cond_16

    check-cast v3, Ll/֨᩹ۨ;

    .line 196
    invoke-interface {v3}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v4

    invoke-interface {v4}, Ll/۠ܺۨ;->getType()I

    move-result v4

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_15

    .line 197
    invoke-interface {v3}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v4

    invoke-interface {v4}, Ll/۠ܺۨ;->getType()I

    move-result v4

    if-ne v4, v0, :cond_16

    .line 198
    :cond_15
    invoke-interface {v3}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v3

    invoke-interface {v3}, Ll/۠ܺۨ;->ۤ()I

    move-result v3

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    :cond_16
    add-int/lit8 p3, p3, 0x1

    goto :goto_5

    :cond_17
    const/4 p3, 0x1

    :goto_6
    add-int/lit8 v0, p3, 0x1

    .line 203
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_1b

    .line 204
    invoke-virtual {p1, p3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v2

    check-cast v2, Ll/֨᩹ۨ;

    .line 205
    invoke-virtual {p1, v0}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    check-cast v0, Ll/۟ܺۨ;

    .line 206
    invoke-interface {v2}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v2

    invoke-interface {v2}, Ll/۠ܺۨ;->ۤ()I

    move-result v2

    iget-object v0, v0, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    invoke-interface {v0}, Ll/۠ܺۨ;->ۤ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v3, v1, Ll/ᩳۧ᩻;->ۤ:[I

    aput v0, v3, v2

    add-int/lit8 p3, p3, 0x2

    goto :goto_6

    .line 180
    :cond_18
    :pswitch_1
    iget-object p3, p1, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {p3}, Ll/۠ܺۨ;->ۤ()I

    move-result p3

    const/4 v0, 0x1

    aput-boolean v0, v2, p3

    goto :goto_9

    :cond_19
    :pswitch_2
    const/4 p3, 0x0

    .line 185
    :goto_7
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result v0

    if-ge p3, v0, :cond_1b

    .line 186
    invoke-virtual {p1, p3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    instance-of v2, v0, Ll/֨᩹ۨ;

    if-eqz v2, :cond_1a

    check-cast v0, Ll/֨᩹ۨ;

    .line 187
    invoke-interface {v0}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v0

    invoke-interface {v0}, Ll/۠ܺۨ;->ۤ()I

    move-result v0

    aget-object v0, v10, v0

    if-eqz v0, :cond_1a

    const/4 v2, 0x1

    .line 188
    iput-boolean v2, v0, Ll/۟ۧ᩻;->᩷:Z

    :cond_1a
    add-int/lit8 p3, p3, 0x1

    goto :goto_7

    :cond_1b
    :goto_8
    const/4 v0, 0x1

    .line 210
    :goto_9
    invoke-virtual {p1}, Ll/۟ܺۨ;->getChildCount()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_a
    if-ltz p3, :cond_f

    invoke-virtual {p1, p3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_a

    .line 213
    :cond_1c
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 214
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_b
    if-ltz p2, :cond_1f

    .line 215
    aget-object p3, v8, p2

    if-eqz p3, :cond_1d

    invoke-virtual {p1, p3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 216
    :cond_1d
    aget-object p3, v10, p2

    if-eqz p3, :cond_1e

    .line 217
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۟ۧ᩻;

    .line 218
    iget-boolean v0, p3, Ll/۟ۧ᩻;->᩷:Z

    iget-boolean v2, p3, Ll/۟ۧ᩻;->ۤ:Z

    and-int/2addr v0, v2

    iput-boolean v0, p3, Ll/۟ۧ᩻;->᩷:Z

    if-eqz v0, :cond_1e

    .line 219
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1e

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۟ۧ᩻;

    const/4 v0, 0x1

    iput-boolean v0, p3, Ll/۟ۧ᩻;->᩷:Z

    :cond_1e
    add-int/lit8 p2, p2, -0x1

    goto :goto_b

    :cond_1f
    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 227
    :goto_c
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_22

    .line 228
    invoke-static {}, Ll/ᩳۧ᩻;->ۙ()V

    .line 229
    invoke-interface {v9, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۠ܺۨ;

    .line 230
    invoke-interface {p3}, Ll/۠ܺۨ;->getType()I

    move-result v0

    add-int/lit8 v2, p2, 0x1

    .line 231
    iget-object v3, v1, Ll/ᩳۧ᩻;->ܺ:[I

    aget v4, v3, p2

    aput v4, v3, v2

    if-eq v0, v7, :cond_21

    if-eq v0, v6, :cond_21

    const/4 v5, -0x1

    if-ne v0, v5, :cond_20

    goto :goto_d

    .line 233
    :cond_20
    invoke-interface {p3}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p1, v0}, Ll/ᩳۧ᩻;->᩷(II)Z

    move-result v5

    add-int/2addr p3, v5

    .line 234
    invoke-direct {v1, p1, p2}, Ll/ᩳۧ᩻;->ۙ(II)Z

    move-result p1

    add-int/2addr p3, p1

    add-int/2addr p3, v4

    aput p3, v3, v2

    move p1, v0

    :cond_21
    :goto_d
    move p2, v2

    goto :goto_c

    .line 101
    :cond_22
    invoke-direct {v1, p0}, Ll/ᩳۧ᩻;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    :cond_23
    const/4 p0, 0x1

    .line 97
    invoke-virtual {v2, p0}, Ll/ۗܺۨ;->᩸(I)Ll/۠ܺۨ;

    move-result-object p0

    .line 373
    new-instance p1, Ll/ܿۧ᩻;

    invoke-interface {p0}, Ll/۠ܺۨ;->getLine()I

    move-result p2

    invoke-interface {p0}, Ll/۠ܺۨ;->ۙ()I

    move-result p0

    const-string p3, "Unexpected trailing content"

    invoke-direct {p1, p2, p0, p3}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;)V

    .line 97
    throw p1

    .line 147
    :cond_24
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۟ۧ᩻;

    iget p0, p0, Ll/۟ۧ᩻;->ܳ:I

    invoke-virtual {v9, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܺۨ;

    .line 148
    new-instance p1, Ll/ܿۧ᩻;

    invoke-interface {p0}, Ll/۠ܺۨ;->getLine()I

    move-result p2

    invoke-interface {p0}, Ll/۠ܺۨ;->ۙ()I

    move-result p0

    const-string p3, "Unclosed delimiter"

    sget-object v0, Ll/᩶ۧ᩻;->֡:Ll/᩶ۧ᩻;

    invoke-direct {p1, p2, p0, p3, v0}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;Ll/᩶ۧ᩻;)V

    throw p1

    .line 70
    :catch_0
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1a
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZIZLl/ۤ᩻ᩴ;)V
    .locals 0

    .line 57
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܰۧ᩻;->ۙ(Ljava/lang/CharSequence;ZIZLl/ۤ᩻ᩴ;)V
    :try_end_0
    .catch Ll/۟ۚ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 59
    :catch_0
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0
.end method

.method public static ۙ(I)Z
    .locals 1

    const/16 v0, 0x3b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x39

    if-eq p0, v0, :cond_1

    const/16 v0, 0x37

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۙ(II)Z
    .locals 2

    .line 241
    iget-object v0, p0, Ll/ᩳۧ᩻;->ᩴ:[Z

    aget-boolean v0, v0, p2

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳۧ᩻;->֫:[Z

    aget-boolean v0, v0, p2

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p1, :cond_1

    const/16 v0, 0x41

    if-eq p1, v0, :cond_1

    .line 243
    invoke-static {p1}, Ll/ᩳۧ᩻;->ۙ(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x36

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_1

    const/16 v1, 0x3e

    if-eq p1, v1, :cond_1

    const/16 v1, 0x3f

    if-eq p1, v1, :cond_1

    iget-object p1, p0, Ll/ᩳۧ᩻;->᩻:Ljava/util/List;

    .line 245
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۨ;

    invoke-interface {p1}, Ll/۠ܺۨ;->getType()I

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static ᩷(II)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 335
    invoke-static {p0}, Ll/ᩳۧ᩻;->ۙ(I)Z

    move-result p0

    if-nez p0, :cond_1

    const/16 p0, 0x36

    if-eq p1, p0, :cond_1

    const/16 p0, 0x35

    if-eq p1, p0, :cond_1

    const/16 p0, 0x37

    if-eq p1, p0, :cond_1

    const/16 p0, 0x3c

    if-eq p1, p0, :cond_1

    const/16 p0, 0x3a

    if-eq p1, p0, :cond_1

    const/16 p0, 0x38

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
