.class public final Ll/֡ܳᩴ;
.super Ljava/lang/Object;
.source "NAVX"

# interfaces
.implements Ll/ۚܳᩴ;


# virtual methods
.method public final ۙ(ILl/᩹ۖ᩸;Landroid/widget/Button;)Ll/ᩳܳᩴ;
    .locals 0

    .line 280
    new-instance p2, Ll/ᩳܳᩴ;

    invoke-direct {p2, p1}, Ll/ᩳܳᩴ;-><init>(I)V

    return-object p2
.end method

.method public final ۙ(Landroid/widget/Button;Ll/ۚۚᩴ;)V
    .locals 0

    .line 275
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 1

    const/16 v0, 0x8

    .line 268
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 269
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 270
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;Ll/ᩳܳᩴ;)V
    .locals 0

    .line 263
    invoke-virtual {p0, p1, p2, p3}, Ll/֡ܳᩴ;->ۙ(Ll/᩹ۖ᩸;Landroid/widget/TextView;Landroid/widget/Button;)V

    return-void
.end method
