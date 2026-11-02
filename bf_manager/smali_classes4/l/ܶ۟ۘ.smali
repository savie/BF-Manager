.class public final synthetic Ll/ܶ۟ۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/ۤ᩺ۙ;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 6

    const v0, -0x148c7c7c

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x28f7

    const v5, 0x4c029969    # 3.4235812E7f

    xor-int/2addr v4, v5

    const v5, 0x4789d243

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xdd7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_9

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u06dc\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x182f

    const v5, 0x66494402

    xor-int/2addr v4, v5

    const v5, -0x2ccfe92c

    goto :goto_0

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_3

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ܶ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {p1}, Lbin/mt/plus/Main;->ۜ(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ll/ۢۡ᩺;

    .line 3
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x44b9

    const v5, -0xf324f78

    xor-int/2addr v4, v5

    const v5, -0x532d9c8

    goto :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v3

    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06df\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1b69

    const v5, 0x27d858d3

    xor-int/2addr v4, v5

    const v5, -0x7cfd0b5f

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6f81

    const v5, -0x724d22f7

    xor-int/2addr v4, v5

    const v5, -0x241c9402

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06df\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b75

    const v5, 0x1e98275d

    xor-int/2addr v4, v5

    const v5, 0x4e367669    # 7.6530336E8f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73f9

    const v5, -0x612e8804

    xor-int/2addr v4, v5

    const v5, 0x7bb7382

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v3

    if-eqz v3, :cond_6

    :goto_2
    const-string v3, "\u06d6\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6655

    const v5, -0x53d2d4c7

    xor-int/2addr v4, v5

    const v5, -0x7cd81a07

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073d\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2995

    const v5, 0x56d2d15b

    xor-int/2addr v4, v5

    const v5, 0x4be31f12    # 2.9769252E7f

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_7

    :goto_3
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x596f

    const v5, -0x57a234de

    xor-int/2addr v4, v5

    const v5, 0x7a4eff2b

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06dc\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2081

    const v5, 0x69ef3793

    xor-int/2addr v4, v5

    const v5, 0x10a12788

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x43d

    const v5, -0x22d2ad93

    xor-int/2addr v4, v5

    const v5, -0x592a33f7

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06d6\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7103

    const v5, 0x4e3c4a3f    # 7.897456E8f

    xor-int/2addr v4, v5

    const v5, 0x5ae89135

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073a\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7841

    const v5, -0x1f4528b4

    xor-int/2addr v4, v5

    const v5, -0x7c9783e5

    goto/16 :goto_0

    .line 1
    :sswitch_e
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06e1\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x35

    const v5, 0x44878245

    xor-int/2addr v4, v5

    const v5, 0x5eaf74f6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x109f

    const v5, -0x433e37c5

    xor-int/2addr v4, v5

    const v5, 0x1cab276

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aa2cde3 -> :sswitch_b
        -0x68e70d26 -> :sswitch_9
        -0x68155924 -> :sswitch_e
        -0x5ab7158e -> :sswitch_3
        -0x57e8d1db -> :sswitch_6
        -0x553fa027 -> :sswitch_5
        -0x42d642af -> :sswitch_0
        -0x3d47a5c5 -> :sswitch_e
        -0x367e4b27 -> :sswitch_8
        -0x2f1a960a -> :sswitch_6
        -0x2edd5d51 -> :sswitch_0
        -0x2483fae6 -> :sswitch_a
        -0x23065e5b -> :sswitch_1
        -0x1c4e9940 -> :sswitch_b
        -0xf0a9a1e -> :sswitch_7
        -0x7da0736 -> :sswitch_3
        -0x29bff7d -> :sswitch_7
        0x6384fb4 -> :sswitch_4
        0x8ede2ef -> :sswitch_1
        0x1c33300c -> :sswitch_8
        0x215aa003 -> :sswitch_2
        0x2adf31b4 -> :sswitch_d
        0x2cae9aa2 -> :sswitch_9
        0x32cb9f6d -> :sswitch_5
        0x41cf0894 -> :sswitch_c
        0x42a46187 -> :sswitch_a
        0x48f5fb27 -> :sswitch_c
        0x5724e0d2 -> :sswitch_4
        0x5b062b09 -> :sswitch_d
        0x75ba9beb -> :sswitch_2
    .end sparse-switch
.end method
