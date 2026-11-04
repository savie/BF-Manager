.class public final Ll/ۤᩴ᩵;
.super Ll/۬᩸᩵;
.source "H6C3"


# virtual methods
.method public final ᩸(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 4

    .line 129
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    .line 130
    invoke-static {p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۡۗ;

    .line 131
    instance-of v1, v0, Ll/᩹ۡۗ;

    if-eqz v1, :cond_2

    .line 132
    check-cast v0, Ll/᩹ۡۗ;

    .line 133
    invoke-virtual {p0, v0}, Ll/۬᩸᩵;->ۙ(Ll/᩹ۡۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 141
    invoke-interface {v0}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-le v1, v3, :cond_0

    .line 143
    invoke-interface {v0}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 0
    invoke-static {v2, p1}, Ll/۟۠֫;->ۙ(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    .line 144
    check-cast p1, Ll/ᩳۡۗ;

    goto :goto_0

    .line 145
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v3, :cond_1

    .line 0
    invoke-static {v2, p1}, Ll/۟۠֫;->ۙ(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    .line 146
    check-cast p1, Ll/ۛۡۗ;

    .line 147
    instance-of v1, p1, Ll/᩹ۡۗ;

    if-eqz v1, :cond_1

    .line 148
    check-cast p1, Ll/᩹ۡۗ;

    invoke-interface {p1}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 149
    invoke-static {p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۡۗ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 152
    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩹ۙ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 134
    invoke-virtual {p0, v0, p2}, Ll/۬᩸᩵;->ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)V

    :cond_2
    return-void
.end method
