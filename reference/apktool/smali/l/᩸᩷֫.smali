.class public final Ll/᩸᩷֫;
.super Ll/ۖۙܺ;
.source "K5ZN"


# instance fields
.field public final synthetic ۫:Ll/ܽ֡֫;

.field public ܳ:Ll/۟᩷֫;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/᩸᩷֫;->۫:Ll/ܽ֡֫;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 120
    iget-object v0, p0, Ll/᩸᩷֫;->۫:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_4

    .line 121
    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {v1, v2}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    invoke-static {}, Ll/ۗ᩷֫;->ᩴ()Ll/᩹᩷֫;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 982
    iget-object v1, v1, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {v1}, Ll/֡᩷֫;->۫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 127
    invoke-static {v0}, Ll/ۗ᩷֫;->ۙ(Ll/ܽ֡֫;)V

    return-void

    .line 130
    :cond_1
    iget-object v1, p0, Ll/᩸᩷֫;->ܳ:Ll/۟᩷֫;

    invoke-static {v1}, Ll/ᩳ᩷֫;->ۙ(Ll/۟᩷֫;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 132
    invoke-static {v0}, Ll/ۗ᩷֫;->ۙ(Ll/ܽ֡֫;)V

    return-void

    .line 135
    :cond_2
    iget-object v1, p0, Ll/᩸᩷֫;->ܳ:Ll/۟᩷֫;

    invoke-virtual {v1}, Ll/۟᩷֫;->ۙ()Ll/ۨۜۚ;

    move-result-object v1

    if-nez v1, :cond_3

    const v1, 0x7f120860

    .line 162
    invoke-static {v1}, Ll/᩸۠ۧ;->᩷(I)V

    .line 170
    instance-of v1, v0, Ll/᩵᩷֫;

    if-eqz v1, :cond_4

    .line 171
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 140
    :cond_3
    new-instance v2, Ll/ۗ᩷֫;

    invoke-direct {v2, v0}, Ll/ۗ᩷֫;-><init>(Ll/ܽ֡֫;)V

    .line 141
    iget-object v0, p0, Ll/᩸᩷֫;->ܳ:Ll/۟᩷֫;

    invoke-virtual {v0}, Ll/۟᩷֫;->ۤ()I

    move-result v0

    invoke-static {v1, v0}, Ll/ۗ᩷֫;->ۙ(Ll/ۨۜۚ;I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 146
    iget-object v0, p0, Ll/᩸᩷֫;->۫:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    .line 147
    instance-of v1, v0, Ll/᩵᩷֫;

    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 115
    invoke-static {}, Ll/ᩳ᩷֫;->ۙ()Ll/۟᩷֫;

    move-result-object v0

    iput-object v0, p0, Ll/᩸᩷֫;->ܳ:Ll/۟᩷֫;

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 110
    iget-object v0, p0, Ll/᩸᩷֫;->۫:Ll/ܽ֡֫;

    const/16 v1, 0x12c

    invoke-virtual {p0, v0, v1}, Ll/ۖۙܺ;->᩷(Ll/ܽ֡֫;I)V

    return-void
.end method

.method public final ᩸()V
    .locals 0

    .line 153
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    return-void
.end method
