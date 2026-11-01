.class public final synthetic Ll/ۚۨۘ;
.super Ljava/lang/Object;
.source "D2S2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/ۡۨۘ;

.field public final synthetic ᩶:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۨۘ;Ljava/lang/Runnable;)V
    .locals 6

    const v0, 0x21b16f05

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0730\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x17b1

    const v5, -0x5e5b7f5f

    xor-int/2addr v4, v5

    const v5, 0x710431b5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x36c1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_9

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v3, :cond_7

    goto/16 :goto_4

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :sswitch_2
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v3, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    :goto_1
    const-string v3, "\u05a1\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xaff

    const v5, -0x7dc966e4

    xor-int/2addr v4, v5

    const v5, 0x1f4a572d

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p2, p0, Ll/ۚۨۘ;->᩶:Ljava/lang/Runnable;

    return-void

    :sswitch_6
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x19d7

    const v5, 0x32c71e2b

    xor-int/2addr v4, v5

    const v5, -0x361ece7b

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_2

    :cond_1
    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x24f9

    const v5, 0x7dd471b1

    xor-int/2addr v4, v5

    const v5, -0x2ce56afe

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u1a75\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x111

    const v5, 0x5830116c

    xor-int/2addr v4, v5

    const v5, 0x3816a289

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69c9

    const v5, -0x38c60a4b

    xor-int/2addr v4, v5

    const v5, 0x51e1ff26

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xe63

    const v5, 0x3126adf6

    xor-int/2addr v4, v5

    const v5, -0x72558599

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x633b

    const v5, -0x71b611f

    xor-int/2addr v4, v5

    const v5, 0x657f8c54

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1067

    const v5, 0x3772c312

    xor-int/2addr v4, v5

    const v5, -0x71ef6135

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1bdf

    const v5, 0x65fc75b3

    xor-int/2addr v4, v5

    const v5, -0x4a6c6a87

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a73\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x67d3

    const v5, 0x231e88ea

    xor-int/2addr v4, v5

    const v5, -0x45ddbf9b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7a\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d2f

    const v5, -0x7bb580cb

    xor-int/2addr v4, v5

    const v5, -0x38f34957

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5fcb

    const v5, 0x7d616a6d

    xor-int/2addr v4, v5

    const v5, -0x2abf67e4

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a57

    const v5, 0xfca9ae4

    xor-int/2addr v4, v5

    const v5, 0x49f74c45

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۚۨۘ;->ܺ:Ll/ۡۨۘ;

    .line 1
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ba1

    const v5, 0x5ea97d0c

    xor-int/2addr v4, v5

    const v5, 0x51c7a09c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c6d

    const v5, -0x3ac04a8d

    xor-int/2addr v4, v5

    const v5, -0x7f62c04c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7317712c -> :sswitch_8
        -0x697c55f8 -> :sswitch_6
        -0x655851d4 -> :sswitch_2
        -0x4a2ae15f -> :sswitch_7
        -0x49df1c05 -> :sswitch_4
        -0x34d03c17 -> :sswitch_2
        -0x2f6f669c -> :sswitch_3
        -0x2ed2d88f -> :sswitch_7
        -0x1144f154 -> :sswitch_6
        -0xb096811 -> :sswitch_4
        -0x71ece65 -> :sswitch_1
        -0x599ee01 -> :sswitch_c
        0x81beff6 -> :sswitch_1
        0x1bd3c8a7 -> :sswitch_d
        0x207555d1 -> :sswitch_5
        0x21365521 -> :sswitch_0
        0x2c68af3b -> :sswitch_a
        0x2e64d082 -> :sswitch_9
        0x3085995e -> :sswitch_8
        0x32190798 -> :sswitch_5
        0x3efc3049 -> :sswitch_0
        0x4ae3cfa2 -> :sswitch_b
        0x56786557 -> :sswitch_e
        0x5caccb23 -> :sswitch_3
        0x65afa505 -> :sswitch_a
        0x692026e1 -> :sswitch_c
        0x6b21ac3b -> :sswitch_d
        0x6e9fb2c9 -> :sswitch_e
        0x76f33231 -> :sswitch_b
        0x7ae42dae -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۚۨۘ;->ܺ:Ll/ۡۨۘ;

    iget-object v1, p0, Ll/ۚۨۘ;->᩶:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Ll/ۡۨۘ;->ۙ(Ll/ۡۨۘ;Ljava/lang/Runnable;)V

    return-void
.end method
