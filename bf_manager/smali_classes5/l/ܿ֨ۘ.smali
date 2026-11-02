.class public final Ll/ܿ֨ۘ;
.super Ll/᩷֨ۘ;
.source "R3YJ"


# static fields
.field private static final ۜۖ֡:[S


# instance fields
.field public final synthetic ۙ:Ll/ۧ֨ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ֨ۘ;->ۜۖ֡:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x95as
        0x30cs
        0x34fs
        0x356s
        0x34es
    .end array-data
.end method

.method public constructor <init>(Ll/ۧ֨ۘ;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/ܿ֨ۘ;->ۙ:Ll/ۧ֨ۘ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 20

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x52d571ed

    sget v13, Ll/֫ܳ;->᩶ۧۛ:I

    sget v14, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v15, "\u073a\u06da"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x6d6f

    const v17, 0x478c142a

    xor-int v0, v0, v17

    const v17, 0x1e8d4cf9

    xor-int v15, v15, v17

    move-object v4, v3

    move-object v12, v11

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v15, 0x52d571ed

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x95

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v15

    mul-int v8, v6, v7

    mul-int v9, v6, v6

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v0

    if-ltz v0, :cond_9

    goto/16 :goto_5

    .line 16
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v0, :cond_1

    :cond_0
    move-object/from16 v0, p0

    move/from16 v16, v15

    goto/16 :goto_2

    :cond_1
    move/from16 v16, v15

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_1

    .line 35
    :sswitch_2
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v0

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v16, v15

    goto/16 :goto_6

    .line 43
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    :goto_1
    const-string v0, "\u0730\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move/from16 v16, v15

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x289b

    const v18, -0x16f52c77

    xor-int v15, v15, v18

    const v18, 0xe308900

    goto/16 :goto_8

    .line 28
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    const/4 v0, 0x0

    return-object v0

    .line 80
    :sswitch_5
    invoke-static {v1, v3}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۛ֨ۘ;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :sswitch_6
    move/from16 v16, v15

    const/4 v0, 0x1

    const/4 v3, 0x4

    invoke-static {v12, v0, v3, v11}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 28
    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_3

    move-object/from16 v0, p0

    goto :goto_2

    :cond_3
    const-string v0, "\u06db\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0xfe9

    const v18, -0x2a6ad0cd

    xor-int v15, v15, v18

    const v18, -0x32a72a4d

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v0, p1

    move/from16 v16, v15

    .line 80
    invoke-static {v1, v0}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v12, Ll/ܿ֨ۘ;->ۜۖ֡:[S

    .line 41
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v15

    if-nez v15, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v15, "\u06e8\u06ec"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x17

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, -0x7a43

    const v18, -0xcca2ec8

    xor-int v0, v0, v18

    const v18, 0x2b9f12b3

    goto :goto_3

    :sswitch_8
    move-object/from16 v0, p0

    move/from16 v16, v15

    .line 80
    iget-object v1, v0, Ll/ܿ֨ۘ;->ۙ:Ll/ۧ֨ۘ;

    invoke-static {v1}, Ll/ۧ֨ۘ;->ۙ(Ll/ۧ֨ۘ;)Ll/ۛ֨ۘ;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    sget v15, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v15, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    sget-boolean v15, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v15, :cond_6

    :goto_2
    const-string v1, "\u1a78\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x3e67

    const v18, -0x6619bc4e

    xor-int v15, v15, v18

    const v18, -0x3f6e7dfe

    xor-int v1, v1, v18

    move v0, v15

    move/from16 v15, v16

    move/from16 v16, v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_6
    const-string v15, "\u1a73\u0736"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x61c5

    const v18, 0x621f6f39

    xor-int v0, v0, v18

    const v18, 0x7a52b598

    :goto_3
    xor-int v15, v15, v18

    move/from16 v19, v16

    move/from16 v16, v15

    goto/16 :goto_9

    :sswitch_9
    move/from16 v16, v15

    const/16 v0, 0x7f88

    const/16 v11, 0x7f88

    goto :goto_4

    :sswitch_a
    move/from16 v16, v15

    const/16 v0, 0x322

    const/16 v11, 0x322

    :goto_4
    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x54d5

    const v18, -0x7c50a761

    xor-int v15, v15, v18

    const v18, -0x4f05eb12

    goto/16 :goto_8

    :sswitch_b
    move/from16 v16, v15

    add-int v0, v9, v10

    sub-int/2addr v0, v8

    if-ltz v0, :cond_7

    const-string v0, "\u073a\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x3b25

    const v18, -0x1f55c256

    xor-int v15, v15, v18

    const v18, 0x411aca82

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u1a79\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x745d

    const v18, -0x56fb2869

    xor-int v15, v15, v18

    const v18, -0x6de4f9d4

    goto/16 :goto_8

    :sswitch_c
    move/from16 v16, v15

    const v10, 0x1fb7b31

    .line 25
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v0

    if-gtz v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x17

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x305f

    const v18, -0x60de1ccd

    xor-int v15, v15, v18

    const v18, -0x2d9b455b

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06df\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x28ed

    const v18, -0x577ec7cd

    xor-int v15, v15, v18

    const v18, -0x59d2ef1a

    goto/16 :goto_8

    :sswitch_d
    move/from16 v16, v15

    aget-short v6, v4, v5

    const/16 v7, 0x2d0e

    .line 2
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v0

    if-ltz v0, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06db\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3e3b

    const v18, -0x3d47042

    xor-int v15, v15, v18

    const v18, -0x633efd7c

    goto/16 :goto_8

    :sswitch_e
    move/from16 v16, v15

    const/4 v5, 0x0

    .line 38
    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_b

    :goto_5
    const-string v0, "\u06da\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x75

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x2643

    const v18, -0x2a25bd28    # -2.9997578E13f

    xor-int v15, v15, v18

    const v18, -0x3c24b957

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x63

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x60af

    const v18, -0x68e7723d

    xor-int v15, v15, v18

    const v18, -0x454426e4

    goto :goto_8

    :sswitch_f
    move/from16 v16, v15

    sget-object v4, Ll/ܿ֨ۘ;->ۜۖ֡:[S

    .line 50
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_6
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x17

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1243

    const v18, -0x2ed0e2ea

    xor-int v15, v15, v18

    const v18, -0x466cadf0

    goto :goto_8

    :cond_c
    const-string v0, "\u06d9\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x2f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x59f1

    const v18, -0x3294f539

    xor-int v15, v15, v18

    const v18, -0x2ab7e160

    goto :goto_8

    :sswitch_10
    move/from16 v16, v15

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_d

    :goto_7
    const-string v0, "\u06e7\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x77db

    const v18, 0xb2350d4

    xor-int v15, v15, v18

    const v18, -0x1f290530

    goto :goto_8

    :cond_d
    const-string v0, "\u0736\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5a73

    const v18, 0x1f047c9c

    xor-int v15, v15, v18

    const v18, 0x274569fd

    :goto_8
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    :goto_9
    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6a340277 -> :sswitch_0
        -0x645fc340 -> :sswitch_1
        -0x5ad834e4 -> :sswitch_b
        -0x5ac5ce4e -> :sswitch_e
        -0x55d4c03b -> :sswitch_a
        -0x5593c9b5 -> :sswitch_1
        -0x50cd9a10 -> :sswitch_4
        -0x4eebe870 -> :sswitch_d
        -0x4ea6693e -> :sswitch_9
        -0x4b5a9338 -> :sswitch_4
        -0x4142be0a -> :sswitch_f
        -0x39f757df -> :sswitch_3
        -0x338b63de -> :sswitch_f
        -0x292f0c2a -> :sswitch_c
        -0x24ac64f4 -> :sswitch_7
        -0x1bf7e86e -> :sswitch_8
        -0x1b282f21 -> :sswitch_a
        -0x18e2be18 -> :sswitch_7
        -0x16de0e84 -> :sswitch_6
        -0xe87ac08 -> :sswitch_10
        -0xa43464c -> :sswitch_10
        0x6fd98f8 -> :sswitch_d
        0xae38d54 -> :sswitch_6
        0xbe735ae -> :sswitch_0
        0x1dc45244 -> :sswitch_e
        0x2ae03dc5 -> :sswitch_5
        0x2ba3aac6 -> :sswitch_2
        0x331a5cbb -> :sswitch_9
        0x3a0f7a31 -> :sswitch_2
        0x452ff2bb -> :sswitch_b
        0x4d1cd8a7 -> :sswitch_c
        0x5bcbe39b -> :sswitch_8
        0x6711bfef -> :sswitch_3
        0x6c5a1b61 -> :sswitch_5
    .end sparse-switch
.end method
