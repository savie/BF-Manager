.class public final Ll/۟۬ᩴ;
.super Ljava/lang/Object;
.source "HIRF"

# interfaces
.implements Ll/ᩳۜᩴ;


# instance fields
.field public ۙ:Z

.field public final synthetic ۤ:Ll/ᩳܳܳ;

.field public final synthetic ۫:Z

.field public final synthetic ܳ:Z

.field public final synthetic ᩴ:Ll/ۨ᩷ܳ;

.field public final synthetic ᩷:Ll/᩸ۙܳ;

.field public final synthetic ᩸:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;Ll/ᩳܳܳ;ZLl/ۨ᩷ܳ;ZLjava/lang/Runnable;)V
    .locals 0

    .line 511
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    iput-object p2, p0, Ll/۟۬ᩴ;->ۤ:Ll/ᩳܳܳ;

    iput-boolean p3, p0, Ll/۟۬ᩴ;->۫:Z

    iput-object p4, p0, Ll/۟۬ᩴ;->ᩴ:Ll/ۨ᩷ܳ;

    iput-boolean p5, p0, Ll/۟۬ᩴ;->ܳ:Z

    iput-object p6, p0, Ll/۟۬ᩴ;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ܽ֡֫;
    .locals 1

    .line 513
    iget-object v0, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;Ll/ᩳܳܳ;)V
    .locals 3

    .line 535
    iget-object p2, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    invoke-static {p2}, Ll/᩸ۙܳ;->ۘ(Ll/᩸ۙܳ;)Ll/֨ۜᩴ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    .line 536
    :cond_0
    invoke-static {p2}, Ll/᩸ۙܳ;->ۡ(Ll/᩸ۙܳ;)V

    .line 537
    invoke-static {p2}, Ll/᩸ۙܳ;->᩻(Ll/᩸ۙܳ;)Ll/ܺۤܳ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 538
    invoke-static {p2}, Ll/᩸ۙܳ;->᩻(Ll/᩸ۙܳ;)Ll/ܺۤܳ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/ܺۤܳ;)V

    .line 539
    invoke-static {p2, p1}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/ܺۤܳ;)V

    .line 541
    :cond_1
    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p2}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿۙܳ;->ۧ()V

    invoke-static {p2}, Ll/᩸ۙܳ;->ۙۙ(Ll/᩸ۙܳ;)V

    return-void

    .line 542
    :cond_2
    invoke-static {p2}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object p1

    invoke-static {p2}, Ll/᩸ۙܳ;->᩶(Ll/᩸ۙܳ;)Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    invoke-static {p2}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object p1

    invoke-static {p2}, Ll/᩸ۙܳ;->᩶(Ll/᩸ۙܳ;)Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    .line 543
    invoke-virtual {p2}, Ll/᩸ۙܳ;->᩷ۙ()V

    .line 544
    invoke-static {p2}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object p1

    new-instance p2, Ll/֡۬ᩴ;

    iget-boolean v0, p0, Ll/۟۬ᩴ;->۫:Z

    iget-boolean v1, p0, Ll/۟۬ᩴ;->ܳ:Z

    iget-object v2, p0, Ll/۟۬ᩴ;->᩸:Ljava/lang/Runnable;

    invoke-direct {p2, p0, v0, v1, v2}, Ll/֡۬ᩴ;-><init>(Ll/۟۬ᩴ;ZZLjava/lang/Runnable;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۙ(Ll/֨᩷ܳ;)V
    .locals 2

    const/4 v0, 0x1

    .line 518
    iput-boolean v0, p0, Ll/۟۬ᩴ;->ۙ:Z

    .line 519
    iget-boolean v0, p0, Ll/۟۬ᩴ;->۫:Z

    iget-object v1, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    if-eqz v0, :cond_0

    invoke-static {v1, p1}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    goto :goto_0

    :cond_0
    invoke-static {v1, p1}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    .line 520
    :goto_0
    invoke-static {v1}, Ll/᩸ۙܳ;->۫(Ll/᩸ۙܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Ll/᩸ۙܳ;->ۚ(Ll/᩸ۙܳ;)Ll/ܶۤܳ;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Ll/᩸ۙܳ;->᩻(Ll/᩸ۙܳ;)Ll/ܺۤܳ;

    move-result-object p1

    if-nez p1, :cond_1

    .line 521
    :try_start_0
    invoke-static {v1}, Ll/᩸ۙܳ;->ۚ(Ll/᩸ۙܳ;)Ll/ܶۤܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶۤܳ;->ۙ()Ll/ܺۤܳ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/ܺۤܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    .line 524
    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/۟۬ᩴ;->ᩴ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ܶ()V

    :cond_2
    return-void
.end method

.method public final ۙ(Ll/۫ۚܳ;)V
    .locals 1

    .line 533
    iget-object v0, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    invoke-virtual {v0, p1}, Ll/᩸ۙܳ;->ۙ(Ljava/io/IOException;)V

    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 531
    iget-object v0, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    const v1, 0x7f120453

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ll/ܽ֡֫;->ۙ(IZ)V

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/֨᩷ܳ;)V
    .locals 1

    .line 528
    new-instance p1, Ll/۫ۚܳ;

    invoke-direct {p1}, Ll/۫ۚܳ;-><init>()V

    iget-object v0, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    invoke-virtual {v0, p1}, Ll/᩸ۙܳ;->ۙ(Ljava/io/IOException;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/Object;Ll/ᩳܳܳ;)Z
    .locals 1

    .line 515
    iget-object v0, p0, Ll/۟۬ᩴ;->᩷:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۘ(Ll/᩸ۙܳ;)Ll/֨ۜᩴ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/۟۬ᩴ;->ۤ:Ll/ᩳܳܳ;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
