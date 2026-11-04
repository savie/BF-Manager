.class public final Ll/۫ۖ᩸;
.super Ll/᩸ۡ;
.source "T6J6"


# instance fields
.field public final synthetic ۙ:Ll/֫ۖ᩸;

.field public final synthetic ᩷:Ll/᩸ۡ;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;Ll/᩸ۡ;)V
    .locals 0

    .line 271
    iput-object p1, p0, Ll/۫ۖ᩸;->ۙ:Ll/֫ۖ᩸;

    iput-object p2, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-direct {p0}, Ll/᩸ۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 288
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Ll/ۚ۬;
    .locals 1

    .line 300
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1}, Ll/᩸ۡ;->getAccessibilityNodeProvider(Landroid/view/View;)Ll/ۚ۬;

    move-result-object p1

    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 294
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ᩴ۬;)V
    .locals 2

    .line 273
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ᩴ۬;)V

    .line 274
    iget-object p1, p0, Ll/۫ۖ᩸;->ۙ:Ll/֫ۖ᩸;

    invoke-static {p1}, Ll/֫ۖ᩸;->֫(Ll/֫ۖ᩸;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/֫ۖ᩸;->۫(Ll/֫ۖ᩸;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/֫ۖ᩸;->᩷(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;

    move-result-object v0

    .line 9745
    iget-object v0, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    .line 275
    :goto_0
    invoke-virtual {p2, v0}, Ll/ᩴ۬;->᩸(Ljava/lang/CharSequence;)V

    .line 276
    invoke-static {p1}, Ll/֫ۖ᩸;->᩷(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p2, v0}, Ll/ᩴ۬;->᩹(Z)V

    .line 277
    invoke-virtual {p1}, Ll/֫ۖ᩸;->᩷()Z

    move-result v0

    invoke-virtual {p2, v0}, Ll/ᩴ۬;->ᩴ(Z)V

    .line 278
    invoke-virtual {p1}, Ll/֫ۖ᩸;->᩷()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Ll/֫ۖ᩸;->ᩴ(Ll/֫ۖ᩸;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {p2, p1}, Ll/ᩴ۬;->ۤ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 291
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 297
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩸ۡ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 303
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩸ۡ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->sendAccessibilityEvent(Landroid/view/View;I)V

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 285
    iget-object v0, p0, Ll/۫ۖ᩸;->᩷:Ll/᩸ۡ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۡ;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
