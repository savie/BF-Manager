.class public final synthetic Ll/ܺۗ۫;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    if-eqz p2, :cond_0

    const-string p2, "forbid_tip_"

    const-string v0, "multi_threaded_transfer"

    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 35
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const/4 v2, 0x0

    invoke-interface {v1, p2, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ܽ֡֫;

    const p2, 0x7f1202fe

    .line 594
    invoke-static {p2, p1, v0}, Ll/۫۠ᩴ;->᩷(ILl/ܽ֡֫;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
