.class public final Ll/᩵ܿ᩷;
.super Ll/᩹ᩳ᩷;
.source "E5OI"


# static fields
.field public static ۛ:Landroid/animation/TimeInterpolator;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۗ:Ljava/util/ArrayList;

.field public ۚ:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ۨ:Ljava/util/ArrayList;

.field public ܶ:Ljava/util/ArrayList;

.field public ܺ:Ljava/util/ArrayList;

.field public ܽ:Ljava/util/ArrayList;

.field public ᩵:Ljava/util/ArrayList;

.field public ᩹:Ljava/util/ArrayList;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ll/ۗ۟᩷;-><init>()V

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Ll/᩹ᩳ᩷;->۫:Z

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->֫:Ljava/util/ArrayList;

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ܽ:Ljava/util/ArrayList;

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->᩻:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ۚ:Ljava/util/ArrayList;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ܺ:Ljava/util/ArrayList;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ۨ:Ljava/util/ArrayList;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ܿ᩷;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;)V
    .locals 2

    .line 656
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 657
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧᩳ᩷;

    iget-object v1, v1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۙ(Ljava/util/ArrayList;Ll/ۧᩳ᩷;)V
    .locals 3

    .line 411
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 412
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܿ᩷;

    .line 413
    invoke-direct {p0, v1, p2}, Ll/᩵ܿ᩷;->ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 414
    iget-object v2, v1, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    if-nez v2, :cond_0

    iget-object v2, v1, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    if-nez v2, :cond_0

    .line 415
    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z
    .locals 2

    .line 431
    iget-object v0, p1, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    const/4 v1, 0x0

    if-ne v0, p2, :cond_0

    .line 432
    iput-object v1, p1, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    goto :goto_0

    .line 433
    :cond_0
    iget-object v0, p1, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    if-ne v0, p2, :cond_1

    .line 434
    iput-object v1, p1, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    .line 439
    :goto_0
    iget-object p1, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 440
    iget-object p1, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 441
    iget-object p1, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 332
    invoke-virtual {p0, p2}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ܳ(Ll/ۧᩳ᩷;)V
    .locals 2

    .line 535
    sget-object v0, Ll/᩵ܿ᩷;->ۛ:Landroid/animation/TimeInterpolator;

    if-nez v0, :cond_0

    .line 536
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    sput-object v0, Ll/᩵ܿ᩷;->ۛ:Landroid/animation/TimeInterpolator;

    .line 538
    :cond_0
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v1, Ll/᩵ܿ᩷;->ۛ:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 539
    invoke-virtual {p0, p1}, Ll/᩵ܿ᩷;->᩷(Ll/ۧᩳ᩷;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۧᩳ᩷;IIII)Z
    .locals 3

    .line 266
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 267
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v1

    float-to-int v1, v1

    add-int/2addr p2, v1

    .line 268
    iget-object v1, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    float-to-int v1, v1

    add-int/2addr p3, v1

    .line 269
    invoke-direct {p0, p1}, Ll/᩵ܿ᩷;->ܳ(Ll/ۧᩳ᩷;)V

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    if-nez v1, :cond_0

    if-nez v2, :cond_0

    .line 305
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz v1, :cond_1

    neg-int v1, v1

    int-to-float v1, v1

    .line 277
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    :cond_1
    if-eqz v2, :cond_2

    neg-int v1, v2

    int-to-float v1, v1

    .line 280
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 282
    :cond_2
    new-instance v0, Ll/ۗܿ᩷;

    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, v0, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    .line 64
    iput p2, v0, Ll/ۗܿ᩷;->ۙ:I

    .line 65
    iput p3, v0, Ll/ۗܿ᩷;->᩷:I

    .line 66
    iput p4, v0, Ll/ۗܿ᩷;->᩸:I

    .line 67
    iput p5, v0, Ll/ۗܿ᩷;->ᩴ:I

    .line 282
    iget-object p1, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ll/ۧᩳ᩷;Ljava/util/List;)Z
    .locals 1

    .line 680
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ll/ۧᩳ᩷;Ll/ۧᩳ᩷;IIII)Z
    .locals 6

    if-ne p1, p2, :cond_0

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    .line 335
    invoke-virtual/range {v0 .. v5}, Ll/᩵ܿ᩷;->ۙ(Ll/ۧᩳ᩷;IIII)Z

    move-result p1

    return p1

    .line 337
    :cond_0
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    .line 338
    iget-object v1, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    .line 339
    iget-object v2, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    .line 340
    invoke-direct {p0, p1}, Ll/᩵ܿ᩷;->ܳ(Ll/ۧᩳ᩷;)V

    sub-int v3, p5, p3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    float-to-int v3, v3

    sub-int v4, p6, p4

    int-to-float v4, v4

    sub-float/2addr v4, v1

    float-to-int v4, v4

    .line 344
    iget-object v5, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 345
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 346
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    if-eqz p2, :cond_1

    .line 349
    invoke-direct {p0, p2}, Ll/᩵ܿ᩷;->ܳ(Ll/ۧᩳ᩷;)V

    .line 350
    iget-object v0, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    neg-int v1, v3

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 351
    iget-object v0, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    neg-int v1, v4

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 352
    iget-object v0, p2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 354
    :cond_1
    new-instance v0, Ll/᩹ܿ᩷;

    .line 74
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, v0, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    .line 76
    iput-object p2, v0, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    .line 82
    iput p3, v0, Ll/᩹ܿ᩷;->ۙ:I

    .line 83
    iput p4, v0, Ll/᩹ܿ᩷;->᩷:I

    .line 84
    iput p5, v0, Ll/᩹ܿ᩷;->ᩴ:I

    .line 85
    iput p6, v0, Ll/᩹ܿ᩷;->ܳ:I

    .line 354
    iget-object p1, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final ۚ()V
    .locals 14

    .line 105
    iget-object v0, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    .line 106
    iget-object v2, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    .line 107
    iget-object v4, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    .line 108
    iget-object v6, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v1, :cond_0

    if-eqz v3, :cond_0

    if-eqz v7, :cond_0

    if-eqz v5, :cond_0

    goto/16 :goto_6

    .line 114
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۧᩳ᩷;

    .line 204
    iget-object v10, v9, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 205
    invoke-virtual {v10}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v11

    .line 206
    iget-object v12, p0, Ll/᩵ܿ᩷;->ۨ:Ljava/util/ArrayList;

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ܳ()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v12

    new-instance v13, Ll/ۧܿ᩷;

    invoke-direct {v13, v10, v11, p0, v9}, Ll/ۧܿ᩷;-><init>(Landroid/view/View;Landroid/view/ViewPropertyAnimator;Ll/᩵ܿ᩷;Ll/ۧᩳ᩷;)V

    invoke-virtual {v12, v13}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    .line 222
    invoke-virtual {v9}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    if-nez v3, :cond_3

    .line 120
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 121
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 122
    iget-object v9, p0, Ll/᩵ܿ᩷;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 124
    new-instance v2, Ll/۫ܿ᩷;

    invoke-direct {v2, p0, v8}, Ll/۫ܿ᩷;-><init>(Ll/᩵ܿ᩷;Ljava/util/ArrayList;)V

    if-nez v1, :cond_2

    .line 136
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۗܿ᩷;

    iget-object v8, v8, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    iget-object v8, v8, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 137
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ܳ()J

    move-result-wide v9

    sget v11, Ll/᩸۠;->ۙ:I

    .line 1380
    invoke-virtual {v8, v2, v9, v10}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_1

    .line 139
    :cond_2
    invoke-virtual {v2}, Ll/۫ܿ᩷;->run()V

    :cond_3
    :goto_1
    if-nez v5, :cond_5

    .line 144
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    iget-object v8, p0, Ll/᩵ܿ᩷;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 148
    new-instance v4, Ll/ۚܿ᩷;

    invoke-direct {v4, p0, v2}, Ll/ۚܿ᩷;-><init>(Ll/᩵ܿ᩷;Ljava/util/ArrayList;)V

    if-nez v1, :cond_4

    .line 159
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܿ᩷;

    iget-object v2, v2, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    .line 160
    iget-object v2, v2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Ll/ۗ۟᩷;->ܳ()J

    move-result-wide v8

    sget v10, Ll/᩸۠;->ۙ:I

    .line 1380
    invoke-virtual {v2, v4, v8, v9}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_2

    .line 162
    :cond_4
    invoke-virtual {v4}, Ll/ۚܿ᩷;->run()V

    :cond_5
    :goto_2
    if-nez v7, :cond_b

    .line 167
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 168
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 169
    iget-object v4, p0, Ll/᩵ܿ᩷;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 171
    new-instance v4, Ll/֫ܿ᩷;

    invoke-direct {v4, p0, v2}, Ll/֫ܿ᩷;-><init>(Ll/᩵ܿ᩷;Ljava/util/ArrayList;)V

    if-eqz v1, :cond_7

    if-eqz v3, :cond_7

    if-nez v5, :cond_6

    goto :goto_3

    .line 189
    :cond_6
    invoke-virtual {v4}, Ll/֫ܿ᩷;->run()V

    return-void

    :cond_7
    :goto_3
    const-wide/16 v6, 0x0

    if-nez v1, :cond_8

    .line 182
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ܳ()J

    move-result-wide v8

    goto :goto_4

    :cond_8
    move-wide v8, v6

    :goto_4
    if-nez v3, :cond_9

    .line 183
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ᩴ()J

    move-result-wide v10

    goto :goto_5

    :cond_9
    move-wide v10, v6

    :goto_5
    if-nez v5, :cond_a

    .line 184
    invoke-virtual {p0}, Ll/ۗ۟᩷;->᩸()J

    move-result-wide v6

    .line 185
    :cond_a
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    add-long/2addr v5, v8

    .line 186
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧᩳ᩷;

    iget-object v0, v0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 187
    sget v1, Ll/᩸۠;->ۙ:I

    .line 1380
    invoke-virtual {v0, v4, v5, v6}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    :cond_b
    :goto_6
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 564
    invoke-virtual {p0}, Ll/᩵ܿ᩷;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 565
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ۙ()V

    :cond_0
    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 545
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    .line 546
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    .line 547
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    .line 548
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ܺ:Ljava/util/ArrayList;

    .line 549
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ۨ:Ljava/util/ArrayList;

    .line 550
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ۚ:Ljava/util/ArrayList;

    .line 551
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ۧ:Ljava/util/ArrayList;

    .line 552
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->ܽ:Ljava/util/ArrayList;

    .line 553
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->֫:Ljava/util/ArrayList;

    .line 554
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ܿ᩷;->᩻:Ljava/util/ArrayList;

    .line 555
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ(Ll/ۧᩳ᩷;)V
    .locals 1

    .line 198
    invoke-direct {p0, p1}, Ll/᩵ܿ᩷;->ܳ(Ll/ۧᩳ᩷;)V

    .line 199
    iget-object v0, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷()V
    .locals 8

    .line 572
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    if-ltz v1, :cond_0

    .line 574
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܿ᩷;

    .line 575
    iget-object v4, v3, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    iget-object v4, v4, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 576
    invoke-virtual {v4, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 577
    invoke-virtual {v4, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 578
    iget-object v2, v3, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    .line 305
    invoke-virtual {p0, v2}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 579
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 581
    :cond_0
    iget-object v0, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 583
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧᩳ᩷;

    .line 290
    invoke-virtual {p0, v3}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 585
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 587
    :cond_1
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_2
    add-int/lit8 v1, v1, -0x1

    const/high16 v3, 0x3f800000    # 1.0f

    if-ltz v1, :cond_2

    .line 589
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳ᩷;

    .line 590
    iget-object v5, v4, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setAlpha(F)V

    .line 316
    invoke-virtual {p0, v4}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 592
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 594
    :cond_2
    iget-object v0, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_3
    :goto_3
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    .line 596
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ܿ᩷;

    .line 422
    iget-object v5, v4, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    if-eqz v5, :cond_4

    .line 423
    invoke-direct {p0, v4, v5}, Ll/᩵ܿ᩷;->ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z

    .line 425
    :cond_4
    iget-object v5, v4, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    if-eqz v5, :cond_3

    .line 426
    invoke-direct {p0, v4, v5}, Ll/᩵ܿ᩷;->ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z

    goto :goto_3

    .line 598
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 599
    invoke-virtual {p0}, Ll/᩵ܿ᩷;->۫()Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    .line 603
    :cond_6
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_7
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_9

    .line 605
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 606
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    :cond_8
    :goto_4
    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_7

    .line 608
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗܿ᩷;

    .line 609
    iget-object v7, v6, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    .line 610
    iget-object v7, v7, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 611
    invoke-virtual {v7, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 612
    invoke-virtual {v7, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 613
    iget-object v6, v6, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    .line 305
    invoke-virtual {p0, v6}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 614
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 615
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 616
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_4

    .line 620
    :cond_9
    iget-object v0, p0, Ll/᩵ܿ᩷;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_a
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_c

    .line 622
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 623
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    :cond_b
    :goto_5
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_a

    .line 625
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧᩳ᩷;

    .line 626
    iget-object v6, v5, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 627
    invoke-virtual {v6, v3}, Landroid/view/View;->setAlpha(F)V

    .line 316
    invoke-virtual {p0, v5}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 629
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 630
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_b

    .line 631
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_5

    .line 635
    :cond_c
    iget-object v0, p0, Ll/᩵ܿ᩷;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_d
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_11

    .line 637
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 638
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    :cond_e
    :goto_6
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_d

    .line 640
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ܿ᩷;

    .line 422
    iget-object v5, v4, Ll/᩹ܿ᩷;->᩸:Ll/ۧᩳ᩷;

    if-eqz v5, :cond_f

    .line 423
    invoke-direct {p0, v4, v5}, Ll/᩵ܿ᩷;->ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z

    .line 425
    :cond_f
    iget-object v5, v4, Ll/᩹ܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    if-eqz v5, :cond_10

    .line 426
    invoke-direct {p0, v4, v5}, Ll/᩵ܿ᩷;->ۙ(Ll/᩹ܿ᩷;Ll/ۧᩳ᩷;)Z

    .line 641
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_e

    .line 642
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_6

    .line 647
    :cond_11
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۨ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;)V

    .line 648
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܺ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;)V

    .line 649
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۚ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;)V

    .line 650
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;)V

    .line 652
    invoke-virtual {p0}, Ll/ۗ۟᩷;->ۙ()V

    return-void
