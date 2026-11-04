.class public final Ll/۬ۤ᩵;
.super Ll/ۖۤ᩵;
.source "RIVL"


# virtual methods
.method public final ۤ()Ll/֨ۤ᩵;
    .locals 8

    .line 37
    invoke-virtual {p0}, Ll/ۖۤ᩵;->᩷()Ll/֨ۤ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v0

    .line 38
    invoke-virtual {p0}, Ll/ۖۤ᩵;->᩷()Ll/֨ۤ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v1

    .line 39
    invoke-virtual {v0}, Ll/֡᩷᩵;->ۤ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 40
    new-instance v2, Ll/ܺۤ᩵;

    invoke-virtual {p0}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Ll/ܺۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    return-object v2

    .line 42
    :cond_0
    invoke-virtual {v1}, Ll/ᩳۤ᩵;->ᩴ()Ljava/util/List;

    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 47
    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 48
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 20
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    .line 22
    sget-object v7, Ll/ۜۤ᩵;->ۙ:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    .line 77
    invoke-virtual {v0, v5}, Ll/֡᩷᩵;->᩷(Ll/ᩳۡۗ;)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    .line 79
    invoke-virtual {v0, v5}, Ll/֡᩷᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v5}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v6

    if-eqz v6, :cond_2

    .line 66
    invoke-virtual {v5, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 69
    instance-of v6, v5, Ll/ۛ֨ۗ;

    if-eqz v6, :cond_2

    .line 70
    check-cast v5, Ll/ۛ֨ۗ;

    invoke-virtual {v0, v5}, Ll/֡᩷᩵;->ۙ(Ll/ۛ֨ۗ;)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_3
    invoke-virtual {v1}, Ll/ᩳۤ᩵;->᩸()I

    move-result v2

    add-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ll/ᩳۤ᩵;->᩷(I)V

    .line 87
    invoke-virtual {v1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v2

    .line 88
    invoke-virtual {v1}, Ll/ᩳۤ᩵;->᩸()I

    move-result v3

    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v3, v4, :cond_4

    .line 91
    new-instance v1, Ll/ۨۤ᩵;

    invoke-virtual {p0}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v3

    invoke-direct {v1, v3, v0, v2}, Ll/ۨۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/᩷ۡۗ;)V

    return-object v1

    .line 94
    :cond_4
    new-instance v2, Ll/ܺۤ᩵;

    invoke-virtual {p0}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Ll/ܺۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    return-object v2
.end method
