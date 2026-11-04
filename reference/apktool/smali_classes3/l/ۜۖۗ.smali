.class public final Ll/ۜۖۗ;
.super Ll/֡ۖۗ;
.source "YIVE"


# instance fields
.field public final ֨:Z

.field public final ۖ:Ll/ۧᩳۗ;

.field public ۜ:Ll/᩷ۢܺ;

.field public ۠:Ll/᩷ۡۗ;

.field public final ۡ:Ll/᩷ۡۗ;

.field public ۢ:Ll/ܿۡۗ;


# direct methods
.method public constructor <init>(Ll/ۨۖۗ;Ll/ۧᩳۗ;Ll/᩷ۡۗ;Z)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Ll/֡ۖۗ;-><init>(Ll/ۨۖۗ;)V

    .line 36
    iput-object p2, p0, Ll/ۜۖۗ;->ۖ:Ll/ۧᩳۗ;

    .line 37
    iput-object p3, p0, Ll/ۜۖۗ;->ۡ:Ll/᩷ۡۗ;

    .line 38
    iput-boolean p4, p0, Ll/ۜۖۗ;->֨:Z

    if-eqz p3, :cond_0

    .line 40
    invoke-virtual {p0, p3}, Ll/֡ۖۗ;->ۙ(Ll/᩷ۡۗ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getType()Ll/᩷ۢܺ;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۜۖۗ;->ۜ:Ll/᩷ۢܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LOOP:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜۖۗ;->ۖ:Ll/ۧᩳۗ;

    invoke-virtual {v1}, Ll/ۧᩳۗ;->᩸()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۜۖۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۨۖۗ;)V
    .locals 0

    .line 62
    iput-object p1, p0, Ll/ۜۖۗ;->ۢ:Ll/ܿۡۗ;

    return-void
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 173
    invoke-virtual {p1, p0, p2}, Ll/۬֡ۗ;->ۙ(Ll/ۜۖۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۢܺ;)V
    .locals 0

    .line 150
    iput-object p1, p0, Ll/ۜۖۗ;->ۜ:Ll/᩷ۢܺ;

    return-void
.end method

.method public final ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۙۙ()Z
    .locals 11

    .line 80
    iget-object v0, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 81
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_3

    .line 84
    :cond_0
    invoke-virtual {p0}, Ll/֡ۖۗ;->ۖ()Ll/ۢۖۗ;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    goto :goto_2

    .line 88
    :cond_1
    invoke-virtual {v1}, Ll/ۢۖۗ;->ۤۙ()Ljava/util/ArrayList;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_9

    .line 94
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 95
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    if-nez v7, :cond_3

    goto :goto_2

    .line 98
    :cond_3
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v6

    .line 99
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩹()I

    move-result v7

    if-le v7, v2, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v7, v5, 0x1

    const/4 v8, 0x0

    move v9, v7

    :goto_1
    if-ge v9, v4, :cond_6

    .line 105
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۡۗ;

    invoke-virtual {v10, v6}, Ll/ᩳۡۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/4 v8, 0x1

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_6
    if-nez v8, :cond_7

    .line 110
    invoke-static {v1, v6}, Ll/۠֫᩵;->ۙ(Ljava/util/List;Ll/ۛ֨ۗ;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v8, 0x1

    :cond_7
    if-nez v8, :cond_8

    :goto_2
    return v3

    :cond_8
    move v5, v7

    goto :goto_0

    :cond_9
    :goto_3
    return v2
.end method

.method public final ۚۙ()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Ll/ۜۖۗ;->֨:Z

    return v0
.end method

.method public final ۤۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۜۖۗ;->ۡ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۧۙ()Z
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۜۖۗ;->ۡ:Ll/᩷ۡۗ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫ۙ()I
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۜۖۗ;->ۡ:Ll/᩷ۡۗ;

    invoke-static {v0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 138
    :cond_0
    invoke-virtual {v0}, Ll/ۚᩳۗ;->۠()I

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    return v0

    .line 142
    :cond_1
    invoke-virtual {p0}, Ll/֡ۖۗ;->ۨ()I

    move-result v0

    return v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 2

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/֡ۖۗ;->۫()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    iget-object v1, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    if-eqz v1, :cond_0

    .line 157
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    :cond_0
    invoke-virtual {p0}, Ll/֡ۖۗ;->۫()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 160
    iget-object v1, p0, Ll/ۜۖۗ;->ۢ:Ll/ܿۡۗ;

    if-eqz v1, :cond_1

    .line 161
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public final ᩴۙ()Ll/ۧᩳۗ;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۜۖۗ;->ۖ:Ll/ۧᩳۗ;

    return-object v0
.end method

.method public final ᩷(Ll/᩷ۡۗ;)V
    .locals 0

    .line 73
    iput-object p1, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    return-void
.end method

.method public final ᩷ۙ()Ll/ܿۡۗ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۜۖۗ;->ۢ:Ll/ܿۡۗ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/ۜۖۗ;->ۢ:Ll/ܿۡۗ;

    if-nez v0, :cond_0

    const-string v0, "-"

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/ۛۡۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻ۙ()V
    .locals 3

    .line 124
    iget-object v0, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۜۖۗ;->ۡ:Ll/᩷ۡۗ;

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    .line 126
    iget-object v2, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 127
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 128
    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 129
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 130
    sget-object v1, Ll/֫۟ۗ;->ܿ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 131
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 132
    iput-object v0, p0, Ll/ۜۖۗ;->۠:Ll/᩷ۡۗ;

    :cond_0
    return-void
.end method
