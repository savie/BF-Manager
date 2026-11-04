.class public final Ll/ܳۤܳ;
.super Ljava/lang/Object;
.source "U4IR"


# static fields
.field public static final ܰ:[C

.field public static final ᩶:[Ljava/lang/String;


# instance fields
.field public final ֫:Ll/᩸᩷ܺ;

.field public ۗ:Z

.field public final ۘ:I

.field public final ۙ:[C

.field public final ۚ:Ll/ۨ᩷ܳ;

.field public final ۛ:Landroid/graphics/RectF;

.field public ۤ:[Z

.field public ۧ:Z

.field public final ۨ:Landroid/graphics/RectF;

.field public ۫:[B

.field public ܳ:[B

.field public ܶ:[I

.field public ܺ:J

.field public final ܽ:[C

.field public ᩴ:Z

.field public ᩵:Z

.field public final ᩷:[C

.field public ᩸:Z

.field public ᩹:Z

.field public final ᩺:Landroid/graphics/RectF;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const-string v14, "E"

    const-string v15, "F"

    const-string v0, "0"

    const-string v1, "1"

    const-string v2, "2"

    const-string v3, "3"

    const-string v4, "4"

    const-string v5, "5"

    const-string v6, "6"

    const-string v7, "7"

    const-string v8, "8"

    const-string v9, "9"

    const-string v10, "A"

    const-string v11, "B"

    const-string v12, "C"

    const-string v13, "D"

    .line 16
    filled-new-array/range {v0 .. v15}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܳۤܳ;->᩶:[Ljava/lang/String;

    const-string v0, "0123456789ABCDEF"

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/ܳۤܳ;->ܰ:[C

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 3

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܳۤܳ;->ۨ:Landroid/graphics/RectF;

    .line 20
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܳۤܳ;->ۛ:Landroid/graphics/RectF;

    .line 21
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܳۤܳ;->᩺:Landroid/graphics/RectF;

    .line 22
    new-instance v0, Ll/᩸᩷ܺ;

    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Ll/᩸᩷ܺ;-><init>(I)V

    .line 22
    iput-object v0, p0, Ll/ܳۤܳ;->֫:Ll/᩸᩷ܺ;

    .line 31
    sget-object v0, Ll/ۡܺ᩹;->ۙ:[B

    iput-object v0, p0, Ll/ܳۤܳ;->ܳ:[B

    .line 32
    sget-object v0, Ll/ۢܺ᩹;->ۙ:[Z

    iput-object v0, p0, Ll/ܳۤܳ;->ۤ:[Z

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 33
    iput-object v1, p0, Ll/ܳۤܳ;->ܶ:[I

    new-array v0, v0, [B

    .line 34
    iput-object v0, p0, Ll/ܳۤܳ;->۫:[B

    const/4 v0, 0x2

    new-array v1, v0, [C

    .line 37
    iput-object v1, p0, Ll/ܳۤܳ;->᩷:[C

    const/4 v1, 0x1

    new-array v1, v1, [C

    .line 38
    iput-object v1, p0, Ll/ܳۤܳ;->ۙ:[C

    const/16 v1, 0xd

    new-array v1, v1, [C

    .line 39
    iput-object v1, p0, Ll/ܳۤܳ;->ܽ:[C

    .line 42
    iput-object p1, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    .line 43
    iget-object p1, p1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 44
    iget-object v1, p1, Ll/ۙ᩷ܳ;->ۡ:Landroid/graphics/drawable/Drawable;

    .line 45
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iget-object v2, p1, Ll/ۙ᩷ܳ;->ۖ:Landroid/graphics/drawable/Drawable;

    .line 46
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    .line 44
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object p1, p1, Ll/ۙ᩷ܳ;->֨:Landroid/graphics/drawable/Drawable;

    .line 47
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    .line 44
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x3

    div-int/2addr p1, v0

    iput p1, p0, Ll/ܳۤܳ;->ۘ:I

    return-void
.end method

.method private ۘ()J
    .locals 4

    .line 492
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 493
    :cond_0
    iget-object v0, v1, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-wide v2, v0, Ll/۬ۙܳ;->᩸:J

    iget-boolean v0, v1, Ll/ۗۙܳ;->᩸:Z

    int-to-long v0, v0

    add-long/2addr v2, v0

    return-wide v2
.end method

.method private ۙ(FJJZ)D
    .locals 13

    move-object v0, p0

    .line 723
    iget-object v1, v0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v2, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v2

    .line 724
    iget-object v3, v1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v3, v3, Ll/ۙ᩷ܳ;->᩷:F

    float-to-double v3, v3

    if-eqz p6, :cond_0

    .line 725
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۙ()F

    move-result v5

    float-to-double v5, v5

    int-to-long v7, v2

    rem-long v7, p4, v7

    long-to-double v7, v7

    mul-double v7, v7, v3

    add-double/2addr v7, v5

    goto :goto_0

    :cond_0
    int-to-long v5, v2

    rem-long v5, p4, v5

    long-to-int v6, v5

    invoke-virtual {p0, v6}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v5

    float-to-double v7, v5

    :goto_0
    if-eqz p6, :cond_1

    goto :goto_1

    :cond_1
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    mul-double v3, v3, v5

    :goto_1
    add-double/2addr v3, v7

    .line 727
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v5

    int-to-double v5, v5

    int-to-long v9, v2

    div-long v9, p4, v9

    long-to-double v9, v9

    iget-object v2, v1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v2, v2, Ll/ۙ᩷ܳ;->᩻:I

    int-to-double v11, v2

    mul-double v9, v9, v11

    add-double/2addr v9, v5

    move v2, p1

    float-to-double v5, v2

    sub-double/2addr v7, v5

    sub-double/2addr v5, v3

    .line 728
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    move-wide v6, p2

    long-to-double v6, v6

    sub-double v11, v9, v6

    sub-double/2addr v6, v9

    .line 729
    iget-object v1, v1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->᩻:I

    int-to-double v8, v1

    sub-double/2addr v6, v8

    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    mul-double v2, v2, v2

    mul-double v4, v4, v4

    add-double/2addr v4, v2

    return-wide v4
.end method

.method private ۙ(J)I
    .locals 9

    .line 577
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 578
    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 579
    invoke-direct {p0}, Ll/ܳۤܳ;->ۘ()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-nez v8, :cond_0

    .line 580
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    return v4

    .line 583
    :cond_0
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr p1, v2

    .line 584
    iget v0, v0, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v2, v0

    div-long/2addr p1, v2

    long-to-int v0, p1

    int-to-long v2, v0

    cmp-long v8, p1, v2

    if-nez v8, :cond_4

    if-gez v0, :cond_1

    .line 587
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    return v4

    .line 590
    :cond_1
    invoke-direct {p0}, Ll/ܳۤܳ;->ۘ()J

    move-result-wide p1

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v1

    int-to-long v1, v1

    rem-long/2addr p1, v1

    cmp-long v1, p1, v6

    invoke-direct {p0}, Ll/ܳۤܳ;->ܰ()I

    move-result p1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    sub-int/2addr p1, v5

    :goto_0
    if-le v0, p1, :cond_3

    .line 593
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    return p1

    :cond_3
    return v0

    .line 0
    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ۙ(Landroid/graphics/Canvas;Ll/ۢܺۤ;FF)V
    .locals 10

    .line 741
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 742
    iget v1, v0, Ll/ۙ᩷ܳ;->᩷:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 743
    iget v3, v0, Ll/ۙ᩷ܳ;->ᩴ:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    .line 744
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    .line 745
    iget v0, v0, Ll/ۙ᩷ܳ;->ܺ:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    sub-float v5, p3, v1

    sub-float v6, p4, v3

    add-float v7, p3, v1

    add-float v8, p4, v3

    move-object v4, p1

    move-object v9, p2

    .line 746
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 748
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method private ܰ()I
    .locals 7

    .line 497
    invoke-direct {p0}, Ll/ܳۤܳ;->ۘ()J

    move-result-wide v0

    iget-object v2, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v3, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v0, v3

    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v2

    int-to-long v5, v2

    div-long/2addr v0, v5

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method


# virtual methods
.method public final ֫()Landroid/graphics/RectF;
    .locals 1

    .line 532
    iget-object v0, p0, Ll/ܳۤܳ;->᩺:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ۗ()Z
    .locals 1

    .line 684
    iget-boolean v0, p0, Ll/ܳۤܳ;->᩻:Z

    return v0
.end method

.method public final ۙ()F
    .locals 6

    .line 560
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 561
    iget-object v2, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 562
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    .line 88
    iget-object v4, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v4, :cond_0

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ܳ()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, v4, Ll/ۗۙܳ;->ۙ:I

    :goto_0
    const/4 v4, 0x1

    add-int/2addr v0, v4

    .line 563
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v1

    const/4 v5, 0x3

    invoke-static {v1, v5, v0, v4}, Ll/ۨ᩹ۧ;->ۙ(IIII)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iget v1, v2, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v0, v0, v1

    add-float/2addr v0, v3

    return v0
.end method

.method public final ۙ(I)F
    .locals 3

    .line 511
    invoke-virtual {p0}, Ll/ܳۤܳ;->ܳ()F

    move-result v0

    int-to-float p1, p1

    invoke-virtual {p0}, Ll/ܳۤܳ;->ۤ()F

    move-result v1

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    .line 512
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩷:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۤ()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩷:F

    sub-float v0, v1, v0

    :goto_0
    add-float/2addr p1, v0

    return p1
.end method

.method public final ۙ(FJZ)I
    .locals 9

    const/4 v0, 0x0

    .line 670
    iput-boolean v0, p0, Ll/ܳۤܳ;->᩹:Z

    .line 671
    iput-boolean v0, p0, Ll/ܳۤܳ;->᩻:Z

    .line 672
    invoke-direct {p0, p2, p3}, Ll/ܳۤܳ;->ۙ(J)I

    move-result p2

    .line 610
    iget-object p3, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, p3, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v2, p3, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 611
    iget-object v3, p3, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 612
    iget v3, v3, Ll/ۙ᩷ܳ;->᩷:F

    .line 613
    invoke-virtual {p3}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_3

    .line 614
    invoke-virtual {p0}, Ll/ܳۤܳ;->ܳ()F

    move-result p4

    sub-float p4, p1, p4

    .line 615
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۤ()F

    move-result v4

    div-float/2addr p4, v4

    float-to-double v6, p4

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int p4, v6

    if-ltz p4, :cond_0

    .line 616
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v4

    if-lt p4, v4, :cond_1

    :cond_0
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    .line 617
    :cond_1
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v1

    sub-int/2addr v1, v5

    invoke-static {v1, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 618
    invoke-virtual {p0, p4}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    add-float/2addr v1, v3

    cmpg-float p1, p1, v1

    if-gez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ܳۤܳ;->᩵:Z

    goto :goto_7

    .line 621
    :cond_3
    invoke-virtual {p0}, Ll/ܳۤܳ;->ܳ()F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float v7, v3, v6

    add-float/2addr v7, v4

    cmpg-float v4, p1, v7

    if-gtz v4, :cond_4

    .line 623
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    .line 624
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩵:Z

    goto :goto_3

    .line 627
    :cond_4
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_7

    add-float/2addr v7, v3

    cmpg-float v8, p1, v7

    if-gtz v8, :cond_5

    .line 631
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩵:Z

    goto :goto_2

    :cond_5
    mul-float v8, v3, v6

    add-float/2addr v7, v8

    cmpg-float v8, p1, v7

    if-gtz v8, :cond_6

    .line 636
    iput-boolean v0, p0, Ll/ܳۤܳ;->᩵:Z

    :goto_2
    move p4, v4

    goto :goto_7

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_7
    if-nez p4, :cond_c

    add-float/2addr v7, v3

    cmpg-float p4, p1, v7

    if-gtz p4, :cond_8

    goto :goto_5

    .line 646
    :cond_8
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩵:Z

    .line 647
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۙ()F

    move-result p4

    cmpg-float v4, p1, p4

    if-gtz v4, :cond_9

    .line 649
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    :goto_3
    const/4 p4, 0x0

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    move v4, p4

    const/4 p4, 0x0

    :goto_4
    if-ge p4, v1, :cond_b

    add-float/2addr v4, v3

    cmpg-float v6, p1, v4

    if-gtz v6, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 p4, p4, 0x1

    goto :goto_4

    .line 657
    :cond_b
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    goto :goto_6

    .line 641
    :cond_c
    :goto_5
    iput-boolean v5, p0, Ll/ܳۤܳ;->᩹:Z

    .line 642
    iput-boolean v0, p0, Ll/ܳۤܳ;->᩵:Z

    :goto_6
    add-int/lit8 p4, v1, -0x1

    .line 674
    :goto_7
    iget-object p1, p3, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez p1, :cond_d

    invoke-virtual {v2, p2, p4}, Ll/ۚ᩷ܳ;->ۙ(II)I

    move-result p1

    return p1

    :cond_d
    int-to-long p1, p2

    .line 675
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v1

    int-to-long v3, v1

    mul-long p1, p1, v3

    int-to-long v3, p4

    add-long/2addr p1, v3

    iput-wide p1, p0, Ll/ܳۤܳ;->ܺ:J

    .line 677
    iget-object p3, p3, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-boolean p4, p3, Ll/ۗۙܳ;->᩸:Z

    if-eqz p4, :cond_e

    iget-object p4, p3, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-wide v3, p4, Ll/۬ۙܳ;->᩸:J

    cmp-long p4, p1, v3

    if-nez p4, :cond_e

    .line 678
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩸()I

    move-result p1

    return p1

    .line 679
    :cond_e
    invoke-virtual {p3, p1, p2}, Ll/ۗۙܳ;->ۙ(J)I

    move-result p1

    if-gez p1, :cond_f

    const/4 v0, 0x1

    .line 680
    :cond_f
    iput-boolean v0, p0, Ll/ܳۤܳ;->᩻:Z

    if-eqz v0, :cond_10

    .line 1222
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    :cond_10
    return p1
.end method

.method public final ۙ(JF)I
    .locals 18

    move-object/from16 v7, p0

    .line 703
    iget-object v8, v7, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v0, v8, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v9, v8, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    if-eqz v0, :cond_8

    .line 704
    iget-boolean v10, v0, Ll/ۗۙܳ;->ᩴ:Z

    iget-object v11, v0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    .line 1234
    invoke-virtual {v9}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 705
    :cond_0
    invoke-virtual {v8}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۙ()F

    move-result v1

    cmpl-float v1, p3, v1

    if-ltz v1, :cond_1

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v14, 0x0

    .line 706
    :goto_0
    iget-wide v1, v7, Ll/ܳۤܳ;->ܺ:J

    invoke-virtual {v0, v1, v2, v12}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v15

    .line 707
    iget-wide v1, v7, Ll/ܳۤܳ;->ܺ:J

    invoke-virtual {v0, v1, v2, v13}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v6

    if-gez v15, :cond_2

    move v12, v6

    goto :goto_1

    :cond_2
    if-gez v6, :cond_3

    goto :goto_2

    .line 31
    :cond_3
    invoke-virtual {v11, v15, v10}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v4

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-wide/from16 v2, p1

    move v12, v6

    move v6, v14

    .line 711
    invoke-direct/range {v0 .. v6}, Ll/ܳۤܳ;->ۙ(FJJZ)D

    move-result-wide v16

    .line 31
    invoke-virtual {v11, v12, v10}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v4

    .line 712
    invoke-direct/range {v0 .. v6}, Ll/ܳۤܳ;->ۙ(FJJZ)D

    move-result-wide v0

    cmpg-double v2, v16, v0

    if-gtz v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move v15, v12

    :goto_2
    if-ltz v15, :cond_7

    .line 31
    invoke-virtual {v11, v15, v10}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v0

    .line 714
    invoke-virtual {v9}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v2

    int-to-long v2, v2

    rem-long/2addr v0, v2

    long-to-int v1, v0

    if-nez v14, :cond_6

    .line 715
    invoke-virtual {v7, v1}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v0

    iget-object v1, v8, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->᩷:F

    add-float/2addr v0, v1

    cmpg-float v0, p3, v0

    if-gez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v12, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v12, 0x1

    :goto_4
    iput-boolean v12, v7, Ll/ܳۤܳ;->᩵:Z

    .line 717
    :cond_7
    iput-boolean v13, v7, Ll/ܳۤܳ;->᩹:Z

    return v15

    :cond_8
    :goto_5
    const/4 v0, -0x1

    return v0
.end method

.method public final ۙ(ILl/ܶ᩸ܳ;Z)V
    .locals 9

    .line 458
    invoke-virtual {p0, p1}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v0

    .line 459
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۧ()I

    move-result p1

    int-to-long v2, p1

    iget-object p1, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v4, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v4

    int-to-long v4, v4

    div-long v4, v0, v4

    iget-object v6, p1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v7, v6, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v7, v7

    mul-long v4, v4, v7

    add-long/2addr v4, v2

    .line 460
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result p1

    int-to-long v2, p1

    rem-long/2addr v0, v2

    long-to-int p1, v0

    invoke-virtual {p0, p1}, Ll/ܳۤܳ;->ۙ(I)F

    move-result p1

    if-eqz p3, :cond_0

    const/high16 p3, 0x40000000    # 2.0f

    .line 461
    iget v0, v6, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v0, v0, p3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 462
    iget p3, v6, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v0, p3

    add-long/2addr v0, v4

    .line 10
    iput p1, p2, Ll/ܶ᩸ܳ;->᩷:I

    .line 11
    iput-wide v4, p2, Ll/ܶ᩸ܳ;->᩸:J

    .line 12
    iput p1, p2, Ll/ܶ᩸ܳ;->ۤ:I

    .line 13
    iput-wide v0, p2, Ll/ܶ᩸ܳ;->ۙ:J

    return-void
.end method

.method public final ۙ(Landroid/graphics/Canvas;ZZFZ)V
    .locals 66

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    const/4 v1, 0x0

    .line 54
    iput-boolean v1, v0, Ll/ܳۤܳ;->ۗ:Z

    .line 55
    iput-boolean v1, v0, Ll/ܳۤܳ;->ᩴ:Z

    .line 56
    iget-object v10, v0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v11, v10, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 57
    iget-object v12, v10, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 59
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v13

    .line 60
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    move-result v14

    .line 62
    iget v15, v12, Ll/ۙ᩷ܳ;->᩻:I

    iget v7, v12, Ll/ۙ᩷ܳ;->ۧ:I

    iget v6, v12, Ll/ۙ᩷ܳ;->ᩴ:F

    iget v5, v12, Ll/ۙ᩷ܳ;->֫:F

    .line 63
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v4

    .line 64
    iget v3, v12, Ll/ۙ᩷ܳ;->᩷:F

    .line 66
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ܳ()F

    move-result v16

    .line 67
    invoke-virtual {v11}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v2

    .line 69
    iget-object v1, v12, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    move/from16 v17, v3

    .line 70
    iget v3, v12, Ll/ۙ᩷ܳ;->ᩳ:I

    .line 72
    invoke-virtual {v10}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v18

    move/from16 v21, v6

    move/from16 v20, v7

    int-to-long v6, v4

    move/from16 v23, v4

    move/from16 v22, v5

    add-long v4, v18, v6

    .line 74
    invoke-direct {v0, v4, v5}, Ll/ܳۤܳ;->ۙ(J)I

    move-result v5

    int-to-long v8, v14

    add-long v8, v18, v8

    .line 78
    invoke-direct {v0, v8, v9}, Ll/ܳۤܳ;->ۙ(J)I

    move-result v4

    .line 77
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 79
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۙ()F

    move-result v9

    sub-long v28, v6, v18

    move-wide/from16 v24, v6

    int-to-long v6, v5

    move/from16 v26, v5

    int-to-long v4, v15

    mul-long v30, v6, v4

    move-wide/from16 v32, v4

    add-long v4, v30, v28

    move/from16 v34, v13

    move/from16 v35, v14

    int-to-long v13, v3

    add-long/2addr v13, v4

    move/from16 v27, v3

    long-to-int v3, v13

    move-wide/from16 v30, v4

    int-to-long v4, v3

    cmp-long v36, v13, v4

    if-nez v36, :cond_60

    int-to-long v13, v8

    sub-long v4, v13, v6

    const-wide/16 v36, 0x1

    add-long v4, v4, v36

    move/from16 v38, v3

    long-to-int v3, v4

    move/from16 v39, v8

    move/from16 v40, v9

    int-to-long v8, v3

    cmp-long v3, v4, v8

    if-nez v3, :cond_5f

    int-to-long v4, v2

    mul-long v8, v8, v4

    long-to-int v3, v8

    move-wide/from16 v41, v13

    int-to-long v13, v3

    cmp-long v43, v8, v13

    if-nez v43, :cond_5e

    .line 86
    iget-object v8, v0, Ll/ܳۤܳ;->ܳ:[B

    array-length v8, v8

    if-ge v8, v3, :cond_0

    .line 87
    new-array v8, v3, [B

    iput-object v8, v0, Ll/ܳۤܳ;->ܳ:[B

    .line 88
    new-array v8, v3, [Z

    iput-object v8, v0, Ll/ܳۤܳ;->ۤ:[Z

    :cond_0
    mul-long v8, v6, v4

    move/from16 v43, v2

    .line 93
    iget-object v2, v10, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v2, :cond_2

    long-to-int v13, v8

    move-wide/from16 v44, v4

    int-to-long v4, v13

    cmp-long v14, v8, v4

    if-nez v14, :cond_1

    .line 96
    iget-object v4, v0, Ll/ܳۤܳ;->ܳ:[B

    iget-object v5, v0, Ll/ܳۤܳ;->ۤ:[Z

    invoke-virtual {v11, v13, v3, v4, v5}, Ll/ۚ᩷ܳ;->ۙ(II[B[Z)I

    move-result v3

    move-object/from16 v49, v2

    move v8, v3

    move-wide/from16 v46, v6

    move/from16 v48, v15

    goto/16 :goto_4

    .line 0
    :cond_1
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_2
    move-wide/from16 v44, v4

    .line 94
    iget-object v4, v2, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    .line 98
    iget-object v5, v0, Ll/ܳۤܳ;->ܶ:[I

    array-length v5, v5

    if-ge v5, v3, :cond_3

    .line 99
    new-array v5, v3, [I

    iput-object v5, v0, Ll/ܳۤܳ;->ܶ:[I

    .line 100
    new-array v3, v3, [B

    iput-object v3, v0, Ll/ܳۤܳ;->۫:[B

    :cond_3
    move-wide/from16 v46, v6

    .line 102
    iget-wide v5, v4, Ll/۬ۙܳ;->᩸:J

    sub-long/2addr v5, v8

    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    long-to-int v3, v5

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v13, -0x1

    :goto_0
    if-ge v6, v3, :cond_9

    move/from16 v48, v15

    int-to-long v14, v6

    add-long/2addr v14, v8

    .line 106
    invoke-virtual {v2, v14, v15}, Ll/ۗۙܳ;->ۙ(J)I

    move-result v5

    move-object/from16 v49, v2

    .line 107
    iget-object v2, v0, Ll/ܳۤܳ;->ܶ:[I

    aput v5, v2, v6

    .line 108
    iget-object v2, v0, Ll/ܳۤܳ;->۫:[B

    move/from16 v50, v3

    .line 104
    iget-object v3, v4, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    move-object/from16 v51, v4

    move-wide/from16 v52, v8

    goto :goto_3

    :cond_4
    move-object/from16 v51, v4

    .line 244
    :goto_1
    iget-object v4, v3, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v4, :cond_6

    move-wide/from16 v52, v8

    .line 245
    iget-wide v8, v4, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v54, v14, v8

    if-gez v54, :cond_5

    move-object v3, v4

    goto :goto_2

    :cond_5
    sub-long/2addr v14, v8

    .line 246
    iget-object v3, v3, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    :goto_2
    move-wide/from16 v8, v52

    goto :goto_1

    :cond_6
    move-wide/from16 v52, v8

    .line 248
    iget v3, v3, Ll/ۙ۬ᩴ;->ܳ:I

    :goto_3
    int-to-byte v3, v3

    .line 108
    aput-byte v3, v2, v6

    if-ltz v5, :cond_8

    if-gez v13, :cond_7

    move v13, v5

    :cond_7
    move v7, v5

    :cond_8
    add-int/lit8 v6, v6, 0x1

    move/from16 v15, v48

    move-object/from16 v2, v49

    move/from16 v3, v50

    move-object/from16 v4, v51

    move-wide/from16 v8, v52

    goto :goto_0

    :cond_9
    move-object/from16 v49, v2

    move/from16 v50, v3

    move/from16 v48, v15

    if-ltz v13, :cond_a

    .line 115
    iget-object v2, v0, Ll/ܳۤܳ;->ܳ:[B

    iget-object v3, v0, Ll/ܳۤܳ;->ۤ:[Z

    sub-int/2addr v7, v13

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v11, v13, v7, v2, v3}, Ll/ۚ᩷ܳ;->ۙ(II[B[Z)I

    :cond_a
    move/from16 v8, v50

    .line 119
    :goto_4
    iget v2, v12, Ll/ۙ᩷ܳ;->ۨ:I

    move-object/from16 v9, p1

    invoke-virtual {v9, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 122
    iget v2, v12, Ll/ۙ᩷ܳ;->᩺:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v14, v35

    int-to-float v15, v14

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v7, v1

    move-object/from16 v1, p1

    move/from16 v6, v43

    move-object/from16 v5, v49

    move/from16 v35, v17

    move/from16 v17, v38

    move/from16 v38, v27

    move/from16 v55, v23

    move-wide/from16 v56, v30

    move-wide/from16 v30, v32

    move-wide/from16 v32, v44

    move/from16 v4, v16

    move-object/from16 v59, v5

    move/from16 v58, v26

    move v5, v15

    move/from16 v23, v14

    move-wide/from16 v26, v46

    move v14, v6

    move-object v6, v7

    .line 123
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const-wide/16 v43, -0x1

    move-object/from16 v6, v59

    if-eqz v6, :cond_c

    .line 124
    iget-wide v1, v6, Ll/ۗۙܳ;->ۤ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_b

    goto :goto_5

    :cond_b
    div-long v1, v1, v32

    move-wide/from16 v45, v1

    goto :goto_6

    :cond_c
    :goto_5
    move-wide/from16 v45, v43

    :goto_6
    cmp-long v1, v45, v26

    if-ltz v1, :cond_d

    cmp-long v1, v45, v41

    if-gtz v1, :cond_d

    mul-long v4, v45, v30

    add-long v4, v4, v28

    long-to-float v3, v4

    .line 127
    iget v1, v12, Ll/ۙ᩷ܳ;->ۤ:I

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v5, v48

    int-to-float v1, v5

    add-float v26, v3, v1

    const/4 v2, 0x0

    move-object/from16 v1, p1

    move/from16 v4, v16

    move/from16 v60, v5

    move/from16 v5, v26

    move/from16 v47, v15

    move-object v15, v6

    move-object v6, v7

    .line 128
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_7

    :cond_d
    move/from16 v47, v15

    move/from16 v60, v48

    move-object v15, v6

    .line 131
    :goto_7
    iget v1, v12, Ll/ۙ᩷ܳ;->ۘ:I

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    invoke-virtual {v10}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    const/high16 v48, 0x40000000    # 2.0f

    div-float v49, v35, v48

    add-float v26, v1, v49

    move/from16 v6, v17

    move/from16 v5, v58

    .line 134
    :goto_8
    sget-object v27, Ll/ܳۤܳ;->ܰ:[C

    move/from16 v4, v39

    if-gt v5, v4, :cond_14

    int-to-long v2, v5

    mul-long v2, v2, v32

    if-eqz v15, :cond_10

    move/from16 v3, v58

    sub-int v2, v5, v3

    mul-int v2, v2, v14

    move v1, v2

    :goto_9
    add-int v3, v2, v14

    .line 139
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v1, v3, :cond_f

    .line 140
    iget-object v3, v0, Ll/ܳۤܳ;->ܶ:[I

    aget v3, v3, v1

    if-ltz v3, :cond_e

    int-to-long v2, v3

    goto :goto_a

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_f
    move-wide/from16 v2, v43

    goto :goto_a

    :cond_10
    move-wide/from16 v50, v2

    :goto_a
    const-wide/16 v50, 0x0

    cmp-long v1, v2, v50

    if-ltz v1, :cond_13

    .line 88
    iget-object v1, v10, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v1, :cond_11

    iget-object v1, v10, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ܳ()I

    move-result v1

    goto :goto_b

    :cond_11
    iget v1, v1, Ll/ۗۙܳ;->ۙ:I

    :goto_b
    add-int/lit8 v50, v1, -0x1

    move/from16 v51, v4

    .line 754
    :goto_c
    iget-object v4, v0, Ll/ܳۤܳ;->ܽ:[C

    if-ltz v50, :cond_12

    const-wide/16 v52, 0xf

    move/from16 v54, v13

    move/from16 v59, v14

    and-long v13, v2, v52

    long-to-int v14, v13

    .line 755
    aget-char v13, v27, v14

    aput-char v13, v4, v50

    const/4 v13, 0x4

    ushr-long/2addr v2, v13

    add-int/lit8 v50, v50, -0x1

    move/from16 v13, v54

    move/from16 v14, v59

    goto :goto_c

    :cond_12
    move/from16 v54, v13

    move/from16 v59, v14

    const/16 v2, 0x20

    .line 758
    aput-char v2, v4, v1

    add-int/lit8 v3, v1, 0x1

    .line 759
    aput-char v2, v4, v3

    add-int/lit8 v3, v1, 0x2

    .line 760
    aput-char v2, v4, v3

    add-int/lit8 v3, v1, 0x3

    .line 761
    aput-char v2, v4, v3

    add-int/lit8 v2, v1, 0x4

    const/16 v3, 0x2e

    .line 762
    aput-char v3, v4, v2

    add-int/lit8 v4, v1, 0x5

    const/4 v3, 0x0

    int-to-float v13, v6

    .line 145
    iget-object v2, v0, Ll/ܳۤܳ;->ܽ:[C

    move-object/from16 v1, p1

    move/from16 v14, v58

    move/from16 v61, v51

    move/from16 v58, v5

    move/from16 v5, v26

    move/from16 v27, v6

    move v6, v13

    move/from16 v13, v20

    move-object/from16 v20, v7

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    move-object/from16 v6, v20

    move/from16 v7, v60

    goto :goto_d

    :cond_13
    move/from16 v61, v4

    move/from16 v27, v6

    move/from16 v54, v13

    move/from16 v59, v14

    move/from16 v13, v20

    move/from16 v14, v58

    move/from16 v58, v5

    move-object/from16 v20, v7

    add-float v1, v26, v49

    sub-int v6, v27, v38

    int-to-float v2, v6

    move/from16 v7, v60

    int-to-float v3, v7

    div-float v3, v3, v48

    add-float/2addr v3, v2

    move-object/from16 v6, v20

    .line 146
    invoke-direct {v0, v9, v6, v1, v3}, Ll/ܳۤܳ;->ۙ(Landroid/graphics/Canvas;Ll/ۢܺۤ;FF)V

    :goto_d
    add-int v1, v27, v7

    add-int/lit8 v5, v58, 0x1

    move/from16 v60, v7

    move/from16 v20, v13

    move/from16 v58, v14

    move/from16 v13, v54

    move/from16 v14, v59

    move/from16 v39, v61

    move-object v7, v6

    move v6, v1

    goto/16 :goto_8

    :cond_14
    move/from16 v61, v4

    move-object v6, v7

    move/from16 v54, v13

    move/from16 v59, v14

    move/from16 v13, v20

    move/from16 v14, v58

    move/from16 v7, v60

    if-eqz v15, :cond_16

    .line 152
    iget-boolean v1, v15, Ll/ۗۙܳ;->ۚ:Z

    if-nez v1, :cond_15

    iget-boolean v1, v15, Ll/ۗۙܳ;->ܶ:Z

    if-eqz v1, :cond_16

    :cond_15
    const/4 v1, 0x1

    goto :goto_e

    :cond_16
    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_17

    .line 153
    iget-wide v2, v15, Ll/ۗۙܳ;->ܺ:J

    goto :goto_f

    :cond_17
    invoke-virtual {v11}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v2

    :goto_f
    move-wide/from16 v43, v2

    if-eqz v1, :cond_18

    .line 154
    iget-wide v2, v15, Ll/ۗۙܳ;->֫:J

    goto :goto_10

    :cond_18
    invoke-virtual {v11}, Ll/ۚ᩷ܳ;->۫()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v2

    :goto_10
    move-wide/from16 v50, v2

    if-eqz v1, :cond_19

    .line 155
    iget-boolean v2, v15, Ll/ۗۙܳ;->᩻:Z

    goto :goto_11

    :cond_19
    invoke-virtual {v11}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v2

    :goto_11
    move/from16 v20, v2

    if-eqz v1, :cond_1a

    .line 156
    iget-boolean v1, v15, Ll/ۗۙܳ;->ۧ:Z

    goto :goto_12

    :cond_1a
    invoke-virtual {v11}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v1

    :goto_12
    move v11, v1

    if-eqz v15, :cond_1b

    .line 157
    invoke-virtual {v10}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_1b

    const/4 v1, 0x1

    const/16 v26, 0x1

    goto :goto_13

    :cond_1b
    const/4 v1, 0x0

    const/16 v26, 0x0

    :goto_13
    const v39, 0xffffff

    if-eqz v26, :cond_1c

    .line 159
    iget v1, v12, Ll/ۙ᩷ܳ;->۟:I

    and-int v2, v1, v39

    ushr-int/lit8 v1, v1, 0x18

    div-int/lit8 v1, v1, 0x2

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    goto :goto_14

    :cond_1c
    iget v1, v12, Ll/ۙ᩷ܳ;->۟:I

    :goto_14
    move v5, v1

    if-eqz v20, :cond_1d

    const/4 v1, -0x1

    const/4 v4, -0x1

    goto :goto_15

    .line 160
    :cond_1d
    div-long v1, v43, v32

    long-to-int v1, v1

    move v4, v1

    :goto_15
    const/4 v1, 0x0

    .line 164
    iput-boolean v1, v0, Ll/ܳۤܳ;->᩸:Z

    move-wide/from16 v1, v56

    long-to-int v3, v1

    move-object/from16 v52, v10

    int-to-long v9, v3

    cmp-long v53, v1, v9

    if-nez v53, :cond_5d

    move v9, v3

    move v10, v14

    move/from16 v3, v61

    :goto_16
    if-gt v10, v3, :cond_22

    if-ne v10, v4, :cond_1e

    const/4 v1, 0x1

    .line 167
    iput-boolean v1, v0, Ll/ܳۤܳ;->᩸:Z

    :cond_1e
    if-nez v15, :cond_1f

    if-ne v10, v4, :cond_20

    goto :goto_17

    :cond_1f
    int-to-long v1, v10

    cmp-long v53, v1, v45

    if-nez v53, :cond_20

    .line 170
    :goto_17
    iget v1, v12, Ll/ۙ᩷ܳ;->ۤ:I

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v9

    move/from16 v1, v34

    move/from16 v34, v4

    int-to-float v4, v1

    move/from16 v53, v1

    add-int v1, v9, v7

    int-to-float v1, v1

    move/from16 v56, v13

    move/from16 v13, v53

    move/from16 v53, v1

    move-object/from16 v1, p1

    move/from16 v57, v2

    move/from16 v2, v16

    move/from16 v58, v11

    move v11, v3

    move/from16 v3, v57

    move/from16 v61, v11

    move/from16 v11, v34

    move/from16 v62, v5

    move/from16 v5, v53

    move-object/from16 v34, v6

    .line 171
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_18

    :cond_20
    move/from16 v61, v3

    move/from16 v62, v5

    move/from16 v58, v11

    move/from16 v56, v13

    move/from16 v13, v34

    move v11, v4

    move-object/from16 v34, v6

    .line 172
    rem-int/lit8 v1, v10, 0x2

    if-eqz v1, :cond_21

    .line 173
    iget v1, v12, Ll/ۙ᩷ܳ;->ۛ:I

    move-object/from16 v6, v34

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v9

    int-to-float v4, v13

    add-int v1, v9, v7

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v16

    .line 174
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_18

    .line 176
    :cond_21
    iget v1, v12, Ll/ۙ᩷ܳ;->ۨ:I

    move-object/from16 v6, v34

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v9

    int-to-float v4, v13

    add-int v1, v9, v7

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v16

    .line 177
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_18
    add-int/2addr v9, v7

    add-int/lit8 v10, v10, 0x1

    move v4, v11

    move-object/from16 v6, v34

    move/from16 v11, v58

    move/from16 v3, v61

    move/from16 v5, v62

    move/from16 v34, v13

    move/from16 v13, v56

    goto/16 :goto_16

    :cond_22
    move/from16 v61, v3

    move/from16 v62, v5

    move/from16 v58, v11

    move/from16 v56, v13

    move/from16 v13, v34

    move v11, v4

    move-object/from16 v34, v6

    if-eqz v15, :cond_27

    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_19
    if-ge v9, v8, :cond_27

    .line 186
    iget-object v1, v0, Ll/ܳۤܳ;->۫:[B

    aget-byte v1, v1, v9

    if-nez v1, :cond_23

    move/from16 v46, v8

    goto/16 :goto_1c

    .line 187
    :cond_23
    div-int v1, v9, v59

    rem-int v10, v9, v59

    add-int v5, v14, v1

    int-to-long v1, v5

    mul-long v1, v1, v30

    add-long v1, v1, v28

    long-to-float v6, v1

    .line 190
    invoke-virtual {v0, v10}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۤ()F

    move-result v2

    mul-float v3, v35, v48

    sub-float/2addr v2, v3

    div-float v2, v2, v48

    sub-float v2, v1, v2

    .line 191
    iget-object v1, v0, Ll/ܳۤܳ;->۫:[B

    aget-byte v1, v1, v9

    invoke-static {v1}, Ll/ۗۙܳ;->ۙ(I)I

    move-result v1

    move-object/from16 v5, v34

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v4, v59, -0x1

    if-ne v10, v4, :cond_24

    .line 193
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-nez v1, :cond_24

    int-to-float v1, v13

    goto :goto_1a

    :cond_24
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۤ()F

    move-result v1

    add-float/2addr v1, v2

    :goto_1a
    move/from16 v34, v1

    int-to-float v1, v7

    add-float v45, v1, v6

    move-object/from16 v1, p1

    move v3, v6

    move/from16 v46, v8

    move v8, v4

    move/from16 v4, v34

    move-object/from16 v34, v5

    move/from16 v5, v45

    move/from16 v53, v6

    move-object/from16 v6, v34

    .line 194
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 195
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_26

    int-to-float v1, v10

    mul-float v1, v1, v35

    add-float v2, v1, v40

    if-ne v10, v8, :cond_25

    int-to-float v1, v13

    move v4, v1

    goto :goto_1b

    :cond_25
    add-float v3, v2, v35

    move v4, v3

    :goto_1b
    move-object/from16 v1, p1

    move/from16 v3, v53

    move/from16 v5, v45

    move-object/from16 v6, v34

    .line 197
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_26
    :goto_1c
    add-int/lit8 v9, v9, 0x1

    move/from16 v8, v46

    goto :goto_19

    :cond_27
    move/from16 v46, v8

    const/high16 v9, 0x40400000    # 3.0f

    if-nez v20, :cond_35

    if-gt v14, v11, :cond_33

    move/from16 v10, v61

    if-gt v11, v10, :cond_32

    const/4 v1, 0x1

    .line 209
    iput-boolean v1, v0, Ll/ܳۤܳ;->ᩴ:Z

    .line 210
    rem-long v1, v43, v32

    long-to-int v6, v1

    int-to-long v1, v11

    mul-long v1, v1, v30

    add-long v1, v1, v24

    sub-long v1, v1, v18

    long-to-int v11, v1

    const/high16 v18, 0x40800000    # 4.0f

    int-to-long v3, v11

    cmp-long v5, v1, v3

    if-nez v5, :cond_31

    .line 213
    invoke-virtual {v0, v6}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    sub-float v1, v1, v35

    if-eqz v58, :cond_28

    add-float v1, v1, v35

    goto :goto_1d

    :cond_28
    add-float v3, v35, v35

    add-float/2addr v1, v3

    :goto_1d
    move/from16 v19, v1

    if-eqz p2, :cond_2b

    .line 221
    iget v1, v12, Ll/ۙ᩷ܳ;->ۢ:I

    if-eqz v26, :cond_29

    and-int v1, v1, v39

    const/high16 v2, 0x60000000

    or-int/2addr v1, v2

    :cond_29
    move-object/from16 v5, v34

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v15, :cond_2a

    .line 222
    iget-boolean v1, v15, Ll/ۗۙܳ;->ܶ:Z

    if-eqz v1, :cond_2a

    .line 223
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 224
    invoke-virtual {v0, v6}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v2

    add-int/lit8 v1, v11, 0x1

    int-to-float v3, v1

    .line 225
    invoke-virtual {v0, v6}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    mul-float v4, v35, v48

    add-float/2addr v4, v1

    add-int v1, v11, v7

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    move/from16 v20, v1

    move-object/from16 v1, p1

    move-object/from16 v34, v5

    move/from16 v5, v20

    move v8, v6

    move-object/from16 v6, v34

    .line 224
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 226
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_1e

    :cond_2a
    move v8, v6

    move-object v6, v5

    int-to-float v3, v11

    add-float v4, v19, v9

    add-int v1, v11, v7

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v19

    move-object/from16 v34, v6

    .line 227
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_1e

    :cond_2b
    move v8, v6

    :goto_1e
    move/from16 v6, p3

    if-eqz v6, :cond_2d

    if-eqz v15, :cond_2c

    .line 230
    iget-boolean v1, v15, Ll/ۗۙܳ;->ܶ:Z

    if-nez v1, :cond_2d

    :cond_2c
    const/4 v1, 0x1

    goto :goto_1f

    :cond_2d
    const/4 v1, 0x0

    :goto_1f
    iput-boolean v1, v0, Ll/ܳۤܳ;->ۗ:Z

    if-eqz v1, :cond_2e

    .line 232
    iget-object v1, v12, Ll/ۙ᩷ܳ;->֨:Landroid/graphics/drawable/Drawable;

    .line 233
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v3, v19, v2

    add-float/2addr v3, v9

    add-int v4, v11, v7

    int-to-float v4, v4

    add-float v2, v19, v2

    .line 237
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v4

    .line 238
    iget-object v6, v0, Ll/ܳۤܳ;->ۨ:Landroid/graphics/RectF;

    invoke-virtual {v6, v3, v4, v2, v5}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v3, v3

    float-to-int v4, v4

    float-to-int v2, v2

    float-to-int v5, v5

    .line 239
    invoke-virtual {v1, v3, v4, v2, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_20

    :cond_2e
    const/4 v1, 0x0

    :goto_20
    move-object/from16 v19, v1

    int-to-float v1, v8

    mul-float v1, v1, v35

    add-float v2, v1, v40

    move-object/from16 v8, v34

    move/from16 v1, v62

    .line 243
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 244
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_30

    if-eqz v15, :cond_2f

    .line 245
    iget-boolean v1, v15, Ll/ۗۙܳ;->ܶ:Z

    if-eqz v1, :cond_2f

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_2f
    int-to-float v3, v11

    add-float v4, v2, v35

    add-int/2addr v11, v7

    int-to-float v5, v11

    move-object/from16 v1, p1

    move-object v6, v8

    .line 246
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 247
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_30
    const/4 v1, 0x0

    move-object v9, v1

    move-object v11, v12

    move/from16 v53, v13

    goto/16 :goto_28

    .line 0
    :cond_31
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_32
    move-object/from16 v8, v34

    goto :goto_21

    :cond_33
    move-object/from16 v8, v34

    move/from16 v10, v61

    :goto_21
    const/high16 v1, 0x40800000    # 4.0f

    :cond_34
    move-object v11, v12

    move/from16 v53, v13

    const/high16 v18, 0x40800000    # 4.0f

    goto/16 :goto_27

    :cond_35
    move/from16 v6, p3

    move-object/from16 v8, v34

    move/from16 v10, v61

    move/from16 v1, v62

    .line 251
    div-long v2, v43, v32

    long-to-int v3, v2

    .line 252
    div-long v4, v50, v32

    long-to-int v2, v4

    if-gt v14, v3, :cond_36

    if-le v3, v10, :cond_38

    :cond_36
    if-gt v14, v2, :cond_37

    if-le v2, v10, :cond_38

    :cond_37
    if-ge v3, v14, :cond_34

    if-le v2, v10, :cond_34

    .line 257
    :cond_38
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v26, v1

    move-object/from16 v34, v2

    move v5, v14

    :goto_22
    if-gt v5, v10, :cond_43

    int-to-long v1, v5

    mul-long v3, v1, v30

    add-long v3, v3, v24

    sub-long v3, v3, v18

    long-to-int v9, v3

    move-object/from16 v53, v12

    int-to-long v11, v9

    cmp-long v57, v3, v11

    if-nez v57, :cond_42

    mul-long v1, v1, v32

    add-long v3, v1, v32

    sub-long v3, v3, v36

    cmp-long v11, v1, v43

    if-gtz v11, :cond_39

    cmp-long v11, v43, v3

    if-lez v11, :cond_3b

    :cond_39
    cmp-long v11, v1, v50

    if-gtz v11, :cond_3a

    cmp-long v11, v50, v3

    if-lez v11, :cond_3b

    :cond_3a
    cmp-long v11, v43, v1

    if-gez v11, :cond_40

    cmp-long v11, v50, v3

    if-lez v11, :cond_40

    :cond_3b
    cmp-long v11, v43, v1

    if-ltz v11, :cond_3c

    .line 270
    iput-boolean v6, v0, Ll/ܳۤܳ;->ۗ:Z

    const/4 v1, 0x1

    .line 271
    iput-boolean v1, v0, Ll/ܳۤܳ;->ᩴ:Z

    move/from16 v57, v6

    move-wide/from16 v11, v43

    goto :goto_23

    :cond_3c
    const/4 v11, 0x1

    const/4 v12, 0x0

    move-wide v11, v1

    const/4 v1, 0x1

    const/16 v57, 0x0

    :goto_23
    cmp-long v2, v50, v3

    if-gtz v2, :cond_3d

    .line 276
    iput-boolean v6, v0, Ll/ܳۤܳ;->ۗ:Z

    .line 277
    iput-boolean v1, v0, Ll/ܳۤܳ;->ᩴ:Z

    move/from16 v58, v6

    move-wide/from16 v3, v50

    goto :goto_24

    :cond_3d
    const/4 v1, 0x0

    const/16 v58, 0x0

    .line 279
    :goto_24
    rem-long v11, v11, v32

    long-to-int v1, v11

    invoke-virtual {v0, v1}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v60

    .line 280
    rem-long v3, v3, v32

    long-to-int v1, v3

    invoke-virtual {v0, v1}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    mul-float v2, v35, v48

    add-float v61, v2, v1

    long-to-float v1, v11

    mul-float v1, v1, v35

    add-float v11, v1, v40

    long-to-float v1, v3

    mul-float v1, v1, v35

    add-float v1, v1, v40

    add-float v12, v1, v35

    int-to-float v4, v9

    add-int/2addr v9, v7

    int-to-float v9, v9

    move-object/from16 v1, p1

    move/from16 v2, v60

    move v3, v4

    move/from16 v62, v4

    move/from16 v4, v61

    move/from16 v63, v5

    move v5, v9

    move-object v6, v8

    .line 284
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 285
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_3e

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v62

    move v4, v12

    move v5, v9

    move-object v6, v8

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_3e
    if-eqz v57, :cond_3f

    move-object/from16 v11, v53

    .line 287
    iget-object v1, v11, Ll/ۙ᩷ܳ;->ۡ:Landroid/graphics/drawable/Drawable;

    .line 288
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    int-to-float v2, v2

    sub-float v60, v60, v2

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float v6, v21, v2

    sub-float v2, v60, v6

    .line 290
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v2

    .line 291
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v9

    float-to-int v5, v2

    float-to-int v6, v9

    float-to-int v12, v3

    move/from16 v53, v13

    float-to-int v13, v4

    .line 292
    invoke-virtual {v1, v5, v6, v12, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 293
    iget-object v5, v0, Ll/ܳۤܳ;->ۛ:Landroid/graphics/RectF;

    invoke-virtual {v5, v2, v9, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    move-object/from16 v34, v1

    goto :goto_25

    :cond_3f
    move-object/from16 v11, v53

    move/from16 v53, v13

    :goto_25
    if-eqz v58, :cond_41

    .line 296
    iget-object v1, v11, Ll/ۙ᩷ܳ;->ۖ:Landroid/graphics/drawable/Drawable;

    .line 297
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40800000    # 4.0f

    div-float/2addr v2, v3

    sub-float v61, v61, v2

    const/high16 v12, 0x3fc00000    # 1.5f

    mul-float v6, v21, v12

    add-float v6, v6, v61

    .line 299
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v6

    .line 300
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v9

    float-to-int v5, v6

    float-to-int v13, v9

    float-to-int v3, v2

    float-to-int v12, v4

    .line 301
    invoke-virtual {v1, v5, v13, v3, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 302
    iget-object v3, v0, Ll/ܳۤܳ;->᩺:Landroid/graphics/RectF;

    invoke-virtual {v3, v6, v9, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    move-object/from16 v26, v1

    goto :goto_26

    :cond_40
    move/from16 v63, v5

    move-object/from16 v11, v53

    move/from16 v53, v13

    :cond_41
    :goto_26
    add-int/lit8 v5, v63, 0x1

    move/from16 v6, p3

    move-object v12, v11

    move/from16 v13, v53

    const/high16 v9, 0x40400000    # 3.0f

    goto/16 :goto_22

    .line 0
    :cond_42
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_43
    move-object v11, v12

    move/from16 v53, v13

    move-object/from16 v9, v26

    move-object/from16 v12, v34

    const/high16 v18, 0x40800000    # 4.0f

    goto :goto_29

    :goto_27
    const/4 v1, 0x0

    const/16 v19, 0x0

    move-object v9, v1

    :goto_28
    move-object/from16 v12, v19

    :goto_29
    move v6, v14

    move/from16 v13, v17

    :goto_2a
    if-gt v6, v10, :cond_4a

    sub-int v1, v6, v14

    mul-int v17, v1, v59

    add-int v2, v17, v59

    move/from16 v5, v46

    .line 314
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    move/from16 v3, v17

    :goto_2b
    if-ge v3, v4, :cond_49

    sub-int v2, v3, v17

    .line 317
    invoke-virtual {v0, v2}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v19

    if-nez v15, :cond_44

    move v1, v3

    goto :goto_2c

    .line 318
    :cond_44
    iget-object v1, v0, Ll/ܳۤܳ;->ܶ:[I

    aget v1, v1, v3

    sub-int v1, v1, v54

    :goto_2c
    move/from16 p2, v2

    if-eqz v15, :cond_46

    .line 319
    iget-object v2, v0, Ll/ܳۤܳ;->ܶ:[I

    aget v2, v2, v3

    if-gez v2, :cond_45

    .line 320
    iget v1, v11, Ll/ۙ᩷ܳ;->ۘ:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-float v1, v19, v35

    sub-int v2, v13, v38

    int-to-float v2, v2

    move/from16 v21, v3

    int-to-float v3, v7

    div-float v3, v3, v48

    add-float/2addr v3, v2

    move-object/from16 v2, p1

    .line 321
    invoke-direct {v0, v2, v8, v1, v3}, Ll/ܳۤܳ;->ۙ(Landroid/graphics/Canvas;Ll/ۢܺۤ;FF)V

    move/from16 v24, v4

    move/from16 v50, v5

    move/from16 v19, v6

    move/from16 v34, v7

    goto/16 :goto_2f

    :cond_45
    move-object/from16 v2, p1

    move/from16 v21, v3

    goto :goto_2d

    :cond_46
    move/from16 v21, v3

    move-object/from16 v2, p1

    .line 325
    :goto_2d
    iget-object v3, v0, Ll/ܳۤܳ;->ۤ:[Z

    aget-boolean v3, v3, v1

    if-eqz v3, :cond_47

    iget v3, v11, Ll/ۙ᩷ܳ;->ۙ:I

    goto :goto_2e

    :cond_47
    iget v3, v11, Ll/ۙ᩷ܳ;->ۢ:I

    :goto_2e
    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 326
    iget-object v3, v0, Ll/ܳۤܳ;->ܳ:[B

    aget-byte v1, v3, v1

    and-int/lit16 v3, v1, 0xff

    ushr-int/lit8 v24, v3, 0x4

    .line 327
    aget-char v24, v27, v24

    iget-object v2, v0, Ll/ܳۤܳ;->᩷:[C

    const/16 v25, 0x0

    aput-char v24, v2, v25

    and-int/lit8 v1, v1, 0xf

    .line 328
    aget-char v1, v27, v1

    const/16 v24, 0x1

    aput-char v1, v2, v24

    .line 329
    iget-object v1, v0, Ll/ܳۤܳ;->ۙ:[C

    int-to-char v3, v3

    aput-char v3, v1, v25

    int-to-float v3, v13

    const/16 v24, 0x0

    const/16 v25, 0x2

    move-object/from16 v1, p1

    move/from16 v64, p2

    move/from16 v26, v3

    move/from16 v3, v24

    move/from16 v24, v4

    move/from16 v4, v25

    move/from16 v50, v5

    move/from16 v5, v19

    move/from16 v19, v6

    move/from16 v6, v26

    move/from16 v34, v7

    move-object v7, v8

    .line 330
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    .line 331
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_48

    move/from16 v3, v64

    int-to-float v1, v3

    mul-float v1, v1, v35

    add-float v5, v1, v40

    .line 332
    iget-object v2, v0, Ll/ܳۤܳ;->ۙ:[C

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v1, p1

    move/from16 v6, v26

    move-object v7, v8

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    :cond_48
    :goto_2f
    add-int/lit8 v3, v21, 0x1

    move/from16 v6, v19

    move/from16 v4, v24

    move/from16 v7, v34

    move/from16 v5, v50

    goto/16 :goto_2b

    :cond_49
    move/from16 v50, v5

    move/from16 v19, v6

    move/from16 v34, v7

    add-int v13, v13, v34

    add-int/lit8 v6, v19, 0x1

    move/from16 v46, v50

    goto/16 :goto_2a

    :cond_4a
    move/from16 v34, v7

    .line 340
    iget v1, v11, Ll/ۙ᩷ܳ;->ܰ:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v10, v55

    int-to-float v13, v10

    move-object/from16 v1, p1

    move/from16 v2, v16

    move v3, v13

    move/from16 v4, v16

    move/from16 v5, v47

    move-object v6, v8

    .line 342
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 343
    invoke-virtual/range {v52 .. v52}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_50

    const/high16 v1, 0x40400000    # 3.0f

    mul-float v3, v35, v1

    mul-float v7, v3, v18

    move-wide/from16 v24, v41

    move-wide/from16 v26, v30

    .line 344
    invoke-static/range {v24 .. v31}, Ll/ۧ᩺᩻;->ۙ(JJJJ)J

    move-result-wide v1

    long-to-int v14, v1

    int-to-long v3, v14

    cmp-long v5, v1, v3

    if-nez v5, :cond_4f

    mul-long v1, v41, v32

    const/4 v3, 0x0

    move/from16 v18, v16

    move/from16 v5, v59

    const/4 v6, 0x0

    move-wide/from16 v16, v1

    :goto_30
    if-ge v6, v5, :cond_4e

    if-nez v6, :cond_4b

    move/from16 v19, v47

    goto :goto_32

    .line 349
    :cond_4b
    invoke-direct/range {p0 .. p0}, Ll/ܳۤܳ;->ۘ()J

    move-result-wide v1

    cmp-long v3, v16, v1

    if-gtz v3, :cond_4c

    int-to-float v1, v14

    goto :goto_31

    :cond_4c
    sub-int v1, v14, v34

    int-to-float v1, v1

    :goto_31
    move/from16 v19, v1

    :goto_32
    move-object/from16 v1, p1

    move/from16 v2, v18

    move v3, v13

    move/from16 v4, v18

    move/from16 v43, v5

    move/from16 v5, v19

    move/from16 v19, v6

    move-object v6, v8

    .line 350
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-nez v19, :cond_4d

    add-float v18, v18, v49

    :cond_4d
    add-float v18, v18, v7

    const-wide/16 v1, 0x4

    add-long v16, v16, v1

    add-int/lit8 v6, v19, 0x4

    move/from16 v5, v43

    goto :goto_30

    :cond_4e
    move/from16 v43, v5

    add-float v7, v18, v35

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v3, v35, v1

    .line 357
    iget v1, v11, Ll/ۙ᩷ܳ;->᩺:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-float v14, v7, v3

    move-object/from16 v1, p1

    move v2, v14

    move v3, v13

    move v4, v7

    move/from16 v5, v47

    move-object v6, v8

    .line 358
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 359
    iget v1, v11, Ll/ۙ᩷ܳ;->ܰ:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move v4, v14

    .line 360
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v2, v7

    move v4, v7

    .line 361
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_33

    .line 0
    :cond_4f
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_50
    move/from16 v43, v59

    :goto_33
    move-object/from16 v14, p1

    move-object/from16 v7, v52

    .line 366
    invoke-virtual {v7, v14, v12, v9}, Ll/ۨ᩷ܳ;->ۙ(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const/4 v9, 0x0

    if-eqz v15, :cond_52

    .line 370
    iget-boolean v1, v7, Ll/ۨ᩷ܳ;->᩺ۙ:Z

    if-eqz v1, :cond_52

    cmpl-float v1, p4, v9

    if-lez v1, :cond_51

    .line 371
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_51

    move/from16 v12, v56

    .line 372
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v6, v53

    int-to-float v4, v6

    sub-float v2, v4, v22

    move-object/from16 v1, p1

    move v3, v13

    move/from16 v5, v47

    move-object v6, v8

    .line 373
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_34

    :cond_51
    move/from16 v12, v56

    :goto_34
    move-object v1, v15

    move-object/from16 v2, p1

    move-object v3, v11

    move/from16 v4, v53

    move v5, v10

    move/from16 v6, v23

    move-object/from16 v65, v7

    move/from16 v7, v43

    .line 375
    invoke-virtual/range {v1 .. v7}, Ll/ۗۙܳ;->ۙ(Landroid/graphics/Canvas;Ll/ۙ᩷ܳ;IIII)V

    goto :goto_35

    :cond_52
    move-object/from16 v65, v7

    move/from16 v12, v56

    :goto_35
    cmpl-float v1, p4, v9

    if-lez v1, :cond_59

    move-object/from16 v7, v65

    .line 377
    iget-boolean v1, v7, Ll/ۨ᩷ܳ;->᩺ۙ:Z

    if-eqz v1, :cond_58

    .line 378
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v1, v10

    .line 379
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v2

    int-to-long v4, v1

    add-long v16, v2, v4

    const-wide/16 v18, 0x0

    cmp-long v1, v2, v18

    if-lez v1, :cond_58

    .line 383
    invoke-virtual {v7}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v18

    const-wide/16 v24, 0x2710

    mul-long v18, v18, v24

    .line 385
    div-long v1, v18, v2

    long-to-float v1, v1

    const v2, 0x461c4000    # 10000.0f

    div-float v9, v1, v2

    .line 386
    div-long v1, v16, v4

    const-wide/16 v18, 0x3

    cmp-long v3, v1, v18

    if-lez v3, :cond_56

    and-int v1, v12, v39

    ushr-int/lit8 v2, v12, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    mul-float v2, v2, p4

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v1, v2

    .line 393
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-float v12, v22, p4

    .line 395
    iget v6, v11, Ll/ۙ᩷ܳ;->ۚ:F

    if-nez v15, :cond_53

    move/from16 v5, v53

    int-to-float v4, v5

    sub-float v2, v4, v12

    move-object/from16 v1, p1

    move v3, v13

    move v14, v5

    move/from16 v5, v47

    move/from16 v18, v13

    move v13, v6

    move-object v6, v8

    .line 396
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_36

    :cond_53
    move/from16 v18, v13

    move/from16 v14, v53

    move v13, v6

    :goto_36
    if-eqz p5, :cond_54

    .line 398
    iget v1, v11, Ll/ۙ᩷ܳ;->۫:I

    goto :goto_37

    :cond_54
    iget v1, v11, Ll/ۙ᩷ܳ;->ܳ:I

    :goto_37
    and-int v2, v1, v39

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    mul-float v1, v1, p4

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 402
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v1, v23

    int-to-double v1, v1

    int-to-double v3, v10

    sub-double/2addr v1, v3

    float-to-double v3, v13

    sub-double/2addr v1, v3

    float-to-double v3, v9

    mul-double v1, v1, v3

    double-to-int v1, v1

    add-int v4, v10, v1

    int-to-float v5, v14

    if-nez v15, :cond_55

    const/high16 v1, 0x3fc00000    # 1.5f

    goto :goto_38

    :cond_55
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_38
    mul-float v1, v1, v22

    sub-float v1, v5, v1

    int-to-float v3, v4

    add-float v6, v3, v13

    .line 406
    iget-object v2, v0, Ll/ܳۤܳ;->֫:Ll/᩸᩷ܺ;

    invoke-virtual {v2, v1, v3, v5, v6}, Ll/᩸᩷ܺ;->ۙ(FFFF)V

    sub-float v2, v5, v12

    move-object/from16 v1, p1

    move v4, v5

    move v5, v6

    move-object v6, v8

    .line 407
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v1, 0x1

    goto :goto_3b

    :cond_56
    move/from16 v18, v13

    move/from16 v1, v23

    move/from16 v14, v53

    .line 409
    iget v2, v11, Ll/ۙ᩷ܳ;->ܿ:I

    and-int v3, v2, v39

    ushr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    mul-float v2, v2, p4

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v3

    .line 412
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    mul-long v4, v4, v4

    .line 413
    div-long v4, v4, v16

    long-to-float v2, v4

    sub-int/2addr v1, v10

    int-to-float v1, v1

    sub-float/2addr v1, v2

    mul-float v1, v1, v9

    float-to-int v1, v1

    add-int v4, v10, v1

    int-to-float v5, v14

    if-nez v15, :cond_57

    .line 415
    iget v1, v11, Ll/ۙ᩷ܳ;->֡:F

    goto :goto_39

    :cond_57
    move/from16 v1, v22

    :goto_39
    sub-float v3, v5, v1

    int-to-float v4, v4

    add-float v6, v4, v2

    move-object/from16 v1, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v8

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_3a

    :cond_58
    move/from16 v18, v13

    move/from16 v14, v53

    goto :goto_3a

    :cond_59
    move/from16 v18, v13

    move/from16 v14, v53

    move-object/from16 v7, v65

    :goto_3a
    const/4 v1, 0x0

    .line 419
    :goto_3b
    iput-boolean v1, v0, Ll/ܳۤܳ;->ۧ:Z

    .line 422
    iget-boolean v1, v7, Ll/ۨ᩷ܳ;->ᩳ:Z

    if-eqz v1, :cond_5b

    .line 423
    iget v1, v11, Ll/ۙ᩷ܳ;->᩺:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v9, v14

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    move v2, v12

    move v4, v9

    move/from16 v5, v18

    move-object v6, v8

    .line 424
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 425
    iget v1, v11, Ll/ۙ᩷ܳ;->۬:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v4, v10, -0x1

    int-to-float v3, v4

    add-int/lit8 v4, v10, 0x1

    int-to-float v5, v4

    move-object/from16 v1, p1

    move v4, v9

    .line 426
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 428
    iget v1, v11, Ll/ۙ᩷ܳ;->ۜ:F

    div-float v9, v1, v48

    .line 429
    iget v1, v11, Ll/ۙ᩷ܳ;->۠:I

    sub-int/2addr v10, v1

    .line 430
    div-int/lit8 v12, v1, 0x4

    const/4 v1, 0x0

    move/from16 v14, v40

    move/from16 v6, v43

    const/4 v13, 0x0

    :goto_3c
    if-ge v13, v6, :cond_5b

    .line 435
    invoke-virtual {v0, v13}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v1

    add-float v1, v1, v35

    sub-float v16, v1, v9

    add-float v4, v1, v9

    int-to-float v5, v10

    move-object/from16 v1, p1

    move/from16 v2, v16

    move v3, v5

    move/from16 v17, v5

    move/from16 v5, v18

    move/from16 v19, v6

    move-object v6, v8

    .line 438
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 439
    sget-object v20, Ll/ܳۤܳ;->᩶:[Ljava/lang/String;

    aget-object v1, v20, v13

    sub-float v2, v16, v49

    sub-int v3, v10, v34

    add-int v3, v3, v38

    add-int/2addr v3, v12

    int-to-float v6, v3

    move-object/from16 v5, p1

    invoke-virtual {v5, v1, v2, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 441
    invoke-virtual {v7}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-nez v1, :cond_5a

    move-object v0, v5

    move-object/from16 v52, v7

    goto :goto_3d

    :cond_5a
    add-float v1, v14, v49

    sub-float v2, v1, v9

    add-float v4, v1, v9

    move-object/from16 v1, p1

    move/from16 v3, v17

    move-object v0, v5

    move/from16 v5, v18

    move-object/from16 v52, v7

    move v7, v6

    move-object v6, v8

    .line 445
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 446
    aget-object v1, v20, v13

    invoke-virtual {v0, v1, v14, v7, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-float v14, v14, v35

    :goto_3d
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move/from16 v6, v19

    move-object/from16 v7, v52

    goto :goto_3c

    :cond_5b
    move-object/from16 v0, p1

    if-eqz v15, :cond_5c

    .line 451
    iget-boolean v1, v15, Ll/ۗۙܳ;->ᩴ:Z

    if-nez v1, :cond_5c

    iget-boolean v1, v15, Ll/ۗۙܳ;->ܽ:Z

    if-nez v1, :cond_5c

    .line 452
    iget v1, v11, Ll/ۙ᩷ܳ;->ܰ:I

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v2, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v1, p1

    move/from16 v3, v18

    move/from16 v5, v47

    move-object v6, v8

    .line 453
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_5c
    return-void

    .line 0
    :cond_5d
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_5e
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_5f
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_60
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public final ۙ(Ll/ܶ᩸ܳ;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1222
    iget-object v2, v0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v3, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v4, v2, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v3

    .line 466
    invoke-virtual {v0, v3}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v5

    .line 1226
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->۫()I

    move-result v3

    .line 467
    invoke-virtual {v0, v3}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v7

    .line 468
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v3

    int-to-long v9, v3

    .line 469
    div-long v11, v5, v9

    div-long v13, v7, v9

    cmp-long v3, v11, v13

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    return v1

    .line 470
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v3

    int-to-long v13, v3

    iget v3, v4, Ll/ۙ᩷ܳ;->᩻:I

    move-object v15, v4

    int-to-long v3, v3

    mul-long v11, v11, v3

    add-long/2addr v11, v13

    .line 471
    rem-long v3, v5, v9

    long-to-int v4, v3

    invoke-virtual {v0, v4}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v3

    cmp-long v4, v5, v7

    if-nez v4, :cond_2

    .line 1230
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 474
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v2, v15

    iget v4, v2, Ll/ۙ᩷ܳ;->᩷:F

    add-float/2addr v3, v4

    goto :goto_0

    :cond_1
    move-object v2, v15

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_2
    move-object v2, v15

    .line 476
    rem-long/2addr v7, v9

    long-to-int v4, v7

    invoke-virtual {v0, v4}, Ll/ܳۤܳ;->ۙ(I)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    iget v6, v2, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v6, v6, v5

    add-float/2addr v4, v6

    :goto_1
    float-to-int v3, v3

    float-to-int v4, v4

    .line 477
    iget v2, v2, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v5, v2

    add-long/2addr v5, v11

    .line 10
    iput v3, v1, Ll/ܶ᩸ܳ;->᩷:I

    .line 11
    iput-wide v11, v1, Ll/ܶ᩸ܳ;->᩸:J

    .line 12
    iput v4, v1, Ll/ܶ᩸ܳ;->ۤ:I

    .line 13
    iput-wide v5, v1, Ll/ܶ᩸ܳ;->ۙ:J

    const/4 v1, 0x1

    return v1
.end method

.method public final ۚ()Landroid/graphics/RectF;
    .locals 1

    .line 528
    iget-object v0, p0, Ll/ܳۤܳ;->ۛ:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ۛ()Z
    .locals 1

    .line 569
    iget-boolean v0, p0, Ll/ܳۤܳ;->ۗ:Z

    return v0
.end method

.method public final ۤ()F
    .locals 4

    .line 505
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩷:F

    const/high16 v1, 0x40400000    # 3.0f

    mul-float v0, v0, v1

    return v0

    .line 506
    :cond_0
    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v1, :cond_1

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->֫:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float v1, v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 507
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    sub-float/2addr v2, v1

    invoke-virtual {p0}, Ll/ܳۤܳ;->ܳ()F

    move-result v1

    sub-float/2addr v2, v1

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v2, v0

    return v2
.end method

.method public final ۤ(I)J
    .locals 5

    .line 540
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    int-to-long v1, p1

    .line 541
    iget p1, v0, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v3, p1

    mul-long v1, v1, v3

    return-wide v1
.end method

.method public final ۧ()I
    .locals 2

    .line 554
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-boolean v1, v0, Ll/ۨ᩷ܳ;->ᩳ:Z

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 555
    :cond_0
    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 556
    iget v1, v0, Ll/ۙ᩷ܳ;->᩻:I

    iget v0, v0, Ll/ۙ᩷ܳ;->۠:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    return v1
.end method

.method public final ۨ()Z
    .locals 1

    .line 736
    iget-boolean v0, p0, Ll/ܳۤܳ;->᩵:Z

    return v0
.end method

.method public final ۫()Landroid/graphics/RectF;
    .locals 1

    .line 524
    iget-object v0, p0, Ll/ܳۤܳ;->ۨ:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ܳ()F
    .locals 3

    .line 501
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    .line 88
    iget-object v2, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-nez v2, :cond_0

    iget-object v2, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ܳ()I

    move-result v2

    goto :goto_0

    :cond_0
    iget v2, v2, Ll/ۗۙܳ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    .line 501
    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩷:F

    mul-float v2, v2, v0

    add-float/2addr v2, v1

    return v2
.end method

.method public final ܳ(I)I
    .locals 7

    .line 698
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-wide v1, p0, Ll/ܳۤܳ;->ܺ:J

    .line 31
    iget-object v3, v0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-boolean v4, v0, Ll/ۗۙܳ;->ᩴ:Z

    invoke-virtual {v3, p1, v4}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v5

    const/4 p1, 0x0

    cmp-long v3, v1, v5

    if-ltz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 50
    :goto_0
    iget-object v5, v0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    invoke-virtual {v0, v1, v2}, Ll/ۗۙܳ;->ۙ(J)I

    move-result v0

    if-ltz v0, :cond_1

    return v0

    :cond_1
    if-eqz v4, :cond_2

    .line 52
    iget v0, v5, Ll/۬ۙܳ;->ۤ:I

    goto :goto_1

    :cond_2
    iget v0, v5, Ll/۬ۙܳ;->ᩴ:I

    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {v5, v1, v2}, Ll/۬ۙܳ;->ۙ(J)I

    move-result v6

    if-gez v6, :cond_5

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_4

    :goto_2
    return p1

    :cond_4
    add-int/lit8 v0, v0, -0x1

    return v0

    .line 56
    :cond_5
    iget-object v1, v5, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    invoke-virtual {v1, v6}, Ll/۠ۙܳ;->get(I)Ll/ۡۙܳ;

    move-result-object v1

    if-eqz v4, :cond_6

    .line 57
    iget v2, v1, Ll/ۡۙܳ;->ۤ:I

    iget v1, v1, Ll/ۡۙܳ;->᩸:I

    goto :goto_3

    :cond_6
    iget v2, v1, Ll/ۡۙܳ;->ᩴ:I

    iget v1, v1, Ll/ۡۙܳ;->ܳ:I

    :goto_3
    add-int/2addr v2, v1

    add-int/lit8 v0, v0, -0x1

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v2, v2, -0x1

    .line 58
    :goto_4
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ܶ()Z
    .locals 1

    .line 520
    iget-boolean v0, p0, Ll/ܳۤܳ;->ᩴ:Z

    return v0
.end method

.method public final ܺ()J
    .locals 2

    .line 686
    iget-wide v0, p0, Ll/ܳۤܳ;->ܺ:J

    return-wide v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 516
    iget-boolean v0, p0, Ll/ܳۤܳ;->᩸:Z

    return v0
.end method

.method public final ᩴ()J
    .locals 2

    .line 550
    invoke-direct {p0}, Ll/ܳۤܳ;->ܰ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܳۤܳ;->᩷(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩴ(I)J
    .locals 3

    .line 482
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v1, :cond_0

    .line 483
    iget-boolean v2, v1, Ll/ۗۙܳ;->ܶ:Z

    if-eqz v2, :cond_0

    .line 1222
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 483
    iget-wide v0, v1, Ll/ۗۙܳ;->ۤ:J

    return-wide v0

    :cond_0
    if-nez v1, :cond_1

    int-to-long v0, p1

    return-wide v0

    .line 31
    :cond_1
    iget-object v0, v1, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-boolean v1, v1, Ll/ۗۙܳ;->ᩴ:Z

    invoke-virtual {v0, p1, v1}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 662
    iget-boolean v0, p0, Ll/ܳۤܳ;->᩹:Z

    return v0
.end method

.method public final ᩷()F
    .locals 2

    .line 604
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v1, p0, Ll/ܳۤܳ;->ۘ:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public final ᩷(I)J
    .locals 8

    .line 545
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    .line 546
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v2

    int-to-long v2, v2

    int-to-long v4, p1

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iget p1, v1, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v6, p1

    mul-long v4, v4, v6

    add-long/2addr v4, v2

    iget p1, p0, Ll/ܳۤܳ;->ۘ:I

    int-to-long v1, p1

    add-long/2addr v4, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-long v0, p1

    sub-long/2addr v4, v0

    const-wide/16 v0, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩸(I)I
    .locals 5

    .line 488
    invoke-virtual {p0, p1}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v0

    iget-object p1, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۤ()I

    move-result p1

    int-to-long v2, p1

    div-long/2addr v0, v2

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ᩸()Ll/᩸᩷ܺ;
    .locals 1

    .line 536
    iget-object v0, p0, Ll/ܳۤܳ;->֫:Ll/᩸᩷ܺ;

    return-object v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 573
    iget-boolean v0, p0, Ll/ܳۤܳ;->ۧ:Z

    return v0
.end method

.method public final ᩺()Z
    .locals 7

    .line 690
    iget-object v0, p0, Ll/ܳۤܳ;->ۚ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    .line 691
    iget-boolean v2, p0, Ll/ܳۤܳ;->᩻:Z

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Ll/ܳۤܳ;->᩹:Z

    if-nez v2, :cond_3

    if-eqz v1, :cond_3

    .line 1230
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 692
    :cond_0
    iget-boolean v2, v1, Ll/ۗۙܳ;->ۚ:Z

    if-eqz v2, :cond_1

    iget-wide v2, v1, Ll/ۗۙܳ;->ܺ:J

    goto :goto_0

    .line 1222
    :cond_1
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v2

    .line 692
    invoke-virtual {p0, v2}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v2

    .line 693
    :goto_0
    iget-boolean v4, v1, Ll/ۗۙܳ;->ۚ:Z

    if-eqz v4, :cond_2

    iget-wide v0, v1, Ll/ۗۙܳ;->֫:J

    goto :goto_1

    .line 1226
    :cond_2
    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->۫()I

    move-result v0

    .line 693
    invoke-virtual {p0, v0}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v0

    .line 694
    :goto_1
    iget-wide v4, p0, Ll/ܳۤܳ;->ܺ:J

    cmp-long v6, v4, v2

    if-ltz v6, :cond_3

    cmp-long v2, v4, v0

    if-gtz v2, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()F
    .locals 2

    .line 600
    invoke-virtual {p0}, Ll/ܳۤܳ;->ۧ()I

    move-result v0

    iget v1, p0, Ll/ܳۤܳ;->ۘ:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method
