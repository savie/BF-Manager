.class public Ll/᩹ۜۚ;
.super Ll/ᩳۧ;
.source "H6IV"


# instance fields
.field public final ܰ:Landroid/graphics/drawable/Drawable;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    .line 24
    invoke-direct {p0, p1, p2}, Ll/ᩳۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    const v0, -0x1f1f20

    if-ge p1, p2, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 30
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    const v2, 0x7f080193

    .line 32
    invoke-static {p1, v2, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 33
    new-instance p2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, v0, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 35
    new-instance v2, Ll/ܶ۫;

    invoke-direct {v2}, Ll/ܶ۫;-><init>()V

    const v3, 0x10100a0

    .line 37
    filled-new-array {v3}, [I

    move-result-object v3

    new-instance v4, Ll/ۗۜۚ;

    const/16 v5, 0xa

    invoke-direct {v4, p1, v5, p2}, Ll/ۗۜۚ;-><init>(Landroid/graphics/Bitmap;ILandroid/graphics/PorterDuffColorFilter;)V

    const v5, 0x7f0a02a7

    invoke-virtual {v2, v3, v4, v5}, Ll/ܶ۫;->ۙ([ILandroid/graphics/drawable/Drawable;I)V

    new-array v3, v1, [I

    .line 38
    new-instance v4, Ll/ۗۜۚ;

    invoke-direct {v4, p1, v1, p2}, Ll/ۗۜۚ;-><init>(Landroid/graphics/Bitmap;ILandroid/graphics/PorterDuffColorFilter;)V

    const v1, 0x7f0a02a8

    invoke-virtual {v2, v3, v4, v1}, Ll/ܶ۫;->ۙ([ILandroid/graphics/drawable/Drawable;I)V

    .line 39
    new-instance v3, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    new-instance v4, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    const/4 v6, 0x0

    :goto_0
    const/16 v7, 0x10

    if-ge v6, v7, :cond_2

    .line 42
    new-instance v7, Ll/ۗۜۚ;

    const/4 v8, 0x6

    if-ge v6, v8, :cond_0

    const/4 v8, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v6, -0x5

    :goto_1
    invoke-direct {v7, p1, v8, p2}, Ll/ۗۜۚ;-><init>(Landroid/graphics/Bitmap;ILandroid/graphics/PorterDuffColorFilter;)V

    const/16 v8, 0xf

    invoke-virtual {v3, v7, v8}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 43
    new-instance v7, Ll/ۗۜۚ;

    const/4 v9, 0x7

    if-ge v6, v9, :cond_1

    add-int/lit8 v9, v6, 0xb

    goto :goto_2

    :cond_1
    const/4 v9, 0x0

    :goto_2
    invoke-direct {v7, p1, v9, p2}, Ll/ۗۜۚ;-><init>(Landroid/graphics/Bitmap;ILandroid/graphics/PorterDuffColorFilter;)V

    invoke-virtual {v4, v7, v8}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v2, v1, v5, v3}, Ll/ܶ۫;->ۙ(IILandroid/graphics/drawable/AnimationDrawable;)V

    .line 46
    invoke-virtual {v2, v5, v1, v4}, Ll/ܶ۫;->ۙ(IILandroid/graphics/drawable/AnimationDrawable;)V

    goto :goto_3

    .line 27
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f080191

    invoke-static {p1, p2}, Ll/֡ۧۤ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_3
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    .line 29
    invoke-static {p1, v0}, Ll/֡ᩳ;->᩷(Landroid/graphics/drawable/Drawable;I)V

    .line 30
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 32
    invoke-direct {p0}, Ll/᩹ۜۚ;->ۙ()V

    return-void
.end method

.method private ۙ()V
    .locals 3

    .line 103
    iget-object v0, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Ll/᩹ۜۚ;->᩶:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 103
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 2

    .line 60
    invoke-super {p0}, Ll/ᩳۧ;->drawableStateChanged()V

    .line 61
    iget-object v0, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 63
    iget-boolean v1, p0, Ll/᩹ۜۚ;->᩶:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 1

    .line 74
    invoke-super {p0}, Landroid/widget/CheckBox;->jumpDrawablesToCurrentState()V

    .line 75
    iget-object v0, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 92
    invoke-super {p0}, Landroid/widget/CheckBox;->onAttachedToWindow()V

    .line 93
    invoke-direct {p0}, Ll/᩹ۜۚ;->ۙ()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 98
    invoke-super {p0}, Landroid/widget/CheckBox;->onDetachedFromWindow()V

    .line 99
    iget-object v0, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 47
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onDraw(Landroid/graphics/Canvas;)V

    .line 48
    invoke-static {p0}, Ll/ۙۙۙ;->ۙ(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 49
    iget-boolean v1, p0, Ll/᩹ۜۚ;->᩶:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 51
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 53
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 54
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_0
    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 80
    invoke-super {p0, p1, p2}, Landroid/widget/CheckBox;->onVisibilityChanged(Landroid/view/View;I)V

    .line 81
    invoke-direct {p0}, Ll/᩹ۜۚ;->ۙ()V

    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 86
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onWindowVisibilityChanged(I)V

    .line 87
    invoke-direct {p0}, Ll/᩹ۜۚ;->ۙ()V

    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

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

.method public final ۙ(Z)V
    .locals 1

    .line 37
    iget-boolean v0, p0, Ll/᩹ۜۚ;->᩶:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 38
    :cond_0
    iput-boolean p1, p0, Ll/᩹ۜۚ;->᩶:Z

    .line 39
    iget-object p1, p0, Ll/᩹ۜۚ;->ܰ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 40
    invoke-virtual {p0}, Ll/᩹ۜۚ;->jumpDrawablesToCurrentState()V

    .line 41
    invoke-direct {p0}, Ll/᩹ۜۚ;->ۙ()V

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
