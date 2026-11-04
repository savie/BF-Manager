.class public final synthetic Ll/᩸۟֫;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۢۧۤ:[S


# instance fields
.field public final synthetic ܰ:Ll/ܳ۟֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸۟֫;->ۢۧۤ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x25bcs
        0x6234s
        -0x696as
        0x4aa0s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ܳ۟֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۟֫;->ܰ:Ll/ܳ۟֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

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

    const v12, 0x48175ede

    sget v13, Ll/֨ۢ;->۬ܿܺ:I

    sget v14, Ll/ۖܰ;->۟֫ܽ:I

    const-string v15, "\u1a74\u06e1"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x4b

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x5e91

    const v17, -0x430c5cff

    xor-int v0, v0, v17

    const v17, 0x4ec5d40b    # 1.659504E9f

    xor-int v15, v15, v17

    move-object v4, v3

    move-object v11, v10

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0x48175ede

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x3d6b

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v16, v1

    const/16 v0, 0x4529

    const/16 v10, 0x4529

    goto/16 :goto_4

    .line 21
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    move-object/from16 v16, v1

    goto/16 :goto_5

    :cond_0
    :goto_2
    move-object/from16 v16, v1

    goto/16 :goto_7

    .line 113
    :sswitch_1
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_2

    :cond_1
    move-object/from16 v16, v1

    goto/16 :goto_6

    :cond_2
    move-object/from16 v0, p0

    goto/16 :goto_3

    .line 179
    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 143
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    goto :goto_1

    .line 63
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    return-void

    .line 223
    :sswitch_5
    invoke-static {v1, v2}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    .line 224
    invoke-virtual {v1}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return-void

    .line 223
    :sswitch_6
    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7ed48563

    xor-int/2addr v2, v0

    .line 165
    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06d8\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move-object/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x529

    const v17, 0x3ccee4e5

    xor-int v1, v1, v17

    const v17, 0x44610053    # 900.00507f

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v16, v1

    const/4 v0, 0x3

    .line 223
    invoke-static {v11, v12, v0, v10}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 85
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_4

    const-string v0, "\u0730\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x55

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x5e7d

    const v17, 0x1c03a2e8

    xor-int v1, v1, v17

    const v17, -0x3e3e7778

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x2389

    const v17, -0x6735c565

    xor-int v1, v1, v17

    const v17, -0x99c98b9

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v16, v1

    const/4 v12, 0x1

    .line 57
    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06e4\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x3d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0xdf7

    const v17, 0x7765872

    xor-int v1, v1, v17

    const v17, 0x62930b7f

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v16, v1

    .line 223
    sget-object v11, Ll/᩸۟֫;->ۢۧۤ:[S

    .line 31
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v0

    if-ltz v0, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u05a1\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x3

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x3065

    const v17, 0x5ac223e1

    xor-int v1, v1, v17

    const v17, -0x7e0f6677

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/᩸۟֫;->ܰ:Ll/ܳ۟֫;

    .line 223
    iget-object v1, v1, Ll/ܳ۟֫;->ܳ:Ll/ܺ۟֫;

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v16

    if-nez v16, :cond_7

    :goto_3
    const-string v16, "\u06ec\u06e8"

    invoke-static/range {v16 .. v16}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v13

    mul-int/lit16 v0, v0, 0x79cf

    const v17, 0x7af98ae

    xor-int v0, v0, v17

    const v17, 0x1dc7cbb4

    xor-int v16, v16, v17

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u05a1\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move-object/from16 v16, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x85f

    const v17, -0x5015728e

    xor-int v1, v1, v17

    const v17, 0x4586b7b2

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v16, v1

    const/16 v0, 0x16e3

    const/16 v10, 0x16e3

    :goto_4
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x39

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x5ff1

    const v17, -0x4ae938b3

    xor-int v1, v1, v17

    const v17, -0x51c4dcd

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v16, v1

    mul-int v0, v6, v9

    sub-int/2addr v0, v8

    if-gtz v0, :cond_8

    const-string v0, "\u1a7a\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x893

    const v17, -0x4629d566

    xor-int v1, v1, v17

    const v17, -0xfe4a1fc

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x57b1

    const v17, 0x6be8edf3

    xor-int v1, v1, v17

    const v17, 0x687d288e

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v16, v1

    const/16 v9, 0x7dc4

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06db\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x7541

    const v17, -0x41ac8504

    xor-int v1, v1, v17

    const v17, 0x4bc3738e    # 2.5618204E7f

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v16, v1

    add-int v0, v6, v7

    mul-int v8, v0, v0

    .line 222
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "\u06db\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x135b

    const v17, 0x1019a778

    xor-int v1, v1, v17

    const v17, 0x1270b424

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v16, v1

    aget-short v6, v4, v5

    const/16 v7, 0x1f71

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v0

    if-gtz v0, :cond_b

    :goto_5
    const-string v0, "\u06df\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x29af

    const v17, 0x7838b563

    xor-int v1, v1, v17

    const v17, -0x5f89ffe5

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u06db\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x5277

    const v17, 0x4d94edc0    # 3.1232614E8f

    xor-int v1, v1, v17

    const v17, 0x2a732f06

    goto :goto_8

    :sswitch_10
    move-object/from16 v16, v1

    const/4 v5, 0x0

    .line 112
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_c

    :goto_6
    const-string v0, "\u1a74\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x5465

    const v17, 0x10261346

    xor-int v1, v1, v17

    const v17, 0x7ab6f09

    goto :goto_8

    :cond_c
    const-string v0, "\u1a73\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0xd21

    const v17, -0x6b6e85fe

    xor-int v1, v1, v17

    const v17, -0x398d4053

    goto :goto_8

    :sswitch_11
    move-object/from16 v16, v1

    sget-object v4, Ll/᩸۟֫;->ۢۧۤ:[S

    .line 6
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_d

    :goto_7
    const-string v0, "\u1a79\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x6f4b

    const v17, 0x385181dc

    xor-int v1, v1, v17

    const v17, -0x472d46b4

    goto :goto_8

    :cond_d
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x6859

    const v17, -0x1761cbfc

    xor-int v1, v1, v17

    const v17, 0x167c41b7

    :goto_8
    xor-int v0, v0, v17

    move-object/from16 v18, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7952f342 -> :sswitch_5
        -0x78e228ee -> :sswitch_11
        -0x7317ca7e -> :sswitch_2
        -0x6f5a01ea -> :sswitch_c
        -0x650a68d4 -> :sswitch_1
        -0x63ac02ba -> :sswitch_a
        -0x611faa86 -> :sswitch_9
        -0x593db578 -> :sswitch_0
        -0x58ba6c77 -> :sswitch_8
        -0x559b0ba8 -> :sswitch_f
        -0x47897de2 -> :sswitch_b
        -0x41f29166 -> :sswitch_6
        -0x3a1cd400 -> :sswitch_d
        -0x384897f0 -> :sswitch_8
        -0x36e9f3d0 -> :sswitch_d
        -0x25fe9b32 -> :sswitch_a
        -0x25fc0c18 -> :sswitch_7
        -0x20903556 -> :sswitch_4
        -0xd4799a4 -> :sswitch_6
        -0x91ce5b5 -> :sswitch_10
        -0x353e3ca -> :sswitch_c
        0xc0f3ce7 -> :sswitch_5
        0x15479bcd -> :sswitch_f
        0x196f111e -> :sswitch_0
        0x1ed081fc -> :sswitch_9
        0x24ac3e58 -> :sswitch_e
        0x25e63293 -> :sswitch_3
        0x2f9028ad -> :sswitch_3
        0x32837345 -> :sswitch_10
        0x342aaed8 -> :sswitch_1
        0x35a70f8e -> :sswitch_b
        0x4e4f1519 -> :sswitch_7
        0x55a9f174 -> :sswitch_2
        0x621d130f -> :sswitch_e
        0x77b5f388 -> :sswitch_11
        0x7b108ac2 -> :sswitch_4
    .end sparse-switch
.end method
