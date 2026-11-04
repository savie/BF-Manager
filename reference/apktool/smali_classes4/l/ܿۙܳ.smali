.class public final Ll/ܿۙܳ;
.super Landroid/view/ViewGroup;
.source "2IQX"


# instance fields
.field public ֡:J

.field public ֨:Z

.field public ֫ۙ:Z

.field public ۖ:I

.field public ۙۙ:I

.field public ۚۙ:Z

.field public ۜ:J

.field public ۟:Ll/ۙۤܳ;

.field public ۠:J

.field public ۡ:Ll/᩸ۙܳ;

.field public final ۢ:Ll/ۨ᩷ܳ;

.field public ۤۙ:Z

.field public ۫ۙ:Ll/᩹ۙܳ;

.field public ۬:I

.field public ܰ:I

.field public ܳۙ:Ll/᩹ۙܳ;

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴۙ:I

.field public ᩶:Ll/۬ۙܳ;

.field public ᩷ۙ:Ll/ۘۙܳ;

.field public final ᩸ۙ:Ll/ۨ᩷ܳ;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;)V
    .locals 4

    .line 43
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Ll/ܿۙܳ;->֨:Z

    const/4 v1, 0x4

    .line 32
    iput v1, p0, Ll/ܿۙܳ;->ܰ:I

    const/4 v1, -0x1

    iput v1, p0, Ll/ܿۙܳ;->ᩴۙ:I

    iput v1, p0, Ll/ܿۙܳ;->۬:I

    .line 33
    iput v1, p0, Ll/ܿۙܳ;->ۙۙ:I

    const-wide/16 v2, -0x1

    .line 34
    iput-wide v2, p0, Ll/ܿۙܳ;->۠:J

    .line 35
    iput-wide v2, p0, Ll/ܿۙܳ;->ۜ:J

    .line 36
    iput v1, p0, Ll/ܿۙܳ;->ۖ:I

    .line 38
    iput-wide v2, p0, Ll/ܿۙܳ;->֡:J

    .line 39
    iput-boolean v0, p0, Ll/ܿۙܳ;->ܿ:Z

    .line 44
    new-instance v1, Ll/ۨ᩷ܳ;

    const/4 v2, 0x0

    .line 259
    invoke-direct {v1, p1, v2}, Ll/ۨ᩷ܳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    iput-object v1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    .line 45
    new-instance v3, Ll/ۨ᩷ܳ;

    .line 259
    invoke-direct {v3, p1, v2}, Ll/ۨ᩷ܳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    iput-object v3, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    .line 46
    invoke-direct {p0, v1, v0}, Ll/ܿۙܳ;->ۙ(Ll/ۨ᩷ܳ;Z)V

    const/4 p1, 0x0

    .line 47
    invoke-direct {p0, v3, p1}, Ll/ܿۙܳ;->ۙ(Ll/ۨ᩷ܳ;Z)V

    .line 48
    iput-boolean p1, v1, Ll/ۨ᩷ܳ;->᩺ۙ:Z

    .line 49
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۙܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܿۙܳ;->ܿ:Z

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿۙܳ;)Ll/۬ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    return-object p0
.end method

.method private ۙ(Landroid/graphics/Canvas;)V
    .locals 13

    .line 453
    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->computeScroll()V

    const/4 v1, 0x1

    .line 454
    iput-boolean v1, v0, Ll/ۨ᩷ܳ;->ۖ:Z

    const/4 v1, 0x0

    .line 456
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    iput-boolean v1, v0, Ll/ۨ᩷ܳ;->ۖ:Z

    .line 460
    iget-boolean v1, p0, Ll/ܿۙܳ;->֫ۙ:Z

    iget-object v2, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-eqz v1, :cond_0

    .line 461
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v1

    iget-object v3, v2, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    .line 463
    iget-object v5, v3, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    sget v6, Ll/ۗۡ֫;->ۧ:I

    const v7, 0xffffff

    and-int/2addr v6, v7

    const/high16 v7, -0x60000000

    or-int/2addr v6, v7

    sget v7, Ll/ۗۡ֫;->ܽ:I

    .line 35
    invoke-static {v6, v7}, Ll/ᩴᩳ;->᩷(II)I

    move-result v6

    .line 463
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v9, v1

    .line 465
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v10, v5

    int-to-float v11, v4

    iget-object v12, v3, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    const/4 v8, 0x0

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    sub-int v5, v4, v1

    const/4 v6, 0x4

    if-le v5, v6, :cond_0

    .line 467
    iget-object v5, v3, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    sget v6, Ll/ۗۡ֫;->ۧ:I

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v1, v1, 0x2

    int-to-float v7, v1

    .line 468
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v8, v1

    add-int/lit8 v4, v4, -0x2

    int-to-float v9, v4

    iget-object v10, v3, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    const/4 v6, 0x0

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 472
    :cond_0
    invoke-virtual {v2}, Ll/ۨ᩷ܳ;->᩺()V

    .line 473
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩺()V

    .line 474
    iget p1, p0, Ll/ܿۙܳ;->ۙۙ:I

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    iput p1, p0, Ll/ܿۙܳ;->ۙۙ:I

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 458
    iput-boolean v1, v0, Ll/ۨ᩷ܳ;->ۖ:Z

    .line 459
    throw p1
.end method

