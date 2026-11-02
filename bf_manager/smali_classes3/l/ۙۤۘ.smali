.class public final synthetic Ll/ۙۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/۠᩶ۘ;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 6

    const v0, -0x2a30cc76

    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v2, Ll/۟;->ۨᩴۛ:I

    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5025

    const v5, -0x65968b8d

    xor-int/2addr v4, v5

    const v5, -0x77d6a3dc

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6ae3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_a

    goto :goto_1

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_8

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto :goto_1

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    :goto_1
    const-string v3, "\u06e4\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7d73

    const v5, -0x28989e29

    xor-int/2addr v4, v5

    const v5, 0x27af55d8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ۙۤۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    :sswitch_6
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v3, "\u073a\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a35

    const v5, -0x30c10eaf

    xor-int/2addr v4, v5

    const v5, 0x2f66fd46

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u0736\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x661d

    const v5, 0x6e0ebaf6

    xor-int/2addr v4, v5

    const v5, 0x51ec16cb

    goto/16 :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a76\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c81

    const v5, 0xad1090c

    xor-int/2addr v4, v5

    const v5, -0x6f8575e2

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x73ef

    const v5, -0x319dee59    # -9.482019E8f

    xor-int/2addr v4, v5

    const v5, 0x27a7a497

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x187b

    const v5, -0x557f018d

    xor-int/2addr v4, v5

    const v5, 0x7f410373

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x41a9

    const v5, -0x7fed5a3d

    xor-int/2addr v4, v5

    const v5, -0x7215a846

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45e1

    const v5, 0x4e327b26    # 7.486038E8f

    xor-int/2addr v4, v5

    const v5, 0x5dea3fef

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06df\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2823

    const v5, 0x51db897

    xor-int/2addr v4, v5

    const v5, -0x1cdd09c1

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1fe1

    const v5, -0x497b6aa8

    xor-int/2addr v4, v5

    const v5, -0x7d6f91a4

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc53

    const v5, -0x721b617

    xor-int/2addr v4, v5

    const v5, -0x60bce6c4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ca7

    const v5, -0x538d09d6

    xor-int/2addr v4, v5

    const v5, -0x38147870

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c7

    const v5, -0x2511b7f

    xor-int/2addr v4, v5

    const v5, -0x171af5c4

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_c

    :goto_5
    const-string v3, "\u1a76\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5da1

    const v5, -0x4ca136c7

    xor-int/2addr v4, v5

    const v5, 0x27ffee30

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e2b

    const v5, 0x6dfbda76

    xor-int/2addr v4, v5

    const v5, -0xb0f94e4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aa6898b -> :sswitch_2
        -0x73567c29 -> :sswitch_a
        -0x6ad37bdc -> :sswitch_5
        -0x63372548 -> :sswitch_a
        -0x6140c633 -> :sswitch_4
        -0x512175d3 -> :sswitch_d
        -0x33b39ba8 -> :sswitch_1
        -0x32628f72 -> :sswitch_2
        -0x2e7159ef -> :sswitch_d
        -0x25ace8c8 -> :sswitch_0
        -0x1156bad0 -> :sswitch_7
        -0x1148676f -> :sswitch_6
        0x169dee7 -> :sswitch_6
        0x282e26a -> :sswitch_0
        0x2898549 -> :sswitch_e
        0x2a5c289 -> :sswitch_9
        0x2daa99c -> :sswitch_8
        0x47174b0 -> :sswitch_3
        0xd8f093b -> :sswitch_1
        0x228185e7 -> :sswitch_c
        0x424de7b7 -> :sswitch_e
        0x47bc925f -> :sswitch_3
        0x55279033 -> :sswitch_b
        0x57f9cda7 -> :sswitch_8
        0x5a1de418 -> :sswitch_7
        0x5ec5905f -> :sswitch_c
        0x5f1a95b4 -> :sswitch_5
        0x6b6402d5 -> :sswitch_b
        0x7796d39b -> :sswitch_9
        0x7880c3c0 -> :sswitch_4
    .end sparse-switch
.end method
