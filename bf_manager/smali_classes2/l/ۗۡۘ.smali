.class public final synthetic Ll/ۗۡۘ;
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

    iput-object p1, p0, Ll/ۗۡۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 6

    const v0, 0x6be2f65b

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v3, "\u06e2\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55eb

    const v5, 0x371dc8df

    xor-int/2addr v4, v5

    const v5, 0x2e33641a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x125

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_3

    .line 2
    :sswitch_0
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_3

    goto/16 :goto_2

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u0736\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6e19

    const v5, 0x778bc040

    xor-int/2addr v4, v5

    const v5, -0x59d87bb0

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-gez v3, :cond_8

    goto/16 :goto_4

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۗۡۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۨ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    :cond_1
    const-string v3, "\u1a7a\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x60ef

    const v5, -0x664eea8a

    xor-int/2addr v4, v5

    const v5, 0x7be12dd7

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06d6\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3319

    const v5, 0x4d93e811    # 3.1018243E8f

    xor-int/2addr v4, v5

    const v5, -0x62655d63

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d9d

    const v5, -0x7f43b537

    xor-int/2addr v4, v5

    const v5, 0x3ded1d4d

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b2f

    const v5, -0x399a7cef

    xor-int/2addr v4, v5

    const v5, 0x76a1d5a1

    goto/16 :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x11dd

    const v5, 0x4da67f85    # 3.4917187E8f

    xor-int/2addr v4, v5

    const v5, 0x5c2b72fe

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22ed

    const v5, -0x3cbed4d7

    xor-int/2addr v4, v5

    const v5, 0x35debb9f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u073d\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2be5

    const v5, -0x18d56bc8

    xor-int/2addr v4, v5

    const v5, -0x6beee5d4

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ff7

    const v5, -0x32491c9f

    xor-int/2addr v4, v5

    const v5, 0x45f6c284

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x49f7

    const v5, -0x59d1609c

    xor-int/2addr v4, v5

    const v5, -0x36fb32e2

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76c7

    const v5, -0x29c4e40e

    xor-int/2addr v4, v5

    const v5, -0x6cd12bd1

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_b

    :goto_3
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11d1

    const v5, -0x1389d8d1

    xor-int/2addr v4, v5

    const v5, -0x1ed04859

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a74\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3387

    const v5, -0x2fc020ce

    xor-int/2addr v4, v5

    const v5, 0x25ee643e

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u1a77\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2979

    const v5, 0x10593e20

    xor-int/2addr v4, v5

    const v5, 0x76517e68

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x640b

    const v5, 0x7e3f74de

    xor-int/2addr v4, v5

    const v5, 0x5a808936

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73449972 -> :sswitch_c
        -0x7029f592 -> :sswitch_9
        -0x6f59a88e -> :sswitch_a
        -0x6e7900c7 -> :sswitch_e
        -0x6d9449e8 -> :sswitch_e
        -0x5f834aec -> :sswitch_1
        -0x4cd69ae0 -> :sswitch_0
        -0x3c30a069 -> :sswitch_3
        -0x2d997655 -> :sswitch_8
        -0x26173606 -> :sswitch_6
        -0xe78b920 -> :sswitch_a
        -0xbe09be -> :sswitch_0
        0x504c294 -> :sswitch_4
        0x885dd63 -> :sswitch_d
        0xbfacf60 -> :sswitch_7
        0x1de6ff86 -> :sswitch_d
        0x2457d9f8 -> :sswitch_4
        0x24a49402 -> :sswitch_6
        0x281a8cb5 -> :sswitch_b
        0x29e78bf6 -> :sswitch_5
        0x29f5f5f4 -> :sswitch_2
        0x2e328600 -> :sswitch_2
        0x2e5d414b -> :sswitch_5
        0x2f3c0259 -> :sswitch_b
        0x30de1fb3 -> :sswitch_1
        0x3682fa85 -> :sswitch_c
        0x5699c97f -> :sswitch_3
        0x581dc097 -> :sswitch_7
        0x60d6a772 -> :sswitch_8
        0x7fb62788 -> :sswitch_9
    .end sparse-switch
.end method
