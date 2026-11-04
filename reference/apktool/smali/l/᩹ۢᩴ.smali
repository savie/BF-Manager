.class public final synthetic Ll/᩹ۢᩴ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .line 87
    instance-of v0, p1, Ll/᩹ۖ᩸;

    if-eqz v0, :cond_1

    check-cast p1, Ll/᩹ۖ᩸;

    if-eqz p2, :cond_0

    .line 89
    new-instance p2, Ll/֡ۤۚ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, Ll/֡ۤۚ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    .line 94
    :cond_0
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۖ᩸;->᩹(I)V

    :cond_1
    return-void
.end method
