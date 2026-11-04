.class public final synthetic Ll/ܶۡۗ;
.super Ljava/lang/Object;
.source "5IUE"


# direct methods
.method public static ۙ(Ll/᩹ۡۗ;Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 3

    .line 87
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    move-object v1, p0

    check-cast v1, Ll/ܺ۟ۗ;

    invoke-virtual {v1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 91
    :cond_0
    invoke-interface {p0}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 92
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 93
    invoke-virtual {p1, p2, v0}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V

    goto :goto_0

    .line 96
    :cond_2
    sget-object p0, Ll/ۧ۟ۗ;->᩹:Ll/ۧ۟ۗ;

    invoke-virtual {v1, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/ۙᩳۗ;

    if-nez p0, :cond_3

    :goto_1
    return-void

    :cond_3
    const/4 p0, 0x0

    .line 98
    invoke-virtual {p1, p2, p0}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V

    throw p0
.end method
