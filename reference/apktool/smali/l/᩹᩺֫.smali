.class public final Ll/᩹᩺֫;
.super Ll/֫᩺֫;
.source "R3YJ"


# static fields
.field private static final ܳܰۗ:[S


# instance fields
.field public final synthetic ۙ:Ll/᩵᩺֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹᩺֫;->ܳܰۗ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x724s
        0x1e81s
        0x1ec2s
        0x1edbs
        0x1ec3s
    .end array-data
.end method

.method public constructor <init>(Ll/᩵᩺֫;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/᩹᩺֫;->ۙ:Ll/᩵᩺֫;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 20

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x698accd0

    sget v13, Ll/ۘܽ;->᩹ۧۚ:I

    sget v14, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v15, "\u06d6\u06df"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x4b7f

    const v17, 0x74f2e672

    xor-int v0, v0, v17

    const v17, 0x443c4efd

    xor-int v15, v15, v17

    move-object v4, v3

    move-object v12, v11

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v15, 0x698accd0

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x2697

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v16, v2

    const v0, 0xbcfd

    const v11, 0xbcfd

    goto/16 :goto_4

    .line 68
    :sswitch_0
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v0, :cond_0

    :goto_1
    move-object/from16 v16, v2

    goto/16 :goto_6

    :cond_0
    :goto_2
    move-object/from16 v0, p1

    move-object/from16 v16, v2

    goto :goto_3

    :sswitch_1
    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_1

    goto/16 :goto_8

    :cond_1
    move-object/from16 v16, v2

    goto/16 :goto_7

    :sswitch_2
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto :goto_1

    .line 6
    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    const/4 v0, 0x0

    return-object v0

    .line 80
    :sswitch_5
    invoke-static {v1, v3}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗ᩺֫;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :sswitch_6
    const/4 v0, 0x1

    const/4 v3, 0x4

    invoke-static {v12, v0, v3, v11}, Ll/ۖ᩹;->ᩳۨ֨([SIII)Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v0

    if-ltz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "\u073d\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move-object/from16 v16, v2

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x535b

    const v18, -0xa860c18

    xor-int v2, v2, v18

    const v18, -0x89fcc1d

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v0, p1

    move-object/from16 v16, v2

    .line 80
    invoke-static {v1, v0}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v12, Ll/᩹᩺֫;->ܳܰۗ:[S

    .line 69
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v2

    if-eqz v2, :cond_3

    :goto_3
    const-string v2, "\u1a78\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v0, v2, v13

    mul-int/lit16 v0, v0, -0x5d63

    const v18, -0x359c9322

    xor-int v0, v0, v18

    const v18, -0x3fc42258

    xor-int v2, v2, v18

    move-object/from16 v19, v16

    move/from16 v16, v2

    goto/16 :goto_a

    :cond_3
    const-string v0, "\u06e4\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x26cb

    const v18, 0x256abeda

    xor-int v2, v2, v18

    const v18, 0x40854ecd

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v0, p0

    .line 80
    iget-object v1, v0, Ll/᩹᩺֫;->ۙ:Ll/᩵᩺֫;

    invoke-static {v1}, Ll/᩵᩺֫;->ۙ(Ll/᩵᩺֫;)Ll/ۗ᩺֫;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    sget v16, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v16, :cond_4

    goto/16 :goto_8

    .line 80
    :cond_4
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    sget v16, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v16, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v16, "\u06df\u0736"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v13

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0xfdd

    const v18, -0x3254145e

    xor-int v0, v0, v18

    const v18, -0xd295c0

    xor-int v16, v16, v18

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v16, v2

    const/16 v0, 0x1eaf

    const/16 v11, 0x1eaf

    :goto_4
    const-string v0, "\u0730\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x19

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x53f

    const v18, -0x674fa810

    xor-int v2, v2, v18

    const v18, -0x6b76eb29

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v16, v2

    add-int v0, v6, v10

    mul-int v0, v0, v0

    sub-int/2addr v0, v9

    if-gtz v0, :cond_6

    const-string v0, "\u06df\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x4f

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0xe3

    const v18, 0x28b0de33

    xor-int v2, v2, v18

    const v18, 0x4e9b7268

    goto/16 :goto_9

    :cond_6
    const-string v0, "\u1a76\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x3457

    const v18, -0x233d8d7

    xor-int v2, v2, v18

    const v18, 0x3ccd3371

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v16, v2

    add-int v0, v7, v8

    add-int v9, v0, v0

    const/16 v10, 0xa3c

    .line 77
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "\u06eb\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x770d

    const v18, 0x701dab1e

    xor-int v2, v2, v18

    const v18, -0x2c09eb2c

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v16, v2

    const v8, 0x68be10

    .line 33
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v0

    if-gtz v0, :cond_8

    :goto_5
    const-string v0, "\u1a75\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x56b7

    const v18, -0x32d12d4

    xor-int v2, v2, v18

    const v18, -0x213bc764

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x4f

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x3053

    const v18, 0x2a5c3f22

    xor-int v2, v2, v18

    const v18, -0x4f834d02

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v16, v2

    aget-short v6, v4, v5

    mul-int v7, v6, v6

    .line 70
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_9

    goto :goto_7

    :cond_9
    const-string v0, "\u06e0\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x34c1

    const v18, -0x7691caab

    xor-int v2, v2, v18

    const v18, 0x6993e448

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v16, v2

    const/4 v5, 0x0

    .line 28
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_a

    :goto_6
    const-string v0, "\u1a77\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x3555

    const v18, -0x401c45b2

    xor-int v2, v2, v18

    const v18, 0x60993322

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u1a74\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x7047

    const v18, 0x26a5efaf

    xor-int v2, v2, v18

    const v18, -0x2f115b4d

    goto :goto_9

    :sswitch_f
    move-object/from16 v16, v2

    sget-object v4, Ll/᩹᩺֫;->ܳܰۗ:[S

    .line 42
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v0

    if-nez v0, :cond_b

    :goto_7
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x35

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x70fd

    const v18, -0x47beb902

    xor-int v2, v2, v18

    const v18, -0x6ee015d4

    goto :goto_9

    :cond_b
    const-string v0, "\u1a78\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x5d29

    const v18, 0x8085c3a

    xor-int v2, v2, v18

    const v18, -0x57959e6b

    goto :goto_9

    :sswitch_10
    move-object/from16 v16, v2

    .line 61
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v2, v16

    :cond_c
    :goto_8
    const-string v0, "\u06eb\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x24c3

    const v16, 0x25d831c8

    xor-int v1, v1, v16

    const v16, -0x7a99dc3e

    xor-int v16, v0, v16

    move v0, v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u1a76\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x73

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x5467

    const v18, -0x8dbea92

    xor-int v2, v2, v18

    const v18, -0x655bc6dc

    :goto_9
    xor-int v0, v0, v18

    move-object/from16 v19, v16

    move/from16 v16, v0

    move v0, v2

    :goto_a
    move-object/from16 v2, v19

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73351b4d -> :sswitch_e
        -0x723e7cae -> :sswitch_8
        -0x69d66b6a -> :sswitch_7
        -0x672d0cf3 -> :sswitch_c
        -0x5e976918 -> :sswitch_2
        -0x4d028666 -> :sswitch_10
        -0x4cdb2c09 -> :sswitch_a
        -0x43fc19a5 -> :sswitch_1
        -0x3e27e02e -> :sswitch_8
        -0x3944d8df -> :sswitch_d
        -0x2ba3625c -> :sswitch_10
        -0x2b60126c -> :sswitch_b
        -0x2471f69e -> :sswitch_7
        -0x1c84f6f4 -> :sswitch_0
        -0x19ff95c5 -> :sswitch_6
        -0xf058baa -> :sswitch_4
        -0x59b41a6 -> :sswitch_0
        -0x298d47c -> :sswitch_9
        -0x154961e -> :sswitch_5
        0x43dac -> :sswitch_b
        0x462b3ab -> :sswitch_a
        0x7081a6f -> :sswitch_2
        0x2d0a9de6 -> :sswitch_3
        0x396eabf2 -> :sswitch_c
        0x3c847e90 -> :sswitch_9
        0x408d9665 -> :sswitch_d
        0x4604946d -> :sswitch_f
        0x4798bcd3 -> :sswitch_4
        0x5058efff -> :sswitch_1
        0x5f3f93cd -> :sswitch_3
        0x61361faf -> :sswitch_e
        0x64262d50 -> :sswitch_6
        0x6700c0ad -> :sswitch_5
        0x7a621207 -> :sswitch_f
    .end sparse-switch
.end method
