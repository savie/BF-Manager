.class public final synthetic Ll/᩷᩸ۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩻֫ܺ;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩻֫ܺ;Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷᩸ۚ;->ܰ:Ll/᩻֫ܺ;

    iput-object p2, p0, Ll/᩷᩸ۚ;->᩶:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 153
    iget-object p1, p0, Ll/᩷᩸ۚ;->ܰ:Ll/᩻֫ܺ;

    invoke-virtual {p1}, Ll/᩻֫ܺ;->ۙ()Z

    move-result p1

    if-eqz p1, :cond_4

    sget p1, Ll/ۡᩴۚ;->᩺᩷:I

    .line 123
    iget-object p1, p0, Ll/᩷᩸ۚ;->᩶:Ll/ܽ֡֫;

    instance-of v0, p1, Ll/᩵᩸ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/᩵᩸ۧ;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    .line 125
    invoke-virtual {v0, v3}, Ll/᩵᩸ۧ;->᩸(Z)V

    .line 126
    new-instance v4, Ll/ܰᩴۚ;

    invoke-direct {v4, v2, v0}, Ll/ܰᩴۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v4}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Runnable;)V

    .line 129
    :cond_1
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-class v5, Ll/ۡᩴۚ;

    invoke-direct {v4, p1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v5, "mcp_log_return_to_manager"

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 130
    :goto_1
    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v3

    .line 129
    invoke-virtual {p1, v3}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz v0, :cond_3

    .line 133
    invoke-virtual {v0, v2}, Ll/᩵᩸ۧ;->᩸(Z)V

    .line 134
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Runnable;)V

    .line 136
    :cond_3
    throw p1

    :cond_4
    return-void
.end method
