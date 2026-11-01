.class public final synthetic Ll/᩸ۗۨ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ܺ:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۗۨ;->ܺ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x17d3a723

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/֫;->ܶܺ᩻:I

    const-string v4, "\u06db\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x639f

    const v6, -0x17059ed9

    xor-int/2addr v5, v6

    const v6, 0x543450a0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x5835

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    const/4 p1, 0x0

    return-object p1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-gez v4, :cond_9

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_7

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v4, :cond_b

    goto :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    :goto_1
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xdfd

    const v6, -0x4871acd6

    xor-int/2addr v5, v6

    const v6, -0x71b03b8

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {v0, p1}, Ll/ۗܳ;->ܿۙۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ۗۨ;

    return-object p1

    :sswitch_5
    iget-object v0, p0, Ll/᩸ۗۨ;->ܺ:Ljava/util/ArrayList;

    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a73\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6065

    const v6, -0x60bb0361

    xor-int/2addr v5, v6

    const v6, 0x6f85a5c1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06dc\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b29

    const v6, -0x767d77c6

    xor-int/2addr v5, v6

    const v6, 0x4f954028

    goto/16 :goto_0

    .line 1
    :sswitch_7
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06e4\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x35d5

    const v6, -0x7f95b52d

    xor-int/2addr v5, v6

    const v6, -0x3cf9ddc1

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7aaf

    const v6, -0x1bc04e41

    xor-int/2addr v5, v6

    const v6, 0x79b94b03

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a79\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d05

    const v6, 0x788e5b16

    xor-int/2addr v5, v6

    const v6, -0x6a697c31

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06e4\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x641b

    const v6, 0x102d0c1b

    xor-int/2addr v5, v6

    const v6, 0x559bc8ff

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u05a1\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x63df

    const v6, -0x7a4f8b67

    xor-int/2addr v5, v6

    const v6, 0xcc48921

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06eb\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1115

    const v6, 0x79679360

    xor-int/2addr v5, v6

    const v6, -0x2ba0ffda

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x64fd

    const v6, 0xc217fd2

    xor-int/2addr v5, v6

    const v6, -0x3430123d    # -2.7253638E7f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e1\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b49

    const v6, 0x20ea43c0

    xor-int/2addr v5, v6

    const v6, -0x22831326

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v4

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit8 v5, v5, -0x79

    const v6, 0x4b43c786    # 1.2830598E7f

    xor-int/2addr v5, v6

    const v6, 0x4a357916    # 2973253.5f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x13e9

    const v6, 0x332da1c3

    xor-int/2addr v5, v6

    const v6, -0x6c073ebf

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a74\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5d17

    const v6, -0x106f5cd2

    xor-int/2addr v5, v6

    const v6, 0x44c09cbf

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ebb

    const v6, 0x3f30a0a

    xor-int/2addr v5, v6

    const v6, 0x28d512cb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7546003e -> :sswitch_0
        -0x74ed64e0 -> :sswitch_4
        -0x73d5e526 -> :sswitch_7
        -0x647da040 -> :sswitch_b
        -0x5f2aa88a -> :sswitch_3
        -0x563c2d45 -> :sswitch_7
        -0x51df3939 -> :sswitch_1
        -0x47e3e0e9 -> :sswitch_2
        -0x3f32b78d -> :sswitch_3
        -0x3786096e -> :sswitch_5
        -0x36bf8a80 -> :sswitch_c
        -0x343b5849 -> :sswitch_a
        -0x254475e3 -> :sswitch_e
        -0x23627b8e -> :sswitch_6
        -0x3188d54 -> :sswitch_1
        0xc22ee0a -> :sswitch_9
        0xd8ebebb -> :sswitch_5
        0x1f3d94ef -> :sswitch_8
        0x27e9d788 -> :sswitch_6
        0x29a54291 -> :sswitch_4
        0x316107c5 -> :sswitch_d
        0x357ed12b -> :sswitch_e
        0x374d5340 -> :sswitch_d
        0x396a86d4 -> :sswitch_b
        0x4751c419 -> :sswitch_0
        0x4a006eb3 -> :sswitch_9
        0x4c84af1a -> :sswitch_a
        0x6b0bdce3 -> :sswitch_2
        0x71833c36 -> :sswitch_8
        0x77ed7f4c -> :sswitch_c
    .end sparse-switch
.end method
