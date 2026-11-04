.class public final Ll/᩸۟ۗ;
.super Ljava/lang/Object;
.source "P6BW"


# instance fields
.field public final ۙ:Ljava/util/HashMap;

.field public final ۤ:Ljava/util/BitSet;

.field public final ᩷:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/᩸۟ۗ;->᩷:Ll/ۖۡۗ;

    .line 38
    invoke-static {p1}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Ll/᩸۟ۗ;->ۤ:Ljava/util/BitSet;

    .line 39
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩸۟ۗ;->ۙ:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩸۟ۗ;Ljava/util/HashSet;Ll/᩷ۡۗ;)Z
    .locals 0

    .line 48
    iget-object p0, p0, Ll/᩸۟ۗ;->᩷:Ll/ۖۡۗ;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 14

    .line 215
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩸۟ۗ;->᩷:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    new-instance v2, Ll/᩷۟ۗ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/function/Consumer;)V

    .line 155
    invoke-virtual {v1}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 159
    :cond_0
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 160
    sget-object v4, Ll/ۧ۟ۗ;->۬:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ܰᩳۗ;

    if-nez v5, :cond_1

    goto :goto_0

    .line 164
    :cond_1
    invoke-virtual {v5}, Ll/ܰᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v5

    .line 165
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 168
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    if-eq v7, v5, :cond_2

    .line 170
    invoke-static {v3, v7}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_1

    .line 173
    :cond_3
    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    goto :goto_0

    .line 166
    :cond_4
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Readable normal edge lost for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 166
    throw v0

    .line 101
    :cond_5
    :goto_2
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 102
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ۠ۗ;

    .line 103
    invoke-virtual {v4}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 105
    new-instance v6, Ll/᩸ۖۗ;

    const/4 v7, 0x6

    invoke-direct {v6, v7}, Ll/᩸ۖۗ;-><init>(I)V

    invoke-static {v2, v5, v6}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 112
    :cond_7
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_8
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 113
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v7

    if-eq v6, v7, :cond_8

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v7

    if-eq v6, v7, :cond_8

    sget-object v7, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    .line 114
    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v2, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 115
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 116
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-virtual {v6}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 117
    :cond_9
    invoke-static {v6}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;)V

    .line 118
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 119
    invoke-static {v6, v7}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_5

    .line 121
    :cond_a
    sget-object v5, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v5, 0x1

    goto :goto_4

    .line 125
    :cond_b
    invoke-static {v1}, Ll/ܳ᩷᩵;->᩸(Ll/ۖۡۗ;)V

    if-nez v5, :cond_7

    .line 127
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_c
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 128
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 129
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 130
    :cond_d
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v7, :cond_c

    .line 131
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v5, :cond_c

    .line 132
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 134
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_e

    .line 136
    new-instance v9, Ll/ۤ۟ۗ;

    const/4 v10, 0x0

    invoke-direct {v9, v10, v6}, Ll/ۤ۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v8, v9}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 137
    new-instance v9, Ll/ܳۖۗ;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Ll/ܳۖۗ;-><init>(I)V

    invoke-static {v2, v6, v9}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 139
    :cond_e
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    .line 140
    invoke-static {v5, v6}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 141
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v7, :cond_f

    .line 142
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    invoke-static {v8, v5, v6}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_8

    .line 144
    :cond_f
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 145
    invoke-static {v9, v5, v6}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_7

    .line 148
    :cond_10
    :goto_8
    sget-object v6, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto/16 :goto_6

    .line 151
    :cond_11
    invoke-static {v1}, Ll/ܳ᩷᩵;->᩸(Ll/ۖۡۗ;)V

    .line 47
    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 48
    new-instance v3, Ll/ۙ۟ۗ;

    invoke-direct {v3, p0, v2}, Ll/ۙ۟ۗ;-><init>(Ll/᩸۟ۗ;Ljava/util/HashSet;)V

    invoke-static {v0, v3}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 49
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_12
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v5, p0, Ll/᩸۟ۗ;->ۤ:Ljava/util/BitSet;

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ۠ۗ;

    .line 50
    invoke-virtual {v3}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 52
    invoke-virtual {v3}, Ll/᩷ۡۗ;->getId()I

    move-result v3

    invoke-virtual {v5, v3}, Ljava/util/BitSet;->set(I)V

    goto :goto_9

    .line 55
    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 56
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 60
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v8, v3

    :goto_a
    if-ge v6, v2, :cond_1d

    .line 62
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v2, :cond_15

    move-object v10, v3

    goto :goto_b

    .line 63
    :cond_15
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    .line 64
    :goto_b
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v11

    .line 65
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-le v12, v7, :cond_16

    .line 67
    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_c

    :cond_16
    if-ne v12, v7, :cond_17

    if-eqz v8, :cond_17

    .line 69
    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v11}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    .line 70
    sget-object v8, Ll/֫۟ۗ;->ۧۙ:Ll/֫۟ۗ;

    invoke-virtual {v9, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-nez v8, :cond_17

    .line 71
    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->set(I)V

    .line 75
    :cond_17
    :goto_c
    invoke-static {v9}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v8

    .line 76
    instance-of v11, v8, Ll/ۡۢۗ;

    if-eqz v11, :cond_1a

    .line 178
    instance-of v11, v8, Ll/ܽۢۗ;

    if-eqz v11, :cond_19

    .line 179
    move-object v11, v8

    check-cast v11, Ll/ܽۢۗ;

    .line 180
    invoke-virtual {v11}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v12

    .line 181
    invoke-static {v10, v12}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_18

    .line 182
    invoke-virtual {v11}, Ll/ܽۢۗ;->᩶ۙ()V

    .line 183
    invoke-virtual {v11}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v12

    invoke-virtual {v12}, Ll/᩷ۡۗ;->getId()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/util/BitSet;->set(I)V

    goto :goto_d

    .line 185
    :cond_18
    invoke-virtual {v12}, Ll/᩷ۡۗ;->getId()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/util/BitSet;->set(I)V

    .line 187
    :goto_d
    invoke-virtual {v11}, Ll/ܽۢۗ;->normalize()V

    goto :goto_f

    .line 189
    :cond_19
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 190
    invoke-virtual {v12}, Ll/᩷ۡۗ;->getId()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/util/BitSet;->set(I)V

    goto :goto_e

    .line 80
    :cond_1a
    :goto_f
    instance-of v11, v8, Ll/ܽۢۗ;

    iget-object v12, p0, Ll/᩸۟ۗ;->ۙ:Ljava/util/HashMap;

    if-eqz v11, :cond_1b

    .line 81
    check-cast v8, Ll/ܽۢۗ;

    invoke-virtual {v8}, Ll/ܽۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v8

    .line 201
    invoke-virtual {v8, v10}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1c

    .line 202
    :goto_10
    invoke-virtual {v12, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    invoke-virtual {v8}, Ll/᩷ۡۗ;->getId()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_11

    .line 82
    :cond_1b
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ne v8, v7, :cond_1c

    invoke-virtual {v1, v9}, Ll/ۖۡۗ;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v8

    if-nez v8, :cond_1c

    .line 83
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 201
    invoke-virtual {v8, v10}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1c

    goto :goto_10

    :cond_1c
    :goto_11
    move-object v8, v9

    goto/16 :goto_a

    .line 87
    :cond_1d
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v7

    .line 89
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 91
    sget-object v3, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 92
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v7, :cond_1e

    .line 93
    invoke-virtual {v2}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    invoke-virtual {v5, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 94
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1e
    return-object v0
.end method

.method public final ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/᩸۟ۗ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    return-object p1
.end method

.method public final ᩷(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 196
    iget-object v0, p0, Ll/᩸۟ۗ;->ۤ:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method
