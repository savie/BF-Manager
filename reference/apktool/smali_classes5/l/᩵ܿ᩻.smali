.class public Ll/᩵ܿ᩻;
.super Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.source "I5VL"


# instance fields
.field public ֡:Z

.field public ֨:I

.field public ֫ۙ:F

.field public ۖ:Landroid/view/WindowManager$LayoutParams;

.field public ۙۙ:Z

.field public ۚۙ:Landroid/animation/AnimatorSet;

.field public ۜ:I

.field public ۟:Landroid/animation/ValueAnimator;

.field public ۠:I

.field public ۡ:F

.field public ۢ:Ll/۬ۖۧ;

.field public final ۤۙ:Ljava/lang/String;

.field public ۧۙ:F

.field public ۫ۙ:Z

.field public ۬:Landroid/graphics/Point;

.field public ܰ:Z

.field public ܳۙ:Z

.field public ܺۙ:Landroid/view/WindowManager;

.field public ܿ:F

.field public ᩳ:Z

.field public final ᩴۙ:Ljava/lang/String;

.field public ᩶:F

.field public ᩷ۙ:F

.field public ᩸ۙ:F

.field public ᩻ۙ:Landroid/view/VelocityTracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 67
    invoke-direct {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    iput v1, p0, Ll/᩵ܿ᩻;->ۡ:F

    .line 48
    new-instance v1, Ll/۬ۖۧ;

    new-instance v2, Ll/ۙۡۙ;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Ll/ۙۡۙ;-><init>(I)V

    invoke-direct {v1, p0, v2}, Ll/۬ۖۧ;-><init>(Ljava/lang/Object;Ll/ۜۖۧ;)V

    iput-object v1, p0, Ll/᩵ܿ᩻;->ۢ:Ll/۬ۖۧ;

    .line 272
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ܿ᩻;->᩻ۙ:Landroid/view/VelocityTracker;

    const-string v1, "fbpx:"

    .line 68
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ܿ᩻;->ۤۙ:Ljava/lang/String;

    const-string v1, "fbpy:"

    .line 69
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ܿ᩻;->ᩴۙ:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "window"

    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    .line 71
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 73
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p2

    .line 75
    iput p2, p0, Ll/᩵ܿ᩻;->ۧۙ:F

    .line 76
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p2

    iput p2, p0, Ll/᩵ܿ᩻;->֨:I

    .line 77
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    mul-int/lit8 p1, p1, 0x8

    int-to-float p1, p1

    iput p1, p0, Ll/᩵ܿ᩻;->֫ۙ:F

    const/4 p1, 0x0

    .line 80
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatElevation(F)V

    const p1, 0x3f59999a    # 0.85f

    .line 81
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x1

    .line 82
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setSize(I)V

    return-void
.end method

.method public static ۙ(FI)I
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_1

    move p0, p1

    :cond_1
    :goto_0
    float-to-int p0, p0

    return p0
.end method

.method public static ۙ(Landroid/content/Context;Ljava/lang/String;)Ll/᩵ܿ᩻;
    .locals 1

    .line 94
    new-instance v0, Ll/᩵ܿ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩵ܿ᩻;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method private ۙ(II)V
    .locals 4

    .line 146
    iget-object v0, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 147
    iget v2, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v2, p2

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 148
    iget-object p2, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Ll/᩵ܿ᩻;->᩷ۙ:F

    int-to-float v3, v1

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2, v1}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v1

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 149
    iget-object p2, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Ll/᩵ܿ᩻;->᩸ۙ:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v0, v0, Landroid/graphics/Point;->y:I

    div-int/lit8 v0, v0, 0x3

    goto :goto_0

    .line 150
    :cond_0
    iget v0, p0, Ll/᩵ܿ᩻;->᩸ۙ:F

    int-to-float v1, p1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_0
    int-to-float v0, v0

    .line 149
    invoke-static {v0, p1}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result p1

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    return-void
.end method

