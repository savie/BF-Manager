.class public final synthetic Ll/֡۬ᩴ;
.super Ljava/lang/Object;
.source "HIRF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Runnable;

.field public final synthetic ܰ:Ll/۟۬ᩴ;

.field public final synthetic ܿ:Z

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(Ll/۟۬ᩴ;ZZLjava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۬ᩴ;->ܰ:Ll/۟۬ᩴ;

    iput-boolean p2, p0, Ll/֡۬ᩴ;->᩶:Z

    iput-boolean p3, p0, Ll/֡۬ᩴ;->ܿ:Z

    iput-object p4, p0, Ll/֡۬ᩴ;->֡:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 545
    iget-object v0, p0, Ll/֡۬ᩴ;->ܰ:Ll/۟۬ᩴ;

    iget-object v1, v0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    iget-boolean v0, v0, Ll/۟۬ᩴ;->ۙ:Z

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 546
    iget-boolean v0, p0, Ll/֡۬ᩴ;->᩶:Z

    iget-object v2, p0, Ll/֡۬ᩴ;->֡:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/֡۬ᩴ;->ܿ:Z

    if-eqz v0, :cond_0

    invoke-static {v1, v2}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 548
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/᩸ۙܳ;->᩷ۙ(Ll/᩸ۙܳ;)V

    return-void
.end method
