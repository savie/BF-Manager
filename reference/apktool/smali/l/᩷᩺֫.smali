.class public final Ll/᩷᩺֫;
.super Ljava/lang/Object;
.source "R2SJ"

# interfaces
.implements Ll/᩸᩺֫;


# static fields
.field private static final ᩻ۖ᩵:[S


# instance fields
.field public ۙ:I

.field public ᩷:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    return-void

    :array_0
    .array-data 2
        0x1a82s
        0x36b3s
        0x36ecs
        0x36f0s
        0x36e9s
        0x36fbs
        0x36f5s
        0x36f2s
        0x36b3s
        0x36f0s
        0x36f5s
        0x36efs
        0x36e8s
        0x36b3s
        0x36ffs
        0x36e9s
        0x36ees
        0x36ees
        0x36f9s
        0x36f2s
        0x36e8s
        0x36ccs
        0x36fds
        0x36fbs
        0x36f9s
        0x36e8s
        0x36f3s
        0x36e8s
        0x36fds
        0x36f0s
        0x36ccs
        0x36fds
        0x36fbs
        0x36f9s
        0x36f5s
        0x36e8s
        0x36f9s
        0x36f1s
        0x36efs
        0x36f7s
        0x36f5s
        0x36f2s
        0x36f8s
        0x36eas
        0x36ffs
        0x36efs
        0x36f3s
    .end array-data
.end method


# virtual methods
.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Ll/᩷᩺֫;->᩷:I

    iput v0, p0, Ll/᩷᩺֫;->ۙ:I

    return-void
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 31

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

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x14bc048f

    sget v22, Ll/ۗ᩺;->֡ۙۜ:I

    sget v23, Ll/֡۟;->᩶᩺ܰ:I

    const-string v24, "\u1a7a\u0733"

    invoke-static/range {v24 .. v24}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    xor-int v1, v24, v23

    mul-int/lit16 v1, v1, -0x592d

    const v26, 0x5cb9990e

    xor-int v1, v1, v26

    const v26, 0x45647e49

    xor-int v24, v24, v26

    move-object/from16 v20, v3

    move-object/from16 v25, v4

    move-object v7, v6

    move-object v10, v9

    move-wide v14, v13

    move-object/from16 v3, v19

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v6, v5

    move-object v9, v8

    move-object v13, v12

    const/4 v8, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    :goto_0
    xor-int v5, v21, v23

    mul-int/lit16 v5, v5, 0x22f5

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v21, v24, v1

    sparse-switch v21, :sswitch_data_0

    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    mul-int v1, v18, v18

    const v2, 0xe218

    mul-int v2, v2, v17

    sub-int/2addr v1, v2

    if-gez v1, :cond_10

    const-string v1, "\u06e0\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x59

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x4c5b

    const v3, 0x3c2fd309

    xor-int/2addr v2, v3

    const v3, 0x3f8d8292

    goto/16 :goto_10

    .line 604
    :sswitch_0
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-gez v1, :cond_0

    :goto_1
    move-object/from16 v1, p0

    move/from16 v24, v2

    :goto_2
    move-object/from16 v2, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move/from16 v28, v19

    move-object/from16 v19, v3

    move/from16 v3, v28

    goto/16 :goto_9

    :cond_0
    move/from16 v24, v2

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_2

    :cond_1
    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    goto/16 :goto_c

    :cond_2
    move/from16 v24, v2

    goto/16 :goto_6

    .line 563
    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v1, :cond_1

    goto :goto_1

    .line 646
    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto :goto_1

    .line 453
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    .line 134
    :sswitch_5
    invoke-virtual {v10, v2}, Ll/ۤ᩺֫;->ۙ(Z)V

    .line 135
    invoke-static {v7, v10}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    move/from16 v24, v2

    move-object/from16 v1, v20

    move-object/from16 v2, v25

    goto/16 :goto_8

    :sswitch_6
    const/4 v1, 0x1

    const/4 v2, 0x1

    goto :goto_3

    :sswitch_7
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    const-string v1, "\u073d\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v5, v1, v22

    mul-int/lit16 v5, v5, 0x145

    const v24, -0x290a3b98

    xor-int v5, v5, v24

    const v24, 0x4e572366    # 9.023553E8f

    xor-int v24, v1, v24

    move v1, v5

    goto/16 :goto_0

    .line 133
    :sswitch_8
    invoke-virtual {v10, v14, v15}, Ll/ۤ᩺֫;->ۙ(J)V

    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v5, 0x2e

    move/from16 v24, v2

    const/4 v2, 0x1

    invoke-static {v1, v5, v2, v0}, Ll/֡ۖ;->ܰᩴۢ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 134
    invoke-static {v9, v1}, Ll/ۖܰ;->۫ۗۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "\u06d9\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x17

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x5527

    const v5, 0x70639d1c

    xor-int/2addr v2, v5

    const v5, 0x483cf899

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u073a\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x1ce7

    const v5, 0x5d6d31e1

    xor-int/2addr v2, v5

    const v5, -0x4443d1df

    goto/16 :goto_7

    :sswitch_9
    move/from16 v24, v2

    .line 132
    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x2d

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/ۗ֨;->ᩴᩴܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 133
    invoke-static {v9, v1}, Ll/ۖܰ;->۫ۗۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    int-to-long v14, v1

    .line 469
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v1

    if-ltz v1, :cond_4

    goto :goto_4

    :cond_4
    const-string v1, "\u05ab\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, -0x5311

    const v5, 0x1faf3f65

    xor-int/2addr v2, v5

    const v5, -0x4457b62c

    goto/16 :goto_7

    :sswitch_a
    move/from16 v24, v2

    .line 131
    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x2c

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/֫۠;->۟ܿۖ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 132
    invoke-static {v9, v1}, Ll/ۖ֡;->۠ۛܰ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v10, v1}, Ll/ۤ᩺֫;->ᩴ(I)V

    .line 447
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x6479

    const v5, 0x3143dd15

    xor-int/2addr v2, v5

    const v5, 0x6f2b185d

    goto/16 :goto_7

    :sswitch_b
    move/from16 v24, v2

    .line 130
    invoke-virtual {v10, v13}, Ll/ۤ᩺֫;->ۙ(Ljava/lang/String;)V

    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x2b

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 131
    invoke-static {v9, v1}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ۤ᩺֫;->ۚ(Ljava/lang/String;)V

    .line 575
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_6

    :goto_4
    const-string v1, "\u0730\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x79

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0xa19

    const v5, 0xdd92a4

    xor-int/2addr v2, v5

    const v5, 0x483a003b

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u1a75\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x2e85

    const v5, -0x6011d5c2

    xor-int/2addr v2, v5

    const v5, 0x68b39f9a

    goto/16 :goto_7

    :sswitch_c
    move/from16 v24, v2

    .line 129
    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x2a

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/ۗ֨;->ᩴᩴܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-static {v9, v1}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 357
    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_7

    move-object/from16 v1, p0

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    goto/16 :goto_a

    :cond_7
    const-string v1, "\u06da\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x3243

    const v5, 0x707e2d9f

    xor-int/2addr v2, v5

    const v5, -0x356a41fb    # -4906754.5f

    goto/16 :goto_7

    :sswitch_d
    move/from16 v24, v2

    .line 128
    invoke-virtual {v10, v12}, Ll/ۤ᩺֫;->᩸(Ljava/lang/String;)V

    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x29

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/ۧ;->ۘۧۜ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 129
    invoke-static {v9, v1}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ۤ᩺֫;->ۤ(Ljava/lang/String;)V

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    const-string v1, "\u073d\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x5f

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x59ad

    const v5, -0x3f46bbaf

    xor-int/2addr v2, v5

    const v5, 0x764d38e2

    goto/16 :goto_7

    :sswitch_e
    move/from16 v24, v2

    .line 127
    invoke-virtual {v10, v11}, Ll/ۤ᩺֫;->ۤ(I)V

    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v2, 0x28

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v0}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 128
    invoke-static {v9, v1}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 481
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_9

    :goto_5
    move-object/from16 v1, p0

    goto/16 :goto_2

    :cond_9
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, -0x1085

    const v5, 0x5cae33bb

    xor-int/2addr v2, v5

    const v5, 0x79824d4a

    goto/16 :goto_7

    :sswitch_f
    move/from16 v24, v2

    const/4 v1, 0x1

    .line 126
    invoke-static {v3, v4, v1, v0}, Ll/ۘܽ;->ۡۗܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-static {v9, v1}, Ll/ۖ֡;->۠ۛܰ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v11

    .line 452
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_a

    :goto_6
    const-string v1, "\u06e1\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x2c3b

    const v5, -0x28a88a5

    xor-int/2addr v2, v5

    const v5, -0x6f036ed6

    goto :goto_7

    :cond_a
    const-string v1, "\u1a74\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x2f0d

    const v5, 0x3a9169bd

    xor-int/2addr v2, v5

    const v5, 0xee06542

    goto :goto_7

    :sswitch_10
    move/from16 v24, v2

    .line 125
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 126
    new-instance v10, Ll/ۤ᩺֫;

    invoke-direct {v10}, Ll/ۤ᩺֫;-><init>()V

    sget-object v3, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v4, 0x27

    const-string v1, "\u06df\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x15

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x27cf

    const v5, -0x3084cf7d

    xor-int/2addr v2, v5

    const v5, 0x5bdcf61f

    goto :goto_7

    :sswitch_11
    return-object v7

    :sswitch_12
    move/from16 v24, v2

    .line 124
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v8, v1, :cond_b

    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x2bd3

    const v5, 0x5bab9f82

    xor-int/2addr v2, v5

    const v5, -0x12f78638

    goto :goto_7

    :cond_b
    const-string v1, "\u06e0\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x3933

    const v5, 0x66c13cd1

    xor-int/2addr v2, v5

    const v5, -0xa7196af

    :goto_7
    xor-int/2addr v1, v5

    move/from16 v28, v24

    move/from16 v24, v1

    move v1, v2

    goto/16 :goto_e

    :sswitch_13
    move/from16 v24, v2

    move-object/from16 v1, v20

    move-object/from16 v2, v25

    .line 122
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 123
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    move-object v7, v6

    const/4 v8, 0x0

    move-object v6, v5

    :goto_8
    const-string v5, "\u1a7a\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v22

    mul-int/lit8 v5, v5, 0x1d

    move-object/from16 v20, v1

    xor-int v1, v5, v23

    mul-int/lit16 v1, v1, 0x6081

    const v25, -0x3a7e0d76

    xor-int v1, v1, v25

    const v25, -0x53037810

    xor-int v5, v5, v25

    move-object/from16 v25, v2

    move/from16 v2, v24

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v1, p0

    move/from16 v24, v2

    move/from16 v5, v19

    .line 121
    iput v5, v1, Ll/᩷᩺֫;->᩷:I

    .line 122
    invoke-virtual/range {v16 .. v16}, Ll/ۢۛ֫;->ۤ()Lorg/json/JSONObject;

    move-result-object v20

    sget-object v2, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    move-object/from16 v19, v3

    const/16 v3, 0x22

    move/from16 v25, v4

    const/4 v4, 0x5

    invoke-static {v2, v3, v4, v0}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    xor-int v4, v3, v22

    mul-int/lit16 v4, v4, 0x546b

    const v26, 0x41929821

    xor-int v4, v4, v26

    const v26, 0x5bc2ebe6

    xor-int v3, v3, v26

    move v1, v4

    move/from16 v4, v25

    move-object/from16 v25, v2

    move/from16 v2, v24

    move/from16 v24, v3

    move-object/from16 v3, v19

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v1, p0

    move/from16 v24, v2

    move-object/from16 v19, v3

    move-object/from16 v2, v25

    move/from16 v25, v4

    .line 120
    sget-object v3, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v4, 0x19

    const/16 v5, 0x9

    invoke-static {v3, v4, v5, v0}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v16

    .line 121
    invoke-virtual {v4, v3}, Ll/ۢۛ֫;->᩷(Ljava/lang/String;)I

    move-result v3

    .line 212
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_c

    :goto_9
    const-string v5, "\u1a74\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v22

    move-object/from16 v16, v2

    xor-int v2, v5, v23

    mul-int/lit16 v2, v2, 0x4f0d

    const v26, -0x550317c1

    xor-int v2, v2, v26

    const v26, 0x4b2d4030    # 1.135416E7f

    xor-int v5, v5, v26

    move v1, v2

    move/from16 v2, v24

    move/from16 v24, v5

    move-object/from16 v28, v19

    move/from16 v19, v3

    move-object/from16 v3, v28

    goto/16 :goto_12

    :cond_c
    move-object/from16 v16, v2

    const-string v2, "\u0730\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v23

    mul-int/lit8 v2, v2, -0x19

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x640d

    const v26, -0x33a0788d    # -5.8596812E7f

    xor-int v5, v5, v26

    const v26, -0x5f1447c6

    xor-int v2, v2, v26

    move v1, v5

    move/from16 v28, v24

    move/from16 v24, v2

    move/from16 v2, v28

    move-object/from16 v29, v19

    move/from16 v19, v3

    move-object/from16 v3, v29

    move-object/from16 v30, v16

    move-object/from16 v16, v4

    move/from16 v4, v25

    move-object/from16 v25, v30

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v1, p0

    move/from16 v24, v2

    move/from16 v5, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    .line 118
    sget-object v2, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v3, 0xe

    move/from16 v26, v5

    const/16 v5, 0xb

    invoke-static {v2, v3, v5, v0}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-virtual {v4, v2}, Ll/ۢۛ֫;->᩷(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Ll/᩷᩺֫;->ۙ:I

    .line 377
    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v2, :cond_d

    :goto_a
    const-string v2, "\u073d\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v23

    mul-int/lit8 v2, v2, 0x61

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x4d7f

    const v5, 0x15520426

    xor-int/2addr v3, v5

    const v5, 0x760f62bf

    goto :goto_b

    :cond_d
    const-string v2, "\u073d\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x5fdf

    const v5, -0x55286493

    xor-int/2addr v3, v5

    const v5, -0x2f3a0cd8

    :goto_b
    xor-int/2addr v2, v5

    move v1, v3

    move-object/from16 v3, v19

    move/from16 v19, v26

    move/from16 v28, v24

    move/from16 v24, v2

    goto/16 :goto_11

    :sswitch_17
    move-object/from16 v1, p0

    move-object/from16 v4, v16

    .line 119
    new-instance v0, Ll/ۙۧܺ;

    invoke-virtual {v4}, Ll/ۢۛ֫;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0

    :sswitch_18
    move-object/from16 v1, p0

    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    .line 117
    iget v2, v1, Ll/᩷᩺֫;->ۙ:I

    add-int/lit8 v2, v2, 0x1

    sget v3, Ll/۬ۛ֫;->ۙ:I

    .line 664
    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v5, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/16 v1, 0xd

    sget v27, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v27, :cond_e

    :goto_c
    const-string v1, "\u06eb\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0xbf

    const v3, -0x2e16c4a4

    xor-int/2addr v2, v3

    const v3, -0x153ea7d5

    goto/16 :goto_10

    :cond_e
    const/4 v4, 0x1

    invoke-static {v5, v4, v1, v0}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v2}, Ll/ۘ֡;->ᩳ᩸ܺ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v3}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 665
    invoke-static {v1}, Ll/ᩳۛ֫;->ۙ(Ljava/lang/String;)Ll/ᩳۛ֫;

    move-result-object v1

    .line 666
    invoke-virtual {v1}, Ll/ᩳۛ֫;->᩷()Ll/ۢۛ֫;

    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ll/ۢۛ֫;->᩸()Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u05ab\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, 0x2b

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x47fd

    const v4, 0x60e8a0bb

    xor-int/2addr v3, v4

    const v4, 0x61a4deb1

    goto :goto_d

    :cond_f
    const-string v2, "\u06e0\u1a78"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    mul-int/lit8 v2, v2, 0x59

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x3145

    const v4, -0x712dd7f3

    xor-int/2addr v3, v4

    const v4, 0x5bdf6d92

    :goto_d
    xor-int/2addr v2, v4

    move/from16 v4, v25

    move-object/from16 v25, v16

    move-object/from16 v16, v1

    move v1, v3

    move-object/from16 v3, v19

    move/from16 v19, v26

    move/from16 v28, v24

    move/from16 v24, v2

    :goto_e
    move/from16 v2, v28

    goto/16 :goto_0

    :sswitch_19
    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    const v0, 0x80af

    goto :goto_f

    :sswitch_1a
    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    const/16 v0, 0x369c

    :goto_f
    const-string v1, "\u06e2\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x4f

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x757

    const v3, -0x52622b3b

    xor-int/2addr v2, v3

    const v3, -0x2d826b91

    goto :goto_10

    :cond_10
    const-string v1, "\u1a79\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0xf

    xor-int v2, v1, v23

    mul-int/lit16 v2, v2, 0x5dd5

    const v3, -0x344ea3c5    # -2.3246966E7f

    xor-int/2addr v2, v3

    const v3, -0x4276414e

    :goto_10
    xor-int/2addr v1, v3

    move-object/from16 v3, v19

    move/from16 v19, v26

    move/from16 v28, v24

    move/from16 v24, v1

    move v1, v2

    :goto_11
    move/from16 v2, v28

    :goto_12
    move-object/from16 v29, v16

    move-object/from16 v16, v4

    move/from16 v4, v25

    move-object/from16 v25, v29

    goto/16 :goto_0

    :sswitch_1b
    move/from16 v24, v2

    move/from16 v26, v19

    move-object/from16 v19, v3

    move-object/from16 v28, v25

    move/from16 v25, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v28

    sget-object v1, Ll/᩷᩺֫;->᩻ۖ᩵:[S

    const/4 v2, 0x0

    aget-short v1, v1, v2

    add-int/lit16 v2, v1, 0x3886

    const-string v3, "\u06ec\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    mul-int/lit8 v3, v3, 0x69

    xor-int v5, v3, v22

    mul-int/lit16 v5, v5, 0x4ecd

    const v17, -0x765543fc

    xor-int v5, v5, v17

    const v17, 0x51cca6cd

    xor-int v3, v3, v17

    move/from16 v17, v1

    move/from16 v18, v2

    move v1, v5

    move/from16 v2, v24

    move/from16 v24, v3

    move-object/from16 v3, v19

    move/from16 v19, v26

    move-object/from16 v28, v16

    move-object/from16 v16, v4

    move/from16 v4, v25

    move-object/from16 v25, v28

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c58983b -> :sswitch_b
        -0x742933c5 -> :sswitch_10
        -0x7192545e -> :sswitch_17
        -0x6dc910de -> :sswitch_15
        -0x681d0c0e -> :sswitch_14
        -0x640c1a87 -> :sswitch_e
        -0x63e7fb7d -> :sswitch_0
        -0x60038042 -> :sswitch_19
        -0x5814b4a8 -> :sswitch_4
        -0x4b5da6f0 -> :sswitch_e
        -0x44ff8acf -> :sswitch_f
        -0x3db22505 -> :sswitch_10
        -0x3d109236 -> :sswitch_14
        -0x3a78e29d -> :sswitch_3
        -0x2f8874f7 -> :sswitch_1b
        -0x2df1ae0f -> :sswitch_18
        -0x24c965a2 -> :sswitch_0
        -0x21c14a4b -> :sswitch_4
        -0x1ed77e03 -> :sswitch_9
        -0x1a3d229b -> :sswitch_12
        -0x147ffbab -> :sswitch_f
        -0x136da07a -> :sswitch_d
        -0xfc2736f -> :sswitch_a
        -0x9252202 -> :sswitch_11
        -0xdd371d -> :sswitch_18
        0x23d4e54 -> :sswitch_c
        0x24fe7df -> :sswitch_7
        0x5ecb029 -> :sswitch_2
        0x642214f -> :sswitch_1a
        0x73bad4a -> :sswitch_1b
        0xe00174a -> :sswitch_6
        0x12fc4ef0 -> :sswitch_3
        0x18c7d47e -> :sswitch_1a
        0x2154be06 -> :sswitch_2
        0x27eb4493 -> :sswitch_5
        0x2cdd9326 -> :sswitch_c
        0x2eb83188 -> :sswitch_8
        0x32384b47 -> :sswitch_16
        0x33a5a63e -> :sswitch_7
        0x34a0e07d -> :sswitch_17
        0x3c41e360 -> :sswitch_1
        0x406ebc66 -> :sswitch_9
        0x4389f63f -> :sswitch_11
        0x44926c60 -> :sswitch_8
        0x45d5da33 -> :sswitch_15
        0x47f63cde -> :sswitch_a
        0x4fbe45cf -> :sswitch_12
        0x50f20d3e -> :sswitch_19
        0x5f85abfa -> :sswitch_b
        0x61115c36 -> :sswitch_5
        0x618ddfba -> :sswitch_13
        0x6810d307 -> :sswitch_16
        0x734dc060 -> :sswitch_1
        0x748494b9 -> :sswitch_13
        0x77579ae3 -> :sswitch_6
        0x7860dc5c -> :sswitch_d
    .end sparse-switch
.end method

.method public final ᩷()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7709f099

    sget v2, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5f75

    const v6, 0x163179dd

    xor-int/2addr v5, v6

    const v6, -0x52f58b14

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x6571

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 33
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_8

    goto/16 :goto_5

    :sswitch_0
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x120b

    const v6, 0x3aaf2f98

    xor-int/2addr v5, v6

    const v6, 0x20dbcf10

    goto :goto_0

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_2

    .line 85
    :sswitch_2
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_5

    .line 87
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const/4 v0, 0x0

    return v0

    :sswitch_4
    const/4 v0, 0x0

    return v0

    .line 112
    :sswitch_5
    iget v4, p0, Ll/᩷᩺֫;->᩷:I

    if-ge v0, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xc37

    const v6, -0x691ffb9c

    xor-int/2addr v5, v6

    const v6, -0x29221349

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x1

    return v0

    :sswitch_7
    iget v0, p0, Ll/᩷᩺֫;->ۙ:I

    if-eqz v0, :cond_2

    const-string v4, "\u1a74\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7fa1

    const v6, -0xbef22d3

    xor-int/2addr v5, v6

    const v6, -0x1b8be59b

    goto :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u1a74\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4ff7

    const v6, 0x10a7727c

    xor-int/2addr v5, v6

    const v6, -0x54f61669

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a75\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x42d1

    const v6, -0x2bf5b9ef

    xor-int/2addr v5, v6

    const v6, 0x34371af3

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06eb\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2e3f

    const v6, 0x70c6849b

    xor-int/2addr v5, v6

    const v6, -0x557b1bf2

    goto/16 :goto_0

    .line 59
    :sswitch_a
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a79\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2675

    const v6, 0x4af1cc71    # 7923256.5f

    xor-int/2addr v5, v6

    const v6, 0x6b1802ac

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06d8\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5a73

    const v6, 0x5fcf11ce

    xor-int/2addr v5, v6

    const v6, 0x31092bd0

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x74b9

    const v6, 0xdaeb851

    xor-int/2addr v5, v6

    const v6, -0x28257f7c

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x638f

    const v6, -0x211fe6d

    xor-int/2addr v5, v6

    const v6, -0x4f588c02

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a74\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ba9

    const v6, 0xa4b8e5

    xor-int/2addr v5, v6

    const v6, 0x7dec50c1

    goto/16 :goto_0

    .line 93
    :sswitch_e
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u06d8\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6127

    const v6, 0x2e4dc1cc

    xor-int/2addr v5, v6

    const v6, 0x7b510b38

    goto/16 :goto_0

    .line 64
    :sswitch_f
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u073a\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d61

    const v6, -0x5ccfea6e

    xor-int/2addr v5, v6

    const v6, 0x1454edce

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1511

    const v6, -0x45faeb1c

    xor-int/2addr v5, v6

    const v6, 0x7e3d29b

    goto/16 :goto_0

    .line 28
    :sswitch_10
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_d

    :goto_4
    const-string v4, "\u0730\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3307

    const v6, 0x2b0b5ce6

    xor-int/2addr v5, v6

    const v6, 0x7b5bbbe2

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a75\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4399

    const v6, -0x34d40689    # -1.1270519E7f

    xor-int/2addr v5, v6

    const v6, -0x61f977b8

    goto/16 :goto_0

    .line 59
    :sswitch_11
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_e

    :goto_5
    const-string v4, "\u06da\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2835

    const v6, -0xfd63998

    xor-int/2addr v5, v6

    const v6, 0x29d88e32

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06ec\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6141

    const v6, 0x183b8ce5

    xor-int/2addr v5, v6

    const v6, -0x4da44431

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6edbb703 -> :sswitch_c
        -0x6d1f477f -> :sswitch_5
        -0x6c70be04 -> :sswitch_9
        -0x50d2c437 -> :sswitch_2
        -0x4bece1b7 -> :sswitch_b
        -0x47f12157 -> :sswitch_e
        -0x3e599579 -> :sswitch_e
        -0x2e0e7c24 -> :sswitch_a
        -0x2db27222 -> :sswitch_f
        -0x2a1712e4 -> :sswitch_f
        -0x274a2f51 -> :sswitch_3
        -0x2574bd25 -> :sswitch_2
        -0x22e73cc2 -> :sswitch_a
        -0x1b19c807 -> :sswitch_1
        -0x191bee5c -> :sswitch_11
        -0x10c3a77a -> :sswitch_4
        -0xedb2297 -> :sswitch_10
        -0x29890e2 -> :sswitch_1
        -0x1740b2e -> :sswitch_11
        0x4fad729 -> :sswitch_6
        0x104bd51b -> :sswitch_0
        0x1c330493 -> :sswitch_8
        0x1dbdeffc -> :sswitch_6
        0x1e29fb85 -> :sswitch_d
        0x20f612b1 -> :sswitch_9
        0x30b6759c -> :sswitch_0
        0x30bcfbf5 -> :sswitch_d
        0x360241ee -> :sswitch_c
        0x3aebd39f -> :sswitch_8
        0x5c27373a -> :sswitch_4
        0x616d0b23 -> :sswitch_b
        0x7561286b -> :sswitch_7
        0x7564c5e0 -> :sswitch_10
        0x798e0a3a -> :sswitch_3
        0x7b700ab1 -> :sswitch_5
        0x7fd97f98 -> :sswitch_7
    .end sparse-switch
.end method
