.class public final synthetic Ll/֡ۢۤ;
.super Ljava/lang/Object;
.source "81RP"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/util/ArrayList;

.field public final synthetic ᩷:[Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;[Z)V
    .locals 6

    const v0, 0x1861a2ab

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5701

    const v5, 0x6902631

    xor-int/2addr v4, v5

    const v5, 0x74bbb4a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5959

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_5

    goto :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v3, :cond_7

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    :goto_1
    const-string v3, "\u1a7a\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x60af

    const v5, -0x4ccc98e9

    xor-int/2addr v4, v5

    const v5, -0x12835151

    goto :goto_0

    .line 3
    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/֡ۢۤ;->᩷:[Z

    return-void

    :cond_0
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x55c1

    const v5, 0x2c036f76

    xor-int/2addr v4, v5

    const v5, 0x44d5f2d4

    goto :goto_0

    :sswitch_6
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06e2\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x722f

    const v5, -0x5d1a887d

    xor-int/2addr v4, v5

    const v5, 0x3ca3b2e9

    goto/16 :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e1\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3439

    const v5, 0x7a19bea3

    xor-int/2addr v4, v5

    const v5, -0x305ecc60

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06e1\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4269

    const v5, -0x260cae41

    xor-int/2addr v4, v5

    const v5, -0x69976720

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f51

    const v5, -0x7fff06a7

    xor-int/2addr v4, v5

    const v5, 0x3d298709

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a76\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x416b

    const v5, -0x7959f319

    xor-int/2addr v4, v5

    const v5, -0x53ce5fd0

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22f5

    const v5, -0x5337e0c3

    xor-int/2addr v4, v5

    const v5, -0x53d4b1b2

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v3

    if-gtz v3, :cond_8

    :cond_7
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x442f

    const v5, -0x71d1c8

    xor-int/2addr v4, v5

    const v5, -0x5ef5b14b

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x456b

    const v5, 0x90b75cb

    xor-int/2addr v4, v5

    const v5, -0x26552401

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xf7b

    const v5, -0x2a407321

    xor-int/2addr v4, v5

    const v5, 0x561e2b74

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x115d

    const v5, 0x194afa92

    xor-int/2addr v4, v5

    const v5, -0x26971236

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x117b

    const v5, 0x1d2a901

    xor-int/2addr v4, v5

    const v5, -0x2b07ed88

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/֡ۢۤ;->ۙ:Ljava/util/ArrayList;

    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e2\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4103

    const v5, -0xa3e9cb5

    xor-int/2addr v4, v5

    const v5, -0x3d8f9749

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6669

    const v5, 0x3309e3a1

    xor-int/2addr v4, v5

    const v5, -0x5f635629

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a6a79b2 -> :sswitch_6
        -0x68b33c11 -> :sswitch_7
        -0x660511fa -> :sswitch_3
        -0x657a4b05 -> :sswitch_8
        -0x6243446b -> :sswitch_e
        -0x5d533a73 -> :sswitch_e
        -0x5a7ca6f6 -> :sswitch_1
        -0x55304ecd -> :sswitch_8
        -0x426ed43b -> :sswitch_3
        -0x2e00d231 -> :sswitch_a
        -0x26c4e895 -> :sswitch_b
        -0x250b38ec -> :sswitch_5
        -0x1557e28a -> :sswitch_d
        -0x13079ab5 -> :sswitch_c
        -0xc552d37 -> :sswitch_2
        -0x459d7ed -> :sswitch_1
        0xaaa4468 -> :sswitch_2
        0xab34ad7 -> :sswitch_9
        0x1c10e6bd -> :sswitch_d
        0x220b86b8 -> :sswitch_b
        0x29d5823a -> :sswitch_a
        0x30f0a821 -> :sswitch_7
        0x3d773d4a -> :sswitch_0
        0x3e09d32f -> :sswitch_9
        0x4785c7c0 -> :sswitch_6
        0x4be74a7e -> :sswitch_4
        0x582430c0 -> :sswitch_4
        0x7263f681 -> :sswitch_c
        0x7c7089a9 -> :sswitch_5
        0x7ff309f2 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;IZ)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x1c4bf086

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    const-string v6, "\u06e2\u05ab"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6f8f

    const v8, 0x1591126a

    xor-int/2addr v7, v8

    const v8, 0x67fddf67

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x3a3

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    :sswitch_0
    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_d

    goto :goto_1

    .line 67
    :sswitch_1
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v6, "\u1a75\u1a76"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6b11

    const v8, 0x77bd66b9

    xor-int/2addr v7, v8

    const v8, 0x675aceb4

    goto :goto_0

    .line 58
    :sswitch_2
    sget v6, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v6, :cond_6

    goto/16 :goto_4

    .line 108
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_4

    .line 122
    :sswitch_4
    new-instance v6, Ll/ۢۢۤ;

    invoke-direct {v6, v2, p2}, Ll/ۢۢۤ;-><init>(Ll/᩹ᩴ;I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v2, 0x1

    .line 118
    aput-boolean v2, v1, p2

    .line 120
    move-object v2, p1

    check-cast v2, Ll/ۨᩴ;

    invoke-virtual {v2}, Ll/ۨᩴ;->ۙ()Ll/᩹ᩴ;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v6, "\u06ec\u06da"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6f4f

    const v8, 0x6f733bf7

    xor-int/2addr v7, v8

    const v8, -0x6afe1483

    goto :goto_0

    :cond_1
    :goto_2
    const-string v6, "\u06dc\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3323

    const v8, 0x7821b684

    xor-int/2addr v7, v8

    const v8, -0x3d347ba0

    goto :goto_0

    .line 117
    :sswitch_7
    invoke-virtual {v0}, Ll/᩵ۙܺ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "\u06df\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1627

    const v8, -0xa51bb1b

    xor-int/2addr v7, v8

    const v8, 0x524d7319

    goto/16 :goto_0

    .line 126
    :sswitch_8
    aput-boolean p3, v1, p2

    return-void

    .line 116
    :sswitch_9
    iget-object v0, p0, Ll/֡ۢۤ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0, p2}, Ll/֫֡;->֡ۡۚ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۙܺ;

    .line 117
    iget-object v1, p0, Ll/֡ۢۤ;->᩷:[Z

    if-nez p3, :cond_2

    const-string v6, "\u06d8\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7e17

    const v8, -0x6926f00c

    xor-int/2addr v7, v8

    const v8, 0x4b367eb8    # 1.1959992E7f

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06e0\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x7f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6cc3

    const v8, 0x72931344

    xor-int/2addr v7, v8

    const v8, -0xdbd289f

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v6, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v6, "\u06d7\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6327

    const v8, 0x4d26f53a    # 1.7506806E8f

    xor-int/2addr v7, v8

    const v8, -0x2384fdf6

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v6, :cond_4

    goto :goto_4

    :cond_4
    const-string v6, "\u05ab\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x37

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x70bf

    const v8, -0x37c9e2d9

    xor-int/2addr v7, v8

    const v8, 0xe4afb8d

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v6, :cond_5

    goto :goto_5

    :cond_5
    const-string v6, "\u0733\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7931

    const v8, -0x861b2a5

    xor-int/2addr v7, v8

    const v8, 0x12d9e786

    goto/16 :goto_0

    .line 84
    :sswitch_d
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_7

    :cond_6
    :goto_3
    const-string v6, "\u06d9\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5f5b

    const v8, 0x428fac28

    xor-int/2addr v7, v8

    const v8, -0xe99091a

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x11b7

    const v8, -0xcaa28e6

    xor-int/2addr v7, v8

    const v8, -0x7b5d25b4

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_8

    :goto_4
    const-string v6, "\u06d6\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3883

    const v8, -0x7900e68f

    xor-int/2addr v7, v8

    const v8, 0x5f296ac5

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a7a\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x482b

    const v8, -0x56d901a0

    xor-int/2addr v7, v8

    const v8, 0x33061843

    goto/16 :goto_0

    .line 102
    :sswitch_f
    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_9

    :goto_5
    const-string v6, "\u06dc\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x137d

    const v8, 0x66eaefc8

    xor-int/2addr v7, v8

    const v8, 0x40dba0a4

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u073a\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6743

    const v8, -0x190f200b

    xor-int/2addr v7, v8

    const v8, 0x2ff23700

    goto/16 :goto_0

    .line 86
    :sswitch_10
    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_a

    goto :goto_6

    :cond_a
    const-string v6, "\u1a74\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x642b

    const v8, -0x67d9afaa

    xor-int/2addr v7, v8

    const v8, -0x13ae03e1

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_b

    goto :goto_6

    :cond_b
    const-string v6, "\u06d6\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x79c1

    const v8, -0x11ae7670

    xor-int/2addr v7, v8

    const v8, 0x67d52455

    goto/16 :goto_0

    .line 44
    :sswitch_12
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_c

    goto :goto_6

    :cond_c
    const-string v6, "\u06e0\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6607

    const v8, -0x2b3954c1

    xor-int/2addr v7, v8

    const v8, 0x1530c961

    goto/16 :goto_0

    .line 87
    :sswitch_13
    sget v6, Ll/۬;->᩸ۜ᩹:I

    if-eqz v6, :cond_e

    :cond_d
    :goto_6
    const-string v6, "\u06d9\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1f2b

    const v8, -0x76254386

    xor-int/2addr v7, v8

    const v8, -0x412d5d7f

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06df\u06d8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x22e9

    const v8, -0x12b19091

    xor-int/2addr v7, v8

    const v8, -0x7971a16a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b805c5f -> :sswitch_6
        -0x72ad7a64 -> :sswitch_6
        -0x727d1531 -> :sswitch_5
        -0x71b23734 -> :sswitch_10
        -0x6ccd931a -> :sswitch_9
        -0x648daeeb -> :sswitch_5
        -0x53d23953 -> :sswitch_13
        -0x4d908ac8 -> :sswitch_e
        -0x41d05209 -> :sswitch_3
        -0x3f69b2e4 -> :sswitch_2
        -0x3bca1bb1 -> :sswitch_9
        -0x3a1556d3 -> :sswitch_b
        -0x25f1563f -> :sswitch_11
        -0x25b77c3d -> :sswitch_4
        -0x1f0817b0 -> :sswitch_8
        -0xacabc43 -> :sswitch_13
        -0xaad6bb0 -> :sswitch_a
        0x6c6ded8 -> :sswitch_b
        0x95b89e4 -> :sswitch_f
        0xe5a225c -> :sswitch_7
        0xf92cefc -> :sswitch_0
        0x283de839 -> :sswitch_d
        0x28e46fab -> :sswitch_10
        0x2a28047a -> :sswitch_d
        0x4116b2a0 -> :sswitch_7
        0x46bbfb8a -> :sswitch_c
        0x50bc8e16 -> :sswitch_12
        0x52903fee -> :sswitch_c
        0x52ffbfb7 -> :sswitch_3
        0x564811ad -> :sswitch_2
        0x56cecb49 -> :sswitch_12
        0x57556af9 -> :sswitch_1
        0x58d656b1 -> :sswitch_8
        0x5a799327 -> :sswitch_11
        0x60bb6432 -> :sswitch_e
        0x60d14971 -> :sswitch_f
        0x6513d6c4 -> :sswitch_a
        0x685f457d -> :sswitch_4
        0x68e0471a -> :sswitch_1
        0x70c74549 -> :sswitch_0
    .end sparse-switch
.end method
