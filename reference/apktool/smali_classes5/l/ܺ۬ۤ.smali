.class public final synthetic Ll/ܺ۬ۤ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ܰ:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۬ۤ;->ܰ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x618f7a8a

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v4, "\u06d8\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x31c1

    const v6, 0x78da2aa

    xor-int/2addr v5, v6

    const v6, 0x62f47c4f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x2691

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_c

    goto/16 :goto_4

    :sswitch_0
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_6

    goto/16 :goto_2

    .line 1
    :sswitch_1
    sget v4, Ll/᩺;->۫۬۫:I

    if-lez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06e2\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x74f9

    const v6, -0x68ea52c8

    xor-int/2addr v5, v6

    const v6, 0x341f72ab

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    goto/16 :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    invoke-static {v0, p1}, Ll/֫֡;->֡ۡۚ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧ۬ۤ;

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ܺ۬ۤ;->ܰ:Ljava/util/ArrayList;

    .line 2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u073f\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2629

    const v6, -0x57389e13

    xor-int/2addr v5, v6

    const v6, 0x5036c8f4

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06d8\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x41ab

    const v6, -0x7b2de13c

    xor-int/2addr v5, v6

    const v6, -0x12ea06dc

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06eb\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x53e9

    const v6, -0x24f3e521

    xor-int/2addr v5, v6

    const v6, -0x23cf2a61

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a78\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x67e7

    const v6, 0x230ffd1

    xor-int/2addr v5, v6

    const v6, -0x37abeb64

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    const-string v4, "\u05a8\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x58b3

    const v6, -0x335b1c54    # -8.64495E7f

    xor-int/2addr v5, v6

    const v6, -0x6825c1d2

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_7

    :cond_6
    :goto_1
    const-string v4, "\u1a74\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x661b

    const v6, 0x268a108e

    xor-int/2addr v5, v6

    const v6, 0x24e8fd8e

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06dc\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c95

    const v6, -0x35a33423

    xor-int/2addr v5, v6

    const v6, 0x36b301d1

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u06e4\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x301d

    const v6, -0xfe8d756

    xor-int/2addr v5, v6

    const v6, 0x1159fee2

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x70a1

    const v6, -0x3e91b047

    xor-int/2addr v5, v6

    const v6, -0x38765e2a

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06e2\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x318d

    const v6, -0x6d8772b7

    xor-int/2addr v5, v6

    const v6, -0x29e11713

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_a

    :goto_3
    const-string v4, "\u06dc\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14b

    const v6, -0x5be84089

    xor-int/2addr v5, v6

    const v6, -0x1a440793

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a85

    const v6, 0x4db16c57    # 3.7208342E8f

    xor-int/2addr v5, v6

    const v6, -0xc76a09d

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v4, "\u1a77\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x359d

    const v6, 0x7f49093f

    xor-int/2addr v5, v6

    const v6, -0x3a332a83

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1a73

    const v6, -0x69a516a9

    xor-int/2addr v5, v6

    const v6, -0x17e61b5c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ec6d40e -> :sswitch_4
        -0x6fd4ce4a -> :sswitch_a
        -0x6d78892a -> :sswitch_2
        -0x69b29154 -> :sswitch_d
        -0x66bde0a7 -> :sswitch_1
        -0x62748d78 -> :sswitch_e
        -0x52fcb393 -> :sswitch_0
        -0x4f95b912 -> :sswitch_3
        -0x4b744562 -> :sswitch_1
        -0x439f42d2 -> :sswitch_8
        -0x32dcc2b9 -> :sswitch_4
        -0x2cc54154 -> :sswitch_8
        -0x2a7c76c8 -> :sswitch_7
        -0x224ccd3a -> :sswitch_c
        -0x1289c331 -> :sswitch_5
        0x2f1568d -> :sswitch_6
        0x7ba8191 -> :sswitch_9
        0xdf83556 -> :sswitch_a
        0x1bf16b31 -> :sswitch_9
        0x27f9cb95 -> :sswitch_2
        0x2d3fac34 -> :sswitch_e
        0x3644cfe2 -> :sswitch_5
        0x3c563a0e -> :sswitch_7
        0x546cdda0 -> :sswitch_d
        0x57e973be -> :sswitch_b
        0x5decc95a -> :sswitch_6
        0x6929ea2a -> :sswitch_0
        0x7086eba2 -> :sswitch_c
        0x76feb722 -> :sswitch_3
        0x7ec04b0a -> :sswitch_b
    .end sparse-switch
.end method
