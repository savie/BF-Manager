.class public final Ll/᩻ۙܳ;
.super Landroid/widget/LinearLayout;
.source "DIQO"


# instance fields
.field public ֡:I

.field public ֨:Ll/ۧۙܳ;

.field public ۖ:F

.field public ۙۙ:Landroid/view/VelocityTracker;

.field public final ۜ:I

.field public ۟:Z

.field public ۠:Landroid/view/View;

.field public ۡ:Z

.field public ۢ:Ll/ܶۙܳ;

.field public ۬:Z

.field public ܰ:Z

.field public ܿ:F

.field public final ᩳ:F

.field public ᩶:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Ll/᩻ۙܳ;->ۜ:I

    .line 33
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    int-to-float p1, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x43fa0000    # 500.0f

    mul-float p2, p2, v0

    .line 33
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/᩻ۙܳ;->ᩳ:F

    return-void
.end method

.method private ۙ()V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private ۙ(Landroid/view/MotionEvent;)V
    .locals 3

    .line 130
    iget-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    return-void

    .line 132
    :cond_0
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 133
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    sub-float/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 134
    iget-object p1, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 135
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public static ۙ(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 126
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    int-to-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ᩷(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 75
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iget v1, p0, Ll/᩻ۙܳ;->ܿ:F

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v1, p0, Ll/᩻ۙܳ;->᩶:F

    sub-float/2addr p1, v1

    .line 76
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget v2, p0, Ll/᩻ۙܳ;->ۜ:I

    int-to-float v2, v2

    const/4 v3, 0x0

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    return v3

    .line 77
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float p1, p1, v1

    if-gez p1, :cond_3

    const/4 p1, 0x0

    cmpg-float v1, v0, p1

    if-gez v1, :cond_1

    iget-object v1, p0, Ll/᩻ۙܳ;->֨:Ll/ۧۙܳ;

    invoke-interface {v1}, Ll/ۧۙܳ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    cmpl-float v1, v0, p1

    if-lez v1, :cond_2

    iget-object v1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    .line 78
    invoke-virtual {v1}, Ll/ܶۙܳ;->ۙ()F

    move-result v1

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Ll/᩻ۙܳ;->۟:Z

    .line 84
    iget-object v1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-virtual {v1}, Ll/ܶۙܳ;->ۙ()F

    move-result v1

    iput v1, p0, Ll/᩻ۙܳ;->ۖ:F

    .line 85
    iget-object v1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܶۙܳ;->ۙ(I)I

    move-result v1

    iput v1, p0, Ll/᩻ۙܳ;->֡:I

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 87
    iget-object v1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    iget v2, p0, Ll/᩻ۙܳ;->ۖ:F

    iget v3, p0, Ll/᩻ۙܳ;->֡:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    sub-float/2addr v2, v0

    invoke-virtual {v1, v2}, Ll/ܶۙܳ;->ۙ(F)V

    return p1

    .line 79
    :cond_3
    :goto_0
    iput-boolean v3, p0, Ll/᩻ۙܳ;->۬:Z

    .line 80
    invoke-direct {p0}, Ll/᩻ۙܳ;->ۙ()V

    return v3
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Ll/᩻ۙܳ;->۟:Z

    iput-boolean v0, p0, Ll/᩻ۙܳ;->۬:Z

    .line 144
    invoke-direct {p0}, Ll/᩻ۙܳ;->ۙ()V

    .line 145
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public final onFinishInflate()V
    .locals 1

    .line 38
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    const v0, 0x7f0a02d2

    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶۙܳ;

    iput-object v0, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    const v0, 0x7f0a0272

    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۙܳ;->۠:Landroid/view/View;

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    const/4 p1, 0x5

    if-eq v0, p1, :cond_1

    goto :goto_0

    .line 59
    :cond_0
    iget-boolean v0, p0, Ll/᩻ۙܳ;->۬:Z

    if-eqz v0, :cond_5

    .line 60
    invoke-direct {p0, p1}, Ll/᩻ۙܳ;->ۙ(Landroid/view/MotionEvent;)V

    .line 61
    invoke-direct {p0, p1}, Ll/᩻ۙܳ;->᩷(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v2

    .line 67
    :cond_1
    iput-boolean v1, p0, Ll/᩻ۙܳ;->۬:Z

    .line 68
    invoke-direct {p0}, Ll/᩻ۙܳ;->ۙ()V

    goto :goto_0

    .line 48
    :cond_2
    invoke-direct {p0}, Ll/᩻ۙܳ;->ۙ()V

    .line 49
    iput-boolean v1, p0, Ll/᩻ۙܳ;->ܰ:Z

    iput-boolean v1, p0, Ll/᩻ۙܳ;->۟:Z

    .line 50
    iget-object v0, p0, Ll/᩻ۙܳ;->֨:Ll/ۧۙܳ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩻ۙܳ;->۠:Landroid/view/View;

    invoke-static {v0, p1}, Ll/᩻ۙܳ;->ۙ(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-static {v0, p1}, Ll/᩻ۙܳ;->ۙ(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, p0, Ll/᩻ۙܳ;->۬:Z

    if-eqz v1, :cond_5

    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/᩻ۙܳ;->᩶:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Ll/᩻ۙܳ;->ܿ:F

    .line 53
    iget-object v0, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-virtual {v0}, Ll/ܶۙܳ;->᩷()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    .line 54
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    .line 55
    invoke-direct {p0, p1}, Ll/᩻ۙܳ;->ۙ(Landroid/view/MotionEvent;)V

    .line 71
    :cond_5
    :goto_0
    iget-boolean p1, p0, Ll/᩻ۙܳ;->۟:Z

    return p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 92
    iget-boolean v0, p0, Ll/᩻ۙܳ;->۬:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻ۙܳ;->۟:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 94
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Ll/᩻ۙܳ;->ۙ(Landroid/view/MotionEvent;)V

    .line 95
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_7

    const/4 v4, 0x2

    if-eq v0, v4, :cond_4

    if-eq v0, v1, :cond_7

    const/4 p1, 0x5

    if-eq v0, p1, :cond_2

    goto :goto_1

    .line 101
    :cond_2
    iget-boolean p1, p0, Ll/᩻ۙܳ;->۟:Z

    if-eqz p1, :cond_3

    iput-boolean v3, p0, Ll/᩻ۙܳ;->ܰ:Z

    iget-object p1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    invoke-virtual {p1, v0, v3}, Ll/ܶۙܳ;->ۙ(ZZ)V

    return v3

    .line 102
    :cond_3
    iput-boolean v2, p0, Ll/᩻ۙܳ;->۬:Z

    return v3

    .line 97
    :cond_4
    iget-boolean v0, p0, Ll/᩻ۙܳ;->۟:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ll/᩻ۙܳ;->۬:Z

    if-eqz v0, :cond_5

    invoke-direct {p0, p1}, Ll/᩻ۙܳ;->᩷(Landroid/view/MotionEvent;)Z

    .line 98
    :cond_5
    iget-boolean v0, p0, Ll/᩻ۙܳ;->۟:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ܰ:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    iget v1, p0, Ll/᩻ۙܳ;->ۖ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iget v2, p0, Ll/᩻ۙܳ;->ܿ:F

    sub-float/2addr p1, v2

    iget v2, p0, Ll/᩻ۙܳ;->֡:I

    int-to-float v2, v2

    div-float/2addr p1, v2

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Ll/ܶۙܳ;->ۙ(F)V

    :cond_6
    :goto_1
    return v3

    .line 106
    :cond_7
    iget-boolean v0, p0, Ll/᩻ۙܳ;->۟:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ܰ:Z

    if-nez v0, :cond_c

    .line 107
    iget-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 108
    iget-object v0, p0, Ll/᩻ۙܳ;->ۙۙ:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 109
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-ne v4, v1, :cond_8

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    goto :goto_3

    .line 110
    :cond_8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v4, p0, Ll/᩻ۙܳ;->ᩳ:F

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_9

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_a

    goto :goto_2

    :cond_9
    iget-object v0, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-virtual {v0}, Ll/ܶۙܳ;->ۙ()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_a

    :goto_2
    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_b

    .line 111
    iget-object v1, p0, Ll/᩻ۙܳ;->֨:Ll/ۧۙܳ;

    invoke-interface {v1}, Ll/ۧۙܳ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v0, 0x0

    .line 112
    :cond_b
    iget-object v1, p0, Ll/᩻ۙܳ;->ۢ:Ll/ܶۙܳ;

    invoke-virtual {v1, v0, v3}, Ll/ܶۙܳ;->ۙ(ZZ)V

    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-ne p1, v3, :cond_c

    iget-object p1, p0, Ll/᩻ۙܳ;->֨:Ll/ۧۙܳ;

    invoke-interface {p1, v0}, Ll/ۧۙܳ;->ۙ(Z)V

    .line 116
    :cond_c
    iput-boolean v2, p0, Ll/᩻ۙܳ;->۟:Z

    iput-boolean v2, p0, Ll/᩻ۙܳ;->۬:Z

    .line 117
    invoke-direct {p0}, Ll/᩻ۙܳ;->ۙ()V

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v3
.end method

.method public final ۙ(Ll/ۧۙܳ;)V
    .locals 0

    .line 43
    iput-object p1, p0, Ll/᩻ۙܳ;->֨:Ll/ۧۙܳ;

    return-void
.end method
