.class public final synthetic Ll/ۖۖۤ;
.super Ljava/lang/Object;
.source "71K9"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ۙ:Ll/۠᩵ۛ;

.field public final synthetic ᩷:Ll/ۢ۫ۛ;


# direct methods
.method public synthetic constructor <init>(Ll/۠᩵ۛ;Ll/ۢ۫ۛ;)V
    .locals 6

    const v0, -0x466d615a

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    sget v2, Ll/ۗۖ;->ۙ᩶֨:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073d\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5cd9

    const v5, 0x52c6b3a0

    xor-int/2addr v4, v5

    const v5, -0x1ba65d21

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x43db

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_3

    goto/16 :goto_1

    .line 0
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-lez v3, :cond_6

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۖۖۤ;->᩷:Ll/ۢ۫ۛ;

    return-void

    .line 4
    :sswitch_6
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u0730\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2451

    const v5, -0x7a96ff3d

    xor-int/2addr v4, v5

    const v5, -0x145af36e

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u05ab\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22b

    const v5, 0x2bcda24a

    xor-int/2addr v4, v5

    const v5, -0x75a362a1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a11

    const v5, 0x1705b8fb

    xor-int/2addr v4, v5

    const v5, -0x79fe9762

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4edb

    const v5, -0x7add5533

    xor-int/2addr v4, v5

    const v5, 0x66572745

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    const-string v3, "\u06d7\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xab3

    const v5, -0x381ae598

    xor-int/2addr v4, v5

    const v5, -0x60214c84

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5303

    const v5, 0x2efbb28

    xor-int/2addr v4, v5

    const v5, -0x3df41629

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u06e4\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x58f5

    const v5, 0x71f51b89

    xor-int/2addr v4, v5

    const v5, -0x527b6cee

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6817

    const v5, -0x5144028c

    xor-int/2addr v4, v5

    const v5, -0x4a48d15e

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v3, "\u06e8\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x27d

    const v5, 0x1dd96527

    xor-int/2addr v4, v5

    const v5, -0x7499f0d2

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_1
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x18b9

    const v5, -0x1b7542b

    xor-int/2addr v4, v5

    const v5, 0x5ea5ab57

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06eb\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x45dd

    const v5, -0x5d44d59c

    xor-int/2addr v4, v5

    const v5, 0x4d39fe54    # 1.9502829E8f

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_b

    :goto_2
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x60b3

    const v5, -0x5c6f3025

    xor-int/2addr v4, v5

    const v5, 0x5f67acb0

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5331

    const v5, -0x4b55a558

    xor-int/2addr v4, v5

    const v5, -0x4008270a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۖۖۤ;->ۙ:Ll/۠᩵ۛ;

    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u1a74\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6093

    const v5, -0x6a3c6b35

    xor-int/2addr v4, v5

    const v5, 0x658f3d54

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e3

    const v5, -0x2f71d32c

    xor-int/2addr v4, v5

    const v5, -0x3cbb504b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x723a44ec -> :sswitch_0
        -0x6da6bdd4 -> :sswitch_3
        -0x64e94555 -> :sswitch_d
        -0x6474ba4d -> :sswitch_7
        -0x63c558ec -> :sswitch_5
        -0x54dfca6f -> :sswitch_0
        -0x4b57c48a -> :sswitch_c
        -0x49130e6e -> :sswitch_3
        -0x43f441a9 -> :sswitch_e
        -0x38736ced -> :sswitch_1
        -0x35507b61 -> :sswitch_6
        -0x2df12ece -> :sswitch_6
        -0x2ccbfad9 -> :sswitch_a
        -0x25c9bcf7 -> :sswitch_e
        -0x22a98620 -> :sswitch_7
        -0x228dba4e -> :sswitch_8
        -0x19f6f929 -> :sswitch_5
        -0x5f1a870 -> :sswitch_9
        0x5e70e8d -> :sswitch_a
        0x6bf7fa7 -> :sswitch_d
        0x8e58b6b -> :sswitch_2
        0x1f060eae -> :sswitch_b
        0x2e12fd41 -> :sswitch_4
        0x36078778 -> :sswitch_8
        0x3707f3f0 -> :sswitch_1
        0x51bf76e9 -> :sswitch_2
        0x57beb857 -> :sswitch_c
        0x5dfe4e84 -> :sswitch_9
        0x6d647c5c -> :sswitch_b
        0x7318a14f -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۖۖۤ;->ۙ:Ll/۠᩵ۛ;

    .line 4
    iget-object v1, p0, Ll/ۖۖۤ;->᩷:Ll/ۢ۫ۛ;

    .line 478
    invoke-virtual {v0, v1}, Ll/۠᩵ۛ;->ۙ(Ll/ۢ۫ۛ;)Ll/ۜ᩹ۛ;

    move-result-object v0

    return-object v0
.end method
