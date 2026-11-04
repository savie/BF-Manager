.class public final Ll/۠ۖ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ۙ(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    .line 5644
    invoke-virtual {p0}, Landroid/view/View;->getAccessibilityPaneTitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0

    .line 5650
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۙ(Landroid/view/View;Z)V
    .locals 0

    .line 5655
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityHeading(Z)V

    return-void
.end method

.method public static ۤ(Landroid/view/View;)Z
    .locals 0

    .line 5665
    invoke-virtual {p0}, Landroid/view/View;->isScreenReaderFocusable()Z

    move-result p0

    return p0
.end method

.method public static ᩷(Landroid/view/View;Z)V
    .locals 0

    .line 5670
    invoke-virtual {p0, p1}, Landroid/view/View;->setScreenReaderFocusable(Z)V

    return-void
.end method

.method public static ᩷(Landroid/view/View;)Z
    .locals 0

    .line 5660
    invoke-virtual {p0}, Landroid/view/View;->isAccessibilityHeading()Z

    move-result p0

    return p0
.end method
