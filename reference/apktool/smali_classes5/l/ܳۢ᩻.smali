.class public final synthetic Ll/ܳۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/۬᩺ۤ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 6

    const v0, 0x1839e68e

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x52a9

    const v5, -0x151279b6

    xor-int/2addr v4, v5

    const v5, -0x27a31238

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3177

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto :goto_1

    .line 4
    :sswitch_0
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v3, :cond_9

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v3, Ll/᩺;->۫۬۫:I

    if-lez v3, :cond_b

    :goto_1
    const-string v3, "\u06dc\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb6d

    const v5, -0x5954cc4f

    xor-int/2addr v4, v5

    const v5, 0xa5c631b

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-boolean p2, p0, Ll/ܳۢ᩻;->᩶:Z

    return-void

    .line 4
    :sswitch_5
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u073d\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x163d

    const v5, -0x7c8af4b0

    xor-int/2addr v4, v5

    const v5, -0x54395471

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a3

    const v5, 0x39d5069d

    xor-int/2addr v4, v5

    const v5, -0xcf4848e

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4be5

    const v5, 0xfd39250

    xor-int/2addr v4, v5

    const v5, -0xa665f19

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_3

    :goto_2
    const-string v3, "\u06e2\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7edd

    const v5, -0x60f53398

    xor-int/2addr v4, v5

    const v5, 0x2fe61a6b

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5609

    const v5, -0x33b1efd0    # -5.401824E7f

    xor-int/2addr v4, v5

    const v5, 0x6fbc5986

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xcc7

    const v5, -0x328b45a8

    xor-int/2addr v4, v5

    const v5, -0x399c72ce

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u06d8\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e3b

    const v5, 0x6058c063

    xor-int/2addr v4, v5

    const v5, -0x6e7d0d57

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x427d

    const v5, 0x5f4c3120

    xor-int/2addr v4, v5

    const v5, 0x794c192b

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c07

    const v5, -0x54ce6565

    xor-int/2addr v4, v5

    const v5, 0x4dbf4b52

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x2d

    const v5, -0x3d4031ee

    xor-int/2addr v4, v5

    const v5, -0x4c71f7ad

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u073d\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2617

    const v5, -0x31caadd0

    xor-int/2addr v4, v5

    const v5, 0x583d8a57

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63cd

    const v5, -0x278bb14f

    xor-int/2addr v4, v5

    const v5, 0x1dd64d43

    goto/16 :goto_0

    :sswitch_e
    iput p1, p0, Ll/ܳۢ᩻;->ܰ:I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d8\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4ed1

    const v5, 0x10b25ffd

    xor-int/2addr v4, v5

    const v5, 0x5ea75fbc

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x105b

    const v5, 0x3da92df1

    xor-int/2addr v4, v5

    const v5, -0x3a798498

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f36ad50 -> :sswitch_c
        -0x796c5df6 -> :sswitch_5
        -0x72d572ed -> :sswitch_c
        -0x68bcb63c -> :sswitch_3
        -0x6833b056 -> :sswitch_0
        -0x61ed9679 -> :sswitch_7
        -0x5e370cdb -> :sswitch_8
        -0x5c897a84 -> :sswitch_1
        -0x3f82a0d4 -> :sswitch_5
        -0x37f7b8b7 -> :sswitch_8
        -0x3773499b -> :sswitch_7
        -0x36766c9b -> :sswitch_2
        -0x32d9d650 -> :sswitch_a
        -0x26f965b0 -> :sswitch_2
        -0x26a7cad8 -> :sswitch_4
        -0x2066dbeb -> :sswitch_0
        -0xa236b88 -> :sswitch_b
        -0x2535fe5 -> :sswitch_e
        0x321a279 -> :sswitch_9
        0xbd15b56 -> :sswitch_a
        0xc9dd9f7 -> :sswitch_9
        0x13a347db -> :sswitch_e
        0x2aa31567 -> :sswitch_1
        0x2e92f656 -> :sswitch_b
        0x408ab0fa -> :sswitch_6
        0x468cabb7 -> :sswitch_3
        0x4ca6ed4a -> :sswitch_d
        0x56cf2040 -> :sswitch_d
        0x6886be81 -> :sswitch_6
        0x758060ac -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(II)I
    .locals 5

    const p1, -0x6689162d

    sget v0, Ll/֫֡;->֫ۙۖ:I

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v2, "\u06d6\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5667

    const v4, -0x35910efb

    xor-int/2addr v3, v4

    const v4, -0x14562c86

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x4945

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_2

    .line 288
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v2

    if-lez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u1a76\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x487

    const v4, -0x368e8abd

    xor-int/2addr v3, v4

    const v4, -0x2f25ca36

    goto :goto_0

    .line 351
    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v2

    if-gtz v2, :cond_d

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v2

    if-eqz v2, :cond_8

    goto/16 :goto_2

    .line 600
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    const/4 p1, 0x0

    return p1

    :sswitch_4
    return p2

    .line 665
    :sswitch_5
    sget p1, Ll/ۗۡ֫;->ۧ:I

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {p1, p2, v0}, Ll/ᩴᩳ;->ۙ(IIF)I

    move-result p1

    return p1

    .line 7
    :sswitch_6
    iget p1, p0, Ll/ܳۢ᩻;->ܰ:I

    return p1

    .line 661
    :sswitch_7
    iget-boolean v2, p0, Ll/ܳۢ᩻;->᩶:Z

    if-eqz v2, :cond_1

    const-string v2, "\u06d8\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x71

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4213

    const v4, -0x5f1c4bed

    xor-int/2addr v3, v4

    const v4, 0x523a8d5c

    goto :goto_0

    :cond_1
    const-string v2, "\u06e4\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4f69

    const v4, -0x38afc55f

    xor-int/2addr v3, v4

    const v4, -0x1db3a3a8

    goto :goto_0

    :sswitch_8
    const v2, -0xb8b8b9

    if-ne p2, v2, :cond_2

    const-string v2, "\u1a74\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3481

    const v4, -0x3d9903e3

    xor-int/2addr v3, v4

    const v4, -0x6e95d51a

    goto/16 :goto_0

    :cond_2
    const-string v2, "\u06ec\u06da"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x670d

    const v4, 0x13ebd29b

    xor-int/2addr v3, v4

    const v4, -0x4d0b192c

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v2

    if-gtz v2, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v2, "\u06dc\u1a78"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x9

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3fb7

    const v4, 0x3bb63eae

    xor-int/2addr v3, v4

    const v4, -0x5486bab3

    goto/16 :goto_0

    .line 47
    :sswitch_a
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v2

    if-gtz v2, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v2, "\u06d8\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x46af

    const v4, -0x5c2cef98

    xor-int/2addr v3, v4

    const v4, -0x2e321c0d

    goto/16 :goto_0

    .line 326
    :sswitch_b
    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v2, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v2, "\u1a73\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2471

    const v4, -0x2a4ef4d4

    xor-int/2addr v3, v4

    const v4, -0x70de0690

    goto/16 :goto_0

    .line 208
    :sswitch_c
    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v2, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string v2, "\u06d7\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x3b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x54bb

    const v4, 0x2d609b07

    xor-int/2addr v3, v4

    const v4, -0x7f8a3eb1

    goto/16 :goto_0

    .line 96
    :sswitch_d
    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v2, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v2, "\u06dc\u1a79"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1081

    const v4, 0x5b19ba73

    xor-int/2addr v3, v4

    const v4, -0x15f48272

    goto/16 :goto_0

    .line 294
    :sswitch_e
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    const-string v2, "\u06d6\u1a79"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4e85

    const v4, -0x6463e616

    xor-int/2addr v3, v4

    const v4, 0x6d0686e0

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u1a79\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3171

    const v4, 0x7efa652b

    xor-int/2addr v3, v4

    const v4, 0x2f140eb4

    goto/16 :goto_0

    .line 614
    :sswitch_f
    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_a

    goto :goto_1

    :cond_a
    const-string v2, "\u073a\u06e2"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4f5d

    const v4, -0xab10a51

    xor-int/2addr v3, v4

    const v4, -0x1f84e9d9

    goto/16 :goto_0

    .line 126
    :sswitch_10
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v2

    if-ltz v2, :cond_b

    :goto_1
    const-string v2, "\u1a78\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x26bd

    const v4, 0x1e302453

    xor-int/2addr v3, v4

    const v4, -0x2e132

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u1a79\u1a77"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x394b

    const v4, -0x3732e86

    xor-int/2addr v3, v4

    const v4, -0x63c63cd7

    goto/16 :goto_0

    .line 428
    :sswitch_11
    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v2, :cond_c

    :goto_2
    const-string v2, "\u1a77\u06db"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3005

    const v4, 0x12536147

    xor-int/2addr v3, v4

    const v4, -0x3e54cf3e

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u073f\u1a76"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0xe41

    const v4, 0x6b96c8f0

    xor-int/2addr v3, v4

    const v4, -0x4ac42e8e

    goto/16 :goto_0

    :sswitch_12
    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v2, :cond_e

    :cond_d
    :goto_3
    const-string v2, "\u0730\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6ead

    const v4, -0x15b6442f

    xor-int/2addr v3, v4

    const v4, 0x39221c2d

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06db\u06da"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x493d

    const v4, 0x5c46a857

    xor-int/2addr v3, v4

    const v4, 0x6a9f50fe

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7063adc8 -> :sswitch_6
        -0x6b2b4c42 -> :sswitch_b
        -0x6647312c -> :sswitch_1
        -0x5daca1c2 -> :sswitch_0
        -0x56e5cf1d -> :sswitch_e
        -0x54d2bff9 -> :sswitch_5
        -0x526ca8a5 -> :sswitch_a
        -0x49601ae0 -> :sswitch_0
        -0x3f1e1cc3 -> :sswitch_8
        -0x39bcfd85 -> :sswitch_a
        -0x359f4610 -> :sswitch_1
        -0x3063612f -> :sswitch_c
        -0x2fe60347 -> :sswitch_7
        -0x27f72fd9 -> :sswitch_6
        -0x27482952 -> :sswitch_10
        -0x233f49fa -> :sswitch_5
        -0x1fbb278c -> :sswitch_2
        -0x1f4808a9 -> :sswitch_9
        -0x19a395e1 -> :sswitch_2
        -0xea82b63 -> :sswitch_e
        -0xcb99eec -> :sswitch_8
        -0xafb2eb9 -> :sswitch_4
        0x1ea0eff -> :sswitch_12
        0x252d9b4 -> :sswitch_b
        0x2b9a341 -> :sswitch_4
        0xeb39d6f -> :sswitch_9
        0x1ed69bb9 -> :sswitch_3
        0x23fe4b8d -> :sswitch_11
        0x34d79984 -> :sswitch_12
        0x357502ac -> :sswitch_c
        0x43441c08 -> :sswitch_f
        0x447bc13e -> :sswitch_11
        0x4e2b924d -> :sswitch_3
        0x545153ce -> :sswitch_d
        0x6676f51a -> :sswitch_d
        0x6a45ba5a -> :sswitch_10
        0x6d8aab85 -> :sswitch_7
        0x7d11cf43 -> :sswitch_f
    .end sparse-switch
.end method
