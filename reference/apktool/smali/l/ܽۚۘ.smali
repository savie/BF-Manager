.class public final Ll/ܽۚۘ;
.super Ljava/lang/Object;
.source "Z43S"


# static fields
.field public static final ۙ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x89

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    .line 796
    invoke-static {}, Ll/ܽۚۘ;->ۙ()[B

    move-result-object v0

    sput-object v0, Ll/ܽۚۘ;->ۙ:[B

    return-void
.end method

.method public static ۙ([BI)V
    .locals 22
    .annotation build Ll/ܿ۟ۨ;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

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

    const v16, 0x18c06387

    sget v17, Ll/֫ܳ;->᩶ۧۛ:I

    sget v18, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v19, "\u1a77\u06e7"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, -0x47

    xor-int v2, v19, v17

    mul-int/lit16 v2, v2, 0x6783

    const v21, -0x58482cc4

    xor-int v2, v2, v21

    const v21, -0x34be37e1    # -1.2699679E7f

    xor-int v19, v19, v21

    move/from16 v20, v19

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

    const v19, 0x18c06387

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x52a5

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v2, v3

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    move/from16 v2, v21

    .line 812
    invoke-static {v2, v0}, Ll/֫ۘ;->ܰ᩺ܿ(ILjava/lang/Object;)I

    move-result v3

    const v0, -0x5d20323d

    if-ne v3, v0, :cond_d

    move v4, v2

    goto/16 :goto_6

    .line 3
    :sswitch_0
    sget-boolean v2, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v2, :cond_6

    goto :goto_1

    .line 247
    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    move/from16 v2, v21

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget-boolean v2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v2, :cond_1

    goto/16 :goto_4

    .line 303
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto/16 :goto_4

    .line 148
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    return-void

    .line 816
    :sswitch_5
    aput-byte v16, v0, v4

    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v21

    goto/16 :goto_6

    :sswitch_6
    aget-byte v2, v0, v4

    xor-int/2addr v2, v15

    int-to-byte v2, v2

    .line 531
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_2

    move/from16 v16, v2

    :cond_1
    :goto_1
    const-string v2, "\u1a73\u06eb"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x3b

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x512d

    const v20, -0x79fe4432

    xor-int v3, v3, v20

    const v20, 0x62c32970    # 1.8000505E21f

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06d6\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v18, v3

    mul-int/lit8 v3, v3, 0x7

    move/from16 v16, v2

    xor-int v2, v3, v17

    mul-int/lit16 v2, v2, -0x37ff

    const v20, 0x2fbedace

    xor-int v2, v2, v20

    const v20, 0x7fa9800d

    xor-int v20, v3, v20

    goto/16 :goto_0

    :sswitch_7
    const/16 v2, 0xa7

    const/16 v15, 0xa7

    goto :goto_2

    :sswitch_8
    const/16 v2, 0xa8

    const/16 v15, 0xa8

    :goto_2
    const-string v2, "\u1a78\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x1f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x5133

    const v20, 0x67eef987

    xor-int v3, v3, v20

    const v20, 0x18bc1647

    goto/16 :goto_5

    .line 820
    :sswitch_9
    aput-byte v14, v0, v5

    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v21

    goto/16 :goto_7

    :sswitch_a
    int-to-byte v14, v13

    sget-boolean v2, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v2, "\u05a8\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x73

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x45fb

    const v20, 0x928d894

    xor-int v3, v3, v20

    const v20, 0x61f31427

    goto/16 :goto_5

    :sswitch_b
    sget-object v2, Ll/ܽۚۘ;->ۙ:[B

    aget-byte v2, v2, v12

    xor-int v13, v6, v2

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const-string v2, "\u06e0\u06ec"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x2f97

    const v20, -0x1702ea72

    xor-int v3, v3, v20

    const v20, 0x38eff9c9

    goto/16 :goto_5

    :sswitch_c
    rem-int v12, v10, v11

    .line 427
    sget-boolean v2, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v2, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v2, "\u06d9\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x502d

    const v20, 0x2b79a597

    xor-int v3, v3, v20

    const v20, 0x4e925d5d

    goto/16 :goto_5

    .line 820
    :sswitch_d
    div-int v10, v8, v9

    const/16 v11, 0x8

    .line 167
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    :goto_3
    const-string v2, "\u06e1\u06da"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x9

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x19c7

    const v20, -0x5c3beb48

    xor-int v3, v3, v20

    const v20, 0x4bc45193    # 2.5731878E7f

    goto/16 :goto_5

    :cond_7
    const-string v2, "\u073d\u1a76"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x4ef9

    const v20, 0x2b5ba549

    xor-int v3, v3, v20

    const v20, 0x12766265

    goto/16 :goto_5

    :sswitch_e
    const/16 v9, 0x9

    .line 802
    sget-boolean v2, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v2, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v2, "\u06df\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x1551

    const v20, 0x51f7a1d

    xor-int v3, v3, v20

    const v20, 0x3974433c

    goto/16 :goto_5

    :sswitch_f
    mul-int v8, v5, v7

    .line 710
    sget-boolean v2, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v2, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v2, "\u0730\u1a73"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x36b5

    const v20, 0x1ac9a38b

    xor-int v3, v3, v20

    const v20, 0xcf59fd2

    goto/16 :goto_5

    .line 820
    :sswitch_10
    aget-byte v6, v0, v5

    const/16 v7, 0x1f

    .line 552
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v2

    if-gtz v2, :cond_a

    :goto_4
    const-string v2, "\u06d7\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x6a97

    const v20, -0x1f0a2d4c

    xor-int v3, v3, v20

    const v20, -0x6ed55240

    goto/16 :goto_5

    :cond_a
    const-string v2, "\u06d7\u1a7a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x41

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x24ed

    const v20, -0x7e322880

    xor-int v3, v3, v20

    const v20, -0x53da9826

    goto/16 :goto_5

    .line 814
    :sswitch_11
    rem-int/lit8 v2, v4, 0x2

    if-nez v2, :cond_b

    const-string v2, "\u06e4\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x6f

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x14e9

    const v20, 0x3d8a3f42

    xor-int v3, v3, v20

    const v20, 0x721aab55

    goto :goto_5

    :cond_b
    const-string v2, "\u06d8\u06d8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0xf

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x3f9

    const v20, -0x344da33f    # -2.3378306E7f

    xor-int v3, v3, v20

    const v20, -0x839c229

    goto :goto_5

    :sswitch_12
    return-void

    :sswitch_13
    if-ge v5, v1, :cond_c

    const-string v2, "\u06eb\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x5cbf

    const v20, 0x4895de20    # 306929.0f

    xor-int v3, v3, v20

    const v20, 0x710df6d4

    goto :goto_5

    :sswitch_14
    if-ge v4, v1, :cond_c

    const-string v2, "\u06e4\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x52ad

    const v20, 0x55cb16de

    xor-int v3, v3, v20

    const v20, -0x73c1eab1

    goto :goto_5

    :cond_c
    const-string v2, "\u06e0\u06e4"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x396f

    const v20, 0x14509777

    xor-int v3, v3, v20

    const v20, 0x3597ee8b

    :goto_5
    xor-int v20, v2, v20

    goto/16 :goto_c

    :goto_6
    const-string v0, "\u06e2\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x65

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x1631

    const v20, -0x7791b5c2

    xor-int v3, v3, v20

    const v20, -0x269f347a

    goto/16 :goto_b

    :cond_d
    move v5, v2

    :goto_7
    const-string v0, "\u05a8\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x70c7

    const v20, -0x1a04079d

    xor-int v3, v3, v20

    const v20, -0x50cf7e3d

    goto :goto_b

    :sswitch_15
    const/16 v21, 0x0

    .line 258
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_e

    :goto_8
    const-string v0, "\u1a74\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0x78c3

    const v3, -0x376950fa

    xor-int/2addr v2, v3

    const v3, -0x17dc21c5

    goto :goto_9

    :cond_e
    const-string v0, "\u0733\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0x4ed7

    const v3, 0x15515f06

    xor-int/2addr v2, v3

    const v3, 0x34526067

    :goto_9
    xor-int v20, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_16
    move/from16 v2, v21

    .line 689
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v0

    if-eqz v0, :cond_f

    :goto_a
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x25ad

    const v20, 0x62955798

    xor-int v3, v3, v20

    const v20, -0x5abffb9d

    goto :goto_b

    :cond_f
    const-string v0, "\u06e0\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x3d2d

    const v20, 0x18e619d

    xor-int v3, v3, v20

    const v20, 0x18f5f474

    :goto_b
    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move/from16 v21, v2

    :goto_c
    move v2, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73fe167b -> :sswitch_9
        -0x61295ae4 -> :sswitch_13
        -0x5f63a7cb -> :sswitch_b
        -0x5d0af178 -> :sswitch_16
        -0x59fb50e6 -> :sswitch_16
        -0x592bac54 -> :sswitch_2
        -0x4abc6041 -> :sswitch_13
        -0x3d8f5a27 -> :sswitch_10
        -0x302ac1f6 -> :sswitch_8
        -0x2c21c998 -> :sswitch_a
        -0x2c2126bf -> :sswitch_11
        -0x2ba87e92 -> :sswitch_5
        -0x21dd6aa2 -> :sswitch_0
        -0x2159dede -> :sswitch_12
        -0x1f4dd6d1 -> :sswitch_5
        -0x1ef9daa0 -> :sswitch_1
        -0x1d881329 -> :sswitch_f
        -0x1d03014b -> :sswitch_c
        -0x1b161e25 -> :sswitch_4
        -0x183b8ac4 -> :sswitch_e
        -0xec0d487 -> :sswitch_8
        -0xcf0c23e -> :sswitch_d
        -0xb92bd5c -> :sswitch_9
        -0x8b584f8 -> :sswitch_a
        -0x6b874ef -> :sswitch_c
        0xaae76f6 -> :sswitch_14
        0x1172ba3f -> :sswitch_b
        0x129c6746 -> :sswitch_11
        0x13457843 -> :sswitch_12
        0x1523b1a5 -> :sswitch_1
        0x1941e72c -> :sswitch_e
        0x1b942f74 -> :sswitch_f
        0x1f6104de -> :sswitch_7
        0x226e0d33 -> :sswitch_3
        0x2eed1787 -> :sswitch_10
        0x32530d0a -> :sswitch_7
        0x376d145b -> :sswitch_6
        0x471527fe -> :sswitch_15
        0x4e71cc36 -> :sswitch_2
        0x63374a85 -> :sswitch_14
        0x63aef336 -> :sswitch_6
        0x6694a4fa -> :sswitch_d
        0x7487e03b -> :sswitch_0
        0x7a1b5011 -> :sswitch_4
        0x7acca846 -> :sswitch_15
        0x7b91a6ad -> :sswitch_3
    .end sparse-switch
.end method

.method public static native ۙ()[B
.end method

.method public static ܰ([BI)V
    .locals 18
    .annotation build Ll/ܿ۟ۨ;
    .end annotation

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

    const v11, 0x6f786739

    sget v12, Ll/ۗ;->֨۬ۖ:I

    sget v13, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v14, "\u05a8\u06e8"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x7

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2671

    const v16, -0x7d888638

    xor-int v15, v15, v16

    const v16, 0x79c08fad

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x7df

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 828
    aget-byte v1, p0, v0

    const/16 v2, 0x1f

    .line 611
    sget v14, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v14, :cond_a

    goto/16 :goto_5

    .line 488
    :sswitch_0
    sget v14, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v14, :cond_5

    :cond_0
    :goto_2
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_9

    .line 527
    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v14, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v14, :cond_8

    goto/16 :goto_5

    .line 732
    :sswitch_2
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v14

    if-eqz v14, :cond_0

    goto/16 :goto_5

    .line 825
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    goto/16 :goto_5

    .line 86
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    return-void

    .line 828
    :sswitch_5
    aput-byte v10, p0, v0

    add-int/lit8 v0, v0, 0x1

    move/from16 v14, p1

    goto/16 :goto_6

    :sswitch_6
    int-to-byte v10, v9

    sget v14, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v14, :cond_1

    goto :goto_3

    :cond_1
    const-string v14, "\u06e0\u05ab"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1cdb

    const v16, 0x252eb10d

    xor-int v15, v15, v16

    const v16, 0x3fa4f259

    goto :goto_0

    :sswitch_7
    xor-int v9, v1, v8

    .line 533
    sget v14, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v14, :cond_2

    goto :goto_2

    :cond_2
    const-string v14, "\u1a76\u06df"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6ad3

    const v16, -0x23732aed

    xor-int v15, v15, v16

    const v16, -0x3fb15536

    goto :goto_0

    .line 828
    :sswitch_8
    sget-object v8, Ll/ܽۚۘ;->ۙ:[B

    aget-byte v8, v8, v7

    .line 371
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v14

    if-gtz v14, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v14, "\u05a1\u0733"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7ab

    const v16, -0x63284da2

    xor-int v15, v15, v16

    const v16, -0x460fde58

    goto/16 :goto_0

    .line 828
    :sswitch_9
    rem-int v7, v5, v6

    .line 591
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v14

    if-gtz v14, :cond_4

    :goto_3
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_8

    :cond_4
    const-string v14, "\u06d7\u05a8"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x28dd

    const v16, 0x4ddfcd08    # 4.693445E8f

    xor-int v15, v15, v16

    const v16, -0x791666d4

    goto/16 :goto_0

    .line 828
    :sswitch_a
    div-int v5, v3, v4

    const/16 v6, 0x8

    sget v14, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v14, :cond_6

    :cond_5
    const-string v14, "\u06d6\u06e8"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x55fd

    const v16, -0x1af29415

    xor-int v15, v15, v16

    const v16, -0x5ddd282a

    goto/16 :goto_0

    :cond_6
    const-string v14, "\u1a73\u06e8"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x79

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x744d

    const v16, -0x4ec700ba

    xor-int v15, v15, v16

    const v16, -0x6c39edfe    # -4.9999984E-27f

    goto/16 :goto_0

    :sswitch_b
    const/16 v4, 0x9

    .line 690
    sget v14, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v14, :cond_7

    goto :goto_5

    :cond_7
    const-string v14, "\u06e1\u1a78"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x19

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3433

    const v16, -0x7e95e918

    xor-int v15, v15, v16

    const v16, -0x422ddda9

    goto/16 :goto_0

    :sswitch_c
    mul-int v3, v0, v2

    .line 31
    sget v14, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v14, :cond_9

    :cond_8
    :goto_4
    const-string v14, "\u1a77\u1a74"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x63

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x4403

    const v16, 0xe0756e3

    xor-int v15, v15, v16

    const v16, -0x68b0a2ec

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u06ec\u06e4"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x42ed

    const v16, 0x526cc1d0

    xor-int v15, v15, v16

    const v16, 0xd422a03

    goto/16 :goto_0

    :goto_5
    const-string v14, "\u06e1\u073d"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x53

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5b5

    const v16, 0x653b1d30

    xor-int v15, v15, v16

    const v16, 0x544badf3

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u05a8\u05a1"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3993

    const v16, -0x4da8c940

    xor-int v15, v15, v16

    const v16, -0x58965818

    goto/16 :goto_0

    :sswitch_d
    return-void

    :sswitch_e
    move/from16 v14, p1

    if-ge v0, v14, :cond_b

    const-string v15, "\u06e8\u073a"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x8b7

    const v17, 0x1d25d0ae

    xor-int v0, v0, v17

    const v17, -0x680b5bc9

    goto :goto_7

    :cond_b
    move/from16 v16, v0

    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x784b

    const v17, -0x78472011

    xor-int v15, v15, v17

    const v17, -0x79e58917

    goto/16 :goto_a

    :sswitch_f
    move/from16 v14, p1

    const/4 v0, 0x0

    :goto_6
    const-string v15, "\u1a73\u06d7"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x63

    move/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x851

    const v17, 0x49025cfb

    xor-int v0, v0, v17

    const v17, -0x76ece875

    :goto_7
    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto :goto_b

    :sswitch_10
    move/from16 v14, p1

    move/from16 v16, v0

    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_c

    :goto_8
    const-string v0, "\u06d8\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x1a81

    const v17, 0x1c313b95

    xor-int v15, v15, v17

    const v17, 0x63cd2707

    goto :goto_a

    :cond_c
    const-string v0, "\u0730\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x7db

    const v17, 0x94ab272

    xor-int v15, v15, v17

    const v17, -0x689179f1

    goto :goto_a

    :sswitch_11
    move/from16 v14, p1

    move/from16 v16, v0

    .line 548
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u06e2\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x64f3

    const v17, 0x34c7ab2d

    xor-int v15, v15, v17

    const v17, -0x1589cede

    goto :goto_a

    :cond_d
    const-string v0, "\u1a74\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x3821

    const v17, -0x62a36a

    xor-int v15, v15, v17

    const v17, -0x670bef42

    :goto_a
    xor-int v0, v0, v17

    move v14, v0

    :goto_b
    move/from16 v0, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x735d5dfd -> :sswitch_a
        -0x72abc5e2 -> :sswitch_5
        -0x6f93493b -> :sswitch_7
        -0x6b818ee4 -> :sswitch_c
        -0x51a21808 -> :sswitch_d
        -0x46a1ef4a -> :sswitch_1
        -0x469ef9a4 -> :sswitch_f
        -0x40cec08f -> :sswitch_6
        -0x404d1a09 -> :sswitch_b
        -0x400133fc -> :sswitch_6
        -0x3a411f19 -> :sswitch_a
        -0x36592b60 -> :sswitch_9
        -0x2725b10a -> :sswitch_c
        -0x18bb8841 -> :sswitch_10
        -0x16d7d3b9 -> :sswitch_e
        -0x14d57dd0 -> :sswitch_9
        -0xb146d28 -> :sswitch_2
        -0x6560fe0 -> :sswitch_d
        -0x4221a3e -> :sswitch_11
        0x42f53fb -> :sswitch_2
        0xb008696 -> :sswitch_7
        0x10d21f88 -> :sswitch_1
        0x1c7ea1e9 -> :sswitch_0
        0x32945842 -> :sswitch_4
        0x42fa0d9b -> :sswitch_e
        0x4c50231e -> :sswitch_0
        0x50b4431a -> :sswitch_3
        0x532d44a7 -> :sswitch_8
        0x5554f4f3 -> :sswitch_5
        0x5886ff3a -> :sswitch_3
        0x5975df2a -> :sswitch_f
        0x5d3215ad -> :sswitch_4
        0x5e916dc7 -> :sswitch_11
        0x6116fa4e -> :sswitch_b
        0x61c4a265 -> :sswitch_8
        0x68232bfa -> :sswitch_10
    .end sparse-switch
.end method
