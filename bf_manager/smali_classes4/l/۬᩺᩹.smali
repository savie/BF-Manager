.class public final synthetic Ll/۬᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ᩴܶ᩹;


# static fields
.field private static final ֫۫ۜ:[S


# instance fields
.field public final synthetic ܺ:Ll/ۨۜ᩹;

.field public final synthetic ᩶:Ll/ۖ۬᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬᩺᩹;->֫۫ۜ:[S

    return-void

    :array_0
    .array-data 2
        0xb9es
        0x3547s
        0x3548s
        0x3542s
        0x3554s
        0x3549s
        0x354fs
        0x3542s
        0x3508s
        0x354fs
        0x3548s
        0x3552s
        0x3543s
        0x3548s
        0x3552s
        0x3508s
        0x3547s
        0x3545s
        0x3552s
        0x354fs
        0x3549s
        0x3548s
        0x3508s
        0x3570s
        0x356fs
        0x3563s
        0x3571s
        0x3547s
        0x3554s
        0x3555s
        0x3545s
        0x3560s
        0x354fs
        0x354as
        0x3543s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ۨۜ᩹;Ll/ۖ۬᩹;)V
    .locals 6

    const v0, -0x63fca874

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d29

    const v5, -0x7afebec9

    xor-int/2addr v4, v5

    const v5, -0x109575a0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x20d5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p2, p0, Ll/۬᩺᩹;->᩶:Ll/ۖ۬᩹;

    return-void

    :sswitch_0
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_b

    goto :goto_2

    .line 3
    :sswitch_1
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v3, :cond_9

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ac1

    const v5, -0x20fc5da9

    xor-int/2addr v4, v5

    const v5, -0x68d8bf9c

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    :goto_2
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xaff

    const v5, 0x2c14eb42

    xor-int/2addr v4, v5

    const v5, -0x1b838a4d

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u073d\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f5

    const v5, 0x60c5f247

    xor-int/2addr v4, v5

    const v5, -0x4b867491

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x532b

    const v5, 0x42bbe225

    xor-int/2addr v4, v5

    const v5, 0x3eb11b91

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x20cd

    const v5, 0x1fbbf821

    xor-int/2addr v4, v5

    const v5, -0x54b6d3b5

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u073a\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x885

    const v5, 0x36c44338

    xor-int/2addr v4, v5

    const v5, 0x11ada778

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06eb\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x46fb

    const v5, -0xad31d95

    xor-int/2addr v4, v5

    const v5, -0x6a6e1bf2

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u06e1\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c3d

    const v5, -0x27111a8b

    xor-int/2addr v4, v5

    const v5, -0x30597829

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4713

    const v5, -0x181ee872

    xor-int/2addr v4, v5

    const v5, -0x38296bbc

    goto/16 :goto_0

    .line 1
    :sswitch_c
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4cc7

    const v5, 0x6c2ef149

    xor-int/2addr v4, v5

    const v5, 0xad40760

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6dcd

    const v5, 0x40aaf990

    xor-int/2addr v4, v5

    const v5, -0x264d0a6a

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06da\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x409b

    const v5, -0x7cc53d9c

    xor-int/2addr v4, v5

    const v5, 0x40a06899

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x329

    const v5, -0x2c9dfe59

    xor-int/2addr v4, v5

    const v5, -0xf402027

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۬᩺᩹;->ܺ:Ll/ۨۜ᩹;

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d9\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2eff

    const v5, -0x1609c93d

    xor-int/2addr v4, v5

    const v5, -0x77691c93

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ba3

    const v5, -0x1eed3c03

    xor-int/2addr v4, v5

    const v5, 0x2eed667f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c2f3eb0 -> :sswitch_0
        -0x7a278bb2 -> :sswitch_c
        -0x65011c0b -> :sswitch_7
        -0x5f4efb2f -> :sswitch_5
        -0x5efd126f -> :sswitch_6
        -0x5b6eab09 -> :sswitch_9
        -0x59606084 -> :sswitch_1
        -0x585067a6 -> :sswitch_7
        -0x4f12b31c -> :sswitch_d
        -0x48cdb60f -> :sswitch_b
        -0x478a2992 -> :sswitch_8
        -0x3e361eba -> :sswitch_4
        -0x31a24f60 -> :sswitch_0
        -0x2310f577 -> :sswitch_5
        -0x1e5d599d -> :sswitch_2
        -0x846b768 -> :sswitch_e
        -0x547debd -> :sswitch_8
        0xa4bdf41 -> :sswitch_6
        0xa91fea0 -> :sswitch_e
        0xae8521d -> :sswitch_d
        0xe7705c6 -> :sswitch_4
        0x101e9532 -> :sswitch_3
        0x2b4a153e -> :sswitch_2
        0x39cc4619 -> :sswitch_1
        0x40de6271 -> :sswitch_c
        0x47b2e2c1 -> :sswitch_b
        0x4f7abff4 -> :sswitch_3
        0x51a6ac8f -> :sswitch_9
        0x5d5eed55 -> :sswitch_a
        0x66d7ced3 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final ܰ(Ll/᩷۠ۚ;)V
    .locals 22

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

    const v15, 0xf1d5ca4

    sget v16, Ll/֨᩺;->۬᩺ܰ:I

    sget v17, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v18, "\u06e8\u06e2"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    mul-int/lit8 v18, v18, 0x3f

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, 0x2dad

    const v19, 0x4dcb18c3    # 4.259247E8f

    xor-int v1, v1, v19

    const v19, -0x522d1abf

    xor-int v18, v18, v19

    move-object/from16 v19, v4

    :goto_0
    const/4 v4, 0x0

    :goto_1
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, 0x327d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    move/from16 v18, v15

    const/4 v5, 0x0

    .line 539
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_c

    goto/16 :goto_6

    :sswitch_0
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v1, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v18, v15

    goto/16 :goto_6

    :sswitch_1
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v1, :cond_2

    :cond_1
    move/from16 v18, v15

    goto/16 :goto_4

    :cond_2
    move/from16 v18, v15

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 1225
    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    :goto_2
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x15

    move/from16 v18, v15

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x3acf

    const v20, -0x157cc70d

    xor-int v15, v15, v20

    const v20, 0x61cdd86c

    goto/16 :goto_8

    .line 1810
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    return-void

    :sswitch_5
    const/16 v1, 0x7d0

    .line 216
    iget-object v3, v0, Ll/۬᩺᩹;->᩶:Ll/ۖ۬᩹;

    invoke-static {v3, v1}, Ll/ۜᩳ᩹;->ۙ(Ll/ۖ۬᩹;I)V

    .line 1881
    invoke-static {v2}, Ll/֫ۚ;->ۗۚۧ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v4}, Ll/֨᩺;->᩷ܽᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_6
    move/from16 v18, v15

    .line 1879
    invoke-static/range {p1 .. p1}, Ll/֡᩶;->ۘᩴܰ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v3, v1}, Ll/֨ܶ;->᩸᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u06d9\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, 0x2c83

    const v20, 0x19d5b981

    xor-int v15, v15, v20

    const v20, -0x11047b90

    goto/16 :goto_8

    :sswitch_7
    move/from16 v18, v15

    .line 1878
    sget-object v1, Ll/۬᩺᩹;->֫۫ۜ:[S

    const/16 v3, 0x1b

    const/16 v15, 0x8

    invoke-static {v1, v3, v15, v11}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v3

    .line 1751
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x3f8f

    const v20, 0x2a497954

    xor-int v15, v15, v20

    const v20, 0x1f316368

    goto/16 :goto_8

    :sswitch_8
    move/from16 v18, v15

    .line 1877
    invoke-static {v12, v13, v14, v11}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1878
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06e7\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7b

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x7443

    const v20, -0x2661aa5

    xor-int v15, v15, v20

    const v20, -0x7d7e746a

    goto/16 :goto_8

    :sswitch_9
    move/from16 v18, v15

    .line 1877
    sget-object v12, Ll/۬᩺᩹;->֫۫ۜ:[S

    const/4 v13, 0x1

    const/16 v14, 0x1a

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06d7\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x67

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x22a9

    const v20, 0x68bc985f

    xor-int v15, v15, v20

    const v20, -0x5d73f0f0

    goto/16 :goto_8

    :sswitch_a
    move/from16 v18, v15

    .line 1876
    new-instance v4, Landroid/content/Intent;

    iget-object v2, v0, Ll/۬᩺᩹;->ܺ:Ll/ۨۜ᩹;

    invoke-static {v2}, Ll/֫ۚ;->ۗۚۧ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    const-class v15, Ll/ۚ᩻ۘ;

    .line 650
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v20

    if-gtz v20, :cond_7

    goto/16 :goto_4

    .line 1876
    :cond_7
    invoke-direct {v4, v1, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1877
    invoke-static {v4, v1}, Ll/֫ᩳ;->۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v1, "\u06e7\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x3a5d

    const v20, 0x37599831

    xor-int v15, v15, v20

    const v20, -0xbd575df

    goto/16 :goto_8

    :sswitch_b
    move/from16 v18, v15

    const/16 v1, 0x3ce7

    const/16 v11, 0x3ce7

    goto :goto_3

    :sswitch_c
    move/from16 v18, v15

    const/16 v1, 0x3526

    const/16 v11, 0x3526

    :goto_3
    const-string v1, "\u06da\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x3c91

    const v20, -0x60489c0

    xor-int v15, v15, v20

    const v20, 0x77702f1

    goto/16 :goto_8

    :sswitch_d
    move/from16 v18, v15

    add-int v1, v9, v10

    add-int/2addr v1, v1

    sub-int v1, v8, v1

    if-gtz v1, :cond_9

    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x7991

    const v20, 0x44569ba1

    xor-int v15, v15, v20

    const v20, -0xb5f6369

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, 0x7973

    const v20, 0x6ac42ad8

    xor-int v15, v15, v20

    const v20, 0x6e3f67df

    goto/16 :goto_8

    :sswitch_e
    move/from16 v18, v15

    mul-int v8, v7, v7

    mul-int v9, v6, v6

    const v10, 0x15796959

    .line 85
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_a

    :goto_4
    const-string v1, "\u1a75\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x1caf

    const v15, -0x5a8aec44

    xor-int/2addr v4, v15

    const v15, 0x52e18b3c

    xor-int/2addr v1, v15

    move/from16 v15, v18

    move/from16 v18, v1

    move v1, v4

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06d9\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, 0x27f

    const v20, -0x2fecd872

    xor-int v15, v15, v20

    const v20, -0x111d79a7

    goto/16 :goto_8

    :sswitch_f
    move/from16 v18, v15

    aget-short v6, v19, v5

    add-int/lit16 v7, v6, 0x4a25

    .line 1265
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    const-string v1, "\u06e7\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xd

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x7fb5

    const v20, 0x2eb26cdd

    xor-int v15, v15, v20

    const v20, -0x29f5ef35

    goto/16 :goto_8

    :cond_b
    const-string v1, "\u06da\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x5f13

    const v20, -0x6fa76c5b

    xor-int v15, v15, v20

    const v20, -0x66e66cda

    goto :goto_8

    :goto_6
    const-string v1, "\u06e8\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x145b

    const v20, -0x4e41e79b

    xor-int v15, v15, v20

    const v20, -0x1d16ebfe

    goto :goto_8

    :cond_c
    const-string v1, "\u1a75\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x35

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x358f

    const v20, -0x43074369

    xor-int v15, v15, v20

    const v20, 0x4cc84b2

    goto :goto_8

    :sswitch_10
    move/from16 v18, v15

    sget-object v19, Ll/۬᩺᩹;->֫۫ۜ:[S

    .line 1826
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v1

    if-eqz v1, :cond_d

    :goto_7
    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x65

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x26bd

    const v20, 0x2ec635a3

    xor-int v15, v15, v20

    const v20, 0x27a2afa6

    goto :goto_8

    :cond_d
    const-string v1, "\u06eb\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, 0x5241

    const v20, 0x66e9c309

    xor-int v15, v15, v20

    const v20, -0x6d95be35

    :goto_8
    xor-int v1, v1, v20

    move/from16 v21, v18

    move/from16 v18, v1

    move v1, v15

    move/from16 v15, v21

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f8aede9 -> :sswitch_c
        -0x78bd46dd -> :sswitch_3
        -0x60131b46 -> :sswitch_6
        -0x5481a25e -> :sswitch_9
        -0x3a11a0ce -> :sswitch_5
        -0x3a08a29b -> :sswitch_d
        -0x338f8944 -> :sswitch_a
        -0x2dcc59af -> :sswitch_d
        -0x2d282f3d -> :sswitch_a
        -0x29c8d50b -> :sswitch_4
        -0x26cf2e1c -> :sswitch_7
        -0x26c3352e -> :sswitch_7
        -0x20c09cf9 -> :sswitch_9
        -0x164baa03 -> :sswitch_4
        -0xf26b5c0 -> :sswitch_0
        0x8437349 -> :sswitch_8
        0xf0c810f -> :sswitch_0
        0x12af7b51 -> :sswitch_6
        0x16202056 -> :sswitch_f
        0x1b63d2a5 -> :sswitch_1
        0x257bb1e1 -> :sswitch_3
        0x3e05f6dc -> :sswitch_f
        0x3f466fc1 -> :sswitch_10
        0x452a8e22 -> :sswitch_b
        0x4b17d41b -> :sswitch_5
        0x4b96b3b6 -> :sswitch_e
        0x4cb9410d -> :sswitch_e
        0x4d3d0f5f -> :sswitch_b
        0x59da177b -> :sswitch_10
        0x5e5712b1 -> :sswitch_1
        0x6b5f2be8 -> :sswitch_c
        0x6ecb4203 -> :sswitch_2
        0x7122eef3 -> :sswitch_8
        0x7e45bf58 -> :sswitch_2
    .end sparse-switch
.end method
