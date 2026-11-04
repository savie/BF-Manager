.class public Ll/ۗ۟֫;
.super Ll/۠᩷ۧ;
.source "05NO"


# static fields
.field private static final ۙ۬֨:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x27

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗ۟֫;->ۙ۬֨:[S

    return-void

    :array_0
    .array-data 2
        0x14fs
        -0x4d99s
        0x7238s
        0x63cbs
        -0x1e2ds
        -0x1e68s
        -0x1e63s
        -0x1e78s
        -0x1e63s
        -0x1e2ds
        -0x1e68s
        -0x1e63s
        -0x1e78s
        -0x1e63s
        -0x1e2ds
        -0x1e62s
        -0x1e6bs
        -0x1e6es
        -0x1e2es
        -0x1e6fs
        -0x1e78s
        -0x1e2es
        -0x1e74s
        -0x1e70s
        -0x1e77s
        -0x1e71s
        -0x1e2ds
        -0x1e48s
        -0x1e47s
        -0x1e42s
        -0x1e57s
        -0x1e45s
        -0x1e2es
        -0x1e70s
        -0x1e6ds
        -0x1e65s
        0x71ees
        0x72des
        -0x677cs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/۠᩷ۧ;-><init>()V

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

    const v15, 0x70ab6eee

    sget v16, Ll/ۖۖ;->᩵ۜ֨:I

    sget v17, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v18, "\u06e8\u1a73"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, -0x4e01

    const v19, 0xc57bb31

    xor-int v1, v1, v19

    const v19, 0x221058b7

    xor-int v18, v18, v19

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, -0x4b8f

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    const v11, 0x50555a4

    .line 28
    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_d

    goto/16 :goto_8

    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v1

    if-eqz v1, :cond_0

    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    goto/16 :goto_6

    :cond_0
    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x25

    move/from16 v18, v15

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x5645

    const v20, 0x731d75a8

    xor-int v15, v15, v20

    const v20, 0x3f1c81ba

    goto/16 :goto_4

    :sswitch_1
    move/from16 v18, v15

    .line 27
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v1

    if-gez v1, :cond_2

    :cond_1
    :goto_1
    move-object/from16 v20, v4

    move/from16 v21, v5

    goto/16 :goto_9

    :cond_2
    move-object/from16 v20, v4

    move/from16 v21, v5

    goto/16 :goto_6

    :sswitch_2
    move/from16 v18, v15

    .line 1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v20, v4

    move/from16 v21, v5

    goto/16 :goto_8

    :sswitch_3
    move/from16 v18, v15

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v21, v5

    goto/16 :goto_c

    :sswitch_4
    move/from16 v18, v15

    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v1, :cond_6

    :cond_5
    :goto_2
    move-object/from16 v20, v4

    goto/16 :goto_e

    :cond_6
    const-string v1, "\u05ab\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, 0x52b5

    const v20, -0x7c09596f

    xor-int v15, v15, v20

    const v20, -0x6fd3eafd

    goto :goto_4

    :sswitch_5
    move/from16 v18, v15

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v1, :cond_7

    goto :goto_2

    :cond_7
    move-object/from16 v20, v4

    move/from16 v21, v5

    goto/16 :goto_a

    :sswitch_6
    move/from16 v18, v15

    .line 9
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :sswitch_7
    move/from16 v18, v15

    .line 20
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v1, :cond_1

    goto :goto_3

    :sswitch_8
    move/from16 v18, v15

    .line 28
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    :goto_3
    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x4ed7

    const v20, 0x31d66bc0

    xor-int v15, v15, v20

    const v20, -0x7f896b80

    :goto_4
    xor-int v1, v1, v20

    move/from16 v22, v18

    move/from16 v18, v1

    move v1, v15

    move/from16 v15, v22

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    :sswitch_a
    return-void

    :sswitch_b
    move/from16 v18, v15

    .line 24
    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static/range {v19 .. v19}, Ll/֡ۗۨ;->ܳ(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    sget-object v15, Ll/ۗ۟֫;->ۙ۬֨:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v20, v4

    const/16 v4, 0x24

    move/from16 v21, v5

    const/4 v5, 0x3

    :try_start_1
    invoke-static {v15, v4, v5, v12}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7d25181c

    xor-int/2addr v4, v5

    .line 25
    invoke-virtual {v0, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 26
    invoke-static {v4, v1}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x42f1

    const v5, -0x44a3f2fb

    xor-int/2addr v4, v5

    const v5, -0x3ff25ffb

    goto/16 :goto_f

    :catch_0
    move-object/from16 v20, v4

    move/from16 v21, v5

    goto :goto_5

    :sswitch_c
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    if-eqz v2, :cond_8

    const-string v1, "\u06eb\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2879

    const v5, 0x1fd4afad

    xor-int/2addr v4, v5

    const v5, 0x99f0e99

    goto/16 :goto_f

    :sswitch_d
    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    return-void

    :sswitch_e
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    .line 22
    :try_start_2
    new-instance v1, Ljava/io/File;

    sget-object v4, Ll/ۗ۟֫;->ۙ۬֨:[S

    const/4 v5, 0x4

    const/16 v15, 0x20

    invoke-static {v4, v5, v15, v12}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 23
    :try_start_3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const-string v4, "\u06db\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    xor-int v5, v4, v17

    mul-int/lit16 v5, v5, -0x7dd5

    const v15, -0x558798b5

    xor-int/2addr v5, v15

    const v15, -0x6284d82b

    xor-int/2addr v4, v15

    move-object/from16 v19, v1

    move v1, v5

    move/from16 v15, v18

    move/from16 v5, v21

    move/from16 v18, v4

    goto/16 :goto_11

    :catch_1
    move-object/from16 v19, v1

    goto :goto_5

    :catch_2
    const/16 v19, 0x0

    :catch_3
    :cond_8
    :goto_5
    const-string v1, "\u0736\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x790d

    const v5, 0x2fc836f

    xor-int/2addr v4, v5

    const v5, 0x58d768a6

    goto/16 :goto_f

    :sswitch_f
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    .line 18
    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7e413fec

    xor-int/2addr v1, v4

    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(I)V

    const-string v1, "\u06d7\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x11

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x9c1

    const v5, 0x234d94fd

    xor-int/2addr v4, v5

    const v5, -0x5b5060b6

    goto/16 :goto_f

    :sswitch_10
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    const/4 v1, 0x3

    .line 18
    invoke-static {v13, v14, v1, v12}, Ll/᩶;->ᩳܿܰ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_9

    goto :goto_6

    :cond_9
    const-string v1, "\u06dc\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0xf55

    const v5, -0x2110f178

    xor-int/2addr v4, v5

    const v5, 0x78cf2969

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    const/4 v14, 0x1

    .line 17
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_a

    :goto_6
    const-string v1, "\u073d\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x155b

    const v5, 0xee8dda1

    xor-int/2addr v4, v5

    const v5, -0x152f4e95

    goto/16 :goto_f

    :cond_a
    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x7c9f

    const v5, -0xc25980c

    xor-int/2addr v4, v5

    const v5, 0x68b524c6

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    .line 18
    invoke-super/range {p0 .. p1}, Ll/۠᩷ۧ;->onCreate(Landroid/os/Bundle;)V

    sget-object v13, Ll/ۗ۟֫;->ۙ۬֨:[S

    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x71

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x6da7

    const v5, -0x26a7e3b0

    xor-int/2addr v4, v5

    const v5, 0x3f3a6f82

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    const/16 v1, 0x36b4

    const/16 v12, 0x36b4

    goto :goto_7

    :sswitch_14
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    const v1, 0xe1fc

    const v12, 0xe1fc

    :goto_7
    const-string v1, "\u1a79\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0xfad

    const v5, -0x277bb6b

    xor-int/2addr v4, v5

    const v5, -0x734b7101

    goto/16 :goto_f

    :sswitch_15
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int/2addr v1, v9

    if-ltz v1, :cond_c

    const-string v1, "\u073a\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x13

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x29af

    const v5, -0x2fdf74b0

    xor-int/2addr v4, v5

    const v5, 0x49f6461

    goto/16 :goto_f

    :cond_c
    const-string v1, "\u1a7b\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x65

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x4ef5

    const v5, -0x6c62a3c4

    xor-int/2addr v4, v5

    const v5, 0x38cd5b45

    goto/16 :goto_f

    :goto_8
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x15f7

    const v5, 0x1d220a97

    xor-int/2addr v4, v5

    const v5, -0x59bc37c8

    goto/16 :goto_f

    :cond_d
    const-string v1, "\u06d8\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x45

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x6701

    const v5, 0x3ba1af57

    xor-int/2addr v4, v5

    const v5, -0x6a8e2db0

    goto/16 :goto_f

    :sswitch_16
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    mul-int v9, v8, v8

    mul-int v10, v6, v6

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v1, :cond_e

    :goto_9
    const-string v1, "\u073d\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7f

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x5ec3

    const v5, -0x242bc255    # -1.19481E17f

    xor-int/2addr v4, v5

    const v5, -0x36bbb927

    goto/16 :goto_f

    :cond_e
    const-string v1, "\u1a73\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x3d19

    const v5, -0x4348215d

    xor-int/2addr v4, v5

    const v5, -0x50d245e1

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    add-int v8, v6, v7

    .line 23
    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v1, :cond_f

    const-string v1, "\u05a1\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x75

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x76c9

    const v5, 0x55307ed1

    xor-int/2addr v4, v5

    const v5, -0x438480a0

    goto/16 :goto_f

    :cond_f
    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x5609

    const v5, -0x56f215c2

    xor-int/2addr v4, v5

    const v5, -0x2961c1d2

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    aget-short v6, v20, v21

    const/16 v7, 0x23da

    .line 19
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v1

    if-nez v1, :cond_10

    :goto_a
    const-string v1, "\u073a\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x4bed

    const v5, 0x58fe93ef

    xor-int/2addr v4, v5

    const v5, -0x7d3151c8

    goto/16 :goto_f

    :cond_10
    const-string v1, "\u06eb\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2de7

    const v5, 0x271e6322

    xor-int/2addr v4, v5

    const v5, 0x6508b9b

    goto/16 :goto_f

    :sswitch_19
    move-object/from16 v20, v4

    move/from16 v18, v15

    const/4 v5, 0x0

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_11

    goto :goto_e

    :cond_11
    const-string v1, "\u1a79\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x6897

    const v15, 0x20a45928

    xor-int/2addr v4, v15

    const v15, 0x1d7572f

    :goto_b
    xor-int/2addr v1, v15

    move/from16 v15, v18

    goto/16 :goto_10

    :sswitch_1a
    move/from16 v21, v5

    move/from16 v18, v15

    sget-object v4, Ll/ۗ۟֫;->ۙ۬֨:[S

    .line 23
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_12

    :goto_c
    const-string v1, "\u073f\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x6243

    const v15, -0x6153f6d6

    xor-int/2addr v5, v15

    const v15, -0x2a7161bc

    goto :goto_d

    :cond_12
    const-string v1, "\u06e1\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x65

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0xee9

    const v15, -0x7306bc4e

    xor-int/2addr v5, v15

    const v15, 0x2a007b21

    :goto_d
    xor-int/2addr v1, v15

    move/from16 v15, v18

    move/from16 v18, v1

    move v1, v5

    move/from16 v5, v21

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v20, v4

    move/from16 v21, v5

    move/from16 v18, v15

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_13

    move/from16 v5, v21

    :goto_e
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x39

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0xd53

    const v15, 0x5fb4a508

    xor-int/2addr v4, v15

    const v15, 0x492e991b

    goto :goto_b

    :cond_13
    const-string v1, "\u06d8\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x7999

    const v5, -0x7bddd585

    xor-int/2addr v4, v5

    const v5, 0x745e6ff7

    :goto_f
    xor-int/2addr v1, v5

    move/from16 v15, v18

    move/from16 v5, v21

    :goto_10
    move/from16 v18, v1

    move v1, v4

    :goto_11
    move-object/from16 v4, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a004e36 -> :sswitch_11
        -0x6fe474c3 -> :sswitch_d
        -0x6e4b9ac2 -> :sswitch_18
        -0x6db8c0de -> :sswitch_8
        -0x696cbdcd -> :sswitch_7
        -0x695299b9 -> :sswitch_8
        -0x68d18d8a -> :sswitch_11
        -0x64b2f0c6 -> :sswitch_5
        -0x61bdbcec -> :sswitch_1a
        -0x4d8f5e54 -> :sswitch_1b
        -0x4d3486ac -> :sswitch_d
        -0x45521504 -> :sswitch_b
        -0x38d3697b -> :sswitch_f
        -0x33af887b -> :sswitch_13
        -0x311d4893 -> :sswitch_17
        -0x30ebf359 -> :sswitch_3
        -0x2f53dab6 -> :sswitch_e
        -0x2776052a -> :sswitch_12
        -0x20737487 -> :sswitch_19
        -0x1e46b16d -> :sswitch_7
        -0x1c7cf60e -> :sswitch_b
        -0x1766de5c -> :sswitch_3
        -0x1750048b -> :sswitch_f
        -0x12f2f5b4 -> :sswitch_16
        -0xf1236bb -> :sswitch_17
        -0xacfce7d -> :sswitch_15
        -0x3e112cc -> :sswitch_1
        0x47a2a2a -> :sswitch_1a
        0x5ca76ec -> :sswitch_10
        0x72865fc -> :sswitch_1b
        0xd1bc0be -> :sswitch_c
        0xfb5bd83 -> :sswitch_6
        0x12ae5dd4 -> :sswitch_6
        0x15e30798 -> :sswitch_9
        0x1ee6eba5 -> :sswitch_1
        0x25e291d0 -> :sswitch_c
        0x360f180f -> :sswitch_19
        0x439bde27 -> :sswitch_e
        0x43f40e94 -> :sswitch_0
        0x45ee6cc3 -> :sswitch_4
        0x46feec3d -> :sswitch_16
        0x506d4e75 -> :sswitch_a
        0x5247eec1 -> :sswitch_0
        0x53221020 -> :sswitch_4
        0x594bea3c -> :sswitch_a
        0x63274455 -> :sswitch_13
        0x63598fe1 -> :sswitch_14
        0x648a2e0d -> :sswitch_14
        0x66ab3660 -> :sswitch_12
        0x674dd10b -> :sswitch_18
        0x6a6ab85b -> :sswitch_9
        0x6f07fe62 -> :sswitch_10
        0x73d6f714 -> :sswitch_2
        0x7a3028a9 -> :sswitch_5
        0x7c9f4b6e -> :sswitch_2
        0x7f691345 -> :sswitch_15
    .end sparse-switch
.end method
