.class public final Ll/ۤۙܳ;
.super Ll/ۖۙܺ;
.source "HIRF"


# instance fields
.field public ֫:Z

.field public ۚ:Z

.field public ۧ:Ll/֨᩷ܳ;

.field public ۫:Ll/ᩳܳܳ;

.field public ܳ:Ll/ᩳܳܳ;

.field public final synthetic ܺ:Ll/᩸ۙܳ;

.field public ᩻:Ll/֨᩷ܳ;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;)V
    .locals 0

    .line 664
    iput-object p1, p0, Ll/ۤۙܳ;->ܺ:Ll/᩸ۙܳ;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 3

    .line 678
    iget-boolean v0, p0, Ll/ۤۙܳ;->֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۤۙܳ;->ۧ:Ll/֨᩷ܳ;

    iget-object v1, p0, Ll/ۤۙܳ;->ܺ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ܿ(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;

    move-result-object v2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ll/ۤۙܳ;->᩻:Ll/֨᩷ܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֡(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-static {v1}, Ll/᩸ۙܳ;->ۘ(Ll/᩸ۙܳ;)Ll/֨ۜᩴ;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 679
    iget-boolean v0, p0, Ll/ۤۙܳ;->ۚ:Z

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ll/᩸ۙܳ;->ۙ(Ljava/io/IOException;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 546
    invoke-virtual {v1, p1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 673
    iget-object v0, p0, Ll/ۤۙܳ;->ܳ:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V

    iget-object v0, p0, Ll/ۤۙܳ;->۫:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ۤۙܳ;->ۚ:Z

    .line 674
    iget-object v0, p0, Ll/ۤۙܳ;->ۧ:Ll/֨᩷ܳ;

    invoke-virtual {v0}, Ll/֨᩷ܳ;->ܳ()V

    iget-object v0, p0, Ll/ۤۙܳ;->᩻:Ll/֨᩷ܳ;

    invoke-virtual {v0}, Ll/֨᩷ܳ;->ܳ()V

    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 669
    iget-object v0, p0, Ll/ۤۙܳ;->ܺ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    .line 480
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v1

    .line 669
    iput-object v1, p0, Ll/ۤۙܳ;->ܳ:Ll/ᩳܳܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    .line 480
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v1

    .line 669
    iput-object v1, p0, Ll/ۤۙܳ;->۫:Ll/ᩳܳܳ;

    .line 670
    invoke-static {v0}, Ll/᩸ۙܳ;->ܿ(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;

    move-result-object v1

    iput-object v1, p0, Ll/ۤۙܳ;->ۧ:Ll/֨᩷ܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->֡(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۙܳ;->᩻:Ll/֨᩷ܳ;

    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 682
    iget-object v0, p0, Ll/ۤۙܳ;->ܺ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ᩳ(Ll/᩸ۙܳ;)Ll/ۤۙܳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    invoke-static {v0}, Ll/᩸ۙܳ;->۠(Ll/᩸ۙܳ;)V

    :cond_0
    return-void
.end method
