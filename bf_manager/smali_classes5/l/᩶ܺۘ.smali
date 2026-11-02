.class public final synthetic Ll/᩶ܺۘ;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ll/ۙ᩶۠;


# static fields
.field private static final ᩹֡ۧ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩶ܺۘ;->᩹֡ۧ:[S

    return-void

    :array_0
    .array-data 2
        0x2675s
        -0x6bf7s
        -0x6bd5s
        -0x6bd6s
        -0x6bd5s
        -0x6b96s
        -0x6bd0s
        -0x6bd0s
        -0x6bdes
    .end array-data
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, 0x79fda1df

    sget v12, Ll/۟;->ۨᩴۛ:I

    sget v13, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v14, "\u06df\u1a79"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1927

    const v16, 0x54904e46

    xor-int v15, v15, v16

    const v16, -0x52c9893c

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x146d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    const/16 v8, 0x2128

    goto/16 :goto_1

    .line 11
    :sswitch_0
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v14, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v14, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v14, "\u06e7\u06d8"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x4b8d

    const v16, 0x53b3eed5

    xor-int v15, v15, v16

    const v16, -0x7b622863

    goto :goto_0

    .line 52
    :sswitch_1
    sget-boolean v14, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v14, :cond_c

    goto/16 :goto_3

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget-boolean v14, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v14, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_3

    .line 20
    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0x8

    .line 71
    invoke-static {v9, v10, v1, v8}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    :sswitch_6
    const/4 v10, 0x1

    .line 12
    sget v14, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v14, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v14, "\u0736\u06e7"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x3cc5

    const v16, 0x35472cc3

    xor-int v15, v15, v16

    const v16, -0x6eab0fa4

    goto :goto_0

    .line 71
    :sswitch_7
    sget-object v9, Ll/᩶ܺۘ;->᩹֡ۧ:[S

    .line 25
    sget-boolean v14, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v14, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v14, "\u06e0\u06e2"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x59

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2d6d

    const v16, -0xf3ff097

    xor-int v15, v15, v16

    const v16, 0x7c02238f

    goto/16 :goto_0

    .line 71
    :sswitch_8
    invoke-static {}, Ll/֡֡;->ۢܶܳ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    sget v14, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v14, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v14, "\u0733\u0736"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x5b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x7e83

    const v16, 0x725cfceb

    xor-int v15, v15, v16

    const v16, -0x6e950b

    goto/16 :goto_0

    :sswitch_9
    const v8, 0x9444

    :goto_1
    const-string v14, "\u05ab\u06d7"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x2d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0xff5

    const v16, 0x43309d09

    xor-int v15, v15, v16

    const v16, -0x254aa977

    goto/16 :goto_0

    :sswitch_a
    add-int v14, v6, v7

    add-int/2addr v14, v14

    sub-int v14, v5, v14

    if-gtz v14, :cond_4

    const-string v14, "\u06e7\u1a7a"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6f7f

    const v16, -0x75aaa0d4

    xor-int v15, v15, v16

    const v16, 0x6fe75d76

    goto/16 :goto_0

    :cond_4
    const-string v14, "\u06d6\u06e1"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x3b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x339d

    const v16, -0x56b6934e

    xor-int v15, v15, v16

    const v16, -0x538c0480

    goto/16 :goto_0

    :sswitch_b
    const v7, 0x5c270a4

    .line 58
    sget v14, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v14, :cond_5

    goto :goto_2

    :cond_5
    const-string v14, "\u05a8\u06df"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3b2d

    const v16, 0x605d134e

    xor-int v15, v15, v16

    const v16, 0x55441ab7

    goto/16 :goto_0

    :sswitch_c
    mul-int v5, v4, v4

    mul-int v6, v3, v3

    .line 61
    sget v14, Ll/ۗ;->֨۬ۖ:I

    if-ltz v14, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v14, "\u06e7\u06e2"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x15

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x4339

    const v16, 0x64871020

    xor-int v15, v15, v16

    const v16, -0x27a6c8d1

    goto/16 :goto_0

    :sswitch_d
    add-int/lit16 v4, v3, 0x2666

    .line 62
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v14

    if-eqz v14, :cond_7

    const-string v14, "\u073f\u1a78"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x3

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5329

    const v16, -0x58b0fbda

    xor-int v15, v15, v16

    const v16, -0x26181823    # -8.159457E15f

    goto/16 :goto_0

    :cond_7
    const-string v14, "\u05a1\u0730"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x59

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7cb9

    const v16, -0x6b15b934

    xor-int v15, v15, v16

    const v16, -0x6807fd35

    goto/16 :goto_0

    :sswitch_e
    aget-short v3, v1, v2

    .line 22
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v14

    if-ltz v14, :cond_9

    :cond_8
    :goto_2
    const-string v14, "\u1a78\u06e7"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1ab7

    const v16, -0x39e37419

    xor-int v15, v15, v16

    const v16, -0xbc5c07f

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u1a77\u06d8"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x26c9

    const v16, 0x79018a1e

    xor-int v15, v15, v16

    const v16, -0xfb189e8

    goto/16 :goto_0

    :sswitch_f
    const/4 v2, 0x0

    .line 16
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v14

    if-eqz v14, :cond_a

    goto :goto_3

    :cond_a
    const-string v14, "\u06e4\u1a74"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x78b7

    const v16, -0x63993023

    xor-int v15, v15, v16

    const v16, 0x2576d8bb

    goto/16 :goto_0

    .line 17
    :sswitch_10
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v14

    if-eqz v14, :cond_b

    :goto_3
    const-string v14, "\u1a79\u073a"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x43

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7f79

    const v16, -0x7847bc2e

    xor-int v15, v15, v16

    const v16, -0x16fe9902

    goto/16 :goto_0

    :cond_b
    const-string v14, "\u05a8\u05a8"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x19

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x5531

    const v16, -0x51b743fe

    xor-int v15, v15, v16

    const v16, -0x718c4182

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/᩶ܺۘ;->᩹֡ۧ:[S

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v14

    if-gtz v14, :cond_d

    :cond_c
    :goto_4
    const-string v14, "\u1a79\u0736"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7827

    const v16, 0x729ec95d

    xor-int v15, v15, v16

    const v16, 0xff3f51a

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u06d6\u1a7a"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x47a7

    const v16, 0x674a16f0

    xor-int v15, v15, v16

    const v16, 0x7bad402c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d1d4395 -> :sswitch_6
        -0x798694d0 -> :sswitch_3
        -0x60fca79a -> :sswitch_c
        -0x5a7c07d6 -> :sswitch_9
        -0x4dc91ae9 -> :sswitch_f
        -0x4937b430 -> :sswitch_8
        -0x39e02f0f -> :sswitch_4
        -0x2c65a93d -> :sswitch_4
        -0x2acc857d -> :sswitch_d
        -0x26a7940e -> :sswitch_a
        -0x253c1f9c -> :sswitch_0
        -0x21b61a15 -> :sswitch_1
        -0x16b76558 -> :sswitch_2
        -0x13aeebec -> :sswitch_e
        -0x10ed827c -> :sswitch_e
        -0xc606d80 -> :sswitch_9
        0x5827578 -> :sswitch_8
        0xec90871 -> :sswitch_7
        0x11340780 -> :sswitch_7
        0x2a8ef91d -> :sswitch_2
        0x2df52931 -> :sswitch_d
        0x2e42dce5 -> :sswitch_b
        0x371c051e -> :sswitch_11
        0x3e5d51c1 -> :sswitch_3
        0x42142dfd -> :sswitch_b
        0x4463cda4 -> :sswitch_c
        0x524b777a -> :sswitch_1
        0x566580fa -> :sswitch_0
        0x58018655 -> :sswitch_5
        0x5b304302 -> :sswitch_5
        0x5ed39992 -> :sswitch_10
        0x6752cc91 -> :sswitch_11
        0x6cf69ba8 -> :sswitch_f
        0x6ed466f5 -> :sswitch_10
        0x703a9b5a -> :sswitch_a
        0x751ddd97 -> :sswitch_6
    .end sparse-switch
.end method
