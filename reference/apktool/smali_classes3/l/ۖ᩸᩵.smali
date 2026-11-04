.class public final Ll/ۖ᩸᩵;
.super Ll/ܺ۠ۗ;
.source "I6G1"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 27
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Ll/ۡ᩸᩵;

    .line 32
    invoke-direct {v0}, Ll/ۧᩴ᩵;-><init>()V

    .line 28
    invoke-static {p1, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    :cond_0
    return-void
.end method
