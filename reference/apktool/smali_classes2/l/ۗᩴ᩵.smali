.class public final Ll/ۗᩴ᩵;
.super Ljava/lang/Object;
.source "26G3"


# instance fields
.field public final ۙ:Ll/ܺᩴ᩵;

.field public final ۤ:Ll/ۖۡۗ;

.field public final ۫:Ll/ۨᩴ᩵;

.field public final ܳ:I

.field public ᩴ:I

.field public final ᩷:Ll/ܶᩴ᩵;

.field public final ᩸:Ll/ܿۧ᩵;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۖۡۗ;

    .line 41
    new-instance v0, Ll/ۨᩴ᩵;

    invoke-direct {v0}, Ll/ۨᩴ᩵;-><init>()V

    iput-object v0, p0, Ll/ۗᩴ᩵;->۫:Ll/ۨᩴ᩵;

    .line 42
    new-instance v0, Ll/ܺᩴ᩵;

    invoke-direct {v0, p1, p0}, Ll/ܺᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V

    iput-object v0, p0, Ll/ۗᩴ᩵;->ۙ:Ll/ܺᩴ᩵;

    .line 43
    new-instance v1, Ll/ܶᩴ᩵;

    invoke-direct {v1, p1, p0, v0}, Ll/ܶᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;Ll/ܺᩴ᩵;)V

    iput-object v1, p0, Ll/ۗᩴ᩵;->᩷:Ll/ܶᩴ᩵;

    .line 27
    new-instance v0, Ll/ܿۧ᩵;

    invoke-direct {v0, p1}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 44
    iput-object v0, p0, Ll/ۗᩴ᩵;->᩸:Ll/ܿۧ᩵;

    .line 45
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit16 p1, p1, 0x190

    iput p1, p0, Ll/ۗᩴ᩵;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ۨᩴ᩵;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ۗᩴ᩵;->۫:Ll/ۨᩴ᩵;

    return-object v0
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ۗᩴ᩵;->᩸:Ll/ܿۧ᩵;

    invoke-virtual {v0, p1}, Ll/ܿۧ᩵;->᩸(Ll/᩷ۡۗ;)V

    return-void
.end method

