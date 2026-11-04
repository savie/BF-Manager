.class public abstract Ll/ܰ᩺֫;
.super Ljava/lang/Object;
.source "I3YL"


# instance fields
.field public ۙ:Z

.field public ۤ:Ljava/lang/String;

.field public ۫:Z

.field public ܳ:Ljava/lang/CharSequence;

.field public ᩴ:Ljava/lang/CharSequence;

.field public ᩷:Ljava/lang/Object;

.field public ᩸:Lbin/mt/plugin/api/preference/PluginPreference$OnClickInterceptListener;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x2c7b49bc

    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u05a8\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa4b

    const v6, 0x726b059a

    xor-int/2addr v5, v6

    const v6, -0x6aad0a00

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x845

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 11
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v4, :cond_9

    goto/16 :goto_3

    .line 0
    :sswitch_1
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u1a78\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fe3

    const v6, -0x79ff1b93

    xor-int/2addr v5, v6

    const v6, 0x66299fd2

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 12
    :sswitch_4
    iput-boolean v0, p0, Ll/ܰ᩺֫;->ۙ:Z

    return-void

    .line 11
    :sswitch_5
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u1a79\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x580f

    const v6, -0x65dac46d

    xor-int/2addr v5, v6

    const v6, -0x1bcce4c

    goto :goto_0

    :sswitch_6
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3c89

    const v6, -0x54003a60

    xor-int/2addr v5, v6

    const v6, -0x1d0cb9c0

    goto :goto_0

    .line 7
    :sswitch_7
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06dc\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3353

    const v6, 0x7629dfd2

    xor-int/2addr v5, v6

    const v6, -0x409054

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u06d9\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x621

    const v6, -0x487163b3    # -1.7000502E-5f

    xor-int/2addr v5, v6

    const v6, -0xe89e290

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06dc\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x34f3

    const v6, 0x74e70eea

    xor-int/2addr v5, v6

    const v6, -0x3304e329

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06d9\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x72af

    const v6, 0x3a3ff9bc

    xor-int/2addr v5, v6

    const v6, 0x609d516e

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u1a77\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x709

    const v6, 0x7806d3a3

    xor-int/2addr v5, v6

    const v6, 0x689fd4bf

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u1a74\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2943

    const v6, 0xc405b46

    xor-int/2addr v5, v6

    const v6, -0x579038ff

    goto/16 :goto_0

    .line 6
    :sswitch_c
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06e8\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x22ef

    const v6, 0x4adf467c    # 7316286.0f

    xor-int/2addr v5, v6

    const v6, -0x7eb40ef0

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1877

    const v6, -0x6ccadb54

    xor-int/2addr v5, v6

    const v6, 0x1cf9c190

    goto/16 :goto_0

    .line 5
    :sswitch_d
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_b

    :goto_3
    const-string v4, "\u06d8\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x244d

    const v6, 0x4e2ea31

    xor-int/2addr v5, v6

    const v6, -0x4137feaf

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7b\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ef3

    const v6, -0x70467a12

    xor-int/2addr v5, v6

    const v6, -0x7b10940f

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ll/ܰ᩺֫;->۫:Z

    .line 7
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u06e1\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x79b5

    const v6, 0x17d0f8

    xor-int/2addr v5, v6

    const v6, -0x7fc54bcb

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36c1

    const v6, 0x62e6e50e

    xor-int/2addr v5, v6

    const v6, 0x6b81fa21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f9afa2d -> :sswitch_d
        -0x74627772 -> :sswitch_e
        -0x72f5fcd6 -> :sswitch_c
        -0x65a0d317 -> :sswitch_0
        -0x62126c9f -> :sswitch_6
        -0x55a505c1 -> :sswitch_9
        -0x538dffb6 -> :sswitch_a
        -0x44158a20 -> :sswitch_2
        -0x43cc1962 -> :sswitch_5
        -0x39b43ed0 -> :sswitch_1
        -0x31f970ce -> :sswitch_a
        -0x31b3b234 -> :sswitch_7
        -0x256ef9e8 -> :sswitch_c
        -0x147c2b36 -> :sswitch_4
        -0xea4600b -> :sswitch_3
        -0xa97f18f -> :sswitch_2
        -0x8ffe76e -> :sswitch_e
        -0x5a10814 -> :sswitch_4
        -0x11fdb96 -> :sswitch_1
        0x9d0931a -> :sswitch_d
        0x2d22c778 -> :sswitch_9
        0x2f7e3f54 -> :sswitch_7
        0x46bb7063 -> :sswitch_0
        0x50f16b0b -> :sswitch_b
        0x56d12db0 -> :sswitch_5
        0x594a6486 -> :sswitch_b
        0x5ad649ee -> :sswitch_6
        0x648377a8 -> :sswitch_8
        0x67ef6f1f -> :sswitch_8
        0x7e1e910a -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public abstract ۙ()Ll/ۘ᩺֫;
.end method

.method public abstract ۙ(Lbin/mt/plugin/api/LocalString;)V
.end method

.method public abstract ۙ(Lbin/mt/plugin/api/PluginContext;)V
.end method
