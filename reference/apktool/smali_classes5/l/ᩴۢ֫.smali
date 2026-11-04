.class public final synthetic Ll/ᩴۢ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۚۢ֫;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۚۢ֫;I)V
    .locals 6

    const v0, -0x1a42435c    # -1.1200088E23f

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073f\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f8d

    const v5, -0x4114b054

    xor-int/2addr v4, v5

    const v5, -0x549789c8

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3b43

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v3, :cond_9

    goto/16 :goto_1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_2

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput p2, p0, Ll/ᩴۢ֫;->᩶:I

    return-void

    .line 1
    :sswitch_5
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06d8\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67cb

    const v5, 0x2258e66b

    xor-int/2addr v4, v5

    const v5, -0x29776371

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d6\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b87

    const v5, -0x288b8b03

    xor-int/2addr v4, v5

    const v5, 0x7d4bd1ec

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x17af

    const v5, 0x74c92b3d

    xor-int/2addr v4, v5

    const v5, 0xd57669e

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e1\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x658d

    const v5, 0x407c7152

    xor-int/2addr v4, v5

    const v5, 0x3160d9aa

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e4\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c27

    const v5, -0x546643b0

    xor-int/2addr v4, v5

    const v5, 0x6679506a

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e1\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x23e3

    const v5, -0x7d5e99a4

    xor-int/2addr v4, v5

    const v5, -0x6534f9e4

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06df\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3505

    const v5, 0xc4a3d8f

    xor-int/2addr v4, v5

    const v5, -0x2ff9540b

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2259

    const v5, -0x3bd5ce8a

    xor-int/2addr v4, v5

    const v5, 0x5af8cebd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a8\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1245

    const v5, 0x4c0864ba    # 3.575473E7f

    xor-int/2addr v4, v5

    const v5, -0x3166cab5

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1767

    const v5, 0x1a149dc

    xor-int/2addr v4, v5

    const v5, -0xbb44c18

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d21

    const v5, 0x10725814

    xor-int/2addr v4, v5

    const v5, -0x2e9c7c85

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06e7\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3485

    const v5, 0x6416c909

    xor-int/2addr v4, v5

    const v5, 0x10431a9

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2269

    const v5, 0x2b614a86

    xor-int/2addr v4, v5

    const v5, -0x19140ff6

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴۢ֫;->ܰ:Ll/ۚۢ֫;

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ac9

    const v5, 0x5ed4eaaf

    xor-int/2addr v4, v5

    const v5, 0x6062c20f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x550b

    const v5, 0x34dc9c32

    xor-int/2addr v4, v5

    const v5, -0x5463a29

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a5c71a3 -> :sswitch_a
        -0x779aa11d -> :sswitch_2
        -0x63dbcdd0 -> :sswitch_7
        -0x61195fd0 -> :sswitch_4
        -0x556e5ad0 -> :sswitch_9
        -0x517a3357 -> :sswitch_c
        -0x37146d42 -> :sswitch_3
        -0x2e008f0a -> :sswitch_e
        -0x2d5ac4b9 -> :sswitch_8
        -0x2f7f970 -> :sswitch_e
        0xcc6c4a3 -> :sswitch_8
        0x12abed8c -> :sswitch_7
        0x134ed742 -> :sswitch_0
        0x16ebf19b -> :sswitch_d
        0x1aec04e2 -> :sswitch_9
        0x279a9f85 -> :sswitch_b
        0x2db1b05d -> :sswitch_6
        0x31004e5e -> :sswitch_2
        0x32148151 -> :sswitch_5
        0x3feabacb -> :sswitch_a
        0x45d1e0c1 -> :sswitch_3
        0x48ac5adf -> :sswitch_4
        0x496a2667 -> :sswitch_1
        0x54c21782 -> :sswitch_b
        0x59d89110 -> :sswitch_6
        0x62cca6f9 -> :sswitch_d
        0x62f8ad6f -> :sswitch_0
        0x6c929d9f -> :sswitch_1
        0x6dccb25f -> :sswitch_c
        0x6ddbd6d5 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, 0x3a0d2fe4

    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    const-string v8, "\u1a7b\u06da"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3511

    const v10, 0x7bc1a3c0

    xor-int/2addr v9, v10

    const v10, -0x14961169

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x5259

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 923
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v8, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v8, "\u05ab\u073f"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x16d

    const v10, -0x60d8027c

    xor-int/2addr v9, v10

    const v10, 0x556dbeab

    goto :goto_0

    .line 375
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v8

    if-eqz v8, :cond_b

    goto/16 :goto_3

    .line 369
    :sswitch_2
    sget v8, Ll/ۧ;->ۨۗܰ:I

    if-ltz v8, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v8, :cond_5

    goto/16 :goto_5

    .line 101
    :sswitch_4
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    :sswitch_5
    return-void

    .line 566
    :sswitch_6
    :try_start_0
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 567
    invoke-static {v2}, Ll/۟ۢ֫;->᩵(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v8

    .line 1305
    iget-object v8, v8, Ll/ۨۢ֫;->ۙ:Ll/ۗۢ֫;

    iget-object v8, v8, Ll/ۗۢ֫;->ᩴ:Ll/ۢۖ᩹;

    .line 567
    invoke-static {v2}, Ll/۟ۢ֫;->᩵(Ll/۟ۢ֫;)Ll/ۨۢ֫;

    move-result-object v9

    iget-object v9, v9, Ll/ۨۢ֫;->᩸:Ll/᩻ᩳ᩷;

    invoke-static {v2}, Ll/۟ۢ֫;->ܺ(Ll/۟ۢ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v10

    invoke-static {v2, v8, v9, v10, v0}, Ll/۟ۢ֫;->ۙ(Ll/۟ۢ֫;Ll/ۢۖ᩹;Ll/᩻ᩳ᩷;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v8, "\u1a7a\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x71

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5289

    const v10, -0x6a293baa

    xor-int/2addr v9, v10

    const v10, 0x7f6b7aa0

    goto :goto_0

    .line 566
    :sswitch_7
    iget-object v2, v1, Ll/ۚۢ֫;->᩻:Ll/۟ۢ֫;

    const-wide/16 v3, 0x64

    const-string v8, "\u1a73\u05ab"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x47

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6999

    const v10, -0x302ff898

    xor-int/2addr v9, v10

    const v10, 0x7f12b598

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Ll/ᩴۢ֫;->ܰ:Ll/ۚۢ֫;

    .line 738
    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v8, :cond_1

    goto :goto_1

    :cond_1
    const-string v8, "\u06e4\u06e0"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x298d

    const v10, -0x5fc1e3cd

    xor-int/2addr v9, v10

    const v10, -0x2b33a9e9

    goto/16 :goto_0

    .line 891
    :sswitch_9
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v8

    if-eqz v8, :cond_2

    :goto_1
    const-string v8, "\u05a1\u0730"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x306b

    const v10, -0x4b4ca4fc

    xor-int/2addr v9, v10

    const v10, 0x47686c6a

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u06eb\u06e0"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x53bd

    const v10, -0x53c6e7ce

    xor-int/2addr v9, v10

    const v10, 0x7fd58f2d

    goto/16 :goto_0

    :sswitch_a
    sget v8, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u06e7\u1a76"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3f9

    const v10, 0x3aed860e

    xor-int/2addr v9, v10

    const v10, -0xa38fee3

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v8, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v8, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v8, "\u1a75\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x3d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x26c7

    const v10, -0x4daa56cd

    xor-int/2addr v9, v10

    const v10, 0x76774a5c

    goto/16 :goto_0

    .line 210
    :sswitch_c
    sget v8, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v8, :cond_6

    :cond_5
    :goto_2
    const-string v8, "\u06da\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x23

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3a27

    const v10, 0x5cd6234

    xor-int/2addr v9, v10

    const v10, -0x2d959013

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e4\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x3f

    xor-int v9, v8, v7

    mul-int/lit8 v9, v9, 0x61

    const v10, 0x18287c2c

    xor-int/2addr v9, v10

    const v10, -0x7aea015f

    goto/16 :goto_0

    .line 410
    :sswitch_d
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    const-string v8, "\u06dc\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x21

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6e2f

    const v10, 0x3eb5eece

    xor-int/2addr v9, v10

    const v10, -0x4cc22c91

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v8, :cond_8

    goto :goto_3

    :cond_8
    const-string v8, "\u06da\u073d"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x57

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4257

    const v10, -0x171a1e92

    xor-int/2addr v9, v10

    const v10, 0x4d4fed3b    # 2.1802693E8f

    goto/16 :goto_0

    .line 96
    :sswitch_f
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v8

    if-eqz v8, :cond_a

    :cond_9
    :goto_3
    const-string v8, "\u1a78\u06df"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5c89

    const v10, -0x427e96f0

    xor-int/2addr v9, v10

    const v10, 0x264f5772

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u073f\u073d"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x25

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xfcf

    const v10, -0x7b736995

    xor-int/2addr v9, v10

    const v10, -0x235e9d15

    goto/16 :goto_0

    .line 1054
    :sswitch_10
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v8

    if-eqz v8, :cond_c

    :cond_b
    :goto_4
    const-string v8, "\u073a\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x73

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7de9

    const v10, 0x71084b5c

    xor-int/2addr v9, v10

    const v10, -0x4158387

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06dc\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x12e1

    const v10, 0x5ba3e922

    xor-int/2addr v9, v10

    const v10, 0x5ea5b912

    goto/16 :goto_0

    .line 2
    :sswitch_11
    iget v0, p0, Ll/ᩴۢ֫;->᩶:I

    .line 897
    sget v8, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v8, :cond_d

    :goto_5
    const-string v8, "\u06d8\u1a79"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x6f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5235

    const v10, -0x56fa1f2d

    xor-int/2addr v9, v10

    const v10, 0x7573bb72

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d8\u06dc"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5243

    const v10, 0x371cd702

    xor-int/2addr v9, v10

    const v10, 0x70300420

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ca0fcfa -> :sswitch_1
        -0x79fc6d61 -> :sswitch_d
        -0x6c347a26 -> :sswitch_a
        -0x650e68ab -> :sswitch_5
        -0x5618a6df -> :sswitch_8
        -0x55a03fb7 -> :sswitch_7
        -0x5279a7ab -> :sswitch_0
        -0x4f9e26f1 -> :sswitch_5
        -0x45996110 -> :sswitch_2
        -0x3e7049da -> :sswitch_2
        -0x35f04847 -> :sswitch_e
        -0x2f6af856 -> :sswitch_c
        -0x2e5cb738 -> :sswitch_8
        -0x27d08024 -> :sswitch_11
        -0x236922ec -> :sswitch_b
        -0x17d4ab4f -> :sswitch_6
        -0x14c31e40 -> :sswitch_9
        -0xf8198b4 -> :sswitch_3
        -0xd578ac9 -> :sswitch_10
        -0xd54128e -> :sswitch_b
        -0xcdc4534 -> :sswitch_e
        -0xbd608fd -> :sswitch_10
        0x5be2df4 -> :sswitch_4
        0xa422068 -> :sswitch_7
        0x16cdfe09 -> :sswitch_f
        0x1b4da1b1 -> :sswitch_3
        0x20392ff2 -> :sswitch_4
        0x23f5fa2b -> :sswitch_9
        0x32662015 -> :sswitch_6
        0x3d58de71 -> :sswitch_11
        0x40ed3238 -> :sswitch_d
        0x45e2ce17 -> :sswitch_a
        0x554a0b7a -> :sswitch_1
        0x6c5bb924 -> :sswitch_c
        0x6da41140 -> :sswitch_0
        0x7469aa74 -> :sswitch_f
    .end sparse-switch
.end method
