.class public final Ll/۠ۜۗ;
.super Ll/ܺ۠ۗ;
.source "2IWY"


# direct methods
.method public static ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ll/ۖۜۗ;
    .locals 4

    const/4 v0, 0x0

    .line 237
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    const/4 v2, 0x1

    .line 238
    invoke-virtual {p1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_6

    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, p1, Ll/ܽ֨ۗ;

    if-nez v2, :cond_0

    goto/16 :goto_0

    .line 242
    :cond_0
    check-cast p1, Ll/ܽ֨ۗ;

    invoke-virtual {p1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    .line 243
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 244
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_6

    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 247
    :cond_1
    check-cast p1, Ll/᩶ۢۗ;

    .line 248
    invoke-virtual {p1}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ordinal()I"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 251
    :cond_2
    invoke-virtual {p1}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 252
    invoke-virtual {v2}, Ll/᩻ۡۗ;->۠ۙ()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 255
    :cond_3
    check-cast v1, Ll/ۗۢۗ;

    invoke-virtual {v1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v1

    .line 256
    instance-of v2, v1, Ll/۬ᩳۗ;

    if-nez v2, :cond_4

    goto :goto_0

    .line 259
    :cond_4
    check-cast v1, Ll/۬ᩳۗ;

    invoke-virtual {p0, v1}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 260
    invoke-virtual {p0}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    .line 263
    :cond_5
    new-instance v1, Ll/ۖۜۗ;

    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-direct {v1, p1, p0}, Ll/ۖۜۗ;-><init>(Ll/ܺ֨ۗ;Ll/ܽۡۗ;)V

    return-object v1

    :cond_6
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/֨ۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;Ljava/util/function/IntFunction;)Z
    .locals 4

    .line 86
    sget-object v0, Ll/ۧ۟ۗ;->۠:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ۘᩳۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return v1

    .line 93
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 94
    invoke-virtual {p0}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object p2

    array-length p2, p2

    :goto_1
    if-ge v1, p2, :cond_2

    .line 96
    invoke-virtual {p0, v1}, Ll/֨ۢۗ;->۫(I)Ljava/lang/Object;

    move-result-object v2

    .line 97
    invoke-interface {p3, v1}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v3

    .line 98
    invoke-virtual {p0, v1, v3}, Ll/֨ۢۗ;->ۙ(ILjava/lang/Object;)V

    .line 99
    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v0}, Ll/ۘᩳۗ;->ۙ()Ll/ܿۡۗ;

    move-result-object p0

    check-cast p0, Ll/ܰۖۗ;

    .line 102
    invoke-virtual {p0}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘۖۗ;

    .line 103
    invoke-virtual {p2}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object p2

    new-instance p3, Ll/֨ۜۗ;

    invoke-direct {p3, p1}, Ll/֨ۜۗ;-><init>(Ljava/util/HashMap;)V

    invoke-static {p2, p3}, Ll/۫ۚۗ;->replaceAll(Ljava/util/List;Ljava/util/function/UnaryOperator;)V

    goto :goto_2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 14

    .line 54
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    .line 58
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 59
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    .line 60
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_2

    sget-object v5, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 61
    check-cast v4, Ll/֨ۢۗ;

    .line 71
    invoke-virtual {v4, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v5, Ll/ܽ֨ۗ;

    if-nez v6, :cond_3

    goto/16 :goto_5

    .line 75
    :cond_3
    move-object v6, v5

    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 76
    sget-object v7, Ll/ۡۜۗ;->ۙ:[I

    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v7, v9, :cond_c

    const/4 v9, 0x2

    if-eq v7, v9, :cond_4

    goto/16 :goto_5

    .line 80
    :cond_4
    check-cast v6, Ll/᩶ۢۗ;

    .line 109
    invoke-virtual {v6}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v7

    .line 110
    invoke-virtual {v7}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v7

    const-string v9, "ordinal()I"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto/16 :goto_5

    .line 113
    :cond_5
    invoke-virtual {v6, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    .line 114
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v7

    invoke-virtual {v6}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v9

    invoke-virtual {v7, v9}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    .line 118
    :cond_6
    sget-object v9, Ll/ۧ۟ۗ;->ۚ:Ll/ۧ۟ۗ;

    invoke-virtual {v7, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v7

    check-cast v7, Ll/֨۟ۗ;

    if-nez v7, :cond_7

    goto/16 :goto_5

    .line 122
    :cond_7
    invoke-virtual {v7}, Ll/֨۟ۗ;->ۙ()Ljava/util/List;

    move-result-object v7

    .line 130
    invoke-virtual {v4}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object v9

    array-length v9, v9

    .line 131
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    if-ge v10, v9, :cond_8

    goto :goto_2

    .line 134
    :cond_8
    new-array v10, v9, [Ll/ܽۡۗ;

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v9, :cond_9

    .line 136
    invoke-virtual {v4, v11}, Ll/֨ۢۗ;->۫(I)Ljava/lang/Object;

    move-result-object v12

    .line 137
    instance-of v13, v12, Ljava/lang/Integer;

    if-eqz v13, :cond_a

    .line 138
    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 140
    :try_start_0
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۢ۟ۗ;

    invoke-virtual {v13}, Ll/ۢ۟ۗ;->ۤ()Ll/ܽۡۗ;

    move-result-object v13

    aput-object v13, v10, v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :catch_0
    nop

    goto :goto_2

    :cond_9
    move-object v8, v10

    :cond_a
    :goto_2
    if-nez v8, :cond_b

    goto/16 :goto_5

    .line 126
    :cond_b
    new-instance v7, Ll/ᩳۜۗ;

    invoke-direct {v7, v8}, Ll/ᩳۜۗ;-><init>([Ll/ܽۡۗ;)V

    invoke-static {v4, v5, v6, v7}, Ll/۠ۜۗ;->ۙ(Ll/֨ۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;Ljava/util/function/IntFunction;)Z

    move-result v9

    goto/16 :goto_6

    .line 152
    :cond_c
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v7

    invoke-static {v7, v6}, Ll/۠ۜۗ;->ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ll/ۖۜۗ;

    move-result-object v6

    if-nez v6, :cond_d

    goto/16 :goto_5

    .line 156
    :cond_d
    invoke-virtual {v6}, Ll/ۖۜۗ;->᩷()Ll/ܽۡۗ;

    move-result-object v7

    .line 157
    invoke-virtual {v6}, Ll/ۖۜۗ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v6

    .line 198
    invoke-virtual {v7}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v10

    .line 199
    sget-object v11, Ll/ۧ۟ۗ;->֫:Ll/ۧ۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    check-cast v10, Ll/ۖ۟ۗ;

    if-nez v10, :cond_e

    goto :goto_3

    .line 203
    :cond_e
    invoke-virtual {v10, v7}, Ll/ۖ۟ۗ;->ۙ(Ll/ܽۡۗ;)Ll/ۡ۟ۗ;

    move-result-object v8

    :goto_3
    if-nez v8, :cond_f

    goto :goto_5

    .line 163
    :cond_f
    invoke-virtual {v4}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object v10

    array-length v10, v10

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_11

    .line 165
    invoke-virtual {v4, v11}, Ll/֨ۢۗ;->۫(I)Ljava/lang/Object;

    move-result-object v12

    .line 166
    invoke-virtual {v8, v12}, Ll/ۡ۟ۗ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_10

    goto :goto_5

    :cond_10
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 171
    :cond_11
    new-instance v10, Ll/ۢۜۗ;

    invoke-direct {v10, v8, v4}, Ll/ۢۜۗ;-><init>(Ll/ۡ۟ۗ;Ll/֨ۢۗ;)V

    invoke-static {v4, v5, v6, v10}, Ll/۠ۜۗ;->ۙ(Ll/֨ۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;Ljava/util/function/IntFunction;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 172
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v7, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 173
    invoke-virtual {v7}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v4

    .line 270
    invoke-virtual {v4}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    .line 271
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v7

    .line 272
    invoke-virtual {v7}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-virtual {v7}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-virtual {v7}, Ll/ۢᩳۗ;->۫()Z

    move-result v7

    if-eqz v7, :cond_12

    sget-object v7, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    .line 273
    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v6

    if-nez v6, :cond_12

    goto :goto_6

    .line 277
    :cond_13
    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_6

    :cond_14
    :goto_5
    const/4 v9, 0x0

    :goto_6
    or-int/2addr v2, v9

    goto/16 :goto_0

    :cond_15
    if-eqz v2, :cond_16

    .line 66
    invoke-static {p1}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    :cond_16
    :goto_7
    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 8

    const-string v0, "<clinit>()V"

    .line 812
    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ᩴ(Ljava/lang/String;)Ll/ۖۡۗ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 181
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 184
    :cond_0
    new-instance v1, Ll/ۖ۟ۗ;

    invoke-direct {v1}, Ll/ۖ۟ۗ;-><init>()V

    .line 185
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 186
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

    .line 187
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ܿ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_2

    .line 188
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    const/4 v5, 0x2

    .line 207
    invoke-virtual {v3, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 208
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v5, Ll/᩹֨ۗ;

    if-nez v6, :cond_3

    goto :goto_0

    .line 211
    :cond_3
    invoke-static {v4, v3}, Ll/۠ۜۗ;->ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ll/ۖۜۗ;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_0

    .line 215
    :cond_4
    invoke-virtual {v3}, Ll/ۖۜۗ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v6

    .line 216
    invoke-virtual {v3}, Ll/ۖۜۗ;->᩷()Ll/ܽۡۗ;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 217
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v7, v6, Ll/ܽ֨ۗ;

    if-nez v7, :cond_5

    goto :goto_0

    .line 220
    :cond_5
    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 221
    instance-of v7, v6, Ll/ۗۢۗ;

    if-nez v7, :cond_6

    goto :goto_0

    .line 224
    :cond_6
    check-cast v6, Ll/ۗۢۗ;

    invoke-virtual {v6}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v6

    .line 225
    instance-of v7, v6, Ll/۬ᩳۗ;

    if-nez v7, :cond_7

    goto :goto_0

    .line 228
    :cond_7
    check-cast v6, Ll/۬ᩳۗ;

    invoke-virtual {v4, v6}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_0

    .line 232
    :cond_8
    check-cast v5, Ll/᩹֨ۗ;

    invoke-virtual {v5}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v5

    long-to-int v6, v5

    .line 233
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v3, v5, v4}, Ll/ۖ۟ۗ;->ۙ(Ll/ܽۡۗ;Ljava/lang/Integer;Ll/ܽۡۗ;)V

    goto :goto_0

    .line 192
    :cond_9
    invoke-virtual {v1}, Ll/ۖ۟ۗ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_a

    .line 193
    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    :cond_a
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
