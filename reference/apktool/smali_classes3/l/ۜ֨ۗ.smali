.class public final Ll/ۜ֨ۗ;
.super Ll/ܳۢۗ;
.source "KIY7"


# instance fields
.field public final ۖ:Ll/۠֨ۗ;

.field public final ۡ:Ll/᩷ۢۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/᩶ۢۗ;Ll/᩷ۢۗ;)V
    .locals 8

    .line 38
    sget-object v0, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 11
    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 39
    iput-object p3, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    .line 40
    invoke-virtual {p3}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v3, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto/16 :goto_2

    .line 66
    :cond_0
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 67
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 68
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 70
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_7

    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺ֨ۗ;

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v6, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    .line 0
    :cond_2
    instance-of v6, v5, Ll/ۛ֨ۗ;

    if-nez v6, :cond_3

    goto :goto_2

    .line 79
    :cond_3
    check-cast v5, Ll/ۛ֨ۗ;

    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_0

    .line 86
    :cond_5
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v5

    if-eqz v5, :cond_8

    .line 87
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-eq v6, v7, :cond_6

    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-eq v6, v7, :cond_6

    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺ֨ۗ;

    .line 91
    invoke-virtual {v3, v6}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    move v0, v1

    :cond_8
    :goto_2
    if-nez v0, :cond_9

    .line 49
    sget-object p1, Ll/۠֨ۗ;->᩶:Ll/۠֨ۗ;

    goto :goto_3

    .line 51
    :cond_9
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_a

    .line 52
    sget-object p1, Ll/۠֨ۗ;->֡:Ll/۠֨ۗ;

    goto :goto_3

    .line 54
    :cond_a
    iget-object p3, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {p3}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 56
    sget-object p1, Ll/۠֨ۗ;->ܿ:Ll/۠֨ۗ;

    goto :goto_3

    .line 58
    :cond_b
    sget-object p1, Ll/۠֨ۗ;->۟:Ll/۠֨ۗ;

    .line 40
    :goto_3
    iput-object p1, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    .line 41
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result p1

    :goto_4
    if-ge v2, p1, :cond_c

    .line 43
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    invoke-virtual {p0, p3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    return-void
.end method

.method public constructor <init>(Ll/᩷ۢۗ;Ll/۠֨ۗ;)V
    .locals 2

    .line 98
    sget-object v0, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    invoke-virtual {p1}, Ll/᩷ۢۗ;->᩸()I

    move-result v1

    .line 11
    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 99
    iput-object p1, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    .line 100
    iput-object p2, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡ۙ()Z
    .locals 2

    .line 135
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    sget-object v1, Ll/۠֨ۗ;->ܿ:Ll/۠֨ۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۛۙ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۟ۙ()Z
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    sget-object v1, Ll/۠֨ۗ;->֡:Ll/۠֨ۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢۙ()Z
    .locals 2

    .line 131
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    sget-object v1, Ll/۠֨ۗ;->۟:Ll/۠֨ۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 3

    .line 163
    new-instance v0, Ll/ۜ֨ۗ;

    iget-object v1, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    iget-object v2, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    invoke-direct {v0, v1, v2}, Ll/ۜ֨ۗ;-><init>(Ll/᩷ۢۗ;Ll/۠֨ۗ;)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ܰۙ()Ll/۠֨ۗ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    return-object v0
.end method

.method public final ܿۙ()Z
    .locals 2

    .line 123
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    sget-object v1, Ll/۠֨ۗ;->᩶:Ll/۠֨ۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 153
    :cond_0
    instance-of v1, p1, Ll/ۜ֨ۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    check-cast p1, Ll/ۜ֨ۗ;

    .line 157
    iget-object v1, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    iget-object v3, p1, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v1, v3}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    iget-object p1, p1, Ll/ۜ֨ۗ;->ۖ:Ll/۠֨ۗ;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v2
.end method

.method public final ᩵ۙ()Ll/᩷ۢۗ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    return-object v0
.end method

.method public final ᩶ۙ()Ll/֨ᩳۗ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۜ֨ۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v0}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ᩺ۙ()Ll/ܺ֨ۗ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
