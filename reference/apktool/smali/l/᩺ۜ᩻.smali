.class public final synthetic Ll/᩺ۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۜ᩻;->ܰ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x73d84fcf

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v4, "\u06e8\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3385

    const v6, 0x799d8b70

    xor-int/2addr v5, v6

    const v6, 0xbad6aca

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2f3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_5

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_6

    goto/16 :goto_2

    .line 126
    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v4, Ll/᩺;->۫۬۫:I

    if-lez v4, :cond_a

    goto/16 :goto_2

    .line 132
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v4, :cond_8

    goto/16 :goto_2

    .line 13
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/֫۬᩻;

    .line 140
    iput-object v0, p1, Ll/֫۬᩻;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/᩺ۜ᩻;->ܰ:Ljava/util/Map;

    .line 36
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u1a78\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x164f

    const v6, -0x1c32a371

    xor-int/2addr v5, v6

    const v6, -0x556b38ea

    goto :goto_0

    :cond_0
    const-string v4, "\u06e7\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ff3

    const v6, -0x2892e9bf

    xor-int/2addr v5, v6

    const v6, 0x4a54b604    # 3485057.0f

    goto :goto_0

    .line 70
    :sswitch_7
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u1a78\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xb3d

    const v6, 0x2f48d6df

    xor-int/2addr v5, v6

    const v6, 0x52ea7886

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u05a1\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe95

    const v6, 0x46eeff54

    xor-int/2addr v5, v6

    const v6, -0x602449d

    goto/16 :goto_0

    .line 19
    :sswitch_9
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v4, "\u1a73\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3de9

    const v6, 0x2a3072da

    xor-int/2addr v5, v6

    const v6, -0x443bc95

    goto/16 :goto_0

    .line 26
    :sswitch_a
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06e8\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3371

    const v6, -0xd96c104

    xor-int/2addr v5, v6

    const v6, 0x529473cf

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e8\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7bdd

    const v6, -0x2e47cf59

    xor-int/2addr v5, v6

    const v6, 0x2f370da6

    goto/16 :goto_0

    .line 98
    :sswitch_b
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    const-string v4, "\u1a7b\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4c6d

    const v6, 0x5249b8d7

    xor-int/2addr v5, v6

    const v6, -0x472e32aa    # -1.00041434E-4f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d9\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x67cf

    const v6, 0x6825032b

    xor-int/2addr v5, v6

    const v6, 0x58eab15f

    goto/16 :goto_0

    .line 67
    :sswitch_c
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_9

    :cond_8
    const-string v4, "\u06e2\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x25d3

    const v6, 0xd93a6b0

    xor-int/2addr v5, v6

    const v6, 0x4f0803df

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e2\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x8ef

    const v6, -0x3eb59516

    xor-int/2addr v5, v6

    const v6, -0x3ad2ba01

    goto/16 :goto_0

    .line 104
    :sswitch_d
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_b

    :cond_a
    :goto_1
    const-string v4, "\u073f\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x501d

    const v6, 0x451a68b1

    xor-int/2addr v5, v6

    const v6, -0x15f6e5ac

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a79\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x648b

    const v6, -0x4b18fb8c

    xor-int/2addr v5, v6

    const v6, 0x7a99c70

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v4

    if-eqz v4, :cond_c

    :goto_2
    const-string v4, "\u1a75\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7509

    const v6, 0x41a904c8

    xor-int/2addr v5, v6

    const v6, 0x6f58718f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a75\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13c1

    const v6, -0x343c2264    # -2.5672504E7f

    xor-int/2addr v5, v6

    const v6, -0x1da9934d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71076ba8 -> :sswitch_c
        -0x5ff5860f -> :sswitch_b
        -0x5f1bcb5e -> :sswitch_4
        -0x56478156 -> :sswitch_d
        -0x4e1a17c4 -> :sswitch_1
        -0x403c16d2 -> :sswitch_b
        -0x374bba26 -> :sswitch_3
        -0x33aeb869 -> :sswitch_5
        -0x2f21c8ad -> :sswitch_5
        -0x2efc6b3a -> :sswitch_d
        -0x2d7ce2b7 -> :sswitch_9
        -0x1cc4cbc4 -> :sswitch_a
        -0x12f6378d -> :sswitch_e
        -0x11247009 -> :sswitch_3
        -0xcc022ab -> :sswitch_1
        0x34539a -> :sswitch_c
        0x353c952 -> :sswitch_8
        0x1904682f -> :sswitch_6
        0x1b66fd3d -> :sswitch_7
        0x1ffa7438 -> :sswitch_8
        0x24b66144 -> :sswitch_4
        0x2b38f7db -> :sswitch_0
        0x3563a583 -> :sswitch_0
        0x3a5366c1 -> :sswitch_9
        0x4040b193 -> :sswitch_e
        0x64dad6e2 -> :sswitch_a
        0x65db62d0 -> :sswitch_6
        0x6a1e7f45 -> :sswitch_2
        0x78717df9 -> :sswitch_7
        0x7cfb493b -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
