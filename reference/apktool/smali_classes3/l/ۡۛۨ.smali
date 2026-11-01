.class public final Ll/ۡۛۨ;
.super Ljava/lang/Object;
.source "819S"


# static fields
.field private static final ᩳᩴ᩵:[S


# instance fields
.field public final ֨:I

.field public final ۖ:Ljava/math/BigInteger;

.field public final ۙ:Ljava/lang/String;

.field public final ۚ:Ljava/math/BigInteger;

.field public final ۨ:Ljava/lang/String;

.field public final ܰ:Ljava/lang/String;

.field public final ᩹:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    return-void

    :array_0
    .array-data 2
        0x73as
        -0x59des
        -0x59c3s
        -0x59dfs
        -0x59c3s
        -0x59d5s
        -0x59d9s
        -0x59dds
        -0x59c3s
        -0x59des
        -0x59dds
        -0x59dds
        -0x59d9s
        -0x59das
        -0x59c3s
        -0x59e0s
        -0x59c3s
        -0x59des
        -0x59c3s
        -0x59dcs
        -0x59des
        -0x59c3s
        -0x59e0s
        -0x59c3s
        -0x59des
        -0x59e0s
        -0x59dfs
        -0x59c3s
        -0x59dds
        -0x59c3s
        -0x59e0s
        -0x59d9s
        -0x59des
        -0x59c3s
        -0x59e0s
        -0x59c3s
        -0x59des
        -0x59e0s
        -0x59dfs
        -0x59c3s
        -0x59dds
        -0x59c3s
        -0x59e0s
        -0x59das
        -0x59bds
        -0x59c2s
        -0x59dfs
        -0x59das
        -0x59dbs
        -0x59bds
        -0x59c2s
        -0x59e0s
        -0x59d5s
        -0x59d9s
        -0x59bds
        -0x59c2s
        -0x59das
        -0x59dfs
        -0x59des
    .end array-data
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const v0, 0xc335a16

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    .line 586
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x156b

    const v5, -0x56ad4188

    xor-int/2addr v4, v5

    const v5, -0x25427153

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1f8f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 591
    iput-object p5, p0, Ll/ۡۛۨ;->ۖ:Ljava/math/BigInteger;

    .line 592
    iput-object p6, p0, Ll/ۡۛۨ;->ܰ:Ljava/lang/String;

    .line 593
    iput-object p7, p0, Ll/ۡۛۨ;->ۨ:Ljava/lang/String;

    return-void

    :sswitch_0
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 59
    :sswitch_1
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_4

    goto/16 :goto_2

    :sswitch_2
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_7

    goto/16 :goto_3

    .line 216
    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_3

    .line 222
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 590
    :sswitch_5
    iput-object p4, p0, Ll/ۡۛۨ;->ۚ:Ljava/math/BigInteger;

    .line 535
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a74\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf9d

    const v5, 0x5761b177

    xor-int/2addr v4, v5

    const v5, 0x53455a58

    goto :goto_0

    .line 589
    :sswitch_6
    iput p3, p0, Ll/ۡۛۨ;->᩹:I

    .line 201
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a79\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7d6d

    const v5, -0x1f4dc50f

    xor-int/2addr v4, v5

    const v5, -0x6536d99a

    goto :goto_0

    .line 96
    :sswitch_7
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a78\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x147

    const v5, 0x722e60ba

    xor-int/2addr v4, v5

    const v5, -0x1ee6d041

    goto/16 :goto_0

    .line 203
    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u05ab\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5931

    const v5, -0x2f94692d

    xor-int/2addr v4, v5

    const v5, -0x45444264

    goto/16 :goto_0

    .line 44
    :sswitch_9
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4db

    const v5, 0x6d633ef9

    xor-int/2addr v4, v5

    const v5, -0x11c8a329

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073f\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6cb9

    const v5, 0x7a6f5144

    xor-int/2addr v4, v5

    const v5, -0x44695337

    goto/16 :goto_0

    .line 540
    :sswitch_a
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06e8\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7bab

    const v5, -0x3af3eda9

    xor-int/2addr v4, v5

    const v5, 0x94501f3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06da\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x294d

    const v5, 0x2d761456

    xor-int/2addr v4, v5

    const v5, -0x5a311188

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x54c9

    const v5, 0x6b361765

    xor-int/2addr v4, v5

    const v5, -0x7e8f887f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_9

    :goto_3
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x79bb

    const v5, -0x3cfaf428

    xor-int/2addr v4, v5

    const v5, -0x228a6c0e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7a\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c2d

    const v5, 0x383fa7aa

    xor-int/2addr v4, v5

    const v5, -0x171c3c8

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_a

    :goto_4
    const-string v3, "\u06eb\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x607

    const v5, 0x3098c0d

    xor-int/2addr v4, v5

    const v5, -0x6aaeac4f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5d1d

    const v5, -0x6a4c7c12

    xor-int/2addr v4, v5

    const v5, 0x2cc816e4

    goto/16 :goto_0

    .line 587
    :sswitch_e
    iput p1, p0, Ll/ۡۛۨ;->֨:I

    .line 588
    iput-object p2, p0, Ll/ۡۛۨ;->ۙ:Ljava/lang/String;

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d6\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5dab

    const v5, -0x6a69d8df

    xor-int/2addr v4, v5

    const v5, 0x7f6b5270

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x563b

    const v5, -0x3f997260

    xor-int/2addr v4, v5

    const v5, 0x673b4c28

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d1b9bec -> :sswitch_4
        -0x7144ea7f -> :sswitch_e
        -0x6fae5151 -> :sswitch_6
        -0x6404be89 -> :sswitch_4
        -0x4a2d6a27 -> :sswitch_3
        -0x467ba8d2 -> :sswitch_b
        -0x38abc126 -> :sswitch_0
        -0x375d950f -> :sswitch_a
        -0x2c892e8b -> :sswitch_a
        -0x1a59350e -> :sswitch_1
        -0x12a831c9 -> :sswitch_5
        -0x7845572 -> :sswitch_d
        -0x7185b61 -> :sswitch_2
        -0x20acaa7 -> :sswitch_d
        0x75e67 -> :sswitch_5
        0x5954071 -> :sswitch_c
        0x11fc0f51 -> :sswitch_2
        0x1536d7af -> :sswitch_0
        0x18d5c1db -> :sswitch_7
        0x215b091f -> :sswitch_8
        0x25cbaff5 -> :sswitch_e
        0x266969f6 -> :sswitch_3
        0x34b8ece5 -> :sswitch_8
        0x35a3a480 -> :sswitch_6
        0x48a19b2d -> :sswitch_1
        0x5503be9b -> :sswitch_c
        0x5746ef2b -> :sswitch_9
        0x5b404173 -> :sswitch_9
        0x64403152 -> :sswitch_b
        0x6e61c353 -> :sswitch_7
    .end sparse-switch
.end method

.method public static ۙ(Ljava/security/PublicKey;)Ll/ۡۛۨ;
    .locals 32

    move-object/from16 v0, p0

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

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v18, 0x3aceb4fc

    sget v19, Ll/ۖۗ;->᩶۫ۗ:I

    sget v20, Ll/֨ۧ;->֫۠֡:I

    const-string v21, "\u1a77\u06d8"

    invoke-static/range {v21 .. v21}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v20

    mul-int/lit8 v21, v21, -0x67

    xor-int v1, v21, v19

    mul-int/lit16 v1, v1, -0x19e3

    const v23, 0xb2ecbe0

    xor-int v1, v1, v23

    const v23, -0x109a8de7    # -7.1010003E28f

    xor-int v21, v21, v23

    move-object/from16 v17, v5

    move-object/from16 v23, v11

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v22, 0x0

    :goto_0
    xor-int v11, v18, v19

    mul-int/lit16 v11, v11, -0x3a73

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v18, v21, v1

    sparse-switch v18, :sswitch_data_0

    .line 161
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_0

    goto/16 :goto_f

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_7

    goto/16 :goto_f

    :cond_0
    const-string v1, "\u1a7b\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x1b95

    const v21, -0x33e5af5c    # -4.045275E7f

    xor-int v11, v11, v21

    const v21, -0x3367e07b    # -7.975633E7f

    goto/16 :goto_d

    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v1, :cond_1

    goto/16 :goto_e

    :cond_1
    const-string v1, "\u1a73\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x5f

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x2bdb

    const v21, 0x3f05a90f

    xor-int v11, v11, v21

    const v21, -0x57b40b04

    goto/16 :goto_d

    .line 105
    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v1, :cond_11

    goto/16 :goto_e

    :sswitch_3
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_1b

    goto :goto_1

    .line 588
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_a

    :cond_2
    :goto_1
    const-string v1, "\u0730\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x28b

    const v21, 0x46b81063

    xor-int v11, v11, v21

    const v21, 0x6c2ad1b8

    goto/16 :goto_d

    :sswitch_5
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_f

    .line 654
    :sswitch_6
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_19

    goto/16 :goto_f

    :sswitch_7
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_f

    :sswitch_8
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    const/4 v0, 0x0

    return-object v0

    .line 766
    :sswitch_9
    :try_start_0
    move-object v1, v7

    check-cast v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v1

    goto/16 :goto_7

    :sswitch_a
    if-eqz v6, :cond_9

    const-string v1, "\u1a7a\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x5c87

    const v21, -0x1fc6f0ba

    xor-int v11, v11, v21

    const v21, 0x5d2e895f

    goto/16 :goto_d

    .line 612
    :sswitch_b
    new-instance v1, Ll/ۡۛۨ;

    invoke-interface/range {p0 .. p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v12

    if-nez v8, :cond_3

    goto/16 :goto_5

    .line 782
    :cond_3
    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_c
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/16 v2, 0x20

    const/16 v3, 0xc

    invoke-static {v0, v2, v3, v5}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/16 v22, 0x2

    goto :goto_3

    :sswitch_d
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/16 v2, 0x14

    const/16 v3, 0xc

    invoke-static {v0, v2, v3, v5}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    const/16 v22, 0x1

    goto :goto_3

    :sswitch_e
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/4 v2, 0x1

    const/16 v3, 0x13

    invoke-static {v0, v2, v3, v5}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :goto_2
    const/16 v22, -0x1

    :cond_6
    :goto_3
    packed-switch v22, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/16 v2, 0x36

    const/4 v3, 0x5

    invoke-static {v0, v2, v3, v5}, Ll/֫۟;->ۤۛᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :pswitch_1
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/16 v2, 0x31

    const/4 v3, 0x5

    invoke-static {v0, v2, v3, v5}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :pswitch_2
    sget-object v0, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/16 v2, 0x2c

    const/4 v3, 0x5

    invoke-static {v0, v2, v3, v5}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_4
    move-object v5, v0

    move-object/from16 v16, v5

    goto :goto_6

    :goto_5
    move-object/from16 v16, v17

    :goto_6
    const/4 v11, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v1

    move-object/from16 v17, v8

    .line 613
    invoke-direct/range {v10 .. v17}, Ll/ۡۛۨ;-><init>(ILjava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 763
    :sswitch_f
    :try_start_1
    invoke-static {v4}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v1

    .line 764
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v7

    .line 765
    instance-of v6, v7, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v1, "\u06ec\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x9ef

    const v21, 0x6eb15be0

    xor-int v11, v11, v21

    const v21, -0x3784b385

    goto/16 :goto_d

    .line 618
    :sswitch_10
    new-instance v1, Ll/ۡۛۨ;

    invoke-interface/range {p0 .. p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v11

    const/16 v21, 0x0

    const/16 v24, 0x0

    sget v25, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v25, :cond_8

    :cond_7
    const-string v1, "\u06eb\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x57

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x6e1

    const v21, -0xbf7fa74

    xor-int v11, v11, v21

    const v21, 0x4ba8a2a0    # 2.210336E7f

    goto/16 :goto_d

    :cond_8
    const/4 v7, 0x3

    const/4 v10, 0x0

    const/4 v0, 0x0

    move-object v6, v1

    move-object v8, v11

    move-object v11, v0

    move-object/from16 v12, v21

    move-object/from16 v13, v24

    invoke-direct/range {v6 .. v13}, Ll/ۡۛۨ;-><init>(ILjava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 758
    :sswitch_11
    invoke-interface/range {p0 .. p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v4

    const/16 v17, 0x0

    if-nez v4, :cond_a

    :catch_0
    :cond_9
    move-object/from16 v8, v17

    :goto_7
    const-string v1, "\u1a75\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x4015

    const v21, 0x47fef4b6

    xor-int v11, v11, v21

    const v21, 0x2199e232

    goto/16 :goto_d

    :cond_a
    const-string v1, "\u06dc\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x1fc9

    const v21, 0x46c39143

    xor-int v11, v11, v21

    const v21, 0x24afbedc

    goto/16 :goto_d

    :sswitch_12
    const/4 v1, 0x0

    const/4 v9, 0x0

    goto :goto_8

    .line 617
    :sswitch_13
    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getP()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    move v9, v1

    :goto_8
    const-string v1, "\u06e0\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x2f

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x27c3

    const v21, -0x39ac6cf4

    xor-int v11, v11, v21

    const v21, -0xa1a6f2a

    goto/16 :goto_d

    :sswitch_14
    const/4 v1, 0x0

    const/4 v13, 0x0

    goto :goto_9

    .line 610
    :sswitch_15
    invoke-interface {v2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v1

    move v13, v1

    :goto_9
    const-string v1, "\u06e2\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x4f8b

    const v21, 0x1350b240

    xor-int v11, v11, v21

    const v21, -0x664a1167

    goto/16 :goto_d

    .line 616
    :sswitch_16
    move-object v1, v0

    check-cast v1, Ljava/security/interfaces/DSAPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/DSAKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v3

    if-nez v3, :cond_b

    const-string v1, "\u05a8\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x3f

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x38b3

    const v21, 0x202ceb7e

    xor-int v11, v11, v21

    const v21, -0x19267624

    goto/16 :goto_d

    :cond_b
    const-string v1, "\u06da\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x59

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x6577

    const v21, 0x2061e007

    xor-int v11, v11, v21

    const v21, 0x1cc5aa8d

    goto/16 :goto_d

    .line 621
    :sswitch_17
    new-instance v1, Ll/ۡۛۨ;

    invoke-interface/range {p0 .. p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v26

    const/16 v30, 0x0

    .line 764
    sget-boolean v11, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v11, :cond_d

    :cond_c
    :goto_a
    const-string v1, "\u06df\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x26c7

    const v21, 0x4fe5adb6

    xor-int v11, v11, v21

    const v21, 0x635be7c9

    goto/16 :goto_d

    :cond_d
    const/16 v31, 0x0

    const/16 v25, 0x0

    .line 28
    sget v11, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v11, :cond_e

    goto/16 :goto_f

    :cond_e
    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v24, v1

    .line 621
    invoke-direct/range {v24 .. v31}, Ll/ۡۛۨ;-><init>(ILjava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 607
    :sswitch_18
    move-object v2, v0

    check-cast v2, Ljava/security/interfaces/ECPublicKey;

    .line 608
    invoke-interface {v2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    if-nez v1, :cond_f

    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x27

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x47ed

    const v21, -0x79f5a42d

    xor-int v11, v11, v21

    const v21, -0x452f28b6

    goto/16 :goto_d

    :cond_f
    const-string v1, "\u1a79\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x4897

    const v21, -0x61bd3e38

    xor-int v11, v11, v21

    const v21, 0x40ed9bdb

    goto/16 :goto_d

    .line 615
    :sswitch_19
    instance-of v1, v0, Ljava/security/interfaces/DSAPublicKey;

    if-eqz v1, :cond_10

    const-string v1, "\u06db\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x7901

    const v21, 0xe782c92

    xor-int v11, v11, v21

    const v21, -0x4fe21591

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u0736\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x22dd

    const v21, 0x46c8e103

    xor-int v11, v11, v21

    const v21, -0x59d75562

    goto/16 :goto_d

    .line 601
    :sswitch_1a
    move-object v1, v0

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    .line 602
    new-instance v11, Ll/ۡۛۨ;

    invoke-interface/range {p0 .. p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v26

    .line 759
    sget v21, Ll/ۗ;->֨۬ۖ:I

    if-ltz v21, :cond_12

    :cond_11
    const-string v1, "\u06d9\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x1f

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x378b

    const v21, 0xe043827

    xor-int v11, v11, v21

    const v21, -0x8c978ce

    goto/16 :goto_d

    .line 603
    :cond_12
    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v21

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v24

    if-eqz v24, :cond_13

    goto/16 :goto_f

    :cond_13
    invoke-virtual/range {v21 .. v21}, Ljava/math/BigInteger;->bitLength()I

    move-result v27

    invoke-interface {v1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v28

    sget v21, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v21, :cond_14

    goto :goto_b

    .line 604
    :cond_14
    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    .line 3
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_15

    :goto_b
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x3885

    const v21, 0x6517114

    xor-int v11, v11, v21

    const v21, 0x3ccf0ec

    goto/16 :goto_d

    :cond_15
    const/16 v25, 0x1

    move-object/from16 v24, v11

    .line 604
    invoke-direct/range {v24 .. v31}, Ll/ۡۛۨ;-><init>(ILjava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;)V

    return-object v11

    .line 606
    :sswitch_1b
    instance-of v1, v0, Ljava/security/interfaces/ECPublicKey;

    const/16 v22, 0x0

    if-eqz v1, :cond_16

    const-string v1, "\u06e0\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x5d

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x4011

    const v21, 0x3968006c

    xor-int v11, v11, v21

    const v21, 0x7c20ef1d

    goto/16 :goto_d

    :cond_16
    const-string v1, "\u1a77\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x3d

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x577b

    const v21, 0x6ec708d9

    xor-int v11, v11, v21

    const v21, 0x5e2c70ea

    goto :goto_d

    .line 600
    :sswitch_1c
    instance-of v1, v0, Ljava/security/interfaces/RSAPublicKey;

    if-eqz v1, :cond_17

    const-string v1, "\u06d6\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x63b

    const v21, -0x53764ed8

    xor-int v11, v11, v21

    const v21, -0x78ecaeb2

    goto :goto_d

    :cond_17
    const-string v1, "\u0733\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x4151

    const v21, 0x1fbf3bdb

    xor-int v11, v11, v21

    const v21, 0x1b105e98

    goto :goto_d

    :sswitch_1d
    const v1, 0xbb20

    const v5, 0xbb20

    goto :goto_c

    :sswitch_1e
    const v1, 0xa613

    const v5, 0xa613

    :goto_c
    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x7b9b

    const v21, -0x7631639d

    xor-int v11, v11, v21

    const v21, 0x6e9e87e4

    goto :goto_d

    :sswitch_1f
    mul-int v1, v16, v16

    sub-int v1, v15, v1

    if-gtz v1, :cond_18

    const-string v1, "\u06d9\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x5deb

    const v21, 0x52e98d40

    xor-int v11, v11, v21

    const v21, 0x1ccecd6e

    :goto_d
    xor-int v21, v1, v21

    move v1, v11

    goto/16 :goto_0

    :cond_18
    const-string v1, "\u05a8\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x5f29

    const v21, 0x7304824c

    xor-int v11, v11, v21

    const v21, -0x2f284873

    goto :goto_d

    :sswitch_20
    mul-int v15, v10, v14

    add-int/lit16 v1, v10, 0x3133

    .line 551
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v11

    if-nez v11, :cond_1a

    move/from16 v16, v1

    :cond_19
    :goto_e
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x1b

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x3c5

    const v21, 0x579d4dc3

    xor-int v11, v11, v21

    const v21, -0x77d143d2

    goto :goto_d

    :cond_1a
    const-string v11, "\u06d6\u1a78"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v20, v11

    mul-int/lit8 v11, v11, -0x63

    xor-int v0, v11, v19

    mul-int/lit16 v0, v0, 0x2fc5

    const v16, -0x18db12

    xor-int v0, v0, v16

    const v16, -0x72dd3740

    xor-int v21, v11, v16

    move/from16 v16, v1

    move v1, v0

    goto :goto_11

    :sswitch_21
    aget-short v10, v23, v12

    const v14, 0xc4cc

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_1c

    :cond_1b
    const-string v0, "\u05a1\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x39

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x6369

    const v11, -0x483f4511

    xor-int/2addr v1, v11

    const v11, -0x2347360

    goto :goto_10

    :cond_1c
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x18c7

    const v11, -0x66530722

    xor-int/2addr v1, v11

    const v11, 0x390dcfb7

    goto :goto_10

    :sswitch_22
    sget-object v23, Ll/ۡۛۨ;->ᩳᩴ᩵:[S

    const/4 v12, 0x0

    .line 95
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_1d

    :goto_f
    const-string v0, "\u05a1\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x23

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x1667

    const v11, -0x69dc380f

    xor-int/2addr v1, v11

    const v11, 0x4863d7ec

    goto :goto_10

    :cond_1d
    const-string v0, "\u06eb\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x3cdf

    const v11, 0x161862e2

    xor-int/2addr v1, v11

    const v11, -0x2d0f984e

    :goto_10
    xor-int v21, v0, v11

    :goto_11
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f8c5310 -> :sswitch_5
        -0x7f720e9d -> :sswitch_15
        -0x79d22553 -> :sswitch_1b
        -0x73ff0e20 -> :sswitch_1e
        -0x6a4ddad3 -> :sswitch_2
        -0x62b11c6b -> :sswitch_9
        -0x61f80242 -> :sswitch_7
        -0x61b7fcc8 -> :sswitch_17
        -0x5efeabcf -> :sswitch_18
        -0x59282fc0 -> :sswitch_3
        -0x56410f72 -> :sswitch_20
        -0x52384782 -> :sswitch_a
        -0x5102f2f8 -> :sswitch_1c
        -0x4bd5402f -> :sswitch_6
        -0x4a94d729 -> :sswitch_1d
        -0x427584a8 -> :sswitch_13
        -0x41191780 -> :sswitch_12
        -0x3c6b993e -> :sswitch_17
        -0x367b2b2b -> :sswitch_1a
        -0x32c36056 -> :sswitch_7
        -0x283f4d6a -> :sswitch_4
        -0x2792a32b -> :sswitch_13
        -0x248c1602 -> :sswitch_1b
        -0x1e060208 -> :sswitch_b
        -0x1dfe8851 -> :sswitch_9
        -0x1d505cc6 -> :sswitch_1a
        -0xebe723e -> :sswitch_b
        -0x3f6e432 -> :sswitch_11
        -0x8522f2 -> :sswitch_22
        0x3e0e477 -> :sswitch_1
        0x4bd2416 -> :sswitch_11
        0x5cbe55f -> :sswitch_8
        0x9960191 -> :sswitch_5
        0xcf801b1 -> :sswitch_1
        0x1293eacb -> :sswitch_21
        0x133123de -> :sswitch_21
        0x1804b576 -> :sswitch_22
        0x1fe06c91 -> :sswitch_4
        0x245c6908 -> :sswitch_12
        0x25bae29c -> :sswitch_1f
        0x2930fc6d -> :sswitch_15
        0x2a3bdd93 -> :sswitch_16
        0x2e35b390 -> :sswitch_19
        0x2f79ed4d -> :sswitch_1f
        0x393b1b21 -> :sswitch_1c
        0x3acb0ac3 -> :sswitch_14
        0x411378af -> :sswitch_f
        0x480ae110 -> :sswitch_f
        0x49941145 -> :sswitch_8
        0x4c4702c8 -> :sswitch_1e
        0x4c7b80a8 -> :sswitch_2
        0x4cf5aa20 -> :sswitch_10
        0x5809e13e -> :sswitch_10
        0x58321be6 -> :sswitch_1d
        0x583a64d8 -> :sswitch_3
        0x5cb2a981 -> :sswitch_20
        0x5d909402 -> :sswitch_14
        0x60b76388 -> :sswitch_19
        0x66700586 -> :sswitch_0
        0x67f6ab48 -> :sswitch_18
        0x707e55ff -> :sswitch_16
        0x78ba5b21 -> :sswitch_6
        0x79303a0b -> :sswitch_0
        0x7beac468 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x15ea9450 -> :sswitch_e
        0x4ceeb2f5 -> :sswitch_d
        0x4ceeb2f6 -> :sswitch_c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
