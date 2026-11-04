.class public final synthetic Ll/֫ܶ֫;
.super Ljava/lang/Object;
.source "F2T1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    const v0, 0x3cf65124

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    .line 0
    iput p2, p0, Ll/֫ܶ֫;->ܰ:I

    iput-object p3, p0, Ll/֫ܶ֫;->᩶:Ljava/lang/Object;

    iput p1, p0, Ll/֫ܶ֫;->ܿ:I

    iput-object p4, p0, Ll/֫ܶ֫;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u0730\u0730"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x17e1

    const p3, 0x2a8c7f3

    xor-int/2addr p2, p3

    const p3, 0x59ded33c

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x357f

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget p1, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u06d7\u06e1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x424f

    const p3, 0x80be538

    xor-int/2addr p2, p3

    const p3, -0xda6307

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a75\u06e0"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3f59

    const p3, -0x497f866a

    xor-int/2addr p2, p3

    const p3, -0x3c7611c2

    goto :goto_0

    :sswitch_2
    sget p1, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06d9\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x39

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x199b

    const p3, 0x426f1b9b

    xor-int/2addr p2, p3

    const p3, -0x1219eddc

    goto :goto_0

    :goto_2
    const-string p1, "\u06d9\u1a75"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2c0b

    const p3, 0x6fbfe861

    xor-int/2addr p2, p3

    const p3, 0x4cd151e9    # 1.09743944E8f

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06e1\u06e0"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xf

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6e1f

    const p3, -0x2608845b

    xor-int/2addr p2, p3

    const p3, -0x56fc2946

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a79\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6dbb

    const p3, -0xfd12b84

    xor-int/2addr p2, p3

    const p3, 0x3b971295

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f01e87b -> :sswitch_1
        -0x77980101 -> :sswitch_2
        -0x4c1c1702 -> :sswitch_4
        -0x22da8736 -> :sswitch_3
        0x12331ef6 -> :sswitch_5
        0x1be34084 -> :sswitch_2
        0x1c509119 -> :sswitch_4
        0x2e1aa2c5 -> :sswitch_5
        0x4c664a75 -> :sswitch_0
        0x518b7f57 -> :sswitch_1
        0x5612ea5d -> :sswitch_0
        0x5f132e0f -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x1c706f8b

    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v7, "\u06e1\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x5

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x74cd

    const v9, -0x32da5ff9

    xor-int/2addr v8, v9

    const v9, -0x334dc343    # -9.3447656E7f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x2f9d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    sget v7, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v7, :cond_3

    goto/16 :goto_1

    .line 0
    :sswitch_0
    sget v7, Ll/֫֡;->֫ۙۖ:I

    if-gtz v7, :cond_4

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget-boolean v7, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v7, :cond_7

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v7

    if-ltz v7, :cond_a

    goto/16 :goto_4

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/֫ܶ֫;->֡:Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Ll/ܽ᩶᩷;->ۙ(Ll/ܽ᩶᩷;ILjava/lang/Object;)V

    return-void

    :sswitch_6
    iget v3, p0, Ll/֫ܶ֫;->ܿ:I

    sget v7, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v7, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v7, "\u06dc\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x43

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x29bb

    const v9, -0x19ee6c11

    xor-int/2addr v8, v9

    const v9, 0x223bd24a

    goto :goto_0

    :sswitch_7
    iget-object v2, p0, Ll/֫ܶ֫;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ܽ᩶᩷;

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v7, "\u073f\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x16a7

    const v9, 0x65e2aaeb

    xor-int/2addr v8, v9

    const v9, 0x4f42ee24

    goto :goto_0

    :sswitch_8
    check-cast v1, Ll/ۧܶ֫;

    iget v2, p0, Ll/֫ܶ֫;->ܿ:I

    invoke-static {v0, v2, v1}, Ll/ۡܶ֫;->ۙ(Ll/ۡܶ֫;ILl/ۧܶ֫;)V

    return-void

    :sswitch_9
    iget-object v1, p0, Ll/֫ܶ֫;->֡:Ljava/lang/Object;

    .line 2
    sget v7, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v7, :cond_2

    goto :goto_1

    :cond_2
    const-string v7, "\u0733\u1a79"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x59

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5bdd

    const v9, 0x41f4d51f

    xor-int/2addr v8, v9

    const v9, 0x754b09c3

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u05a1\u06e2"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x77

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7123

    const v9, 0x49622b0

    xor-int/2addr v8, v9

    const v9, -0x13f44b8d

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v7, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v7, :cond_5

    :cond_4
    const-string v7, "\u06d7\u1a77"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x245d

    const v9, 0x6923f3f2

    xor-int/2addr v8, v9

    const v9, -0x5a9989f7

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u1a73\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x786b

    const v9, -0x73cd76f7

    xor-int/2addr v8, v9

    const v9, -0x27cd227e

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v7, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v7, :cond_6

    :goto_1
    const-string v7, "\u06e4\u1a73"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1a53

    const v9, 0x5bb27d25

    xor-int/2addr v8, v9

    const v9, -0x64fa4faf

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u073d\u06ec"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xe4f

    const v9, 0x46a9c0fe

    xor-int/2addr v8, v9

    const v9, 0x387db0f9

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_8

    :cond_7
    :goto_2
    const-string v7, "\u1a7b\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x57

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5273

    const v9, -0x3513199e    # -7762737.0f

    xor-int/2addr v8, v9

    const v9, -0x594f17d

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06d8\u06dc"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2fd3

    const v9, -0xc530490

    xor-int/2addr v8, v9

    const v9, -0x1caa3724

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v7, Ll/۬;->᩸ۜ᩹:I

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_9
    const-string v7, "\u06d6\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2229

    const v9, -0x260c45b2

    xor-int/2addr v8, v9

    const v9, -0x4da39df8

    goto/16 :goto_0

    :sswitch_e
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_3
    const-string v7, "\u06d6\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x57

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x14dd

    const v9, -0x479a1de5

    xor-int/2addr v8, v9

    const v9, 0xb944abf    # 5.711999E-32f

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06da\u06e7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x16f3

    const v9, 0x4b7fcf21    # 1.6764705E7f

    xor-int/2addr v8, v9

    const v9, 0x5152a0a4

    goto/16 :goto_0

    .line 0
    :sswitch_f
    iget-object v0, p0, Ll/֫ܶ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۡܶ֫;

    .line 4
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_c

    :goto_4
    const-string v7, "\u06e8\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2ff

    const v9, -0x23ccd7fb

    xor-int/2addr v8, v9

    const v9, 0x639ca7d5

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u05ab\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2a15

    const v9, -0x64cd928e

    xor-int/2addr v8, v9

    const v9, 0x6a0b6c48

    goto/16 :goto_0

    .line 0
    :sswitch_10
    iget v7, p0, Ll/֫ܶ֫;->ܰ:I

    packed-switch v7, :pswitch_data_0

    const-string v7, "\u1a75\u073d"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x57

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x340d

    const v9, 0x45589553

    xor-int/2addr v8, v9

    const v9, -0x149cdb82

    goto/16 :goto_0

    :pswitch_0
    const-string v7, "\u073a\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7c91

    const v9, 0x1c59522f

    xor-int/2addr v8, v9

    const v9, -0x4e31bbd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e3ad864 -> :sswitch_1
        -0x7c426604 -> :sswitch_4
        -0x6900fa00 -> :sswitch_c
        -0x5b23d276 -> :sswitch_2
        -0x56635508 -> :sswitch_9
        -0x50a93e66 -> :sswitch_a
        -0x4d65fbb6 -> :sswitch_5
        -0x4a2a031e -> :sswitch_7
        -0x427b019b -> :sswitch_e
        -0x41e4cc76 -> :sswitch_c
        -0x3f6b6351 -> :sswitch_10
        -0x3986123b -> :sswitch_d
        -0x38095333 -> :sswitch_b
        -0x362255ac -> :sswitch_8
        -0x319b4887 -> :sswitch_3
        -0x284fa0db -> :sswitch_f
        -0x11fbb96b -> :sswitch_6
        -0x2dfb316 -> :sswitch_e
        0x28d1e43 -> :sswitch_0
        0xb7d2b0e -> :sswitch_a
        0xb9eeb7c -> :sswitch_0
        0x1f73d37c -> :sswitch_2
        0x28825ed2 -> :sswitch_9
        0x2a028cfa -> :sswitch_b
        0x36e7c7cd -> :sswitch_10
        0x473fc379 -> :sswitch_4
        0x4be3770c -> :sswitch_5
        0x5d2dc100 -> :sswitch_d
        0x63dfb9a5 -> :sswitch_1
        0x6b8dbd8e -> :sswitch_3
        0x6be1b6e5 -> :sswitch_6
        0x73a65bda -> :sswitch_8
        0x7a6973e0 -> :sswitch_f
        0x7c937c44 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
