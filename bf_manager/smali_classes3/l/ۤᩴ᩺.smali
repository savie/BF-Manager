.class public final synthetic Ll/ۤᩴ᩺;
.super Ljava/lang/Object;
.source "T5M8"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۧۗ֨:[S


# instance fields
.field public final synthetic ֡:J

.field public final synthetic ܺ:Lorg/json/JSONObject;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x16

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤᩴ᩺;->ۧۗ֨:[S

    return-void

    :array_0
    .array-data 2
        0x980s
        -0x7d5fs
        -0x7d44s
        -0x7d56s
        -0x7d55s
        -0x7d44s
        -0x7d79s
        -0x7d56s
        -0x7d57s
        -0x7d55s
        -0x7d46s
        -0x7d63s
        -0x7d46s
        -0x7d44s
        -0x7d59s
        -0x7d60s
        -0x7d57s
        -0x7d1as
        -0x7d20s
        -0x7d20s
        -0x7d20s
        -0x7d19s
    .end array-data
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;J)V
    .locals 6

    const v0, 0x20aba1be

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x435d

    const v5, 0x7e664b53

    xor-int/2addr v4, v5

    const v5, -0x5be29ec3

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x20ad

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_4

    goto/16 :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-gez v3, :cond_b

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-gez v3, :cond_6

    goto/16 :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-wide p3, p0, Ll/ۤᩴ᩺;->֡:J

    return-void

    .line 1
    :sswitch_6
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a78\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x32f9

    const v5, 0x35065b8f

    xor-int/2addr v4, v5

    const v5, -0x58485aa2

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6207

    const v5, 0x7d8175c5

    xor-int/2addr v4, v5

    const v5, -0x34b00d78    # -1.362804E7f

    goto :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06ec\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x756f

    const v5, -0x6fefbfe7

    xor-int/2addr v4, v5

    const v5, 0x30cac0b3

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0733\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73ab

    const v5, -0xde09a9a

    xor-int/2addr v4, v5

    const v5, -0x2380a95

    goto/16 :goto_0

    :goto_1
    const-string v3, "\u06d9\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x45b9

    const v5, -0x6cce1b8

    xor-int/2addr v4, v5

    const v5, 0x3a67e96

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa27

    const v5, -0x5dbe910c

    xor-int/2addr v4, v5

    const v5, 0x26183f0b

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5667

    const v5, 0x695f84d9

    xor-int/2addr v4, v5

    const v5, -0x471413e9

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_7

    :cond_6
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x43f7

    const v5, 0x521e4a59

    xor-int/2addr v4, v5

    const v5, 0x63c08119

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d7\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6403

    const v5, -0x138b89ad

    xor-int/2addr v4, v5

    const v5, -0x1ca8535

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3947

    const v5, -0x7e3f5dee

    xor-int/2addr v4, v5

    const v5, -0x33e26ba9    # -4.1308508E7f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4151

    const v5, 0x481865f3

    xor-int/2addr v4, v5

    const v5, 0x2f75b70

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e8\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c7b

    const v5, -0x7ce9534b

    xor-int/2addr v4, v5

    const v5, 0x6074e88b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xed

    const v5, -0x12213e4

    xor-int/2addr v4, v5

    const v5, 0x602a530e

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۤᩴ᩺;->ܺ:Lorg/json/JSONObject;

    iput-object p2, p0, Ll/ۤᩴ᩺;->᩶:Ljava/lang/String;

    .line 4
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0730\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x77d7

    const v5, 0x5f020162

    xor-int/2addr v4, v5

    const v5, 0x63939d5d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0733\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3bab

    const v5, 0x9e46256

    xor-int/2addr v4, v5

    const v5, -0x577a3c9a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x727e547e -> :sswitch_8
        -0x6f87dfde -> :sswitch_1
        -0x6f1aee89 -> :sswitch_b
        -0x6a009507 -> :sswitch_5
        -0x5f90c971 -> :sswitch_d
        -0x57a9d685 -> :sswitch_a
        -0x561fc681 -> :sswitch_2
        -0x5600e70e -> :sswitch_4
        -0x42786a19 -> :sswitch_6
        -0x2b7d1547 -> :sswitch_4
        -0x280ddaa4 -> :sswitch_5
        -0x1962796a -> :sswitch_9
        -0xe649f09 -> :sswitch_e
        -0x80c808b -> :sswitch_3
        -0x6757fab -> :sswitch_8
        -0x58a7fab -> :sswitch_a
        0x7f4b661 -> :sswitch_d
        0x168e6bf5 -> :sswitch_7
        0x1ea0e9b0 -> :sswitch_6
        0x1fcc35f2 -> :sswitch_1
        0x2bba894f -> :sswitch_c
        0x4d5d4a4b -> :sswitch_3
        0x55c52d7d -> :sswitch_0
        0x5613051e -> :sswitch_9
        0x5f04ce54 -> :sswitch_2
        0x659bf3bf -> :sswitch_0
        0x66a9977d -> :sswitch_7
        0x6f262ab2 -> :sswitch_c
        0x72b11b41 -> :sswitch_b
        0x7d59c146 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 26

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

    const v18, -0x76a959b7    # -2.58375E-33f

    sget v19, Ll/ۗᩳ;->ۚۤ֡:I

    sget v20, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v21, "\u06e2\u06e7"

    invoke-static/range {v21 .. v21}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v21

    sub-int v21, v19, v21

    mul-int/lit8 v21, v21, 0x55

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x5461

    const v23, -0x280584e

    xor-int v1, v1, v23

    const v23, -0x38d5a6f8

    xor-int v21, v21, v23

    move-object/from16 v16, v4

    move-object v13, v12

    move-object v5, v15

    move/from16 v22, v21

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, -0x76a959b7    # -2.58375E-33f

    const/16 v23, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v9, v21, v20

    mul-int/lit16 v9, v9, -0x6211

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v22, v5

    goto/16 :goto_8

    :cond_1
    move-object/from16 v22, v5

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v1

    if-lez v1, :cond_0

    :goto_2
    move-object/from16 v22, v5

    goto/16 :goto_4

    .line 61
    :sswitch_1
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v22, v5

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto :goto_2

    .line 7
    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    return-void

    .line 66
    :sswitch_4
    invoke-static {v5, v6, v8, v12}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ll/֫ܽ;->ܺ᩵ۙ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    new-instance v1, Ljava/lang/Thread;

    .line 166
    sget v9, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v9, :cond_3

    goto :goto_1

    .line 187
    :cond_3
    new-instance v9, Ll/᩵ᩴ᩺;

    move-object/from16 v22, v5

    iget-object v5, v0, Ll/ۤᩴ᩺;->᩶:Ljava/lang/String;

    .line 55
    sget v24, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v24, :cond_4

    goto/16 :goto_9

    .line 187
    :cond_4
    iget-wide v2, v0, Ll/ۤᩴ᩺;->֡:J

    invoke-direct {v9, v5, v4, v2, v3}, Ll/᩵ᩴ᩺;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 167
    invoke-direct {v1, v9}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 187
    invoke-static {v1}, Ll/ۘۛ;->᩸֨ܰ(Ljava/lang/Object;)V

    return-void

    .line 66
    :sswitch_5
    invoke-static {v3, v2}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۤᩴ᩺;->ۧۗ֨:[S

    const/16 v6, 0x8

    const/16 v8, 0xe

    .line 64
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06df\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x2c97

    const v22, 0x48a67097

    xor-int v9, v9, v22

    const v22, -0x5775f443

    :goto_3
    xor-int v22, v1, v22

    move v1, v9

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v22, v5

    .line 66
    invoke-static {v13, v14, v15, v12}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Ll/ۤᩴ᩺;->ܺ:Lorg/json/JSONObject;

    .line 69
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06d9\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x2f

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0x6e0d

    const v9, 0x40a663b1

    xor-int/2addr v5, v9

    const v9, -0x1b279f16

    goto/16 :goto_a

    :sswitch_7
    move-object/from16 v22, v5

    const/4 v15, 0x7

    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x4783

    const v9, -0x783e1093

    xor-int/2addr v5, v9

    const v9, -0x525d5468

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v22, v5

    .line 66
    sget-object v1, Ll/᩶ᩴ᩺;->ۙ:Ll/ۡ᩺ۙ;

    sget-object v13, Ll/ۤᩴ᩺;->ۧۗ֨:[S

    const/4 v14, 0x1

    .line 43
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_8

    :goto_4
    const-string v1, "\u1a7b\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x9

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, 0x7a37

    const v9, -0xcde3f7f

    xor-int/2addr v5, v9

    const v9, -0x37ffaaec

    goto/16 :goto_a

    :cond_8
    const-string v1, "\u1a74\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x249b

    const v9, -0x5463f082

    xor-int/2addr v5, v9

    const v9, 0x59478c65

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v22, v5

    const/16 v1, 0x30a6

    const/16 v12, 0x30a6

    goto :goto_5

    :sswitch_a
    move-object/from16 v22, v5

    const v1, 0x82ce

    const v12, 0x82ce

    :goto_5
    const-string v1, "\u0733\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0x617

    const v9, -0x6fd81b1d

    xor-int/2addr v5, v9

    const v9, -0x50963795

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v22, v5

    add-int v1, v7, v11

    mul-int v1, v1, v1

    sub-int v1, v10, v1

    if-gez v1, :cond_9

    const-string v1, "\u06d8\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, 0x340b

    const v9, 0x25e54372

    xor-int/2addr v5, v9

    const v9, -0x3d502240

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u073f\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x67

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0xf8d

    const v9, -0x5387c183

    xor-int/2addr v5, v9

    const v9, -0x3fe0a076

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v22, v5

    add-int v1, v18, v23

    add-int v10, v1, v1

    const/16 v11, 0x33e9

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_a

    :goto_6
    const-string v1, "\u06ec\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x637d

    const v9, 0x1a2a5870

    xor-int/2addr v5, v9

    const v9, -0x7c3318ae

    goto/16 :goto_a

    :cond_a
    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x14db

    const v9, 0x2f421e7d

    xor-int/2addr v5, v9

    const v9, -0x44ba8ca

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v22, v5

    mul-int v18, v7, v7

    const v23, 0xa86aa11

    .line 86
    sget v1, Ll/֫;->ܶܺ᩻:I

    if-ltz v1, :cond_b

    move-object/from16 v5, v22

    :goto_7
    const-string v1, "\u05ab\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x6961

    const v22, -0x4e33b400

    xor-int v9, v9, v22

    const v22, -0x17eea6f6

    goto/16 :goto_3

    :cond_b
    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x65

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0x9d1

    const v9, 0x8cff0a0

    xor-int/2addr v5, v9

    const v9, 0x53477d4f

    goto :goto_a

    :sswitch_e
    move-object/from16 v22, v5

    aget-short v7, v16, v17

    .line 4
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_c

    :goto_8
    const-string v1, "\u06db\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0xfa1

    const v9, 0x77ec7b0f

    xor-int/2addr v5, v9

    const v9, 0x683e0f57

    goto :goto_a

    :cond_c
    const-string v1, "\u073f\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0x3671

    const v9, -0x1812c8f4

    xor-int/2addr v5, v9

    const v9, -0x48df78db

    goto :goto_a

    :sswitch_f
    move-object/from16 v22, v5

    sget-object v16, Ll/ۤᩴ᩺;->ۧۗ֨:[S

    const/16 v17, 0x0

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v1

    if-gtz v1, :cond_d

    :goto_9
    const-string v1, "\u06e7\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x13

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0xd81

    const v9, 0x6debeb4

    xor-int/2addr v5, v9

    const v9, -0xdd14f1c

    goto :goto_a

    :cond_d
    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x6a7b

    const v9, 0xa1bc749

    xor-int/2addr v5, v9

    const v9, 0x41969e4

    :goto_a
    xor-int/2addr v1, v9

    move-object/from16 v25, v22

    move/from16 v22, v1

    move v1, v5

    move-object/from16 v5, v25

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fde4737 -> :sswitch_2
        -0x7bf82979 -> :sswitch_b
        -0x77b10a4b -> :sswitch_0
        -0x737b0aed -> :sswitch_0
        -0x66d1d91b -> :sswitch_4
        -0x5e67d0f1 -> :sswitch_a
        -0x4ed28776 -> :sswitch_f
        -0x28c67308 -> :sswitch_4
        -0x19733263 -> :sswitch_5
        -0x9c1db3b -> :sswitch_1
        -0x9bdc102 -> :sswitch_7
        -0x5f2a8c2 -> :sswitch_c
        -0x3809885 -> :sswitch_2
        0x17fcfe2 -> :sswitch_6
        0xbe3faa1 -> :sswitch_1
        0xe987501 -> :sswitch_6
        0x205f28d2 -> :sswitch_e
        0x25916887 -> :sswitch_8
        0x26f7eacb -> :sswitch_7
        0x292091e6 -> :sswitch_d
        0x3169c073 -> :sswitch_8
        0x40cf9bf6 -> :sswitch_d
        0x4625ccf8 -> :sswitch_3
        0x4be3bf14 -> :sswitch_c
        0x4dfbc4fc -> :sswitch_b
        0x55996683 -> :sswitch_f
        0x57f0469c -> :sswitch_5
        0x5c2b7c7c -> :sswitch_a
        0x5caff724 -> :sswitch_9
        0x5fa80d77 -> :sswitch_9
        0x75d55024 -> :sswitch_3
        0x7baad2eb -> :sswitch_e
    .end sparse-switch
.end method
