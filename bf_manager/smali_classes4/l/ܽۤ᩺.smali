.class public final synthetic Ll/ܽۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܺ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۤ᩺;->ܺ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x63334417

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x119

    const v6, -0x12116596

    xor-int/2addr v5, v6

    const v6, 0x34a0192

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x33e5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 54
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_a

    goto/16 :goto_3

    .line 13
    :sswitch_0
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u0736\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6385

    const v6, -0x155ed769

    xor-int/2addr v5, v6

    const v6, -0x360c4ecf

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_9

    goto/16 :goto_4

    .line 107
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto/16 :goto_4

    .line 38
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܶ۟᩺;

    .line 132
    iput-object v0, p1, Ll/ܶ۟᩺;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ܽۤ᩺;->ܺ:Ljava/util/Map;

    .line 22
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u05a8\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3305

    const v6, 0x3c7c1fe7

    xor-int/2addr v5, v6

    const v6, 0x61b8d29f

    goto :goto_0

    .line 14
    :sswitch_7
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x88d

    const v6, -0x30be70b2

    xor-int/2addr v5, v6

    const v6, -0x5e42456b

    goto/16 :goto_0

    .line 124
    :sswitch_8
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_3

    :goto_1
    const-string v4, "\u06df\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3e03

    const v6, -0x4f3cbe6c

    xor-int/2addr v5, v6

    const v6, 0x5f8677a3

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e1\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6697

    const v6, 0x7d48c9d

    xor-int/2addr v5, v6

    const v6, -0xd28984c

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x15bd

    const v6, -0x222284ab

    xor-int/2addr v5, v6

    const v6, -0x7ca24064

    goto/16 :goto_0

    .line 101
    :sswitch_a
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x77e9

    const v6, 0x573b9ac8

    xor-int/2addr v5, v6

    const v6, -0x62fe830b

    goto/16 :goto_0

    .line 103
    :sswitch_b
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u1a73\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7b55

    const v6, 0x4972bae

    xor-int/2addr v5, v6

    const v6, -0x7495e9c

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u06d7\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x48ab

    const v6, 0xf24c887

    xor-int/2addr v5, v6

    const v6, 0x4c11966d    # 3.8164916E7f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06dc\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3fd

    const v6, 0x33e5e64d

    xor-int/2addr v5, v6

    const v6, -0x7e30d51e

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7319

    const v6, -0x37825ae1

    xor-int/2addr v5, v6

    const v6, -0x1a90c1af

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d7\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xcf9

    const v6, -0x3bc0a71e

    xor-int/2addr v5, v6

    const v6, -0x4093f2a9

    goto/16 :goto_0

    .line 95
    :sswitch_d
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06e1\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2f07

    const v6, -0x117f3e17

    xor-int/2addr v5, v6

    const v6, 0xedd882f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06dc\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ce9

    const v6, 0x1d90afcb

    xor-int/2addr v5, v6

    const v6, 0x7fc76cff

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x705

    const v6, 0x2bfb013b

    xor-int/2addr v5, v6

    const v6, -0x502d23ae

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f4a6530 -> :sswitch_1
        -0x783aced5 -> :sswitch_2
        -0x77d7f1df -> :sswitch_9
        -0x68e05144 -> :sswitch_9
        -0x689cb5c4 -> :sswitch_3
        -0x6595071b -> :sswitch_7
        -0x6339d426 -> :sswitch_8
        -0x56a27be2 -> :sswitch_6
        -0x540e2b2c -> :sswitch_0
        -0x53d6d7ba -> :sswitch_3
        -0x52a5f25a -> :sswitch_5
        -0x4638f02c -> :sswitch_b
        -0x9d5d147 -> :sswitch_c
        -0x33df946 -> :sswitch_d
        -0x85bfbe -> :sswitch_e
        0x9738eb -> :sswitch_7
        0x690af68 -> :sswitch_6
        0x8d29bce -> :sswitch_8
        0x92ed9b5 -> :sswitch_2
        0xdc406a1 -> :sswitch_a
        0x1068c697 -> :sswitch_c
        0x22487a7e -> :sswitch_1
        0x28feaa0c -> :sswitch_5
        0x2b5adb0b -> :sswitch_b
        0x401dd674 -> :sswitch_0
        0x4a0c78f8 -> :sswitch_e
        0x5ad2727d -> :sswitch_a
        0x605ccd45 -> :sswitch_4
        0x76d29021 -> :sswitch_4
        0x7e0b73a1 -> :sswitch_d
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
