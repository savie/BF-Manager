.class public final Ll/᩷۟ۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/ܺ۟ۘ;

.field public ܺ:I

.field public ᩶:I


# direct methods
.method public constructor <init>(Ll/ܺ۟ۘ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x278f20a6

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    .line 839
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06d8\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1127

    const v6, -0x60b25951

    xor-int/2addr v5, v6

    const v6, -0x46dbe377

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x5ae3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_3

    .line 737
    :sswitch_0
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-lez v4, :cond_b

    goto/16 :goto_2

    .line 14
    :sswitch_1
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_9

    goto :goto_1

    .line 357
    :sswitch_2
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u06d9\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7d0f

    const v6, -0x24ff15fd

    xor-int/2addr v5, v6

    const v6, -0x42146c9b

    goto :goto_0

    .line 376
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_2

    .line 816
    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 841
    :sswitch_5
    invoke-static {}, Ll/۠ܺۚ;->ۙ()I

    move-result p1

    iput p1, p0, Ll/᩷۟ۘ;->ܺ:I

    return-void

    .line 840
    :sswitch_6
    iput v0, p0, Ll/᩷۟ۘ;->᩶:I

    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a75\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x58d7

    const v6, -0x6194979a

    xor-int/2addr v5, v6

    const v6, 0x10a97b68

    goto :goto_0

    :cond_2
    const-string v4, "\u06dc\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b73

    const v6, 0x193f21b7

    xor-int/2addr v5, v6

    const v6, 0x1f54aa72

    goto/16 :goto_0

    .line 112
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2103

    const v6, -0x86f1a0

    xor-int/2addr v5, v6

    const v6, -0x47d8b08f

    goto/16 :goto_0

    .line 798
    :sswitch_8
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a76\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7643

    const v6, -0x6a2a65a5

    xor-int/2addr v5, v6

    const v6, 0x6afdd160

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u0736\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4729

    const v6, -0x71aa592b

    xor-int/2addr v5, v6

    const v6, -0x229f7e86

    goto/16 :goto_0

    .line 23
    :sswitch_a
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06ec\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x216d

    const v6, -0x502820b

    xor-int/2addr v5, v6

    const v6, -0x328a8bf3

    goto/16 :goto_0

    .line 414
    :sswitch_b
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u06eb\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3005

    const v6, 0x19a70bd0

    xor-int/2addr v5, v6

    const v6, 0x2389538b

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05a1\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xff3

    const v6, 0x52f3125a

    xor-int/2addr v5, v6

    const v6, 0x2d2b9339

    goto/16 :goto_0

    .line 158
    :sswitch_c
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x682f

    const v6, -0x70636a44

    xor-int/2addr v5, v6

    const v6, -0x3f915f7d

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06ec\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a97

    const v6, 0x5bce5d8a

    xor-int/2addr v5, v6

    const v6, 0x6e0dac6b

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u073f\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4735

    const v6, 0x442a0488

    xor-int/2addr v5, v6

    const v6, 0x408da555

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ce9

    const v6, 0x7ab5b55e

    xor-int/2addr v5, v6

    const v6, 0x36db3b6

    goto/16 :goto_0

    .line 839
    :sswitch_e
    iput-object p1, p0, Ll/᩷۟ۘ;->֡:Ll/ܺ۟ۘ;

    const/4 v0, 0x0

    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x54f

    const v6, -0x2ce770df

    xor-int/2addr v5, v6

    const v6, 0x6a0040af

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x292b

    const v6, -0x79bfd128

    xor-int/2addr v5, v6

    const v6, -0xdd5ada3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a89613f -> :sswitch_3
        -0x706110c3 -> :sswitch_1
        -0x663bff0f -> :sswitch_5
        -0x5e44e875 -> :sswitch_e
        -0x59329505 -> :sswitch_3
        -0x5915c0a0 -> :sswitch_a
        -0x57549356 -> :sswitch_c
        -0x5504028b -> :sswitch_8
        -0x4a44a9d4 -> :sswitch_7
        -0x337ff89c -> :sswitch_2
        -0x14aa401b -> :sswitch_c
        -0x1489d35a -> :sswitch_6
        -0x74fc4fc -> :sswitch_0
        -0x2307bc4 -> :sswitch_6
        0x55524b1 -> :sswitch_5
        0x9cb8f4b -> :sswitch_2
        0x9f9a47b -> :sswitch_e
        0x1905a9a6 -> :sswitch_d
        0x1d98ff56 -> :sswitch_1
        0x1fc751c6 -> :sswitch_9
        0x23b827da -> :sswitch_7
        0x2a5154e2 -> :sswitch_d
        0x2ceca092 -> :sswitch_b
        0x353cbcec -> :sswitch_0
        0x39d2adc3 -> :sswitch_b
        0x41ed5394 -> :sswitch_4
        0x55ec54f3 -> :sswitch_9
        0x569211a4 -> :sswitch_8
        0x5ab0a052 -> :sswitch_a
        0x6acf6ef6 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x68b8532a

    sget v7, Ll/ۖ᩸;->ۨܽ۬:I

    sget v8, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v9, "\u1a74\u1a76"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x53

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xf53

    const v11, 0x5d7310d7

    xor-int/2addr v10, v11

    const v11, -0x609c1215

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x158b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 848
    invoke-static {v1}, Lbin/mt/plus/Main;->᩷(Lbin/mt/plus/Main;)Ll/ۜᩳ᩹;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۜᩳ᩹;->ۤ()V

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v9, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v9, :cond_e

    goto/16 :goto_5

    .line 548
    :sswitch_1
    sget v9, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v9, :cond_c

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v9

    if-nez v9, :cond_9

    goto/16 :goto_5

    .line 666
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_5

    .line 719
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    :sswitch_5
    const-wide/16 v0, 0x3e8

    .line 851
    invoke-static {p0, v0, v1}, Ll/֫᩺;->ۚᩴۘ(Ljava/lang/Object;J)V

    :sswitch_6
    return-void

    .line 846
    :sswitch_7
    iput v5, p0, Ll/᩷۟ۘ;->᩶:I

    const/4 v9, 0x5

    if-lt v3, v9, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v9, "\u1a7a\u0736"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x7f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x59b1

    const v11, 0x77a53d66

    xor-int/2addr v10, v11

    const v11, 0x52dc2994

    goto :goto_0

    :sswitch_8
    add-int v5, v3, v4

    .line 745
    sget v9, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v9, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v9, "\u0736\u0736"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3125

    const v11, -0x185b6374

    xor-int/2addr v10, v11

    const v11, -0x33c6bb04    # -4.856728E7f

    goto :goto_0

    .line 846
    :sswitch_9
    iget v3, p0, Ll/᩷۟ۘ;->᩶:I

    const/4 v4, 0x1

    .line 386
    sget-boolean v9, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v9, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v9, "\u06d7\u06e1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x151d

    const v11, 0x7e96f7de

    xor-int/2addr v10, v11

    const v11, -0x35c6981f

    goto/16 :goto_0

    .line 847
    :sswitch_a
    invoke-static {v1}, Lbin/mt/plus/Main;->᩷(Lbin/mt/plus/Main;)Ll/ۜᩳ᩹;

    move-result-object v9

    if-eqz v9, :cond_3

    const-string v9, "\u06ec\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5971

    const v11, -0x660d8c88

    xor-int/2addr v10, v11

    const v11, 0x4e86c87f

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string v9, "\u06dc\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x68f9

    const v11, -0xe371c85

    xor-int/2addr v10, v11

    const v11, 0x3c18c6d9

    goto/16 :goto_0

    .line 48
    :sswitch_b
    invoke-static {v2}, Ll/۠ܺۚ;->ܰ(Ljava/lang/String;)Ljava/util/List;

    .line 846
    iget v9, p0, Ll/᩷۟ۘ;->ܺ:I

    invoke-static {}, Ll/۠ܺۚ;->ۙ()I

    move-result v10

    if-ne v9, v10, :cond_4

    const-string v9, "\u0733\u0733"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6f4f

    const v11, 0x15b7125

    xor-int/2addr v10, v11

    const v11, 0x2f6017c3

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v9, "\u073a\u06db"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x32d9

    const v11, -0x1ac400a9

    xor-int/2addr v10, v11

    const v11, -0x342e639d    # -2.7474118E7f

    goto/16 :goto_0

    :sswitch_c
    const/4 v2, 0x0

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v9

    if-gtz v9, :cond_5

    goto :goto_3

    :cond_5
    const-string v9, "\u06d9\u1a75"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x7f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2bc7

    const v11, -0x50d425e0

    xor-int/2addr v10, v11

    const v11, 0x3d8b3d8a

    goto/16 :goto_0

    .line 845
    :sswitch_d
    iget-object v1, v0, Ll/ܺ۟ۘ;->ۙ:Lbin/mt/plus/Main;

    sget v9, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v9, :cond_6

    :goto_3
    const-string v9, "\u06eb\u1a74"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0xb

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3745

    const v11, -0x619e2595

    xor-int/2addr v10, v11

    const v11, 0x7e0797a5

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u05a1\u1a73"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x63

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1b05

    const v11, 0x4a57fefb    # 3538878.8f

    xor-int/2addr v10, v11

    const v11, 0x1369f284

    goto/16 :goto_0

    .line 575
    :sswitch_e
    sget v9, Ll/֨ۧ;->֫۠֡:I

    if-gtz v9, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v9, "\u06e2\u06d9"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x4d

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1b03

    const v11, -0x3e4c550f

    xor-int/2addr v10, v11

    const v11, 0x267790e6

    goto/16 :goto_0

    .line 673
    :sswitch_f
    sget v9, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v9, :cond_8

    goto :goto_5

    :cond_8
    const-string v9, "\u073f\u0733"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xc9

    const v11, -0x2eb87378

    xor-int/2addr v10, v11

    const v11, 0x7fa09aa6

    goto/16 :goto_0

    :sswitch_10
    sget v9, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v9, :cond_a

    :cond_9
    :goto_4
    const-string v9, "\u1a73\u1a78"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7035

    const v11, -0x47b1c570

    xor-int/2addr v10, v11

    const v11, 0x5ff91555

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u1a77\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x5

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x62f1

    const v11, 0x6fcf3cea

    xor-int/2addr v10, v11

    const v11, 0x369ccbb6

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v9

    if-eqz v9, :cond_b

    :goto_5
    const-string v9, "\u1a74\u1a77"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x1f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x61f1

    const v11, -0x1a8b462b

    xor-int/2addr v10, v11

    const v11, -0x24dcac8b

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06e7\u06e7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x53

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xdfd

    const v11, 0x71b9fd55

    xor-int/2addr v10, v11

    const v11, 0x72e8d651

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    :goto_6
    const-string v9, "\u1a79\u1a73"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x51

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x419f

    const v11, -0x1daa2ffa

    xor-int/2addr v10, v11

    const v11, -0x7411cfaf

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e4\u05ab"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x4b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x319f

    const v11, 0x14a33cad

    xor-int/2addr v10, v11

    const v11, -0x65aa9059

    goto/16 :goto_0

    .line 845
    :sswitch_13
    iget-object v0, p0, Ll/᩷۟ۘ;->֡:Ll/ܺ۟ۘ;

    sget-boolean v9, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v9, :cond_f

    :cond_e
    const-string v9, "\u1a79\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5073

    const v11, -0x4af5fec7

    xor-int/2addr v10, v11

    const v11, -0x167d4dd6

    goto/16 :goto_0

    :cond_f
    const-string v9, "\u0730\u06ec"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0xf

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xac9

    const v11, -0x14f1bc3f

    xor-int/2addr v10, v11

    const v11, -0x2c185763

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f1c1b72 -> :sswitch_13
        -0x75eb4e1a -> :sswitch_3
        -0x70234971 -> :sswitch_b
        -0x679118c8 -> :sswitch_13
        -0x668b5975 -> :sswitch_9
        -0x629dd361 -> :sswitch_2
        -0x5b154fa9 -> :sswitch_12
        -0x4f3cb712 -> :sswitch_0
        -0x43757ca4 -> :sswitch_11
        -0x3d6b43bb -> :sswitch_1
        -0x304f4046 -> :sswitch_f
        -0x2ec65091 -> :sswitch_10
        -0x26d63267 -> :sswitch_1
        -0x25a3cf89 -> :sswitch_0
        -0x1f3bb081 -> :sswitch_a
        -0x1ed3770a -> :sswitch_8
        -0x1e19ac13 -> :sswitch_f
        -0x1c77d2e8 -> :sswitch_b
        -0x1c285559 -> :sswitch_6
        -0x1609088f -> :sswitch_6
        -0x136458c9 -> :sswitch_4
        -0x10489ac1 -> :sswitch_5
        -0xf5b55b9 -> :sswitch_12
        -0xe168d91 -> :sswitch_7
        -0x571e48b -> :sswitch_9
        0x29ac8cb -> :sswitch_c
        0x4a3fcf5 -> :sswitch_11
        0x19adfb0b -> :sswitch_8
        0x19d748ea -> :sswitch_7
        0x293439c2 -> :sswitch_d
        0x2b443d82 -> :sswitch_2
        0x31c2c012 -> :sswitch_a
        0x42b83c4e -> :sswitch_4
        0x44ad41ac -> :sswitch_3
        0x4516d1b7 -> :sswitch_c
        0x4932fbce -> :sswitch_e
        0x54b5488f -> :sswitch_e
        0x71fd6bba -> :sswitch_5
        0x7e9a6e73 -> :sswitch_10
        0x7f694e0f -> :sswitch_d
    .end sparse-switch
.end method
