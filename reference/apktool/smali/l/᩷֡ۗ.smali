.class public final Ll/᩷֡ۗ;
.super Ljava/lang/Object;
.source "UIX4"


# static fields
.field public static final ܳ:Ljava/util/Set;


# instance fields
.field public ۙ:Ljava/util/HashMap;

.field public ۤ:Ljava/util/HashMap;

.field public ᩴ:Ljava/util/HashMap;

.field public final ᩷:Ljava/util/HashSet;

.field public final ᩸:Ll/֫ۖۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Ll/᩷֡ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    const-string v0, "java.lang.Object"

    .line 186
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩷֡ۗ;->ܳ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/֫ۖۗ;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩷֡ۗ;->᩷:Ljava/util/HashSet;

    .line 39
    iput-object p1, p0, Ll/᩷֡ۗ;->᩸:Ll/֫ۖۗ;

    return-void
.end method

.method private ۙ(Ll/ۜܿۗ;Ljava/util/HashSet;)V
    .locals 6

    .line 222
    invoke-virtual {p1}, Ll/ۜܿۗ;->᩸()[Ll/֫֨ۗ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 240
    :cond_0
    iget-object v3, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜܿۗ;

    if-nez v3, :cond_1

    .line 242
    iget-object v4, p0, Ll/᩷֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v3, :cond_2

    .line 228
    invoke-virtual {v3}, Ll/ۜܿۗ;->ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 230
    invoke-direct {p0, v3, p2}, Ll/᩷֡ۗ;->ۙ(Ll/ۜܿۗ;Ljava/util/HashSet;)V

    goto :goto_1

    .line 234
    :cond_2
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩷֡ۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    .line 133
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_0
    return-object p1
.end method

.method public final ۙ(Ll/֫֨ۗ;)Ll/ۜܿۗ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜܿۗ;

    return-object p1
.end method

.method public final ۙ(Ll/᩷ۢۗ;)Ll/᩶ۡۗ;
    .locals 6

    .line 89
    iget-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ᩳۗ;->ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜܿۗ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 112
    :cond_0
    invoke-virtual {v0}, Ll/ۜܿۗ;->᩷()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ֡ۗ;

    if-eqz v1, :cond_1

    return-object v1

    .line 98
    :cond_1
    invoke-virtual {v0}, Ll/ۜܿۗ;->᩸()[Ll/֫֨ۗ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .line 240
    iget-object v4, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜܿۗ;

    if-nez v4, :cond_2

    .line 242
    iget-object v5, p0, Ll/᩷֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v4, :cond_3

    .line 112
    invoke-virtual {v4}, Ll/ۜܿۗ;->᩷()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤ֡ۗ;

    if-eqz v3, :cond_3

    return-object v3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 108
    :cond_4
    new-instance v0, Ll/᩸֡ۗ;

    invoke-direct {v0, p1}, Ll/᩸֡ۗ;-><init>(Ll/᩷ۢۗ;)V

    return-object v0
.end method

.method public final ۙ()V
    .locals 7

    .line 189
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 190
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 191
    iget-object v2, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 192
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜܿۗ;

    .line 193
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 194
    invoke-direct {p0, v3, v1}, Ll/᩷֡ۗ;->ۙ(Ll/ۜܿۗ;Ljava/util/HashSet;)V

    .line 196
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v4

    if-eqz v4, :cond_2

    const/4 v5, 0x1

    if-eq v4, v5, :cond_0

    .line 212
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    .line 203
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "java.lang.Object"

    .line 204
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 205
    sget-object v4, Ll/᩷֡ۗ;->ܳ:Ljava/util/Set;

    goto :goto_1

    .line 207
    :cond_1
    invoke-static {v4}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    goto :goto_1

    .line 199
    :cond_2
    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 216
    :goto_1
    invoke-virtual {v3}, Ll/ۜܿۗ;->ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 218
    :cond_3
    iput-object v0, p0, Ll/᩷֡ۗ;->ᩴ:Ljava/util/HashMap;

    .line 137
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 139
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 140
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 141
    invoke-virtual {p0, v2}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 142
    new-instance v5, Ll/ۙ֡ۗ;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ll/ۙ֡ۗ;-><init>(I)V

    invoke-static {v0, v4, v5}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 145
    :cond_5
    iput-object v0, p0, Ll/᩷֡ۗ;->ۙ:Ljava/util/HashMap;

    return-void
.end method

.method public final ۙ(Ljava/util/ArrayList;)V
    .locals 6

    .line 58
    iget-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۡۗ;

    .line 116
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    .line 117
    invoke-virtual {v1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v2

    .line 118
    new-instance v3, Ll/ۜܿۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢᩳۗ;->ۨ()I

    move-result v4

    sget-object v5, Ll/۬ܿۗ;->۟:Ll/۬ܿۗ;

    invoke-direct {v3, v4, v1}, Ll/ۜܿۗ;-><init>(ILl/֫֨ۗ;)V

    .line 119
    invoke-static {v0}, Ll/۠ܿۗ;->ۙ(Ll/᩻ۡۗ;)[Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۜܿۗ;->ۙ([Ll/֫֨ۗ;)V

    .line 120
    iget-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۤ(Ljava/lang/String;)Z
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩷(Ljava/lang/String;)Ljava/util/Set;
    .locals 1

    .line 182
    iget-object v0, p0, Ll/᩷֡ۗ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-nez p1, :cond_0

    .line 183
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :cond_0
    return-object p1
.end method

.method public final ᩷()V
    .locals 3

    .line 43
    new-instance v0, Ll/۠ܿۗ;

    iget-object v1, p0, Ll/᩷֡ۗ;->᩸:Ll/֫ۖۗ;

    invoke-direct {v0, v1}, Ll/۠ܿۗ;-><init>(Ll/֫ۖۗ;)V

    .line 44
    invoke-virtual {v0}, Ll/۠ܿۗ;->᩷()V

    .line 49
    iget-object v1, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 50
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/۠ܿۗ;->ۙ()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Ll/᩷֡ۗ;->ۤ:Ljava/util/HashMap;

    .line 51
    invoke-virtual {v0, v1}, Ll/۠ܿۗ;->ۙ(Ljava/util/HashMap;)V

    return-void

    .line 53
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Classpath already loaded"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0
.end method