.method public static synthetic ۙ(Ll/᩵ܿ᩻;)V
    .locals 7

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 51
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    mul-float v0, v0, v1

    .line 52
    iget-object v1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    if-nez v1, :cond_1

    neg-float v0, v0

    .line 55
    :cond_1
    iget v1, p0, Ll/᩵ܿ᩻;->ۡ:F

    const v2, 0x3f4ccccd    # 0.8f

    mul-float v2, v2, v1

    const v3, 0x3eb33333    # 0.35f

    mul-float v1, v1, v3

    const/4 v3, 0x2

    new-array v4, v3, [F

    const/4 v5, 0x0

    aput v2, v4, v5

    const/4 v2, 0x1

    aput v1, v4, v2

    const-string v1, "alpha"

    invoke-static {p0, v1, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    new-array v4, v3, [F

    const/4 v6, 0x0

    aput v6, v4, v5

    aput v0, v4, v2

    const-string v0, "translationX"

    .line 56
    invoke-static {p0, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 58
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v1, v3, v5

    aput-object v0, v3, v2

    .line 59
    invoke-virtual {v4, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x12c

    .line 60
    invoke-virtual {v4, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 61
    iput-object v4, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    .line 62
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 63
    iput-boolean v2, p0, Ll/᩵ܿ᩻;->۫ۙ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/᩵ܿ᩻;[JLl/ۗܿ᩻;IILandroid/animation/ValueAnimator;)V
    .locals 5

    .line 372
    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getCurrentPlayTime()J

    move-result-wide v0

    const/4 v2, 0x0

    .line 373
    aget-wide v3, p1, v2

    sub-long v3, v0, v3

    long-to-float v3, v3

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    .line 374
    aput-wide v0, p1, v2

    const/4 p1, 0x0

    cmpg-float v4, v3, p1

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    cmpl-float v4, v3, p1

    if-lez v4, :cond_1

    if-nez v2, :cond_1

    const v2, 0x3d03126f    # 0.032f

    .line 380
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 381
    invoke-virtual {p2, p3, v2, p4}, Ll/ۗܿ᩻;->ۙ(IFI)Z

    move-result v4

    sub-float/2addr v3, v2

    move v2, v4

    goto :goto_0

    :cond_1
    const-wide/16 v3, 0x3e8

    const/4 p1, 0x1

    cmp-long p4, v0, v3

    if-ltz p4, :cond_2

    if-nez v2, :cond_2

    .line 385
    invoke-virtual {p2, p3}, Ll/ۗܿ᩻;->ۙ(I)V

    const/4 v2, 0x1

    .line 388
    :cond_2
    iget-object p3, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget p4, p2, Ll/ۗܿ᩻;->ᩴ:F

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    iput p4, p3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 389
    iget-object p3, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget p2, p2, Ll/ۗܿ᩻;->ܳ:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 390
    iput-boolean p1, p0, Ll/᩵ܿ᩻;->ۙۙ:Z

    .line 391
    iget-boolean p1, p0, Ll/᩵ܿ᩻;->ܰ:Z

    if-eqz p1, :cond_3

    .line 392
    iget-object p1, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    iget-object p2, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    if-eqz v2, :cond_4

    const/4 p1, 0x0

    .line 395
    iput-object p1, p0, Ll/᩵ܿ᩻;->۟:Landroid/animation/ValueAnimator;

    .line 396
    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 397
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ᩴ()V

    .line 398
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ܳ()V

    :cond_4
    :goto_1
    return-void
.end method

.method private ܳ()V
    .locals 5

    .line 210
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    .line 195
    :cond_0
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->۫ۙ:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 196
    :cond_1
    iput-boolean v2, p0, Ll/᩵ܿ᩻;->۫ۙ:Z

    const v0, 0x3f4ccccd    # 0.8f

    .line 197
    iget v3, p0, Ll/᩵ܿ᩻;->ۡ:F

    mul-float v3, v3, v0

    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 198
    invoke-virtual {p0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationX(F)V

    .line 200
    :cond_2
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۢ:Ll/۬ۖۧ;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 201
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v3, "floating_button_stick_to_edge"

    const/4 v4, 0x1

    invoke-interface {v1, v3, v4}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide/16 v3, 0xbb8

    .line 202
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    return-void
.end method

.method private ᩴ()V
    .locals 5

    .line 157
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->ۙۙ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_0

    goto :goto_2

    .line 159
    :cond_0
    iget-object v0, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 160
    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v3, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 161
    :cond_1
    iget-object v4, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v4, v4

    invoke-static {v4, v1}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v4

    int-to-float v4, v4

    int-to-float v1, v1

    div-float v1, v4, v1

    :goto_0
    iput v1, p0, Ll/᩵ܿ᩻;->᩷ۙ:F

    if-nez v0, :cond_2

    goto :goto_1

    .line 162
    :cond_2
    iget-object v1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v1, v1

    invoke-static {v1, v0}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v3, v1, v0

    :goto_1
    iput v3, p0, Ll/᩵ܿ᩻;->᩸ۙ:F

    .line 163
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ܿ᩻;->ۤۙ:Ljava/lang/String;

    iget v3, p0, Ll/᩵ܿ᩻;->᩷ۙ:F

    .line 164
    invoke-interface {v0, v1, v3}, Ll/ᩳ֫ܺ;->putFloat(Ljava/lang/String;F)Ll/ᩳ֫ܺ;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ܿ᩻;->ᩴۙ:Ljava/lang/String;

    iget v3, p0, Ll/᩵ܿ᩻;->᩸ۙ:F

    .line 165
    invoke-interface {v0, v1, v3}, Ll/ᩳ֫ܺ;->putFloat(Ljava/lang/String;F)Ll/ᩳ֫ܺ;

    move-result-object v0

    .line 166
    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    .line 167
    iput-boolean v2, p0, Ll/᩵ܿ᩻;->ۙۙ:Z

    :cond_3
    :goto_2
    return-void
.end method

.method private ᩸()V
    .locals 1

    .line 220
    iget-object v0, p0, Ll/᩵ܿ᩻;->۟:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 221
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 222
    iput-object v0, p0, Ll/᩵ܿ᩻;->۟:Landroid/animation/ValueAnimator;

    .line 224
    :cond_0
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ᩴ()V

    return-void
.end method


# virtual methods
.method public final hide()V
    .locals 2

    const/16 v0, 0x8

    .line 179
    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۢ:Ll/۬ۖۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 181
    invoke-direct {p0}, Ll/᩵ܿ᩻;->᩸()V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 241
    invoke-super {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 242
    iput-boolean v0, p0, Ll/᩵ܿ᩻;->ܰ:Z

    .line 243
    iput-boolean v0, p0, Ll/᩵ܿ᩻;->ᩳ:Z

    .line 244
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ܳ()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 258
    invoke-direct {p0}, Ll/᩵ܿ᩻;->᩸()V

    .line 259
    iget-object p1, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 260
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->ܰ:Z

    if-eqz v0, :cond_0

    .line 261
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/᩵ܿ᩻;->ۙ(II)V

    .line 262
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 249
    invoke-super {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 250
    iput-boolean v0, p0, Ll/᩵ܿ᩻;->ܰ:Z

    .line 251
    iget-object v1, p0, Ll/᩵ܿ᩻;->ۢ:Ll/۬ۖۧ;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 210
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    .line 253
    :cond_0
    invoke-direct {p0}, Ll/᩵ܿ᩻;->᩸()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 232
    iget-boolean p1, p0, Ll/᩵ܿ᩻;->ᩳ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 233
    iput-boolean p1, p0, Ll/᩵ܿ᩻;->ᩳ:Z

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 234
    invoke-direct {p0, p4, p5}, Ll/᩵ܿ᩻;->ۙ(II)V

    .line 235
    iget-object p1, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    iget-object p2, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 282
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->ܰ:Z

    if-nez v0, :cond_0

    .line 283
    invoke-super {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 284
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 285
    iget-object v1, p0, Ll/᩵ܿ᩻;->᩻ۙ:Landroid/view/VelocityTracker;

    if-nez v0, :cond_1

    .line 286
    invoke-direct {p0}, Ll/᩵ܿ᩻;->᩸()V

    .line 287
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    .line 347
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    .line 348
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-float/2addr v3, v4

    .line 349
    invoke-virtual {p1, v2, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 351
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    neg-float v2, v2

    neg-float v3, v3

    .line 354
    invoke-virtual {p1, v2, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    const/4 v4, 0x2

    .line 290
    iget-object v5, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    if-eq v0, v3, :cond_4

    if-eq v0, v4, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_4

    goto/16 :goto_0

    .line 303
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 304
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    .line 305
    iget v1, p0, Ll/᩵ܿ᩻;->᩶:F

    sub-float/2addr v1, v0

    .line 306
    iget v0, p0, Ll/᩵ܿ᩻;->ܿ:F

    sub-float/2addr v0, p1

    .line 307
    iget-boolean p1, p0, Ll/᩵ܿ᩻;->֡:Z

    if-nez p1, :cond_3

    .line 308
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 309
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float p1, p1, p1

    mul-float v4, v4, v4

    add-float/2addr v4, p1

    .line 310
    iget p1, p0, Ll/᩵ܿ᩻;->ۧۙ:F

    cmpl-float p1, v4, p1

    if-lez p1, :cond_3

    .line 311
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 312
    iput-boolean v3, p0, Ll/᩵ܿ᩻;->֡:Z

    .line 315
    :cond_3
    iget-boolean p1, p0, Ll/᩵ܿ᩻;->֡:Z

    if-eqz p1, :cond_7

    .line 316
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ܳ()V

    .line 317
    iget-object p1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Ll/᩵ܿ᩻;->۠:I

    int-to-float v2, v2

    sub-float/2addr v2, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-static {v2, v1}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v1

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 318
    iget-object p1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Ll/᩵ܿ᩻;->ۜ:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iget v0, v5, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 319
    iput-boolean v3, p0, Ll/᩵ܿ᩻;->ۙۙ:Z

    .line 320
    iget-object p1, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return v3

    .line 325
    :cond_4
    iget-boolean p1, p0, Ll/᩵ܿ᩻;->ܳۙ:Z

    .line 326
    iput-boolean v2, p0, Ll/᩵ܿ᩻;->ܳۙ:Z

    .line 327
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ܳ()V

    .line 328
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 329
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 330
    :cond_5
    iget-boolean v6, p0, Ll/᩵ܿ᩻;->֡:Z

    if-eqz v6, :cond_6

    const/16 p1, 0x3e8

    .line 331
    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 332
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    .line 333
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 362
    invoke-direct {p0}, Ll/᩵ܿ᩻;->᩸()V

    .line 363
    iget v1, v5, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int/2addr v1, v6

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 364
    iget v5, v5, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 365
    iget v6, p0, Ll/᩵ܿ᩻;->֨:I

    neg-int v7, v6

    int-to-float v7, v7

    int-to-float v6, v6

    invoke-static {p1, v6}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v7, p1}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 366
    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v7, p1}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 367
    new-instance p1, Ll/ۗܿ᩻;

    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v0, v0

    invoke-static {v0, v1}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v0

    int-to-float v7, v0

    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v0, v0

    invoke-static {v0, v5}, Ll/᩵ܿ᩻;->ۙ(FI)I

    move-result v0

    int-to-float v8, v0

    iget v12, p0, Ll/᩵ܿ᩻;->֫ۙ:F

    move-object v6, p1

    move v11, v1

    invoke-direct/range {v6 .. v12}, Ll/ۗܿ᩻;-><init>(FFFFIF)V

    new-array v8, v3, [J

    const-wide/16 v6, 0x0

    aput-wide v6, v8, v2

    new-array v0, v4, [F

    .line 370
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 371
    new-instance v2, Ll/᩹ܿ᩻;

    move-object v6, v2

    move-object v7, p0

    move-object v9, p1

    move v10, v1

    move v11, v5

    invoke-direct/range {v6 .. v11}, Ll/᩹ܿ᩻;-><init>(Ll/᩵ܿ᩻;[JLl/ۗܿ᩻;II)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v1, 0x3e8

    .line 401
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 402
    iput-object v0, p0, Ll/᩵ܿ᩻;->۟:Landroid/animation/ValueAnimator;

    .line 403
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return v3

    :cond_6
    if-ne v0, v3, :cond_7

    if-nez p1, :cond_7

    .line 336
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    :cond_7
    :goto_0
    return v3

    .line 293
    :cond_8
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->۫ۙ:Z

    if-nez v0, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_9
    const/4 v0, 0x0

    goto :goto_2

    :cond_a
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Ll/᩵ܿ᩻;->ܳۙ:Z

    xor-int/2addr v0, v3

    .line 295
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 296
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/᩵ܿ᩻;->᩶:F

    .line 297
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/᩵ܿ᩻;->ܿ:F

    .line 298
    iput-boolean v2, p0, Ll/᩵ܿ᩻;->֡:Z

    .line 299
    iget-object p1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Ll/᩵ܿ᩻;->۠:I

    .line 300
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    iput p1, p0, Ll/᩵ܿ᩻;->ۜ:I

    return v3

    :catchall_0
    move-exception v0

    neg-float v1, v2

    neg-float v2, v3

    .line 354
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 355
    throw v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final show()V
    .locals 4

    const/4 v0, 0x0

    .line 186
    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 187
    invoke-direct {p0}, Ll/᩵ܿ᩻;->ܳ()V

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    .line 189
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    const/4 v3, 0x2

    new-array v3, v3, [F

    aput v2, v3, v0

    const/4 v0, 0x1

    aput v1, v3, v0

    const-string v0, "alpha"

    .line 190
    invoke-static {p0, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public final ۙ()V
    .locals 3

    .line 119
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_1

    .line 120
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    .line 121
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    const/16 v1, 0x7f6

    .line 122
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_0

    :cond_0
    const/16 v1, 0x7d3

    .line 124
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    :goto_0
    const/4 v1, 0x1

    .line 126
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    const v1, 0x800033

    .line 127
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/16 v1, 0x28

    .line 128
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/4 v1, -0x2

    .line 129
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 130
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 133
    :cond_1
    iget-object v0, p0, Ll/᩵ܿ᩻;->۬:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    const/high16 v2, -0x80000000

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 134
    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 135
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->measure(II)V

    .line 136
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    iget-object v1, p0, Ll/᩵ܿ᩻;->ۤۙ:Ljava/lang/String;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Ll/᩵ܿ᩻;->᩷ۙ:F

    .line 137
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    iget-object v1, p0, Ll/᩵ܿ᩻;->ᩴۙ:Ljava/lang/String;

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Ll/᩵ܿ᩻;->᩸ۙ:F

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/᩵ܿ᩻;->ۙ(II)V

    .line 139
    iget-object v0, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    iget-object v1, p0, Ll/᩵ܿ᩻;->ۖ:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ۙ(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_2

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 210
    iget-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩵ܿ᩻;->ۚۙ:Landroid/animation/AnimatorSet;

    .line 114
    :cond_0
    iput p1, p0, Ll/᩵ܿ᩻;->ۡ:F

    .line 115
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->۫ۙ:Z

    if-eqz v0, :cond_1

    const v0, 0x3eb33333    # 0.35f

    goto :goto_0

    :cond_1
    const v0, 0x3f4ccccd    # 0.8f

    :goto_0
    mul-float v0, v0, p1

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 112
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Opacity must be between 0 and 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۤ()V
    .locals 1

    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Ll/᩵ܿ᩻;->ܺۙ:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Ll/᩵ܿ᩻;->ܰ:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
