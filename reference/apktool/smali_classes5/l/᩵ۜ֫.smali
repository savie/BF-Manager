.class public final synthetic Ll/᩵ۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/util/ArrayList;

.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

    const v0, 0xf9f1e0b

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x68af

    const v5, -0x659fe14c

    xor-int/2addr v4, v5

    const v5, 0x7d99bced

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1f35

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p3, p0, Ll/᩵ۜ֫;->ܿ:Ljava/lang/String;

    iput-object p4, p0, Ll/᩵ۜ֫;->֡:Ljava/util/ArrayList;

    return-void

    .line 2
    :sswitch_0
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v3, :cond_2

    goto/16 :goto_1

    :sswitch_1
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v3, :cond_8

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1f0d

    const v5, 0x76beeda3

    xor-int/2addr v4, v5

    const v5, 0x3bf43341

    goto :goto_0

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a75\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x150d

    const v5, 0xe11ce9

    xor-int/2addr v4, v5

    const v5, -0x25358263

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_3

    :cond_2
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x35d5

    const v5, -0x603fb30d

    xor-int/2addr v4, v5

    const v5, -0x790fff4e

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ed9

    const v5, 0x251cbc8e

    xor-int/2addr v4, v5

    const v5, 0x3474023d

    goto/16 :goto_0

    .line 0
    :sswitch_7
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x10cb

    const v5, 0x1c889b4e

    xor-int/2addr v4, v5

    const v5, 0x7a686e60

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a3b

    const v5, -0x5678449b

    xor-int/2addr v4, v5

    const v5, 0x4ae89772    # 7621561.0f

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u06e2\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3881

    const v5, -0x548b9c9b

    xor-int/2addr v4, v5

    const v5, -0x102566bf

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    :cond_7
    const-string v3, "\u06d7\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c2d

    const v5, 0x1f838ea3

    xor-int/2addr v4, v5

    const v5, 0x556ef99a

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_1
    const-string v3, "\u06e4\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71f3

    const v5, 0xa3ca202

    xor-int/2addr v4, v5

    const v5, -0x2f6fe827

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d3d

    const v5, 0x43eebe7f

    xor-int/2addr v4, v5

    const v5, 0x2f080e13

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_a

    goto :goto_2

    :cond_a
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bab

    const v5, -0x2d2fbd70

    xor-int/2addr v4, v5

    const v5, 0x6d6c961e

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_b

    :goto_2
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x177d

    const v5, 0x5437a5c0

    xor-int/2addr v4, v5

    const v5, -0x266e4e5a

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x36b1

    const v5, 0x323caa4b

    xor-int/2addr v4, v5

    const v5, 0x3b1c695c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩵ۜ֫;->ܰ:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/᩵ۜ֫;->᩶:Landroid/os/Bundle;

    .line 1
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f5f

    const v5, -0x62bb7b18

    xor-int/2addr v4, v5

    const v5, -0x3ce78ea

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1035

    const v5, -0x6a3348ab

    xor-int/2addr v4, v5

    const v5, -0x36ffaccd

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea0ae42 -> :sswitch_1
        -0x7150e6a9 -> :sswitch_4
        -0x66c52500 -> :sswitch_e
        -0x62bbc22a -> :sswitch_8
        -0x54f0ec1b -> :sswitch_0
        -0x5468fcf9 -> :sswitch_3
        -0x4c5997d0 -> :sswitch_4
        -0x4c12f880 -> :sswitch_9
        -0x48f16d24 -> :sswitch_0
        -0x48c8390a -> :sswitch_b
        -0x233c6129 -> :sswitch_c
        -0x22d8bbf1 -> :sswitch_6
        -0x22198f8b -> :sswitch_5
        -0x1fb7ddf5 -> :sswitch_d
        -0x1bee1958 -> :sswitch_2
        -0x1b8c8db9 -> :sswitch_9
        -0x1b83c6f5 -> :sswitch_7
        -0x149ac1eb -> :sswitch_a
        -0x120571dd -> :sswitch_e
        0x1067b479 -> :sswitch_3
        0x17b390be -> :sswitch_b
        0x18be1db6 -> :sswitch_a
        0x21a6448f -> :sswitch_7
        0x22421881 -> :sswitch_1
        0x2e1ee634 -> :sswitch_8
        0x46eaa09a -> :sswitch_5
        0x4982fe43 -> :sswitch_c
        0x4ae47dc5 -> :sswitch_6
        0x596361e0 -> :sswitch_d
        0x6d933d0d -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x60b29e04

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v5, "\u06e7\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x25

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x493

    const v7, -0x50eb0314

    xor-int/2addr v6, v7

    const v7, 0x3a1d3ad

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x4f25

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto :goto_1

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v5, :cond_9

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_6

    goto :goto_1

    :sswitch_2
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_b

    :goto_1
    const-string v5, "\u06df\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2f43

    const v7, -0x50f899f4

    xor-int/2addr v6, v7

    const v7, 0x2da1347b

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/᩵ۜ֫;->ܰ:Lbin/mt/plus/Main;

    iget-object v3, p0, Ll/᩵ۜ֫;->᩶:Landroid/os/Bundle;

    invoke-static {v2, v3, v0, v1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/᩵ۜ֫;->֡:Ljava/util/ArrayList;

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u06df\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x576f

    const v7, -0x5f56e971

    xor-int/2addr v6, v7

    const v7, 0x66b64ad

    goto :goto_0

    .line 3
    :sswitch_6
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v5

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06d7\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x32d1

    const v7, 0x5f4c1fc9

    xor-int/2addr v6, v7

    const v7, 0x37208bc0

    goto/16 :goto_0

    :sswitch_7
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u073f\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6fa1

    const v7, -0xd44fbf

    xor-int/2addr v6, v7

    const v7, -0x71c6356

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u1a73\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xacb

    const v7, -0x5980990f

    xor-int/2addr v6, v7

    const v7, -0x5f96ac9

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u1a7b\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3955

    const v7, 0x4345655d

    xor-int/2addr v6, v7

    const v7, -0x7664602b

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a75\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x67ff

    const v7, -0x2027aa1e

    xor-int/2addr v6, v7

    const v7, 0x28beeb5b

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u0733\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b1f

    const v7, -0x2d653144

    xor-int/2addr v6, v7

    const v7, -0x29dd51bf

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a76\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7c8f

    const v7, 0x6e37949f

    xor-int/2addr v6, v7

    const v7, -0xa4952fa

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u06e7\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3a57

    const v7, 0x28fce8cc

    xor-int/2addr v6, v7

    const v7, 0x5bd29d75

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06eb\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x107

    const v7, -0x997b1da

    xor-int/2addr v6, v7

    const v7, -0x76a4fd5b

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u1a7b\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c31

    const v7, 0x6c223819

    xor-int/2addr v6, v7

    const v7, -0x6debd5a0

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2c0f

    const v7, 0x41a651ef    # 20.790007f

    xor-int/2addr v6, v7

    const v7, -0x6647a9d7

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/᩵ۜ֫;->ܿ:Ljava/lang/String;

    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_c

    :cond_b
    const-string v5, "\u06eb\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2803

    const v7, 0x1eabaa01

    xor-int/2addr v6, v7

    const v7, 0x6a3a9bf

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05a1\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2be3

    const v7, -0x6408bcfc

    xor-int/2addr v6, v7

    const v7, 0xb48e9f8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6eaf5a3b -> :sswitch_a
        -0x6678a5ed -> :sswitch_c
        -0x482b607f -> :sswitch_e
        -0x40d53edb -> :sswitch_4
        -0x3dfdf230 -> :sswitch_c
        -0x3a949d5e -> :sswitch_9
        -0x2e0d1984 -> :sswitch_5
        -0x2d3828f4 -> :sswitch_b
        -0x27e616fa -> :sswitch_8
        -0x2159ef1c -> :sswitch_7
        -0x1c422291 -> :sswitch_5
        -0x1c38eefe -> :sswitch_e
        -0x1a2f1be3 -> :sswitch_6
        -0xe86671b -> :sswitch_8
        -0xd7e1710 -> :sswitch_2
        -0x90dddba -> :sswitch_1
        -0x61f5a74 -> :sswitch_4
        0x9025087 -> :sswitch_3
        0xc1e1aea -> :sswitch_9
        0xe461b7f -> :sswitch_d
        0x1a63f79a -> :sswitch_3
        0x1b880126 -> :sswitch_2
        0x1d8b542f -> :sswitch_b
        0x1f986142 -> :sswitch_6
        0x27a9222d -> :sswitch_d
        0x37430ad1 -> :sswitch_7
        0x549a69d0 -> :sswitch_a
        0x6e7e060e -> :sswitch_0
        0x77b1be9c -> :sswitch_1
        0x7f71feb0 -> :sswitch_0
    .end sparse-switch
.end method
