.class public final synthetic Ll/ۤۤ᩺;
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

    iput-object p1, p0, Ll/ۤۤ᩺;->ܺ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4a1ce517

    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ded

    const v6, -0x29b1d494

    xor-int/2addr v5, v6

    const v6, -0x20f382ad

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0xfa7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 42
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_4

    .line 56
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-lez v4, :cond_9

    goto/16 :goto_4

    .line 19
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 112
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܶ۟᩺;

    .line 132
    iput-object v0, p1, Ll/ܶ۟᩺;->ۙ:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ۤۤ᩺;->ܺ:Ljava/util/Map;

    .line 82
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u06dc\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x696f

    const v6, -0x58bf2e40

    xor-int/2addr v5, v6

    const v6, -0x64dc1d23

    goto :goto_0

    :sswitch_7
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0730\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6227

    const v6, 0x78fe6dd1

    xor-int/2addr v5, v6

    const v6, -0xdfe8b34

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06ec\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4847

    const v6, 0x75f4fec7

    xor-int/2addr v5, v6

    const v6, 0x344f622a

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_3

    :goto_1
    const-string v4, "\u073f\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x46bf

    const v6, -0x400751a4

    xor-int/2addr v5, v6

    const v6, 0x6a2e9fa4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a77\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b5

    const v6, -0x7f7f344

    xor-int/2addr v5, v6

    const v6, 0x4d873723    # 2.835672E8f

    goto/16 :goto_0

    .line 6
    :sswitch_a
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_4

    :goto_2
    const-string v4, "\u05a1\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f8f

    const v6, -0x1e90ed33

    xor-int/2addr v5, v6

    const v6, -0x3530612a    # -6803307.0f

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a76\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5781

    const v6, 0x10b4a81b

    xor-int/2addr v5, v6

    const v6, -0x6ac37818

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d0b

    const v6, -0x49583e60    # -4.9995288E-6f

    xor-int/2addr v5, v6

    const v6, 0x25a63062

    goto/16 :goto_0

    .line 17
    :sswitch_c
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u073f\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e0b

    const v6, 0x15da7ca

    xor-int/2addr v5, v6

    const v6, 0x59a3685b

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_8

    :cond_7
    const-string v4, "\u1a76\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3a65

    const v6, -0x1e16eaae

    xor-int/2addr v5, v6

    const v6, 0x1ea8cfe3

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0730\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2093

    const v6, 0x3a9aeccf

    xor-int/2addr v5, v6

    const v6, -0x2883a0ed

    goto/16 :goto_0

    .line 112
    :sswitch_e
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06e0\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x776b

    const v6, 0x2e5e7873

    xor-int/2addr v5, v6

    const v6, 0x43ae1947

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e0\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x573d

    const v6, -0x47cb7e37

    xor-int/2addr v5, v6

    const v6, -0x6c68bc70

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v4, "\u06ec\u05a1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7aff

    const v6, -0x21dfe7f5

    xor-int/2addr v5, v6

    const v6, -0xccb20b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7acb

    const v6, -0x610d0cc8

    xor-int/2addr v5, v6

    const v6, -0x2cb01a02

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e33e376 -> :sswitch_7
        -0x79dd5d5c -> :sswitch_c
        -0x792a63d5 -> :sswitch_2
        -0x568795c6 -> :sswitch_7
        -0x5386ec40 -> :sswitch_2
        -0x498bba65 -> :sswitch_b
        -0x445988b8 -> :sswitch_a
        -0x41f8a547 -> :sswitch_3
        -0x2c7b7784 -> :sswitch_8
        -0x2b87d98e -> :sswitch_a
        -0x20c6e722 -> :sswitch_3
        -0x1b22cb50 -> :sswitch_9
        -0x1b178815 -> :sswitch_d
        -0xbd1769a -> :sswitch_0
        -0x4e9fa77 -> :sswitch_6
        0x10d40f4d -> :sswitch_e
        0x20d732ac -> :sswitch_5
        0x251880f8 -> :sswitch_4
        0x354f2fd8 -> :sswitch_e
        0x3680b2fb -> :sswitch_c
        0x3f1b40d1 -> :sswitch_1
        0x5a56b7a0 -> :sswitch_0
        0x5e2b42b3 -> :sswitch_8
        0x6c01637e -> :sswitch_6
        0x6feb06da -> :sswitch_b
        0x736c24d1 -> :sswitch_1
        0x74f4ef89 -> :sswitch_5
        0x75a368db -> :sswitch_d
        0x7ae86a11 -> :sswitch_9
        0x7df232ca -> :sswitch_4
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
