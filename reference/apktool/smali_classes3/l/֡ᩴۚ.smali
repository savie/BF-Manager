.class public final Ll/֡ᩴۚ;
.super Ll/ۛۤ;
.source "26HN"


# instance fields
.field public final synthetic ᩸:Ll/ۡᩴۚ;


# direct methods
.method public constructor <init>(Ll/ۡᩴۚ;)V
    .locals 0

    .line 155
    iput-object p1, p0, Ll/֡ᩴۚ;->᩸:Ll/ۡᩴۚ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/ۛۤ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ᩷()V
    .locals 4

    .line 158
    sget v0, Ll/ۡᩴۚ;->᩺᩷:I

    .line 190
    iget-object v0, p0, Ll/֡ᩴۚ;->᩸:Ll/ۡᩴۚ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 191
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "mcp_log_return_to_manager"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 192
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩵᩸ۧ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    .line 194
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
