.class public final synthetic Ll/ۡ᩺ۘ;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ֫ۚᩴ:[S


# instance fields
.field public final synthetic ܺ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡ᩺ۘ;->֫ۚᩴ:[S

    return-void

    :array_0
    .array-data 2
        0x1175s
        0x658bs
        0x6592s
        0x65d4s
        0x65b9s
        0x6596s
        0x6587s
        0x6592s
        0x658es
        0x65c9s
        0x6595s
        0x6582s
        0x6585s
        0x6587s
        0x6594s
        0x6582s
        0x65c9s
        0x65abs
        0x65b2s
        0x65d4s
        0x1e78s
        0x33dbs
        -0x63s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩺ۘ;->ܺ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

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

    const v20, -0x398d2841

    sget v21, Ll/ۧ;->֫۠ᩴ:I

    sget v22, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v23, "\u1a73\u06df"

    invoke-static/range {v23 .. v23}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v22

    xor-int v0, v23, v21

    mul-int/lit16 v0, v0, -0x11c9

    const v25, -0x65e3ce64

    xor-int v0, v0, v25

    const v25, -0x4b0dee36

    xor-int v23, v23, v25

    move-object v14, v13

    move-object/from16 v8, v16

    move-object/from16 v10, v17

    move/from16 v24, v23

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, -0x398d2841

    const/16 v25, 0x0

    move-object/from16 v16, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v12, v23, v21

    mul-int/lit16 v12, v12, 0x7d35

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v0, v12

    xor-int v23, v24, v0

    sparse-switch v23, :sswitch_data_0

    const/16 v0, 0x9

    const/16 v3, 0xb

    .line 378
    invoke-static {v8, v0, v3, v13}, Ll/ۗᩳ;->ۖ᩶۫([SIII)Ljava/lang/String;

    move-result-object v3

    .line 344
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_5

    goto/16 :goto_5

    .line 20
    :sswitch_0
    sget-boolean v0, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v0, :cond_8

    goto :goto_1

    .line 259
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_1
    const-string v0, "\u06e2\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, -0x1bd3

    const v24, 0x19be4fe4

    xor-int v12, v12, v24

    const v24, -0x5a966210

    goto/16 :goto_8

    :sswitch_2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v0

    if-gtz v0, :cond_e

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto/16 :goto_6

    .line 82
    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    :sswitch_5
    return-void

    .line 386
    :sswitch_6
    sget-object v0, Ll/֡᩺ۘ;->֡:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 387
    invoke-static {v5}, Ll/ۨ᩵ۚ;->ۨ(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 383
    :sswitch_7
    sget-object v0, Ll/֡᩺ۘ;->֡:Landroid/content/SharedPreferences;

    invoke-static {v0, v2, v3}, Ll/ۖܽ;->ۘ᩷ܰ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, -0x1fa9

    const v24, -0x661ed208

    xor-int v12, v12, v24

    const v24, 0x1b4c06e0

    goto/16 :goto_8

    .line 2
    :sswitch_8
    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7ec917a5

    xor-int/2addr v0, v1

    .line 101
    invoke-static {v0}, Ll/֨ܶ;->ۚۛۢ(I)Ll/ܺۡۜ;

    return-void

    .line 2
    :sswitch_9
    invoke-static {v10, v11, v9, v13}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v6

    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u06e1\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x79

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, -0x30e1

    const v24, -0x4c5339fc

    xor-int v12, v12, v24

    const v24, -0x34f844df    # -8895265.0f

    goto/16 :goto_8

    :sswitch_a
    sget-object v10, Ll/ۡ᩺ۘ;->֫ۚᩴ:[S

    const/16 v11, 0x14

    const/4 v9, 0x3

    .line 108
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u05ab\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x6f03

    const v24, 0x4dfc1808    # 5.2867917E8f

    xor-int v12, v12, v24

    const v24, 0x214c0176

    goto/16 :goto_8

    .line 0
    :sswitch_b
    invoke-static {}, Ll/ۧۘ۬;->ۙ()V

    return-void

    .line 378
    :sswitch_c
    invoke-static {v1, v2, v3}, Ll/ۘۛ;->ۖܺ᩹(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 379
    invoke-static {v4}, Ll/ۨ᩵ۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 380
    invoke-static {v5, v4}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_2
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x63

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x6bff

    const v24, -0x3dfddad7

    xor-int v12, v12, v24

    const v24, 0x2adf7bb9

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u06ec\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x32db

    const v24, -0x24df74bb

    xor-int v12, v12, v24

    const v24, 0x753c267b

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u1a78\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x19

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, -0x6087

    const v24, -0x1f6f0b20

    xor-int v12, v12, v24

    const v24, 0x35541d90

    goto/16 :goto_8

    .line 378
    :sswitch_d
    invoke-static {v14, v15, v7, v13}, Ll/֡᩸;->ۤ᩺ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v8, Ll/ۡ᩺ۘ;->֫ۚᩴ:[S

    .line 31
    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x7

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0xbb7

    const v24, 0x49f9caa7

    xor-int v12, v12, v24

    const v24, -0x5bce6e43

    goto/16 :goto_8

    :sswitch_e
    const/16 v7, 0x8

    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x42c1

    const v24, -0x968bc86

    xor-int v12, v12, v24

    const v24, 0x9e506f

    goto/16 :goto_8

    .line 378
    :sswitch_f
    sget-object v1, Ll/֡᩺ۘ;->֡:Landroid/content/SharedPreferences;

    sget-object v14, Ll/ۡ᩺ۘ;->֫ۚᩴ:[S

    const/4 v15, 0x1

    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_9

    :cond_8
    :goto_3
    const-string v0, "\u073a\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0x6a6f

    const v24, 0x554995c8

    xor-int v12, v12, v24

    const v24, 0x27aa570b

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06e4\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x2f

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x6373

    const v24, 0x11462

    xor-int v12, v12, v24

    const v24, -0x7317df93

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v0, p0

    .line 2
    iget v12, v0, Ll/ۡ᩺ۘ;->ܺ:I

    packed-switch v12, :pswitch_data_0

    const-string v0, "\u1a76\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x69

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x4579

    const v24, 0x10e0435f

    xor-int v12, v12, v24

    const v24, -0x4c3f6d9

    goto/16 :goto_8

    :pswitch_0
    const-string v12, "\u1a79\u0733"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v22

    mul-int/lit8 v12, v12, -0x15

    xor-int v0, v12, v21

    mul-int/lit16 v0, v0, 0x257

    const v24, -0x1ebd8cd9

    xor-int v0, v0, v24

    const v24, -0x4fffd249

    xor-int v24, v12, v24

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "\u06d9\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0x6f3

    const v24, 0x66cc64af

    xor-int v12, v12, v24

    const v24, -0x605cafe8

    goto/16 :goto_8

    :sswitch_11
    const v0, 0xb44b

    const v13, 0xb44b

    goto :goto_4

    :sswitch_12
    const/16 v0, 0x65e6

    const/16 v13, 0x65e6

    :goto_4
    const-string v0, "\u06ec\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x7

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, -0x5b97

    const v24, -0x14c904db

    xor-int v12, v12, v24

    const v24, -0x14d4e431

    goto/16 :goto_8

    :sswitch_13
    add-int v0, v20, v25

    mul-int v0, v0, v0

    sub-int v0, v0, v19

    if-gez v0, :cond_a

    const-string v0, "\u06d6\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x194b

    const v24, -0x4dd54d00

    xor-int v12, v12, v24

    const v24, 0x692bba9a

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06eb\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x36b7

    const v24, -0x20054c3b    # -3.6129998E19f

    xor-int v12, v12, v24

    const v24, -0x3f2039ba

    goto/16 :goto_8

    :sswitch_14
    add-int/lit8 v19, v18, 0x1

    const/16 v25, 0x1

    .line 300
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u1a76\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x5

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0x59d1

    const v24, 0x30ab362b

    xor-int v12, v12, v24

    const v24, 0x6cb456cd

    goto/16 :goto_8

    :sswitch_15
    mul-int/lit8 v18, v20, 0x2

    .line 121
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_c

    :goto_5
    const-string v0, "\u1a73\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x4177

    const v24, 0x42265f58

    xor-int v12, v12, v24

    const v24, 0xd5498ff

    goto/16 :goto_8

    :cond_c
    const-string v0, "\u0733\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x77

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x151

    const v24, -0x37aaba93

    xor-int v12, v12, v24

    const v24, 0x28d67065

    goto :goto_8

    :sswitch_16
    aget-short v20, v16, v17

    .line 90
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_d

    :goto_6
    const-string v0, "\u05a8\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, 0x8d3

    const v24, 0x406ad14a

    xor-int v12, v12, v24

    const v24, -0x981b792

    goto :goto_8

    :cond_d
    const-string v0, "\u1a75\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0x5e49

    const v24, -0x271f720

    xor-int v12, v12, v24

    const v24, 0x1471f

    goto :goto_8

    :sswitch_17
    sget-object v16, Ll/ۡ᩺ۘ;->֫ۚᩴ:[S

    const/16 v17, 0x0

    .line 372
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_f

    :cond_e
    :goto_7
    const-string v0, "\u073f\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v12, v0, v22

    mul-int/lit16 v12, v12, -0x3d7d

    const v24, 0x279f96ba

    xor-int v12, v12, v24

    const v24, -0x710ed115

    goto :goto_8

    :cond_f
    const-string v0, "\u06dc\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v12, v0, v21

    mul-int/lit16 v12, v12, 0x1d9

    const v24, -0xd4e45ee

    xor-int v12, v12, v24

    const v24, 0x602381c1

    :goto_8
    xor-int v24, v0, v24

    move v0, v12

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7de58c1a -> :sswitch_11
        -0x7a856033 -> :sswitch_10
        -0x74edb617 -> :sswitch_16
        -0x6f752263 -> :sswitch_a
        -0x6a3d3aae -> :sswitch_f
        -0x6751b3a4 -> :sswitch_1
        -0x62a999cf -> :sswitch_e
        -0x61b7c8ca -> :sswitch_9
        -0x53ae7c31 -> :sswitch_2
        -0x516871c5 -> :sswitch_13
        -0x505efdc2 -> :sswitch_15
        -0x4a344c40 -> :sswitch_0
        -0x40f90a30 -> :sswitch_15
        -0x3caf9f52 -> :sswitch_8
        -0x39556ab8 -> :sswitch_12
        -0x348920db -> :sswitch_6
        -0x286d4a68 -> :sswitch_13
        -0x245ae407 -> :sswitch_9
        -0x1d9f8af9 -> :sswitch_5
        -0x19994f8e -> :sswitch_0
        -0x120af3a5 -> :sswitch_11
        -0x101183d0 -> :sswitch_16
        -0x6eee7ef -> :sswitch_17
        -0x48e34d7 -> :sswitch_7
        0x4e2838a -> :sswitch_b
        0x57bbcdf -> :sswitch_7
        0xcb8dad3 -> :sswitch_c
        0x1b92fad3 -> :sswitch_14
        0x1bd8b06b -> :sswitch_4
        0x1e735d7a -> :sswitch_8
        0x20a742b3 -> :sswitch_f
        0x216e5310 -> :sswitch_5
        0x296c8ef6 -> :sswitch_3
        0x31f535fd -> :sswitch_3
        0x324a5797 -> :sswitch_b
        0x3d4e194c -> :sswitch_c
        0x497a022a -> :sswitch_4
        0x4a84c3f9 -> :sswitch_10
        0x4aae4e0e -> :sswitch_1
        0x4e58521f -> :sswitch_2
        0x53f41366 -> :sswitch_d
        0x5bfefcff -> :sswitch_6
        0x5ef35edd -> :sswitch_a
        0x5fc038ab -> :sswitch_17
        0x61c8bc10 -> :sswitch_e
        0x69b6dcfe -> :sswitch_d
        0x7ced63ff -> :sswitch_14
        0x7fdbcac2 -> :sswitch_12
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
