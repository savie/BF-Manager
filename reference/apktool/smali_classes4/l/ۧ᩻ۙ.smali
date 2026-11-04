.class public final Ll/ۧ᩻ۙ;
.super Ll/᩻᩻ۙ;
.source "X4YZ"

# interfaces
.implements Ll/ۙ᩻ۙ;


# instance fields
.field public final ۟:Ll/ۤ᩻ۙ;

.field public final synthetic ᩳ:Ll/ܺ᩻ۙ;


# direct methods
.method public constructor <init>(Ll/ܺ᩻ۙ;Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V
    .locals 0

    .line 418
    iput-object p1, p0, Ll/ۧ᩻ۙ;->ᩳ:Ll/ܺ᩻ۙ;

    .line 419
    invoke-direct {p0, p1, p3}, Ll/᩻᩻ۙ;-><init>(Ll/ܺ᩻ۙ;Ll/ܶ᩻ۙ;)V

    .line 420
    iput-object p2, p0, Ll/ۧ᩻ۙ;->۟:Ll/ۤ᩻ۙ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 451
    iget-object v0, p0, Ll/ۧ᩻ۙ;->۟:Ll/ۤ᩻ۙ;

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    return-void
.end method

.method public final ۙ(Ll/ۤ᩻ۙ;Ll/ۡۧۙ;)V
    .locals 2

    .line 431
    iget-object p1, p0, Ll/ۧ᩻ۙ;->۟:Ll/ۤ᩻ۙ;

    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object p2

    .line 432
    sget-object v0, Ll/ۖۧۙ;->֡:Ll/ۖۧۙ;

    if-ne p2, v0, :cond_0

    .line 433
    iget-object p1, p0, Ll/ۧ᩻ۙ;->ᩳ:Ll/ܺ᩻ۙ;

    iget-object p2, p0, Ll/᩻᩻ۙ;->ܿ:Ll/ܶ᩻ۙ;

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۙ;->᩷(Ll/ܶ᩻ۙ;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq v0, p2, :cond_1

    .line 439
    invoke-virtual {p0}, Ll/ۧ᩻ۙ;->᩷()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩻᩻ۙ;->ۙ(Z)V

    .line 440
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۫(Ll/ۤ᩻ۙ;)Z
    .locals 1

    .line 446
    iget-object v0, p0, Ll/ۧ᩻ۙ;->۟:Ll/ۤ᩻ۙ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷()Z
    .locals 2

    .line 425
    iget-object v0, p0, Ll/ۧ᩻ۙ;->۟:Ll/ۤ᩻ۙ;

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {v0, v1}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v0

    return v0
.end method
