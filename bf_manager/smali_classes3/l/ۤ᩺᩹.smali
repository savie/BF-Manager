.class public final synthetic Ll/ۤ᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩸֫֨:[S


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

    sput-object v0, Ll/ۤ᩺᩹;->᩸֫֨:[S

    return-void

    :array_0
    .array-data 2
        0xf81s
        -0x474fs
        -0x4742s
        -0x474cs
        -0x475es
        -0x4741s
        -0x4747s
        -0x474cs
        -0x4702s
        -0x4747s
        -0x4742s
        -0x475cs
        -0x474bs
        -0x4742s
        -0x475cs
        -0x4702s
        -0x474fs
        -0x474ds
        -0x475cs
        -0x4747s
        -0x4741s
        -0x4742s
        -0x4702s
        -0x477as
        -0x4767s
        -0x476bs
        -0x4779s
        -0x474cs
        -0x474bs
        -0x4758s
        -0x476as
        -0x4747s
        -0x4744s
        -0x474bs
        -0x475ds
        -0x475es
        -0x474bs
        -0x475ds
        -0x4741s
        -0x475bs
        -0x475es
        -0x474ds
        -0x474bs
        -0x475ds
        -0x4702s
        -0x474fs
        -0x475es
        -0x475ds
        -0x474ds
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ۨۜ᩹;Ljava/lang/Class;Ll/ۖ۬᩹;)V
    .locals 6

    const v0, 0xa226e17

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x75a9

    const v5, 0x7412143f

    xor-int/2addr v4, v5

    const v5, 0x12b147ed

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5a77

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto/16 :goto_4

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v3, :cond_1

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_9

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۤ᩺᩹;->֡:Ljava/lang/Class;

    iput-object p4, p0, Ll/ۤ᩺᩹;->ܽ:Ll/ۖ۬᩹;

    return-void

    .line 1
    :sswitch_6
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u073f\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2075

    const v5, -0x2de04428

    xor-int/2addr v4, v5

    const v5, 0xa3466a0

    goto :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x288d

    const v5, 0x25630ce4

    xor-int/2addr v4, v5

    const v5, 0x7cef194a

    goto :goto_0

    :cond_2
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3913

    const v5, 0x626fd34

    xor-int/2addr v4, v5

    const v5, 0x19148e10

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06df\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5bc7

    const v5, -0x436ae8b2

    xor-int/2addr v4, v5

    const v5, 0x26e89da3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u05a1\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1957

    const v5, -0x5460bc22

    xor-int/2addr v4, v5

    const v5, 0x6fed1bde

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xde5

    const v5, 0x38efaccb

    xor-int/2addr v4, v5

    const v5, 0x5108707

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1a11

    const v5, -0x3688953

    xor-int/2addr v4, v5

    const v5, -0x6ab99cb1

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_7

    :goto_2
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61d1

    const v5, 0x301b7d1e

    xor-int/2addr v4, v5

    const v5, 0x396deba0

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe01

    const v5, -0x58027697

    xor-int/2addr v4, v5

    const v5, 0x4e3bd036    # 7.877462E8f

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u06e0\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5051

    const v5, -0x76ee4323

    xor-int/2addr v4, v5

    const v5, -0x3700bdf6

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4f89

    const v5, 0x7567822f

    xor-int/2addr v4, v5

    const v5, -0x40534f31

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e0d

    const v5, -0x559836b

    xor-int/2addr v4, v5

    const v5, 0x6ee8ed47

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ed1

    const v5, -0x2d822b07

    xor-int/2addr v4, v5

    const v5, -0x688509bc

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ۤ᩺᩹;->ܺ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۤ᩺᩹;->᩶:Ll/ۨۜ᩹;

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    :cond_b
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x712d

    const v5, 0x782c1524

    xor-int/2addr v4, v5

    const v5, -0x7dfd6956

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e6f

    const v5, 0x2ed90cab

    xor-int/2addr v4, v5

    const v5, 0x1708fb57

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dc57c6d -> :sswitch_9
        -0x7d8c3b07 -> :sswitch_e
        -0x7c26d502 -> :sswitch_6
        -0x75c3341a -> :sswitch_1
        -0x74ddfe53 -> :sswitch_d
        -0x73c3261c -> :sswitch_d
        -0x5c9a7f54 -> :sswitch_b
        -0x468554aa -> :sswitch_9
        -0x3e6016cd -> :sswitch_b
        -0x2b09b11a -> :sswitch_a
        -0x29df5536 -> :sswitch_0
        -0x2632a312 -> :sswitch_7
        -0x23cf5c86 -> :sswitch_2
        -0x1aeca19d -> :sswitch_a
        -0xbda9939 -> :sswitch_3
        -0x3e00b63 -> :sswitch_0
        0xd0f4bf -> :sswitch_5
        0x1de2303 -> :sswitch_e
        0xa11e919 -> :sswitch_2
        0x106bc62e -> :sswitch_c
        0x18cf3b21 -> :sswitch_1
        0x18ebd128 -> :sswitch_6
        0x195b4d7d -> :sswitch_5
        0x210f4d85 -> :sswitch_4
        0x234cc804 -> :sswitch_8
        0x35879156 -> :sswitch_7
        0x36a493c4 -> :sswitch_4
        0x42be77f3 -> :sswitch_c
        0x6bbd7fde -> :sswitch_3
        0x79a82b7a -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 25

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

    const v18, 0x7176954d

    sget v19, Ll/֨᩹;->᩻ᩳ֨:I

    sget v20, Ll/֫᩺;->᩺۟ۘ:I

    const-string v21, "\u06dc\u06e1"

    invoke-static/range {v21 .. v21}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, 0x544f

    const v23, 0x66d0f52d

    xor-int v1, v1, v23

    const v23, 0x9e677d

    xor-int v21, v21, v23

    move-object v3, v2

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v12, v17

    move/from16 v22, v21

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, 0x7176954d

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v13, v21, v20

    mul-int/lit16 v13, v13, -0x144f

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    .line 745
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v1, :cond_e

    goto/16 :goto_5

    .line 879
    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u05a1\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0xf

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, -0x50ef

    const v22, -0x54263997

    xor-int v13, v13, v22

    const v22, -0x170faf07

    goto/16 :goto_7

    .line 1088
    :sswitch_1
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v1, :cond_c

    goto/16 :goto_4

    .line 310
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_4

    .line 910
    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    return-void

    :sswitch_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 1241
    :sswitch_5
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ۙ()V

    .line 1242
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ܰ()Ll/᩷۠ۚ;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۘᩴܰ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۧ۬ۨ;->ۚ(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_6
    const/16 v1, 0x23

    const/16 v13, 0xe

    .line 1239
    invoke-static {v12, v1, v13, v14}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0x1115

    const v22, -0x76f801fd

    xor-int v13, v13, v22

    const v22, 0x74fd4f54

    goto/16 :goto_7

    :cond_1
    const-string v1, "\u06e8\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x79

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x1cdb

    const v22, 0x376354e4

    xor-int v13, v13, v22

    const v22, -0x7ad7f2d0

    goto/16 :goto_7

    .line 1238
    :sswitch_7
    invoke-static {v3, v5}, Ll/ۗܳ;->ܿۙۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۧۜ᩹;

    .line 1239
    invoke-virtual {v8}, Ll/ۧۜ᩹;->ۖ()Ljava/lang/String;

    move-result-object v9

    sget-object v12, Ll/ۤ᩺᩹;->᩸֫֨:[S

    .line 1083
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u0733\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x73

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x27af

    const v22, 0x58831b70

    xor-int v13, v13, v22

    const v22, 0x9dcf0af

    goto/16 :goto_7

    :sswitch_8
    const/16 v1, 0x7d0

    .line 216
    iget-object v2, v0, Ll/ۤ᩺᩹;->ܽ:Ll/ۖ۬᩹;

    invoke-static {v2, v1}, Ll/ۜᩳ᩹;->ۙ(Ll/ۖ۬᩹;I)V

    .line 1249
    invoke-static {v6}, Ll/ۖۧ;->ۗ᩵ܺ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v10}, Ll/֨᩺;->᩷ܽᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1247
    :sswitch_9
    invoke-virtual {v2}, Ll/ۧ۬ۨ;->ᩳ()[B

    move-result-object v1

    invoke-virtual {v10, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 1031
    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u1a7b\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x7f

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x4d79

    const v22, -0x31fdaee0

    xor-int v13, v13, v22

    const v22, 0x4bdf74cc    # 2.9288856E7f

    goto/16 :goto_7

    .line 1246
    :sswitch_a
    sget-object v1, Ll/ۤ᩺᩹;->᩸֫֨:[S

    const/16 v7, 0x1b

    const/16 v13, 0x8

    invoke-static {v1, v7, v13, v14}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 188
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u0736\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0xd

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x7149

    const v22, 0x3a9dbc9a

    xor-int v13, v13, v22

    const v22, 0x4fc0fb65

    goto/16 :goto_7

    .line 1245
    :sswitch_b
    invoke-static {v15, v4, v11, v14}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1246
    invoke-virtual {v10, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1051
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_5

    const-string v1, "\u0733\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0x5b9b

    const v22, 0x121bf2fc

    xor-int v13, v13, v22

    const v22, -0x599bdf07

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06e4\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x1eed

    const v22, -0x5ee2ca91

    xor-int v13, v13, v22

    const v22, 0x2b43004f

    goto/16 :goto_7

    .line 1245
    :sswitch_c
    sget-object v15, Ll/ۤ᩺᩹;->᩸֫֨:[S

    const/4 v4, 0x1

    const/16 v11, 0x1a

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x15f9

    const v22, 0x749ff284

    xor-int v13, v13, v22

    const v22, -0x707e3933

    goto/16 :goto_7

    .line 1244
    :sswitch_d
    new-instance v10, Landroid/content/Intent;

    iget-object v6, v0, Ll/ۤ᩺᩹;->᩶:Ll/ۨۜ᩹;

    invoke-static {v6}, Ll/֫ۚ;->ۗۚۧ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v13, v0, Ll/ۤ᩺᩹;->֡:Ljava/lang/Class;

    .line 1076
    sget v22, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v22, :cond_7

    goto/16 :goto_6

    .line 1244
    :cond_7
    invoke-direct {v10, v1, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1245
    invoke-static {v10, v1}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 102
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u1a77\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x59

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, -0x2af9

    const v22, -0x2d972200

    xor-int v13, v13, v22

    const v22, -0x29eff70c

    goto/16 :goto_7

    .line 1237
    :sswitch_e
    iget-object v3, v0, Ll/ۤ᩺᩹;->ܺ:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/֡֡;->ۢۡۜ(Ljava/lang/Object;)I

    move-result v1

    if-ge v5, v1, :cond_9

    const-string v1, "\u06e7\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x500d

    const v22, 0x67ee2873

    xor-int v13, v13, v22

    const v22, 0x606affa5

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u05a1\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x4425

    const v22, 0x238f97c3

    xor-int v13, v13, v22

    const v22, 0x3304cc65

    goto/16 :goto_7

    .line 1236
    :sswitch_f
    new-instance v1, Ll/ۧ۬ۨ;

    invoke-direct {v1}, Ll/ۧ۬ۨ;-><init>()V

    const/4 v2, 0x0

    move-object v2, v1

    const/4 v5, 0x0

    :goto_2
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x13

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0x1cad

    const v22, -0x5bb6a541

    xor-int v13, v13, v22

    const v22, 0x2bcd6324

    goto/16 :goto_7

    :sswitch_10
    const/16 v1, 0x2b8b

    const/16 v14, 0x2b8b

    goto :goto_3

    :sswitch_11
    const v1, 0xb8d0

    const v14, 0xb8d0

    :goto_3
    const-string v1, "\u05a8\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x1463

    const v22, 0x1d8147c0

    xor-int v13, v13, v22

    const v22, 0x2577563f

    goto/16 :goto_7

    :sswitch_12
    add-int v1, v23, v24

    mul-int v1, v1, v1

    sub-int v1, v18, v1

    if-lez v1, :cond_a

    const-string v1, "\u06e7\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0xa43

    const v22, -0x661f778a

    xor-int v13, v13, v22

    const v22, -0x6fc65c13

    goto/16 :goto_7

    :cond_a
    const-string v1, "\u1a79\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x47

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, -0x6745

    const v22, 0x16f9ce7a

    xor-int v13, v13, v22

    const v22, -0x12d052ec

    goto/16 :goto_7

    :sswitch_13
    add-int/lit8 v18, v17, 0x1

    const/16 v24, 0x1

    .line 886
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_b

    :goto_4
    const-string v1, "\u06eb\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x3d

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0x7aa1

    const v22, -0x71bc0fe4

    xor-int v13, v13, v22

    const v22, 0x5da023c4

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u1a79\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, -0x72fb

    const v22, 0x2a938cd6

    xor-int v13, v13, v22

    const v22, -0x9a5aaf8

    goto :goto_7

    :sswitch_14
    mul-int/lit8 v17, v23, 0x2

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u05a1\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, -0x3315

    const v22, 0x425fc54d

    xor-int v13, v13, v22

    const v22, -0x7a347f6f

    goto :goto_7

    :cond_d
    const-string v1, "\u0736\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v13, v1, v19

    mul-int/lit16 v13, v13, 0xeb3

    const v22, 0x5a47c250

    xor-int v13, v13, v22

    const v22, 0x5f561aaf

    goto :goto_7

    :sswitch_15
    sget-object v1, Ll/ۤ᩺᩹;->᩸֫֨:[S

    const/4 v13, 0x0

    aget-short v23, v1, v13

    .line 323
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_f

    :cond_e
    :goto_6
    const-string v1, "\u1a74\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x69

    xor-int v10, v1, v20

    mul-int/lit16 v10, v10, 0x2545

    const v13, -0x1d2f269d

    xor-int/2addr v10, v13

    const v13, 0x1b1a85b6

    xor-int v22, v1, v13

    move v1, v10

    const/4 v10, 0x0

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u05a8\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v13, v1, v20

    mul-int/lit16 v13, v13, 0x3ec7

    const v22, 0x17a10cd2

    xor-int v13, v13, v22

    const v22, 0x465c9e0a

    :goto_7
    xor-int v22, v1, v22

    move v1, v13

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fdb45bc -> :sswitch_9
        -0x728e0c99 -> :sswitch_0
        -0x721d5f31 -> :sswitch_c
        -0x62d42593 -> :sswitch_a
        -0x60aea5ec -> :sswitch_e
        -0x53cd93a0 -> :sswitch_f
        -0x53c31599 -> :sswitch_6
        -0x52f8a75d -> :sswitch_2
        -0x49e3313f -> :sswitch_1
        -0x44d3b4c4 -> :sswitch_10
        -0x43de2f5c -> :sswitch_6
        -0x40213cea -> :sswitch_c
        -0x3fd7fd96 -> :sswitch_11
        -0x325e62b7 -> :sswitch_12
        -0x2735bc60 -> :sswitch_4
        -0x239bef1c -> :sswitch_b
        -0x22b3a49a -> :sswitch_12
        -0x191d0e34 -> :sswitch_e
        -0x14a8bbbc -> :sswitch_10
        -0x1008a632 -> :sswitch_1
        -0xdaf4c0f -> :sswitch_2
        -0xd46967a -> :sswitch_13
        -0xd460bf8 -> :sswitch_5
        0x76c8b55 -> :sswitch_15
        0xebdc70b -> :sswitch_14
        0x17f189de -> :sswitch_7
        0x225b147a -> :sswitch_3
        0x28cd7ac0 -> :sswitch_13
        0x2b8b8905 -> :sswitch_15
        0x2bf9a390 -> :sswitch_8
        0x32ae90fc -> :sswitch_4
        0x33f69051 -> :sswitch_8
        0x360069a1 -> :sswitch_11
        0x3df3c9ac -> :sswitch_0
        0x449fffdb -> :sswitch_d
        0x461fadd8 -> :sswitch_9
        0x4e9b4da3 -> :sswitch_b
        0x52ec6603 -> :sswitch_f
        0x584cec63 -> :sswitch_7
        0x5cd85a36 -> :sswitch_a
        0x69da186b -> :sswitch_5
        0x6d496225 -> :sswitch_14
        0x7adbbe45 -> :sswitch_3
        0x7d20dbb7 -> :sswitch_d
    .end sparse-switch
.end method
