.class public final Ll/ۚᩴ᩵;
.super Ll/ܺ۠ۗ;
.source "26FQ"

# interfaces
.implements Ll/ۘ᩸᩵;


# direct methods
.method public static ۙ(Ll/ܳᩴ᩵;Ll/ᩳۡۗ;)Ljava/lang/Integer;
    .locals 2

    if-eqz p1, :cond_1

    .line 363
    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 366
    :cond_0
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۤ()Ll/ۖۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;

    move-result-object v0

    .line 367
    instance-of v1, v0, Ll/᩹֨ۗ;

    if-eqz v1, :cond_1

    .line 368
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ᩴ()Ll/ۛ֨ۗ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 369
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 370
    check-cast v0, Ll/᩹֨ۗ;

    invoke-virtual {v0}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide p0

    long-to-int p1, p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ܺ֨ۗ;)Ll/᩶ۢۗ;
    .locals 3

    .line 392
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p0, Ll/ۛ֨ۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 393
    check-cast p0, Ll/ۛ֨ۗ;

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    goto :goto_0

    .line 0
    :cond_0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_1

    .line 395
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_2

    .line 397
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v2, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v0, v2, :cond_2

    .line 398
    check-cast p0, Ll/᩶ۢۗ;

    .line 399
    invoke-virtual {p0}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۢۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v2, "java.lang.String.hashCode()I"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    .line 417
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 419
    invoke-static {p0}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ܳᩴ᩵;)Z
    .locals 13

    .line 131
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 132
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v1

    sget-object v2, Ll/۫ᩴ᩵;->᩶:Ll/۫ᩴ᩵;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v1, v2, :cond_8

    .line 133
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ܳ()Ll/ܿۡۗ;

    move-result-object v1

    check-cast v1, Ll/ۡۖۗ;

    .line 134
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->۫()Ll/ܰۖۗ;

    move-result-object v2

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v2

    .line 136
    invoke-virtual {v1}, Ll/֡ۖۗ;->۫()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 137
    invoke-static {v1}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v1

    move-object v6, v3

    .line 139
    :goto_0
    sget-object v7, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    invoke-static {v1, v7}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v1

    check-cast v1, Ll/ܽۢۗ;

    if-eqz v1, :cond_18

    .line 140
    invoke-virtual {v1}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v7

    sget-object v8, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-eq v7, v8, :cond_0

    invoke-virtual {v1}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v7

    sget-object v9, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    if-eq v7, v9, :cond_0

    goto/16 :goto_10

    .line 143
    :cond_0
    invoke-virtual {v1}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v7

    if-ne v7, v8, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_2

    .line 144
    invoke-virtual {v1}, Ll/ܽۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v8

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v8

    :goto_2
    invoke-static {v8}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v8

    if-eqz v7, :cond_3

    .line 145
    invoke-virtual {v1}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ll/ܽۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v7

    :goto_3
    invoke-static {v7}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v7

    if-eqz v8, :cond_18

    if-eqz v7, :cond_18

    .line 146
    invoke-virtual {v1, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v9, Ll/ۛ֨ۗ;

    if-eqz v9, :cond_18

    .line 146
    invoke-virtual {v1, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v9, Ll/᩹֨ۗ;

    if-nez v9, :cond_4

    goto/16 :goto_10

    .line 149
    :cond_4
    invoke-virtual {v1, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    check-cast v9, Ll/ۛ֨ۗ;

    .line 150
    invoke-virtual {v1, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    check-cast v1, Ll/᩹֨ۗ;

    if-nez v6, :cond_5

    move-object v6, v9

    goto :goto_4

    .line 153
    :cond_5
    invoke-virtual {v6, v9}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result v9

    if-nez v9, :cond_6

    goto/16 :goto_10

    .line 156
    :cond_6
    :goto_4
    invoke-virtual {v1}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v9

    long-to-int v1, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    invoke-static {v7}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v1

    invoke-static {p0, v1}, Ll/ۚᩴ᩵;->ۙ(Ll/ܳᩴ᩵;Ll/ᩳۡۗ;)Ljava/lang/Integer;

    move-result-object v1

    .line 160
    invoke-static {v7}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v8

    if-eq v7, v2, :cond_a

    const/4 v9, -0x1

    .line 161
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-ne v8, v2, :cond_7

    goto :goto_6

    :cond_7
    move-object v1, v7

    goto/16 :goto_0

    .line 166
    :cond_8
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ܳ()Ll/ܿۡۗ;

    move-result-object v1

    check-cast v1, Ll/ܰۖۗ;

    .line 167
    invoke-virtual {v1}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    invoke-static {v1, v2}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v1

    check-cast v1, Ll/֨ۢۗ;

    .line 168
    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 169
    :goto_5
    invoke-virtual {v1}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object v6

    array-length v6, v6

    if-ge v2, v6, :cond_a

    .line 170
    invoke-virtual {v1}, Ll/֨ۢۗ;->᩶ۙ()[Ll/᩷ۡۗ;

    move-result-object v6

    aget-object v6, v6, v2

    invoke-static {v6}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v6

    if-nez v6, :cond_9

    goto/16 :goto_10

    .line 174
    :cond_9
    invoke-virtual {v1}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object v7

    aget v7, v7, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 179
    :cond_a
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0, v1}, Ll/ܳᩴ᩵;->ۙ(Ljava/util/ArrayList;)V

    .line 180
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 181
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 182
    sget-object v7, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    invoke-static {v6, v7}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v6

    check-cast v6, Ll/ܽۢۗ;

    .line 183
    invoke-static {v6}, Ll/ۚᩴ᩵;->ۙ(Ll/ܽۢۗ;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_10

    .line 187
    :cond_b
    invoke-virtual {v6, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    invoke-static {v7}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object v7

    .line 188
    invoke-static {v7}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-virtual {v7, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    .line 190
    invoke-virtual {v7, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    .line 191
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۤ()Ll/ۖۡۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v9

    invoke-static {v9, v7}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;

    move-result-object v7

    .line 192
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۚ()Ll/ۛ֨ۗ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/ۛ֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_18

    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eq v8, v9, :cond_c

    goto/16 :goto_10

    .line 195
    :cond_c
    invoke-virtual {v6}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v8

    sget-object v9, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    if-ne v8, v9, :cond_d

    const/4 v8, 0x1

    goto :goto_8

    :cond_d
    const/4 v8, 0x0

    :goto_8
    invoke-virtual {v6, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܺ֨ۗ;->ᩴۙ()Z

    move-result v9

    if-eq v8, v9, :cond_e

    const/4 v8, 0x1

    goto :goto_9

    :cond_e
    const/4 v8, 0x0

    :goto_9
    if-eqz v8, :cond_f

    .line 196
    invoke-virtual {v6}, Ll/ܽۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v9

    goto :goto_a

    :cond_f
    invoke-virtual {v6}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v9

    :goto_a
    if-eqz v8, :cond_10

    .line 197
    invoke-virtual {v6}, Ll/ܽۢۗ;->ܰۙ()Ll/᩷ۡۗ;

    move-result-object v6

    goto :goto_b

    :cond_10
    invoke-virtual {v6}, Ll/ܽۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v6

    .line 199
    :goto_b
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v8

    sget-object v10, Ll/۫ᩴ᩵;->֡:Ll/۫ᩴ᩵;

    if-eq v8, v10, :cond_12

    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v8

    sget-object v10, Ll/۫ᩴ᩵;->᩶:Ll/۫ᩴ᩵;

    if-ne v8, v10, :cond_11

    goto :goto_c

    :cond_11
    move-object v10, v3

    goto :goto_f

    .line 200
    :cond_12
    :goto_c
    invoke-static {v9}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v8

    invoke-static {v8}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v8

    .line 201
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ᩴ()Ll/ۛ֨ۗ;

    move-result-object v10

    invoke-static {v10}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v9, :cond_16

    if-eqz v8, :cond_13

    .line 202
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v11

    sget-object v12, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    if-ne v11, v12, :cond_16

    .line 204
    :cond_13
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object v8

    move-object v10, v3

    :goto_d
    if-eqz v8, :cond_15

    if-nez v10, :cond_15

    .line 206
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۡۗ;

    .line 207
    invoke-static {p0, v10}, Ll/ۚᩴ᩵;->ۙ(Ll/ܳᩴ᩵;Ll/ᩳۡۗ;)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_e

    .line 209
    :cond_14
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object v8

    goto :goto_d

    :cond_15
    if-nez v10, :cond_17

    goto :goto_10

    :cond_16
    if-eqz v8, :cond_18

    .line 214
    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result v10

    if-eqz v10, :cond_18

    .line 215
    invoke-static {p0, v8}, Ll/ۚᩴ᩵;->ۙ(Ll/ܳᩴ᩵;Ll/ᩳۡۗ;)Ljava/lang/Integer;

    move-result-object v10

    .line 221
    :cond_17
    :goto_f
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۙ()Ljava/util/List;

    move-result-object v8

    new-instance v11, Ll/ᩴᩴ᩵;

    invoke-direct {v11, v7, v10, v9}, Ll/ᩴᩴ᩵;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Ll/᩷ۡۗ;)V

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    invoke-static {v6}, Ll/ۚᩴ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v6

    .line 224
    sget-object v7, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    invoke-static {v6, v7}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v6

    check-cast v6, Ll/ܽۢۗ;

    .line 225
    invoke-static {v6}, Ll/ۚᩴ᩵;->ۙ(Ll/ܽۢۗ;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_7

    :cond_18
    :goto_10
    return v5

    :cond_19
    return v4
.end method

.method public static ۙ(Ll/ܽۢۗ;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 407
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 408
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 409
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    check-cast p0, Ll/᩶ۢۗ;

    .line 410
    invoke-virtual {p0}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩷ۢۗ;->᩻()Ljava/lang/String;

    move-result-object p0

    const-string v1, "java.lang.String.equals(Ljava/lang/Object;)Z"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0
.end method

.method public static ۤ(Ll/ܳᩴ᩵;)Z
    .locals 12

    .line 299
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۤ()Ll/ۖۡۗ;

    move-result-object v0

    .line 300
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ܳ()Ll/ܿۡۗ;

    move-result-object v1

    .line 301
    invoke-interface {v1}, Ll/ܿۡۗ;->getParent()Ll/ܿۡۗ;

    move-result-object v2

    .line 302
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->۫()Ll/ܰۖۗ;

    move-result-object v3

    .line 303
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 305
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v5

    sget-object v6, Ll/۫ᩴ᩵;->֡:Ll/۫ᩴ᩵;

    if-eq v5, v6, :cond_1

    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v5

    sget-object v6, Ll/۫ᩴ᩵;->ܿ:Ll/۫ᩴ᩵;

    if-ne v5, v6, :cond_0

    goto :goto_0

    .line 308
    :cond_0
    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v5

    goto :goto_1

    .line 306
    :cond_1
    :goto_0
    move-object v5, v1

    check-cast v5, Ll/ܰۖۗ;

    invoke-virtual {v5}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v5

    .line 311
    :goto_1
    sget-object v6, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    invoke-static {v5, v6}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v6

    .line 312
    invoke-static {v6}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    invoke-virtual {v6}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v7

    const/4 v8, 0x0

    .line 313
    invoke-virtual {v6, v8}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۚ()Ll/ۛ֨ۗ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v10

    invoke-virtual {v7, v9, v10}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    .line 314
    invoke-static {v0, v5, v6, v7}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    .line 315
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    new-instance v6, Ll/ܰۖۗ;

    invoke-direct {v6, v2, v5}, Ll/ܰۖۗ;-><init>(Ll/ܿۡۗ;Ll/᩷ۡۗ;)V

    .line 318
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->᩸()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۘۖۗ;

    .line 319
    invoke-virtual {v7}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v9

    .line 320
    new-instance v10, Ll/ۨۙ᩵;

    const/4 v11, 0x1

    invoke-direct {v10, v11, v4}, Ll/ۨۙ᩵;-><init>(ILjava/util/List;)V

    invoke-static {v0, v9, v10}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ljava/util/function/Consumer;)V

    .line 321
    invoke-virtual {v7}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7, v9}, Ll/ܰۖۗ;->ۙ(Ljava/util/List;Ll/ۛۡۗ;)V

    .line 322
    invoke-static {v9, v6}, Ll/᩵ۖۗ;->ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V

    goto :goto_2

    .line 324
    :cond_2
    invoke-interface {v2, v1, v6}, Ll/ܿۡۗ;->ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z

    move-result v2

    if-nez v2, :cond_3

    return v8

    .line 357
    :cond_3
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 358
    new-instance v5, Ll/ܺۧ᩵;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v2}, Ll/ܺۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1, v5}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ljava/util/function/Consumer;)V

    if-eqz v3, :cond_4

    .line 357
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 358
    new-instance v5, Ll/ܺۧ᩵;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v1}, Ll/ܺۧ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v3, v5}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ljava/util/function/Consumer;)V

    .line 332
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 333
    invoke-virtual {v3}, Ll/᩵ۖۗ;->getParent()Ll/ܿۡۗ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 335
    :cond_4
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 336
    new-instance v1, Ll/ۗ᩷᩵;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Ll/ۗ᩷᩵;-><init>(I)V

    invoke-static {v2, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 338
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ᩴ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 340
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֨ۗ;

    .line 341
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 343
    sget-object v4, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 345
    :cond_5
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֨ۗ;

    .line 346
    invoke-virtual {v4}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 348
    sget-object v5, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_4

    .line 351
    :cond_7
    invoke-virtual {v0, v2}, Ll/ۖۡۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto :goto_3

    .line 354
    :cond_8
    invoke-static {v0}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;)V

    .line 355
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->᩷()Ll/ᩳۡۗ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception p0

    goto :goto_5

    :catch_1
    move-exception p0

    :goto_5
    const-string v1, "Failed to clean up code after switch over string restore"

    .line 357
    invoke-virtual {v0, v1, p0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(Ll/ܳᩴ᩵;)Z
    .locals 10

    .line 235
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->۫()Ll/ܰۖۗ;

    move-result-object v0

    .line 236
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۙ()Ljava/util/List;

    move-result-object v1

    .line 237
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 238
    invoke-virtual {p0, v2}, Ll/ܳᩴ᩵;->᩷(Ljava/util/ArrayList;)V

    .line 239
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v3

    sget-object v4, Ll/۫ᩴ᩵;->֡:Ll/۫ᩴ᩵;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_4

    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v3

    sget-object v4, Ll/۫ᩴ᩵;->᩶:Ll/۫ᩴ᩵;

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    .line 269
    :cond_0
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->֫()Ll/۫ᩴ᩵;

    move-result-object v0

    sget-object v3, Ll/۫ᩴ᩵;->ܿ:Ll/۫ᩴ᩵;

    if-ne v0, v3, :cond_e

    .line 270
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ܳ()Ll/ܿۡۗ;

    move-result-object p0

    check-cast p0, Ll/ܰۖۗ;

    .line 271
    invoke-virtual {p0}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v0

    sget-object v3, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    invoke-static {v0, v3}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    check-cast v0, Ll/֨ۢۗ;

    .line 272
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/֨ۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 274
    new-instance v3, Ll/ᩴᩴ᩵;

    sget-object v4, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    const/4 v6, -0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v3, v4, v6, v0}, Ll/ᩴᩴ᩵;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Ll/᩷ۡۗ;)V

    move-object v0, v1

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    :cond_1
    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴᩴ᩵;

    if-eqz v5, :cond_2

    .line 278
    invoke-virtual {v5}, Ll/ᩴᩴ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v3

    invoke-virtual {v1}, Ll/ᩴᩴ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v4

    if-ne v3, v4, :cond_2

    .line 280
    invoke-static {v2}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘۖۗ;

    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    invoke-virtual {v3}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Ll/ᩴᩴ᩵;->ۤ()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 283
    :cond_2
    invoke-virtual {v1}, Ll/ᩴᩴ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v3

    invoke-static {v3, p0}, Ll/᩵ۧ᩵;->ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)Ll/ۛۡۗ;

    move-result-object v3

    if-nez v3, :cond_3

    goto/16 :goto_7

    .line 287
    :cond_3
    new-instance v4, Ll/ۘۖۗ;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v4, v5, v3}, Ll/ۘۖۗ;-><init>(Ljava/util/List;Ll/ۛۡۗ;)V

    .line 288
    invoke-virtual {v4}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Ll/ᩴᩴ᩵;->ۤ()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    move-object v5, v1

    goto :goto_0

    .line 241
    :cond_4
    :goto_2
    new-instance v3, Ljava/util/HashMap;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 242
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴᩴ᩵;

    .line 243
    invoke-virtual {v4}, Ll/ᩴᩴ᩵;->᩷()Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ll/ܿۘۗ;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Ll/ܿۘۗ;-><init>(I)V

    invoke-static {v3, v6, v7}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v4}, Ll/ᩴᩴ᩵;->ۤ()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 245
    :cond_5
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۖۗ;

    .line 246
    new-instance v4, Ll/ۘۖۗ;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v7

    invoke-direct {v4, v6, v7}, Ll/ۘۖۗ;-><init>(Ljava/util/List;Ll/ۛۡۗ;)V

    .line 247
    invoke-virtual {v1}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 377
    instance-of v7, v6, Ljava/lang/Integer;

    if-eqz v7, :cond_6

    .line 378
    move-object v7, v6

    check-cast v7, Ljava/lang/Integer;

    goto :goto_6

    .line 380
    :cond_6
    instance-of v7, v6, Ll/ܽۡۗ;

    if-eqz v7, :cond_7

    .line 381
    move-object v7, v6

    check-cast v7, Ll/ܽۡۗ;

    sget-object v8, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {v7, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v7

    check-cast v7, Ll/ܳ᩶ۗ;

    if-eqz v7, :cond_7

    .line 382
    invoke-virtual {v7}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v8

    sget-object v9, Ll/᩸᩶ۗ;->۠:Ll/᩸᩶ۗ;

    if-ne v8, v9, :cond_7

    .line 383
    invoke-virtual {v7}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    goto :goto_6

    :cond_7
    move-object v7, v5

    .line 249
    :goto_6
    sget-object v8, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    if-eq v6, v8, :cond_a

    .line 250
    invoke-static {v7}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_9

    .line 251
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_7

    .line 254
    :cond_8
    invoke-virtual {v4}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    :cond_9
    :goto_7
    const/4 p0, 0x0

    return p0

    .line 257
    :cond_a
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 258
    invoke-virtual {v4}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_8

    .line 260
    :cond_b
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 261
    invoke-virtual {v4}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v6

    sget-object v7, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 264
    :cond_c
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 266
    :cond_d
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 267
    invoke-virtual {p0}, Ll/ܳᩴ᩵;->ۤ()Ll/ۖۡۗ;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "switch over string: strings are not added: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_e
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 63
    sget-object v0, Ll/᩶۟ۗ;->ܿ:Ll/᩶۟ۗ;

    invoke-static {p1, v0}, Ll/ܿ۟ۗ;->᩷(Ll/ۖۡۗ;Ll/᩶۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 66
    :cond_0
    invoke-static {p1, p0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;)V

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 8

    .line 71
    instance-of v0, p2, Ll/ܰۖۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    instance-of v0, p2, Ll/ۡۖۗ;

    if-eqz v0, :cond_c

    :cond_0
    const-string v0, "Failed to restore switch over string. Please report as a decompilation issue"

    .line 79
    :try_start_0
    invoke-static {p2}, Ll/᩵ۧ᩵;->ۙ(Ll/ۛۡۗ;)Ll/᩷ۡۗ;

    move-result-object v2

    invoke-static {v2}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v2, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-static {v2}, Ll/ۚᩴ᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/᩶ۢۗ;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_2

    move-object v4, v3

    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_c

    .line 0
    instance-of v5, v4, Ll/ۛ֨ۗ;

    if-nez v5, :cond_3

    goto/16 :goto_6

    .line 86
    :cond_3
    new-instance v5, Ll/ܳᩴ᩵;

    invoke-direct {v5, p1, p2}, Ll/ܳᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ܿۡۗ;)V

    .line 87
    invoke-virtual {v5, v2}, Ll/ܳᩴ᩵;->ۙ(Ll/᩶ۢۗ;)V

    .line 88
    check-cast v4, Ll/ۛ֨ۗ;

    invoke-virtual {v5, v4}, Ll/ܳᩴ᩵;->᩷(Ll/ۛ֨ۗ;)V

    .line 652
    invoke-interface {p2}, Ll/ܿۡۗ;->getParent()Ll/ܿۡۗ;

    move-result-object v2

    .line 653
    invoke-interface {v2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v2

    .line 654
    invoke-interface {v2, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    const/4 v6, -0x1

    const/4 v7, 0x1

    if-eq v4, v6, :cond_5

    add-int/2addr v4, v7

    .line 655
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lt v4, v6, :cond_4

    goto :goto_2

    .line 658
    :cond_4
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/ۛۡۗ;

    .line 91
    :cond_5
    :goto_2
    instance-of p2, p2, Ll/ܰۖۗ;

    .line 92
    instance-of v2, v3, Ll/ܰۖۗ;

    if-eqz v2, :cond_8

    .line 94
    check-cast v3, Ll/ܰۖۗ;

    .line 95
    invoke-virtual {v3}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v2

    sget-object v4, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    invoke-static {v2, v4}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 96
    invoke-virtual {v2, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v4, Ll/ۛ֨ۗ;

    if-nez v4, :cond_6

    goto :goto_6

    :cond_6
    if-eqz p2, :cond_7

    .line 99
    sget-object p2, Ll/۫ᩴ᩵;->֡:Ll/۫ᩴ᩵;

    goto :goto_3

    :cond_7
    sget-object p2, Ll/۫ᩴ᩵;->᩶:Ll/۫ᩴ᩵;

    :goto_3
    invoke-virtual {v5, p2}, Ll/ܳᩴ᩵;->ۙ(Ll/۫ᩴ᩵;)V

    .line 100
    invoke-virtual {v5, v3}, Ll/ܳᩴ᩵;->ۙ(Ll/ܰۖۗ;)V

    .line 101
    invoke-virtual {v2, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    check-cast p2, Ll/ۛ֨ۗ;

    invoke-virtual {v5, p2}, Ll/ܳᩴ᩵;->ۙ(Ll/ۛ֨ۗ;)V

    goto :goto_4

    :cond_8
    if-eqz p2, :cond_c

    .line 103
    sget-object p2, Ll/۫ᩴ᩵;->ܿ:Ll/۫ᩴ᩵;

    invoke-virtual {v5, p2}, Ll/ܳᩴ᩵;->ۙ(Ll/۫ᩴ᩵;)V

    .line 108
    :goto_4
    invoke-static {v5}, Ll/ۚᩴ᩵;->ۙ(Ll/ܳᩴ᩵;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_6

    .line 111
    :cond_9
    invoke-static {v5}, Ll/ۚᩴ᩵;->᩷(Ll/ܳᩴ᩵;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-static {v5}, Ll/ۚᩴ᩵;->ۤ(Ll/ܳᩴ᩵;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_5

    :cond_a
    return v7

    .line 112
    :cond_b
    :goto_5
    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_c
    :goto_6
    return v1

    :catch_0
    move-exception p2

    goto :goto_7

    :catch_1
    move-exception p2

    .line 117
    :goto_7
    invoke-virtual {p1, v0, p2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
