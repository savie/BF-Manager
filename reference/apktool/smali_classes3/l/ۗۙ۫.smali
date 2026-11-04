.class public final synthetic Ll/ۗۙ۫;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ll/᩶ܽ;


# instance fields
.field public final synthetic ܰ:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۙ۫;->ܰ:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 426
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f120b49

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 427
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۘ֡ۤ;

    iget-object v1, p0, Ll/ۗۙ۫;->ܰ:Ll/ܽ֡֫;

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "fromDialog"

    .line 428
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 429
    invoke-virtual {v1, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return v2

    .line 431
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 432
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "kasb"

    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    return v2
.end method
