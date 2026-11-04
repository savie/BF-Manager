.class public final Ll/ܿۖۗ;
.super Ll/᩵ۖۗ;
.source "86CQ"

# interfaces
.implements Ll/ۗۡۗ;


# instance fields
.field public ۟:Ljava/util/Map;

.field public final ۢ:Ll/ۨۖۗ;

.field public ᩳ:Ll/ܿۡۗ;


# direct methods
.method public constructor <init>(Ll/ܿۡۗ;Ll/ۨۖۗ;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Ll/᩵ۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 22
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    .line 28
    iput-object p2, p0, Ll/ܿۖۗ;->ۢ:Ll/ۨۖۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Try: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    iget-object v1, p0, Ll/ܿۖۗ;->ۢ:Ll/ۨۖۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    iget-object v1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, " catches: "

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    :cond_0
    iget-object v1, p0, Ll/ܿۖۗ;->ᩳ:Ll/ܿۡۗ;

    if-eqz v1, :cond_1

    const-string v1, " finally: "

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۖۗ;->ᩳ:Ll/ܿۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Ljava/util/Map;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    return-object v0
.end method

.method public final ۙ(Ll/۫۠ۗ;)V
    .locals 3

    .line 33
    invoke-virtual {p1}, Ll/۫۠ۗ;->۫()I

    move-result v0

    .line 34
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    .line 35
    invoke-virtual {p1}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ۠ۗ;

    .line 36
    invoke-virtual {v0}, Ll/ᩴ۠ۗ;->ۚ()Ll/ܿۡۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v0}, Ll/ᩴ۠ۗ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 39
    iput-object v1, p0, Ll/ܿۖۗ;->ᩳ:Ll/ܿۡۗ;

    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 85
    invoke-virtual {p1, p0, p2}, Ll/۬֡ۗ;->ۙ(Ll/ܿۖۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۜ()Ll/ۛۡۗ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ܿۖۗ;->ۢ:Ll/ۨۖۗ;

    return-object v0
.end method

.method public final ۠()Ll/ܿۡۗ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܿۖۗ;->ᩳ:Ll/ܿۡۗ;

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 2

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    iget-object v1, p0, Ll/ܿۖۗ;->ۢ:Ll/ۨۖۗ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v1, p0, Ll/ܿۖۗ;->۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    iget-object v1, p0, Ll/ܿۖۗ;->ᩳ:Ll/ܿۡۗ;

    if-eqz v1, :cond_0

    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_0
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܿۖۗ;->ۢ:Ll/ۨۖۗ;

    invoke-virtual {v0}, Ll/ۨۖۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
