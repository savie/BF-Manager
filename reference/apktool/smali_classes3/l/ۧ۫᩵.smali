.class public final Ll/ۧ۫᩵;
.super Ljava/lang/Object;
.source "DITR"


# instance fields
.field public final ۙ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object p1

    .line 24
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Ll/ۧ۫᩵;->ۙ:Ljava/util/LinkedHashMap;

    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    .line 26
    iget-object v1, p0, Ll/ۧ۫᩵;->ۙ:Ljava/util/LinkedHashMap;

    new-instance v2, Ll/᩻۫᩵;

    invoke-direct {v2, v0}, Ll/᩻۫᩵;-><init>(Ll/ܿ֨ۗ;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 3

    .line 58
    iget-object v0, p0, Ll/ۧ۫᩵;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩵ۨܳ;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/᩵ۨܳ;-><init>(I)V

    .line 59
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 60
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;
    .locals 1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 41
    check-cast p1, Ll/ۛ֨ۗ;

    .line 42
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۧ۫᩵;->ۙ(Ll/ܿ֨ۗ;)Ll/᩻۫᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩻۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 44
    :cond_0
    invoke-virtual {p1}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ܿ֨ۗ;)Ll/᩻۫᩵;
    .locals 3

    .line 32
    iget-object v0, p0, Ll/ۧ۫᩵;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻۫᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 34
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TypeSearchVarInfo not found in map for var: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    throw v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 3

    .line 52
    iget-object v0, p0, Ll/ۧ۫᩵;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۚۖۗ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/ۚۖۗ;-><init>(I)V

    .line 53
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 54
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
