.class public final Ll/ۙᩴ᩵;
.super Ll/۬᩸᩵;
.source "H6C3"


# virtual methods
.method public final ᩸(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 10

    .line 62
    instance-of v0, p2, Ll/ۗۡۗ;

    if-eqz v0, :cond_a

    instance-of v0, p2, Ll/ܰۖۗ;

    if-nez v0, :cond_a

    .line 69
    invoke-interface {p2}, Ll/ܿۡۗ;->getParent()Ll/ܿۡۗ;

    move-result-object v0

    .line 70
    sget-object v1, Ll/֫۟ۗ;->ܶۙ:Ll/֫۟ۗ;

    invoke-interface {v0, v1}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    .line 75
    :cond_0
    invoke-static {v0}, Ll/᩵ۧ᩵;->ۤ(Ll/ۛۡۗ;)Ll/᩹ۡۗ;

    move-result-object v1

    .line 76
    invoke-static {v1}, Ll/᩹֫᩵;->ۙ(Ll/᩹ۡۗ;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 77
    invoke-virtual {p0, v1}, Ll/۬᩸᩵;->ۙ(Ll/᩹ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 85
    :goto_0
    check-cast p2, Ll/ۗۡۗ;

    invoke-interface {p2}, Ll/ۗۡۗ;->ۧ()Ljava/util/List;

    move-result-object p2

    .line 87
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 88
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛۡۗ;

    if-nez v5, :cond_3

    goto :goto_2

    .line 93
    :cond_3
    invoke-static {v5}, Ll/᩵ۧ᩵;->ᩴ(Ll/ۛۡۗ;)Ll/᩸֫᩵;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_4

    .line 97
    :cond_4
    invoke-virtual {v6}, Ll/᩸֫᩵;->᩷()Ll/ᩳۡۗ;

    move-result-object v7

    .line 98
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v9, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    if-ne v8, v9, :cond_5

    .line 99
    invoke-virtual {v6}, Ll/᩸֫᩵;->ۙ()Ll/᩹ۡۗ;

    move-result-object v3

    .line 100
    invoke-static {v3, v5}, Ll/᩵ۧ᩵;->ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)Ll/ۛۡۗ;

    move-result-object v5

    .line 101
    new-instance v6, Ll/ᩴ֫᩵;

    invoke-direct {v6, v3, v5}, Ll/ᩴ֫᩵;-><init>(Ll/᩹ۡۗ;Ll/ۛۡۗ;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v7}, Ll/ᩳۡۗ;->᩹ۙ()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_2
    const/4 v3, 0x0

    goto :goto_1

    .line 107
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_9

    .line 109
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ֫᩵;

    .line 110
    invoke-virtual {v4}, Ll/ᩴ֫᩵;->ۙ()Ll/᩹ۡۗ;

    move-result-object v5

    invoke-virtual {v4}, Ll/ᩴ֫᩵;->᩷()Ll/ۛۡۗ;

    move-result-object v4

    invoke-virtual {p0, v5, v4}, Ll/۬᩸᩵;->ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)V

    goto :goto_3

    :cond_7
    if-nez v2, :cond_8

    .line 113
    iget-object p2, p0, Ll/۬᩸᩵;->᩶:Ljava/util/HashSet;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-virtual {p0}, Ll/۬᩸᩵;->᩷()V

    .line 118
    :cond_8
    sget-object p2, Ll/֫۟ۗ;->᩷᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, p2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_9
    if-eqz v3, :cond_a

    if-eqz v1, :cond_a

    .line 121
    invoke-virtual {p0, v1, v0}, Ll/۬᩸᩵;->ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)V

    :cond_a
    :goto_4
    return-void
.end method
