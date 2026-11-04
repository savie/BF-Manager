.class public final synthetic Ll/ۤۤۧ;
.super Ljava/lang/Object;
.source "650G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/۫ۤۧ;

.field public final synthetic ᩶:Ll/۫ۜ֫;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۤۧ;Ll/۫ۜ֫;)V
    .locals 6

    const v0, 0x59ad1e48

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x676b

    const v5, 0x658e73d3

    xor-int/2addr v4, v5

    const v5, 0x5462e616

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6381

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_7

    goto/16 :goto_3

    .line 3
    :sswitch_0
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_9

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a74\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x573f

    const v5, -0x6ce5d056

    xor-int/2addr v4, v5

    const v5, 0x7c1acbc7

    goto :goto_0

    :sswitch_2
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v3, "\u06e0\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2bf3

    const v5, -0x4e02643b

    xor-int/2addr v4, v5

    const v5, -0x6e7c72c

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۤۤۧ;->᩶:Ll/۫ۜ֫;

    return-void

    .line 2
    :sswitch_6
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e17

    const v5, -0x754f90eb

    xor-int/2addr v4, v5

    const v5, -0x1b5a9587

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u073f\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5091

    const v5, 0x7a374ba6

    xor-int/2addr v4, v5

    const v5, -0x7d24e6ef

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7bcb

    const v5, 0x12dbc5bf

    xor-int/2addr v4, v5

    const v5, -0x6e3f24b

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06d8\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3693

    const v5, 0x70d92b34

    xor-int/2addr v4, v5

    const v5, 0x6c8f844a

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u06dc\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x38ff

    const v5, -0x33608911    # -8.360537E7f

    xor-int/2addr v4, v5

    const v5, -0x11a692a3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x384f

    const v5, -0x70d45939

    xor-int/2addr v4, v5

    const v5, 0x21e8704

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5111

    const v5, 0x33362ba7

    xor-int/2addr v4, v5

    const v5, 0x2900cc1

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4245

    const v5, -0x116addf

    xor-int/2addr v4, v5

    const v5, 0x7d16c26e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5139

    const v5, -0x3adf43f7

    xor-int/2addr v4, v5

    const v5, 0x7a26a0f6

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_b

    :goto_3
    const-string v3, "\u06d9\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7699

    const v5, 0x4112c327

    xor-int/2addr v4, v5

    const v5, -0x4f928ce0

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0730\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ddb

    const v5, 0x73d4c1a2

    xor-int/2addr v4, v5

    const v5, 0x19be27a9

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۤۤۧ;->ܰ:Ll/۫ۤۧ;

    .line 1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b73

    const v5, -0x5f12a869

    xor-int/2addr v4, v5

    const v5, 0x4257f1b9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69a3

    const v5, 0x409685b1

    xor-int/2addr v4, v5

    const v5, -0x4b26d48a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c3a59ee -> :sswitch_2
        -0x6681936a -> :sswitch_2
        -0x656d6538 -> :sswitch_0
        -0x5b7a9c32 -> :sswitch_a
        -0x5229a4b5 -> :sswitch_d
        -0x482b73f3 -> :sswitch_e
        -0x472042dd -> :sswitch_b
        -0x3acd74c5 -> :sswitch_b
        -0x24710741 -> :sswitch_1
        -0x1b300d04 -> :sswitch_0
        -0xf9a14d2 -> :sswitch_8
        -0x99d02bb -> :sswitch_c
        -0x2e4b17d -> :sswitch_6
        0x149afd8f -> :sswitch_e
        0x16c4c775 -> :sswitch_3
        0x16f57779 -> :sswitch_4
        0x1a61885e -> :sswitch_5
        0x37ec3fbd -> :sswitch_7
        0x3897f6df -> :sswitch_d
        0x423d699f -> :sswitch_5
        0x42c25edc -> :sswitch_6
        0x4a169533 -> :sswitch_9
        0x5896f034 -> :sswitch_c
        0x5a16905e -> :sswitch_3
        0x5c6acc1b -> :sswitch_7
        0x62556637 -> :sswitch_9
        0x63c25665 -> :sswitch_4
        0x688b3eb9 -> :sswitch_1
        0x6f58fc33 -> :sswitch_8
        0x7b6d43a9 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۤۤۧ;->ܰ:Ll/۫ۤۧ;

    iget-object v1, p0, Ll/ۤۤۧ;->᩶:Ll/۫ۜ֫;

    invoke-static {v0, v1}, Ll/۫ۤۧ;->ۙ(Ll/۫ۤۧ;Ll/۫ۜ֫;)V

    return-void
.end method
