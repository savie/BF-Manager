.class public final synthetic Ll/ۖ۠֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۠֫;->ܰ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, 0xb21fbe

    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v3, "\u06dc\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x240d

    const v5, 0x21eb7d32

    xor-int/2addr v4, v5

    const v5, -0x45d90442

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x193

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    .line 4
    :sswitch_0
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u1a75\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x36d7

    const v5, 0x1e99454b

    xor-int/2addr v4, v5

    const v5, 0x6afb1c9c

    goto :goto_0

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v3, :cond_6

    goto/16 :goto_2

    :sswitch_2
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    invoke-static {p1}, Lbin/mt/plus/Main;->ܳ(Lbin/mt/plus/Main;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object p1, p0, Ll/ۖ۠֫;->ܰ:Lbin/mt/plus/Main;

    .line 1
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_1

    const-string v3, "\u0730\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d19

    const v5, 0x32c14784

    xor-int/2addr v4, v5

    const v5, -0x698959e

    goto :goto_0

    :cond_1
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15c1

    const v5, -0x3ce50d0b

    xor-int/2addr v4, v5

    const v5, 0x7e59cc7

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06e1\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x74f3

    const v5, -0x4c2e145f

    xor-int/2addr v4, v5

    const v5, 0x4bb9314b    # 2.4273558E7f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a76\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x766f

    const v5, 0x7a1d9f7d

    xor-int/2addr v4, v5

    const v5, 0x69aae2e6

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u0730\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x83

    const v5, 0x7e0e7766

    xor-int/2addr v4, v5

    const v5, 0xb7fff15

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06db\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2447

    const v5, 0x58a408ee

    xor-int/2addr v4, v5

    const v5, -0x2f220e74

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x48e7

    const v5, 0x52670c24

    xor-int/2addr v4, v5

    const v5, 0x7daf1d80

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6663

    const v5, -0x53a43a7b

    xor-int/2addr v4, v5

    const v5, -0x4bb2c96e

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_8

    :goto_2
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x9cb

    const v5, -0x189ed87

    xor-int/2addr v4, v5

    const v5, -0x4558ad47

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6e3f

    const v5, 0x5c5d45f3

    xor-int/2addr v4, v5

    const v5, 0x4e962c93

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x51b9

    const v5, 0x12a7f71e

    xor-int/2addr v4, v5

    const v5, -0x4e07e435

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6621

    const v5, -0x682e2c7c

    xor-int/2addr v4, v5

    const v5, 0x260a7e75

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ed1

    const v5, -0x53b2cdf5

    xor-int/2addr v4, v5

    const v5, -0x7799a743

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c69

    const v5, -0x133f4c40

    xor-int/2addr v4, v5

    const v5, -0x33cb3c65    # -4.738622E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d42aa70 -> :sswitch_3
        -0x7c09ea08 -> :sswitch_9
        -0x6655cb18 -> :sswitch_0
        -0x64d226a4 -> :sswitch_4
        -0x49955421 -> :sswitch_c
        -0x40cdac98 -> :sswitch_b
        -0x3b561e01 -> :sswitch_1
        -0x2eeac759 -> :sswitch_2
        -0x1f72cf62 -> :sswitch_9
        -0x195be79e -> :sswitch_2
        -0x176bb8f2 -> :sswitch_d
        -0x1482fe75 -> :sswitch_5
        -0x803a4c6 -> :sswitch_c
        -0x6362fa1 -> :sswitch_7
        -0x2c707a6 -> :sswitch_6
        0xf811a21 -> :sswitch_8
        0x19fe3e99 -> :sswitch_5
        0x2169bfda -> :sswitch_8
        0x219b2933 -> :sswitch_b
        0x2a4629be -> :sswitch_e
        0x4aba7208 -> :sswitch_a
        0x4e5b989b -> :sswitch_1
        0x51f357c3 -> :sswitch_d
        0x5ce1054e -> :sswitch_7
        0x5d11d563 -> :sswitch_e
        0x6a355a57 -> :sswitch_a
        0x6af78715 -> :sswitch_0
        0x6f0a6823 -> :sswitch_3
        0x6f1a522b -> :sswitch_6
        0x6f641a6c -> :sswitch_4
    .end sparse-switch
.end method
