.class public final synthetic Ll/ۡۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۜ᩻;->ܰ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x49988d68    # 1249709.0f

    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    const-string v4, "\u06dc\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x476d

    const v6, -0x6235538e

    xor-int/2addr v5, v6

    const v6, -0x5a70a9ca

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2d3b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 97
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v4, :cond_b

    goto :goto_1

    :sswitch_2
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    .line 119
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto/16 :goto_2

    .line 76
    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/֫۬᩻;

    .line 136
    iput-object v0, p1, Ll/֫۬᩻;->ܺ:Ljava/lang/String;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ۡۜ᩻;->ܰ:Ljava/lang/String;

    .line 32
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u073d\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6d27

    const v6, -0x24ddb71a

    xor-int/2addr v5, v6

    const v6, -0x715dcee2

    goto :goto_0

    .line 101
    :sswitch_7
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u0730\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x478f

    const v6, -0xf5bc03d

    xor-int/2addr v5, v6

    const v6, -0x4a217169

    goto :goto_0

    .line 51
    :sswitch_8
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u06ec\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fd7

    const v6, 0x49965492    # 1231506.2f

    xor-int/2addr v5, v6

    const v6, -0x64684fa2

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e1\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xe89

    const v6, -0xc8fd554

    xor-int/2addr v5, v6

    const v6, -0x39673207

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a77\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c65

    const v6, 0x37662d1a

    xor-int/2addr v5, v6

    const v6, -0x543c4c80

    goto/16 :goto_0

    .line 91
    :sswitch_a
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u073f\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3287

    const v6, 0x492b1e73

    xor-int/2addr v5, v6

    const v6, -0x489577dc

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_7

    :cond_6
    const-string v4, "\u06e2\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x120d

    const v6, -0x42554629

    xor-int/2addr v5, v6

    const v6, 0x2a304bf6

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u0736\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7247

    const v6, -0x3d31ea7a

    xor-int/2addr v5, v6

    const v6, -0x55a8d85e

    goto/16 :goto_0

    .line 54
    :sswitch_c
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u1a7a\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5fa1

    const v6, 0x285857b7

    xor-int/2addr v5, v6

    const v6, -0x5401be4c

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0736\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x57d1

    const v6, -0x77c992cb

    xor-int/2addr v5, v6

    const v6, 0x23de006c

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a76\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2561

    const v6, 0x5207564e

    xor-int/2addr v5, v6

    const v6, -0x6bfc8674

    goto/16 :goto_0

    .line 108
    :sswitch_e
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06df\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c59

    const v6, -0x282f65f5

    xor-int/2addr v5, v6

    const v6, -0x51e1c848

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a76\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3991

    const v6, -0x41f08671

    xor-int/2addr v5, v6

    const v6, -0x7cf25091

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v4, "\u06e0\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x37b3

    const v6, -0xdbd8e49

    xor-int/2addr v5, v6

    const v6, -0x2a7574ec

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073d\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x8c3

    const v6, -0x732ac867

    xor-int/2addr v5, v6

    const v6, 0x61bbb137

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c655abb -> :sswitch_2
        -0x70482ba4 -> :sswitch_3
        -0x55ffe9c6 -> :sswitch_0
        -0x54fc9e1e -> :sswitch_1
        -0x50c0c390 -> :sswitch_b
        -0x5021ff23 -> :sswitch_8
        -0x501c7856 -> :sswitch_4
        -0x4e3f696d -> :sswitch_6
        -0x3ad4d475 -> :sswitch_e
        -0x2a97f9ee -> :sswitch_0
        -0x2166cd5d -> :sswitch_6
        -0x1b6cdd1b -> :sswitch_b
        -0x1af0a760 -> :sswitch_3
        0x126ab71 -> :sswitch_7
        0x3b85a85 -> :sswitch_2
        0xe938410 -> :sswitch_c
        0x10aa2918 -> :sswitch_7
        0x162741f1 -> :sswitch_e
        0x2e2e6d4c -> :sswitch_1
        0x3402d405 -> :sswitch_c
        0x3c430f46 -> :sswitch_9
        0x44597ee8 -> :sswitch_5
        0x57c7cb80 -> :sswitch_a
        0x584a0076 -> :sswitch_d
        0x5890dc4c -> :sswitch_5
        0x65df6afa -> :sswitch_9
        0x6a86a2ba -> :sswitch_4
        0x7c65ca32 -> :sswitch_a
        0x7cb35bab -> :sswitch_8
        0x7d440a72 -> :sswitch_d
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
