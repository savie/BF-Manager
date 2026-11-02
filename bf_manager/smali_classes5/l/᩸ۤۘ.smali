.class public final synthetic Ll/᩸ۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֨ᩴ;


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    const p1, 0x47f96e3a

    sget v0, Ll/ۗ;->֨۬ۖ:I

    sget v1, Ll/֨ۧ;->֫۠֡:I

    const-string v2, "\u06dc\u06dc"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4e45

    const v4, -0x34ec5fed    # -9674771.0f

    xor-int/2addr v3, v4

    const v4, -0x40d63062

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x61b

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 2
    sget v2, Lbin/mt/plus/Main;->ۚۨ:I

    .line 915
    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_0

    goto :goto_1

    .line 577
    :sswitch_0
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v2, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v2, :cond_7

    goto/16 :goto_4

    .line 342
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget-boolean v2, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v2, :cond_9

    goto/16 :goto_2

    .line 206
    :sswitch_2
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v2, Ll/֡֡;->᩶ۤ۠:I

    if-lez v2, :cond_4

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_5

    .line 767
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    const/4 p1, 0x0

    return p1

    .line 1006
    :sswitch_5
    invoke-static {}, Ll/᩷۟ۜ;->᩹()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v2, "\u06df\u1a7b"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4831

    const v4, -0x185e8ce2

    xor-int/2addr v3, v4

    const v4, 0x2182349c

    goto :goto_0

    .line 217
    :sswitch_6
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    const-string v2, "\u1a7b\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7da7

    const v4, 0x42dc5a20

    xor-int/2addr v3, v4

    const v4, -0x5156843a

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06df"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x3

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4abb

    const v4, 0x6d737eb9

    xor-int/2addr v3, v4

    const v4, -0xe2b2cba

    goto :goto_0

    .line 326
    :sswitch_7
    sget v2, Ll/ۗ;->֨۬ۖ:I

    if-ltz v2, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v2, "\u06e4\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x432f

    const v4, 0x1ee75409

    xor-int/2addr v3, v4

    const v4, -0x72736f20

    goto/16 :goto_0

    .line 230
    :sswitch_8
    sget v2, Ll/֫;->ܶܺ᩻:I

    if-ltz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "\u05ab\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x5f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x203

    const v4, -0x7fbf922c

    xor-int/2addr v3, v4

    const v4, -0x2ef295f3

    goto/16 :goto_0

    :sswitch_9
    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v2, :cond_5

    :cond_4
    :goto_2
    const-string v2, "\u06d8\u06da"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2705

    const v4, -0x309ce409

    xor-int/2addr v3, v4

    const v4, 0x3429cb3

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u1a75\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x65

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x413b

    const v4, 0x7367bcd4

    xor-int/2addr v3, v4

    const v4, -0x790004e0

    goto/16 :goto_0

    .line 657
    :sswitch_a
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v2

    if-gtz v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v2, "\u06d7\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3309

    const v4, -0x4eeb548f

    xor-int/2addr v3, v4

    const v4, -0x3a75fdf7

    goto/16 :goto_0

    .line 974
    :sswitch_b
    sget v2, Ll/۟;->ۨᩴۛ:I

    if-ltz v2, :cond_8

    :cond_7
    :goto_3
    const-string v2, "\u1a7b\u073f"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2613

    const v4, -0x2ff23053

    xor-int/2addr v3, v4

    const v4, -0x54cc4fac

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u1a78\u1a75"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x53

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5695

    const v4, 0x7ad3bcbd

    xor-int/2addr v3, v4

    const v4, 0x14e3135a

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v2, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v2, :cond_a

    :cond_9
    :goto_4
    const-string v2, "\u073a\u05a1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x734d

    const v4, -0x11022f8f

    xor-int/2addr v3, v4

    const v4, -0x705c374a

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06d7\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4ff1

    const v4, 0x2813668f

    xor-int/2addr v3, v4

    const v4, 0x6d3c2bbe

    goto/16 :goto_0

    .line 610
    :sswitch_d
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    const-string v2, "\u05ab\u1a77"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x27c1

    const v4, 0x357a96ae

    xor-int/2addr v3, v4

    const v4, -0x3a0e4bdc

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v2

    if-gtz v2, :cond_c

    :goto_5
    const-string v2, "\u1a73\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2679

    const v4, -0x7ff2ddf0

    xor-int/2addr v3, v4

    const v4, -0x456403f3

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u06d9"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5931

    const v4, 0x2c2be084

    xor-int/2addr v3, v4

    const v4, -0x36e3c3ea

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72bdd6ab -> :sswitch_6
        -0x721ea3ae -> :sswitch_5
        -0x65a6c9d3 -> :sswitch_2
        -0x6310907a -> :sswitch_c
        -0x5fc90e74 -> :sswitch_9
        -0x5fb2a89a -> :sswitch_c
        -0x5a2f1d04 -> :sswitch_d
        -0x591d2190 -> :sswitch_0
        -0x577a62ff -> :sswitch_1
        -0x49be49f3 -> :sswitch_7
        -0x4822998d -> :sswitch_b
        -0x4680ad15 -> :sswitch_a
        -0x449f8647 -> :sswitch_6
        -0x435ff178 -> :sswitch_3
        -0x31735ae2 -> :sswitch_1
        -0x256ac290 -> :sswitch_e
        -0x2343986d -> :sswitch_7
        -0x1005ebf9 -> :sswitch_a
        -0xc551154 -> :sswitch_9
        0x79a7e1b -> :sswitch_4
        0x868a0e0 -> :sswitch_4
        0x880d993 -> :sswitch_b
        0x118f18d7 -> :sswitch_8
        0x1c5a528d -> :sswitch_0
        0x3d533f9d -> :sswitch_2
        0x443ef28e -> :sswitch_5
        0x6590cb09 -> :sswitch_e
        0x66fe6edf -> :sswitch_3
        0x69b4d1be -> :sswitch_8
        0x7becf248 -> :sswitch_d
    .end sparse-switch
.end method
