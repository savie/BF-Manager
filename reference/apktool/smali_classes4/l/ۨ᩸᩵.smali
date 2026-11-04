.class public final Ll/ۨ᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "36GE"


# direct methods
.method public static synthetic ۙ(Ll/ۛۡۗ;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۨ᩸᩵;->᩷(Ll/ۛۡۗ;)Z

    move-result p0

    return p0
.end method

.method public static ᩷(Ll/ۛۡۗ;)Z
    .locals 1

    .line 39
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-interface {p0, v0}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    instance-of v0, p0, Ll/᩷ۡۗ;

    if-eqz v0, :cond_1

    .line 43
    check-cast p0, Ll/᩷ۡۗ;

    .line 44
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    return p0

    .line 46
    :cond_1
    instance-of v0, p0, Ll/ۜۖۗ;

    if-eqz v0, :cond_2

    .line 47
    move-object v0, p0

    check-cast v0, Ll/ۜۖۗ;

    .line 48
    invoke-virtual {v0}, Ll/ۜۖۗ;->ۧۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 53
    :cond_2
    instance-of v0, p0, Ll/ܿۡۗ;

    if-eqz v0, :cond_5

    .line 54
    check-cast p0, Ll/ܿۡۗ;

    invoke-interface {p0}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p0

    .line 55
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۡۗ;

    .line 56
    invoke-static {v0}, Ll/ۨ᩸᩵;->᩷(Ll/ۛۡۗ;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    .line 32
    instance-of p1, p2, Ll/ۨۖۗ;

    if-eqz p1, :cond_0

    .line 33
    check-cast p2, Ll/ۨۖۗ;

    invoke-virtual {p2}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll/᩵᩸᩵;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
