.class public final Ll/ۧۢۤ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ܰ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 6

    const v0, -0x37970fd9

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    .line 663
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4133

    const v5, -0x605f6102

    xor-int/2addr v4, v5

    const v5, 0x519a710f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x59ef

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 602
    :sswitch_0
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    .line 549
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v3, :cond_4

    goto/16 :goto_2

    .line 367
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_9

    goto/16 :goto_2

    .line 101
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_2

    .line 664
    :sswitch_4
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_1

    :cond_0
    const-string v3, "\u0730\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6da9

    const v5, -0x519f17d7

    xor-int/2addr v4, v5

    const v5, 0x35627dc9

    goto :goto_0

    :cond_1
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_2

    goto :goto_3

    .line 122
    :cond_2
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6df9

    const v5, 0xea7ef27

    xor-int/2addr v4, v5

    const v5, -0x7859bd25

    goto :goto_0

    .line 234
    :cond_5
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_6

    goto :goto_3

    .line 123
    :cond_6
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_7

    goto :goto_1

    .line 424
    :cond_7
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_8

    goto :goto_3

    .line 235
    :cond_8
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_1
    const-string v3, "\u06d8\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd27

    const v5, 0x769fdd9b

    xor-int/2addr v4, v5

    const v5, -0x6af901b9

    goto/16 :goto_0

    :cond_a
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_b

    :goto_2
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4659

    const v5, -0x76dfda18

    xor-int/2addr v4, v5

    const v5, 0x1dbaa14

    goto/16 :goto_0

    .line 256
    :cond_b
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_c

    :goto_3
    const-string v3, "\u06e1\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1785

    const v5, 0x1c50b847

    xor-int/2addr v4, v5

    const v5, 0x6dc89a78

    goto/16 :goto_0

    .line 664
    :cond_c
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, Ll/ۧۢۤ;->ܰ:Landroid/graphics/Paint;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x49c56e65 -> :sswitch_0
        -0x44ccbe4b -> :sswitch_1
        -0x3e0f5ee6 -> :sswitch_3
        -0x34228643 -> :sswitch_4
        -0x28eaf911 -> :sswitch_4
        -0x2025d520 -> :sswitch_1
        -0x1f328448 -> :sswitch_3
        -0x1cc721d0 -> :sswitch_2
        0x80ccc76 -> :sswitch_2
        0x4bef3a02 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 21

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

    const v13, -0x2e9f7967

    sget v14, Ll/֡᩻;->᩷ۧ᩺:I

    sget v15, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v16, "\u06da\u06db"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v14

    mul-int/lit8 v16, v16, 0xd

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, -0x1973

    const v17, -0x2c5bc7db

    xor-int v0, v0, v17

    const v17, 0x17e0c831

    xor-int v16, v16, v17

    move-object v5, v4

    move/from16 v17, v16

    const/16 p2, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v16, -0x2e9f7967

    :goto_0
    xor-int v13, v16, v15

    mul-int/lit16 v13, v13, 0x5b79

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    .line 303
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v0, :cond_0

    :goto_1
    move-object/from16 v13, p0

    :goto_2
    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_7

    :sswitch_0
    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v0, :cond_1

    :cond_0
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_5

    :cond_1
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_6

    .line 75
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v0

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v13, v0, v14

    mul-int/lit16 v13, v13, -0x7009

    const v17, 0x667a4d42

    xor-int v13, v13, v17

    const v17, -0x636aec28

    xor-int v17, v0, v17

    move v0, v13

    goto :goto_0

    .line 386
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto :goto_1

    .line 241
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 694
    :sswitch_4
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v12, v0

    int-to-float v0, v12

    div-float/2addr v0, v8

    add-float/2addr v0, v11

    .line 695
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    move-object/from16 v13, p0

    iget-object v2, v13, Ll/ۧۢۤ;->ܰ:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 696
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    move-object/from16 v8, p1

    .line 697
    invoke-virtual {v8, v10, v0, v9, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    :sswitch_5
    move-object/from16 v13, p0

    move-object/from16 v8, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float v9, v7, v0

    add-float v10, v6, v9

    move/from16 v11, p7

    int-to-float v12, v11

    .line 694
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 293
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v17

    if-nez v17, :cond_3

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move v12, v0

    goto/16 :goto_3

    :cond_3
    const-string v17, "\u05a8\u1a75"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    move/from16 p4, v0

    xor-int v0, v17, v14

    mul-int/lit16 v0, v0, -0x5ced

    const v18, 0x2cf3d6a0

    xor-int v0, v0, v18

    const v18, -0x2de495da

    xor-int v17, v17, v18

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move/from16 v12, p4

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v13, p0

    .line 691
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3, v0}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result v0

    .line 692
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v5

    int-to-float v0, v0

    add-float v6, p5, v0

    int-to-float v7, v2

    .line 688
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "\u1a74\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6d

    move/from16 v17, v2

    xor-int v2, v0, v15

    mul-int/lit16 v2, v2, -0x5b95

    const v18, 0x425c9ed4

    xor-int v2, v2, v18

    const v18, -0x38c2ced6

    goto/16 :goto_4

    :sswitch_7
    move-object/from16 v13, p0

    .line 690
    invoke-static/range {p9 .. p9}, Ll/֡ۖ;->ۢ֡ᩳ(Ljava/lang/Object;)F

    move-result v0

    const v2, 0x3e3851ec    # 0.18f

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v1, v0}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result v2

    const/high16 v0, 0x40800000    # 4.0f

    .line 691
    invoke-static {v0}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v3

    invoke-static/range {p9 .. p9}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result v0

    const v4, 0x3e0f5c29    # 0.14f

    mul-float v4, v4, v0

    .line 688
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const-string v0, "\u05a1\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x13

    move/from16 v18, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x1403

    const v17, 0x4c3d13a8    # 4.9565344E7f

    xor-int v1, v1, v17

    const v17, 0x23265b58

    xor-int v17, v0, v17

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v13, p0

    move/from16 v17, v2

    const/high16 v0, 0x40200000    # 2.5f

    .line 690
    invoke-static {v0}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v1

    .line 631
    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_6

    move/from16 v2, v17

    :goto_3
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    move/from16 p3, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x433b

    const v17, 0x41ad2d0

    xor-int v1, v1, v17

    const v17, -0x159d5fd6

    xor-int v17, v0, v17

    move v0, v1

    move/from16 v1, p3

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06df\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x59

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x2bdb

    const v18, 0x7e10de88

    xor-int v2, v2, v18

    const v18, -0x58b11219    # -2.871721E-15f

    :goto_4
    xor-int v0, v0, v18

    move/from16 v20, v17

    move/from16 v17, v0

    move v0, v2

    move/from16 v2, v20

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 661
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06d8\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2a1

    const v2, -0x1a41dadc

    xor-int/2addr v1, v2

    const v2, -0x13bbc3e6

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 443
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06d8\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x50e9

    const v2, -0x37354ee7

    xor-int/2addr v1, v2

    const v2, 0x36c6f91e

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 87
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_9

    :goto_5
    const-string v0, "\u06db\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x75

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x14df

    const v2, -0x39c91041

    xor-int/2addr v1, v2

    const v2, 0x762cbfbf

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u05a8\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x61

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2fe1

    const v2, 0x1a975b4a

    xor-int/2addr v1, v2

    const v2, -0x35b6696c    # -3302821.0f

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 72
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_7

    :cond_a
    const-string v0, "\u1a7b\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x1fe1

    const v2, -0x69428c85

    xor-int/2addr v1, v2

    const v2, -0x5466b238

    goto :goto_8

    :sswitch_d
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_b

    :goto_6
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x2f

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1ab3

    const v2, 0x4e9158a0

    xor-int/2addr v1, v2

    const v2, 0x542d6a36

    goto :goto_8

    :cond_b
    const-string v0, "\u1a73\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v15

    mul-int/lit8 v1, v1, -0x33

    const v2, -0x340d95cc    # -3.17738E7f

    xor-int/2addr v1, v2

    const v2, -0x4505b240

    goto :goto_8

    :sswitch_e
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    if-gtz p2, :cond_c

    :goto_7
    const-string v0, "\u06d6\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x74cd

    const v2, -0x2b3767a7

    xor-int/2addr v1, v2

    const v2, 0x444c821a

    goto :goto_8

    :cond_c
    const-string v0, "\u1a7a\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2633

    const v2, 0x7186db0b

    xor-int/2addr v1, v2

    const v2, 0x7446d288

    :goto_8
    xor-int/2addr v0, v2

    move/from16 v2, v17

    move/from16 v17, v0

    :goto_9
    move v0, v1

    goto :goto_a

    :sswitch_f
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 120
    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v1, "\u1a7b\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x400d

    const v19, -0x38e5d6d8

    xor-int v2, v2, v19

    const v19, -0x4055cf01

    xor-int v1, v1, v19

    move/from16 p2, v0

    move v0, v2

    move/from16 v2, v17

    move/from16 v17, v1

    :goto_a
    move/from16 v1, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77cf8254 -> :sswitch_0
        -0x6f2d2d14 -> :sswitch_6
        -0x503bcb72 -> :sswitch_9
        -0x4fb67b4a -> :sswitch_4
        -0x4fa5b5d6 -> :sswitch_8
        -0x4a5528a6 -> :sswitch_b
        -0x46aaaab7 -> :sswitch_5
        -0x40e2db95 -> :sswitch_2
        -0x3a08752d -> :sswitch_f
        -0x32c8f8f6 -> :sswitch_e
        -0x29875e6a -> :sswitch_3
        -0x283534e5 -> :sswitch_b
        -0x27e9781b -> :sswitch_2
        -0x1db00e57 -> :sswitch_0
        -0x14fdd1b3 -> :sswitch_1
        0xbc808a8 -> :sswitch_5
        0x1617baec -> :sswitch_d
        0x1fb016c5 -> :sswitch_f
        0x36d214d1 -> :sswitch_3
        0x3d4efe25 -> :sswitch_c
        0x43f8d613 -> :sswitch_6
        0x4acfee43 -> :sswitch_a
        0x5494051b -> :sswitch_9
        0x5870c12f -> :sswitch_a
        0x66dc0f83 -> :sswitch_1
        0x6b7f095a -> :sswitch_e
        0x6cb99f7d -> :sswitch_8
        0x6cee89ce -> :sswitch_7
        0x6e13264c -> :sswitch_c
        0x7026232d -> :sswitch_4
        0x722fa730 -> :sswitch_d
        0x76f22fda -> :sswitch_7
    .end sparse-switch
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 9

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x26e3886f

    sget v4, Ll/֫֡;->֫ۙۖ:I

    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v6, "\u0736\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2f55

    const v8, 0x5ece7d10

    xor-int/2addr v7, v8

    const v8, 0x491de8c5

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x34ab

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 555
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    const/4 p1, 0x0

    return p1

    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v6, :cond_7

    goto/16 :goto_2

    .line 82
    :sswitch_1
    sget-boolean v6, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v6, :cond_a

    goto/16 :goto_2

    .line 473
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v6, :cond_c

    goto/16 :goto_2

    .line 142
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto/16 :goto_2

    .line 676
    :sswitch_4
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 677
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_1

    .line 673
    :sswitch_5
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v2

    .line 674
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 675
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 137
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u1a7b\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x334d

    const v8, -0x243b904e

    xor-int/2addr v7, v8

    const v8, -0x7647e8f7

    goto :goto_0

    .line 680
    :sswitch_6
    invoke-static {v0, v1}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    return p1

    :sswitch_7
    invoke-static {p1}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result v1

    const v6, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 55
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u0736\u05a1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3b2d

    const v8, -0x50d47e75

    xor-int/2addr v7, v8

    const v8, -0x4e429a9e

    goto/16 :goto_0

    .line 679
    :sswitch_8
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 680
    invoke-static {v0}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v0

    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v6, "\u06e2\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x29

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xa39

    const v8, -0x1bc546dd

    xor-int/2addr v7, v8

    const v8, 0x66280948

    goto/16 :goto_0

    :sswitch_9
    const/high16 p2, 0x40200000    # 2.5f

    .line 679
    invoke-static {p2}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result p2

    invoke-static {p1}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e3851ec    # 0.18f

    mul-float p3, p3, v6

    .line 158
    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u06e8\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1c75

    const v8, 0x2663af16

    xor-int/2addr v7, v8

    const v8, -0xf9a36af

    goto/16 :goto_0

    :sswitch_a
    if-eqz p5, :cond_4

    const-string v6, "\u06df\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x36f

    const v8, -0x7a5fbbe1

    xor-int/2addr v7, v8

    const v8, 0x78e2fc4

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v6, "\u0730\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x68a3

    const v8, 0x234ef08b

    xor-int/2addr v7, v8

    const v8, -0x6fe03d69

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v6, :cond_5

    :goto_2
    const-string v6, "\u1a79\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2ebb

    const v8, -0x7acc1eb0

    xor-int/2addr v7, v8

    const v8, 0x7fc9f0f7

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u1a73\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3b89

    const v8, -0x17bafdf9

    xor-int/2addr v7, v8

    const v8, -0x57bc1adf

    goto/16 :goto_0

    .line 406
    :sswitch_c
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u06e0\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b91

    const v8, 0x4e8fa3ce

    xor-int/2addr v7, v8

    const v8, 0x1a0bf69e

    goto/16 :goto_0

    .line 527
    :sswitch_d
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_8

    :cond_7
    :goto_3
    const-string v6, "\u05a1\u1a7a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x736f

    const v8, 0x2f6b25c

    xor-int/2addr v7, v8

    const v8, -0x7697f683

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a7a\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x479

    const v8, -0x346d477d    # -1.9230982E7f

    xor-int/2addr v7, v8

    const v8, -0x3c666de9

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v6, :cond_9

    :goto_4
    const-string v6, "\u0733\u06ec"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3513

    const v8, -0x306e4c1e

    xor-int/2addr v7, v8

    const v8, 0x6742212d

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u0730\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2f7

    const v8, -0x3dffc477

    xor-int/2addr v7, v8

    const v8, -0x1f48aa0

    goto/16 :goto_0

    .line 287
    :sswitch_f
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u1a77\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3b39

    const v8, 0x391a5701

    xor-int/2addr v7, v8

    const v8, -0xb5b7b81

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7a\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3cb

    const v8, 0x700aa65a

    xor-int/2addr v7, v8

    const v8, -0x585d6741

    goto/16 :goto_0

    .line 139
    :sswitch_10
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_d

    :cond_c
    const-string v6, "\u1a7a\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5711

    const v8, 0x16317c0

    xor-int/2addr v7, v8

    const v8, -0x6bab6134

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06d6\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3d23

    const v8, 0x1428284b

    xor-int/2addr v7, v8

    const v8, -0x26353076

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cd91c46 -> :sswitch_3
        -0x78919fc1 -> :sswitch_9
        -0x750d07bc -> :sswitch_10
        -0x6f542a93 -> :sswitch_f
        -0x6851ddf2 -> :sswitch_1
        -0x5b2f43c7 -> :sswitch_6
        -0x58e61efb -> :sswitch_7
        -0x4f2f6f64 -> :sswitch_e
        -0x4895af20 -> :sswitch_d
        -0x423980e6 -> :sswitch_2
        -0x3f251365 -> :sswitch_4
        -0x3ae70f76 -> :sswitch_8
        -0x3582f56e -> :sswitch_a
        -0x309ba929 -> :sswitch_5
        -0x2854cac0 -> :sswitch_9
        -0x1a2dd49d -> :sswitch_1
        0x385808b -> :sswitch_6
        0x5f61130 -> :sswitch_2
        0x8167fb8 -> :sswitch_b
        0xee81c83 -> :sswitch_8
        0x127876db -> :sswitch_10
        0x15dde623 -> :sswitch_e
        0x1aaaa0fc -> :sswitch_c
        0x1f084b67 -> :sswitch_0
        0x2161b0ab -> :sswitch_4
        0x338d1faa -> :sswitch_5
        0x384f9fbf -> :sswitch_7
        0x462161fb -> :sswitch_f
        0x536ad925 -> :sswitch_b
        0x53c7c470 -> :sswitch_c
        0x63b51bf9 -> :sswitch_a
        0x6801c431 -> :sswitch_d
        0x7033802c -> :sswitch_0
        0x76ecdc80 -> :sswitch_3
    .end sparse-switch
.end method
