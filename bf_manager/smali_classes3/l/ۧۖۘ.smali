.class public final Ll/ۧۖۘ;
.super Ljava/lang/Object;
.source "K2RM"


# instance fields
.field public ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x647698ff

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06d7\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x792b

    const v6, -0x382a597

    xor-int/2addr v5, v6

    const v6, -0x67beeab1

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x13e3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 24
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    .line 27
    :sswitch_0
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_b

    goto/16 :goto_3

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_3

    .line 23
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_3

    .line 21
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 29
    :sswitch_5
    iput-object v0, p0, Ll/ۧۖۘ;->ۙ:Ljava/util/HashMap;

    return-void

    :sswitch_6
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u1a79\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x274d

    const v6, -0x8ef33fa

    xor-int/2addr v5, v6

    const v6, -0x37eef776

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06e2\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1135

    const v6, -0x74c540e1

    xor-int/2addr v5, v6

    const v6, 0x35e2dc64

    goto :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_2

    :goto_1
    const-string v4, "\u1a74\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2b5b

    const v6, -0x36ce1048    # -728827.5f

    xor-int/2addr v5, v6

    const v6, 0x222a557f

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28bf

    const v6, 0x516b2618

    xor-int/2addr v5, v6

    const v6, -0x71ee87d8

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5f51

    const v6, 0x4041c07b

    xor-int/2addr v5, v6

    const v6, 0x39d633f5

    goto/16 :goto_0

    .line 16
    :sswitch_a
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06e1\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7913

    const v6, -0x5571845

    xor-int/2addr v5, v6

    const v6, -0x1bb5fb4b

    goto/16 :goto_0

    .line 8
    :sswitch_b
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e1\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x40c3

    const v6, 0x31a59f9d

    xor-int/2addr v5, v6

    const v6, -0x2d37614

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1fe7

    const v6, 0x515aa86d

    xor-int/2addr v5, v6

    const v6, -0x7c916ff0

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e0\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4523

    const v6, 0x741dfeb5

    xor-int/2addr v5, v6

    const v6, -0x727a3a9a

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u0730\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x509b

    const v6, -0x2cbc8ee

    xor-int/2addr v5, v6

    const v6, 0x14cc3d6b

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x112d

    const v6, -0x4203994e

    xor-int/2addr v5, v6

    const v6, -0x1c8dbd63

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u073a\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a27

    const v6, -0x4b366f70

    xor-int/2addr v5, v6

    const v6, 0x76b3b048

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x58bb

    const v6, 0x7d5682b8

    xor-int/2addr v5, v6

    const v6, -0x1a7521b5

    goto/16 :goto_0

    .line 29
    :sswitch_e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u06e7\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x60b5

    const v6, -0x67cc98c5

    xor-int/2addr v5, v6

    const v6, -0x319a1f16

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e1\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x615d

    const v6, 0x74b19710

    xor-int/2addr v5, v6

    const v6, -0x7d343c41

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72c627c1 -> :sswitch_7
        -0x7021615d -> :sswitch_7
        -0x6963e31a -> :sswitch_3
        -0x62d26c10 -> :sswitch_0
        -0x620ca86d -> :sswitch_9
        -0x5f1d56cf -> :sswitch_1
        -0x5946a44f -> :sswitch_8
        -0x5437db56 -> :sswitch_4
        -0x4a9ac632 -> :sswitch_a
        -0x3648566e -> :sswitch_1
        -0x311f5710 -> :sswitch_c
        -0x77f8731 -> :sswitch_8
        -0x428e0f8 -> :sswitch_0
        0x9db42e7 -> :sswitch_e
        0xedd4cf8 -> :sswitch_b
        0xf12aa61 -> :sswitch_a
        0xf5d293c -> :sswitch_c
        0x18a3c60a -> :sswitch_5
        0x1ed4c90c -> :sswitch_2
        0x2bc6f4c2 -> :sswitch_4
        0x3281e55b -> :sswitch_b
        0x3723b840 -> :sswitch_d
        0x3dcfd060 -> :sswitch_d
        0x3eae9ad0 -> :sswitch_6
        0x48f00f03 -> :sswitch_e
        0x4bc3e85d -> :sswitch_5
        0x52bc8d78 -> :sswitch_2
        0x5b4e24ab -> :sswitch_9
        0x62f6ac8d -> :sswitch_3
        0x71001881 -> :sswitch_6
    .end sparse-switch
.end method
