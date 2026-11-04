.class public final Ll/ۢۖۗ;
.super Ll/ܺ۟ۗ;
.source "4IX8"


# instance fields
.field public final ֡:Ll/᩸ܺۤ;

.field public final ۟:Ll/ᩳۖۗ;

.field public final ܿ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۢۖۗ;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 55
    iget-object v0, p1, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    iput-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 56
    iget-object v0, p1, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    iput-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 57
    iget-object v0, p1, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    .line 58
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    return-void

    .line 60
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object p1, p1, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۖۗ;Ljava/util/List;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 50
    iput-object p2, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܺۤ;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 43
    sget-object v0, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    iput-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 44
    iput-object p1, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 45
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;
    .locals 3

    .line 90
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 123
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    new-instance p0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown mode for invert: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 139
    throw p0

    .line 94
    :cond_1
    :goto_0
    iget-object p0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    .line 133
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۖۗ;

    .line 135
    invoke-static {v2}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 137
    :cond_2
    new-instance p0, Ll/ۢۖۗ;

    sget-object v2, Ll/ᩳۖۗ;->᩶:Ll/ᩳۖۗ;

    if-ne v0, v2, :cond_3

    sget-object v2, Ll/ᩳۖۗ;->۟:Ll/ᩳۖۗ;

    :cond_3
    invoke-direct {p0, v2, v1}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    return-object p0

    .line 129
    :cond_4
    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object p0

    return-object p0

    .line 127
    :cond_5
    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۢۖۗ;->۫ۙ()Ll/ۢۖۗ;

    move-result-object v1

    invoke-static {v1}, Ll/ۢۖۗ;->᩷(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۚۙ()Ll/ۢۖۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ۢۖۗ;->᩷(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;Ll/ۢۖۗ;Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    return-object p0

    .line 125
    :cond_6
    new-instance v0, Ll/ۢۖۗ;

    .line 118
    iget-object p0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 125
    invoke-virtual {p0}, Ll/᩸ܺۤ;->ᩴ()V

    invoke-direct {v0, p0}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۢۖۗ;Ll/ۢۖۗ;Ll/ۢۖۗ;)Ll/ۢۖۗ;
    .locals 4

    .line 77
    new-instance v0, Ll/ۢۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ᩳ:Ll/ᩳۖۗ;

    const/4 v2, 0x3

    new-array v2, v2, [Ll/ۢۖۗ;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object p1, v2, p0

    const/4 p0, 0x2

    aput-object p2, v2, p0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    return-object v0
.end method

.method public static ۙ(Ll/ܽۢۗ;)Ll/ۢۖۗ;
    .locals 2

    .line 73
    new-instance v0, Ll/ۢۖۗ;

    new-instance v1, Ll/᩸ܺۤ;

    invoke-direct {v1, p0}, Ll/᩸ܺۤ;-><init>(Ll/ܽۢۗ;)V

    invoke-direct {v0, v1}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    return-object v0
.end method

.method public static ۙ(Ll/ᩳۖۗ;Ll/ۢۖۗ;Ll/ۢۖۗ;)Ll/ۢۖۗ;
    .locals 3

    .line 90
    iget-object v0, p1, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    if-ne v0, p0, :cond_0

    .line 82
    new-instance p0, Ll/ۢۖۗ;

    invoke-direct {p0, p1}, Ll/ۢۖۗ;-><init>(Ll/ۢۖۗ;)V

    .line 110
    iget-object p1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 86
    :cond_0
    new-instance v0, Ll/ۢۖۗ;

    const/4 v1, 0x2

    new-array v1, v1, [Ll/ۢۖۗ;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    return-object v0
.end method

.method public static ۤ(Ll/ۢۖۗ;)Ll/ۢۖۗ;
    .locals 15

    .line 153
    invoke-virtual {p0}, Ll/ۢۖۗ;->ᩴۙ()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_10

    .line 118
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 207
    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v5, Ll/ܽ֨ۗ;

    if-nez v5, :cond_0

    goto/16 :goto_3

    .line 210
    :cond_0
    invoke-virtual {v0}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v5, Ll/᩹֨ۗ;

    if-nez v5, :cond_1

    goto/16 :goto_3

    .line 213
    :cond_1
    invoke-virtual {v0}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object v5

    check-cast v5, Ll/᩹֨ۗ;

    invoke-virtual {v5}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x1

    cmp-long v11, v5, v7

    if-eqz v11, :cond_2

    cmp-long v7, v5, v9

    if-eqz v7, :cond_2

    goto/16 :goto_3

    .line 218
    :cond_2
    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v7

    check-cast v7, Ll/ܽ֨ۗ;

    invoke-virtual {v7}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    .line 219
    sget-object v8, Ll/۟ۖۗ;->ۙ:[I

    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v8, v8, v12

    if-eq v8, v4, :cond_c

    if-eq v8, v1, :cond_c

    const/4 v12, 0x3

    if-eq v8, v12, :cond_3

    goto/16 :goto_3

    .line 229
    :cond_3
    invoke-virtual {v0}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v8

    sget-object v12, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    if-ne v8, v12, :cond_d

    .line 230
    move-object v8, v7

    check-cast v8, Ll/᩸ۢۗ;

    invoke-virtual {v8}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v8

    .line 231
    sget-object v12, Ll/ᩴۢۗ;->ۢ:Ll/ᩴۢۗ;

    if-eq v8, v12, :cond_4

    sget-object v13, Ll/ᩴۢۗ;->֡:Ll/ᩴۢۗ;

    if-ne v8, v13, :cond_d

    .line 232
    :cond_4
    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v13

    .line 233
    sget-object v14, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-ne v13, v14, :cond_5

    if-eqz v11, :cond_6

    :cond_5
    sget-object v11, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    if-ne v13, v11, :cond_7

    cmp-long v11, v5, v9

    if-nez v11, :cond_7

    :cond_6
    const/4 v5, 0x1

    goto :goto_0

    :cond_7
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_8

    goto :goto_1

    .line 236
    :cond_8
    sget-object v14, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    :goto_1
    if-eqz v5, :cond_9

    if-eq v8, v12, :cond_a

    :cond_9
    if-nez v5, :cond_b

    .line 238
    sget-object v5, Ll/ᩴۢۗ;->֡:Ll/ᩴۢۗ;

    if-ne v8, v5, :cond_b

    :cond_a
    sget-object v5, Ll/ᩳۖۗ;->۟:Ll/ᩳۖۗ;

    goto :goto_2

    :cond_b
    sget-object v5, Ll/ᩳۖۗ;->᩶:Ll/ᩳۖۗ;

    .line 240
    :goto_2
    new-instance v6, Ll/ܽۢۗ;

    invoke-virtual {v7, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-static {}, Ll/᩹֨ۗ;->ܶۙ()Ll/᩹֨ۗ;

    move-result-object v9

    invoke-direct {v6, v14, v8, v9}, Ll/ܽۢۗ;-><init>(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/᩹֨ۗ;)V

    .line 241
    new-instance v8, Ll/ܽۢۗ;

    invoke-virtual {v7, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    invoke-static {}, Ll/᩹֨ۗ;->ܶۙ()Ll/᩹֨ۗ;

    move-result-object v9

    invoke-direct {v8, v14, v7, v9}, Ll/ܽۢۗ;-><init>(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/᩹֨ۗ;)V

    .line 242
    new-instance v7, Ll/ۢۖۗ;

    new-instance v9, Ll/ۢۖۗ;

    new-instance v10, Ll/᩸ܺۤ;

    invoke-direct {v10, v6}, Ll/᩸ܺۤ;-><init>(Ll/ܽۢۗ;)V

    invoke-direct {v9, v10}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    new-instance v6, Ll/ۢۖۗ;

    new-instance v10, Ll/᩸ܺۤ;

    invoke-direct {v10, v8}, Ll/᩸ܺۤ;-><init>(Ll/ܽۢۗ;)V

    invoke-direct {v6, v10}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    new-array v8, v1, [Ll/ۢۖۗ;

    aput-object v9, v8, v3

    aput-object v6, v8, v4

    .line 243
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v7, v5, v6}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    goto :goto_4

    :cond_c
    if-nez v11, :cond_d

    .line 223
    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v5

    .line 224
    invoke-virtual {v5}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v6

    invoke-virtual {v7, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v7, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    invoke-virtual {v5, v6, v8, v7}, Ll/ܽۢۗ;->ۙ(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    :cond_d
    :goto_3
    move-object v7, v2

    :goto_4
    if-eqz v7, :cond_e

    return-object v7

    .line 159
    :cond_e
    invoke-virtual {v0}, Ll/᩸ܺۤ;->᩸()Ll/ܶۢۗ;

    move-result-object v5

    sget-object v6, Ll/ܶۢۗ;->ܿ:Ll/ܶۢۗ;

    if-ne v5, v6, :cond_f

    invoke-virtual {v0}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܺ֨ۗ;->ۤۙ()Z

    move-result v5

    if-eqz v5, :cond_f

    .line 160
    new-instance p0, Ll/ۢۖۗ;

    sget-object v5, Ll/ᩳۖۗ;->֡:Ll/ᩳۖۗ;

    new-instance v6, Ll/ۢۖۗ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->ᩴ()V

    invoke-direct {v6, v0}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    goto :goto_5

    .line 162
    :cond_f
    invoke-virtual {v0}, Ll/᩸ܺۤ;->ܳ()V

    .line 166
    :cond_10
    :goto_5
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 v5, 0x0

    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_13

    .line 167
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۢۖۗ;

    .line 168
    invoke-static {v6}, Ll/ۢۖۗ;->ۤ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v7

    if-eq v7, v6, :cond_12

    if-nez v2, :cond_11

    .line 171
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 173
    :cond_11
    invoke-interface {v2, v5, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_12
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_13
    if-eqz v2, :cond_14

    .line 178
    new-instance v0, Ll/ۢۖۗ;

    .line 90
    iget-object p0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 178
    invoke-direct {v0, p0, v2}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    move-object p0, v0

    .line 90
    :cond_14
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 180
    sget-object v2, Ll/ᩳۖۗ;->֡:Ll/ᩳۖۗ;

    if-ne v0, v2, :cond_15

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v0

    .line 90
    iget-object v0, v0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    if-ne v0, v2, :cond_15

    .line 181
    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    .line 90
    :cond_15
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 183
    sget-object v5, Ll/ᩳۖۗ;->ᩳ:Ll/ᩳۖۗ;

    if-ne v0, v5, :cond_16

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v0

    .line 90
    iget-object v0, v0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    if-ne v0, v2, :cond_16

    .line 184
    invoke-static {p0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    .line 90
    :cond_16
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    iget-object v2, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    .line 188
    sget-object v5, Ll/ᩳۖۗ;->۟:Ll/ᩳۖۗ;

    if-eq v0, v5, :cond_17

    sget-object v5, Ll/ᩳۖۗ;->᩶:Ll/ᩳۖۗ;

    if-ne v0, v5, :cond_1b

    .line 189
    :cond_17
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_1b

    .line 192
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢۖۗ;

    .line 90
    iget-object v5, v4, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 193
    sget-object v6, Ll/ᩳۖۗ;->֡:Ll/ᩳۖۗ;

    if-eq v5, v6, :cond_19

    .line 194
    invoke-virtual {v4}, Ll/ۢۖۗ;->ᩴۙ()Z

    move-result v5

    if-eqz v5, :cond_18

    .line 118
    iget-object v4, v4, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 194
    invoke-virtual {v4}, Ll/᩸ܺۤ;->᩸()Ll/ܶۢۗ;

    move-result-object v4

    sget-object v5, Ll/ܶۢۗ;->֨:Ll/ܶۢۗ;

    if-ne v4, v5, :cond_18

    :cond_19
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 198
    :cond_1a
    div-int/2addr v0, v1

    if-le v3, v0, :cond_1b

    .line 199
    invoke-static {p0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ۢۖۗ;->᩷(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object p0

    :cond_1b
    return-object p0
.end method

.method public static ᩷(Ll/ۢۖۗ;)Ll/ۢۖۗ;
    .locals 2

    .line 90
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    .line 143
    sget-object v1, Ll/ᩳۖۗ;->֡:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    .line 144
    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object p0

    return-object p0

    .line 118
    :cond_0
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    if-eqz v0, :cond_1

    .line 147
    new-instance p0, Ll/ۢۖۗ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->ᩴ()V

    invoke-direct {p0, v0}, Ll/ۢۖۗ;-><init>(Ll/᩸ܺۤ;)V

    return-object p0

    .line 149
    :cond_1
    new-instance v0, Ll/ۢۖۗ;

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ۢۖۗ;-><init>(Ll/ᩳۖۗ;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 344
    :cond_0
    instance-of v1, p1, Ll/ۢۖۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 347
    :cond_1
    check-cast p1, Ll/ۢۖۗ;

    .line 348
    iget-object v1, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    iget-object v3, p1, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    if-eq v1, v3, :cond_2

    return v2

    .line 351
    :cond_2
    iget-object v1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    iget-object v3, p1, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-static {v1, v3}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    iget-object p1, p1, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    .line 352
    invoke-static {v1, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 357
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 358
    iget-object v1, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 359
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 360
    iget-object v1, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 314
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    const/16 v3, 0x29

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const-string v0, "??"

    return-object v0

    .line 323
    :cond_0
    sget-object v1, Ll/ᩳۖۗ;->۟:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_1

    const-string v0, " || "

    goto :goto_0

    :cond_1
    const-string v0, " && "

    .line 324
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    iget-object v2, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 327
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢۖۗ;

    .line 328
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 330
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 333
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 320
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "!("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 318
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۢۖۗ;->۫ۙ()Ll/ۢۖۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۢۖۗ;->ۚۙ()Ll/ۢۖۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 316
    :cond_6
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Ll/ۢۖۗ;
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/util/function/Consumer;)V
    .locals 2

    .line 281
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    .line 282
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    return-void

    .line 284
    :cond_0
    new-instance v0, Ll/᩻֫᩵;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/᩻֫᩵;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z
    .locals 2

    .line 269
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    .line 270
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result p1

    return p1

    .line 272
    :cond_0
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۖۗ;

    .line 273
    invoke-virtual {v1, p1, p2}, Ll/ۢۖۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 306
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    .line 307
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    invoke-virtual {v0}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v0

    return-object v0

    .line 309
    :cond_0
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    invoke-virtual {v0}, Ll/ۢۖۗ;->ۙۙ()Ll/ᩳۡۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۚۙ()Ll/ۢۖۗ;
    .locals 2

    .line 106
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    return-object v0
.end method

.method public final ۜ()Ll/᩸ܺۤ;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    return-object v0
.end method

.method public final ۠()Ljava/util/List;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public final ۤۙ()Ljava/util/ArrayList;
    .locals 3

    .line 257
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 258
    iget-object v1, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v2, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v1, v2, :cond_0

    .line 259
    iget-object v1, p0, Ll/ۢۖۗ;->֡:Ll/᩸ܺۤ;

    invoke-virtual {v1}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    return-object v0

    .line 261
    :cond_0
    iget-object v1, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۖۗ;

    .line 262
    invoke-virtual {v2}, Ll/ۢۖۗ;->ۤۙ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ۫ۙ()Ll/ۢۖۗ;
    .locals 2

    .line 102
    iget-object v0, p0, Ll/ۢۖۗ;->ܿ:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۗ;

    return-object v0
.end method

.method public final ᩴۙ()Z
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    sget-object v1, Ll/ᩳۖۗ;->ܿ:Ll/ᩳۖۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷ۙ()Ll/ᩳۖۗ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ۢۖۗ;->۟:Ll/ᩳۖۗ;

    return-object v0
.end method
