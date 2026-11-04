.class public final synthetic Ll/ۡ۟֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/۟֡֫;


# instance fields
.field public final synthetic ܰ:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۖۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ۟֫;->ܰ:Ll/۠ۖۧ;

    return-void
.end method


# virtual methods
.method public final ۫()Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2ed4f177

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v4, "\u06ec\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3923

    const v6, -0x2f6325f9

    xor-int/2addr v5, v6

    const v6, 0x67e7afc5

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x77f1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2071
    invoke-static {v0}, Ll/֫֡;->ۛۢܽ(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    .line 97
    :sswitch_0
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v4, :cond_b

    goto/16 :goto_2

    .line 939
    :sswitch_1
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_4

    goto/16 :goto_2

    .line 1569
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v4, :cond_7

    goto/16 :goto_2

    .line 636
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    const/4 v0, 0x0

    return v0

    .line 2071
    :sswitch_5
    iget-object v0, p0, Ll/ۡ۟֫;->ܰ:Ll/۠ۖۧ;

    .line 1757
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06d9\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4a91

    const v6, -0x32396157    # -4.1653584E8f

    xor-int/2addr v5, v6

    const v6, 0x12818f71

    goto :goto_0

    :sswitch_6
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a78\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6fcd

    const v6, -0x785ef321

    xor-int/2addr v5, v6

    const v6, -0x3ae3c366

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u05a1\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x27b9

    const v6, 0x300fecc1

    xor-int/2addr v5, v6

    const v6, 0x5276721e

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06df\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2895

    const v6, -0x505083e0

    xor-int/2addr v5, v6

    const v6, -0x16c87f99

    goto/16 :goto_0

    .line 1195
    :sswitch_9
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u0733\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7b49

    const v6, -0xcaea6a2

    xor-int/2addr v5, v6

    const v6, -0xd79214c

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6c1f

    const v6, 0x78d47e8d

    xor-int/2addr v5, v6

    const v6, -0x6df8f193

    goto/16 :goto_0

    .line 2067
    :sswitch_a
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_6

    :goto_2
    const-string v4, "\u0730\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d25

    const v6, 0x4406ecb5

    xor-int/2addr v5, v6

    const v6, -0x6aaaf961

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7743

    const v6, 0x4b0372f8    # 8614648.0f

    xor-int/2addr v5, v6

    const v6, 0x6b066c25

    goto/16 :goto_0

    .line 1369
    :sswitch_b
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u06d8\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x32f9

    const v6, -0x433d1b95

    xor-int/2addr v5, v6

    const v6, -0x4ace990a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d7\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x535b

    const v6, 0x62b456e3

    xor-int/2addr v5, v6

    const v6, 0xb007b7c

    goto/16 :goto_0

    .line 603
    :sswitch_c
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_9

    :goto_3
    const-string v4, "\u1a75\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x45e7

    const v6, -0x276b9ffd

    xor-int/2addr v5, v6

    const v6, -0x5c22b306

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x760f

    const v6, -0x4efdfbf3

    xor-int/2addr v5, v6

    const v6, 0x7dc85b48

    goto/16 :goto_0

    .line 2035
    :sswitch_d
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u0736\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e15

    const v6, -0x20874265

    xor-int/2addr v5, v6

    const v6, 0x6949fc9c

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Ll/۟ۢ֫;->ۡ᩷:I

    .line 65
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xcbb

    const v6, 0x4bef31d0    # 3.1351712E7f

    xor-int/2addr v5, v6

    const v6, 0x489a1111

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1dd5

    const v6, -0x8dfc0d7

    xor-int/2addr v5, v6

    const v6, 0x469c1e7e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7950f335 -> :sswitch_7
        -0x7058877d -> :sswitch_b
        -0x5fbf8d40 -> :sswitch_b
        -0x55e88a08 -> :sswitch_1
        -0x53a21369 -> :sswitch_3
        -0x509f27a0 -> :sswitch_8
        -0x2c6035bb -> :sswitch_d
        -0x2bf98d7b -> :sswitch_c
        -0x2913035f -> :sswitch_a
        -0x24f04b57 -> :sswitch_5
        -0x16f3dc71 -> :sswitch_6
        -0x1026daad -> :sswitch_9
        -0x9ea0e63 -> :sswitch_1
        -0x14ee0e6 -> :sswitch_2
        -0x3fc534 -> :sswitch_c
        0x28462619 -> :sswitch_0
        0x29c64fb6 -> :sswitch_3
        0x2a558c02 -> :sswitch_d
        0x2d56cec1 -> :sswitch_5
        0x2e01f14e -> :sswitch_4
        0x307f959b -> :sswitch_2
        0x429edb77 -> :sswitch_9
        0x4b97cb5b -> :sswitch_0
        0x4e7f07fd -> :sswitch_e
        0x519ef678 -> :sswitch_a
        0x6abd0ac5 -> :sswitch_7
        0x6c30dd9c -> :sswitch_e
        0x707e62ed -> :sswitch_6
        0x73146536 -> :sswitch_8
        0x7d1c437a -> :sswitch_4
    .end sparse-switch
.end method
