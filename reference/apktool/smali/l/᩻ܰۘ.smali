.class public final synthetic Ll/᩻ܰۘ;
.super Ljava/lang/Object;
.source "X2T2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Z

.field public final synthetic ܺ:Ll/֫ܰۘ;

.field public final synthetic ܽ:Ll/۠֨ۘ;

.field public final synthetic ᩶:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/֫ܰۘ;Ljava/util/List;ZLl/۠֨ۘ;)V
    .locals 6

    const v0, -0x524b5972

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33d

    const v5, 0x39fe255b

    xor-int/2addr v4, v5

    const v5, 0x6fc5504a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x42ad

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v3, :cond_6

    goto/16 :goto_2

    .line 4
    :sswitch_2
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p3, p0, Ll/᩻ܰۘ;->֡:Z

    iput-object p4, p0, Ll/᩻ܰۘ;->ܽ:Ll/۠֨ۘ;

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_0

    const-string v3, "\u06d9\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7873

    const v5, -0x5ffb2713

    xor-int/2addr v4, v5

    const v5, 0x4bd4e70c    # 2.790556E7f

    goto :goto_0

    :cond_0
    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a43

    const v5, 0x3807c55a

    xor-int/2addr v4, v5

    const v5, -0x8c6e423

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e0\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x15d9

    const v5, 0x4b2f6495    # 1.1494549E7f

    xor-int/2addr v4, v5

    const v5, -0x41d565fd

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06e1\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f81

    const v5, 0x33de3b39

    xor-int/2addr v4, v5

    const v5, -0x4fa9b6ee

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1dd1

    const v5, 0x4e31198e    # 7.428105E8f

    xor-int/2addr v4, v5

    const v5, -0x4738905b

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e87

    const v5, -0x3ce6fd37

    xor-int/2addr v4, v5

    const v5, -0x1aae8cab

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2059

    const v5, -0x7f87a353

    xor-int/2addr v4, v5

    const v5, -0x4c676781

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v3

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u06da\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x65b

    const v5, 0x7c0f38c7

    xor-int/2addr v4, v5

    const v5, -0x206f741e

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6c89

    const v5, 0x2153b873

    xor-int/2addr v4, v5

    const v5, -0xf04d259

    goto/16 :goto_0

    .line 3
    :sswitch_b
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u073a\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6273

    const v5, -0x31140af7

    xor-int/2addr v4, v5

    const v5, -0x26600ab7

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6a05

    const v5, 0x78aa0f2e

    xor-int/2addr v4, v5

    const v5, -0x13ba7363

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a74\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd15

    const v5, 0x34fbd140

    xor-int/2addr v4, v5

    const v5, -0x5293524c

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2b17

    const v5, 0xaf445f2

    xor-int/2addr v4, v5

    const v5, 0x1d9034a9

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩻ܰۘ;->ܺ:Ll/֫ܰۘ;

    iput-object p2, p0, Ll/᩻ܰۘ;->᩶:Ljava/util/List;

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u073f\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x196d

    const v5, 0x6ec7a4ec

    xor-int/2addr v4, v5

    const v5, -0x3bcd9d9f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e99

    const v5, 0x6a1f5345

    xor-int/2addr v4, v5

    const v5, 0x461882b8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec9bc68 -> :sswitch_8
        -0x68758b9f -> :sswitch_0
        -0x64211af2 -> :sswitch_4
        -0x57f42958 -> :sswitch_2
        -0x51fb6a5d -> :sswitch_a
        -0x364e3ffc -> :sswitch_6
        -0x297cd7a2 -> :sswitch_7
        -0x290fecf5 -> :sswitch_b
        -0x27decc05 -> :sswitch_1
        -0x22a16d12 -> :sswitch_b
        -0x20cdec16 -> :sswitch_d
        -0xec06a49 -> :sswitch_9
        -0xd8d0fa3 -> :sswitch_c
        -0xab7dec6 -> :sswitch_8
        -0x1302845 -> :sswitch_e
        0x46685ee -> :sswitch_6
        0x4c0a9cf -> :sswitch_1
        0xc44c2ab -> :sswitch_0
        0x15267bf9 -> :sswitch_c
        0x177e2877 -> :sswitch_5
        0x2409e1f0 -> :sswitch_5
        0x30da4d60 -> :sswitch_d
        0x3389c49e -> :sswitch_a
        0x512fba39 -> :sswitch_7
        0x56de55ef -> :sswitch_3
        0x57478db7 -> :sswitch_9
        0x5b090551 -> :sswitch_4
        0x5c5563a2 -> :sswitch_3
        0x63b08523 -> :sswitch_2
        0x657f2c7d -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x6784ba95

    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    sget v6, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v7, "\u06e8\u05ab"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0xb

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5039

    const v9, 0x70881136

    xor-int/2addr v8, v9

    const v9, 0x50827539

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x7023

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    sget-boolean v7, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v7, :cond_6

    goto :goto_1

    .line 147
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v7, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v7, :cond_c

    goto :goto_1

    .line 15
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v7, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v7, :cond_a

    goto :goto_1

    .line 141
    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    :goto_1
    const-string v7, "\u0733\u05a1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x76c9

    const v9, 0x2529a1c7

    xor-int/2addr v8, v9

    const v9, 0x4940bb8c    # 789432.75f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    return-void

    .line 215
    :sswitch_4
    invoke-static {v1, v2}, Ll/ۨۨۘ;->ۚ(Ll/ۨۨۘ;Z)V

    return-void

    .line 211
    :sswitch_5
    invoke-static {v1, v2}, Ll/ۨۨۘ;->ۙ(Ll/ۨۨۘ;Z)V

    goto :goto_2

    .line 213
    :sswitch_6
    iget-object v7, p0, Ll/᩻ܰۘ;->ܽ:Ll/۠֨ۘ;

    invoke-static {v1, v7}, Ll/ۨۨۘ;->ܰ(Ll/ۨۨۘ;Ll/۠֨ۘ;)V

    :goto_2
    const-string v7, "\u06e1\u1a75"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5d05

    const v9, -0x130f4199

    xor-int/2addr v8, v9

    const v9, -0x4f08c75e

    goto :goto_0

    .line 209
    :sswitch_7
    invoke-static {v1, v3}, Ll/ۨۨۘ;->ܰ(Ll/ۨۨۘ;Ljava/util/List;)V

    .line 210
    iget-boolean v7, p0, Ll/᩻ܰۘ;->֡:Z

    if-eqz v7, :cond_0

    const-string v7, "\u06da\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x31

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7cf5

    const v9, -0x42126ee9    # -0.11599939f

    xor-int/2addr v8, v9

    const v9, -0x5450686e

    goto :goto_0

    :cond_0
    const-string v7, "\u1a79\u1a78"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x330d

    const v9, 0x380fc7b3

    xor-int/2addr v8, v9

    const v9, -0x4a97d4ac

    goto/16 :goto_0

    .line 208
    :sswitch_8
    iget-object v3, p0, Ll/᩻ܰۘ;->᩶:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_1

    goto :goto_3

    :cond_1
    const-string v7, "\u06ec\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x37

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7db9

    const v9, -0x64d19b11

    xor-int/2addr v8, v9

    const v9, 0x286bcbf7

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x1

    .line 207
    invoke-static {v1, v2}, Ll/ۨۨۘ;->ܰ(Ll/ۨۨۘ;Z)V

    .line 99
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v7

    if-gtz v7, :cond_2

    goto :goto_3

    :cond_2
    const-string v7, "\u1a76\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x9

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5dd5

    const v9, -0x5600cf22

    xor-int/2addr v8, v9

    const v9, 0x50f73631

    goto/16 :goto_0

    .line 207
    :sswitch_a
    iget-object v1, v0, Ll/֫ܰۘ;->֨:Ll/ۨۨۘ;

    .line 138
    sget-boolean v7, Ll/᩶;->ۚۤۘ:Z

    if-eqz v7, :cond_3

    :goto_3
    const-string v7, "\u1a74\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1353

    const v9, -0x726f2e5e

    xor-int/2addr v8, v9

    const v9, -0x4ef9475e

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06d8\u06d7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1bb5

    const v9, -0x1d34a4a3

    xor-int/2addr v8, v9

    const v9, -0x54426d6c

    goto/16 :goto_0

    .line 154
    :sswitch_b
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u06e1\u05a8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7cb3

    const v9, 0x634226e9

    xor-int/2addr v8, v9

    const v9, -0x7b9a8ddc

    goto/16 :goto_0

    .line 174
    :sswitch_c
    sget v7, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v7, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v7, "\u06df\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2d0d

    const v9, -0x19feb1ef

    xor-int/2addr v8, v9

    const v9, 0x341909cf

    goto/16 :goto_0

    .line 15
    :sswitch_d
    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_7

    :cond_6
    const-string v7, "\u06e8\u06db"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6c5b

    const v9, 0x2ca882a7

    xor-int/2addr v8, v9

    const v9, 0x7067ddbc

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u1a7a\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x27bf

    const v9, -0x355fc361    # -5250639.5f

    xor-int/2addr v8, v9

    const v9, -0x6207ae3d

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_4

    :cond_8
    const-string v7, "\u05a8\u073a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5761

    const v9, -0x5831bc3d

    xor-int/2addr v8, v9

    const v9, 0x1030399d

    goto/16 :goto_0

    .line 87
    :sswitch_f
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_9
    const-string v7, "\u05a1\u05ab"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x4f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xeb7

    const v9, -0x242fe54d

    xor-int/2addr v8, v9

    const v9, -0x19d0c918

    goto/16 :goto_0

    .line 169
    :sswitch_10
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_b

    :cond_a
    :goto_4
    const-string v7, "\u06e4\u1a73"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x63

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x46f3

    const v9, -0x22999b5b

    xor-int/2addr v8, v9

    const v9, -0x6a3b8843

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06d8\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0xf

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2b61

    const v9, -0x22d47679

    xor-int/2addr v8, v9

    const v9, 0x17d0d9c5

    goto/16 :goto_0

    .line 207
    :sswitch_11
    iget-object v0, p0, Ll/᩻ܰۘ;->ܺ:Ll/֫ܰۘ;

    .line 106
    sget-boolean v7, Ll/᩶;->ۚۤۘ:Z

    if-eqz v7, :cond_d

    :cond_c
    :goto_5
    const-string v7, "\u1a76\u05a8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x34f

    const v9, -0x5f8d9d72

    xor-int/2addr v8, v9

    const v9, -0x33339326    # -1.0717768E8f

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06ec\u073f"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2c05

    const v9, -0x4e8b20bc

    xor-int/2addr v8, v9

    const v9, -0x5eda84ce

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79fa3f4e -> :sswitch_b
        -0x71cf8150 -> :sswitch_d
        -0x6632f88d -> :sswitch_a
        -0x5a761467 -> :sswitch_0
        -0x55d2510c -> :sswitch_f
        -0x3a14bb25 -> :sswitch_3
        -0x323a2c7a -> :sswitch_a
        -0x318499bb -> :sswitch_6
        -0x2f5a5658 -> :sswitch_11
        -0x28bf5103 -> :sswitch_3
        0x1d22d9e8 -> :sswitch_e
        0x212d5da1 -> :sswitch_8
        0x21b0d63b -> :sswitch_7
        0x2b6b95f4 -> :sswitch_6
        0x2e05d132 -> :sswitch_2
        0x320d790a -> :sswitch_f
        0x32fdafd2 -> :sswitch_e
        0x33348280 -> :sswitch_0
        0x3491fb96 -> :sswitch_d
        0x38d74732 -> :sswitch_1
        0x3a779041 -> :sswitch_8
        0x3c896d08 -> :sswitch_4
        0x406e4ad1 -> :sswitch_10
        0x42a148ee -> :sswitch_9
        0x473f5707 -> :sswitch_2
        0x47457e1b -> :sswitch_c
        0x48158088 -> :sswitch_c
        0x4d2bef82 -> :sswitch_5
        0x52cfa497 -> :sswitch_1
        0x593f6eab -> :sswitch_5
        0x61cffdaa -> :sswitch_11
        0x65034b31 -> :sswitch_7
        0x65193dc0 -> :sswitch_4
        0x72dd857c -> :sswitch_b
        0x74cb4c37 -> :sswitch_10
        0x7e53a2bd -> :sswitch_9
    .end sparse-switch
.end method
