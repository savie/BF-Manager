.class public final Ll/ۘ۠ۗ;
.super Ll/ܺ۠ۗ;
.source "16GJ"


# instance fields
.field public ܰ:Ll/ۜ۟ۨ;


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 0

    .line 26
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ۠ۗ;->ܰ:Ll/ۜ۟ۨ;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 5

    .line 31
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 35
    instance-of v3, v2, Ll/ܳۢۗ;

    if-eqz v3, :cond_1

    .line 36
    check-cast v2, Ll/ܳۢۗ;

    .line 42
    iget-object v3, p0, Ll/ۘ۠ۗ;->ܰ:Ll/ۜ۟ۨ;

    invoke-virtual {v2}, Ll/ܳۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۜ۟ۨ;->ۙ(Ll/᩷ۢۗ;)Ll/᩶ۡۗ;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 44
    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
