.class public final Ll/᩸۠֫;
.super Ll/ۖ֨ܺ;
.source "UAQE"


# static fields
.field private static final ܿۡۧ:[S


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ۤ:J

.field public final ᩷:Ljava/io/InputStream;

.field public final ᩸:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸۠֫;->ܿۡۧ:[S

    return-void

    :array_0
    .array-data 2
        0x1454s
        0x506s
        0x501s
        0x51as
        0x548s
        0x51as
        0x500s
        0x548s
        0x51fs
        0x516s
        0x51ds
        0x514s
        0x507s
        0x51bs
        0x548s
        0x510s
        0x512s
        0x51ds
        0x517s
        0x51as
        0x517s
        0x512s
        0x507s
        0x516s
        0x523s
        0x512s
        0x507s
        0x51bs
        0x548s
        0x528s
        0x52es
        0x54es
        0x55fs
        0x553s
    .end array-data
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/io/InputStream;JLjava/lang/String;)V
    .locals 0

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    iput-object p2, p0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    iput-wide p3, p0, Ll/᩸۠֫;->ۤ:J

    iput-object p5, p0, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸۠֫;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩸۠֫;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, -0x3cf0fe12

    sget v4, Ll/֫֡;->֫ۙۖ:I

    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v6, "\u06db\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x75b

    const v8, -0x1b1eb729

    xor-int/2addr v7, v8

    const v8, 0x2b48f952

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x276f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 90
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_2

    .line 169
    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v6, :cond_4

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget-boolean v6, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v6, :cond_c

    goto/16 :goto_1

    .line 10
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v6

    if-ltz v6, :cond_2

    goto/16 :goto_2

    .line 94
    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    .line 214
    :sswitch_5
    iget-object v6, p0, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    iget-object v7, v0, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ۘ۟;->ۗۖ֡(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u06df\u1a75"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x78d9

    const v8, 0x3f5bf376

    xor-int/2addr v7, v8

    const v8, 0x3c80176b

    goto :goto_0

    :sswitch_6
    iget-object v6, p0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    iget-object v7, v0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    invoke-static {v6, v7}, Ll/ۘ۟;->ۗۖ֡(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u0736\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2099

    const v8, 0x2e447f8d

    xor-int/2addr v7, v8

    const v8, 0x65efd35c

    goto :goto_0

    :sswitch_7
    iget-object v6, p0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    iget-object v7, v0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    invoke-static {v6, v7}, Ll/֫ۢ;->᩷۠ܳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u0736\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x1b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6d9b

    const v8, 0x5730f82e

    xor-int/2addr v7, v8

    const v8, 0x646c75fe

    goto/16 :goto_0

    :sswitch_8
    iget-wide v6, v0, Ll/᩸۠֫;->ۤ:J

    cmp-long v8, v1, v6

    if-nez v8, :cond_1

    const-string v6, "\u0736\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b41

    const v8, 0x6eb3090e

    xor-int/2addr v7, v8

    const v8, 0x735c6f1c

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/᩸۠֫;

    iget-wide v1, p0, Ll/᩸۠֫;->ۤ:J

    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u1a78\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7a13

    const v8, -0x70c50761

    xor-int/2addr v7, v8

    const v8, 0x57af323e

    goto/16 :goto_0

    :sswitch_a
    const/4 p1, 0x0

    return p1

    :sswitch_b
    instance-of v6, p1, Ll/᩸۠֫;

    if-eqz v6, :cond_1

    const-string v6, "\u1a75\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7cc9

    const v8, 0x5628179a

    xor-int/2addr v7, v8

    const v8, 0x5b6819ed

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u05a1\u06e2"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2d8d

    const v8, -0x776e7315    # -8.76E-34f

    xor-int/2addr v7, v8

    const v8, -0x16404196

    goto/16 :goto_0

    .line 30
    :sswitch_c
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_3

    :cond_2
    :goto_1
    const-string v6, "\u06df\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4c99

    const v8, 0x71a44296

    xor-int/2addr v7, v8

    const v8, 0x60182cf1

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u073f\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x26cb

    const v8, 0x2fbd4b89

    xor-int/2addr v7, v8

    const v8, 0x1ed82ef0

    goto/16 :goto_0

    .line 49
    :sswitch_d
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_4
    const-string v6, "\u05a1\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6691

    const v8, 0x74e96f8a

    xor-int/2addr v7, v8

    const v8, 0x23f0f3d0

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06d8\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2359

    const v8, 0x172f6371

    xor-int/2addr v7, v8

    const v8, -0x341ec48d    # -2.9521638E7f

    goto/16 :goto_0

    .line 122
    :sswitch_e
    sget v6, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v6, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v6, "\u06e2\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6ed

    const v8, 0x32f66240

    xor-int/2addr v7, v8

    const v8, -0x70451769

    goto/16 :goto_0

    .line 23
    :sswitch_f
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v6, "\u073f\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x26b

    const v8, -0x42656c0f

    xor-int/2addr v7, v8

    const v8, -0x2908695c

    goto/16 :goto_0

    .line 184
    :sswitch_10
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    const-string v6, "\u06d8\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x57

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x567d

    const v8, 0x105bee22

    xor-int/2addr v7, v8

    const v8, -0x27ad492f

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_9

    goto :goto_2

    :cond_9
    const-string v6, "\u1a79\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x17

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3313

    const v8, -0x11eac85b

    xor-int/2addr v7, v8

    const v8, -0x214ae2fc

    goto/16 :goto_0

    .line 68
    :sswitch_12
    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_a

    :goto_2
    const-string v6, "\u06e0\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1547

    const v8, 0x1e9ce884

    xor-int/2addr v7, v8

    const v8, -0x16bacbf1

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a74\u05a1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x68d

    const v8, -0x7a31f595

    xor-int/2addr v7, v8

    const v8, -0x5b0910a9

    goto/16 :goto_0

    :sswitch_13
    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_b

    :goto_3
    const-string v6, "\u06e4\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x40b9

    const v8, -0x3b74b42d

    xor-int/2addr v7, v8

    const v8, -0x6edc9220

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7b\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x2f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x266b

    const v8, -0x31321500

    xor-int/2addr v7, v8

    const v8, -0x3b528a27

    goto/16 :goto_0

    .line 77
    :sswitch_14
    sget v6, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v6, :cond_d

    :cond_c
    const-string v6, "\u06e8\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x11bb

    const v8, -0x15872bf5

    xor-int/2addr v7, v8

    const v8, -0x34409d10    # -2.5085408E7f

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u05a1\u06ec"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x54f

    const v8, 0x3f30d888

    xor-int/2addr v7, v8

    const v8, -0x241d7384

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e12febf -> :sswitch_d
        -0x7c7432b8 -> :sswitch_13
        -0x7b331570 -> :sswitch_6
        -0x72b9313d -> :sswitch_a
        -0x6eff250c -> :sswitch_11
        -0x60694ead -> :sswitch_e
        -0x5c49dc00 -> :sswitch_7
        -0x5b0b425f -> :sswitch_3
        -0x58791a69 -> :sswitch_a
        -0x4b357469 -> :sswitch_7
        -0x496fc72f -> :sswitch_10
        -0x479d1736 -> :sswitch_b
        -0x439c7e80 -> :sswitch_14
        -0x4308b7f1 -> :sswitch_12
        -0x39240b7a -> :sswitch_d
        -0x342b0d53 -> :sswitch_4
        -0x27bd8ebc -> :sswitch_0
        -0x1aa78df3 -> :sswitch_2
        -0x13cf8c33 -> :sswitch_5
        -0xd3b5ce6 -> :sswitch_5
        0x1ecdbcef -> :sswitch_8
        0x224ab431 -> :sswitch_b
        0x32d7e946 -> :sswitch_c
        0x33de40d6 -> :sswitch_11
        0x377d95f5 -> :sswitch_f
        0x3b5dd749 -> :sswitch_8
        0x4cc9af3b -> :sswitch_13
        0x571c7d1d -> :sswitch_14
        0x5a4926df -> :sswitch_0
        0x5af7050d -> :sswitch_9
        0x5c902e2b -> :sswitch_e
        0x5c94298b -> :sswitch_2
        0x5cca7658 -> :sswitch_c
        0x5ea0f34e -> :sswitch_1
        0x698672ca -> :sswitch_9
        0x6a20bebf -> :sswitch_6
        0x6a918640 -> :sswitch_1
        0x781a73d6 -> :sswitch_f
        0x79cca18d -> :sswitch_12
        0x7c8b06f1 -> :sswitch_10
        0x7e6e7e7c -> :sswitch_3
        0x7ed1f081 -> :sswitch_4
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 22

    move-object/from16 v0, p0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x3555c666    # -5577933.0f

    sget v16, Ll/֡۟;->᩶᩺ܰ:I

    sget v17, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v18, "\u05a8\u1a73"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, 0x6b49

    const v20, 0x11d7ca4

    xor-int v1, v1, v20

    const v20, -0x269f534

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, 0x30f9

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    .line 25
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto :goto_1

    :sswitch_0
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v1, :cond_1

    :cond_0
    move/from16 v20, v10

    move/from16 v18, v12

    goto/16 :goto_5

    :cond_1
    move/from16 v20, v10

    move/from16 v18, v12

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v7

    move/from16 v18, v12

    goto/16 :goto_9

    .line 64
    :sswitch_2
    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    const/4 v1, 0x0

    return v1

    .line 214
    :sswitch_4
    invoke-static {v14}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    return v1

    :sswitch_5
    mul-int/lit8 v13, v12, 0x1f

    iget-object v14, v0, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    .line 62
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_3

    move v1, v7

    move/from16 v20, v10

    move/from16 v18, v12

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u05ab\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x3f

    move/from16 v18, v12

    xor-int v12, v1, v16

    mul-int/lit16 v12, v12, 0x63e9

    const v20, -0x31a32dc2

    xor-int v12, v12, v20

    const v20, -0x59e5a386

    goto :goto_3

    .line 214
    :sswitch_6
    invoke-static {v11}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int v12, v1, v10

    .line 59
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v1

    if-gtz v1, :cond_4

    :goto_1
    const-string v1, "\u0733\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    move/from16 v20, v10

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x66db

    const v18, 0x4fbcb6fd

    xor-int v10, v10, v18

    const v18, -0x4c508cf

    goto :goto_2

    :cond_4
    move/from16 v20, v10

    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x48e5

    const v18, -0x67921914

    xor-int v10, v10, v18

    const v18, -0x4830b995

    :goto_2
    xor-int v18, v1, v18

    goto/16 :goto_b

    :sswitch_7
    move/from16 v18, v12

    mul-int/lit8 v10, v9, 0x1f

    .line 214
    iget-object v11, v0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_5

    move v1, v7

    goto/16 :goto_9

    :cond_5
    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x53

    xor-int v12, v1, v16

    mul-int/lit16 v12, v12, 0x783f

    const v20, -0x1fd56f62

    xor-int v12, v12, v20

    const v20, 0x6bbc5a4f

    :goto_3
    xor-int v1, v1, v20

    move/from16 v21, v18

    move/from16 v18, v1

    move v1, v12

    move/from16 v12, v21

    goto/16 :goto_0

    :sswitch_8
    move/from16 v20, v10

    move/from16 v18, v12

    invoke-static {v8}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int v9, v1, v7

    .line 138
    sget v1, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v1, :cond_6

    move v1, v7

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06d9\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x4d

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x339b

    const v12, -0x75102ce8

    xor-int/2addr v10, v12

    const v12, 0x747005f6

    goto :goto_6

    :sswitch_9
    move/from16 v20, v10

    move/from16 v18, v12

    .line 214
    iget-object v8, v0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    .line 52
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v1

    if-nez v1, :cond_7

    :goto_4
    const-string v1, "\u05a8\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v16

    mul-int/lit16 v10, v10, 0x6415

    const v12, -0x149c49fc

    xor-int/2addr v10, v12

    const v12, 0x2d789f20

    goto :goto_6

    :cond_7
    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x11

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x4e53

    const v12, -0x3e25950f

    xor-int/2addr v10, v12

    const v12, 0x6e4043c7

    goto :goto_6

    :sswitch_a
    move/from16 v20, v10

    move/from16 v18, v12

    mul-int/lit8 v7, v6, 0x1f

    .line 48
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_8

    :goto_5
    const-string v1, "\u0736\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v16

    mul-int/lit16 v10, v10, 0x669b

    const v12, -0x3c701fc4

    xor-int/2addr v10, v12

    const v12, 0xd157ed6

    goto :goto_6

    :cond_8
    const-string v1, "\u073f\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v16

    mul-int/lit16 v10, v10, 0x1e99

    const v12, 0x17356842

    xor-int/2addr v10, v12

    const v12, 0x34a7de35

    :goto_6
    xor-int/2addr v1, v12

    move/from16 v12, v18

    move/from16 v18, v1

    goto/16 :goto_b

    :sswitch_b
    move v1, v7

    move/from16 v20, v10

    move/from16 v18, v12

    xor-long v6, v2, v4

    long-to-int v6, v6

    .line 115
    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_9

    :goto_7
    move/from16 v10, v20

    goto/16 :goto_9

    :cond_9
    const-string v7, "\u06e8\u06e4"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v17, v7

    mul-int/lit8 v7, v7, 0x2b

    xor-int v10, v7, v16

    mul-int/lit16 v10, v10, -0x5001

    const v12, 0xb7cc1c

    xor-int/2addr v10, v12

    const v12, -0x7fa4960d

    goto/16 :goto_a

    :sswitch_c
    move v1, v7

    move/from16 v20, v10

    move/from16 v18, v12

    ushr-long v4, v2, v19

    sget v7, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v7, :cond_a

    goto :goto_8

    :cond_a
    const-string v7, "\u1a78\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v16

    xor-int v10, v7, v17

    mul-int/lit16 v10, v10, 0x6669

    const v12, -0x221757b9

    xor-int/2addr v10, v12

    const v12, 0x1a2c020a

    goto/16 :goto_a

    :sswitch_d
    move v1, v7

    move/from16 v20, v10

    move/from16 v18, v12

    .line 0
    iget-wide v2, v0, Ll/᩸۠֫;->ۤ:J

    .line 70
    sget-boolean v7, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v7, :cond_b

    :goto_8
    const-string v7, "\u0730\u05a8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v16

    xor-int v10, v7, v17

    mul-int/lit16 v10, v10, 0x1d3b

    const v12, 0x58daf3a0

    xor-int/2addr v10, v12

    const v12, 0x9d1dcb4

    goto :goto_a

    :cond_b
    const-string v7, "\u1a73\u06dc"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v16, v7

    mul-int/lit8 v7, v7, -0x3

    xor-int v10, v7, v17

    mul-int/lit16 v10, v10, -0xb9f

    const v12, -0x55196883

    xor-int/2addr v10, v12

    const v12, -0x4c7a8f9e

    goto :goto_a

    :sswitch_e
    move v1, v7

    move/from16 v20, v10

    move/from16 v18, v12

    const/16 v19, 0x20

    .line 11
    sget v7, Ll/ۧ;->ۨۗܰ:I

    if-ltz v7, :cond_c

    goto :goto_7

    :goto_9
    const-string v7, "\u1a73\u06e7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v16

    xor-int v12, v7, v17

    mul-int/lit16 v12, v12, -0x69ab

    const v20, -0x3f87d435

    xor-int v12, v12, v20

    const v20, -0x4683954d

    xor-int v7, v7, v20

    move/from16 v21, v7

    move v7, v1

    move v1, v12

    move/from16 v12, v18

    move/from16 v18, v21

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06ec\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v17

    xor-int v10, v7, v16

    mul-int/lit16 v10, v10, 0x225d

    const v12, -0x4ed5ebec

    xor-int/2addr v10, v12

    const v12, 0x4c350770    # 4.745568E7f

    :goto_a
    xor-int/2addr v7, v12

    move/from16 v12, v18

    move/from16 v18, v7

    move v7, v1

    :goto_b
    move v1, v10

    move/from16 v10, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x69c63788 -> :sswitch_2
        -0x6776c43b -> :sswitch_5
        -0x53dc46c1 -> :sswitch_c
        -0x4de0fa33 -> :sswitch_8
        -0x423deff9 -> :sswitch_d
        -0x3e4f6864 -> :sswitch_c
        -0x302451e0 -> :sswitch_9
        -0x2f227691 -> :sswitch_5
        -0x2d2fa4e8 -> :sswitch_e
        -0x2b8376ca -> :sswitch_3
        -0x294aac59 -> :sswitch_1
        -0x1d1c7712 -> :sswitch_0
        -0x133c3e73 -> :sswitch_b
        -0x343149e -> :sswitch_6
        -0x2469e4d -> :sswitch_4
        0xa547919 -> :sswitch_9
        0x12edb53f -> :sswitch_a
        0x138b1792 -> :sswitch_1
        0x2005e8b2 -> :sswitch_6
        0x240aebb4 -> :sswitch_4
        0x2697a0d3 -> :sswitch_0
        0x3569d4ee -> :sswitch_b
        0x396f8728 -> :sswitch_3
        0x3ed7b20e -> :sswitch_a
        0x4389bb7e -> :sswitch_7
        0x63c2411e -> :sswitch_7
        0x6432239e -> :sswitch_8
        0x6951d8e8 -> :sswitch_e
        0x71352a74 -> :sswitch_2
        0x72c6b71e -> :sswitch_d
    .end sparse-switch
.end method

.method public final length()J
    .locals 2

    .line 214
    iget-wide v0, p0, Ll/᩸۠֫;->ۤ:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 29

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x162f62b2

    sget v22, Ll/ۗ֨;->᩹ۜۡ:I

    sget v23, Ll/ۧ;->ۨۗܰ:I

    const-string v24, "\u05a8\u06e8"

    invoke-static/range {v24 .. v24}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    xor-int v1, v24, v23

    mul-int/lit16 v1, v1, 0x2daf

    const v26, 0x43a04036

    xor-int v1, v1, v26

    const v26, -0x7f115492

    xor-int v24, v24, v26

    move-object/from16 v26, v4

    move-object/from16 v12, v17

    move-object/from16 v14, v19

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v25, 0x0

    :goto_0
    xor-int v4, v21, v23

    mul-int/lit16 v4, v4, 0x1bd

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v21, v24, v1

    sparse-switch v21, :sswitch_data_0

    move-object v1, v0

    move/from16 v24, v3

    sget-object v0, Ll/᩸۠֫;->ܿۡۧ:[S

    const/4 v3, 0x0

    aget-short v16, v0, v3

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_10

    goto/16 :goto_11

    .line 81
    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    move-object v1, v0

    goto/16 :goto_8

    :cond_0
    move-object v1, v0

    move v0, v3

    move/from16 v3, v16

    goto/16 :goto_10

    .line 74
    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_2

    :cond_1
    move-object v1, v0

    :goto_2
    move v0, v3

    goto/16 :goto_b

    :cond_2
    move-object v1, v0

    move/from16 v24, v3

    goto/16 :goto_11

    :sswitch_2
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v1, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto :goto_1

    .line 86
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    const/4 v1, 0x0

    return-object v1

    .line 214
    :sswitch_5
    sget-object v1, Ll/᩸۠֫;->ܿۡۧ:[S

    const/16 v4, 0x20

    const/4 v0, 0x2

    invoke-static {v1, v4, v0, v11}, Ll/֫ۤ;->ܽ۠ۙ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    :sswitch_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_5

    :sswitch_7
    invoke-static {v7, v9}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-object v0, v2, v8

    invoke-static {v7, v0}, Ll/ۗ᩶;->ۘ᩸ۘ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v0, v10

    sub-int/2addr v0, v5

    if-eq v8, v0, :cond_3

    const-string v0, "\u06ec\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x156f

    const v4, 0x1c05cbf8

    xor-int/2addr v1, v4

    const v4, -0xf30366c

    goto/16 :goto_7

    :cond_3
    :goto_3
    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x29a5

    const v4, -0x379f221b

    xor-int/2addr v1, v4

    const v4, -0x1776dbd4

    goto/16 :goto_7

    :sswitch_8
    const/4 v0, 0x1

    invoke-static {v14, v15, v0, v11}, Ll/֫ۢ;->۬ۡ۠([SIII)Ljava/lang/String;

    move-result-object v9

    .line 167
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_4

    :goto_4
    move-object/from16 v1, p0

    goto :goto_2

    :cond_4
    const-string v0, "\u06d7\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x5ccf

    const v4, 0x348aa21b

    xor-int/2addr v1, v4

    const v4, 0x1a488552

    goto/16 :goto_7

    .line 214
    :sswitch_9
    aget-object v0, v10, v8

    invoke-static {v7, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v14, Ll/᩸۠֫;->ܿۡۧ:[S

    const/16 v15, 0x1f

    .line 167
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_5

    move-object/from16 v1, p0

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u1a76\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x6f

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x766b

    const v4, 0x138a83b0

    xor-int/2addr v1, v4

    const v4, -0x70e9fc95

    goto/16 :goto_7

    .line 214
    :sswitch_a
    sget-object v0, Ll/᩸۠֫;->ܿۡۧ:[S

    const/16 v1, 0x1e

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v11}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_b
    array-length v0, v10

    if-ge v8, v0, :cond_6

    const-string v0, "\u1a7a\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x6e7b

    const v4, -0x3fbfd195

    xor-int/2addr v1, v4

    const v4, 0x2099530d

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06ec\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x6ec9

    const v4, -0x38af6aea

    xor-int/2addr v1, v4

    const v4, 0x2012e729

    goto/16 :goto_7

    :sswitch_c
    const/4 v0, 0x1

    invoke-static {v12, v13, v0, v11}, Ll/۬;->ۜᩴ֡([SIII)Ljava/lang/String;

    move-result-object v0

    .line 0
    const-class v1, Ll/᩸۠֫;

    invoke-static {v1, v7, v0}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    move v8, v3

    :goto_5
    const-string v0, "\u05a8\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x77c3

    const v4, -0x1553603f

    xor-int/2addr v1, v4

    const v4, -0x4f73bf99

    goto/16 :goto_7

    .line 214
    :sswitch_d
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Ll/᩸۠֫;->ܿۡۧ:[S

    const/16 v13, 0x1d

    .line 18
    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u073f\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x5dff

    const v4, -0x253b4ed6

    xor-int/2addr v1, v4

    const v4, 0x29f6b73a

    goto :goto_7

    .line 214
    :sswitch_e
    new-array v0, v3, [Ljava/lang/String;

    goto :goto_6

    :sswitch_f
    sget-object v0, Ll/᩸۠֫;->ܿۡۧ:[S

    const/16 v1, 0x1c

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v11}, Ll/ۗܰ;->ܳܰ᩻([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ll/ۖ᩵;->ܺۚ۟(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v0

    :goto_6
    move-object v10, v0

    const-string v0, "\u06d6\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x3d

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x620d

    const v4, -0x1286dce0

    xor-int/2addr v1, v4

    const v4, 0x71991cb1

    goto :goto_7

    :sswitch_10
    sget-object v0, Ll/᩸۠֫;->ܿۡۧ:[S

    const/4 v1, 0x1

    const/16 v4, 0x1b

    invoke-static {v0, v1, v4, v11}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "\u1a78\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x386b

    const v4, -0x2dfbbf13

    xor-int/2addr v1, v4

    const v4, 0xc49400b

    goto :goto_7

    :cond_8
    const-string v0, "\u06db\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x409

    const v4, 0x53a84b44

    xor-int/2addr v1, v4

    const v4, -0x5a9baa39

    :goto_7
    xor-int v24, v0, v4

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_11
    const/4 v0, 0x2

    aput-object v25, v2, v0

    const/4 v0, 0x3

    move-object/from16 v1, p0

    iget-object v4, v1, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    aput-object v4, v2, v0

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v0

    if-gtz v0, :cond_9

    :goto_8
    const-string v0, "\u06d8\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x66d9

    const v24, -0x37a87f77

    xor-int v4, v4, v24

    const v24, -0x5d19adc8

    goto :goto_a

    :cond_9
    const-string v0, "\u06e7\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x2f

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x41a1

    const v24, -0xc288b30

    xor-int v4, v4, v24

    const v24, -0xeee260a

    goto :goto_a

    :sswitch_12
    move-object v1, v0

    aput-object v26, v2, v3

    const/4 v5, 0x1

    iget-object v0, v1, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    aput-object v0, v2, v5

    .line 163
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_a

    :goto_9
    move v0, v3

    goto/16 :goto_d

    :cond_a
    const-string v0, "\u06e2\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v4, v0, v23

    mul-int/lit16 v4, v4, -0x282f

    const v24, -0x24cbb9fb

    xor-int v4, v4, v24

    const v24, -0x1165252e

    :goto_a
    xor-int v24, v0, v24

    goto/16 :goto_f

    :sswitch_13
    move-object v1, v0

    .line 214
    iget-object v0, v1, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    .line 10
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_b

    move-object/from16 v26, v0

    move/from16 v3, v16

    const/4 v0, 0x0

    goto/16 :goto_10

    :cond_b
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v23

    mul-int/lit8 v4, v4, -0x6f

    xor-int v3, v4, v22

    mul-int/lit16 v3, v3, 0x731d

    const v26, 0x17b0029

    xor-int v3, v3, v26

    const v26, -0xecac49c

    xor-int v4, v4, v26

    move-object/from16 v26, v0

    move-object v0, v1

    move v1, v3

    move/from16 v24, v4

    const/4 v3, 0x0

    goto/16 :goto_0

    :sswitch_14
    move-object v1, v0

    move v0, v3

    .line 214
    iget-wide v2, v1, Ll/᩸۠֫;->ۤ:J

    invoke-static {v2, v3}, Ll/֫֡;->ۗ᩶ۢ(J)Ljava/lang/Long;

    move-result-object v25

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    .line 115
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_c

    :goto_b
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, 0x4dbf

    const v24, 0x38910a74

    xor-int v4, v4, v24

    const v24, 0xa5f3d59

    goto/16 :goto_e

    :cond_c
    const-string v3, "\u06e4\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, -0x2969

    const v24, 0x16cf2755

    xor-int v4, v4, v24

    const v24, -0x578f6559

    goto/16 :goto_e

    :sswitch_15
    move-object v1, v0

    move v0, v3

    const v3, 0x9978

    const v11, 0x9978

    goto :goto_c

    :sswitch_16
    move-object v1, v0

    move v0, v3

    const/16 v3, 0x573

    const/16 v11, 0x573

    :goto_c
    const-string v3, "\u073a\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v23

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v22

    mul-int/lit16 v4, v4, 0x2ef1

    const v24, 0x7722d37f

    xor-int v4, v4, v24

    const v24, 0x7fd706

    goto/16 :goto_e

    :sswitch_17
    move-object v1, v0

    move v0, v3

    add-int v3, v19, v20

    add-int/2addr v3, v3

    sub-int v3, v3, v18

    if-ltz v3, :cond_d

    const-string v3, "\u05ab\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v23, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v22

    mul-int/lit16 v4, v4, -0xf23

    const v24, 0x45496332

    xor-int v4, v4, v24

    const v24, -0x7b95cde3

    goto :goto_e

    :cond_d
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, 0x7abd

    const v24, 0x2ea8ddd9

    xor-int v4, v4, v24

    const v24, -0x705880eb

    goto :goto_e

    :sswitch_18
    move-object v1, v0

    move v0, v3

    mul-int v18, v17, v17

    mul-int v19, v16, v16

    const v20, 0x1fa400

    .line 47
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_e

    :goto_d
    const-string v3, "\u06db\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, 0x28af

    const v24, 0x4ae17355    # 7387562.5f

    xor-int v4, v4, v24

    const v24, -0x782aaffc

    goto :goto_e

    :cond_e
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, 0x58f3

    const v24, 0x1eb9fdaa

    xor-int v4, v4, v24

    const v24, 0xa1e9dad

    :goto_e
    xor-int v24, v3, v24

    move v3, v0

    :goto_f
    move-object v0, v1

    move v1, v4

    goto/16 :goto_0

    :sswitch_19
    move-object v1, v0

    move v0, v3

    move/from16 v3, v16

    add-int/lit16 v4, v3, 0x5a0

    .line 210
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v16

    if-ltz v16, :cond_f

    move/from16 v17, v4

    :goto_10
    const-string v4, "\u1a7b\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v23

    mul-int/lit8 v4, v4, 0x27

    move/from16 v16, v0

    xor-int v0, v4, v22

    mul-int/lit16 v0, v0, 0x76f9

    const v24, -0x16dd4931

    xor-int v0, v0, v24

    const v24, -0x5f813395

    xor-int v24, v4, v24

    move-object/from16 v27, v1

    move v1, v0

    move-object/from16 v0, v27

    move/from16 v28, v16

    move/from16 v16, v3

    move/from16 v3, v28

    goto/16 :goto_0

    :cond_f
    const-string v16, "\u1a73\u1a75"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v22

    move/from16 v24, v0

    xor-int v0, v16, v23

    mul-int/lit16 v0, v0, 0x4d0d

    const v17, 0x1186329c

    xor-int v0, v0, v17

    const v17, 0x3263dac6

    xor-int v16, v16, v17

    move/from16 v17, v4

    move-object/from16 v27, v1

    move v1, v0

    move-object/from16 v0, v27

    move/from16 v28, v16

    move/from16 v16, v3

    move/from16 v3, v24

    move/from16 v24, v28

    goto/16 :goto_0

    :goto_11
    const-string v0, "\u1a77\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x1b

    xor-int v3, v0, v22

    mul-int/lit16 v3, v3, -0x4cef

    const v4, 0x368d1b25

    xor-int/2addr v3, v4

    const v4, 0x708e39b8

    goto :goto_12

    :cond_10
    const-string v0, "\u06d8\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v3, v0, v22

    mul-int/lit16 v3, v3, 0x96f

    const v4, 0x726e5d14

    xor-int/2addr v3, v4

    const v4, 0x7176d356

    :goto_12
    xor-int/2addr v0, v4

    move/from16 v27, v24

    move/from16 v24, v0

    move-object v0, v1

    move v1, v3

    move/from16 v3, v27

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fad46ab -> :sswitch_17
        -0x7e6fcaad -> :sswitch_16
        -0x7c417b96 -> :sswitch_c
        -0x7a251948 -> :sswitch_5
        -0x7755931a -> :sswitch_7
        -0x6e5e846f -> :sswitch_15
        -0x6b8c99d3 -> :sswitch_7
        -0x68e0df3d -> :sswitch_11
        -0x611792fe -> :sswitch_11
        -0x51e22179 -> :sswitch_16
        -0x51923b4a -> :sswitch_18
        -0x4e8f2e83 -> :sswitch_14
        -0x4d87a415 -> :sswitch_9
        -0x462e3fb8 -> :sswitch_b
        -0x44eb808b -> :sswitch_c
        -0x42e25800 -> :sswitch_1
        -0x404e218a -> :sswitch_12
        -0x3fc968cd -> :sswitch_1
        -0x37e06aa3 -> :sswitch_a
        -0x35f11e5e -> :sswitch_a
        -0x27839ce0 -> :sswitch_18
        -0x24772345 -> :sswitch_17
        -0x213394d6 -> :sswitch_14
        -0x1fbcefcb -> :sswitch_3
        -0x1c6bc4ea -> :sswitch_19
        -0x19a90690 -> :sswitch_e
        -0xb483002 -> :sswitch_19
        -0x689a3e0 -> :sswitch_13
        0x33c247 -> :sswitch_f
        0x289de5b -> :sswitch_8
        0x29535ca -> :sswitch_6
        0x6be21b5 -> :sswitch_10
        0xce3fdcd -> :sswitch_8
        0xd0c21ca -> :sswitch_2
        0x226ec570 -> :sswitch_b
        0x2c0997b5 -> :sswitch_4
        0x2e08d9bc -> :sswitch_10
        0x30048fcc -> :sswitch_4
        0x37fda596 -> :sswitch_9
        0x3a6bb36b -> :sswitch_f
        0x3c61b038 -> :sswitch_e
        0x426cb150 -> :sswitch_13
        0x477dcceb -> :sswitch_d
        0x4b59a2a1 -> :sswitch_12
        0x4b7d8e3d -> :sswitch_0
        0x5d400c7d -> :sswitch_d
        0x65af3695 -> :sswitch_6
        0x6c7d7989 -> :sswitch_3
        0x6dc9497c -> :sswitch_0
        0x781ff2d8 -> :sswitch_15
        0x78e1cbb9 -> :sswitch_2
        0x7e16d198 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۙ()Ll/᩷ۨᩴ;
    .locals 7

    const v0, -0x4de5b847

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v3, "\u073f\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3557

    const v5, -0x1f62eecc

    xor-int/2addr v4, v5

    const v5, -0x58663477

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x396b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 142
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    .line 148
    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x58af

    const v5, 0x61e37275

    xor-int/2addr v4, v5

    const v5, -0x6ed4c880

    goto :goto_0

    .line 159
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_9

    goto :goto_1

    .line 133
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    const/4 v0, 0x0

    return-object v0

    .line 216
    :sswitch_4
    new-instance v3, Ll/ۘۨᩴ;

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_3

    .line 209
    :cond_1
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_4

    goto :goto_2

    .line 1
    :cond_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    .line 118
    :cond_5
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-nez v4, :cond_6

    :goto_1
    const-string v3, "\u1a7a\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2add

    const v5, -0x1bcf6475

    xor-int/2addr v4, v5

    const v5, 0x68cd4719

    goto/16 :goto_0

    .line 216
    :cond_6
    iget-object v4, p0, Ll/᩸۠֫;->᩸:Landroid/net/Uri;

    .line 38
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    .line 216
    :cond_7
    invoke-static {v4}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_8

    :goto_2
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7b79

    const v5, -0x44ba1f37

    xor-int/2addr v4, v5

    const v5, 0x22841850

    goto/16 :goto_0

    :cond_8
    new-array v5, v5, [Ljava/lang/String;

    invoke-static {v4, v5}, Ll/ۗۖ;->ۖ᩺ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷ۨᩴ;

    move-result-object v4

    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06df\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f51

    const v5, -0x39bf55cf

    xor-int/2addr v4, v5

    const v5, -0x6230e3f6

    goto/16 :goto_0

    :cond_a
    iget-object v5, p0, Ll/᩸۠֫;->ۙ:Ljava/lang/String;

    sget v6, Ll/᩺;->۫۬۫:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x28e1

    const v5, 0x4d27e662    # 1.7605584E8f

    xor-int/2addr v4, v5

    const v5, 0x4f1809cc    # 2.550779E9f

    goto/16 :goto_0

    :cond_c
    invoke-direct {v3, v4, v5}, Ll/ۘۨᩴ;-><init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ۘۨᩴ;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d2cb5d5 -> :sswitch_2
        -0x5f14bf72 -> :sswitch_1
        -0x5e34e244 -> :sswitch_0
        -0x3865575f -> :sswitch_0
        -0x2ecc8d19 -> :sswitch_3
        -0x17d90d27 -> :sswitch_4
        -0x1546bf27 -> :sswitch_2
        -0x1438ef6 -> :sswitch_3
        -0x7a35ee -> :sswitch_4
        0x72ba1bb2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final ᩷()Ljava/io/InputStream;
    .locals 1

    .line 214
    iget-object v0, p0, Ll/᩸۠֫;->᩷:Ljava/io/InputStream;

    return-object v0
.end method
