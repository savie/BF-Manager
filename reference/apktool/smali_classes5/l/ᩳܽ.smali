.class public final Ll/ᩳܽ;
.super Ljava/lang/Object;
.source "A513"


# direct methods
.method public static ۙ(Ll/ܿܽ;)Ll/ܳ֫;
    .locals 0

    .line 111
    iget-object p0, p0, Ll/ܿܽ;->ᩴ:Ll/ܳ֫;

    return-object p0
.end method

.method public static ۙ(Ll/ܽ֡֫;Landroid/view/View;)Ll/ܿܽ;
    .locals 2

    .line 116
    new-instance v0, Ll/۟ܽ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p0, p1, v1}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    return-object v0
.end method

.method public static ۙ(Ll/ܿܽ;Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    .line 65
    invoke-virtual {p0}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object v0

    .line 66
    invoke-static {v0, p1}, Ll/֨ۚ;->ۙ(Ll/ۢۚ;Ljava/lang/CharSequence;)V

    .line 67
    iget-object p0, p0, Ll/ܿܽ;->ᩴ:Ll/ܳ֫;

    invoke-static {p0}, Ll/᩵֫;->ۙ(Ll/ܳ֫;)V

    .line 318
    invoke-virtual {p0}, Ll/ܳ֫;->᩸()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 344
    :cond_0
    invoke-virtual {p0}, Ll/ܳ֫;->ۤ()Ll/᩸֫;

    move-result-object p0

    invoke-interface {p0}, Ll/ܺ֫;->᩸()Landroid/widget/ListView;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 70
    invoke-static {p0, p2}, Ll/ᩳܽ;->᩷(Landroid/widget/ListView;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Ll/֡ܽ;

    invoke-direct {v0, p0, p2}, Ll/֡ܽ;-><init>(Landroid/widget/ListView;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۙ(Landroid/widget/ListView;Landroid/view/View;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳܽ;->᩷(Landroid/widget/ListView;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static ᩷(Ll/ܿܽ;)V
    .locals 2

    .line 146
    :try_start_0
    iget-object p0, p0, Ll/ܿܽ;->ᩴ:Ll/ܳ֫;

    .line 21
    invoke-virtual {p0}, Ll/ܳ֫;->ۤ()Ll/᩸֫;

    move-result-object p0

    .line 22
    invoke-interface {p0}, Ll/ܺ֫;->᩸()Landroid/widget/ListView;

    move-result-object v0

    .line 23
    new-instance v1, Ll/ۗ֫;

    invoke-direct {v1, p0}, Ll/ۗ֫;-><init>(Ll/᩸֫;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ᩷(Landroid/widget/ListView;Landroid/view/View;)Z
    .locals 2

    .line 89
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const v0, 0x1020016

    .line 93
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_3

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v0, p0, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/widget/FrameLayout;

    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/view/ViewGroup;

    .line 98
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 100
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 101
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f08004c

    invoke-static {p1, v0}, Ll/֡ۧۤ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x57

    .line 106
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setForegroundGravity(I)V

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v1
.end method
