.class public final Ll/۠ۛۨ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ܺ:Landroid/graphics/Paint;

.field public final ᩶:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const v1, -0x8decae5

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    .line 704
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v4, "\u06e4\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x770b

    const v6, 0x13f1797

    xor-int/2addr v5, v6

    const v6, -0x7b40f604

    :goto_0
    xor-int/2addr v4, v6

    move-object v6, v0

    :goto_1
    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0xd7d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 705
    iput-object v6, p0, Ll/۠ۛۨ;->ܺ:Landroid/graphics/Paint;

    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_0

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_4

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v4

    if-nez v4, :cond_b

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v4, :cond_9

    goto :goto_2

    .line 59
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto :goto_2

    .line 362
    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 706
    :sswitch_5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/۠ۛۨ;->᩶:Landroid/graphics/Path;

    return-void

    :cond_0
    const-string v4, "\u06e4\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6d8d

    const v7, -0x7ca75664

    xor-int/2addr v5, v7

    const v7, 0x62980a18

    goto/16 :goto_6

    .line 705
    :sswitch_6
    new-instance v6, Landroid/graphics/Paint;

    const/4 v4, 0x1

    .line 423
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_1

    goto :goto_3

    .line 646
    :cond_1
    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v5, :cond_2

    goto :goto_4

    :cond_2
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_3

    :goto_2
    const-string v4, "\u06ec\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x34f1

    const v6, 0x7f7e69c5

    xor-int/2addr v5, v6

    const v6, -0xf406c5b

    goto :goto_0

    :cond_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v5

    if-gtz v5, :cond_5

    :cond_4
    const-string v4, "\u073f\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x55d9

    const v6, -0x556700f7

    xor-int/2addr v5, v6

    const v6, 0x11f5b3ea

    goto/16 :goto_0

    .line 410
    :cond_5
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v5, :cond_7

    goto :goto_5

    .line 2
    :cond_7
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v5

    if-ltz v5, :cond_8

    :goto_3
    const-string v4, "\u1a7b\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28c5

    const v6, -0x6c1b86bd

    xor-int/2addr v5, v6

    const v6, -0x252dd8d6

    goto/16 :goto_0

    .line 446
    :cond_8
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u073d\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2869

    const v6, -0x4af094ee

    xor-int/2addr v5, v6

    const v6, -0x34642b00

    goto/16 :goto_0

    .line 705
    :cond_a
    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 46
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06e0\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2d5b

    const v6, 0xbe1707d

    xor-int/2addr v5, v6

    const v6, 0x75bf2cf8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5beb

    const v7, 0x65a3f856

    xor-int/2addr v5, v7

    const v7, -0x5cf9ddb7

    :goto_6
    xor-int/2addr v4, v7

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e1c987d -> :sswitch_0
        -0x5e3e31ca -> :sswitch_6
        -0x52c97af6 -> :sswitch_4
        -0x40a419bc -> :sswitch_0
        -0x3e042ae8 -> :sswitch_3
        -0x3baabe7a -> :sswitch_1
        -0x2d93bf76 -> :sswitch_5
        -0x1b412b49 -> :sswitch_2
        -0x111ae800 -> :sswitch_3
        0x3ede594 -> :sswitch_5
        0x47cd051c -> :sswitch_2
        0x4ab6bbc9 -> :sswitch_1
        0x4b586831 -> :sswitch_6
        0x54f1607a -> :sswitch_4
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

    const v16, 0x1a7af388

    sget v17, Ll/֡᩶;->ۗ֨ܺ:I

    sget v18, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v19, "\u06df\u073d"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, 0x25

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, 0x7f93

    const v20, -0x9468b3b

    xor-int v1, v1, v20

    const v20, -0x53609600

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

    const v19, 0x1a7af388

    move-object v14, v13

    const/4 v13, 0x0

    :goto_0
    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, 0x3917

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    move/from16 v3, p7

    .line 733
    invoke-static/range {p2 .. p2}, Ll/֫;->ܰۛ۬(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/ۧ;->۬ۡ᩺(Ljava/lang/Object;)F

    move-result v1

    const v4, 0x3ed70a3d    # 0.42f

    mul-float v1, v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v0, 0x40800000    # 4.0f

    .line 734
    invoke-static {v0}, Ll/֫;->ܰۛ۬(F)I

    move-result v0

    int-to-float v5, v0

    .line 120
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_6

    .line 515
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v1, :cond_0

    :goto_1
    move/from16 v3, p7

    goto/16 :goto_9

    :cond_0
    move/from16 v0, p2

    move/from16 v3, p7

    goto/16 :goto_7

    .line 330
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v1, :cond_4

    goto :goto_1

    .line 236
    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v1, p1

    goto :goto_2

    .line 211
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

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
    invoke-static {v3}, Ll/֫;->ܰۛ۬(F)I

    move-result v3

    int-to-float v3, v3

    invoke-static/range {p9 .. p9}, Ll/֨ۧ;->ۜܺۙ(Ljava/lang/Object;)F

    move-result v15

    const v20, 0x3d6147ae    # 0.055f

    mul-float v15, v15, v20

    invoke-static {v3, v15}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 745
    iget-object v15, v0, Ll/۠ۛۨ;->᩶:Landroid/graphics/Path;

    .line 505
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_2

    :goto_2
    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x75

    xor-int v1, v3, v18

    mul-int/lit16 v1, v1, -0xca3

    const v20, 0x31afb436

    xor-int v1, v1, v20

    const v20, 0x50afc1eb

    xor-int v20, v3, v20

    goto/16 :goto_0

    :cond_2
    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x1ab

    const v20, 0x319b4219

    xor-int v3, v3, v20

    const v20, 0xcd53efb

    goto/16 :goto_4

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

    .line 665
    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v1, :cond_3

    goto :goto_3

    :cond_3
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x63

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x64df

    const v20, 0x3569491a

    xor-int v3, v3, v20

    const v20, -0x38691f69

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

    iget-object v14, v0, Ll/۠ۛۨ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 197
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    :goto_3
    const-string v1, "\u0736\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5bfb

    const v20, 0xdba8ab1

    xor-int v3, v3, v20

    const v20, -0x7064eb32

    goto :goto_4

    :cond_5
    const-string v1, "\u05a1\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5927

    const v20, 0x1344a21f

    xor-int v3, v3, v20

    const v20, -0x62d61073

    :goto_4
    xor-int v20, v1, v20

    move v1, v3

    goto/16 :goto_0

    .line 734
    :sswitch_9
    invoke-static/range {p9 .. p9}, Ll/ۧ;->۬ۡ᩺(Ljava/lang/Object;)F

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

    .line 412
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_6

    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, 0x5e8f

    const v20, -0x4d3b0bf6

    xor-int v0, v0, v20

    const v20, -0x696c5192

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u1a76\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x779d

    const v20, 0x30f4521b

    xor-int v1, v1, v20

    const v20, -0x6b15024a

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u1a73\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x29

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2941

    const v20, 0x2959949b

    xor-int v1, v1, v20

    const v20, -0x7ba34dcb

    goto/16 :goto_a

    :sswitch_a
    move/from16 v3, p7

    const/high16 v0, 0x40400000    # 3.0f

    .line 732
    invoke-static {v0}, Ll/֫;->ܰۛ۬(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/֨ۧ;->ۜܺۙ(Ljava/lang/Object;)F

    move-result v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float v1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_8

    const/high16 v0, 0x40c00000    # 6.0f

    goto :goto_7

    :cond_8
    const-string v1, "\u06ec\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x43

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, 0x1965

    const v20, 0x106b2019

    xor-int v0, v0, v20

    const v20, 0x49ebf305

    xor-int v20, v1, v20

    const/high16 p2, 0x40c00000    # 6.0f

    :goto_5
    move v1, v0

    goto/16 :goto_b

    :sswitch_b
    move/from16 v3, p7

    .line 35
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_9

    :goto_6
    move/from16 v0, p2

    goto :goto_7

    :cond_9
    const-string v0, "\u073a\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x54b3

    const v20, -0x1b303644

    xor-int v1, v1, v20

    const v20, 0xdc735f2

    goto/16 :goto_a

    :sswitch_c
    move/from16 v3, p7

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_a

    goto :goto_6

    :goto_7
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    move/from16 p2, v0

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, 0x14b1

    const v20, -0x7a761d24

    xor-int v0, v0, v20

    const v20, 0x1e6b77bc

    :goto_8
    xor-int v20, v1, v20

    goto :goto_5

    :cond_a
    const-string v0, "\u06d6\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1e99

    const v20, 0x5e1fd1ce

    xor-int v1, v1, v20

    const v20, 0x40904b15

    goto :goto_a

    :sswitch_d
    move/from16 v3, p7

    .line 627
    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_b

    goto :goto_9

    :cond_b
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v18

    mul-int/lit8 v1, v1, 0x6d

    const v20, 0x636a3a9c

    xor-int v1, v1, v20

    const v20, 0x5d661e8e

    goto :goto_a

    :sswitch_e
    move/from16 v3, p7

    if-ltz v16, :cond_c

    :goto_9
    const-string v0, "\u1a79\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x1f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x1a45

    const v20, -0x71142833

    xor-int v1, v1, v20

    const v20, 0x147e011d

    goto :goto_a

    :cond_c
    const-string v0, "\u06e1\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x75c1

    const v20, 0x5ff02c2e

    xor-int v1, v1, v20

    const v20, -0x6a0ab65b

    goto :goto_a

    :sswitch_f
    move/from16 v3, p7

    .line 469
    sget v16, Ll/۟;->ۨᩴۛ:I

    const-string v0, "\u0736\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x72f7

    const v20, -0x1a972087

    xor-int v1, v1, v20

    const v20, 0x27116ed4

    :goto_a
    xor-int v20, v0, v20

    :goto_b
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f9496fd -> :sswitch_1
        -0x7c722b2c -> :sswitch_1
        -0x7a035c1f -> :sswitch_0
        -0x6d2aeb03 -> :sswitch_5
        -0x6adcc0cc -> :sswitch_d
        -0x67bc9edd -> :sswitch_a
        -0x6453867a -> :sswitch_7
        -0x4a891772 -> :sswitch_5
        -0x488df30e -> :sswitch_6
        -0x46ee9a96 -> :sswitch_e
        -0x3e352ae7 -> :sswitch_8
        -0x34971c0a -> :sswitch_3
        -0x26b99bcb -> :sswitch_4
        -0x216f9f96 -> :sswitch_b
        -0x1ad0aca7 -> :sswitch_e
        -0xb3fc620 -> :sswitch_c
        0x329d6c7 -> :sswitch_7
        0xae9378e -> :sswitch_8
        0x119b0311 -> :sswitch_2
        0x1381fec0 -> :sswitch_f
        0x171f293b -> :sswitch_0
        0x17749489 -> :sswitch_a
        0x25a37581 -> :sswitch_c
        0x27e2ed67 -> :sswitch_b
        0x306529e6 -> :sswitch_d
        0x33147caf -> :sswitch_9
        0x43043dc2 -> :sswitch_6
        0x4e595a7b -> :sswitch_4
        0x4fc74549 -> :sswitch_3
        0x63938a22 -> :sswitch_f
        0x67c3afc9 -> :sswitch_9
        0x747f59d9 -> :sswitch_2
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

    const v3, -0x2d019d78

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    const-string v6, "\u073a\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x793

    const v8, -0x5609548a

    xor-int/2addr v7, v8

    const v8, -0x3ac2ef6

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x5a8d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 381
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_6

    .line 204
    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v6, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v6, :cond_c

    goto :goto_1

    :sswitch_1
    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v6, "\u06e1\u06db"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1273

    const v8, -0x395dfdc2

    xor-int/2addr v7, v8

    const v8, 0x1b03aca8

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    const/4 p1, 0x0

    return p1

    .line 718
    :sswitch_4
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 719
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_3

    .line 715
    :sswitch_5
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v2

    .line 716
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 717
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 679
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v6

    if-nez v6, :cond_1

    :goto_2
    const-string v6, "\u05ab\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x79

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7455

    const v8, 0x4aa90061    # 5537840.5f

    xor-int/2addr v7, v8

    const v8, -0x6b8ca807

    goto :goto_0

    :cond_1
    const-string v6, "\u073d\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3809

    const v8, 0xdd900d0

    xor-int/2addr v7, v8

    const v8, 0x6499af0e

    goto/16 :goto_0

    .line 722
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

    sget-boolean v6, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v6, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v6, "\u06eb\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6857

    const v8, 0x50d9d253

    xor-int/2addr v7, v8

    const v8, -0x234619d5

    goto/16 :goto_0

    .line 721
    :sswitch_8
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 722
    invoke-static {v0}, Ll/֫;->ܰۛ۬(F)I

    move-result v0

    .line 501
    sget v6, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v6, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v6, "\u06e0\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xcf3

    const v8, -0x79d071a6

    xor-int/2addr v7, v8

    const v8, -0x3625f8e9

    goto/16 :goto_0

    :sswitch_9
    const/high16 p2, 0x40400000    # 3.0f

    .line 721
    invoke-static {p2}, Ll/֫;->ܰۛ۬(F)I

    move-result p2

    invoke-static {p1}, Ll/ۧ;->۬ۡ᩺(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e4ccccd    # 0.2f

    mul-float p3, p3, v6

    .line 277
    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v6, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v6, "\u05ab\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3e8d

    const v8, -0x65bf3751

    xor-int/2addr v7, v8

    const v8, -0x282fb7c9

    goto/16 :goto_0

    :sswitch_a
    if-eqz p5, :cond_5

    const-string v6, "\u06d7\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x65

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x68ff

    const v8, -0x195038f6

    xor-int/2addr v7, v8

    const v8, -0x2421a975

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v6, "\u06d6\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3f89

    const v8, 0x414617e5

    xor-int/2addr v7, v8

    const v8, -0x51079e52

    goto/16 :goto_0

    .line 677
    :sswitch_b
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_7

    :cond_6
    :goto_4
    const-string v6, "\u05ab\u073d"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7615

    const v8, -0xc378d6f

    xor-int/2addr v7, v8

    const v8, 0x1c2d343

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a7a\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x96b

    const v8, -0x4def9d72

    xor-int/2addr v7, v8

    const v8, -0x66690275

    goto/16 :goto_0

    .line 706
    :sswitch_c
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v6, "\u05ab\u1a7b"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x55ed

    const v8, 0x3ac2d3a7

    xor-int/2addr v7, v8

    const v8, -0x497016fd

    goto/16 :goto_0

    .line 566
    :sswitch_d
    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v6, :cond_9

    goto :goto_5

    :cond_9
    const-string v6, "\u06d7\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x44ef

    const v8, -0x2aea2156

    xor-int/2addr v7, v8

    const v8, -0x21f3367

    goto/16 :goto_0

    .line 435
    :sswitch_e
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "\u05a1\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x62f1

    const v8, 0xee7ac03

    xor-int/2addr v7, v8

    const v8, -0x463b36e

    goto/16 :goto_0

    .line 189
    :sswitch_f
    sget v6, Ll/֨ۧ;->֫۠֡:I

    if-gtz v6, :cond_b

    :goto_5
    const-string v6, "\u06df\u06d7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x78f1

    const v8, 0x2f2492c0

    xor-int/2addr v7, v8

    const v8, 0x5009435

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e8\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x49c7

    const v8, 0x6de1e157

    xor-int/2addr v7, v8

    const v8, -0x3290d2a5    # -2.5079544E8f

    goto/16 :goto_0

    .line 438
    :sswitch_10
    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u06e4\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x29c7

    const v8, 0x7f50ebc9

    xor-int/2addr v7, v8

    const v8, 0x1165823a

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e0\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x67

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x672d

    const v8, -0x7dc3619e

    xor-int/2addr v7, v8

    const v8, -0x743f9e31

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x65bf840b -> :sswitch_9
        -0x61c26773 -> :sswitch_2
        -0x5685db40 -> :sswitch_5
        -0x51eba13f -> :sswitch_0
        -0x4e87b49d -> :sswitch_8
        -0x440f6945 -> :sswitch_5
        -0x436f27d0 -> :sswitch_e
        -0x3a16358a -> :sswitch_4
        -0x26ad4d47 -> :sswitch_d
        -0x1bd35b80 -> :sswitch_3
        -0x11ea4c97 -> :sswitch_0
        -0xbba4441 -> :sswitch_f
        -0xb2b5996 -> :sswitch_2
        -0x5664674 -> :sswitch_4
        0xa3551f -> :sswitch_10
        0x1988027 -> :sswitch_1
        0x4f99da0 -> :sswitch_b
        0x1384e13c -> :sswitch_10
        0x248ec9f4 -> :sswitch_1
        0x260d3e54 -> :sswitch_7
        0x288fd28c -> :sswitch_b
        0x30f84ad5 -> :sswitch_9
        0x322bae53 -> :sswitch_8
        0x3306948e -> :sswitch_a
        0x33ee3742 -> :sswitch_c
        0x3a52f611 -> :sswitch_3
        0x42b9cb82 -> :sswitch_6
        0x4def0dbc -> :sswitch_e
        0x4f71d9be -> :sswitch_f
        0x64c16e65 -> :sswitch_c
        0x659c0891 -> :sswitch_d
        0x72e2d8c2 -> :sswitch_7
        0x764210fd -> :sswitch_a
        0x7cec42b6 -> :sswitch_6
    .end sparse-switch
.end method
