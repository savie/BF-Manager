.class public final Ll/֡۬ۗ;
.super Ll/ܺ۠ۗ;
.source "P6HV"


# direct methods
.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 12

    .line 34
    new-instance v0, Ll/ۢ֫᩵;

    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1, p0}, Ll/ۢ֫᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    .line 35
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 36
    invoke-virtual {v0, v2}, Ll/ۢ֫᩵;->᩷(Ll/᩷ۡۗ;)V

    .line 37
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 38
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-eq v4, v5, :cond_0

    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {v3}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v4

    const/4 v5, 0x0

    .line 51
    invoke-virtual {v3, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 52
    invoke-virtual {v4, v5}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_5

    .line 55
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v5, Ll/ۛ֨ۗ;

    if-eqz v6, :cond_2

    .line 56
    move-object v7, v5

    check-cast v7, Ll/ۛ֨ۗ;

    .line 57
    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩺()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    goto/16 :goto_5

    .line 68
    :cond_3
    invoke-virtual {v4}, Ll/ܿ֨ۗ;->᩶()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_1

    .line 73
    :cond_4
    sget-object v7, Ll/ۧ۟ۗ;->ۜ:Ll/ۧ۟ۗ;

    invoke-virtual {v5, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v8

    check-cast v8, Ll/᩺ᩳۗ;

    .line 74
    invoke-virtual {v4}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۛ֨ۗ;

    .line 75
    invoke-virtual {v10}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v11

    if-nez v11, :cond_6

    goto :goto_1

    :cond_6
    if-nez v8, :cond_5

    .line 80
    invoke-virtual {v10, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    check-cast v10, Ll/᩺ᩳۗ;

    if-eqz v10, :cond_5

    move-object v8, v10

    goto :goto_2

    .line 88
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛ֨ۗ;

    .line 89
    invoke-virtual {v7}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v9

    if-nez v9, :cond_9

    goto :goto_3

    :cond_9
    if-eqz v6, :cond_a

    .line 95
    move-object v10, v5

    check-cast v10, Ll/ۛ֨ۗ;

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/ۛ֨ۗ;->᩷(Ll/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v10

    goto :goto_4

    .line 97
    :cond_a
    invoke-virtual {v5}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v10

    .line 99
    :goto_4
    invoke-virtual {v9, v3}, Ll/ᩳۡۗ;->ۤ(Ll/ᩳۡۗ;)V

    .line 100
    invoke-virtual {v10, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    if-eqz v8, :cond_b

    .line 102
    invoke-virtual {v10, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 104
    :cond_b
    invoke-virtual {v9, v7, v10}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 105
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "Failed to replace arg in insn: "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_3

    .line 42
    :cond_c
    :goto_5
    invoke-virtual {v0, v3}, Ll/ۢ֫᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto/16 :goto_1

    .line 45
    :cond_d
    invoke-virtual {v0}, Ll/ۢ֫᩵;->ۙ()V

    goto/16 :goto_0

    :cond_e
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 27
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 30
    :cond_0
    invoke-static {p1}, Ll/֡۬ۗ;->᩷(Ll/ۖۡۗ;)V

    return-void
.end method
