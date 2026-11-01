.class public final synthetic Ll/ۨۤۘ;
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

    iput-object p1, p0, Ll/ۨۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 6

    const v0, -0x553b6926

    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    sget v2, Ll/֨᩺;->۬᩺ܰ:I

    const-string v3, "\u1a76\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1d61

    const v5, -0x39ad261b

    xor-int/2addr v4, v5

    const v5, 0x54d5e1db

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5f41

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-lez v3, :cond_a

    goto/16 :goto_2

    .line 3
    :sswitch_2
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_7

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    :goto_1
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5845

    const v5, -0x3e0b8cae

    xor-int/2addr v4, v5

    const v5, -0x33ca4ba5    # -4.7632748E7f

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۨۤۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۚ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 3
    :sswitch_6
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xbd

    const v5, 0x62a036c3

    xor-int/2addr v4, v5

    const v5, 0x7474bc9e

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7403

    const v5, 0x6be6e085

    xor-int/2addr v4, v5

    const v5, -0x1f6a251e

    goto :goto_0

    :cond_2
    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6455

    const v5, 0x3ee7e61a

    xor-int/2addr v4, v5

    const v5, 0x3548f3e

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u0736\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x16a1

    const v5, 0x20af26fa

    xor-int/2addr v4, v5

    const v5, 0x1a346e24

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_5

    :cond_4
    const-string v3, "\u1a73\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x171d

    const v5, -0x5a126ae

    xor-int/2addr v4, v5

    const v5, -0x4cb42a54

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a1

    const v5, -0x40308b4c

    xor-int/2addr v4, v5

    const v5, -0x74dbdad2

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7bc7

    const v5, -0x3476562d    # -1.8043814E7f

    xor-int/2addr v4, v5

    const v5, 0x11ecbede

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u0736\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6419

    const v5, 0x4361fbc9

    xor-int/2addr v4, v5

    const v5, 0x3a8db988

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x582b

    const v5, 0x1be58e5c

    xor-int/2addr v4, v5

    const v5, 0x7d1d5f26

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5775

    const v5, -0x3193ae76    # -9.911917E8f

    xor-int/2addr v4, v5

    const v5, -0x29af9060

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e4\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6b0d

    const v5, 0x432291af

    xor-int/2addr v4, v5

    const v5, 0x6c9c8699

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b63

    const v5, 0x386aa345

    xor-int/2addr v4, v5

    const v5, 0x74e7b53a

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d2b

    const v5, -0x4e1f3aa6

    xor-int/2addr v4, v5

    const v5, 0x21848ec

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xe99

    const v5, -0x6f32c556

    xor-int/2addr v4, v5

    const v5, 0x4a1b5c69    # 2545434.2f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d578d01 -> :sswitch_7
        -0x7343546b -> :sswitch_a
        -0x70108bf7 -> :sswitch_9
        -0x65413f2b -> :sswitch_8
        -0x65199404 -> :sswitch_b
        -0x60447198 -> :sswitch_d
        -0x574272e3 -> :sswitch_a
        -0x54ae7352 -> :sswitch_0
        -0x3f37e7a1 -> :sswitch_9
        -0x3dbea948 -> :sswitch_6
        -0x2101d62c -> :sswitch_b
        -0x1deb97b7 -> :sswitch_8
        -0x15888939 -> :sswitch_5
        -0x151860f3 -> :sswitch_c
        -0x10d2a97d -> :sswitch_3
        -0xd6354ac -> :sswitch_2
        -0x608c671 -> :sswitch_c
        -0x4208bb4 -> :sswitch_d
        0x81e153 -> :sswitch_4
        0x11c6250c -> :sswitch_7
        0x25bd8a45 -> :sswitch_1
        0x2685c739 -> :sswitch_e
        0x35352a65 -> :sswitch_6
        0x42ede2de -> :sswitch_3
        0x5235a3f1 -> :sswitch_4
        0x53d03de1 -> :sswitch_e
        0x574e199c -> :sswitch_0
        0x5f3050d3 -> :sswitch_5
        0x66e892b1 -> :sswitch_1
        0x77c460b0 -> :sswitch_2
    .end sparse-switch
.end method
