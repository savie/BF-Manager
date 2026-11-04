.class public final Ll/ۚۡᩴ;
.super Landroid/text/method/LinkMovementMethod;
.source "36IP"


# virtual methods
.method public final onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x1

    .line 56
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result v3

    .line 57
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-nez v4, :cond_0

    .line 58
    invoke-static {p2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v4

    if-ltz v4, :cond_0

    .line 59
    invoke-static {p2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-static {p2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v5

    if-le v4, v5, :cond_0

    .line 61
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p3

    if-eq p3, v2, :cond_2

    if-ne p3, v1, :cond_1

    goto :goto_0

    :cond_1
    return v3

    .line 68
    :cond_2
    :goto_0
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    return v3

    :catchall_0
    move-exception v3

    .line 66
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p3

    if-eq p3, v2, :cond_3

    if-ne p3, v1, :cond_4

    .line 68
    :cond_3
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 71
    :cond_4
    throw v3
.end method
