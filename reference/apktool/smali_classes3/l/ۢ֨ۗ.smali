.class public final Ll/ۢ֨ۗ;
.super Ljava/lang/Object;
.source "EIXC"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/ۜ᩶ۗ;ZLjava/util/List;)Ll/ܰۢۗ;
    .locals 11

    const/4 v0, 0x0

    .line 32
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    invoke-virtual {v0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܰۗ;

    const/4 v1, 0x1

    .line 33
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩶ۗ;

    invoke-virtual {v2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    .line 34
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩶ۗ;

    invoke-virtual {v3}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜܰۗ;

    .line 55
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    .line 56
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v6

    .line 58
    invoke-static {v6}, Ll/ۛ֫᩵;->ۙ(Ll/֫ۖۗ;)Ll/ܽ֨ۗ;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge v1, v4, :cond_0

    .line 60
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳ᩶ۗ;

    .line 62
    :try_start_0
    invoke-static {v6, v7}, Ll/ۛ֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܳ᩶ۗ;)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v8

    .line 64
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failed to build arg in invoke-custom insn: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9, v8}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    new-instance v8, Ll/ۚۢۗ;

    invoke-virtual {v7}, Ll/ܳ᩶ۗ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷᩶ۗ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 41
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p0

    .line 42
    invoke-interface {v0}, Ll/۠ܰۗ;->ۤ()Ll/۬ܰۗ;

    move-result-object v1

    invoke-static {p0, v1}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/۬ܰۗ;)Ll/᩷ۢۗ;

    move-result-object v1

    .line 43
    invoke-interface {v0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ֨ۗ;->ۙ(Ll/᩷᩶ۗ;)Ll/֡ۢۗ;

    move-result-object v0

    .line 44
    new-instance v4, Ll/᩶ۢۗ;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v4, v1, v0, v6}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 45
    new-instance v0, Ll/ᩳ֨ۗ;

    invoke-direct {v0, v4}, Ll/ᩳ֨ۗ;-><init>(Ll/᩶ۢۗ;)V

    invoke-static {v5, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 47
    sget-object v0, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-static {p0, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v0

    .line 48
    invoke-static {p0, v0, v2, v3}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/ۜܰۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    .line 49
    new-instance v0, Ll/ܰۢۗ;

    invoke-direct {v0, v4, p0, p1, p2}, Ll/ܰۢۗ;-><init>(Ll/᩶ۢۗ;Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Z)V

    .line 50
    invoke-virtual {v0, p3}, Ll/ܰۢۗ;->᩷(Ljava/util/List;)V

    return-object v0

    .line 38
    :cond_1
    new-instance p0, Ll/۠ۧ᩵;

    const-string p1, "Field handle not yet supported"

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p0
.end method
