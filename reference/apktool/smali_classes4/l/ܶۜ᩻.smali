.class public final synthetic Ll/ܶۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/᩸ۡ᩻;

.field public final synthetic ۟:Landroid/app/Activity;

.field public final synthetic ܰ:Ll/۠ۖۧ;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩳ:Ll/ܳ۬᩻;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۖۧ;Ljava/lang/String;Ljava/lang/String;Ll/᩸ۡ᩻;Landroid/app/Activity;Ll/ܳ۬᩻;)V
    .locals 6

    const v0, 0x1aeb7d4

    sget v1, Ll/֫֡;->֫ۙۖ:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6213

    const v5, 0x67456b59

    xor-int/2addr v4, v5

    const v5, -0x2c8ad8f7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x133b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_8

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ܶۜ᩻;->֡:Ll/᩸ۡ᩻;

    iput-object p5, p0, Ll/ܶۜ᩻;->۟:Landroid/app/Activity;

    iput-object p6, p0, Ll/ܶۜ᩻;->ᩳ:Ll/ܳ۬᩻;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ܶۜ᩻;->ܿ:Ljava/lang/String;

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x24a9

    const v5, 0x297abc7d

    xor-int/2addr v4, v5

    const v5, 0x72f74ee7

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06dc\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x663d

    const v5, 0x1819b594

    xor-int/2addr v4, v5

    const v5, -0x7c9a8066

    goto :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06d9\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5545

    const v5, -0x5b5dc6df

    xor-int/2addr v4, v5

    const v5, -0x13635899

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ebd

    const v5, 0x3a2a71a9

    xor-int/2addr v4, v5

    const v5, -0x4fa73cd7

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x164d

    const v5, -0x6c31a67b

    xor-int/2addr v4, v5

    const v5, -0x6ecc92b5

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a74\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d63

    const v5, 0x5fa3b753

    xor-int/2addr v4, v5

    const v5, 0x2c88c7fa

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u073f\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ec9

    const v5, -0x3fdaca5

    xor-int/2addr v4, v5

    const v5, 0x460ad7e5

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u1a78\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4775

    const v5, 0xcac0724

    xor-int/2addr v4, v5

    const v5, 0x36b406ff

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4549

    const v5, -0x39033d74

    xor-int/2addr v4, v5

    const v5, 0x766868cc

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-ltz v3, :cond_9

    :cond_8
    const-string v3, "\u06e2\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5787

    const v5, 0x273c90a

    xor-int/2addr v4, v5

    const v5, -0x107eb103

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x30d1

    const v5, -0x67768f8c

    xor-int/2addr v4, v5

    const v5, 0x23cf7f53

    goto/16 :goto_0

    :cond_a
    :goto_3
    const-string v3, "\u1a7a\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2639

    const v5, 0x6d07f445

    xor-int/2addr v4, v5

    const v5, -0x36c270a9

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a8\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3287

    const v5, 0x573c5eb0

    xor-int/2addr v4, v5

    const v5, -0x2c1822d6

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܶۜ᩻;->ܰ:Ll/۠ۖۧ;

    iput-object p2, p0, Ll/ܶۜ᩻;->᩶:Ljava/lang/String;

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x311f

    const v5, 0x5fe1aa38

    xor-int/2addr v4, v5

    const v5, 0x67f6bf02

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x276d

    const v5, 0x1f58187b

    xor-int/2addr v4, v5

    const v5, -0x401f9de0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7093b9da -> :sswitch_d
        -0x6c4330e9 -> :sswitch_4
        -0x657954c7 -> :sswitch_d
        -0x5cb2df70 -> :sswitch_5
        -0x591fad65 -> :sswitch_1
        -0x544798ae -> :sswitch_c
        -0x521c84ad -> :sswitch_9
        -0x47af7e1a -> :sswitch_b
        -0x413f0335 -> :sswitch_4
        -0x401b6954 -> :sswitch_8
        -0x27adb7ab -> :sswitch_8
        -0xf0e3004 -> :sswitch_a
        0xb45a6e -> :sswitch_0
        0x81b6b3e -> :sswitch_2
        0xf6bf01e -> :sswitch_a
        0x188c7090 -> :sswitch_b
        0x20e00465 -> :sswitch_c
        0x2527aa47 -> :sswitch_6
        0x29f9146f -> :sswitch_9
        0x2e9444f9 -> :sswitch_0
        0x34dba040 -> :sswitch_6
        0x37fd6120 -> :sswitch_3
        0x3a893566 -> :sswitch_e
        0x3b96615d -> :sswitch_5
        0x3ce9a0e5 -> :sswitch_1
        0x4149757b -> :sswitch_2
        0x5045dec0 -> :sswitch_3
        0x5b02500e -> :sswitch_e
        0x61fee0f2 -> :sswitch_7
        0x64ebbdcd -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 13

    const/4 v0, 0x0

    const v1, -0x3a741d7a

    sget v2, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v4, "\u0730\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7fdd

    const v6, 0x3f8933d9

    xor-int/2addr v5, v6

    const v6, -0x5414ccd1

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x1023

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1524
    invoke-static {v0}, Ll/ۖۗ;->ۢ᩸ۙ(Ljava/lang/Object;)V

    .line 638
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_1

    .line 685
    :sswitch_0
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    .line 993
    :sswitch_1
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 1525
    :sswitch_5
    new-instance v4, Ljava/lang/Thread;

    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance v5, Ll/ᩳۤۚ;

    const/4 v12, 0x1

    .line 331
    sget v6, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v6, :cond_2

    :cond_1
    const-string v4, "\u06e7\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x31ff

    const v6, -0x745b5a3e

    xor-int/2addr v5, v6

    const v6, 0x7dc43e8a

    goto :goto_0

    .line 1525
    :cond_2
    iget-object v7, p0, Ll/ܶۜ᩻;->᩶:Ljava/lang/String;

    sget v6, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v6, :cond_3

    const-string v4, "\u0730\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1cf5

    const v6, -0x1c4c1629

    xor-int/2addr v5, v6

    const v6, -0x70f52d8f

    goto :goto_0

    :cond_3
    iget-object v8, p0, Ll/ܶۜ᩻;->ܿ:Ljava/lang/String;

    iget-object v9, p0, Ll/ܶۜ᩻;->֡:Ll/᩸ۡ᩻;

    .line 1044
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v6, :cond_4

    goto :goto_2

    .line 1525
    :cond_4
    iget-object v10, p0, Ll/ܶۜ᩻;->۟:Landroid/app/Activity;

    .line 124
    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v6, :cond_5

    goto :goto_2

    .line 1525
    :cond_5
    iget-object v11, p0, Ll/ܶۜ᩻;->ᩳ:Ll/ܳ۬᩻;

    .line 1130
    sget v6, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v6, :cond_6

    goto :goto_2

    :cond_6
    move-object v6, v5

    .line 1525
    invoke-direct/range {v6 .. v12}, Ll/ᩳۤۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1529
    invoke-static {v4}, Ll/ۖ᩹;->᩷᩹ۖ(Ljava/lang/Object;)V

    return-void

    :cond_7
    const-string v4, "\u1a78\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c2b

    const v6, -0x5a583d32

    xor-int/2addr v5, v6

    const v6, 0x6a1606ea

    goto/16 :goto_0

    .line 144
    :sswitch_6
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_8

    :goto_1
    const-string v4, "\u0736\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7f35

    const v6, 0x7f35bf69

    xor-int/2addr v5, v6

    const v6, -0x2ead64b1

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6f8d

    const v6, -0x18f9613a

    xor-int/2addr v5, v6

    const v6, -0x7306cb45

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x262f

    const v6, -0x2098adb3

    xor-int/2addr v5, v6

    const v6, 0x53a15474

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a77\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xb21

    const v6, 0x38995033

    xor-int/2addr v5, v6

    const v6, 0x549aa98d

    goto/16 :goto_0

    .line 1524
    :sswitch_8
    iget-object v0, p0, Ll/ܶۜ᩻;->ܰ:Ll/۠ۖۧ;

    .line 1355
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_c

    :cond_b
    const-string v4, "\u1a78\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2abb

    const v6, 0x3a6a0b34

    xor-int/2addr v5, v6

    const v6, 0x54570c80

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf2b

    const v6, 0x33ccf530

    xor-int/2addr v5, v6

    const v6, -0x218b1a6a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d81da41 -> :sswitch_7
        -0x6d64dcf1 -> :sswitch_1
        -0x604eeb24 -> :sswitch_0
        -0x5a730acd -> :sswitch_4
        -0x3c003b34 -> :sswitch_8
        -0x22265838 -> :sswitch_6
        -0x1c40a327 -> :sswitch_8
        -0xa47bc50 -> :sswitch_3
        -0x541d049 -> :sswitch_7
        0x15ee6579 -> :sswitch_2
        0x184f439c -> :sswitch_3
        0x1fb9684b -> :sswitch_2
        0x204706b9 -> :sswitch_6
        0x30d6b17c -> :sswitch_1
        0x554c2db2 -> :sswitch_5
        0x5f8bf2f4 -> :sswitch_4
        0x6fd57566 -> :sswitch_0
        0x7a8f4c73 -> :sswitch_5
    .end sparse-switch
.end method