.method public static ۙ(Ll/ۨ᩷ܳ;)V
    .locals 3

    .line 232
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ܳ()V

    .line 480
    iget-object v0, p0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 234
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->ᩴ()V

    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->᩸()Z

    .line 235
    new-instance v1, Ll/᩵ۙܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/᩵ۙܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Ll/ۨ᩷ܳ;->ۙ(Ljava/lang/Runnable;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 239
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܳܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private ۙ(Ll/ۨ᩷ܳ;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 55
    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۙ(Z)V

    .line 57
    iget v0, p0, Ll/ܿۙܳ;->ܰ:I

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->᩸(I)V

    .line 58
    new-instance v0, Ll/ۨۙܳ;

    invoke-direct {v0, p0, p2}, Ll/ۨۙܳ;-><init>(Ll/ܿۙܳ;Z)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 64
    new-instance v0, Ll/ۛۙܳ;

    invoke-direct {v0, p0, p2}, Ll/ۛۙܳ;-><init>(Ll/ܿۙܳ;Z)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 75
    new-instance v0, Ll/᩺ۙܳ;

    invoke-direct {v0, p0}, Ll/᩺ۙܳ;-><init>(Ll/ܿۙܳ;)V

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۙ(Ll/᩺ۙܳ;)V

    .line 83
    new-instance v0, Ll/ܰۙܳ;

    invoke-direct {v0, p0, p2}, Ll/ܰۙܳ;-><init>(Ll/ܿۙܳ;Z)V

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۙ(Ll/ܶ᩷ܳ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۙܳ;J)V
    .locals 3

    const/4 v0, 0x0

    .line 268
    iput-object v0, p0, Ll/ܿۙܳ;->᩷ۙ:Ll/ۘۙܳ;

    .line 269
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩵()V

    iget-object v1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    .line 270
    iget v1, p0, Ll/ܿۙܳ;->ܰ:I

    int-to-long v1, v1

    div-long/2addr p1, v1

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v1, v1

    mul-long p1, p1, v1

    invoke-virtual {v0, p1, p2}, Ll/ۨ᩷ܳ;->ۙ(J)V

    .line 271
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۙܳ;Ll/ۨ᩷ܳ;J)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    .line 77
    :cond_0
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩵()V

    .line 78
    invoke-virtual {v0, p2, p3}, Ll/ۨ᩷ܳ;->᩸(J)V

    .line 79
    iget-object p1, p0, Ll/ܿۙܳ;->ۡ:Ll/᩸ۙܳ;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/ܿۙܳ;->ܺ()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll/᩸ۙܳ;->᩷(J)V

    .line 81
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۙܳ;ZLandroid/view/MotionEvent;)V
    .locals 2

    .line 66
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 67
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, -0x1

    .line 68
    iput p2, p0, Ll/ܿۙܳ;->۬:I

    .line 69
    iput p2, p0, Ll/ܿۙܳ;->ۙۙ:I

    if-eqz p1, :cond_1

    .line 71
    iget-object p0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    goto :goto_0

    :cond_1
    iget-object p0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    :goto_0
    invoke-virtual {p0}, Ll/ۨ᩷ܳ;->᩵()V

    :cond_2
    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۙܳ;ZZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 59
    iget-boolean p2, p0, Ll/ܿۙܳ;->֨:Z

    if-eq p2, p1, :cond_0

    .line 60
    iput-boolean p1, p0, Ll/ܿۙܳ;->֨:Z

    .line 61
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ܿۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿۙܳ;->ۚۙ:Z

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/ܿۙܳ;)Ll/ۨ᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿۙܳ;)V
    .locals 1

    const/4 v0, -0x1

    .line 0
    iput v0, p0, Ll/ܿۙܳ;->۬:I

    return-void
.end method

.method public static bridge synthetic ۫(Ll/ܿۙܳ;)Ll/ۨ᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܿۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿۙܳ;->ۤۙ:Z

    return p0
.end method

.method private ܶ()V
    .locals 2

    .line 342
    invoke-virtual {p0}, Ll/ܿۙܳ;->֫()V

    .line 343
    invoke-direct {p0}, Ll/ܿۙܳ;->᩹()V

    .line 344
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 345
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 346
    iget-object v0, p0, Ll/ܿۙܳ;->ۡ:Ll/᩸ۙܳ;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ll/ܿۙܳ;->ᩳ:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩸ۙܳ;->᩷ۙ()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܶ(Ll/ܿۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܿۙܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܿۙܳ;->ۤۙ:Z

    return-void
.end method

.method private ܽ()V
    .locals 9

    .line 313
    iget v0, p0, Ll/ܿۙܳ;->۬:I

    if-gez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, -0x1

    .line 315
    iput v1, p0, Ll/ܿۙܳ;->۬:I

    .line 316
    iget-object v1, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-object v2, v1, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    iget-object v1, v1, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    .line 85
    iget-object v1, v1, Ll/ۢۙܳ;->᩶:Ll/۬ۙܳ;

    iget-object v1, v1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v3, 0x0

    .line 197
    invoke-virtual {v1, v0, v3}, Ll/ۙ۬ᩴ;->ۙ(IZ)I

    move-result v1

    .line 316
    invoke-virtual {v2, v1}, Ll/۠ۙܳ;->get(I)Ll/ۡۙܳ;

    move-result-object v1

    iget-wide v1, v1, Ll/ۡۙܳ;->۫:J

    .line 317
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v4

    .line 318
    invoke-virtual {v4}, Ll/ۨ᩷ܳ;->᩵()V

    .line 319
    iput-wide v1, p0, Ll/ܿۙܳ;->֡:J

    const/4 v5, 0x1

    .line 320
    iput-boolean v5, p0, Ll/ܿۙܳ;->ܿ:Z

    .line 321
    invoke-direct {p0}, Ll/ܿۙܳ;->᩹()V

    .line 322
    iput v0, p0, Ll/ܿۙܳ;->ᩴۙ:I

    .line 323
    iget v0, p0, Ll/ܿۙܳ;->ܰ:I

    int-to-long v5, v0

    div-long/2addr v1, v5

    .line 324
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v5, v4, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v5}, Ll/ܳۤܳ;->ۧ()I

    move-result v5

    sub-int/2addr v0, v5

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v5, v0

    .line 326
    iget-object v0, v4, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v7, v0

    mul-long v1, v1, v7

    sub-long/2addr v7, v5

    const-wide/16 v5, 0x2

    div-long/2addr v7, v5

    add-long/2addr v7, v1

    invoke-virtual {v4, v7, v8}, Ll/ۨ᩷ܳ;->ۤ(J)V

    .line 327
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܿۙܳ;)V
    .locals 1

    const/4 v0, -0x1

    .line 0
    iput v0, p0, Ll/ܿۙܳ;->ᩴۙ:I

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ܿۙܳ;)Ll/᩶ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۙܳ;->ۡ:Ll/᩸ۙܳ;

    return-object p0
.end method

