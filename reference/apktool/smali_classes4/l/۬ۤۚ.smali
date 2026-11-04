.class public final synthetic Ll/۬ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 144
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 124
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p1

    .line 125
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۛܳۚ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void

    .line 147
    :cond_0
    invoke-static {}, Ll/ۛܳۚ;->ܺ()V

    return-void
.end method
