.class public abstract Ll/ܺ᩶ۛ;
.super Ljava/lang/Object;
.source "R4WH"


# direct methods
.method public static ۙ(I)I
    .locals 0

    and-int/lit16 p0, p0, 0xf0

    ushr-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static ۙ(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)I
    .locals 1

    .line 23
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Landroid/text/Spanned;

    .line 27
    invoke-static {p1}, Ll/ۢܳ᩹;->ۙ(Landroid/text/Spanned;)Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    return p0

    .line 33
    :cond_0
    invoke-static {p1}, Ll/֨ܳ᩹;->ۙ(Landroid/text/Spanned;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p0, v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    .line 40
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getWidth()I

    move-result p0

    return p0
.end method

.method public static final ۙ([S)V
    .locals 1

    const/16 v0, 0x400

    .line 19
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([SS)V

    return-void
.end method
