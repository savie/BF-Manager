.class public final Ll/ܽ᩸᩵;
.super Ll/ܺ۠ۗ;
.source "WITX"


# virtual methods
.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 8

    .line 28
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۘۗ;->᩷ۙ()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 32
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 35
    :cond_1
    invoke-virtual {v0}, Ll/֫ۖۗ;->ᩴۙ()Ll/ۜᩳۗ;

    move-result-object v0

    .line 36
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۡۗ;

    .line 66
    :try_start_0
    invoke-virtual {v3}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    invoke-virtual {v4}, Ll/ۢᩳۗ;->۫()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 70
    :cond_3
    sget-object v4, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ܳ᩶ۗ;

    if-eqz v4, :cond_6

    .line 71
    sget-object v5, Ll/ܳ᩶ۗ;->ܿ:Ll/ܳ᩶ۗ;

    if-ne v4, v5, :cond_4

    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {v3}, Ll/ܽۡۗ;->ۤۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_1

    .line 78
    :cond_5
    invoke-virtual {v4}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v6

    :cond_6
    :goto_1
    if-eqz v6, :cond_2

    .line 54
    invoke-virtual {v3}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_7

    goto :goto_3

    .line 57
    :cond_7
    invoke-virtual {v3}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v4

    :goto_2
    if-eqz v4, :cond_9

    .line 58
    invoke-virtual {v4}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_3

    .line 57
    :cond_8
    invoke-virtual {v4}, Ll/᩻ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object v4

    goto :goto_2

    :cond_9
    const/4 v5, 0x1

    .line 40
    :goto_3
    invoke-virtual {v0, v3, v6, v5}, Ll/ۜᩳۗ;->ۙ(Ll/ܽۡۗ;Ljava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to process value of field: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v4}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_a
    :goto_4
    return v2
.end method
