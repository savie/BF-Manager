.class public final Ll/ۖ۠᩸;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "X68P"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ֡:F

.field public ֨:J

.field public ֫ۙ:Z

.field public ۖ:F

.field public ۗۙ:Z

.field public ۙۙ:Z

.field public ۚۙ:I

.field public ۜ:I

.field public ۟:Z

.field public ۠:F

.field public ۡ:I

.field public ۢ:Ll/ᩴۙᩴ;

.field public ۤۙ:Z

.field public ۧۙ:I

.field public ۫ۙ:I

.field public ۬:Z

.field public ܰ:I

.field public ܳۙ:F

.field public ܶۙ:F

.field public ܺۙ:Z

.field public ܽۙ:Z

.field public ܿ:F

.field public ᩳ:Z

.field public ᩴۙ:F

.field public ᩶:I

.field public ᩷ۙ:Z

.field public ᩸ۙ:F

.field public final synthetic ᩹ۙ:Ll/᩺ۜ᩸;

.field public ᩻ۙ:I


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;Landroid/content/Context;)V
    .locals 1

    .line 8003
    iput-object p1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 v0, 0x0

    .line 8170
    iput-boolean v0, p0, Ll/ۖ۠᩸;->֫ۙ:Z

    .line 8258
    iget-object p1, p1, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {p1}, Ll/۬ۡ᩸;->ۗ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۖ۠᩸;->ܺۙ:Z

    .line 8259
    new-instance p1, Ll/ᩴۙᩴ;

    invoke-direct {p1}, Ll/ᩴۙᩴ;-><init>()V

    iput-object p1, p0, Ll/ۖ۠᩸;->ۢ:Ll/ᩴۙᩴ;

    const/4 p1, -0x1

    .line 8373
    iput p1, p0, Ll/ۖ۠᩸;->ۚۙ:I

    .line 8381
    iput p1, p0, Ll/ۖ۠᩸;->ۜ:I

    .line 8004
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ۖ۠᩸;->ۡ:I

    return-void
.end method

.method private ۙ()V
    .locals 3

    .line 8443
    iget-boolean v0, p0, Ll/ۖ۠᩸;->۬:Z

    const/4 v1, 0x0

    .line 8444
    iput-boolean v1, p0, Ll/ۖ۠᩸;->ۤۙ:Z

    .line 8445
    iput-boolean v1, p0, Ll/ۖ۠᩸;->᩷ۙ:Z

    .line 8446
    iput-boolean v1, p0, Ll/ۖ۠᩸;->ۙۙ:Z

    .line 8447
    iput-boolean v1, p0, Ll/ۖ۠᩸;->۬:Z

    const/4 v2, -0x1

    .line 8448
    iput v2, p0, Ll/ۖ۠᩸;->ۜ:I

    const/4 v2, 0x0

    .line 8449
    iput v2, p0, Ll/ۖ۠᩸;->ۖ:F

    .line 8450
    iput v2, p0, Ll/ۖ۠᩸;->۠:F

    .line 8451
    iget-object v2, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iput v1, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v0, :cond_0

    .line 8453
    invoke-direct {p0, v1}, Ll/ۖ۠᩸;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method private ۙ(FF)V
    .locals 3

    .line 8586
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, p1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, p2

    invoke-virtual {v1, v2, p1}, Ll/۬ۡ᩸;->ۙ(FF)I

    move-result p1

    .line 8587
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p2

    iget v1, p0, Ll/ۖ۠᩸;->ۜ:I

    if-ne p2, v1, :cond_1

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result p2

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 8588
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object p2

    iget v1, p0, Ll/ۖ۠᩸;->ۜ:I

    invoke-interface {p2, v1, p1}, Ll/ۡ᩶᩸;->setSelection(II)V

    .line 8589
    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->ᩴ(Ll/᩺ۜ᩸;I)V

    .line 8590
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ۙ(Landroid/view/MotionEvent;)V
    .locals 6

    .line 8530
    invoke-direct {p0, p1}, Ll/ۖ۠᩸;->ᩴ(Landroid/view/MotionEvent;)V

    .line 8550
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 8551
    iget-object v1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget v2, v1, Ll/᩺ۜ᩸;->ۛۙ:I

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 8552
    :goto_0
    iget v4, v1, Ll/᩺ۜ᩸;->᩺ۙ:F

    cmpg-float v5, v0, v4

    if-gez v5, :cond_2

    sub-float/2addr v4, v0

    float-to-int v0, v4

    .line 8553
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v1, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v2, :cond_1

    .line 8555
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 8557
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 8558
    :cond_2
    iget v4, v1, Ll/᩺ۜ᩸;->ۨۙ:F

    cmpl-float v5, v0, v4

    if-lez v5, :cond_4

    sub-float/2addr v0, v4

    float-to-int v0, v0

    .line 8559
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v0

    iput v0, v1, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v2, :cond_3

    .line 8561
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 8563
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 8565
    :cond_4
    iput v3, v1, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8574
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 8575
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr p1, v2

    .line 8576
    iput v0, v1, Ll/᩺ۜ᩸;->᩹᩷:F

    .line 8577
    iput p1, v1, Ll/᩺ۜ᩸;->ۗ᩷:F

    .line 8578
    invoke-direct {p0, v0, p1}, Ll/ۖ۠᩸;->ۙ(FF)V

    return-void
.end method

.method public static ۙ(Ll/ۖ۠᩸;)V
    .locals 2

    .line 8609
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 8610
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8611
    invoke-direct {p0}, Ll/ۖ۠᩸;->ۙ()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۖ۠᩸;FF)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۖ۠᩸;->ۙ(FF)V

    return-void
.end method

.method private ۙ(Z)V
    .locals 1

    .line 8173
    iget-boolean v0, p0, Ll/ۖ۠᩸;->֫ۙ:Z

    if-eq v0, p1, :cond_0

    .line 8174
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 8175
    iput-boolean p1, p0, Ll/ۖ۠᩸;->֫ۙ:Z

    :cond_0
    return-void
.end method

.method public static ۤ(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    .line 9089
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 9090
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float v1, v1, v1

    mul-float v0, v0, v0

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 9091
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method private ᩴ(Landroid/view/MotionEvent;)V
    .locals 4

    .line 8618
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 8619
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 8620
    iget-object v1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-ltz v3, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    cmpl-float v0, p1, v2

    if-ltz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 8621
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eq p1, v0, :cond_1

    .line 8622
    invoke-virtual {v1, p1}, Landroid/view/View;->setPressed(Z)V

    .line 8623
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method private ᩷()V
    .locals 2

    .line 9080
    iget-boolean v0, p0, Ll/ۖ۠᩸;->ܽۙ:Z

    if-eqz v0, :cond_0

    .line 9082
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۨ᩷()V

    .line 9083
    iget-object v1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v1}, Ll/۬ۡ᩸;->ܰ()V

    .line 9084
    invoke-static {v0}, Ll/᩺ۜ᩸;->ᩴ᩷(Ll/᩺ۜ᩸;)V

    :cond_0
    return-void
.end method

