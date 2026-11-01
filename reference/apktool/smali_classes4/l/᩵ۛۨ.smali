.class public final Ll/᩵ۛۨ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ܺ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 6

    const v0, 0xa4bb933

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    .line 663
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x73d

    const v5, -0x3e8b9bf1

    xor-int/2addr v4, v5

    const v5, 0x729aa39e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xd3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 603
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_2

    .line 121
    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-lez v3, :cond_a

    goto :goto_1

    .line 460
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_1

    goto :goto_2

    .line 197
    :sswitch_2
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v3, :cond_3

    goto :goto_2

    .line 600
    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 664
    :sswitch_4
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_0

    goto :goto_2

    .line 86
    :cond_0
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u0736\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2e4b

    const v5, 0x36bb5aa0

    xor-int/2addr v4, v5

    const v5, -0x74699f1d

    goto :goto_0

    :cond_2
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_4

    :cond_3
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x52af

    const v5, -0x593188c8

    xor-int/2addr v4, v5

    const v5, 0x4b960c15    # 1.9666986E7f

    goto :goto_0

    .line 114
    :cond_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    .line 373
    :cond_5
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_6

    goto :goto_2

    .line 57
    :cond_6
    sget v5, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v5, :cond_7

    goto :goto_3

    .line 608
    :cond_7
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_8

    goto :goto_3

    .line 462
    :cond_8
    sget v5, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v5, :cond_9

    :goto_2
    const-string v3, "\u06ec\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x69df

    const v5, 0x79053152

    xor-int/2addr v4, v5

    const v5, -0x2c21b911

    goto/16 :goto_0

    .line 428
    :cond_9
    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_b

    :cond_a
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x694f

    const v5, -0x51a4320a

    xor-int/2addr v4, v5

    const v5, -0x3e79aeca

    goto/16 :goto_0

    .line 344
    :cond_b
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_c

    :goto_3
    const-string v3, "\u06dc\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x68c1

    const v5, -0x5895862

    xor-int/2addr v4, v5

    const v5, -0x4609d432

    goto/16 :goto_0

    .line 664
    :cond_c
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, Ll/᩵ۛۨ;->ܺ:Landroid/graphics/Paint;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7b650325 -> :sswitch_2
        -0x69cd227b -> :sswitch_0
        -0x691e7ac0 -> :sswitch_2
        -0x3f95921e -> :sswitch_4
        -0x393ddaa9 -> :sswitch_1
        -0x31564b7e -> :sswitch_3
        -0x1535a92f -> :sswitch_3
        0x6d95281c -> :sswitch_0
        0x73768994 -> :sswitch_1
        0x77166a7c -> :sswitch_4
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

    const v13, 0x1bae3ce

    sget v14, Ll/֫ۚ;->ܽ۠᩹:I

    sget v15, Ll/۟;->ۨᩴۛ:I

    const-string v16, "\u06d8\u06e2"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    mul-int/lit8 v16, v16, 0xb

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, 0x3e33

    const v17, -0x10e77d

    xor-int v0, v0, v17

    const v17, 0x1729c883

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

    const v16, 0x1bae3ce

    :goto_0
    xor-int v13, v16, v14

    mul-int/lit16 v13, v13, -0x153

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v13, p0

    .line 691
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3, v0}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v0

    .line 692
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v5

    int-to-float v0, v0

    add-float v6, p5, v0

    int-to-float v7, v2

    .line 359
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_4

    goto :goto_1

    :sswitch_0
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_1

    :cond_0
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_8

    :cond_1
    move-object/from16 v13, p0

    :goto_1
    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_7

    :sswitch_1
    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_0

    :goto_2
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_5

    .line 353
    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v13, p0

    move/from16 v17, v2

    goto/16 :goto_6

    .line 498
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto :goto_2

    .line 357
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    return-void

    .line 694
    :sswitch_5
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v12, v0

    int-to-float v0, v12

    div-float/2addr v0, v8

    add-float/2addr v0, v11

    .line 695
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    move-object/from16 v13, p0

    iget-object v2, v13, Ll/᩵ۛۨ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 696
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    move-object/from16 v8, p1

    .line 697
    invoke-virtual {v8, v10, v0, v9, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    :sswitch_6
    move-object/from16 v13, p0

    move-object/from16 v8, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float v9, v7, v0

    add-float v10, v6, v9

    move/from16 v11, p7

    int-to-float v12, v11

    .line 694
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 523
    sget v17, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v17, :cond_3

    move/from16 v18, v1

    move/from16 v17, v2

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move v12, v0

    goto/16 :goto_5

    :cond_3
    const-string v17, "\u06d9\u05a1"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v14

    mul-int/lit8 v17, v17, 0x3d

    move/from16 p4, v0

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x456b

    const v18, -0x7f4636ae

    xor-int v0, v0, v18

    const v18, 0x6111edcf

    xor-int v17, v17, v18

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move/from16 v12, p4

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u1a76\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move/from16 v17, v2

    xor-int v2, v0, v15

    mul-int/lit16 v2, v2, 0x3bd7

    const v18, -0x6fff885

    xor-int v2, v2, v18

    const v18, -0x21a12b66

    goto/16 :goto_4

    :sswitch_7
    move-object/from16 v13, p0

    .line 690
    invoke-static/range {p9 .. p9}, Ll/ۧ;->۬ۡ᩺(Ljava/lang/Object;)F

    move-result v0

    const v2, 0x3e3851ec    # 0.18f

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v1, v0}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v2

    const/high16 v0, 0x40800000    # 4.0f

    .line 691
    invoke-static {v0}, Ll/֫;->ܰۛ۬(F)I

    move-result v3

    invoke-static/range {p9 .. p9}, Ll/֨ۧ;->ۜܺۙ(Ljava/lang/Object;)F

    move-result v0

    const v4, 0x3e0f5c29    # 0.14f

    mul-float v4, v4, v0

    .line 44
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06db\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move/from16 v18, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x3e6f

    const v17, 0x494c4c54    # 836805.25f

    xor-int v1, v1, v17

    const v17, -0x4d810a12

    goto :goto_3

    :cond_5
    move/from16 v18, v1

    const-string v0, "\u0733\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x421

    const v17, -0x763855b2

    xor-int v1, v1, v17

    const v17, 0x79fcdd43

    :goto_3
    xor-int v17, v0, v17

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v13, p0

    move/from16 v17, v2

    const/high16 v0, 0x40200000    # 2.5f

    .line 690
    invoke-static {v0}, Ll/֫;->ܰۛ۬(F)I

    move-result v1

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v0

    if-gtz v0, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06df\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x2365

    const v18, 0x7bb75c7d

    xor-int v2, v2, v18

    const v18, 0x351645f8

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

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06ec\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x19

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2233

    const v2, -0x65c60ecb

    xor-int/2addr v1, v2

    const v2, -0x6829b7c1

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_8

    :goto_5
    const-string v0, "\u1a75\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x47fd

    const v2, -0x21273d6a

    xor-int/2addr v1, v2

    const v2, 0x1c0b3751

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x29b7

    const v2, 0x3ec7007e

    xor-int/2addr v1, v2

    const v2, 0x5433e242

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget-boolean v0, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v0, :cond_9

    move/from16 v1, v18

    :goto_6
    const-string v0, "\u1a79\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v15

    mul-int/lit16 v2, v2, 0x6069

    const v18, 0x294c9934

    xor-int v2, v2, v18

    const v18, 0x3e515a86

    goto :goto_4

    :cond_9
    const-string v0, "\u1a74\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x105

    const v2, 0x1f261d3f

    xor-int/2addr v1, v2

    const v2, -0x160f8e95

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u073a\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x53

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x680b

    const v2, 0x3e9f68da

    xor-int/2addr v1, v2

    const v2, -0x420d0244

    goto :goto_9

    :sswitch_d
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 623
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x40c3

    const v2, -0x725c0acc

    xor-int/2addr v1, v2

    const v2, 0x4c74bed1    # 6.4158532E7f

    goto :goto_9

    :cond_b
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x50d7

    const v2, -0x7c2f74ab

    xor-int/2addr v1, v2

    const v2, -0x5e00ba56

    goto :goto_9

    :sswitch_e
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    if-ltz p2, :cond_c

    :goto_8
    const-string v0, "\u06e8\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x5c6b

    const v2, -0x28272a47

    xor-int/2addr v1, v2

    const v2, -0x16a05423

    goto :goto_9

    :cond_c
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0xbd

    const v2, 0x6d6a8fb

    xor-int/2addr v1, v2

    const v2, 0x3561c32f

    :goto_9
    xor-int/2addr v0, v2

    move/from16 v2, v17

    move/from16 v17, v0

    :goto_a
    move v0, v1

    goto :goto_b

    :sswitch_f
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget v0, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v1, "\u06dc\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0xf39

    const v19, -0x8d5cff0

    xor-int v2, v2, v19

    const v19, 0x253fc0e3

    xor-int v1, v1, v19

    move/from16 p2, v0

    move v0, v2

    move/from16 v2, v17

    move/from16 v17, v1

    :goto_b
    move/from16 v1, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79efe48d -> :sswitch_1
        -0x6980da64 -> :sswitch_b
        -0x67a93368 -> :sswitch_c
        -0x61a8aef1 -> :sswitch_9
        -0x60c36457 -> :sswitch_1
        -0x5a842cec -> :sswitch_f
        -0x55755588 -> :sswitch_6
        -0x507d2048 -> :sswitch_5
        -0x351706df -> :sswitch_e
        -0x2e7a48dd -> :sswitch_3
        -0x2993d326 -> :sswitch_4
        -0x23ce5a07 -> :sswitch_b
        -0x232db085 -> :sswitch_0
        -0x1fea7cab -> :sswitch_7
        -0x1cfa7d43 -> :sswitch_8
        -0x429936e -> :sswitch_8
        -0xfab2fd -> :sswitch_d
        -0x8d34f2 -> :sswitch_7
        0x624e934 -> :sswitch_a
        0xe122bf2 -> :sswitch_9
        0x233b221d -> :sswitch_2
        0x2a68150a -> :sswitch_e
        0x2cbb49dc -> :sswitch_d
        0x318a3970 -> :sswitch_6
        0x3339575c -> :sswitch_2
        0x40181e4b -> :sswitch_4
        0x42665e8d -> :sswitch_3
        0x47b3f00f -> :sswitch_5
        0x4e28254e -> :sswitch_c
        0x53f5c32a -> :sswitch_f
        0x5da9f856 -> :sswitch_0
        0x7443873b -> :sswitch_a
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

    const v3, 0x2fdb3734

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    const-string v6, "\u06e8\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3e01

    const v8, -0x5ef8283a

    xor-int/2addr v7, v8

    const v8, 0x2c354ce9

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x2547

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 641
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v6, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v6, "\u06e8\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3ee9

    const v8, 0x14821922

    xor-int/2addr v7, v8

    const v8, 0x6a0651f2

    goto :goto_0

    .line 145
    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_9

    goto/16 :goto_2

    :sswitch_1
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_c

    goto/16 :goto_2

    .line 487
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_2

    .line 247
    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 p1, 0x0

    return p1

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

    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u0736\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x1f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5085

    const v8, -0x1b2994aa

    xor-int/2addr v7, v8

    const v8, 0x7b268ae4

    goto :goto_0

    .line 680
    :sswitch_6
    invoke-static {v0, v1}, Ll/֨֫;->ܺܰ۬(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    return p1

    :sswitch_7
    invoke-static {p1}, Ll/֨ۧ;->ۜܺۙ(Ljava/lang/Object;)F

    move-result v1

    const v6, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 636
    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u0730\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x36c5

    const v8, 0x7a3c23e1

    xor-int/2addr v7, v8

    const v8, -0x6b3b42c6

    goto/16 :goto_0

    .line 679
    :sswitch_8
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 680
    invoke-static {v0}, Ll/֡ܳ;->ۛۤ۠(F)I

    move-result v0

    .line 262
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_3

    const-string v6, "\u1a78\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x27c3

    const v8, 0x748a9263

    xor-int/2addr v7, v8

    const v8, -0x7c7c6507

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06db\u06eb"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6c41

    const v8, -0x20ae73f9

    xor-int/2addr v7, v8

    const v8, 0x13835371

    goto/16 :goto_0

    :sswitch_9
    const/high16 p2, 0x40200000    # 2.5f

    .line 679
    invoke-static {p2}, Ll/֫;->ܰۛ۬(F)I

    move-result p2

    invoke-static {p1}, Ll/֨ۧ;->ۜܺۙ(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e3851ec    # 0.18f

    mul-float p3, p3, v6

    .line 476
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v6

    if-gtz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u1a73\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x65

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1409

    const v8, -0x37b9b4e5

    xor-int/2addr v7, v8

    const v8, -0x31598388

    goto/16 :goto_0

    :sswitch_a
    if-eqz p5, :cond_5

    const-string v6, "\u073d\u073a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xaed

    const v8, -0x171fafe8

    xor-int/2addr v7, v8

    const v8, -0x289c038a

    goto/16 :goto_0

    :cond_5
    :goto_1
    const-string v6, "\u06e1\u073d"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x112b

    const v8, -0x3c20ca15

    xor-int/2addr v7, v8

    const v8, -0x63c0fc8a

    goto/16 :goto_0

    .line 366
    :sswitch_b
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v6

    if-ltz v6, :cond_6

    :goto_2
    const-string v6, "\u06d8\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1093

    const v8, -0x40b206c3

    xor-int/2addr v7, v8

    const v8, -0x156a661d

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e2\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7ea3

    const v8, -0x164e1dfe

    xor-int/2addr v7, v8

    const v8, 0x585fdffb

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v6, "\u06df\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5087

    const v8, 0x20bfd19e

    xor-int/2addr v7, v8

    const v8, -0x687420a0

    goto/16 :goto_0

    .line 97
    :sswitch_d
    sget v6, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v6, :cond_8

    goto :goto_3

    :cond_8
    const-string v6, "\u06e7\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6f5b

    const v8, -0x1796f220

    xor-int/2addr v7, v8

    const v8, 0x712dca3f

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v6, :cond_a

    :cond_9
    :goto_3
    const-string v6, "\u06e2\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x57

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7d61

    const v8, -0x32af8d3f    # -2.1857384E8f

    xor-int/2addr v7, v8

    const v8, -0x24b65bc0

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a77\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x35d1

    const v8, 0x700d4293

    xor-int/2addr v7, v8

    const v8, -0x338c5164    # -6.387979E7f

    goto/16 :goto_0

    .line 414
    :sswitch_f
    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v6, :cond_b

    goto :goto_4

    :cond_b
    const-string v6, "\u073d\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x33c5

    const v8, -0x5b100813

    xor-int/2addr v7, v8

    const v8, 0x5bd40225

    goto/16 :goto_0

    .line 9
    :sswitch_10
    sget-boolean v6, Ll/᩶;->ۚۤۘ:Z

    if-eqz v6, :cond_d

    :cond_c
    :goto_4
    const-string v6, "\u073f\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x135d

    const v8, 0x70cbdd40

    xor-int/2addr v7, v8

    const v8, 0x1bc745b4

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u0730\u06d8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7787

    const v8, 0x4cdcf232    # 1.1583938E8f

    xor-int/2addr v7, v8

    const v8, -0x76a1529d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x718b139b -> :sswitch_e
        -0x5e5672b9 -> :sswitch_1
        -0x537b53e1 -> :sswitch_3
        -0x5249e577 -> :sswitch_7
        -0x405957e6 -> :sswitch_0
        -0x3e1f80ae -> :sswitch_b
        -0x3d881817 -> :sswitch_0
        -0x3417b614 -> :sswitch_5
        -0x319854ba -> :sswitch_2
        -0x3115da0d -> :sswitch_f
        -0x23e96878 -> :sswitch_9
        -0x10d218af -> :sswitch_c
        -0x56a5411 -> :sswitch_7
        -0xd5da3b -> :sswitch_4
        -0x35fab -> :sswitch_10
        0x98bc1a9 -> :sswitch_b
        0xac4aa8a -> :sswitch_6
        0xeb88a2c -> :sswitch_3
        0x19d09cac -> :sswitch_d
        0x1a2d9c01 -> :sswitch_2
        0x1b5a7022 -> :sswitch_f
        0x26f42bba -> :sswitch_10
        0x320377b3 -> :sswitch_e
        0x355207ef -> :sswitch_8
        0x3cd351ad -> :sswitch_a
        0x3e0d637e -> :sswitch_d
        0x499fd670 -> :sswitch_9
        0x56d595ad -> :sswitch_c
        0x5aa58657 -> :sswitch_4
        0x5e012802 -> :sswitch_5
        0x66f4cfbd -> :sswitch_8
        0x69d48504 -> :sswitch_1
        0x77b13be5 -> :sswitch_6
        0x7b08acf4 -> :sswitch_a
    .end sparse-switch
.end method
