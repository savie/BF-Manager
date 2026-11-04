.class public final Ll/᩹֫᩵;
.super Ljava/lang/Object;
.source "T6GT"


# direct methods
.method public static ֫(Ll/᩷ۡۗ;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    sget-object v1, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 144
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    .line 145
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 146
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 147
    sget-object v2, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 148
    sget-object v2, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v2

    .line 149
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳۗ;

    .line 150
    invoke-virtual {v4}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v5

    invoke-virtual {v5, p0}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v4

    invoke-virtual {v4, v1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v3

    :cond_2
    :goto_0
    return v0
.end method

.method public static ۙ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1322
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1323
    new-instance v1, Ll/᩻֫᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/᩻֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/ArrayList;
    .locals 2

    .line 1105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1106
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p0, v1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Z)Ljava/util/ArrayList;
    .locals 3

    .line 519
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p2, :cond_0

    .line 520
    new-instance p2, Ll/ᩳۢ֫;

    const/16 v1, 0xa

    invoke-direct {p2, v1}, Ll/ᩳۢ֫;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p2, Ll/۟ۘۗ;

    const/16 v1, 0x9

    invoke-direct {p2, v1}, Ll/۟ۘۗ;-><init>(I)V

    .line 521
    :goto_0
    new-instance v1, Ll/᩷۟ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, p1, p2, v1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    return-object v0
.end method

.method public static ۙ(Ll/᩷ۡۗ;ZLjava/util/function/Predicate;)Ljava/util/ArrayList;
    .locals 1

    .line 527
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 528
    invoke-static {v0, p0, p1, p2}, Ll/᩹֫᩵;->ۙ(Ljava/util/ArrayList;Ll/᩷ۡۗ;ZLjava/util/function/Predicate;)V

    return-object v0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/HashSet;
    .locals 1

    .line 678
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 679
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eq p0, p1, :cond_0

    .line 681
    invoke-static {p1, p0, v0}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/HashSet;)V

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;)Ljava/util/List;
    .locals 3

    if-eqz p1, :cond_3

    .line 387
    sget-object v0, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 390
    :cond_0
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    if-nez v0, :cond_1

    .line 392
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 394
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    .line 395
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    if-ltz v0, :cond_2

    .line 396
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 397
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    .line 388
    :cond_3
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;)Ljava/util/List;
    .locals 4

    if-nez p0, :cond_0

    .line 1160
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 1162
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1163
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    .line 1164
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 1166
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1168
    invoke-static {p0}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 1170
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 1171
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 1172
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1173
    invoke-static {p0}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p0

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۙ(Ll/ۢۖۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;
    .locals 1

    .line 345
    invoke-virtual {p0}, Ll/ۢۖۗ;->ᩴۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    invoke-virtual {p0}, Ll/ۢۖۗ;->ۜ()Ll/᩸ܺۤ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object p0

    .line 347
    invoke-static {p0, p1}, Ll/᩹֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object p0

    return-object p0

    .line 349
    :cond_0
    invoke-virtual {p0}, Ll/ۢۖۗ;->۠()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    .line 350
    invoke-static {v0, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۢۖۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;
    .locals 3

    .line 326
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_0

    .line 328
    move-object v2, v1

    check-cast v2, Ll/ܽ֨ۗ;

    invoke-virtual {v2}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v2

    if-ne v2, p1, :cond_1

    return-object v1

    .line 332
    :cond_1
    invoke-static {v2, p1}, Ll/᩹֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 338
    :cond_2
    instance-of v0, p0, Ll/ۙۡۗ;

    if-eqz v0, :cond_3

    .line 339
    check-cast p0, Ll/ۙۡۗ;

    invoke-virtual {p0}, Ll/ۙۡۗ;->᩵ۙ()Ll/ۢۖۗ;

    move-result-object p0

    invoke-static {p0, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۢۖۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;
    .locals 5

    .line 1352
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1356
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move-object v0, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 1357
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 1358
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    :goto_1
    return-object v1

    :cond_3
    const/4 v0, 0x0

    .line 1368
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;
    .locals 1

    .line 183
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 184
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(ILjava/util/List;)Ll/᩷ۡۗ;
    .locals 3

    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 53
    invoke-virtual {v1}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v2

    if-ne v2, p0, :cond_0

    return-object v1

    .line 57
    :cond_1
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t find block by offset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-static {p0}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in list "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    throw v0
.end method

.method public static ۙ(Ljava/util/List;Ll/֫۟ۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 1526
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 1527
    invoke-virtual {v0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ljava/util/List;Z)Ll/᩷ۡۗ;
    .locals 4

    .line 892
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    .line 893
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0

    :cond_0
    if-nez p1, :cond_3

    .line 898
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 900
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    if-eq v1, v3, :cond_1

    .line 901
    invoke-virtual {v1, v3}, Ll/᩷ۡۗ;->᩷(Ll/᩷ۡۗ;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_2
    return-object v1

    .line 913
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 915
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    if-eqz p1, :cond_5

    if-eq v1, v3, :cond_4

    .line 917
    invoke-static {v3, v1}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_5
    if-eq v1, v3, :cond_4

    .line 922
    invoke-static {v3, v1}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_6
    return-object v1

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;)Ll/᩷ۡۗ;
    .locals 8

    .line 558
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 562
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 512
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    new-instance v4, Ll/᩵ۘۗ;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Ll/᩵ۘۗ;-><init>(I)V

    .line 514
    new-instance v5, Ll/᩷۟ۗ;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v2, v4, v5}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    .line 562
    invoke-direct {v0, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x1

    .line 574
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 575
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 512
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    new-instance v5, Ll/᩵ۘۗ;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Ll/᩵ۘۗ;-><init>(I)V

    .line 514
    new-instance v6, Ll/᩷۟ۗ;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v4}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v3, v5, v6}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    .line 577
    invoke-interface {v0, v4}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 580
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 888
    invoke-static {p0, v1}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Z)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;
    .locals 8

    .line 1017
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v0

    .line 1018
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v1

    .line 1020
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 1021
    invoke-virtual {v1}, Ljava/util/BitSet;->clear()V

    .line 1022
    invoke-virtual {v5}, Ll/᩷ۡۗ;->getId()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V

    .line 1023
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    if-eqz v4, :cond_0

    .line 1025
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    const/4 v4, 0x0

    goto :goto_0

    .line 1028
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    goto :goto_0

    .line 1031
    :cond_1
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۡۗ;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->clear(I)V

    .line 1032
    invoke-virtual {v0}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    goto :goto_2

    .line 1035
    :cond_2
    invoke-static {p0, v0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_3

    return-object v1

    .line 1039
    :cond_3
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v1

    .line 1041
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۡۗ;->getId()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V

    .line 1043
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩺ۙ()Ljava/util/List;

    move-result-object v4

    new-instance v5, Ll/ۚ֫᩵;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v1}, Ll/ۚ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v4, v5}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 1044
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v4

    if-nez v4, :cond_4

    .line 1046
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v4

    new-instance v5, Ll/֫֫᩵;

    invoke-direct {v5, p0, v1}, Ll/֫֫᩵;-><init>(Ll/ۖۡۗ;Ljava/util/BitSet;)V

    invoke-static {v4, v5}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 1048
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 1049
    invoke-static {p0, v0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_5

    return-object v4

    .line 1053
    :cond_5
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v4

    .line 1054
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    .line 1057
    :goto_1
    new-instance v6, Ll/ۧ֫᩵;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v4}, Ll/ۧ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v0, v6}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;Ljava/util/function/Consumer;)V

    .line 1063
    invoke-virtual {v4, v1}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 1064
    invoke-virtual {v4}, Ljava/util/BitSet;->cardinality()I

    move-result v6

    if-ne v6, v3, :cond_6

    .line 1066
    invoke-static {p0, v4}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0

    :cond_6
    if-nez v6, :cond_7

    :goto_2
    return-object v2

    :cond_7
    add-int/lit8 v6, v5, -0x1

    if-gez v5, :cond_8

    .line 1072
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Path cross not found for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", limit reached: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-object v2

    .line 1076
    :cond_8
    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 1077
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 1078
    invoke-virtual {v4}, Ljava/util/BitSet;->clear()V

    move v5, v6

    goto :goto_1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/᩷ۡۗ;
    .locals 1

    .line 256
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;
    .locals 2

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 263
    :cond_0
    instance-of v0, p1, Ll/ᩳۢۗ;

    if-eqz v0, :cond_3

    .line 264
    check-cast p1, Ll/ᩳۢۗ;

    .line 278
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷ۡۗ;

    .line 279
    sget-object v0, Ll/ۧ۟ۗ;->ۖ:Ll/ۧ۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ۛᩳۗ;

    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {v0}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۢۗ;

    if-ne v1, p1, :cond_2

    return-object p2

    .line 266
    :cond_3
    sget-object v0, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 292
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷ۡۗ;

    .line 293
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    if-eq v1, p1, :cond_6

    .line 294
    invoke-static {v1, p1}, Ll/᩹֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_5

    :cond_6
    return-object p2

    .line 269
    :cond_7
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷ۡۗ;

    .line 270
    invoke-static {p2, p1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-object p2

    :cond_9
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩴ۠ۗ;)Ll/᩷ۡۗ;
    .locals 9

    .line 1494
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v0

    .line 1495
    invoke-static {v0}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v1

    .line 1496
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->֫()Ll/۫۠ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object p1

    .line 1497
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1498
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v0

    .line 1499
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x0

    .line 1500
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 1501
    invoke-virtual {v3}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 1504
    :cond_0
    invoke-virtual {v3}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/util/BitSet;->set(I)V

    .line 1511
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 1512
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v7, Ll/۫֫᩵;

    const/4 v8, 0x0

    invoke-direct {v7, v5, v8}, Ll/۫֫᩵;-><init>(Ll/ܺ۟ۗ;I)V

    invoke-interface {v6, v7}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 1513
    invoke-static {v1, v5}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1514
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v5

    if-eq v3, v5, :cond_1

    return-object v3

    .line 1519
    :cond_2
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v3

    invoke-static {p0, v3}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ljava/lang/Boolean;Z)Ll/᩷ۡۗ;
    .locals 1

    .line 1207
    :goto_0
    invoke-static {p0, p1, p2}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ljava/lang/Boolean;Z)Ll/᩷ۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    move-object p0, v0

    goto :goto_0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;
    .locals 4

    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 110
    invoke-static {v2}, Ll/᩹֫᩵;->۫(Ll/᩷ۡۗ;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 111
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object p1, v0

    .line 67
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    .line 70
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    if-eq v0, p0, :cond_3

    return-object v0

    :cond_3
    const/4 p0, 0x1

    .line 74
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0

    .line 68
    :cond_4
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect nodes count for selectOther: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 68
    throw v0
.end method

.method public static ۙ(Ljava/util/ArrayList;Ll/᩷ۡۗ;ZLjava/util/function/Predicate;)V
    .locals 1

    .line 534
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 538
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    invoke-interface {p3, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    if-eqz p2, :cond_2

    .line 544
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    .line 545
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 546
    invoke-static {p0, v0, p2, p3}, Ll/᩹֫᩵;->ۙ(Ljava/util/ArrayList;Ll/᩷ۡۗ;ZLjava/util/function/Predicate;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public static ۙ(Ljava/util/LinkedList;Ll/᩷ۡۗ;Ljava/util/List;Ljava/util/HashSet;)V
    .locals 3

    .line 1223
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ܶ֫᩵;

    invoke-direct {v1, p2}, Ll/ܶ֫᩵;-><init>(Ljava/util/List;)V

    invoke-static {v0, v1}, Ll/ۜ֫᩵;->᩷(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    move-result-object v0

    .line 1224
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 1225
    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 1228
    :cond_1
    invoke-virtual {p3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1229
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1230
    invoke-static {p0, p1, p2, p3}, Ll/᩹֫᩵;->ۙ(Ljava/util/LinkedList;Ll/᩷ۡۗ;Ljava/util/List;Ljava/util/HashSet;)V

    goto :goto_1

    .line 1232
    :cond_2
    invoke-virtual {p0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_1
    move-object p1, v1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;Ljava/util/function/Consumer;)V
    .locals 2

    .line 403
    sget-object v0, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    if-eq p1, v0, :cond_1

    invoke-virtual {p1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 406
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    .line 407
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 408
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    invoke-interface {p2, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/function/Consumer;)V
    .locals 3

    .line 616
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v0

    new-instance v1, Ll/۟ۘۗ;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ll/۟ۘۗ;-><init>(I)V

    invoke-static {p0, v0, v1, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷۟ۗ;)V
    .locals 3

    .line 620
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v0

    new-instance v1, Ll/᩵ۘۗ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/᩵ۘۗ;-><init>(I)V

    invoke-static {p0, v0, v1, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;ILl/ᩳۡۗ;)V
    .locals 2

    .line 1400
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 430
    invoke-virtual {p3, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p3, v0}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 1402
    invoke-virtual {p3, v0}, Ll/ᩳۡۗ;->ۤ(Ll/ᩳۡۗ;)V

    .line 1403
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getOffset()I

    move-result v1

    invoke-virtual {p3, v1}, Ll/ᩳۡۗ;->ܳ(I)V

    .line 1404
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1406
    invoke-virtual {p3}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    .line 1407
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1408
    invoke-virtual {p1, p2}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1411
    invoke-static {p0, v0}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_0

    .line 1413
    :cond_0
    invoke-static {p0, v0}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 1415
    :goto_0
    invoke-virtual {p3}, Ll/ᩳۡۗ;->ۗۙ()V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;Ljava/util/function/Consumer;)V
    .locals 1

    .line 625
    new-instance v0, Ll/֡ۧ᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/֡ۧ᩵;-><init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;)V

    .line 627
    :goto_0
    invoke-virtual {v0}, Ll/֡ۧ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 631
    :cond_0
    invoke-interface {p3, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Predicate;)V
    .locals 4

    .line 649
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object p0

    .line 657
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 658
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 660
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    if-eqz p1, :cond_3

    .line 661
    invoke-interface {p2, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 664
    :cond_1
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 665
    invoke-virtual {v1}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    .line 666
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-nez v3, :cond_2

    .line 667
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->set(I)V

    .line 668
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Consumer;)V
    .locals 4

    .line 469
    invoke-interface {p3, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    if-ne p1, p2, :cond_0

    goto :goto_1

    .line 473
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    invoke-interface {p3, p2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 478
    :cond_1
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object p0

    .line 479
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 480
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 482
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    if-nez p1, :cond_3

    goto :goto_1

    .line 487
    :cond_3
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    if-ne v1, p2, :cond_5

    .line 489
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 490
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 491
    invoke-static {v0, p3}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 494
    :cond_5
    invoke-virtual {v1}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    .line 495
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-nez v3, :cond_4

    .line 496
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->set(I)V

    .line 497
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 503
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 504
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    return-void
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ljava/util/function/Consumer;)V
    .locals 2

    .line 1244
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    .line 1260
    invoke-static {p0, v0, v1}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ljava/lang/Boolean;Z)Ll/᩷ۡۗ;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 1248
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V
    .locals 2

    .line 1121
    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1124
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/util/BitSet;->set(I)V

    if-eqz p4, :cond_1

    .line 1125
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p1

    .line 1126
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 1127
    invoke-virtual {v0, p0}, Ll/᩷ۡۗ;->᩷(Ll/᩷ۡۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1128
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1129
    invoke-static {p0, v0, p2, p3, p4}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/HashSet;)V
    .locals 2

    .line 703
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 704
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    if-eq v0, p1, :cond_0

    .line 705
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 706
    invoke-static {v0, p1, p2}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/HashSet;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z
    .locals 5

    .line 1419
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 1420
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 1422
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    if-ne v4, p2, :cond_0

    .line 1424
    invoke-static {p0, p1, v3, p3}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;ILl/ᩳۡۗ;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z
    .locals 0

    .line 225
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 228
    :cond_0
    invoke-static {p0}, Ll/᩹֫᩵;->ۚ(Ll/᩷ۡۗ;)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)Z
    .locals 1

    .line 164
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    if-ne v0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/BitSet;ZLl/ܳ֫᩵;)Z
    .locals 4

    if-eqz p3, :cond_0

    .line 730
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    .line 731
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    if-ne v1, p1, :cond_2

    goto :goto_2

    :cond_2
    if-ne v1, p0, :cond_3

    goto :goto_1

    .line 743
    :cond_3
    invoke-virtual {v1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v2

    .line 744
    invoke-virtual {p2, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-nez v3, :cond_1

    .line 745
    invoke-virtual {p2, v2}, Ljava/util/BitSet;->set(I)V

    .line 746
    invoke-virtual {p1, v1}, Ll/᩷ۡۗ;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 749
    :cond_4
    invoke-static {v1, p1, p2, p3, p4}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/BitSet;ZLl/ܳ֫᩵;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_2
    const/4 p0, 0x1

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/᩹ۡۗ;)Z
    .locals 2

    .line 244
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 248
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object p0

    .line 249
    sget-object v1, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-eq p0, v1, :cond_2

    sget-object v1, Ll/᩺ۢۗ;->ۙ᩷:Ll/᩺ۢۗ;

    if-eq p0, v1, :cond_2

    sget-object v1, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    if-eq p0, v1, :cond_2

    sget-object v1, Ll/᩺ۢۗ;->᩷ۙ:Ll/᩺ۢۗ;

    if-ne p0, v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۙ(Ll/᩹ۡۗ;Ll/᩺ۢۗ;)Z
    .locals 0

    .line 178
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 179
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object p0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۚ(Ll/᩷ۡۗ;)Z
    .locals 3

    .line 232
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    .line 233
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 236
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 237
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    .line 238
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0

    :cond_1
    return v2
.end method

.method public static ۤ(Ll/᩷ۡۗ;)Ll/ᩳۡۗ;
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 205
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 206
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    .line 209
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳۡۗ;

    return-object p0
.end method

.method public static ۤ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩷ۡۗ;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    .line 1098
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۤ(Ljava/util/List;)Z
    .locals 1

    .line 1310
    invoke-static {p0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1313
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 1314
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 8

    .line 1591
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_5

    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 1592
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1599
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 1600
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 1601
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eq v0, v3, :cond_0

    goto :goto_3

    .line 1604
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_4

    .line 1606
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    .line 1607
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    if-ne v4, v5, :cond_1

    goto :goto_2

    .line 1619
    :cond_1
    invoke-virtual {v4, v5}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 1620
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 1621
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v4

    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    goto :goto_1

    .line 1628
    :cond_2
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v4

    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v5

    if-ne v4, v5, :cond_5

    goto :goto_2

    :cond_3
    :goto_1
    if-ne v4, v5, :cond_5

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_3
    return v1
.end method

.method public static ۧ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 1301
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1302
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1303
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1304
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    :cond_0
    return-object p0
.end method

.method public static ۫(Ll/᩷ۡۗ;)Z
    .locals 4

    .line 92
    sget-object v0, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    sget-object v1, Ll/֫۟ۗ;->ۧۙ:Ll/֫۟ۗ;

    .line 93
    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    .line 94
    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    sget-object v1, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 98
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    .line 99
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v2, :cond_1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    :goto_0
    return v2
.end method

.method public static ܳ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 3

    .line 1476
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    sget-object v1, Ll/֫۟ۗ;->᩻ۙ:Ll/֫۟ۗ;

    invoke-static {v0, v1}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Ll/֫۟ۗ;)Ll/᩷ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 1478
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t find top splitter block for handler:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1478
    throw v0
.end method

.method public static ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-eq p0, p1, :cond_1

    .line 842
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 845
    :cond_0
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 712
    new-instance v2, Ll/ܳ֫᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܳ֫᩵;-><init>(I)V

    invoke-static {p0, p1, v1, v0, v2}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/BitSet;ZLl/ܳ֫᩵;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static ᩴ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 1151
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 1154
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    .line 1155
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩴ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 5

    .line 1563
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    sget-object v0, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 1563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 1566
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 1567
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 1568
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v1, :cond_1

    goto :goto_2

    .line 1571
    :cond_1
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳۡۗ;

    .line 1572
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۡۗ;

    .line 1573
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    if-eq v0, v3, :cond_2

    goto :goto_2

    .line 1576
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 1579
    :cond_3
    invoke-virtual {p0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 1580
    invoke-virtual {p1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 281
    invoke-virtual {v0}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 282
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_5

    :goto_1
    return v1

    .line 1584
    :cond_5
    invoke-virtual {p0}, Ll/ۚᩳۗ;->۠()I

    move-result p0

    invoke-virtual {p1}, Ll/ۚᩳۗ;->۠()I

    move-result p1

    if-eq p0, p1, :cond_6

    goto :goto_2

    .line 1587
    :cond_6
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_7
    :goto_2
    return v2
.end method

.method public static ᩷(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)I
    .locals 3

    .line 1456
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 1457
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 1459
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;
    .locals 1

    .line 359
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-direct {v0, p0}, Ljava/util/BitSet;-><init>(I)V

    return-object v0
.end method

.method public static ᩷(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/LinkedHashSet;
    .locals 2

    .line 1114
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1115
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object p0

    const/4 v1, 0x1

    invoke-static {p1, p2, v0, p0, v1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    return-object v0
.end method

.method public static ᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;
    .locals 2

    .line 311
    sget-object v0, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 314
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 315
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 316
    invoke-static {v1, p1}, Ll/᩹֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 217
    :cond_0
    invoke-interface {p0}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 218
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/۟۠֫;->ۙ(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    .line 221
    check-cast p0, Ll/ᩳۡۗ;

    return-object p0
.end method

.method public static ᩷(Ljava/util/List;)Ll/᩷ۡۗ;
    .locals 4

    .line 865
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 866
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0

    .line 868
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 870
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    if-eq v1, v3, :cond_1

    .line 871
    invoke-static {v1, v3}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;
    .locals 2

    .line 380
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 383
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0
.end method

.method public static ᩷(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 1198
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    .line 1202
    invoke-static {p0, v0, v1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ljava/lang/Boolean;Z)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/᩷ۡۗ;Ljava/lang/Boolean;Z)Ll/᩷ۡۗ;
    .locals 2

    .line 1265
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, v1, :cond_5

    .line 1266
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_1

    goto :goto_1

    .line 1269
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    .line 1270
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-eq p1, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    .line 1273
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 3

    if-eq p0, p1, :cond_1

    .line 850
    invoke-virtual {p1, p0}, Ll/᩷ۡۗ;->᩷(Ll/᩷ۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 851
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 854
    :cond_0
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 712
    new-instance v1, Ll/ܳ֫᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܳ֫᩵;-><init>(I)V

    invoke-static {p0, p1, v0, v2, v1}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/BitSet;ZLl/ܳ֫᩵;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩸(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 3

    .line 448
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܿۧ᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/ܿۧ᩵;

    move-result-object p1

    .line 449
    invoke-virtual {p1, p2}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 452
    :cond_0
    new-instance v0, Ll/֡ۧ᩵;

    new-instance v1, Ll/ᩳۢ֫;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ll/ᩳۢ֫;-><init>(I)V

    invoke-direct {v0, p0, p2, v1}, Ll/֡ۧ᩵;-><init>(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Function;)V

    .line 454
    :cond_1
    invoke-virtual {v0}, Ll/֡ۧ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object p0

    if-nez p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 458
    :cond_2
    invoke-virtual {p1, p0}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p0
.end method

.method public static ᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 1

    .line 417
    invoke-virtual {p0}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p0

    .line 418
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    return-object p0
.end method

.method public static ᩸(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_1

    goto :goto_1

    .line 1553
    :cond_1
    invoke-static {p0, p1}, Ll/᩹֫᩵;->ᩴ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1557
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v2

    .line 1558
    invoke-static {p1}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v3

    if-eq v2, v3, :cond_4

    .line 1559
    invoke-static {v2, v3}, Ll/᩹֫᩵;->ᩴ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 1553
    :cond_2
    invoke-static {p0, p1}, Ll/᩹֫᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    :goto_0
    return v0

    :cond_5
    :goto_1
    return v1
.end method
