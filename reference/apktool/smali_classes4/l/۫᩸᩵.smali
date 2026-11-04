.class public final Ll/۫᩸᩵;
.super Ll/ܺ۠ۗ;
.source "1IXX"


# instance fields
.field public ܰ:Z


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 0

    .line 29
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll/۫᩸᩵;->ܰ:Z

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 7

    .line 34
    iget-boolean v0, p0, Ll/۫᩸᩵;->ܰ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    .line 46
    invoke-virtual {p1}, Ll/᩻ۡۗ;->۫ۙ()Ll/ۢܰۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 51
    :cond_0
    sget-object v2, Ll/᩻᩶ۗ;->۫:Ll/᩻᩶ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v2

    check-cast v2, Ll/ۨ᩶ۗ;

    if-nez v2, :cond_1

    goto/16 :goto_2

    .line 55
    :cond_1
    invoke-virtual {v2}, Ll/ۨ᩶ۗ;->ۙ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0}, Ll/ۢܰۗ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩶ۗ;

    if-nez v0, :cond_2

    goto/16 :goto_2

    .line 59
    :cond_2
    new-instance v2, Ll/ۢᩳۗ;

    invoke-virtual {v0}, Ll/ۛ᩶ۗ;->ۙ()I

    move-result v3

    sget-object v4, Ll/ᩳᩳۗ;->᩶:Ll/ᩳᩳۗ;

    invoke-direct {v2, v3, v4}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    .line 60
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۢᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 61
    invoke-virtual {p1, v2}, Ll/᩻ۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    const-string v2, "Apply access flags from \'inner classes\' attribute"

    .line 62
    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    .line 64
    :cond_3
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v0}, Ll/ۛ᩶ۗ;->᩷()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 65
    invoke-virtual {v0}, Ll/ۛ᩶ۗ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v0

    .line 75
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_4
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖۡۗ;

    .line 76
    invoke-virtual {v5}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    .line 77
    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩵()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 78
    invoke-virtual {v5}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v4

    .line 79
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    invoke-virtual {v4, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x1

    goto :goto_0

    :cond_6
    move v3, v4

    :goto_1
    if-eqz v3, :cond_7

    .line 67
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۙ()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    const-string v0, "Make member class \'static\'"

    .line 68
    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    :cond_7
    :goto_2
    return v1
.end method
