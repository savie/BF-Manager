.class public final synthetic Ll/۠᩹ۘ;
.super Ljava/lang/Object;
.source "I7RA"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܺ:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩹ۘ;->ܺ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠᩻ᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/۠᩻ᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠᩻ᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x335d4935

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b41

    const v6, -0x43f4e2e7

    xor-int/2addr v5, v6

    const v6, 0x399f3551

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x78a7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 110
    invoke-static {v0}, Ll/֨ܶ;->֡ܰۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۠᩹ۘ;->ܺ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 14
    :sswitch_0
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v4, :cond_4

    goto/16 :goto_2

    .line 24
    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_a

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    .line 82
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_3

    .line 64
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    const/4 p1, 0x0

    return p1

    .line 2
    :sswitch_5
    move-object v0, p1

    check-cast v0, Ll/۟᩻᩵;

    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e7\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5d11

    const v6, 0x500da6f3    # 9.506115E9f

    xor-int/2addr v5, v6

    const v6, 0x1237c92b

    goto :goto_0

    .line 107
    :sswitch_6
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u0736\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf9f

    const v6, -0x614df4fe

    xor-int/2addr v5, v6

    const v6, 0x22088bd7

    goto :goto_0

    .line 26
    :sswitch_7
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e1\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x51b3

    const v6, 0x75fe3152

    xor-int/2addr v5, v6

    const v6, -0x2bddccf7

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v4, "\u06e7\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7b67

    const v6, -0x352d4a6b    # -6904522.5f

    xor-int/2addr v5, v6

    const v6, 0x1edc5099

    goto/16 :goto_0

    .line 35
    :sswitch_9
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_5

    :cond_4
    const-string v4, "\u1a79\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x28f9

    const v6, 0x6126f09c

    xor-int/2addr v5, v6

    const v6, -0x18aa7be0

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u0733\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x381d

    const v6, -0x58fe2e68

    xor-int/2addr v5, v6

    const v6, 0x32d49b38

    goto/16 :goto_0

    .line 108
    :sswitch_a
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    const-string v4, "\u06e8\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x44db

    const v6, 0xc1f238

    xor-int/2addr v5, v6

    const v6, 0xde3395a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d7\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x68d9

    const v6, -0x1a162436

    xor-int/2addr v5, v6

    const v6, -0x7a6b900d

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v4

    if-nez v4, :cond_8

    :goto_1
    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7dc7

    const v6, 0x7e56847c

    xor-int/2addr v5, v6

    const v6, 0x1a80f668

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit8 v5, v5, -0x45

    const v6, 0x2fa8f522

    xor-int/2addr v5, v6

    const v6, -0x4764f734

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u05ab\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x27bb

    const v6, -0x781435a

    xor-int/2addr v5, v6

    const v6, 0x73ca1885

    goto/16 :goto_0

    .line 50
    :sswitch_d
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x35c7

    const v6, 0x78222509

    xor-int/2addr v5, v6

    const v6, -0x14a79e68

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7b\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5979

    const v6, -0x43a2e801

    xor-int/2addr v5, v6

    const v6, 0x782e2799

    goto/16 :goto_0

    .line 82
    :sswitch_e
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_c

    :goto_3
    const-string v4, "\u06ec\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x740d

    const v6, -0x11a7e4cc

    xor-int/2addr v5, v6

    const v6, 0x1250e1c9

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1639

    const v6, -0x14598cbc

    xor-int/2addr v5, v6

    const v6, -0x4269b35

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f738976 -> :sswitch_d
        -0x7d0e722c -> :sswitch_6
        -0x76599f2e -> :sswitch_7
        -0x6decc5d7 -> :sswitch_2
        -0x64a0787e -> :sswitch_4
        -0x61d8c1f6 -> :sswitch_5
        -0x22432960 -> :sswitch_d
        -0x2095dc12 -> :sswitch_4
        -0x20734022 -> :sswitch_9
        -0x159f5afa -> :sswitch_b
        -0x10a87b9a -> :sswitch_c
        -0x8e14729 -> :sswitch_e
        0x7a3ab6d -> :sswitch_a
        0xad8311f -> :sswitch_7
        0x1302be93 -> :sswitch_8
        0x26416349 -> :sswitch_9
        0x27f6f8b3 -> :sswitch_3
        0x28a07327 -> :sswitch_a
        0x2e910b8e -> :sswitch_2
        0x369dc7e2 -> :sswitch_0
        0x390313a3 -> :sswitch_8
        0x3ede28d3 -> :sswitch_1
        0x44836995 -> :sswitch_1
        0x533d63ce -> :sswitch_5
        0x577625ac -> :sswitch_3
        0x5ea5afce -> :sswitch_e
        0x6367652c -> :sswitch_b
        0x695592cf -> :sswitch_0
        0x7699062d -> :sswitch_c
        0x77f73942 -> :sswitch_6
    .end sparse-switch
.end method
