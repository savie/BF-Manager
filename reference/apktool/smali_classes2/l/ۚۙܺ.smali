.class public final Ll/ۚۙܺ;
.super Ljava/lang/Object;
.source "S57O"


# direct methods
.method public static ۙ(Ll/۠ۖۧ;)V
    .locals 2

    const v0, 0x102000b

    .line 45
    invoke-virtual {p0, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const/4 v0, 0x0

    const v1, 0x3f8ccccd    # 1.1f

    .line 46
    invoke-virtual {p0, v0, v1}, Landroid/widget/TextView;->setLineSpacing(FF)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Landroid/text/SpannableStringBuilder;)V
    .locals 1

    .line 65
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v0, Ll/ۖۖۧ;

    invoke-direct {v0, p0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 66
    invoke-virtual {v0, p1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const p0, 0x7f12077f

    const/4 p1, 0x0

    .line 67
    invoke-virtual {v0, p0, p1}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12018c

    .line 68
    invoke-virtual {v0, p0, p1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 69
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ll/۠ۖۧ;->ۚ()V

    .line 78
    invoke-virtual {p0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ᩴۙܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    invoke-static {p0}, Ll/ۚۙܺ;->᩷(Ll/۠ۖۧ;)V

    const p1, 0x102000b

    .line 95
    invoke-virtual {p0, p1}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const/4 p1, 0x1

    .line 96
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    return-void
.end method

.method public static ۤ(Ll/۠ۖۧ;)V
    .locals 1

    const v0, 0x102000b

    .line 36
    invoke-virtual {p0, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 37
    invoke-static {p0}, Ll/ܽ۟֫;->᩷(Landroid/view/View;)V

    .line 38
    new-instance v0, Ll/۫ۙܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static ᩷(Ll/۠ۖۧ;)V
    .locals 4

    const v0, 0x7f0a00c5

    .line 20
    invoke-virtual {p0, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {p0, v1, v0, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    return-void
.end method
