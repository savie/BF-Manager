.class public final synthetic Ll/ۧᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܶ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/᩻ᩳ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ᩳ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x26317e67

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fb3

    const v5, 0x1263d7da

    xor-int/2addr v4, v5

    const v5, -0x28db8fd1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1299

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_4

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto/16 :goto_3

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_4
    iget-object p1, p0, Ll/ۧᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    invoke-static {p1}, Ll/᩻ᩳ᩺;->ۨ(Ll/᩻ᩳ᩺;)Ll/۟۟۠;

    move-result-object p1

    return-object p1

    :sswitch_5
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    .line 1
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x119f

    const v5, -0x10d7177e

    xor-int/2addr v4, v5

    const v5, 0x15ee4f51

    goto :goto_0

    .line 2
    :sswitch_6
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ec3

    const v5, -0x1b65a73c

    xor-int/2addr v4, v5

    const v5, 0xb086178

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x28d3

    const v5, 0x35590c02

    xor-int/2addr v4, v5

    const v5, -0x441d8eeb

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4cbd

    const v5, -0x1272c8bc

    xor-int/2addr v4, v5

    const v5, 0x2a6f52d6

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f9d

    const v5, -0x6774cb04

    xor-int/2addr v4, v5

    const v5, 0x5f7200b5

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05ab\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xd63

    const v5, 0x5a66dac1

    xor-int/2addr v4, v5

    const v5, -0x536e7f

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6301

    const v5, -0x3c472758

    xor-int/2addr v4, v5

    const v5, -0x7b27a5cf

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06dc\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x336f

    const v5, 0x3b7ed486

    xor-int/2addr v4, v5

    const v5, 0x5ad5146e

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x76eb

    const v5, 0x71bf0bf0

    xor-int/2addr v4, v5

    const v5, 0x242e3bca

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f7f

    const v5, -0x3e8f0a7b

    xor-int/2addr v4, v5

    const v5, -0x453fe22c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a73\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f17

    const v5, -0x6db8b283

    xor-int/2addr v4, v5

    const v5, 0xf80617c

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u05a8\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x252f

    const v5, -0x717b7288

    xor-int/2addr v4, v5

    const v5, 0x2868cddc

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ca7

    const v5, 0x70456802

    xor-int/2addr v4, v5

    const v5, -0x4580f3d3

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6243

    const v5, -0x238961ee

    xor-int/2addr v4, v5

    const v5, 0xd169c6e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5435

    const v5, -0x375f74cf

    xor-int/2addr v4, v5

    const v5, 0x136861eb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x760cfac0 -> :sswitch_0
        -0x6ab1e7fb -> :sswitch_b
        -0x5e9f7c0c -> :sswitch_c
        -0x4d66e9ab -> :sswitch_6
        -0x46861325 -> :sswitch_1
        -0x466827e3 -> :sswitch_a
        -0x2e4d18fa -> :sswitch_0
        -0x2cc1c6d5 -> :sswitch_8
        -0x29177eab -> :sswitch_7
        -0x1ab121f6 -> :sswitch_2
        -0x1808f189 -> :sswitch_e
        -0x13dcea00 -> :sswitch_b
        -0x7fc8f2c -> :sswitch_4
        -0x6c815eb -> :sswitch_3
        -0x6225854 -> :sswitch_2
        0x23bec1b -> :sswitch_7
        0x2403435 -> :sswitch_3
        0xe650a38 -> :sswitch_e
        0x2a937523 -> :sswitch_9
        0x2ee02cfb -> :sswitch_1
        0x3cb58f73 -> :sswitch_c
        0x44bbea13 -> :sswitch_d
        0x4643669a -> :sswitch_4
        0x4b1a9ba8 -> :sswitch_8
        0x54687176 -> :sswitch_a
        0x5968d3c3 -> :sswitch_5
        0x6deb5480 -> :sswitch_d
        0x7b4de01c -> :sswitch_5
        0x7bbe95a7 -> :sswitch_9
        0x7c72886e -> :sswitch_6
    .end sparse-switch
.end method
