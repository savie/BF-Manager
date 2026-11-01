.class public final Ll/᩻᩺᩹;
.super Ljava/io/FilterInputStream;
.source "05ZQ"

# interfaces
.implements Ll/᩷ۤᩴ;


# static fields
.field private static final ۧ᩶֫:[S


# instance fields
.field public ܺ:Ll/۠᩻᩺;

.field public final synthetic ᩶:Ll/ۖܶ᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻᩺᩹;->ۧ᩶֫:[S

    return-void

    :array_0
    .array-data 2
        0x19dcs
        -0x5a33s
        -0x5a11s
        -0x5a20s
        -0x5a13s
        -0x5a15s
        -0x5a1es
        -0x5a15s
        -0x5a16s
        0x21dcs
        -0x34f4s
        -0x34d2s
        -0x34dfs
        -0x34d4s
        -0x34d6s
        -0x34dds
        -0x34d6s
        -0x34d5s
    .end array-data
.end method

.method public constructor <init>(Ll/ۖܶ᩹;Ljava/io/BufferedInputStream;Ll/᩷۠ۚ;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x19c5c029

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 548
    iput-object p1, p0, Ll/᩻᩺᩹;->᩶:Ll/ۖܶ᩹;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string p2, "\u1a78\u1a78"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    mul-int/lit8 p2, p2, 0x35

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0xd83

    const v7, 0x17061f68

    xor-int/2addr v6, v7

    const v7, 0x324709d6

    :goto_0
    xor-int/2addr p2, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x365f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v6

    xor-int/2addr v3, p2

    sparse-switch v3, :sswitch_data_0

    .line 549
    new-instance v2, Ll/ۧ᩺᩹;

    invoke-direct {v2, v1}, Ll/ۧ᩺᩹;-><init>(Ll/ܰۜ᩹;)V

    sget p2, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p2, :cond_0

    goto/16 :goto_2

    .line 384
    :sswitch_0
    sget p2, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez p2, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result p2

    if-eqz p2, :cond_9

    goto/16 :goto_2

    :sswitch_2
    sget-boolean p2, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz p2, :cond_b

    goto :goto_2

    .line 94
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto :goto_2

    .line 126
    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 549
    :sswitch_5
    invoke-static {v7, v2}, Ll/֨ۢ;->֨ܰ֡(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v7, p0, Ll/᩻᩺᩹;->ܺ:Ll/۠᩻᩺;

    return-void

    :cond_0
    const-string p2, "\u1a7a\u073f"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v5, p2

    mul-int/lit8 p2, p2, -0x67

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x5469

    const v8, 0x18a8aee4

    xor-int/2addr v6, v8

    const v8, -0x12eaa77

    goto/16 :goto_5

    :sswitch_6
    iget-object v1, p1, Ll/ۖܶ᩹;->᩹:Ll/ܰۜ᩹;

    invoke-static {v1}, Ll/ۗܳ;->֫ܽۢ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    sget p2, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p2, :cond_1

    goto :goto_3

    :cond_1
    const-string p2, "\u1a76\u06d6"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    mul-int/lit8 p2, p2, -0x75

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x691f

    const v8, -0x7a912be3

    xor-int/2addr v6, v8

    const v8, 0x192dcdac

    goto/16 :goto_5

    .line 549
    :sswitch_7
    new-instance v7, Ll/۠᩻᩺;

    invoke-virtual {p3}, Ll/᩷۠ۚ;->֫ۙ()J

    move-result-wide v8

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_4

    .line 75
    :cond_2
    sget p2, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz p2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_3

    :cond_4
    sget p2, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz p2, :cond_5

    :goto_2
    const-string p2, "\u1a79\u1a79"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    mul-int/lit8 p2, p2, 0x69

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x4353

    const v7, 0xbf08c2f

    xor-int/2addr v6, v7

    const v7, 0x70796c86

    goto/16 :goto_0

    .line 389
    :cond_5
    sget p2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz p2, :cond_7

    :cond_6
    const-string p2, "\u06d7\u06e8"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x4b03

    const v7, -0x55232d92

    xor-int/2addr v6, v7

    const v7, -0x22c26a65

    goto/16 :goto_0

    .line 426
    :cond_7
    sget p2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz p2, :cond_8

    :goto_3
    const-string p2, "\u06d8\u1a76"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    mul-int/lit8 p2, p2, -0xf

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x3203

    const v7, -0x31c1a23

    xor-int/2addr v6, v7

    const v7, -0x7f83d1dc

    goto/16 :goto_0

    .line 45
    :cond_8
    sget p2, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz p2, :cond_a

    :cond_9
    :goto_4
    const-string p2, "\u05ab\u1a73"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v5

    mul-int/lit8 p2, p2, -0x47

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x6221

    const v7, -0x1441cfc6

    xor-int/2addr v6, v7

    const v7, -0x6f12dcfc

    goto/16 :goto_0

    .line 549
    :cond_a
    invoke-direct {v7, v8, v9}, Ll/۠᩻᩺;-><init>(J)V

    .line 367
    sget p2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz p2, :cond_c

    :cond_b
    const-string p2, "\u06dc\u06db"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x29eb

    const v8, 0x4a7b979a    # 4122086.5f

    xor-int/2addr v6, v8

    const v8, -0x39bb7cfe

    goto :goto_5

    :cond_c
    const-string p2, "\u073d\u1a73"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v4, p2

    mul-int/lit8 p2, p2, 0x7f

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x1fe1

    const v8, 0x3e0e1439

    xor-int/2addr v6, v8

    const v8, 0x26cb54e5

    :goto_5
    xor-int/2addr p2, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7c276bbe -> :sswitch_0
        -0x7b7e8ba3 -> :sswitch_7
        -0x717fd585 -> :sswitch_2
        -0x5fe59ced -> :sswitch_6
        -0x4afe090a -> :sswitch_4
        -0x400fbc4f -> :sswitch_4
        -0x12a4daff -> :sswitch_7
        -0x89d0ccd -> :sswitch_5
        0x129f724 -> :sswitch_5
        0x1e8efac6 -> :sswitch_1
        0x3da77501 -> :sswitch_2
        0x433dbed5 -> :sswitch_1
        0x45e35b65 -> :sswitch_0
        0x47302972 -> :sswitch_6
        0x5417ff63 -> :sswitch_3
        0x5844a9c2 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final read()I
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x494a48ab

    sget v11, Ll/֨ܶ;->ۛۛۛ:I

    sget v12, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v13, "\u06da\u073a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x1f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x47a5

    const v15, -0x1280f707

    xor-int/2addr v14, v15

    const v15, 0x748fcb6e

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x1deb

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const v7, 0x16a695a4

    add-int/2addr v7, v6

    .line 444
    sget v13, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v13, :cond_7

    goto/16 :goto_3

    .line 83
    :sswitch_0
    sget v13, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v13, :cond_d

    goto/16 :goto_3

    .line 246
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v13, Ll/۟;->ۨᩴۛ:I

    if-ltz v13, :cond_0

    goto/16 :goto_3

    .line 320
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v13, :cond_b

    goto/16 :goto_2

    .line 116
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    goto/16 :goto_2

    .line 543
    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v3, 0x1

    .line 41
    invoke-static {v2, v3}, Ll/ۗᩳ;->ۖܿᩳ(Ljava/lang/Object;I)Z

    return v1

    .line 556
    :sswitch_6
    invoke-super/range {p0 .. p0}, Ljava/io/FilterInputStream;->read()I

    move-result v1

    .line 557
    iget-object v2, v0, Ll/᩻᩺᩹;->ܺ:Ll/۠᩻᩺;

    .line 329
    sget v13, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v13, :cond_1

    :cond_0
    const-string v13, "\u073a\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5ae3

    const v15, -0x691f6b61

    xor-int/2addr v14, v15

    const v15, -0x32ba7c5c

    goto :goto_0

    :cond_1
    const-string v13, "\u1a73\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x1b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5fb

    const v15, -0x2d42b078

    xor-int/2addr v14, v15

    const v15, -0x282c1d09

    goto :goto_0

    .line 554
    :sswitch_7
    new-instance v13, Ljava/lang/RuntimeException;

    sget-object v14, Ll/᩻᩺᩹;->ۧ᩶֫:[S

    .line 328
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v15

    if-eqz v15, :cond_2

    goto/16 :goto_4

    :cond_2
    const/4 v15, 0x1

    .line 341
    sget-boolean v16, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v16, :cond_3

    goto/16 :goto_3

    :cond_3
    const/16 v1, 0x8

    .line 554
    invoke-static {v14, v15, v1, v9}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 553
    :sswitch_8
    iget-object v13, v0, Ll/᩻᩺᩹;->᩶:Ll/ۖܶ᩹;

    iget-object v13, v13, Ll/ۖܶ᩹;->᩹:Ll/ܰۜ᩹;

    invoke-virtual {v13}, Ll/ܰۜ᩹;->ܰ()Z

    move-result v13

    if-nez v13, :cond_4

    const-string v13, "\u073d\u073a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6e5f

    const v15, -0x736b63af

    xor-int/2addr v14, v15

    const v15, 0x435ad5cc

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u0733\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5b03

    const v15, 0x1ceb273d

    xor-int/2addr v14, v15

    const v15, -0x404a7515

    goto/16 :goto_0

    :sswitch_9
    const v9, 0xc2c5

    goto :goto_1

    :sswitch_a
    const v9, 0xa58e

    :goto_1
    const-string v13, "\u1a77\u05ab"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5029

    const v15, -0x2fc79ec1

    xor-int/2addr v14, v15

    const v15, -0x41785030

    goto/16 :goto_0

    :sswitch_b
    mul-int v13, v5, v8

    sub-int v13, v7, v13

    if-gez v13, :cond_5

    const-string v13, "\u06eb\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x47

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2347

    const v15, 0x3b482279

    xor-int/2addr v14, v15

    const v15, -0x6e54818f

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u05a1\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x41

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x237d

    const v15, -0x40a80ff7

    xor-int/2addr v14, v15

    const v15, -0x4d7d7f94

    goto/16 :goto_0

    :sswitch_c
    const v8, 0x984c

    .line 177
    sget-boolean v13, Ll/᩶;->ۚۤۘ:Z

    if-eqz v13, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v13, "\u06e1\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x31

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x586b

    const v15, -0x4d2479b9

    xor-int/2addr v14, v15

    const v15, 0x35d18b2

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06ec\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5a3d

    const v15, 0x33fc875d

    xor-int/2addr v14, v15

    const v15, 0x759bf8de

    goto/16 :goto_0

    :sswitch_d
    aget-short v5, v3, v4

    mul-int v6, v5, v5

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v13

    if-eqz v13, :cond_8

    const-string v13, "\u073f\u06e4"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x67

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x30a5

    const v15, -0x37d07b96

    xor-int/2addr v14, v15

    const v15, 0x2fc84d47

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06d9\u05a8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x71

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x56c5

    const v15, -0x72d64a31

    xor-int/2addr v14, v15

    const v15, 0x1a2549cc

    goto/16 :goto_0

    :sswitch_e
    const/4 v4, 0x0

    .line 188
    sget v13, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v13, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v13, "\u1a7b\u1a76"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x31

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2589

    const v15, -0x64bb8f29

    xor-int/2addr v14, v15

    const v15, 0x6bf73161

    goto/16 :goto_0

    .line 535
    :sswitch_f
    sget v13, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v13, :cond_a

    :goto_2
    const-string v13, "\u06d6\u06eb"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x77

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5449

    const v15, -0x18741291

    xor-int/2addr v14, v15

    const v15, 0x10e2894a

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06e2\u0736"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2c75

    const v15, 0x3fa86c2d

    xor-int/2addr v14, v15

    const v15, 0x790d99bd

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_c

    :cond_b
    :goto_3
    const-string v13, "\u1a73\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x30e9

    const v15, -0x48f9a51a

    xor-int/2addr v14, v15

    const v15, -0x2f100243

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u1a73\u0730"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3acf

    const v15, -0x5c45e774

    xor-int/2addr v14, v15

    const v15, -0xce82f79

    goto/16 :goto_0

    :sswitch_11
    sget-object v3, Ll/᩻᩺᩹;->ۧ᩶֫:[S

    .line 150
    sget v13, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v13, :cond_e

    :cond_d
    :goto_4
    const-string v13, "\u06dc\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x23

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5cbf

    const v15, -0x318e84af

    xor-int/2addr v14, v15

    const v15, -0x54a9c5b8

    goto/16 :goto_0

    :cond_e
    const-string v13, "\u073f\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x71

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x664f

    const v15, 0x1d7946d8

    xor-int/2addr v14, v15

    const v15, 0x67888dd6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78268738 -> :sswitch_b
        -0x6b85c65e -> :sswitch_2
        -0x6af5ad9f -> :sswitch_7
        -0x6587e877 -> :sswitch_d
        -0x5f55f611 -> :sswitch_3
        -0x578330ac -> :sswitch_1
        -0x5641698c -> :sswitch_f
        -0x5337bffb -> :sswitch_a
        -0x4d2a43a2 -> :sswitch_9
        -0x3e32fb44 -> :sswitch_4
        -0x3740a7a2 -> :sswitch_4
        -0x300c2924 -> :sswitch_7
        -0x2c8a752e -> :sswitch_8
        -0x2b66e39c -> :sswitch_c
        -0x2a86b627 -> :sswitch_10
        -0x27f0af62 -> :sswitch_e
        -0x1da7d81a -> :sswitch_6
        -0x1c94259c -> :sswitch_3
        -0x1694c829 -> :sswitch_d
        -0xbd4f2e7 -> :sswitch_11
        -0xb2586fe -> :sswitch_11
        -0x3df8e75 -> :sswitch_0
        -0x1e2fe28 -> :sswitch_c
        0xcd8d7b -> :sswitch_5
        0x16a5fe57 -> :sswitch_10
        0x1f868073 -> :sswitch_8
        0x3343c658 -> :sswitch_0
        0x347bf2ff -> :sswitch_9
        0x492c81db -> :sswitch_f
        0x634e74f4 -> :sswitch_a
        0x6c477153 -> :sswitch_2
        0x6c4e8a96 -> :sswitch_1
        0x6e61184c -> :sswitch_6
        0x70576c75 -> :sswitch_e
        0x71c1c3d4 -> :sswitch_5
        0x7eee912a -> :sswitch_b
    .end sparse-switch
.end method

.method public final read([BII)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x75204f8e

    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v7, "\u1a79\u0733"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3457

    const v9, 0x5104ccdf

    xor-int/2addr v8, v9

    const v9, -0x66408b99

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x5787

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 566
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    .line 567
    iget-object p2, p0, Ll/᩻᩺᩹;->ܺ:Ll/۠᩻᩺;

    invoke-static {p2, p1}, Ll/֡ܽ;->֡ۨۗ(Ljava/lang/Object;I)Z

    return p1

    .line 424
    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v7, Ll/ۗ;->֨۬ۖ:I

    if-gez v7, :cond_d

    goto/16 :goto_4

    .line 372
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v7, :cond_5

    goto/16 :goto_4

    .line 159
    :sswitch_2
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v7, :cond_b

    goto :goto_1

    .line 262
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    :goto_1
    const-string v7, "\u06d6\u1a76"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7e83

    const v9, 0x562394d6

    xor-int/2addr v8, v9

    const v9, -0x5182a99a

    goto :goto_0

    .line 331
    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const/4 p1, 0x0

    return p1

    .line 564
    :sswitch_5
    new-instance v7, Ljava/lang/RuntimeException;

    sget-object v8, Ll/᩻᩺᩹;->ۧ᩶֫:[S

    const/16 v9, 0xa

    .line 541
    sget v10, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v10, :cond_0

    goto/16 :goto_5

    :cond_0
    const/16 p1, 0x8

    .line 564
    invoke-static {v8, v9, p1, v3}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 563
    :sswitch_6
    iget-object v7, p0, Ll/᩻᩺᩹;->᩶:Ll/ۖܶ᩹;

    iget-object v7, v7, Ll/ۖܶ᩹;->᩹:Ll/ܰۜ᩹;

    invoke-virtual {v7}, Ll/ܰۜ᩹;->ܰ()Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "\u0730\u06e8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6bd1

    const v9, 0x7bdf6509

    xor-int/2addr v8, v9

    const v9, -0x154089dd

    goto :goto_0

    :cond_1
    const-string v7, "\u06d9\u06d9"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x5f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x75ff

    const v9, -0x3683498

    xor-int/2addr v8, v9

    const v9, 0x44c21e60

    goto/16 :goto_0

    :sswitch_7
    const v3, 0x9463

    goto :goto_2

    :sswitch_8
    const v3, 0xcb4f

    :goto_2
    const-string v7, "\u06d7\u05a1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x318f

    const v9, 0x51e95cae

    xor-int/2addr v8, v9

    const v9, -0x53fa30d6

    goto/16 :goto_0

    :sswitch_9
    add-int/lit16 v7, v2, 0xbd1

    sub-int v7, v1, v7

    if-lez v7, :cond_2

    const-string v7, "\u06e8\u06eb"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7335

    const v9, 0x66d8f158

    xor-int/2addr v8, v9

    const v9, 0x7e1c09e4

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06eb\u06db"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7c25

    const v9, -0x56c0c47c

    xor-int/2addr v8, v9

    const v9, -0x31161ed3

    goto/16 :goto_0

    :sswitch_a
    mul-int/lit8 v1, v0, 0x6e

    mul-int v2, v0, v0

    sget v7, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v7, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v7, "\u06ec\u073f"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x766b

    const v9, 0x2fe6d5b8

    xor-int/2addr v8, v9

    const v9, 0x566a848d

    goto/16 :goto_0

    :sswitch_b
    sget-object v0, Ll/᩻᩺᩹;->ۧ᩶֫:[S

    const/16 v7, 0x9

    aget-short v0, v0, v7

    sget-boolean v7, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v7, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v7, "\u06da\u1a76"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xd

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4255

    const v9, -0x48276f32

    xor-int/2addr v8, v9

    const v9, -0x2109de2b

    goto/16 :goto_0

    .line 56
    :sswitch_c
    sget v7, Ll/֫;->ܶܺ᩻:I

    if-ltz v7, :cond_6

    :cond_5
    const-string v7, "\u06e2\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x19ad

    const v9, 0x29d75f90

    xor-int/2addr v8, v9

    const v9, 0x5e72aecf

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u05a8\u06e2"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x537

    const v9, 0x27aa3fff

    xor-int/2addr v8, v9

    const v9, 0x697e633d

    goto/16 :goto_0

    .line 237
    :sswitch_d
    sget v7, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v7, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v7, "\u1a78\u0733"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x51

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5655

    const v9, 0x5f27cfa6

    xor-int/2addr v8, v9

    const v9, -0x6ba55009

    goto/16 :goto_0

    :sswitch_e
    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_8

    goto :goto_4

    :cond_8
    const-string v7, "\u06d9\u06e2"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1d8d

    const v9, -0x5ff0fdf4

    xor-int/2addr v8, v9

    const v9, -0x7cd2004d

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/۟;->ۨᩴۛ:I

    if-ltz v7, :cond_9

    :goto_3
    const-string v7, "\u05a8\u1a7a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x67

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6825

    const v9, 0x525a32a

    xor-int/2addr v8, v9

    const v9, 0x59719704

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06d8\u073d"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xd

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x564d

    const v9, -0x70f9b9cd

    xor-int/2addr v8, v9

    const v9, -0x2a405009

    goto/16 :goto_0

    .line 177
    :sswitch_10
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v7, :cond_a

    goto :goto_5

    :cond_a
    const-string v7, "\u06eb\u06e2"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x53

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xb17

    const v9, -0x4f3c55b7

    xor-int/2addr v8, v9

    const v9, 0x4b23ad81    # 1.0726785E7f

    goto/16 :goto_0

    :sswitch_11
    sget v7, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u06dc\u1a79"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1419

    const v9, -0x63ec785f

    xor-int/2addr v8, v9

    const v9, 0x3f7161c9

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d7\u1a79"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x57

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x291d

    const v9, -0x3dade671

    xor-int/2addr v8, v9

    const v9, -0x597565da

    goto/16 :goto_0

    .line 529
    :sswitch_12
    sget v7, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v7, :cond_e

    :cond_d
    :goto_5
    const-string v7, "\u1a74\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7685

    const v9, -0x3df07c89

    xor-int/2addr v8, v9

    const v9, -0x6a087089

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u05a1\u1a78"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5a1d

    const v9, 0x13763541

    xor-int/2addr v8, v9

    const v9, -0x51cf23fe

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b8147a9 -> :sswitch_11
        -0x752c6087 -> :sswitch_12
        -0x75293751 -> :sswitch_0
        -0x720dd7fc -> :sswitch_5
        -0x6ff78ea1 -> :sswitch_12
        -0x6fbd0ba2 -> :sswitch_d
        -0x65a2bd39 -> :sswitch_5
        -0x5c9be896 -> :sswitch_11
        -0x47bc5d6f -> :sswitch_9
        -0x42ed973e -> :sswitch_4
        -0x3c247e4c -> :sswitch_10
        -0x394e2dd5 -> :sswitch_4
        -0x22791347 -> :sswitch_8
        -0x2263dbe0 -> :sswitch_1
        -0x1a4df04b -> :sswitch_1
        -0x7db41d8 -> :sswitch_f
        -0x5d5cb6f -> :sswitch_9
        0x2bd5e1a -> :sswitch_8
        0x1101aca1 -> :sswitch_c
        0x15c8d0c9 -> :sswitch_f
        0x274d4770 -> :sswitch_0
        0x2d19f24c -> :sswitch_10
        0x2f44d781 -> :sswitch_c
        0x34cbc130 -> :sswitch_6
        0x38950420 -> :sswitch_e
        0x3a32bf71 -> :sswitch_2
        0x3ca70642 -> :sswitch_2
        0x3ea080ec -> :sswitch_3
        0x42f54145 -> :sswitch_b
        0x4eed6295 -> :sswitch_7
        0x4f3734e5 -> :sswitch_3
        0x579319a7 -> :sswitch_6
        0x6633ffab -> :sswitch_e
        0x6751147e -> :sswitch_d
        0x6d730423 -> :sswitch_7
        0x6d7d7284 -> :sswitch_a
        0x709607cd -> :sswitch_a
        0x7a1105c3 -> :sswitch_b
    .end sparse-switch
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۤۤᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
