.class public final synthetic Ll/ۙۙۧ;
.super Ljava/lang/Object;
.source "09LR"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۤۙۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۙۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۙۧ;->ܰ:Ll/ۤۙۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 221
    iget-object p1, p0, Ll/ۙۙۧ;->ܰ:Ll/ۤۙۧ;

    iget-object p2, p1, Ll/ۤۙۧ;->ۚ:Ll/ܺۙۧ;

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p2}, Ll/ܺۙۧ;->᩷(Ll/ܺۙۧ;)Ll/֨ܽ֫;

    move-result-object v1

    iget-object v2, p1, Ll/ۤۙۧ;->۫:Ll/ܳܶ֫;

    invoke-virtual {v1, v2}, Ll/֨ܽ֫;->ۙ(Ll/ܳܶ֫;)V

    .line 222
    invoke-static {p2}, Ll/ܺۙۧ;->᩷(Ll/ܺۙۧ;)Ll/֨ܽ֫;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/֨ܽ֫;->ۙ(Z)V

    .line 223
    invoke-static {p2}, Ll/ܺۙۧ;->᩷(Ll/ܺۙۧ;)Ll/֨ܽ֫;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/֨ܽ֫;->ۙ(Z)V

    .line 224
    invoke-static {p2}, Ll/ܺۙۧ;->᩷(Ll/ܺۙۧ;)Ll/֨ܽ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ܽ֫;->᩸()V

    .line 225
    invoke-static {p2}, Ll/ܺۙۧ;->ۤ(Ll/ܺۙۧ;)Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->᩷ۙ()Ljava/lang/String;

    move-result-object v1

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".9"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ".png"

    goto :goto_0

    :cond_0
    const-string v1, ".9.png"

    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Ll/ܺۙۧ;->᩷(Ll/ܺۙۧ;Ljava/lang/String;)V

    .line 227
    invoke-static {p2}, Ll/ܺۙۧ;->ۧ(Ll/ܺۙۧ;)V

    .line 228
    iget-object v1, p1, Ll/ۤۙۧ;->۫:Ll/ܳܶ֫;

    invoke-static {p2, v1}, Ll/ܺۙۧ;->ۙ(Ll/ܺۙۧ;Ll/ܳܶ֫;)V

    .line 229
    iget-object p1, p1, Ll/ۤۙۧ;->֫:Ll/᩷ۨᩴ;

    invoke-static {p2, p1}, Ll/ܺۙۧ;->ۙ(Ll/ܺۙۧ;Ll/᩷ۨᩴ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 231
    invoke-virtual {p2, p1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    return-void
.end method
