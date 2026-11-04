.class public final synthetic Ll/ۘ۠֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x30bacbda

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    sget v2, Ll/᩶;->ᩴ᩶ۛ:I

    .line 0
    iput p1, p0, Ll/ۘ۠֫;->ܰ:I

    iput-object p2, p0, Ll/ۘ۠֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u05a1\u1a75"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x4f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xd49

    const v3, -0x3c714513

    xor-int/2addr p2, v3

    const v3, -0x9a7edac

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3c0f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget-boolean p1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u073a\u1a79"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x191

    const v3, -0x517ff02b

    xor-int/2addr p2, v3

    const v3, 0x48054291

    goto :goto_0

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a76\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x7

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x45a9

    const v3, 0x43a99d4f

    xor-int/2addr p2, v3

    const v3, 0x2c87ae62

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06df\u05a1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x65

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x101

    const v3, 0x4bee7160    # 3.1253184E7f

    xor-int/2addr p2, v3

    const v3, 0x39c4e2db

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    :goto_2
    const-string p1, "\u1a73\u06e1"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1169

    const v3, 0x1bc8f07a

    xor-int/2addr p2, v3

    const v3, 0xec558ba

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 4
    :sswitch_5
    sget p1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz p1, :cond_3

    const-string p1, "\u06dc\u0736"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x193

    const v3, 0xc6f7f6a

    xor-int/2addr p2, v3

    const v3, -0x452d86b7

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06ec\u0736"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x10bd

    const v3, 0x3ea75d12

    xor-int/2addr p2, v3

    const v3, -0x14323546

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x57a142f1 -> :sswitch_3
        -0x3efe200b -> :sswitch_4
        -0x3cc809fd -> :sswitch_5
        -0x251a4348 -> :sswitch_2
        -0x189a0a85 -> :sswitch_4
        0x15a80a25 -> :sswitch_3
        0x1d4178af -> :sswitch_0
        0x40c7a89a -> :sswitch_5
        0x47919b48 -> :sswitch_1
        0x5d6ea493 -> :sswitch_1
        0x62c9706b -> :sswitch_0
        0x6e3154c0 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x667ec058

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v6, "\u06df\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x29eb

    const v8, 0x65b73a63

    xor-int/2addr v7, v8

    const v8, -0x1a9d480b

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x3019

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v6

    if-eqz v6, :cond_9

    goto/16 :goto_4

    .line 306
    :sswitch_0
    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v6, :cond_6

    goto/16 :goto_2

    :sswitch_1
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_4

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_4

    .line 392
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    goto/16 :goto_4

    .line 24
    :sswitch_4
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    return-void

    .line 868
    :sswitch_5
    invoke-static {v2}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۨᩴ;

    .line 869
    invoke-static {v6}, Ll/ۗ᩺;->ۡ۫ۚ(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_6
    return-void

    .line 868
    :sswitch_7
    invoke-static {v2}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "\u1a76\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x39

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x542d

    const v8, 0x2a041260

    xor-int/2addr v7, v8

    const v8, -0x1789ac87

    goto :goto_0

    :cond_0
    const-string v6, "\u1a77\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x469d

    const v8, -0x3fb6c0c4

    xor-int/2addr v7, v8

    const v8, 0x50a4ae11

    goto :goto_0

    .line 9
    :sswitch_8
    check-cast v1, Ll/ۨۧۧ;

    .line 12
    invoke-static {v1}, Ll/ۨۧۧ;->ۙ(Ll/ۨۧۧ;)V

    return-void

    .line 15
    :sswitch_9
    move-object v2, v1

    check-cast v2, Ljava/util/ArrayList;

    .line 17
    sget v6, Ll/֨֫ۧ;->ۡ᩷:I

    .line 868
    invoke-static {v2}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    const-string v6, "\u1a77\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4fcf

    const v8, 0x255b2527

    xor-int/2addr v7, v8

    const v8, 0xa251c9d

    goto/16 :goto_0

    .line 0
    :sswitch_a
    check-cast v1, Ll/֫ܶܳ;

    invoke-static {v1}, Ll/֫ܶܳ;->ۤ(Ll/֫ܶܳ;)V

    return-void

    :sswitch_b
    check-cast v1, Lbin/mt/plus/Main;

    invoke-static {v1}, Lbin/mt/plus/Main;->۫(Lbin/mt/plus/Main;)V

    return-void

    .line 4
    :sswitch_c
    iget-object v1, p0, Ll/ۘ۠֫;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    const-string v6, "\u06d9\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7c63

    const v8, 0x5d9ef191

    xor-int/2addr v7, v8

    const v8, 0x5abe663e

    goto/16 :goto_0

    :pswitch_0
    const-string v6, "\u05a8\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4bbf

    const v8, -0x42a2627d

    xor-int/2addr v7, v8

    const v8, -0x5ab5d699

    goto/16 :goto_0

    :pswitch_1
    const-string v6, "\u06dc\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2587

    const v8, 0x147d57b7

    xor-int/2addr v7, v8

    const v8, -0x5baddc22

    goto/16 :goto_0

    :pswitch_2
    const-string v6, "\u06dc\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x521

    const v8, 0x4ac1dc0b    # 6352389.5f

    xor-int/2addr v7, v8

    const v8, 0x47d0d15e

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v6, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v6, "\u06d7\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x54f5

    const v8, 0x5ce0dbf5

    xor-int/2addr v7, v8

    const v8, -0x27d822a4

    goto/16 :goto_0

    .line 97
    :sswitch_e
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    const-string v6, "\u05ab\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1a79

    const v8, 0x764c5b9c

    xor-int/2addr v7, v8

    const v8, -0x530c42be

    goto/16 :goto_0

    .line 665
    :sswitch_f
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v6, "\u06d9\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4f1d

    const v8, -0x4009571d

    xor-int/2addr v7, v8

    const v8, 0x1c9dffb8

    goto/16 :goto_0

    .line 397
    :sswitch_10
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_4
    :goto_2
    const-string v6, "\u06d7\u1a78"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7679

    const v8, -0xddea7f9

    xor-int/2addr v7, v8

    const v8, 0x63bf974d

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u1a7b\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x32b5

    const v8, -0x588a8a38

    xor-int/2addr v7, v8

    const v8, -0x1276ef63

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v6, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v6, :cond_7

    :cond_6
    :goto_3
    const-string v6, "\u06e4\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x72d

    const v8, 0x3b2dcddc

    xor-int/2addr v7, v8

    const v8, 0x3345c2b

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06dc\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x13d3

    const v8, 0x1317966b

    xor-int/2addr v7, v8

    const v8, -0x47cc8b7

    goto/16 :goto_0

    .line 22
    :sswitch_12
    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u1a76\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2f5d

    const v8, -0x7e7c71a2

    xor-int/2addr v7, v8

    const v8, -0x3dba8edd

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e0\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x11e5

    const v8, 0x48b6a856

    xor-int/2addr v7, v8

    const v8, -0x5c0cb896

    goto/16 :goto_0

    .line 826
    :sswitch_13
    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v6, :cond_a

    :goto_4
    const-string v6, "\u1a77\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x17a1

    const v8, -0x1a01fd88

    xor-int/2addr v7, v8

    const v8, -0x7e529e50

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06da\u05a1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x699

    const v8, -0x33914254    # -6.2584496E7f

    xor-int/2addr v7, v8

    const v8, -0x71b6063e

    goto/16 :goto_0

    .line 627
    :sswitch_14
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06df\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x251

    const v8, 0x5c797a9e

    xor-int/2addr v7, v8

    const v8, 0x5862a674

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e8\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x67d3

    const v8, -0x3dcfeef5

    xor-int/2addr v7, v8

    const v8, -0x7d32870c

    goto/16 :goto_0

    .line 2
    :sswitch_15
    iget v0, p0, Ll/ۘ۠֫;->ܰ:I

    .line 660
    sget v6, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v6, :cond_d

    :goto_6
    const-string v6, "\u0733\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x31

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2661

    const v8, -0x5676ede1

    xor-int/2addr v7, v8

    const v8, 0x262a94f8

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06db\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x61f7

    const v8, -0x2f502e92

    xor-int/2addr v7, v8

    const v8, 0x75b35015

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79254729 -> :sswitch_a
        -0x76549e28 -> :sswitch_11
        -0x6ed69d42 -> :sswitch_4
        -0x6944b954 -> :sswitch_7
        -0x64e4a07e -> :sswitch_4
        -0x5998ff66 -> :sswitch_f
        -0x507cfd36 -> :sswitch_13
        -0x44b2b393 -> :sswitch_0
        -0x448f87eb -> :sswitch_1
        -0x42f4f33e -> :sswitch_12
        -0x3fafd3f6 -> :sswitch_d
        -0x3dba3d99 -> :sswitch_1
        -0x30a9bef4 -> :sswitch_c
        -0x1e0aa391 -> :sswitch_13
        -0x1a396cef -> :sswitch_14
        -0x18e1a348 -> :sswitch_d
        -0x130d60ba -> :sswitch_10
        -0x11584b13 -> :sswitch_9
        -0x10402c3d -> :sswitch_a
        -0xdecd4f3 -> :sswitch_15
        0xfd1a1c -> :sswitch_5
        0xbec6321 -> :sswitch_e
        0xd2d3372 -> :sswitch_10
        0x10d28a0f -> :sswitch_11
        0x17bbf92d -> :sswitch_7
        0x17e0de2e -> :sswitch_3
        0x1a5887a3 -> :sswitch_b
        0x214c8785 -> :sswitch_5
        0x28525206 -> :sswitch_2
        0x29c38df2 -> :sswitch_6
        0x3078d13a -> :sswitch_2
        0x3b5ddb43 -> :sswitch_3
        0x4ad23d21 -> :sswitch_6
        0x4dcffa5b -> :sswitch_8
        0x50a14dd6 -> :sswitch_b
        0x563d3899 -> :sswitch_8
        0x5a95402c -> :sswitch_0
        0x5ef5f180 -> :sswitch_9
        0x62735b67 -> :sswitch_c
        0x62c2f9f3 -> :sswitch_14
        0x65412c47 -> :sswitch_f
        0x6e49aaa5 -> :sswitch_e
        0x72381d3e -> :sswitch_12
        0x7568c274 -> :sswitch_15
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