.method private ᩷(Landroid/view/MotionEvent;)V
    .locals 9

    .line 9053
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v1, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-static {p1}, Ll/ۖ۠᩸;->ۤ(Landroid/view/MotionEvent;)F

    move-result v2

    .line 9054
    iget-boolean v3, p0, Ll/ۖ۠᩸;->ܽۙ:Z

    const/4 v4, 0x1

    if-nez v3, :cond_0

    .line 9055
    iget v3, p0, Ll/ۖ۠᩸;->ܳۙ:F

    sub-float v3, v2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v5, p0, Ll/ۖ۠᩸;->ۡ:I

    int-to-float v5, v5

    cmpl-float v3, v3, v5

    if-lez v3, :cond_6

    .line 9056
    iput-boolean v4, p0, Ll/ۖ۠᩸;->ܽۙ:Z

    .line 9059
    :cond_0
    iget v3, p0, Ll/ۖ۠᩸;->ܳۙ:F

    div-float/2addr v2, v3

    .line 9060
    iget-object v3, v1, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 9061
    iget v5, p0, Ll/ۖ۠᩸;->ܶۙ:F

    mul-float v5, v5, v2

    invoke-virtual {v1, v5}, Ll/ܰۤᩴ;->᩷(F)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 9062
    iget-object v1, v1, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iget v2, p0, Ll/ۖ۠᩸;->ܶۙ:F

    div-float/2addr v1, v2

    .line 9063
    iget-object v2, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v2, v3}, Ll/۬ۡ᩸;->ۙ(F)V

    .line 9065
    iget-object v2, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v2}, Ll/۬ۡ᩸;->ۙ()Z

    move-result v2

    const/4 v3, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    .line 9066
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    add-float/2addr v7, v2

    div-float/2addr v7, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v7, v2

    .line 9067
    iget v2, p0, Ll/ۖ۠᩸;->ۧۙ:I

    int-to-float v2, v2

    add-float/2addr v2, v7

    mul-float v2, v2, v1

    sub-float/2addr v2, v7

    cmpg-float v7, v2, v3

    if-gez v7, :cond_1

    goto :goto_0

    .line 6257
    :cond_1
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֡ۙ()I

    move-result v7

    int-to-float v7, v7

    cmpl-float v8, v2, v7

    if-lez v8, :cond_3

    move v2, v7

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 9071
    :cond_3
    :goto_1
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v6

    div-float/2addr p1, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr p1, v4

    .line 9072
    iget v4, p0, Ll/ۖ۠᩸;->᩻ۙ:I

    int-to-float v4, v4

    add-float/2addr v4, p1

    mul-float v4, v4, v1

    sub-float/2addr v4, p1

    cmpg-float p1, v4, v3

    if-gez p1, :cond_4

    goto :goto_2

    .line 6281
    :cond_4
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۟ۙ()I

    move-result p1

    int-to-float v3, p1

    cmpl-float p1, v4, v3

    if-lez p1, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    float-to-int p1, v2

    float-to-int v1, v3

    .line 9074
    invoke-virtual {v0, p1, v1}, Ll/᩺ۜ᩸;->֫(II)V

    .line 9075
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_6
    return-void
.end method

