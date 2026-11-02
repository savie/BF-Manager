.class public final synthetic Ll/۟᩸ۘ;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܺ:Ll/ۖܿۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖܿۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩸ۘ;->ܺ:Ll/ۖܿۚ;

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

    const v1, -0x51d67bd9

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6ec1

    const v6, -0x57d17fa4

    xor-int/2addr v5, v6

    const v6, 0x70332615

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x60eb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 411
    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    .line 280
    :sswitch_0
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v4, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_1

    :sswitch_2
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x734b

    const v6, 0x2727d043

    xor-int/2addr v5, v6

    const v6, -0x672be7ce

    goto :goto_0

    .line 565
    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    :goto_2
    const-string v4, "\u06d9\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x46b9

    const v6, 0x72ce3064

    xor-int/2addr v5, v6

    const v6, -0xc921675

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    const/4 p1, 0x0

    return p1

    .line 613
    :sswitch_5
    invoke-static {v0}, Ll/ۜۧ᩺;->ܰ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۟᩸ۘ;->ܺ:Ll/ۖܿۚ;

    invoke-virtual {v0, p1}, Ll/ۖܿۚ;->ۙ(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 329
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_1

    const-string v4, "\u06d8\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x78e7

    const v6, 0x65994e78

    xor-int/2addr v5, v6

    const v6, -0x1df3f6f7

    goto :goto_0

    :cond_1
    const-string v4, "\u06d7\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x449b

    const v6, 0x257f48ad

    xor-int/2addr v5, v6

    const v6, 0xd75f48e

    goto/16 :goto_0

    .line 82
    :sswitch_7
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06dc\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x55d

    const v6, -0x77b23993

    xor-int/2addr v5, v6

    const v6, 0x4824b199

    goto/16 :goto_0

    .line 57
    :sswitch_8
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05a8\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a2f

    const v6, 0x5a13bc6b

    xor-int/2addr v5, v6

    const v6, 0xa3d5f33

    goto/16 :goto_0

    .line 13
    :sswitch_9
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u05a1\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1a69

    const v6, 0x71d5de9a

    xor-int/2addr v5, v6

    const v6, 0x10febfd9

    goto/16 :goto_0

    .line 174
    :sswitch_a
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06d8\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a53

    const v6, -0x5853b77c

    xor-int/2addr v5, v6

    const v6, -0x1895d5d1

    goto/16 :goto_0

    .line 569
    :sswitch_b
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x715b

    const v6, -0x7b7f9a7b

    xor-int/2addr v5, v6

    const v6, 0x4afea63

    goto/16 :goto_0

    .line 291
    :sswitch_c
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a77\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b7b

    const v6, 0x66ca8e4a

    xor-int/2addr v5, v6

    const v6, -0x6c251d8c

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0730\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x391f

    const v6, -0x34ade7d8    # -1.3768744E7f

    xor-int/2addr v5, v6

    const v6, 0x23340531

    goto/16 :goto_0

    .line 236
    :sswitch_d
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u073a\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5417

    const v6, 0x43243801

    xor-int/2addr v5, v6

    const v6, -0xbd9b194

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d6\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1685

    const v6, -0x4ab71776

    xor-int/2addr v5, v6

    const v6, 0x57b8e94f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a78\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d4d

    const v6, -0x5773361e

    xor-int/2addr v5, v6

    const v6, 0x15360872

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x69c7

    const v6, -0x6ca5a82c

    xor-int/2addr v5, v6

    const v6, 0x7f560baa

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7444d813 -> :sswitch_3
        -0x6f39e192 -> :sswitch_5
        -0x67c2a68d -> :sswitch_1
        -0x5f17625a -> :sswitch_e
        -0x5e51d4b9 -> :sswitch_8
        -0x580c72db -> :sswitch_8
        -0x54317a6a -> :sswitch_c
        -0x52442afc -> :sswitch_9
        -0x3e942c3a -> :sswitch_a
        -0x3b33a3b8 -> :sswitch_a
        -0x393e75c2 -> :sswitch_3
        -0x2fd53250 -> :sswitch_9
        -0x208e4543 -> :sswitch_d
        -0x15b56024 -> :sswitch_4
        0x1c3c34a -> :sswitch_5
        0x3c8f668 -> :sswitch_6
        0x65ae3d2 -> :sswitch_1
        0xd3f3219 -> :sswitch_0
        0x195239c8 -> :sswitch_7
        0x2b77c27d -> :sswitch_4
        0x305b304e -> :sswitch_c
        0x3244c744 -> :sswitch_6
        0x32af4280 -> :sswitch_2
        0x3982c68e -> :sswitch_b
        0x405d4677 -> :sswitch_7
        0x53ba8852 -> :sswitch_b
        0x5826e063 -> :sswitch_0
        0x635c2c14 -> :sswitch_e
        0x6c39019f -> :sswitch_d
        0x798e62e9 -> :sswitch_2
    .end sparse-switch
.end method
