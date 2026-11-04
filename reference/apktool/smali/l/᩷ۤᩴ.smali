.class public final Ll/᩷ۤᩴ;
.super Ll/ܳ᩻;
.source "O98K"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# static fields
.field public static final ܳۙ:I


# instance fields
.field public final ֡:Ll/᩺ۜ᩸;

.field public ֨:I

.field public final ۖ:F

.field public final ۙۙ:Landroid/graphics/Rect;

.field public final ۜ:Landroid/widget/PopupWindow;

.field public final ۟:I

.field public ۠:[I

.field public final ۡ:Landroid/graphics/Rect;

.field public ۢ:I

.field public ۤۙ:Z

.field public ۬:Landroid/view/ViewTreeObserver;

.field public ܰ:F

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴۙ:F

.field public ᩶:F

.field public final ᩷ۙ:Ljava/util/List;

.field public ᩸ۙ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x3fc00000    # 1.5f

    .line 307
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    sput v0, Ll/᩷ۤᩴ;->ܳۙ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll/᩺ۜ᩸;I)V
    .locals 3

    .line 50
    invoke-direct {p0, p1}, Ll/ܳ᩻;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 43
    iput-object v1, p0, Ll/᩷ۤᩴ;->۠:[I

    .line 363
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/᩷ۤᩴ;->ۡ:Landroid/graphics/Rect;

    .line 364
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/᩷ۤᩴ;->ۙۙ:Landroid/graphics/Rect;

    .line 365
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩷ۤᩴ;->᩷ۙ:Ljava/util/List;

    .line 51
    iput p3, p0, Ll/᩷ۤᩴ;->۟:I

    .line 52
    iput-object p2, p0, Ll/᩷ۤᩴ;->֡:Ll/᩺ۜ᩸;

    .line 53
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Ll/᩷ۤᩴ;->ۖ:F

    const/4 p2, 0x0

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    const/16 v2, 0xd2

    if-eq p3, v1, :cond_1

    if-ne p3, v0, :cond_0

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0802d4

    invoke-static {p1, p3, p2}, Ll/ۡ۟;->ۤ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 68
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 62
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0802d2

    invoke-static {p1, p3, p2}, Ll/ۡ۟;->ۤ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 63
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0802d3

    invoke-static {p1, p3, p2}, Ll/ۡ۟;->ۤ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 p2, 0xe6

    .line 58
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 74
    :goto_0
    new-instance p2, Landroid/graphics/PorterDuffColorFilter;

    sget p3, Ll/ۗۡ֫;->ۙ:I

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, p3, v0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 75
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 76
    invoke-virtual {p0, p1}, Ll/ܳ᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    new-instance p1, Landroid/widget/PopupWindow;

    invoke-direct {p1, p0}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/᩷ۤᩴ;->ۜ:Landroid/widget/PopupWindow;

    const/4 p2, 0x0

    .line 78
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 80
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 81
    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p3, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p2, -0x2

    .line 82
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 83
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setHeight(I)V

    const/16 p2, 0x7cf

    .line 84
    invoke-static {p1, p2}, Ll/᩵ۙۙ;->ۙ(Landroid/widget/PopupWindow;I)V

    return-void
.end method

.method private ᩴ()V
    .locals 11

    .line 267
    iget-object v0, p0, Ll/᩷ۤᩴ;->֡:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 270
    :cond_0
    iget v1, p0, Ll/᩷ۤᩴ;->ۢ:I

    .line 271
    iget v2, p0, Ll/᩷ۤᩴ;->֨:I

    .line 272
    iget-boolean v3, p0, Ll/᩷ۤᩴ;->ᩳ:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 273
    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_8

    .line 274
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ᩴۤ()Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۜ᩷()Z

    move-result v6

    if-nez v6, :cond_8

    .line 319
    iget-object v6, p0, Ll/᩷ۤᩴ;->ۡ:Landroid/graphics/Rect;

    invoke-virtual {v0, v6}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    .line 322
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    if-gtz v7, :cond_3

    .line 324
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-eqz v8, :cond_3

    .line 326
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    :cond_3
    if-gez v7, :cond_4

    const/4 v7, 0x0

    .line 348
    :cond_4
    iget v8, p0, Ll/᩷ۤᩴ;->۟:I

    if-eq v8, v4, :cond_6

    const/4 v9, 0x2

    if-eq v8, v9, :cond_5

    .line 355
    div-int/2addr v7, v9

    goto :goto_1

    :cond_5
    int-to-float v7, v7

    const/high16 v8, 0x3e800000    # 0.25f

    mul-float v7, v7, v8

    .line 352
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    goto :goto_1

    :cond_6
    int-to-float v7, v7

    const/high16 v8, 0x3f400000    # 0.75f

    mul-float v7, v7, v8

    .line 350
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    :goto_1
    add-int/2addr v7, v1

    .line 335
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v8

    add-int/2addr v8, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    sub-int/2addr v8, v7

    .line 336
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v7

    add-int/2addr v7, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    sub-int/2addr v7, v9

    .line 337
    iget v9, v6, Landroid/graphics/Rect;->left:I

    sget v10, Ll/᩷ۤᩴ;->ܳۙ:I

    sub-int/2addr v9, v10

    sub-int/2addr v9, v4

    if-lt v8, v9, :cond_7

    iget v9, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v10

    if-ge v8, v9, :cond_7

    iget v8, v6, Landroid/graphics/Rect;->top:I

    if-lt v7, v8, :cond_7

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v6, v4

    if-lt v7, v6, :cond_8

    :cond_7
    :goto_2
    const/4 v3, 0x0

    .line 278
    :cond_8
    iget-object v6, p0, Ll/᩷ۤᩴ;->ۜ:Landroid/widget/PopupWindow;

    if-nez v3, :cond_a

    .line 279
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 280
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_9
    :goto_3
    return-void

    .line 285
    :cond_a
    iget-object v3, p0, Ll/᩷ۤᩴ;->۠:[I

    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 286
    aget v7, v3, v5

    add-int/2addr v1, v7

    .line 287
    aget v3, v3, v4

    add-int/2addr v2, v3

    if-gez v1, :cond_b

    int-to-float v1, v1

    .line 289
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_4

    .line 292
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int v5, v3, v4

    if-le v1, v5, :cond_c

    sub-int/2addr v1, v5

    int-to-float v1, v1

    .line 294
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_4

    :cond_c
    const/4 v3, 0x0

    .line 297
    invoke-virtual {p0, v3}, Landroid/view/View;->setTranslationX(F)V

    move v5, v1

    .line 300
    :goto_4
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v0, -0x1

    .line 301
    invoke-virtual {v6, v5, v2, v0, v0}, Landroid/widget/PopupWindow;->update(IIII)V

    return-void

    :cond_d
    const v1, 0x800033

    .line 303
    invoke-virtual {v6, v0, v1, v5, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 369
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 370
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_0

    .line 371
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    iget-object p3, p0, Ll/᩷ۤᩴ;->ۙۙ:Landroid/graphics/Rect;

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 372
    iget-object p1, p0, Ll/᩷ۤᩴ;->᩷ۙ:Ljava/util/List;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSystemGestureExclusionRects(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final onPreDraw()Z
    .locals 1

    .line 261
    invoke-direct {p0}, Ll/᩷ۤᩴ;->ᩴ()V

    const/4 v0, 0x1

    return v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 103
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x3

    iget v2, p0, Ll/᩷ۤᩴ;->۟:I

    const/4 v3, 0x2

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x1

    const/4 v6, 0x0

    iget-object v7, p0, Ll/᩷ۤᩴ;->֡:Ll/᩺ۜ᩸;

    if-eqz v0, :cond_13

    if-eq v0, v5, :cond_f

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_0

    .line 230
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 215
    :cond_0
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۤ()V

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 223
    :cond_1
    invoke-virtual {v7, v6, v6}, Ll/᩺ۜ᩸;->ᩴ(IZ)V

    goto :goto_0

    .line 218
    :cond_2
    invoke-virtual {v7, v6}, Ll/᩺ۜ᩸;->ܺ(Z)V

    .line 227
    :goto_0
    iput-boolean v6, p0, Ll/᩷ۤᩴ;->ܿ:Z

    return v5

    .line 152
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 153
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    .line 154
    iget-boolean v1, p0, Ll/᩷ۤᩴ;->ۤۙ:Z

    if-nez v1, :cond_6

    .line 155
    iget v1, p0, Ll/᩷ۤᩴ;->ܰ:F

    sub-float v1, v0, v1

    float-to-int v1, v1

    .line 156
    iget v3, p0, Ll/᩷ۤᩴ;->᩶:F

    sub-float v3, p1, v3

    float-to-int v3, v3

    .line 157
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    iget v8, p0, Ll/᩷ۤᩴ;->ۖ:F

    cmpl-float v1, v1, v8

    if-gtz v1, :cond_5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v1, v1, v8

    if-lez v1, :cond_4

    goto :goto_1

    :cond_4
    return v5

    .line 158
    :cond_5
    :goto_1
    iput-boolean v5, p0, Ll/᩷ۤᩴ;->ۤۙ:Z

    .line 161
    :cond_6
    iget v1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    add-float/2addr v1, p1

    .line 162
    iget v3, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    if-nez v3, :cond_7

    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    .line 163
    :goto_2
    iget v8, v7, Ll/᩺ۜ᩸;->᩺ۙ:F

    cmpg-float v9, v1, v8

    if-gez v9, :cond_9

    sub-float/2addr v8, v1

    float-to-int v1, v8

    .line 164
    invoke-static {v1}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v1

    neg-int v1, v1

    iput v1, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v3, :cond_8

    .line 166
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    iput-wide v8, v7, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 168
    :cond_8
    invoke-virtual {v7}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_3

    .line 169
    :cond_9
    iget v8, v7, Ll/᩺ۜ᩸;->ۨۙ:F

    cmpl-float v9, v1, v8

    if-lez v9, :cond_b

    sub-float/2addr v1, v8

    float-to-int v1, v1

    .line 170
    invoke-static {v1}, Ll/᩺ۜ᩸;->᩺(I)I

    move-result v1

    iput v1, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    if-eqz v3, :cond_a

    .line 172
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    iput-wide v8, v7, Ll/᩺ۜ᩸;->᩻᩷:J

    .line 174
    :cond_a
    invoke-virtual {v7}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_3

    .line 176
    :cond_b
    iput v6, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 178
    :goto_3
    iget-object v1, v7, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v1}, Ll/ۚۚܺ;->֫()F

    move-result v1

    div-float/2addr v1, v4

    .line 179
    iget v3, v7, Ll/᩺ۜ᩸;->ۨۙ:F

    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 180
    iget v4, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    add-float/2addr p1, v4

    cmpg-float v4, p1, v1

    if-gez v4, :cond_c

    goto :goto_4

    :cond_c
    cmpl-float v1, p1, v3

    if-lez v1, :cond_d

    move v1, v3

    goto :goto_4

    :cond_d
    move v1, p1

    :goto_4
    if-nez v2, :cond_e

    .line 187
    iget p1, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    add-float/2addr v0, p1

    invoke-virtual {v7, v0, v1}, Ll/᩺ۜ᩸;->᩸(FF)V

    return v5

    .line 189
    :cond_e
    iget p1, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    add-float/2addr v0, p1

    invoke-virtual {v7, v0, v1}, Ll/᩺ۜ᩸;->ۤ(FF)V

    return v5

    .line 193
    :cond_f
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۤ()V

    if-eqz v2, :cond_12

    if-eq v2, v5, :cond_11

    if-eq v2, v3, :cond_10

    goto :goto_5

    .line 206
    :cond_10
    invoke-virtual {v7, v6, v6}, Ll/᩺ۜ᩸;->ᩴ(IZ)V

    .line 207
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v7, p1}, Ll/᩺ۜ᩸;->ۛ(I)V

    goto :goto_5

    .line 201
    :cond_11
    invoke-virtual {v7, v6, v6}, Ll/᩺ۜ᩸;->ᩴ(IZ)V

    .line 202
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v7, p1}, Ll/᩺ۜ᩸;->ۛ(I)V

    goto :goto_5

    .line 196
    :cond_12
    invoke-virtual {v7, v6}, Ll/᩺ۜ᩸;->ܺ(Z)V

    const/4 p1, -0x1

    .line 2503
    invoke-virtual {v7, p1}, Ll/᩺ۜ᩸;->ۛ(I)V

    .line 211
    :goto_5
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۫᩸()V

    .line 212
    iput-boolean v6, p0, Ll/᩷ۤᩴ;->ܿ:Z

    return v5

    .line 105
    :cond_13
    iput-boolean v5, p0, Ll/᩷ۤᩴ;->ܿ:Z

    .line 106
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۡ()V

    iget-object v0, v7, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    .line 107
    iput-boolean v6, p0, Ll/᩷ۤᩴ;->ۤۙ:Z

    .line 108
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    iput v1, p0, Ll/᩷ۤᩴ;->ܰ:F

    .line 109
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/᩷ۤᩴ;->᩶:F

    if-eqz v2, :cond_16

    const/high16 p1, 0x40800000    # 4.0f

    if-eq v2, v5, :cond_15

    if-eq v2, v3, :cond_14

    goto/16 :goto_6

    .line 136
    :cond_14
    iget v1, p0, Ll/᩷ۤᩴ;->ۢ:I

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, p1

    add-float/2addr v2, v1

    .line 137
    iget p1, p0, Ll/᩷ۤᩴ;->֨:I

    int-to-float p1, p1

    .line 9477
    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v1

    div-float/2addr v1, v4

    sub-float/2addr p1, v1

    .line 138
    iget v1, p0, Ll/᩷ۤᩴ;->ܰ:F

    sub-float/2addr v2, v1

    iput v2, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    .line 139
    iget v1, p0, Ll/᩷ۤᩴ;->᩶:F

    sub-float v1, p1, v1

    iput v1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    .line 140
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    add-float/2addr v2, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v1

    add-float/2addr v1, v2

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v7, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 141
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    div-float/2addr v0, v4

    sub-float/2addr v1, v0

    .line 142
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 141
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, v7, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 143
    iput v6, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 144
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v7, p1, v5}, Ll/᩺ۜ᩸;->ᩴ(IZ)V

    goto/16 :goto_6

    .line 124
    :cond_15
    iget v1, p0, Ll/᩷ۤᩴ;->ۢ:I

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    int-to-float v2, v2

    div-float/2addr v2, p1

    add-float/2addr v2, v1

    .line 125
    iget p1, p0, Ll/᩷ۤᩴ;->֨:I

    int-to-float p1, p1

    .line 9477
    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v1

    div-float/2addr v1, v4

    sub-float/2addr p1, v1

    .line 126
    iget v1, p0, Ll/᩷ۤᩴ;->ܰ:F

    sub-float/2addr v2, v1

    iput v2, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    .line 127
    iget v1, p0, Ll/᩷ۤᩴ;->᩶:F

    sub-float v1, p1, v1

    iput v1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    .line 128
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    add-float/2addr v2, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v1

    add-float/2addr v1, v2

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v7, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 129
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    div-float/2addr v0, v4

    sub-float/2addr v1, v0

    .line 130
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 129
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, v7, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 131
    iput v6, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 132
    invoke-virtual {v7}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v7, p1, v5}, Ll/᩺ۜ᩸;->ᩴ(IZ)V

    goto :goto_6

    .line 112
    :cond_16
    iget p1, p0, Ll/᩷ۤᩴ;->ۢ:I

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v4

    add-float/2addr v1, p1

    .line 113
    iget p1, p0, Ll/᩷ۤᩴ;->֨:I

    int-to-float p1, p1

    .line 9477
    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v2

    div-float/2addr v2, v4

    sub-float/2addr p1, v2

    .line 114
    iget v2, p0, Ll/᩷ۤᩴ;->ܰ:F

    sub-float/2addr v1, v2

    iput v1, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    .line 115
    iget v1, p0, Ll/᩷ۤᩴ;->᩶:F

    sub-float v1, p1, v1

    iput v1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    .line 116
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    add-float/2addr v2, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v1

    add-float/2addr v1, v2

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v7, Ll/᩺ۜ᩸;->᩺ۙ:F

    .line 117
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {v0}, Ll/ۚۚܺ;->֫()F

    move-result v0

    div-float/2addr v0, v4

    sub-float/2addr v1, v0

    .line 118
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v7}, Ll/᩺ۜ᩸;->ۧ᩷()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 117
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, v7, Ll/᩺ۜ᩸;->ۨۙ:F

    .line 119
    iput v6, v7, Ll/᩺ۜ᩸;->ۛۙ:I

    .line 120
    invoke-virtual {v7, v5}, Ll/᩺ۜ᩸;->ܺ(Z)V

    .line 148
    :goto_6
    iget p1, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iput p1, p0, Ll/᩷ۤᩴ;->᩸ۙ:F

    .line 149
    iget p1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iput p1, p0, Ll/᩷ۤᩴ;->ᩴۙ:F

    return v5
