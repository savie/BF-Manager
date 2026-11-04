.class public final Ll/ۧۙ᩵;
.super Ll/ܺ۠ۗ;
.source "GIUH"


# instance fields
.field public ܰ:Z


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ProcessMethodsForInline"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 0

    .line 25
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛۘۗ;->۠()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۧۙ᩵;->ܰ:Z

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 4

    .line 30
    iget-boolean v0, p0, Ll/ۧۙ᩵;->ܰ:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 33
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    .line 43
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v0}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Ll/ۖۡۗ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 52
    :cond_3
    invoke-virtual {v1}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 55
    :cond_4
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۘۗ;->֨()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 35
    :goto_1
    sget-object v1, Ll/֫۟ۗ;->۟ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 59
    invoke-virtual {v0}, Ll/ۖۡۗ;->۠ۙ()Ll/᩻ۡۗ;

    move-result-object v1

    .line 60
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۡۗ;

    .line 63
    invoke-virtual {v2}, Ll/ۖۡۗ;->۠ۙ()Ll/᩻ۡۗ;

    move-result-object v2

    if-eq v2, v1, :cond_5

    .line 65
    invoke-virtual {v1, v2}, Ll/᩻ۡۗ;->᩸(Ll/᩻ۡۗ;)V

    .line 66
    invoke-virtual {v2, v1}, Ll/᩻ۡۗ;->ۙ(Ll/᩻ۡۗ;)V

    goto :goto_2

    :cond_6
    const/4 p1, 0x1

    return p1
.end method
