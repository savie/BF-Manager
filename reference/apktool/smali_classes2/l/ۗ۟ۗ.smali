.class public Ll/ۗ۟ۗ;
.super Ljava/lang/Object;
.source "Y6IN"


# static fields
.field public static final ۤ:Ljava/util/Map;


# instance fields
.field public ۙ:Ljava/util/Map;

.field public final ᩷:Ljava/util/EnumSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 36
    invoke-static {}, Ll/֫۟ۗ;->values()[Ll/֫۟ۗ;

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    .line 42
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sput-object v0, Ll/ۗ۟ۗ;->ۤ:Ljava/util/Map;

    return-void

    .line 38
    :cond_0
    new-instance v1, Ll/۠ۧ᩵;

    const-string v2, "Try to reduce flags count to 64 for use one long in EnumSet, now "

    .line 0
    invoke-static {v0, v2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 38
    throw v1
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-class v0, Ll/֫۟ۗ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    .line 49
    sget-object v0, Ll/ۗ۟ۗ;->ۤ:Ljava/util/Map;

    iput-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    return-void
.end method

.method public static synthetic ۙ(Ljava/util/List;Ljava/util/Map;)V
    .locals 2

    .line 61
    new-instance v0, Ll/ܽۖۗ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܽۖۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static synthetic ۙ(Ljava/util/Map;)V
    .locals 2

    .line 157
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    new-instance v0, Ll/ܽۧᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܽۧᩴ;-><init>(I)V

    invoke-static {p0, v0}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method

.method private ۙ(Ljava/util/function/Consumer;)V
    .locals 4

    move-object v0, p0

    .line 142
    monitor-enter v0

    .line 143
    :try_start_0
    iget-object v1, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    sget-object v2, Ll/ۗ۟ۗ;->ۤ:Ljava/util/Map;

    if-ne v1, v2, :cond_0

    .line 144
    new-instance v1, Ljava/util/IdentityHashMap;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    iput-object v1, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    .line 146
    :cond_0
    iget-object v1, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 147
    iget-object p1, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 148
    iput-object v2, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    .line 150
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic ۙ(Ll/ۗ۟ۗ;Ljava/util/Map;)V
    .locals 0

    .line 85
    iget-object p0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {p1, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 181
    invoke-virtual {p0}, Ll/ۗ۟ۗ;->᩷()Ljava/util/List;

    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    return-object v0

    .line 185
    :cond_0
    new-instance v1, Ll/֡ۙۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/֡ۙۚ;-><init>(I)V

    invoke-static {v0, v1}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "A["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", "

    .line 72
    invoke-static {v0, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 186
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;
    .locals 0

    .line 108
    invoke-virtual {p0, p1}, Ll/ۗ۟ۗ;->᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    check-cast p1, Ll/᩻۟ۗ;

    if-nez p1, :cond_0

    .line 110
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 112
    :cond_0
    invoke-virtual {p1}, Ll/᩻۟ۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 2

    .line 61
    new-instance v0, Ll/ۨۙ᩵;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Ll/ۨۙ᩵;-><init>(ILjava/util/List;)V

    invoke-direct {p0, v0}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ۙ(Ll/֫۟ۗ;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙ(Ll/ۗ۟ۗ;)V
    .locals 2

    .line 83
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    iget-object v1, p1, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 84
    iget-object v0, p1, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Ll/ܶ۟ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ܶ۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۧ᩶ۗ;)V
    .locals 2

    .line 57
    new-instance v0, Ll/ܽ۟ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ܽ۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public ۙ(Ll/֫᩶ۗ;)Z
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۤ(Ll/֫۟ۗ;)V
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۤ(Ll/֫᩶ۗ;)V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    new-instance v0, Ll/۟ۚ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/۟ۚ᩵;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public ۤ()Z
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩷()Ljava/util/List;
    .locals 3

    .line 161
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v2, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    if-nez v2, :cond_0

    .line 163
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 165
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 166
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۟ۗ;

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 169
    :cond_1
    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩶ۗ;

    .line 170
    invoke-interface {v2}, Ll/ۧ᩶ۗ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public ᩷(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧ᩶ۗ;

    return-object p1
.end method

.method public ᩷(Ll/֫۟ۗ;)Z
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ۗ۟ۗ;->᩷:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩸()V
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ۗ۟ۗ;->ۙ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 157
    :cond_0
    new-instance v0, Ll/᩹۟ۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v0}, Ll/ۗ۟ۗ;->ۙ(Ljava/util/function/Consumer;)V

    return-void
.end method
