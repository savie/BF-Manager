.class public final Ll/᩶᩷᩵;
.super Ll/ܺ۠ۗ;
.source "1IVR"


# direct methods
.method public static ۙ(Ll/ܺ֨ۗ;Ll/᩺ᩳۗ;I)I
    .locals 1

    .line 143
    instance-of v0, p0, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 144
    check-cast p0, Ll/ۛ֨ۗ;

    .line 145
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v0

    if-ne p2, v0, :cond_0

    .line 146
    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۡܰۗ;)Ll/֫֨ۗ;
    .locals 3

    .line 154
    invoke-interface {p1}, Ll/ۡܰۗ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v0

    .line 155
    invoke-interface {p1}, Ll/ۡܰۗ;->getSignature()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    :try_start_0
    new-instance v1, Ll/ۧۖۗ;

    invoke-direct {v1, p1}, Ll/ۧۖۗ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v1

    .line 161
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, Ll/ۗۖۗ;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    .line 162
    invoke-static {p0, v0, v1}, Ll/᩶᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    return-object v1

    :cond_1
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Can\'t parse signature for local variable: "

    .line 166
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳ᩶ۗ;)V
    .locals 11

    .line 50
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v0

    .line 51
    invoke-virtual {p1}, Ll/ᩳ᩶ۗ;->᩷()Ljava/util/Map;

    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    .line 60
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 62
    :try_start_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v4, v0, v4

    if-eqz v4, :cond_1

    .line 64
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۚᩳۗ;->᩷(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error attach source line"

    .line 67
    invoke-virtual {p0, v2, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 81
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v3, Ll/ܰ᩷᩵;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-interface {v2, v3}, Ll/᩵ܺۗ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ܽܺۗ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܽܺۗ;->min()Ll/᩹ۚۗ;

    move-result-object v2

    const v3, 0x7fffffff

    invoke-virtual {v2, v3}, Ll/᩹ۚۗ;->orElse(I)I

    move-result v2

    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    const-string v1, "Lines numbers was adjusted: min line is "

    .line 0
    invoke-static {v2, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 89
    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۡᩴ᩺;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Ll/ۡᩴ᩺;-><init>(I)V

    new-instance v3, Ll/ۙ۬ۗ;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Ll/ۙ۬ۗ;-><init>(I)V

    new-instance v4, Ll/᩺ۜۗ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 90
    invoke-static {v2, v3, v4}, Ll/֫ܺۗ;->toMap(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;)Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 91
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/᩷۬ۗ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/᩷۬ۗ;-><init>(I)V

    .line 92
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 93
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 94
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Repeating lines: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    const-string v2, "Don\'t trust debug lines info. "

    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    goto :goto_2

    .line 75
    :cond_5
    sget-object v1, Ll/֫۟ۗ;->ܶ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 52
    :goto_2
    invoke-virtual {p1}, Ll/ᩳ᩶ۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    .line 101
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    goto/16 :goto_7

    .line 104
    :cond_6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡܰۗ;

    .line 105
    invoke-interface {v3}, Ll/ۡܰۗ;->ۤ()I

    move-result v4

    .line 106
    invoke-interface {v3}, Ll/ۡܰۗ;->᩷()I

    move-result v5

    .line 107
    invoke-interface {v3}, Ll/ۡܰۗ;->ۙ()I

    move-result v6

    .line 109
    invoke-static {p0, v3}, Ll/᩶᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/ۡܰۗ;)Ll/֫֨ۗ;

    move-result-object v7

    .line 110
    new-instance v8, Ll/᩺ᩳۗ;

    invoke-interface {v3}, Ll/ۡܰۗ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v7, v3}, Ll/᩺ᩳۗ;-><init>(Ll/֫֨ۗ;Ljava/lang/String;)V

    if-gtz v5, :cond_a

    .line 113
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 115
    invoke-static {v3, v8, v4}, Ll/᩶᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/᩺ᩳۗ;I)I

    .line 117
    :cond_8
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֨ۗ;

    .line 118
    invoke-static {v5, v8, v4}, Ll/᩶᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/᩺ᩳۗ;I)I

    goto :goto_3

    :cond_9
    const/4 v5, 0x0

    :cond_a
    :goto_4
    if-gt v5, v6, :cond_7

    .line 123
    aget-object v3, v0, v5

    if-nez v3, :cond_b

    goto :goto_6

    .line 128
    :cond_b
    invoke-virtual {v3}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v9, 0x0

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܺ֨ۗ;

    .line 129
    invoke-static {v10, v8, v4}, Ll/᩶᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/᩺ᩳۗ;I)I

    move-result v10

    add-int/2addr v9, v10

    goto :goto_5

    :cond_c
    if-eqz v9, :cond_d

    goto :goto_6

    .line 135
    :cond_d
    invoke-virtual {v3}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-static {v3, v8, v4}, Ll/᩶᩷᩵;->ۙ(Ll/ܺ֨ۗ;Ll/᩺ᩳۗ;I)I

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 139
    :cond_e
    new-instance v1, Ll/֫ᩳۗ;

    invoke-direct {v1, p1}, Ll/֫ᩳۗ;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 189
    :goto_7
    array-length p1, v0

    :goto_8
    if-ge v2, p1, :cond_10

    aget-object v1, v0, v2

    if-eqz v1, :cond_f

    .line 191
    invoke-virtual {v1}, Ll/ۚᩳۗ;->۠()I

    move-result v1

    if-eqz v1, :cond_f

    add-int/lit8 v1, v1, -0x1

    .line 193
    invoke-virtual {p0, v1}, Ll/ۚᩳۗ;->᩷(I)V

    goto :goto_9

    :cond_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_10
    :goto_9
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Z
    .locals 2

    .line 173
    invoke-virtual {p2}, Ll/֫֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ll/֫֨ۗ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 175
    invoke-virtual {p1}, Ll/֫֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Generic types in debug info not equals: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " != "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x1

    return p0

    .line 180
    :cond_1
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩺()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 2

    .line 38
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺۙ()Ll/ᩳ᩶ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    invoke-static {p1, v0}, Ll/᩶᩷᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳ᩶ۗ;)V
    :try_end_0
    .catch Ll/ۢۧ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to parse debug info"

    .line 45
    invoke-virtual {p1, v1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method
