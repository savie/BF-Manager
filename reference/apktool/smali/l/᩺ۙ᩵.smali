.class public final Ll/᩺ۙ᩵;
.super Ll/ܺ۠ۗ;
.source "V6HP"


# instance fields
.field public ܰ:Ll/֫ۖۗ;


# direct methods
.method private ۙ(Ll/ۖۡۗ;Ll/ۧۖۗ;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 228
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v1

    .line 230
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    .line 231
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eq v2, v3, :cond_2

    .line 232
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v5

    .line 236
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۢۗ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 239
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֫֨ۗ;

    invoke-virtual {v0, v4, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 240
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne p3, v1, :cond_1

    return-object v0

    .line 244
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Incorrect args count in method signature: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return-object v5

    :cond_2
    :goto_0
    if-ge v4, v2, :cond_4

    .line 248
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    .line 249
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    .line 250
    invoke-direct {p0, v0, v3}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 251
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Incorrect types in method signature: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-object v5

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object p3
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ljava/util/List;)Ljava/util/List;
    .locals 10

    .line 74
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v0

    .line 75
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 78
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 79
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 80
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_4

    if-ge v5, v4, :cond_3

    .line 84
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫֨ۗ;

    if-nez v6, :cond_1

    goto :goto_1

    .line 147
    :cond_1
    invoke-virtual {v6}, Ll/֫֨ۗ;->ۘ()Z

    move-result v8

    if-nez v8, :cond_2

    .line 148
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Incorrect class signature, class is not an object: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :goto_1
    move-object v6, v7

    .line 84
    :cond_2
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 86
    :cond_3
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    if-ge v2, v1, :cond_5

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected interfaces in signature: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_5
    return-object v3
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ljava/util/List;Ll/֫֨ۗ;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 100
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {p2, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 103
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 104
    new-instance v1, Ll/ۛ᩹ۧ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Ll/ۛ᩹ۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Ll/֫֨ۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    .line 105
    new-instance p2, Ll/᩵ۙ᩵;

    invoke-direct {p2, v0}, Ll/᩵ۙ᩵;-><init>(Ljava/util/HashSet;)V

    invoke-static {p3, p2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 106
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_2

    .line 110
    :cond_1
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۜۙ()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 111
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 112
    new-instance p3, Ll/ۨۙ᩵;

    const/4 v1, 0x0

    invoke-direct {p3, v1, p2}, Ll/ۨۙ᩵;-><init>(ILjava/util/List;)V

    invoke-virtual {p0, p3}, Ll/᩻ۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_2
    move-object p2, p1

    .line 116
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֫֨ۗ;

    .line 117
    invoke-virtual {p3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    :goto_2
    return-object p1

    .line 122
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Add missing generic type declarations: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    .line 123
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p3

    add-int/2addr p3, p2

    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 125
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object p1

    new-instance p2, Ll/۟᩹ۧ;

    const/4 p3, 0x7

    invoke-direct {p2, p3}, Ll/۟᩹ۧ;-><init>(I)V

    invoke-interface {p1, p2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance p2, Ll/ۛۙ᩵;

    invoke-direct {p2, p0}, Ll/ۛۙ᩵;-><init>(Ljava/util/ArrayList;)V

    invoke-interface {p1, p2}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    return-object p0
.end method

.method private ۙ(Ll/֫֨ۗ;)Z
    .locals 3

    .line 293
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۧ()Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 298
    :cond_0
    invoke-virtual {p1}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object p1

    .line 299
    iget-object v1, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v1, p1}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 305
    :cond_1
    invoke-virtual {v0}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 306
    invoke-virtual {v0}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 309
    :cond_2
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "."

    .line 311
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 313
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۡۗ;

    .line 314
    invoke-virtual {v0}, Ll/᩻ۡۗ;->֡ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    .line 321
    :cond_4
    iget-object v2, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    invoke-static {v1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v1

    .line 427
    invoke-virtual {v2, v1}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    const/4 p1, 0x0

    return p1

    .line 325
    :cond_6
    invoke-virtual {v1}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 327
    invoke-virtual {p1, v1}, Ll/᩻ۡۗ;->ۤ(Ll/᩻ۡۗ;)V

    .line 328
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/֨ᩳۗ;->ۙ(Ll/᩻ۡۗ;)V

    .line 330
    :cond_7
    invoke-direct {p0, v0}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;)Z

    move-result p1

    return p1
.end method

.method private ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Z
    .locals 4

    .line 259
    iget-object v0, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object p2

    .line 260
    sget-object v0, Ll/ۜܳ᩵;->ۢ:Ll/ۜܳ᩵;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_2

    .line 261
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 262
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    .line 270
    invoke-static {p1}, Ll/۬֫᩵;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x2e

    .line 273
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, "\\."

    .line 274
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 275
    invoke-static {v3}, Ll/۬֫᩵;->ۤ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 266
    :cond_2
    sget-object p1, Ll/ۜܳ᩵;->᩶:Ll/ۜܳ᩵;

    if-eq p2, p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ۧۖۗ;Ll/֫֨ۗ;Ljava/util/List;)Z
    .locals 3

    const-string v0, "Incorrect return type in method signature: "

    const/4 v1, 0x0

    .line 211
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v2

    invoke-direct {p0, p3, v2}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 212
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v1

    .line 215
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Ll/᩺ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۧۖۗ;Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    if-nez p4, :cond_1

    return v1

    .line 219
    :cond_1
    invoke-static {p4}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p4

    invoke-virtual {p1, p3, p4}, Ll/ۖۡۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p3

    .line 222
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Type validation failed for signature: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "SignatureProcessor"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 0

    .line 30
    iput-object p1, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 8

    .line 46
    invoke-static {p1}, Ll/ۧۖۗ;->ۙ(Ll/ۨᩳۗ;)Ll/ۧۖۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 51
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/ۧۖۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    .line 52
    invoke-virtual {v0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    .line 62
    invoke-virtual {p1}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v3

    .line 63
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v2, "Incorrect class signature: super class is equals to this class"

    .line 64
    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_0

    .line 147
    :cond_1
    invoke-virtual {v2}, Ll/֫֨ۗ;->ۘ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 148
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Incorrect class signature, class is not an object: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    move-object v2, v3

    :cond_2
    move-object v3, v2

    :goto_0
    const/4 v2, 0x0

    .line 175
    :goto_1
    invoke-virtual {v0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v4

    if-nez v4, :cond_4

    if-nez v2, :cond_3

    .line 185
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 53
    :cond_3
    invoke-static {p1, v2}, Ll/᩺ۙ᩵;->ۙ(Ll/᩻ۡۗ;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 54
    invoke-static {p1, v1, v3, v2}, Ll/᩺ۙ᩵;->ۙ(Ll/᩻ۡۗ;Ljava/util/List;Ll/֫֨ۗ;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 55
    invoke-virtual {p1, v1, v3, v2}, Ll/᩻ۡۗ;->ۙ(Ljava/util/List;Ll/֫֨ۗ;Ljava/util/List;)V

    goto :goto_2

    :cond_4
    if-nez v2, :cond_5

    .line 180
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse class signature: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    :goto_2
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۡۗ;

    const-string v2, "Incorrect field signature: "

    const-string v3, "Incorrect inner types in field signature: "

    .line 155
    invoke-static {v1}, Ll/ۧۖۗ;->ۙ(Ll/ۨᩳۗ;)Ll/ۧۖۗ;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_3

    .line 159
    :cond_6
    invoke-virtual {v1}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object v5

    .line 161
    :try_start_1
    invoke-virtual {v4}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v6

    if-nez v6, :cond_7

    goto :goto_3

    .line 165
    :cond_7
    invoke-direct {p0, v6}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 166
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_3

    .line 169
    :cond_8
    iget-object v3, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v3}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, Ll/ۗۖۗ;->ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V

    .line 170
    invoke-virtual {v1}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v3

    invoke-direct {p0, v6, v3}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 171
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    goto :goto_3

    .line 174
    :cond_9
    invoke-virtual {v1, v6}, Ll/ܽۡۗ;->ۙ(Ll/֫֨ۗ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v2

    .line 176
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Field signature parse error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ܽۡۗ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 39
    :cond_a
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    .line 181
    invoke-static {v0}, Ll/ۧۖۗ;->ۙ(Ll/ۨᩳۗ;)Ll/ۧۖۗ;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_4

    .line 186
    :cond_c
    :try_start_2
    invoke-virtual {v1}, Ll/ۧۖۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 187
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ۢۗ;->᩸()I

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۧۖۗ;->ۙ(I)Ljava/util/List;

    move-result-object v3

    .line 188
    invoke-virtual {v1}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v4

    .line 190
    invoke-direct {p0, v4}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 284
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    .line 285
    invoke-direct {p0, v6}, Ll/᩺ۙ᩵;->ۙ(Ll/֫֨ۗ;)Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_5

    .line 195
    :cond_e
    invoke-virtual {v0, v2}, Ll/ۖۡۗ;->ᩴ(Ljava/util/List;)V

    .line 196
    iget-object v2, p0, Ll/᩺ۙ᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v2}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v2

    .line 197
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v4}, Ll/ۗۖۗ;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    .line 198
    new-instance v5, Ll/֫ܿ᩸;

    invoke-direct {v5, v2, v0}, Ll/֫ܿ᩸;-><init>(Ll/ۗۖۗ;Ll/ۖۡۗ;)V

    invoke-static {v3, v5}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v2

    .line 200
    invoke-direct {p0, v0, v1, v4, v2}, Ll/᩺ۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۧۖۗ;Ll/֫֨ۗ;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 202
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v0, v2}, Ll/ۖۡۗ;->ᩴ(Ljava/util/List;)V

    goto :goto_4

    .line 191
    :cond_f
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incorrect inner types in method signature: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_4

    :catch_2
    move-exception v2

    .line 205
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse method signature: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ۧۖۗ;->ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_4

    :cond_10
    const/4 p1, 0x1

    return p1
.end method
