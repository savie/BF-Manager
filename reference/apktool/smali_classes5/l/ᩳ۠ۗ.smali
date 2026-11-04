.class public final Ll/ᩳ۠ۗ;
.super Ll/ܺ۠ۗ;
.source "EIX3"


# direct methods
.method public static ۙ(Ll/ܺ֨ۗ;)Z
    .locals 3

    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p0, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 311
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    .line 312
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v2, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    if-ne v0, v2, :cond_1

    .line 313
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ᩳ۠ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 12

    .line 153
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_20

    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    .line 156
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_7

    .line 160
    :cond_1
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    .line 245
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۘۗ;->۠()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_14

    .line 246
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 247
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v3, :cond_14

    .line 248
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 249
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_2

    .line 250
    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    .line 251
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v4, Ll/ܽ֨ۗ;

    if-eqz v5, :cond_2

    .line 252
    check-cast v4, Ll/ܽ֨ۗ;

    invoke-virtual {v4}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 262
    :cond_2
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    .line 263
    sget-object v5, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-eq v4, v5, :cond_3

    goto/16 :goto_2

    .line 266
    :cond_3
    move-object v4, v1

    check-cast v4, Ll/᩶ۢۗ;

    .line 267
    invoke-virtual {v4}, Ll/᩶ۢۗ;->ܰۙ()Ll/֡ۢۗ;

    move-result-object v5

    sget-object v6, Ll/֡ۢۗ;->֨:Ll/֡ۢۗ;

    if-ne v5, v6, :cond_4

    goto/16 :goto_2

    .line 270
    :cond_4
    invoke-virtual {v4}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v5

    .line 271
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v6

    invoke-virtual {v6, v5}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object v6

    if-nez v6, :cond_5

    goto/16 :goto_2

    .line 275
    :cond_5
    invoke-virtual {v6}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v7

    .line 276
    invoke-virtual {v7}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v7

    if-eqz v7, :cond_6

    goto/16 :goto_2

    .line 279
    :cond_6
    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩸()I

    move-result v5

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩷ۢۗ;->᩸()I

    move-result v7

    if-eq v5, v7, :cond_7

    goto/16 :goto_2

    .line 283
    :cond_7
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-virtual {v6}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v7

    invoke-virtual {v5, v7}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_2

    .line 287
    :cond_8
    invoke-virtual {v1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺ֨ۗ;

    .line 288
    invoke-static {v5}, Ll/ᩳ۠ۗ;->ۙ(Ll/ܺ֨ۗ;)Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_2

    .line 293
    :cond_a
    invoke-virtual {p0}, Ll/ۖۡۗ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ll/ۖۡۗ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_2

    .line 363
    :cond_b
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v1

    .line 365
    invoke-virtual {v1}, Ll/ۢᩳۗ;->᩸()Z

    move-result v5

    sget-object v7, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    if-eqz v5, :cond_10

    .line 366
    invoke-virtual {v1}, Ll/ۢᩳۗ;->᩹()Z

    move-result v5

    if-nez v5, :cond_14

    .line 367
    invoke-virtual {v6}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v5

    invoke-virtual {v5, v1}, Ll/ۢᩳۗ;->ۙ(Ll/ۢᩳۗ;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 386
    invoke-virtual {v4}, Ll/᩶ۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v1

    .line 387
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v5

    if-eqz v1, :cond_14

    .line 388
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v1, v8}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v4}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    add-int/2addr v8, v3

    if-eq v1, v8, :cond_c

    goto/16 :goto_2

    .line 391
    :cond_c
    invoke-virtual {v4}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    .line 392
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge v3, v8, :cond_13

    add-int/lit8 v8, v3, 0x1

    .line 393
    invoke-virtual {v4, v8}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    .line 394
    :goto_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v10, v9, Ll/ܽ֨ۗ;

    if-eqz v10, :cond_e

    .line 395
    check-cast v9, Ll/ܽ֨ۗ;

    invoke-virtual {v9}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v9

    check-cast v9, Ll/ۗۢۗ;

    .line 396
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֫֨ۗ;

    invoke-virtual {v9}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto/16 :goto_2

    .line 399
    :cond_d
    invoke-virtual {v9, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    goto :goto_1

    .line 401
    :cond_e
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֨ۗ;

    invoke-virtual {v9, v3}, Ll/ܺ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_2

    :cond_f
    move v3, v8

    goto :goto_0

    .line 370
    :cond_10
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_14

    .line 371
    invoke-virtual {v1}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v3

    if-nez v3, :cond_14

    .line 372
    invoke-virtual {v1}, Ll/ۢᩳۗ;->ܺ()Z

    move-result v1

    if-nez v1, :cond_14

    .line 373
    invoke-virtual {p0, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    if-eqz v1, :cond_11

    goto :goto_2

    .line 376
    :cond_11
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 377
    invoke-static {v3, v6}, Ll/ܽ۠ۗ;->ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_2

    .line 300
    :cond_13
    new-instance v0, Ll/᩹ᩳۗ;

    invoke-direct {v0, p0}, Ll/᩹ᩳۗ;-><init>(Ll/ۖۡۗ;)V

    invoke-virtual {v6, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 301
    invoke-virtual {v6, p0, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ۚᩳۗ;Ll/ۧ۟ۗ;)V

    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method merged with bridge method: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    .line 165
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-void

    .line 170
    :cond_14
    :goto_2
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v1

    if-eqz v1, :cond_20

    sget-object v1, Ll/֫۟ۗ;->۟ۙ:Ll/֫۟ۗ;

    .line 171
    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-nez v1, :cond_15

    sget-object v1, Ll/֫۟ۗ;->۟:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 172
    :cond_15
    invoke-static {p0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;

    move-result-object v1

    if-eqz v1, :cond_20

    .line 174
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v3

    .line 184
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_16
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛ֨ۗ;

    .line 185
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v7

    .line 186
    invoke-virtual {v7}, Ll/֫֨ۗ;->ۘ()Z

    move-result v8

    if-nez v8, :cond_17

    goto :goto_3

    .line 190
    :cond_17
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v8

    if-nez v8, :cond_18

    .line 193
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v8

    invoke-static {v8, v7}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v7

    .line 194
    invoke-virtual {v7}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v8

    if-eqz v8, :cond_16

    .line 195
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܽۙ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_16

    goto :goto_4

    .line 199
    :cond_18
    sget-object v7, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-nez v7, :cond_19

    invoke-static {v8}, Ll/ᩳ۠ۗ;->᩷(Ll/᩻ۡۗ;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 204
    :cond_19
    :goto_4
    sget-object v5, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v5, 0x1

    goto :goto_3

    :cond_1a
    if-eqz v5, :cond_20

    .line 215
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_20

    .line 216
    check-cast v1, Ll/ۜ֨ۗ;

    .line 217
    invoke-virtual {v1}, Ll/ۜ֨ۗ;->ۢۙ()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_20

    .line 219
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ֨ۗ;

    .line 220
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v4

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    .line 221
    invoke-static {p0, v2}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    .line 224
    :cond_1b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    :goto_5
    if-ge v2, v4, :cond_1d

    .line 226
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֨ۗ;

    .line 227
    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v5

    if-eqz v5, :cond_1c

    .line 228
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->᩹()I

    move-result v5

    if-nez v5, :cond_1c

    .line 229
    invoke-static {p0, v2}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    :cond_1c
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 232
    :cond_1d
    invoke-virtual {v1}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    .line 233
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 235
    new-instance v1, Ll/᩹ᩳۗ;

    invoke-direct {v1, v0}, Ll/᩹ᩳۗ;-><init>(Ll/ۖۡۗ;)V

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 236
    sget-object v1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 238
    sget v1, Ll/ۨۚ᩵;->ܰ:I

    .line 255
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v2

    .line 113
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1e

    move-object v1, v2

    goto :goto_6

    .line 116
    :cond_1e
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1f

    goto :goto_6

    .line 119
    :cond_1f
    new-instance v3, Ljava/util/TreeSet;

    invoke-direct {v3, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 120
    invoke-virtual {v3, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 256
    :goto_6
    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 257
    invoke-virtual {v0, v1}, Ll/ۖۡۗ;->ۤ(Ljava/util/List;)V

    .line 258
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p0, v0}, Ll/ۖۡۗ;->ۤ(Ljava/util/List;)V

    :cond_20
    :goto_7
    return-void
.end method

.method public static ᩷(Ll/᩻ۡۗ;)Z
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 17

    move-object/from16 v0, p1

    .line 54
    sget-object v1, Ll/֫۟ۗ;->ۖۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 57
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    move-object/from16 v4, p0

    .line 58
    invoke-virtual {v4, v3}, Ll/ᩳ۠ۗ;->ۙ(Ll/᩻ۡۗ;)Z

    goto :goto_0

    :cond_1
    move-object/from16 v4, p0

    .line 60
    invoke-static/range {p1 .. p1}, Ll/ᩳ۠ۗ;->᩷(Ll/᩻ۡۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 61
    sget-object v1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return v2

    .line 795
    :cond_2
    sget-object v1, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 82
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v5

    if-eqz v5, :cond_1f

    .line 83
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    .line 84
    invoke-virtual {v6}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v7

    .line 85
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v8

    if-eqz v8, :cond_1d

    invoke-virtual {v7}, Ll/֫֨ۗ;->ۘ()Z

    move-result v8

    if-eqz v8, :cond_1d

    invoke-virtual {v7}, Ll/֫֨ۗ;->᩺()Z

    move-result v8

    if-nez v8, :cond_1d

    .line 86
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v8

    invoke-static {v8, v7}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v7

    .line 87
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v7

    .line 88
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v8

    if-nez v7, :cond_4

    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {v7}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v9

    invoke-static {v8, v9}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_f

    .line 410
    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v8

    check-cast v8, Ll/ۘ۟ۗ;

    if-eqz v8, :cond_d

    .line 411
    invoke-virtual {v8}, Ll/ۘ۟ۗ;->ܳ()Ll/᩻ۡۗ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto/16 :goto_3

    :cond_5
    new-array v8, v9, [Z

    .line 414
    aput-boolean v2, v8, v2

    .line 415
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۖۡۗ;

    .line 416
    invoke-virtual {v10}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_2

    .line 419
    :cond_7
    invoke-virtual {v10}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۖۡۗ;

    .line 420
    invoke-virtual {v12}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v13

    invoke-virtual {v13, v7}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-virtual {v12}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v13

    if-nez v13, :cond_9

    goto :goto_3

    .line 423
    :cond_9
    invoke-virtual {v12}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ۡۗ;

    .line 424
    invoke-virtual {v13}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_b
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩳۡۗ;

    .line 425
    new-instance v15, Ll/۟۠ۗ;

    invoke-direct {v15, v10, v8}, Ll/۟۠ۗ;-><init>(Ll/ۖۡۗ;[Z)V

    invoke-virtual {v14, v15}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    if-eqz v14, :cond_b

    goto :goto_3

    .line 440
    :cond_c
    aget-boolean v8, v8, v2

    goto :goto_4

    :cond_d
    :goto_3
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_e

    goto :goto_5

    :cond_e
    const/4 v8, 0x0

    goto :goto_6

    :cond_f
    :goto_5
    const/4 v8, 0x1

    :goto_6
    if-nez v3, :cond_10

    if-eqz v8, :cond_1d

    .line 96
    :cond_10
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖۡۗ;

    .line 114
    invoke-virtual {v11}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v12

    if-nez v12, :cond_18

    invoke-virtual {v11}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۢᩳۗ;->ᩴ()Z

    move-result v12

    if-nez v12, :cond_11

    goto/16 :goto_a

    .line 117
    :cond_11
    invoke-virtual {v11}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v12

    .line 118
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_18

    sget-object v13, Ll/֫۟ۗ;->۫᩷:Ll/֫۟ۗ;

    invoke-virtual {v11, v13}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v14

    if-eqz v14, :cond_12

    goto/16 :goto_a

    .line 121
    :cond_12
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۛ֨ۗ;

    .line 122
    invoke-virtual {v12}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v14

    invoke-virtual {v7}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v15

    invoke-virtual {v14, v15}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    goto :goto_8

    .line 125
    :cond_13
    invoke-virtual {v11}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v14

    invoke-virtual {v14}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩷ۡۗ;

    .line 126
    invoke-virtual {v14}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v15

    .line 127
    check-cast v15, Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_14

    goto :goto_8

    .line 130
    :cond_14
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 131
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v15

    sget-object v0, Ll/᩺ۢۗ;->᩻ۙ:Ll/᩺ۢۗ;

    if-eq v15, v0, :cond_15

    :goto_8
    const/4 v0, 0x0

    move-object/from16 v16, v1

    goto :goto_c

    .line 134
    :cond_15
    move-object v0, v2

    check-cast v0, Ll/ۗۢۗ;

    .line 135
    invoke-virtual {v0}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۬ᩳۗ;

    move-object/from16 v16, v1

    .line 136
    invoke-virtual {v6}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v1

    invoke-virtual {v15, v1}, Ll/۬ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_b

    .line 331
    :cond_16
    invoke-virtual {v11, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 140
    invoke-static {v11, v14, v2}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    .line 142
    invoke-virtual {v12}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩹()I

    move-result v0

    if-eqz v0, :cond_17

    .line 143
    new-instance v0, Ll/ۗۢۗ;

    sget-object v1, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    const/4 v13, 0x1

    invoke-direct {v0, v1, v15, v13}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 144
    invoke-virtual {v2, v13}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 145
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ֨ۗ;

    const/4 v12, 0x1

    .line 101
    invoke-virtual {v2, v11, v0, v12}, Ll/ܺ֨ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܺ֨ۗ;

    goto :goto_9

    :cond_17
    const/4 v0, 0x1

    goto :goto_c

    :cond_18
    :goto_a
    move-object/from16 v16, v1

    :cond_19
    :goto_b
    const/4 v0, 0x0

    :goto_c
    if-eqz v0, :cond_1a

    add-int/lit8 v10, v10, 0x1

    :cond_1a
    const/4 v2, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    goto/16 :goto_7

    :cond_1b
    move-object/from16 v16, v1

    if-eqz v10, :cond_1e

    if-eqz v8, :cond_1c

    .line 103
    new-instance v0, Ll/۬۟ۗ;

    invoke-virtual {v7}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۬۟ۗ;-><init>(Ll/֨ᩳۗ;)V

    invoke-virtual {v6, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 105
    :cond_1c
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_d

    :cond_1d
    move-object/from16 v16, v1

    :cond_1e
    :goto_d
    const/4 v2, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    goto/16 :goto_1

    .line 65
    :cond_1f
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ܿ۠ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܿ۠ۗ;-><init>(I)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 66
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/֡۠ۗ;

    invoke-direct {v1, v2}, Ll/֡۠ۗ;-><init>(I)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return v2
.end method
