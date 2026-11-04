.class public final Ll/۫᩷֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/ۨۧۙ;


# instance fields
.field public final synthetic ܰ:Ll/ۗ᩷֫;


# direct methods
.method public constructor <init>(Ll/ۗ᩷֫;)V
    .locals 0

    .line 399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩷֫;->ܰ:Ll/ۗ᩷֫;

    return-void
.end method


# virtual methods
.method public final synthetic ۙ(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۤ(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ll/ۤ᩻ۙ;)V
    .locals 0

    .line 402
    iget-object p1, p0, Ll/۫᩷֫;->ܰ:Ll/ۗ᩷֫;

    invoke-static {p1}, Ll/ۗ᩷֫;->ᩴ(Ll/ۗ᩷֫;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 403
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    .line 926
    invoke-virtual {p1}, Ll/᩹᩷֫;->᩸()V

    :cond_0
    return-void
.end method

.method public final synthetic ᩴ(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final ᩷(Ll/ۤ᩻ۙ;)V
    .locals 0

    return-void
.end method

.method public final ᩸(Ll/ۤ᩻ۙ;)V
    .locals 2

    .line 409
    sget-object p1, Ll/ۧۙ֫;->ۖ:[F

    .line 108
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "mbp"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 409
    iget-object v0, p0, Ll/۫᩷֫;->ܰ:Ll/ۗ᩷֫;

    if-nez p1, :cond_2

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 410
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    .line 1054
    iget-boolean p1, p1, Ll/᩹᩷֫;->ܳ:Z

    if-eqz p1, :cond_1

    .line 410
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    iget-object p1, p1, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    invoke-interface {p1}, Ll/֡᩷֫;->isPlaying()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    iget-object p1, p1, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    .line 411
    invoke-interface {p1}, Ll/֡᩷֫;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    invoke-static {p1}, Ll/᩹᩷֫;->ۙ(Ll/᩹᩷֫;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->ۙ(Ll/ۗ᩷֫;Z)V

    .line 412
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹᩷֫;->ۙ()V

    return-void

    .line 414
    :cond_2
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->ۙ(Ll/ۗ᩷֫;Z)V

    return-void
.end method