.end method

.method public final ᩷(Ll/ۧᩳ᩷;)V
    .locals 8

    .line 450
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 452
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 454
    iget-object v1, p0, Ll/᩵ܿ᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_0
    :goto_0
    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    if-ltz v2, :cond_1

    .line 455
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗܿ᩷;

    .line 456
    iget-object v4, v4, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    if-ne v4, p1, :cond_0

    .line 457
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 458
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 305
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 460
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 463
    :cond_1
    iget-object v1, p0, Ll/᩵ܿ᩷;->᩹:Ljava/util/ArrayList;

    invoke-direct {p0, v1, p1}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;Ll/ۧᩳ᩷;)V

    .line 464
    iget-object v1, p0, Ll/᩵ܿ᩷;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_2

    .line 465
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 290
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 468
    :cond_2
    iget-object v1, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 469
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 316
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 473
    :cond_3
    iget-object v1, p0, Ll/᩵ܿ᩷;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    :cond_4
    :goto_1
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_5

    .line 474
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    .line 475
    invoke-direct {p0, v5, p1}, Ll/᩵ܿ᩷;->ۙ(Ljava/util/ArrayList;Ll/ۧᩳ᩷;)V

    .line 476
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 477
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 480
    :cond_5
    iget-object v1, p0, Ll/᩵ܿ᩷;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    :cond_6
    :goto_2
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_8

    .line 481
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    .line 482
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    :cond_7
    add-int/lit8 v6, v6, -0x1

    if-ltz v6, :cond_6

    .line 483
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗܿ᩷;

    .line 484
    iget-object v7, v7, Ll/ۗܿ᩷;->ۤ:Ll/ۧᩳ᩷;

    if-ne v7, p1, :cond_7

    .line 485
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 486
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 305
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 488
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 489
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 490
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 496
    :cond_8
    iget-object v1, p0, Ll/᩵ܿ᩷;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :cond_9
    :goto_3
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_a

    .line 497
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 498
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 499
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 316
    invoke-virtual {p0, p1}, Ll/ۗ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 501
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 502
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    .line 509
    :cond_a
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۨ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 515
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۚ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 521
    iget-object v0, p0, Ll/᩵ܿ᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 527
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 531
    invoke-virtual {p0}, Ll/᩵ܿ᩷;->ۧ()V

    return-void
.end method

.method public final ᩸(Ll/ۧᩳ᩷;)V
    .locals 2

    .line 229
    invoke-direct {p0, p1}, Ll/᩵ܿ᩷;->ܳ(Ll/ۧᩳ᩷;)V

    .line 230
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 231
    iget-object v0, p0, Ll/᩵ܿ᩷;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
