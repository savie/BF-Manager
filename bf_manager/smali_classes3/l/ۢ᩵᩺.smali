.class public final synthetic Ll/ۢ᩵᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۜ۟᩺;


# instance fields
.field public final synthetic ֡:Ll/᩵ۡۜ;

.field public final synthetic ܺ:Ll/ܿܿۚ;

.field public final synthetic ܽ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:Ll/᩻ۡ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/ܿܿۚ;Ll/᩵ۡۜ;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 6

    const v0, -0x2925fa63

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c0f

    const v5, 0x6ae98778

    xor-int/2addr v4, v5

    const v5, 0x1a00553c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5703

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_8

    goto/16 :goto_4

    :sswitch_0
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a75\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1cd1

    const v5, 0xa875277

    xor-int/2addr v4, v5

    const v5, 0x1fd8247e

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۢ᩵᩺;->֡:Ll/᩵ۡۜ;

    iput-object p4, p0, Ll/ۢ᩵᩺;->ܽ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void

    .line 4
    :sswitch_6
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ce7

    const v5, 0x66501f20

    xor-int/2addr v4, v5

    const v5, -0x4750ecd3

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x36ad

    const v5, 0x5b7f7169

    xor-int/2addr v4, v5

    const v5, 0x12b72f7

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_3

    :goto_1
    const-string v3, "\u0733\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59b5

    const v5, 0x69f94ce3

    xor-int/2addr v4, v5

    const v5, 0x17e705c0

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06ec\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5801

    const v5, -0x739627d9

    xor-int/2addr v4, v5

    const v5, -0x6010873b

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06eb\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x63f5

    const v5, 0x7cb141bb

    xor-int/2addr v4, v5

    const v5, -0x58d0fc8d

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u05a1\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1377

    const v5, 0x5ebc2d27

    xor-int/2addr v4, v5

    const v5, -0x4f3ee25e

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x464b

    const v5, -0x464df36

    xor-int/2addr v4, v5

    const v5, 0x6a73e78d

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u0733\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x578f

    const v5, 0x4def25f3    # 5.015302E8f

    xor-int/2addr v4, v5

    const v5, -0x579ca388

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e8\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2a35

    const v5, -0x47512057

    xor-int/2addr v4, v5

    const v5, 0xe098cc7

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4825

    const v5, 0x57566bd5

    xor-int/2addr v4, v5

    const v5, -0x3f4261d0    # -5.92556f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a78\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4139

    const v5, 0x7761542c

    xor-int/2addr v4, v5

    const v5, -0x3b84d271

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x547

    const v5, 0x37062c4a

    xor-int/2addr v4, v5

    const v5, 0x35fcd3d7

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۢ᩵᩺;->ܺ:Ll/ܿܿۚ;

    iput-object p3, p0, Ll/ۢ᩵᩺;->᩶:Ll/᩻ۡ᩺;

    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0730\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x32d9

    const v5, 0x10ae60de

    xor-int/2addr v4, v5

    const v5, -0xc4d1338

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2681

    const v5, 0x47ad78fb

    xor-int/2addr v4, v5

    const v5, 0x733a0f1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f62ef03 -> :sswitch_0
        -0x76047702 -> :sswitch_c
        -0x73a8caff -> :sswitch_3
        -0x6464e962 -> :sswitch_c
        -0x5ec212e8 -> :sswitch_0
        -0x57ab1c37 -> :sswitch_b
        -0x46b14d4a -> :sswitch_a
        -0x465fb4f2 -> :sswitch_2
        -0x43db5560 -> :sswitch_9
        -0x38e641eb -> :sswitch_b
        -0x32a72d7f -> :sswitch_7
        -0x2ad57eb4 -> :sswitch_9
        -0x29ae928c -> :sswitch_4
        -0x16160f22 -> :sswitch_7
        -0x1196ec4c -> :sswitch_8
        -0x1099a996 -> :sswitch_3
        -0x447dab6 -> :sswitch_1
        -0x113a0da -> :sswitch_d
        0x3e94b99 -> :sswitch_d
        0x10c95be6 -> :sswitch_5
        0x28d425c7 -> :sswitch_8
        0x3f195680 -> :sswitch_a
        0x4e2d0e63 -> :sswitch_6
        0x534661e5 -> :sswitch_e
        0x569dd2eb -> :sswitch_1
        0x5a72e9b1 -> :sswitch_5
        0x5bcca5be -> :sswitch_4
        0x6b684d7b -> :sswitch_e
        0x714bb620 -> :sswitch_2
        0x7822299b -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/֨ᩴ᩺;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x215dd42b

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    const-string v5, "\u1a78\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6b11

    const v7, -0x75d1f916

    xor-int/2addr v6, v7

    const v7, 0x29b930ce

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x5527

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_4

    .line 1
    :sswitch_0
    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_8

    goto/16 :goto_4

    .line 4
    :sswitch_1
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u06db\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x179b

    const v7, 0x34fd94b0

    xor-int/2addr v6, v7

    const v7, 0x75d2bd08

    goto :goto_0

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_a

    goto/16 :goto_4

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/ۢ᩵᩺;->ܺ:Ll/ܿܿۚ;

    iget-object v3, p0, Ll/ۢ᩵᩺;->᩶:Ll/᩻ۡ᩺;

    invoke-static {v2, v0, p1, v3, v1}, Ll/᩻ۡ᩺;->ܰ(Ll/ܿܿۚ;Ll/᩵ۡۜ;Ll/֨ᩴ᩺;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ۢ᩵᩺;->ܽ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 1
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u1a79\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x63bb

    const v7, 0xa09d276

    xor-int/2addr v6, v7

    const v7, -0x6852526f

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v0, p0, Ll/ۢ᩵᩺;->֡:Ll/᩵ۡۜ;

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v5

    if-ltz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06df\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1fa3

    const v7, -0x462d45b3

    xor-int/2addr v6, v7

    const v7, -0x6d7356f4

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v5, :cond_3

    :goto_1
    const-string v5, "\u06d9\u06d8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xf9d

    const v7, 0x13b726dd

    xor-int/2addr v6, v7

    const v7, 0x71988d56

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d6\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xcf1

    const v7, 0x377166bb

    xor-int/2addr v6, v7

    const v7, -0x113d2548

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v5

    if-gtz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u0733\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3bd

    const v7, 0x2b3fdd1f

    xor-int/2addr v6, v7

    const v7, 0x34de3c13

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06db\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xb9b

    const v7, -0x67a48efb

    xor-int/2addr v6, v7

    const v7, 0x10cf0bc7

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u06e0\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x680d

    const v7, -0x26a851b5

    xor-int/2addr v6, v7

    const v7, 0x2fa26fcd

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u06d8\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6c3b

    const v7, -0x3d58c91a

    xor-int/2addr v6, v7

    const v7, 0x4351d02c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v5

    if-eqz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u073f\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2571

    const v7, 0x5bbf9d1d

    xor-int/2addr v6, v7

    const v7, 0x69318f6d

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a77\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xd61

    const v7, 0x46d2f181    # 27000.752f

    xor-int/2addr v6, v7

    const v7, 0x784fa6b9

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u0730\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4c03

    const v7, -0x4e47c838

    xor-int/2addr v6, v7

    const v7, 0x3989974c

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a7b\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2b17

    const v7, -0x52896654

    xor-int/2addr v6, v7

    const v7, -0x112b0e4a

    goto/16 :goto_0

    :goto_4
    const-string v5, "\u1a75\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5071

    const v7, 0x106a4901

    xor-int/2addr v6, v7

    const v7, 0x55b0f691

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f6b

    const v7, -0x2eb266cc

    xor-int/2addr v6, v7

    const v7, -0x2737b7d6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x777be925 -> :sswitch_4
        -0x7011176b -> :sswitch_a
        -0x69a19a25 -> :sswitch_5
        -0x66b3b387 -> :sswitch_d
        -0x633bf13c -> :sswitch_5
        -0x5b85fada -> :sswitch_6
        -0x4e8453ed -> :sswitch_c
        -0x41542a04 -> :sswitch_9
        -0x31e22dca -> :sswitch_4
        -0x297b64cc -> :sswitch_0
        -0x191d452a -> :sswitch_0
        -0x18fe5a47 -> :sswitch_c
        -0x147a4257 -> :sswitch_2
        0x2cc9296 -> :sswitch_6
        0x3c76be5 -> :sswitch_d
        0x4a09bef -> :sswitch_3
        0x84e39d8 -> :sswitch_7
        0x1eaaeee7 -> :sswitch_1
        0x2c6a2cfb -> :sswitch_b
        0x387aee4d -> :sswitch_9
        0x45313478 -> :sswitch_a
        0x47103a85 -> :sswitch_b
        0x4727bddf -> :sswitch_e
        0x4fb27e56 -> :sswitch_e
        0x5095dc93 -> :sswitch_3
        0x5e40511f -> :sswitch_8
        0x6619c341 -> :sswitch_1
        0x6a47ee87 -> :sswitch_8
        0x79711af2 -> :sswitch_2
        0x79b8d878 -> :sswitch_7
    .end sparse-switch
.end method
