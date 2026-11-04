.class public final Ll/ᩴۚܽ;
.super Ll/ܽ۫ܽ;
.source "F4NW"

# interfaces
.implements Ljava/util/NavigableMap;
.implements Ll/ܺۚۗ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۟:Ll/ᩴۚܽ;


# instance fields
.field public final transient ֡:Ll/֫۫ܽ;

.field public final transient ܿ:Ll/ۚۧܽ;

.field public final transient ᩶:Ll/ᩴۚܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 153
    new-instance v0, Ll/ᩴۚܽ;

    .line 174
    sget-object v1, Ll/֡֫ܽ;->ܰ:Ll/֡֫ܽ;

    .line 154
    invoke-static {v1}, Ll/ۚۚܽ;->ۙ(Ljava/util/Comparator;)Ll/ۚۧܽ;

    move-result-object v1

    sget v2, Ll/֫۫ܽ;->᩶:I

    .line 89
    sget-object v2, Ll/ۙۧܽ;->ᩳ:Ll/֫۫ܽ;

    const/4 v3, 0x0

    .line 850
    invoke-direct {v0, v1, v2, v3}, Ll/ᩴۚܽ;-><init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V

    .line 154
    sput-object v0, Ll/ᩴۚܽ;->۟:Ll/ᩴۚܽ;

    return-void
.end method

.method public constructor <init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V
    .locals 0

    .line 856
    invoke-direct {p0}, Ll/ܽ۫ܽ;-><init>()V

    .line 857
    iput-object p1, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 858
    iput-object p2, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    .line 859
    iput-object p3, p0, Ll/ᩴۚܽ;->᩶:Ll/ᩴۚܽ;

    return-void
.end method

.method public static of()Ll/ᩴۚܽ;
    .locals 1

    .line 173
    sget-object v0, Ll/ᩴۚܽ;->۟:Ll/ᩴۚܽ;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1219
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۙ(Ll/ᩴۚܽ;)Ll/ۚۧܽ;
    .locals 0

    .line 64
    iget-object p0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    return-object p0
.end method

.method private ۙ(II)Ll/ᩴۚܽ;
    .locals 3

    .line 971
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    if-nez p1, :cond_0

    .line 864
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p2, v1, :cond_0

    return-object p0

    .line 973
    :cond_0
    iget-object v1, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    if-ne p1, p2, :cond_1

    .line 567
    iget-object p1, v1, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    .line 974
    invoke-static {p1}, Ll/ᩴۚܽ;->ۙ(Ljava/util/Comparator;)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1

    .line 976
    :cond_1
    new-instance v2, Ll/ᩴۚܽ;

    .line 977
    invoke-virtual {v1, p1, p2}, Ll/ۚۧܽ;->᩷(II)Ll/ۚۧܽ;

    move-result-object v1

    invoke-virtual {v0, p1, p2}, Ll/֫۫ܽ;->subList(II)Ll/֫۫ܽ;

    move-result-object p1

    const/4 p2, 0x0

    .line 850
    invoke-direct {v2, v1, p1, p2}, Ll/ᩴۚܽ;-><init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V

    return-object v2
.end method

.method public static ۙ(Ljava/util/Comparator;)Ll/ᩴۚܽ;
    .locals 3

    .line 174
    sget-object v0, Ll/֡֫ܽ;->ܰ:Ll/֡֫ܽ;

    .line 157
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    sget-object p0, Ll/ᩴۚܽ;->۟:Ll/ᩴۚܽ;

    return-object p0

    .line 160
    :cond_0
    new-instance v0, Ll/ᩴۚܽ;

    invoke-static {p0}, Ll/ۚۚܽ;->ۙ(Ljava/util/Comparator;)Ll/ۚۧܽ;

    move-result-object p0

    .line 89
    sget-object v1, Ll/ۙۧܽ;->ᩳ:Ll/֫۫ܽ;

    const/4 v2, 0x0

    .line 850
    invoke-direct {v0, p0, v1, v2}, Ll/ᩴۚܽ;-><init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V

    return-object v0
.end method

.method public static synthetic ᩷(Ll/ᩴۚܽ;)Ll/֫۫ܽ;
    .locals 0

    .line 64
    iget-object p0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    return-object p0
.end method


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 1104
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴۚܽ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1109
    invoke-virtual {p0, p1}, Ll/ᩴۚܽ;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 567
    iget-object v0, v0, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    return-object v0
.end method

.method public final descendingKeySet()Ljava/util/NavigableSet;
    .locals 2

    .line 747
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    iget-object v1, v0, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    if-nez v1, :cond_0

    .line 749
    invoke-virtual {v0}, Ll/ۚۧܽ;->ۧ()Ll/ۚۚܽ;

    move-result-object v1

    iput-object v1, v0, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    .line 750
    iput-object v0, v1, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    :cond_0
    return-object v1
.end method

