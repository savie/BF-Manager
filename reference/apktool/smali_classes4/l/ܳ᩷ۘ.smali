.class public final Ll/ܳ᩷ۘ;
.super Ll/۫ܿ᩺;
.source "12B7"


# static fields
.field private static final ۧ᩹᩶:[S


# instance fields
.field public final synthetic ܺ:Ll/۬ܺۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳ᩷ۘ;->ۧ᩹᩶:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1400s
        -0x5c77s
        -0x5c73s
        -0x5c64s
        -0x3004s
        -0xd07s
        0x2539s
    .end array-data
.end method

.method public constructor <init>(Ll/۬ܺۘ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    iput-object p1, p0, Ll/ܳ᩷ۘ;->ܺ:Ll/۬ܺۘ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 22

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

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x4218e5ed

    sget v17, Ll/֡۠;->ۛ᩻ۧ:I

    sget v18, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v19, "\u0736\u06db"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    mul-int/lit8 v19, v19, 0x4d

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x3e69

    const v21, 0xd9fd54e

    xor-int v0, v0, v21

    const v21, -0x3b97efd3

    xor-int v19, v19, v21

    move-object v5, v4

    move-object/from16 v16, v7

    move-object v13, v12

    move-object v15, v14

    move/from16 v20, v19

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, -0x4218e5ed

    const/16 v21, 0x0

    move-object v4, v3

    move-object v7, v6

    const/4 v6, 0x0

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v9, v19, v17

    mul-int/lit16 v9, v9, -0x6f6f

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v0, v9

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    aget-short v10, v16, v21

    const v11, 0x871a

    .line 47
    sget-boolean v0, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v0, :cond_9

    goto/16 :goto_3

    .line 180
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "\u05a8\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x2d

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x4b87

    const v20, 0x46611a41

    xor-int v9, v9, v20

    const v20, 0x48c7c51

    goto/16 :goto_6

    .line 45
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v0

    if-lez v0, :cond_a

    goto/16 :goto_5

    .line 39
    :sswitch_2
    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_c

    goto :goto_1

    .line 221
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    return-void

    .line 224
    :sswitch_5
    invoke-static {v1, v6}, Ll/֡ۚ;->۬֡ۜ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ll/֫ܶ;->۟ܽܶ(Ljava/lang/Object;I)V

    return-void

    .line 223
    :sswitch_6
    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v6, 0x7e95c94e

    xor-int/2addr v6, v0

    .line 66
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_1

    :goto_1
    const-string v0, "\u06d6\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x7c59

    const v20, 0x4064ae89

    xor-int v9, v9, v20

    const v20, -0x1d38d3d7

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u1a73\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x52c9

    const v20, 0x230c2fe

    xor-int v9, v9, v20

    const v20, -0x20d6e04d

    goto/16 :goto_6

    :sswitch_7
    const/4 v0, 0x3

    .line 223
    invoke-static {v15, v8, v0, v12}, Ll/ۘۚ;->᩷᩺᩷([SIII)Ljava/lang/String;

    move-result-object v7

    .line 95
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u1a76\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x59

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x4481

    const v20, -0x5742cdbf

    xor-int v9, v9, v20

    const v20, 0x10666198

    goto/16 :goto_6

    .line 223
    :sswitch_8
    invoke-static {v2, v5, v4}, Ll/ۗ᩺;->ᩴۙۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܿۧ᩺;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۗ;->ܰܿܺ(Ljava/lang/Object;)V

    sget-object v15, Ll/ܳ᩷ۘ;->ۧ᩹᩶:[S

    const/4 v8, 0x4

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u0733\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x5665

    const v20, 0x40c6f562

    xor-int v9, v9, v20

    const v20, 0xd570aa5

    goto/16 :goto_6

    :sswitch_9
    const/4 v0, 0x3

    invoke-static {v13, v14, v0, v12}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v5

    sget-boolean v0, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x1877

    const v20, 0x3d7cdf74

    xor-int v9, v9, v20

    const v20, -0x1f48d6dd

    goto/16 :goto_6

    :sswitch_a
    invoke-static {v3}, Ll/ۚܺۘ;->ۖ(Ll/ۚܺۘ;)Ljava/lang/String;

    move-result-object v4

    sget-object v13, Ll/ܳ᩷ۘ;->ۧ᩹᩶:[S

    const/4 v14, 0x1

    .line 76
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v0, "\u06e2\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x1731

    const v20, 0x4237f661

    xor-int v9, v9, v20

    const v20, -0x6fe8b700

    goto/16 :goto_6

    .line 223
    :sswitch_b
    sget-object v0, Ll/֡᩺ۘ;->ܽ:Ll/ۛۧ᩺;

    invoke-static {v0}, Ll/ۖᩴ;->᩷ۘۧ(Ljava/lang/Object;)Ll/ܿۧ᩺;

    move-result-object v2

    invoke-static {v1}, Ll/۬ܺۘ;->ۖ(Ll/۬ܺۘ;)Ll/ۚܺۘ;

    move-result-object v3

    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06d6\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x59

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x42b9

    const v20, -0xa8c0890

    xor-int v9, v9, v20

    const v20, -0x7c522505

    goto/16 :goto_6

    :sswitch_c
    move-object/from16 v0, p0

    .line 221
    iget-object v1, v0, Ll/ܳ᩷ۘ;->ܺ:Ll/۬ܺۘ;

    invoke-static {v1}, Ll/۬ܺۘ;->ۖ(Ll/۬ܺۘ;)Ll/ۚܺۘ;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Ll/ۚܺۘ;->ܰ(Ll/ۚܺۘ;Ljava/lang/String;)V

    .line 69
    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06e4\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x53

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0xc2f

    const v20, -0x7e06ce5b

    xor-int v9, v9, v20

    const v20, 0x5a629d65

    goto/16 :goto_6

    :sswitch_d
    const v0, 0x9cd3

    const v12, 0x9cd3

    goto :goto_2

    :sswitch_e
    const v0, 0xa3ff

    const v12, 0xa3ff

    :goto_2
    const-string v0, "\u1a78\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x4fc1

    const v20, 0x1f01220

    xor-int v9, v9, v20

    const v20, 0x6c62fd6b

    goto/16 :goto_6

    :sswitch_f
    mul-int v0, v10, v11

    mul-int v9, v10, v10

    const v20, 0x11d31ba9

    add-int v9, v9, v20

    sub-int/2addr v9, v0

    if-gez v9, :cond_8

    const-string v0, "\u1a7a\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x654b

    const v20, -0x77d796df

    xor-int v9, v9, v20

    const v20, 0xceac8d3

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a75\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x2b

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x2dd7

    const v20, 0x67c1f8fc

    xor-int v9, v9, v20

    const v20, 0x38ac8b87

    goto/16 :goto_6

    :goto_3
    const-string v0, "\u1a73\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x249f

    const v20, -0x8aa4bb9

    xor-int v9, v9, v20

    const v20, -0x1d86fc5f

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u1a74\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x9

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x6f69

    const v20, 0x5fbc862f

    xor-int v9, v9, v20

    const v20, -0x5d4ab8e2

    goto :goto_6

    :sswitch_10
    const/16 v21, 0x0

    .line 7
    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u1a74\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x5d

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x6ff7

    const v20, -0x4bb459cd

    xor-int v9, v9, v20

    const v20, 0x1a6f78c7

    goto :goto_6

    :cond_b
    const-string v0, "\u06e7\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0xf1

    const v20, -0x16722e1e

    xor-int v9, v9, v20

    const v20, -0x5e6224b5

    goto :goto_6

    :sswitch_11
    sget-object v16, Ll/ܳ᩷ۘ;->ۧ᩹᩶:[S

    .line 68
    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x6f

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x79bd

    const v20, 0x6c6006c6

    xor-int v9, v9, v20

    const v20, 0x20592f33

    goto :goto_6

    :cond_d
    const-string v0, "\u06d8\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x315b

    const v20, -0x229623ce

    xor-int v9, v9, v20

    const v20, -0x6d23afd7

    :goto_6
    xor-int v20, v0, v20

    move v0, v9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cb2f9a2 -> :sswitch_11
        -0x7bfd4c13 -> :sswitch_2
        -0x77993b3f -> :sswitch_0
        -0x729f69a8 -> :sswitch_9
        -0x705477ba -> :sswitch_10
        -0x6896dfe6 -> :sswitch_1
        -0x529e4ed9 -> :sswitch_9
        -0x474c7b54 -> :sswitch_7
        -0x3f7da20e -> :sswitch_5
        -0x3a35afdc -> :sswitch_8
        -0x38fb85e4 -> :sswitch_0
        -0x2bf9b095 -> :sswitch_2
        -0x2a82ddf3 -> :sswitch_1
        -0x284670fb -> :sswitch_b
        -0x1f6be0e9 -> :sswitch_3
        -0x1da9e47a -> :sswitch_b
        -0xc2fce36 -> :sswitch_f
        -0xad83d0e -> :sswitch_4
        -0x5abecb7 -> :sswitch_5
        -0x4a36898 -> :sswitch_d
        -0x4f0a80 -> :sswitch_4
        0xf2bc0f -> :sswitch_7
        0x8843bbe -> :sswitch_6
        0xf1e9230 -> :sswitch_8
        0x119ef029 -> :sswitch_d
        0x12953b2c -> :sswitch_c
        0x18f95585 -> :sswitch_6
        0x1a9505b7 -> :sswitch_3
        0x318cb8b4 -> :sswitch_a
        0x34db0a2a -> :sswitch_e
        0x491ff1d0 -> :sswitch_c
        0x6217ae24 -> :sswitch_11
        0x6709ab70 -> :sswitch_f
        0x754b95f3 -> :sswitch_a
        0x7f21da27 -> :sswitch_e
        0x7f5471dd -> :sswitch_10
    .end sparse-switch
.end method