.method private ᩸(Landroid/view/MotionEvent;)V
    .locals 8

    .line 9037
    invoke-static {p1}, Ll/ۖ۠᩸;->ۤ(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Ll/ۖ۠᩸;->ܳۙ:F

    const/4 p1, 0x1

    .line 9038
    iput-boolean p1, p0, Ll/ۖ۠᩸;->ۗۙ:Z

    const/4 p1, 0x0

    .line 9039
    iput-boolean p1, p0, Ll/ۖ۠᩸;->ܽۙ:Z

    .line 9040
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v1, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-object v1, v1, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iput v1, p0, Ll/ۖ۠᩸;->ܶۙ:F

    .line 9041
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    iput v1, p0, Ll/ۖ۠᩸;->ۧۙ:I

    .line 9042
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    iput v1, p0, Ll/ۖ۠᩸;->᩻ۙ:I

    .line 9043
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۚۙ(Ll/᩺ۜ᩸;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩺ۜ᩸;->۫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 9048
    :cond_0
    invoke-static {v0}, Ll/᩺ۜ᩸;->ܽ(Ll/᩺ۜ᩸;)Ll/᩺ۡ;

    move-result-object p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩺ۡ;->ۙ(Landroid/view/MotionEvent;)Z

    return-void

    .line 9044
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/᩺ۜ᩸;->ᩳۙ(Ll/᩺ۜ᩸;)V

    .line 9045
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۢۙ(Ll/᩺ۜ᩸;)V

    .line 9046
    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->ܳ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;Z)V

    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->ᩴ(Ll/᩺ۜ᩸;Z)V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 8017
    invoke-direct {p0}, Ll/ۖ۠᩸;->ۙ()V

    .line 8018
    iget-object p1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    .line 8019
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 8021
    invoke-virtual {p1, v0, v2}, Ll/᩺ۜ᩸;->᩸(IZ)V

    .line 8022
    invoke-virtual {p1, v2}, Ll/᩺ۜ᩸;->ۙ(Z)V

    const/4 v0, -0x1

    .line 2503
    invoke-virtual {p1, v0}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 8025
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8026
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->֫᩸()V

    return v2
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 8052
    iget-object p1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۖ۠᩸;->ᩳ:Z

    .line 8053
    invoke-static {p1}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8054
    invoke-static {p1}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .line 8065
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 8067
    :cond_0
    iget-object p1, v1, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {p1}, Ll/۬ۡ᩸;->ۙ()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    .line 8072
    :goto_0
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->֡ۙ()I

    move-result v8

    .line 8073
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->۟ۙ()I

    move-result v10

    .line 8074
    invoke-static {v1}, Ll/᩺ۜ᩸;->᩵ۙ(Ll/᩺ۜ᩸;)V

    .line 8075
    invoke-static {v1}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v4

    neg-float p1, p3

    float-to-int v5, p1

    neg-float p1, p4

    float-to-int v6, p1

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    const/4 p1, 0x1

    cmpl-float p2, p4, v0

    if-eqz p2, :cond_1

    .line 8078
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۚ᩸()V

    return p1

    :cond_1
    cmpl-float p2, p3, v0

    if-eqz p2, :cond_2

    .line 8080
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩸()V

    return p1

    .line 8082
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 10

    .line 8092
    iget-object v0, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v1, v0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֨᩷()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 8094
    :cond_0
    invoke-direct {p0}, Ll/ۖ۠᩸;->ۙ()V

    const/4 v2, 0x0

    .line 8095
    invoke-virtual {v0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 8096
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_1

    .line 8097
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 8099
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 8100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 8101
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v5

    .line 8102
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v6

    if-le v5, v6, :cond_2

    move v9, v6

    move v6, v5

    move v5, v9

    .line 8108
    :cond_2
    iget-boolean v7, v1, Ll/ܰۤᩴ;->ۡ᩷:Z

    const/4 v8, -0x1

    if-eqz v7, :cond_7

    .line 8109
    invoke-static {v0, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;F)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 8111
    iget-object p1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    float-to-double v1, v4

    invoke-virtual {p1, v1, v2}, Ll/۬ۡ᩸;->ۙ(D)I

    move-result p1

    .line 8112
    iget-object v1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v1, v1, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 127
    invoke-virtual {v1, p1}, Ll/ۜۙᩴ;->᩸(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object v1

    .line 8112
    iget v1, v1, Ll/ܰۙᩴ;->ܿ:I

    .line 8113
    iget-object v2, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v2, v2, Ll/۬ۡ᩸;->۟:Ll/ۜۙᩴ;

    .line 131
    invoke-virtual {v2, p1}, Ll/ۜۙᩴ;->ᩴ(I)I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۜۙᩴ;->get(I)Ll/ܰۙᩴ;

    move-result-object p1

    .line 8113
    iget p1, p1, Ll/ܰۙᩴ;->ܰ:I

    .line 8114
    invoke-static {v0}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object v2

    invoke-static {v2}, Landroid/view/inputmethod/BaseInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V

    if-ne v5, v6, :cond_3

    .line 8116
    invoke-static {v0}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object v2

    invoke-interface {v2, v1, p1}, Ll/ۡ᩶᩸;->setSelection(II)V

    .line 8117
    invoke-static {v0, v1}, Ll/᩺ۜ᩸;->ۤ(Ll/᩺ۜ᩸;I)V

    .line 8118
    invoke-static {v0, p1}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;I)V

    goto :goto_0

    .line 8120
    :cond_3
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(Ll/᩺ۜ᩸;)I

    move-result v2

    if-ne v2, v8, :cond_4

    .line 8121
    invoke-static {v0, v5}, Ll/᩺ۜ᩸;->ۤ(Ll/᩺ۜ᩸;I)V

    .line 8122
    invoke-static {v0, v6}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;I)V

    .line 8124
    :cond_4
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(Ll/᩺ۜ᩸;)I

    move-result v2

    if-ge v1, v2, :cond_5

    move v5, v1

    .line 8127
    :cond_5
    invoke-static {v0}, Ll/᩺ۜ᩸;->ۛ(Ll/᩺ۜ᩸;)I

    move-result v1

    if-lt p1, v1, :cond_6

    move v6, p1

    .line 8130
    :cond_6
    invoke-static {v0}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-interface {p1, v5, v6}, Ll/ۡ᩶᩸;->setSelection(II)V

    .line 8132
    :goto_0
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8133
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 8137
    :cond_7
    iget-object v7, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v7, v3, v4}, Ll/۬ۡ᩸;->ۙ(FF)I

    move-result v3

    .line 8138
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠᩷()Z

    move-result v4

    const/4 v7, 0x1

    if-eqz v4, :cond_a

    if-eq v5, v6, :cond_9

    if-gt v5, v3, :cond_9

    if-le v3, v6, :cond_8

    goto :goto_1

    .line 2503
    :cond_8
    invoke-virtual {v0, v8}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 8155
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8156
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֫᩸()V

    goto/16 :goto_2

    .line 8140
    :cond_9
    :goto_1
    invoke-virtual {v0, v3, v2}, Ll/᩺ۜ᩸;->ۤ(IZ)[I

    move-result-object v4

    .line 8141
    invoke-static {v0, v7}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Z)V

    .line 8142
    invoke-static {v0, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;I)V

    .line 8143
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v3

    aget v5, v4, v2

    invoke-virtual {v0, v3, v5}, Ll/᩺ۜ᩸;->۫(II)V

    .line 8144
    aget v3, v4, v2

    aget v5, v4, v7

    invoke-virtual {v0, v3, v5}, Ll/᩺ۜ᩸;->ۧ(II)V

    .line 8145
    aget v3, v4, v2

    invoke-static {v0, v3}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;I)V

    const-wide/16 v3, 0x0

    .line 8146
    iput-wide v3, v0, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8147
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v4, v3

    invoke-virtual {v1}, Ll/ۚۚܺ;->֫()F

    move-result v3

    add-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v0, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 8148
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, v0, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 8149
    iput v2, v0, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8150
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 8151
    invoke-virtual {v0, v7}, Ll/᩺ۜ᩸;->ۙ(Z)V

    .line 8152
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    iget v1, v1, Ll/ܰۤᩴ;->ܶ᩷:I

    invoke-static {v0, v2, p1, v1}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;III)V

    goto :goto_2

    :cond_a
    if-eq v5, v6, :cond_b

    if-gt v5, v3, :cond_b

    if-le v3, v6, :cond_c

    .line 8160
    :cond_b
    invoke-virtual {v0, v3, v2}, Ll/᩺ۜ᩸;->᩸(IZ)V

    .line 8161
    invoke-virtual {v0, v7}, Ll/᩺ۜ᩸;->ۙ(Z)V

    .line 2503
    :cond_c
    invoke-virtual {v0, v8}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 8164
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8165
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֫᩸()V

    .line 8167
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .line 8183
    iget-object p1, p0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v0, p1, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_0

    .line 8184
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 8186
    :cond_0
    iget-object v1, p1, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v1}, Ll/۬ۡ᩸;->ۙ()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v1, v1, v4

    if-lez v1, :cond_5

    .line 8187
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p4

    float-to-int v1, p3

    add-int/2addr p4, v1

    if-gez p4, :cond_2

    if-eqz p2, :cond_1

    .line 8191
    iget-boolean p4, v0, Ll/ܰۤᩴ;->᩵ۙ:Z

    if-eqz p4, :cond_1

    .line 8192
    invoke-static {p1}, Ll/᩺ۜ᩸;->᩶(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p4

    neg-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    sub-float/2addr v2, p2

    invoke-static {p4, p3, v2}, Ll/ᩴۙۙ;->ۙ(Landroid/widget/EdgeEffect;FF)V

    .line 8193
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 8194
    invoke-static {p1}, Ll/᩺ۜ᩸;->ܿ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_1

    .line 8195
    invoke-static {p1}, Ll/᩺ۜ᩸;->ܿ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_1
    const/4 p4, 0x0

    goto :goto_0

    .line 8198
    :cond_2
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->֡ۙ()I

    move-result v1

    if-le p4, v1, :cond_4

    if-eqz p2, :cond_3

    .line 8202
    iget-boolean p4, v0, Ll/ܰۤᩴ;->᩵ۙ:Z

    if-eqz p4, :cond_3

    .line 8203
    invoke-static {p1}, Ll/᩺ۜ᩸;->ܿ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-static {p4, p3, p2}, Ll/ᩴۙۙ;->ۙ(Landroid/widget/EdgeEffect;FF)V

    .line 8204
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 8205
    invoke-static {p1}, Ll/᩺ۜ᩸;->᩶(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_3

    .line 8206
    invoke-static {p1}, Ll/᩺ۜ᩸;->᩶(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_3
    move p4, v1

    .line 8210
    :cond_4
    :goto_0
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 8211
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩸()V

    goto/16 :goto_2

    .line 8213
    :cond_5
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result p3

    float-to-int v1, p4

    add-int/2addr p3, v1

    if-gez p3, :cond_8

    .line 8215
    iget-boolean p3, p0, Ll/ۖ۠᩸;->۟:Z

    if-eqz p3, :cond_6

    .line 8216
    invoke-direct {p0, v3}, Ll/ۖ۠᩸;->ۙ(Z)V

    :cond_6
    if-eqz p2, :cond_7

    .line 8220
    iget-boolean p3, v0, Ll/ܰۤᩴ;->᩵ۙ:Z

    if-eqz p3, :cond_7

    .line 8221
    invoke-static {p1}, Ll/᩺ۜ᩸;->ᩳ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p3

    neg-float p4, p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-static {p3, p4, p2}, Ll/ᩴۙۙ;->ۙ(Landroid/widget/EdgeEffect;FF)V

    .line 8222
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 8223
    invoke-static {p1}, Ll/᩺ۜ᩸;->ۘ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_7

    .line 8224
    invoke-static {p1}, Ll/᩺ۜ᩸;->ۘ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_7
    const/4 p3, 0x0

    goto :goto_1

    .line 8227
    :cond_8
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->۟ۙ()I

    move-result v1

    if-le p3, v1, :cond_b

    .line 8229
    iget-boolean p3, p0, Ll/ۖ۠᩸;->۟:Z

    if-eqz p3, :cond_9

    .line 8230
    invoke-direct {p0, v3}, Ll/ۖ۠᩸;->ۙ(Z)V

    :cond_9
    if-eqz p2, :cond_a

    .line 8234
    iget-boolean p3, v0, Ll/ܰۤᩴ;->᩵ۙ:Z

    if-eqz p3, :cond_a

    .line 8235
    invoke-static {p1}, Ll/᩺ۜ᩸;->ۘ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    sub-float/2addr v2, p2

    invoke-static {p3, p4, v2}, Ll/ᩴۙۙ;->ۙ(Landroid/widget/EdgeEffect;FF)V

    .line 8236
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 8237
    invoke-static {p1}, Ll/᩺ۜ᩸;->ᩳ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_a

    .line 8238
    invoke-static {p1}, Ll/᩺ۜ᩸;->ᩳ(Ll/᩺ۜ᩸;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_a
    move p3, v1

    .line 8242
    :cond_b
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p1, p2, p3}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 8243
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ۚ᩸()V

    .line 8245
    :goto_2
    iget-boolean p1, p0, Ll/ۖ۠᩸;->۟:Z

    if-eqz p1, :cond_c

    .line 8246
    iput-boolean v3, p0, Ll/ۖ۠᩸;->۟:Z

    :cond_c
    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v0, p0

    .line 8275
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget-object v2, v0, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    iget-object v4, v2, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    int-to-float v3, v3

    add-float/2addr v1, v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v1, v3

    .line 8276
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v3, v5

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v3, v5

    .line 8277
    iget-object v5, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v5, v1, v3}, Ll/۬ۡ᩸;->ۙ(FF)I

    move-result v1

    .line 8278
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v3

    .line 8279
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v5

    if-le v3, v5, :cond_0

    move/from16 v17, v5

    move v5, v3

    move/from16 v3, v17

    .line 8287
    :cond_0
    iget-object v6, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v6}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v6

    iget-object v7, v0, Ll/ۖ۠᩸;->ۢ:Ll/ᩴۙᩴ;

    const/4 v8, 0x0

    if-nez v6, :cond_1

    iget-boolean v6, v4, Ll/ܰۤᩴ;->᩶᩷:Z

    if-nez v6, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8288
    invoke-virtual {v7}, Ll/ᩴۙᩴ;->᩷()V

    .line 8289
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩹(Ll/᩺ۜ᩸;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v6

    invoke-virtual {v6, v2, v8, v7}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 8292
    :goto_0
    iget-object v9, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 400
    iget-boolean v9, v9, Ll/۬ۡ᩸;->ۖ:Z

    const-wide/16 v10, 0x64

    const/4 v12, 0x2

    const-wide/16 v15, 0x1194

    const-wide/16 v13, 0x0

    if-eqz v9, :cond_6

    if-eqz v6, :cond_2

    if-eq v3, v5, :cond_2

    if-gt v3, v1, :cond_2

    if-gt v1, v5, :cond_2

    .line 8298
    invoke-virtual {v7}, Ll/ᩴۙᩴ;->ۙ()I

    move-result v6

    if-ne v6, v12, :cond_2

    .line 8302
    new-instance v1, Ll/ۢ۠᩸;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Ll/ۢ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v1, v10, v11}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_2
    if-ne v3, v5, :cond_4

    if-ne v3, v1, :cond_4

    .line 8304
    iget-object v1, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v1}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v1

    if-nez v1, :cond_5

    iget-boolean v1, v4, Ll/ܰۤᩴ;->᩶᩷:Z

    if-nez v1, :cond_5

    .line 8307
    iget-boolean v1, v0, Ll/ۖ۠᩸;->ᩳ:Z

    if-eqz v1, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    iget-wide v9, v0, Ll/ۖ۠᩸;->֨:J

    sub-long/2addr v5, v9

    cmp-long v1, v5, v15

    if-lez v1, :cond_3

    .line 8308
    iget-boolean v1, v0, Ll/ۖ۠᩸;->ܺۙ:Z

    iget-object v3, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v3}, Ll/۬ۡ᩸;->ۗ()Z

    move-result v3

    if-ne v1, v3, :cond_5

    const/4 v1, -0x1

    .line 2503
    invoke-virtual {v2, v1}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 8310
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    iput-wide v5, v0, Ll/ۖ۠᩸;->֨:J

    goto :goto_1

    .line 8313
    :cond_3
    iput-wide v13, v0, Ll/ۖ۠᩸;->֨:J

    goto :goto_1

    .line 8316
    :cond_4
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Ll/᩺ۜ᩸;->۫(II)V

    .line 8317
    invoke-static {v2}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-interface {v3, v1}, Ll/ۡ᩶᩸;->setSelection(I)V

    .line 8318
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۙ᩷(Ll/᩺ۜ᩸;)V

    .line 8319
    iput-wide v13, v0, Ll/ۖ۠᩸;->֨:J

    .line 8321
    :cond_5
    :goto_1
    iget-object v1, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v1}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v1

    if-nez v1, :cond_d

    iget-boolean v1, v4, Ll/ܰۤᩴ;->᩶᩷:Z

    if-nez v1, :cond_d

    .line 1351
    invoke-virtual {v2, v8}, Ll/᩺ۜ᩸;->ۙ(Z)V

    goto/16 :goto_4

    :cond_6
    if-ne v3, v5, :cond_8

    if-ne v1, v3, :cond_8

    .line 8325
    iget-boolean v1, v0, Ll/ۖ۠᩸;->ᩳ:Z

    if-eqz v1, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, v0, Ll/ۖ۠᩸;->֨:J

    sub-long/2addr v3, v5

    cmp-long v1, v3, v15

    if-lez v1, :cond_7

    .line 8326
    iget-boolean v1, v0, Ll/ۖ۠᩸;->ܺۙ:Z

    iget-object v3, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v3}, Ll/۬ۡ᩸;->ۗ()Z

    move-result v3

    if-ne v1, v3, :cond_d

    const/4 v1, -0x1

    .line 2503
    invoke-virtual {v2, v1}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 8328
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, Ll/ۖ۠᩸;->֨:J

    goto :goto_4

    .line 8331
    :cond_7
    iput-wide v13, v0, Ll/ۖ۠᩸;->֨:J

    goto :goto_4

    :cond_8
    if-gt v3, v1, :cond_c

    if-gt v1, v5, :cond_c

    .line 8332
    iget-boolean v3, v4, Ll/ܰۤᩴ;->ۖ᩷:Z

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    if-eqz v6, :cond_b

    .line 8341
    invoke-virtual {v7}, Ll/ᩴۙᩴ;->ۙ()I

    move-result v1

    if-eq v1, v12, :cond_a

    goto :goto_2

    .line 8344
    :cond_a
    new-instance v1, Ll/ۢ۠᩸;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Ll/ۢ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v1, v10, v11}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    :cond_b
    :goto_2
    const/4 v1, -0x1

    .line 2503
    invoke-virtual {v2, v1}, Ll/᩺ۜ᩸;->ۛ(I)V

    goto :goto_4

    .line 8333
    :cond_c
    :goto_3
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Ll/᩺ۜ᩸;->۫(II)V

    .line 8334
    invoke-static {v2}, Ll/᩺ۜ᩸;->۟(Ll/᩺ۜ᩸;)Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-interface {v3, v1}, Ll/ۡ᩶᩸;->setSelection(I)V

    .line 8335
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۙ᩷(Ll/᩺ۜ᩸;)V

    .line 8336
    iput-wide v13, v0, Ll/ۖ۠᩸;->֨:J

    .line 8337
    iget-object v3, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v3}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v3

    if-nez v3, :cond_d

    iget-boolean v3, v4, Ll/ܰۤᩴ;->᩶᩷:Z

    if-nez v3, :cond_d

    .line 1378
    invoke-virtual {v2, v1, v8}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    .line 8347
    :cond_d
    :goto_4
    iget-object v1, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v1}, Ll/۬ۡ᩸;->ۗ()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۖ۠᩸;->ܺۙ:Z

    .line 8348
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8349
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->֫᩸()V

    .line 8350
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    const/4 v1, 0x1

    return v1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 8694
    iget-object v2, v1, Ll/ۖ۠᩸;->᩹ۙ:Ll/᩺ۜ᩸;

    iget-object v3, v2, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 8696
    invoke-static {v2}, Ll/᩺ۜ᩸;->۟ۙ(Ll/᩺ۜ᩸;)V

    .line 8697
    invoke-static {v2, v5}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩴۜ᩸;)V

    .line 8699
    :cond_0
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩵(Ll/᩺ۜ᩸;)Ll/ᩴۜ᩸;

    move-result-object v6

    if-nez v6, :cond_1

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->֨᩷()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8700
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۗ(Ll/᩺ۜ᩸;)Ll/ᩴۜ᩸;

    move-result-object v6

    invoke-static {v2, v6}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩴۜ᩸;)V

    .line 8702
    :cond_1
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩵(Ll/᩺ۜ᩸;)Ll/ᩴۜ᩸;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x1

    if-eqz v6, :cond_5

    .line 8704
    :try_start_0
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩵(Ll/᩺ۜ᩸;)Ll/ᩴۜ᩸;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/ᩴۜ᩸;->ۙ(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_42

    .line 8707
    :cond_2
    invoke-static {v2, v5}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩴۜ᩸;)V

    return v8

    :catchall_0
    move-exception v0

    if-eq v4, v8, :cond_3

    if-ne v4, v7, :cond_4

    :cond_3
    invoke-static {v2, v5}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩴۜ᩸;)V

    .line 8709
    :cond_4
    throw v0

    .line 8664
    :cond_5
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-nez v4, :cond_9

    .line 8666
    invoke-static {v2}, Ll/᩺ۜ᩸;->֡ۙ(Ll/᩺ۜ᩸;)V

    .line 8679
    invoke-static/range {p2 .. p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v4

    and-int/2addr v4, v8

    if-nez v4, :cond_6

    goto :goto_0

    .line 8682
    :cond_6
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v4, v6

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v4, v6

    .line 8683
    iget-object v6, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    invoke-virtual {v6, v9}, Ll/۬ۡ᩸;->᩷(F)F

    move-result v6

    .line 8685
    iget-object v9, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 675
    iget-boolean v10, v9, Ll/۬ۡ᩸;->ۗ:Z

    if-eqz v10, :cond_7

    .line 667
    iget-object v9, v9, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    .line 8686
    invoke-virtual {v9, v4, v6}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_7
    iget-object v9, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 679
    iget-boolean v10, v9, Ll/۬ۡ᩸;->᩹:Z

    if-eqz v10, :cond_8

    .line 671
    iget-object v9, v9, Ll/۬ۡ᩸;->ܽ:Ll/᩸᩷ܺ;

    .line 8688
    invoke-virtual {v9, v4, v6}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_1

    .line 8668
    :cond_8
    :goto_0
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܰۙ(Ll/᩺ۜ᩸;)V

    goto :goto_1

    :cond_9
    if-ne v4, v7, :cond_a

    .line 8671
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩶ۙ(Ll/᩺ۜ᩸;)V

    .line 8712
    :cond_a
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_b

    .line 8713
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-ne v4, v8, :cond_b

    invoke-virtual {v2}, Landroid/view/View;->isPressed()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 8714
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 8632
    :cond_b
    invoke-static/range {p2 .. p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v4

    const/4 v6, 0x2

    const/4 v9, 0x0

    if-nez v4, :cond_c

    goto :goto_2

    .line 8635
    :cond_c
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    .line 8636
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۖ(Ll/᩺ۜ᩸;)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 8637
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۛۙ(Ll/᩺ۜ᩸;)V

    if-nez v4, :cond_d

    .line 8639
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    return v8

    :cond_d
    if-eq v4, v8, :cond_e

    if-ne v4, v7, :cond_42

    .line 8641
    :cond_e
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8642
    invoke-direct {v1, v9}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8643
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8644
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܿۙ(Ll/᩺ۜ᩸;)V

    return v8

    :cond_f
    if-nez v4, :cond_10

    .line 8649
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v4

    and-int/2addr v4, v6

    if-eqz v4, :cond_10

    .line 8650
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩸᩷(Ll/᩺ۜ᩸;)V

    .line 8651
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۛۙ(Ll/᩺ۜ᩸;)V

    .line 8652
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    .line 8653
    invoke-static {v2, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Landroid/view/MotionEvent;)V

    return v8

    .line 8720
    :cond_10
    :goto_2
    iget-boolean v4, v1, Ll/ۖ۠᩸;->᩷ۙ:Z

    if-eqz v4, :cond_14

    .line 8511
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eq v4, v8, :cond_13

    if-eq v4, v6, :cond_12

    if-eq v4, v7, :cond_11

    goto :goto_3

    .line 8609
    :cond_11
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8610
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8611
    invoke-direct/range {p0 .. p0}, Ll/ۖ۠᩸;->ۙ()V

    return v8

    .line 8513
    :cond_12
    invoke-direct {v1, v0}, Ll/ۖ۠᩸;->ۙ(Landroid/view/MotionEvent;)V

    return v8

    .line 8599
    :cond_13
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8600
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8601
    invoke-direct/range {p0 .. p0}, Ll/ۖ۠᩸;->ۙ()V

    return v8

    .line 8723
    :cond_14
    :goto_3
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->᩻᩷()Ll/ܿ۠᩸;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 9517
    iget-object v4, v4, Ll/ܿ۠᩸;->ۙ:[Ll/᩷ۤᩴ;

    aget-object v10, v4, v9

    invoke-virtual {v10}, Ll/᩷ۤᩴ;->᩸()Z

    move-result v10

    if-nez v10, :cond_42

    aget-object v10, v4, v8

    .line 9518
    invoke-virtual {v10}, Ll/᩷ۤᩴ;->᩸()Z

    move-result v10

    if-nez v10, :cond_42

    aget-object v4, v4, v6

    .line 9519
    invoke-virtual {v4}, Ll/᩷ۤᩴ;->᩸()Z

    move-result v4

    if-eqz v4, :cond_15

    goto/16 :goto_f

    .line 8462
    :cond_15
    iget-boolean v4, v1, Ll/ۖ۠᩸;->ۤۙ:Z

    if-nez v4, :cond_16

    goto/16 :goto_4

    .line 8465
    :cond_16
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eq v4, v8, :cond_1c

    if-eq v4, v6, :cond_17

    if-eq v4, v7, :cond_1c

    goto/16 :goto_4

    .line 8467
    :cond_17
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iget v10, v1, Ll/ۖ۠᩸;->ۖ:F

    sub-float/2addr v4, v10

    .line 8468
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    iget v11, v1, Ll/ۖ۠᩸;->۠:F

    sub-float/2addr v10, v11

    .line 8469
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v11, v1, Ll/ۖ۠᩸;->ۡ:I

    int-to-float v11, v11

    cmpg-float v4, v4, v11

    if-gtz v4, :cond_18

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v10, v1, Ll/ۖ۠᩸;->ۡ:I

    int-to-float v10, v10

    cmpg-float v4, v4, v10

    if-gtz v4, :cond_18

    goto/16 :goto_4

    .line 8488
    :cond_18
    iput-boolean v9, v1, Ll/ۖ۠᩸;->ۤۙ:Z

    .line 8489
    iput-boolean v8, v1, Ll/ۖ۠᩸;->᩷ۙ:Z

    .line 8490
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_19

    .line 8491
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 8493
    :cond_19
    iget-boolean v4, v1, Ll/ۖ۠᩸;->ۙۙ:Z

    if-nez v4, :cond_1a

    .line 8494
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v4

    iget v5, v1, Ll/ۖ۠᩸;->ۜ:I

    invoke-virtual {v2, v4, v5}, Ll/᩺ۜ᩸;->۫(II)V

    .line 8495
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۙ᩷(Ll/᩺ۜ᩸;)V

    .line 8496
    iput-boolean v8, v1, Ll/ۖ۠᩸;->ۙۙ:Z

    .line 8540
    :cond_1a
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v5

    add-float/2addr v5, v4

    iget v4, v1, Ll/ۖ۠᩸;->۠:F

    invoke-static {v5, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iput v4, v2, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 8541
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v3

    sub-float/2addr v4, v3

    iget v3, v1, Ll/ۖ۠᩸;->۠:F

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 8542
    iput v9, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    const-wide/16 v3, 0x0

    .line 8430
    iput-wide v3, v2, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 8431
    invoke-static {v2}, Ll/᩺ۜ᩸;->᩹ۙ(Ll/᩺ۜ᩸;)Ll/ܿ۠᩸;

    move-result-object v3

    if-eqz v3, :cond_1b

    .line 8433
    invoke-virtual {v3}, Ll/ܿ۠᩸;->ۙ()V

    .line 8435
    :cond_1b
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 8500
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8501
    iput-boolean v8, v1, Ll/ۖ۠᩸;->۬:Z

    .line 8502
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܽ(Ll/᩺ۜ᩸;)Ll/᩺ۡ;

    move-result-object v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺ۡ;->ۙ(Landroid/view/MotionEvent;)Z

    .line 8503
    invoke-direct {v1, v0}, Ll/ۖ۠᩸;->ۙ(Landroid/view/MotionEvent;)V

    return v8

    .line 8477
    :cond_1c
    invoke-direct/range {p0 .. p0}, Ll/ۖ۠᩸;->ۙ()V

    .line 8730
    :goto_4
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    and-int/lit16 v4, v4, 0xff

    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v4, :cond_4c

    if-eq v4, v8, :cond_3e

    const/4 v11, 0x6

    if-eq v4, v6, :cond_25

    if-eq v4, v7, :cond_21

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1f

    if-eq v4, v11, :cond_1d

    goto/16 :goto_14

    .line 8750
    :cond_1d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const v4, 0xff00

    and-int/2addr v3, v4

    ushr-int/lit8 v3, v3, 0x8

    .line 8751
    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_1e

    iget v4, v1, Ll/ۖ۠᩸;->ۚۙ:I

    if-eq v3, v4, :cond_1e

    .line 8752
    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    .line 8754
    :cond_1e
    iget v3, v1, Ll/ۖ۠᩸;->۫ۙ:I

    sub-int/2addr v3, v8

    iput v3, v1, Ll/ۖ۠᩸;->۫ۙ:I

    goto/16 :goto_14

    .line 8732
    :cond_1f
    iget v4, v1, Ll/ۖ۠᩸;->۫ۙ:I

    add-int/2addr v4, v8

    iput v4, v1, Ll/ۖ۠᩸;->۫ۙ:I

    .line 8733
    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_20

    .line 8734
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v1, Ll/ۖ۠᩸;->ۚۙ:I

    .line 8735
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, v1, Ll/ۖ۠᩸;->ܿ:F

    .line 8736
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iput v0, v1, Ll/ۖ۠᩸;->֡:F

    return v8

    .line 8740
    :cond_20
    iget-boolean v3, v3, Ll/ܰۤᩴ;->ۛ᩷:Z

    if-eqz v3, :cond_59

    iget-boolean v3, v1, Ll/ۖ۠᩸;->ۗۙ:Z

    if-nez v3, :cond_59

    .line 8741
    invoke-direct {v1, v0}, Ll/ۖ۠᩸;->᩸(Landroid/view/MotionEvent;)V

    .line 8742
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۗۙ(Ll/᩺ۜ᩸;)Ll/᩺ۜ᩸;

    move-result-object v3

    if-eqz v3, :cond_59

    .line 8744
    invoke-static {v3}, Ll/᩺ۜ᩸;->ܶ(Ll/᩺ۜ᩸;)Ll/ۖ۠᩸;

    move-result-object v3

    invoke-direct {v3, v0}, Ll/ۖ۠᩸;->᩸(Landroid/view/MotionEvent;)V

    .line 8745
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    goto/16 :goto_14

    .line 8941
    :cond_21
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8942
    invoke-direct {v1, v9}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8943
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8944
    iget-boolean v3, v1, Ll/ۖ۠᩸;->ۗۙ:Z

    if-eqz v3, :cond_22

    .line 8945
    invoke-direct/range {p0 .. p0}, Ll/ۖ۠᩸;->᩷()V

    .line 8946
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۗۙ(Ll/᩺ۜ᩸;)Ll/᩺ۜ᩸;

    move-result-object v0

    if-eqz v0, :cond_42

    .line 8948
    invoke-static {v0}, Ll/᩺ۜ᩸;->ܶ(Ll/᩺ۜ᩸;)Ll/ۖ۠᩸;

    move-result-object v3

    invoke-direct {v3}, Ll/ۖ۠᩸;->᩷()V

    .line 8949
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 8950
    invoke-static {v2}, Ll/᩺ۜ᩸;->۬(Ll/᩺ۜ᩸;)Ll/֫᩷ᩴ;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8952
    new-instance v4, Ll/۟۠᩸;

    invoke-direct {v4, v1, v0, v3}, Ll/۟۠᩸;-><init>(Ll/ۖ۠᩸;Ll/᩺ۜ᩸;Ll/֫᩷ᩴ;)V

    invoke-static {v2, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ljava/lang/Runnable;)V

    return v8

    .line 8962
    :cond_22
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۚۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/᩺ۜ᩸;->۫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_24

    invoke-static {v2}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_5

    .line 8968
    :cond_23
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۜۙ(Ll/᩺ۜ᩸;)V

    goto/16 :goto_14

    .line 8963
    :cond_24
    :goto_5
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۢۙ(Ll/᩺ۜ᩸;)V

    .line 8964
    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ܳ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ᩴ(Ll/᩺ۜ᩸;Z)V

    .line 8965
    invoke-static {v2}, Ll/᩺ۜ᩸;->ᩳۙ(Ll/᩺ۜ᩸;)V

    return v8

    .line 8838
    :cond_25
    invoke-direct {v1, v0}, Ll/ۖ۠᩸;->ᩴ(Landroid/view/MotionEvent;)V

    .line 8839
    iget v4, v1, Ll/ۖ۠᩸;->۫ۙ:I

    if-ne v4, v8, :cond_27

    .line 8841
    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_26

    .line 8842
    iget v4, v1, Ll/ۖ۠᩸;->ܿ:F

    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    sub-float/2addr v4, v6

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v4, v6

    .line 8843
    iget v6, v1, Ll/ۖ۠᩸;->֡:F

    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v6, v7

    .line 8844
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܶ(Ll/᩺ۜ᩸;)Ll/ۖ۠᩸;

    move-result-object v7

    invoke-virtual {v7, v5, v5, v4, v6}, Ll/ۖ۠᩸;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 8845
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    iput v4, v1, Ll/ۖ۠᩸;->ܿ:F

    .line 8846
    invoke-virtual {v0, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    iput v4, v1, Ll/ۖ۠᩸;->֡:F

    goto :goto_6

    .line 8847
    :cond_26
    iget-boolean v4, v1, Ll/ۖ۠᩸;->ۗۙ:Z

    if-eqz v4, :cond_27

    .line 8848
    invoke-direct {v1, v0}, Ll/ۖ۠᩸;->᩷(Landroid/view/MotionEvent;)V

    .line 8849
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۗۙ(Ll/᩺ۜ᩸;)Ll/᩺ۜ᩸;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8851
    invoke-static {v3}, Ll/᩺ۜ᩸;->ܶ(Ll/᩺ۜ᩸;)Ll/ۖ۠᩸;

    move-result-object v3

    invoke-direct {v3, v0}, Ll/ۖ۠᩸;->᩷(Landroid/view/MotionEvent;)V

    .line 8852
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v8

    .line 8857
    :cond_27
    :goto_6
    invoke-static {v2}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-nez v4, :cond_30

    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-nez v4, :cond_30

    invoke-static {v2}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_28

    goto/16 :goto_a

    .line 8908
    :cond_28
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۚۙ(Ll/᩺ۜ᩸;)Z

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    if-eqz v4, :cond_2b

    .line 8909
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v0, v4

    iget v4, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    add-float/2addr v0, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧۙ()I

    move-result v4

    iget v3, v3, Ll/ܰۤᩴ;->۟ۙ:I

    sub-int/2addr v4, v3

    int-to-float v3, v4

    div-float/2addr v0, v3

    cmpg-float v3, v0, v6

    if-gez v3, :cond_29

    const/4 v5, 0x0

    goto :goto_7

    :cond_29
    cmpl-float v3, v0, v5

    if-lez v3, :cond_2a

    goto :goto_7

    :cond_2a
    move v5, v0

    .line 8914
    :goto_7
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۟ۙ()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v5

    float-to-int v0, v0

    .line 8916
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v3

    if-eq v0, v3, :cond_42

    .line 8917
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    invoke-virtual {v2, v3, v0}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 8918
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;J)V

    .line 8919
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܰ(Ll/᩺ۜ᩸;)Ll/֡۠᩸;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/os/Handler;->removeMessages(I)V

    .line 8920
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܰ(Ll/᩺ۜ᩸;)Ll/֡۠᩸;

    move-result-object v0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v11, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v8

    .line 8923
    :cond_2b
    invoke-static {v2}, Ll/᩺ۜ᩸;->۫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_59

    .line 8924
    iget-boolean v4, v3, Ll/ܰۤᩴ;->ۡ᩷:Z

    if-eqz v4, :cond_2c

    iget-boolean v4, v3, Ll/ܰۤᩴ;->֨ۙ:Z

    if-eqz v4, :cond_2c

    iget-object v4, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget v4, v4, Ll/۬ۡ᩸;->֡:I

    goto :goto_8

    :cond_2c
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_2d

    .line 8925
    iget-boolean v7, v3, Ll/ܰۤᩴ;->᩻᩷:Z

    if-eqz v7, :cond_2d

    move v9, v4

    .line 8926
    :cond_2d
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    int-to-float v7, v9

    sub-float/2addr v0, v7

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v0, v7

    iget v7, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    add-float/2addr v0, v7

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->᩻ۙ()I

    move-result v7

    sub-int/2addr v7, v4

    iget v3, v3, Ll/ܰۤᩴ;->۟ۙ:I

    sub-int/2addr v7, v3

    int-to-float v3, v7

    div-float/2addr v0, v3

    cmpg-float v3, v0, v6

    if-gez v3, :cond_2e

    const/4 v5, 0x0

    goto :goto_9

    :cond_2e
    cmpl-float v3, v0, v5

    if-lez v3, :cond_2f

    goto :goto_9

    :cond_2f
    move v5, v0

    .line 8931
    :goto_9
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->֡ۙ()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v5

    float-to-int v0, v0

    .line 8933
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v3

    if-eq v0, v3, :cond_42

    .line 8934
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Ll/᩺ۜ᩸;->scrollTo(II)V

    return v8

    .line 8858
    :cond_30
    :goto_a
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 8859
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    .line 8860
    iget-boolean v6, v1, Ll/ۖ۠᩸;->ܽۙ:Z

    if-nez v6, :cond_32

    .line 8861
    iget v6, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v6, v6

    sub-float v6, v4, v6

    float-to-int v6, v6

    .line 8862
    iget v7, v1, Ll/ۖ۠᩸;->᩶:I

    int-to-float v7, v7

    sub-float v7, v5, v7

    float-to-int v7, v7

    .line 8863
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v11, v1, Ll/ۖ۠᩸;->ۡ:I

    if-gt v6, v11, :cond_31

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v7, v1, Ll/ۖ۠᩸;->ۡ:I

    if-le v6, v7, :cond_42

    .line 8864
    :cond_31
    iput-boolean v8, v1, Ll/ۖ۠᩸;->ܽۙ:Z

    .line 8867
    :cond_32
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 8868
    iget v6, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    if-nez v6, :cond_33

    const/4 v6, 0x1

    goto :goto_b

    :cond_33
    const/4 v6, 0x0

    .line 8869
    :goto_b
    iget v7, v2, Ll/᩺ۜ᩸;->᩺ۙ:F

    cmpg-float v11, v0, v7

    if-gez v11, :cond_35

    sub-float/2addr v7, v0

    float-to-int v0, v7

    .line 8870
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v0

    neg-int v0, v0

    iput v0, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v6, :cond_34

    .line 8872
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, v2, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 8874
    :cond_34
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_c

    .line 8875
    :cond_35
    iget v7, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    cmpl-float v11, v0, v7

    if-lez v11, :cond_37

    sub-float/2addr v0, v7

    float-to-int v0, v0

    .line 8876
    invoke-static {v0}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v0

    iput v0, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v6, :cond_36

    .line 8878
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, v2, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 8880
    :cond_36
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_c

    .line 8882
    :cond_37
    iput v9, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8884
    :goto_c
    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v0

    div-float/2addr v0, v10

    .line 8885
    iget v3, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v3, v6

    .line 8886
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v6

    if-eqz v6, :cond_3a

    cmpg-float v6, v5, v0

    if-gez v6, :cond_38

    move v5, v0

    goto :goto_d

    :cond_38
    cmpl-float v0, v5, v3

    if-lez v0, :cond_39

    move v5, v3

    .line 8893
    :cond_39
    :goto_d
    invoke-virtual {v2, v4, v5}, Ll/᩺ۜ᩸;->᩷(FF)V

    return v8

    .line 8895
    :cond_3a
    iget v6, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    add-float/2addr v5, v6

    cmpg-float v6, v5, v0

    if-gez v6, :cond_3b

    goto :goto_e

    :cond_3b
    cmpl-float v0, v5, v3

    if-lez v0, :cond_3c

    move v0, v3

    goto :goto_e

    :cond_3c
    move v0, v5

    .line 8901
    :goto_e
    invoke-static {v2}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-eqz v3, :cond_3d

    .line 8902
    iget v3, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    add-float/2addr v4, v3

    invoke-virtual {v2, v4, v0}, Ll/᩺ۜ᩸;->᩸(FF)V

    return v8

    .line 8904
    :cond_3d
    iget v3, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    add-float/2addr v4, v3

    invoke-virtual {v2, v4, v0}, Ll/᩺ۜ᩸;->ۤ(FF)V

    return v8

    .line 8971
    :cond_3e
    invoke-virtual {v2, v9}, Landroid/view/View;->setPressed(Z)V

    .line 8972
    invoke-direct {v1, v9}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8973
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 8974
    iget-boolean v3, v1, Ll/ۖ۠᩸;->ۗۙ:Z

    if-eqz v3, :cond_3f

    .line 8975
    invoke-direct/range {p0 .. p0}, Ll/ۖ۠᩸;->᩷()V

    .line 8976
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۗۙ(Ll/᩺ۜ᩸;)Ll/᩺ۜ᩸;

    move-result-object v0

    if-eqz v0, :cond_42

    .line 8978
    invoke-static {v0}, Ll/᩺ۜ᩸;->ܶ(Ll/᩺ۜ᩸;)Ll/ۖ۠᩸;

    move-result-object v3

    invoke-direct {v3}, Ll/ۖ۠᩸;->᩷()V

    .line 8979
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 8980
    invoke-static {v2}, Ll/᩺ۜ᩸;->۬(Ll/᩺ۜ᩸;)Ll/֫᩷ᩴ;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 8982
    new-instance v4, Ll/ᩳ۠᩸;

    invoke-direct {v4, v1, v0, v3}, Ll/ᩳ۠᩸;-><init>(Ll/ۖ۠᩸;Ll/᩺ۜ᩸;Ll/֫᩷ᩴ;)V

    invoke-static {v2, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ljava/lang/Runnable;)V

    return v8

    .line 8992
    :cond_3f
    invoke-static {v2}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_46

    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-nez v3, :cond_46

    invoke-static {v2}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_10

    .line 9010
    :cond_40
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۚۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-eqz v3, :cond_41

    .line 9011
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۢۙ(Ll/᩺ۜ᩸;)V

    .line 9012
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۚ᩸()V

    .line 9013
    invoke-static/range {p2 .. p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_42

    .line 9014
    invoke-static {v2, v8, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;ILandroid/view/MotionEvent;)V

    return v8

    .line 9018
    :cond_41
    invoke-static {v2}, Ll/᩺ۜ᩸;->۫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v3

    if-eqz v3, :cond_43

    .line 9019
    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;Z)V

    .line 9020
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܳ᩸()V

    .line 9021
    invoke-static/range {p2 .. p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_42

    .line 9022
    invoke-static {v2, v6, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;ILandroid/view/MotionEvent;)V

    :cond_42
    :goto_f
    return v8

    .line 9026
    :cond_43
    iget-boolean v3, v1, Ll/ۖ۠᩸;->۟:Z

    if-nez v3, :cond_44

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ᩴ᩸()Z

    move-result v3

    if-eqz v3, :cond_45

    .line 9027
    :cond_44
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 9029
    :cond_45
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 9030
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۜۙ(Ll/᩺ۜ᩸;)V

    goto/16 :goto_14

    .line 8993
    :cond_46
    :goto_10
    invoke-static {v2}, Ll/᩺ۜ᩸;->ᩳۙ(Ll/᩺ۜ᩸;)V

    .line 8994
    invoke-static {v2}, Ll/᩺ۜ᩸;->֫ۙ(Ll/᩺ۜ᩸;)Z

    move-result v0

    if-eqz v0, :cond_47

    const/4 v0, -0x1

    .line 2503
    invoke-virtual {v2, v0}, Ll/᩺ۜ᩸;->ۛ(I)V

    goto :goto_12

    .line 8996
    :cond_47
    invoke-static {v2}, Ll/᩺ۜ᩸;->۠(Ll/᩺ۜ᩸;)Z

    move-result v0

    if-nez v0, :cond_48

    invoke-static {v2}, Ll/᩺ۜ᩸;->ۨ(Ll/᩺ۜ᩸;)Z

    move-result v0

    if-eqz v0, :cond_4b

    .line 8997
    :cond_48
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    .line 8998
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v3

    if-le v0, v3, :cond_49

    move/from16 v17, v3

    move v3, v0

    move/from16 v0, v17

    .line 9004
    :cond_49
    invoke-static {v2}, Ll/᩺ۜ᩸;->ۜ(Ll/᩺ۜ᩸;)Z

    move-result v4

    if-eqz v4, :cond_4a

    goto :goto_11

    :cond_4a
    move v0, v3

    :goto_11
    invoke-virtual {v2, v0}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 9006
    :cond_4b
    :goto_12
    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ܳ(Ll/᩺ۜ᩸;Z)V

    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    .line 9007
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/᩺ۜ᩸;->ܳۤ:J

    return v8

    .line 8757
    :cond_4c
    invoke-virtual {v2, v8}, Landroid/view/View;->setPressed(Z)V

    .line 8758
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۡ()V

    .line 8759
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    move-result v4

    if-nez v4, :cond_4d

    .line 8760
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 8762
    :cond_4d
    iput-boolean v8, v1, Ll/ۖ۠᩸;->۟:Z

    .line 8763
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۡۤ()Z

    move-result v4

    if-eqz v4, :cond_4e

    .line 8764
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8766
    :cond_4e
    iput-boolean v9, v1, Ll/ۖ۠᩸;->ۗۙ:Z

    .line 8767
    iput v9, v1, Ll/ۖ۠᩸;->۫ۙ:I

    .line 8768
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v5, v4

    iput v5, v1, Ll/ۖ۠᩸;->ܰ:I

    .line 8769
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v5, v4

    iput v5, v1, Ll/ۖ۠᩸;->᩶:I

    .line 8770
    iput-boolean v9, v1, Ll/ۖ۠᩸;->ܽۙ:Z

    .line 8771
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v4

    .line 8772
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v5

    if-le v4, v5, :cond_4f

    move/from16 v17, v5

    move v5, v4

    move/from16 v4, v17

    .line 8778
    :cond_4f
    iget-object v6, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    invoke-virtual {v6, v7}, Ll/۬ۡ᩸;->᩷(F)F

    move-result v6

    .line 8781
    iget-object v7, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 675
    iget-boolean v11, v7, Ll/۬ۡ᩸;->ۗ:Z

    if-eqz v11, :cond_51

    .line 667
    iget-object v7, v7, Ll/۬ۡ᩸;->ܶ:Ll/᩸᩷ܺ;

    .line 8782
    iget v11, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v11

    if-eqz v11, :cond_51

    .line 8783
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->ᩴ(Ll/᩺ۜ᩸;Z)V

    .line 8784
    iget v0, v7, Ll/᩸᩷ܺ;->ᩴ:F

    sub-float/2addr v0, v6

    iput v0, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    .line 8785
    invoke-static {v2}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_50

    .line 8786
    invoke-static {v2}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8787
    :cond_50
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8788
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return v8

    .line 8790
    :cond_51
    iget-object v7, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 679
    iget-boolean v11, v7, Ll/۬ۡ᩸;->᩹:Z

    if-eqz v11, :cond_53

    .line 671
    iget-object v7, v7, Ll/۬ۡ᩸;->ܽ:Ll/᩸᩷ܺ;

    .line 8791
    iget v11, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Ll/᩸᩷ܺ;->ۙ(FF)Z

    move-result v11

    if-eqz v11, :cond_53

    .line 8792
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;Z)V

    .line 8793
    iget v0, v7, Ll/᩸᩷ܺ;->᩷:F

    iget v3, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    iput v0, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    .line 8794
    invoke-static {v2}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_52

    .line 8795
    invoke-static {v2}, Ll/᩺ۜ᩸;->֡(Ll/᩺ۜ᩸;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8796
    :cond_52
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    .line 8797
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return v8

    :cond_53
    if-ne v4, v5, :cond_54

    .line 8800
    iget-object v4, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 654
    iget-object v4, v4, Ll/۬ۡ᩸;->֫ۙ:Landroid/graphics/RectF;

    .line 8801
    iget v5, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v5, v5

    invoke-virtual {v4, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v5

    if-eqz v5, :cond_56

    .line 8802
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->ܳ(Ll/᩺ۜ᩸;Z)V

    .line 8803
    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget v7, v4, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v7

    div-float/2addr v5, v10

    iget v7, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v7, v7

    sub-float/2addr v5, v7

    iput v5, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    .line 8804
    iget v4, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    .line 8805
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 8806
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 8807
    iput v9, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8808
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    return v8

    .line 8811
    :cond_54
    iget-object v7, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 658
    iget-object v7, v7, Ll/۬ۡ᩸;->ۧۙ:Landroid/graphics/RectF;

    .line 8811
    iget v11, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v11, v11

    invoke-virtual {v7, v11, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v11

    const/high16 v12, 0x40800000    # 4.0f

    if-eqz v11, :cond_55

    .line 8812
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    .line 8813
    invoke-static {v2, v5}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;I)V

    .line 8814
    iget v4, v7, Landroid/graphics/RectF;->left:F

    iget v5, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v5, v4

    const/high16 v11, 0x40400000    # 3.0f

    mul-float v5, v5, v11

    div-float/2addr v5, v12

    add-float/2addr v5, v4

    iget v4, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v4, v4

    sub-float/2addr v5, v4

    iput v5, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    .line 8815
    iget v4, v7, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    .line 8816
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->ۤ(Ll/᩺ۜ᩸;Z)V

    .line 8817
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 8818
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 8819
    iput v9, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8820
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    return v8

    .line 8822
    :cond_55
    iget-object v5, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 662
    iget-object v5, v5, Ll/۬ۡ᩸;->᩻ۙ:Landroid/graphics/RectF;

    .line 8822
    iget v7, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v7, v7

    invoke-virtual {v5, v7, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v7

    if-eqz v7, :cond_56

    .line 8823
    invoke-static {v2, v8}, Ll/᩺ۜ᩸;->᩷(Ll/᩺ۜ᩸;Z)V

    .line 8824
    invoke-static {v2, v4}, Ll/᩺ۜ᩸;->᩸(Ll/᩺ۜ᩸;I)V

    .line 8825
    iget v4, v5, Landroid/graphics/RectF;->left:F

    iget v7, v5, Landroid/graphics/RectF;->right:F

    sub-float/2addr v7, v4

    div-float/2addr v7, v12

    add-float/2addr v7, v4

    iget v4, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v4, v4

    sub-float/2addr v7, v4

    iput v7, v1, Ll/ۖ۠᩸;->᩸ۙ:F

    .line 8826
    iget v4, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v5

    div-float/2addr v5, v10

    sub-float/2addr v4, v5

    iput v4, v1, Ll/ۖ۠᩸;->ᩴۙ:F

    .line 8827
    invoke-static {v2, v9}, Ll/᩺ۜ᩸;->ۤ(Ll/᩺ۜ᩸;Z)V

    .line 8828
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v10

    add-float/2addr v5, v4

    invoke-virtual {v3}, Ll/ۚۚܺ;->֫()F

    move-result v3

    add-float/2addr v3, v5

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iput v3, v2, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 8829
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v2, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 8830
    iput v9, v2, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 8831
    invoke-direct {v1, v8}, Ll/ۖ۠᩸;->ۙ(Z)V

    return v8

    .line 8390
    :cond_56
    iget-boolean v3, v3, Ll/ܰۤᩴ;->᩵᩷:Z

    if-eqz v3, :cond_59

    .line 8391
    invoke-static/range {p2 .. p2}, Ll/᩺ۜ᩸;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_59

    .line 8410
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v3

    and-int/2addr v3, v8

    if-eqz v3, :cond_59

    .line 8392
    iget-object v3, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    .line 8393
    invoke-virtual {v3}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v3

    if-nez v3, :cond_59

    .line 8394
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 8418
    invoke-static {v2, v3, v4}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;FF)Z

    move-result v4

    if-nez v4, :cond_57

    const/4 v3, 0x0

    goto :goto_13

    .line 8421
    :cond_57
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 8422
    invoke-static {v2, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;F)Z

    move-result v3

    xor-int/2addr v3, v8

    :goto_13
    if-nez v3, :cond_58

    goto :goto_14

    .line 8397
    :cond_58
    iput-boolean v8, v1, Ll/ۖ۠᩸;->ۤۙ:Z

    .line 8398
    iput-boolean v9, v1, Ll/ۖ۠᩸;->᩷ۙ:Z

    .line 8399
    iput-boolean v9, v1, Ll/ۖ۠᩸;->ۙۙ:Z

    .line 8400
    iget-object v3, v2, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget v4, v1, Ll/ۖ۠᩸;->ܰ:I

    int-to-float v4, v4

    iget v5, v1, Ll/ۖ۠᩸;->᩶:I

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Ll/۬ۡ᩸;->ۙ(FF)I

    move-result v3

    iput v3, v1, Ll/ۖ۠᩸;->ۜ:I

    .line 8401
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, v1, Ll/ۖ۠᩸;->ۖ:F

    .line 8402
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, v1, Ll/ۖ۠᩸;->۠:F

    .line 9033
    :cond_59
    :goto_14
    invoke-static {v2}, Ll/᩺ۜ᩸;->ܽ(Ll/᩺ۜ᩸;)Ll/᩺ۡ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/᩺ۡ;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
