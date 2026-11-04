.class public final Ll/ۛܰۗ;
.super Ljava/lang/Object;
.source "9ISY"

# interfaces
.implements Ll/᩻ܰۗ;


# instance fields
.field public final ۤ:Ljava/util/NavigableMap;

.field public final ᩷:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/NavigableMap;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۛܰۗ;->᩷:Ljava/util/Map;

    .line 46
    iput-object p2, p0, Ll/ۛܰۗ;->ۤ:Ljava/util/NavigableMap;

    return-void
.end method

.method public static ۙ(Ljava/util/Map;Ljava/util/Map;)Ll/ۛܰۗ;
    .locals 2

    .line 24
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object p0, Ll/᩻ܰۗ;->ۙ:Ll/ۛܰۗ;

    return-object p0

    .line 27
    :cond_0
    new-instance v0, Ll/۟ܳ᩸;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۖ۫ۗ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ۗ;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    .line 28
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 29
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 30
    new-instance p1, Ll/ۛܰۗ;

    invoke-direct {p1, p0, v1}, Ll/ۛܰۗ;-><init>(Ljava/util/Map;Ljava/util/NavigableMap;)V

    return-object p1
.end method

.method public static ᩷()Ll/ۛܰۗ;
    .locals 3

    .line 34
    new-instance v0, Ll/ۛܰۗ;

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {}, Ll/ᩴۚܽ;->of()Ll/ᩴۚܽ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۛܰۗ;-><init>(Ljava/util/Map;Ljava/util/NavigableMap;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeMetadata{\nlines="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۛܰۗ;->᩷:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nannotations=\n "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛܰۗ;->ۤ:Ljava/util/NavigableMap;

    .line 154
    invoke-interface {v1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "\n "

    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(ILjava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 2

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    iget-object v1, p0, Ll/ۛܰۗ;->ۤ:Ljava/util/NavigableMap;

    invoke-interface {v1, p1, v0}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object p1

    .line 94
    invoke-interface {p1}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 95
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܰۗ;

    invoke-interface {p2, v1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ()Ljava/util/NavigableMap;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۛܰۗ;->ۤ:Ljava/util/NavigableMap;

    return-object v0
.end method

.method public final ۙ(I)Ll/ۧܰۗ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۛܰۗ;->ۤ:Ljava/util/NavigableMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧܰۗ;

    return-object p1
.end method
