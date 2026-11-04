.class public final Ll/ᩴ᩻ܳ;
.super Ljava/lang/Object;
.source "D6KB"

# interfaces
.implements Ll/ۨۧۙ;


# instance fields
.field public ֡:Landroid/net/Uri;

.field public final ֨:Ll/᩶ۜ֫;

.field public ۟:Ljava/lang/String;

.field public ۢ:Z

.field public final ܰ:Lbin/mt/plus/Main;

.field public final ܿ:Ll/ۗۤۧ;

.field public final ᩳ:Ll/ܿۜ֫;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/᩶ۜ֫;Ll/ܿۜ֫;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ᩴ᩻ܳ;->ܰ:Lbin/mt/plus/Main;

    .line 36
    iput-object p2, p0, Ll/ᩴ᩻ܳ;->֨:Ll/᩶ۜ֫;

    .line 37
    iput-object p3, p0, Ll/ᩴ᩻ܳ;->ᩳ:Ll/ܿۜ֫;

    .line 38
    new-instance p2, Ll/۟᩵ᩴ;

    invoke-direct {p2, p0}, Ll/۟᩵ᩴ;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ll/ۨۤۧ;->ۙ(Ll/ۚۤ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object p2

    iput-object p2, p0, Ll/ᩴ᩻ܳ;->ܿ:Ll/ۗۤۧ;

    .line 45
    invoke-virtual {p1}, Ll/ۚۤ;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object p2

    new-instance p3, Ll/᩸᩻ܳ;

    invoke-direct {p3, p0}, Ll/᩸᩻ܳ;-><init>(Ll/ᩴ᩻ܳ;)V

    const-string v0, "web_preview_edit_handoff"

    invoke-virtual {p2, v0, p3}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V

    .line 51
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴ᩻ܳ;)Landroid/os/Bundle;
    .locals 3

    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 47
    iget-object v1, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    if-eqz v1, :cond_0

    const-string v2, "file"

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_0
    iget-object p0, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    if-eqz p0, :cond_1

    const-string v1, "highlight"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method private ۙ()V
    .locals 5

    .line 85
    iget-object v0, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩴ᩻ܳ;->ۢ:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩴ᩻ܳ;->᩶:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩴ᩻ܳ;->ܰ:Lbin/mt/plus/Main;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_1

    .line 86
    invoke-virtual {v0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۚۙ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 91
    iget-object v1, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    const/4 v2, 0x0

    .line 92
    iput-object v2, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    .line 94
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-class v4, Ll/ܿۛ᩸;

    invoke-direct {v3, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "android.intent.action.VIEW"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 102
    iget-object v3, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    .line 103
    iput-object v2, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 104
    iget-object v4, p0, Ll/ᩴ᩻ܳ;->ᩳ:Ll/ܿۜ֫;

    invoke-virtual {v4, v3}, Ll/ܿۜ֫;->accept(Ljava/lang/Object;)V

    .line 546
    :cond_0
    invoke-virtual {v0, v1, v2}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ᩴ᩻ܳ;ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    .line 39
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    .line 42
    iget-object p1, p0, Ll/ᩴ᩻ܳ;->֨:Ll/᩶ۜ֫;

    iget-object p1, p1, Ll/᩶ۜ֫;->ܰ:Lbin/mt/plus/Main;

    invoke-static {p1}, Lbin/mt/plus/Main;->᩸(Lbin/mt/plus/Main;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    .line 43
    invoke-direct {p0}, Ll/ᩴ᩻ܳ;->ۙ()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    .line 57
    iget-object v0, p0, Ll/ᩴ᩻ܳ;->ܿ:Ll/ۗۤۧ;

    invoke-virtual {v0, p1}, Ll/ۗۤۧ;->ۙ(Landroid/content/Intent;)V

    return-void
.end method

.method public final ۙ(Ll/ۤ᩻ۙ;)V
    .locals 2

    .line 61
    iget-object p1, p0, Ll/ᩴ᩻ܳ;->ܰ:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۚۤ;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object p1

    const-string v0, "web_preview_edit_handoff"

    invoke-virtual {p1, v0}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "file"

    .line 62
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 63
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    :cond_1
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "highlight"

    .line 64
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 80
    iput-boolean p1, p0, Ll/ᩴ᩻ܳ;->᩶:Z

    .line 81
    invoke-direct {p0}, Ll/ᩴ᩻ܳ;->ۙ()V

    return-void
.end method

.method public final ۤ(Ll/ۤ᩻ۙ;)V
    .locals 0

    const/4 p1, 0x0

    .line 75
    iput-boolean p1, p0, Ll/ᩴ᩻ܳ;->ۢ:Z

    return-void
.end method

.method public final synthetic ܳ(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final synthetic ᩴ(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final ᩷(Ll/ۤ᩻ۙ;)V
    .locals 1

    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, Ll/ᩴ᩻ܳ;->ۢ:Z

    .line 70
    iget-object p1, p0, Ll/ᩴ᩻ܳ;->֡:Landroid/net/Uri;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ll/ᩴ᩻ܳ;->ۙ()V

    return-void

    .line 102
    :cond_0
    iget-object p1, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    const/4 v0, 0x0

    .line 103
    iput-object v0, p0, Ll/ᩴ᩻ܳ;->۟:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 104
    iget-object v0, p0, Ll/ᩴ᩻ܳ;->ᩳ:Ll/ܿۜ֫;

    invoke-virtual {v0, p1}, Ll/ܿۜ֫;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final synthetic ᩸(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method
