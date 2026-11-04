.class public final synthetic Ll/ۛۙۧ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/ۚ᩷ۧ;

.field public final synthetic ᩶:Landroid/widget/PopupWindow;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ᩷ۧ;Landroid/widget/PopupWindow;)V
    .locals 6

    const v0, 0x34bb4fda

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7b\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2257

    const v5, 0x1c166507

    xor-int/2addr v4, v5

    const v5, 0x1cd15828

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x435

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_2

    .line 3
    :sswitch_0
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_9

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-gez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a76\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4af3

    const v5, 0x3574fae

    xor-int/2addr v4, v5

    const v5, -0x441bba9c

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_1

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۛۙۧ;->᩶:Landroid/widget/PopupWindow;

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x473

    const v5, 0xe13d4ca

    xor-int/2addr v4, v5

    const v5, 0x6c4fae3e

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x73ef

    const v5, -0x3e8a8fe2

    xor-int/2addr v4, v5

    const v5, -0x3cb52312

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e1\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x204f

    const v5, -0x7a4bb31c

    xor-int/2addr v4, v5

    const v5, 0x396aad98

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ed7

    const v5, -0x2dbd1050

    xor-int/2addr v4, v5

    const v5, -0x2587d308

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x46bf

    const v5, -0x6c4b111b

    xor-int/2addr v4, v5

    const v5, -0x7ecfa105

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x21b5

    const v5, -0x1c7f8693

    xor-int/2addr v4, v5

    const v5, -0x5e7c9c0b

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a75\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ec3

    const v5, -0x5dce25a8

    xor-int/2addr v4, v5

    const v5, -0x6d1a7cf6

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b37

    const v5, -0x2ba33d5

    xor-int/2addr v4, v5

    const v5, -0x171aaee0

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x554d

    const v5, -0xfcc6432

    xor-int/2addr v4, v5

    const v5, 0x1b84b01d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7a\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e9d

    const v5, -0x4a9cb97b

    xor-int/2addr v4, v5

    const v5, -0x1654c250

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_a

    :cond_9
    const-string v3, "\u06dc\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c3f

    const v5, 0x6bdb2953

    xor-int/2addr v4, v5

    const v5, -0x666456ea

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x374b

    const v5, -0x2745add0

    xor-int/2addr v4, v5

    const v5, -0x2c3281bc

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۛۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06d6\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7021

    const v5, -0x36e0906e

    xor-int/2addr v4, v5

    const v5, 0xbfc91d8

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x57e7

    const v5, -0x117ae759

    xor-int/2addr v4, v5

    const v5, 0x3ebbc707

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ce5299e -> :sswitch_4
        -0x7b648f45 -> :sswitch_d
        -0x718c129e -> :sswitch_8
        -0x691296a5 -> :sswitch_e
        -0x600d5107 -> :sswitch_7
        -0x5f7772a6 -> :sswitch_a
        -0x45b537f1 -> :sswitch_e
        -0x35287e32 -> :sswitch_5
        -0x264031f7 -> :sswitch_b
        -0x2577a029 -> :sswitch_9
        -0x240f9a88 -> :sswitch_6
        -0x1ea050be -> :sswitch_1
        -0x132064db -> :sswitch_6
        0x8c680d8 -> :sswitch_5
        0x13b5df3a -> :sswitch_c
        0x1d7fd4da -> :sswitch_2
        0x1eb2726c -> :sswitch_0
        0x26ccf36e -> :sswitch_2
        0x27a86e54 -> :sswitch_4
        0x3c494101 -> :sswitch_9
        0x4f30d96c -> :sswitch_b
        0x50383707 -> :sswitch_1
        0x53eae133 -> :sswitch_0
        0x70398146 -> :sswitch_a
        0x71aa113b -> :sswitch_3
        0x7556ef9d -> :sswitch_c
        0x76d61b28 -> :sswitch_d
        0x78d9ac31 -> :sswitch_3
        0x7ef0ae25 -> :sswitch_8
        0x7f755dd0 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x10363d18

    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v7, "\u06e4\u06d8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x7b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x38f5

    const v9, 0x32a229a8

    xor-int/2addr v8, v9

    const v9, 0x4972b892    # 994185.1f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x7579

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 454
    invoke-virtual {v1, v2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    sget v7, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v7, :cond_2

    goto/16 :goto_5

    :sswitch_0
    sget v7, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v7, :cond_3

    goto/16 :goto_2

    :sswitch_1
    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v7, :cond_a

    goto/16 :goto_3

    .line 324
    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v7, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v7, :cond_7

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    const/4 v0, 0x0

    return-object v0

    .line 456
    :sswitch_5
    new-instance v7, Ll/᩶ۙۧ;

    .line 369
    sget v8, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v8, :cond_0

    goto/16 :goto_4

    .line 456
    :cond_0
    invoke-direct {v7, v3}, Ll/᩶ۙۧ;-><init>(Ll/ۚ᩷ۧ;)V

    invoke-static {v1, v3, v7}, Ll/֡۟;->᩹᩹֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 462
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0

    .line 455
    :sswitch_6
    iget-object v3, p0, Ll/ۛۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    invoke-virtual {v1, v3}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;)V

    sget v7, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v7, :cond_1

    goto :goto_1

    :cond_1
    const-string v7, "\u05ab\u06d6"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4f31

    const v9, 0x6eea8675

    xor-int/2addr v8, v9

    const v9, 0x2be4145e

    goto :goto_0

    :cond_2
    const-string v7, "\u1a75\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2ec9

    const v9, -0x131a3e21

    xor-int/2addr v8, v9

    const v9, -0x22f9503f

    goto :goto_0

    .line 454
    :sswitch_7
    sget-object v1, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    const/4 v2, 0x0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v7

    if-gtz v7, :cond_4

    :cond_3
    :goto_1
    const-string v7, "\u06e8\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x11f3

    const v9, -0x5452e5d3

    xor-int/2addr v8, v9

    const v9, -0x171e1542

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u1a77\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6c5f

    const v9, -0x79872527

    xor-int/2addr v8, v9

    const v9, 0x2c0c6990

    goto/16 :goto_0

    .line 453
    :sswitch_8
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_5

    goto :goto_3

    :cond_5
    const-string v7, "\u06e0\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5a3d

    const v9, -0x67b1a462

    xor-int/2addr v8, v9

    const v9, 0x613923ea

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Ll/ۛۙۧ;->᩶:Landroid/widget/PopupWindow;

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v7

    if-eqz v7, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v7, "\u06db\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7fa5

    const v9, 0x4efc9766    # 2.1188902E9f

    xor-int/2addr v8, v9

    const v9, -0x17a1133f

    goto/16 :goto_0

    .line 265
    :sswitch_a
    sget v7, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v7, :cond_8

    :cond_7
    :goto_2
    const-string v7, "\u1a73\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0xb

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1023

    const v9, -0x3dbd1527

    xor-int/2addr v8, v9

    const v9, 0x58b3cb8d

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06eb\u06dc"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x18e7

    const v9, 0x13979aac

    xor-int/2addr v8, v9

    const v9, 0x64b6c93a

    goto/16 :goto_0

    .line 280
    :sswitch_b
    sget v7, Ll/᩺;->۫۬۫:I

    if-gtz v7, :cond_9

    :goto_3
    const-string v7, "\u06d8\u06e0"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1543

    const v9, -0x79b73405

    xor-int/2addr v8, v9

    const v9, -0x15179420

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06eb\u1a7b"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5bcd

    const v9, -0x6df97fd6

    xor-int/2addr v8, v9

    const v9, 0x52354179

    goto/16 :goto_0

    .line 179
    :sswitch_c
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_4
    const-string v7, "\u0730\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x67

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x388d

    const v9, 0x7d9e8f97

    xor-int/2addr v8, v9

    const v9, 0x71fb300f

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06e8\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x19

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x217d

    const v9, 0x53cc4e50

    xor-int/2addr v8, v9

    const v9, -0x26847615

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v7, Ll/ۚ᩷ۧ;->᩻᩷:I

    .line 132
    sget v7, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v7, :cond_c

    :goto_5
    const-string v7, "\u0736\u06d7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x57

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6753

    const v9, -0x2ccf8b07

    xor-int/2addr v8, v9

    const v9, 0x34a57bda

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d9\u073f"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x44d

    const v9, 0x3bb0e542

    xor-int/2addr v8, v9

    const v9, -0x42b5ccb3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c1b2863 -> :sswitch_c
        -0x76665e10 -> :sswitch_b
        -0x5c0291f1 -> :sswitch_3
        -0x5827c53d -> :sswitch_5
        -0x574af306 -> :sswitch_7
        -0x56b855c7 -> :sswitch_4
        -0x45679633 -> :sswitch_b
        -0x3fc49c15 -> :sswitch_a
        -0x38f3e24e -> :sswitch_2
        -0x35a40217 -> :sswitch_a
        -0x33088cd5 -> :sswitch_5
        -0x2fdec7fb -> :sswitch_1
        -0x2fb6a813 -> :sswitch_0
        -0x2e82811c -> :sswitch_1
        -0x2c75f913 -> :sswitch_6
        -0x1fd70940 -> :sswitch_7
        -0x81475b0 -> :sswitch_d
        0x178b3c -> :sswitch_8
        0xda94ef6 -> :sswitch_4
        0xf313e68 -> :sswitch_2
        0x28ab4171 -> :sswitch_c
        0x28b77588 -> :sswitch_9
        0x2dccc388 -> :sswitch_d
        0x33880533 -> :sswitch_9
        0x3bb75d85 -> :sswitch_0
        0x4108d6b7 -> :sswitch_8
        0x5e4f1004 -> :sswitch_6
        0x662aac5e -> :sswitch_3
    .end sparse-switch
.end method
