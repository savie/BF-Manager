.class public final Ll/᩹᩷᩵;
.super Ljava/lang/Object;
.source "46D8"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;[Ll/ܶ᩷᩵;Ll/᩷ۡۗ;)V
    .locals 5

    .line 109
    invoke-virtual {p2}, Ll/᩷ۡۗ;->getId()I

    move-result v0

    sget-object v1, Ll/ܶ᩷᩵;->ܿ:Ll/ܶ᩷᩵;

    aput-object v1, p1, v0

    .line 110
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 111
    invoke-virtual {v1}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    aget-object v2, p1, v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    sget-object v4, Ll/ۧ۟ۗ;->᩷ۙ:Ll/ۧ۟ۗ;

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    new-instance v2, Ll/֡ᩳۗ;

    sget-object v3, Ll/ܿᩳۗ;->ܿ:Ll/ܿᩳۗ;

    invoke-direct {v2, v3, p2, v1}, Ll/֡ᩳۗ;-><init>(Ll/ܿᩳۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    invoke-virtual {p0, v4, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    goto :goto_0

    .line 116
    :cond_1
    new-instance v2, Ll/֡ᩳۗ;

    sget-object v3, Ll/ܿᩳۗ;->᩶:Ll/ܿᩳۗ;

    invoke-direct {v2, v3, p2, v1}, Ll/֡ᩳۗ;-><init>(Ll/ܿᩳۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    invoke-virtual {p0, v4, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    goto :goto_0

    .line 113
    :cond_2
    invoke-static {p0, p1, v1}, Ll/᩹᩷᩵;->ۙ(Ll/ۖۡۗ;[Ll/ܶ᩷᩵;Ll/᩷ۡۗ;)V

    goto :goto_0

    .line 123
    :cond_3
    invoke-virtual {p2}, Ll/᩷ۡۗ;->getId()I

    move-result p0

    sget-object p2, Ll/ܶ᩷᩵;->᩶:Ll/ܶ᩷᩵;

    aput-object p2, p1, p0

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)Z
    .locals 5

    const/4 v0, 0x0

    .line 102
    :try_start_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ll/ܶ᩷᩵;

    .line 103
    sget-object v2, Ll/ܶ᩷᩵;->֡:Ll/ܶ᩷᩵;

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v2

    invoke-static {p0, v1, v2}, Ll/᩹᩷᩵;->ۙ(Ll/ۖۡۗ;[Ll/ܶ᩷᩵;Ll/᩷ۡۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 23
    sget-object v1, Ll/ۧ۟ۗ;->᩷ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v1

    .line 24
    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v3, Ll/ܰܽ᩸;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/ܰܽ᩸;-><init>(I)V

    .line 25
    invoke-interface {v2, v3}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v2

    .line 26
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 27
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    return v0

    .line 31
    :cond_0
    :try_start_1
    new-instance v3, Ll/ۚۖۗ;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/ۚۖۗ;-><init>(I)V

    invoke-static {v1, v3}, Ll/ۜ֫᩵;->᩷(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    move-result-object v1

    .line 33
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ᩳۗ;

    .line 34
    invoke-static {p0, v4, v1}, Ll/᩹᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/֡ᩳۗ;Ljava/util/List;)Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    or-int/2addr v3, v4

    goto :goto_0

    :cond_1
    return v3

    :catch_0
    move-exception v1

    const-string v2, "Failed to fix multi-entry loops"

    .line 38
    invoke-virtual {p0, v2, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0

    :catch_1
    move-exception v1

    const-string v2, "Failed to detect multi-entry loops"

    .line 20
    invoke-virtual {p0, v2, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/֡ᩳۗ;Ljava/util/List;)Z
    .locals 7

    .line 55
    invoke-virtual {p1}, Ll/֡ᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object v1

    .line 57
    new-instance v2, Ll/ۢᩴۘ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/ۢᩴۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2, v2}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ᩳۗ;

    const/4 v2, 0x1

    const-string v3, ") to fix multi-entry loop: "

    const-string v4, "Duplicate block ("

    if-eqz v1, :cond_1

    .line 58
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Ll/֡ᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v6

    invoke-static {v5, v6}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ll/֡ᩳۗ;->᩷()Ll/᩷ۡۗ;

    move-result-object p2

    .line 62
    invoke-virtual {v1}, Ll/֡ᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v1

    .line 63
    invoke-static {p0, p2, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p2

    .line 64
    invoke-static {v0, p2}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 65
    invoke-static {p2, v0, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 66
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return v2

    .line 71
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/֡ᩳۗ;->᩷()Ll/᩷ۡۗ;

    move-result-object v0

    .line 72
    new-instance v1, Ll/ܽ᩷᩵;

    const/4 v5, 0x0

    invoke-direct {v1, v5, v0}, Ll/ܽ᩷᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {p2, v1}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡ᩳۗ;

    if-nez p2, :cond_2

    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported multi-entry loop pattern ("

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "). Please report as a decompilation issue!!!"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    .line 76
    :cond_2
    invoke-virtual {p2}, Ll/֡ᩳۗ;->᩷()Ll/᩷ۡۗ;

    move-result-object p2

    invoke-virtual {p1}, Ll/֡ᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v1

    .line 85
    invoke-static {p0, p2, v1}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v1

    .line 86
    invoke-static {v0, v1}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 87
    invoke-static {p2, v0}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return v2
.end method