.method public final ۤ(Ll/᩷ۡۗ;)Ll/ۨۖۗ;
    .locals 11

    .line 53
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    new-instance v0, Ll/ۨۖۗ;

    iget-object v1, p0, Ll/ۗᩴ᩵;->۫:Ll/ۨᩴ᩵;

    invoke-virtual {v1}, Ll/ۨᩴ᩵;->ۤ()Ll/ܿۡۗ;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ۨۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 55
    invoke-virtual {v1, p1}, Ll/ۨᩴ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 137
    sget-object v1, Ll/ۧ۟ۗ;->۫:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object p1

    .line 138
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_7

    .line 141
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    sget-object v2, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 148
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳ۟ۗ;

    .line 149
    invoke-virtual {v4}, Ll/ᩳ۟ۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v4

    .line 150
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    if-ne v5, v2, :cond_1

    .line 151
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_2
    sget-object v2, Ll/᩺ۢۗ;->᩷ۙ:Ll/᩺ۢۗ;

    .line 148
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ۟ۗ;

    .line 149
    invoke-virtual {v3}, Ll/ᩳ۟ۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    if-ne v4, v2, :cond_3

    .line 151
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    :cond_4
    new-instance p1, Ll/֡ۡۗ;

    invoke-direct {p1, v1}, Ll/֡ۡۗ;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, p1}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    return-object v0

    .line 59
    :cond_5
    iget-object v2, p0, Ll/ۗᩴ᩵;->᩸:Ll/ܿۧ᩵;

    invoke-virtual {v2, p1}, Ll/ܿۧ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    iget-object v3, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۖۡۗ;

    if-eqz v2, :cond_6

    .line 62
    sget-object v2, Ll/֫۟ۗ;->ۚۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Code duplicated, block: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܺ۟ۗ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_6
    move-object v2, p1

    :goto_0
    if-eqz v2, :cond_12

    .line 82
    sget-object v4, Ll/֫۟ۗ;->ۢۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    goto/16 :goto_5

    .line 88
    :cond_7
    sget-object v4, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v4

    .line 89
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_a

    .line 90
    sget-object v9, Ll/֫۟ۗ;->ܿۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 91
    iget-object v9, p0, Ll/ۗᩴ᩵;->᩷:Ll/ܶᩴ᩵;

    if-ne v7, v5, :cond_8

    .line 92
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳۗ;

    invoke-virtual {v9, v0, v4, v1}, Ll/ܶᩴ᩵;->ۙ(Ll/ۨۖۗ;Ll/ۧᩳۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;

    move-result-object v4

    goto :goto_1

    .line 95
    :cond_8
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧᩳۗ;

    .line 96
    invoke-virtual {v7}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v10

    if-ne v10, v2, :cond_9

    .line 97
    invoke-virtual {v9, v0, v7, v1}, Ll/ܶᩴ᩵;->ۙ(Ll/ۨۖۗ;Ll/ۧᩳۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;

    move-result-object v4

    :goto_1
    const/4 v8, 0x1

    goto :goto_2

    :cond_a
    move-object v4, v6

    .line 105
    :goto_2
    invoke-static {v2}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v7

    if-nez v8, :cond_e

    if-eqz v7, :cond_e

    .line 107
    sget-object v9, Ll/᩹ᩴ᩵;->ۙ:[I

    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v9, v9, v10

    if-eq v9, v5, :cond_d

    const/4 v10, 0x2

    if-eq v9, v10, :cond_c

    const/4 v10, 0x3

    if-eq v9, v10, :cond_b

    goto :goto_4

    .line 120
    :cond_b
    new-instance v4, Ll/᩶ᩴ᩵;

    invoke-direct {v4, v3, p0}, Ll/᩶ᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V

    .line 121
    invoke-virtual {v4, v0, v2, v7, v1}, Ll/᩶ᩴ᩵;->ۙ(Ll/ۨۖۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;

    move-result-object v4

    goto :goto_3

    .line 114
    :cond_c
    new-instance v4, Ll/ܰᩴ᩵;

    invoke-direct {v4, v3, p0}, Ll/ܰᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V

    .line 115
    check-cast v7, Ll/֨ۢۗ;

    invoke-virtual {v4, v0, v2, v7, v1}, Ll/ܰᩴ᩵;->ۙ(Ll/ۨۖۗ;Ll/᩷ۡۗ;Ll/֨ۢۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;

    move-result-object v4

    goto :goto_3

    .line 109
    :cond_d
    iget-object v4, p0, Ll/ۗᩴ᩵;->ۙ:Ll/ܺᩴ᩵;

    check-cast v7, Ll/ܽۢۗ;

    invoke-virtual {v4, v0, v2, v7, v1}, Ll/ܺᩴ᩵;->ۙ(Ll/ۨۖۗ;Ll/᩷ۡۗ;Ll/ܽۢۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;

    move-result-object v4

    :goto_3
    const/4 v8, 0x1

    :cond_e
    :goto_4
    if-nez v8, :cond_f

    .line 127
    invoke-virtual {v0, v2}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    .line 128
    invoke-static {v2}, Ll/᩹֫᩵;->᩸(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v4

    :cond_f
    if-eqz v4, :cond_10

    .line 130
    invoke-virtual {v1, v2}, Ll/ۨᩴ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v1, v4}, Ll/ۨᩴ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v2

    if-nez v2, :cond_10

    move-object v2, v4

    goto :goto_6

    :cond_10
    :goto_5
    move-object v2, v6

    .line 70
    :goto_6
    iget v4, p0, Ll/ۗᩴ᩵;->ᩴ:I

    add-int/2addr v4, v5

    iput v4, p0, Ll/ۗᩴ᩵;->ᩴ:I

    .line 71
    iget v5, p0, Ll/ۗᩴ᩵;->ܳ:I

    if-gt v4, v5, :cond_11

    goto/16 :goto_0

    .line 72
    :cond_11
    new-instance v0, Ll/ۖۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Regions count limit reached at block "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    throw v0

    :cond_12
    :goto_7
    return-object v0
.end method

.method public final ᩷()Ll/ۨۖۗ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ۨۖۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۗᩴ᩵;->᩸:Ll/ܿۧ᩵;

    invoke-virtual {v0, p1}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result p1

    return p1
.end method
