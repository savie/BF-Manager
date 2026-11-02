.class public final synthetic Ll/ۗᩴ᩺;
.super Ljava/lang/Object;
.source "O6LY"


# static fields
.field public static final synthetic ۙ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x65d25e37

    sget v3, Ll/֨ۧ;->֫۠֡:I

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v5, "\u06d8\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x676f

    const v7, -0x2014b05e

    xor-int/2addr v6, v7

    const v7, 0xc6db746

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x307f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 1
    :sswitch_0
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_8

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v5, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v5, "\u073f\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f8f

    const v7, -0x11de6e0b

    xor-int/2addr v6, v7

    const v7, -0x34f2b356    # -9260202.0f

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_4

    .line 0
    :sswitch_4
    sput-object v1, Ll/ۗᩴ᩺;->ۙ:[I

    return-void

    :sswitch_5
    :try_start_0
    sget-object v5, Ll/᩷ᩴ᩵;->᩶:Ll/᩷ᩴ᩵;

    invoke-static {v5}, Ll/֫۟;->ۡۡ۫(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x2

    aput v6, v1, v5
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v5, "\u06d6\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5fd3

    const v7, 0x671d9ca0

    xor-int/2addr v6, v7

    const v7, -0x4b72f661

    goto :goto_0

    :sswitch_6
    :try_start_1
    sget-object v5, Ll/᩷ᩴ᩵;->ܽ:Ll/᩷ᩴ᩵;

    invoke-static {v5}, Ll/֫۟;->ۡۡ۫(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x1

    aput v6, v1, v5
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v5, "\u1a77\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x493

    const v7, 0x75378565

    xor-int/2addr v6, v7

    const v7, 0x48152bb3

    goto :goto_0

    :sswitch_7
    new-array v1, v0, [I

    const-string v5, "\u073a\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xfb9

    const v7, 0x593d9ac4

    xor-int/2addr v6, v7

    const v7, 0x7c41c7d3

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v5, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u1a76\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xfd3

    const v7, 0x433c132f

    xor-int/2addr v6, v7

    const v7, -0xe439e5a

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v5, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u06d7\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6c6f

    const v7, -0x1b158a5a

    xor-int/2addr v6, v7

    const v7, -0x2d9970bb

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u06d8\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6c9d

    const v7, -0x1edcc7b8

    xor-int/2addr v6, v7

    const v7, 0x2b74682d

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u1a76\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5e29

    const v7, 0x8993344

    xor-int/2addr v6, v7

    const v7, 0x7ce0c464

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_6

    :cond_5
    :goto_1
    const-string v5, "\u0736\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x42b5

    const v7, 0x29a2c976

    xor-int/2addr v6, v7

    const v7, 0x50b72e71

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a75\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3fe1

    const v7, -0x58947cd0

    xor-int/2addr v6, v7

    const v7, 0x27532dfe

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-gtz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u073a\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x79d

    const v7, -0x6c5e858c

    xor-int/2addr v6, v7

    const v7, 0x3ded1c70

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u1a73\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3893

    const v7, -0x50e23905

    xor-int/2addr v6, v7

    const v7, 0x1252413e

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06d9\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3e95

    const v7, -0xb07d729

    xor-int/2addr v6, v7

    const v7, -0xb659e0f

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u0733\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x14d7

    const v7, 0x61e7bd1c

    xor-int/2addr v6, v7

    const v7, 0x7dce6833

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_b

    :goto_3
    const-string v5, "\u06e0\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6863

    const v7, -0x38a26b74

    xor-int/2addr v6, v7

    const v7, 0x7ff824bf

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06ec\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x77eb

    const v7, -0x5823860d

    xor-int/2addr v6, v7

    const v7, 0x777cbcdf

    goto/16 :goto_0

    .line 0
    :sswitch_11
    invoke-static {}, Ll/᩷ᩴ᩵;->values()[Ll/᩷ᩴ᩵;

    move-result-object v0

    array-length v0, v0

    .line 4
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u06d7\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x49f1

    const v7, 0xd679950

    xor-int/2addr v6, v7

    const v7, 0x6aabd225

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06da\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x71b1

    const v7, -0x3d5f4a13

    xor-int/2addr v6, v7

    const v7, 0x3fe4ddfb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ed96e89 -> :sswitch_d
        -0x6e145222 -> :sswitch_b
        -0x6e0c1832 -> :sswitch_4
        -0x6b1d31a0 -> :sswitch_5
        -0x68ca64a9 -> :sswitch_1
        -0x64139151 -> :sswitch_7
        -0x5f68d6ff -> :sswitch_8
        -0x5f12a85d -> :sswitch_8
        -0x55bd2ea0 -> :sswitch_b
        -0x51b021d7 -> :sswitch_3
        -0x48a47ca9 -> :sswitch_0
        -0x3ea3885d -> :sswitch_9
        -0x2c181668 -> :sswitch_1
        -0x28a3cc62 -> :sswitch_7
        -0xfda3957 -> :sswitch_11
        -0x898ae3f -> :sswitch_2
        0x16a3a34 -> :sswitch_3
        0xe7df0a0 -> :sswitch_f
        0x21d3dc00 -> :sswitch_10
        0x2b094af0 -> :sswitch_11
        0x2daa3998 -> :sswitch_5
        0x3f9cac56 -> :sswitch_a
        0x478716d4 -> :sswitch_d
        0x49d70ef3 -> :sswitch_6
        0x4a8c974b -> :sswitch_9
        0x4e3fb6cd -> :sswitch_2
        0x520256c2 -> :sswitch_f
        0x520e6bc2 -> :sswitch_10
        0x55ab2a1a -> :sswitch_c
        0x58b0b9ef -> :sswitch_e
        0x59843e71 -> :sswitch_e
        0x5a86cf3a -> :sswitch_0
        0x5e94e283 -> :sswitch_4
        0x5f7dac1c -> :sswitch_a
        0x62ca3e69 -> :sswitch_6
        0x79704494 -> :sswitch_c
    .end sparse-switch
.end method
