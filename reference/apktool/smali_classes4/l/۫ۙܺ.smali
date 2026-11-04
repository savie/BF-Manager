.class public final synthetic Ll/۫ۙܺ;
.super Ljava/lang/Object;
.source "S57O"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 39
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    return p1
.end method
