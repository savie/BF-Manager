.class public final synthetic Ll/ۨۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/content/Intent;)V
    .locals 6

    const v0, 0x3ca3c4df    # 0.019991336f

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v2, Ll/ۖ;->ܿۚ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c27

    const v5, -0x4d2e5c52

    xor-int/2addr v4, v5

    const v5, -0x7040ae79

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3ccf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_8

    goto/16 :goto_4

    :sswitch_0
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_6

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v3, :cond_4

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    goto/16 :goto_4

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ۨۜ֫;->᩶:Landroid/content/Intent;

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6a05

    const v5, 0x5bc7a402

    xor-int/2addr v4, v5

    const v5, -0x58d34649

    goto :goto_0

    .line 2
    :sswitch_6
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb45

    const v5, 0x38630410

    xor-int/2addr v4, v5

    const v5, -0x6af68f4c

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x23dd

    const v5, 0x177b79ae

    xor-int/2addr v4, v5

    const v5, -0x5669d816

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06e1\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f9d

    const v5, 0x2853cf8e

    xor-int/2addr v4, v5

    const v5, -0x58dd2d69

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e4\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf2b

    const v5, -0x21d7de4d

    xor-int/2addr v4, v5

    const v5, 0x6e6cd8a0

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf9b

    const v5, 0x64ef5a3f    # 3.5322198E22f

    xor-int/2addr v4, v5

    const v5, 0x22c9af8d

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6973

    const v5, 0x7300ec8a

    xor-int/2addr v4, v5

    const v5, -0x4ff6197

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e2\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2523

    const v5, 0x10294d96

    xor-int/2addr v4, v5

    const v5, -0x2e7a40a8

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u0733\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e97

    const v5, 0x99e1722

    xor-int/2addr v4, v5

    const v5, -0x73c521a9

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3845

    const v5, -0x22f33d71

    xor-int/2addr v4, v5

    const v5, -0x1d638d0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u1a79\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e13

    const v5, 0x297988bd

    xor-int/2addr v4, v5

    const v5, 0x48d8ac2b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61d1

    const v5, 0x58c950fc

    xor-int/2addr v4, v5

    const v5, -0x48eb57e3

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u073f\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2db7

    const v5, -0x30723d63

    xor-int/2addr v4, v5

    const v5, -0x12e2bcf7

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۨۜ֫;->ܰ:Lbin/mt/plus/Main;

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7bd

    const v5, 0x7947e5c8

    xor-int/2addr v4, v5

    const v5, 0x4b03b1e5    # 8630757.0f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x51f9

    const v5, -0x21815048

    xor-int/2addr v4, v5

    const v5, 0x3cce4d4c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x69a6750d -> :sswitch_2
        -0x618852b1 -> :sswitch_a
        -0x4fb1a1f8 -> :sswitch_c
        -0x49a5ec7d -> :sswitch_d
        -0x430d71dc -> :sswitch_4
        -0x30a590b8 -> :sswitch_b
        -0x2ebe3b45 -> :sswitch_0
        -0x2375c9dc -> :sswitch_4
        -0x211b7469 -> :sswitch_8
        -0x1330e916 -> :sswitch_7
        -0xb8de3b3 -> :sswitch_1
        -0x306a756 -> :sswitch_b
        0x336bc3c -> :sswitch_0
        0xa1e47da -> :sswitch_6
        0xaf22518 -> :sswitch_d
        0xc2db9fb -> :sswitch_2
        0xfabf579 -> :sswitch_e
        0x151dd53a -> :sswitch_5
        0x261a20b6 -> :sswitch_3
        0x29828245 -> :sswitch_6
        0x2ec29dc5 -> :sswitch_3
        0x48c18e2d -> :sswitch_c
        0x5192ce84 -> :sswitch_9
        0x5384fc10 -> :sswitch_9
        0x61e16a86 -> :sswitch_5
        0x69245847 -> :sswitch_8
        0x7050dc40 -> :sswitch_7
        0x7b143b81 -> :sswitch_1
        0x7e3e823b -> :sswitch_a
        0x7f01d63b -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۨۜ֫;->ܰ:Lbin/mt/plus/Main;

    iget-object v1, p0, Ll/ۨۜ֫;->᩶:Landroid/content/Intent;

    invoke-static {v0, v1}, Lbin/mt/plus/Main;->᩷(Lbin/mt/plus/Main;Landroid/content/Intent;)V

    return-void
.end method
