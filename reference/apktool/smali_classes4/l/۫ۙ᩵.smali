.class public final Ll/۫ۙ᩵;
.super Ll/ܺ۠ۗ;
.source "M6E4"


# instance fields
.field public ܰ:Z


# direct methods
.method public static ۙ(Ll/۫ۙ᩵;Ljava/util/HashSet;Ljava/util/HashMap;Ll/᩻ۡۗ;Ljava/util/List;)V
    .locals 0

    .line 155
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 156
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 177
    :goto_0
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 178
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Loop in anonymous inline: "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", path: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 179
    new-instance p0, Ll/ܳۙ᩵;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void

    .line 182
    :cond_0
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻ۡۗ;

    if-nez p0, :cond_3

    .line 184
    invoke-virtual {p3}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object p0

    .line 189
    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p2

    const/4 p3, 0x2

    if-gt p2, p3, :cond_1

    goto :goto_2

    .line 193
    :cond_1
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p2

    .line 194
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 195
    new-instance p2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    invoke-virtual {p0, p2}, Ll/᩻ۡۗ;->ۙ(Ljava/util/ArrayList;)V

    .line 198
    :cond_2
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۡۗ;

    .line 199
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object p3, p0

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public static ۙ(Ll/۫ۙ᩵;Ll/᩻ۡۗ;)V
    .locals 2

    .line 66
    :try_start_0
    invoke-static {p1}, Ll/۫ۙ᩵;->ۤ(Ll/᩻ۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 68
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Anonymous visitor error"

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    :goto_1
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ll/᩷۟ۗ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static ۙ(Ll/ۢᩳۗ;Ll/᩻ۡۗ;Ll/ۖۡۗ;)Z
    .locals 1

    .line 317
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object p2

    .line 318
    invoke-virtual {p2, p1}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 321
    :cond_0
    invoke-virtual {p0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    .line 323
    invoke-virtual {p2}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0

    :cond_1
    return v0
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;)Z
    .locals 5

    .line 261
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    if-ne v1, p1, :cond_1

    goto :goto_0

    .line 265
    :cond_1
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 266
    invoke-virtual {v3, p2}, Ll/ۖۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 269
    :cond_3
    invoke-virtual {v1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    invoke-static {v4, p0, v3}, Ll/۫ۙ᩵;->ۙ(Ll/ۢᩳۗ;Ll/᩻ۡۗ;Ll/ۖۡۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static ۤ(Ll/᩻ۡۗ;)V
    .locals 10

    .line 204
    invoke-virtual {p0}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->᩹()Ljava/lang/String;

    move-result-object v0

    const-string v3, "$"

    .line 208
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 211
    :cond_1
    invoke-virtual {p0}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_22

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_22

    .line 212
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    .line 214
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ۢۗ;->᩹()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۡۗ;->۠ۙ()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 76
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    new-instance v3, Ll/ܺۖ᩸;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/ܺۖ᩸;-><init>(I)V

    invoke-static {v0, v3}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    if-nez v0, :cond_3

    goto/16 :goto_b

    .line 228
    :cond_3
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    if-eq v3, v2, :cond_5

    .line 335
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    .line 336
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v3, 0x0

    goto :goto_1

    .line 339
    :cond_4
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖۡۗ;

    invoke-virtual {v5}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    .line 340
    new-instance v6, Ll/ᩴۙ᩵;

    invoke-direct {v6, v5}, Ll/ᩴۙ᩵;-><init>(Ll/᩻ۡۗ;)V

    invoke-static {v3, v6}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)Z

    move-result v3

    :goto_1
    if-nez v3, :cond_5

    goto/16 :goto_5

    .line 234
    :cond_5
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 235
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    .line 236
    invoke-virtual {v5, p0}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 278
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 279
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩹()Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_3

    .line 282
    :cond_6
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_3

    .line 286
    :cond_7
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v5

    new-instance v6, Ll/֨ۛۧ;

    const/4 v7, 0x2

    invoke-direct {v6, v7, p0}, Ll/֨ۛۧ;-><init>(ILjava/lang/Object;)V

    invoke-static {v5, v6}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    if-nez v5, :cond_8

    goto :goto_3

    .line 292
    :cond_8
    invoke-virtual {v5}, Ll/ܽۡۗ;->ۤۙ()Ljava/util/List;

    move-result-object v6

    .line 293
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_f

    .line 294
    invoke-interface {v6, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 295
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_3

    .line 299
    :cond_9
    invoke-static {p0, v0, v3}, Ll/۫ۙ᩵;->ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_3

    .line 302
    :cond_a
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    if-ne v6, v5, :cond_c

    goto :goto_2

    .line 306
    :cond_c
    invoke-virtual {v6}, Ll/ܽۡۗ;->ۤۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۖۡۗ;

    .line 307
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v9

    invoke-static {v9, p0, v8}, Ll/۫ۙ᩵;->ۙ(Ll/ۢᩳۗ;Ll/᩻ۡۗ;Ll/ۖۡۗ;)Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_3

    .line 312
    :cond_e
    sget-object v3, Ll/֫۟ۗ;->ܰۙ:Ll/֫۟ۗ;

    invoke-virtual {v5, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v3, 0x1

    goto :goto_4

    :cond_f
    :goto_3
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_15

    .line 238
    sget-object v3, Ll/᩺۟ۗ;->ܿ:Ll/᩺۟ۗ;

    goto :goto_6

    .line 243
    :cond_10
    invoke-virtual {v5}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-virtual {v5, p0}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    goto :goto_5

    .line 247
    :cond_11
    invoke-static {p0, v0, v3}, Ll/۫ۙ᩵;->ۙ(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_5

    .line 250
    :cond_12
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 251
    invoke-virtual {v5}, Ll/ܽۡۗ;->ۤۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖۡۗ;

    .line 252
    invoke-virtual {v5}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v8

    invoke-static {v8, p0, v7}, Ll/۫ۙ᩵;->ۙ(Ll/ۢᩳۗ;Ll/᩻ۡۗ;Ll/ۖۡۗ;)Z

    move-result v7

    if-eqz v7, :cond_14

    :cond_15
    :goto_5
    move-object v3, v4

    goto :goto_6

    .line 257
    :cond_16
    sget-object v3, Ll/᩺۟ۗ;->᩶:Ll/᩺۟ۗ;

    :goto_6
    if-nez v3, :cond_17

    goto/16 :goto_b

    .line 345
    :cond_17
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v2, :cond_18

    goto :goto_9

    .line 349
    :cond_18
    invoke-virtual {p0}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v6

    if-eqz v6, :cond_1c

    .line 350
    sget-object v7, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {v6, v7}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    goto :goto_8

    :cond_19
    if-nez v5, :cond_1a

    goto :goto_7

    .line 360
    :cond_1a
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 361
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v5

    invoke-virtual {v6}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v8

    .line 127
    invoke-virtual {v5, v7}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v5

    .line 128
    invoke-interface {v5, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    :goto_7
    move-object v4, v6

    goto :goto_9

    .line 364
    :cond_1b
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۛۘۗ;->֡()Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 365
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    const-string v6, "kotlin.jvm.internal.Lambda"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    move-object v4, v2

    goto :goto_9

    :cond_1c
    :goto_8
    if-ne v5, v2, :cond_1d

    .line 352
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/֫֨ۗ;

    goto :goto_9

    .line 354
    :cond_1d
    sget-object v4, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    :cond_1e
    :goto_9
    if-nez v4, :cond_1f

    goto :goto_b

    .line 89
    :cond_1f
    sget-object v2, Ll/᩺۟ۗ;->ܿ:Ll/᩺۟ۗ;

    if-ne v3, v2, :cond_20

    .line 90
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    goto :goto_a

    .line 92
    :cond_20
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    .line 94
    :goto_a
    invoke-virtual {v1, p0}, Ll/᩻ۡۗ;->᩷(Ll/᩻ۡۗ;)V

    .line 95
    new-instance v2, Ll/ۘ۟ۗ;

    invoke-direct {v2, v1, v4, v3}, Ll/ۘ۟ۗ;-><init>(Ll/᩻ۡۗ;Ll/֫֨ۗ;Ll/᩺۟ۗ;)V

    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 96
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 97
    sget-object v2, Ll/֫۟ۗ;->۟:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 102
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v0

    .line 103
    invoke-virtual {p0, v0}, Ll/᩻ۡۗ;->᩸(Ll/᩻ۡۗ;)V

    .line 104
    invoke-virtual {v1}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_21

    .line 163
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_21

    .line 164
    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 107
    :cond_21
    invoke-virtual {p0}, Ll/᩻ۡۗ;->᩷᩷()Z

    move-result v1

    if-eqz v1, :cond_22

    .line 108
    invoke-virtual {v0, p0}, Ll/᩻ۡۗ;->᩸(Ll/᩻ۡۗ;)V

    .line 109
    invoke-virtual {v0, p0}, Ll/᩻ۡۗ;->ۙ(Ll/᩻ۡۗ;)V

    :cond_22
    :goto_b
    return-void
.end method

.method public static ᩷(Ll/᩻ۡۗ;)V
    .locals 2

    .line 66
    :try_start_0
    invoke-static {p0}, Ll/۫ۙ᩵;->ۤ(Ll/᩻ۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 68
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Anonymous visitor error"

    .line 19
    invoke-static {p0, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ProcessAnonymous"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 7

    .line 42
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->֨()Z

    move-result v0

    iput-boolean v0, p0, Ll/۫ۙ᩵;->ܰ:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 46
    :cond_0
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ۤۙ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 133
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 134
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 135
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    .line 136
    sget-object v4, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ۘ۟ۗ;

    if-eqz v4, :cond_1

    .line 138
    invoke-virtual {v4}, Ll/ۘ۟ۗ;->ܳ()Ll/᩻ۡۗ;

    move-result-object v4

    .line 139
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_2

    .line 140
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 141
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    :cond_3
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v1, v3, v5}, Ll/ۧۚۗ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 149
    :cond_4
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    .line 153
    :cond_5
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 154
    new-instance v3, Ll/᩸ۙ᩵;

    invoke-direct {v3, p0, v2, v0}, Ll/᩸ۙ᩵;-><init>(Ll/۫ۙ᩵;Ljava/util/HashSet;Ljava/util/HashMap;)V

    invoke-static {v1, v3}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 160
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۡۗ;

    .line 161
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    .line 162
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_6

    .line 164
    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 165
    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 166
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 167
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 168
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_1

    :cond_7
    :goto_2
    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 2

    .line 52
    iget-boolean v0, p0, Ll/۫ۙ᩵;->ܰ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/֫۟ۗ;->֨:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    :try_start_0
    invoke-static {p1}, Ll/۫ۙ᩵;->ۤ(Ll/᩻ۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const-string v1, "Anonymous visitor error"

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    :goto_1
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ll/᩷۟ۗ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
