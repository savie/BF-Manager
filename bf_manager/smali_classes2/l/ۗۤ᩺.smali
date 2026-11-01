.class public final synthetic Ll/ۗۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܺ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۤ᩺;->ܺ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7ee4a3b

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    const-string v4, "\u06d9\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3dbd

    const v6, 0x513ed7ab

    xor-int/2addr v5, v6

    const v6, -0x351aec6b    # -7506378.5f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x17c1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 39
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    .line 6
    :sswitch_0
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-lez v4, :cond_7

    goto :goto_1

    .line 23
    :sswitch_1
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_9

    goto/16 :goto_4

    .line 106
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    :goto_1
    const-string v4, "\u073f\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x261d

    const v6, -0x7f7b6c37

    xor-int/2addr v5, v6

    const v6, -0x212fd5ba    # -7.499939E18f

    goto :goto_0

    .line 48
    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܶ۟᩺;

    .line 128
    iput-object v0, p1, Ll/ܶ۟᩺;->᩺:Ljava/lang/String;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ۗۤ᩺;->ܺ:Ljava/lang/String;

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    const-string v4, "\u06eb\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ec1

    const v6, -0x46f0ede9

    xor-int/2addr v5, v6

    const v6, 0x1a14c7a8

    goto :goto_0

    :cond_1
    const-string v4, "\u1a7a\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f47

    const v6, 0x594187b4

    xor-int/2addr v5, v6

    const v6, -0x62f9ac0c

    goto :goto_0

    .line 81
    :sswitch_7
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06d9\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7ca9

    const v6, -0x72a0095d

    xor-int/2addr v5, v6

    const v6, 0x7a112fb9

    goto/16 :goto_0

    .line 94
    :sswitch_8
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06d9\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c37

    const v6, 0xca4ab06

    xor-int/2addr v5, v6

    const v6, 0x6523ce93

    goto/16 :goto_0

    .line 28
    :sswitch_9
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_4

    :goto_2
    const-string v4, "\u06d9\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x33df

    const v6, -0x476f302b

    xor-int/2addr v5, v6

    const v6, -0x3db76a0

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0736\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7601

    const v6, -0x16bf23e9

    xor-int/2addr v5, v6

    const v6, 0x3b7b483f

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06eb\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6bcb

    const v6, -0xf717f52

    xor-int/2addr v5, v6

    const v6, -0x23ead89e

    goto/16 :goto_0

    .line 67
    :sswitch_b
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06e8\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c3f

    const v6, 0x2025c17d

    xor-int/2addr v5, v6

    const v6, 0x192c57fe

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06e0\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b95

    const v6, -0x41026b95

    xor-int/2addr v5, v6

    const v6, -0x5f439e7a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x59b9

    const v6, -0x263ba8e1

    xor-int/2addr v5, v6

    const v6, -0x3a89dfde

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u06e7\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x64cf

    const v6, 0x1c03a457

    xor-int/2addr v5, v6

    const v6, -0x11791b9f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5511

    const v6, 0x3903233a

    xor-int/2addr v5, v6

    const v6, 0xb2d8bb9

    goto/16 :goto_0

    .line 26
    :sswitch_e
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e2\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5aa1

    const v6, 0x65272989

    xor-int/2addr v5, v6

    const v6, 0x2608c084

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6117

    const v6, 0x1ce21f11

    xor-int/2addr v5, v6

    const v6, 0x26fa680d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76b4dfb8 -> :sswitch_e
        -0x752f41ea -> :sswitch_4
        -0x70b0ac2a -> :sswitch_7
        -0x66f31f28 -> :sswitch_3
        -0x636f4232 -> :sswitch_6
        -0x511e351c -> :sswitch_4
        -0x4ff17321 -> :sswitch_b
        -0x2e66c97f -> :sswitch_2
        -0x2630b52f -> :sswitch_1
        -0x1c675327 -> :sswitch_a
        -0x17781fbd -> :sswitch_8
        -0x10b30b7b -> :sswitch_0
        -0x796597b -> :sswitch_b
        -0x671cd9d -> :sswitch_7
        0x3d3df5f -> :sswitch_3
        0x1a13bf41 -> :sswitch_e
        0x1fb841bd -> :sswitch_1
        0x2201e0de -> :sswitch_6
        0x2bde46eb -> :sswitch_c
        0x36e9b05f -> :sswitch_9
        0x4320ae29 -> :sswitch_0
        0x4b4aa8a0 -> :sswitch_8
        0x4cc02566 -> :sswitch_5
        0x544509e8 -> :sswitch_a
        0x5ea7f714 -> :sswitch_5
        0x5fe0abe6 -> :sswitch_c
        0x60382512 -> :sswitch_d
        0x637819a4 -> :sswitch_d
        0x6a92e3a0 -> :sswitch_9
        0x770b3b0c -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
