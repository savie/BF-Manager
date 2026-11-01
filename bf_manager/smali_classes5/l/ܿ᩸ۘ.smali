.class public Ll/ܿ᩸ۘ;
.super Ll/ۗܺۘ;
.source "05NO"


# static fields
.field private static final ᩵ۘ۟:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x27

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩸ۘ;->᩵ۘ۟:[S

    return-void

    :array_0
    .array-data 2
        0x148bs
        -0x12c6s
        0x11efs
        0x1526s
        -0x7d7fs
        -0x7d36s
        -0x7d31s
        -0x7d26s
        -0x7d31s
        -0x7d7fs
        -0x7d36s
        -0x7d31s
        -0x7d26s
        -0x7d31s
        -0x7d7fs
        -0x7d34s
        -0x7d39s
        -0x7d40s
        -0x7d80s
        -0x7d3ds
        -0x7d26s
        -0x7d80s
        -0x7d22s
        -0x7d3es
        -0x7d25s
        -0x7d23s
        -0x7d7fs
        -0x7d16s
        -0x7d15s
        -0x7d14s
        -0x7d05s
        -0x7d17s
        -0x7d80s
        -0x7d3es
        -0x7d3fs
        -0x7d37s
        0x7d8s
        -0x593s
        -0x126fs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/ۗܺۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 23

    move-object/from16 v0, p0

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

    const v16, -0x4ea743d

    sget v17, Ll/֫ᩳ;->۬֨᩸:I

    sget v18, Ll/֡ܳ;->֡۠ۧ:I

    const-string v19, "\u073d\u06e7"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v18

    mul-int/lit8 v19, v19, 0x6b

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, 0x23df

    const v20, -0x7c34d21f

    xor-int v1, v1, v20

    const v20, 0x80b220

    xor-int v19, v19, v20

    move-object/from16 v21, v6

    const/16 v20, 0x0

    :goto_0
    xor-int v6, v16, v17

    mul-int/lit16 v6, v6, -0x14ab

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move/from16 v19, v7

    move/from16 v22, v9

    mul-int v10, v8, v22

    const/16 v11, 0x4ac6

    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_f

    goto/16 :goto_a

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v1

    if-ltz v1, :cond_1

    :cond_0
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_7

    :cond_1
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_5

    .line 4
    :sswitch_1
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_0

    :cond_2
    :goto_1
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_a

    :sswitch_2
    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_9

    .line 30
    :sswitch_3
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v1, :cond_2

    :cond_4
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_4

    :goto_2
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_e

    .line 1
    :sswitch_5
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_6

    :cond_5
    :goto_3
    move/from16 v19, v7

    move/from16 v22, v9

    goto/16 :goto_f

    :cond_6
    move/from16 v22, v9

    goto/16 :goto_c

    :sswitch_6
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v1

    if-gtz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06db\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x3f07

    const v19, -0x69fb9d89

    xor-int v6, v6, v19

    const v19, -0x1552921d

    xor-int v19, v1, v19

    goto/16 :goto_12

    .line 8
    :sswitch_7
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v1, :cond_5

    goto :goto_2

    .line 20
    :sswitch_8
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto :goto_2

    .line 3
    :sswitch_9
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    :sswitch_a
    return-void

    .line 24
    :sswitch_b
    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static/range {v20 .. v20}, Ll/ܶۜ᩵;->᩹(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    sget-object v6, Ll/ܿ᩸ۘ;->᩵ۘ۟:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move/from16 v19, v7

    const/16 v7, 0x24

    move/from16 v22, v9

    const/4 v9, 0x3

    :try_start_1
    invoke-static {v6, v7, v9, v13}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    const v7, 0x7d0e0b36

    xor-int/2addr v6, v7

    .line 25
    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 26
    invoke-static {v6, v1}, Ll/ۗ۬;->ۚܶۜ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x5d9d

    const v7, -0x8d12e90

    xor-int/2addr v6, v7

    const v7, 0x7a90b87a

    goto/16 :goto_10

    :catch_0
    move/from16 v19, v7

    move/from16 v22, v9

    goto :goto_4

    :sswitch_c
    move/from16 v19, v7

    move/from16 v22, v9

    if-eqz v2, :cond_8

    const-string v1, "\u0736\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x41dd

    const v7, 0x731712db

    xor-int/2addr v6, v7

    const v7, 0x35a401cd

    goto/16 :goto_10

    :sswitch_d
    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    return-void

    :sswitch_e
    move/from16 v19, v7

    move/from16 v22, v9

    .line 22
    :try_start_2
    new-instance v1, Ljava/io/File;

    sget-object v6, Ll/ܿ᩸ۘ;->᩵ۘ۟:[S

    const/4 v7, 0x4

    const/16 v9, 0x20

    invoke-static {v6, v7, v9, v13}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 23
    :try_start_3
    invoke-static {v1}, Ll/ۗ;->ۗᩳ᩵(Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const-string v6, "\u06eb\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v7, v6, v17

    mul-int/lit16 v7, v7, 0x1171

    const v9, -0x12722d59

    xor-int/2addr v7, v9

    const v9, 0x3ee0f529

    xor-int/2addr v6, v9

    move-object/from16 v20, v1

    move v1, v7

    move/from16 v7, v19

    move/from16 v9, v22

    move/from16 v19, v6

    goto/16 :goto_0

    :catch_1
    move-object/from16 v20, v1

    goto :goto_4

    :catch_2
    const/16 v20, 0x0

    :catch_3
    :cond_8
    :goto_4
    const-string v1, "\u06e8\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x2977

    const v7, -0x1494fb66

    xor-int/2addr v6, v7

    const v7, 0x3832ec72

    goto/16 :goto_10

    :sswitch_f
    move/from16 v19, v7

    move/from16 v22, v9

    xor-int v1, v4, v5

    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(I)V

    const-string v1, "\u1a79\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x49

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x56b1

    const v7, 0x2fa83668

    xor-int/2addr v6, v7

    const v7, -0x2a1184dc

    goto/16 :goto_10

    :sswitch_10
    move/from16 v19, v7

    move/from16 v22, v9

    .line 18
    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7eb846d9

    .line 8
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_9

    :goto_5
    const-string v1, "\u06d8\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x33

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x4bab

    const v7, -0x5071491c

    xor-int/2addr v6, v7

    const v7, 0x1419b27

    goto/16 :goto_10

    :cond_9
    const-string v1, "\u073f\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1f

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x2f5

    const v7, 0x5c584ab2

    xor-int/2addr v6, v7

    const v7, 0x46f36d23

    goto/16 :goto_10

    :sswitch_11
    move/from16 v19, v7

    move/from16 v22, v9

    const/4 v1, 0x3

    .line 18
    invoke-static {v14, v15, v1, v13}, Ll/֡ۛ;->ܰۙۚ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_a

    :goto_6
    const-string v1, "\u06d8\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x70f5

    const v7, -0x76cf89d7

    xor-int/2addr v6, v7

    const v7, 0x1cfb4205

    goto/16 :goto_10

    :cond_a
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x23

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x31d9

    const v7, -0x4fb0e147

    xor-int/2addr v6, v7

    const v7, -0x7d9e30ec

    goto/16 :goto_10

    :sswitch_12
    move/from16 v19, v7

    move/from16 v22, v9

    const/4 v15, 0x1

    .line 23
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_7

    :cond_b
    const-string v1, "\u073d\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x79

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x53d9

    const v7, 0x53fff83a

    xor-int/2addr v6, v7

    const v7, 0x640cdaf5

    goto/16 :goto_10

    :sswitch_13
    move/from16 v19, v7

    move/from16 v22, v9

    .line 18
    invoke-super/range {p0 .. p1}, Ll/ۗܺۘ;->onCreate(Landroid/os/Bundle;)V

    sget-object v14, Ll/ܿ᩸ۘ;->᩵ۘ۟:[S

    .line 11
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_c

    :goto_7
    const-string v1, "\u06d6\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x6161

    const v7, -0x28abd976

    xor-int/2addr v6, v7

    const v7, -0x3db41cde

    goto/16 :goto_10

    :cond_c
    const-string v1, "\u05a8\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x7497

    const v7, -0xf0db815

    xor-int/2addr v6, v7

    const v7, -0x364a3fe0    # -1488900.0f

    goto/16 :goto_10

    :sswitch_14
    move/from16 v19, v7

    move/from16 v22, v9

    const/16 v1, 0x7823

    const/16 v13, 0x7823

    goto :goto_8

    :sswitch_15
    move/from16 v19, v7

    move/from16 v22, v9

    const v1, 0x82ae

    const v13, 0x82ae

    :goto_8
    const-string v1, "\u073a\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x5f71

    const v7, -0x334dc1b4    # -9.345085E7f

    xor-int/2addr v6, v7

    const v7, -0x2d3da1f9

    goto/16 :goto_10

    :sswitch_16
    move/from16 v19, v7

    move/from16 v22, v9

    mul-int v1, v12, v12

    sub-int/2addr v1, v10

    if-ltz v1, :cond_d

    const-string v1, "\u1a74\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x329b

    const v7, 0x7fcbee7b

    xor-int/2addr v6, v7

    const v7, -0x6bdde993

    goto/16 :goto_10

    :cond_d
    const-string v1, "\u05a8\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x60fd

    const v7, -0x3d8559d9

    xor-int/2addr v6, v7

    const v7, 0x6eb552f5

    goto/16 :goto_10

    :sswitch_17
    move/from16 v19, v7

    move/from16 v22, v9

    add-int v12, v8, v11

    .line 5
    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_e

    :goto_9
    const-string v1, "\u1a7a\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2b

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x6d2f

    const v7, 0x2f6890d7

    xor-int/2addr v6, v7

    const v7, -0x6e18e762

    goto/16 :goto_10

    :cond_e
    const-string v1, "\u06e4\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0xf

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x728f

    const v7, -0x45c4dd8f

    xor-int/2addr v6, v7

    const v7, 0x6baa4b0c

    goto/16 :goto_10

    :goto_a
    const-string v1, "\u1a76\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x4679

    const v7, 0x7b9ea449    # 1.64743E36f

    xor-int/2addr v6, v7

    const v7, 0x137eb4

    goto/16 :goto_10

    :cond_f
    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x6b

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x67db

    const v7, 0x374ab0d5

    xor-int/2addr v6, v7

    const v7, 0x57571e46

    goto/16 :goto_10

    :sswitch_18
    move/from16 v19, v7

    aget-short v8, v21, v19

    const v9, 0x12b18

    .line 10
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_10

    const-string v1, "\u06e4\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x6847

    const v7, 0x42cff3c0

    xor-int/2addr v6, v7

    const v7, 0x15aec581

    goto :goto_b

    :cond_10
    const-string v1, "\u06e8\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x4923

    const v7, -0x4cad2393

    xor-int/2addr v6, v7

    const v7, -0x4f98546d

    :goto_b
    xor-int/2addr v1, v7

    move/from16 v7, v19

    goto/16 :goto_11

    :sswitch_19
    move/from16 v22, v9

    const/4 v7, 0x0

    .line 17
    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_11

    :goto_c
    const-string v1, "\u06e2\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1a51

    const v9, 0x6be36e51

    xor-int/2addr v6, v9

    const v9, -0x2538fca1

    goto :goto_d

    :cond_11
    const-string v1, "\u06d9\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x37

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x2b71

    const v9, -0x6d33178f

    xor-int/2addr v6, v9

    const v9, -0xe5fbca3

    :goto_d
    xor-int v19, v1, v9

    move v1, v6

    move/from16 v9, v22

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v19, v7

    move/from16 v22, v9

    sget-object v21, Ll/ܿ᩸ۘ;->᩵ۘ۟:[S

    .line 10
    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_12

    :goto_e
    const-string v1, "\u06d9\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x4d

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x465

    const v7, -0x46584829

    xor-int/2addr v6, v7

    const v7, 0x7cb0b0d6

    goto :goto_10

    :cond_12
    const-string v1, "\u06d7\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x3b

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x5f19

    const v7, 0x452cf7dd

    xor-int/2addr v6, v7

    const v7, 0x2eb84362

    goto :goto_10

    :sswitch_1b
    move/from16 v19, v7

    move/from16 v22, v9

    .line 5
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v1

    if-nez v1, :cond_13

    :goto_f
    const-string v1, "\u06d6\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x9

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x6841

    const v7, 0x69f1e915

    xor-int/2addr v6, v7

    const v7, 0x37e3d72

    goto :goto_10

    :cond_13
    const-string v1, "\u06df\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x5425

    const v7, -0x6bce3ebf

    xor-int/2addr v6, v7

    const v7, 0x34d55bbe

    :goto_10
    xor-int/2addr v1, v7

    move/from16 v7, v19

    move/from16 v9, v22

    :goto_11
    move/from16 v19, v1

    :goto_12
    move v1, v6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea73704 -> :sswitch_12
        -0x7d5a97b3 -> :sswitch_6
        -0x779d425a -> :sswitch_10
        -0x755ff379 -> :sswitch_13
        -0x7320dee4 -> :sswitch_f
        -0x70689567 -> :sswitch_a
        -0x664afc8a -> :sswitch_15
        -0x644f14cf -> :sswitch_12
        -0x5ce6c4f5 -> :sswitch_11
        -0x56c27e76 -> :sswitch_3
        -0x564ca6a8 -> :sswitch_1
        -0x54d6dd00 -> :sswitch_3
        -0x4ba28972 -> :sswitch_17
        -0x4b7a1f1f -> :sswitch_10
        -0x484b0ca0 -> :sswitch_b
        -0x4757d4f9 -> :sswitch_7
        -0x467fed72 -> :sswitch_16
        -0x43b3d259 -> :sswitch_11
        -0x39555cbd -> :sswitch_1a
        -0x363ac576 -> :sswitch_19
        -0x33bc6458 -> :sswitch_15
        -0x30b6476a -> :sswitch_6
        -0x2d9d4c48 -> :sswitch_e
        -0x11a821ca -> :sswitch_17
        -0xedc74e5 -> :sswitch_1b
        -0xbaa6776 -> :sswitch_c
        -0x732de70 -> :sswitch_1a
        -0x4e2c67c -> :sswitch_1
        -0x3aa63f7 -> :sswitch_d
        0x4cc319e -> :sswitch_19
        0xc052fdb -> :sswitch_7
        0x101cfa89 -> :sswitch_0
        0x180e869c -> :sswitch_8
        0x19c0a741 -> :sswitch_e
        0x19cbf828 -> :sswitch_a
        0x220990a7 -> :sswitch_14
        0x23bde459 -> :sswitch_16
        0x2447399b -> :sswitch_1b
        0x28d90e08 -> :sswitch_9
        0x3cb07935 -> :sswitch_14
        0x44992ceb -> :sswitch_5
        0x4dccaedb -> :sswitch_0
        0x4fa6bf63 -> :sswitch_8
        0x5215adf4 -> :sswitch_4
        0x57a56feb -> :sswitch_f
        0x5bb6ee0f -> :sswitch_13
        0x5dacf14c -> :sswitch_5
        0x5eff366b -> :sswitch_18
        0x66829f45 -> :sswitch_c
        0x6a37acb8 -> :sswitch_d
        0x6dc6508e -> :sswitch_b
        0x6ec862d4 -> :sswitch_18
        0x756c9712 -> :sswitch_4
        0x7c7838ec -> :sswitch_2
        0x7db164e0 -> :sswitch_2
        0x7dfc6ae2 -> :sswitch_9
    .end sparse-switch
.end method
