.class public final Ll/ܰ֡ۗ;
.super Ll/֡֡ۗ;
.source "B6EJ"


# direct methods
.method private ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V
    .locals 10

    .line 54
    invoke-virtual {p2, p3}, Ll/ۘ֡ۗ;->ۙ(Ll/ۢۖۗ;)V

    .line 55
    sget-object v0, Ll/᩺֡ۗ;->ۤ:[I

    invoke-virtual {p3}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/16 v2, 0x21

    const/4 v3, 0x1

    if-eq v0, v3, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unknown condition mode: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1

    .line 148
    :cond_1
    :goto_0
    invoke-virtual {p3}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object v0

    sget-object v1, Ll/ᩳۖۗ;->᩶:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_2

    const-string v0, " && "

    goto :goto_1

    :cond_2
    const-string v0, " || "

    .line 149
    :goto_1
    invoke-virtual {p3}, Ll/ۢۖۗ;->۠()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 150
    :cond_3
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 151
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۖۗ;

    invoke-direct {p0, p1, p2, v1}, Ll/ܰ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    .line 152
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 153
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_2

    .line 143
    :cond_4
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 144
    invoke-virtual {p3}, Ll/ۢۖۗ;->۠()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۢۖۗ;

    invoke-direct {p0, p1, p2, p3}, Ll/ܰ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    goto/16 :goto_4

    .line 135
    :cond_5
    invoke-virtual {p3}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Ll/ܰ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    const-string v0, " ? "

    .line 136
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 137
    invoke-virtual {p3}, Ll/ۢۖۗ;->۫ۙ()Ll/ۢۖۗ;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Ll/ܰ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    const-string v0, " : "

    .line 138
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 139
    invoke-virtual {p3}, Ll/ۢۖۗ;->ۚۙ()Ll/ۢۖۗ;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ܰ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    goto/16 :goto_4

    .line 57
    :cond_6
    invoke-virtual {p3}, Ll/ۢۖۗ;->ۜ()Ll/᩸ܺۤ;

    move-result-object p3

    .line 102
    invoke-virtual {p3}, Ll/᩸ܺۤ;->᩸()Ll/ܶۢۗ;

    move-result-object v0

    .line 103
    invoke-virtual {p3}, Ll/᩸ܺۤ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v4

    .line 104
    invoke-virtual {p3}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object p3

    .line 105
    invoke-virtual {v4}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    sget-object v6, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v5, v6}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 106
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, p3, Ll/᩹֨ۗ;

    if-eqz v5, :cond_d

    .line 107
    invoke-virtual {p3}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v5, v6}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 108
    move-object v5, p3

    check-cast v5, Ll/᩹֨ۗ;

    .line 109
    invoke-virtual {v5}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-nez v9, :cond_7

    .line 110
    invoke-virtual {v0}, Ll/ܶۢۗ;->᩸()Ll/ܶۢۗ;

    move-result-object v0

    .line 112
    :cond_7
    sget-object v5, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    const/16 v6, 0x29

    const/16 v7, 0x28

    if-ne v0, v5, :cond_a

    .line 114
    invoke-virtual {p2}, Ll/ۘ֡ۗ;->ۙ()Ljava/util/ArrayDeque;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->size()I

    move-result p3

    if-ne p3, v3, :cond_8

    .line 115
    invoke-virtual {p0, p1, v4, v1}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܺ֨ۗ;Z)V

    goto :goto_4

    .line 91
    :cond_8
    invoke-static {v4}, Ll/ܰ֡ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 93
    invoke-interface {p1, v7}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 95
    :cond_9
    invoke-virtual {p0, p1, v4, v1}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܺ֨ۗ;Z)V

    if-eqz p3, :cond_e

    goto :goto_3

    .line 120
    :cond_a
    sget-object v3, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-ne v0, v3, :cond_c

    .line 122
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 91
    invoke-static {v4}, Ll/ܰ֡ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 93
    invoke-interface {p1, v7}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 95
    :cond_b
    invoke-virtual {p0, p1, v4, v1}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܺ֨ۗ;Z)V

    if-eqz p3, :cond_e

    .line 97
    :goto_3
    invoke-interface {p1, v6}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    goto :goto_4

    .line 126
    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported boolean condition "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/֡֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v2, v1}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    .line 129
    :cond_d
    invoke-static {v4}, Ll/ܰ֡ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result v1

    invoke-virtual {p0, p1, v4, v1}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܺ֨ۗ;Z)V

    const/16 v1, 0x20

    .line 130
    invoke-interface {p1, v1}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    move-result-object v2

    invoke-virtual {v0}, Ll/ܶۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v0

    invoke-interface {v0, v1}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 131
    invoke-static {p3}, Ll/ܰ֡ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result v0

    invoke-virtual {p0, p1, p3, v0}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܺ֨ۗ;Z)V

    .line 76
    :cond_e
    :goto_4
    invoke-virtual {p2}, Ll/ۘ֡ۗ;->᩷()V

    return-void
.end method

.method public static ۙ(Ll/ܺ֨ۗ;)Z
    .locals 4

    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 169
    :cond_0
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    .line 170
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    .line 171
    sget-object v2, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    .line 172
    sget-object v0, Ll/᩺֡ۗ;->ۙ:[I

    check-cast p0, Ll/᩸ۢۗ;

    invoke-virtual {p0}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v3, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    return v3

    :cond_1
    return v1

    .line 184
    :cond_2
    sget-object p0, Ll/᩺֡ۗ;->᩷:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    packed-switch p0, :pswitch_data_0

    return v3

    :pswitch_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ᩷(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V
    .locals 3

    .line 159
    invoke-virtual {p3}, Ll/ۢۖۗ;->ᩴۙ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    sget-object v0, Ll/֫۟ۗ;->۫ۙ:Ll/֫۟ۗ;

    invoke-virtual {p3, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {p3}, Ll/ۢۖۗ;->᩷ۙ()Ll/ᩳۖۗ;

    move-result-object v0

    sget-object v2, Ll/ᩳۖۗ;->֡:Ll/ᩳۖۗ;

    if-eq v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    const/16 v0, 0x28

    .line 82
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 84
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ll/ܰ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    if-eqz v1, :cond_3

    const/16 p2, 0x29

    .line 86
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    :cond_3
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۗۘۗ;Ll/ۢۖۗ;)V
    .locals 1

    .line 46
    new-instance v0, Ll/ۘ֡ۗ;

    invoke-direct {v0}, Ll/ۘ֡ۗ;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Ll/ܰ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    return-void
.end method

.method public final ᩷(Ll/ۗۘۗ;Ll/ۢۖۗ;)V
    .locals 1

    .line 50
    new-instance v0, Ll/ۘ֡ۗ;

    invoke-direct {v0}, Ll/ۘ֡ۗ;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Ll/ܰ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/ۘ֡ۗ;Ll/ۢۖۗ;)V

    return-void
.end method
