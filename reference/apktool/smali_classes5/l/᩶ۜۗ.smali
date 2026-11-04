.class public final Ll/᩶ۜۗ;
.super Ll/ܺ۠ۗ;
.source "K6HV"


# direct methods
.method public static synthetic ۙ(Ljava/util/HashMap;Ll/ܽۡۗ;)Ljava/lang/String;
    .locals 2

    .line 295
    new-instance v0, Ll/֨ۙ᩺;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ll/֨ۙ᩺;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/᩺ۢۗ;)Ljava/util/ArrayList;
    .locals 11

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 176
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 177
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 1141
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1142
    invoke-static {v2}, Ll/᩹֫᩵;->ᩴ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    .line 1144
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1145
    invoke-static {v2}, Ll/᩹֫᩵;->ᩴ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v2

    goto :goto_0

    .line 180
    :cond_1
    :goto_1
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 181
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 183
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    const/4 v7, 0x0

    if-ne v6, p2, :cond_5

    .line 184
    move-object v6, v5

    check-cast v6, Ll/ۗۢۗ;

    .line 185
    invoke-virtual {v6}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۬ᩳۗ;

    .line 186
    invoke-virtual {v8}, Ll/۬ᩳۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v9

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v10

    invoke-virtual {v9, v10}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 187
    invoke-virtual {p0, v8}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v8

    if-eqz v8, :cond_5

    if-eqz v2, :cond_4

    .line 189
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v7, 0x1

    .line 190
    :cond_4
    new-instance v5, Ll/ܰۜۗ;

    invoke-direct {v5, v8, v6, v7}, Ll/ܰۜۗ;-><init>(Ll/ܽۡۗ;Ll/ۗۢۗ;Z)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_3

    .line 195
    invoke-virtual {v5}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v5

    if-nez v5, :cond_3

    const/4 v2, 0x0

    goto :goto_2

    :cond_6
    return-object v0
.end method

