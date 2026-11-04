.class public final Ll/᩷ۙ᩵;
.super Ll/ܺ۠ۗ;
.source "W6DM"


# direct methods
.method private ۙ(Ll/ۖۡۗ;Ll/ۨᩳۗ;)V
    .locals 3

    .line 342
    sget-object v0, Ll/᩻᩶ۗ;->ۤ:Ll/᩻᩶ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p2

    check-cast p2, Ll/ۗ᩶ۗ;

    if-nez p2, :cond_0

    goto :goto_2

    .line 346
    :cond_0
    invoke-virtual {p2}, Ll/ۗ᩶ۗ;->ۙ()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩶ۗ;

    .line 347
    invoke-interface {v0}, Ll/۫᩶ۗ;->getVisibility()Ll/ۤ᩶ۗ;

    move-result-object v1

    sget-object v2, Ll/ۤ᩶ۗ;->֡:Ll/ۤ᩶ۗ;

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 350
    :cond_2
    invoke-interface {v0}, Ll/۫᩶ۗ;->᩷()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 351
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۗ;

    invoke-direct {p0, p1, v1}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V
    .locals 2

    .line 358
    sget-object v0, Ll/ۙۙ᩵;->ۙ:[I

    invoke-virtual {p2}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 379
    :cond_0
    invoke-virtual {p2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 380
    new-instance v0, Ll/ۜ۬ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ۜ۬ۗ;-><init>(Ll/ܺ۠ۗ;Ll/ۖۡۗ;I)V

    invoke-static {p2, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 374
    :cond_1
    invoke-virtual {p2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫᩶ۗ;

    .line 375
    invoke-interface {p2}, Ll/۫᩶ۗ;->᩷()Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ll/۠۬ۗ;

    invoke-direct {v0, p0, p1}, Ll/۠۬ۗ;-><init>(Ll/᩷ۙ᩵;Ll/ۖۡۗ;)V

    invoke-static {p2, v0}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void

    .line 360
    :cond_2
    invoke-virtual {p2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p2

    .line 362
    instance-of v0, p2, Ll/֨ܰۗ;

    if-eqz v0, :cond_3

    .line 363
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    check-cast p2, Ll/֨ܰۗ;

    invoke-static {v0, p2}, Ll/۬ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ܰۗ;)Ll/۬ᩳۗ;

    move-result-object p2

    goto :goto_0

    .line 365
    :cond_3
    check-cast p2, Ll/۬ᩳۗ;

    .line 367
    :goto_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 369
    invoke-virtual {p2, p1}, Ll/ܽۡۗ;->ۙ(Ll/ۖۡۗ;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 400
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->۫ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 401
    invoke-virtual {p1}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    .line 402
    new-instance v1, Ll/ۗۢۗ;

    sget-object v2, Ll/᩺ۢۗ;->ۢ:Ll/᩺ۢۗ;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    const-wide/16 v4, 0x0

    .line 62
    invoke-static {v4, v5, v0}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v0

    .line 403
    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 101
    invoke-virtual {p1, p0, v1, v3}, Ll/ܺ֨ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܺ֨ۗ;

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ᩳۡۗ;)V
    .locals 5

    .line 188
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_3

    .line 189
    check-cast p0, Ll/᩸ۢۗ;

    .line 190
    invoke-virtual {p0}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v0

    .line 191
    sget-object v1, Ll/ᩴۢۗ;->ܿ:Ll/ᩴۢۗ;

    if-eq v0, v1, :cond_0

    sget-object v1, Ll/ᩴۢۗ;->ᩳ:Ll/ᩴۢۗ;

    if-eq v0, v1, :cond_0

    sget-object v1, Ll/ᩴۢۗ;->֡:Ll/ᩴۢۗ;

    if-eq v0, v1, :cond_0

    sget-object v1, Ll/ᩴۢۗ;->ۢ:Ll/ᩴۢۗ;

    if-ne v0, v1, :cond_7

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_7

    .line 193
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 194
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v2, Ll/ܽ֨ۗ;

    if-eqz v3, :cond_2

    .line 195
    check-cast v2, Ll/ܽ֨ۗ;

    invoke-virtual {v2}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v2

    .line 196
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    sget-object v4, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-ne v3, v4, :cond_1

    move-object v3, v2

    check-cast v3, Ll/᩸ۢۗ;

    invoke-virtual {v3}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v3

    if-ne v3, v0, :cond_1

    .line 197
    sget-object v3, Ll/֫۟ۗ;->۫ۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 199
    :cond_1
    invoke-static {v2}, Ll/᩷ۙ᩵;->ۙ(Ll/ᩳۡۗ;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 204
    :cond_3
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->۬ۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_5

    .line 205
    move-object v0, p0

    check-cast v0, Ll/ۙۡۗ;

    invoke-virtual {v0}, Ll/ۙۡۗ;->᩵ۙ()Ll/ۢۖۗ;

    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object v1

    .line 218
    invoke-virtual {v0}, Ll/ۢۖۗ;->۠()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۖۗ;

    .line 219
    invoke-virtual {v2}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object v3

    if-ne v3, v1, :cond_4

    .line 220
    sget-object v3, Ll/֫۟ۗ;->۫ۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_1

    .line 207
    :cond_5
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_6

    .line 209
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 210
    invoke-static {v0}, Ll/᩷ۙ᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ۙ᩵;Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V
    .locals 0

    .line 380
    invoke-direct {p0, p1, p2}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ۙ᩵;Ll/ۖۡۗ;Ll/ܽۡۗ;)V
    .locals 0

    .line 338
    invoke-direct {p0, p1, p2}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۨᩳۗ;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩷ۙ᩵;Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V
    .locals 0

    .line 375
    invoke-direct {p0, p1, p2}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܳ᩶ۗ;)V

    return-void
.end method

.method public static ᩷(Ll/᩻ۡۗ;)V
    .locals 5

    .line 313
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

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

    .line 314
    invoke-static {v1}, Ll/᩷ۙ᩵;->᩷(Ll/᩻ۡۗ;)V

    goto :goto_0

    .line 316
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/util/List;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v1, 0x2

    aput-object v2, v3, v1

    invoke-static {v3}, Ll/᩹ܺۗ;->of([Ljava/lang/Object;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۘۜۧ;

    invoke-direct {v2, v0}, Ll/ۘۜۧ;-><init>(I)V

    .line 317
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/֨۬ۗ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 318
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۡ۬ۗ;

    invoke-direct {v2, v4}, Ll/ۡ۬ۗ;-><init>(I)V

    .line 319
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/֫֡ۗ;

    invoke-direct {v2, v4}, Ll/֫֡ۗ;-><init>(I)V

    .line 320
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ܽܺۗ;

    move-result-object v1

    .line 321
    invoke-interface {v1}, Ll/ܽܺۗ;->min()Ll/᩹ۚۗ;

    move-result-object v1

    .line 322
    invoke-virtual {v1, v4}, Ll/᩹ۚۗ;->orElse(I)I

    move-result v1

    if-eqz v1, :cond_1

    sub-int/2addr v1, v0

    .line 324
    invoke-virtual {p0, v1}, Ll/ۚᩳۗ;->᩷(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "PrepareForCodeGen"

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 10

    .line 78
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 81
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 82
    sget-object v3, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 98
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 99
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 100
    sget-object v6, Ll/ۙۙ᩵;->᩷:[I

    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    goto :goto_1

    .line 117
    :pswitch_0
    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v6

    .line 118
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩹()I

    move-result v7

    if-nez v7, :cond_3

    .line 119
    invoke-virtual {v5, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 122
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 123
    instance-of v7, v5, Ll/ۗ֨ۗ;

    if-nez v7, :cond_4

    goto :goto_2

    .line 126
    :cond_4
    check-cast v5, Ll/ۗ֨ۗ;

    invoke-interface {v5}, Ll/ۗ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_3

    .line 120
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 109
    :pswitch_1
    check-cast v5, Ll/ۜ֨ۗ;

    .line 110
    invoke-virtual {v5}, Ll/ۜ֨ۗ;->֡ۙ()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 105
    :pswitch_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 131
    :cond_6
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x0

    .line 132
    :goto_4
    move-object v6, v3

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_8

    .line 133
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۡۗ;

    .line 135
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v9, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v8, v9, :cond_7

    .line 136
    invoke-virtual {v7, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v8, v8, Ll/ܽ֨ۗ;

    if-eqz v8, :cond_7

    .line 137
    invoke-virtual {v7, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    check-cast v8, Ll/ܽ֨ۗ;

    invoke-virtual {v8}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v8

    .line 138
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 430
    invoke-virtual {v8, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v8, v7}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 140
    invoke-virtual {v6, v5, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 178
    :cond_8
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 179
    invoke-static {v5}, Ll/᩷ۙ᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto :goto_5

    .line 230
    :cond_9
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    .line 231
    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 232
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_a

    sget-object v6, Ll/֫۟ۗ;->ᩳ:Ll/֫۟ۗ;

    .line 233
    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-nez v7, :cond_a

    sget-object v7, Ll/֫۟ۗ;->۬:Ll/֫۟ۗ;

    .line 234
    invoke-virtual {v5, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 235
    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    .line 236
    invoke-virtual {v5, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    .line 238
    invoke-virtual {v7, v8}, Ll/ۛ֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/4 v7, 0x1

    goto :goto_7

    .line 240
    :cond_b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v8, Ll/ۛ֨ۗ;

    if-eqz v9, :cond_c

    .line 241
    check-cast v8, Ll/ۛ֨ۗ;

    .line 242
    invoke-virtual {v7, v8}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result v7

    goto :goto_7

    :cond_c
    const/4 v7, 0x0

    :goto_7
    if-eqz v7, :cond_a

    .line 245
    invoke-virtual {v5, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 246
    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_6

    .line 149
    :cond_d
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 150
    new-instance v5, Ll/ۢ۬ۗ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v5}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_8

    .line 386
    :cond_e
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 387
    sget-object v3, Ll/ۙۙ᩵;->᩷:[I

    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v3, v3, v5

    const/16 v5, 0xd

    if-eq v3, v5, :cond_10

    const/16 v5, 0xe

    if-eq v3, v5, :cond_f

    goto :goto_9

    .line 393
    :cond_f
    invoke-virtual {v2, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-static {p1, v2}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    goto :goto_9

    .line 389
    :cond_10
    check-cast v2, Ll/᩶ۢۗ;

    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-static {p1, v2}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    goto :goto_9

    .line 257
    :cond_11
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_c

    .line 295
    :cond_12
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 296
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 297
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_14

    .line 298
    check-cast v5, Ll/ۜ֨ۗ;

    .line 299
    invoke-virtual {v5}, Ll/ۜ֨ۗ;->۟ۙ()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v5}, Ll/ۜ֨ۗ;->ۢۙ()Z

    move-result v0

    if-eqz v0, :cond_16

    :cond_15
    move-object v2, v5

    :cond_16
    if-eqz v2, :cond_22

    .line 261
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto/16 :goto_c

    .line 1374
    :cond_17
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v0

    .line 1375
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    .line 1376
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1b

    goto :goto_b

    .line 256
    :cond_18
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v2, v0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 1383
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_19

    goto :goto_a

    .line 1386
    :cond_19
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/HashSet;

    move-result-object v1

    .line 1387
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 1388
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1a

    if-eq v5, v0, :cond_1a

    :cond_1b
    :goto_a
    const/4 v3, 0x0

    .line 265
    :cond_1c
    :goto_b
    invoke-virtual {p1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    sget-object v1, Ll/ۧ۟ۗ;->ᩴ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/֡۟ۗ;

    if-eqz v3, :cond_1d

    if-nez v0, :cond_1d

    goto/16 :goto_c

    .line 270
    :cond_1d
    invoke-virtual {v2}, Ll/ۜ֨ۗ;->ܰۙ()Ll/۠֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v2, v1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v1

    if-nez v1, :cond_1e

    .line 273
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to move "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " instruction to top"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    goto :goto_c

    :cond_1e
    if-nez v3, :cond_20

    .line 278
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 279
    invoke-virtual {v2, v3}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 280
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 281
    invoke-virtual {p1}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v5

    new-instance v6, Ll/۬۬ۗ;

    invoke-direct {v6, v3}, Ll/۬۬ۗ;-><init>(Ljava/util/HashSet;)V

    invoke-static {v5, v6}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 282
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1f

    const-string v0, "Illegal instructions before constructor call"

    .line 283
    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_c

    .line 286
    :cond_1f
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\'"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' call moved to the top of the method (can break code semantics)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 290
    :cond_20
    invoke-static {v1, v2}, Ll/᩶֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    .line 291
    invoke-virtual {p1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/֡ۡۗ;

    invoke-direct {v1, v2}, Ll/֡ۡۗ;-><init>(Ll/ᩳۡۗ;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_c

    .line 1381
    :cond_21
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Insn not found in method: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1381
    throw p1

    .line 93
    :cond_22
    :goto_c
    invoke-direct {p0, p1, p1}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۨᩳۗ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 2

    .line 69
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-static {p1}, Ll/᩷ۙ᩵;->᩷(Ll/᩻ۡۗ;)V

    .line 329
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩻ۙ()Ll/ۖۡۗ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 330
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 331
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    :cond_1
    if-nez v0, :cond_2

    goto :goto_0

    .line 336
    :cond_2
    invoke-direct {p0, v0, p1}, Ll/᩷ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۨᩳۗ;)V

    .line 338
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object p1

    new-instance v1, Ll/ۖ۬ۗ;

    invoke-direct {v1, p0, v0}, Ll/ۖ۬ۗ;-><init>(Ll/᩷ۙ᩵;Ll/ۖۡۗ;)V

    invoke-static {p1, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
