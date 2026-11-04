.class public final Ll/ᩳۚ᩵;
.super Ljava/lang/Object;
.source "Z6H9"


# static fields
.field public static final ۫:Ll/᩻ܽ᩺;


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final ۤ:Ljava/util/HashSet;

.field public final ܳ:Ljava/util/TreeSet;

.field public final ᩴ:Ljava/util/TreeMap;

.field public final ᩷:Ljava/util/TreeSet;

.field public final ᩸:Ll/ۛۘۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Ll/ᩳۚ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ᩳۚ᩵;->۫:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/ᩳۚ᩵;->᩷:Ljava/util/TreeSet;

    .line 33
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    .line 34
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ᩳۚ᩵;->ᩴ:Ljava/util/TreeMap;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳۚ᩵;->ۙ:Ljava/util/ArrayList;

    .line 39
    iput-object p1, p0, Ll/ᩳۚ᩵;->᩸:Ll/ۛۘۗ;

    .line 40
    invoke-virtual {p1}, Ll/ۛۘۗ;->ܶ()Ljava/util/HashSet;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۚ᩵;->ۤ:Ljava/util/HashSet;

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩳۚ᩵;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 124
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖۚ᩵;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 126
    :cond_0
    iget-object p0, p0, Ll/ᩳۚ᩵;->ᩴ:Ljava/util/TreeMap;

    invoke-virtual {p0, p2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 128
    invoke-static {p3}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p2

    new-instance p3, Ll/֡ۚ᩵;

    invoke-direct {p3, v1, p0}, Ll/֡ۚ᩵;-><init>(ILjava/lang/Object;)V

    invoke-interface {p2, p3}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p0

    .line 129
    invoke-interface {p0}, Ll/᩵ܺۗ;->findFirst()Ll/ܶۚۗ;

    move-result-object p0

    .line 130
    new-instance p2, Ll/۟ۚ᩵;

    invoke-direct {p2, v1, p1}, Ll/۟ۚ᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Ll/ܶۚۗ;->ifPresent(Ljava/util/function/Consumer;)V

    return-void

    .line 132
    :cond_1
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖۚ᩵;

    .line 133
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    aput-object p2, p1, v1

    aput-object p0, p1, v2

    const/4 p0, 0x2

    aput-object p3, p1, p0

    .line 134
    sget-object p0, Ll/ᩳۚ᩵;->۫:Ll/᩻ܽ᩺;

    const-string p2, "Select providing \'{}\' plugin \'{}\', candidates: {}"

    invoke-interface {p0, p2, p1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/TreeSet;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    return-object v0
.end method

.method public final ۙ(Ll/֡ۘۗ;)V
    .locals 6

    .line 192
    new-instance v0, Ll/᩺ۚ᩵;

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    invoke-virtual {p1}, Ll/֡ۘۗ;->ۤ()V

    .line 152
    iget-object p1, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    invoke-virtual {p1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "dex-input"

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۚ᩵;

    .line 154
    :try_start_0
    invoke-virtual {v2}, Ll/ۖۚ᩵;->ۙ()Ll/᩺ۚ᩵;

    move-result-object v4

    if-nez v4, :cond_0

    .line 155
    invoke-virtual {v2, v0}, Ll/ۖۚ᩵;->ۙ(Ll/᩺ۚ᩵;)V

    .line 157
    :cond_0
    new-instance v4, Ll/֨ۚ᩵;

    invoke-direct {v4, v2}, Ll/֨ۚ᩵;-><init>(Ll/ۖۚ᩵;)V

    invoke-virtual {v2, v4}, Ll/ۖۚ᩵;->ۙ(Ll/֨ۚ᩵;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    .line 159
    invoke-virtual {v2}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    sget-object v2, Ll/ᩳۚ᩵;->۫:Ll/᩻ܽ᩺;

    const-string v5, "Failed to init plugin: {}"

    invoke-interface {v2, v5, v3, v4}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 162
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۚ᩵;

    .line 163
    invoke-virtual {v0}, Ll/ۖۚ᩵;->ᩴ()Ll/֨ۚ᩵;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 165
    invoke-virtual {v0}, Ll/֨ۚ᩵;->᩸()Ll/۫ܿۗ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 198
    invoke-virtual {v0}, Ll/֨ۚ᩵;->ᩴ()Ljava/lang/String;

    .line 199
    check-cast v1, Ll/ܺܿۗ;

    invoke-virtual {v1}, Ll/ܺܿۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 204
    new-instance v1, Ll/ۘۚ᩵;

    const-string v2, "dex-input."

    invoke-direct {v1, v2, v3}, Ll/ۘۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_1

    .line 201
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null option descriptions in plugin id: dex-input"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final ۙ(Ll/ܳܿۗ;)V
    .locals 5

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    new-instance p1, Ll/۫᩻᩵;

    .line 29
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p1, v0}, Ll/۫᩻᩵;-><init>(Ljava/util/Map;)V

    .line 13
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 55
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ܳۖۗ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/ܳۖۗ;-><init>(I)V

    .line 56
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 57
    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 58
    iget-object v1, p0, Ll/ᩳۚ᩵;->᩷:Ljava/util/TreeSet;

    new-instance v2, Ll/ܰۚ᩵;

    invoke-direct {v2, v0}, Ll/ܰۚ᩵;-><init>(Ljava/util/Set;)V

    invoke-static {v1, v2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 60
    new-instance v0, Ll/ۤ֫᩵;

    .line 30
    sget v0, Ll/ۢܿۗ;->ۙ:I

    .line 61
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܰۗ;

    .line 80
    sget-object v1, Ll/ᩳۚ᩵;->۫:Ll/᩻ܽ᩺;

    new-instance v2, Ll/ۖۚ᩵;

    iget-object v3, p0, Ll/ᩳۚ᩵;->᩸:Ll/ۛۘۗ;

    invoke-direct {v2, v0, v3}, Ll/ۖۚ᩵;-><init>(Ll/᩺ܰۗ;Ll/ۛۘۗ;)V

    .line 81
    iget-object v3, p0, Ll/ᩳۚ᩵;->ۤ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const-string v4, "dex-input"

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v2}, Ll/ۖۚ᩵;->֫()Ll/֡ۧۤ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "Loading plugin: {}"

    .line 90
    invoke-interface {v1, v2, v3}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iget-object v1, p0, Ll/ᩳۚ᩵;->᩷:Ljava/util/TreeSet;

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 94
    iget-object v0, p0, Ll/ᩳۚ᩵;->ۙ:Ljava/util/ArrayList;

    new-instance v1, Ll/᩶ۚ᩵;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Ll/᩶ۚ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Duplicate plugin id: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 119
    :try_start_0
    iget-object p1, p0, Ll/ᩳۚ᩵;->᩷:Ljava/util/TreeSet;

    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v1, Ll/᩵ۘۗ;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ll/᩵ۘۗ;-><init>(I)V

    .line 120
    invoke-static {v1}, Ll/֫ܺۗ;->groupingBy(Ljava/util/function/Function;)Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    new-instance v2, Ll/ܿۚ᩵;

    invoke-direct {v2, p0, v1}, Ll/ܿۚ᩵;-><init>(Ll/ᩳۚ᩵;Ljava/util/ArrayList;)V

    invoke-static {p1, v2}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 138
    iget-object p1, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    invoke-virtual {p1}, Ljava/util/TreeSet;->clear()V

    .line 139
    iget-object p1, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩷()V
    .locals 5

    .line 178
    iget-object v0, p0, Ll/ᩳۚ᩵;->ܳ:Ljava/util/TreeSet;

    .line 182
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۚ᩵;

    .line 184
    :try_start_0
    invoke-virtual {v1}, Ll/ۖۚ᩵;->ۧ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 186
    invoke-virtual {v1}, Ll/ۖۚ᩵;->۫()Ljava/lang/String;

    const-string v1, "dex-input"

    sget-object v3, Ll/ᩳۚ᩵;->۫:Ll/᩻ܽ᩺;

    const-string v4, "Failed to unload plugin: {}"

    invoke-interface {v3, v4, v1, v2}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
