.class public final Ll/ܶۙܳ;
.super Landroid/widget/FrameLayout;
.source "YIPT"


# instance fields
.field public ֡:I

.field public ܰ:Landroid/animation/ValueAnimator;

.field public ܿ:F

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    iput p1, p0, Ll/ܶۙܳ;->ܿ:F

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ll/ܶۙܳ;->᩶:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/ܶۙܳ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Ll/ܶۙܳ;->ܿ:F

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܶۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۙܳ;->᩶:Z

    return p0
.end method

.method private ۤ()V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    return-void

    .line 70
    :cond_0
    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    .line 71
    iget-object v0, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 72
    iget-object v0, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܶۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 2

    .line 84
    invoke-direct {p0}, Ll/ܶۙܳ;->ۤ()V

    .line 85
    iget-boolean v0, p0, Ll/ܶۙܳ;->᩶:Z

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput v1, p0, Ll/ܶۙܳ;->ܿ:F

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    .line 86
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 87
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 77
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p0, Ll/ܶۙܳ;->֡:I

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget p2, p0, Ll/ܶۙܳ;->֡:I

    int-to-float p2, p2

    iget v0, p0, Ll/ܶۙܳ;->ܿ:F

    mul-float p2, p2, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ۙ()F
    .locals 1

    .line 23
    iget v0, p0, Ll/ܶۙܳ;->ܿ:F

    return v0
.end method

.method public final ۙ(I)I
    .locals 3

    .line 27
    invoke-direct {p0}, Ll/ܶۙܳ;->ۤ()V

    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 29
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v2, -0x80000000

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 29
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->measure(II)V

    .line 31
    iget p1, p0, Ll/ܶۙܳ;->֡:I

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ۙ(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 35
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/ܶۙܳ;->ܿ:F

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ۙ(ZZ)V
    .locals 4

    if-eqz p1, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 42
    :goto_0
    iget-boolean v1, p0, Ll/ܶۙܳ;->᩶:Z

    if-ne v1, p1, :cond_3

    if-eqz p2, :cond_1

    iget-object v1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    if-nez v1, :cond_3

    iget v1, p0, Ll/ܶۙܳ;->ܿ:F

    cmpl-float v1, v1, v0

    if-nez v1, :cond_3

    :cond_2
    return-void

    .line 43
    :cond_3
    iput-boolean p1, p0, Ll/ܶۙܳ;->᩶:Z

    .line 44
    invoke-direct {p0}, Ll/ܶۙܳ;->ۤ()V

    const/4 v1, 0x0

    if-eqz p2, :cond_6

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p2

    if-eqz p2, :cond_6

    iget p2, p0, Ll/ܶۙܳ;->ܿ:F

    cmpl-float p2, p2, v0

    if-nez p2, :cond_4

    goto :goto_2

    .line 51
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    iget p2, p0, Ll/ܶۙܳ;->ܿ:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    aput p2, v2, v1

    const/4 p2, 0x1

    aput v0, v2, p2

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    .line 53
    iget v2, p0, Ll/ܶۙܳ;->ܿ:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x43480000    # 200.0f

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-long v2, p2

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    iget-object p2, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_5

    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    goto :goto_1

    :cond_5
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    :goto_1
    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 55
    iget-object p1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    new-instance p2, Ll/ܺۙܳ;

    invoke-direct {p2, p0}, Ll/ܺۙܳ;-><init>(Ll/ܶۙܳ;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    iget-object p1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    new-instance p2, Ll/ܽۙܳ;

    invoke-direct {p2, p0}, Ll/ܽۙܳ;-><init>(Ll/ܶۙܳ;)V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 65
    iget-object p1, p0, Ll/ܶۙܳ;->ܰ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    .line 46
    :cond_6
    :goto_2
    iput v0, p0, Ll/ܶۙܳ;->ܿ:F

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/16 v1, 0x8

    .line 47
    :goto_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Ll/ܶۙܳ;->᩶:Z

    return v0
.end method
