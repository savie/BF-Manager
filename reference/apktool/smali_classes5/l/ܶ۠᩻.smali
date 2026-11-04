.class public final synthetic Ll/ܶ۠᩻;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۗ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/֨۠᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֨۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۠᩻;->ܰ:Ll/֨۠᩻;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x62d5d538

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    const-string v4, "\u06d6\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2fe3

    const v6, -0x75ebb73b

    xor-int/2addr v5, v6

    const v6, 0x4eacfdbb

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0xcd

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v4, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    :goto_1
    const-string v4, "\u0730\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ab5

    const v6, -0xee7767b

    xor-int/2addr v5, v6

    const v6, 0x1a24b345

    goto :goto_0

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/᩻֨᩻;

    invoke-static {v0, p1}, Ll/֨۠᩻;->ۙ(Ll/֨۠᩻;Ll/᩻֨᩻;)Ll/ۧ۟᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ܶ۠᩻;->ܰ:Ll/֨۠᩻;

    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_0

    goto :goto_2

    :cond_0
    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1213

    const v6, -0x727c365c

    xor-int/2addr v5, v6

    const v6, -0xdd41a29

    goto :goto_0

    :cond_1
    const-string v4, "\u06d7\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x9b3

    const v6, 0x4f875cf2

    xor-int/2addr v5, v6

    const v6, 0x4785ee9f

    goto :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c95

    const v6, 0x35ef6d84

    xor-int/2addr v5, v6

    const v6, 0x6f971088

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u1a79\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x67cb

    const v6, -0x1ae8f81f

    xor-int/2addr v5, v6

    const v6, -0x44f0566c

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_4

    :goto_2
    const-string v4, "\u073a\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7175

    const v6, 0x75d72622

    xor-int/2addr v5, v6

    const v6, -0x605cdaef

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a7b\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x45f5

    const v6, 0x7130629e

    xor-int/2addr v5, v6

    const v6, 0x6b4bc86

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_5

    goto :goto_4

    :cond_5
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ed7

    const v6, 0x44d43905

    xor-int/2addr v5, v6

    const v6, -0x104d6228

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u06da\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x55d9

    const v6, -0x68228314

    xor-int/2addr v5, v6

    const v6, -0x59cce58f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a74\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7201

    const v6, 0xd820505

    xor-int/2addr v5, v6

    const v6, 0x346cb3bd

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u0736\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xaa5

    const v6, -0x230afaa1

    xor-int/2addr v5, v6

    const v6, -0x482854a3

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06db\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x56f3

    const v6, -0x6bad9186

    xor-int/2addr v5, v6

    const v6, -0x29de9b7c

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3727

    const v6, -0x2ecee07e

    xor-int/2addr v5, v6

    const v6, -0x2542c99b

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a7b\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14cd

    const v6, 0x7385606f

    xor-int/2addr v5, v6

    const v6, -0x45f18b5c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13d

    const v6, -0x405f329d

    xor-int/2addr v5, v6

    const v6, -0x10a0c381

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e66b5fd -> :sswitch_1
        -0x6dbb5506 -> :sswitch_a
        -0x6d8ace41 -> :sswitch_0
        -0x5cbbe08a -> :sswitch_a
        -0x4ddc38cb -> :sswitch_6
        -0x4c364c2c -> :sswitch_b
        -0x3d5f886f -> :sswitch_d
        -0x35a3294e -> :sswitch_2
        -0x2ebf98b3 -> :sswitch_7
        -0x249623cc -> :sswitch_d
        -0x9ca3cd5 -> :sswitch_5
        -0x57b2b2 -> :sswitch_7
        0x2a97a81 -> :sswitch_8
        0xaf0b7c6 -> :sswitch_8
        0x1e3aab51 -> :sswitch_4
        0x2c5264d0 -> :sswitch_2
        0x2d26d94e -> :sswitch_1
        0x31109f4c -> :sswitch_4
        0x31185653 -> :sswitch_3
        0x37234a1f -> :sswitch_5
        0x3ab82e51 -> :sswitch_3
        0x4ab2ee5a -> :sswitch_e
        0x4d967c32 -> :sswitch_c
        0x61542649 -> :sswitch_9
        0x635f1ea6 -> :sswitch_e
        0x69d42b2c -> :sswitch_b
        0x6b15e27d -> :sswitch_c
        0x7899d0a5 -> :sswitch_9
        0x7b409050 -> :sswitch_6
        0x7e615875 -> :sswitch_0
    .end sparse-switch
.end method
