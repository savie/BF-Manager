.class public final Ll/᩷ۙܳ;
.super Ll/ۖۙܺ;
.source "HIRF"


# instance fields
.field public final synthetic ֫:Ll/᩸ۙܳ;

.field public final ۚ:Ll/ۙۤܳ;

.field public final ۫:Ll/۬᩷ܳ;

.field public ܳ:Z


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;Ll/ۙۤܳ;Ll/۬᩷ܳ;)V
    .locals 0

    .line 305
    iput-object p1, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    iput-object p2, p0, Ll/᩷ۙܳ;->ۚ:Ll/ۙۤܳ;

    iput-object p3, p0, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 311
    iget-object v0, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿۙܳ;->֫()V

    invoke-virtual {v0}, Ll/᩸ۙܳ;->᩷ۙ()V

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 314
    iget-object v0, p0, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    iget-boolean v0, v0, Ll/۬᩷ܳ;->֡:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Ll/᩷ۙܳ;->ܳ:Z

    if-nez v0, :cond_0

    .line 315
    iget-object v0, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 308
    iget-object v0, p0, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    :try_start_0
    iget-object v1, p0, Ll/᩷ۙܳ;->ۚ:Ll/ۙۤܳ;

    invoke-virtual {v0}, Ll/۬᩷ܳ;->ۙ()Ll/۬ۙܳ;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ll/ۙۤܳ;->ۙ(Ll/۬᩷ܳ;Ll/۬ۙܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ll/۬᩷ܳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Ll/۬᩷ܳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
.end method

.method public final ᩷()V
    .locals 0

    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 318
    iget-object v0, p0, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    invoke-virtual {v0}, Ll/۬᩷ܳ;->close()V

    .line 319
    iget-object v0, p0, Ll/᩷ۙܳ;->֫:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۛ(Ll/᩸ۙܳ;)Ll/᩷ۙܳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    invoke-static {v0}, Ll/᩸ۙܳ;->֨(Ll/᩸ۙܳ;)V

    .line 320
    :cond_0
    iget-boolean v1, p0, Ll/᩷ۙܳ;->ܳ:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    invoke-static {v0}, Ll/᩸ۙܳ;->ۨ(Ll/᩸ۙܳ;)Ll/᩵᩸ܳ;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
