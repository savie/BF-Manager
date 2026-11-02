.class public final synthetic Ll/᩹ۤۘ;
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

    iput-object p1, p0, Ll/᩹ۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 4

    const p1, -0x287cf86c

    sget p2, Ll/֡᩶;->ۗ֨ܺ:I

    sget v0, Ll/֨ܶ;->ۛۛۛ:I

    const-string v1, "\u06df\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x7b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0xa09

    const v3, -0x6a2841d5

    xor-int/2addr v2, v3

    const v3, 0x7512bd72

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x571b

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 3
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_8

    goto/16 :goto_4

    .line 0
    :sswitch_0
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_9

    goto/16 :goto_2

    .line 1
    :sswitch_1
    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u06df\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x5b31

    const v3, 0x2c266ff3

    xor-int/2addr v2, v3

    const v3, -0xb2515d9

    goto :goto_0

    .line 0
    :sswitch_2
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_5

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_4

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/᩹ۤۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {p1}, Lbin/mt/plus/Main;->᩺(Lbin/mt/plus/Main;)V

    return-void

    .line 2
    :sswitch_6
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "\u1a76\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x4b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x16f1

    const v3, -0x5792d982

    xor-int/2addr v2, v3

    const v3, 0x1847038b

    goto :goto_0

    :sswitch_7
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_2

    :goto_1
    const-string v1, "\u1a77\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x13

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x4df3

    const v3, -0x26c6d450

    xor-int/2addr v2, v3

    const v3, 0x2e650311

    goto :goto_0

    :cond_2
    const-string v1, "\u06db\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x151d

    const v3, 0x44bb60f4

    xor-int/2addr v2, v3

    const v3, -0x5717ef02

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x7789

    const v3, -0xfbf2bc1

    xor-int/2addr v2, v3

    const v3, -0x67f1246f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u0733\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x2861

    const v3, -0x1fe2fcd7

    xor-int/2addr v2, v3

    const v3, 0x1a5424d3

    goto/16 :goto_0

    :sswitch_a
    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v1, :cond_6

    :cond_5
    :goto_2
    const-string v1, "\u05a1\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x41

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x327d

    const v3, -0x5d05151c

    xor-int/2addr v2, v3

    const v3, -0x269c00cc

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06d8\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x6ad1

    const v3, -0x4994b871

    xor-int/2addr v2, v3

    const v3, -0x5182d076

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v1

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x31

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x983

    const v3, -0x7dbb53a1

    xor-int/2addr v2, v3

    const v3, 0x4ec612f6

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06da\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x73e1

    const v3, 0x1ef23a84

    xor-int/2addr v2, v3

    const v3, -0x71147010

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v1

    if-ltz v1, :cond_a

    :cond_9
    :goto_3
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x157d

    const v3, -0x1b6d03e4

    xor-int/2addr v2, v3

    const v3, 0x6646eac8

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u1a79\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x7d13

    const v3, -0x6bd3b5b1

    xor-int/2addr v2, v3

    const v3, -0x7be1d081

    goto/16 :goto_0

    :sswitch_d
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_b

    goto :goto_4

    :cond_b
    const-string v1, "\u073f\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x545b

    const v3, -0x5cd036bf

    xor-int/2addr v2, v3

    const v3, 0x33aab3f8

    goto/16 :goto_0

    :sswitch_e
    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_c

    :goto_4
    const-string v1, "\u1a79\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x42c5

    const v3, -0x35637558    # -5129556.0f

    xor-int/2addr v2, v3

    const v3, -0x3fb31d6c

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e1\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x51fb

    const v3, -0x4a3bd98a

    xor-int/2addr v2, v3

    const v3, -0x19e8eb98

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b63740d -> :sswitch_2
        -0x7b3e408e -> :sswitch_e
        -0x749dcf34 -> :sswitch_7
        -0x69ae8dbf -> :sswitch_d
        -0x64ca6e4e -> :sswitch_0
        -0x64517010 -> :sswitch_2
        -0x627b4e2b -> :sswitch_b
        -0x60431a94 -> :sswitch_c
        -0x5ae1c1e1 -> :sswitch_5
        -0x58766c21 -> :sswitch_6
        -0x49c911bb -> :sswitch_e
        -0x4478e4a3 -> :sswitch_6
        -0x42ef1a22 -> :sswitch_8
        -0x39a3ddc1 -> :sswitch_7
        -0x2cdff679 -> :sswitch_4
        -0x2a2152f6 -> :sswitch_8
        -0x20b89ddd -> :sswitch_1
        -0x3c63fb4 -> :sswitch_5
        -0x6b0a31 -> :sswitch_9
        0x96b9df8 -> :sswitch_a
        0x20c59826 -> :sswitch_c
        0x21c7b005 -> :sswitch_4
        0x253a284d -> :sswitch_1
        0x4e9c3217 -> :sswitch_9
        0x4ea49ac5 -> :sswitch_b
        0x4f520368 -> :sswitch_d
        0x58a4c5ec -> :sswitch_3
        0x5feccd19 -> :sswitch_0
        0x606de8a4 -> :sswitch_3
        0x6914479a -> :sswitch_a
    .end sparse-switch
.end method
