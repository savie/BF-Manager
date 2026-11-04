.class public final Ll/᩻ۧ᩵;
.super Ljava/lang/Object;
.source "76EN"


# instance fields
.field public ۙ:Ljava/util/Set;

.field public final ۤ:Ljava/util/List;

.field public ᩷:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/᩻ۧ᩵;->ۤ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩻ۧ᩵;Ll/۬ۜۗ;)V
    .locals 1

    .line 38
    iget-object p0, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    invoke-interface {p1}, Ll/۬ۜۗ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/util/List;Ljava/util/function/Function;)V
    .locals 13

    .line 30
    invoke-static {p1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 33
    :cond_0
    new-instance v0, Ll/᩷ۧ᩵;

    invoke-direct {v0, p2}, Ll/᩷ۧ᩵;-><init>(Ljava/util/function/Function;)V

    invoke-static {p1, v0}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p1

    .line 167
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p2

    new-instance v0, Ll/ᩴۧ᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/۫ۧ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/֫ܺۗ;->toMap(Ljava/util/function/Function;Ljava/util/function/Function;)Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p2, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    .line 168
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_11

    .line 35
    new-instance p2, Ll/ۚۧ᩵;

    iget-object v0, p0, Ll/᩻ۧ᩵;->ۤ:Ljava/util/List;

    invoke-direct {p2, v0}, Ll/ۚۧ᩵;-><init>(Ljava/util/List;)V

    sget-object v1, Ll/֫ۧ᩵;->ܰ:Ll/֫ۧ᩵;

    invoke-static {p2, v1}, Ll/۠۫ۗ;->thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p2

    invoke-static {p1, p2}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 37
    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    .line 38
    new-instance p2, Ll/ۤۧ᩵;

    invoke-direct {p2, p0}, Ll/ۤۧ᩵;-><init>(Ll/᩻ۧ᩵;)V

    invoke-static {v0, p2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 39
    new-instance p2, Ll/᩸ۧ᩵;

    invoke-direct {p2, p0}, Ll/᩸ۧ᩵;-><init>(Ll/᩻ۧ᩵;)V

    invoke-static {p1, p2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 41
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p2

    new-instance v1, Ll/ᩴۧ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p2

    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {p2, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    iput-object p2, p0, Ll/᩻ۧ᩵;->ۙ:Ljava/util/Set;

    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۧۧ᩵;

    .line 54
    invoke-virtual {p2}, Ll/ۧۧ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v1

    .line 55
    invoke-virtual {p2}, Ll/ۧۧ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v2

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "start"

    .line 59
    invoke-static {v1, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "end"

    .line 62
    invoke-static {v2, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_4

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 66
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v3}, Ljava/util/HashMap;-><init>(I)V

    :goto_1
    if-ge v5, v3, :cond_4

    .line 68
    iget-object v7, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 71
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, -0x1

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "\n all passes: "

    const-string v10, "Ordering pass not found: "

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 72
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_5

    .line 74
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_2

    .line 76
    :cond_5
    iget-object v11, p0, Ll/᩻ۧ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v11, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_2

    .line 80
    :cond_6
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", listed in \'runAfter\' of pass: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    .line 82
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ܳۧ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p2}, Ll/ܳۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 82
    throw p1

    .line 86
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const v8, 0x7fffffff

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 87
    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    if-eqz v12, :cond_8

    .line 89
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v8

    goto :goto_3

    .line 91
    :cond_8
    iget-object v12, p0, Ll/᩻ۧ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_3

    .line 95
    :cond_9
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", listed in \'runBefore\' of pass: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    .line 97
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ܳۧ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p2}, Ll/ܳۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 97
    throw p1

    :cond_a
    if-le v8, v7, :cond_f

    if-ne v7, v4, :cond_c

    const v1, 0x7fffffff

    if-ne v8, v1, :cond_b

    goto :goto_4

    :cond_b
    move v5, v8

    goto :goto_5

    :cond_c
    add-int/lit8 v5, v7, 0x1

    if-lt v5, v3, :cond_d

    :goto_4
    const/4 v5, -0x1

    :cond_d
    :goto_5
    if-ne v5, v4, :cond_e

    .line 46
    invoke-virtual {p2}, Ll/ۧۧ᩵;->ۤ()Ll/۬ۜۗ;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 48
    :cond_e
    invoke-virtual {p2}, Ll/ۧۧ᩵;->ۤ()Ll/۬ۜۗ;

    move-result-object p2

    invoke-interface {v0, v5, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 101
    :cond_f
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Conflict order requirements for pass: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\n run after: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\n run before: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\n passes: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/᩻ۧ᩵;->᩷:Ljava/util/IdentityHashMap;

    .line 104
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ܳۧ᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p2}, Ll/ܳۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 104
    throw p1

    :cond_10
    :goto_6
    return-void

    .line 168
    :cond_11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۧ᩵;

    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method
