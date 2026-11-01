.class public final synthetic Ll/۬ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/ۚ᩸ۘ;


# instance fields
.field public final synthetic ܺ:Ll/᩵ۡۜ;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۡۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ᩳۘ;->ܺ:Ll/᩵ۡۜ;

    return-void
.end method


# virtual methods
.method public final ֨()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x690067a5

    sget v2, Ll/֫;->ܶܺ᩻:I

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v4, "\u06e0\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x49d

    const v6, 0xb7bfec0

    xor-int/2addr v5, v6

    const v6, 0x55aa1268

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x24c3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 714
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :sswitch_2
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_9

    goto :goto_1

    .line 1075
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    goto :goto_1

    .line 1892
    :sswitch_4
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 v0, 0x0

    return v0

    .line 1978
    :sswitch_5
    invoke-static {v0}, Ll/֡ۚ;->᩻ᩳۤ(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :sswitch_6
    iget-object v0, p0, Ll/۬ᩳۘ;->ܺ:Ll/᩵ۡۜ;

    .line 677
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06da\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5af9

    const v6, 0x67ee8ff1

    xor-int/2addr v5, v6

    const v6, 0xff86260

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06db\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2ed5

    const v6, 0xe061189

    xor-int/2addr v5, v6

    const v6, 0x178db4e0

    goto :goto_0

    .line 1602
    :sswitch_8
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v4

    if-gtz v4, :cond_2

    :goto_1
    const-string v4, "\u1a77\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7e21

    const v6, 0x5095a5fc

    xor-int/2addr v5, v6

    const v6, -0x16dfe164

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2bb3

    const v6, 0x2632c352

    xor-int/2addr v5, v6

    const v6, 0x57ac5949

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e2\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6573

    const v6, 0x31804f2d

    xor-int/2addr v5, v6

    const v6, -0x3846f51d

    goto/16 :goto_0

    .line 743
    :sswitch_9
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_4

    :goto_2
    const-string v4, "\u1a73\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x727

    const v6, -0x5fbe192f

    xor-int/2addr v5, v6

    const v6, -0x72b0b30e

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0736\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1761

    const v6, 0x5ae79d46

    xor-int/2addr v5, v6

    const v6, 0x3ac34d7a

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_6

    :cond_5
    const-string v4, "\u06e8\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ea3

    const v6, -0x4da7d1fd

    xor-int/2addr v5, v6

    const v6, 0x700f767f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d8\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xca1

    const v6, -0x8f1ba25

    xor-int/2addr v5, v6

    const v6, -0x9bb561f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06e4\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5fed

    const v6, 0x716e4917

    xor-int/2addr v5, v6

    const v6, -0x60eef2c1

    goto/16 :goto_0

    .line 682
    :sswitch_c
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13b

    const v6, 0x722300d4

    xor-int/2addr v5, v6

    const v6, -0x25d07941

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a74\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x251b

    const v6, 0x2b9420ae

    xor-int/2addr v5, v6

    const v6, 0x77c124fd

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0733\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4155

    const v6, -0x37292ccd

    xor-int/2addr v5, v6

    const v6, 0x4a458bf5    # 3236605.2f

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 1969
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1de9

    const v6, 0x1c010668

    xor-int/2addr v5, v6

    const v6, -0x58973d6c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x65d7

    const v6, -0x7f779aa

    xor-int/2addr v5, v6

    const v6, 0x20564b1f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73d69547 -> :sswitch_d
        -0x71ae1a76 -> :sswitch_d
        -0x6341dba8 -> :sswitch_3
        -0x62679fab -> :sswitch_6
        -0x61a2c458 -> :sswitch_8
        -0x576c636a -> :sswitch_2
        -0x4d8bdbca -> :sswitch_2
        -0x4ba74621 -> :sswitch_6
        -0x39640ace -> :sswitch_c
        -0x2f78ca7c -> :sswitch_e
        -0x2d9a5539 -> :sswitch_9
        -0x269cbc03 -> :sswitch_8
        -0x206faa77 -> :sswitch_9
        -0x146459fc -> :sswitch_a
        -0x1411f6f8 -> :sswitch_5
        -0x11e94a9c -> :sswitch_5
        0x4405c46 -> :sswitch_1
        0x5d0b622 -> :sswitch_b
        0xd35a0b3 -> :sswitch_4
        0xe2c8fb5 -> :sswitch_0
        0x3e3a3f2b -> :sswitch_b
        0x4be73276 -> :sswitch_e
        0x5165854b -> :sswitch_4
        0x51a4e1d2 -> :sswitch_7
        0x5776ccf7 -> :sswitch_3
        0x583dab68 -> :sswitch_0
        0x5ce62f58 -> :sswitch_7
        0x651e54dd -> :sswitch_c
        0x70033fb9 -> :sswitch_1
        0x7ee3971c -> :sswitch_a
    .end sparse-switch
.end method
