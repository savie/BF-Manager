.class public final synthetic Ll/᩹ܿۧ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۗ֡ۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ֡ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܿۧ;->ܰ:Ll/ۗ֡ۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget-object p1, p0, Ll/᩹ܿۧ;->ܰ:Ll/ۗ֡ۧ;

    .line 4
    sget v0, Ll/ۗ֡ۧ;->᩹᩷:I

    .line 750
    invoke-static {}, Ll/۫ۤܺ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 751
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 753
    :try_start_0
    invoke-virtual {p1, v1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {p1, v0, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
