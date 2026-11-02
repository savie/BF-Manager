.class public final synthetic Ll/ᩴۗۨ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/ۛۗۨ;

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۛۗۨ;Z)V
    .locals 6

    const v0, -0x38760c33

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e2\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a61

    const v5, -0x7a5d528a

    xor-int/2addr v4, v5

    const v5, 0x5d5a3df6

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7fef

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v3, :cond_a

    goto/16 :goto_1

    .line 4
    :sswitch_1
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-gez v3, :cond_7

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p2, p0, Ll/ᩴۗۨ;->᩶:Z

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_0

    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d59

    const v5, -0x9a844db

    xor-int/2addr v4, v5

    const v5, 0x270efea3

    goto :goto_0

    :cond_0
    const-string v3, "\u06db\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15b9

    const v5, 0x2e536faf

    xor-int/2addr v4, v5

    const v5, -0xd128f53

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06dc\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1523

    const v5, -0xc9c70ca

    xor-int/2addr v4, v5

    const v5, -0x735423a4

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x639

    const v5, 0x66ce61cc

    xor-int/2addr v4, v5

    const v5, -0x47e1defc

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e4\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x454f

    const v5, 0x3befee83

    xor-int/2addr v4, v5

    const v5, 0x19a8e12e

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u05a8\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1249

    const v5, 0x7eff6bdf

    xor-int/2addr v4, v5

    const v5, 0x688ee2c1

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u1a7b\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5fb5

    const v5, 0x876c6da

    xor-int/2addr v4, v5

    const v5, 0x263678dd

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05a1\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x767f

    const v5, 0x50a0b472

    xor-int/2addr v4, v5

    const v5, 0x73bdfad1

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u05a1\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3237

    const v5, 0x3f87d5f1

    xor-int/2addr v4, v5

    const v5, -0x69947a1

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22f9

    const v5, -0x5096fe71

    xor-int/2addr v4, v5

    const v5, -0x13ff3dbf

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u0730\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x46bd

    const v5, 0x41bec2cb

    xor-int/2addr v4, v5

    const v5, 0x6a85ceb1

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06d8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x400f

    const v5, -0x5d75ff3c

    xor-int/2addr v4, v5

    const v5, 0x64cf581c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4629

    const v5, 0x5343be62

    xor-int/2addr v4, v5

    const v5, 0x3ec6e26c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴۗۨ;->ܺ:Ll/ۛۗۨ;

    .line 3
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u0733\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fcf

    const v5, -0x7636518f

    xor-int/2addr v4, v5

    const v5, 0x4caf78ee    # 9.199806E7f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7bb5

    const v5, -0x62f643ae

    xor-int/2addr v4, v5

    const v5, -0x112c417e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dfabf1f -> :sswitch_1
        -0x7dcb3fc6 -> :sswitch_3
        -0x78c8ddc9 -> :sswitch_3
        -0x5f233a2f -> :sswitch_e
        -0x5aca75a3 -> :sswitch_b
        -0x5170c3ce -> :sswitch_8
        -0x3ee6366c -> :sswitch_9
        -0x3be01dc1 -> :sswitch_c
        -0x38922ace -> :sswitch_0
        -0x23de47d3 -> :sswitch_d
        -0x18840771 -> :sswitch_1
        -0x1512775f -> :sswitch_c
        -0xc78c7a7 -> :sswitch_2
        -0xbe405a8 -> :sswitch_8
        0x4cadb97 -> :sswitch_9
        0x8e81461 -> :sswitch_a
        0xad4e0f2 -> :sswitch_a
        0xcaf3c45 -> :sswitch_0
        0x183b71bd -> :sswitch_7
        0x34e3dfec -> :sswitch_e
        0x3e629174 -> :sswitch_d
        0x4a289d38 -> :sswitch_4
        0x50bcdb2c -> :sswitch_6
        0x5229376c -> :sswitch_4
        0x53a9a46f -> :sswitch_7
        0x53ef8be4 -> :sswitch_5
        0x541ac234 -> :sswitch_b
        0x5864651d -> :sswitch_2
        0x58ef2e61 -> :sswitch_5
        0x77b4b02f -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ᩴۗۨ;->ܺ:Ll/ۛۗۨ;

    iget-boolean v1, p0, Ll/ᩴۗۨ;->᩶:Z

    invoke-static {v0, v1}, Ll/ۛۗۨ;->ۙ(Ll/ۛۗۨ;Z)V

    return-void
.end method
