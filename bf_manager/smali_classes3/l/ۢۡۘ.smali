.class public final synthetic Ll/ۢۡۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/content/Intent;)V
    .locals 6

    const v0, 0x409c4d3

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3741

    const v5, 0x1ab16827

    xor-int/2addr v4, v5

    const v5, -0xb0e6c44

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x56bf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p2, p0, Ll/ۢۡۘ;->᩶:Landroid/content/Intent;

    return-void

    :sswitch_0
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v3, :cond_b

    goto/16 :goto_1

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_0

    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f87

    const v5, 0x60c0cb8f

    xor-int/2addr v4, v5

    const v5, -0x60611a4f

    goto :goto_0

    :cond_0
    const-string v3, "\u0736\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2393

    const v5, 0x2b0ca3aa

    xor-int/2addr v4, v5

    const v5, -0x73466540    # -2.85969E-31f

    goto :goto_0

    .line 4
    :sswitch_6
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7283

    const v5, 0x501ec057

    xor-int/2addr v4, v5

    const v5, -0x348e49f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3695

    const v5, -0x4882916b

    xor-int/2addr v4, v5

    const v5, 0x65568384

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b43

    const v5, -0x588a0813

    xor-int/2addr v4, v5

    const v5, 0x1189373c

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5829

    const v5, -0x1ef5da10

    xor-int/2addr v4, v5

    const v5, -0x28787846

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x15c7

    const v5, 0x96f97f8

    xor-int/2addr v4, v5

    const v5, -0x387b9a2f

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7d67

    const v5, 0x2136c060

    xor-int/2addr v4, v5

    const v5, 0x5a6331ce

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06df\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bd9

    const v5, -0x1eb1f0e

    xor-int/2addr v4, v5

    const v5, -0x5dad340f

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e7\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x19

    const v5, 0xf526318

    xor-int/2addr v4, v5

    const v5, -0x379559e6

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v3

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u05ab\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x170f

    const v5, 0x818b404

    xor-int/2addr v4, v5

    const v5, 0x181c1dcd

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x69a5

    const v5, -0x5ade0f7a

    xor-int/2addr v4, v5

    const v5, -0xfc19315

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u0733\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14c1

    const v5, 0x645d6bde

    xor-int/2addr v4, v5

    const v5, 0x78ed12a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۢۡۘ;->ܺ:Lbin/mt/plus/Main;

    .line 2
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f73

    const v5, -0x61d33417

    xor-int/2addr v4, v5

    const v5, -0x4ec4c988

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3921

    const v5, -0x2f0c137f

    xor-int/2addr v4, v5

    const v5, -0x111ca112

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71324b54 -> :sswitch_9
        -0x68e08df8 -> :sswitch_b
        -0x679b7b33 -> :sswitch_8
        -0x66793ef3 -> :sswitch_e
        -0x654afa20 -> :sswitch_c
        -0x5ca82895 -> :sswitch_5
        -0x536fc705 -> :sswitch_a
        -0x5313c357 -> :sswitch_e
        -0x4496875a -> :sswitch_3
        -0x3f81dfad -> :sswitch_0
        -0x2e415c8b -> :sswitch_4
        -0x266ae6b0 -> :sswitch_d
        -0x21f09dae -> :sswitch_5
        -0x1c927922 -> :sswitch_0
        -0xc260169 -> :sswitch_7
        -0xaf59cfc -> :sswitch_c
        0x583d699 -> :sswitch_2
        0x1a051e2d -> :sswitch_3
        0x1cd7bfca -> :sswitch_6
        0x29621a64 -> :sswitch_1
        0x305d7fd4 -> :sswitch_1
        0x3d2337c5 -> :sswitch_8
        0x4017f7fb -> :sswitch_b
        0x47fc9772 -> :sswitch_4
        0x48675281 -> :sswitch_6
        0x5c139130 -> :sswitch_d
        0x67594706 -> :sswitch_9
        0x6ee1c14f -> :sswitch_7
        0x7294331a -> :sswitch_2
        0x7a9a69ba -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۢۡۘ;->ܺ:Lbin/mt/plus/Main;

    iget-object v1, p0, Ll/ۢۡۘ;->᩶:Landroid/content/Intent;

    invoke-static {v0, v1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;Landroid/content/Intent;)V

    return-void
.end method
