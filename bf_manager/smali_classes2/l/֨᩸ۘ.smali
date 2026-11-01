.class public Ll/֨᩸ۘ;
.super Landroid/graphics/drawable/Drawable;
.source "FA3A"


# static fields
.field public static final synthetic ۬:I


# instance fields
.field public final ֨:F

.field public ۖ:F

.field public final ۙ:Landroid/graphics/Canvas;

.field public final ۚ:F

.field public final ۨ:Landroid/graphics/Paint;

.field public final ܰ:Landroid/graphics/drawable/BitmapDrawable;

.field public final ᩹:F


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;FF)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const v10, 0x4135abf9

    sget v11, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v12, Ll/ۘۚ;->ܺ᩶ܽ:I

    .line 40
    invoke-direct/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const-string v13, "\u06da\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1e17

    const v15, 0x638250e

    xor-int/2addr v14, v15

    const v15, -0x4212b313

    xor-int/2addr v13, v15

    :goto_0
    const/4 v15, 0x0

    :goto_1
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x70d5

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move/from16 v13, p2

    move/from16 v14, p3

    .line 42
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2
    sget v8, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v8, :cond_b

    goto/16 :goto_7

    .line 47
    :sswitch_0
    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_2
    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_6

    .line 36
    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v13

    if-nez v13, :cond_8

    :goto_3
    move/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v17, v2

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v13, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v13, :cond_1

    goto :goto_3

    .line 6
    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    goto :goto_3

    .line 18
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 49
    :sswitch_5
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    new-instance v13, Landroid/graphics/PorterDuffXfermode;

    .line 4
    sget v14, Ll/۟;->ۨᩴۛ:I

    if-ltz v14, :cond_2

    :cond_1
    const-string v13, "\u1a77\u1a76"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x39e5

    const v16, 0x51c86cd1

    xor-int v14, v14, v16

    const v16, 0x3fc42a93

    goto/16 :goto_4

    .line 51
    :cond_2
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v13, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void

    :sswitch_6
    double-to-float v13, v6

    .line 47
    iput v13, v0, Ll/֨᩸ۘ;->ۚ:F

    .line 48
    new-instance v15, Landroid/graphics/Paint;

    .line 6
    sget v13, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v13, :cond_3

    goto :goto_2

    :cond_3
    const/4 v13, 0x1

    .line 23
    sget v14, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v14, :cond_4

    goto :goto_3

    .line 48
    :cond_4
    invoke-direct {v15, v13}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v15, v0, Ll/֨᩸ۘ;->ۨ:Landroid/graphics/Paint;

    const/4 v9, 0x0

    sget v13, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u06e2\u1a77"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1f5b

    const v16, 0x3145a447

    xor-int v14, v14, v16

    const v16, -0x284111a7

    goto :goto_4

    :sswitch_7
    add-int v6, v5, v4

    int-to-double v6, v6

    .line 47
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v13, :cond_6

    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_7

    :cond_6
    const-string v13, "\u06d8\u06d7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x29

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x59ed

    const v16, 0x3deb012a

    xor-int v14, v14, v16

    const v16, 0x36ea5772

    goto :goto_4

    :sswitch_8
    mul-int v5, v3, v3

    sget-boolean v13, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v13, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v13, "\u06db\u1a75"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3f7d

    const v16, 0x4b0bd6fd    # 9164541.0f

    xor-int v14, v14, v16

    const v16, -0x32799877

    :goto_4
    xor-int v13, v13, v16

    goto/16 :goto_1

    .line 45
    :sswitch_9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int v3, v3, v3

    sget v13, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v13, :cond_9

    move/from16 v19, v4

    move v4, v3

    move/from16 v3, v19

    :cond_8
    :goto_5
    const-string v13, "\u1a79\u0730"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x71

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7489

    const v16, -0x1f4371a

    xor-int v14, v14, v16

    const v16, 0x406c2d57

    goto :goto_4

    :cond_9
    const-string v13, "\u06ec\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x77

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1417

    const v16, 0x296685c9

    xor-int v14, v14, v16

    const v16, -0xad09340

    xor-int v13, v13, v16

    move/from16 v19, v4

    move v4, v3

    move/from16 v3, v19

    goto/16 :goto_1

    .line 42
    :sswitch_a
    iput-object v2, v0, Ll/֨᩸ۘ;->ۙ:Landroid/graphics/Canvas;

    move/from16 v13, p2

    .line 43
    iput v13, v0, Ll/֨᩸ۘ;->᩹:F

    move/from16 v14, p3

    .line 44
    iput v14, v0, Ll/֨᩸ۘ;->֨:F

    .line 29
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v16

    if-gtz v16, :cond_a

    :goto_6
    const-string v15, "\u06e0\u06e2"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, 0xd

    xor-int v8, v15, v11

    mul-int/lit16 v8, v8, 0x1847

    const v17, 0x58f81558

    xor-int v8, v8, v17

    const v17, -0x70be46e

    xor-int v15, v15, v17

    move v14, v8

    move v13, v15

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u073d\u0733"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v11

    move-object/from16 v17, v2

    xor-int v2, v8, v12

    mul-int/lit16 v2, v2, 0x227f

    const v18, -0x5d5fbf3b

    xor-int v2, v2, v18

    const v18, 0x65740a77

    goto :goto_8

    :goto_7
    const-string v8, "\u1a77\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v11

    move-object/from16 v17, v2

    xor-int v2, v8, v12

    mul-int/lit16 v2, v2, 0x7b95

    const v18, -0x7c8dcf4a

    xor-int v2, v2, v18

    const v18, -0x756e401e

    goto :goto_8

    :cond_b
    const-string v8, "\u1a7a\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v12

    move-object/from16 v17, v2

    xor-int v2, v8, v11

    mul-int/lit16 v2, v2, -0x7723

    const v18, 0x43a0007a    # 320.00372f

    xor-int v2, v2, v18

    const v18, -0x29bdcc7b

    :goto_8
    xor-int v8, v8, v18

    move v14, v2

    move v13, v8

    goto :goto_a

    :sswitch_b
    move/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v17, v2

    .line 41
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v2, v0, Ll/֨᩸ۘ;->ܰ:Landroid/graphics/drawable/BitmapDrawable;

    .line 9
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v2

    if-nez v2, :cond_c

    :goto_9
    const-string v2, "\u1a78\u0733"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v8, v2, v11

    mul-int/lit16 v8, v8, 0x77d5

    const v15, -0x3ab00ec5

    xor-int/2addr v8, v15

    const v15, 0x5e6d953d

    xor-int/2addr v2, v15

    move v13, v2

    move v14, v8

    move-object/from16 v2, v17

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06da\u06d6"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v11

    xor-int v8, v2, v12

    mul-int/lit16 v8, v8, 0x553d

    const v18, 0x3dd8b4b2

    xor-int v8, v8, v18

    const v18, -0x10cd7bf7

    xor-int v2, v2, v18

    move v13, v2

    move v14, v8

    :goto_a
    move-object/from16 v2, v17

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e227478 -> :sswitch_5
        -0x723ee7a5 -> :sswitch_8
        -0x6fc58168 -> :sswitch_9
        -0x676c5ff8 -> :sswitch_b
        -0x60c25376 -> :sswitch_2
        -0x5d354ec5 -> :sswitch_a
        -0x4335c22a -> :sswitch_1
        -0x373caeda -> :sswitch_5
        -0x30cbe340 -> :sswitch_7
        -0x230ef15b -> :sswitch_0
        -0x1cf250bf -> :sswitch_6
        -0x17074157 -> :sswitch_7
        -0x16b42a22 -> :sswitch_6
        -0xcc0c00f -> :sswitch_a
        -0xb0d098e -> :sswitch_0
        0x1ab95396 -> :sswitch_3
        0x1cca0e2d -> :sswitch_2
        0x1fa9b26a -> :sswitch_1
        0x331767e5 -> :sswitch_9
        0x4681ad6e -> :sswitch_4
        0x57191931 -> :sswitch_b
        0x67eb7a75 -> :sswitch_8
        0x6a44585c -> :sswitch_3
        0x7b10995c -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x531f8cf8

    sget v8, Ll/֨᩹;->᩻ᩳ֨:I

    sget v9, Ll/֨᩺;->۬᩺ܰ:I

    const-string v10, "\u06eb\u06da"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7b75

    const v12, -0x6f5682f

    xor-int/2addr v11, v12

    const v12, 0x7f4973e6

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0xd65

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget-boolean v10, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v10, :cond_0

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v10, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v10, :cond_9

    goto/16 :goto_1

    :cond_0
    const-string v10, "\u06e7\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x19b9

    const v12, 0x3e1db942

    xor-int/2addr v11, v12

    const v12, 0x6077a100

    goto :goto_0

    .line 27
    :sswitch_1
    sget v10, Ll/ۧ;->֫۠ᩴ:I

    if-gez v10, :cond_6

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto/16 :goto_4

    .line 16
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    return-void

    .line 62
    :sswitch_4
    invoke-virtual {v4, v5, v6, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    iget-object v0, p0, Ll/֨᩸ۘ;->ܰ:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 62
    :sswitch_5
    iget v6, p0, Ll/֨᩸ۘ;->֨:F

    .line 59
    sget v10, Ll/۟;->ۨᩴۛ:I

    if-ltz v10, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v10, "\u073a\u06d9"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6b2b

    const v12, -0x19d53733

    xor-int/2addr v11, v12

    const v12, -0x29ae0351

    goto :goto_0

    .line 62
    :sswitch_6
    iget-object v4, p0, Ll/֨᩸ۘ;->ۙ:Landroid/graphics/Canvas;

    iget v5, p0, Ll/֨᩸ۘ;->᩹:F

    sget v10, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v10, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v10, "\u06db\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1d71

    const v12, -0x79c5d5ee

    xor-int/2addr v11, v12

    const v12, 0x9452940

    goto/16 :goto_0

    :sswitch_7
    mul-float v2, v0, v1

    iget-object v3, p0, Ll/֨᩸ۘ;->ۨ:Landroid/graphics/Paint;

    .line 50
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v10

    if-eqz v10, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v10, "\u06d9\u06d7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x6b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4977

    const v12, 0x114bdbcc

    xor-int/2addr v11, v12

    const v12, -0x3cd8150b

    goto/16 :goto_0

    .line 62
    :sswitch_8
    iget v1, p0, Ll/֨᩸ۘ;->ۖ:F

    sget v10, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v10, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v10, "\u1a74\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5a81

    const v12, 0x4bfb8de7    # 3.2971726E7f

    xor-int/2addr v11, v12

    const v12, 0x43b1441d

    goto/16 :goto_0

    :sswitch_9
    iget v0, p0, Ll/֨᩸ۘ;->ۚ:F

    .line 44
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v10, "\u06d6\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x163b

    const v12, 0x6ef65d8d

    xor-int/2addr v11, v12

    const v12, 0xb9db115

    goto/16 :goto_0

    :sswitch_a
    sget v10, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v10, :cond_7

    :cond_6
    :goto_1
    const-string v10, "\u073f\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x5

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xf0d

    const v12, 0x1f26c6b7

    xor-int/2addr v11, v12

    const v12, -0x19cbd83    # -7.5519995E37f

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u073f\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x14c3

    const v12, 0x4e72f6dc

    xor-int/2addr v11, v12

    const v12, 0x1f381cf5

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v10

    if-gtz v10, :cond_8

    :goto_2
    const-string v10, "\u06db\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1d51

    const v12, -0x1983e0a5

    xor-int/2addr v11, v12

    const v12, 0x7c39e3de

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a79\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x17

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x203f

    const v12, 0x49d120

    xor-int/2addr v11, v12

    const v12, 0x228df4a5

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v10, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v10, :cond_a

    :cond_9
    :goto_3
    const-string v10, "\u06e8\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x5d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x621b

    const v12, 0x2816ecfc

    xor-int/2addr v11, v12

    const v12, -0x42d575d6

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u06df\u073d"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x15

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x47cf

    const v12, 0x381175c2

    xor-int/2addr v11, v12

    const v12, -0x244b2776

    goto/16 :goto_0

    .line 31
    :sswitch_d
    sget v10, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v10, :cond_b

    goto :goto_4

    :cond_b
    const-string v10, "\u06db\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1575

    const v12, -0x62f143e4

    xor-int/2addr v11, v12

    const v12, -0x75799c5a

    goto/16 :goto_0

    .line 42
    :sswitch_e
    sget v10, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v10, :cond_c

    :goto_4
    const-string v10, "\u06d7\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7a7f

    const v12, -0x856a1c5

    xor-int/2addr v11, v12

    const v12, 0x726ebd9f

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7b\u06d6"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xc0f

    const v12, 0x788d4345

    xor-int/2addr v11, v12

    const v12, -0x6b1403c1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6fc00c70 -> :sswitch_c
        -0x69ed8b36 -> :sswitch_7
        -0x65f21c4b -> :sswitch_6
        -0x625fd289 -> :sswitch_9
        -0x5e6c475c -> :sswitch_c
        -0x55f1efa7 -> :sswitch_3
        -0x4cc4b139 -> :sswitch_d
        -0x3b2fcf2a -> :sswitch_0
        -0x1c386c7e -> :sswitch_b
        -0x1bab5b56 -> :sswitch_8
        -0x6e97cea -> :sswitch_9
        0x9ac60a8 -> :sswitch_2
        0xe47583b -> :sswitch_4
        0x1324792e -> :sswitch_a
        0x20885fc1 -> :sswitch_8
        0x2250f3bd -> :sswitch_5
        0x290dd139 -> :sswitch_2
        0x3859f946 -> :sswitch_3
        0x38ed8d04 -> :sswitch_a
        0x3d59ee3e -> :sswitch_6
        0x4148cefe -> :sswitch_d
        0x48c5064a -> :sswitch_0
        0x4b624f67 -> :sswitch_1
        0x537ba65d -> :sswitch_b
        0x545c9b54 -> :sswitch_e
        0x5cad8fc6 -> :sswitch_5
        0x5f85d12e -> :sswitch_1
        0x61cd44ed -> :sswitch_e
        0x759f58fb -> :sswitch_7
        0x76961424 -> :sswitch_4
    .end sparse-switch
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 6

    const v0, -0x37105f44

    sget v1, Ll/֫;->ܶܺ᩻:I

    sget v2, Ll/֨ۧ;->֫۠֡:I

    const-string v3, "\u1a75\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x55f9

    const v5, 0x4cd7777f    # 1.1296665E8f

    xor-int/2addr v4, v5

    const v5, 0xe31aab3

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x8f9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_8

    goto/16 :goto_4

    .line 13
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 25
    :sswitch_1
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    .line 34
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-gez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06db\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a23

    const v5, -0x574afdba

    xor-int/2addr v4, v5

    const v5, 0x35fc47ca

    goto :goto_0

    .line 11
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    return-void

    .line 57
    :sswitch_5
    iget-object v0, p0, Ll/֨᩸ۘ;->ܰ:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 56
    :sswitch_6
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 26
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e1\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a63

    const v5, 0x13437bdf

    xor-int/2addr v4, v5

    const v5, 0x788bde6a

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x231

    const v5, -0x2ddbf336

    xor-int/2addr v4, v5

    const v5, -0x52df95aa

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3abf

    const v5, 0x6ac7b8c8

    xor-int/2addr v4, v5

    const v5, -0x17255f13

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u05a8\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x28fd

    const v5, 0x2649a32e

    xor-int/2addr v4, v5

    const v5, -0x6e30e4ee

    goto/16 :goto_0

    .line 12
    :sswitch_a
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_5

    :goto_1
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x44ff

    const v5, 0x61cc4827

    xor-int/2addr v4, v5

    const v5, 0x2d2d6dd7

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e1\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2485

    const v5, -0x3ea27cfd

    xor-int/2addr v4, v5

    const v5, 0x467044ba

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u1a73\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x720f

    const v5, -0x877fe0e

    xor-int/2addr v4, v5

    const v5, 0x23fd3467

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_7

    :goto_2
    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3173

    const v5, 0x7c5969b0

    xor-int/2addr v4, v5

    const v5, 0x1cad9fbd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06ec\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2325

    const v5, 0x6fb4b700

    xor-int/2addr v4, v5

    const v5, 0x35db89d5

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x43df

    const v5, -0x3c8da91e

    xor-int/2addr v4, v5

    const v5, 0x5acc28e9

    goto/16 :goto_0

    .line 52
    :sswitch_d
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06da\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x60fb

    const v5, -0x4990a626

    xor-int/2addr v4, v5

    const v5, 0x604a7989

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06df\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b41

    const v5, -0x40a03008

    xor-int/2addr v4, v5

    const v5, -0x689ab52d

    goto/16 :goto_0

    .line 51
    :sswitch_e
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x219d

    const v5, 0x6b3effb8

    xor-int/2addr v4, v5

    const v5, -0x5b4edbe6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5799

    const v5, -0x35a51145

    xor-int/2addr v4, v5

    const v5, 0x233ff4fc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7506e6bf -> :sswitch_0
        -0x71a50d56 -> :sswitch_9
        -0x6b6b0e22 -> :sswitch_8
        -0x63cb346b -> :sswitch_2
        -0x5e2e1eb5 -> :sswitch_7
        -0x53f0007a -> :sswitch_0
        -0x539bd702 -> :sswitch_1
        -0x52744677 -> :sswitch_4
        -0x49f5647d -> :sswitch_b
        -0x3d8d5c95 -> :sswitch_9
        -0x38177534 -> :sswitch_a
        -0x2e320293 -> :sswitch_b
        -0x2e15e6ef -> :sswitch_3
        -0x18e76b83 -> :sswitch_6
        -0x17272684 -> :sswitch_6
        -0x1379a309 -> :sswitch_5
        -0xff8c397 -> :sswitch_d
        -0xda51046 -> :sswitch_4
        -0xb8c7bb2 -> :sswitch_8
        0x1f81bcab -> :sswitch_2
        0x242f7043 -> :sswitch_7
        0x2abceb77 -> :sswitch_5
        0x2ee515b5 -> :sswitch_a
        0x3752eb16 -> :sswitch_3
        0x3ae80c2a -> :sswitch_d
        0x3f70da3c -> :sswitch_c
        0x40a74fd3 -> :sswitch_1
        0x4a05c2ea -> :sswitch_e
        0x6b8eb8cb -> :sswitch_e
        0x6cbe64e3 -> :sswitch_c
    .end sparse-switch
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public setProgress(F)V
    .locals 0
    .annotation build Ll/ܽۖ;
    .end annotation

    .line 68
    iput p1, p0, Ll/֨᩸ۘ;->ۖ:F

    .line 69
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
