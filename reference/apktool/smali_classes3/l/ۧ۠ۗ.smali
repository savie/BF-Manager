.class public final Ll/ۧ۠ۗ;
.super Ljava/lang/Object;
.source "56FA"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public final ܰ:Ljava/util/ArrayList;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩶:Ll/۫۠ۗ;


# direct methods
.method public constructor <init>(Ll/۫۠ۗ;I)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۧ۠ۗ;->ܰ:Ljava/util/ArrayList;

    .line 42
    iput-object p1, p0, Ll/ۧ۠ۗ;->᩶:Ll/۫۠ۗ;

    .line 43
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 58
    instance-of v0, p1, Ll/ۚ۠ۗ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 62
    :cond_0
    check-cast p1, Ll/ۚ۠ۗ;

    .line 63
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 24
    check-cast p1, Ll/ۚ۠ۗ;

    check-cast p2, Ljava/util/Map;

    .line 88
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۧ۠ۗ;->ܰ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)Ljava/util/HashMap;
    .locals 14

    .line 135
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 139
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 83
    iget-object v2, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    .line 141
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v5, p0, Ll/ۧ۠ۗ;->ܰ:Ljava/util/ArrayList;

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ۠ۗ;

    .line 262
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙۧ᩵;

    .line 263
    invoke-virtual {v7}, Ll/ۙۧ᩵;->᩷()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_0

    goto :goto_1

    :cond_1
    move-object v7, v8

    :goto_1
    if-eqz v7, :cond_2

    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    .line 150
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۚ۠ۗ;

    .line 262
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۙۧ᩵;

    .line 263
    invoke-virtual {v12}, Ll/ۙۧ᩵;->᩷()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v10, :cond_3

    goto :goto_3

    :cond_4
    move-object v12, v8

    :goto_3
    if-eqz v12, :cond_5

    .line 153
    invoke-virtual {v12}, Ll/ۙۧ᩵;->ۙ()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_5

    goto :goto_2

    .line 157
    :cond_5
    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    if-nez v11, :cond_6

    .line 161
    invoke-virtual {v1, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 163
    :cond_6
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 167
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    goto/16 :goto_0

    .line 172
    :cond_8
    invoke-static {v7}, Ll/᩹֫᩵;->᩷(Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v5

    .line 174
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 175
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 177
    :cond_9
    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 178
    invoke-virtual {v6, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 179
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 183
    :cond_a
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ۠ۗ;

    .line 185
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 186
    invoke-interface {v7, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_6

    .line 203
    :cond_c
    invoke-virtual {v3}, Ll/ۚ۠ۗ;->᩷()Ll/᩷ۡۗ;

    move-result-object v6

    .line 204
    invoke-static {p1, v6, v4}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Z)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v6, 0x0

    .line 888
    invoke-static {v4, v6}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Z)Ll/᩷ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 211
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 212
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_5

    .line 214
    :cond_d
    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 215
    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v6

    .line 217
    :goto_5
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 207
    :cond_e
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Could not find bottom clean successor for isolated try edge"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 207
    throw p1

    .line 220
    :cond_f
    :goto_6
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result p1

    if-ne p1, v4, :cond_16

    .line 221
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۧ᩵;

    .line 222
    invoke-virtual {v1}, Ll/ۙۧ᩵;->ۙ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ۠ۗ;

    .line 223
    invoke-virtual {v1}, Ll/ۙۧ᩵;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠ۗ;

    .line 225
    invoke-virtual {v3}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v4

    iget-object v5, p0, Ll/ۧ۠ۗ;->᩶:Ll/۫۠ۗ;

    if-eqz v4, :cond_10

    invoke-virtual {v5}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Ll/ۚ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_7

    .line 228
    :cond_10
    invoke-virtual {v1}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v5}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Ll/ۚ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_7

    .line 234
    :cond_11
    invoke-virtual {v3}, Ll/ۚ۠ۗ;->᩸()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-virtual {v1}, Ll/ۚ۠ۗ;->᩸()Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_7

    .line 238
    :cond_12
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_13
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 239
    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 240
    invoke-interface {v5, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_8

    .line 73
    :cond_14
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    .line 244
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 246
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    .line 247
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 248
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 249
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 251
    :cond_15
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 253
    :goto_9
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_16
    return-object v0
.end method

.method public final ۙ(Ljava/util/HashMap;)V
    .locals 14

    .line 336
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 338
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 339
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    move v5, v4

    .line 340
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_0

    .line 341
    new-instance v6, Ll/֫۠ۗ;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ۠ۗ;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    invoke-direct {v6, v7, v8}, Ll/֫۠ۗ;-><init>(Ll/ۚ۠ۗ;Ll/᩷ۡۗ;)V

    .line 342
    new-instance v7, Ll/֫۠ۗ;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۚ۠ۗ;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    invoke-direct {v7, v8, v9}, Ll/֫۠ۗ;-><init>(Ll/ۚ۠ۗ;Ll/᩷ۡۗ;)V

    .line 343
    new-instance v8, Ll/ۙۧ᩵;

    invoke-direct {v8, v6, v7}, Ll/ۙۧ᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    move v3, v4

    goto :goto_0

    .line 347
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const/4 v3, 0x0

    .line 350
    :goto_2
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v4

    iget-object v5, p0, Ll/ۧ۠ۗ;->ܰ:Ljava/util/ArrayList;

    const/4 v6, 0x1

    if-ge v3, v4, :cond_7

    .line 351
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙۧ᩵;

    .line 353
    invoke-virtual {v4}, Ll/ۙۧ᩵;->ۙ()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫۠ۗ;

    .line 354
    invoke-virtual {v4}, Ll/ۙۧ᩵;->᩷()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫۠ۗ;

    .line 355
    invoke-static {v7}, Ll/֫۠ۗ;->ۙ(Ll/֫۠ۗ;)Ll/᩷ۡۗ;

    move-result-object v8

    .line 356
    invoke-static {v4}, Ll/֫۠ۗ;->ۙ(Ll/֫۠ۗ;)Ll/᩷ۡۗ;

    move-result-object v9

    .line 357
    invoke-static {v8, v9}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-static {v9, v8}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    const/4 v10, 0x2

    new-array v11, v10, [Ljava/lang/Object;

    aput-object v8, v11, v2

    aput-object v9, v11, v6

    .line 0
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v10, :cond_4

    aget-object v13, v11, v12

    invoke-static {v13, v9, v13, v12, v6}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v12

    goto :goto_4

    :cond_4
    invoke-static {v9}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 888
    invoke-static {v6, v2}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Z)Ll/᩷ۡۗ;

    move-result-object v6

    if-eq v8, v6, :cond_5

    .line 361
    invoke-static {v7}, Ll/֫۠ۗ;->᩷(Ll/֫۠ۗ;)Ll/ۚ۠ۗ;

    move-result-object v9

    goto :goto_5

    :cond_5
    invoke-static {v4}, Ll/֫۠ۗ;->᩷(Ll/֫۠ۗ;)Ll/ۚ۠ۗ;

    move-result-object v9

    :goto_5
    if-ne v8, v6, :cond_6

    .line 362
    invoke-static {v7}, Ll/֫۠ۗ;->᩷(Ll/֫۠ۗ;)Ll/ۚ۠ۗ;

    move-result-object v4

    goto :goto_6

    :cond_6
    invoke-static {v4}, Ll/֫۠ۗ;->᩷(Ll/֫۠ۗ;)Ll/ۚ۠ۗ;

    move-result-object v4

    .line 363
    :goto_6
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 366
    new-instance v6, Ll/ۙۧ᩵;

    invoke-direct {v6, v4, v9}, Ll/ۙۧ᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 122
    :cond_7
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠ۗ;

    .line 123
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 272
    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 273
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ۠ۗ;

    if-ne v1, v7, :cond_9

    goto :goto_8

    .line 278
    :cond_9
    invoke-virtual {p1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 280
    invoke-virtual {v1}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-virtual {v7}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_9

    :cond_a
    const/4 v9, 0x0

    goto :goto_a

    :cond_b
    :goto_9
    const/4 v9, 0x1

    :goto_a
    if-ne v8, v2, :cond_c

    if-eqz v9, :cond_c

    goto :goto_8

    .line 285
    :cond_c
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    sget-object v9, Ll/֫۟ۗ;->ۢۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 286
    invoke-virtual {v3, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    goto :goto_8

    .line 291
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    invoke-virtual {v2, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 292
    invoke-virtual {v3, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    goto :goto_8

    .line 298
    :cond_e
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/BitSet;

    .line 299
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v10

    .line 300
    invoke-virtual {v9}, Ljava/util/BitSet;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_8

    invoke-virtual {v10}, Ljava/util/BitSet;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_8

    .line 303
    :cond_f
    invoke-virtual {v9, v10}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    .line 305
    new-instance v9, Ljava/util/LinkedList;

    invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V

    move-object v10, v2

    :goto_b
    if-eqz v10, :cond_10

    .line 308
    invoke-virtual {v9, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 309
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v10

    goto :goto_b

    :cond_10
    :goto_c
    if-eqz v8, :cond_12

    .line 315
    invoke-virtual {v9, v8}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_d

    .line 319
    :cond_11
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v8

    goto :goto_c

    :cond_12
    const/4 v8, 0x0

    .line 323
    :goto_d
    invoke-virtual {v3, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 88
    :cond_13
    iget-object v2, p0, Ll/ۧ۠ۗ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    goto/16 :goto_7

    :cond_14
    return-void
.end method
