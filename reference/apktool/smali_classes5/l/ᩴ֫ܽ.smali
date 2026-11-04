.class public abstract Ll/ᩴ֫ܽ;
.super Ll/ᩳܳܽ;
.source "067E"

# interfaces
.implements Ljava/util/NavigableMap;


# instance fields
.field public transient ܰ:Ll/ᩳ֫ܽ;

.field public transient ܿ:Ljava/util/NavigableSet;

.field public transient ᩶:Ljava/util/Set;


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 4134
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4134
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4139
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4139
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->floorKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 4084
    iget-object v0, p0, Ll/ᩴ֫ܽ;->ܰ:Ll/ᩳ֫ܽ;

    if-nez v0, :cond_1

    .line 4086
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4086
    invoke-interface {v0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v0

    if-nez v0, :cond_0

    .line 174
    sget-object v0, Ll/֡֫ܽ;->ܰ:Ll/֡֫ܽ;

    .line 4097
    :cond_0
    invoke-static {v0}, Ll/ᩳ֫ܽ;->᩷(Ljava/util/Comparator;)Ll/ᩳ֫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֫ܽ;->ۙ()Ll/ᩳ֫ܽ;

    move-result-object v0

    .line 4090
    iput-object v0, p0, Ll/ᩴ֫ܽ;->ܰ:Ll/ᩳ֫ܽ;

    :cond_1
    return-object v0
.end method

.method public final descendingKeySet()Ljava/util/NavigableSet;
    .locals 2

    .line 4224
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    new-instance v1, Ll/ۧ֫ܽ;

    .line 3782
    invoke-direct {v1, v0}, Ll/֫֫ܽ;-><init>(Ljava/util/Map;)V

    return-object v1
.end method

.method public final descendingMap()Ljava/util/NavigableMap;
    .locals 1

    .line 4174
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    return-object v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 4181
    iget-object v0, p0, Ll/ᩴ֫ܽ;->᩶:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 4203
    new-instance v0, Ll/᩸֫ܽ;

    invoke-direct {v0, p0}, Ll/᩸֫ܽ;-><init>(Ll/ᩴ֫ܽ;)V

    .line 4183
    iput-object v0, p0, Ll/ᩴ֫ܽ;->᩶:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 4154
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4154
    invoke-virtual {v0}, Ll/ۧᩴܽ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 4103
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4103
    invoke-virtual {v0}, Ll/ۧᩴܽ;->lastKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 4124
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4124
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4129
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4129
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 1

    .line 4243
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4243
    invoke-interface {v0, p1, p2}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 4248
    invoke-virtual {p0, p1, v0}, Ll/ᩴ֫ܽ;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 4144
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4144
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4149
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4149
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->lowerKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 4208
    invoke-virtual {p0}, Ll/ᩴ֫ܽ;->navigableKeySet()Ljava/util/NavigableSet;

    move-result-object v0

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 4159
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4159
    invoke-virtual {v0}, Ll/ۧᩴܽ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 4109
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4109
    invoke-virtual {v0}, Ll/ۧᩴܽ;->firstKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 4114
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4114
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4119
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4119
    invoke-virtual {v0, p1}, Ll/ۧᩴܽ;->higherKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 4215
    iget-object v0, p0, Ll/ᩴ֫ܽ;->ܿ:Ljava/util/NavigableSet;

    if-nez v0, :cond_0

    .line 4217
    new-instance v0, Ll/ۧ֫ܽ;

    .line 3782
    invoke-direct {v0, p0}, Ll/֫֫ܽ;-><init>(Ljava/util/Map;)V

    .line 4217
    iput-object v0, p0, Ll/ᩴ֫ܽ;->ܿ:Ljava/util/NavigableSet;

    :cond_0
    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 4164
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4164
    invoke-virtual {v0}, Ll/ۧᩴܽ;->pollLastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 4169
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4169
    invoke-virtual {v0}, Ll/ۧᩴܽ;->pollFirstEntry()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 1

    .line 4233
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4233
    invoke-interface {v0, p3, p4, p1, p2}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4238
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/ᩴ֫ܽ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 1

    .line 4253
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    .line 4253
    invoke-interface {v0, p1, p2}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 4258
    invoke-virtual {p0, p1, v0}, Ll/ᩴ֫ܽ;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 305
    invoke-static {p0}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 4263
    new-instance v0, Ll/ܺ֫ܽ;

    invoke-direct {v0, p0}, Ll/ܺ֫ܽ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/Object;
    .locals 1

    .line 4076
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/Map;
    .locals 1

    .line 4076
    move-object v0, p0

    check-cast v0, Ll/֫ᩴܽ;

    .line 166
    iget-object v0, v0, Ll/֫ᩴܽ;->֡:Ll/ۧᩴܽ;

    return-object v0
.end method
