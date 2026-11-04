.class public final Ll/ۢᩴ᩵;
.super Ll/ܺ۠ۗ;
.source "V6HT"


# static fields
.field public static final ܰ:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/ۢᩴ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۢᩴ᩵;->ܰ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/֨ᩴ᩵;Ljava/util/ArrayList;)Z
    .locals 7

    .line 18
    iget-object v0, p0, Ll/֨ᩴ᩵;->᩷:Ll/ܿۡۗ;

    .line 22
    iget-object p0, p0, Ll/֨ᩴ᩵;->ۙ:Ll/᩹ۡۗ;

    .line 295
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 297
    invoke-interface {v0}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۡۗ;

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-ne v3, p0, :cond_1

    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_0

    .line 302
    new-instance v5, Ll/᩺֨ۗ;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v3}, Ll/᩺֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v5}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 303
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    return v4

    :cond_2
    return v0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 10

    .line 45
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_b

    .line 73
    :cond_0
    new-instance v0, Ll/۟ᩴ᩵;

    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 73
    invoke-static {p1, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    .line 214
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 215
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֨ۗ;

    .line 216
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۧ֨ۗ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v3

    .line 220
    new-instance v4, Ll/۬ᩴ᩺;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ll/۬ᩴ᩺;-><init>(I)V

    invoke-static {v0, v3, v4}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 221
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 224
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 225
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ֨ۗ;

    .line 226
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 227
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ֨ۗ;

    .line 228
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v5

    .line 229
    invoke-virtual {v3, v5}, Ll/ۧ֨ۗ;->ۙ(Ll/ۧ֨ۗ;)V

    goto :goto_2

    .line 231
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_4

    .line 232
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ֨ۗ;

    .line 233
    invoke-virtual {v5, v3}, Ll/ܿ֨ۗ;->ۙ(Ll/ۧ֨ۗ;)V

    goto :goto_3

    .line 236
    :cond_4
    invoke-virtual {v3, v2}, Ll/ۧ֨ۗ;->ۙ(Ljava/util/List;)V

    goto :goto_1

    .line 238
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_b

    .line 163
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ֨ۗ;

    .line 164
    invoke-virtual {v3}, Ll/ۧ֨ۗ;->ᩴ()Ll/֫֨ۗ;

    move-result-object v4

    if-nez v4, :cond_7

    .line 166
    sget-object v4, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {v3, v4}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 169
    :cond_7
    invoke-virtual {v3}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object v3

    new-instance v5, Ll/᩵ۢۗ;

    const/4 v6, 0x1

    invoke-direct {v5, v6, p1, v4}, Ll/᩵ۢۗ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 170
    invoke-static {v3, v5}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_4

    :cond_8
    if-eqz v2, :cond_9

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Unknown variable types count: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    .line 58
    :cond_9
    new-instance v0, Ll/֡ᩴ᩵;

    invoke-direct {v0}, Ll/֡ᩴ᩵;-><init>()V

    .line 59
    invoke-static {p1, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    .line 60
    invoke-virtual {v0}, Ll/֡ᩴ᩵;->᩷()Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    goto/16 :goto_b

    .line 242
    :cond_a
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 243
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ֨ۗ;

    .line 244
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 245
    invoke-virtual {v3}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿ֨ۗ;

    .line 246
    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡᩴ᩵;

    if-eqz v6, :cond_b

    .line 248
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 251
    :cond_c
    invoke-static {v4}, Ll/ۘۧ᩵;->ۤ(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 67
    :cond_d
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ֨ۗ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 190
    invoke-virtual {v2}, Ll/ۧ֨ۗ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    .line 194
    :cond_e
    new-instance v3, Ll/ۡᩴ᩵;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/ۡᩴ᩵;-><init>(Ll/ܿ֨ۗ;)V

    .line 195
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡᩴ᩵;

    .line 196
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 197
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5}, Ll/ۡᩴ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_8

    .line 199
    :cond_f
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v3}, Ll/ۡᩴ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_7

    .line 257
    :cond_10
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_11

    goto/16 :goto_a

    .line 260
    :cond_11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡᩴ᩵;

    .line 261
    invoke-virtual {v4}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_13
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֨ᩴ᩵;

    .line 18
    iget-object v7, v6, Ll/֨ᩴ᩵;->᩷:Ll/ܿۡۗ;

    .line 273
    instance-of v8, v7, Ll/ۜۖۗ;

    if-eqz v8, :cond_15

    .line 274
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֨ᩴ᩵;

    .line 18
    iget-object v9, v9, Ll/֨ᩴ᩵;->᩷:Ll/ܿۡۗ;

    .line 275
    invoke-static {v7, v9}, Ll/᩵ۧ᩵;->ۙ(Ll/ۛۡۗ;Ll/ܿۡۗ;)Z

    move-result v9

    if-nez v9, :cond_14

    goto :goto_9

    .line 281
    :cond_15
    sget-object v8, Ll/֫۟ۗ;->֫ۙ:Ll/֫۟ۗ;

    invoke-interface {v7, v8}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-eqz v7, :cond_16

    goto :goto_9

    .line 284
    :cond_16
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ۢᩴ᩵;->ۙ(Ll/֨ᩴ᩵;Ljava/util/ArrayList;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 285
    invoke-virtual {v3}, Ll/ۡᩴ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ۢᩴ᩵;->ۙ(Ll/֨ᩴ᩵;Ljava/util/ArrayList;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 263
    invoke-virtual {v4}, Ll/ۡᩴ᩵;->ۤ()Ll/ܿ֨ۗ;

    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    .line 324
    invoke-virtual {v3}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v4

    if-eqz v4, :cond_19

    .line 325
    sget-object v5, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    .line 326
    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-nez v5, :cond_19

    .line 327
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_17

    goto :goto_a

    .line 330
    :cond_17
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۛ֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    goto :goto_a

    .line 333
    :cond_18
    sget-object v2, Ll/֫۟ۗ;->۬:Ll/֫۟ۗ;

    invoke-virtual {v4, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 334
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ֨ۗ;->֫()V

    goto/16 :goto_7

    .line 210
    :cond_19
    :goto_a
    invoke-virtual {p1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v1

    .line 339
    invoke-virtual {v2}, Ll/ۧ֨ۗ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 340
    sget-object v1, Ll/ۢᩴ᩵;->ܰ:Ll/᩻ܽ᩺;

    const-string v3, "Try to declare already declared variable: {}"

    invoke-interface {v1, v2, v3}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_7

    .line 343
    :cond_1a
    sget-object v3, Ll/ۧ۟ۗ;->ᩴ:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v3

    check-cast v3, Ll/֡۟ۗ;

    if-nez v3, :cond_1b

    .line 345
    new-instance v3, Ll/֡۟ۗ;

    invoke-direct {v3}, Ll/֡۟ۗ;-><init>()V

    .line 346
    invoke-virtual {v1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 348
    :cond_1b
    invoke-virtual {v3, v2}, Ll/֡۟ۗ;->ۙ(Ll/ۧ֨ۗ;)V

    .line 349
    invoke-virtual {v2}, Ll/ۧ֨ۗ;->֫()V

    goto/16 :goto_7

    :cond_1c
    :goto_b
    return-void
.end method
