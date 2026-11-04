.class public final Ll/᩹ᩴۚ;
.super Landroid/app/Activity;
.source "UITY"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResume()V
    .locals 2

    .line 8
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "requestId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;Ll/᩹ᩴۚ;)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
