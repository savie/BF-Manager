.class public final Ll/ۗۖۗ;
.super Ljava/lang/Object;
.source "95VI"


# instance fields
.field public final ۙ:Ll/֫ۖۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    return-void
.end method

.method public static ۙ(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    .line 189
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 192
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 195
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 196
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 197
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 198
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    if-eqz v2, :cond_2

    .line 200
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫֨ۗ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 202
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫֨ۗ;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 205
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;)Ljava/util/Set;
    .locals 5

    .line 108
    sget-object v0, Ll/ۧ۟ۗ;->ۡ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/᩵ᩳۗ;

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {v0}, Ll/᩵ᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 128
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 129
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۜۙ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 120
    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 121
    new-instance v3, Ll/ܽۖۗ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, Ll/ܽۖۗ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Ll/᩻ۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 124
    :cond_1
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v2

    .line 129
    :goto_0
    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 130
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩸()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 131
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 113
    :cond_2
    invoke-static {v0}, Ll/᩵ᩳۗ;->ۙ(Ljava/util/Set;)Ll/᩵ᩳۗ;

    move-result-object v0

    .line 114
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 115
    invoke-virtual {v0}, Ll/᩵ᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V
    .locals 1

    .line 72
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-static {p0}, Ll/ۗۖۗ;->ۙ(Ll/ۖۡۗ;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ll/ۗۖۗ;->ۙ(Ll/ۨᩳۗ;Ll/֫֨ۗ;Ljava/util/Collection;)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۨᩳۗ;Ll/֫֨ۗ;Ljava/util/Collection;)V
    .locals 2

    .line 79
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫֨ۗ;

    .line 84
    invoke-virtual {v1}, Ll/֫֨ۗ;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ᩵;->᩷(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 92
    new-instance v0, Ll/ܺۖۗ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܺۖۗ;-><init>(Ll/ۨᩳۗ;Ll/֫֨ۗ;Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Ll/֫֨ۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V
    .locals 3

    .line 65
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۜۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 121
    new-instance v1, Ll/ܽۖۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/ܽۖۗ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Ll/᩻ۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v0

    .line 66
    :goto_0
    invoke-static {p0, p1, v0}, Ll/ۗۖۗ;->ۙ(Ll/ۨᩳۗ;Ll/֫֨ۗ;Ljava/util/Collection;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֫֨ۗ;)Ljava/util/List;
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 43
    :cond_0
    invoke-virtual {v0}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩷֡ۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۜܿۗ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 44
    invoke-virtual {p1}, Ll/ۜܿۗ;->ᩴ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p1}, Ll/ۜܿۗ;->ᩴ()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    .line 48
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_2
    return-object p1

    .line 45
    :cond_3
    :goto_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ۙ(Ll/ܳۢۗ;)Ljava/util/Map;
    .locals 7

    .line 239
    iget-object v0, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 241
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    .line 243
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 244
    invoke-interface {v0}, Ll/᩶ۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    .line 253
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩶()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 256
    :cond_1
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩺()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 257
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    :cond_2
    :goto_0
    invoke-interface {v0}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    invoke-virtual {p1}, Ll/ܳۢۗ;->ۛۙ()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    .line 247
    invoke-interface {v0}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    invoke-virtual {p1}, Ll/ܳۢۗ;->ۛۙ()I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {p1, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    if-eqz v5, :cond_4

    if-eqz v4, :cond_4

    .line 253
    invoke-virtual {v4}, Ll/֫֨ۗ;->᩶()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    .line 256
    :cond_3
    invoke-virtual {v4}, Ll/֫֨ۗ;->᩺()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 257
    invoke-virtual {v5}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return-object v1
.end method

.method public final ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;
    .locals 2

    .line 287
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 290
    :cond_0
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫֨ۗ;

    return-object p1

    .line 293
    :cond_1
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 294
    invoke-virtual {p1}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    .line 298
    :cond_2
    invoke-static {p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 301
    :cond_3
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩵()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 302
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 303
    invoke-virtual {p0, v0, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_1

    .line 307
    :cond_4
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۗ()Ll/۫֨ۗ;

    move-result-object p1

    invoke-static {p2, p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/۫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 310
    :cond_5
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 311
    invoke-virtual {p1}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 313
    invoke-virtual {p0, v0, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 317
    :cond_6
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۧ()Ll/֫֨ۗ;

    move-result-object p1

    .line 318
    invoke-virtual {p0, p1, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_0

    :cond_7
    move-object p1, p2

    .line 319
    :goto_0
    invoke-static {v0, p1}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 321
    :cond_8
    invoke-virtual {p1}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object v0

    .line 322
    invoke-static {v0}, Ll/ۘۧ᩵;->᩷(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 323
    new-instance v1, Ll/᩹ۖۗ;

    invoke-direct {v1, p0, p2}, Ll/᩹ۖۗ;-><init>(Ll/ۗۖۗ;Ljava/util/Map;)V

    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p2

    .line 327
    invoke-static {p1, p2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/List;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;
    .locals 5

    const/4 v0, 0x0

    if-eqz p3, :cond_5

    if-nez p2, :cond_0

    goto :goto_2

    .line 174
    :cond_0
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 53
    iget-object v2, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    invoke-virtual {v2, p1}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 57
    :cond_1
    sget-object v0, Ll/ۧ۟ۗ;->ۤ:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܰ۟ۗ;

    if-eqz v0, :cond_2

    goto :goto_0

    .line 334
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 335
    invoke-virtual {v2}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v3

    .line 336
    invoke-virtual {v3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Ll/ۗۖۗ;->᩷(Ll/֫֨ۗ;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    new-instance v3, Ll/ܶۖۗ;

    invoke-direct {v3, p0, v0}, Ll/ܶۖۗ;-><init>(Ll/ۗۖۗ;Ljava/util/HashMap;)V

    invoke-virtual {v2, v3}, Ll/᩻ۡۗ;->ۙ(Ll/ܶۖۗ;)V

    .line 356
    invoke-virtual {v2}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v3

    .line 357
    new-instance v4, Ll/ܰ۟ۗ;

    invoke-direct {v4, v3, v0}, Ll/ܰ۟ۗ;-><init>(Ljava/util/List;Ljava/util/HashMap;)V

    .line 358
    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_3

    .line 177
    invoke-virtual {v0, p2}, Ll/ܰ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/util/Map;

    move-result-object p2

    invoke-static {v1, p2}, Ll/ۗۖۗ;->ۙ(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 179
    :cond_3
    invoke-virtual {p0, p1}, Ll/ۗۖۗ;->᩷(Ll/֫֨ۗ;)Ljava/util/Map;

    move-result-object p2

    invoke-static {v1, p2}, Ll/ۗۖۗ;->ۙ(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 180
    invoke-virtual {p1}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_4

    .line 182
    invoke-virtual {p0, p1}, Ll/ۗۖۗ;->᩷(Ll/֫֨ۗ;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۗۖۗ;->ۙ(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 183
    invoke-virtual {p1}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object p1

    goto :goto_1

    .line 185
    :cond_4
    invoke-virtual {p0, p3, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;Ll/ܶۖۗ;)V
    .locals 5

    .line 363
    iget-object v0, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 365
    invoke-virtual {v1, p2}, Ll/᩻ۡۗ;->ۙ(Ll/ܶۖۗ;)V

    return-void

    .line 367
    :cond_0
    invoke-virtual {v0}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩷֡ۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۜܿۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 369
    invoke-virtual {v0}, Ll/ۜܿۗ;->᩸()[Ll/֫֨ۗ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 370
    sget-object v4, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {v3, v4}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 371
    invoke-virtual {p2, p1, v3}, Ll/ܶۖۗ;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    invoke-virtual {p0, v3, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/ܶۖۗ;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ᩷(Ll/֫֨ۗ;)Ljava/util/Map;
    .locals 7

    .line 210
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۛ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    .line 213
    :cond_0
    iget-object v0, p0, Ll/ۗۖۗ;->ۙ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;)Ljava/util/List;

    move-result-object v0

    .line 214
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 215
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    .line 217
    :cond_1
    invoke-virtual {p1}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object p1

    .line 218
    invoke-static {p1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 219
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    .line 221
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 222
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_3

    .line 223
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    .line 225
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 227
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    .line 228
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 229
    invoke-virtual {v5}, Ll/֫֨ۗ;->ۚ()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 231
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/֫֨ۗ;->ۙ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v5

    .line 233
    :cond_4
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-object v2
.end method
