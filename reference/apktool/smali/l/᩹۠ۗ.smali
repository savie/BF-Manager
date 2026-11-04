.class public final Ll/᩹۠ۗ;
.super Ll/ܺ۠ۗ;
.source "KIUZ"


# direct methods
.method public static ۙ(Ll/ۛ֨ۗ;)Ll/ᩳۡۗ;
    .locals 2

    .line 119
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->᩹()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛ֨ۗ;

    .line 124
    invoke-virtual {p0}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 128
    :cond_1
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_2

    .line 129
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/᩹۠ۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    :cond_2
    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 11

    .line 40
    sget-object v0, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_11

    .line 41
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    .line 42
    sget-object v2, Ll/֫۟ۗ;->۟:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 52
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    .line 78
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v3

    .line 79
    invoke-virtual {v0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v4

    .line 80
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖۡۗ;

    invoke-virtual {v5}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    .line 82
    invoke-virtual {v2}, Ll/᩷ۢۗ;->᩸()I

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    invoke-virtual {v5}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 85
    :goto_0
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 86
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    :goto_1
    if-ge v2, v6, :cond_8

    .line 88
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛ֨ۗ;

    .line 89
    invoke-static {v7}, Ll/᩹۠ۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object v8

    if-nez v8, :cond_2

    .line 91
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_4

    .line 93
    :cond_2
    sget-object v9, Ll/ܶ۠ۗ;->ۙ:[I

    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v9, v9, v10

    if-eq v9, v1, :cond_5

    const/4 v7, 0x2

    if-eq v9, v7, :cond_3

    .line 112
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_4

    .line 104
    :cond_3
    move-object v7, v8

    check-cast v7, Ll/ۜ֨ۗ;

    .line 105
    invoke-virtual {v7}, Ll/ۜ֨ۗ;->۟ۙ()Z

    move-result v7

    if-nez v7, :cond_4

    .line 106
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 95
    :cond_5
    move-object v9, v8

    check-cast v9, Ll/ۗۢۗ;

    invoke-virtual {v9}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۬ᩳۗ;

    invoke-virtual {v3, v9}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v9

    if-eqz v9, :cond_7

    .line 96
    invoke-virtual {v9}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_3

    .line 99
    :cond_6
    invoke-interface {v5, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 97
    :cond_7
    :goto_3
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 54
    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 55
    sget-object v2, Ll/֫۟ۗ;->֨ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto/16 :goto_9

    .line 57
    :cond_9
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۡۗ;

    if-nez v4, :cond_b

    goto :goto_5

    .line 62
    :cond_b
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ֨ۗ;

    .line 63
    new-instance v5, Ll/۬۟ۗ;

    invoke-direct {v5, v3}, Ll/۬۟ۗ;-><init>(Ll/ܺ֨ۗ;)V

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 64
    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v3, Ll/ۛ֨ۗ;

    if-eqz v4, :cond_a

    .line 66
    sget-object v4, Ll/֫۟ۗ;->ܳ᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 67
    check-cast v3, Ll/ۛ֨ۗ;

    .line 18
    invoke-virtual {v0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v4

    const/4 v5, -0x1

    if-eqz v4, :cond_e

    .line 200
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_7

    .line 203
    :cond_c
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v6, :cond_e

    .line 205
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_d

    goto :goto_8

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_e
    :goto_7
    const/4 v7, -0x1

    :goto_8
    if-eq v7, v5, :cond_f

    .line 22
    invoke-static {v0, v7}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    goto :goto_5

    .line 20
    :cond_f
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Arg not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p1

    .line 71
    :cond_10
    :goto_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 72
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_a

    :cond_11
    return v1
.end method
