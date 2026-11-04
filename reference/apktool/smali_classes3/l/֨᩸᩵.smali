.class public final Ll/֨᩸᩵;
.super Ll/ܺ۠ۗ;
.source "AIRN"


# direct methods
.method public static synthetic ۙ(Ll/᩷ۡۗ;)Ll/᩵ܺۗ;
    .locals 0

    .line 40
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RegionMakerVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 8

    .line 21
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 24
    :cond_0
    new-instance v0, Ll/ۗᩴ᩵;

    invoke-direct {v0, p1}, Ll/ۗᩴ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 25
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->᩷()Ll/ۨۖۗ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۡۗ;->ۙ(Ll/ۨۖۗ;)V

    .line 26
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v1

    if-nez v1, :cond_1

    .line 27
    new-instance v1, Ll/᩻ᩴ᩵;

    invoke-direct {v1, p1, v0}, Ll/᩻ᩴ᩵;-><init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V

    invoke-virtual {v1}, Ll/᩻ᩴ᩵;->ۙ()V

    .line 39
    :cond_1
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/۫ۖۗ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/۫ۖۗ;-><init>(I)V

    .line 40
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩻֫ۧ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/᩻֫ۧ;-><init>(I)V

    .line 41
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    invoke-static {p1}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    .line 28
    :cond_2
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 42
    :cond_3
    sget-object v0, Ll/ۧ۟ۗ;->ᩴۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 44
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 46
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    new-instance v0, Ll/ۨ᩸ۤ;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ll/ۨ᩸ۤ;-><init>(I)V

    invoke-static {v1, v0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move-object v0, v1

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    .line 35
    :cond_5
    new-instance v1, Ll/ۧ᩷ܳ;

    invoke-direct {v1, v0}, Ll/ۧ᩷ܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, v1}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۧ᩷ܳ;)V

    .line 31
    :cond_6
    :goto_1
    invoke-static {p1}, Ll/ᩳ᩸᩵;->ۙ(Ll/ۖۡۗ;)V

    .line 32
    invoke-static {p1}, Ll/ۛ᩸᩵;->᩷(Ll/ۖۡۗ;)V

    .line 33
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩹()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 34
    sget v0, Ll/᩶ᩴ᩵;->ۤ:I

    .line 142
    invoke-virtual {p1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v1

    .line 144
    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Ll/᩶ۖۗ;

    if-eqz v3, :cond_c

    .line 145
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۖۗ;

    .line 146
    invoke-virtual {v1}, Ll/᩶ۖۗ;->ۖ()Ll/ᩳۡۗ;

    move-result-object v3

    .line 164
    invoke-virtual {v3, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    .line 165
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v4, Ll/ܽ֨ۗ;

    if-eqz v5, :cond_8

    .line 166
    invoke-virtual {v4}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v6

    if-eqz v6, :cond_8

    if-eqz v5, :cond_7

    .line 271
    move-object v5, v4

    check-cast v5, Ll/ܽ֨ۗ;

    invoke-virtual {v5}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    .line 168
    :goto_2
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->۬:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_8

    .line 169
    check-cast v5, Ll/۫ۢۗ;

    invoke-virtual {v5}, Ll/۫ۢۗ;->᩵ۙ()Ll/֫֨ۗ;

    move-result-object v5

    .line 170
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩻ۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_3

    .line 175
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "In static synchronized method top region not synchronized by class const: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-void

    .line 177
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v5, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 149
    :goto_3
    invoke-virtual {v0}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Ll/᩶ۖۗ;->ۜ()Ll/ۨۖۗ;

    move-result-object v4

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 151
    invoke-static {p1, v3}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 153
    invoke-virtual {v1}, Ll/᩶ۖۗ;->۠()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 154
    invoke-static {p1, v1}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_4

    .line 157
    :cond_a
    invoke-static {p1}, Ll/ۛ᩸᩵;->᩷(Ll/ۖۡۗ;)V

    return-void

    .line 180
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "In synchronized method top region not synchronized by \'this\': "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_c
    :goto_5
    return-void
.end method
