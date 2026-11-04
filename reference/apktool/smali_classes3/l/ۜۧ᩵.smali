.class public final Ll/ۜۧ᩵;
.super Ljava/lang/Object;
.source "9IR2"

# interfaces
.implements Ll/۬֫ܶ;


# direct methods
.method public static ۙ(Ll/ۜ᩶ۗ;)Ll/۬ܰۗ;
    .locals 2

    .line 32
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܺ()Ll/۬᩶ۗ;

    move-result-object v0

    sget-object v1, Ll/۬᩶ۗ;->֡:Ll/۬᩶ۗ;

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 35
    :cond_0
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->᩻()Ll/ۤܿۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 37
    check-cast v0, Ll/۬ܰۗ;

    return-object v0

    .line 39
    :cond_1
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->۫()Ll/᩵ܺ᩵;

    move-result-object p0

    return-object p0
.end method
