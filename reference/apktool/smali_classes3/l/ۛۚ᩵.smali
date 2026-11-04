.class public final Ll/ۛۚ᩵;
.super Ljava/lang/Object;
.source "R6HH"


# instance fields
.field public final ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۚ᩵;->ۙ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۨᩳۗ;)Ljava/util/Set;
    .locals 2

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 26
    iget-object v1, p0, Ll/ۛۚ᩵;->ۙ:Ljava/util/HashMap;

    invoke-static {v1, p1, v0}, Ll/ۧۚۗ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public final ۙ(Ljava/util/function/BiConsumer;)V
    .locals 3

    .line 30
    iget-object v0, p0, Ll/ۛۚ᩵;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

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

    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {p1, v2, v1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۨᩳۗ;Ljava/lang/Comparable;)V
    .locals 2

    if-ne p1, p2, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance v0, Ll/ۤۖۗ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/ۤۖۗ;-><init>(I)V

    iget-object v1, p0, Ll/ۛۚ᩵;->ۙ:Ljava/util/HashMap;

    invoke-static {v1, p1, v0}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 18
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
