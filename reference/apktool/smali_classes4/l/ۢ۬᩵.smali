.class public final Ll/ۢ۬᩵;
.super Ljava/lang/Object;
.source "D97F"

# interfaces
.implements Ll/ۜ۬᩵;
.implements Ll/ۛ۬᩵;


# instance fields
.field public ܰ:Ll/᩻۠᩵;

.field public final synthetic ܿ:Ll/ۡ۬᩵;

.field public ᩶:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۡ۬᩵;)V
    .locals 0

    .line 1596
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۬᩵;->ܿ:Ll/ۡ۬᩵;

    .line 1602
    invoke-static {}, Ll/۠۬᩵;->ۚ()Ll/ۜ᩷ۨ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1698
    iget-object v0, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1699
    invoke-static {}, Ll/۠۬᩵;->ۚ()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 1700
    invoke-static {}, Ll/۠۬᩵;->ۚ()Ll/ۜ᩷ۨ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1702
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    sget v0, Ll/ۡ۬᩵;->᩷:I

    .line 1760
    iget-object v0, p0, Ll/ۢ۬᩵;->ܿ:Ll/ۡ۬᩵;

    invoke-virtual {v0}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ll/᩸ۙۨ;

    const-string v1, "Channel was closed"

    .line 832
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 1702
    :cond_1
    sget v1, Ll/۠᩷ۨ;->ۙ:I

    throw v0

    .line 1699
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ll/ۙۢ᩵;)Ljava/lang/Object;
    .locals 12

    .line 1618
    invoke-static {}, Ll/ۡ۬᩵;->۫()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    .line 909
    iget-object v7, p0, Ll/ۢ۬᩵;->ܿ:Ll/ۡ۬᩵;

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 913
    :cond_0
    :goto_0
    invoke-virtual {v7}, Ll/ۡ۬᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1641
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1642
    invoke-virtual {v7}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1643
    :cond_1
    sget v0, Ll/۠᩷ۨ;->ۙ:I

    throw p1

    .line 913
    :cond_2
    invoke-static {}, Ll/ۡ۬᩵;->ۚ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    .line 916
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v8

    .line 918
    sget v1, Ll/۠۬᩵;->᩹:I

    int-to-long v1, v1

    div-long v3, v8, v1

    .line 919
    rem-long v1, v8, v1

    long-to-int v10, v1

    .line 922
    iget-wide v1, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_4

    .line 924
    invoke-static {v7, v3, v4, v0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, v1

    :cond_4
    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, v0

    move v3, v10

    move-wide v4, v8

    .line 931
    invoke-static/range {v1 .. v6}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 933
    invoke-static {}, Ll/۠۬᩵;->ܽ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-eq v1, v2, :cond_16

    .line 939
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_5

    .line 946
    invoke-virtual {v7}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v1

    cmp-long v3, v8, v1

    if-gez v3, :cond_0

    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    goto :goto_0

    .line 949
    :cond_5
    invoke-static {}, Ll/۠۬᩵;->ܶ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_15

    .line 337
    invoke-static {p1}, Ll/۬ۧۤ;->ۙ(Ll/ۙۢ᩵;)Ll/ۙۢ᩵;

    move-result-object p1

    .line 351
    instance-of v1, p1, Ll/᩻᩷ۨ;

    const/4 v11, 0x0

    if-nez v1, :cond_7

    .line 352
    new-instance v1, Ll/᩻۠᩵;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ll/᩻۠᩵;-><init>(Ll/ۙۢ᩵;I)V

    :cond_6
    :goto_1
    move-object p1, v1

    goto :goto_3

    .line 368
    :cond_7
    move-object v1, p1

    check-cast v1, Ll/᩻᩷ۨ;

    invoke-virtual {v1}, Ll/᩻᩷ۨ;->ᩴ()Ll/᩻۠᩵;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ll/᩻۠᩵;->֫()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    move-object v1, v11

    :goto_2
    if-nez v1, :cond_6

    .line 369
    :cond_9
    new-instance v1, Ll/᩻۠᩵;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Ll/᩻۠᩵;-><init>(Ll/ۙۢ᩵;I)V

    goto :goto_1

    .line 1596
    :goto_3
    :try_start_0
    iput-object p1, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    move-object v1, v7

    move-object v2, v0

    move v3, v10

    move-wide v4, v8

    move-object v6, p0

    .line 987
    invoke-static/range {v1 .. v6}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 989
    invoke-static {}, Ll/۠۬᩵;->ܽ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_a

    .line 740
    :goto_4
    invoke-virtual {p0, v0, v10}, Ll/ۢ۬᩵;->ۙ(Ll/ۤۙۨ;I)V

    goto/16 :goto_8

    .line 992
    :cond_a
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_14

    .line 993
    invoke-virtual {v7}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v1

    cmp-long v3, v8, v1

    if-gez v3, :cond_b

    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    .line 881
    :cond_b
    invoke-static {}, Ll/ۡ۬᩵;->۫()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    .line 909
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 913
    :cond_c
    :goto_5
    invoke-virtual {v7}, Ll/ۡ۬᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1680
    iget-object v0, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 1681
    iput-object v11, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    .line 1683
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1687
    invoke-virtual {v7}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_d

    .line 1689
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 1691
    :cond_d
    invoke-static {v1}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;)V

    goto :goto_8

    .line 913
    :cond_e
    invoke-static {}, Ll/ۡ۬᩵;->ۚ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    .line 916
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v8

    .line 918
    sget v1, Ll/۠۬᩵;->᩹:I

    int-to-long v1, v1

    div-long v3, v8, v1

    .line 919
    rem-long v1, v8, v1

    long-to-int v10, v1

    .line 922
    iget-wide v1, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_10

    .line 924
    invoke-static {v7, v3, v4, v0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_f

    goto :goto_5

    :cond_f
    move-object v0, v1

    :cond_10
    move-object v1, v7

    move-object v2, v0

    move v3, v10

    move-wide v4, v8

    move-object v6, p0

    .line 931
    invoke-static/range {v1 .. v6}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 933
    invoke-static {}, Ll/۠۬᩵;->ܽ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_11

    goto :goto_4

    .line 939
    :cond_11
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_12

    .line 946
    invoke-virtual {v7}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v1

    cmp-long v3, v8, v1

    if-gez v3, :cond_c

    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    goto :goto_5

    .line 949
    :cond_12
    invoke-static {}, Ll/۠۬᩵;->ܶ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-eq v1, v2, :cond_13

    .line 958
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    .line 1596
    :goto_6
    iput-object v1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    goto :goto_7

    .line 952
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    .line 905
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1002
    :cond_14
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    goto :goto_6

    .line 1596
    :goto_7
    iput-object v11, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    .line 1667
    invoke-virtual {p1, v11}, Ll/᩻۠᩵;->ۙ(Ll/ۗ֨᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    :goto_8
    invoke-virtual {p1}, Ll/᩻۠᩵;->ܳ()Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object v0, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    return-object p1

    :catchall_0
    move-exception v0

    .line 343
    invoke-virtual {p1}, Ll/᩻۠᩵;->ۚ()V

    .line 344
    throw v0

    .line 958
    :cond_15
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    .line 1627
    iput-object v1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 20
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 937
    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    .line 1631
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ()V
    .locals 2

    .line 1726
    iget-object v0, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 1727
    iput-object v1, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    .line 1731
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1735
    iget-object v1, p0, Ll/ۢ۬᩵;->ܿ:Ll/ۡ۬᩵;

    invoke-virtual {v1}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1737
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 1739
    :cond_0
    invoke-static {v1}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/ۤۙۨ;I)V
    .locals 1

    .line 1674
    iget-object v0, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ll/᩻۠᩵;->ۙ(Ll/ۤۙۨ;I)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/۬᩷ۤ;)Z
    .locals 2

    .line 1710
    iget-object v0, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 1711
    iput-object v1, p0, Ll/ۢ۬᩵;->ܰ:Ll/᩻۠᩵;

    .line 1713
    iput-object p1, p0, Ll/ۢ۬᩵;->᩶:Ljava/lang/Object;

    .line 1717
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p1, v1}, Ll/۠۬᩵;->ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;Ll/ۗ֨᩵;)Z

    move-result p1

    return p1
.end method