.method private ᩷(Ll/ۨ᩷ܳ;Z)V
    .locals 11

    .line 372
    iget-object v0, p1, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    if-nez v0, :cond_0

    return-void

    .line 374
    :cond_0
    iget-object v2, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v3, p0, Ll/ܿۙܳ;->֡:J

    invoke-virtual {v2, v3, v4, p2}, Ll/۬ۙܳ;->ۙ(JZ)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_1

    .line 375
    iget-wide v5, p0, Ll/ܿۙܳ;->֡:J

    iget-object v7, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v7, v7, Ll/۬ۙܳ;->᩸:J

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-gez v2, :cond_3

    .line 376
    iget-object v2, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-object v2, v2, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-wide v6, p0, Ll/ܿۙܳ;->֡:J

    invoke-virtual {v2, v6, v7, p2}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v2

    .line 377
    :cond_3
    :goto_1
    iput-boolean v3, p0, Ll/ܿۙܳ;->ۚۙ:Z

    .line 1230
    :try_start_0
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v6

    if-nez v6, :cond_4

    .line 1222
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v6

    if-ne v6, v2, :cond_4

    .line 380
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v6

    iget-boolean v7, p0, Ll/ܿۙܳ;->ܿ:Z

    if-ne v6, v7, :cond_4

    iget-wide v6, v0, Ll/ۗۙܳ;->ۤ:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-ltz v10, :cond_5

    iget-wide v8, p0, Ll/ܿۙܳ;->֡:J

    cmp-long v10, v6, v8

    if-eqz v10, :cond_5

    .line 382
    :cond_4
    iget-boolean v6, p0, Ll/ܿۙܳ;->ܿ:Z

    invoke-virtual {v1, v2, v6}, Ll/ۚ᩷ܳ;->ۙ(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    :cond_5
    iput-boolean v4, p0, Ll/ܿۙܳ;->ۚۙ:Z

    .line 384
    iput-boolean v5, v0, Ll/ۗۙܳ;->ܶ:Z

    .line 385
    iget-boolean v1, p0, Ll/ܿۙܳ;->֨:Z

    if-eq p2, v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, v0, Ll/ۗۙܳ;->ۚ:Z

    .line 386
    iget-wide v1, p0, Ll/ܿۙܳ;->֡:J

    iput-wide v1, v0, Ll/ۗۙܳ;->ۤ:J

    iput-wide v1, v0, Ll/ۗۙܳ;->֫:J

    iput-wide v1, v0, Ll/ۗۙܳ;->ܺ:J

    .line 387
    iput-boolean v4, v0, Ll/ۗۙܳ;->᩻:Z

    .line 388
    iget-boolean p2, p0, Ll/ܿۙܳ;->ܿ:Z

    iput-boolean p2, v0, Ll/ۗۙܳ;->ۧ:Z

    .line 389
    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->᩹()V

    return-void

    :catchall_0
    move-exception p1

    .line 383
    iput-boolean v4, p0, Ll/ܿۙܳ;->ۚۙ:Z

    throw p1
.end method

.method public static bridge synthetic ᩷(Ll/ܿۙܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ܿۙܳ;->֡:J

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܿۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿۙܳ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/ܿۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿۙܳ;->֨:Z

    return p0
.end method

.method private ᩹()V
    .locals 17

    move-object/from16 v1, p0

    .line 351
    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v2, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v3, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v2

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    .line 352
    iget-object v7, v1, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v8, v1, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    const/4 v9, 0x0

    if-eqz v2, :cond_f

    iget-wide v10, v1, Ll/ܿۙܳ;->֡:J

    cmp-long v2, v10, v5

    if-gez v2, :cond_f

    const-wide/16 v5, -0x1

    .line 353
    iput-wide v5, v1, Ll/ܿۙܳ;->֡:J

    .line 354
    iget-object v2, v8, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v2, :cond_0

    iput-boolean v9, v2, Ll/ۗۙܳ;->ܶ:Z

    .line 355
    :cond_0
    iget-object v2, v7, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v2, :cond_1

    iput-boolean v9, v2, Ll/ۗۙܳ;->ܶ:Z

    .line 356
    :cond_1
    iget-boolean v2, v1, Ll/ܿۙܳ;->֨:Z

    if-eqz v2, :cond_2

    move-object v2, v7

    goto :goto_0

    :cond_2
    move-object v2, v8

    .line 409
    :goto_0
    iget-object v10, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    if-eqz v10, :cond_d

    iget-object v11, v2, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    if-nez v11, :cond_3

    goto/16 :goto_3

    .line 410
    :cond_3
    iput-boolean v9, v10, Ll/ۗۙܳ;->ۚ:Z

    .line 1222
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v10

    .line 412
    invoke-virtual {v0, v10}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v12

    .line 1226
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->۫()I

    move-result v10

    .line 413
    invoke-virtual {v0, v10}, Ll/ܳۤܳ;->ᩴ(I)J

    move-result-wide v14

    .line 1230
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    .line 414
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v3

    .line 415
    iput-boolean v4, v11, Ll/ۗۙܳ;->ۚ:Z

    .line 416
    iput-wide v12, v11, Ll/ۗۙܳ;->ܺ:J

    .line 417
    iput-wide v14, v11, Ll/ۗۙܳ;->֫:J

    .line 418
    iput-boolean v0, v11, Ll/ۗۙܳ;->᩻:Z

    .line 419
    iput-boolean v3, v11, Ll/ۗۙܳ;->ۧ:Z

    .line 420
    invoke-virtual {v11, v12, v13}, Ll/ۗۙܳ;->ۙ(J)I

    move-result v10

    invoke-virtual {v11, v14, v15}, Ll/ۗۙܳ;->ۙ(J)I

    move-result v16

    if-gez v10, :cond_4

    .line 421
    invoke-virtual {v11, v12, v13, v4}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v10

    :cond_4
    if-gez v16, :cond_5

    .line 422
    invoke-virtual {v11, v14, v15, v9}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v16

    :cond_5
    move/from16 v14, v16

    if-eqz v0, :cond_6

    if-ltz v10, :cond_6

    if-lt v14, v10, :cond_6

    const/4 v0, 0x1

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_a

    .line 425
    invoke-virtual {v11, v12, v13}, Ll/ۗۙܳ;->ۙ(J)I

    move-result v10

    if-gez v10, :cond_7

    .line 426
    invoke-virtual {v11, v12, v13, v4}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v10

    :cond_7
    if-gez v10, :cond_8

    .line 427
    invoke-virtual {v11, v12, v13, v9}, Ll/ۗۙܳ;->ۙ(JZ)I

    move-result v10

    .line 428
    :cond_8
    iget-object v11, v1, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v14, v11, Ll/۬ۙܳ;->᩸:J

    cmp-long v11, v12, v14

    if-ltz v11, :cond_9

    .line 1234
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v10

    .line 429
    :cond_9
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v14, v10

    .line 1230
    :cond_a
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v11

    if-ne v11, v0, :cond_b

    .line 1222
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v11

    if-ne v11, v10, :cond_b

    .line 1226
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->۫()I

    move-result v11

    if-ne v11, v14, :cond_b

    if-nez v0, :cond_d

    .line 433
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v11

    if-ne v11, v3, :cond_b

    goto :goto_3

    .line 434
    :cond_b
    iput-boolean v4, v1, Ll/ܿۙܳ;->ۚۙ:Z

    if-eqz v0, :cond_c

    .line 436
    :try_start_0
    invoke-virtual {v2, v10, v14}, Ll/ۚ᩷ܳ;->᩷(II)V

    goto :goto_2

    .line 437
    :cond_c
    invoke-virtual {v2, v10, v3}, Ll/ۚ᩷ܳ;->ۙ(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    :goto_2
    iput-boolean v9, v1, Ll/ܿۙܳ;->ۚۙ:Z

    goto :goto_3

    :catchall_0
    move-exception v0

    iput-boolean v9, v1, Ll/ܿۙܳ;->ۚۙ:Z

    throw v0

    .line 357
    :cond_d
    :goto_3
    iget-object v0, v8, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_e

    iput-wide v5, v0, Ll/ۗۙܳ;->ۤ:J

    .line 358
    :cond_e
    iget-object v0, v7, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_10

    iput-wide v5, v0, Ll/ۗۙܳ;->ۤ:J

    return-void

    .line 361
    :cond_f
    iget-object v0, v1, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-nez v0, :cond_11

    :cond_10
    return-void

    .line 362
    :cond_11
    iget-wide v10, v1, Ll/ܿۙܳ;->֡:J

    cmp-long v2, v10, v5

    if-gez v2, :cond_12

    .line 363
    iget-boolean v2, v1, Ll/ܿۙܳ;->֨:Z

    .line 1222
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v5

    .line 363
    invoke-virtual {v0, v5, v2}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v5

    iput-wide v5, v1, Ll/ܿۙܳ;->֡:J

    .line 364
    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v0

    iput-boolean v0, v1, Ll/ܿۙܳ;->ܿ:Z

    .line 366
    :cond_12
    iget-wide v2, v1, Ll/ܿۙܳ;->֡:J

    iget-object v0, v1, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v5, v0, Ll/۬ۙܳ;->᩸:J

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܿۙܳ;->֡:J

    .line 367
    invoke-direct {v1, v8, v4}, Ll/ܿۙܳ;->᩷(Ll/ۨ᩷ܳ;Z)V

    .line 368
    invoke-direct {v1, v7, v9}, Ll/ܿۙܳ;->᩷(Ll/ۨ᩷ܳ;Z)V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܿۙܳ;)V
    .locals 1

    const/4 v0, -0x1

    .line 0
    iput v0, p0, Ll/ܿۙܳ;->ۙۙ:I

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 442
    iget-object v2, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    if-nez v2, :cond_0

    .line 443
    invoke-direct {p0, p1}, Ll/ܿۙܳ;->ۙ(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    move-object v0, v2

    .line 445
    monitor-enter v0

    :try_start_0
    iget-object v1, v2, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, v2, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 446
    :try_start_2
    invoke-virtual {p0}, Ll/ܿۙܳ;->֫()V

    .line 447
    invoke-direct {p0, p1}, Ll/ܿۙܳ;->ۙ(Landroid/graphics/Canvas;)V

    .line 448
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    move-object/from16 v0, p0

    .line 519
    iget-wide v1, v0, Ll/ܿۙܳ;->۠:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->ܺ()J

    move-result-wide v1

    .line 520
    :goto_0
    iget-wide v5, v0, Ll/ܿۙܳ;->ۜ:J

    .line 521
    iget v7, v0, Ll/ܿۙܳ;->ۖ:I

    iget-object v8, v0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-ltz v7, :cond_1

    goto :goto_1

    :cond_1
    iget-object v7, v8, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v7, v7, Ll/ۙ᩷ܳ;->᩻:I

    :goto_1
    const-wide/16 v9, -0x1

    .line 522
    iput-wide v9, v0, Ll/ܿۙܳ;->۠:J

    .line 523
    iput-wide v9, v0, Ll/ܿۙܳ;->ۜ:J

    const/4 v9, -0x1

    .line 524
    iput v9, v0, Ll/ܿۙܳ;->ۖ:I

    .line 525
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    iget v9, v9, Landroid/content/res/Configuration;->orientation:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    const/16 v9, 0x8

    goto :goto_2

    :cond_2
    const/4 v9, 0x4

    .line 526
    :goto_2
    iget-boolean v10, v0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v10, :cond_3

    mul-int/lit8 v9, v9, 0x2

    .line 527
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    .line 528
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    iget-object v12, v0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    .line 529
    iget v14, v0, Ll/ܿۙܳ;->ܰ:I

    const/4 v15, 0x1

    if-ne v14, v9, :cond_4

    iget-object v14, v8, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v14, v14, Ll/ۙ᩷ܳ;->᩻:I

    if-ne v7, v14, :cond_4

    .line 530
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v7

    if-ne v7, v10, :cond_4

    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    if-ne v7, v14, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    :goto_3
    if-eqz v7, :cond_6

    .line 531
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v14

    if-ne v14, v11, :cond_6

    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    move-result v14

    if-eq v14, v13, :cond_5

    goto :goto_4

    :cond_5
    const/4 v14, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v14, 0x1

    :goto_5
    if-eqz v7, :cond_7

    .line 533
    invoke-virtual {v8}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v1

    goto :goto_6

    :cond_7
    int-to-long v3, v9

    div-long/2addr v1, v3

    iget-object v3, v8, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v3, v3, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v3, v3

    mul-long v1, v1, v3

    :goto_6
    if-eqz v7, :cond_9

    const-wide/16 v3, 0x0

    cmp-long v7, v5, v3

    if-ltz v7, :cond_9

    .line 534
    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->᩷()J

    move-result-wide v3

    cmp-long v7, v5, v3

    if-nez v7, :cond_9

    .line 535
    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-boolean v4, v0, Ll/ܿۙܳ;->֨:Z

    if-eqz v4, :cond_8

    move v4, v11

    goto :goto_7

    :cond_8
    move v4, v13

    :goto_7
    if-le v3, v4, :cond_9

    iget v3, v0, Ll/ܿۙܳ;->۬:I

    if-gez v3, :cond_9

    iget v3, v0, Ll/ܿۙܳ;->ۙۙ:I

    if-gez v3, :cond_9

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    :goto_8
    if-eqz v14, :cond_a

    .line 539
    invoke-virtual {v8}, Ll/ۨ᩷ܳ;->᩵()V

    .line 540
    invoke-virtual {v12}, Ll/ۨ᩷ܳ;->᩵()V

    .line 542
    :cond_a
    iput v9, v0, Ll/ܿۙܳ;->ܰ:I

    .line 543
    invoke-virtual {v8, v9}, Ll/ۨ᩷ܳ;->᩸(I)V

    .line 544
    iget v3, v0, Ll/ܿۙܳ;->ܰ:I

    invoke-virtual {v12, v3}, Ll/ۨ᩷ܳ;->᩸(I)V

    const/4 v3, 0x0

    .line 545
    invoke-virtual {v8, v3, v3, v10, v11}, Landroid/view/View;->layout(IIII)V

    .line 546
    iget-boolean v4, v0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v4, :cond_b

    const/4 v10, 0x0

    :cond_b
    if-eqz v4, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v3, v13

    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 547
    iget-boolean v7, v0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v7, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v13

    .line 546
    :cond_d
    invoke-virtual {v12, v10, v3, v4, v13}, Landroid/view/View;->layout(IIII)V

    if-eqz v15, :cond_e

    .line 549
    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    .line 551
    iget-object v4, v3, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v4}, Ll/ܳۤܳ;->ۧ()I

    move-result v4

    int-to-long v9, v4

    iget v4, v0, Ll/ܿۙܳ;->ܰ:I

    move/from16 p1, v14

    int-to-long v13, v4

    div-long/2addr v5, v13

    const-wide/16 v13, 0x1

    add-long/2addr v5, v13

    iget-object v4, v3, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v4, v4, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v13, v4

    mul-long v5, v5, v13

    add-long/2addr v5, v9

    .line 552
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v5, v3

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    goto :goto_9

    :cond_e
    move/from16 p1, v14

    .line 554
    :goto_9
    invoke-virtual {v8, v1, v2}, Ll/ۨ᩷ܳ;->᩷(J)V

    .line 555
    invoke-virtual {v8}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v1

    invoke-virtual {v12, v1, v2}, Ll/ۨ᩷ܳ;->᩷(J)V

    .line 556
    invoke-direct/range {p0 .. p0}, Ll/ܿۙܳ;->ܽ()V

    if-eqz p1, :cond_f

    .line 558
    iget v1, v0, Ll/ܿۙܳ;->ۙۙ:I

    if-ltz v1, :cond_f

    invoke-virtual/range {p0 .. p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v1

    iget v2, v0, Ll/ܿۙܳ;->ۙۙ:I

    invoke-virtual {v1, v2}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    :cond_f
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 479
    iget-wide v0, p0, Ll/ܿۙܳ;->۠:J

    iget-object v2, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-gez v5, :cond_1

    .line 480
    invoke-virtual {p0}, Ll/ܿۙܳ;->ܺ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܿۙܳ;->۠:J

    .line 481
    iget-object v0, v2, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩻:I

    iput v0, p0, Ll/ܿۙܳ;->ۖ:I

    .line 482
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 483
    invoke-virtual {p0}, Ll/ܿۙܳ;->᩷()J

    move-result-wide v5

    .line 484
    iget v1, p0, Ll/ܿۙܳ;->ܰ:I

    int-to-long v7, v1

    div-long v7, v5, v7

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->᩻:I

    int-to-long v9, v1

    mul-long v7, v7, v9

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v9

    sub-long/2addr v7, v9

    .line 486
    iget-object v1, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-eqz v1, :cond_0

    cmp-long v1, v5, v3

    if-ltz v1, :cond_0

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->᩻:I

    if-lez v1, :cond_0

    cmp-long v9, v7, v3

    if-ltz v9, :cond_0

    int-to-long v3, v1

    add-long/2addr v7, v3

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v0, v0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v0}, Ll/ܳۤܳ;->ۧ()I

    move-result v0

    sub-int/2addr v1, v0

    int-to-long v0, v1

    cmp-long v3, v7, v0

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v5, -0x1

    .line 487
    :goto_0
    iput-wide v5, p0, Ll/ܿۙܳ;->ۜ:J

    .line 489
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    .line 490
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    move-result p2

    .line 491
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 492
    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->֫:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 493
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v3, v3, Landroid/content/res/Configuration;->orientation:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    const/16 v3, 0x8

    goto :goto_1

    :cond_2
    const/4 v3, 0x4

    .line 494
    :goto_1
    iget-boolean v5, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v5, :cond_3

    mul-int/lit8 v3, v3, 0x2

    .line 495
    :cond_3
    invoke-virtual {v2, v3}, Ll/ۨ᩷ܳ;->᩸(I)V

    .line 496
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->᩸(I)V

    .line 497
    iget-boolean v3, p0, Ll/ܿۙܳ;->֫ۙ:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    move v3, p1

    goto :goto_2

    :cond_4
    sub-int v3, p1, v1

    div-int/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 498
    :goto_2
    iget-boolean v6, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v6, :cond_5

    move v6, v1

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v2, v5, v5, v6, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 499
    iget-boolean v6, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    mul-int/lit8 v1, v3, 0x2

    sub-int v1, p1, v1

    :goto_4
    invoke-virtual {v0, v5, v5, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 500
    iget-boolean v1, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v1, :cond_7

    iget-object v1, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v1, v1, Ll/ۙ᩷ܳ;->ᩴ:F

    const/high16 v5, 0x40200000    # 2.5f

    mul-float v1, v1, v5

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 501
    :cond_7
    iget-boolean v1, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v1, :cond_8

    sub-int v1, p2, v5

    div-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move v1, p2

    :goto_5
    const/high16 v6, 0x40000000    # 2.0f

    .line 502
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/view/View;->measure(II)V

    .line 503
    iget-boolean v7, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v7, :cond_9

    move v3, p1

    goto :goto_6

    :cond_9
    sub-int v3, p1, v3

    :goto_6
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 504
    iget-boolean v7, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v7, :cond_a

    sub-int v7, p2, v5

    sub-int/2addr v7, v1

    goto :goto_7

    :cond_a
    move v7, p2

    :goto_7
    invoke-static {v7, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 503
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->measure(II)V

    .line 505
    iget-boolean v1, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-eqz v1, :cond_b

    sub-int/2addr p2, v5

    .line 507
    iget-object v1, v2, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v1}, Ll/ܳۤܳ;->ۧ()I

    move-result v1

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 508
    iget-object v3, v0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {v3}, Ll/ܳۤܳ;->ۧ()I

    move-result v3

    sub-int/2addr p2, v1

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr p2, v3

    .line 509
    div-int/2addr p2, v4

    .line 511
    invoke-static {p1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    add-int/2addr v1, p2

    .line 512
    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 511
    invoke-virtual {v2, v4, v1}, Landroid/view/View;->measure(II)V

    .line 513
    invoke-static {p1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    add-int/2addr p2, v3

    .line 514
    invoke-static {p2, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 513
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    :cond_b
    return-void
.end method

.method public final ֫()V
    .locals 10

    .line 198
    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    iget-object v2, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    if-eqz v2, :cond_4

    iget-boolean v3, p0, Ll/ܿۙܳ;->ᩳ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_2

    .line 199
    :cond_0
    invoke-virtual {v2}, Ll/ۙۤܳ;->᩷()Ll/۬ۙܳ;

    move-result-object v2

    .line 200
    iget-object v3, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-ne v3, v2, :cond_1

    goto :goto_2

    .line 201
    :cond_1
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    iget-wide v6, p0, Ll/ܿۙܳ;->֡:J

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-ltz v3, :cond_2

    .line 202
    iget-object v3, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-boolean v8, p0, Ll/ܿۙܳ;->֨:Z

    xor-int/2addr v8, v5

    invoke-virtual {v3, v6, v7, v8}, Ll/۬ۙܳ;->ۙ(JZ)I

    move-result v3

    goto :goto_0

    :cond_2
    const/4 v3, -0x1

    .line 203
    :goto_0
    iput-boolean v5, p0, Ll/ܿۙܳ;->ᩳ:Z

    const/4 v6, 0x0

    .line 205
    :try_start_0
    iput-object v2, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-ltz v3, :cond_3

    .line 206
    iget-boolean v7, p0, Ll/ܿۙܳ;->֨:Z

    xor-int/2addr v7, v5

    invoke-virtual {v2, v3, v7}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v7

    goto :goto_1

    :cond_3
    const-wide/16 v7, -0x1

    :goto_1
    iput-wide v7, p0, Ll/ܿۙܳ;->֡:J

    .line 207
    new-instance v3, Ll/ۗۙܳ;

    invoke-direct {v3, v2, v5}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v1, v3}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 208
    new-instance v3, Ll/ۗۙܳ;

    invoke-direct {v3, v2, v6}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 209
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-boolean v3, p0, Ll/ܿۙܳ;->֫ۙ:Z

    iput-boolean v3, v0, Ll/ۗۙܳ;->ܽ:Z

    iput-boolean v3, v1, Ll/ۗۙܳ;->ܽ:Z

    .line 210
    iput-boolean v5, v0, Ll/ۗۙܳ;->᩸:Z

    iput-boolean v5, v1, Ll/ۗۙܳ;->᩸:Z

    .line 211
    invoke-direct {p0}, Ll/ܿۙܳ;->᩹()V

    .line 212
    iput v4, p0, Ll/ܿۙܳ;->۬:I

    iput v4, p0, Ll/ܿۙܳ;->ᩴۙ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    iput-boolean v6, p0, Ll/ܿۙܳ;->ᩳ:Z

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 215
    iget-object v0, p0, Ll/ܿۙܳ;->ۡ:Ll/᩸ۙܳ;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v2}, Ll/᩸ۙܳ;->ۙ(Ll/۬ۙܳ;)V

    return-void

    :catchall_0
    move-exception v0

    .line 213
    iput-boolean v6, p0, Ll/ܿۙܳ;->ᩳ:Z

    throw v0

    :cond_4
    :goto_2
    return-void
.end method

.method public final ۙ(I)V
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-eqz v0, :cond_3

    if-ltz p1, :cond_3

    iget-object v0, v0, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v0, v0, Ll/ۢۙܳ;->ܰ:I

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, -0x1

    .line 302
    iput v0, p0, Ll/ܿۙܳ;->ۙۙ:I

    .line 303
    iput p1, p0, Ll/ܿۙܳ;->۬:I

    .line 304
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 308
    :cond_1
    invoke-direct {p0}, Ll/ܿۙܳ;->ܽ()V

    return-void

    .line 305
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۙ(JZ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 401
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-eqz v0, :cond_1

    iget-wide v0, v0, Ll/۬ۙܳ;->᩸:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 402
    :cond_0
    iput-wide p1, p0, Ll/ܿۙܳ;->֡:J

    .line 403
    iput-boolean p3, p0, Ll/ܿۙܳ;->ܿ:Z

    .line 404
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(Ll/ᩳܳܳ;Ll/ᩳܳܳ;Ll/۬ۙܳ;)V
    .locals 5

    .line 170
    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    const/4 v2, 0x1

    iput-boolean v2, p0, Ll/ܿۙܳ;->ᩳ:Z

    const/4 v3, 0x0

    .line 172
    :try_start_0
    iget-object v4, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ll/ۙۤܳ;->close()V

    :cond_0
    const/4 v4, 0x0

    .line 173
    iput-object v4, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    iput-object v4, p0, Ll/ܿۙܳ;->۫ۙ:Ll/᩹ۙܳ;

    iput-object v4, p0, Ll/ܿۙܳ;->ܳۙ:Ll/᩹ۙܳ;

    .line 174
    invoke-virtual {v1, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    :try_start_1
    invoke-virtual {p1}, Ll/ᩳܳܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :catch_0
    :try_start_2
    invoke-virtual {v0, p2}, Ll/ۨ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    :try_start_3
    invoke-virtual {p1}, Ll/ᩳܳܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 175
    :catch_1
    :try_start_4
    iput-object p3, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    const-wide/16 p1, -0x1

    .line 176
    iput-wide p1, p0, Ll/ܿۙܳ;->֡:J

    .line 177
    new-instance p1, Ll/ۗۙܳ;

    invoke-direct {p1, p3, v2}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v1, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 178
    new-instance p1, Ll/ۗۙܳ;

    invoke-direct {p1, p3, v3}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 179
    iget-object p1, v1, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object p2, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-boolean p3, p0, Ll/ܿۙܳ;->֫ۙ:Z

    iput-boolean p3, p2, Ll/ۗۙܳ;->ܽ:Z

    iput-boolean p3, p1, Ll/ۗۙܳ;->ܽ:Z

    const/4 p1, -0x1

    .line 180
    iput p1, p0, Ll/ܿۙܳ;->۬:I

    iput p1, p0, Ll/ܿۙܳ;->ᩴۙ:I

    iput p1, p0, Ll/ܿۙܳ;->ۙۙ:I

    iput-boolean v3, p0, Ll/ܿۙܳ;->ۤۙ:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 181
    iput-boolean v3, p0, Ll/ܿۙܳ;->ᩳ:Z

    .line 182
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void

    :catchall_0
    move-exception p1

    .line 181
    iput-boolean v3, p0, Ll/ܿۙܳ;->ᩳ:Z

    throw p1
.end method

.method public final ۙ(Ll/᩸ۙܳ;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/ܿۙܳ;->ۡ:Ll/᩸ۙܳ;

    return-void
.end method

.method public final ۙ(Ll/᩹ۙܳ;Ll/᩹ۙܳ;Ll/۬ۙܳ;)V
    .locals 7

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ܿۙܳ;->ᩳ:Z

    const/4 v1, 0x0

    .line 142
    :try_start_0
    iget-object v2, p0, Ll/ܿۙܳ;->ܳۙ:Ll/᩹ۙܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v4, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-ne v2, p1, :cond_0

    :try_start_1
    iget-object v2, p0, Ll/ܿۙܳ;->۫ۙ:Ll/᩹ۙܳ;

    if-eq v2, p2, :cond_2

    .line 143
    :cond_0
    iget-object v2, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ۙۤܳ;->close()V

    :cond_1
    const/4 v2, 0x0

    .line 144
    iput-object v2, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    .line 145
    new-instance v5, Ll/ᩳܳܳ;

    invoke-virtual {p1}, Ll/᩹ۙܳ;->۠᩷()V

    .line 169
    invoke-direct {v5, p1, v2}, Ll/ᩳܳܳ;-><init>(Ll/᩸۫ܳ;Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :try_start_2
    new-instance v6, Ll/ᩳܳܳ;

    invoke-virtual {p2}, Ll/᩹ۙܳ;->۠᩷()V

    .line 169
    invoke-direct {v6, p2, v2}, Ll/ᩳܳܳ;-><init>(Ll/᩸۫ܳ;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    :try_start_3
    invoke-virtual {v4, v5}, Ll/ۨ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 239
    :try_start_4
    invoke-virtual {v2}, Ll/ᩳܳܳ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 150
    :catch_0
    :try_start_5
    invoke-virtual {v3, v6}, Ll/ۨ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 239
    :try_start_6
    invoke-virtual {v2}, Ll/ᩳܳܳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 151
    :catch_1
    :try_start_7
    iput-object p1, p0, Ll/ܿۙܳ;->ܳۙ:Ll/᩹ۙܳ;

    .line 152
    iput-object p2, p0, Ll/ܿۙܳ;->۫ۙ:Ll/᩹ۙܳ;

    .line 154
    :cond_2
    iput-object p3, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    const-wide/16 p1, -0x1

    .line 155
    iput-wide p1, p0, Ll/ܿۙܳ;->֡:J

    .line 156
    new-instance p1, Ll/ۗۙܳ;

    invoke-direct {p1, p3, v0}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v4, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 157
    new-instance p1, Ll/ۗۙܳ;

    invoke-direct {p1, p3, v1}, Ll/ۗۙܳ;-><init>(Ll/۬ۙܳ;Z)V

    invoke-virtual {v3, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۗۙܳ;)V

    .line 158
    iget-object p1, v4, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object p2, v3, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-boolean p3, p0, Ll/ܿۙܳ;->֫ۙ:Z

    iput-boolean p3, p2, Ll/ۗۙܳ;->ܽ:Z

    iput-boolean p3, p1, Ll/ۗۙܳ;->ܽ:Z

    const/4 p1, -0x1

    .line 159
    iput p1, p0, Ll/ܿۙܳ;->ᩴۙ:I

    .line 160
    iput p1, p0, Ll/ܿۙܳ;->۬:I

    .line 161
    iput p1, p0, Ll/ܿۙܳ;->ۙۙ:I

    .line 162
    iput-boolean v1, p0, Ll/ܿۙܳ;->ۤۙ:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 163
    iput-boolean v1, p0, Ll/ܿۙܳ;->ᩳ:Z

    .line 164
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 165
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    .line 148
    :goto_0
    :try_start_8
    invoke-virtual {v5}, Ll/ᩳܳܳ;->close()V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catchall_0
    move-exception p1

    .line 163
    iput-boolean v1, p0, Ll/ܿۙܳ;->ᩳ:Z

    throw p1
.end method

.method public final ۙ(Z)V
    .locals 6

    .line 287
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v0, v0, Ll/ۢۙܳ;->ܰ:I

    if-nez v0, :cond_0

    goto :goto_4

    .line 289
    :cond_0
    iget v1, p0, Ll/ܿۙܳ;->۬:I

    if-ltz v1, :cond_1

    goto :goto_0

    :cond_1
    iget v1, p0, Ll/ܿۙܳ;->ᩴۙ:I

    :goto_0
    const/4 v2, 0x1

    if-ltz v1, :cond_3

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v0, -0x1

    :goto_1
    add-int/2addr v1, v2

    .line 291
    rem-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/ܿۙܳ;->ۙ(I)V

    return-void

    .line 294
    :cond_3
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v1

    .line 1230
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 295
    iget-object v1, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-boolean v3, p0, Ll/ܿۙܳ;->֨:Z

    invoke-virtual {p0}, Ll/ܿۙܳ;->᩻()I

    move-result v4

    invoke-virtual {v1, v4, v3}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v3

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Ll/ܿۙܳ;->᩷()J

    move-result-wide v3

    .line 296
    :goto_2
    iget-object v1, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    .line 102
    iget-object v1, v1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v5, 0x0

    if-nez v1, :cond_5

    goto :goto_3

    .line 211
    :cond_5
    invoke-virtual {v1, v3, v4, p1, v5}, Ll/ۙ۬ᩴ;->ۙ(JZZ)I

    move-result v5

    :goto_3
    xor-int/2addr p1, v2

    sub-int/2addr v5, p1

    add-int/2addr v5, v0

    .line 297
    rem-int/2addr v5, v0

    invoke-virtual {p0, v5}, Ll/ܿۙܳ;->ۙ(I)V

    :cond_6
    :goto_4
    return-void
.end method

.method public final ۙ(ZIIZZIIZZJ)V
    .locals 2

    const/4 v0, -0x1

    .line 256
    iput v0, p0, Ll/ܿۙܳ;->۬:I

    .line 257
    iput v0, p0, Ll/ܿۙܳ;->ۙۙ:I

    const-wide/16 v0, -0x1

    .line 258
    iput-wide v0, p0, Ll/ܿۙܳ;->֡:J

    const/4 v0, 0x1

    .line 259
    iput-boolean v0, p0, Ll/ܿۙܳ;->ᩳ:Z

    .line 260
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-eqz p4, :cond_0

    iget-object p4, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p4, p2, p3}, Ll/ۚ᩷ܳ;->᩷(II)V

    goto :goto_0

    :cond_0
    iget-object p3, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p3, p2, p5}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 261
    :goto_0
    iget-object p2, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object p2, p2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    if-eqz p8, :cond_1

    invoke-virtual {p2, p6, p7}, Ll/ۚ᩷ܳ;->᩷(II)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2, p6, p9}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    :goto_1
    const/4 p2, 0x0

    .line 262
    iput-boolean p2, p0, Ll/ܿۙܳ;->ᩳ:Z

    .line 263
    iput-boolean p1, p0, Ll/ܿۙܳ;->֨:Z

    .line 264
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 265
    iget-object p1, p0, Ll/ܿۙܳ;->᩷ۙ:Ll/ۘۙܳ;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 267
    :cond_2
    new-instance p1, Ll/ۘۙܳ;

    invoke-direct {p1, p0, p10, p11}, Ll/ۘۙܳ;-><init>(Ll/ܿۙܳ;J)V

    iput-object p1, p0, Ll/ܿۙܳ;->᩷ۙ:Ll/ۘۙܳ;

    .line 273
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۙ()Z
    .locals 5

    .line 397
    iget-wide v0, p0, Ll/ܿۙܳ;->֡:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Ll/ܿۙܳ;->ܿ:Z

    return v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Ll/ܿۙܳ;->֫ۙ:Z

    return v0
.end method

.method public final ۤ()I
    .locals 10

    .line 277
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-eqz v0, :cond_7

    iget-object v0, v0, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v0, v0, Ll/ۢۙܳ;->ܰ:I

    if-nez v0, :cond_0

    goto :goto_3

    .line 278
    :cond_0
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-boolean v1, p0, Ll/ܿۙܳ;->֨:Z

    invoke-virtual {p0}, Ll/ܿۙܳ;->᩻()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ll/ܿۙܳ;->᩷()J

    move-result-wide v0

    .line 281
    :goto_0
    iget-object v2, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v3, v2, Ll/۬ۙܳ;->᩸:J

    cmp-long v5, v0, v3

    if-gez v5, :cond_7

    .line 106
    iget-object v2, v2, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    move-wide v4, v0

    .line 244
    :goto_1
    iget-object v6, v2, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v6, :cond_4

    .line 245
    iget-wide v7, v6, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v9, v4, v7

    if-gez v9, :cond_3

    move-object v2, v6

    goto :goto_1

    :cond_3
    sub-long/2addr v4, v7

    .line 246
    iget-object v2, v2, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_1

    .line 248
    :cond_4
    iget v2, v2, Ll/ۙ۬ᩴ;->֫:I

    :goto_2
    if-nez v2, :cond_5

    goto :goto_3

    .line 282
    :cond_5
    iget-object v2, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    .line 102
    iget-object v2, v2, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v2, :cond_6

    return v3

    .line 211
    :cond_6
    invoke-virtual {v2, v0, v1, v3, v3}, Ll/ۙ۬ᩴ;->ۙ(JZZ)I

    move-result v0

    return v0

    :cond_7
    :goto_3
    const/4 v0, -0x1

    return v0
.end method

.method public final ۤ(Z)Ll/ۨ᩷ܳ;
    .locals 0

    if-eqz p1, :cond_0

    .line 185
    iget-object p1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    return-object p1
.end method

.method public final ۧ()V
    .locals 2

    .line 219
    iget-object v0, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۙۤܳ;->close()V

    iput-object v1, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    :cond_0
    const/4 v0, -0x1

    .line 220
    iput v0, p0, Ll/ܿۙܳ;->۬:I

    .line 221
    iput v0, p0, Ll/ܿۙܳ;->ۙۙ:I

    .line 222
    iget-object v0, p0, Ll/ܿۙܳ;->᩷ۙ:Ll/ۘۙܳ;

    if-eqz v0, :cond_1

    .line 223
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 224
    iput-object v1, p0, Ll/ܿۙܳ;->᩷ۙ:Ll/ۘۙܳ;

    .line 226
    :cond_1
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩵()V

    .line 227
    iget-object v1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    .line 228
    invoke-static {v0}, Ll/ܿۙܳ;->ۙ(Ll/ۨ᩷ܳ;)V

    invoke-static {v1}, Ll/ܿۙܳ;->ۙ(Ll/ۨ᩷ܳ;)V

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 243
    iget-boolean v0, p0, Ll/ܿۙܳ;->֨:Z

    return v0
.end method

.method public final ܳ()Ll/ۙۤܳ;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    return-object v0
.end method

.method public final ܳ(Z)V
    .locals 4

    .line 125
    iget-boolean v0, p0, Ll/ܿۙܳ;->֫ۙ:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 126
    :cond_0
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩵()V

    iget-object v1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    .line 127
    iput-boolean p1, p0, Ll/ܿۙܳ;->֫ۙ:Z

    .line 128
    invoke-virtual {v0, p1}, Ll/ۨ᩷ܳ;->ۙ(Z)V

    .line 129
    invoke-virtual {v1, p1}, Ll/ۨ᩷ܳ;->ۙ(Z)V

    xor-int/lit8 v2, p1, 0x1

    .line 81
    iget-boolean v3, v1, Ll/ۨ᩷ܳ;->ᩳ:Z

    if-ne v3, v2, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    iput-boolean v2, v1, Ll/ۨ᩷ܳ;->ᩳ:Z

    .line 83
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 84
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 131
    :goto_0
    iput-boolean p1, v0, Ll/ۨ᩷ܳ;->᩺ۙ:Z

    .line 132
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_2

    iput-boolean p1, v0, Ll/ۗۙܳ;->ܽ:Z

    .line 133
    :cond_2
    iget-object v0, v1, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    if-eqz v0, :cond_3

    iput-boolean p1, v0, Ll/ۗۙܳ;->ܽ:Z

    .line 134
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 135
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void
.end method

.method public final ܺ()J
    .locals 5

    .line 252
    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v1

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->᩻:I

    const/4 v3, 0x1

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v3, v0

    div-long/2addr v1, v3

    iget v0, p0, Ll/ܿۙܳ;->ܰ:I

    int-to-long v3, v0

    mul-long v1, v1, v3

    return-wide v1
.end method

.method public final ᩴ(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 245
    iget-object p1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    .line 1222
    :goto_0
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    return p1
.end method

.method public final ᩴ()Ll/ۨ᩷ܳ;
    .locals 1

    .line 242
    iget-boolean v0, p0, Ll/ܿۙܳ;->֨:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    return-object v0
.end method

.method public final ᩷()J
    .locals 5

    .line 393
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 393
    :cond_0
    iget-wide v0, p0, Ll/ܿۙܳ;->֡:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    return-wide v0

    .line 394
    :cond_1
    iget-object v0, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    if-nez v0, :cond_2

    return-wide v2

    :cond_2
    iget-boolean v1, p0, Ll/ܿۙܳ;->֨:Z

    invoke-virtual {p0}, Ll/ܿۙܳ;->᩻()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Ll/۬ۙܳ;->ۙ(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷(I)V
    .locals 2

    const/4 v0, -0x1

    .line 331
    iput v0, p0, Ll/ܿۙܳ;->۬:I

    iput v0, p0, Ll/ܿۙܳ;->ᩴۙ:I

    const-wide/16 v0, -0x1

    .line 332
    iput-wide v0, p0, Ll/ܿۙܳ;->֡:J

    .line 333
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 334
    iget-object v1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    iget-object v1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩵()V

    .line 336
    invoke-virtual {v0, p1}, Ll/ۨ᩷ܳ;->᩷(I)V

    .line 1222
    iget-object p1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    .line 337
    iput p1, p0, Ll/ܿۙܳ;->ۙۙ:I

    .line 338
    invoke-direct {p0}, Ll/ܿۙܳ;->ܶ()V

    return-void
.end method

.method public final ᩷(Z)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 247
    iget-object p1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    .line 1230
    :goto_0
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    return p1
.end method

.method public final ᩸(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 246
    iget-object p1, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    .line 1226
    :goto_0
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->۫()I

    move-result p1

    return p1
.end method

.method public final ᩸()V
    .locals 6

    .line 189
    iget-object v0, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    iget-object v1, p0, Ll/ܿۙܳ;->᩸ۙ:Ll/ۨ᩷ܳ;

    iget-object v2, p0, Ll/ܿۙܳ;->ۢ:Ll/ۨ᩷ܳ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۙۤܳ;

    .line 480
    iget-object v3, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v3

    iget-object v4, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v4}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v4

    .line 189
    iget-object v5, p0, Ll/ܿۙܳ;->᩶:Ll/۬ۙܳ;

    invoke-direct {v0, v3, v4, v5}, Ll/ۙۤܳ;-><init>(Ll/ᩳܳܳ;Ll/ᩳܳܳ;Ll/۬ۙܳ;)V

    iput-object v0, p0, Ll/ܿۙܳ;->۟:Ll/ۙۤܳ;

    :cond_0
    const/4 v0, 0x0

    .line 190
    invoke-virtual {v2, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    invoke-virtual {v1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    .line 191
    iget-object v0, v2, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۢ:Ll/ۗۙܳ;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/ۗۙܳ;->᩸:Z

    iput-boolean v2, v0, Ll/ۗۙܳ;->᩸:Z

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 244
    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1222
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    return v0
.end method
