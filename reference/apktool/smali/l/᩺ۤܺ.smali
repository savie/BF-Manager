.class public final Ll/᩺ۤܺ;
.super Landroid/graphics/drawable/Drawable;
.source "UBKO"

# interfaces
.implements Ll/۠ᩳ;


# static fields
.field public static final ۖ:Landroid/graphics/PorterDuff$Mode;

.field public static final synthetic ۡ:I


# instance fields
.field public final ֡:Landroid/graphics/Rect;

.field public ֨:Z

.field public final ۟:[F

.field public ۢ:Ll/ۛۤܺ;

.field public ܰ:Landroid/graphics/ColorFilter;

.field public ܿ:Landroid/graphics/PorterDuffColorFilter;

.field public final ᩳ:Landroid/graphics/Matrix;

.field public ᩶:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 67
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Ll/᩺ۤܺ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 104
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 100
    iput-object v0, p0, Ll/᩺ۤܺ;->۟:[F

    .line 101
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܺ;->ᩳ:Landroid/graphics/Matrix;

    .line 102
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܺ;->֡:Landroid/graphics/Rect;

    .line 105
    new-instance v0, Ll/ۛۤܺ;

    .line 695
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v1, 0x0

    .line 595
    iput-object v1, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    .line 596
    sget-object v1, Ll/᩺ۤܺ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    .line 696
    new-instance v1, Ll/ۨۤܺ;

    invoke-direct {v1}, Ll/ۨۤܺ;-><init>()V

    iput-object v1, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 105
    iput-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    return-void
.end method

.method public constructor <init>(Ll/ۛۤܺ;)V
    .locals 1

    .line 108
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 100
    iput-object v0, p0, Ll/᩺ۤܺ;->۟:[F

    .line 101
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܺ;->ᩳ:Landroid/graphics/Matrix;

    .line 102
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩺ۤܺ;->֡:Landroid/graphics/Rect;

    .line 109
    iput-object p1, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 110
    iget-object v0, p1, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v0, p1}, Ll/᩺ۤܺ;->ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method

.method public static ۙ(Ll/ۡ᩻ܺ;Ll/᩶ۤۤ;Z)Ll/᩺ۤܺ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 355
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->next()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v2, v4, :cond_38

    .line 362
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "vector"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_37

    .line 375
    new-instance v2, Ll/᩺ۤܺ;

    invoke-direct {v2}, Ll/᩺ۤܺ;-><init>()V

    move/from16 v5, p2

    .line 376
    iput-boolean v5, v2, Ll/᩺ۤܺ;->֨:Z

    .line 390
    iget-object v5, v2, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 391
    new-instance v6, Ll/ۨۤܺ;

    invoke-direct {v6}, Ll/ۨۤܺ;-><init>()V

    iput-object v6, v5, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 393
    sget-object v6, Ll/ۙ۠᩷;->᩸:[I

    invoke-static {v0, v6, v1}, Ll/ۛ۫ܺ;->ۙ(Ll/ۡ᩻ܺ;[ILl/᩶ۤۤ;)Ll/ۨ۫ܺ;

    move-result-object v6

    .line 430
    iget-object v7, v2, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 431
    iget-object v8, v7, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    const-string v9, "tintMode"

    const-string v10, "http://schemas.android.com/apk/res/android"

    .line 96
    invoke-virtual {v0, v10, v9}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, -0x1

    const/4 v12, 0x6

    if-eqz v9, :cond_1

    .line 56
    invoke-virtual {v6, v12, v11}, Ll/ۨ۫ܺ;->ۙ(II)I

    move-result v9

    goto :goto_1

    :cond_1
    const/4 v9, -0x1

    .line 438
    :goto_1
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    const/16 v12, 0x9

    const/4 v13, 0x3

    const/4 v14, 0x5

    if-eq v9, v13, :cond_3

    if-eq v9, v14, :cond_4

    if-eq v9, v12, :cond_2

    packed-switch v9, :pswitch_data_0

    goto :goto_2

    .line 422
    :pswitch_0
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    .line 420
    :pswitch_1
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    .line 418
    :pswitch_2
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    .line 416
    :cond_2
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    .line 412
    :cond_3
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 438
    :cond_4
    :goto_2
    iput-object v11, v7, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    const-string v9, "tint"

    .line 96
    invoke-virtual {v0, v10, v9}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_7

    .line 63
    new-instance v9, Landroid/util/TypedValue;

    invoke-direct {v9}, Landroid/util/TypedValue;-><init>()V

    .line 64
    invoke-virtual {v6, v3, v9}, Ll/ۨ۫ܺ;->ۙ(ILandroid/util/TypedValue;)V

    .line 65
    iget v11, v9, Landroid/util/TypedValue;->type:I

    const/16 v12, 0x1c

    if-lt v11, v12, :cond_5

    const/16 v12, 0x1f

    if-gt v11, v12, :cond_5

    .line 67
    iget v9, v9, Landroid/util/TypedValue;->data:I

    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v9

    goto :goto_3

    :cond_5
    if-eq v11, v3, :cond_6

    if-ne v11, v4, :cond_7

    :cond_6
    const/high16 v9, -0x1000000

    .line 69
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v9

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_8

    .line 444
    iput-object v9, v7, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    .line 447
    :cond_8
    iget-boolean v9, v7, Ll/ۛۤܺ;->ۙ:Z

    const-string v11, "autoMirrored"

    .line 96
    invoke-virtual {v0, v10, v11}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_9

    .line 81
    invoke-virtual {v6, v9}, Ll/ۨ۫ܺ;->ۙ(Z)Z

    move-result v9

    .line 447
    :cond_9
    iput-boolean v9, v7, Ll/ۛۤܺ;->ۙ:Z

    .line 450
    iget v7, v8, Ll/ۨۤܺ;->᩹:F

    const-string v9, "viewportWidth"

    .line 96
    invoke-virtual {v0, v10, v9}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x7

    if-eqz v9, :cond_a

    .line 91
    invoke-virtual {v6, v7, v11}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v7

    .line 450
    :cond_a
    iput v7, v8, Ll/ۨۤܺ;->᩹:F

    .line 454
    iget v7, v8, Ll/ۨۤܺ;->ܶ:F

    const-string v9, "viewportHeight"

    .line 96
    invoke-virtual {v0, v10, v9}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x8

    if-eqz v9, :cond_b

    .line 91
    invoke-virtual {v6, v7, v11}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v7

    .line 454
    :cond_b
    iput v7, v8, Ll/ۨۤܺ;->ܶ:F

    .line 458
    iget v9, v8, Ll/ۨۤܺ;->᩹:F

    const/4 v11, 0x0

    cmpg-float v9, v9, v11

    if-lez v9, :cond_36

    cmpg-float v7, v7, v11

    if-lez v7, :cond_35

    .line 464
    iget v7, v8, Ll/ۨۤܺ;->᩷:F

    invoke-virtual {v6, v7, v13}, Ll/ۨ۫ܺ;->ۙ(FI)F

    move-result v7

    iput v7, v8, Ll/ۨۤܺ;->᩷:F

    .line 466
    iget v7, v8, Ll/ۨۤܺ;->ۙ:F

    invoke-virtual {v6, v7, v4}, Ll/ۨ۫ܺ;->ۙ(FI)F

    move-result v7

    iput v7, v8, Ll/ۨۤܺ;->ۙ:F

    .line 468
    iget v9, v8, Ll/ۨۤܺ;->᩷:F

    cmpg-float v9, v9, v11

    if-lez v9, :cond_34

    cmpg-float v7, v7, v11

    if-lez v7, :cond_33

    .line 776
    iget v7, v8, Ll/ۨۤܺ;->֫:I

    int-to-float v7, v7

    const/high16 v9, 0x437f0000    # 255.0f

    div-float/2addr v7, v9

    const-string v11, "alpha"

    .line 96
    invoke-virtual {v0, v10, v11}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x4

    if-eqz v11, :cond_c

    .line 91
    invoke-virtual {v6, v7, v12}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v7

    :cond_c
    mul-float v7, v7, v9

    float-to-int v7, v7

    .line 772
    iput v7, v8, Ll/ۨۤܺ;->֫:I

    const/4 v7, 0x0

    .line 479
    invoke-virtual {v6, v7}, Ll/ۨ۫ܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_d

    .line 481
    iput-object v6, v8, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    .line 482
    iget-object v9, v8, Ll/ۨۤܺ;->ܽ:Ll/ܰۗ;

    invoke-virtual {v9, v6, v8}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    :cond_d
    invoke-virtual {v2}, Ll/᩺ۤܺ;->getChangingConfigurations()I

    move-result v6

    iput v6, v5, Ll/ۛۤܺ;->ۚ:I

    .line 398
    iput-boolean v3, v5, Ll/ۛۤܺ;->᩷:Z

    .line 487
    iget-object v6, v2, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 488
    iget-object v8, v6, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 493
    new-instance v9, Ljava/util/ArrayDeque;

    invoke-direct {v9}, Ljava/util/ArrayDeque;-><init>()V

    .line 494
    iget-object v11, v8, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    iget-object v8, v8, Ll/ۨۤܺ;->ܽ:Ll/ܰۗ;

    invoke-virtual {v9, v11}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 496
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getEventType()I

    move-result v11

    .line 497
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getDepth()I

    move-result v12

    add-int/lit8 v12, v12, 0x1

    const/4 v14, 0x1

    :goto_4
    if-eq v11, v3, :cond_31

    .line 501
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getDepth()I

    move-result v3

    if-ge v3, v12, :cond_e

    if-eq v11, v13, :cond_31

    :cond_e
    const-string v3, "group"

    if-ne v11, v4, :cond_2f

    .line 503
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 504
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩹ۤܺ;

    .line 505
    invoke-static {v11}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v11, v11, Ll/᩹ۤܺ;->ۙ:Ljava/util/ArrayList;

    const-string v13, "path"

    .line 506
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const-string v15, "fillType"

    move/from16 p2, v12

    const-string v12, "pathData"

    if-eqz v13, :cond_24

    .line 507
    new-instance v3, Ll/ܶۤܺ;

    invoke-direct {v3}, Ll/ܶۤܺ;-><init>()V

    .line 508
    iget-boolean v4, v2, Ll/᩺ۤܺ;->֨:Z

    .line 1478
    sget-object v13, Ll/ۙ۠᩷;->ۤ:[I

    invoke-static {v0, v13, v1}, Ll/ۛ۫ܺ;->ۙ(Ll/ۡ᩻ܺ;[ILl/᩶ۤۤ;)Ll/ۨ۫ܺ;

    move-result-object v13

    .line 96
    invoke-virtual {v0, v10, v12}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_22

    .line 1502
    invoke-virtual {v13, v7}, Ll/ۨ۫ܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_f

    .line 1505
    iput-object v7, v3, Ll/᩵ۤܺ;->᩸:Ljava/lang/String;

    :cond_f
    const/4 v7, 0x2

    .line 1508
    invoke-virtual {v13, v7}, Ll/ۨ۫ܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_11

    .line 1510
    invoke-virtual {v13, v7}, Ll/ۨ۫ܺ;->᩷(I)I

    move-result v7

    const/4 v14, 0x3

    if-ne v7, v14, :cond_10

    .line 1513
    invoke-static {v12}, Ll/᩻ᩳ;->ۙ(Ljava/lang/String;)[Ll/ۧᩳ;

    move-result-object v7

    iput-object v7, v3, Ll/᩵ۤܺ;->᩷:[Ll/ۧᩳ;

    if-eqz v4, :cond_11

    .line 1515
    iput-object v12, v3, Ll/᩵ۤܺ;->ۤ:Ljava/lang/String;

    goto :goto_5

    .line 1511
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_11
    :goto_5
    const-string v4, "fillColor"

    const/4 v7, 0x1

    .line 1519
    invoke-static {v13, v0, v4, v7}, Ll/ۛ۫ܺ;->ۙ(Ll/ۨ۫ܺ;Ll/ۡ᩻ܺ;Ljava/lang/String;I)Ll/ܽ۟;

    move-result-object v4

    iput-object v4, v3, Ll/ܶۤܺ;->ܳ:Ll/ܽ۟;

    .line 1521
    iget v4, v3, Ll/ܶۤܺ;->ᩴ:F

    const-string v7, "fillAlpha"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_12

    const/16 v7, 0xc

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1521
    :cond_12
    iput v4, v3, Ll/ܶۤܺ;->ᩴ:F

    const-string v4, "strokeLineCap"

    .line 96
    invoke-virtual {v0, v10, v4}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    const/4 v4, -0x1

    const/16 v7, 0x8

    .line 56
    invoke-virtual {v13, v7, v4}, Ll/ۨ۫ܺ;->ۙ(II)I

    move-result v4

    goto :goto_6

    :cond_13
    const/4 v4, -0x1

    .line 1525
    :goto_6
    iget-object v7, v3, Ll/ܶۤܺ;->֫:Landroid/graphics/Paint$Cap;

    if-eqz v4, :cond_16

    const/4 v12, 0x1

    if-eq v4, v12, :cond_15

    const/4 v12, 0x2

    if-eq v4, v12, :cond_14

    goto :goto_7

    .line 1453
    :cond_14
    sget-object v7, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_7

    .line 1451
    :cond_15
    sget-object v7, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_7

    .line 1449
    :cond_16
    sget-object v7, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 1525
    :goto_7
    iput-object v7, v3, Ll/ܶۤܺ;->֫:Landroid/graphics/Paint$Cap;

    const-string v4, "strokeLineJoin"

    .line 96
    invoke-virtual {v0, v10, v4}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_17

    const/16 v4, 0x9

    const/4 v7, -0x1

    .line 56
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->ۙ(II)I

    move-result v4

    goto :goto_8

    :cond_17
    const/4 v4, -0x1

    .line 1528
    :goto_8
    iget-object v7, v3, Ll/ܶۤܺ;->ۧ:Landroid/graphics/Paint$Join;

    if-eqz v4, :cond_1a

    const/4 v12, 0x1

    if-eq v4, v12, :cond_19

    const/4 v12, 0x2

    if-eq v4, v12, :cond_18

    goto :goto_9

    .line 1466
    :cond_18
    sget-object v7, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_9

    .line 1464
    :cond_19
    sget-object v7, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_9

    .line 1462
    :cond_1a
    sget-object v7, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 1528
    :goto_9
    iput-object v7, v3, Ll/ܶۤܺ;->ۧ:Landroid/graphics/Paint$Join;

    .line 1529
    iget v4, v3, Ll/ܶۤܺ;->᩻:F

    const-string v7, "strokeMiterLimit"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1b

    const/16 v7, 0xa

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1529
    :cond_1b
    iput v4, v3, Ll/ܶۤܺ;->᩻:F

    const-string v4, "strokeColor"

    const/4 v7, 0x3

    .line 1532
    invoke-static {v13, v0, v4, v7}, Ll/ۛ۫ܺ;->ۙ(Ll/ۨ۫ܺ;Ll/ۡ᩻ܺ;Ljava/lang/String;I)Ll/ܽ۟;

    move-result-object v4

    iput-object v4, v3, Ll/ܶۤܺ;->ۚ:Ll/ܽ۟;

    .line 1534
    iget v4, v3, Ll/ܶۤܺ;->۫:F

    const-string v7, "strokeAlpha"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1c

    const/16 v7, 0xb

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1534
    :cond_1c
    iput v4, v3, Ll/ܶۤܺ;->۫:F

    .line 1536
    iget v4, v3, Ll/ܶۤܺ;->ܺ:F

    const-string v7, "strokeWidth"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1d

    const/4 v7, 0x4

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1536
    :cond_1d
    iput v4, v3, Ll/ܶۤܺ;->ܺ:F

    .line 1538
    iget v4, v3, Ll/ܶۤܺ;->ܽ:F

    const-string v7, "trimPathEnd"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1e

    const/4 v7, 0x6

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1538
    :cond_1e
    iput v4, v3, Ll/ܶۤܺ;->ܽ:F

    .line 1540
    iget v4, v3, Ll/ܶۤܺ;->ܶ:F

    const-string v7, "trimPathOffset"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1f

    const/4 v7, 0x7

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1540
    :cond_1f
    iput v4, v3, Ll/ܶۤܺ;->ܶ:F

    .line 1543
    iget v4, v3, Ll/ܶۤܺ;->᩹:F

    const-string v7, "trimPathStart"

    .line 96
    invoke-virtual {v0, v10, v7}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_20

    const/4 v7, 0x5

    .line 91
    invoke-virtual {v13, v4, v7}, Ll/ۨ۫ܺ;->᩷(FI)F

    move-result v4

    .line 1543
    :cond_20
    iput v4, v3, Ll/ܶۤܺ;->᩹:F

    .line 1546
    iget v4, v3, Ll/᩵ۤܺ;->ۙ:I

    .line 96
    invoke-virtual {v0, v10, v15}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_21

    const/16 v7, 0xd

    .line 56
    invoke-virtual {v13, v7, v4}, Ll/ۨ۫ܺ;->ۙ(II)I

    move-result v4

    .line 1546
    :cond_21
    iput v4, v3, Ll/᩵ۤܺ;->ۙ:I

    .line 509
    :cond_22
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1316
    iget-object v4, v3, Ll/᩵ۤܺ;->᩸:Ljava/lang/String;

    if-eqz v4, :cond_23

    .line 511
    invoke-virtual {v8, v4, v3}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    :cond_23
    iget v3, v6, Ll/ۛۤܺ;->ۚ:I

    iput v3, v6, Ll/ۛۤܺ;->ۚ:I

    const/4 v3, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v2

    goto/16 :goto_d

    :cond_24
    const-string v7, "clip-path"

    .line 515
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2c

    .line 516
    new-instance v3, Ll/ܽۤܺ;

    invoke-direct {v3}, Ll/ܽۤܺ;-><init>()V

    .line 517
    iget-boolean v4, v2, Ll/᩺ۤܺ;->֨:Z

    .line 96
    invoke-virtual {v0, v10, v12}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2a

    .line 1365
    sget-object v7, Ll/ۙ۠᩷;->ۙ:[I

    invoke-static {v0, v7, v1}, Ll/ۛ۫ܺ;->ۙ(Ll/ۡ᩻ܺ;[ILl/᩶ۤۤ;)Ll/ۨ۫ܺ;

    move-result-object v7

    const/4 v12, 0x0

    .line 1375
    invoke-virtual {v7, v12}, Ll/ۨ۫ܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_25

    .line 1377
    iput-object v12, v3, Ll/᩵ۤܺ;->᩸:Ljava/lang/String;

    :cond_25
    const/4 v12, 0x1

    .line 1381
    invoke-virtual {v7, v12}, Ll/ۨ۫ܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_27

    .line 1383
    invoke-virtual {v7, v12}, Ll/ۨ۫ܺ;->᩷(I)I

    move-result v12

    move-object/from16 v16, v2

    const/4 v2, 0x3

    if-ne v12, v2, :cond_26

    .line 1386
    invoke-static {v13}, Ll/᩻ᩳ;->ۙ(Ljava/lang/String;)[Ll/ۧᩳ;

    move-result-object v2

    iput-object v2, v3, Ll/᩵ۤܺ;->᩷:[Ll/ۧᩳ;

    if-eqz v4, :cond_28

    .line 1388
    iput-object v13, v3, Ll/᩵ۤܺ;->ۤ:Ljava/lang/String;

    goto :goto_a

    .line 1384
    :cond_26
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_27
    move-object/from16 v16, v2

    .line 96
    :cond_28
    :goto_a
    invoke-virtual {v0, v10, v15}, Ll/ۡ᩻ܺ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_29

    const/4 v2, 0x0

    const/4 v4, 0x2

    .line 56
    invoke-virtual {v7, v4, v2}, Ll/ۨ۫ܺ;->ۙ(II)I

    move-result v4

    goto :goto_b

    :cond_29
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 1391
    :goto_b
    iput v4, v3, Ll/᩵ۤܺ;->ۙ:I

    goto :goto_c

    :cond_2a
    move-object/from16 v16, v2

    const/4 v2, 0x0

    .line 518
    :goto_c
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1316
    iget-object v4, v3, Ll/᩵ۤܺ;->᩸:Ljava/lang/String;

    if-eqz v4, :cond_2b

    .line 520
    invoke-virtual {v8, v4, v3}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    :cond_2b
    iget v3, v6, Ll/ۛۤܺ;->ۚ:I

    iput v3, v6, Ll/ۛۤܺ;->ۚ:I

    move v3, v2

    goto :goto_d

    :cond_2c
    move-object/from16 v16, v2

    const/4 v2, 0x0

    .line 523
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 524
    new-instance v3, Ll/᩹ۤܺ;

    invoke-direct {v3}, Ll/᩹ۤܺ;-><init>()V

    .line 525
    invoke-virtual {v3, v0, v1}, Ll/᩹ۤܺ;->ۙ(Ll/ۡ᩻ܺ;Ll/᩶ۤۤ;)V

    .line 526
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    invoke-virtual {v9, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 528
    invoke-virtual {v3}, Ll/᩹ۤܺ;->᩷()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2d

    .line 529
    invoke-virtual {v3}, Ll/᩹ۤܺ;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4, v3}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    :cond_2d
    iget v3, v6, Ll/ۛۤܺ;->ۚ:I

    iput v3, v6, Ll/ۛۤܺ;->ۚ:I

    :cond_2e
    const/4 v3, 0x0

    :goto_d
    move v7, v3

    goto :goto_e

    :cond_2f
    move-object/from16 v16, v2

    move/from16 p2, v12

    const/4 v2, 0x3

    if-ne v11, v2, :cond_30

    .line 535
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 536
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_30

    .line 537
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 540
    :cond_30
    :goto_e
    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->next()I

    move-result v11

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v13, 0x3

    move/from16 v12, p2

    move-object/from16 v2, v16

    goto/16 :goto_4

    :cond_31
    move-object/from16 v16, v2

    if-nez v14, :cond_32

    .line 401
    iget-object v0, v5, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    iget-object v1, v5, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Ll/᩺ۤܺ;->ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, v2, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    return-object v2

    .line 549
    :cond_32
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "no path defined"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 471
    :cond_33
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<vector> tag requires height > 0"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 469
    :cond_34
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<vector> tag requires width > 0"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 461
    :cond_35
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<vector> tag requires viewportHeight > 0"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 459
    :cond_36
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<vector> tag requires viewportWidth > 0"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 363
    :cond_37
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected tag: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ll/ۡ᩻ܺ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 360
    :cond_38
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final canApplyTheme()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 133
    iget-object v0, p0, Ll/᩺ۤܺ;->֡:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 134
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_4

    .line 140
    :cond_0
    iget-object v1, p0, Ll/᩺ۤܺ;->ܰ:Landroid/graphics/ColorFilter;

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    .line 146
    :cond_1
    iget-object v2, p0, Ll/᩺ۤܺ;->ᩳ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 147
    iget-object v3, p0, Ll/᩺ۤܺ;->۟:[F

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x0

    .line 149
    aget v4, v3, v2

    float-to-double v4, v4

    const/4 v6, 0x3

    aget v6, v3, v6

    float-to-double v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v5, 0x1

    .line 150
    aget v6, v3, v5

    float-to-double v6, v6

    const/4 v8, 0x4

    aget v3, v3, v8

    float-to-double v8, v3

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v6

    double-to-float v3, v6

    .line 152
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v4

    float-to-int v4, v6

    .line 153
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v3

    float-to-int v3, v6

    const/16 v6, 0x800

    .line 154
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 155
    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v4, :cond_9

    if-gtz v3, :cond_2

    goto/16 :goto_4

    .line 161
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    .line 162
    iget v7, v0, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v8, v0, Landroid/graphics/Rect;->top:I

    int-to-float v8, v8

    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 297
    iget-object v7, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-boolean v7, v7, Ll/ۛۤܺ;->ۙ:Z

    if-eqz v7, :cond_3

    .line 576
    invoke-static {p0}, Ll/֡ᩳ;->᩸(Landroid/graphics/drawable/Drawable;)I

    move-result v7

    if-ne v7, v5, :cond_3

    .line 167
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    const/4 v8, 0x0

    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    .line 168
    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->scale(FF)V

    .line 174
    :cond_3
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 176
    iget-object v7, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 664
    iget-object v8, v7, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v8, :cond_4

    .line 673
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    if-ne v4, v8, :cond_4

    iget-object v8, v7, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    .line 674
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    if-ne v3, v8, :cond_4

    goto :goto_0

    .line 665
    :cond_4
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v3, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    iput-object v8, v7, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    .line 667
    iput-boolean v5, v7, Ll/ۛۤܺ;->᩷:Z

    .line 179
    :goto_0
    iget-object v7, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 678
    iget-boolean v8, v7, Ll/ۛۤܺ;->᩷:Z

    if-nez v8, :cond_5

    iget-object v8, v7, Ll/ۛۤܺ;->ܳ:Landroid/content/res/ColorStateList;

    iget-object v9, v7, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    if-ne v8, v9, :cond_5

    iget-object v8, v7, Ll/ۛۤܺ;->۫:Landroid/graphics/PorterDuff$Mode;

    iget-object v9, v7, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    if-ne v8, v9, :cond_5

    iget-boolean v8, v7, Ll/ۛۤܺ;->ۤ:Z

    iget-boolean v9, v7, Ll/ۛۤܺ;->ۙ:Z

    if-ne v8, v9, :cond_5

    iget v8, v7, Ll/ۛۤܺ;->ᩴ:I

    iget-object v9, v7, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v9, v9, Ll/ۨۤܺ;->֫:I

    if-ne v8, v9, :cond_5

    goto :goto_1

    .line 658
    :cond_5
    iget-object v8, v7, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v8, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 659
    new-instance v8, Landroid/graphics/Canvas;

    iget-object v9, v7, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    invoke-direct {v8, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 660
    iget-object v7, v7, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    invoke-virtual {v7, v8, v4, v3}, Ll/ۨۤܺ;->ۙ(Landroid/graphics/Canvas;II)V

    .line 181
    iget-object v3, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 688
    iget-object v4, v3, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    iput-object v4, v3, Ll/ۛۤܺ;->ܳ:Landroid/content/res/ColorStateList;

    .line 689
    iget-object v4, v3, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    iput-object v4, v3, Ll/ۛۤܺ;->۫:Landroid/graphics/PorterDuff$Mode;

    .line 690
    iget-object v4, v3, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v4, v4, Ll/ۨۤܺ;->֫:I

    .line 690
    iput v4, v3, Ll/ۛۤܺ;->ᩴ:I

    .line 691
    iget-boolean v4, v3, Ll/ۛۤܺ;->ۙ:Z

    iput-boolean v4, v3, Ll/ۛۤܺ;->ۤ:Z

    .line 692
    iput-boolean v2, v3, Ll/ۛۤܺ;->᩷:Z

    .line 183
    :goto_1
    iget-object v2, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 637
    iget-object v3, v2, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v3, v3, Ll/ۨۤܺ;->֫:I

    const/16 v4, 0xff

    const/4 v7, 0x0

    if-ge v3, v4, :cond_6

    goto :goto_2

    :cond_6
    if-nez v1, :cond_7

    move-object v1, v7

    goto :goto_3

    .line 648
    :cond_7
    :goto_2
    iget-object v3, v2, Ll/ۛۤܺ;->֫:Landroid/graphics/Paint;

    if-nez v3, :cond_8

    .line 649
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, v2, Ll/ۛۤܺ;->֫:Landroid/graphics/Paint;

    .line 650
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 652
    :cond_8
    iget-object v3, v2, Ll/ۛۤܺ;->֫:Landroid/graphics/Paint;

    iget-object v4, v2, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v4, v4, Ll/ۨۤܺ;->֫:I

    .line 652
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 653
    iget-object v3, v2, Ll/ۛۤܺ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 654
    iget-object v1, v2, Ll/ۛۤܺ;->֫:Landroid/graphics/Paint;

    .line 633
    :goto_3
    iget-object v2, v2, Ll/ۛۤܺ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v2, v7, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 184
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_9
    :goto_4
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 189
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-object v0, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v0, v0, Ll/ۨۤܺ;->֫:I

    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 582
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 713
    iget v1, v1, Ll/ۛۤܺ;->ۚ:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/᩺ۤܺ;->ܰ:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 125
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    invoke-virtual {p0}, Ll/᩺ۤܺ;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Ll/ۛۤܺ;->ۚ:I

    .line 126
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 286
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-object v0, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget v0, v0, Ll/ۨۤܺ;->ۙ:F

    float-to-int v0, v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 281
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-object v0, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget v0, v0, Ll/ۨۤܺ;->᩷:F

    float-to-int v0, v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 297
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-boolean v0, v0, Ll/ۛۤܺ;->ۙ:Z

    return v0
.end method

.method public final isStateful()Z
    .locals 2

    .line 253
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    if-eqz v0, :cond_1

    .line 717
    iget-object v0, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 989
    iget-object v1, v0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 990
    iget-object v1, v0, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    invoke-virtual {v1}, Ll/᩹ۤܺ;->ۙ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    .line 992
    :cond_0
    iget-object v0, v0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 254
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-object v0, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    .line 255
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 116
    iget-boolean v0, p0, Ll/᩺ۤܺ;->᩶:Z

    if-nez v0, :cond_3

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_3

    .line 117
    new-instance v0, Ll/ۛۤܺ;

    iget-object v1, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 613
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v2, 0x0

    .line 595
    iput-object v2, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    .line 596
    sget-object v2, Ll/᩺ۤܺ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    if-eqz v1, :cond_2

    .line 615
    iget v2, v1, Ll/ۛۤܺ;->ۚ:I

    iput v2, v0, Ll/ۛۤܺ;->ۚ:I

    .line 616
    new-instance v2, Ll/ۨۤܺ;

    iget-object v3, v1, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    invoke-direct {v2, v3}, Ll/ۨۤܺ;-><init>(Ll/ۨۤܺ;)V

    iput-object v2, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 617
    iget-object v3, v1, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget-object v3, v3, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    if-eqz v3, :cond_0

    .line 618
    new-instance v3, Landroid/graphics/Paint;

    iget-object v4, v1, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget-object v4, v4, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, v2, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    .line 620
    :cond_0
    iget-object v2, v1, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget-object v2, v2, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    if-eqz v2, :cond_1

    .line 621
    iget-object v2, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    new-instance v3, Landroid/graphics/Paint;

    iget-object v4, v1, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    iget-object v4, v4, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, v2, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    .line 623
    :cond_1
    iget-object v2, v1, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    iput-object v2, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    .line 624
    iget-object v2, v1, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    .line 625
    iget-boolean v1, v1, Ll/ۛۤܺ;->ۙ:Z

    iput-boolean v1, v0, Ll/ۛۤܺ;->ۙ:Z

    .line 117
    :cond_2
    iput-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    const/4 v0, 0x1

    .line 118
    iput-boolean v0, p0, Ll/᩺ۤܺ;->᩶:Z

    :cond_3
    return-object p0
.end method

.method public final onStateChange([I)Z
    .locals 5

    .line 261
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 262
    iget-object v1, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v3, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    if-eqz v3, :cond_0

    .line 263
    invoke-virtual {p0, v1, v3}, Ll/᩺ۤܺ;->ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    .line 264
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 717
    :goto_0
    iget-object v3, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 989
    iget-object v4, v3, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    if-nez v4, :cond_1

    .line 990
    iget-object v4, v3, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    invoke-virtual {v4}, Ll/᩹ۤܺ;->ۙ()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v3, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    .line 992
    :cond_1
    iget-object v3, v3, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 721
    iget-object v3, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 996
    iget-object v3, v3, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    invoke-virtual {v3, p1}, Ll/᩹ۤܺ;->ۙ([I)Z

    move-result p1

    .line 722
    iget-boolean v3, v0, Ll/ۛۤܺ;->᩷:Z

    or-int/2addr v3, p1

    iput-boolean v3, v0, Ll/ۛۤܺ;->᩷:Z

    if-eqz p1, :cond_2

    .line 268
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v2

    :cond_2
    return v1
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 194
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iget-object v0, v0, Ll/ۛۤܺ;->ܺ:Ll/ۨۤܺ;

    .line 776
    iget v1, v0, Ll/ۨۤܺ;->֫:I

    if-eq v1, p1, :cond_0

    .line 772
    iput p1, v0, Ll/ۨۤܺ;->֫:I

    .line 196
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 302
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    iput-boolean p1, v0, Ll/ۛۤܺ;->ۙ:Z

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 202
    iput-object p1, p0, Ll/᩺ۤܺ;->ܰ:Landroid/graphics/ColorFilter;

    .line 203
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 0

    .line 228
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩺ۤܺ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 233
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 234
    iget-object v1, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    .line 235
    iput-object p1, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    .line 236
    iget-object v0, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, v0}, Ll/᩺ۤܺ;->ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    .line 237
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 243
    iget-object v0, p0, Ll/᩺ۤܺ;->ۢ:Ll/ۛۤܺ;

    .line 244
    iget-object v1, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    .line 245
    iput-object p1, v0, Ll/ۛۤܺ;->᩻:Landroid/graphics/PorterDuff$Mode;

    .line 246
    iget-object v0, v0, Ll/ۛۤܺ;->ۧ:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0, p1}, Ll/᩺ۤܺ;->ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۤܺ;->ܿ:Landroid/graphics/PorterDuffColorFilter;

    .line 247
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final ۙ(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 222
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 223
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 2

    .line 586
    iget-boolean v0, p0, Ll/᩺ۤܺ;->֨:Z

    if-eqz v0, :cond_0

    .line 589
    invoke-static {p0}, Ll/ܶ᩸ܺ;->ۙ(Ll/᩺ۤܺ;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 587
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Need set savePathData to true"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
