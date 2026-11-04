.class public final synthetic Ll/ܿۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۜ֫;->ܰ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x43db2878

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v4, "\u1a76\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5099

    const v6, -0x3a181f7f

    xor-int/2addr v5, v6

    const v6, -0x3d5c6c26

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x3689

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v4

    if-gtz v4, :cond_9

    goto/16 :goto_2

    :sswitch_0
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v4, :cond_b

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_4

    goto/16 :goto_1

    .line 4
    :sswitch_2
    sget v4, Ll/᩺;->۫۬۫:I

    if-lez v4, :cond_8

    goto/16 :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    return-void

    .line 0
    :sswitch_5
    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lbin/mt/plus/Main;->᩷(Lbin/mt/plus/Main;Ljava/lang/String;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/ܿۜ֫;->ܰ:Lbin/mt/plus/Main;

    .line 2
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_0

    const-string v4, "\u1a77\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4eaf

    const v6, -0x48256df

    xor-int/2addr v5, v6

    const v6, 0x503ea6ed

    goto :goto_0

    :cond_0
    const-string v4, "\u06dc\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7def

    const v6, -0xa690d61

    xor-int/2addr v5, v6

    const v6, 0x2e935ed6

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4a05

    const v6, -0x379b1176

    xor-int/2addr v5, v6

    const v6, 0x44b500fc

    goto/16 :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7e51

    const v6, 0x264f6ab1

    xor-int/2addr v5, v6

    const v6, -0x4190d012

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a76\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a69

    const v6, -0x3b04696

    xor-int/2addr v5, v6

    const v6, 0x49d0178a    # 1704689.2f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_5

    :cond_4
    const-string v4, "\u073a\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3559

    const v6, -0x14fd7ae7

    xor-int/2addr v5, v6

    const v6, 0x6fa4c3b0

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073a\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x52b5

    const v6, -0x357e882c    # -4242410.0f

    xor-int/2addr v5, v6

    const v6, -0x4e076764

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_6

    goto :goto_1

    :cond_6
    const-string v4, "\u05a8\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x46b7

    const v6, -0x36c5430

    xor-int/2addr v5, v6

    const v6, -0x30701b76

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v4

    if-gtz v4, :cond_7

    :goto_1
    const-string v4, "\u05a1\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c17

    const v6, 0x235f3510    # 1.2100091E-17f

    xor-int/2addr v5, v6

    const v6, -0x493f5ffc

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e1\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3e07

    const v6, 0x688901e9

    xor-int/2addr v5, v6

    const v6, 0x131bdfdc

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5ce9

    const v6, 0x33338bb3

    xor-int/2addr v5, v6

    const v6, 0x21965b23

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6fe9

    const v6, -0x7cc375b4

    xor-int/2addr v5, v6

    const v6, -0x64b1b78

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u06df\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x63d1

    const v6, 0x200dbf20

    xor-int/2addr v5, v6

    const v6, -0x5a11aa85

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u06d9\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7d45

    const v6, -0x5ea41d5d    # -7.4500037E-19f

    xor-int/2addr v5, v6

    const v6, -0x562b3308

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a77\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7647

    const v6, 0x65c6beb2

    xor-int/2addr v5, v6

    const v6, -0x629e886f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e68fa39 -> :sswitch_b
        -0x759d6596 -> :sswitch_8
        -0x6df65505 -> :sswitch_7
        -0x6d4793aa -> :sswitch_4
        -0x627c6d34 -> :sswitch_7
        -0x5f25b077 -> :sswitch_e
        -0x45de95d8 -> :sswitch_0
        -0x3b70b9b5 -> :sswitch_5
        -0x3523a349 -> :sswitch_4
        -0x3475e5d7 -> :sswitch_3
        -0x205146a6 -> :sswitch_3
        -0x1908ff2a -> :sswitch_c
        -0xeb65813 -> :sswitch_2
        -0x9d1b9b8 -> :sswitch_0
        -0x504edb8 -> :sswitch_8
        0x10b26fbd -> :sswitch_d
        0x157abd4d -> :sswitch_c
        0x23579229 -> :sswitch_a
        0x24490e9c -> :sswitch_2
        0x28bc5f7c -> :sswitch_e
        0x2da74639 -> :sswitch_d
        0x38a62213 -> :sswitch_5
        0x41d5e8c0 -> :sswitch_6
        0x43203e99 -> :sswitch_b
        0x43c8d5c3 -> :sswitch_1
        0x4e0cc518 -> :sswitch_a
        0x55352496 -> :sswitch_9
        0x5be489c7 -> :sswitch_9
        0x768eaf6b -> :sswitch_1
        0x7e370aab -> :sswitch_6
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
