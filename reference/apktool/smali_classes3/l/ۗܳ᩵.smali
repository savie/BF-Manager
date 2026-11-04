.class public final Ll/ۗܳ᩵;
.super Ll/ܺ۠ۗ;
.source "L6E6"


# instance fields
.field public ܰ:Ljava/util/List;

.field public ܿ:Ll/ۢ۫᩵;

.field public final ᩶:Ll/ۤ۫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 63
    const-class v0, Ll/ۗܳ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Ll/ۤ۫᩵;

    invoke-direct {v0}, Ll/ۤ۫᩵;-><init>()V

    iput-object v0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    return-void
.end method

.method public static ֫(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 13

    .line 573
    iget-object p0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 574
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ֨ۗ;

    .line 588
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v5

    .line 589
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩶()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 634
    :cond_1
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ۨ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-ge v5, v6, :cond_2

    goto :goto_1

    .line 637
    :cond_2
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    .line 638
    sget-object v7, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    invoke-static {v5, v7}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 256
    :cond_3
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v7

    invoke-static {p1, v5, v7}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v7

    if-nez v7, :cond_9

    .line 596
    :goto_1
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    .line 597
    sget-object v7, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    invoke-static {v5, v7}, Ll/۠֫᩵;->᩷(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_0

    .line 600
    :cond_4
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v7, v6, :cond_5

    goto :goto_0

    .line 256
    :cond_5
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v6

    invoke-static {p1, v5, v6}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v6

    if-nez v6, :cond_6

    goto :goto_0

    .line 607
    :cond_6
    sget-object v2, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {v5, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 608
    invoke-static {v6, v5}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)I

    move-result v2

    add-int/2addr v2, v4

    .line 609
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 610
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v3, :cond_f

    .line 611
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۛ֨ۗ;

    .line 612
    sget-object v9, Ll/֫۟ۗ;->᩸ۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    if-nez v7, :cond_7

    goto :goto_3

    .line 616
    :cond_7
    invoke-virtual {v8}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v9

    if-nez v9, :cond_8

    goto :goto_3

    .line 620
    :cond_8
    invoke-virtual {v5, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;

    move-result-object v10

    .line 621
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11, v2, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 622
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 647
    :cond_9
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ۨ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x1

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۢۗ;

    if-eqz v4, :cond_a

    const/4 v4, 0x0

    goto :goto_4

    .line 652
    :cond_a
    invoke-virtual {v5, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;

    move-result-object v8

    .line 653
    sget-object v9, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 1447
    invoke-static {v7, v5}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_b

    goto :goto_5

    .line 1451
    :cond_b
    invoke-virtual {v7}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10, v9, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 102
    :goto_5
    invoke-virtual {v6}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_c

    goto :goto_6

    .line 105
    :cond_c
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܺ֨ۗ;

    .line 106
    check-cast v11, Ll/ۛ֨ۗ;

    .line 107
    invoke-virtual {v11}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v12

    if-ne v12, v3, :cond_d

    move-object v10, v11

    .line 657
    :cond_e
    :goto_6
    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v6, v10, v8}, Ll/ᩳۢۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    goto :goto_4

    :cond_f
    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_10
    if-nez v2, :cond_11

    return v1

    .line 582
    :cond_11
    invoke-static {p1}, Ll/᩸۬ۗ;->ۤ(Ll/ۖۡۗ;)V

    .line 583
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 584
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    return v4
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۢۗ;Z)I
    .locals 13

    .line 719
    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 722
    invoke-virtual {p1, v2}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v4

    .line 723
    invoke-virtual {p1, v2}, Ll/ᩳۢۗ;->۫(I)Ll/᩷ۡۗ;

    move-result-object v5

    .line 724
    invoke-static {v5}, Ll/ۗܳ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v6

    if-nez v6, :cond_0

    .line 726
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to insert an additional move for type inference into block "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return v1

    .line 730
    :cond_0
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v5

    .line 731
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    .line 733
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    .line 734
    sget-object v9, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    if-eq v7, v9, :cond_2

    sget-object v9, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v7, v9, :cond_1

    .line 735
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->᩹()I

    move-result v5

    if-ne v5, v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-eqz p2, :cond_2

    .line 750
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v5

    .line 751
    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v7

    const/4 v9, 0x0

    .line 752
    invoke-virtual {v4, v7, v9}, Ll/ۛ֨ۗ;->ۙ(ILl/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v9

    .line 753
    invoke-virtual {p0, v9}, Ll/ۖۡۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    move-result-object v10

    .line 754
    invoke-virtual {v4, v7, v5}, Ll/ۛ֨ۗ;->ۙ(ILl/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v5

    .line 756
    new-instance v11, Ll/ᩳۡۗ;

    sget-object v12, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    invoke-direct {v11, v12, v8}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 757
    invoke-virtual {v11, v9}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 758
    invoke-virtual {v11, v5}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 759
    sget-object v5, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v11, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 760
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 762
    invoke-virtual {v4, v7, v10}, Ll/ۛ֨ۗ;->ۙ(ILl/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Ll/ᩳۢۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    return v3
.end method

.method public static ۙ(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Ljava/lang/Boolean;
    .locals 7

    .line 304
    iget-object p0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 306
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    .line 307
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    .line 308
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿ֨ۗ;

    .line 309
    invoke-static {p1, v6, v5}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    .line 314
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 317
    :cond_2
    invoke-static {p1}, Ll/᩸۬ۗ;->ۤ(Ll/ۖۡۗ;)V

    .line 318
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 319
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    .line 323
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֨ۗ;

    .line 324
    invoke-static {p1, v1, v2}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    if-nez v5, :cond_5

    .line 329
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 330
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    const-string p0, "Type inference incomplete: some casts might be missing"

    .line 331
    invoke-virtual {p1, p0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 333
    :cond_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "Type inference fix \'apply assigned field type\' failed"

    .line 335
    invoke-virtual {p1, v0, p0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static ۙ(Ll/֫֨ۗ;Ll/ܿ֨ۗ;)Ljava/util/List;
    .locals 4

    .line 195
    invoke-virtual {p0}, Ll/֫֨ۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-virtual {p0}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ۗܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/ܿ֨ۗ;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    .line 198
    invoke-static {v0}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    if-eqz p1, :cond_4

    .line 203
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ܳ᩵;

    .line 204
    invoke-interface {v0}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ll/֫֨ۗ;->ۘ()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ll/֫֨ۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 207
    :cond_3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 211
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 212
    invoke-virtual {p0}, Ll/֫֨ۗ;->ܽ()[Ll/ۨ֨ۗ;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_6

    aget-object v2, p0, v1

    .line 213
    sget-object v3, Ll/ۨ֨ۗ;->᩷ۙ:Ll/ۨ֨ۗ;

    if-ne v2, v3, :cond_5

    goto :goto_2

    .line 216
    :cond_5
    invoke-static {v2}, Ll/֫֨ۗ;->ۤ(Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    return-object p1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۛ֨ۗ;Ll/֫֨ۗ;)Ll/ۗۢۗ;
    .locals 6

    .line 537
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 538
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 541
    :cond_0
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ֨ۗ;->۫ۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 545
    :cond_1
    invoke-static {p0, v0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/᩷ۡۗ;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 550
    :cond_2
    invoke-virtual {p1, p0}, Ll/ۛ֨ۗ;->ۙ(Ll/ۖۡۗ;)Ll/ۛ֨ۗ;

    move-result-object p0

    .line 551
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v2

    .line 565
    new-instance v4, Ll/ۗۢۗ;

    sget-object v5, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    invoke-direct {v4, v5, p2, v3}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 566
    invoke-virtual {v4, p0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 567
    invoke-virtual {v4, v2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 568
    sget-object p0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v4, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 553
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    .line 1438
    invoke-static {v1, v0}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)I

    move-result p0

    const/4 p1, -0x1

    if-ne p0, p1, :cond_3

    goto :goto_0

    .line 1442
    :cond_3
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object v4

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۙ(Ljava/util/LinkedHashSet;)Ll/ܶۚۗ;
    .locals 2

    .line 174
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/ۘۘܳ;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll/ۘۘܳ;-><init>(I)V

    .line 175
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/᩷۬ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩷۬ۗ;-><init>(I)V

    .line 176
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p1

    iget-object v0, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    .line 177
    invoke-virtual {v0}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ܳ᩵;->ۙ()Ljava/util/Comparator;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->max(Ljava/util/Comparator;)Ll/ܶۚۗ;

    move-result-object p1

    return-object p1
.end method

.method public static ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 767
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 770
    :cond_0
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 771
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    invoke-static {v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩺ۢۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 773
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    .line 774
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 775
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷ۡۗ;

    invoke-static {p0}, Ll/ۗܳ᩵;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :cond_2
    return-object p0
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)Z
    .locals 2

    .line 146
    invoke-virtual {p2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 148
    invoke-direct {p0, v0}, Ll/ۗܳ᩵;->ۙ(Ljava/util/LinkedHashSet;)Ll/ܶۚۗ;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ll/ܶۚۗ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v0}, Ll/ܶۚۗ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    .line 159
    iget-object v1, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    invoke-virtual {v1, p1, p2, v0}, Ll/ۢ۫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    move-result-object p1

    .line 160
    sget-object p2, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 170
    :cond_1
    sget-object p2, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    if-ne p1, p2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Z)Z
    .locals 12

    .line 341
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v0

    .line 342
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 345
    :cond_0
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    .line 349
    :cond_1
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    .line 350
    sget-object v3, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    if-eq v2, v3, :cond_2

    sget-object v3, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-eq v2, v3, :cond_2

    goto/16 :goto_5

    .line 353
    :cond_2
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz p2, :cond_e

    .line 358
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 372
    invoke-virtual {v2}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    .line 373
    sget-object v3, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    invoke-static {v2, v3}, Ll/۠֫᩵;->᩷(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    .line 376
    :cond_4
    check-cast v2, Ll/᩶ۢۗ;

    .line 377
    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 0
    instance-of v4, v3, Ll/ۛ֨ۗ;

    if-eqz v4, :cond_5

    .line 302
    move-object v4, v3

    check-cast v4, Ll/ۛ֨ۗ;

    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v4

    .line 303
    invoke-static {v4, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_6

    goto :goto_2

    .line 381
    :cond_6
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v4

    if-nez v4, :cond_8

    :cond_7
    :goto_2
    const/4 v2, 0x0

    goto :goto_4

    .line 386
    :cond_8
    invoke-interface {v4}, Ll/᩶ۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    .line 389
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v6, -0x1

    const/4 v7, 0x0

    :cond_9
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܺ֨ۗ;

    if-ne v8, v3, :cond_a

    goto :goto_3

    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 394
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v8, Ll/ۛ֨ۗ;

    if-nez v9, :cond_b

    goto :goto_3

    .line 397
    :cond_b
    invoke-interface {v4}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֫֨ۗ;

    .line 398
    invoke-virtual {v8}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v10

    .line 399
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v11

    invoke-virtual {v11, v0, v5, v9}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v9

    if-eqz v9, :cond_9

    .line 400
    invoke-virtual {v9, v10}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    .line 401
    check-cast v8, Ll/ۛ֨ۗ;

    invoke-static {p0, v8, v9}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛ֨ۗ;Ll/֫֨ۗ;)Ll/ۗۢۗ;

    move-result-object v8

    if-eqz v8, :cond_9

    .line 403
    sget-object v9, Ll/֫۟ۗ;->ܺۙ:Ll/֫۟ۗ;

    invoke-virtual {v8, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_c
    if-lez v7, :cond_7

    const/4 v2, 0x1

    :goto_4
    if-eqz v2, :cond_3

    const/4 v1, 0x1

    goto/16 :goto_0

    :cond_d
    return v1

    .line 367
    :cond_e
    invoke-virtual {p1, v0}, Ll/ܿ֨ۗ;->᩷(Ll/֫֨ۗ;)V

    :cond_f
    :goto_5
    return v1
.end method

.method public static ۚ(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 14

    .line 466
    iget-object p0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 467
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    .line 468
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v2, v1, :cond_c

    .line 470
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ֨ۗ;

    .line 471
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v6

    .line 472
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩶()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v6

    if-nez v6, :cond_b

    .line 485
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩵ܳ᩵;

    .line 486
    invoke-interface {v7}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v7

    .line 487
    invoke-virtual {v7}, Ll/֫֨ۗ;->᩶()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 488
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v8

    invoke-virtual {v8}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 489
    invoke-virtual {v7}, Ll/֫֨ۗ;->᩸()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 490
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    invoke-static {p1}, Ll/ۗۖۗ;->ۙ(Ll/ۖۡۗ;)Ljava/util/Set;

    move-result-object v8

    .line 142
    new-instance v9, Ll/᩻᩵ᩴ;

    const/4 v10, 0x1

    invoke-direct {v9, v10, v8}, Ll/᩻᩵ᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v7, v9}, Ll/֫֨ۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫֨ۗ;

    if-eqz v8, :cond_1

    goto :goto_1

    .line 519
    :cond_1
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v6

    .line 520
    invoke-virtual {v6}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    .line 521
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    sget-object v11, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v10, v11, :cond_2

    goto :goto_2

    .line 256
    :cond_2
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v10

    invoke-static {p1, v8, v10}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_2

    .line 528
    :cond_3
    invoke-virtual {v6, p1}, Ll/ۛ֨ۗ;->ۙ(Ll/ۖۡۗ;)Ll/ۛ֨ۗ;

    move-result-object v11

    invoke-virtual {v8, v11}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 529
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v6

    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v11

    .line 565
    new-instance v12, Ll/ۗۢۗ;

    sget-object v13, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    invoke-direct {v12, v13, v7, v4}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 566
    invoke-virtual {v12, v6}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 567
    invoke-virtual {v12, v11}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 568
    sget-object v6, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v12, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 1447
    invoke-static {v10, v8}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_4

    goto :goto_2

    .line 1451
    :cond_4
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move-object v9, v12

    :cond_5
    :goto_2
    if-eqz v9, :cond_6

    .line 493
    sget-object v5, Ll/֫۟ۗ;->ۚ᩷:Ll/֫۟ۗ;

    invoke-virtual {v9, v5}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_5

    .line 503
    :cond_6
    invoke-virtual {v5}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v4

    .line 504
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_4

    .line 508
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_8
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛ֨ۗ;

    .line 509
    invoke-virtual {v6}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v7

    invoke-static {p1, v6, v7}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛ֨ۗ;Ll/֫֨ۗ;)Ll/ۗۢۗ;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 511
    sget-object v7, Ll/֫۟ۗ;->ۚ᩷:Ll/֫۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_9
    move v4, v5

    goto :goto_5

    :cond_a
    :goto_4
    const/4 v4, 0x0

    :goto_5
    add-int/2addr v3, v4

    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_c
    const/4 v0, 0x0

    if-eqz v3, :cond_d

    .line 477
    invoke-static {p1}, Ll/᩸۬ۗ;->ۤ(Ll/ۖۡۗ;)V

    .line 478
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 479
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    return v4

    :cond_d
    return v0
.end method

.method private ۤ(Ll/ۖۡۗ;)Z
    .locals 8

    .line 223
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֨ۗ;

    .line 233
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_8

    .line 236
    :cond_1
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v3

    .line 237
    invoke-virtual {v3}, Ll/֫֨ۗ;->᩶()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_8

    .line 136
    :cond_2
    :try_start_0
    invoke-direct {p0, p1, v2}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)Z

    move-result v4
    :try_end_0
    .catch Ll/ۖۧ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 140
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to calculate best type for var: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v4}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    goto/16 :goto_7

    .line 181
    :cond_3
    invoke-static {v3, v2}, Ll/ۗܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/ܿ֨ۗ;)Ljava/util/List;

    move-result-object v3

    .line 182
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    .line 185
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    .line 186
    iget-object v5, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    invoke-virtual {v5, p1, v2, v4}, Ll/ۢ۫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    move-result-object v4

    .line 187
    sget-object v5, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    if-ne v4, v5, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_7

    goto/16 :goto_7

    .line 783
    :cond_7
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 784
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ܳ᩵;

    .line 785
    invoke-interface {v5}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v5

    .line 786
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩶()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v5}, Ll/֫֨ۗ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 787
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 790
    :cond_9
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_5

    .line 793
    :cond_a
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v4

    .line 794
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 795
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 796
    invoke-static {v6}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v6

    .line 797
    iget-object v7, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    invoke-virtual {v7, p1, v2, v6}, Ll/ۢ۫᩵;->ۤ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    move-result-object v6

    .line 798
    sget-object v7, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    if-ne v6, v7, :cond_c

    const/4 v2, 0x1

    goto :goto_6

    :cond_d
    :goto_5
    const/4 v2, 0x0

    :goto_6
    if-eqz v2, :cond_e

    :goto_7
    const/4 v2, 0x1

    goto :goto_9

    :cond_e
    :goto_8
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto/16 :goto_0

    :catch_1
    move-exception p1

    .line 138
    throw p1

    :cond_f
    return v1
.end method

.method public static ۤ(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 11

    .line 663
    iget-object v0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 664
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 665
    sget-object v6, Ll/ۧ۟ۗ;->ۖ:Ll/ۧ۟ۗ;

    invoke-virtual {v4, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ۛᩳۗ;

    if-eqz v4, :cond_0

    .line 667
    invoke-virtual {v4}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۢۗ;

    .line 707
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    move-object v9, v8

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܺ֨ۗ;

    .line 708
    invoke-virtual {v10}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v10

    if-nez v9, :cond_2

    move-object v9, v10

    goto :goto_1

    .line 711
    :cond_2
    invoke-virtual {v9, v10}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_2

    :cond_3
    move-object v8, v9

    :goto_2
    if-eqz v8, :cond_4

    .line 692
    invoke-virtual {v8}, Ll/֫֨ۗ;->᩶()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    .line 697
    :cond_4
    invoke-static {p1, v6, v2}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۢۗ;Z)I

    move-result v7

    if-nez v7, :cond_5

    :goto_3
    const/4 v6, 0x0

    goto :goto_4

    .line 701
    :cond_5
    invoke-static {p1, v6, v5}, Ll/ۗܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۢۗ;Z)I

    move-result v6

    :goto_4
    add-int/2addr v3, v6

    goto :goto_0

    :cond_6
    if-nez v3, :cond_7

    return v2

    .line 678
    :cond_7
    invoke-static {p1}, Ll/᩸۬ۗ;->ۤ(Ll/ۖۡۗ;)V

    .line 679
    invoke-virtual {v0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 680
    invoke-virtual {v0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    invoke-static {p1}, Ll/ۗܳ᩵;->᩷(Ll/ۖۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_8

    return v5

    .line 683
    :cond_8
    invoke-direct {p0, p1}, Ll/ۗܳ᩵;->ۤ(Ll/ۖۡۗ;)Z

    move-result p0

    return p0
.end method

.method public static ۫(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 808
    iget-object v0, v0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 809
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v2

    .line 810
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v3, :cond_12

    .line 813
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿ֨ۗ;

    .line 826
    invoke-virtual {v7}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v8

    .line 827
    invoke-virtual {v8}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/֫֨ۗ;->᩶()Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    .line 831
    :cond_0
    invoke-virtual {v8}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩵ܳ᩵;

    .line 832
    invoke-interface {v10}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v12

    .line 833
    sget-object v13, Ll/᩹ܳ᩵;->ۙ:[I

    invoke-interface {v10}, Ll/᩵ܳ᩵;->ۙ()Ll/ܳܳ᩵;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v13, v10

    if-eq v10, v6, :cond_3

    if-eq v10, v11, :cond_2

    goto :goto_1

    .line 841
    :cond_2
    invoke-virtual {v12}, Ll/֫֨ۗ;->ۙ()Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_2

    .line 835
    :cond_3
    sget-object v9, Ll/ۨ֨ۗ;->ᩳ:Ll/ۨ֨ۗ;

    invoke-virtual {v12, v9}, Ll/֫֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    const/4 v9, 0x1

    goto :goto_1

    :cond_5
    if-nez v9, :cond_6

    :goto_2
    const/4 v6, 0x0

    move-object/from16 p0, v2

    goto/16 :goto_8

    .line 852
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۛ֨ۗ;

    .line 864
    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v9

    .line 865
    sget-object v10, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    if-eq v9, v10, :cond_f

    .line 866
    invoke-virtual {v9}, Ll/֫֨ۗ;->᩶()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {v9}, Ll/֫֨ۗ;->ܰ()Z

    move-result v11

    if-nez v11, :cond_7

    goto/16 :goto_6

    .line 869
    :cond_7
    invoke-virtual {v8}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v11

    if-eqz v11, :cond_f

    .line 870
    invoke-virtual {v11}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v12

    sget-object v13, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    if-ne v12, v13, :cond_8

    goto/16 :goto_6

    .line 256
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v12

    invoke-static {v1, v11, v12}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v12

    if-nez v12, :cond_9

    goto/16 :goto_6

    .line 877
    :cond_9
    invoke-virtual {v12}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    .line 878
    invoke-static {v13, v11}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v14

    const/4 v15, -0x1

    if-ne v14, v15, :cond_a

    goto/16 :goto_6

    .line 882
    :cond_a
    invoke-virtual {v11}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    .line 883
    sget-object v15, Ll/᩺ۢۗ;->ۢ:Ll/᩺ۢۗ;

    if-ne v7, v15, :cond_b

    .line 885
    move-object v7, v11

    check-cast v7, Ll/ۗۢۗ;

    invoke-virtual {v7}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫֨ۗ;

    .line 886
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v9

    .line 929
    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v8

    .line 930
    invoke-static {v9, v8, v7}, Ll/ܿ۬ۗ;->ۙ(Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۡۗ;

    move-result-object v7

    .line 931
    sget-object v8, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v7, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 887
    invoke-static {v1, v12, v14, v7}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;ILl/ᩳۡۗ;)V

    move-object/from16 p0, v2

    goto/16 :goto_5

    .line 890
    :cond_b
    sget-object v15, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-ne v7, v15, :cond_d

    .line 891
    move-object v7, v11

    check-cast v7, Ll/᩸ۢۗ;

    .line 892
    invoke-virtual {v7}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v15

    move-object/from16 p0, v2

    sget-object v2, Ll/ᩴۢۗ;->۬:Ll/ᩴۢۗ;

    if-ne v15, v2, :cond_e

    invoke-virtual {v7}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    const/4 v15, 0x2

    if-ne v2, v15, :cond_e

    const/4 v2, 0x1

    .line 894
    invoke-virtual {v7, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 895
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v15, v2, Ll/᩹֨ۗ;

    if-eqz v15, :cond_e

    .line 895
    check-cast v2, Ll/᩹֨ۗ;

    invoke-virtual {v2}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v15

    const-wide/16 v17, 0x1

    cmp-long v2, v15, v17

    if-nez v2, :cond_e

    .line 912
    new-instance v2, Ll/ᩳۡۗ;

    sget-object v9, Ll/᩺ۢۗ;->ܿۙ:Ll/᩺ۢۗ;

    const/4 v11, 0x1

    invoke-direct {v2, v9, v11}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 913
    invoke-virtual {v8}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 914
    sget-object v8, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 916
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v9

    .line 917
    sget-object v11, Ll/ۨ֨ۗ;->ᩳ:Ll/ۨ֨ۗ;

    invoke-virtual {v9, v11}, Ll/֫֨ۗ;->ۙ(Ll/ۨ֨ۗ;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 918
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    invoke-virtual {v2, v7}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    goto :goto_4

    .line 921
    :cond_c
    invoke-static {v2}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v2

    .line 922
    invoke-virtual {v2, v10}, Ll/֡֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    .line 923
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    sget-object v9, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    invoke-static {v7, v2, v9}, Ll/ܿ۬ۗ;->ۙ(Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۡۗ;

    move-result-object v2

    .line 924
    invoke-virtual {v2, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 897
    :goto_4
    invoke-static {v1, v12, v14, v2}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;ILl/ᩳۡۗ;)V

    goto :goto_5

    :cond_d
    move-object/from16 p0, v2

    .line 904
    :cond_e
    invoke-virtual {v8, v1}, Ll/ۛ֨ۗ;->ۙ(Ll/ۖۡۗ;)Ll/ۛ֨ۗ;

    move-result-object v2

    .line 929
    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v7

    .line 930
    invoke-static {v2, v7, v9}, Ll/ܿ۬ۗ;->ۙ(Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۡۗ;

    move-result-object v2

    .line 931
    sget-object v7, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 906
    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13, v14, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 907
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v11, v8, v2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    :goto_5
    const/4 v7, 0x1

    goto :goto_7

    :cond_f
    :goto_6
    move-object/from16 p0, v2

    :goto_7
    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_10
    move-object/from16 p0, v2

    move v6, v7

    :goto_8
    if-eqz v6, :cond_11

    const/4 v2, 0x1

    const/4 v5, 0x1

    :cond_11
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, p0

    goto/16 :goto_0

    :cond_12
    const/4 v2, 0x0

    if-nez v5, :cond_13

    return v2

    .line 820
    :cond_13
    invoke-static/range {p1 .. p1}, Ll/᩸۬ۗ;->ۤ(Ll/ۖۡۗ;)V

    .line 821
    invoke-virtual {v0, v1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 822
    invoke-virtual {v0, v1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    const/4 v0, 0x1

    return v0
.end method

.method public static ܳ(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 7

    .line 257
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֨ۗ;

    .line 258
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v3

    .line 259
    invoke-virtual {v3}, Ll/֫֨ۗ;->᩶()Z

    move-result v3

    if-nez v3, :cond_0

    .line 260
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 269
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 270
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ܳ᩵;

    .line 271
    invoke-interface {v5}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v5

    .line 272
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩶()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ll/֫֨ۗ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 273
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 276
    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    .line 279
    :cond_3
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 290
    invoke-virtual {v5}, Ll/֫֨ۗ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Ll/֫֨ۗ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 291
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩺()Z

    move-result v6

    if-eqz v6, :cond_5

    sget-object v5, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v5

    .line 292
    :goto_2
    iget-object v6, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    invoke-virtual {v6, p1, v2, v5}, Ll/ۢ۫᩵;->ۤ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    move-result-object v5

    .line 293
    sget-object v6, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    if-ne v5, v6, :cond_4

    .line 281
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Type inference failed for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ܿ֨ۗ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Raw type applied. Possible types: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    .line 72
    invoke-static {v3, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 282
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 281
    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    :goto_3
    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_7
    return v1
.end method

.method public static ᩴ(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 7

    .line 937
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ֨ۗ;

    .line 938
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v4

    .line 939
    invoke-virtual {v4}, Ll/֫֨ۗ;->᩶()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 952
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֨ۗ;

    .line 953
    invoke-virtual {v5}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 955
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    .line 956
    sget-object v6, Ll/᩺ۢۗ;->᩶:Ll/᩺ۢۗ;

    if-eq v5, v6, :cond_2

    sget-object v6, Ll/᩺ۢۗ;->ܿ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_1

    .line 957
    :cond_2
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/ܿ֨ۗ;->᩷(Ll/֫֨ۗ;)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    return v1

    .line 948
    :cond_4
    iget-object p0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    return v4
.end method

.method public static ᩷(Ll/ۖۡۗ;)Z
    .locals 1

    .line 107
    invoke-virtual {p0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    .line 108
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 11

    .line 417
    iget-object v0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    .line 418
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    .line 419
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿ֨ۗ;

    .line 433
    invoke-virtual {v4}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v4

    .line 434
    invoke-virtual {v4}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v4

    .line 435
    new-instance v6, Ll/֫ܳ᩵;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Ll/֫ܳ᩵;-><init>(I)V

    invoke-static {v4, v6}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    .line 438
    :cond_0
    new-instance v6, Ll/ۚ֡ۗ;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Ll/ۚ֡ۗ;-><init>(I)V

    invoke-static {v4, v6}, Ll/ۜ֫᩵;->᩷(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    move-result-object v6

    .line 439
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    .line 442
    :cond_1
    invoke-direct {p0, v4}, Ll/ۗܳ᩵;->ۙ(Ljava/util/LinkedHashSet;)Ll/ܶۚۗ;

    move-result-object v4

    sget-object v7, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {v4, v7}, Ll/ܶۚۗ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    .line 443
    invoke-virtual {v4}, Ll/֫֨ۗ;->᩺()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    .line 446
    :cond_2
    invoke-virtual {v4}, Ll/֫֨ۗ;->ۚ()Ljava/util/List;

    move-result-object v7

    .line 447
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-eq v8, v5, :cond_3

    :goto_1
    const/4 v4, 0x0

    goto :goto_3

    .line 451
    :cond_3
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 452
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵ܳ᩵;

    .line 453
    check-cast v8, Ll/֡ܳ᩵;

    .line 454
    invoke-virtual {v8}, Ll/֡ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v9

    .line 455
    iget-object v10, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    invoke-virtual {v10}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object v10

    invoke-virtual {v10, v5, v9}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v9

    .line 456
    invoke-virtual {v9}, Ll/ۜܳ᩵;->ᩴ()Z

    move-result v10

    if-nez v10, :cond_5

    sget-object v10, Ll/ۜܳ᩵;->ᩳ:Ll/ۜܳ᩵;

    if-ne v9, v10, :cond_4

    .line 457
    :cond_5
    invoke-virtual {v8}, Ll/֡ܳ᩵;->᩷()Ll/ۗۢۗ;

    move-result-object v8

    invoke-virtual {v8, v4}, Ll/ۗۢۗ;->ۙ(Ll/֫֨ۗ;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_6
    move v4, v7

    :goto_3
    add-int/2addr v3, v4

    goto/16 :goto_0

    :cond_7
    if-nez v3, :cond_8

    return v2

    .line 428
    :cond_8
    invoke-virtual {v0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 429
    invoke-virtual {v0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V

    return v5
.end method

.method public static synthetic ᩸(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۗܳ᩵;->ۤ(Ll/ۖۡۗ;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "FixTypesVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 12

    .line 72
    invoke-virtual {p1}, Ll/֫ۖۗ;->ܶۙ()Ll/ۢ۫᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ۗܳ᩵;->ܿ:Ll/ۢ۫᩵;

    .line 73
    iget-object v0, p0, Ll/ۗܳ᩵;->᩶:Ll/ۤ۫᩵;

    invoke-virtual {v0, p1}, Ll/ۤ۫᩵;->ۙ(Ll/֫ۖۗ;)V

    .line 74
    new-instance p1, Ll/ۚܳ᩵;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Ll/ۚܳ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v1, Ll/ܳۧ᩵;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ܳۧ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v3, Ll/ۧܳ᩵;

    invoke-direct {v3, v0, p0}, Ll/ۧܳ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v4, Ll/ܳۚ᩵;

    invoke-direct {v4, v2, p0}, Ll/ܳۚ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v5, Ll/᩻֡ۗ;

    invoke-direct {v5, v2, p0}, Ll/᩻֡ۗ;-><init>(ILjava/lang/Object;)V

    new-instance v6, Ll/᩻ܳ᩵;

    invoke-direct {v6, p0}, Ll/᩻ܳ᩵;-><init>(Ll/ۗܳ᩵;)V

    new-instance v7, Ll/ܺܳ᩵;

    invoke-direct {v7, v0, p0}, Ll/ܺܳ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v8, Ll/ܽܳ᩵;

    invoke-direct {v8, v0, p0}, Ll/ܽܳ᩵;-><init>(ILjava/lang/Object;)V

    new-instance v9, Ll/ۛۧ᩵;

    invoke-direct {v9, p0}, Ll/ۛۧ᩵;-><init>(Ll/ۗܳ᩵;)V

    new-instance v10, Ll/ܶܳ᩵;

    invoke-direct {v10, v0, p0}, Ll/ܶܳ᩵;-><init>(ILjava/lang/Object;)V

    const/16 v11, 0xa

    new-array v11, v11, [Ljava/util/function/Function;

    aput-object p1, v11, v0

    const/4 p1, 0x1

    aput-object v1, v11, p1

    const/4 p1, 0x2

    aput-object v3, v11, p1

    aput-object v4, v11, v2

    const/4 p1, 0x4

    aput-object v5, v11, p1

    const/4 p1, 0x5

    aput-object v6, v11, p1

    const/4 p1, 0x6

    aput-object v7, v11, p1

    const/4 p1, 0x7

    aput-object v8, v11, p1

    const/16 p1, 0x8

    aput-object v9, v11, p1

    const/16 p1, 0x9

    aput-object v10, v11, p1

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗܳ᩵;->ܰ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 2

    .line 89
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ll/ۗܳ᩵;->᩷(Ll/ۖۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۗܳ᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/function/Function;

    .line 94
    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Ll/ۗܳ᩵;->᩷(Ll/ۖۡۗ;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Types fix failed"

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method
