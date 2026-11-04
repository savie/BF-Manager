.class public final Ll/ۧۖ֫;
.super Ll/ۖۙܺ;
.source "E72G"


# instance fields
.field public final synthetic ֫:Landroid/net/Uri;

.field public final synthetic ۚ:Ll/֨֫ܳ;

.field public final synthetic ۫:Ll/ۘۖ֫;

.field public ܳ:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Ll/֨֫ܳ;Landroid/net/Uri;)V
    .locals 0

    .line 1653
    iput-object p1, p0, Ll/ۧۖ֫;->۫:Ll/ۘۖ֫;

    iput-object p2, p0, Ll/ۧۖ֫;->ۚ:Ll/֨֫ܳ;

    iput-object p3, p0, Ll/ۧۖ֫;->֫:Landroid/net/Uri;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 1670
    iget-object v0, p0, Ll/ۧۖ֫;->۫:Ll/ۘۖ֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/ۧۖ֫;->֫:Landroid/net/Uri;

    invoke-static {v0}, Ll/ۘۖ֫;->֨(Ll/ۘۖ֫;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 1671
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ܿۛ᩸;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "android.intent.action.VIEW"

    .line 1672
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۖ֫;->ܳ:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    .line 1674
    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v2

    invoke-static {v2}, Ll/᩺ۖ֫;->۫(Ll/᩺ۖ֫;)Ll/ܶۖ֫;

    move-result-object v2

    sget-object v3, Ll/ܶۖ֫;->֡:Ll/ܶۖ֫;

    if-eq v2, v3, :cond_1

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 1675
    :cond_1
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    .line 1676
    :goto_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 1680
    iget-object v0, p0, Ll/ۧۖ֫;->۫:Ll/ۘۖ֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 7

    .line 1662
    iget-object v0, p0, Ll/ۧۖ֫;->۫:Ll/ۘۖ֫;

    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ۖ֫;->᩻(Ll/᩺ۖ֫;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ۖ֫;->ۨ(Ll/᩺ۖ֫;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ll/ۧۖ֫;->֫:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 1663
    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ۖ֫;->ۧ(Ll/᩺ۖ֫;)I

    move-result v3

    const-string v4, "index.html"

    const/4 v5, 0x1

    if-ltz v3, :cond_1

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/String;

    const-string v6, "index.md"

    aput-object v6, v3, v2

    const-string v6, "index.markdown"

    aput-object v6, v3, v5

    const/4 v5, 0x2

    aput-object v4, v3, v5

    const/4 v4, 0x3

    const-string v5, "index.htm"

    aput-object v5, v3, v4

    goto :goto_0

    :cond_1
    new-array v3, v5, [Ljava/lang/String;

    aput-object v4, v3, v2

    .line 1662
    :goto_0
    iget-object v4, p0, Ll/ۧۖ֫;->ۚ:Ll/֨֫ܳ;

    invoke-virtual {v4, v1, v3}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1665
    :goto_1
    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ۖ֫;->᩻(Ll/᩺ۖ֫;)Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v1, :cond_2

    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۖ֫;->ܶ(Ll/᩺ۖ֫;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܿ֫ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    new-array v0, v2, [Ljava/lang/String;

    .line 1666
    invoke-static {v1, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧۖ֫;->ܳ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview source is unavailable"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 1658
    iget-object v0, p0, Ll/ۧۖ֫;->۫:Ll/ۘۖ֫;

    invoke-static {v0}, Ll/ۧۤܺ;->ۙ(Ll/ۤ᩻ۙ;)Ll/ۧۤܺ;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ۖۙܺ;->ۙ(Ll/ܽ֡֫;Ll/ۧۤܺ;)V

    return-void
.end method

.method public final ᩸()V
    .locals 0

    .line 1683
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    return-void
.end method
