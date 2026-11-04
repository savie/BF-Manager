.class public final Ll/ܺۡ֫;
.super Ljava/lang/Object;
.source "77A2"


# static fields
.field private static final ᩶ܳܳ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺۡ֫;->᩶ܳܳ:[S

    return-void

    :array_0
    .array-data 2
        0x54as
        -0x23d5s
        -0x23d5s
        -0x23c7s
        -0x23c2s
        -0x23d2s
        0x46cds
        -0x5cbfs
        -0x7aa3s
    .end array-data
.end method

.method public static ۙ()V
    .locals 25

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v18, -0x3602d839

    sget v19, Ll/ۖۙ;->ۤۧۤ:I

    sget v20, Ll/ۖܰ;->۟֫ܽ:I

    const-string v21, "\u073d\u1a73"

    invoke-static/range {v21 .. v21}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v20

    xor-int v0, v21, v19

    mul-int/lit16 v0, v0, -0x7a57

    const v23, 0x28e18456

    xor-int v0, v0, v23

    const v23, -0x4623a907

    xor-int v21, v21, v23

    move-object v3, v2

    move-object v6, v5

    move-object v11, v15

    move-object/from16 v12, v17

    move/from16 v22, v21

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, -0x3602d839

    const/16 v23, 0x0

    :goto_0
    xor-int v13, v21, v19

    mul-int/lit16 v13, v13, 0x6f45

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v21, v22, v0

    sparse-switch v21, :sswitch_data_0

    add-int v0, v4, v7

    .line 35
    invoke-static {v0, v5}, Ll/᩺;->ܿۘܿ(II)I

    move-result v8

    .line 29
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_4

    .line 26
    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_0

    :goto_1
    move/from16 v0, v17

    goto/16 :goto_8

    :cond_0
    :goto_2
    move/from16 v0, v17

    goto/16 :goto_a

    .line 23
    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 15
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "\u1a76\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x23

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, 0x7d29

    const v22, -0x3da1a8cc

    xor-int v13, v13, v22

    const v22, -0x54866677

    goto/16 :goto_7

    .line 19
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto :goto_1

    .line 28
    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    return-void

    :sswitch_5
    const v0, 0x7d41b5df

    xor-int/2addr v0, v9

    .line 21
    invoke-static {v0}, Ll/ܽ;->ۢ֡᩵(I)V

    goto/16 :goto_5

    :sswitch_6
    const/4 v0, 0x6

    const/4 v9, 0x3

    .line 20
    invoke-static {v12, v0, v9, v15}, Ll/ۗ֨;->ᩴᩴܽ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "\u1a75\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, -0xc35

    const v22, -0x2c27c8e1

    xor-int v13, v13, v22

    const v22, 0xc37347e

    goto/16 :goto_7

    :sswitch_7
    invoke-interface {v6, v8, v3}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ;->ۤۡۖ(Ljava/lang/Object;)V

    sget-object v12, Ll/ܺۡ֫;->᩶ܳܳ:[S

    .line 32
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_3

    :goto_3
    move/from16 v0, v17

    move-object/from16 v17, v1

    goto/16 :goto_b

    :cond_3
    const-string v0, "\u1a75\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x5f

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x4489

    const v22, -0x4b323dcf

    xor-int v13, v13, v22

    const v22, -0x6faac391

    goto/16 :goto_7

    :cond_4
    :goto_4
    const-string v0, "\u0733\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x9

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x49a3

    const v22, 0x6c40fdec

    xor-int v13, v13, v22

    const v22, -0x3065c5cd

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u1a73\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, 0x1d3

    const v22, -0x4dacd3ce

    xor-int v13, v13, v22

    const v22, 0x71c348e

    goto/16 :goto_7

    .line 20
    :sswitch_8
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-static {v0}, Ll/ۗܶ;->ܿ᩺ܿ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v6

    const/4 v7, 0x1

    .line 25
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_6

    goto :goto_3

    :cond_6
    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x7f

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, 0x3019

    const v22, -0x14f081cb

    xor-int v13, v13, v22

    const v22, 0x6001034b

    goto/16 :goto_7

    :sswitch_9
    return-void

    :sswitch_a
    const/4 v0, 0x5

    .line 15
    invoke-static {v11, v10, v0, v15}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x3

    if-ge v4, v5, :cond_7

    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x43

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x2495

    const v22, -0x2b6c2221

    xor-int v13, v13, v22

    const v22, -0x43827ccb

    goto/16 :goto_7

    :cond_7
    :goto_5
    const-string v0, "\u1a74\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x25dd

    const v22, -0x7ede5854

    xor-int v13, v13, v22

    const v22, -0x2a9f4113

    goto/16 :goto_7

    :sswitch_b
    const/4 v10, 0x1

    .line 16
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v0, "\u06d6\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, 0x5e15

    const v22, -0x2b10a3f0

    xor-int v13, v13, v22

    const v22, 0xfa7e475

    goto/16 :goto_7

    .line 15
    :sswitch_c
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const/4 v2, 0x0

    sget-object v11, Ll/ܺۡ֫;->᩶ܳܳ:[S

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v0

    if-gtz v0, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u06e7\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x1371

    const v22, -0x5316f45d

    xor-int v13, v13, v22

    const v22, -0x1d073e47

    goto :goto_7

    :sswitch_d
    const v0, 0xb335

    const v15, 0xb335

    goto :goto_6

    :sswitch_e
    const v0, 0xdc4d

    const v15, 0xdc4d

    :goto_6
    const-string v0, "\u06df\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x73

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, -0x7f23

    const v22, -0x1e7ae719

    xor-int v13, v13, v22

    const v22, -0x4f649b8

    goto :goto_7

    :sswitch_f
    mul-int v0, v14, v14

    sub-int v0, v23, v0

    if-gez v0, :cond_a

    const-string v0, "\u1a78\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v13, v0, v20

    mul-int/lit16 v13, v13, -0x4bc9

    const v22, 0x13360681

    xor-int v13, v13, v22

    const v22, 0x6fe2ab57

    goto :goto_7

    :cond_a
    const-string v0, "\u06d8\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x5f

    xor-int v13, v0, v19

    mul-int/lit16 v13, v13, 0x6e4b

    const v22, 0x15008cfe

    xor-int v13, v13, v22

    const v22, -0x66b54296

    :goto_7
    xor-int v22, v0, v22

    goto/16 :goto_d

    :sswitch_10
    add-int v23, v18, v18

    move/from16 v0, v17

    add-int/lit16 v14, v0, 0x1e5a

    .line 19
    sget v13, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v13, :cond_b

    :goto_8
    const-string v13, "\u073f\u1a78"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v19

    mul-int/lit8 v13, v13, -0x23

    move-object/from16 v17, v1

    xor-int v1, v13, v20

    mul-int/lit16 v1, v1, 0x3b6f

    const v22, 0x19c73662

    xor-int v1, v1, v22

    const v22, 0xc2e521

    xor-int v22, v13, v22

    move-object/from16 v24, v17

    move/from16 v17, v0

    move v0, v1

    move-object/from16 v1, v24

    goto/16 :goto_0

    :cond_b
    move-object/from16 v17, v1

    const-string v1, "\u06df\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0x6c13

    const v22, 0x79a2889c

    xor-int v13, v13, v22

    const v22, 0x5c92e45d

    goto/16 :goto_c

    :sswitch_11
    move/from16 v0, v17

    move-object/from16 v17, v1

    const v1, 0x39937a4

    add-int v18, v16, v1

    .line 23
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_c

    :goto_9
    move-object/from16 v1, v17

    goto :goto_a

    :cond_c
    const-string v1, "\u1a74\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x25

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, -0x3c75

    const v22, 0x4ad0833c    # 6832542.0f

    xor-int v13, v13, v22

    const v22, -0xe63c050

    goto/16 :goto_c

    :sswitch_12
    move/from16 v0, v17

    move-object/from16 v17, v1

    mul-int v16, v0, v0

    .line 16
    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_d

    goto :goto_9

    :goto_a
    const-string v13, "\u0736\u06d7"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v20, v13

    mul-int/lit8 v13, v13, -0x53

    move/from16 v22, v0

    xor-int v0, v13, v19

    mul-int/lit16 v0, v0, 0x1dc5

    const v17, 0x74539680

    xor-int v0, v0, v17

    const v17, 0x6dc892bc

    xor-int v13, v13, v17

    move/from16 v17, v22

    move/from16 v22, v13

    goto/16 :goto_0

    :cond_d
    move/from16 v22, v0

    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x2805

    const v13, -0x73734f73

    xor-int/2addr v1, v13

    const v13, -0x39aa74b0

    xor-int/2addr v0, v13

    move/from16 v24, v22

    move/from16 v22, v0

    move v0, v1

    move-object/from16 v1, v17

    move/from16 v17, v24

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v17, v1

    sget-object v0, Ll/ܺۡ֫;->᩶ܳܳ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_e

    :goto_b
    const-string v1, "\u1a7b\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x7b

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x6e1f

    const v22, -0x5b6f4bf1

    xor-int v13, v13, v22

    const v22, -0x4c7f7752

    goto :goto_c

    :cond_e
    const-string v1, "\u06d9\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x1475

    const v22, -0x38abb682

    xor-int v13, v13, v22

    const v22, -0x2688d16f

    :goto_c
    xor-int v22, v1, v22

    move-object/from16 v1, v17

    move/from16 v17, v0

    :goto_d
    move v0, v13

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f7e95b8 -> :sswitch_b
        -0x79a23b07 -> :sswitch_e
        -0x728ca1a8 -> :sswitch_c
        -0x6ee6d870 -> :sswitch_12
        -0x6d7fe00c -> :sswitch_7
        -0x6bbff627 -> :sswitch_f
        -0x66c11297 -> :sswitch_12
        -0x652f9a74 -> :sswitch_d
        -0x5b69f736 -> :sswitch_1
        -0x512eac06 -> :sswitch_6
        -0x4f468d98 -> :sswitch_a
        -0x455f1fdb -> :sswitch_13
        -0x3c7ccae8 -> :sswitch_0
        -0x3bcab72f -> :sswitch_4
        -0x2f8650b3 -> :sswitch_c
        -0x2b1a01c1 -> :sswitch_f
        -0x19610b64 -> :sswitch_8
        -0x1869da24 -> :sswitch_d
        -0x1662e23d -> :sswitch_1
        -0xe4db46d -> :sswitch_13
        -0xd1d709b -> :sswitch_11
        -0x74fdc52 -> :sswitch_10
        -0x448c9c2 -> :sswitch_8
        -0x3b73d15 -> :sswitch_2
        0x24c4053 -> :sswitch_2
        0x7474d69 -> :sswitch_9
        0x1aebc4ab -> :sswitch_5
        0x34d545fb -> :sswitch_9
        0x35f6851f -> :sswitch_6
        0x49024ddd -> :sswitch_0
        0x4c7cb0fe -> :sswitch_3
        0x4e22963a -> :sswitch_11
        0x4f71e9fd -> :sswitch_7
        0x577018c6 -> :sswitch_4
        0x59cce094 -> :sswitch_5
        0x5d9b8f1b -> :sswitch_a
        0x6a8fdcfc -> :sswitch_b
        0x761ccf06 -> :sswitch_10
        0x7b083e4f -> :sswitch_3
        0x7b2de554 -> :sswitch_e
    .end sparse-switch
.end method
