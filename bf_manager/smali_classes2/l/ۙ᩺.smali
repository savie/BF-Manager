.class public final Ll/ۙ᩺;
.super Ljava/lang/Object;
.source "B4VX"


# direct methods
.method public static ۙ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 28
    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p0, :cond_1

    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 32
    :goto_0
    instance-of p2, p0, Landroid/view/View;

    if-eqz p2, :cond_1

    .line 33
    instance-of p2, p0, Ll/֡ᩴ;

    if-eqz p2, :cond_0

    .line 34
    check-cast p0, Ll/֡ᩴ;

    invoke-interface {p0}, Ll/֡ᩴ;->getHint()Ljava/lang/CharSequence;

    move-result-object p0

    iput-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    return-void

    .line 37
    :cond_0
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-void
.end method
