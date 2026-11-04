.class public final synthetic Ll/֫ۖ᩻;
.super Ljava/lang/Object;
.source "44LP"

# interfaces
.implements Ll/ܳ۬᩻;


# static fields
.field private static final ᩶ᩳᩳ:[S


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ۖ᩻;->᩶ᩳᩳ:[S

    return-void

    :array_0
    .array-data 2
        0xce7s
        0x5f48s
        0x5f5fs
        0x5f49s
        0x5f4fs
        0x5f56s
        0x5f4es
        -0x33e1s
        0x38ads
        0x2729s
    .end array-data
.end method

.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۖ᩻;->ܰ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۬ۢ᩻;)V
    .locals 28

    const/4 v1, 0x0

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

    const v20, 0x6800c675

    sget v21, Ll/ۖ֨;->֨ۨۧ:I

    sget v22, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v23, "\u06e1\u06dc"

    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v23

    add-int v23, v23, v22

    mul-int/lit8 v23, v23, 0x17

    xor-int v0, v23, v21

    mul-int/lit16 v0, v0, -0x2e1d

    const v25, -0x6bd4afb4

    xor-int v0, v0, v25

    const v25, 0x77911d1b

    xor-int v23, v23, v25

    move-object/from16 v13, v19

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v16

    move-object/from16 v16, v9

    move-object/from16 v9, v27

    :goto_0
    xor-int v11, v20, v21

    mul-int/lit16 v11, v11, -0x5535

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v0, v11

    xor-int v20, v23, v0

    sparse-switch v20, :sswitch_data_0

    move-object/from16 v11, p1

    move-object/from16 v23, v1

    add-int v0, v25, v14

    mul-int v0, v0, v0

    sub-int v0, v0, v19

    if-gez v0, :cond_b

    const-string v0, "\u1a78\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x67d7

    const v26, -0x1937d4ea

    xor-int v1, v1, v26

    const v26, 0x178bfa1e

    goto/16 :goto_c

    .line 269
    :sswitch_0
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    goto/16 :goto_b

    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-gez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v11, p1

    goto/16 :goto_6

    .line 4
    :sswitch_2
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_6

    :goto_1
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    goto/16 :goto_8

    .line 137
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto :goto_1

    .line 228
    :sswitch_4
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 281
    :sswitch_5
    invoke-static {}, Ll/ۧ۬᩻;->ᩴ()V

    .line 282
    new-instance v0, Ll/ܺۖ᩻;

    invoke-direct {v0, v1, v3}, Ll/ܺۖ᩻;-><init>(Ll/ܽ֡֫;Ll/ۤۢ᩻;)V

    .line 283
    invoke-static {v2}, Ll/ۖ᩹;->ܳܽ֫(I)Ll/᩸۠ۧ;

    goto/16 :goto_2

    :sswitch_6
    mul-int v0, v5, v6

    .line 277
    invoke-static {v0}, Ll/ۖ֡;->ۢۘ᩵(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֡۟;->֡ۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 278
    invoke-static {v0}, Ll/֫ۢ;->ۖܿ֡(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x65dd

    const v23, 0x6b5640c8

    xor-int v11, v11, v23

    const v23, 0x4863d839

    goto/16 :goto_4

    .line 277
    :sswitch_7
    sget-object v4, Ll/ۛۨᩴ;->ᩴ:Ll/᩷ۨᩴ;

    invoke-static {}, Ll/᩶᩷ۧ;->ۙ()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v5, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    const/16 v6, 0x1c8

    .line 224
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v0

    if-ltz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u1a7b\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x5545

    const v23, 0x40a4efc3

    xor-int v11, v11, v23

    const v23, 0x7bc6e950

    goto/16 :goto_4

    :sswitch_8
    return-void

    .line 275
    :sswitch_9
    new-instance v0, Ll/ܺۖ᩻;

    invoke-direct {v0, v1, v3}, Ll/ܺۖ᩻;-><init>(Ll/ܽ֡֫;Ll/ۤۢ᩻;)V

    .line 276
    invoke-static {v2}, Ll/ۖ᩹;->ܳܽ֫(I)Ll/᩸۠ۧ;

    return-void

    .line 277
    :sswitch_a
    invoke-static {}, Ll/ۖ᩹;->᩷᩸۫()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "\u06e1\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x5d

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x7aa5

    const v23, 0x5ad54bd6

    xor-int v11, v11, v23

    const v23, -0x164af6e7

    goto/16 :goto_4

    :cond_3
    :goto_2
    const-string v0, "\u1a79\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x601f

    const v23, 0x2324d58c

    xor-int v11, v11, v23

    const v23, -0x650b213f

    goto/16 :goto_4

    :sswitch_b
    const v0, 0x7d276d87

    xor-int v2, v8, v0

    const/4 v3, 0x0

    if-eqz v24, :cond_4

    const-string v0, "\u1a7b\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x65

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x1065

    const v23, 0x68404c84

    xor-int v11, v11, v23

    const v23, -0x6266e26a

    goto :goto_4

    :cond_4
    const-string v0, "\u05a1\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x4057

    const v23, 0x20d43d78

    xor-int v11, v11, v23

    const v23, 0x15dededf

    goto :goto_4

    .line 274
    :sswitch_c
    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    .line 87
    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v0, :cond_5

    goto :goto_5

    :cond_5
    const-string v0, "\u1a77\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x2789

    const v23, -0x583f4cdf

    xor-int v11, v11, v23

    const v23, -0x3ebc1438

    goto :goto_4

    :sswitch_d
    const/4 v0, 0x7

    const/4 v7, 0x3

    .line 274
    invoke-static {v13, v0, v7, v15}, Ll/֡᩵;->ܽۛܰ([SIII)Ljava/lang/String;

    move-result-object v7

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_7

    :cond_6
    :goto_3
    const-string v0, "\u1a7a\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x62df

    const v23, -0x50002d5a

    xor-int v11, v11, v23

    const v23, 0x2fe7487

    goto :goto_4

    :cond_7
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x51

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x2ff

    const v23, 0x64c498f0

    xor-int v11, v11, v23

    const v23, -0x22e3cffe

    :goto_4
    xor-int v23, v0, v23

    move v0, v11

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual/range {p1 .. p1}, Ll/۬ۢ᩻;->᩸()Z

    move-result v24

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/֫ۖ᩻;->ܰ:Lbin/mt/plus/Main;

    sget-object v13, Ll/֫ۖ᩻;->᩶ᩳᩳ:[S

    .line 138
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v11

    if-eqz v11, :cond_8

    :goto_5
    move-object/from16 v11, p1

    goto/16 :goto_a

    :cond_8
    const-string v11, "\u06d8\u1a78"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v22

    mul-int/lit8 v11, v11, 0x23

    xor-int v0, v11, v21

    mul-int/lit16 v0, v0, 0x7b67

    const v23, 0x2396bd33

    xor-int v0, v0, v23

    const v23, 0x1739de7e

    xor-int v23, v11, v23

    goto/16 :goto_0

    .line 0
    :sswitch_f
    invoke-static {v9, v10, v12, v15}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, p1

    .line 0
    invoke-static {v11, v0}, Ll/ܽ;->᩹ᩳܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_9

    :goto_6
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    move-object/from16 v23, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x4f37

    const v26, -0x63251b47

    xor-int v1, v1, v26

    const v26, -0x401751f2

    goto/16 :goto_c

    :cond_9
    move-object/from16 v23, v1

    const-string v0, "\u1a77\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x537b

    const v26, -0x748ecec5

    xor-int v1, v1, v26

    const v26, 0x34472ce5

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    .line 0
    sget-object v9, Ll/֫ۖ᩻;->᩶ᩳᩳ:[S

    const/4 v10, 0x1

    const/4 v12, 0x6

    .line 232
    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u0736\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x21

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x1e8d

    const v26, -0x33c1726b    # -4.995234E7f

    xor-int v1, v1, v26

    const v26, -0x754755ba

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const/16 v0, 0x1528

    const/16 v15, 0x1528

    goto :goto_7

    :sswitch_12
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const/16 v0, 0x5f3a

    const/16 v15, 0x5f3a

    :goto_7
    const-string v0, "\u1a79\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x1183

    const v26, 0x434137e7

    xor-int v1, v1, v26

    const v26, 0x3d50c787

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u06d6\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x53

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x298d

    const v26, -0x52041d76    # -2.8636E-11f

    xor-int v1, v1, v26

    const v26, -0x3160299e

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    add-int/lit8 v19, v18, 0x1

    const/4 v14, 0x1

    .line 185
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_c

    :goto_8
    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x7041

    const v26, -0xdb6fa61

    xor-int v1, v1, v26

    const v26, 0x68920f70

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06eb\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x171

    const v26, 0x30a2aa7d

    xor-int v1, v1, v26

    const v26, -0x3e2d0323

    goto/16 :goto_c

    :sswitch_14
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    aget-short v25, v16, v17

    mul-int/lit8 v18, v25, 0x2

    .line 225
    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_d

    :goto_9
    move-object/from16 v1, v23

    goto :goto_a

    :cond_d
    const-string v0, "\u073f\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x3d21

    const v26, 0x22e10402

    xor-int v1, v1, v26

    const v26, -0x3f7ef1c8

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const/16 v17, 0x0

    .line 189
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_e

    goto :goto_9

    :goto_a
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x55

    move-object/from16 v23, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x65e5

    const v26, 0x1d02b7a0

    xor-int v1, v1, v26

    const v26, 0x2e738af7

    goto :goto_c

    :cond_e
    const-string v0, "\u06e4\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x3be1

    const v26, -0x1c185927

    xor-int v1, v1, v26

    const v26, 0x1b00576b

    goto :goto_c

    :sswitch_16
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    sget-object v16, Ll/֫ۖ᩻;->᩶ᩳᩳ:[S

    .line 235
    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_f

    :goto_b
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x5b4d

    const v26, 0x2e2f37e0

    xor-int v1, v1, v26

    const v26, 0x29fc6d7b

    goto :goto_c

    :cond_f
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x2d87

    const v26, 0x4b44deeb    # 1.2902123E7f

    xor-int v1, v1, v26

    const v26, 0x5fe04e0a

    :goto_c
    xor-int v0, v0, v26

    move-object/from16 v27, v23

    move/from16 v23, v0

    move v0, v1

    move-object/from16 v1, v27

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a29a10b -> :sswitch_12
        -0x762d0c45 -> :sswitch_15
        -0x739c4b30 -> :sswitch_4
        -0x6a0df23a -> :sswitch_b
        -0x68e26a57 -> :sswitch_5
        -0x66a879fd -> :sswitch_d
        -0x58fdc347 -> :sswitch_13
        -0x558c04b4 -> :sswitch_16
        -0x52082771 -> :sswitch_6
        -0x458a4f60 -> :sswitch_f
        -0x415f3219 -> :sswitch_4
        -0x3893d6e4 -> :sswitch_0
        -0x355f0536 -> :sswitch_a
        -0x266b00f4 -> :sswitch_7
        -0x227c2121 -> :sswitch_3
        -0x22084eab -> :sswitch_c
        -0x213c2a9a -> :sswitch_a
        -0x1e653614 -> :sswitch_6
        -0x1d89e302 -> :sswitch_e
        -0x1d72421c -> :sswitch_5
        -0x1cf1b536 -> :sswitch_9
        -0x1a7c525a -> :sswitch_3
        -0x149e0860 -> :sswitch_10
        -0x317e45 -> :sswitch_1
        0x90023bf -> :sswitch_9
        0x16b3e32d -> :sswitch_13
        0x1772ae75 -> :sswitch_b
        0x232ab089 -> :sswitch_e
        0x2d918be8 -> :sswitch_1
        0x30a97286 -> :sswitch_0
        0x3c6d69c8 -> :sswitch_7
        0x4491cb80 -> :sswitch_12
        0x45897581 -> :sswitch_8
        0x53d6844c -> :sswitch_d
        0x562aaca8 -> :sswitch_14
        0x5a6c00d7 -> :sswitch_14
        0x5abfbbff -> :sswitch_10
        0x6095059c -> :sswitch_2
        0x63e3a10d -> :sswitch_16
        0x65ff9cf4 -> :sswitch_8
        0x68da1506 -> :sswitch_f
        0x6a48cd12 -> :sswitch_c
        0x6b70ec5e -> :sswitch_11
        0x6ef5d1b8 -> :sswitch_2
        0x7644294e -> :sswitch_15
        0x7c06351f -> :sswitch_11
    .end sparse-switch
.end method
