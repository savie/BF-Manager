.class public final Ll/ۖܿ᩷;
.super Ll/ۨ۟᩷;
.source "34UR"

# interfaces
.implements Ll/ᩳ۟᩷;


# static fields
.field public static final ֨:[I

.field public static final ۡ:[I


# instance fields
.field public ֡:I

.field public ֫:I

.field public ۗ:I

.field public ۘ:F

.field public ۙ:I

.field public final ۚ:I

.field public final ۛ:Landroid/animation/ValueAnimator;

.field public final ۟:I

.field public final ۢ:I

.field public final ۤ:Ljava/lang/Runnable;

.field public final ۧ:Landroid/graphics/drawable/Drawable;

.field public final ۨ:I

.field public final ۫:Landroid/graphics/drawable/StateListDrawable;

.field public final ܰ:[I

.field public ܳ:I

.field public ܶ:Z

.field public final ܺ:I

.field public ܽ:Z

.field public final ܿ:Landroid/graphics/drawable/StateListDrawable;

.field public final ᩳ:Landroid/graphics/drawable/Drawable;

.field public final ᩴ:[I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:I

.field public ᩸:F

.field public ᩹:Ll/᩻ᩳ᩷;

.field public ᩺:I

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a7

    .line 73
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۖܿ᩷;->ۡ:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 74
    sput-object v0, Ll/ۖܿ᩷;->֨:[I

    return-void
.end method

.method public constructor <init>(Ll/᩻ᩳ᩷;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V
    .locals 4

    .line 140
    invoke-direct {p0}, Ll/ۨ۟᩷;-><init>()V

    const/4 v0, 0x0

    .line 103
    iput v0, p0, Ll/ۖܿ᩷;->᩵:I

    .line 104
    iput v0, p0, Ll/ۖܿ᩷;->ۗ:I

    .line 111
    iput-boolean v0, p0, Ll/ۖܿ᩷;->ܶ:Z

    .line 112
    iput-boolean v0, p0, Ll/ۖܿ᩷;->ܽ:Z

    .line 113
    iput v0, p0, Ll/ۖܿ᩷;->᩺:I

    .line 114
    iput v0, p0, Ll/ۖܿ᩷;->᩷:I

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 116
    iput-object v2, p0, Ll/ۖܿ᩷;->ܰ:[I

    new-array v2, v1, [I

    .line 117
    iput-object v2, p0, Ll/ۖܿ᩷;->ᩴ:[I

    new-array v1, v1, [F

    .line 118
    fill-array-data v1, :array_0

    .line 119
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Ll/ۖܿ᩷;->ۛ:Landroid/animation/ValueAnimator;

    .line 120
    iput v0, p0, Ll/ۖܿ᩷;->ۙ:I

    .line 122
    new-instance v0, Ll/ᩳܿ᩷;

    invoke-direct {v0, p0}, Ll/ᩳܿ᩷;-><init>(Ll/ۖܿ᩷;)V

    iput-object v0, p0, Ll/ۖܿ᩷;->ۤ:Ljava/lang/Runnable;

    .line 128
    new-instance v2, Ll/ۢܿ᩷;

    invoke-direct {v2, p0}, Ll/ۢܿ᩷;-><init>(Ll/ۖܿ᩷;)V

    .line 141
    iput-object p2, p0, Ll/ۖܿ᩷;->ܿ:Landroid/graphics/drawable/StateListDrawable;

    .line 142
    iput-object p3, p0, Ll/ۖܿ᩷;->ᩳ:Landroid/graphics/drawable/Drawable;

    .line 143
    iput-object p4, p0, Ll/ۖܿ᩷;->۫:Landroid/graphics/drawable/StateListDrawable;

    .line 144
    iput-object p5, p0, Ll/ۖܿ᩷;->ۧ:Landroid/graphics/drawable/Drawable;

    .line 145
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-static {p6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, p0, Ll/ۖܿ᩷;->۟:I

    .line 146
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-static {p6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, p0, Ll/ۖܿ᩷;->ۢ:I

    .line 148
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p4

    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Ll/ۖܿ᩷;->ۚ:I

    .line 150
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p4

    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Ll/ۖܿ᩷;->᩻:I

    .line 151
    iput p7, p0, Ll/ۖܿ᩷;->ۨ:I

    .line 152
    iput p8, p0, Ll/ۖܿ᩷;->ܺ:I

    const/16 p4, 0xff

    .line 153
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 154
    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 156
    new-instance p2, Ll/֨ܿ᩷;

    invoke-direct {p2, p0}, Ll/֨ܿ᩷;-><init>(Ll/ۖܿ᩷;)V

    invoke-virtual {v1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 157
    new-instance p2, Ll/ۡܿ᩷;

    invoke-direct {p2, p0}, Ll/ۡܿ᩷;-><init>(Ll/ۖܿ᩷;)V

    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 163
    iget-object p2, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 182
    invoke-virtual {p2, p0}, Ll/᩻ᩳ᩷;->removeItemDecoration(Ll/ۨ۟᩷;)V

    .line 183
    iget-object p2, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p2, p0}, Ll/᩻ᩳ᩷;->removeOnItemTouchListener(Ll/ᩳ۟᩷;)V

    .line 184
    iget-object p2, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p2, v2}, Ll/᩻ᩳ᩷;->removeOnScrollListener(Ll/ۢ۟᩷;)V

    .line 257
    iget-object p2, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 169
    :cond_1
    iput-object p1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 176
    invoke-virtual {p1, p0}, Ll/᩻ᩳ᩷;->addItemDecoration(Ll/ۨ۟᩷;)V

    .line 177
    iget-object p1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p1, p0}, Ll/᩻ᩳ᩷;->addOnItemTouchListener(Ll/ᩳ۟᩷;)V

    .line 178
    iget-object p1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p1, v2}, Ll/᩻ᩳ᩷;->addOnScrollListener(Ll/ۢ۟᩷;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static ۙ(FF[IIII)I
    .locals 2

    const/4 v0, 0x1

    .line 478
    aget v0, p2, v0

    const/4 v1, 0x0

    aget p2, p2, v1

    sub-int/2addr v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sub-float/2addr p1, p0

    int-to-float p0, v0

    div-float/2addr p1, p0

    sub-int/2addr p3, p5

    int-to-float p0, p3

    mul-float p1, p1, p0

    float-to-int p0, p1

    add-int/2addr p4, p0

    if-ge p4, p3, :cond_1

    if-ltz p4, :cond_1

    return p0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final onDrawOver(Landroid/graphics/Canvas;Ll/᩻ᩳ᩷;Ll/ܳᩳ᩷;)V
    .locals 7

    .line 267
    iget p2, p0, Ll/ۖܿ᩷;->᩵:I

    iget-object p3, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    const/4 v0, 0x0

    if-ne p2, p3, :cond_4

    iget p2, p0, Ll/ۖܿ᩷;->ۗ:I

    iget-object p3, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 268
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    if-eq p2, p3, :cond_0

    goto/16 :goto_1

    .line 279
    :cond_0
    iget p2, p0, Ll/ۖܿ᩷;->ۙ:I

    if-eqz p2, :cond_3

    .line 280
    iget-boolean p2, p0, Ll/ۖܿ᩷;->ܶ:Z

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    .line 290
    iget p2, p0, Ll/ۖܿ᩷;->᩵:I

    .line 292
    iget v1, p0, Ll/ۖܿ᩷;->۟:I

    sub-int/2addr p2, v1

    .line 293
    iget v2, p0, Ll/ۖܿ᩷;->᩶:I

    iget v3, p0, Ll/ۖܿ᩷;->֡:I

    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    .line 294
    iget-object v4, p0, Ll/ۖܿ᩷;->ܿ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v4, v0, v0, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 295
    iget v3, p0, Ll/ۖܿ᩷;->ۢ:I

    iget v5, p0, Ll/ۖܿ᩷;->ۗ:I

    .line 296
    iget-object v6, p0, Ll/ۖܿ᩷;->ᩳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, v0, v0, v3, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 215
    iget-object v3, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_1

    .line 299
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    int-to-float p2, v1

    int-to-float v3, v2

    .line 300
    invoke-virtual {p1, p2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 p2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    .line 301
    invoke-virtual {p1, p2, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 302
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 303
    invoke-virtual {p1, p2, v3}, Landroid/graphics/Canvas;->scale(FF)V

    neg-int p2, v1

    int-to-float p2, p2

    neg-int v1, v2

    int-to-float v1, v1

    .line 304
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    :cond_1
    int-to-float v1, p2

    .line 306
    invoke-virtual {p1, v1, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 307
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    int-to-float v1, v2

    .line 308
    invoke-virtual {p1, p3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 309
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-int p2, p2

    int-to-float p2, p2

    neg-int v1, v2

    int-to-float v1, v1

    .line 310
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 283
    :cond_2
    :goto_0
    iget-boolean p2, p0, Ll/ۖܿ᩷;->ܽ:Z

    if-eqz p2, :cond_3

    .line 315
    iget p2, p0, Ll/ۖܿ᩷;->ۗ:I

    .line 317
    iget v1, p0, Ll/ۖܿ᩷;->ۚ:I

    sub-int/2addr p2, v1

    .line 318
    iget v2, p0, Ll/ۖܿ᩷;->ܳ:I

    iget v3, p0, Ll/ۖܿ᩷;->֫:I

    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    .line 319
    iget-object v4, p0, Ll/ۖܿ᩷;->۫:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v4, v0, v0, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 320
    iget v1, p0, Ll/ۖܿ᩷;->᩵:I

    iget v3, p0, Ll/ۖܿ᩷;->᩻:I

    .line 321
    iget-object v5, p0, Ll/ۖܿ᩷;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, v0, v0, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    int-to-float v0, p2

    .line 323
    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 324
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    int-to-float v0, v2

    .line 325
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 326
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-int p3, v2

    int-to-float p3, p3

    neg-int p2, p2

    int-to-float p2, p2

    .line 327
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_3
    return-void

    .line 269
    :cond_4
    :goto_1
    iget-object p1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Ll/ۖܿ᩷;->᩵:I

    .line 270
    iget-object p1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Ll/ۖܿ᩷;->ۗ:I

    .line 275
    invoke-virtual {p0, v0}, Ll/ۖܿ᩷;->ۙ(I)V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۙ(I)V
    .locals 4

    .line 194
    iget-object v0, p0, Ll/ۖܿ᩷;->ۤ:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/ۖܿ᩷;->ܿ:Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    iget v3, p0, Ll/ۖܿ᩷;->᩺:I

    if-eq v3, v2, :cond_0

    .line 195
    sget-object v3, Ll/ۖܿ᩷;->ۡ:[I

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 257
    iget-object v3, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v3, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    if-nez p1, :cond_1

    .line 200
    invoke-virtual {p0}, Ll/ۖܿ᩷;->ۙ()V

    goto :goto_0

    .line 202
    :cond_1
    invoke-virtual {p0}, Ll/ۖܿ᩷;->᩷()V

    .line 205
    :goto_0
    iget v3, p0, Ll/ۖܿ᩷;->᩺:I

    if-ne v3, v2, :cond_2

    if-eq p1, v2, :cond_2

    .line 206
    sget-object v2, Ll/ۖܿ᩷;->֨:[I

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 257
    iget-object v1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 262
    iget-object v1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    const/16 v2, 0x4b0

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    if-ne p1, v1, :cond_3

    .line 257
    iget-object v1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 262
    iget-object v1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    const/16 v2, 0x5dc

    :goto_1
    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 211
    :cond_3
    iput p1, p0, Ll/ۖܿ᩷;->᩺:I

    return-void
.end method

.method public final ۙ(II)V
    .locals 8

    .line 338
    iget-object v0, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->computeVerticalScrollRange()I

    move-result v0

    .line 339
    iget v1, p0, Ll/ۖܿ᩷;->ۗ:I

    sub-int v2, v0, v1

    .line 340
    iget v3, p0, Ll/ۖܿ᩷;->ۨ:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v2, :cond_0

    if-lt v1, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Ll/ۖܿ᩷;->ܶ:Z

    .line 343
    iget-object v2, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v2}, Ll/᩻ᩳ᩷;->computeHorizontalScrollRange()I

    move-result v2

    .line 344
    iget v6, p0, Ll/ۖܿ᩷;->᩵:I

    sub-int v7, v2, v6

    if-lez v7, :cond_1

    if-lt v6, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 345
    :goto_1
    iput-boolean v3, p0, Ll/ۖܿ᩷;->ܽ:Z

    .line 348
    iget-boolean v7, p0, Ll/ۖܿ᩷;->ܶ:Z

    if-nez v7, :cond_2

    if-nez v3, :cond_2

    .line 349
    iget p1, p0, Ll/ۖܿ᩷;->᩺:I

    if-eqz p1, :cond_5

    .line 350
    invoke-virtual {p0, v4}, Ll/ۖܿ᩷;->ۙ(I)V

    return-void

    :cond_2
    const/high16 v3, 0x40000000    # 2.0f

    if-eqz v7, :cond_3

    int-to-float p2, p2

    int-to-float v4, v1

    div-float v7, v4, v3

    add-float/2addr v7, p2

    mul-float v7, v7, v4

    int-to-float p2, v0

    div-float/2addr v7, p2

    float-to-int p2, v7

    .line 357
    iput p2, p0, Ll/ۖܿ᩷;->᩶:I

    mul-int p2, v1, v1

    .line 359
    div-int/2addr p2, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۖܿ᩷;->֡:I

    .line 363
    :cond_3
    iget-boolean p2, p0, Ll/ۖܿ᩷;->ܽ:Z

    if-eqz p2, :cond_4

    int-to-float p1, p1

    int-to-float p2, v6

    div-float v0, p2, v3

    add-float/2addr v0, p1

    mul-float v0, v0, p2

    int-to-float p1, v2

    div-float/2addr v0, p1

    float-to-int p1, v0

    .line 365
    iput p1, p0, Ll/ۖܿ᩷;->ܳ:I

    mul-int p1, v6, v6

    .line 367
    div-int/2addr p1, v2

    invoke-static {v6, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ۖܿ᩷;->֫:I

    .line 371
    :cond_4
    iget p1, p0, Ll/ۖܿ᩷;->᩺:I

    if-eqz p1, :cond_6

    if-ne p1, v5, :cond_5

    goto :goto_2

    :cond_5
    return-void

    .line 372
    :cond_6
    :goto_2
    invoke-virtual {p0, v5}, Ll/ۖܿ᩷;->ۙ(I)V

    return-void
.end method

.method public final ۙ(Landroid/view/MotionEvent;)V
    .locals 12

    .line 408
    iget v0, p0, Ll/ۖܿ᩷;->᩺:I

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 412
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_4

    .line 413
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0, v0, v3}, Ll/ۖܿ᩷;->᩷(FF)Z

    move-result v0

    .line 414
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {p0, v3, v4}, Ll/ۖܿ᩷;->ۙ(FF)Z

    move-result v3

    if-nez v0, :cond_1

    if-eqz v3, :cond_b

    :cond_1
    if-eqz v3, :cond_2

    .line 417
    iput v2, p0, Ll/ۖܿ᩷;->᩷:I

    .line 418
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Ll/ۖܿ᩷;->᩸:F

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 420
    iput v1, p0, Ll/ۖܿ᩷;->᩷:I

    .line 421
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Ll/ۖܿ᩷;->ۘ:F

    .line 423
    :cond_3
    :goto_0
    invoke-virtual {p0, v1}, Ll/ۖܿ᩷;->ۙ(I)V

    return-void

    .line 425
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v3, 0x0

    if-ne v0, v2, :cond_5

    iget v0, p0, Ll/ۖܿ᩷;->᩺:I

    if-ne v0, v1, :cond_5

    const/4 p1, 0x0

    .line 426
    iput p1, p0, Ll/ۖܿ᩷;->ۘ:F

    .line 427
    iput p1, p0, Ll/ۖܿ᩷;->᩸:F

    .line 428
    invoke-virtual {p0, v2}, Ll/ۖܿ᩷;->ۙ(I)V

    .line 429
    iput v3, p0, Ll/ۖܿ᩷;->᩷:I

    return-void

    .line 430
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_b

    iget v0, p0, Ll/ۖܿ᩷;->᩺:I

    if-ne v0, v1, :cond_b

    .line 431
    invoke-virtual {p0}, Ll/ۖܿ᩷;->᩷()V

    .line 432
    iget v0, p0, Ll/ۖܿ᩷;->᩷:I

    const/high16 v4, 0x40000000    # 2.0f

    iget v5, p0, Ll/ۖܿ᩷;->ܺ:I

    if-ne v0, v2, :cond_8

    .line 433
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 541
    iget-object v8, p0, Ll/ۖܿ᩷;->ᩴ:[I

    aput v5, v8, v3

    .line 542
    iget v6, p0, Ll/ۖܿ᩷;->᩵:I

    sub-int/2addr v6, v5

    aput v6, v8, v2

    int-to-float v7, v5

    int-to-float v6, v6

    .line 461
    invoke-static {v6, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 462
    iget v6, p0, Ll/ۖܿ᩷;->ܳ:I

    int-to-float v6, v6

    sub-float/2addr v6, v0

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v4

    if-gez v6, :cond_6

    goto :goto_1

    .line 466
    :cond_6
    iget v6, p0, Ll/ۖܿ᩷;->᩸:F

    iget-object v7, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 467
    invoke-virtual {v7}, Ll/᩻ᩳ᩷;->computeHorizontalScrollRange()I

    move-result v9

    iget-object v7, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 468
    invoke-virtual {v7}, Ll/᩻ᩳ᩷;->computeHorizontalScrollOffset()I

    move-result v10

    iget v11, p0, Ll/ۖܿ᩷;->᩵:I

    move v7, v0

    .line 466
    invoke-static/range {v6 .. v11}, Ll/ۖܿ᩷;->ۙ(FF[IIII)I

    move-result v6

    if-eqz v6, :cond_7

    .line 470
    iget-object v7, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v7, v6, v3}, Ll/᩻ᩳ᩷;->scrollBy(II)V

    .line 473
    :cond_7
    iput v0, p0, Ll/ۖܿ᩷;->᩸:F

    .line 435
    :cond_8
    :goto_1
    iget v0, p0, Ll/ۖܿ᩷;->᩷:I

    if-ne v0, v1, :cond_b

    .line 436
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 532
    iget-object v8, p0, Ll/ۖܿ᩷;->ܰ:[I

    aput v5, v8, v3

    .line 533
    iget v0, p0, Ll/ۖܿ᩷;->ۗ:I

    sub-int/2addr v0, v5

    aput v0, v8, v2

    int-to-float v1, v5

    int-to-float v0, v0

    .line 446
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 447
    iget v0, p0, Ll/ۖܿ᩷;->᩶:I

    int-to-float v0, v0

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    goto :goto_2

    .line 450
    :cond_9
    iget v6, p0, Ll/ۖܿ᩷;->ۘ:F

    iget-object v0, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 451
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->computeVerticalScrollRange()I

    move-result v9

    iget-object v0, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    .line 452
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->computeVerticalScrollOffset()I

    move-result v10

    iget v11, p0, Ll/ۖܿ᩷;->ۗ:I

    move v7, p1

    .line 450
    invoke-static/range {v6 .. v11}, Ll/ۖܿ᩷;->ۙ(FF[IIII)I

    move-result v0

    if-eqz v0, :cond_a

    .line 454
    iget-object v1, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, v3, v0}, Ll/᩻ᩳ᩷;->scrollBy(II)V

    .line 456
    :cond_a
    iput p1, p0, Ll/ۖܿ᩷;->ۘ:F

    :cond_b
    :goto_2
    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    return-void
.end method

.method public final ۙ(FF)Z
    .locals 2

    .line 503
    iget v0, p0, Ll/ۖܿ᩷;->ۗ:I

    iget v1, p0, Ll/ۖܿ᩷;->ۚ:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float p2, p2, v0

    if-ltz p2, :cond_0

    iget p2, p0, Ll/ۖܿ᩷;->ܳ:I

    iget v0, p0, Ll/ۖܿ᩷;->֫:I

    div-int/lit8 v1, v0, 0x2

    sub-int v1, p2, v1

    int-to-float v1, v1

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    int-to-float p2, v0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷()V
    .locals 5

    .line 227
    iget v0, p0, Ll/ۖܿ᩷;->ۙ:I

    iget-object v1, p0, Ll/ۖܿ᩷;->ۛ:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    return-void

    .line 229
    :cond_0
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    const/4 v0, 0x1

    .line 232
    iput v0, p0, Ll/ۖܿ᩷;->ۙ:I

    .line 233
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v2, v3, v4

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v3, v0

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const-wide/16 v2, 0x1f4

    .line 234
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0x0

    .line 235
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 236
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final ᩷(FF)Z
    .locals 3

    .line 215
    iget-object v0, p0, Ll/ۖܿ᩷;->᩹:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    iget v1, p0, Ll/ۖܿ᩷;->۟:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    int-to-float v0, v1

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_1

    goto :goto_0

    .line 495
    :cond_0
    iget v0, p0, Ll/ۖܿ᩷;->᩵:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_1

    :goto_0
    iget p1, p0, Ll/ۖܿ᩷;->᩶:I

    iget v0, p0, Ll/ۖܿ᩷;->֡:I

    div-int/lit8 v0, v0, 0x2

    sub-int v1, p1, v0

    int-to-float v1, v1

    cmpl-float v1, p2, v1

    if-ltz v1, :cond_1

    add-int/2addr v0, p1

    int-to-float p1, v0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 380
    iget v0, p0, Ll/ۖܿ᩷;->᩺:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 381
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0, v0, v3}, Ll/ۖܿ᩷;->᩷(FF)Z

    move-result v0

    .line 382
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {p0, v3, v4}, Ll/ۖܿ᩷;->ۙ(FF)Z

    move-result v3

    .line 383
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    if-nez v4, :cond_4

    if-nez v0, :cond_0

    if-eqz v3, :cond_4

    :cond_0
    if-eqz v3, :cond_1

    .line 386
    iput v2, p0, Ll/ۖܿ᩷;->᩷:I

    .line 387
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Ll/ۖܿ᩷;->᩸:F

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 389
    iput v1, p0, Ll/ۖܿ᩷;->᩷:I

    .line 390
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Ll/ۖܿ᩷;->ۘ:F

    .line 393
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Ll/ۖܿ᩷;->ۙ(I)V

    return v2

    :cond_3
    if-ne v0, v1, :cond_4

    return v2

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
