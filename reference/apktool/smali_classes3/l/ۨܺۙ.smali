.class public final Ll/ۨܺۙ;
.super Ljava/lang/Object;
.source "KIV4"


# instance fields
.field public final ۙ:Ljava/util/LinkedHashMap;

.field public final ۤ:Ljava/util/LinkedHashMap;

.field public final ᩴ:Ll/᩵ܺۙ;

.field public final ᩷:Ljava/util/LinkedHashMap;

.field public final ᩸:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 672
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 29
    iput-object v0, p0, Ll/ۨܺۙ;->᩸:Ljava/util/LinkedHashMap;

    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۨܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۨܺۙ;->ۙ:Ljava/util/LinkedHashMap;

    .line 32
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۨܺۙ;->᩷:Ljava/util/LinkedHashMap;

    .line 34
    new-instance p1, Ll/᩵ܺۙ;

    invoke-direct {p1, p0}, Ll/᩵ܺۙ;-><init>(Ll/ۨܺۙ;)V

    iput-object p1, p0, Ll/ۨܺۙ;->ᩴ:Ll/᩵ܺۙ;

    return-void
.end method

.method public static ۙ(Ll/ۨܺۙ;)Landroid/os/Bundle;
    .locals 5

    .line 37
    iget-object v0, p0, Ll/ۨܺۙ;->᩷:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Ll/ۚᩳ᩵;->ۙ(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۙۨ;

    .line 38
    invoke-interface {v1}, Ll/ۘۙۨ;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Ll/ۨܺۙ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Ll/ۨܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Ll/ۚᩳ᩵;->ۙ(Ljava/util/LinkedHashMap;)Ljava/util/Map;

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

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴۢ᩷;

    .line 44
    invoke-interface {v1}, Ll/ᩴۢ᩷;->ۙ()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Ll/ۨܺۙ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 47
    :cond_1
    iget-object p0, p0, Ll/ۨܺۙ;->᩸:Ljava/util/LinkedHashMap;

    .line 32
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-array p0, v1, [Ll/᩷۟᩵;

    goto :goto_3

    .line 150
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 152
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 44
    new-instance v4, Ll/᩷۟᩵;

    invoke-direct {v4, v3, v2}, Ll/᩷۟᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-array p0, v1, [Ll/᩷۟᩵;

    .line 38
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩷۟᩵;

    .line 37
    :goto_3
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩷۟᩵;

    invoke-static {p0}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ()Ll/᩵ܺۙ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۨܺۙ;->ᩴ:Ll/᩵ܺۙ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Ll/ۨܺۙ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object v0, p0, Ll/ۨܺۙ;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۙۨ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/ۘۙۨ;->setValue(Ljava/lang/Object;)V

    .line 106
    :cond_0
    iget-object v0, p0, Ll/ۨܺۙ;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘۙۨ;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Ll/ۘۙۨ;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
