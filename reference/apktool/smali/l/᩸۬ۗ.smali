.class public final Ll/᩸۬ۗ;
.super Ll/ܺ۠ۗ;
.source "AIYD"


# direct methods
.method public static synthetic ۙ(Ljava/util/LinkedHashSet;Ll/ܺ֨ۗ;)V
    .locals 1

    .line 122
    check-cast p1, Ll/ۛ֨ۗ;

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    .line 123
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۧ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p0}, Ll/᩸۬ۗ;->ۙ(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ljava/util/List;Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 113
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 116
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۢۗ;

    .line 117
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    .line 118
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 119
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, p1}, Ll/᩸۬ۗ;->ۙ(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 121
    :cond_1
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ۤ۬ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/ۤ۬ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ܿ֨ۗ;)V
    .locals 5

    .line 61
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 64
    :cond_0
    new-instance v0, Ll/ۧ֨ۗ;

    invoke-direct {v0}, Ll/ۧ֨ۗ;-><init>()V

    .line 65
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 66
    sget-object v2, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "this"

    .line 67
    invoke-virtual {v0, v2}, Ll/ۧ֨ۗ;->ۙ(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v0}, Ll/ۧ֨ۗ;->᩻()V

    .line 70
    :cond_1
    sget-object v2, Ll/֫۟ۗ;->֡ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Ll/֫۟ۗ;->ۜ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 71
    :cond_2
    invoke-virtual {v0}, Ll/ۧ֨ۗ;->֫()V

    .line 78
    :cond_3
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ۧ()Ljava/util/List;

    move-result-object v1

    .line 79
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 80
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 81
    invoke-interface {v2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-static {v1, v2}, Ll/᩸۬ۗ;->ۙ(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 96
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result p0

    const/4 v1, 0x1

    if-le p0, v1, :cond_6

    .line 97
    invoke-static {v2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v3, Ll/ۙ۬ۗ;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/ۙ۬ۗ;-><init>(I)V

    .line 98
    invoke-interface {p0, v3}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v3, Ll/᩷۬ۗ;

    invoke-direct {v3, v4}, Ll/᩷۬ۗ;-><init>(I)V

    .line 99
    invoke-interface {p0, v3}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v3, Ll/ܿۧ᩺;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/ܿۧ᩺;-><init>(I)V

    .line 100
    invoke-interface {p0, v3}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p0

    .line 101
    invoke-interface {p0}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object p0

    .line 102
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v3

    invoke-interface {p0, v3}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 103
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v1, :cond_4

    const/4 v1, 0x0

    .line 105
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫֨ۗ;

    invoke-virtual {v0, p0}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    goto :goto_0

    :cond_4
    if-gt v3, v1, :cond_5

    goto :goto_0

    .line 107
    :cond_5
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Several immutable types in one variable: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", vars: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    throw v0

    .line 84
    :cond_6
    :goto_0
    new-instance p0, Ll/ܺ֫᩵;

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Ll/ܺ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, p0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 91
    :cond_7
    invoke-virtual {p0, v0}, Ll/ܿ֨ۗ;->ۙ(Ll/ۧ֨ۗ;)V

    return-void
.end method

.method public static ۤ(Ll/ۖۡۗ;)V
    .locals 2

    .line 33
    invoke-virtual {p0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֨ۗ;

    .line 34
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ܿ()V

    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p0}, Ll/᩸۬ۗ;->᩷(Ll/ۖۡۗ;)V

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 3

    .line 40
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 53
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 55
    invoke-virtual {p0, v0}, Ll/ۖۡۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    move-result-object v1

    .line 57
    :cond_0
    invoke-static {v1}, Ll/᩸۬ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    .line 44
    :cond_1
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 53
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    if-nez v2, :cond_2

    .line 55
    invoke-virtual {p0, v1}, Ll/ۖۡۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    move-result-object v2

    .line 57
    :cond_2
    invoke-static {v2}, Ll/᩸۬ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {p0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    .line 48
    invoke-static {v0}, Ll/᩸۬ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 0

    .line 29
    invoke-static {p1}, Ll/᩸۬ۗ;->᩷(Ll/ۖۡۗ;)V

    return-void
.end method
