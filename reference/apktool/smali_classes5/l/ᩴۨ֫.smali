.class public final synthetic Ll/ᩴۨ֫;
.super Ljava/lang/Object;
.source "Z43S"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴۨ֫;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x67b63464

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    const-string v4, "\u06df\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x223d

    const v6, 0x573b765e

    xor-int/2addr v5, v6

    const v6, -0x485923c3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x56a7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v4, :cond_7

    goto/16 :goto_2

    .line 102
    :sswitch_1
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    :sswitch_2
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v4, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    return-void

    .line 116
    :sswitch_5
    new-instance v4, Landroid/content/Intent;

    .line 112
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_0

    goto :goto_1

    .line 116
    :cond_0
    const-class v1, Ll/ۗۖۧ;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 117
    invoke-static {v0, v4}, Ll/۟֡;->ۙ(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    .line 116
    :sswitch_6
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06da\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6e29

    const v6, 0x6d4b88b7

    xor-int/2addr v5, v6

    const v6, 0x15873617

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06eb\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4779

    const v6, -0x7c867bb

    xor-int/2addr v5, v6

    const v6, 0x236321d7

    goto :goto_0

    .line 63
    :sswitch_8
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_3

    :goto_1
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3d1f

    const v6, -0x28e88e5c

    xor-int/2addr v5, v6

    const v6, -0x432be5a6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06df\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x17f1

    const v6, 0x459a00fc

    xor-int/2addr v5, v6

    const v6, -0x3e91d738

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xb7f

    const v6, -0x85b9b93

    xor-int/2addr v5, v6

    const v6, -0x337fb88d    # -6.725519E7f

    goto/16 :goto_0

    .line 116
    :sswitch_a
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1b4b

    const v6, 0x359a98af

    xor-int/2addr v5, v6

    const v6, -0x5182a303

    goto/16 :goto_0

    .line 75
    :sswitch_b
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u073f\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x27cd

    const v6, -0x745229e

    xor-int/2addr v5, v6

    const v6, -0x13d3f0b0

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1a05

    const v6, 0x1ca2373a

    xor-int/2addr v5, v6

    const v6, -0xeafa966

    goto/16 :goto_0

    .line 106
    :sswitch_c
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6bd

    const v6, -0x63123f87

    xor-int/2addr v5, v6

    const v6, 0x50c19c8a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06db\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e13

    const v6, -0x5075077f

    xor-int/2addr v5, v6

    const v6, -0x5d6361b5

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3b57

    const v6, -0x2f9eb470

    xor-int/2addr v5, v6

    const v6, -0x69f50ade

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2bcd

    const v6, -0x39b627f8

    xor-int/2addr v5, v6

    const v6, -0x6978039f

    goto/16 :goto_0

    .line 7
    :sswitch_e
    sget v0, Ll/ۗۖۧ;->֨:I

    .line 115
    invoke-static {}, Ll/֨ܿ;->ܺۚ۠()Landroid/app/Application;

    move-result-object v0

    .line 62
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d6\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a1b

    const v6, 0x52ea48f3

    xor-int/2addr v5, v6

    const v6, -0x42d5a91e

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c0d

    const v6, 0x6aca26c8

    xor-int/2addr v5, v6

    const v6, 0x66359be2

    goto/16 :goto_0

    .line 110
    :sswitch_f
    :try_start_0
    invoke-static {}, Ll/᩹ۨ֫;->ᩴ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v4, "\u1a79\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x31cb

    const v6, -0x23f3e92

    xor-int/2addr v5, v6

    const v6, 0x471e01e8

    goto/16 :goto_0

    .line 2
    :sswitch_10
    iget v4, p0, Ll/ᩴۨ֫;->ܰ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u06ec\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x275

    const v6, -0x48788534

    xor-int/2addr v5, v6

    const v6, -0x63636a49

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u06e1\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e49

    const v6, -0x61d132a8

    xor-int/2addr v5, v6

    const v6, 0x6dda5f2d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x765074ae -> :sswitch_1
        -0x6a6f8c45 -> :sswitch_5
        -0x5ef72e23 -> :sswitch_3
        -0x5c8b9d6f -> :sswitch_6
        -0x5a8449f3 -> :sswitch_a
        -0x56cacafd -> :sswitch_d
        -0x55dc5573 -> :sswitch_6
        -0x4ff8b3cd -> :sswitch_d
        -0x4a20f70e -> :sswitch_e
        -0x3c5900dd -> :sswitch_9
        -0x207445ed -> :sswitch_7
        -0x135e789b -> :sswitch_c
        -0x1232e2aa -> :sswitch_f
        -0xc2cfbdf -> :sswitch_a
        -0x9346b86 -> :sswitch_e
        0x11d5c614 -> :sswitch_c
        0x175cffaa -> :sswitch_7
        0x18e818f7 -> :sswitch_0
        0x1a125940 -> :sswitch_f
        0x1ab2a288 -> :sswitch_8
        0x1b0969ca -> :sswitch_10
        0x1ea307ff -> :sswitch_b
        0x228bdb23 -> :sswitch_b
        0x22a54577 -> :sswitch_4
        0x2b3d1031 -> :sswitch_5
        0x2e6a747a -> :sswitch_9
        0x303dfdf0 -> :sswitch_2
        0x37b19898 -> :sswitch_10
        0x380407d1 -> :sswitch_2
        0x403bc578 -> :sswitch_3
        0x4a02da17 -> :sswitch_8
        0x4fadc52f -> :sswitch_1
        0x68aa54d0 -> :sswitch_4
        0x6ae6f68b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