.method public static ۙ(Ljava/util/ArrayList;)V
    .locals 7

    .line 206
    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۨۜۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll/ۛۜۗ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ll/᩺ۜۗ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 207
    invoke-static {v1, v2, v3}, Ll/֫ܺۗ;->toMap(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;)Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 208
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 209
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ܳ۫ۚ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ܳ۫ۚ;-><init>(I)V

    .line 210
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ܳۖۗ;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ll/ܳۖۗ;-><init>(I)V

    .line 211
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 212
    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 214
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜۗ;

    .line 243
    iget-boolean v4, v2, Ll/ܰۜۗ;->ۙ:Z

    if-nez v4, :cond_1

    goto :goto_1

    .line 246
    :cond_1
    iget-object v4, v2, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 247
    invoke-virtual {v4, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 248
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v3, Ll/ܽ֨ۗ;

    if-eqz v5, :cond_4

    .line 249
    check-cast v3, Ll/ܽ֨ۗ;

    invoke-virtual {v3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v3

    .line 250
    invoke-virtual {v3}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {v4, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 256
    :cond_2
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 257
    invoke-virtual {v4, v3}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 258
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 259
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֨ۗ;

    .line 260
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v5, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 0
    :cond_4
    instance-of v4, v3, Ll/᩹֨ۗ;

    if-nez v4, :cond_0

    .line 252
    sget-object v4, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_0

    .line 216
    :cond_5
    :goto_1
    iget-object v2, v2, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    invoke-virtual {v2}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 219
    :cond_6
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    .line 223
    :cond_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_8
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۜۗ;

    .line 224
    iget-object v4, v3, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    invoke-virtual {v4}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v4

    .line 225
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_2

    .line 269
    :cond_9
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_a

    const/4 v3, 0x0

    goto :goto_4

    .line 272
    :cond_a
    iget-object v3, v3, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 273
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_b

    .line 274
    sget-object v5, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    goto :goto_3

    :cond_b
    sget-object v5, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    .line 276
    :goto_3
    new-instance v6, Ll/ܽۜۗ;

    invoke-direct {v6, v5, v0}, Ll/ܽۜۗ;-><init>(Ll/᩺ۢۗ;Ljava/util/Set;)V

    invoke-virtual {v3, v6}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    .line 285
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_4
    if-eqz v3, :cond_8

    .line 229
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_2

    :cond_c
    if-nez v2, :cond_7

    .line 237
    :cond_d
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_e

    .line 238
    new-instance v1, Ll/ܺۜۗ;

    invoke-direct {v1, v0}, Ll/ܺۜۗ;-><init>(Ljava/util/Set;)V

    invoke-static {p0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    :cond_e
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܽۡۗ;Ll/ۗۢۗ;)V
    .locals 4

    const/4 v0, 0x0

    .line 422
    invoke-virtual {p2, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_0

    .line 424
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    goto :goto_0

    .line 49
    :cond_0
    new-instance v1, Ll/ᩳۡۗ;

    sget-object v2, Ll/᩺ۢۗ;->֡ۙ:Ll/᩺ۢۗ;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 50
    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    move-object v0, v1

    .line 428
    :goto_0
    new-instance v1, Ll/ۨ۟ۗ;

    invoke-direct {v1, p0, v0}, Ll/ۨ۟ۗ;-><init>(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 429
    invoke-virtual {p2}, Ll/ۚᩳۗ;->۠()I

    move-result p0

    if-eqz p0, :cond_1

    .line 430
    invoke-virtual {p2}, Ll/ۚᩳۗ;->۠()I

    move-result p0

    invoke-virtual {p1, p0}, Ll/ۚᩳۗ;->᩷(I)V

    :cond_1
    return-void
.end method

.method public static synthetic ۙ(Ll/᩺ۢۗ;Ll/᩻ۡۗ;Ljava/util/HashMap;Ll/ܰۜۗ;Ll/ᩳۡۗ;)V
    .locals 1

    .line 354
    invoke-virtual {p4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 355
    check-cast p4, Ll/ۗۢۗ;

    invoke-virtual {p4}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۬ᩳۗ;

    .line 356
    invoke-virtual {p0}, Ll/۬ᩳۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object p4

    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {p4, v0}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 357
    invoke-virtual {p1, p0}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 359
    iget-object p1, p3, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    new-instance p3, Ll/᩹ۜۗ;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Ll/᩹ۜۗ;-><init>(I)V

    invoke-static {p2, p1, p3}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 360
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ljava/util/List;)V
    .locals 7

    .line 348
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 349
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜۗ;

    .line 350
    iget-object v3, v2, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 351
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_0

    .line 352
    sget-object v4, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    goto :goto_1

    :cond_0
    sget-object v4, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    .line 353
    :goto_1
    new-instance v5, Ll/᩻ۜۗ;

    invoke-direct {v5, v4, p0, v0, v2}, Ll/᩻ۜۗ;-><init>(Ll/᩺ۢۗ;Ll/᩻ۡۗ;Ljava/util/HashMap;Ll/ܰۜۗ;)V

    invoke-virtual {v3, v5}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 310
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    .line 311
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_5

    .line 314
    :cond_2
    new-instance v1, Ll/ܶۜۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p1

    .line 315
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 316
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۡۗ;

    .line 317
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 318
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-nez v5, :cond_4

    if-ne v4, v2, :cond_3

    .line 321
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    if-ne v4, v2, :cond_7

    .line 326
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 327
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 328
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 331
    :cond_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 334
    :cond_7
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 335
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v6

    if-ne v6, v2, :cond_9

    .line 337
    invoke-virtual {v1, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_4

    :cond_9
    if-le v6, v4, :cond_8

    .line 339
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 340
    invoke-virtual {v1, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_4

    :cond_a
    move-object p1, v1

    .line 292
    :goto_5
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object p0

    .line 293
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 294
    new-instance v1, Ll/ۗۜۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/ۖ۫ۗ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    new-instance v3, Ll/᩵ۜۗ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Ll/᩵ۜۗ;-><init>(ILjava/lang/Object;)V

    .line 295
    invoke-static {v1, v3}, Ll/۠۫ۗ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    .line 294
    invoke-static {p0, v0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 297
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 299
    invoke-static {p0, p1}, Ljava/util/Collections;->indexOfSubList(Ljava/util/List;Ljava/util/List;)I

    move-result v0

    if-eq v0, v2, :cond_b

    goto :goto_6

    .line 301
    :cond_b
    invoke-interface {p0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 302
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_6
    return-void
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z
    .locals 6

    .line 385
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 388
    :goto_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 389
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 390
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 392
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v4, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 392
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    .line 0
    :cond_1
    instance-of v4, v2, Ll/ܽ֨ۗ;

    if-eqz v4, :cond_2

    .line 395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v3, Ll/ܽ֨ۗ;

    if-eqz v4, :cond_2

    .line 396
    check-cast v2, Ll/ܽ֨ۗ;

    invoke-virtual {v2}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v2

    check-cast v3, Ll/ܽ֨ۗ;

    invoke-virtual {v3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v3

    invoke-static {v2, v3}, Ll/᩶ۜۗ;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 399
    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    return v1

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 10

    .line 48
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۗ;

    .line 49
    invoke-virtual {p0, v1}, Ll/᩶ۜۗ;->ۙ(Ll/᩻ۡۗ;)Z

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1b

    const-string v0, "<clinit>()V"

    .line 812
    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ᩴ(Ljava/lang/String;)Ll/ۖۡۗ;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 83
    invoke-virtual {v0}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 84
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v2

    if-nez v2, :cond_9

    .line 85
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_4

    .line 88
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll/᩵ۨܳ;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/᩵ۨܳ;-><init>(I)V

    .line 239
    invoke-static {v2, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_4

    .line 98
    :cond_2
    :goto_1
    sget-object v2, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    invoke-static {p1, v0, v2}, Ll/᩶ۜۗ;->ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/᩺ۢۗ;)Ljava/util/ArrayList;

    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_4

    .line 103
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜۗ;

    .line 104
    iget-object v4, v4, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    .line 105
    invoke-virtual {v4}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۢᩳۗ;->۫()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 106
    sget-object v5, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    goto :goto_2

    .line 109
    :cond_5
    invoke-static {v2}, Ll/᩶ۜۗ;->ۙ(Ljava/util/ArrayList;)V

    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    .line 113
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜۗ;

    .line 114
    iget-object v5, v4, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 115
    invoke-virtual {v5, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    .line 116
    instance-of v7, v6, Ll/ܽ֨ۗ;

    if-eqz v7, :cond_7

    .line 117
    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    sget-object v7, Ll/֫۟ۗ;->۬:Ll/֫۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 119
    :cond_7
    invoke-static {v0, v5}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 120
    iget-object v4, v4, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    invoke-static {v0, v4, v5}, Ll/᩶ۜۗ;->ۙ(Ll/ۖۡۗ;Ll/ܽۡۗ;Ll/ۗۢۗ;)V

    goto :goto_3

    .line 122
    :cond_8
    invoke-static {p1, v2}, Ll/᩶ۜۗ;->ۙ(Ll/᩻ۡۗ;Ljava/util/List;)V

    .line 93
    invoke-static {v0}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    goto :goto_1

    .line 127
    :cond_9
    :goto_4
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ll/᩹᩷۫;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/᩹᩷۫;-><init>(I)V

    .line 239
    invoke-static {v0, v2}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_a

    .line 407
    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 408
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 409
    invoke-virtual {v3}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    .line 410
    invoke-virtual {v4}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v4}, Ll/ۢᩳۗ;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 411
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    invoke-virtual {v3}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v3}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Ll/᩹֫᩵;->ۤ(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 413
    :cond_c
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 131
    :cond_d
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_e

    goto/16 :goto_a

    .line 134
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 136
    sget-object v4, Ll/᩺ۢۗ;->᩻ۙ:Ll/᩺ۢۗ;

    invoke-static {p1, v3, v4}, Ll/᩶ۜۗ;->ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/᩺ۢۗ;)Ljava/util/ArrayList;

    move-result-object v4

    .line 137
    invoke-static {v4}, Ll/᩶ۜۗ;->ۙ(Ljava/util/ArrayList;)V

    .line 138
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_f

    goto/16 :goto_a

    .line 141
    :cond_f
    new-instance v5, Ll/ۘۜۗ;

    invoke-direct {v5, v3, v4}, Ll/ۘۜۗ;-><init>(Ll/ۖۡۗ;Ljava/util/ArrayList;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 145
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :cond_11
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘۜۗ;

    if-nez v3, :cond_12

    move-object v3, v4

    goto :goto_6

    .line 150
    :cond_12
    iget-object v5, v3, Ll/ۘۜۗ;->᩷:Ljava/util/ArrayList;

    iget-object v4, v4, Ll/ۘۜۗ;->᩷:Ljava/util/ArrayList;

    .line 370
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-eq v6, v7, :cond_13

    goto/16 :goto_a

    .line 373
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_11

    .line 375
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰۜۗ;

    iget-object v8, v8, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 376
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܰۜۗ;

    iget-object v9, v9, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 377
    invoke-static {v8, v9}, Ll/᩶ۜۗ;->ۙ(Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_a

    :cond_14
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_15
    if-nez v3, :cond_16

    goto :goto_a

    .line 154
    :cond_16
    iget-object v0, v3, Ll/ۘۜۗ;->᩷:Ljava/util/ArrayList;

    .line 158
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘۜۗ;

    .line 159
    iget-object v5, v4, Ll/ۘۜۗ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۜۗ;

    .line 160
    iget-object v6, v6, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    .line 161
    invoke-virtual {v6, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    .line 162
    instance-of v8, v7, Ll/ܽ֨ۗ;

    if-eqz v8, :cond_18

    .line 163
    check-cast v7, Ll/ܽ֨ۗ;

    invoke-virtual {v7}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    sget-object v8, Ll/֫۟ۗ;->۬:Ll/֫۟ۗ;

    invoke-virtual {v7, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 165
    :cond_18
    iget-object v7, v4, Ll/ۘۜۗ;->ۙ:Ll/ۖۡۗ;

    invoke-static {v7, v6}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_8

    .line 168
    :cond_19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜۗ;

    .line 169
    iget-object v5, v3, Ll/ۘۜۗ;->ۙ:Ll/ۖۡۗ;

    iget-object v6, v4, Ll/ܰۜۗ;->᩷:Ll/ܽۡۗ;

    iget-object v4, v4, Ll/ܰۜۗ;->ۤ:Ll/ۗۢۗ;

    invoke-static {v5, v6, v4}, Ll/᩶ۜۗ;->ۙ(Ll/ۖۡۗ;Ll/ܽۡۗ;Ll/ۗۢۗ;)V

    goto :goto_9

    .line 171
    :cond_1a
    invoke-static {p1, v0}, Ll/᩶ۜۗ;->ۙ(Ll/᩻ۡۗ;Ljava/util/List;)V

    :cond_1b
    :goto_a
    return v1
.end method
