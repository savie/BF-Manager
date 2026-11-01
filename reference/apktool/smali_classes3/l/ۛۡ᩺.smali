.class public final synthetic Ll/ۛۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܺ:Ll/᩻ۡ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۡ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۡ᩺;->ܺ:Ll/᩻ۡ᩺;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x895c7a5

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    const-string v4, "\u1a78\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x43d7

    const v6, 0x6340a4c3

    xor-int/2addr v5, v6

    const v6, 0x460c75a0    # 8989.406f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x7927

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 741
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_1

    .line 387
    :sswitch_1
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v4, :cond_7

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_4

    .line 60
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    :sswitch_5
    return-void

    .line 934
    :sswitch_6
    new-instance v4, Ll/֡ۡ᩺;

    iget-object v5, p0, Ll/ۛۡ᩺;->ܺ:Ll/᩻ۡ᩺;

    .line 579
    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_0

    goto/16 :goto_2

    .line 934
    :cond_0
    invoke-direct {v4, v5, v0}, Ll/֡ۡ᩺;-><init>(Ll/᩻ۡ᩺;Ll/ۘ۠᩺;)V

    .line 965
    invoke-static {v4}, Ll/֡ۚ;->᩺ܿ᩸(Ljava/lang/Object;)V

    return-void

    .line 914
    :sswitch_7
    invoke-static {v0}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    sget v4, Ll/᩻ۡ᩺;->ۜܰ:I

    .line 933
    iget-boolean v4, v0, Ll/ۘ۠᩺;->ۙ:Z

    if-eqz v4, :cond_1

    const-string v4, "\u06e0\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5103

    const v6, 0x70786502

    xor-int/2addr v5, v6

    const v6, 0x6f342070

    goto :goto_0

    :cond_1
    const-string v4, "\u0733\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7f53

    const v6, -0x1da5cb6a

    xor-int/2addr v5, v6

    const v6, 0x698b6aec

    goto :goto_0

    .line 2
    :sswitch_8
    move-object v0, p1

    check-cast v0, Ll/ۘ۠᩺;

    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06ec\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x123

    const v6, -0x40ebf1bb

    xor-int/2addr v5, v6

    const v6, -0x55c4966

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06e4\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6d15

    const v6, -0x3517dfbd    # -7606305.5f

    xor-int/2addr v5, v6

    const v6, -0x7c431f22

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u1a78\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x46d

    const v6, -0x2bf2efa5

    xor-int/2addr v5, v6

    const v6, 0x5914d0ba

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_6

    :cond_5
    const-string v4, "\u1a75\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6cf5

    const v6, -0x687ff613

    xor-int/2addr v5, v6

    const v6, 0x7e24fd0a

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b97

    const v6, 0x3f3c176

    xor-int/2addr v5, v6

    const v6, -0x1e459a37

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a73\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ae3

    const v6, -0x3d5ee81

    xor-int/2addr v5, v6

    const v6, -0x4fcbd728

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d9\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6de5

    const v6, 0x2bc8a237

    xor-int/2addr v5, v6

    const v6, -0x7223adb9

    goto/16 :goto_0

    .line 647
    :sswitch_d
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5975

    const v6, 0x5972f670

    xor-int/2addr v5, v6

    const v6, -0xf4588bc

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf79

    const v6, -0x430446e6

    xor-int/2addr v5, v6

    const v6, 0x75e80d40

    goto/16 :goto_0

    .line 112
    :sswitch_e
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_b

    goto :goto_3

    :cond_b
    const-string v4, "\u06eb\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4d77

    const v6, -0x31e67944    # -6.43936E8f

    xor-int/2addr v5, v6

    const v6, 0x16402ce3

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06d6\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3841

    const v6, 0x33f1dd37

    xor-int/2addr v5, v6

    const v6, -0x1e835b2b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x397b

    const v6, 0x717990dd

    xor-int/2addr v5, v6

    const v6, 0x2c142c56

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_d

    :goto_4
    const-string v4, "\u1a73\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x45e5

    const v6, -0x4ba38441

    xor-int/2addr v5, v6

    const v6, 0x56d4b503

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x23cd

    const v6, 0x7dc81d59

    xor-int/2addr v5, v6

    const v6, -0x4b0733b6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ec5e39f -> :sswitch_d
        -0x7e338705 -> :sswitch_3
        -0x7aa059b3 -> :sswitch_5
        -0x6c9d1420 -> :sswitch_a
        -0x5c2b4095 -> :sswitch_4
        -0x552cfd0a -> :sswitch_f
        -0x41db1bae -> :sswitch_a
        -0x37288070 -> :sswitch_4
        -0x339aee9c -> :sswitch_f
        -0x2ab27586 -> :sswitch_8
        -0x170e9b75 -> :sswitch_3
        -0x15a64a94 -> :sswitch_2
        -0x1417d859 -> :sswitch_c
        -0x87482a4 -> :sswitch_6
        -0x6cadcd9 -> :sswitch_b
        -0x1558b7 -> :sswitch_9
        0xaa88f7 -> :sswitch_6
        0x444b7f5 -> :sswitch_c
        0x612b79d -> :sswitch_0
        0xc046bee -> :sswitch_9
        0x13dc78da -> :sswitch_b
        0x1477d512 -> :sswitch_7
        0x14c6d037 -> :sswitch_8
        0x1ab7240e -> :sswitch_e
        0x1b0cb686 -> :sswitch_d
        0x2e379701 -> :sswitch_2
        0x2fcb0392 -> :sswitch_1
        0x35ef09de -> :sswitch_e
        0x480e3ecc -> :sswitch_1
        0x6dd9ab02 -> :sswitch_7
        0x6de2f70f -> :sswitch_5
        0x7606928b -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
