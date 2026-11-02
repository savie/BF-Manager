.class public final synthetic Ll/۠᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۬ᩴܳ:[S


# instance fields
.field public final synthetic ֡:Ljava/lang/Class;

.field public final synthetic ܺ:Ljava/util/ArrayList;

.field public final synthetic ܽ:Ll/ۖ۬᩹;

.field public final synthetic ᩶:Ll/ۨۜ᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠᩺᩹;->۬ᩴܳ:[S

    return-void

    :array_0
    .array-data 2
        0x2271s
        0x10a9s
        0x10a6s
        0x10acs
        0x10bas
        0x10a7s
        0x10a1s
        0x10acs
        0x10e6s
        0x10a1s
        0x10a6s
        0x10bcs
        0x10ads
        0x10a6s
        0x10bcs
        0x10e6s
        0x10a9s
        0x10abs
        0x10bcs
        0x10a1s
        0x10a7s
        0x10a6s
        0x10e6s
        0x109es
        0x1081s
        0x108ds
        0x109fs
        0x10acs
        0x10ads
        0x10b0s
        0x108es
        0x10a1s
        0x10a4s
        0x10ads
        0x10bbs
        0x10bas
        0x10ads
        0x10bbs
        0x10a7s
        0x10bds
        0x10bas
        0x10abs
        0x10ads
        0x10bbs
        0x10e6s
        0x10a9s
        0x10bas
        0x10bbs
        0x10abs
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ۨۜ᩹;Ljava/lang/Class;Ll/ۖ۬᩹;)V
    .locals 6

    const v0, -0x4b5e028f

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06df\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3e07

    const v5, -0x3d1ff92c

    xor-int/2addr v4, v5

    const v5, -0xcefdbac

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x50ad

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_9

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-lez v3, :cond_8

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_6

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v3

    if-lez v3, :cond_b

    goto/16 :goto_4

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p3, p0, Ll/۠᩺᩹;->֡:Ljava/lang/Class;

    iput-object p4, p0, Ll/۠᩺᩹;->ܽ:Ll/ۖ۬᩹;

    return-void

    :sswitch_6
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06db\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a97

    const v5, 0x4f25ce1f

    xor-int/2addr v4, v5

    const v5, 0x4f057fa4

    goto :goto_0

    .line 1
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e19

    const v5, -0x53f440a8

    xor-int/2addr v4, v5

    const v5, 0x40f95fed

    goto :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e8\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x72ed

    const v5, -0x10723557

    xor-int/2addr v4, v5

    const v5, 0x30e76caf

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e1\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4b05

    const v5, 0x289a98c5

    xor-int/2addr v4, v5

    const v5, -0x6c311a78

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a37

    const v5, 0x4bc2375e    # 2.5456316E7f

    xor-int/2addr v4, v5

    const v5, 0x7b4b7bca

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u06d7\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7cc3

    const v5, -0x49e52715

    xor-int/2addr v4, v5

    const v5, 0x5577b176

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05ab\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b1

    const v5, -0x40643fc5

    xor-int/2addr v4, v5

    const v5, 0x700aa03a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2bdb

    const v5, -0x4e2d5746

    xor-int/2addr v4, v5

    const v5, 0x3a0bbd15

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05ab\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f79

    const v5, 0x6c5c9342

    xor-int/2addr v4, v5

    const v5, -0x3897ac3d

    goto/16 :goto_0

    :cond_8
    :goto_3
    const-string v3, "\u05ab\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x48ff

    const v5, -0x18864355

    xor-int/2addr v4, v5

    const v5, 0x4ca36413    # 8.5663896E7f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x65b9

    const v5, 0xdf482f8

    xor-int/2addr v4, v5

    const v5, -0x23e11ef9

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u073a\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c95

    const v5, -0x30ea278d    # -2.5139904E9f

    xor-int/2addr v4, v5

    const v5, 0x6d0f49a8

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x65e9

    const v5, -0x547c8879

    xor-int/2addr v4, v5

    const v5, -0x3283b99c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۠᩺᩹;->ܺ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/۠᩺᩹;->᩶:Ll/ۨۜ᩹;

    .line 1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a55

    const v5, -0x649b5800

    xor-int/2addr v4, v5

    const v5, -0x5c42cdcc

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x271d

    const v5, 0xe660b7e

    xor-int/2addr v4, v5

    const v5, 0x616ef0a0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bd62893 -> :sswitch_d
        -0x67dbe99f -> :sswitch_e
        -0x5107adaa -> :sswitch_d
        -0x3e7695f1 -> :sswitch_1
        -0x3a1930ee -> :sswitch_5
        -0x36874db8 -> :sswitch_b
        -0x337c386b -> :sswitch_0
        -0x3023ac20 -> :sswitch_c
        -0x29059fd5 -> :sswitch_6
        -0x28a80eec -> :sswitch_2
        -0x25b627ae -> :sswitch_9
        -0x12654953 -> :sswitch_2
        -0x11f84e8c -> :sswitch_5
        -0x11f56453 -> :sswitch_a
        -0xaba6ac3 -> :sswitch_1
        0x7184384 -> :sswitch_6
        0xe9793c1 -> :sswitch_3
        0x31b2c870 -> :sswitch_4
        0x31de6dc8 -> :sswitch_8
        0x32cc1f86 -> :sswitch_8
        0x330e2fb2 -> :sswitch_4
        0x3754c076 -> :sswitch_a
        0x3eacb87a -> :sswitch_0
        0x52ff5556 -> :sswitch_b
        0x54fa2c34 -> :sswitch_c
        0x5a57eba2 -> :sswitch_3
        0x5a8dda32 -> :sswitch_7
        0x5d87d179 -> :sswitch_7
        0x6d103a90 -> :sswitch_e
        0x7b71e36d -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 27

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x6f653ec9

    sget v21, Ll/֡۠;->ۛ᩻ۧ:I

    sget v22, Ll/֨᩺;->۬᩺ܰ:I

    const-string v23, "\u073f\u1a77"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v22

    xor-int v1, v23, v21

    mul-int/lit16 v1, v1, 0x589b

    const v25, -0x594f4bae

    xor-int v1, v1, v25

    const v25, 0x5c8bccf6

    xor-int v23, v23, v25

    move-object v3, v2

    move-object/from16 v17, v9

    move-object/from16 v10, v16

    move-object/from16 v14, v19

    move/from16 v24, v23

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, 0x6f653ec9

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v15, v23, v21

    mul-int/lit16 v15, v15, 0x4da1

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v23, v24, v1

    sparse-switch v23, :sswitch_data_0

    .line 416
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v1, Ll/ۗ;->֨۬ۖ:I

    if-ltz v1, :cond_c

    goto/16 :goto_6

    .line 1132
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v1

    if-lez v1, :cond_5

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_6

    .line 363
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    :sswitch_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 1174
    :sswitch_5
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ۙ()V

    .line 1175
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ܰ()Ll/᩷۠ۚ;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۘᩴܰ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۧ۬ۨ;->ۚ(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_6
    const/16 v1, 0x23

    const/16 v15, 0xe

    .line 1172
    invoke-static {v14, v1, v15, v4}, Ll/֨᩹;->ۚܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    const-string v1, "\u06da\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x6bc1

    const v24, -0x16e0628b

    xor-int v15, v15, v24

    const v24, -0x160f77ec

    goto/16 :goto_7

    :cond_0
    const-string v1, "\u1a7a\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x6b1f

    const v24, -0x3c194ed1

    xor-int v15, v15, v24

    const v24, 0x1bdd4863

    goto/16 :goto_7

    .line 1171
    :sswitch_7
    invoke-static {v3, v5}, Ll/ۗܳ;->ܿۙۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۧۜ᩹;

    .line 1172
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ۖ()Ljava/lang/String;

    move-result-object v9

    sget-object v14, Ll/۠᩺᩹;->۬ᩴܳ:[S

    .line 775
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u06da\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x1f

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x4161

    const v24, -0x54f6925a

    xor-int v15, v15, v24

    const v24, -0x1d4105af

    goto/16 :goto_7

    :sswitch_8
    const/16 v1, 0x7d0

    .line 216
    iget-object v2, v0, Ll/۠᩺᩹;->ܽ:Ll/ۖ۬᩹;

    invoke-static {v2, v1}, Ll/ۜᩳ᩹;->ۙ(Ll/ۖ۬᩹;I)V

    .line 1182
    invoke-static {v6}, Ll/ۖۧ;->ۗ᩵ܺ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v12}, Ll/ۗܳ;->᩺ܿۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1180
    :sswitch_9
    invoke-virtual {v2}, Ll/ۧ۬ۨ;->ᩳ()[B

    move-result-object v1

    invoke-virtual {v12, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 681
    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u073d\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x77cd

    const v24, 0x3e86befe

    xor-int v15, v15, v24

    const v24, -0x7612185f

    goto/16 :goto_7

    .line 1179
    :sswitch_a
    sget-object v1, Ll/۠᩺᩹;->۬ᩴܳ:[S

    const/16 v7, 0x1b

    const/16 v15, 0x8

    invoke-static {v1, v7, v15, v4}, Ll/֫۟;->ۤۛᩴ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 855
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u073d\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x9

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x6f35

    const v24, 0x322ea61c

    xor-int v15, v15, v24

    const v24, -0x7f54504d

    goto/16 :goto_7

    .line 1178
    :sswitch_b
    invoke-static {v10, v11, v13, v4}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1179
    invoke-virtual {v12, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_4

    :goto_2
    const-string v1, "\u06d9\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x5

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x74e1

    const v24, -0x186e4da6

    xor-int v15, v15, v24

    const v24, 0x774c6ce5

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u06d7\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x7a7

    const v24, 0x52f597b

    xor-int v15, v15, v24

    const v24, -0x17c91d5c

    goto/16 :goto_7

    .line 1178
    :sswitch_c
    sget-object v10, Ll/۠᩺᩹;->۬ᩴܳ:[S

    const/4 v11, 0x1

    const/16 v13, 0x1a

    .line 752
    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_6

    :cond_5
    const-string v1, "\u06d6\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x7b

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3a77

    const v24, 0x23a78a09

    xor-int v15, v15, v24

    const v24, -0x301f9757

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u06ec\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0xca5

    const v24, -0x45209886

    xor-int v15, v15, v24

    const v24, -0x496ef0a3

    goto/16 :goto_7

    .line 1177
    :sswitch_d
    new-instance v12, Landroid/content/Intent;

    iget-object v6, v0, Ll/۠᩺᩹;->᩶:Ll/ۨۜ᩹;

    invoke-static {v6}, Ll/֫ۚ;->ۗۚۧ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v15, v0, Ll/۠᩺᩹;->֡:Ljava/lang/Class;

    .line 257
    sget-boolean v24, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v24, :cond_7

    goto/16 :goto_5

    .line 1177
    :cond_7
    invoke-direct {v12, v1, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1178
    invoke-static {v12, v1}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 762
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    const-string v1, "\u06e4\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x59

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x4067

    const v24, 0x2f6d06c4

    xor-int v15, v15, v24

    const v24, 0x579045ea

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u073f\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x3c17

    const v24, -0x3eee38e6

    xor-int v15, v15, v24

    const v24, 0x7de22d8a

    goto/16 :goto_7

    .line 1170
    :sswitch_e
    iget-object v3, v0, Ll/۠᩺᩹;->ܺ:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/֡֡;->ۢۡۜ(Ljava/lang/Object;)I

    move-result v1

    if-ge v5, v1, :cond_a

    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x6f

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x555b

    const v24, -0x15f6e51e

    xor-int v15, v15, v24

    const v24, -0x2ffda5db

    goto/16 :goto_7

    :cond_a
    const-string v1, "\u06eb\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x346b

    const v24, -0x51f80ae7

    xor-int v15, v15, v24

    const v24, -0x50cef668

    goto/16 :goto_7

    .line 1169
    :sswitch_f
    new-instance v1, Ll/ۧ۬ۨ;

    invoke-direct {v1}, Ll/ۧ۬ۨ;-><init>()V

    const/4 v2, 0x0

    move-object v2, v1

    const/4 v5, 0x0

    :goto_3
    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0xedf

    const v24, -0x7454fb78

    xor-int v15, v15, v24

    const v24, -0x573afcbf

    goto/16 :goto_7

    :sswitch_10
    const v1, 0xfd7a

    const v4, 0xfd7a

    goto :goto_4

    :sswitch_11
    const/16 v1, 0x10c8

    const/16 v4, 0x10c8

    :goto_4
    const-string v1, "\u06d9\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x407f

    const v24, -0x646fd2ef

    xor-int v15, v15, v24

    const v24, -0x1c9ecd3

    goto/16 :goto_7

    :sswitch_12
    mul-int v1, v25, v26

    sub-int v1, v20, v1

    if-ltz v1, :cond_b

    const-string v1, "\u06ec\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x55

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0xe57

    const v24, -0x4d05dd33

    xor-int v15, v15, v24

    const v24, 0x300e4238

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u1a78\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x6189

    const v24, 0x203a8d81

    xor-int v15, v15, v24

    const v24, 0x1d6da0d8

    goto/16 :goto_7

    :sswitch_13
    const v1, 0x702a5c9

    add-int v20, v19, v1

    const/16 v26, 0x54ba

    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u06e1\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x3d

    xor-int v12, v1, v22

    mul-int/lit16 v12, v12, -0x6c53

    const v15, -0x6c325fc0

    xor-int/2addr v12, v15

    const v15, -0x77fa50fa

    xor-int v24, v1, v15

    move v1, v12

    const/4 v12, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x6d

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x4153

    const v24, -0x9ebe454

    xor-int v15, v15, v24

    const v24, 0x3f6cdec5

    goto :goto_7

    :sswitch_14
    aget-short v25, v17, v18

    mul-int v19, v25, v25

    .line 424
    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_e

    goto :goto_6

    :cond_e
    const-string v1, "\u1a7a\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x19

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x4099

    const v24, 0x5c24648

    xor-int v15, v15, v24

    const v24, -0x13022af8

    goto :goto_7

    :sswitch_15
    sget-object v17, Ll/۠᩺᩹;->۬ᩴܳ:[S

    const/16 v18, 0x0

    .line 953
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-nez v1, :cond_f

    :goto_6
    const-string v1, "\u06e1\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x10f5

    const v24, 0x2807b55

    xor-int v15, v15, v24

    const v24, 0xb0849c6

    goto :goto_7

    :cond_f
    const-string v1, "\u06d6\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x6d

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x5377

    const v24, 0x21a64898

    xor-int v15, v15, v24

    const v24, -0x73f74c0a

    :goto_7
    xor-int v24, v1, v24

    move v1, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ffdb78f -> :sswitch_b
        -0x76d4c16c -> :sswitch_15
        -0x76635502 -> :sswitch_9
        -0x73f28686 -> :sswitch_6
        -0x726a7ae0 -> :sswitch_1
        -0x72369348 -> :sswitch_4
        -0x71c13255 -> :sswitch_7
        -0x6b65e1e3 -> :sswitch_8
        -0x60348793 -> :sswitch_8
        -0x58f36083 -> :sswitch_3
        -0x57bd201a -> :sswitch_c
        -0x544c13fe -> :sswitch_13
        -0x54192e0c -> :sswitch_b
        -0x4c9f6c42 -> :sswitch_12
        -0x4a4d2301 -> :sswitch_e
        -0x3f937155 -> :sswitch_10
        -0x31818489 -> :sswitch_5
        -0x1d642b42 -> :sswitch_d
        -0xc6924b5 -> :sswitch_5
        -0x5fcd33f -> :sswitch_15
        -0x24eb35 -> :sswitch_e
        0x1998dd -> :sswitch_10
        0x7e1293 -> :sswitch_6
        0xca45ea9 -> :sswitch_13
        0x167f968b -> :sswitch_3
        0x1b585e31 -> :sswitch_2
        0x1d09e8ea -> :sswitch_11
        0x2197da96 -> :sswitch_11
        0x280b0d25 -> :sswitch_f
        0x2b96c3a5 -> :sswitch_f
        0x2cd38990 -> :sswitch_a
        0x2f219c4c -> :sswitch_1
        0x3149dcff -> :sswitch_c
        0x3c506f8e -> :sswitch_4
        0x3d963274 -> :sswitch_a
        0x44f19d2f -> :sswitch_14
        0x5b681bc5 -> :sswitch_0
        0x60789c9a -> :sswitch_7
        0x680f0806 -> :sswitch_0
        0x6a953abf -> :sswitch_12
        0x6bb77c61 -> :sswitch_2
        0x6ddc937f -> :sswitch_9
        0x79898238 -> :sswitch_14
        0x7a91ddb5 -> :sswitch_d
    .end sparse-switch
.end method
