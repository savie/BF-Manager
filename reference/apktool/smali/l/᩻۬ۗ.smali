.class public final Ll/᩻۬ۗ;
.super Ll/ܺ۠ۗ;
.source "66DS"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܽᩳۗ;
    .locals 1

    .line 132
    invoke-static {p1}, Ll/᩻۬ۗ;->ۙ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 144
    new-instance p0, Ll/֫۬ۗ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p0}, Ll/ᩳۡۗ;->ۙ(Ll/֫۬ۗ;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    goto :goto_0

    .line 459
    :cond_2
    invoke-virtual {p1}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object p1

    .line 144
    :goto_0
    new-instance p2, Ll/֫۬ۗ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p2}, Ll/ᩳۡۗ;->ۙ(Ll/֫۬ۗ;)V

    .line 140
    invoke-static {p0, p1}, Ll/ܽᩳۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ܽᩳۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۡۗ;)Z
    .locals 3

    .line 160
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    .line 161
    sget-object v1, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    sget-object v1, Ll/᩺ۢۗ;->֡ۙ:Ll/᩺ۢۗ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 165
    invoke-virtual {p0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-nez v0, :cond_1

    goto :goto_1

    .line 169
    :cond_1
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    invoke-static {p0}, Ll/᩻۬ۗ;->ۙ(Ll/ᩳۡۗ;)Z

    move-result p0

    return p0

    .line 171
    :cond_2
    instance-of v0, p0, Ll/ۗۢۗ;

    if-eqz v0, :cond_3

    .line 172
    check-cast p0, Ll/ۗۢۗ;

    invoke-virtual {p0}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p0

    .line 173
    instance-of p0, p0, Ll/۬ᩳۗ;

    if-eqz p0, :cond_3

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v2
.end method

.method public static ۤ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;
    .locals 2

    .line 46
    :try_start_0
    sget-object v0, Ll/ۧ۟ۗ;->۟:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܽᩳۗ;

    if-eqz v0, :cond_0

    return-object v0

    .line 50
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->۟ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 54
    :cond_1
    invoke-static {p0}, Ll/᩻۬ۗ;->᩷(Ll/ۖۡۗ;)Ll/ܽᩳۗ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Method inline analysis failed"

    .line 60
    invoke-virtual {p0, v1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    :cond_2
    invoke-static {p0}, Ll/ܽᩳۗ;->ۙ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/ۖۡۗ;)Ll/ܽᩳۗ;
    .locals 8

    .line 67
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    .line 1332
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1333
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 1334
    invoke-virtual {v3}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    .line 1335
    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 1339
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v5, v4

    if-le v5, v2, :cond_1

    .line 1340
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_1

    .line 1342
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_6

    .line 73
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 74
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    if-ne v1, v4, :cond_5

    .line 77
    invoke-virtual {v0, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-nez v1, :cond_4

    goto/16 :goto_3

    .line 81
    :cond_4
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->᩻ۙ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-static {p0, v0, v4}, Ll/᩻۬ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܽᩳۗ;

    move-result-object p0

    return-object p0

    .line 84
    :cond_5
    invoke-static {p0, v0, v3}, Ll/᩻۬ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܽᩳۗ;

    move-result-object p0

    return-object p0

    :cond_6
    if-ne v0, v2, :cond_12

    .line 86
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v5, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v0, v5, :cond_12

    .line 87
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 88
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 89
    invoke-virtual {v1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v5

    if-eqz v5, :cond_11

    .line 99
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v5

    .line 100
    sget-object v6, Ll/ۧ۬ۗ;->ۙ:[I

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    if-eq v6, v4, :cond_10

    if-eq v6, v2, :cond_f

    const/4 v7, 0x3

    if-eq v6, v7, :cond_e

    const/4 v2, 0x4

    if-eq v6, v2, :cond_d

    const/4 v2, 0x5

    if-eq v6, v2, :cond_7

    goto/16 :goto_3

    .line 120
    :cond_7
    invoke-virtual {v1, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_3

    .line 124
    :cond_8
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    if-ne v1, v2, :cond_9

    goto/16 :goto_2

    .line 57
    :cond_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_a

    goto/16 :goto_3

    .line 60
    :cond_a
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 61
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 62
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 65
    check-cast v4, Ll/ۛ֨ۗ;

    check-cast v5, Ll/ܺ֨ۗ;

    .line 125
    invoke-virtual {v5, v4}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_3

    .line 69
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_2

    .line 115
    :cond_d
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v4, :cond_12

    .line 116
    invoke-virtual {v1, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 117
    invoke-virtual {v0, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto/16 :goto_2

    .line 110
    :cond_e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v2, :cond_12

    .line 111
    invoke-virtual {v1, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 112
    invoke-virtual {v0, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 113
    invoke-virtual {v0, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_2

    .line 106
    :cond_f
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 107
    invoke-virtual {v1, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_2

    .line 102
    :cond_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v4, :cond_12

    .line 103
    invoke-virtual {v1, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 104
    invoke-virtual {v0, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 91
    :cond_11
    :goto_2
    invoke-static {p0, v0, v3}, Ll/᩻۬ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܽᩳۗ;

    move-result-object p0

    return-object p0

    :cond_12
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 0

    .line 37
    invoke-static {p1}, Ll/᩻۬ۗ;->ۤ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;

    return-void
.end method
