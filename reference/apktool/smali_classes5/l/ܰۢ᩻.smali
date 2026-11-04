.class public final synthetic Ll/ܰۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ۗ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/᩶ۢ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۢ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۢ᩻;->ܰ:Ll/᩶ۢ᩻;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x797e5aed

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/ۖ;->ܿۚ֡:I

    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4081

    const v5, 0x2de72f45

    xor-int/2addr v4, v5

    const v5, 0x7526ee56

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6819

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v3, :cond_2

    goto/16 :goto_4

    .line 2
    :sswitch_1
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_a

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b2f

    const v5, 0x41cebe5f

    xor-int/2addr v4, v5

    const v5, -0x36f46783

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto/16 :goto_4

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ܰۢ᩻;->ܰ:Ll/᩶ۢ᩻;

    invoke-static {p1}, Ll/᩶ۢ᩻;->᩸(Ll/᩶ۢ᩻;)Ll/ۧ۟᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    .line 3
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5723

    const v5, -0x2f782f00

    xor-int/2addr v4, v5

    const v5, 0x364b0781

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06e2\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a25

    const v5, -0x532d6c01

    xor-int/2addr v4, v5

    const v5, -0x524cd90a

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71a7

    const v5, -0x207f5024

    xor-int/2addr v4, v5

    const v5, -0x6a7f3d2c

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e1\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cb1

    const v5, -0x313e1866

    xor-int/2addr v4, v5

    const v5, -0x435abdc3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073a\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7839

    const v5, 0x1bca933a

    xor-int/2addr v4, v5

    const v5, 0x3aa49a73

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u073d\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x625

    const v5, 0x1daade5

    xor-int/2addr v4, v5

    const v5, 0xf5e7180

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x384f

    const v5, 0x3f6e1f76

    xor-int/2addr v4, v5

    const v5, 0x748cc9d6

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a78\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3159

    const v5, -0x51867d11

    xor-int/2addr v4, v5

    const v5, -0x282e2949

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x13d9

    const v5, -0x441b34b3

    xor-int/2addr v4, v5

    const v5, 0x60143711

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4a09

    const v5, 0x6cbcc04

    xor-int/2addr v4, v5

    const v5, -0x6364a9eb

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a78\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd33

    const v5, 0x41eff44c    # 29.994286f

    xor-int/2addr v4, v5

    const v5, -0x12493002

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d8\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b95

    const v5, -0x5ddd901d

    xor-int/2addr v4, v5

    const v5, -0x4cfde8a0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7289

    const v5, -0x7fbfbd22

    xor-int/2addr v4, v5

    const v5, 0x53a60667

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d41

    const v5, 0x52d742e1    # 4.6227E11f

    xor-int/2addr v4, v5

    const v5, -0x7496732f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76304fbe -> :sswitch_5
        -0x6c141f39 -> :sswitch_3
        -0x5d33d20b -> :sswitch_6
        -0x5254fa98 -> :sswitch_b
        -0x4d654058 -> :sswitch_4
        -0x4a7f357d -> :sswitch_0
        -0x451d0e32 -> :sswitch_8
        -0x34be5237 -> :sswitch_c
        -0x3289bc59 -> :sswitch_0
        -0x301e24ac -> :sswitch_1
        -0x1fd9d6d2 -> :sswitch_c
        -0x1e518e66 -> :sswitch_e
        -0x1cb6ce0f -> :sswitch_a
        -0x1c68d902 -> :sswitch_7
        -0x16c48fcd -> :sswitch_d
        -0x818f3b9 -> :sswitch_9
        -0x135b746 -> :sswitch_b
        0x164d0187 -> :sswitch_d
        0x19d08142 -> :sswitch_9
        0x1ee015d5 -> :sswitch_6
        0x31f4fa72 -> :sswitch_4
        0x4206a577 -> :sswitch_a
        0x444d1102 -> :sswitch_e
        0x491f3d14 -> :sswitch_3
        0x541a6f85 -> :sswitch_5
        0x5e1a62e2 -> :sswitch_1
        0x6033210d -> :sswitch_7
        0x6da21ef7 -> :sswitch_2
        0x7ba67f14 -> :sswitch_8
        0x7d1743ff -> :sswitch_2
    .end sparse-switch
.end method
