.class public final Ll/ۧۜۗ;
.super Ll/ܺ۠ۗ;
.source "I6DT"


# instance fields
.field public ܰ:Ll/᩷ۢۗ;

.field public ᩶:Ll/᩷ۢۗ;


# direct methods
.method public static ۙ(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ljava/util/List;
    .locals 12

    .line 281
    iget-object v0, p0, Ll/֫ۜۗ;->᩸:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֫ۜۗ;->᩷:Ll/᩻ۡۗ;

    sget-object v2, Ll/ۚۜۗ;->ۙ:[I

    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eq v2, v3, :cond_5

    const/4 v0, 0x2

    if-eq v2, v0, :cond_1

    const/4 p0, 0x3

    if-eq v2, p0, :cond_0

    goto/16 :goto_6

    .line 290
    :cond_0
    invoke-virtual {p1, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    .line 291
    invoke-virtual {p0}, Ll/ܺ֨ۗ;->ۚۙ()Z

    move-result p0

    if-eqz p0, :cond_11

    .line 293
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 287
    :cond_1
    check-cast p1, Ll/᩶ۢۗ;

    .line 303
    invoke-virtual {p1}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p1

    .line 304
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 305
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_6

    .line 308
    :cond_2
    invoke-virtual {p1}, Ll/ۖۡۗ;->֡ۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 309
    invoke-static {v0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    .line 310
    invoke-static {v0}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-static {v0}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    if-nez v0, :cond_3

    goto/16 :goto_6

    .line 314
    :cond_3
    invoke-static {p0, v0}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 315
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    iget-object p0, p0, Ll/֫ۜۗ;->ۙ:Ll/ۖۡۗ;

    invoke-static {v1, p0}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 316
    invoke-virtual {p1}, Ll/ۖۡۗ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "values"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 317
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_4
    return-object v0

    .line 340
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 341
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺ֨ۗ;

    .line 343
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v7, v6, Ll/ܽ֨ۗ;

    const-string v8, "EF"

    if-eqz v7, :cond_8

    .line 344
    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 359
    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v9, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-ne v7, v9, :cond_6

    .line 360
    invoke-static {p0, v6}, Ll/ۧۜۗ;->᩷(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ll/ۢ۟ۗ;

    move-result-object v6

    goto/16 :goto_5

    .line 745
    :cond_6
    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v9, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v7, v9, :cond_7

    .line 746
    check-cast v6, Ll/ۜ֨ۗ;

    goto :goto_1

    :cond_7
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_10

    .line 364
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ll/ᩳۡۗ;->getOffset()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Ll/ۧۜۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/String;)Ll/ܽۡۗ;

    move-result-object v7

    .line 365
    invoke-virtual {v1, v7}, Ll/᩻ۡۗ;->ۙ(Ll/ܽۡۗ;)V

    .line 366
    invoke-static {p0, v7, v6}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ܽۡۗ;Ll/ۜ֨ۗ;)Ll/ۢ۟ۗ;

    move-result-object v6

    goto/16 :goto_5

    .line 0
    :cond_8
    instance-of v7, v6, Ll/ۛ֨ۗ;

    if-eqz v7, :cond_10

    .line 347
    check-cast v6, Ll/ۛ֨ۗ;

    .line 400
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    if-eqz v7, :cond_9

    .line 401
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_9

    .line 402
    invoke-static {p0, v7}, Ll/ۧۜۗ;->᩷(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ll/ۢ۟ۗ;

    move-result-object v6

    goto/16 :goto_5

    .line 405
    :cond_9
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    .line 406
    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩹()I

    move-result v9

    if-nez v9, :cond_a

    goto :goto_4

    .line 409
    :cond_a
    invoke-virtual {v7}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_10

    .line 410
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v11, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-eq v10, v11, :cond_b

    goto :goto_4

    .line 432
    :cond_b
    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛ֨ۗ;

    invoke-virtual {v7}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v7

    if-eqz v7, :cond_e

    .line 433
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v11, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    if-eq v10, v11, :cond_c

    goto :goto_2

    .line 436
    :cond_c
    move-object v10, v7

    check-cast v10, Ll/ۗۢۗ;

    invoke-virtual {v10}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬ᩳۗ;

    .line 437
    invoke-virtual {v1, v10}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v10

    if-nez v10, :cond_d

    goto :goto_2

    .line 441
    :cond_d
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_e
    :goto_2
    move-object v10, v5

    :goto_3
    if-nez v10, :cond_f

    .line 415
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ll/ۧۜۗ;->ۙ(Ll/᩻ۡۗ;Ljava/lang/String;)Ll/ܽۡۗ;

    move-result-object v10

    .line 416
    invoke-virtual {v1, v10}, Ll/᩻ۡۗ;->ۙ(Ll/ܽۡۗ;)V

    .line 418
    :cond_f
    check-cast v9, Ll/ۜ֨ۗ;

    invoke-static {p0, v10, v9}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ܽۡۗ;Ll/ۜ֨ۗ;)Ll/ۢ۟ۗ;

    move-result-object v6

    goto :goto_5

    :cond_10
    :goto_4
    move-object v6, v5

    :goto_5
    if-nez v6, :cond_12

    :cond_11
    :goto_6
    return-object v5

    .line 352
    :cond_12
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 354
    :cond_13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public static ۙ(Ll/֫ۜۗ;Ll/ܽۡۗ;Ll/ۜ֨ۗ;)Ll/ۢ۟ۗ;
    .locals 13

    .line 448
    iget-object v0, p0, Ll/֫ۜۗ;->᩷:Ll/᩻ۡۗ;

    iget-object v1, p0, Ll/֫ۜۗ;->᩸:Ljava/util/ArrayList;

    .line 449
    invoke-virtual {p2}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v2

    .line 450
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto/16 :goto_6

    .line 454
    :cond_0
    invoke-virtual {v2, v0}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 456
    :cond_1
    sget-object v4, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 461
    :goto_0
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v2

    invoke-virtual {p2}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object v2

    if-nez v2, :cond_2

    goto/16 :goto_6

    .line 464
    :cond_2
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    if-eqz v2, :cond_12

    .line 466
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 467
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 468
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    .line 459
    invoke-virtual {p2}, Ll/ۜ֨ۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v2

    .line 497
    check-cast v2, Ll/ۜ֨ۗ;

    .line 498
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 499
    invoke-virtual {v2, v4}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 500
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֨ۗ;

    .line 516
    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v6

    .line 517
    invoke-virtual {v6}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    invoke-static {v7, v8}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_d

    .line 518
    move-object v9, v7

    check-cast v9, Ll/ۜ֨ۗ;

    invoke-virtual {v9}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v9

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v10

    invoke-virtual {v9, v10}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto/16 :goto_2

    .line 522
    :cond_4
    invoke-virtual {v6}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v9, v3

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۛ֨ۗ;

    .line 523
    invoke-virtual {v10}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v10

    if-nez v10, :cond_6

    goto/16 :goto_2

    .line 527
    :cond_6
    sget-object v11, Ll/ۚۜۗ;->ۙ:[I

    invoke-virtual {v10}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    const/4 v12, 0x1

    if-eq v11, v12, :cond_9

    const/4 v12, 0x4

    if-eq v11, v12, :cond_8

    const/4 v12, 0x5

    if-eq v11, v12, :cond_7

    goto :goto_2

    .line 538
    :cond_7
    check-cast v10, Ll/ۜ֨ۗ;

    .line 539
    invoke-virtual {v10}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v10

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_2

    .line 529
    :cond_8
    check-cast v10, Ll/ۗۢۗ;

    invoke-virtual {v10}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۬ᩳۗ;

    .line 530
    invoke-virtual {v9}, Ll/۬ᩳۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v10

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 531
    invoke-virtual {v9}, Ll/۬ᩳۗ;->᩸()Ll/֫֨ۗ;

    move-result-object v10

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_2

    .line 546
    :cond_9
    iget-object v11, p0, Ll/֫ۜۗ;->ܳ:Ll/ᩳۡۗ;

    invoke-virtual {v11, v8}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v11

    .line 547
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v12, v11, Ll/ܽ֨ۗ;

    if-eqz v12, :cond_a

    .line 271
    move-object v12, v11

    check-cast v12, Ll/ܽ֨ۗ;

    invoke-virtual {v12}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v12

    goto :goto_1

    :cond_a
    move-object v12, v3

    :goto_1
    if-eqz v12, :cond_b

    if-eq v12, v10, :cond_5

    goto :goto_2

    .line 0
    :cond_b
    instance-of v12, v11, Ll/ۛ֨ۗ;

    if-eqz v12, :cond_d

    .line 553
    check-cast v11, Ll/ۛ֨ۗ;

    invoke-virtual {v11}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v11

    if-eq v11, v10, :cond_5

    goto :goto_2

    :cond_c
    if-eqz v9, :cond_e

    .line 567
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    :goto_2
    move-object v9, v3

    :cond_e
    :goto_3
    if-nez v9, :cond_f

    goto :goto_4

    .line 505
    :cond_f
    new-instance v6, Ll/ۗۢۗ;

    sget-object v7, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    invoke-direct {v6, v7, v9, v8}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 506
    invoke-static {v6}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_4

    :cond_10
    move-object v3, v2

    :goto_4
    if-eqz v3, :cond_11

    .line 473
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p2, v3

    goto :goto_5

    .line 471
    :cond_11
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Init of enum field \'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ܽۡۗ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' uses external variables"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 471
    throw p0

    .line 477
    :cond_12
    :goto_5
    new-instance p0, Ll/ۢ۟ۗ;

    invoke-direct {p0, p1, p2}, Ll/ۢ۟ۗ;-><init>(Ll/ܽۡۗ;Ll/ۜ֨ۗ;)V

    return-object p0

    :cond_13
    :goto_6
    return-object v3
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ljava/lang/String;)Ll/ܽۡۗ;
    .locals 3

    .line 423
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩻ۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Ll/۬ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/֫֨ۗ;)Ll/۬ᩳۗ;

    move-result-object p1

    .line 424
    new-instance v0, Ll/ܽۡۗ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ܽۡۗ;-><init>(Ll/᩻ۡۗ;Ll/۬ᩳۗ;I)V

    .line 425
    sget-object p0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const-string p0, "Fake field, exist only in values array"

    .line 426
    invoke-virtual {v0, p0}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    return-object v0
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)Z
    .locals 2

    .line 646
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v0

    .line 647
    invoke-virtual {v0}, Ll/֫֨ۗ;->ۨ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 650
    :cond_0
    invoke-static {p1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 651
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 654
    :cond_1
    invoke-static {p1}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-static {p1}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object p1

    .line 655
    sget-object v0, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    invoke-static {p1, v0}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object p1

    check-cast p1, Ll/ۗۢۗ;

    if-eqz p1, :cond_2

    .line 656
    invoke-virtual {p1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p2

    invoke-static {v0, p2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 657
    invoke-static {p1}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-static {p1}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object p1

    sget-object p2, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    invoke-static {p1, p2}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object p1

    check-cast p1, Ll/᩶ۢۗ;

    if-eqz p1, :cond_2

    .line 658
    invoke-virtual {p1}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p1

    iget-object p2, p0, Ll/ۧۜۗ;->ܰ:Ll/᩷ۢۗ;

    invoke-virtual {p1, p2}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ᩷(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ll/ۢ۟ۗ;
    .locals 9

    .line 373
    iget-object v0, p0, Ll/֫ۜۗ;->᩷:Ll/᩻ۡۗ;

    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    goto/16 :goto_4

    .line 376
    :cond_0
    move-object v1, p1

    check-cast v1, Ll/ۗۢۗ;

    invoke-virtual {v1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ᩳۗ;

    .line 377
    iget-object v2, p0, Ll/֫ۜۗ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    .line 574
    :cond_1
    iget-object v4, p0, Ll/֫ۜۗ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 575
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    if-eqz v6, :cond_3

    .line 576
    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    if-ne v7, v8, :cond_3

    .line 577
    move-object v7, v6

    check-cast v7, Ll/ۗۢۗ;

    invoke-virtual {v7}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬ᩳۗ;

    .line 578
    invoke-virtual {v0, v7}, Ll/᩻ۡۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object v7

    .line 579
    invoke-static {v7, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_4
    move-object v6, v3

    :goto_0
    if-nez v6, :cond_5

    goto :goto_4

    .line 730
    :cond_5
    invoke-virtual {v6}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    .line 733
    invoke-virtual {v6, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 734
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v0, Ll/ܽ֨ۗ;

    if-eqz v5, :cond_7

    .line 735
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 745
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v7, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v5, v7, :cond_8

    .line 746
    :goto_1
    check-cast v0, Ll/ۜ֨ۗ;

    goto :goto_3

    .line 0
    :cond_7
    instance-of v5, v0, Ll/ۛ֨ۗ;

    if-eqz v5, :cond_8

    .line 738
    check-cast v0, Ll/ۛ֨ۗ;

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 745
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v7, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v5, v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_2
    move-object v0, v3

    :goto_3
    if-nez v0, :cond_9

    :goto_4
    return-object v3

    .line 390
    :cond_9
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 391
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩹()I

    move-result v3

    if-ne v3, v4, :cond_b

    .line 392
    :cond_a
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    :cond_b
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    invoke-static {p0, v1, v0}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ܽۡۗ;Ll/ۜ֨ۗ;)Ll/ۢ۟ۗ;

    move-result-object p0

    return-object p0
.end method

.method private ᩷(Ll/᩻ۡۗ;)Z
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "values()"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v2

    invoke-static {v2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    invoke-static {v2}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 120
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 121
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-direct {v7, v3, v5}, Ll/ۧۜۗ;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_f

    .line 125
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 126
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ll/֫֨ۗ;->ۚ:Ll/֫֨ۗ;

    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    sget-object v0, Ll/֫۟ۗ;->۬ۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_2
    const-string v0, "<clinit>()V"

    .line 812
    invoke-virtual {v8, v0}, Ll/᩻ۡۗ;->ᩴ(Ljava/lang/String;)Ll/ۖۡۗ;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "Enum class init method not found"

    .line 131
    invoke-virtual {v8, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v4

    .line 134
    :cond_3
    invoke-virtual {v0}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v2

    if-eqz v2, :cond_32

    .line 135
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_f

    .line 139
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 140
    invoke-virtual {v2}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛۡۗ;

    .line 141
    instance-of v6, v5, Ll/᩷ۡۗ;

    if-eqz v6, :cond_5

    .line 142
    check-cast v5, Ll/᩷ۡۗ;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v0, "Unexpected branching in enum static init block"

    .line 148
    invoke-virtual {v8, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v4

    .line 151
    :cond_6
    new-instance v2, Ll/֫ۜۗ;

    invoke-direct {v2, v8, v0, v3}, Ll/֫ۜۗ;-><init>(Ll/᩻ۡۗ;Ll/ۖۡۗ;Ljava/util/ArrayList;)V

    .line 215
    iget-object v3, v2, Ll/֫ۜۗ;->᩷:Ll/᩻ۡۗ;

    invoke-virtual {v3}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    .line 216
    invoke-virtual {v3}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v9, Ll/᩸ۜۗ;

    invoke-direct {v9, v4}, Ll/᩸ۜۗ;-><init>(I)V

    .line 217
    invoke-interface {v6, v9}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v9, Ll/ۙۖۗ;

    const/4 v10, 0x1

    invoke-direct {v9, v10}, Ll/ۙۖۗ;-><init>(I)V

    .line 218
    invoke-interface {v6, v9}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v9, Ll/ᩴۜۗ;

    invoke-direct {v9, v4, v5}, Ll/ᩴۜۗ;-><init>(ILjava/lang/Object;)V

    .line 219
    invoke-interface {v6, v9}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v5

    .line 220
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 222
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v0, "$VALUES field not found"

    .line 223
    invoke-virtual {v3, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v4

    .line 226
    :cond_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v10, :cond_8

    .line 227
    new-instance v6, Ll/ܳۜۗ;

    invoke-direct {v6, v4}, Ll/ܳۜۗ;-><init>(I)V

    invoke-static {v5, v6}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 229
    :cond_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v10, :cond_9

    .line 230
    invoke-static {v5}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v9, Ll/۫ۜۗ;

    invoke-direct {v9, v4}, Ll/۫ۜۗ;-><init>(I)V

    invoke-interface {v6, v9}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v6

    invoke-interface {v6}, Ll/᩵ܺۗ;->findAny()Ll/ܶۚۗ;

    move-result-object v6

    .line 231
    invoke-virtual {v6}, Ll/ܶۚۗ;->isPresent()Z

    move-result v9

    if-eqz v9, :cond_9

    .line 232
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 233
    invoke-virtual {v6}, Ll/ܶۚۗ;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۡۗ;

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    :cond_9
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-eq v6, v10, :cond_a

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Found several \"values\" enum fields: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v4

    .line 240
    :cond_a
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    iput-object v5, v2, Ll/֫ۜۗ;->ᩴ:Ll/ܽۡۗ;

    .line 324
    invoke-virtual {v5}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v5

    .line 325
    iget-object v6, v2, Ll/֫ۜۗ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 326
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳۡۗ;

    .line 327
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v13

    sget-object v14, Ll/᩺ۢۗ;->ۡۙ:Ll/᩺ۢۗ;

    if-ne v13, v14, :cond_c

    .line 328
    check-cast v12, Ll/ۗۢۗ;

    .line 329
    invoke-virtual {v12}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/۬ᩳۗ;

    .line 330
    invoke-virtual {v13, v5}, Ll/۬ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    .line 331
    new-instance v5, Ll/᩸֫᩵;

    invoke-direct {v5, v9, v12}, Ll/᩸֫᩵;-><init>(Ll/᩹ۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_1

    :cond_d
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_e

    goto/16 :goto_f

    .line 247
    :cond_e
    invoke-virtual {v5}, Ll/᩸֫᩵;->᩷()Ll/ᩳۡۗ;

    move-result-object v5

    iput-object v5, v2, Ll/֫ۜۗ;->ܳ:Ll/ᩳۡۗ;

    .line 156
    invoke-virtual {v5, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v5, Ll/ܽ֨ۗ;

    if-eqz v6, :cond_f

    .line 158
    check-cast v5, Ll/ܽ֨ۗ;

    invoke-virtual {v5}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    .line 159
    invoke-static {v2, v5}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ljava/util/List;

    move-result-object v5

    goto :goto_2

    .line 0
    :cond_f
    instance-of v6, v5, Ll/ۛ֨ۗ;

    if-eqz v6, :cond_10

    .line 163
    check-cast v5, Ll/ۛ֨ۗ;

    .line 164
    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    if-eqz v5, :cond_10

    .line 166
    invoke-static {v2, v5}, Ll/ۧۜۗ;->ۙ(Ll/֫ۜۗ;Ll/ᩳۡۗ;)Ljava/util/List;

    move-result-object v5

    goto :goto_2

    :cond_10
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_11

    const-string v0, "Unknown enum class pattern. Please report as an issue!"

    .line 170
    invoke-virtual {v8, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v4

    .line 173
    :cond_11
    iget-object v6, v2, Ll/֫ۜۗ;->ܳ:Ll/ᩳۡۗ;

    iget-object v9, v2, Ll/֫ۜۗ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    new-instance v6, Ll/֨۟ۗ;

    invoke-direct {v6, v5}, Ll/֨۟ۗ;-><init>(Ljava/util/List;)V

    .line 177
    invoke-virtual {v6, v0}, Ll/֨۟ۗ;->ۙ(Ll/ۖۡۗ;)V

    .line 178
    invoke-virtual {v8, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 180
    invoke-virtual {v6}, Ll/֨۟ۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_12
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۢ۟ۗ;

    .line 181
    invoke-virtual {v6}, Ll/ۢ۟ۗ;->ۤ()Ll/ܽۡۗ;

    move-result-object v11

    .line 182
    sget-object v12, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v11, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 252
    invoke-virtual {v6}, Ll/ۢ۟ۗ;->᩷()Ll/ۜ֨ۗ;

    move-result-object v11

    .line 253
    invoke-virtual {v11}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v12

    .line 254
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v13

    invoke-virtual {v12, v13}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_15

    .line 255
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v13

    invoke-virtual {v13, v12}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v12

    if-eqz v12, :cond_15

    .line 716
    invoke-virtual {v12}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_13
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۖۡۗ;

    .line 717
    invoke-virtual {v14}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/ۢᩳۗ;->ᩴ()Z

    move-result v15

    if-eqz v15, :cond_13

    .line 718
    sget-object v15, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v14, v15}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_4

    .line 721
    :cond_14
    invoke-virtual {v6, v12}, Ll/ۢ۟ۗ;->ۙ(Ll/᩻ۡۗ;)V

    .line 722
    invoke-virtual {v12}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v13

    invoke-virtual {v13, v3}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_15

    .line 724
    invoke-virtual {v3, v12}, Ll/᩻ۡۗ;->᩷(Ll/᩻ۡۗ;)V

    .line 725
    sget-object v13, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 260
    :cond_15
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v12

    invoke-virtual {v11}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v13

    invoke-virtual {v12, v13}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object v12

    if-eqz v12, :cond_16

    .line 628
    invoke-static {v12, v4}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    .line 629
    invoke-virtual {v12}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩷ۢۗ;->᩸()I

    move-result v13

    if-le v13, v10, :cond_16

    .line 630
    invoke-static {v12, v10}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    .line 264
    :cond_16
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v12

    if-eqz v12, :cond_19

    .line 265
    invoke-virtual {v12}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v14, 0x2

    if-gt v13, v14, :cond_17

    goto :goto_5

    .line 268
    :cond_17
    invoke-virtual {v12}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v13

    invoke-static {v13}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v13

    new-instance v14, Ll/۬۠ۗ;

    invoke-direct {v14, v2}, Ll/۬۠ۗ;-><init>(Ll/֫ۜۗ;)V

    .line 269
    invoke-interface {v13, v14}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v13

    if-eqz v13, :cond_12

    .line 272
    new-instance v13, Ll/ۗۢۗ;

    sget-object v14, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    invoke-virtual {v6}, Ll/ۢ۟ۗ;->ۤ()Ll/ܽۡۗ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v6

    invoke-direct {v13, v14, v6, v4}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 273
    invoke-virtual {v12}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v6

    invoke-virtual {v13, v6}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 1467
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 1468
    invoke-static {v0, v12, v11, v13}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v12

    if-eqz v12, :cond_18

    goto/16 :goto_3

    .line 266
    :cond_19
    :goto_5
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 185
    :cond_1a
    iget-object v3, v2, Ll/֫ۜۗ;->ᩴ:Ll/ܽۡۗ;

    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 186
    invoke-static {v0, v9}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 187
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۙۙ()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v3, v11, v13

    if-nez v3, :cond_1b

    .line 188
    invoke-virtual {v0, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_6

    .line 189
    :cond_1b
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1c

    .line 190
    invoke-static {v0}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    .line 192
    :cond_1c
    :goto_6
    iget-object v0, v2, Ll/֫ۜۗ;->ᩴ:Ll/ܽۡۗ;

    .line 589
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v9

    .line 590
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    invoke-static {v1}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 593
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move-object v11, v3

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 594
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    .line 595
    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩹()Z

    move-result v6

    if-nez v6, :cond_28

    invoke-virtual {v3}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v6

    if-eqz v6, :cond_1d

    goto/16 :goto_b

    .line 598
    :cond_1d
    invoke-virtual {v5}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v6

    .line 599
    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩵()Z

    move-result v12

    if-eqz v12, :cond_24

    .line 628
    invoke-static {v3, v4}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    .line 629
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩸()I

    move-result v5

    if-le v5, v10, :cond_1e

    .line 630
    invoke-static {v3, v10}, Ll/᩶ᩳۗ;->᩷(Ll/ۖۡۗ;I)V

    .line 481
    :cond_1e
    invoke-virtual {v3}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_21

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 482
    invoke-virtual {v12}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩳۡۗ;

    .line 483
    invoke-virtual {v15}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v4, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v10, v4, :cond_20

    .line 484
    check-cast v15, Ll/ۜ֨ۗ;

    .line 485
    invoke-virtual {v15}, Ll/ۜ֨ۗ;->۟ۙ()Z

    move-result v4

    if-eqz v4, :cond_20

    .line 486
    invoke-virtual {v15}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v4

    if-eqz v4, :cond_20

    .line 487
    invoke-virtual {v15}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۢۗ;->᩻()Ljava/lang/String;

    move-result-object v4

    const-string v10, "java.lang.Enum.<init>(Ljava/lang/String;I)V"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_9

    :cond_20
    const/4 v4, 0x0

    const/4 v10, 0x1

    goto :goto_8

    :cond_21
    const/4 v15, 0x0

    :goto_9
    if-eqz v15, :cond_22

    .line 604
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v15, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 605
    invoke-static {v3, v15}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    :cond_22
    const-string v4, "<init>(Ljava/lang/String;I)V"

    .line 635
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    const-string v4, "<init>(Ljava/lang/String;)V"

    .line 636
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    .line 639
    :cond_23
    invoke-virtual {v3}, Ll/ۖۡۗ;->ۙۙ()J

    move-result-wide v4

    cmp-long v6, v4, v13

    if-nez v6, :cond_28

    .line 608
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto/16 :goto_b

    .line 610
    :cond_24
    invoke-virtual {v5}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    .line 611
    invoke-direct {v7, v3, v9}, Ll/ۧۜۗ;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)Z

    move-result v4

    if-eqz v4, :cond_28

    .line 613
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    move-object v11, v3

    goto :goto_b

    .line 615
    :cond_25
    invoke-virtual {v5}, Ll/᩷ۢۗ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "valueOf"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    .line 664
    new-instance v4, Ll/ۙۜۗ;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ll/ۙۜۗ;-><init>(I)V

    sget v5, Ll/۠֫᩵;->ۙ:I

    .line 218
    invoke-virtual {v3}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v5

    if-nez v5, :cond_26

    invoke-virtual {v3}, Ll/ۖۡۗ;->֡ۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_26

    .line 219
    sget-object v5, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    invoke-static {v3, v5, v4}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;

    move-result-object v4

    goto :goto_a

    :cond_26
    const/4 v4, 0x0

    :goto_a
    if-nez v4, :cond_27

    goto :goto_b

    .line 668
    :cond_27
    invoke-static {v4}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v4

    invoke-static {v4}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object v4

    .line 669
    sget-object v5, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    invoke-static {v4, v5}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v4

    check-cast v4, Ll/ۗۢۗ;

    if-eqz v4, :cond_28

    .line 670
    invoke-virtual {v4}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v9}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    .line 671
    invoke-static {v4}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v4

    invoke-static {v4}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    invoke-static {v4, v5}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v4

    check-cast v4, Ll/᩶ۢۗ;

    if-eqz v4, :cond_28

    .line 672
    invoke-virtual {v4}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v4

    iget-object v5, v7, Ll/ۧۜۗ;->᩶:Ll/᩷ۢۗ;

    invoke-virtual {v4, v5}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    .line 616
    sget-object v4, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_28
    :goto_b
    const/4 v4, 0x0

    const/4 v10, 0x1

    goto/16 :goto_7

    .line 619
    :cond_29
    invoke-virtual {v0}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v10

    .line 620
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_2a
    :goto_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ll/ۖۡۗ;

    .line 678
    invoke-virtual {v13}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    .line 679
    invoke-virtual {v0}, Ll/᩷ۢۗ;->᩵()Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual {v0}, Ll/᩷ۢۗ;->᩹()Z

    move-result v0

    if-nez v0, :cond_2a

    invoke-virtual {v13}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_2a

    if-ne v13, v11, :cond_2b

    goto :goto_c

    .line 683
    :cond_2b
    new-instance v2, Ll/᩷ۜۗ;

    invoke-direct {v2, v10}, Ll/᩷ۜۗ;-><init>(Ll/۬ᩳۗ;)V

    .line 684
    sget-object v0, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    invoke-static {v13, v0, v2}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;

    move-result-object v0

    if-nez v0, :cond_2c

    goto :goto_c

    .line 689
    :cond_2c
    new-instance v14, Ll/ۤۜۗ;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v3, v11

    move-object v4, v13

    move-object v5, v9

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Ll/ۤۜۗ;-><init>(Ll/ۧۜۗ;Ll/᩷ۜۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;Ll/֫֨ۗ;Ll/۬ᩳۗ;)V

    .line 245
    invoke-virtual {v13}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 246
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 247
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_d
    if-ge v4, v3, :cond_2d

    .line 249
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 250
    invoke-static {v13, v5, v14}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ۤۜۗ;)V

    .line 251
    invoke-virtual {v14, v5}, Ll/ۤۜۗ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    if-eqz v5, :cond_2e

    .line 253
    invoke-static {v13, v1, v4, v5}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;ILl/ᩳۡۗ;)V

    :cond_2e
    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    .line 200
    :cond_2f
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    const/16 v1, 0x10

    .line 201
    invoke-virtual {v0, v1}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    const/16 v1, 0x400

    .line 202
    invoke-virtual {v0, v1}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    const/16 v1, 0x8

    .line 203
    invoke-virtual {v0, v1}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    .line 200
    invoke-virtual {v8, v0}, Ll/᩻ۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_30
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    .line 205
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->᩵()Z

    move-result v2

    if-eqz v2, :cond_30

    .line 206
    invoke-virtual {v1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    const/4 v3, 0x7

    invoke-virtual {v2, v3}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۖۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    goto :goto_e

    .line 194
    :cond_31
    sget-object v0, Ll/֫۟ۗ;->۠:Ll/֫۟ۗ;

    invoke-virtual {v8, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    const/4 v0, 0x1

    return v0

    :cond_32
    :goto_f
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "EnumVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 5

    .line 81
    sget-object v0, Ll/֫֨ۗ;->ۚ:Ll/֫֨ۗ;

    .line 83
    invoke-static {p1, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ll/֫֨ۗ;

    sget-object v3, Ll/֫֨ۗ;->ܳ:Ll/֫֨ۗ;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 85
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "valueOf"

    .line 81
    invoke-static {p1, v1, v3, v2, v0}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧۜۗ;->᩶:Ll/᩷ۢۗ;

    .line 88
    sget-object v0, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    .line 89
    invoke-static {p1, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v1

    const-string v2, "clone"

    .line 91
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 88
    invoke-static {p1, v1, v2, v3, v0}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۜۗ;->ܰ:Ll/᩷ۢۗ;

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 2

    .line 97
    invoke-virtual {p1}, Ll/᩻ۡۗ;->۠ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۧۜۗ;->᩷(Ll/᩻ۡۗ;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Enum visitor error"

    .line 102
    invoke-virtual {p1, v1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    .line 106
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x4000

    .line 108
    invoke-virtual {v0, v1}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    const-string v0, "Failed to restore enum class, \'enum\' modifier removed"

    .line 109
    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
