.class public final synthetic Ll/᩵ۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, -0x8be0f8c

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22b

    const v5, 0x4a45b9b5    # 3239533.2f

    xor-int/2addr v4, v5

    const v5, -0x7328f7c5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3273

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_2

    goto :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_1

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v3, :cond_b

    goto/16 :goto_4

    :sswitch_2
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v3, :cond_9

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_3

    .line 0
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    invoke-static {p1}, Lbin/mt/plus/Main;->᩹(Lbin/mt/plus/Main;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object p1, p0, Ll/᩵ۤۘ;->ܺ:Lbin/mt/plus/Main;

    .line 1
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2883

    const v5, -0x721a146e

    xor-int/2addr v4, v5

    const v5, 0x22a6bacd

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u1a7b\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1ea9

    const v5, -0x56675b8e

    xor-int/2addr v4, v5

    const v5, -0x5d8c5b82

    goto :goto_0

    :cond_2
    const-string v3, "\u06d7\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x75cf

    const v5, -0x2ed43365

    xor-int/2addr v4, v5

    const v5, 0x270b42a1

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4603

    const v5, 0x7f312bdd

    xor-int/2addr v4, v5

    const v5, 0x7974b16a

    goto/16 :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06d6\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b31

    const v5, 0x74f30cdc

    xor-int/2addr v4, v5

    const v5, 0x69ed2745

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x27d7

    const v5, -0x2940ff36

    xor-int/2addr v4, v5

    const v5, 0x25d1c895

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05a1\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67b9

    const v5, 0x29693670

    xor-int/2addr v4, v5

    const v5, -0x364e47cf

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b5f

    const v5, -0x5171d62d

    xor-int/2addr v4, v5

    const v5, 0x37ec5dbb

    goto/16 :goto_0

    .line 1
    :sswitch_b
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u1a76\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x220f

    const v5, 0x3b243de2

    xor-int/2addr v4, v5

    const v5, 0x561003ed

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_8

    :goto_3
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7429

    const v5, 0x7451ed3c

    xor-int/2addr v4, v5

    const v5, -0x381d84ef

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4591

    const v5, -0x523af663

    xor-int/2addr v4, v5

    const v5, -0x6937efed

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x55c9

    const v5, -0x7ff57534

    xor-int/2addr v4, v5

    const v5, -0x5de407b4

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d6\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x241f

    const v5, 0x7e91a3cf

    xor-int/2addr v4, v5

    const v5, -0x26bf636e

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xc75

    const v5, -0x152a9f55

    xor-int/2addr v4, v5

    const v5, 0xf464039

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b03

    const v5, 0x6f57a243

    xor-int/2addr v4, v5

    const v5, -0x3fb719a0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7549df -> :sswitch_0
        -0x73718b0f -> :sswitch_9
        -0x6b17036c -> :sswitch_5
        -0x678cf609 -> :sswitch_3
        -0x63af32cd -> :sswitch_2
        -0x568ebf4a -> :sswitch_c
        -0x5258f88c -> :sswitch_d
        -0x4e1e8f27 -> :sswitch_d
        -0x49fdd2dc -> :sswitch_8
        -0x47ade20b -> :sswitch_4
        -0x414c4e17 -> :sswitch_b
        -0x31f27e94 -> :sswitch_6
        -0x2e329cf9 -> :sswitch_3
        -0x2bdcaa43 -> :sswitch_e
        -0x28c0e6ad -> :sswitch_4
        -0x19063284 -> :sswitch_b
        -0x13123e1c -> :sswitch_c
        -0xe6ca815 -> :sswitch_1
        -0x31aca5b -> :sswitch_e
        0xb4f0c1e -> :sswitch_a
        0x19dccfcf -> :sswitch_7
        0x218df637 -> :sswitch_8
        0x22dbcd54 -> :sswitch_2
        0x2e046bce -> :sswitch_7
        0x44e8a611 -> :sswitch_9
        0x49a476db -> :sswitch_1
        0x58b8f13b -> :sswitch_6
        0x5a627311 -> :sswitch_0
        0x5e99d60d -> :sswitch_5
        0x76c3534f -> :sswitch_a
    .end sparse-switch
.end method
