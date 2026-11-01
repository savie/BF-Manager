.class public final synthetic Ll/ܽᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܶ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/᩻ᩳ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ᩳ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x372619cc

    sget v2, Ll/۟;->ۨᩴۛ:I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    const-string v4, "\u06e8\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xd03

    const v6, 0x76828f6c

    xor-int/2addr v5, v6

    const v6, -0x65ed6bcc

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x505d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_3

    goto :goto_1

    :sswitch_1
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v4, :cond_8

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto :goto_1

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/֫ۡ᩺;

    invoke-static {v0, p1}, Ll/᩻ᩳ᩺;->ۙ(Ll/᩻ᩳ᩺;Ll/֫ۡ᩺;)Ll/۟۟۠;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ܽᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    .line 1
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06eb\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x792b

    const v6, 0x6b0fe53d

    xor-int/2addr v5, v6

    const v6, -0x54601e84

    goto :goto_0

    .line 0
    :sswitch_7
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_1

    :goto_1
    const-string v4, "\u0736\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c91

    const v6, 0x65974973

    xor-int/2addr v5, v6

    const v6, 0x555aa43f

    goto :goto_0

    :cond_1
    const-string v4, "\u06db\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x68a9

    const v6, -0x379817b5

    xor-int/2addr v5, v6

    const v6, -0x39653daa

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u05a8\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6ef7

    const v6, -0x38c0f776

    xor-int/2addr v5, v6

    const v6, 0x73c2f81b

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xbfd

    const v6, 0x123a9a88

    xor-int/2addr v5, v6

    const v6, -0x61c0cac0

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d9\u073d"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5d5

    const v6, 0xc4ba87a

    xor-int/2addr v5, v6

    const v6, 0xbf8f6d8

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u06d6\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c21

    const v6, 0x2412bc20

    xor-int/2addr v5, v6

    const v6, 0x721933ad

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u073f\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5611

    const v6, 0x537bbbc6

    xor-int/2addr v5, v6

    const v6, 0x4be84548    # 3.0444176E7f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u073a\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5cc7

    const v6, -0x7847a7ff

    xor-int/2addr v5, v6

    const v6, 0x82646a0

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06e4\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x596d

    const v6, -0x48ac3cf

    xor-int/2addr v5, v6

    const v6, -0x205ff818

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06ec\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ccd

    const v6, -0x1e9b5b93

    xor-int/2addr v5, v6

    const v6, -0x15ec1069

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_a

    :goto_4
    const-string v4, "\u1a76\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3eb1

    const v6, 0x760d80dd

    xor-int/2addr v5, v6

    const v6, -0x21511417

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d3

    const v6, 0x3dce7fee

    xor-int/2addr v5, v6

    const v6, 0x2203ba24

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u05a1\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14dd

    const v6, 0x4d78482e

    xor-int/2addr v5, v6

    const v6, 0x2b42ed07

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x14af

    const v6, 0x7d9fd969

    xor-int/2addr v5, v6

    const v6, 0xdebac2c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e73148f -> :sswitch_9
        -0x78db884e -> :sswitch_7
        -0x6aeed037 -> :sswitch_b
        -0x65aa779f -> :sswitch_b
        -0x5e648790 -> :sswitch_5
        -0x5b7aa8bf -> :sswitch_1
        -0x49235cc6 -> :sswitch_6
        -0x48c6a1dc -> :sswitch_2
        -0x44ab1629 -> :sswitch_8
        -0x3e63878d -> :sswitch_8
        -0x3dbd0a91 -> :sswitch_a
        -0x353e5af4 -> :sswitch_3
        -0x275790cd -> :sswitch_c
        -0x252b2d13 -> :sswitch_0
        -0x1e744896 -> :sswitch_d
        -0x1798cc7d -> :sswitch_c
        -0x15ab2176 -> :sswitch_e
        -0x66cc653 -> :sswitch_4
        -0x1575d74 -> :sswitch_5
        0x3848bfa -> :sswitch_7
        0x15c48eb2 -> :sswitch_3
        0x1c09543f -> :sswitch_9
        0x251cf865 -> :sswitch_4
        0x3ad2062f -> :sswitch_1
        0x448b0cb4 -> :sswitch_6
        0x56085ee0 -> :sswitch_a
        0x56bb206b -> :sswitch_0
        0x5b04e257 -> :sswitch_2
        0x76d6ea55 -> :sswitch_e
        0x7dae2d83 -> :sswitch_d
    .end sparse-switch
.end method
