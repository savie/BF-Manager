.class public final Ll/ۨ᩵֫;
.super Ljava/lang/Object;
.source "K2RM"


# instance fields
.field public ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5ba9a003

    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u0736\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4157

    const v6, 0xaa7be19

    xor-int/2addr v5, v6

    const v6, 0x184689fd

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x6a2f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 23
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    .line 16
    :sswitch_0
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v4

    if-lez v4, :cond_8

    goto :goto_1

    .line 17
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u073a\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7555

    const v6, -0x76723bf4

    xor-int/2addr v5, v6

    const v6, -0x2cbc7f7b

    goto :goto_0

    .line 5
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 29
    :sswitch_5
    iput-object v0, p0, Ll/ۨ᩵֫;->ۙ:Ljava/util/HashMap;

    return-void

    :sswitch_6
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a76\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7d63

    const v6, 0x354c6784

    xor-int/2addr v5, v6

    const v6, -0x4774f645

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7059

    const v6, 0x7aa3d75e

    xor-int/2addr v5, v6

    const v6, 0x704913e2

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v4, "\u073f\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x572f

    const v6, 0x598f5158

    xor-int/2addr v5, v6

    const v6, -0x3ddd0001    # -40.749996f

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06ec\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4ab1

    const v6, 0x449123b1

    xor-int/2addr v5, v6

    const v6, -0x75fc32f9

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u1a75\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x185d

    const v6, -0x76cdb7c3

    xor-int/2addr v5, v6

    const v6, -0x1c5c8f32

    goto/16 :goto_0

    .line 15
    :sswitch_9
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06da\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6b95

    const v6, 0x6dcbf40b

    xor-int/2addr v5, v6

    const v6, -0x54afb4cb    # -7.4000815E-13f

    goto/16 :goto_0

    .line 16
    :sswitch_a
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u1a79\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7cc7

    const v6, 0x51dfd0e

    xor-int/2addr v5, v6

    const v6, -0x20a1f91c

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_9

    :cond_8
    const-string v4, "\u1a79\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x18f5

    const v6, -0x7967fc90

    xor-int/2addr v5, v6

    const v6, 0x5281310d

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x979

    const v6, 0x2b4a6864

    xor-int/2addr v5, v6

    const v6, -0x34ca2b3c    # -1.1916484E7f

    goto/16 :goto_0

    .line 24
    :sswitch_c
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u0736\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x16d3

    const v6, -0x4f462479

    xor-int/2addr v5, v6

    const v6, 0x295f4c9e

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_b

    :goto_3
    const-string v4, "\u1a7a\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e9b

    const v6, 0x122961c3

    xor-int/2addr v5, v6

    const v6, 0x6e55a6be

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a78\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5373

    const v6, -0x2e4f24fc

    xor-int/2addr v5, v6

    const v6, 0x54dc1f4e

    goto/16 :goto_0

    .line 29
    :sswitch_e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v4

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u06db\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3371

    const v6, 0x34696ea

    xor-int/2addr v5, v6

    const v6, 0x2be784bb

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x56db

    const v6, 0x5faeb5ab

    xor-int/2addr v5, v6

    const v6, -0x3b2def2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f27f9ba -> :sswitch_a
        -0x7740d525 -> :sswitch_b
        -0x6b4fe938 -> :sswitch_9
        -0x682f1543 -> :sswitch_2
        -0x6752cd0b -> :sswitch_9
        -0x54c13954 -> :sswitch_8
        -0x53f37207 -> :sswitch_5
        -0x505d62e2 -> :sswitch_e
        -0x41e4f38e -> :sswitch_d
        -0x3e11c4f9 -> :sswitch_7
        -0x3975a795 -> :sswitch_d
        -0x326e0635 -> :sswitch_0
        -0x304a5d2b -> :sswitch_8
        -0x23928b68 -> :sswitch_5
        -0x13ae2a9b -> :sswitch_c
        -0xb85aafb -> :sswitch_1
        -0x8825dba -> :sswitch_3
        -0x3895029 -> :sswitch_4
        0x208d7b9f -> :sswitch_a
        0x27df1bc6 -> :sswitch_2
        0x31c454c5 -> :sswitch_c
        0x3222f30e -> :sswitch_1
        0x3b15c3de -> :sswitch_3
        0x3ba48d4e -> :sswitch_6
        0x4dba9912 -> :sswitch_b
        0x4f026ce4 -> :sswitch_0
        0x64584d9c -> :sswitch_4
        0x64d25503 -> :sswitch_6
        0x74c57dff -> :sswitch_7
        0x7a2e5b79 -> :sswitch_e
    .end sparse-switch
.end method
