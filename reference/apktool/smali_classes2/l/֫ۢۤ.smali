.class public final Ll/֫ۢۤ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ܰ:Landroid/graphics/Paint;

.field public final ᩶:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const v1, -0x7e39e568

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    .line 704
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v4, "\u1a77\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6ca3

    const v6, 0x254e4067

    xor-int/2addr v5, v6

    const v6, -0x42beb5fb

    :goto_0
    xor-int/2addr v4, v6

    move-object v6, v0

    :goto_1
    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x275b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 705
    new-instance v6, Landroid/graphics/Paint;

    const/4 v4, 0x1

    .line 145
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_2

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v4, :cond_7

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v4, :cond_9

    goto/16 :goto_4

    .line 663
    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e2\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fdd

    const v7, 0x15c3ebcd

    xor-int/2addr v5, v7

    const v7, 0x475e40b2

    goto/16 :goto_5

    .line 260
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_4

    .line 531
    :sswitch_4
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 706
    :sswitch_5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/֫ۢۤ;->᩶:Landroid/graphics/Path;

    return-void

    .line 705
    :sswitch_6
    iput-object v6, p0, Ll/֫ۢۤ;->ܰ:Landroid/graphics/Paint;

    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_1

    goto :goto_3

    :cond_1
    const-string v4, "\u05ab\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4e51

    const v7, 0x92f167d

    xor-int/2addr v5, v7

    const v7, -0x661ff760

    goto/16 :goto_5

    :cond_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    .line 159
    :cond_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    .line 294
    :cond_4
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_5

    goto :goto_2

    :cond_5
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_8

    :cond_7
    const-string v4, "\u05ab\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5089

    const v6, -0x42f13d5d

    xor-int/2addr v5, v6

    const v6, 0x3ef1b16e

    goto/16 :goto_0

    :cond_8
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u073f\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7df9

    const v6, -0x381b6c0a

    xor-int/2addr v5, v6

    const v6, 0x3cefadee

    goto/16 :goto_0

    .line 303
    :cond_a
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_b

    :goto_3
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x653d

    const v6, -0x3e958be

    xor-int/2addr v5, v6

    const v6, 0x662b0f04

    goto/16 :goto_0

    .line 705
    :cond_b
    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x711b

    const v7, -0x6074a177

    xor-int/2addr v5, v7

    const v7, -0x237cabda

    goto :goto_5

    :cond_c
    const-string v4, "\u06d6\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7ac3

    const v7, 0x6cc6c05e

    xor-int/2addr v5, v7

    const v7, -0x1b2d4fde

    :goto_5
    xor-int/2addr v4, v7

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c35ab54 -> :sswitch_4
        -0x5aa8b9f1 -> :sswitch_3
        -0x4f8718fa -> :sswitch_5
        -0x4cf178f7 -> :sswitch_4
        -0x4aab5b95 -> :sswitch_6
        -0x41035c2d -> :sswitch_1
        -0x2db0ddde -> :sswitch_0
        -0x286e5a2e -> :sswitch_3
        -0x17659dd3 -> :sswitch_5
        0x29625c35 -> :sswitch_0
        0x2991e988 -> :sswitch_6
        0x2c993f65 -> :sswitch_2
        0x6e26e5ee -> :sswitch_2
        0x71b8b233 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 21

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

    const v16, -0xd8df4a5

    sget v17, Ll/֡᩻;->᩷ۧ᩺:I

    sget v18, Ll/ۖۙ;->ۤۧۤ:I

    const-string v19, "\u06d7\u1a79"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, 0x17d1

    const v20, 0x41f23441

    xor-int v1, v1, v20

    const v20, 0x66abdf46

    xor-int v19, v19, v20

    move-object v15, v14

    move/from16 v20, v19

    const/16 p2, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const v19, -0xd8df4a5

    move-object v14, v13

    const/4 v13, 0x0

    :goto_0
    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, -0x6257

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    move/from16 v3, p7

    .line 641
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_b

    goto/16 :goto_a

    .line 391
    :sswitch_0
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v0, p2

    move/from16 v3, p7

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v1, :cond_2

    :cond_1
    move/from16 v3, p7

    goto/16 :goto_a

    :cond_2
    :goto_1
    move/from16 v3, p7

    goto/16 :goto_9

    .line 559
    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    :goto_2
    const-string v1, "\u06ec\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x6b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2cd7

    const v20, -0x4c324c6b

    xor-int v3, v3, v20

    const v20, -0x3e01e639

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    return-void

    .line 745
    :sswitch_5
    invoke-virtual {v15}, Landroid/graphics/Path;->rewind()V

    div-float/2addr v4, v10

    sub-float v1, v11, v4

    .line 746
    invoke-virtual {v15, v12, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 747
    invoke-virtual {v15, v13, v11}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v11, v4

    .line 748
    invoke-virtual {v15, v12, v11}, Landroid/graphics/Path;->lineTo(FF)V

    move-object/from16 v1, p1

    .line 749
    invoke-virtual {v1, v15, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    :sswitch_6
    move-object/from16 v1, p1

    const/high16 v3, 0x3f400000    # 0.75f

    .line 744
    invoke-static {v3}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v3

    int-to-float v3, v3

    invoke-static/range {p9 .. p9}, Ll/֡ۖ;->ۢ֡ᩳ(Ljava/lang/Object;)F

    move-result v15

    const v20, 0x3d6147ae    # 0.055f

    mul-float v15, v15, v20

    invoke-static {v3, v15}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 745
    iget-object v15, v0, Ll/֫ۢۤ;->᩶:Landroid/graphics/Path;

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x2d

    xor-int v1, v3, v18

    mul-int/lit16 v1, v1, 0x141f

    const v20, 0x65df9d8

    xor-int v1, v1, v20

    const v20, 0x3b32dff0

    xor-int v20, v3, v20

    goto/16 :goto_0

    .line 740
    :sswitch_7
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 741
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 742
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 743
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v1

    if-nez v1, :cond_4

    :goto_3
    move/from16 v3, p7

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u1a74\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x33

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2bf7

    const v20, -0xedc1c62

    xor-int v3, v3, v20

    const v20, 0x28fcf207

    goto :goto_4

    :sswitch_8
    add-int v1, v8, v9

    int-to-float v1, v1

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v1, v10

    add-float v11, v1, v7

    add-float v12, p5, v6

    add-float v13, v2, v12

    .line 739
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    iget-object v14, v0, Ll/֫ۢۤ;->ܰ:Landroid/graphics/Paint;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, "\u1a7a\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x1987

    const v20, -0x60d05111

    xor-int v3, v3, v20

    const v20, 0x3741aec5

    :goto_4
    xor-int v20, v1, v20

    move v1, v3

    goto/16 :goto_0

    .line 734
    :sswitch_9
    invoke-static/range {p9 .. p9}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result v1

    const v3, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v3

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v6

    .line 735
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    move/from16 v3, p7

    int-to-float v7, v3

    .line 736
    iget v8, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v9, v1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 745
    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u05a8\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, -0x75a9

    const v20, 0x1e97ffeb

    xor-int v0, v0, v20

    const v20, 0xef1ee4c

    :goto_5
    xor-int v20, v1, v20

    goto/16 :goto_7

    :sswitch_a
    move/from16 v3, p7

    .line 733
    invoke-static/range {p2 .. p2}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/֡ۖ;->ۢ֡ᩳ(Ljava/lang/Object;)F

    move-result v1

    const v4, 0x3ed70a3d    # 0.42f

    mul-float v1, v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v0, 0x40800000    # 4.0f

    .line 734
    invoke-static {v0}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v0

    int-to-float v5, v0

    .line 676
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_7

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u1a79\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1d17

    const v20, -0x64b00683

    xor-int v1, v1, v20

    const v20, 0x23af0f75

    goto/16 :goto_b

    :sswitch_b
    move/from16 v3, p7

    const/high16 v0, 0x40400000    # 3.0f

    .line 732
    invoke-static {v0}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/֡ۖ;->ۢ֡ᩳ(Ljava/lang/Object;)F

    move-result v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float v1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 446
    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v1, :cond_8

    const/high16 v0, 0x40c00000    # 6.0f

    :goto_6
    const-string v1, "\u06ec\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x1b

    move/from16 p2, v0

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, -0x277

    const v20, 0x4266e54f

    xor-int v0, v0, v20

    const v20, 0x102d4357

    goto :goto_5

    :cond_8
    const-string v1, "\u1a73\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0xd

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, -0x1ee3

    const v20, 0x6a9fd400

    xor-int v0, v0, v20

    const v20, -0x74be32a4

    xor-int v20, v1, v20

    const/high16 p2, 0x40c00000    # 6.0f

    :goto_7
    move v1, v0

    goto/16 :goto_c

    :sswitch_c
    move/from16 v3, p7

    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_9

    :goto_8
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x1f65

    const v20, 0x10b8fbe5

    xor-int v1, v1, v20

    const v20, 0x56bedab8

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u1a75\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1921

    const v20, -0x3392c8cb    # -6.218466E7f

    xor-int v1, v1, v20

    const v20, 0x320664f8

    goto/16 :goto_b

    :sswitch_d
    move/from16 v3, p7

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v0

    if-ltz v0, :cond_a

    :goto_9
    const-string v0, "\u1a7b\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2c45

    const v20, 0x1f4f2d8f

    xor-int v1, v1, v20

    const v20, -0x359ccd6f

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u06e2\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x389

    const v20, -0x1b0a300b

    xor-int v1, v1, v20

    const v20, -0x1c831d3

    goto :goto_b

    :cond_b
    const-string v0, "\u1a77\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x62c1

    const v20, 0x73c2525e

    xor-int v1, v1, v20

    const v20, 0x6d11e485

    goto :goto_b

    :sswitch_e
    move/from16 v3, p7

    if-eqz v16, :cond_c

    :goto_a
    const-string v0, "\u06e8\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x7

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x39d9

    const v20, 0x4e14dcd0    # 6.243748E8f

    xor-int v1, v1, v20

    const v20, -0x67c0160f

    goto :goto_b

    :cond_c
    const-string v0, "\u1a76\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x33d1

    const v20, -0x3a349550

    xor-int v1, v1, v20

    const v20, -0x3366c314    # -8.034083E7f

    goto :goto_b

    :sswitch_f
    move/from16 v3, p7

    sget v16, Ll/ۖۜ;->֨ۡۗ:I

    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x15

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x305f

    const v20, -0x6841fc45

    xor-int v1, v1, v20

    const v20, 0x7878c3c6

    :goto_b
    xor-int v20, v0, v20

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74bd4f72 -> :sswitch_1
        -0x7356a6aa -> :sswitch_c
        -0x6ddacb5c -> :sswitch_d
        -0x6b7ae4cf -> :sswitch_1
        -0x6ab8cf5c -> :sswitch_c
        -0x5aceeed2 -> :sswitch_0
        -0x5abda0fb -> :sswitch_a
        -0x4bbf9cae -> :sswitch_5
        -0x499badf2 -> :sswitch_e
        -0x4805a032 -> :sswitch_2
        -0x479c8bc1 -> :sswitch_0
        -0x47018e04 -> :sswitch_2
        -0x46ad0687 -> :sswitch_9
        -0x453a90e5 -> :sswitch_8
        -0x43e8956d -> :sswitch_6
        -0x40caab03 -> :sswitch_7
        -0x237e20b8 -> :sswitch_3
        -0x1ed031ae -> :sswitch_5
        -0x1871f965 -> :sswitch_7
        -0x11230fb2 -> :sswitch_f
        -0x3ee4123 -> :sswitch_6
        0xadb7ae2 -> :sswitch_a
        0x1ee06ddb -> :sswitch_4
        0x2284aae5 -> :sswitch_9
        0x2cfdcd04 -> :sswitch_b
        0x37c8fe82 -> :sswitch_4
        0x3c358782 -> :sswitch_d
        0x4c6dd3b4 -> :sswitch_b
        0x5e7364b4 -> :sswitch_e
        0x604ec57e -> :sswitch_f
        0x7c6f20dd -> :sswitch_8
        0x7fa947e8 -> :sswitch_3
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

    const v3, -0xb0f5405

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v6, "\u1a74\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x15

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6995

    const v8, -0x3d1746a8    # -116.362f

    xor-int/2addr v7, v8

    const v8, -0x56313eb4

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x6529

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    const/high16 p2, 0x40400000    # 3.0f

    .line 721
    invoke-static {p2}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result p2

    invoke-static {p1}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e4ccccd    # 0.2f

    mul-float p3, p3, v6

    .line 193
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_3

    .line 65
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_3

    .line 219
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-lez v6, :cond_b

    goto/16 :goto_4

    .line 612
    :sswitch_2
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_6

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    const/4 p1, 0x0

    return p1

    .line 718
    :sswitch_5
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 719
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_1

    .line 715
    :sswitch_6
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v2

    .line 716
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 717
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 381
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v6, "\u1a75\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1c35

    const v8, -0x47e5c56

    xor-int/2addr v7, v8

    const v8, 0x3cdedb90

    goto :goto_0

    .line 722
    :sswitch_7
    invoke-static {v0, v1}, Ll/ۖ֡;->ܰۜ۬(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    return p1

    :sswitch_8
    invoke-static {p1}, Ll/ۗ᩵;->۫ۗ᩶(Ljava/lang/Object;)F

    move-result v1

    const v6, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sget v6, Ll/᩺;->۫۬۫:I

    if-gtz v6, :cond_2

    :cond_1
    const-string v6, "\u05ab\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7641

    const v8, -0x27018f0c

    xor-int/2addr v7, v8

    const v8, -0x36e6a8a7

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u0736\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4145

    const v8, -0x1d196f60

    xor-int/2addr v7, v8

    const v8, 0x66e7c3eb

    goto/16 :goto_0

    .line 721
    :sswitch_9
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/ۖܰ;->ܰۛۖ(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 722
    invoke-static {v0}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v0

    .line 516
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u05ab\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x15f

    const v8, -0x292e99ba

    xor-int/2addr v7, v8

    const v8, 0x3b61f99e

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u1a77\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x14b7

    const v8, -0x3cf0056f

    xor-int/2addr v7, v8

    const v8, -0x70d3d382

    goto/16 :goto_0

    :sswitch_a
    if-eqz p5, :cond_5

    const-string v6, "\u05a1\u06db"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6e97

    const v8, 0x36e78091

    xor-int/2addr v7, v8

    const v8, 0x4657fdf2

    goto/16 :goto_0

    :cond_5
    :goto_1
    const-string v6, "\u1a78\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x273b

    const v8, -0x853ba8d

    xor-int/2addr v7, v8

    const v8, -0x732972a0

    goto/16 :goto_0

    .line 270
    :sswitch_b
    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_7

    :cond_6
    const-string v6, "\u073a\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7ecb

    const v8, 0x27f07af9

    xor-int/2addr v7, v8

    const v8, 0x5ddfd74e

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u073a\u0733"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x12b

    const v8, -0x2946cd8a

    xor-int/2addr v7, v8

    const v8, -0x335ee9fb    # -8.4455464E7f

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v6, :cond_8

    goto :goto_2

    :cond_8
    const-string v6, "\u06df\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xeb1

    const v8, 0x5b36b2ec

    xor-int/2addr v7, v8

    const v8, 0x5c2cccb9

    goto/16 :goto_0

    .line 412
    :sswitch_d
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_9

    goto :goto_2

    :cond_9
    const-string v6, "\u073d\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2417

    const v8, 0x6876b5af

    xor-int/2addr v7, v8

    const v8, 0x4759935a

    goto/16 :goto_0

    .line 176
    :sswitch_e
    sget v6, Ll/ۖ;->ܿۚ֡:I

    if-ltz v6, :cond_a

    :goto_2
    const-string v6, "\u1a76\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x63

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4011

    const v8, -0x2464561d

    xor-int/2addr v7, v8

    const v8, -0x7b20bff

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a79\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b3

    const v8, -0x7ae0c7fd

    xor-int/2addr v7, v8

    const v8, -0x6144a3c2

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_3
    const-string v6, "\u06d9\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4013

    const v8, -0x4a6937f8

    xor-int/2addr v7, v8

    const v8, -0x20c43a04

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u05a8\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x9

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x56fb

    const v8, -0x61688d16

    xor-int/2addr v7, v8

    const v8, -0x54433a5

    goto/16 :goto_0

    .line 550
    :sswitch_10
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v6, :cond_d

    :goto_4
    const-string v6, "\u1a7a\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7d3d

    const v8, 0x1e19fe76

    xor-int/2addr v7, v8

    const v8, -0x73c7ca25

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e0\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x49d1

    const v8, -0x304e34c3

    xor-int/2addr v7, v8

    const v8, -0xdc9f5f3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d542e0e -> :sswitch_3
        -0x76851866 -> :sswitch_1
        -0x7091d872 -> :sswitch_d
        -0x4e23a8f1 -> :sswitch_9
        -0x4a03e819 -> :sswitch_8
        -0x4960f18a -> :sswitch_4
        -0x333a6897 -> :sswitch_f
        -0x31001781 -> :sswitch_3
        -0x27d822cd -> :sswitch_e
        -0x16c0f51c -> :sswitch_a
        -0x157b2a73 -> :sswitch_2
        -0xdad4fa4 -> :sswitch_a
        -0xc496a85 -> :sswitch_10
        -0x927d0e3 -> :sswitch_d
        -0x8123891 -> :sswitch_c
        0x22ea19a -> :sswitch_5
        0x2bd7dcf -> :sswitch_f
        0x78cf6b6 -> :sswitch_c
        0xfacf507 -> :sswitch_5
        0x19031140 -> :sswitch_e
        0x2073e369 -> :sswitch_7
        0x247c4e85 -> :sswitch_6
        0x317542a9 -> :sswitch_b
        0x32cb09eb -> :sswitch_0
        0x36c4bcca -> :sswitch_1
        0x386d7359 -> :sswitch_4
        0x3e98df4c -> :sswitch_9
        0x43a4a522 -> :sswitch_0
        0x4a03a638 -> :sswitch_2
        0x5358db9e -> :sswitch_7
        0x5a11aa31 -> :sswitch_6
        0x6993dd03 -> :sswitch_b
        0x70e5a179 -> :sswitch_8
        0x7f81410b -> :sswitch_10
    .end sparse-switch
.end method
