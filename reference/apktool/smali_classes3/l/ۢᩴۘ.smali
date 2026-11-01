.class public final Ll/ۢᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final synthetic ۖ:Ll/ۙ۠ۘ;

.field public ۙ:I

.field public final ۨ:Ljava/util/ArrayList;

.field public final ܰ:I


# direct methods
.method public constructor <init>(Ll/ۙ۠ۘ;Ljava/util/ArrayList;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x319da835

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06eb\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x523

    const v7, -0x1eda684d

    xor-int/2addr v6, v7

    const v7, 0x2ceb03b9

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x59cf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/4 p1, 0x0

    .line 396
    iput p1, p0, Ll/ۢᩴۘ;->ۙ:I

    return-void

    :sswitch_0
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06d8\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5c0d

    const v7, -0x2119a9e2

    xor-int/2addr v6, v7

    const v7, -0xb65d764

    goto :goto_0

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v5, :cond_a

    goto/16 :goto_1

    .line 50
    :sswitch_2
    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v5, :cond_8

    goto/16 :goto_1

    .line 85
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 390
    :sswitch_5
    iput v1, p0, Ll/ۢᩴۘ;->ܰ:I

    .line 395
    new-instance v5, Ljava/util/ArrayList;

    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-direct {v5, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, p0, Ll/ۢᩴۘ;->ۨ:Ljava/util/ArrayList;

    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06d8\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7bf1

    const v7, -0x4e3df5bc

    xor-int/2addr v6, v7

    const v7, -0x5455e7fe

    goto :goto_0

    .line 390
    :sswitch_6
    invoke-static {v0}, Ll/֡᩶;->ᩴ۠֫(Ljava/lang/Object;)I

    move-result v1

    .line 297
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v5

    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u073f\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4c83

    const v7, 0x194cbb62

    xor-int/2addr v6, v7

    const v7, 0x73fba86c

    goto/16 :goto_0

    .line 269
    :sswitch_7
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u05ab\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c43

    const v7, -0x393f8ed8

    xor-int/2addr v6, v7

    const v7, -0x10318e0c

    goto/16 :goto_0

    .line 184
    :sswitch_8
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_1
    const-string v5, "\u06e7\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x17b9

    const v7, -0x6400b77c

    xor-int/2addr v6, v7

    const v7, 0xa835b15

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u05a8\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x45b1

    const v7, -0x2e653746

    xor-int/2addr v6, v7

    const v7, 0x29a5983d

    goto/16 :goto_0

    .line 189
    :sswitch_9
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u073f\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x468f

    const v7, 0x22bc5b2f

    xor-int/2addr v6, v7

    const v7, -0x2374abe6

    goto/16 :goto_0

    .line 41
    :sswitch_a
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06d6\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x138b

    const v7, 0x1046b44d

    xor-int/2addr v6, v7

    const v7, 0x385622da

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u1a77\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2b75

    const v7, 0x76de9e9e

    xor-int/2addr v6, v7

    const v7, -0x5f46ecfe

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e2\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1e71

    const v7, 0x39917779

    xor-int/2addr v6, v7

    const v7, 0xc68a638

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06da\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b17

    const v7, 0x6596a007

    xor-int/2addr v6, v7

    const v7, -0x660b9df4

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u0730\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4541

    const v7, 0x4c197a24    # 4.0233104E7f

    xor-int/2addr v6, v7

    const v7, 0x5203c20c

    goto/16 :goto_0

    .line 394
    :sswitch_d
    iput-object p1, p0, Ll/ۢᩴۘ;->ۖ:Ll/ۙ۠ۘ;

    .line 390
    invoke-static {p1}, Ll/ۙ۠ۘ;->ܶ(Ll/ۙ۠ۘ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v5

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u06d7\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1c45

    const v7, 0x6a9d22bd

    xor-int/2addr v6, v7

    const v7, 0x7449cee3

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a75\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5659

    const v7, 0x6f9fcb6c

    xor-int/2addr v6, v7

    const v7, -0x38095b23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d4d2c98 -> :sswitch_b
        -0x7b16fb43 -> :sswitch_8
        -0x70a128b4 -> :sswitch_9
        -0x6068d70b -> :sswitch_c
        -0x5fef749a -> :sswitch_a
        -0x5ddfa010 -> :sswitch_3
        -0x5cb54483 -> :sswitch_5
        -0x56247332 -> :sswitch_6
        -0x3e69c40e -> :sswitch_2
        -0x38c9b462 -> :sswitch_4
        -0x1487e676 -> :sswitch_8
        -0x6eb5ade -> :sswitch_7
        0x3419607 -> :sswitch_d
        0x726ef4f -> :sswitch_b
        0x27237c02 -> :sswitch_4
        0x2d465038 -> :sswitch_0
        0x2d946192 -> :sswitch_2
        0x311e9af9 -> :sswitch_6
        0x3c881e37 -> :sswitch_3
        0x3fb2fbdf -> :sswitch_1
        0x49f23ad0 -> :sswitch_7
        0x4bc84a19 -> :sswitch_0
        0x549249a1 -> :sswitch_d
        0x57fdfe4f -> :sswitch_a
        0x60347ba2 -> :sswitch_9
        0x630b0fbd -> :sswitch_5
        0x6738c4f0 -> :sswitch_1
        0x691f41d6 -> :sswitch_c
    .end sparse-switch
.end method
