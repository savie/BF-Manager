.class public Ll/ܰۗ;
.super Ll/ۡۗ;
.source "J5WP"

# interfaces
.implements Ljava/util/Map;
.implements Ll/ܺۚۗ;


# instance fields
.field public ֡:Ll/ۗۗ;

.field public ۟:Ll/ۨۗ;

.field public ᩳ:Ll/᩺ۗ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ll/ۡۗ;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/֫ۚۗ;->$default$compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/֫ۚۗ;->$default$computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/֫ۚۗ;->$default$computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ܰۗ;->֡:Ll/ۗۗ;

    if-nez v0, :cond_0

    .line 219
    new-instance v0, Ll/ۗۗ;

    invoke-direct {v0, p0}, Ll/ۗۗ;-><init>(Ll/ܰۗ;)V

    iput-object v0, p0, Ll/ܰۗ;->֡:Ll/ۗۗ;

    :cond_0
    return-object v0
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚۗ;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ܰۗ;->۟:Ll/ۨۗ;

    if-nez v0, :cond_0

    .line 236
    new-instance v0, Ll/ۨۗ;

    invoke-direct {v0, p0}, Ll/ۨۗ;-><init>(Ll/ܰۗ;)V

    iput-object v0, p0, Ll/ܰۗ;->۟:Ll/ۨۗ;

    :cond_0
    return-object v0
.end method

.method public synthetic merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/֫ۚۗ;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    .line 164
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/ۡۗ;->᩷(I)V

    .line 165
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 166
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚۗ;->$default$replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ܰۗ;->ᩳ:Ll/᩺ۗ;

    if-nez v0, :cond_0

    .line 253
    new-instance v0, Ll/᩺ۗ;

    invoke-direct {v0, p0}, Ll/᩺ۗ;-><init>(Ll/ܰۗ;)V

    iput-object v0, p0, Ll/ܰۗ;->ᩳ:Ll/᩺ۗ;

    :cond_0
    return-object v0
.end method

.method public final ۙ(Ljava/util/Collection;)Z
    .locals 1

    .line 98
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 115
    invoke-super {p0, v0}, Ll/ۡۗ;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۤ(Ljava/util/Collection;)Z
    .locals 4

    .line 192
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result v0

    .line 193
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    .line 194
    invoke-virtual {p0, v1}, Ll/ۡۗ;->ۤ(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 195
    invoke-virtual {p0, v1}, Ll/ۡۗ;->ᩴ(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 198
    :cond_1
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result p1

    if-eq v0, p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ljava/util/Collection;)Z
    .locals 2

    .line 177
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result v0

    .line 178
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 154
    invoke-super {p0, v1}, Ll/ۡۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 181
    :cond_0
    invoke-virtual {p0}, Ll/ۡۗ;->size()I

    move-result p1

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
