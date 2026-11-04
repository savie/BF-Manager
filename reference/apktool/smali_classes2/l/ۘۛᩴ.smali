.class public final synthetic Ll/ۘۛᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ܽ֡֫;

.field public final synthetic ᩶:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;Landroid/content/Intent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۛᩴ;->ܰ:Ll/ܽ֡֫;

    iput-object p2, p0, Ll/ۘۛᩴ;->᩶:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۘۛᩴ;->ܰ:Ll/ܽ֡֫;

    .line 4
    iget-object p2, p0, Ll/ۘۛᩴ;->᩶:Landroid/content/Intent;

    .line 1468
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p2, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
