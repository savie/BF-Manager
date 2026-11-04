.class public final Ll/ۜۙ᩵;
.super Ll/ܺ۠ۗ;
.source "6IT4"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 10
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->ۙۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 14
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷ۙ()V

    :cond_1
    :goto_0
    return-void
.end method