.end method

.method public final ۙ(IIZ)V
    .locals 1

    .line 235
    iput p1, p0, Ll/᩷ۤᩴ;->ۢ:I

    .line 236
    iput p2, p0, Ll/᩷ۤᩴ;->֨:I

    .line 237
    iput-boolean p3, p0, Ll/᩷ۤᩴ;->ᩳ:Z

    const/4 p1, 0x0

    .line 238
    iget-object p2, p0, Ll/᩷ۤᩴ;->֡:Ll/᩺ۜ᩸;

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 244
    :goto_0
    iget-object v0, p0, Ll/᩷ۤᩴ;->۬:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    if-ne p3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    .line 248
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۤᩴ;->۬:Landroid/view/ViewTreeObserver;

    .line 249
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_1

    .line 251
    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 252
    iget-object p1, p0, Ll/᩷ۤᩴ;->۬:Landroid/view/ViewTreeObserver;

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_4
    const/4 p1, 0x0

    .line 254
    iput-object p1, p0, Ll/᩷ۤᩴ;->۬:Landroid/view/ViewTreeObserver;

    .line 239
    :goto_1
    invoke-direct {p0}, Ll/᩷ۤᩴ;->ᩴ()V

    return-void
.end method

.method public final ۤ()V
    .locals 4

    .line 88
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 90
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget v2, Ll/ۗۡ֫;->ۙ:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 91
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 360
    iget-boolean v0, p0, Ll/᩷ۤᩴ;->ܿ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ۤᩴ;->ۜ:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