.method public final descendingMap()Ljava/util/NavigableMap;
    .locals 3

    .line 1168
    iget-object v0, p0, Ll/ᩴۚܽ;->᩶:Ll/ᩴۚܽ;

    if-nez v0, :cond_2

    .line 1169
    invoke-virtual {p0}, Ll/ܽ۫ܽ;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    if-eqz v0, :cond_0

    .line 567
    iget-object v0, v1, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    .line 1170
    invoke-static {v0}, Ll/ᩳ֫ܽ;->᩷(Ljava/util/Comparator;)Ll/ᩳ֫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֫ܽ;->ۙ()Ll/ᩳ֫ܽ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴۚܽ;->ۙ(Ljava/util/Comparator;)Ll/ᩴۚܽ;

    move-result-object v0

    return-object v0

    .line 1172
    :cond_0
    new-instance v0, Ll/ᩴۚܽ;

    .line 747
    iget-object v2, v1, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    if-nez v2, :cond_1

    .line 749
    invoke-virtual {v1}, Ll/ۚۧܽ;->ۧ()Ll/ۚۚܽ;

    move-result-object v2

    iput-object v2, v1, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    .line 750
    iput-object v1, v2, Ll/ۚۚܽ;->۟:Ll/ۚۚܽ;

    .line 1173
    :cond_1
    check-cast v2, Ll/ۚۧܽ;

    iget-object v1, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-virtual {v1}, Ll/֫۫ܽ;->۫()Ll/֫۫ܽ;

    move-result-object v1

    invoke-direct {v0, v2, v1, p0}, Ll/ᩴۚܽ;-><init>(Ll/ۚۧܽ;Ll/֫۫ܽ;Ll/ᩴۚܽ;)V

    :cond_2
    return-object v0
.end method

.method public final bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/ᩴۚܽ;->entrySet()Ll/۠۫ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final entrySet()Ll/۠۫ܽ;
    .locals 1

    .line 881
    invoke-virtual {p0}, Ll/ܽ۫ܽ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Ll/۠۫ܽ;->ܿ:I

    .line 82
    sget-object v0, Ll/۫ۧܽ;->ۡ:Ll/۫ۧܽ;

    return-object v0

    .line 881
    :cond_0
    new-instance v0, Ll/ۤۚܽ;

    invoke-direct {v0, p0}, Ll/ۤۚܽ;-><init>(Ll/ᩴۚܽ;)V

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 1124
    invoke-virtual {p0}, Ll/ܽ۫ܽ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ll/ᩴۚܽ;->entrySet()Ll/۠۫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠۫ܽ;->᩷()Ll/֫۫ܽ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 962
    invoke-virtual {v0}, Ll/ۚۧܽ;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 1094
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴۚܽ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1099
    invoke-virtual {p0, p1}, Ll/ᩴۚܽ;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 869
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    if-nez p1, :cond_0

    goto :goto_0

    .line 296
    :cond_0
    :try_start_0
    iget-object v2, v0, Ll/ۚۧܽ;->ᩳ:Ll/֫۫ܽ;

    .line 275
    iget-object v0, v0, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    .line 296
    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_1

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    .line 870
    :cond_2
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Ll/ᩴۚܽ;->headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 992
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;
    .locals 1

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    invoke-virtual {v0, p1, p2}, Ll/ۚۧܽ;->ۤ(Ljava/lang/Object;Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ᩴۚܽ;->ۙ(II)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 1114
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴۚܽ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1119
    invoke-virtual {p0, p1}, Ll/ᩴۚܽ;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    return-object v0
.end method

.method public final keySet()Ll/۠۫ܽ;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 1129
    invoke-virtual {p0}, Ll/ܽ۫ܽ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ll/ᩴۚܽ;->entrySet()Ll/۠۫ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠۫ܽ;->᩷()Ll/֫۫ܽ;

    move-result-object v0

    .line 864
    iget-object v1, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1129
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 967
    invoke-virtual {v0}, Ll/ۚۧܽ;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 1084
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴۚܽ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1089
    invoke-virtual {p0, p1}, Ll/ᩴۚܽ;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 1181
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1143
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1157
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    .line 864
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩴۚܽ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1023
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/ᩴۚܽ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩴۚܽ;
    .locals 2

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 567
    iget-object v0, v0, Ll/ۚۚܽ;->֡:Ljava/util/Comparator;

    .line 1045
    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "expected fromKey <= toKey but %s > %s"

    .line 1044
    invoke-static {v0, v1, p1, p3}, Ll/ۨۙܽ;->ۙ(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1049
    invoke-virtual {p0, p3, p4}, Ll/ᩴۚܽ;->headMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Ll/ᩴۚܽ;->tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Ll/ᩴۚܽ;->tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1063
    invoke-virtual {p0, p1, v0}, Ll/ᩴۚܽ;->tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ll/ᩴۚܽ;
    .locals 1

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    invoke-virtual {v0, p1, p2}, Ll/ۚۧܽ;->᩸(Ljava/lang/Object;Z)I

    move-result p1

    .line 864
    iget-object p2, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 1079
    invoke-direct {p0, p1, p2}, Ll/ᩴۚܽ;->ۙ(II)Ll/ᩴۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 947
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    return-object v0
.end method

.method public final values()Ll/ۙ۫ܽ;
    .locals 1

    .line 947
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1214
    new-instance v0, Ll/᩸ۚܽ;

    invoke-direct {v0, p0}, Ll/᩸ۚܽ;-><init>(Ll/ᩴۚܽ;)V

    return-object v0
.end method

.method public final ۙ()Z
    .locals 1

    .line 875
    iget-object v0, p0, Ll/ᩴۚܽ;->ܿ:Ll/ۚۧܽ;

    .line 151
    iget-object v0, v0, Ll/ۚۧܽ;->ᩳ:Ll/֫۫ܽ;

    invoke-virtual {v0}, Ll/ۙ۫ܽ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 875
    iget-object v0, p0, Ll/ᩴۚܽ;->֡:Ll/֫۫ܽ;

    invoke-virtual {v0}, Ll/ۙ۫ܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
