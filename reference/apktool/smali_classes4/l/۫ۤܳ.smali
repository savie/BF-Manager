.class public final Ll/۫ۤܳ;
.super Ll/ܳ᩻;
.source "JIRB"


# instance fields
.field public final ֡:[Landroid/graphics/drawable/Drawable;

.field public ֨:F

.field public final ۖ:Ll/ۨ᩷ܳ;

.field public ۙۙ:I

.field public ۜ:Z

.field public final ۟:Landroid/graphics/Rect;

.field public final ۠:Landroid/widget/PopupWindow;

.field public final ۡ:[I

.field public ۢ:F

.field public ۬:I

.field public final ܰ:Landroid/graphics/RectF;

.field public ܿ:Z

.field public final ᩳ:Ljava/util/List;

.field public ᩶:J

.field public final ᩷ۙ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;I)V
    .locals 1

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܳ᩻;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    .line 30
    iput v0, p0, Ll/۫ۤܳ;->ۙۙ:I

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    .line 32
    iput-object v0, p0, Ll/۫ۤܳ;->֡:[Landroid/graphics/drawable/Drawable;

    .line 34
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/۫ۤܳ;->ܰ:Landroid/graphics/RectF;

    .line 35
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۫ۤܳ;->᩷ۙ:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 36
    iput-object v0, p0, Ll/۫ۤܳ;->ۡ:[I

    .line 37
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۫ۤܳ;->۟:Landroid/graphics/Rect;

    .line 38
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۤܳ;->ᩳ:Ljava/util/List;

    .line 46
    iput-object p1, p0, Ll/۫ۤܳ;->ۖ:Ll/ۨ᩷ܳ;

    .line 47
    invoke-direct {p0, p2}, Ll/۫ۤܳ;->ۙ(I)V

    .line 48
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 49
    sget p1, Ll/ۗۡ֫;->ۙ:I

    iput p1, p0, Ll/۫ۤܳ;->۬:I

    .line 50
    sget-object p2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, p2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 51
    new-instance p1, Landroid/widget/PopupWindow;

    invoke-direct {p1, p0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/۫ۤܳ;->۠:Landroid/widget/PopupWindow;

    const/4 p2, 0x0

    .line 52
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 54
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 55
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p2, 0x7cf

    .line 56
    invoke-static {p1, p2}, Ll/᩵ۙۙ;->ۙ(Landroid/widget/PopupWindow;I)V

    return-void
.end method

.method private ۙ(I)V
    .locals 4

    .line 61
    iget v0, p0, Ll/۫ۤܳ;->ۙۙ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 62
    :cond_0
    iput p1, p0, Ll/۫ۤܳ;->ۙۙ:I

    .line 63
    iget-object v0, p0, Ll/۫ۤܳ;->֡:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v0, p1

    if-nez v1, :cond_4

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const v1, 0x7f0802d2

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    const v1, 0x7f0802d4

    goto :goto_0

    :cond_2
    const v1, 0x7f0802d3

    .line 67
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Ll/ۡ۟;->ۤ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez p1, :cond_3

    const/16 v2, 0xe6

    goto :goto_1

    :cond_3
    const/16 v2, 0xd2

    .line 68
    :goto_1
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 69
    aput-object v1, v0, p1

    .line 71
    :cond_4
    invoke-virtual {p0, v1}, Ll/ܳ᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private ۙ(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 156
    iget-object v0, p0, Ll/۫ۤܳ;->ۖ:Ll/ۨ᩷ܳ;

    iget-object v1, p0, Ll/۫ۤܳ;->ۡ:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 157
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v2

    .line 158
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    const/4 v4, 0x0

    aget v4, v1, v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    const/4 v4, 0x1

    aget v1, v1, v4

    int-to-float v1, v1

    sub-float/2addr p1, v1

    invoke-virtual {v2, v3, p1}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 159
    :try_start_0
    iget p1, p0, Ll/۫ۤܳ;->ۙۙ:I

    invoke-virtual {v0, v2, p1}, Ll/ۨ᩷ܳ;->ۙ(Landroid/view/MotionEvent;I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    throw p1
.end method

.method private ۚ()V
    .locals 9

    .line 130
    iget-boolean v0, p0, Ll/۫ۤܳ;->ܿ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 131
    iput-boolean v0, p0, Ll/۫ۤܳ;->ܿ:Z

    .line 132
    iget v6, p0, Ll/۫ۤܳ;->ۢ:F

    iget v7, p0, Ll/۫ۤܳ;->֨:F

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x3

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 133
    :try_start_0
    invoke-direct {p0, v0}, Ll/۫ۤܳ;->ۙ(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    throw v1

    .line 135
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/۫ۤܳ;->۠:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 164
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 165
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_0

    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    iget-object p3, p0, Ll/۫ۤܳ;->۟:Landroid/graphics/Rect;

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 167
    iget-object p1, p0, Ll/۫ۤܳ;->ᩳ:Ljava/util/List;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSystemGestureExclusionRects(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 140
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 141
    iget-object v1, p0, Ll/۫ۤܳ;->ۖ:Ll/ۨ᩷ܳ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_1

    .line 142
    iget-boolean v4, p0, Ll/۫ۤܳ;->ۜ:Z

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    iput-boolean v2, p0, Ll/۫ۤܳ;->ܿ:Z

    goto :goto_1

    .line 144
    :cond_1
    iget-boolean v4, p0, Ll/۫ۤܳ;->ܿ:Z

    if-nez v4, :cond_3

    :cond_2
    :goto_0
    return v3

    .line 145
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    iput v4, p0, Ll/۫ۤܳ;->ۢ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    iput v4, p0, Ll/۫ۤܳ;->֨:F

    const/4 v4, 0x3

    if-eq v0, v2, :cond_4

    if-ne v0, v4, :cond_5

    .line 146
    :cond_4
    iput-boolean v3, p0, Ll/۫ۤܳ;->ܿ:Z

    .line 147
    :cond_5
    invoke-direct {p0, p1}, Ll/۫ۤܳ;->ۙ(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 148
    iput-boolean v3, p0, Ll/۫ۤܳ;->ܿ:Z

    :cond_6
    if-eq v0, v2, :cond_8

    if-ne v0, v4, :cond_7

    goto :goto_2

    :cond_7
    return p1

    .line 150
    :cond_8
    :goto_2
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    return p1
.end method

.method public final ۙ(Landroid/graphics/RectF;ZI)V
    .locals 2

    if-eqz p2, :cond_0

    .line 77
    iget-object v0, p0, Ll/۫ۤܳ;->ܰ:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 78
    invoke-direct {p0, p3}, Ll/۫ۤܳ;->ۙ(I)V

    .line 80
    :cond_0
    iget-object p1, p0, Ll/۫ۤܳ;->ۖ:Ll/ۨ᩷ܳ;

    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۗ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۫ۤܳ;->᩶:J

    if-nez p2, :cond_2

    .line 81
    iget-boolean p1, p0, Ll/۫ۤܳ;->ܿ:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Ll/۫ۤܳ;->ۜ:Z

    return-void
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 125
    iput-boolean v0, p0, Ll/۫ۤܳ;->ۜ:Z

    .line 126
    invoke-direct {p0}, Ll/۫ۤܳ;->ۚ()V

    return-void
.end method

.method public final ۫()V
    .locals 9

    .line 90
    iget-boolean v0, p0, Ll/۫ۤܳ;->ۜ:Z

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۫ۤܳ;->ۖ:Ll/ۨ᩷ܳ;

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ll/ۨ᩷ܳ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 91
    iput-boolean v1, p0, Ll/۫ۤܳ;->ۜ:Z

    goto :goto_1

    .line 92
    :cond_1
    iget-wide v4, p0, Ll/۫ۤܳ;->᩶:J

    iget-object v6, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v6}, Ll/ۚ᩷ܳ;->ۗ()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-eqz v8, :cond_2

    return-void

    .line 93
    :cond_2
    :goto_1
    iget-object v4, p0, Ll/۫ۤܳ;->ܰ:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->top:F

    if-eqz v0, :cond_6

    .line 94
    iget-boolean v6, p0, Ll/۫ۤܳ;->ܿ:Z

    if-nez v6, :cond_6

    .line 96
    iget v0, v4, Landroid/graphics/RectF;->left:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v6

    iget v7, p0, Ll/۫ۤܳ;->ۙۙ:I

    if-ne v7, v3, :cond_3

    const/high16 v7, 0x3f400000    # 0.75f

    goto :goto_2

    :cond_3
    const/4 v8, 0x2

    if-ne v7, v8, :cond_4

    const/high16 v7, 0x3e800000    # 0.25f

    goto :goto_2

    :cond_4
    const/high16 v7, 0x3f000000    # 0.5f

    :goto_2
    mul-float v6, v6, v7

    add-float/2addr v6, v0

    .line 97
    iget-object v0, v2, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    iget v0, v0, Ll/ۙ᩷ܳ;->ᩴ:F

    const/high16 v7, 0x3fc00000    # 1.5f

    mul-float v0, v0, v7

    const/high16 v7, 0x3f800000    # 1.0f

    add-float/2addr v0, v7

    .line 98
    iget-object v7, p0, Ll/۫ۤܳ;->᩷ۙ:Landroid/graphics/Rect;

    invoke-virtual {v2, v7}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget v8, v7, Landroid/graphics/Rect;->left:I

    int-to-float v8, v8

    sub-float/2addr v8, v0

    cmpl-float v8, v6, v8

    if-ltz v8, :cond_5

    iget v8, v7, Landroid/graphics/Rect;->right:I

    int-to-float v8, v8

    add-float/2addr v8, v0

    cmpg-float v0, v6, v8

    if-gtz v0, :cond_5

    iget v0, v7, Landroid/graphics/Rect;->top:I

    iget-object v6, v2, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    .line 100
    invoke-virtual {v6}, Ll/ܳۤܳ;->ۧ()I

    move-result v6

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v5, v0

    if-ltz v0, :cond_5

    iget v0, v7, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float v0, v5, v0

    if-gtz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :cond_6
    :goto_3
    if-nez v0, :cond_7

    .line 104
    invoke-direct {p0}, Ll/۫ۤܳ;->ۚ()V

    return-void

    .line 107
    :cond_7
    iget v0, p0, Ll/۫ۤܳ;->۬:I

    sget v6, Ll/ۗۡ֫;->ۙ:I

    if-eq v0, v6, :cond_8

    .line 108
    iput v6, p0, Ll/۫ۤܳ;->۬:I

    .line 109
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v6, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 111
    :cond_8
    iget-object v0, p0, Ll/۫ۤܳ;->ۡ:[I

    invoke-virtual {v2, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 112
    aget v1, v0, v1

    iget v6, v4, Landroid/graphics/RectF;->left:F

    float-to-int v6, v6

    add-int/2addr v1, v6

    aget v0, v0, v3

    float-to-int v5, v5

    add-int/2addr v0, v5

    .line 113
    iget v5, v4, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    sub-int/2addr v5, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 114
    iget v6, v4, Landroid/graphics/RectF;->bottom:F

    float-to-int v6, v6

    iget v4, v4, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    sub-int/2addr v6, v4

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 115
    iget-object v4, p0, Ll/۫ۤܳ;->۠:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v4, v1, v0, v5, v3}, Landroid/widget/PopupWindow;->update(IIII)V

    return-void

    .line 117
    :cond_9
    invoke-virtual {v4, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 118
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    const/16 v3, 0x33

    .line 119
    invoke-virtual {v4, v2, v3, v1, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Ll/۫ۤܳ;->ۜ:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Ll/۫ۤܳ;->ܿ:Z

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 86
    iget v0, p0, Ll/۫ۤܳ;->ۙۙ:I

    return v0
.end method
