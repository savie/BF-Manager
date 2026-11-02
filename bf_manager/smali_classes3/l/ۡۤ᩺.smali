.class public final synthetic Ll/ۡۤ᩺;
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

    iput-object p1, p0, Ll/ۡۤ᩺;->ܺ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x6cf92854

    sget v2, Ll/ۘۗ;->ۖۧ۬:I

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    const-string v4, "\u06da\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x651b

    const v6, -0x5ab14e23

    xor-int/2addr v5, v6

    const v6, 0x4d7d558f    # 2.6564018E8f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2539

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    .line 100
    :sswitch_0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v4

    if-lez v4, :cond_8

    goto/16 :goto_2

    .line 32
    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 68
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܶ۟᩺;

    .line 132
    iput-object v0, p1, Ll/ܶ۟᩺;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ۡۤ᩺;->ܺ:Ljava/util/Map;

    .line 15
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u06ec\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7c1b

    const v6, 0x738eb00f

    xor-int/2addr v5, v6

    const v6, -0x1ffcd80c

    goto :goto_0

    .line 117
    :sswitch_7
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_1

    :goto_1
    const-string v4, "\u06eb\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x529

    const v6, 0x37359867

    xor-int/2addr v5, v6

    const v6, -0x355634d0    # -5563800.0f

    goto :goto_0

    :cond_1
    const-string v4, "\u06d7\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b8b

    const v6, 0x4caebe45    # 9.1615784E7f

    xor-int/2addr v5, v6

    const v6, -0x48bcbf02

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u1a7a\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3a1d

    const v6, 0x70c98263

    xor-int/2addr v5, v6

    const v6, -0x2644b85e

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06ec\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x451b

    const v6, -0x1ebf3b0a

    xor-int/2addr v5, v6

    const v6, 0x1fdb87cc

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a77\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x393d

    const v6, 0x3559743

    xor-int/2addr v5, v6

    const v6, -0x62be73a4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a75\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1bc3

    const v6, 0x9347e76

    xor-int/2addr v5, v6

    const v6, 0x6874c378

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06d9\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x8a3

    const v6, -0x88e74ec

    xor-int/2addr v5, v6

    const v6, -0x56c760b8

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_7

    :goto_2
    const-string v4, "\u0730\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xbd1

    const v6, -0x19435ff8

    xor-int/2addr v5, v6

    const v6, -0x5b39442d

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a74\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1653

    const v6, 0x39b213fe

    xor-int/2addr v5, v6

    const v6, 0x4692a892

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06e0\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7027

    const v6, 0x651187bb

    xor-int/2addr v5, v6

    const v6, -0x580c3d0f

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7a\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4143

    const v6, 0x7e33641e

    xor-int/2addr v5, v6

    const v6, -0x42442269

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u0736\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3d3

    const v6, 0x88e78ef

    xor-int/2addr v5, v6

    const v6, 0x6d84d78c

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e8\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x313d

    const v6, 0x240dd927

    xor-int/2addr v5, v6

    const v6, 0xb5dfbca

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e0\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x18ed

    const v6, -0x71cd1bad

    xor-int/2addr v5, v6

    const v6, -0xfdd7474

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x68cff0f7 -> :sswitch_0
        -0x5e96abd0 -> :sswitch_d
        -0x58397191 -> :sswitch_4
        -0x57bf1f60 -> :sswitch_d
        -0x48cc6f9b -> :sswitch_2
        -0x479eb248 -> :sswitch_5
        -0x456b3dee -> :sswitch_3
        -0x3b49afdd -> :sswitch_3
        -0x2ec03852 -> :sswitch_a
        -0x2b87496f -> :sswitch_a
        -0x29baa402 -> :sswitch_b
        -0x1a1b50e9 -> :sswitch_b
        -0xb5a18df -> :sswitch_9
        -0x5d5ef56 -> :sswitch_c
        -0x2211cea -> :sswitch_1
        0xaece3fd -> :sswitch_8
        0xf833377 -> :sswitch_1
        0x1508d322 -> :sswitch_5
        0x151f0c77 -> :sswitch_e
        0x20edbb58 -> :sswitch_6
        0x25954a18 -> :sswitch_0
        0x26633f13 -> :sswitch_e
        0x30154f52 -> :sswitch_9
        0x305d0c25 -> :sswitch_2
        0x33bc2016 -> :sswitch_6
        0x3dfae6ac -> :sswitch_8
        0x47b9c1e3 -> :sswitch_7
        0x58743b96 -> :sswitch_c
        0x5b69fe89 -> :sswitch_7
        0x6383c8b6 -> :sswitch_4
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
