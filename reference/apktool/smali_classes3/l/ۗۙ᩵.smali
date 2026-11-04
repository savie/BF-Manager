.class public final Ll/ۗۙ᩵;
.super Ll/ܺ۠ۗ;
.source "16GA"


# instance fields
.field public ܰ:Ljava/util/HashMap;


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 9

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 41
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۙۙ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۗ;

    .line 111
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_5

    .line 115
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 116
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Found \'super\' loop in classes: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 117
    new-instance v5, Ll/ܶ۟ۗ;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v4}, Ll/ܶ۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, v5}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_3

    .line 120
    :cond_1
    invoke-virtual {v4}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    .line 121
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v7

    if-nez v7, :cond_2

    .line 122
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {v4}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_3

    .line 129
    :cond_4
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v5

    invoke-virtual {v5, v4}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v4

    goto :goto_1

    .line 71
    :cond_5
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    .line 72
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto/16 :goto_7

    .line 101
    :cond_6
    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 104
    invoke-virtual {v5}, Ll/ܽۡۗ;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ll/֨ۙ᩺;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Ll/֨ۙ᩺;-><init>(I)V

    invoke-static {v3, v6, v7}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 105
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 75
    :cond_7
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    new-instance v5, Ll/ܺۙ᩵;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v5}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 76
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 77
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_7

    .line 79
    :cond_8
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 80
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 81
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v6

    if-ne v6, v1, :cond_a

    .line 82
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_a

    const/4 v6, 0x1

    .line 84
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 85
    invoke-virtual {v5}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v6

    if-eq v6, v1, :cond_9

    .line 86
    invoke-virtual {v5}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v5

    sget-object v6, Ll/᩹ۙ᩵;->ܿ:Ll/᩹ۙ᩵;

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 90
    :cond_a
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    .line 91
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v7

    if-eq v7, v1, :cond_b

    .line 92
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v6

    sget-object v7, Ll/᩹ۙ᩵;->᩶:Ll/᩹ۙ᩵;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 43
    :cond_c
    :goto_7
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 44
    new-instance v3, Ll/ܶۙ᩵;

    invoke-direct {v3, v4}, Ll/ܶۙ᩵;-><init>(I)V

    .line 45
    iput-object v2, v3, Ll/ܶۙ᩵;->ۙ:Ljava/util/Map;

    .line 46
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܿۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 49
    :cond_d
    iput-object v0, p0, Ll/ۗۙ᩵;->ܰ:Ljava/util/HashMap;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 8

    .line 54
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 57
    :cond_0
    iget-object v0, p0, Ll/ۗۙ᩵;->ܰ:Ljava/util/HashMap;

    .line 135
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 136
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 165
    sget-object v4, Ll/ܽۙ᩵;->ۙ:[I

    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v6, 0x2

    if-eq v4, v6, :cond_3

    const/4 v4, 0x0

    goto :goto_1

    .line 168
    :cond_3
    move-object v4, v3

    check-cast v4, Ll/ۗۢۗ;

    invoke-virtual {v4}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ᩳۗ;

    :goto_1
    if-nez v4, :cond_4

    goto :goto_0

    .line 147
    :cond_4
    invoke-virtual {v3}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v6

    sub-int/2addr v6, v5

    invoke-virtual {v3, v6}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 148
    invoke-virtual {v3}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v6

    .line 149
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩶()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ll/֫֨ۗ;->ۘ()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_0

    .line 152
    :cond_5
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܶۙ᩵;

    if-nez v6, :cond_6

    goto :goto_0

    .line 156
    :cond_6
    iget-object v6, v6, Ll/ܶۙ᩵;->ۙ:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩹ۙ᩵;

    if-nez v6, :cond_7

    goto :goto_0

    .line 175
    :cond_7
    sget-object v7, Ll/᩹ۙ᩵;->ܿ:Ll/᩹ۙ᩵;

    if-ne v6, v7, :cond_8

    .line 252
    sget-object v6, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 178
    sget-object v4, Ll/֫۟ۗ;->֫᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_0

    .line 183
    :cond_8
    new-instance v6, Ll/ۗۢۗ;

    sget-object v7, Ll/᩺ۢۗ;->ۢ:Ll/᩺ۢۗ;

    invoke-virtual {v4}, Ll/۬ᩳۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v4

    invoke-direct {v6, v7, v4, v5}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 184
    invoke-virtual {v3}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v4

    invoke-virtual {v6, v4}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 185
    sget-object v4, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v6, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 186
    sget-object v4, Ll/֫۟ۗ;->ܺۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v4, 0x0

    .line 187
    invoke-virtual {v3, p1, v6, v4}, Ll/ܺ֨ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܺ֨ۗ;

    goto/16 :goto_0

    :cond_9
    :goto_2
    return-void
.end method
