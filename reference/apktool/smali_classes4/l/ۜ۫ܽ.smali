.class public final Ll/ۜ۫ܽ;
.super Ll/᩵۫ܽ;
.source "C3A0"


# virtual methods
.method public final ۙ()Ll/۬۫ܽ;
    .locals 6

    .line 397
    iget-object v0, p0, Ll/᩵۫ܽ;->ۙ:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 157
    sget-object v0, Ll/᩺ܳܽ;->֨:Ll/᩺ܳܽ;

    return-object v0

    .line 400
    :cond_0
    check-cast v0, Ll/ܳܳܽ;

    .line 740
    new-instance v1, Ll/ۙܳܽ;

    invoke-direct {v1, v0}, Ll/ۙܳܽ;-><init>(Ll/ܳܳܽ;)V

    .line 493
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 157
    sget-object v0, Ll/᩺ܳܽ;->֨:Ll/᩺ܳܽ;

    return-object v0

    .line 496
    :cond_1
    new-instance v2, Ll/᩻۫ܽ;

    .line 747
    invoke-virtual {v0}, Ll/ܳܳܽ;->size()I

    move-result v0

    .line 497
    invoke-direct {v2, v0}, Ll/᩻۫ܽ;-><init>(I)V

    .line 500
    invoke-virtual {v1}, Ll/ۙܳܽ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 501
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 502
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ۫ܽ;

    .line 505
    invoke-virtual {v3}, Ll/ۡ۫ܽ;->ۙ()Ll/۠۫ܽ;

    move-result-object v3

    .line 668
    invoke-static {v3}, Ll/۠۫ܽ;->copyOf(Ljava/util/Collection;)Ll/۠۫ܽ;

    move-result-object v3

    .line 506
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 507
    invoke-virtual {v2, v4, v3}, Ll/᩻۫ܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩻۫ܽ;

    .line 508
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 512
    :cond_3
    new-instance v0, Ll/۬۫ܽ;

    invoke-virtual {v2}, Ll/᩻۫ܽ;->᩷()Ll/ܽ۫ܽ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Ll/۬۫ܽ;-><init>(Ll/ܽ۫ܽ;ILjava/util/Comparator;)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 238
    invoke-static {p1, p2}, Ll/ᩳᩴܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Ll/᩵۫ܽ;->ۙ:Ljava/util/Map;

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ll/ܳܳܽ;

    .line 234
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 235
    invoke-virtual {v0, v1}, Ll/ܳܳܽ;->ۤ(I)V

    .line 188
    iput-object v0, p0, Ll/᩵۫ܽ;->ۙ:Ljava/util/Map;

    .line 239
    :cond_0
    check-cast v0, Ll/ܳܳܽ;

    invoke-virtual {v0, p1}, Ll/ܳܳܽ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܳܽ;

    if-nez v0, :cond_2

    .line 272
    sget v0, Ll/۠۫ܽ;->ܿ:I

    const-string v0, "expectedSize"

    const/4 v2, 0x4

    .line 439
    invoke-static {v2, v0}, Ll/ᩳᩴܽ;->ۙ(ILjava/lang/String;)V

    .line 440
    new-instance v0, Ll/ۡ۫ܽ;

    .line 474
    invoke-direct {v0, v2}, Ll/ۜܳܽ;-><init>(I)V

    .line 476
    invoke-static {v2}, Ll/۠۫ܽ;->ۙ(I)I

    move-result v2

    new-array v2, v2, [Ljava/lang/Object;

    iput-object v2, v0, Ll/ۡ۫ܽ;->ᩴ:[Ljava/lang/Object;

    .line 185
    iget-object v2, p0, Ll/᩵۫ܽ;->ۙ:Ljava/util/Map;

    if-nez v2, :cond_1

    .line 93
    new-instance v2, Ll/ܳܳܽ;

    .line 234
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 235
    invoke-virtual {v2, v1}, Ll/ܳܳܽ;->ۤ(I)V

    .line 188
    iput-object v2, p0, Ll/᩵۫ܽ;->ۙ:Ljava/util/Map;

    .line 242
    :cond_1
    check-cast v2, Ll/ܳܳܽ;

    invoke-virtual {v2, p1, v0}, Ll/ܳܳܽ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_2
    invoke-virtual {v0, p2}, Ll/۬ܳܽ;->ۙ(Ljava/lang/Object;)Ll/۬ܳܽ;

    return-void
.end method
