.class public final Ll/ܿ᩸᩵;
.super Ljava/lang/Object;
.source "NIUZ"

# interfaces
.implements Ll/ۘ᩸᩵;


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 3

    .line 164
    instance-of v0, p2, Ll/ۡۖۗ;

    if-eqz v0, :cond_5

    .line 165
    check-cast p2, Ll/ۡۖۗ;

    .line 173
    invoke-virtual {p2}, Ll/ۡۖۗ;->ۙۙ()Ll/ۛۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 176
    :cond_0
    invoke-virtual {p2}, Ll/ۡۖۗ;->᩷ۙ()Ll/ۛۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۧ᩵;->۫(Ll/ۛۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 179
    :cond_1
    invoke-virtual {p2}, Ll/ۡۖۗ;->᩷ۙ()Ll/ۛۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۧ᩵;->᩸(Ll/ۛۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    .line 180
    sget-object v1, Ll/᩺ۢۗ;->ۙ᩷:Ll/᩺ۢۗ;

    invoke-static {v0, v1}, Ll/۠֫᩵;->᩷(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 186
    :cond_2
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 187
    invoke-virtual {p2}, Ll/ۡۖۗ;->᩷ۙ()Ll/ۛۡۗ;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۧ᩵;->֫(Ll/ۛۡۗ;)I

    move-result p1

    const/4 v0, 0x5

    if-ge p1, v0, :cond_4

    .line 190
    invoke-virtual {p2}, Ll/ۡۖۗ;->ۙۙ()Ll/ۛۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۧ᩵;->֫(Ll/ۛۡۗ;)I

    move-result v0

    .line 191
    invoke-virtual {p2}, Ll/ۡۖۗ;->ۙۙ()Ll/ۛۡۗ;

    move-result-object v1

    sget-object v2, Ll/֫۟ۗ;->֫ۙ:Ll/֫۟ۗ;

    invoke-interface {v1, v2}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    :goto_0
    if-eq p1, v0, :cond_5

    mul-int v2, p1, v1

    if-le v2, v0, :cond_4

    mul-int v0, v0, v1

    if-ge p1, v0, :cond_4

    goto :goto_2

    .line 198
    :cond_4
    :goto_1
    invoke-virtual {p2}, Ll/᩵ۖۗ;->getParent()Ll/ܿۡۗ;

    move-result-object p1

    .line 199
    new-instance v0, Ll/ۨۖۗ;

    invoke-direct {v0, p1}, Ll/ۨۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 200
    invoke-interface {p1, p2, v0}, Ll/ܿۡۗ;->ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 201
    invoke-virtual {v0, p2}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    .line 202
    invoke-virtual {p2}, Ll/ۡۖۗ;->ۙۙ()Ll/ۛۡۗ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    const/4 p1, 0x0

    .line 203
    invoke-virtual {p2, p1}, Ll/ۡۖۗ;->ۙ(Ll/ۨۖۗ;)V

    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return p1
.end method
