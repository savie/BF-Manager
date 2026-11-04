.class public final Ll/ܳ᩷᩵;
.super Ll/ܺ۠ۗ;
.source "Q6FB"


# static fields
.field public static final synthetic ܰ:I

.field public static final ᩶:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/ܳ᩷᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܳ᩷᩵;->᩶:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/util/HashSet;Ll/ۖۡۗ;)V
    .locals 5

    .line 832
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 836
    :cond_0
    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ᩴܶۤ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/ᩴܶۤ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩵ܺۗ;->count()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 838
    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v3, Ll/۬ۡۗ;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/۬ۡۗ;-><init>(I)V

    invoke-interface {v2, v3}, Ll/᩵ܺۗ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ܽܺۗ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܽܺۗ;->sum()I

    move-result v2

    .line 839
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unreachable blocks removed: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", instructions: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 842
    :cond_1
    new-instance v0, Ll/᩸᩷᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 843
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 844
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۛ᩷()V

    return-void
.end method

.method public static ۙ(Ljava/util/LinkedHashSet;Ll/᩷ۡۗ;Ll/ۖۡۗ;)V
    .locals 3

    .line 826
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v0

    if-eq p1, v0, :cond_2

    .line 827
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object p2

    sget v0, Ll/᩻᩷᩵;->ܰ:I

    .line 450
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 451
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 452
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 453
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    .line 454
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 455
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 456
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    if-eq v1, p2, :cond_1

    .line 457
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 458
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ۡۗ;)V
    .locals 3

    .line 304
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/᩷ۖۗ;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/᩷ۖۗ;-><init>(Ll/ܺ۟ۗ;I)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V
    .locals 2

    .line 321
    sget-object v0, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    sget-object v0, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܺۧ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܺۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ljava/util/List;Ll/ܺ֨ۗ;)Z
    .locals 2

    .line 777
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_2

    .line 778
    check-cast p1, Ll/ۛ֨ۗ;

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p1

    .line 779
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 780
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 781
    invoke-virtual {v1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 782
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v1

    if-ne v1, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_6

    if-nez p1, :cond_1

    goto :goto_0

    .line 273
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 0
    instance-of v2, p0, Ll/ۛ֨ۗ;

    if-eqz v2, :cond_3

    .line 275
    check-cast p0, Ll/ۛ֨ۗ;

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p0

    check-cast p1, Ll/ۛ֨ۗ;

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p1

    if-ne p0, p1, :cond_2

    return v0

    :cond_2
    return v1

    .line 0
    :cond_3
    instance-of v2, p0, Ll/᩹֨ۗ;

    if-eqz v2, :cond_5

    .line 278
    check-cast p0, Ll/᩹֨ۗ;

    invoke-virtual {p0}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v2

    check-cast p1, Ll/᩹֨ۗ;

    invoke-virtual {p1}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide p0

    cmp-long v4, v2, p0

    if-nez v4, :cond_4

    return v0

    :cond_4
    return v1

    .line 280
    :cond_5
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected InsnArg types: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 280
    throw v0

    :cond_6
    :goto_0
    return v1
.end method

.method public static synthetic ۙ(Ll/ᩳۡۗ;Ljava/util/HashMap;Ll/᩷ۡۗ;Ljava/util/HashSet;Ll/᩷ۡۗ;)Z
    .locals 4

    .line 736
    sget-object v0, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {p4, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ۤ۠ۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 740
    :cond_0
    invoke-virtual {v0}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 741
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    invoke-static {v3, p0}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/List;Ll/ܺ֨ۗ;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 742
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    invoke-virtual {p3, p4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    return v2
.end method

.method public static ۤ(Ll/ۖۡۗ;)V
    .locals 6

    .line 848
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/۬ۙ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 30
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    new-instance v2, Ll/᩷۟ۗ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v2}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/function/Consumer;)V

    .line 33
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v0, :cond_1

    .line 36
    invoke-virtual {p0, v1}, Ll/ۖۡۗ;->ۙ(Ljava/util/ArrayList;)V

    .line 25
    new-instance v0, Ll/᩵ۘۗ;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Ll/᩵ۘۗ;-><init>(I)V

    invoke-static {v1, v0}, Ll/ܺ᩷᩵;->ۙ(Ljava/util/ArrayList;Ljava/util/function/Function;)[Ll/᩷ۡۗ;

    move-result-object v0

    const/4 v2, 0x0

    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 97
    sget-object v3, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    invoke-virtual {v2, v3}, Ll/᩷ۡۗ;->᩷(Ljava/util/BitSet;)V

    const/4 v3, 0x0

    .line 98
    invoke-virtual {v2, v3}, Ll/᩷ۡۗ;->ۤ(Ll/᩷ۡۗ;)V

    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v2, :cond_0

    .line 101
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 102
    aget-object v5, v0, v3

    .line 103
    invoke-virtual {v4, v5}, Ll/᩷ۡۗ;->ۤ(Ll/᩷ۡۗ;)V

    .line 104
    invoke-virtual {v5, v4}, Ll/᩷ۡۗ;->ۙ(Ll/᩷ۡۗ;)V

    .line 105
    invoke-static {v0, v5}, Ll/ܺ᩷᩵;->ۙ([Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/BitSet;

    move-result-object v5

    .line 106
    invoke-virtual {v5, v3}, Ljava/util/BitSet;->clear(I)V

    .line 107
    invoke-virtual {v4, v5}, Ll/᩷ۡۗ;->᩷(Ljava/util/BitSet;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 301
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ll/ۙ᩷᩵;

    invoke-direct {v0}, Ll/ۙ᩷᩵;-><init>()V

    invoke-static {p0, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 34
    :cond_1
    new-instance p0, Ll/۠ۧ᩵;

    const-string v0, "Found unreachable blocks"

    .line 11
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p0
.end method

.method public static ۤ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V
    .locals 1

    .line 820
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 821
    invoke-static {v0, p0, p1}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/LinkedHashSet;Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    .line 822
    invoke-static {v0, p1}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/HashSet;Ll/ۖۡۗ;)V

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 4

    .line 133
    :goto_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 134
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 139
    sget-object v0, Ll/ۧ۟ۗ;->ܺ:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 165
    sget-object v3, Ll/֫۟ۗ;->ۧۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_3

    .line 170
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    .line 173
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 174
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 175
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 176
    invoke-static {v0, p0}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/HashSet;Ll/ۖۡۗ;)V

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Removed unreachable split cross block "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :cond_3
    new-instance p0, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unreachable block: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p0

    :cond_4
    return-void
.end method

.method public static synthetic ᩷(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z
    .locals 2

    .line 793
    sget-object v0, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 794
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 797
    :cond_0
    sget-object p1, Ll/ۧ۟ۗ;->᩸ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    check-cast p1, Ll/۫۠ۗ;

    if-eqz p1, :cond_1

    .line 799
    invoke-virtual {p1, p0}, Ll/۫۠ۗ;->ۙ(Ll/᩷ۡۗ;)V

    :cond_1
    const/4 p0, 0x1

    return p0

    .line 795
    :cond_2
    :goto_0
    sget-object v0, Ll/ܳ᩷᩵;->᩶:Ll/᩻ܽ᩺;

    const-string v1, "Block {} not deleted, method: {}"

    invoke-interface {v0, v1, p0, p1}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩸(Ll/ۖۡۗ;)V
    .locals 3

    .line 792
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/᩹ܰ᩺;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩹ܰ᩺;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 807
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۛ᩷()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 17

    move-object/from16 v1, p1

    .line 47
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_60

    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_33

    .line 812
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 813
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 814
    invoke-static {v0, v3, v1}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/LinkedHashSet;Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    goto :goto_0

    .line 816
    :cond_1
    invoke-static {v0, v1}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/HashSet;Ll/ۖۡۗ;)V

    .line 56
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->ۤ(Ll/ۖۡۗ;)V

    .line 417
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    .line 418
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    sget-object v7, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    if-eqz v5, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 181
    sget-object v8, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {v5, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-nez v8, :cond_3

    sget-object v8, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {v5, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 183
    :cond_3
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    .line 184
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-le v9, v6, :cond_2

    .line 186
    invoke-static {v5}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_4

    .line 187
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_4

    goto :goto_1

    .line 173
    :cond_4
    invoke-static {v5}, Ll/᩹֫᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 190
    invoke-virtual {v9, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    .line 228
    :goto_2
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 286
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    .line 287
    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-gt v12, v7, :cond_6

    const/4 v11, 0x0

    goto :goto_4

    :cond_6
    sub-int/2addr v12, v7

    sub-int/2addr v12, v6

    .line 291
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳۡۗ;

    :goto_4
    if-nez v11, :cond_7

    goto :goto_7

    :cond_7
    if-nez v10, :cond_8

    move-object v10, v11

    goto :goto_3

    :cond_8
    if-ne v10, v11, :cond_9

    goto :goto_6

    .line 253
    :cond_9
    invoke-virtual {v10, v11}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 254
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v12

    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v13

    invoke-static {v12, v13}, Ll/ܳ᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 255
    invoke-virtual {v10}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v12

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_b

    .line 257
    invoke-virtual {v10, v13}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v14

    invoke-virtual {v11, v13}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v15

    invoke-static {v14, v15}, Ll/ܳ᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    .line 246
    :cond_b
    :goto_6
    invoke-virtual {v10}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_3

    :cond_c
    :goto_7
    if-lez v7, :cond_2

    .line 196
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 208
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    .line 209
    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int v10, v9, v7

    .line 210
    invoke-virtual {v4, v10, v9}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    .line 214
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    .line 216
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v11

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v12

    add-int/2addr v12, v11

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 218
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 220
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 221
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 198
    new-instance v4, Ll/ۧ֫᩺;

    invoke-direct {v4, v7, v6}, Ll/ۧ֫᩺;-><init>(II)V

    invoke-static {v8, v4}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 199
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Move duplicate insns, count: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " to block "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    const/4 v4, 0x1

    goto/16 :goto_1

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    .line 423
    :cond_e
    invoke-static/range {p1 .. p1}, Ll/۠ۙ᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_f

    const/4 v4, 0x1

    .line 426
    :cond_f
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 427
    invoke-static {v2}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v4, 0x1

    goto :goto_8

    .line 431
    :cond_11
    sget v0, Ll/᩻᩷᩵;->ܰ:I

    .line 407
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ll/᩹ۚ֫;

    const/4 v5, 0x3

    invoke-direct {v2, v5}, Ll/᩹ۚ֫;-><init>(I)V

    invoke-static {v0, v2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v4, 0x1

    :cond_12
    if-eqz v4, :cond_13

    .line 58
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->᩷(Ll/ۖۡۗ;)V

    .line 59
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->ۤ(Ll/ۖۡۗ;)V

    .line 61
    :cond_13
    invoke-static/range {p1 .. p1}, Ll/᩹᩷᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 62
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->ۤ(Ll/ۖۡۗ;)V

    .line 127
    :cond_14
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ll/۟ܿۗ;

    invoke-direct {v2, v6}, Ll/۟ܿۗ;-><init>(I)V

    invoke-static {v0, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 66
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0xc8

    .line 68
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v4, 0x0

    .line 354
    :goto_9
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 515
    sget-object v9, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-nez v9, :cond_15

    goto/16 :goto_14

    .line 518
    :cond_15
    sget-object v9, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v9

    .line 519
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_16

    goto/16 :goto_14

    .line 523
    :cond_16
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۧᩳۗ;

    .line 583
    invoke-virtual {v11}, Ll/ۧᩳۗ;->᩷()Ljava/util/ArrayList;

    move-result-object v11

    .line 584
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_19

    .line 585
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :cond_18
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܺۡۗ;

    .line 586
    invoke-virtual {v13}, Ll/ܺۡۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v14

    .line 587
    invoke-virtual {v13}, Ll/ܺۡۗ;->ۖ()Ll/᩷ۡۗ;

    move-result-object v13

    .line 588
    sget-object v15, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v14, v15}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v16

    if-nez v16, :cond_18

    invoke-virtual {v13, v15}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v15

    if-nez v15, :cond_18

    .line 589
    invoke-static {v1, v13, v14}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    const/4 v12, 0x1

    goto :goto_b

    :cond_19
    const/4 v12, 0x0

    :cond_1a
    if-eqz v12, :cond_17

    goto/16 :goto_13

    :cond_1b
    if-le v10, v6, :cond_1f

    .line 623
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۧᩳۗ;

    .line 624
    invoke-virtual {v11}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v11

    if-eq v11, v8, :cond_1c

    const/4 v3, 0x0

    goto :goto_d

    .line 633
    :cond_1d
    invoke-virtual {v8}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v3

    invoke-static {v1, v3}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v3

    .line 634
    sget-object v11, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 635
    invoke-static {v3, v8}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 636
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۧᩳۗ;

    .line 637
    invoke-virtual {v12}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v12

    invoke-static {v12, v8, v3}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_c

    :cond_1e
    const/4 v3, 0x1

    :goto_d
    if-eqz v3, :cond_1f

    goto/16 :goto_13

    :cond_1f
    if-ne v10, v6, :cond_2a

    const/4 v3, 0x0

    .line 532
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧᩳۗ;

    .line 604
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v8

    .line 606
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v9

    .line 607
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-le v10, v6, :cond_21

    .line 608
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :cond_20
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_22

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 609
    sget-object v12, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v11, v12}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v12

    if-nez v12, :cond_20

    .line 610
    invoke-static {v1, v11, v8}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    const/4 v10, 0x1

    goto :goto_e

    :cond_21
    const/4 v10, 0x0

    :cond_22
    if-nez v10, :cond_29

    .line 544
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v8

    .line 545
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v9

    .line 546
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v6

    if-ne v10, v6, :cond_23

    const/4 v8, 0x0

    goto :goto_11

    :cond_23
    if-nez v10, :cond_25

    .line 551
    sget-object v9, Ll/֫۟ۗ;->ᩳۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-nez v10, :cond_24

    .line 552
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Unexpected block without predecessors: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_24
    const/4 v10, -0x1

    .line 554
    invoke-static {v1, v10}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v10

    .line 555
    sget-object v11, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 556
    invoke-virtual {v10, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 557
    invoke-virtual {v1, v10}, Ll/ۖۡۗ;->᩸(Ll/᩷ۡۗ;)V

    .line 558
    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 559
    invoke-static {v10, v8}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_10

    :cond_25
    const/4 v10, -0x1

    .line 562
    invoke-static {v1, v10}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v10

    .line 563
    sget-object v11, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 564
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v11

    .line 565
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_26
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_27

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    if-eq v12, v11, :cond_26

    .line 567
    invoke-static {v12, v8, v10}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_f

    .line 570
    :cond_27
    invoke-static {v10, v8}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    :goto_10
    const/4 v8, 0x1

    :goto_11
    if-nez v8, :cond_29

    .line 497
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v8

    .line 498
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-gt v9, v6, :cond_28

    const/4 v3, 0x0

    goto :goto_12

    :cond_28
    const/4 v9, -0x1

    .line 502
    invoke-static {v1, v9}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v9

    .line 503
    sget-object v10, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v9, v10}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 504
    sget-object v10, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {v9, v10}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 505
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v3

    .line 506
    invoke-static {v8, v3, v9}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 507
    invoke-static {v9, v3}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    const/4 v3, 0x1

    :goto_12
    if-eqz v3, :cond_2a

    :cond_29
    :goto_13
    const/4 v3, 0x1

    goto :goto_14

    :cond_2a
    const/4 v3, 0x0

    :goto_14
    if-eqz v3, :cond_2b

    goto/16 :goto_1d

    :cond_2b
    const/4 v3, 0x0

    goto/16 :goto_a

    .line 373
    :cond_2c
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result v3

    if-eqz v3, :cond_2d

    const/4 v3, 0x0

    goto/16 :goto_16

    .line 377
    :cond_2d
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֡ۙ()Ljava/util/List;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :cond_2e
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 378
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Ll/ۘۧ᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    if-eqz v9, :cond_2e

    .line 380
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Ll/ۘۧ᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۡۗ;

    if-eqz v10, :cond_2e

    .line 381
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v11

    if-eqz v11, :cond_2e

    .line 382
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v10

    .line 383
    invoke-static {v8}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v11

    if-eqz v11, :cond_2e

    .line 384
    invoke-virtual {v11}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v12

    sget-object v13, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v12, v13, :cond_2e

    const/4 v12, 0x0

    .line 385
    invoke-virtual {v11, v12}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v11

    .line 386
    invoke-virtual {v10, v11}, Ll/ۛ֨ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result v10

    if-eqz v10, :cond_2e

    .line 404
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 405
    invoke-virtual {v9, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 406
    invoke-static {v9, v8}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 407
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 408
    sget-object v5, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 409
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v5

    .line 410
    invoke-static {v8, v5}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 411
    invoke-static {v9, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 412
    invoke-virtual {v9}, Ll/᩷ۡۗ;->᩹ۙ()V

    const/4 v5, 0x1

    goto :goto_15

    :cond_2f
    if-eqz v5, :cond_30

    .line 395
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->᩸(Ll/ۖۡۗ;)V

    :cond_30
    move v3, v5

    :goto_16
    if-eqz v3, :cond_31

    goto/16 :goto_1d

    .line 362
    :cond_31
    sget-object v3, Ll/᩶۟ۗ;->ܿ:Ll/᩶۟ۗ;

    invoke-static {v1, v3}, Ll/ܿ۟ۗ;->᩷(Ll/ۖۡۗ;Ll/᩶۟ۗ;)Z

    move-result v3

    const/4 v5, 0x2

    if-eqz v3, :cond_3a

    .line 363
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 443
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    .line 444
    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ne v10, v6, :cond_38

    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v6, :cond_38

    const/4 v10, 0x0

    .line 445
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳۡۗ;

    .line 446
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_38

    .line 447
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v9

    .line 448
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x3

    if-lt v10, v11, :cond_38

    .line 476
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_35

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩷ۡۗ;

    .line 477
    invoke-static {v14}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v14

    if-nez v14, :cond_32

    goto/16 :goto_1b

    .line 481
    :cond_32
    invoke-virtual {v14}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v14

    .line 482
    sget-object v15, Ll/ᩴ᩷᩵;->ۙ:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v15, v14

    if-eq v14, v6, :cond_34

    if-eq v14, v5, :cond_33

    goto :goto_1b

    :cond_33
    const/4 v13, 0x1

    goto :goto_18

    :cond_34
    const/4 v12, 0x1

    goto :goto_18

    :cond_35
    if-eqz v12, :cond_38

    if-eqz v13, :cond_38

    .line 451
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 452
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v9, 0x1

    :goto_19
    if-ge v9, v10, :cond_37

    .line 454
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    const/4 v12, -0x1

    .line 455
    invoke-static {v1, v12}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v12

    .line 456
    sget-object v13, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 457
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_36

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩳۡۗ;

    .line 458
    invoke-virtual {v14}, Ll/ᩳۡۗ;->ۚۙ()Ll/ᩳۡۗ;

    move-result-object v14

    .line 459
    sget-object v15, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v14, v15}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 460
    invoke-virtual {v12}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/util/ArrayList;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    .line 462
    :cond_36
    invoke-virtual {v12, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 463
    invoke-static {v11, v8, v12}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 464
    invoke-static {v12, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_19

    :cond_37
    const/4 v5, 0x1

    goto :goto_1c

    :cond_38
    :goto_1b
    const/4 v5, 0x0

    :goto_1c
    if-eqz v5, :cond_39

    :goto_1d
    const/4 v3, 0x1

    goto/16 :goto_26

    :cond_39
    const/4 v5, 0x2

    const/4 v6, 0x1

    goto/16 :goto_17

    .line 647
    :cond_3a
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֡ۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :cond_3b
    :goto_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 679
    sget-object v8, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-nez v8, :cond_42

    sget-object v8, Ll/֫۟ۗ;->ۡۙ:Ll/֫۟ۗ;

    .line 680
    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-nez v8, :cond_42

    .line 681
    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v8

    if-eqz v8, :cond_3c

    goto/16 :goto_21

    .line 684
    :cond_3c
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    .line 685
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x2

    if-ge v9, v10, :cond_3d

    goto/16 :goto_21

    .line 688
    :cond_3d
    invoke-static {v6}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v9

    if-nez v9, :cond_3e

    goto/16 :goto_21

    .line 692
    :cond_3e
    invoke-virtual {v9}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_3f

    .line 693
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ne v10, v11, :cond_3f

    const/4 v10, 0x0

    .line 694
    invoke-virtual {v9, v10}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    invoke-static {v8, v9}, Ll/ܳ᩷᩵;->ۙ(Ljava/util/List;Ll/ܺ֨ۗ;)Z

    move-result v9

    if-nez v9, :cond_3f

    goto :goto_21

    .line 699
    :cond_3f
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x1

    :goto_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    if-eqz v8, :cond_40

    .line 701
    sget-object v8, Ll/֫۟ۗ;->ۡۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v8, 0x0

    goto :goto_1f

    :cond_40
    const/4 v10, -0x1

    .line 704
    invoke-static {v1, v10}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v10

    .line 705
    sget-object v11, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 706
    sget-object v11, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 707
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_20
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_41

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳۡۗ;

    .line 708
    invoke-virtual {v12}, Ll/ᩳۡۗ;->ۚۙ()Ll/ᩳۡۗ;

    move-result-object v12

    .line 709
    sget-object v13, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 710
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 712
    :cond_41
    invoke-static {v9, v6, v10}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_1f

    .line 719
    :cond_42
    :goto_21
    sget-object v8, Ll/֫۟ۗ;->ۛۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-eqz v8, :cond_43

    goto/16 :goto_1e

    .line 722
    :cond_43
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    .line 723
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x2

    if-ge v9, v10, :cond_44

    goto/16 :goto_1e

    .line 726
    :cond_44
    invoke-static {v6}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_3b

    .line 727
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v11, Ll/᩺ۢۗ;->ۙ᩷:Ll/᩺ۢۗ;

    if-eq v10, v11, :cond_45

    goto/16 :goto_1e

    .line 732
    :cond_45
    new-instance v10, Ljava/util/HashMap;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/HashMap;-><init>(I)V

    .line 733
    new-instance v11, Ljava/util/HashSet;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/HashSet;-><init>(I)V

    .line 734
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_22
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_46

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ۡۗ;

    .line 735
    new-instance v14, Ll/᩷᩷᩵;

    invoke-direct {v14, v9, v10, v13, v11}, Ll/᩷᩷᩵;-><init>(Ll/ᩳۡۗ;Ljava/util/HashMap;Ll/᩷ۡۗ;Ljava/util/HashSet;)V

    invoke-static {v1, v13, v14}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Predicate;)V

    goto :goto_22

    .line 748
    :cond_46
    invoke-virtual {v11}, Ljava/util/HashSet;->size()I

    move-result v9

    const/4 v11, 0x1

    if-ne v9, v11, :cond_47

    .line 749
    sget-object v8, Ll/֫۟ۗ;->ۛۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto/16 :goto_1e

    .line 754
    :cond_47
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x1

    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    if-eqz v8, :cond_48

    const/4 v8, 0x0

    goto :goto_23

    :cond_48
    const/4 v11, -0x1

    .line 758
    invoke-static {v1, v11}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v11

    .line 759
    sget-object v12, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v11, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 760
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_24
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_49

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ᩳۡۗ;

    .line 761
    invoke-virtual {v13}, Ll/ᩳۡۗ;->ۚۙ()Ll/ᩳۡۗ;

    move-result-object v13

    .line 762
    sget-object v14, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v13, v14}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 763
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 765
    :cond_49
    invoke-virtual {v11, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 766
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۤ۠ۗ;

    if-eqz v12, :cond_4a

    .line 768
    invoke-virtual {v12}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/ᩴ۠ۗ;->ۙ(Ll/᩷ۡۗ;)V

    .line 770
    :cond_4a
    invoke-static {v9, v6, v11}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_23

    :cond_4b
    const/4 v5, 0x1

    goto/16 :goto_1e

    :cond_4c
    if-eqz v5, :cond_4e

    .line 664
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v3

    .line 665
    invoke-static {v3}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;)V

    .line 666
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4d
    :goto_25
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    if-eq v8, v3, :cond_4d

    .line 668
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_4d

    sget-object v9, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    .line 669
    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-nez v9, :cond_4d

    .line 670
    invoke-static {v8, v3}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_25

    :cond_4e
    move v3, v5

    :goto_26
    if-eqz v3, :cond_50

    .line 74
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->ۤ(Ll/ۖۡۗ;)V

    add-int/lit8 v3, v4, 0x1

    if-le v4, v2, :cond_4f

    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CFG modification limit reached, blocks count: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    goto :goto_27

    :cond_4f
    const/4 v4, 0x0

    const/4 v6, 0x1

    move v4, v3

    const/4 v3, 0x0

    goto/16 :goto_9

    .line 88
    :cond_50
    :goto_27
    invoke-static/range {p1 .. p1}, Ll/ܳ᩷᩵;->᩷(Ll/ۖۡۗ;)V

    .line 90
    invoke-static/range {p1 .. p1}, Ll/ܺ᩷᩵;->ۙ(Ll/ۖۡۗ;)V

    .line 319
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۗ᩷()V

    .line 320
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ll/ۤ᩷᩵;

    invoke-direct {v2, v1}, Ll/ۤ᩷᩵;-><init>(Ll/ۖۡۗ;)V

    invoke-static {v0, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 328
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ܰۙ()I

    move-result v0

    if-nez v0, :cond_51

    goto :goto_29

    .line 331
    :cond_51
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->᩺ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_52
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_57

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳۗ;

    .line 332
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->᩺ۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_53
    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳۗ;

    if-ne v2, v4, :cond_54

    goto :goto_28

    .line 336
    :cond_54
    invoke-virtual {v2}, Ll/ۧᩳۗ;->ᩴ()Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v4}, Ll/ۧᩳۗ;->ᩴ()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v5

    if-eqz v5, :cond_53

    .line 337
    invoke-virtual {v4}, Ll/ۧᩳۗ;->ܳ()Ll/ۧᩳۗ;

    move-result-object v5

    if-eqz v5, :cond_56

    .line 339
    invoke-virtual {v5}, Ll/ۧᩳۗ;->ᩴ()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v2}, Ll/ۧᩳۗ;->ᩴ()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v6

    if-eqz v6, :cond_55

    .line 340
    invoke-virtual {v2, v5}, Ll/ۧᩳۗ;->᩷(Ll/ۧᩳۗ;)V

    .line 341
    invoke-virtual {v4, v2}, Ll/ۧᩳۗ;->᩷(Ll/ۧᩳۗ;)V

    goto :goto_28

    .line 343
    :cond_55
    invoke-virtual {v5, v2}, Ll/ۧᩳۗ;->᩷(Ll/ۧᩳۗ;)V

    goto :goto_28

    .line 346
    :cond_56
    invoke-virtual {v4, v2}, Ll/ۧᩳۗ;->᩷(Ll/ۧᩳۗ;)V

    goto :goto_28

    .line 16
    :cond_57
    :goto_29
    sget-object v0, Ll/֫۟ۗ;->ۖ:Ll/֫۟ۗ;

    invoke-virtual {v1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_58

    goto/16 :goto_31

    .line 20
    :cond_58
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 21
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    new-instance v3, Ll/᩷۟ۗ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v3}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷۟ۗ;)V

    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 26
    new-array v4, v0, [I

    const/4 v5, 0x0

    :goto_2a
    if-ge v5, v3, :cond_59

    .line 28
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    invoke-virtual {v6}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v6

    aput v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2a

    .line 30
    :cond_59
    invoke-static {v2}, Ll/᩷ۡۗ;->᩷(Ljava/util/List;)V

    .line 32
    new-instance v5, Ll/۟ۘۗ;

    const/16 v6, 0x9

    invoke-direct {v5, v6}, Ll/۟ۘۗ;-><init>(I)V

    invoke-static {v2, v5}, Ll/ܺ᩷᩵;->ۙ(Ljava/util/ArrayList;Ljava/util/function/Function;)[Ll/᩷ۡۗ;

    move-result-object v5

    const/4 v6, 0x0

    .line 33
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 34
    sget-object v7, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    invoke-virtual {v6, v7}, Ll/᩷ۡۗ;->ۤ(Ljava/util/BitSet;)V

    const/4 v7, 0x0

    .line 35
    invoke-virtual {v6, v7}, Ll/᩷ۡۗ;->᩸(Ll/᩷ۡۗ;)V

    const/4 v6, 0x1

    :goto_2b
    if-ge v6, v3, :cond_5a

    .line 37
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 38
    aget-object v8, v5, v6

    .line 39
    invoke-virtual {v7, v8}, Ll/᩷ۡۗ;->᩸(Ll/᩷ۡۗ;)V

    .line 40
    invoke-static {v5, v8}, Ll/ܺ᩷᩵;->ۙ([Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/BitSet;

    move-result-object v8

    .line 41
    invoke-virtual {v7, v8}, Ll/᩷ۡۗ;->ۤ(Ljava/util/BitSet;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2b

    :cond_5a
    const/4 v5, 0x1

    :goto_2c
    if-ge v5, v3, :cond_5c

    .line 44
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 45
    new-instance v7, Ljava/util/BitSet;

    invoke-direct {v7, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 47
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v8

    const/4 v9, 0x0

    .line 48
    invoke-virtual {v8, v9}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v9

    :goto_2d
    if-ltz v9, :cond_5b

    .line 49
    aget v10, v4, v9

    invoke-virtual {v7, v10}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v9, v9, 0x1

    .line 48
    invoke-virtual {v8, v9}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v9

    goto :goto_2d

    .line 51
    :cond_5b
    aget v8, v4, v5

    invoke-virtual {v7, v8}, Ljava/util/BitSet;->clear(I)V

    .line 52
    invoke-virtual {v6, v7}, Ll/᩷ۡۗ;->ۤ(Ljava/util/BitSet;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2c

    :cond_5c
    sub-int/2addr v0, v3

    if-eqz v0, :cond_5f

    .line 59
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_5d
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 60
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v5

    if-nez v5, :cond_5d

    .line 61
    sget-object v5, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    invoke-virtual {v4, v5}, Ll/᩷ۡۗ;->ۤ(Ljava/util/BitSet;)V

    const/4 v5, 0x0

    .line 62
    invoke-virtual {v4, v5}, Ll/᩷ۡۗ;->᩸(Ll/᩷ۡۗ;)V

    .line 63
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_2e

    .line 66
    :cond_5e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Infinite loop detected, blocks: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", insns: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_30

    :catchall_0
    move-exception v0

    goto :goto_32

    :catch_0
    move-exception v0

    goto :goto_2f

    :catch_1
    move-exception v0

    :goto_2f
    :try_start_1
    const-string v2, "Failed to build post-dominance tree"

    .line 70
    invoke-virtual {v1, v2, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :cond_5f
    :goto_30
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۛ᩷()V

    .line 127
    :goto_31
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/۟ܿۗ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/۟ܿۗ;-><init>(I)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 73
    :goto_32
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۛ᩷()V

    .line 74
    throw v0

    :cond_60
    :goto_33
    return-void
.end method
