.class public final Ll/᩶۠ۗ;
.super Ll/ܺ۠ۗ;
.source "2IVE"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 7

    .line 24
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xff

    const/4 v2, 0x0

    if-le v0, v1, :cond_4

    .line 37
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v0

    .line 41
    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    .line 44
    :cond_1
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-eqz v4, :cond_2

    .line 45
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-eq v5, v6, :cond_2

    .line 46
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_4

    invoke-virtual {v4}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v4

    if-nez v4, :cond_4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 28
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷᩷()V

    .line 58
    :cond_4
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 414
    array-length v0, v0

    if-nez v0, :cond_5

    goto :goto_5

    .line 61
    :cond_5
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v0

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object p1

    array-length v3, p1

    :goto_2
    if-ge v2, v3, :cond_b

    aget-object v4, p1, v2

    if-nez v4, :cond_6

    goto :goto_4

    .line 67
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 68
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 70
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_7
    invoke-virtual {v4, v1}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛ֨ۗ;

    .line 74
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v6

    if-ltz v6, :cond_9

    if-ge v6, v0, :cond_8

    goto :goto_3

    .line 79
    :cond_8
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect register number in instruction: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", expected to be less than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 79
    throw p1

    .line 76
    :cond_9
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Incorrect negative register number in instruction: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 76
    throw p1

    :cond_a
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_b
    :goto_5
    return-void
.end method
