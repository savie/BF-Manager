.class public final synthetic Ll/ۖ۟ۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Lbin/mt/plus/Main;

.field public final synthetic ܽ:Ljava/util/ArrayList;

.field public final synthetic ᩶:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

    const v0, 0x208e798

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x227

    const v5, -0x1a3a4d50    # -1.167003E23f

    xor-int/2addr v4, v5

    const v5, -0x4e4ab6fc

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1817

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_7

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-nez v3, :cond_6

    goto/16 :goto_3

    .line 4
    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۖ۟ۘ;->֡:Ljava/lang/String;

    iput-object p4, p0, Ll/ۖ۟ۘ;->ܽ:Ljava/util/ArrayList;

    return-void

    :sswitch_6
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1861

    const v5, 0x787898da

    xor-int/2addr v4, v5

    const v5, -0x49255aa6

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e7\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xb9d

    const v5, 0x1283c0f2

    xor-int/2addr v4, v5

    const v5, -0x3d0c2111

    goto :goto_0

    :sswitch_8
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a78\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4247

    const v5, 0x544c17f5

    xor-int/2addr v4, v5

    const v5, 0x52c0ea76

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u1a79\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6989

    const v5, 0x2724b9bc

    xor-int/2addr v4, v5

    const v5, -0x4111db75

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2f15

    const v5, -0x6316314d

    xor-int/2addr v4, v5

    const v5, -0x5cd4bce2

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u073a\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7435

    const v5, 0x19ac6c84

    xor-int/2addr v4, v5

    const v5, -0x5633d3d6

    goto/16 :goto_0

    :cond_6
    :goto_1
    const-string v3, "\u1a7a\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ec9

    const v5, -0x737a0120

    xor-int/2addr v4, v5

    const v5, 0x16af6c95

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0736\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4baf

    const v5, -0x20f293b5

    xor-int/2addr v4, v5

    const v5, -0x2e5b6299

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u05a8\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e95

    const v5, 0x2b926652

    xor-int/2addr v4, v5

    const v5, 0x728384bc

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05ab\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75e1

    const v5, 0x5fff46b5

    xor-int/2addr v4, v5

    const v5, -0x41123857

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_9

    :goto_3
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6fdf

    const v5, -0x54f29314

    xor-int/2addr v4, v5

    const v5, 0x46a4ef82

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6983

    const v5, -0x570e2d6e

    xor-int/2addr v4, v5

    const v5, -0x28f830ae

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u0736\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2547

    const v5, 0x5a035f22

    xor-int/2addr v4, v5

    const v5, -0x67cf1646

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۖ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/ۖ۟ۘ;->᩶:Landroid/os/Bundle;

    .line 4
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u073a\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3edb

    const v5, -0x40b0c750

    xor-int/2addr v4, v5

    const v5, 0x3a405ff2

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4285

    const v5, 0x12e6c9c8

    xor-int/2addr v4, v5

    const v5, 0x45de3953

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7af4a6c3 -> :sswitch_8
        -0x7ac2dd66 -> :sswitch_4
        -0x6230b359 -> :sswitch_5
        -0x568d16ff -> :sswitch_2
        -0x526262f3 -> :sswitch_a
        -0x4dfde9cd -> :sswitch_4
        -0x4cdac5cf -> :sswitch_c
        -0x47a360c1 -> :sswitch_9
        -0x44f6c87e -> :sswitch_d
        -0x3f36fdbd -> :sswitch_9
        -0x3e1b089f -> :sswitch_1
        -0x3cd351f8 -> :sswitch_7
        -0x2d8f0858 -> :sswitch_d
        -0x2a94bc36 -> :sswitch_3
        -0x256c1a44 -> :sswitch_0
        -0x20e3ebc4 -> :sswitch_7
        -0x18e6dd45 -> :sswitch_b
        -0x66a27b2 -> :sswitch_e
        0x7b0f47f -> :sswitch_5
        0xe3f8396 -> :sswitch_3
        0x11559071 -> :sswitch_2
        0x1c8284d7 -> :sswitch_b
        0x21965f41 -> :sswitch_a
        0x304c89a1 -> :sswitch_e
        0x4b8c16ae -> :sswitch_8
        0x555d229a -> :sswitch_6
        0x591dda90 -> :sswitch_1
        0x68f26df0 -> :sswitch_6
        0x6b11586b -> :sswitch_c
        0x7dae3eaf -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x6255d629

    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v5, "\u06e2\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x18ad

    const v7, -0x4e755ee

    xor-int/2addr v6, v7

    const v7, 0x26f6ec5

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x4b19

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 0
    iget-object v2, p0, Ll/ۖ۟ۘ;->ܺ:Lbin/mt/plus/Main;

    iget-object v3, p0, Ll/ۖ۟ۘ;->᩶:Landroid/os/Bundle;

    invoke-static {v2, v3, v0, v1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v5, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06e4\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa99

    const v7, -0x5f52e70b

    xor-int/2addr v6, v7

    const v7, 0x48c9621b

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v5

    if-eqz v5, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v1, p0, Ll/ۖ۟ۘ;->ܽ:Ljava/util/ArrayList;

    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v5, "\u06d7\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x659d

    const v7, 0xbeea6c1

    xor-int/2addr v6, v7

    const v7, -0x47591fcb

    goto :goto_0

    :sswitch_6
    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u05a8\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3aad

    const v7, -0x1b4aa6eb

    xor-int/2addr v6, v7

    const v7, 0xd790b7d

    goto/16 :goto_0

    :sswitch_7
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u1a77\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x49a9

    const v7, -0x193111d8

    xor-int/2addr v6, v7

    const v7, -0x474f7e97

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v5, "\u06eb\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x63f

    const v7, 0x5a240629

    xor-int/2addr v6, v7

    const v7, -0x70603a4d

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v5, :cond_5

    goto :goto_1

    :cond_5
    const-string v5, "\u1a7a\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x545

    const v7, -0x5799a98c

    xor-int/2addr v6, v7

    const v7, 0x1165dd43

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v5, :cond_6

    :goto_1
    const-string v5, "\u06db\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d6b

    const v7, 0x4ba6021c    # 2.1759032E7f

    xor-int/2addr v6, v7

    const v7, 0x46ca1920    # 25868.562f

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a78\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1ba3

    const v7, -0x465b59b6

    xor-int/2addr v6, v7

    const v7, -0x31ad12df    # -8.8468896E8f

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u06e7\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x24b1

    const v7, -0x7412431e

    xor-int/2addr v6, v7

    const v7, -0x4792f095

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u05a1\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x729f

    const v7, -0x5461c2de

    xor-int/2addr v6, v7

    const v7, -0x38419a5c

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06d7\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x561

    const v7, 0x76b23ed2

    xor-int/2addr v6, v7

    const v7, -0x26be17ec

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_a

    :goto_3
    const-string v5, "\u06e7\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x39f1

    const v7, -0x56fa669c

    xor-int/2addr v6, v7

    const v7, 0x75eee3d5

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7b\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x745

    const v7, 0x1a254c5

    xor-int/2addr v6, v7

    const v7, 0x1f9e208d

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ۖ۟ۘ;->֡:Ljava/lang/String;

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u05a1\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x25e1

    const v7, 0x4278c596

    xor-int/2addr v6, v7

    const v7, -0x47058372

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a78\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x44a7

    const v7, -0x3e1e73e1

    xor-int/2addr v6, v7

    const v7, 0x3cf832a1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b035989 -> :sswitch_8
        -0x795ef112 -> :sswitch_b
        -0x74b3dfea -> :sswitch_a
        -0x6e4e15ac -> :sswitch_9
        -0x67a11325 -> :sswitch_3
        -0x659c4898 -> :sswitch_b
        -0x62d8abb7 -> :sswitch_2
        -0x5fff2a1a -> :sswitch_4
        -0x400d4432 -> :sswitch_6
        -0x287ea7d4 -> :sswitch_e
        -0x2768a86c -> :sswitch_5
        -0x22710a6c -> :sswitch_8
        -0x1e7e13ea -> :sswitch_4
        -0x19e14d02 -> :sswitch_0
        -0x18e50a06 -> :sswitch_1
        -0x16ea1c50 -> :sswitch_d
        -0x1506cc73 -> :sswitch_d
        -0xba82984 -> :sswitch_6
        0x128e4131 -> :sswitch_7
        0x1491f60e -> :sswitch_3
        0x192afe4f -> :sswitch_0
        0x290c832a -> :sswitch_c
        0x319634f2 -> :sswitch_1
        0x334166b9 -> :sswitch_2
        0x407d2089 -> :sswitch_c
        0x4427a64c -> :sswitch_7
        0x4e72b343 -> :sswitch_5
        0x4fe275fc -> :sswitch_e
        0x6d83395c -> :sswitch_a
        0x76fb33d7 -> :sswitch_9
    .end sparse-switch
.end method
