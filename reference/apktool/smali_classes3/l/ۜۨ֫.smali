.class public final Ll/ۜۨ֫;
.super Ll/ۧᩳ᩷;
.source "O3YD"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֡᩵᩹:[S


# instance fields
.field public final synthetic ֡:Ll/ۤۛ֫;

.field public ۟:Landroid/widget/TextView;

.field public ܰ:Ll/ܰ᩺֫;

.field public ܿ:Ll/֨ܶ;

.field public ᩶:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜۨ֫;->֡᩵᩹:[S

    return-void

    :array_0
    .array-data 2
        0x17fes
        0x1f9as
        0xbbes
        -0x11bcs
        0x1cc0s
        0x2430s
        0x891s
        -0x388es
        0x5a57s
        0x5a58s
        0x5a52s
        0x5a44s
        0x5a59s
        0x5a5fs
        0x5a52s
        0x5a18s
        0x5a5fs
        0x5a58s
        0x5a42s
        0x5a53s
        0x5a58s
        0x5a42s
        0x5a18s
        0x5a57s
        0x5a55s
        0x5a42s
        0x5a5fs
        0x5a59s
        0x5a58s
        0x5a18s
        0x5a60s
        0x5a7fs
        0x5a73s
        0x5a61s
        0x1493s
        0x5bcs
        0x587s
        0x58es
        0x59ds
        0x58as
        0x58bs
        0x5cfs
        0x59fs
        0x59ds
        0x58as
        0x589s
        0x58as
        0x59ds
        0x58as
        0x581s
        0x58cs
        0x58as
        0x5cfs
        0x584s
        0x58as
        0x596s
        0x5d5s
        0x5cfs
    .end array-data
.end method

.method public constructor <init>(Ll/ۤۛ֫;Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x2e5b3123

    sget v11, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v12, Ll/ۗ᩺;->֡ۙۜ:I

    sget-object v13, Ll/ۜۨ֫;->֡᩵᩹:[S

    const/4 v14, 0x0

    aget-short v13, v13, v14

    add-int/lit16 v14, v13, 0xf03

    mul-int v14, v14, v14

    mul-int v13, v13, v13

    const v15, 0xe15a09

    add-int/2addr v13, v15

    add-int/2addr v13, v13

    sub-int/2addr v13, v14

    if-ltz v13, :cond_0

    const/16 v13, 0x7150

    goto :goto_0

    :cond_0
    const/16 v13, 0x1fc4

    :goto_0
    move-object/from16 v14, p1

    .line 260
    iput-object v14, v0, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    .line 261
    invoke-direct {v0, v1}, Ll/ۧᩳ᩷;-><init>(Landroid/view/View;)V

    const-string v14, "\u06e2\u06d6"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x2b73

    const v16, 0x35b646ec

    xor-int v15, v15, v16

    const v16, -0x56ee26b3

    :goto_1
    xor-int v14, v14, v16

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x3ef1

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v15

    xor-int/2addr v10, v14

    sparse-switch v10, :sswitch_data_0

    .line 263
    move-object v14, v4

    check-cast v14, Landroid/widget/TextView;

    iput-object v14, v0, Ll/ۜۨ֫;->᩶:Landroid/widget/TextView;

    sget v14, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v14, :cond_6

    goto/16 :goto_6

    .line 156
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v14, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v14, :cond_8

    goto/16 :goto_5

    :sswitch_1
    sget v14, Ll/ۖ;->ܿۚ֡:I

    if-ltz v14, :cond_c

    goto/16 :goto_3

    .line 237
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v14, Ll/ۧ;->ۨۗܰ:I

    if-gez v14, :cond_a

    goto/16 :goto_3

    .line 26
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_3

    .line 186
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 264
    :sswitch_5
    invoke-static {v1, v5}, Ll/ۖᩳ;->֨۬᩺(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/֨ܶ;

    iput-object v2, v0, Ll/ۜۨ֫;->ܿ:Ll/֨ܶ;

    .line 265
    invoke-static {v1, v0}, Ll/ۖۗ;->᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_6
    const v5, 0x7ea563d8

    xor-int/2addr v5, v7

    .line 204
    sget v14, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v14, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v14, "\u0730\u06e0"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x79

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5e75

    const v16, -0x3a25e840

    xor-int v15, v15, v16

    const v16, 0x388b5228

    goto :goto_1

    .line 263
    :sswitch_7
    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    .line 17
    sget v14, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v14, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v14, "\u073a\u06df"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x73

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x12af

    const v16, -0x4e7f16a8

    xor-int v15, v15, v16

    const v16, -0x29bbbf2

    goto/16 :goto_1

    :sswitch_8
    const/4 v6, 0x3

    .line 263
    invoke-static {v8, v9, v6, v13}, Ll/֡᩵;->ܽۛܰ([SIII)Ljava/lang/String;

    move-result-object v6

    .line 204
    sget v14, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v14, :cond_3

    goto :goto_2

    :cond_3
    const-string v14, "\u05a1\u0730"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5e51

    const v16, 0x10aafdf9

    xor-int v15, v15, v16

    const v16, -0x7cb418bb

    goto/16 :goto_1

    :sswitch_9
    const/4 v9, 0x1

    .line 20
    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v14, :cond_4

    :goto_2
    const-string v14, "\u06df\u06dc"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x25

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x74bf

    const v16, -0x5d43a620

    xor-int v15, v15, v16

    const v16, 0x6cb885ff

    goto/16 :goto_1

    :cond_4
    const-string v14, "\u0733\u06e1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x4539

    const v16, 0x6c9e9d71

    xor-int v15, v15, v16

    const v16, 0x228cbc9

    goto/16 :goto_1

    .line 263
    :sswitch_a
    sget-object v8, Ll/ۜۨ֫;->֡᩵᩹:[S

    .line 220
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v14

    if-nez v14, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v14, "\u06df\u1a79"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x35

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1a9b

    const v16, 0x17174b3f

    xor-int v15, v15, v16

    const v16, 0x6f0699d7

    goto/16 :goto_1

    :cond_6
    const-string v14, "\u06eb\u06d7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x3b

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x7e25

    const v16, -0x71de32f5

    xor-int v15, v15, v16

    const v16, 0x3b869042

    goto/16 :goto_1

    :sswitch_b
    const v4, 0x1020010

    .line 263
    invoke-static {v1, v4}, Ll/ۗܰ;->۟᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v4

    .line 110
    sget-boolean v14, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v14, :cond_7

    :goto_3
    const-string v14, "\u073a\u1a79"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0xd

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x2e3b

    const v16, 0x7d37d18b

    xor-int v15, v15, v16

    const v16, 0xd9fd5c

    goto/16 :goto_1

    :cond_7
    const-string v14, "\u05ab\u05a1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x2d

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x4cdf

    const v16, 0x3c0dcaab

    xor-int v15, v15, v16

    const v16, -0x3bda2b39

    goto/16 :goto_1

    .line 262
    :sswitch_c
    iput-object v3, v0, Ll/ۜۨ֫;->۟:Landroid/widget/TextView;

    .line 113
    sget v14, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v14, :cond_9

    :cond_8
    :goto_4
    const-string v14, "\u06db\u1a73"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x591b

    const v16, -0x76187fb5

    xor-int v15, v15, v16

    const v16, -0x79747c76

    goto/16 :goto_1

    :cond_9
    const-string v14, "\u06e1\u06e1"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x19

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x2083

    const v16, -0x7c42191a

    xor-int v15, v15, v16

    const v16, 0x819efd8

    goto/16 :goto_1

    .line 262
    :sswitch_d
    move-object v3, v2

    check-cast v3, Landroid/widget/TextView;

    sget v14, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v14, :cond_b

    :cond_a
    :goto_5
    const-string v14, "\u0733\u06d9"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x2f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x777f

    const v16, 0x7d11ec34

    xor-int v15, v15, v16

    const v16, -0x36b74b86

    goto/16 :goto_1

    :cond_b
    const-string v14, "\u073d\u06dc"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x266f

    const v16, 0x76915a3e

    xor-int v15, v15, v16

    const v16, -0x402feb5f

    goto/16 :goto_1

    :sswitch_e
    const v2, 0x1020016

    invoke-static {v1, v2}, Ll/ۗܰ;->۟᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v2

    .line 42
    sget v14, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v14, :cond_d

    :cond_c
    :goto_6
    const-string v14, "\u06da\u06e0"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x9

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2a9d

    const v16, 0x65761fd3

    xor-int v15, v15, v16

    const v16, 0xa82b786

    goto/16 :goto_1

    :cond_d
    const-string v14, "\u1a74\u06d8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x43

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x553

    const v16, 0x6962f351

    xor-int v15, v15, v16

    const v16, -0x1fd564c7

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f4e3d27 -> :sswitch_7
        -0x7edc4d02 -> :sswitch_c
        -0x6f800f5b -> :sswitch_e
        -0x6c13d013 -> :sswitch_9
        -0x68c71c82 -> :sswitch_8
        -0x672c6d4b -> :sswitch_9
        -0x483c6b05 -> :sswitch_1
        -0x47367200 -> :sswitch_3
        -0x4247ec76 -> :sswitch_7
        -0x387a3a92 -> :sswitch_2
        -0x1bebe0d2 -> :sswitch_d
        -0x18146d75 -> :sswitch_0
        -0xb90d1f8 -> :sswitch_6
        -0x7088c77 -> :sswitch_3
        -0x6b5082d -> :sswitch_a
        -0x612db48 -> :sswitch_5
        0xdd60bc5 -> :sswitch_5
        0xfa2ee16 -> :sswitch_6
        0x139ba3cb -> :sswitch_1
        0x3c01cbc0 -> :sswitch_e
        0x3c12dcd0 -> :sswitch_2
        0x41618886 -> :sswitch_c
        0x60943565 -> :sswitch_a
        0x66148f7f -> :sswitch_4
        0x671b4b14 -> :sswitch_d
        0x6a8ffdd0 -> :sswitch_8
        0x6cf68387 -> :sswitch_0
        0x6ec04a82 -> :sswitch_b
        0x6ef4acae -> :sswitch_4
        0x795fbf17 -> :sswitch_b
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/ۜۨ֫;Ljava/util/List;Ljava/lang/String;Ll/᩶᩺֫;Ll/ܿܰ֫;Landroid/content/DialogInterface;I)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x6bdfc378

    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v6, "\u0733\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x613f

    const v8, 0x4f2f7c8f

    xor-int/2addr v7, v8

    const v8, 0x1581e011

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3821

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 396
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_d

    goto/16 :goto_3

    .line 423
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_7

    .line 139
    :sswitch_1
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_3

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto/16 :goto_5

    .line 318
    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    .line 435
    :sswitch_4
    iget-object v2, p3, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    goto :goto_1

    .line 436
    :sswitch_5
    iget-object v6, p0, Ll/ۜۨ֫;->᩶:Landroid/widget/TextView;

    invoke-static {v6, v2}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    iget-object v6, p0, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    invoke-direct {p0, p4, v6, v1}, Ll/ۜۨ֫;->ۙ(Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/Object;)V

    goto :goto_2

    .line 434
    :sswitch_6
    iget-object v6, p0, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    invoke-static {v6}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    iget-object v7, p3, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-interface {v6, v7, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 435
    iget-object v6, v0, Ll/ܿ᩺֫;->ۤ:Ljava/lang/CharSequence;

    if-nez v6, :cond_0

    const-string v6, "\u06e4\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1225

    const v8, -0x70a9a578

    xor-int/2addr v7, v8

    const v8, -0x621dad95

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_1
    const-string v6, "\u1a7b\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6bb

    const v8, 0x5235c9eb

    xor-int/2addr v7, v8

    const v8, 0x249107a7

    goto/16 :goto_0

    :sswitch_7
    return-void

    .line 431
    :sswitch_8
    invoke-interface {p5}, Landroid/content/DialogInterface;->dismiss()V

    .line 432
    invoke-static {p1, p6}, Ll/֫֡;->᩻ۚ᩻(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺֫;

    .line 433
    iget-object v1, v0, Ll/ܿ᩺֫;->᩸:Ljava/lang/String;

    invoke-static {p2, v1}, Ll/ܿܺ᩺;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "\u1a74\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x49

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x278d

    const v8, 0x72a8bf03

    xor-int/2addr v7, v8

    const v8, -0x26097193

    goto/16 :goto_0

    :cond_1
    :goto_2
    const-string v6, "\u1a78\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5ed

    const v8, 0x5c970d1b

    xor-int/2addr v7, v8

    const v8, -0x3b14a733

    goto/16 :goto_0

    :sswitch_9
    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v6, :cond_2

    goto :goto_4

    :cond_2
    const-string v6, "\u06e8\u073a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xa95

    const v8, -0x606265af

    xor-int/2addr v7, v8

    const v8, -0x199e2efb

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v6, :cond_4

    :cond_3
    :goto_3
    const-string v6, "\u06dc\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x15f7

    const v8, -0x65b93960

    xor-int/2addr v7, v8

    const v8, -0x26fb7ae

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06e0\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x63af

    const v8, -0x73ae8ffc

    xor-int/2addr v7, v8

    const v8, -0x3e8b2506

    goto/16 :goto_0

    .line 149
    :sswitch_b
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v6, "\u06eb\u05ab"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x49

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4d3d

    const v8, -0x1d09a127

    xor-int/2addr v7, v8

    const v8, -0x42fc97b3

    goto/16 :goto_0

    .line 144
    :sswitch_c
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v6

    if-nez v6, :cond_6

    :goto_4
    const-string v6, "\u06e2\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x66e1

    const v8, 0x141b9e94

    xor-int/2addr v7, v8

    const v8, -0x40888a8

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06dc\u073d"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x56a9

    const v8, 0x7e2037cb

    xor-int/2addr v7, v8

    const v8, -0x14ad2af0

    goto/16 :goto_0

    .line 106
    :sswitch_d
    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v6, :cond_7

    goto :goto_5

    :cond_7
    const-string v6, "\u06eb\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6da7

    const v8, -0xeb22f37

    xor-int/2addr v7, v8

    const v8, 0x4b4484a8    # 1.2879016E7f

    goto/16 :goto_0

    .line 155
    :sswitch_e
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u1a78\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3d0b

    const v8, -0x36f76c38    # -559420.5f

    xor-int/2addr v7, v8

    const v8, 0x7788a686

    goto/16 :goto_0

    .line 133
    :sswitch_f
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v6

    if-nez v6, :cond_9

    :goto_5
    const-string v6, "\u0736\u1a75"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7a45

    const v8, -0x13129b84

    xor-int/2addr v7, v8

    const v8, -0x7f91873e

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e8\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3ed1

    const v8, 0x24f4313d

    xor-int/2addr v7, v8

    const v8, 0x27bf701

    goto/16 :goto_0

    .line 267
    :sswitch_10
    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_a

    goto :goto_6

    :cond_a
    const-string v6, "\u1a78\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xedd

    const v8, -0x3bec5c93

    xor-int/2addr v7, v8

    const v8, 0x23ffff3d

    goto/16 :goto_0

    .line 55
    :sswitch_11
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    :goto_6
    const-string v6, "\u06e7\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x63

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1f5b

    const v8, -0x3045bfa6

    xor-int/2addr v7, v8

    const v8, -0x33e49e4f    # -4.0732356E7f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u0730\u06d7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4ac9

    const v8, -0x7f891fe3

    xor-int/2addr v7, v8

    const v8, -0x452c405e

    goto/16 :goto_0

    .line 113
    :sswitch_12
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v6

    if-eqz v6, :cond_e

    :cond_d
    :goto_7
    const-string v6, "\u06e1\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x127d

    const v8, -0x122f8f1c

    xor-int/2addr v7, v8

    const v8, 0x7b1cf394

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u073a\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x20a3

    const v8, 0x4a81d78d    # 4254662.5f

    xor-int/2addr v7, v8

    const v8, 0x2fa4db98

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7737a650 -> :sswitch_b
        -0x6e915a39 -> :sswitch_2
        -0x63a6803e -> :sswitch_4
        -0x5bd01890 -> :sswitch_c
        -0x56b89551 -> :sswitch_e
        -0x4fc9082b -> :sswitch_7
        -0x4a556a8b -> :sswitch_9
        -0x4500e3e5 -> :sswitch_3
        -0x3fd9c1ce -> :sswitch_11
        -0x3f78e16b -> :sswitch_e
        -0x3f60046b -> :sswitch_11
        -0x3cc9b7df -> :sswitch_12
        -0x2f2a1538 -> :sswitch_4
        -0x209cb320 -> :sswitch_10
        -0x1c8c502b -> :sswitch_0
        -0x16731b99 -> :sswitch_d
        -0x119037e2 -> :sswitch_8
        -0x1b3ed26 -> :sswitch_c
        0xe6a332d -> :sswitch_f
        0x14d51846 -> :sswitch_6
        0x19bde170 -> :sswitch_2
        0x1c0d0727 -> :sswitch_d
        0x1d7144fe -> :sswitch_3
        0x264d368f -> :sswitch_7
        0x27cc9fc6 -> :sswitch_10
        0x2bf0915c -> :sswitch_5
        0x30dab0c3 -> :sswitch_1
        0x32f141e9 -> :sswitch_a
        0x33f7d1d2 -> :sswitch_b
        0x44e5b3b9 -> :sswitch_8
        0x59092e26 -> :sswitch_f
        0x5c55bbf0 -> :sswitch_1
        0x615f9260 -> :sswitch_12
        0x62369d93 -> :sswitch_6
        0x65ccf77d -> :sswitch_9
        0x66e86ea4 -> :sswitch_0
        0x70dd09f6 -> :sswitch_a
        0x7e00beaf -> :sswitch_5
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ۜۨ֫;Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/String;)V
    .locals 6

    const v0, 0x6bf51021

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v3, "\u1a75\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d61

    const v5, -0x63a696c3

    xor-int/2addr v4, v5

    const v5, -0x61b71077

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5367

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    .line 0
    :sswitch_0
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v3, :cond_5

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_4

    .line 0
    :sswitch_2
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    return-void

    :sswitch_5
    invoke-direct {p0, p1, p2, p3}, Ll/ۜۨ֫;->ۙ(Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/Object;)V

    return-void

    :sswitch_6
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6021

    const v5, -0x6c857e52

    xor-int/2addr v4, v5

    const v5, 0x2467a042

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06ec\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x62f3

    const v5, -0x2f96e442

    xor-int/2addr v4, v5

    const v5, 0x433e14f7

    goto :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x606b

    const v5, -0x5284ee8b

    xor-int/2addr v4, v5

    const v5, 0x293fb684

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x587f

    const v5, 0x258b6ab8

    xor-int/2addr v4, v5

    const v5, -0x3f8b17e1

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x34d3

    const v5, -0x6b2c8f62

    xor-int/2addr v4, v5

    const v5, -0x77dbd391

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d7d

    const v5, 0x2bf043d3

    xor-int/2addr v4, v5

    const v5, -0x5de29863

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7bcf

    const v5, 0xcc9ae9d

    xor-int/2addr v4, v5

    const v5, 0x57573377

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u06da\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31cf

    const v5, 0x7199651e

    xor-int/2addr v4, v5

    const v5, 0x6c72ed46

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d6\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73b9

    const v5, -0x2b6f0681

    xor-int/2addr v4, v5

    const v5, 0x7a24d997

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_9

    :cond_8
    const-string v3, "\u073a\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6cab

    const v5, -0x7a3fed54

    xor-int/2addr v4, v5

    const v5, -0x321e5bb5

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073f\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x49f1

    const v5, 0x3457d411

    xor-int/2addr v4, v5

    const v5, -0x496081f6

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5af7

    const v5, 0x56de723c

    xor-int/2addr v4, v5

    const v5, -0x65ac9186

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7167

    const v5, -0x32547797

    xor-int/2addr v4, v5

    const v5, -0x21c379dc

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e2\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7e5f

    const v5, -0x70a1bd13

    xor-int/2addr v4, v5

    const v5, -0x5c14b88c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6611

    const v5, -0x31caae5d    # -7.6050656E8f

    xor-int/2addr v4, v5

    const v5, -0x7106a666

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75a30d09 -> :sswitch_a
        -0x6394e9a9 -> :sswitch_1
        -0x59e78080 -> :sswitch_3
        -0x58a828bb -> :sswitch_c
        -0x4bfb6cc4 -> :sswitch_5
        -0x43d06100 -> :sswitch_7
        -0x40b0662f -> :sswitch_7
        -0x408e9048 -> :sswitch_4
        -0x2eae7ee2 -> :sswitch_8
        -0x29d1d4bd -> :sswitch_6
        -0x1cbb5c3c -> :sswitch_e
        -0x15bbf53f -> :sswitch_a
        -0x14604435 -> :sswitch_5
        -0xbef6261 -> :sswitch_0
        0x1d4ceb -> :sswitch_b
        0x4440ef0 -> :sswitch_2
        0xa33bb33 -> :sswitch_0
        0xb5b1a36 -> :sswitch_e
        0x1844f962 -> :sswitch_9
        0x187a1cd1 -> :sswitch_6
        0x1e99a019 -> :sswitch_d
        0x238f57c8 -> :sswitch_b
        0x2870f6e1 -> :sswitch_c
        0x29a1c21b -> :sswitch_2
        0x326f1358 -> :sswitch_9
        0x327dd894 -> :sswitch_1
        0x3d27c89c -> :sswitch_d
        0x4664032e -> :sswitch_4
        0x561acad0 -> :sswitch_8
        0x58c5ca1c -> :sswitch_3
    .end sparse-switch
.end method

.method private ۙ(Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/Object;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0xbe0aae9

    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v6, "\u1a76\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x505b

    const v8, -0x665e5904

    xor-int/2addr v7, v8

    const v8, -0xbad20b

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x5b0f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 481
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v6

    if-nez v6, :cond_d

    goto/16 :goto_6

    .line 167
    :sswitch_0
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v6, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v6, :cond_e

    goto :goto_1

    .line 518
    :sswitch_2
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v6, :cond_5

    goto/16 :goto_7

    .line 319
    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v6, :cond_10

    goto/16 :goto_5

    .line 477
    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_5

    :sswitch_5
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :sswitch_6
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    :goto_1
    const-string v6, "\u0736\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x49

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6139

    const v8, -0x4979a54d

    xor-int/2addr v7, v8

    const v8, -0x6829da2b

    goto :goto_0

    .line 249
    :sswitch_7
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    :sswitch_8
    return-void

    .line 491
    :sswitch_9
    :try_start_0
    new-instance v6, Ll/ۙۛ֫;

    invoke-direct {v6, v0, p2}, Ll/ۙۛ֫;-><init>(Ll/ۤۛ֫;Ll/ܰ᩺֫;)V

    iput-object v6, p2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    goto :goto_2

    .line 493
    :sswitch_a
    invoke-static {v0}, Ll/ۤۛ֫;->᩷(Ll/ۤۛ֫;)Ll/ۨ᩺֫;

    move-result-object v6

    iget-object v6, v6, Ll/ۨ᩺֫;->ᩴ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

    iget-object v7, p2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    check-cast v7, Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;

    invoke-interface {v6, p1, v7, p3}, Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;->onChange(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "\u1a7b\u06d7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xd57

    const v8, 0x22697ce4

    xor-int/2addr v7, v8

    const v8, 0x74eb48ca

    goto/16 :goto_0

    .line 496
    :sswitch_b
    invoke-static {v0}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v6

    invoke-interface {v6, v2}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    const/4 v6, 0x0

    .line 546
    invoke-static {v0, v2, v6}, Ll/ۗ֨;->ۛۡܰ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_3

    :sswitch_c
    if-nez v1, :cond_0

    const-string v6, "\u073a\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x193

    const v8, 0x23fe7395

    xor-int/2addr v7, v8

    const v8, 0xfe2f9dc

    goto/16 :goto_0

    :cond_0
    :goto_2
    const-string v6, "\u06e8\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x4d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x49d7

    const v8, 0xcc3cf2

    xor-int/2addr v7, v8

    const v8, -0xd6127d7

    goto/16 :goto_0

    .line 490
    :sswitch_d
    :try_start_1
    iget-object v1, p2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "\u06eb\u06da"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x59eb

    const v8, 0x108375c4

    xor-int/2addr v7, v8

    const v8, -0x761dc30c

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v6, "\u06e7\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x60f1

    const v8, 0x72c5ff33

    xor-int/2addr v7, v8

    const v8, -0x4149c671

    goto/16 :goto_0

    :sswitch_e
    return-void

    .line 488
    :sswitch_f
    iget-object v0, p0, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    invoke-static {v0}, Ll/ۤۛ֫;->᩷(Ll/ۤۛ֫;)Ll/ۨ᩺֫;

    move-result-object v6

    iget-object v6, v6, Ll/ۨ᩺֫;->ᩴ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

    if-eqz v6, :cond_1

    const-string v6, "\u1a77\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2715

    const v8, 0x213d791c

    xor-int/2addr v7, v8

    const v8, 0x7980da57

    goto/16 :goto_0

    :cond_1
    :goto_3
    const-string v6, "\u0736\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x1b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2563

    const v8, 0x33d7dec7

    xor-int/2addr v7, v8

    const v8, -0x1f882cf2

    goto/16 :goto_0

    .line 424
    :sswitch_10
    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v6, "\u1a78\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x9c5

    const v8, -0x6a0d86da

    xor-int/2addr v7, v8

    const v8, 0x2a4e5c3b

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v6, :cond_4

    :cond_3
    const-string v6, "\u06db\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x65

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x442d

    const v8, -0x29709fa0

    xor-int/2addr v7, v8

    const v8, 0x2447b860

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u1a78\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3a37

    const v8, -0x4f961e10

    xor-int/2addr v7, v8

    const v8, 0x3aee2118

    goto/16 :goto_0

    .line 224
    :sswitch_12
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_6

    :cond_5
    const-string v6, "\u06e4\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x777b

    const v8, 0x4fd373db    # 7.0951706E9f

    xor-int/2addr v7, v8

    const v8, -0x3f9d30e9

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e8\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x73eb

    const v8, 0x52a26503

    xor-int/2addr v7, v8

    const v8, -0x25b2ce52

    goto/16 :goto_0

    :sswitch_13
    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_7

    :goto_4
    const-string v6, "\u06db\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b8f

    const v8, 0x7f8ba19a

    xor-int/2addr v7, v8

    const v8, 0x1022d833

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a73\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x518d

    const v8, 0x69466366

    xor-int/2addr v7, v8

    const v8, 0xc28bebb    # 1.2999645E-31f

    goto/16 :goto_0

    .line 160
    :sswitch_14
    sget-boolean v6, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u06e2\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2621

    const v8, -0x35331cfa    # -6713731.0f

    xor-int/2addr v7, v8

    const v8, -0x7be876c5

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v6

    if-gtz v6, :cond_a

    :cond_9
    :goto_5
    const-string v6, "\u1a7b\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x375

    const v8, 0x6f843f39

    xor-int/2addr v7, v8

    const v8, -0x16211f0c

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0733\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x21d1

    const v8, -0x49a3cbe5

    xor-int/2addr v7, v8

    const v8, 0x22f5fcc6

    goto/16 :goto_0

    .line 537
    :sswitch_16
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_c

    :cond_b
    const-string v6, "\u073f\u1a75"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x69a7

    const v8, -0xac4aee4

    xor-int/2addr v7, v8

    const v8, 0x511a6463

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e1\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4d37

    const v8, 0x4c6ae0d6    # 6.157193E7f

    xor-int/2addr v7, v8

    const v8, -0xfb7f3eb

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u073d\u1a74"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2287

    const v8, 0x5dcadaa6

    xor-int/2addr v7, v8

    const v8, -0x2843d781

    goto/16 :goto_0

    .line 239
    :sswitch_17
    sget v6, Ll/ۖ;->ܿۚ֡:I

    if-ltz v6, :cond_f

    :cond_e
    :goto_6
    const-string v6, "\u06d6\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xbff

    const v8, -0x327c3661

    xor-int/2addr v7, v8

    const v8, 0x1836f696

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u06e8\u06dc"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x49af

    const v8, -0x1a198e54

    xor-int/2addr v7, v8

    const v8, -0x78b36de4

    goto/16 :goto_0

    .line 278
    :sswitch_18
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    :goto_7
    const-string v6, "\u05ab\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x741b

    const v8, 0x2268b003

    xor-int/2addr v7, v8

    const v8, 0x65d742c5

    goto/16 :goto_0

    :cond_11
    const-string v6, "\u06eb\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7703

    const v8, 0x48e7866c

    xor-int/2addr v7, v8

    const v8, -0x7ee56b5e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f15e1cb -> :sswitch_b
        -0x79179a39 -> :sswitch_18
        -0x78b74922 -> :sswitch_d
        -0x7745210e -> :sswitch_4
        -0x74677d57 -> :sswitch_18
        -0x69ceb244 -> :sswitch_10
        -0x69b3bb0e -> :sswitch_6
        -0x634bad86 -> :sswitch_5
        -0x622d0961 -> :sswitch_e
        -0x5c9db92f -> :sswitch_16
        -0x52a89a81 -> :sswitch_9
        -0x516c8729 -> :sswitch_11
        -0x4ce97d38 -> :sswitch_e
        -0x4b435483 -> :sswitch_3
        -0x3b1f2116 -> :sswitch_7
        -0x38aa83ac -> :sswitch_1
        -0x381dd6b1 -> :sswitch_f
        -0x2f640006 -> :sswitch_a
        -0x257305c1 -> :sswitch_13
        -0x19c7c1d4 -> :sswitch_15
        -0x11d42946 -> :sswitch_15
        -0xb7d72bf -> :sswitch_b
        -0xa3b0fcf -> :sswitch_17
        -0x6a9ac68 -> :sswitch_7
        -0x2c38a3e -> :sswitch_c
        -0x2582aae -> :sswitch_3
        -0x88a935 -> :sswitch_4
        0x215eb2e -> :sswitch_10
        0x5bc80c2 -> :sswitch_0
        0x11bd3d91 -> :sswitch_11
        0x20c26e15 -> :sswitch_d
        0x256fcc8c -> :sswitch_2
        0x340e2fc6 -> :sswitch_c
        0x352936a0 -> :sswitch_0
        0x35db6d72 -> :sswitch_17
        0x3edc1a80 -> :sswitch_8
        0x4334ecef -> :sswitch_16
        0x444170af -> :sswitch_1
        0x461f9928 -> :sswitch_12
        0x472d83f7 -> :sswitch_13
        0x48032450 -> :sswitch_12
        0x4c554e83 -> :sswitch_5
        0x4d40f468 -> :sswitch_f
        0x520245b1 -> :sswitch_2
        0x5433ba74 -> :sswitch_14
        0x5c379431 -> :sswitch_8
        0x5f6774ac -> :sswitch_a
        0x68c17328 -> :sswitch_14
        0x7b3c97da -> :sswitch_9
        0x7f926a9b -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 60

    move-object/from16 v7, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const v50, -0x1be7a09f

    sget v51, Ll/ۗ֨;->᩹ۜۡ:I

    sget v52, Ll/ۖ;->ܿۚ֡:I

    const-string v53, "\u0733\u1a76"

    invoke-static/range {v53 .. v53}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v53

    sub-int v53, v51, v53

    mul-int/lit8 v53, v53, -0x63

    xor-int v0, v53, v52

    mul-int/lit16 v0, v0, -0x7ddb

    const v54, 0xa5e285

    xor-int v0, v0, v54

    const v54, -0x242cfe28

    xor-int v53, v53, v54

    move-object v9, v1

    move-object/from16 p1, v5

    move-object/from16 v48, v18

    move-object/from16 v37, v28

    move-object/from16 v33, v29

    move-object/from16 v7, v34

    move-object/from16 v55, v36

    move-object/from16 v8, v42

    const/4 v5, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    move-object/from16 v42, v13

    move-object/from16 v18, v15

    move-object/from16 v29, v19

    move-object/from16 v28, v23

    move-object/from16 v36, v26

    move-object/from16 v34, v27

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v27, 0x0

    move-object/from16 v23, v3

    move-object v3, v14

    move-object/from16 v19, v17

    move-object/from16 v26, v20

    move-object/from16 v14, v38

    const/16 v38, 0x0

    move-object/from16 v20, v6

    move-object/from16 v17, v12

    move-object/from16 v6, v41

    move-object v12, v4

    move-object/from16 v41, v11

    move-object/from16 v11, v40

    move-object/from16 v4, v49

    const/16 v40, 0x0

    move-object/from16 v58, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v10

    move-object/from16 v10, v58

    :goto_0
    xor-int v1, v50, v52

    mul-int/lit16 v1, v1, -0x66b5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v0, v1

    xor-int v50, v53, v0

    sparse-switch v50, :sswitch_data_0

    move-object/from16 v29, v7

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v7, p0

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 447
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    check-cast v0, Ll/֡᩺֫;

    .line 448
    iget-object v3, v7, Ll/ۜۨ֫;->ܿ:Ll/֨ܶ;

    invoke-static {v3}, Ll/۬;->۫ܳ᩷(Ljava/lang/Object;)Z

    move-result v21

    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_18

    move-object/from16 v40, v1

    move-object/from16 v36, v23

    move/from16 v48, v33

    move/from16 v57, v38

    move-object/from16 v12, v54

    move/from16 v23, v2

    move-object/from16 v54, v5

    move-object/from16 v38, v6

    move-object/from16 v58, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v58

    goto/16 :goto_28

    .line 392
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_1

    :cond_0
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    goto/16 :goto_37

    :cond_1
    const-string v0, "\u05a8\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x59ad

    const v49, 0x1182c89e

    xor-int v1, v1, v49

    const v49, 0x642d1428

    goto/16 :goto_6

    .line 108
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    goto/16 :goto_36

    :cond_3
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v0, v29

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v29, v7

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v7, p0

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    goto/16 :goto_28

    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v0, v22

    move-object/from16 v22, v28

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v28, v10

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v10, v27

    move-object/from16 v27, v34

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    :goto_1
    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    goto/16 :goto_30

    .line 287
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_2
    const-string v0, "\u06dc\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x5e49

    const v49, -0x6ea2e8a9

    xor-int v1, v1, v49

    const v49, 0xf852f0a

    goto/16 :goto_6

    .line 352
    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object/from16 v0, p1

    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    goto/16 :goto_2b

    :sswitch_5
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_2

    goto :goto_3

    :sswitch_6
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v0, :cond_0

    goto :goto_3

    .line 147
    :sswitch_7
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_3
    const-string v0, "\u06d9\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x7ce3

    const v49, 0x633dd5ec

    xor-int v1, v1, v49

    const v49, -0x56236b46

    goto/16 :goto_6

    :sswitch_8
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    goto/16 :goto_5

    .line 193
    :sswitch_9
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    :sswitch_a
    return-void

    .line 546
    :sswitch_b
    invoke-static {v9, v8, v12}, Ll/ۗ֨;->ۛۡܰ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v28

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    goto/16 :goto_19

    .line 478
    :sswitch_c
    invoke-static {v9}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    invoke-interface {v0, v6}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    move-object v8, v6

    goto :goto_4

    .line 468
    :sswitch_d
    invoke-static {v9}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    invoke-interface {v0, v11}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    move-object v8, v11

    :goto_4
    const-string v0, "\u06da\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v51

    mul-int/lit8 v0, v0, 0x5d

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x503d

    const v49, -0x6f546793

    xor-int v1, v1, v49

    const v49, 0x1c55a530

    goto/16 :goto_6

    :sswitch_e
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    goto/16 :goto_13

    .line 426
    :sswitch_f
    invoke-static {v10, v13}, Ll/֫֡;->֡ۡۚ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺֫;

    iget-object v0, v0, Ll/ܿ᩺֫;->᩷:Ljava/lang/CharSequence;

    aput-object v0, v7, v13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v0, v35

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move/from16 v35, v5

    move-object/from16 v39, v6

    move-object v12, v7

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v7, p0

    move-object v5, v2

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    goto/16 :goto_f

    :sswitch_10
    const v0, 0x7ef1b562

    xor-int v0, v43, v0

    .line 441
    invoke-static {v14, v0, v12}, Ll/ۖۙ;->ۚ᩷᩹(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 442
    invoke-static {v14}, Ll/֨ܿ;->᩺ܳۘ(Ljava/lang/Object;)Ll/۠ۖۧ;

    return-void

    :sswitch_11
    const/4 v0, 0x5

    const/4 v1, 0x3

    .line 430
    invoke-static {v4, v0, v1, v5}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v43

    .line 472
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_8

    :goto_5
    const-string v0, "\u06e0\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x610b

    const v49, -0x258e2db4

    xor-int v1, v1, v49

    const v49, -0x186cd118

    goto :goto_6

    :cond_8
    const-string v0, "\u06e1\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x75eb

    const v49, -0x654d9714

    xor-int v1, v1, v49

    const v49, 0x3e41d6a4

    :goto_6
    xor-int v53, v0, v49

    goto/16 :goto_3d

    .line 429
    :sswitch_12
    new-instance v0, Ll/ۖۨ֫;

    move-object/from16 v4, v48

    move-object v1, v0

    move-object/from16 v48, v2

    move-object/from16 v2, p0

    move-object/from16 v49, v8

    move-object v8, v3

    move-object v3, v10

    move-object/from16 v53, v11

    move-object/from16 v11, v42

    move-object/from16 v42, v8

    move-object v8, v4

    move-object/from16 v4, v19

    move-object/from16 v54, v12

    move v12, v5

    move-object/from16 v58, v41

    move-object/from16 v41, v8

    move-object/from16 v8, v58

    move-object/from16 v5, v48

    move/from16 v56, v39

    move-object/from16 v39, v6

    move-object/from16 v6, v40

    invoke-direct/range {v1 .. v6}, Ll/ۖۨ֫;-><init>(Ll/ۜۨ֫;Ljava/util/ArrayList;Ljava/lang/String;Ll/᩶᩺֫;Ll/ܿܰ֫;)V

    move/from16 v6, v38

    .line 430
    invoke-virtual {v14, v7, v6, v0}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    sget-object v4, Ll/ۜۨ֫;->֡᩵᩹:[S

    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_9

    const-string v0, "\u0736\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x2bab

    const v2, 0x74dc3dbf

    xor-int/2addr v1, v2

    const v2, 0x562ea4c7

    goto :goto_7

    :cond_9
    const-string v0, "\u073a\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x1fa7

    const v2, 0xcaeda26

    xor-int/2addr v1, v2

    const v2, 0x5bb00202

    :goto_7
    xor-int/2addr v0, v2

    move/from16 v38, v6

    move v5, v12

    move-object/from16 v6, v39

    move-object/from16 v3, v42

    move-object/from16 v2, v48

    move-object/from16 v12, v54

    move/from16 v39, v56

    move-object/from16 v42, v11

    move-object/from16 v48, v41

    move-object/from16 v11, v53

    move/from16 v53, v0

    move v0, v1

    move-object/from16 v41, v8

    move-object/from16 v8, v49

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v48, v2

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move/from16 v6, v38

    .line 428
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v14, Ll/ۖۖۧ;

    invoke-direct {v14, v9}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    move-object/from16 v5, v48

    .line 428
    iget-object v0, v5, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 429
    invoke-static {v14, v0}, Ll/֨ۨ;->ۛ᩻᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_a

    move/from16 v57, v6

    move/from16 v0, v22

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v22, v28

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v28, v10

    move/from16 v35, v12

    move-object/from16 v36, v23

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v12, v54

    move-object/from16 v54, v5

    goto/16 :goto_1

    :cond_a
    const-string v0, "\u1a7b\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x2f9b

    const v2, -0x3f5d0273

    xor-int/2addr v1, v2

    const v2, -0x6805a414

    xor-int/2addr v0, v2

    move-object v2, v5

    move/from16 v38, v6

    move v5, v12

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move-object/from16 v3, v42

    move-object/from16 v12, v54

    move/from16 v39, v56

    move-object/from16 v41, v8

    move-object/from16 v42, v11

    move-object/from16 v8, v49

    goto/16 :goto_3b

    :sswitch_14
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v3, v37

    move/from16 v6, v38

    move-object v5, v2

    .line 473
    :try_start_0
    iget-object v0, v3, Ll/۟᩺֫;->֫:Ljava/lang/String;

    invoke-static {v0}, Ll/᩵᩺֫;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 474
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Ll/ۜۨ֫;->֡᩵᩹:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v37, v4

    const/16 v4, 0x8

    move/from16 v38, v6

    const/16 v6, 0x1a

    :try_start_1
    invoke-static {v2, v4, v6, v12}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v0, 0x10000000

    .line 475
    invoke-static {v1, v0}, Ll/ۗ᩵;->ܰۜ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 476
    invoke-static {v9, v1}, Ll/֫ۤ;->ܳ᩷֡(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "\u073f\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x52e7

    const v2, -0x673aacde

    xor-int/2addr v1, v2

    const v2, -0x69e75ae9

    xor-int/2addr v0, v2

    move-object v2, v5

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object/from16 v37, v4

    move/from16 v38, v6

    :goto_8
    move-object v6, v0

    const-string v0, "\u06ec\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x3989

    const v2, 0x159c3438

    xor-int/2addr v1, v2

    const v2, 0x4fcaf596

    xor-int/2addr v0, v2

    move-object v2, v5

    move v5, v12

    move-object/from16 v4, v37

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    .line 418
    invoke-static {v10, v15}, Ll/֫֡;->֡ۡۚ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺֫;

    iget-object v0, v0, Ll/ܿ᩺֫;->᩸:Ljava/lang/String;

    move-object/from16 v6, v36

    invoke-static {v6, v0}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    move/from16 v38, v15

    move-object/from16 v4, v29

    move-object/from16 v2, v34

    move-object/from16 v1, v40

    move-object/from16 v29, v7

    move-object/from16 v34, v33

    move/from16 v33, v35

    move-object/from16 v7, p0

    move/from16 v35, v12

    goto/16 :goto_14

    :cond_b
    const-string v0, "\u06e2\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v52, v0

    mul-int/lit8 v0, v0, 0x3f

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x5bdb

    const v2, -0x6ec44633

    xor-int/2addr v1, v2

    const v2, -0x4f510836

    xor-int/2addr v0, v2

    goto :goto_a

    :sswitch_16
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move/from16 v4, v35

    if-ge v13, v4, :cond_c

    const-string v0, "\u05a8\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, -0x29

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x6d63

    const v2, -0xf9604ac

    xor-int/2addr v1, v2

    const v2, 0x3c983496

    goto :goto_9

    :cond_c
    const-string v0, "\u06d8\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x1c15

    const v2, -0x845cb5f

    xor-int/2addr v1, v2

    const v2, 0x5b171497

    :goto_9
    xor-int/2addr v0, v2

    move/from16 v35, v4

    :goto_a
    move-object v2, v5

    move-object/from16 v36, v6

    :goto_b
    move v5, v12

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    :goto_c
    move-object/from16 v48, v41

    move-object/from16 v12, v54

    move/from16 v39, v56

    move-object/from16 v37, v3

    move-object/from16 v41, v8

    move-object/from16 v3, v42

    move-object/from16 v8, v49

    goto/16 :goto_3a

    :sswitch_17
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move/from16 v4, v35

    .line 463
    new-instance v0, Ll/ۙۛ֫;

    move-object/from16 v2, v34

    invoke-direct {v0, v9, v2}, Ll/ۙۛ֫;-><init>(Ll/ۤۛ֫;Ll/ܰ᩺֫;)V

    iput-object v0, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    move/from16 v35, v12

    move-object/from16 v34, v33

    move-object/from16 v1, v40

    move/from16 v33, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    goto/16 :goto_10

    :sswitch_18
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move-object/from16 v2, v34

    move/from16 v4, v35

    .line 466
    :try_start_2
    iget-object v0, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v1, v40

    move-object/from16 v58, v33

    move/from16 v33, v4

    move-object/from16 v4, v58

    :try_start_3
    invoke-interface {v4, v1, v0}, Lbin/mt/plugin/api/preference/PluginPreference$OnTextItemClickListener;->onClick(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v0, "\u06d8\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    mul-int/lit8 v0, v0, -0x2f

    move-object/from16 v34, v4

    xor-int v4, v0, v51

    mul-int/lit16 v4, v4, 0xe0d

    const v35, 0xbda78d4

    xor-int v4, v4, v35

    const v35, -0x7cc6226f

    goto/16 :goto_e

    :catchall_2
    move-exception v0

    move-object/from16 v34, v4

    goto :goto_d

    :catchall_3
    move-exception v0

    move-object/from16 v34, v33

    move-object/from16 v1, v40

    move/from16 v33, v4

    :goto_d
    const-string v4, "\u073f\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v51

    move-object/from16 v35, v0

    xor-int v0, v4, v52

    mul-int/lit16 v0, v0, -0x6709

    const v36, -0x188ed838

    xor-int v0, v0, v36

    const v36, 0x376e26c0

    xor-int v53, v4, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v37, v3

    move-object/from16 v41, v8

    move-object/from16 v3, v42

    move-object/from16 v8, v49

    move-object/from16 v42, v11

    move-object/from16 v11, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v2

    move-object v2, v5

    move v5, v12

    goto/16 :goto_1b

    :sswitch_19
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    .line 471
    invoke-static/range {v32 .. v32}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, -0x39

    xor-int v4, v0, v52

    mul-int/lit16 v4, v4, 0x1e3f

    const v35, 0x65048d78

    xor-int v4, v4, v35

    const v35, -0x72cec7ab

    :goto_e
    xor-int v0, v0, v35

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v34, v2

    move-object v2, v5

    move-object/from16 v41, v8

    move v5, v12

    move-object/from16 v8, v49

    move-object/from16 v12, v54

    move-object/from16 v58, v53

    move/from16 v53, v0

    move v0, v4

    move-object/from16 v4, v37

    move-object/from16 v37, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v58

    goto/16 :goto_0

    :cond_d
    move/from16 v35, v12

    move-object/from16 v12, v28

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v7, p0

    goto/16 :goto_19

    :sswitch_1a
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    .line 453
    iget-object v0, v4, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    move-object/from16 v55, v0

    move-object/from16 v29, v7

    move/from16 v35, v12

    move-object/from16 v7, p0

    goto/16 :goto_12

    :sswitch_1b
    move-object/from16 v7, p0

    move-object/from16 v1, v40

    .line 454
    iget-object v0, v7, Ll/ۜۨ֫;->᩶:Landroid/widget/TextView;

    move-object/from16 v2, v55

    invoke-static {v0, v2}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    invoke-static/range {v22 .. v22}, Ll/֨ᩳ;->ܿ᩸ۧ(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v7, v1, v0, v2}, Ll/ۜۨ֫;->ۙ(Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/Object;)V

    return-void

    :sswitch_1c
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move v12, v5

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object v5, v2

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v2, v34

    move-object/from16 v29, v7

    move-object/from16 v34, v33

    move/from16 v33, v35

    move-object/from16 v7, p0

    .line 417
    invoke-static {v10}, Ll/ۖ֡;->֡ۙۡ(Ljava/lang/Object;)I

    move-result v0

    if-ge v15, v0, :cond_e

    const-string v0, "\u06e1\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    move/from16 v35, v12

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, 0x443f

    const v36, -0x3ed43a94

    xor-int v12, v12, v36

    const v36, -0x68058ec4

    goto/16 :goto_17

    :cond_e
    move/from16 v35, v12

    goto/16 :goto_16

    :sswitch_1d
    move-object/from16 v7, p0

    move/from16 v35, v5

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object v5, v2

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v2, v34

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v34, v33

    .line 424
    invoke-static {v10}, Ll/ۖ֡;->֡ۙۡ(Ljava/lang/Object;)I

    move-result v0

    new-array v12, v0, [Ljava/lang/CharSequence;

    move/from16 v13, v25

    :goto_f
    const-string v29, "\u06ec\u0730"

    invoke-static/range {v29 .. v29}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v29

    xor-int v29, v29, v52

    move/from16 v33, v0

    xor-int v0, v29, v51

    mul-int/lit16 v0, v0, 0x201

    const v36, 0x2fe43c6f

    xor-int v0, v0, v36

    const v36, 0x5bf8f479

    xor-int v29, v29, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object v7, v12

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move-object/from16 v12, v54

    move/from16 v39, v56

    move-object/from16 v41, v8

    move-object/from16 v8, v49

    move-object/from16 v58, v34

    move-object/from16 v34, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v58

    move-object/from16 v59, v37

    move-object/from16 v37, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v29

    move-object/from16 v29, v4

    move-object/from16 v4, v59

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    if-eqz v30, :cond_f

    goto/16 :goto_11

    :cond_f
    move-object/from16 v40, v1

    move-object/from16 v1, v23

    move-object/from16 v0, v24

    move-object/from16 v24, v26

    move/from16 v48, v33

    move/from16 v57, v38

    move-object/from16 v12, v54

    move-object/from16 v26, v3

    move-object/from16 v33, v4

    move-object/from16 v54, v5

    move-object/from16 v38, v6

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v2

    goto/16 :goto_2d

    :sswitch_1f
    move-object/from16 v7, p0

    return-void

    :sswitch_20
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 462
    iget-object v0, v2, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    if-nez v0, :cond_10

    const-string v0, "\u06e0\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v51, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v12, v0, v52

    mul-int/lit16 v12, v12, 0xf33

    const v36, 0x71363d5c

    xor-int v12, v12, v36

    const v36, 0x2a23c35d

    goto/16 :goto_17

    :cond_10
    :goto_10
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x71

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, -0x6355

    const v36, -0x5cecfc13

    xor-int v12, v12, v36

    const v36, 0x67144d3a

    goto/16 :goto_17

    :sswitch_21
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 471
    iget-object v0, v3, Ll/۟᩺֫;->֫:Ljava/lang/String;

    if-eqz v0, :cond_11

    const-string v12, "\u06d9\u06dc"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v51

    move-object/from16 v32, v0

    xor-int v0, v12, v52

    mul-int/lit16 v0, v0, -0x2c45

    const v36, 0x7a633e2a

    xor-int v0, v0, v36

    const v36, -0x5c6a8d2a

    xor-int v12, v12, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v12

    goto/16 :goto_18

    :cond_11
    move-object/from16 v32, v0

    :goto_11
    move-object/from16 v12, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    goto/16 :goto_19

    :sswitch_22
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    if-nez v31, :cond_12

    const-string v0, "\u06e4\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, 0x77c9

    const v36, -0x52b607fa

    xor-int v12, v12, v36

    const v36, -0x29a7e899

    goto/16 :goto_17

    :cond_12
    move-object/from16 v55, v31

    :goto_12
    const-string v0, "\u1a75\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v12, v0, v52

    mul-int/lit16 v12, v12, -0x7a77

    const v36, -0x426c17cf

    xor-int v12, v12, v36

    const v36, 0x36df3bd3

    goto/16 :goto_17

    :sswitch_23
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    const/4 v0, 0x0

    const/4 v15, 0x0

    :goto_13
    const-string v0, "\u06d8\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, -0x2da3

    const v36, -0x273ae9f5

    xor-int v12, v12, v36

    const v36, 0x41100922

    goto/16 :goto_17

    :sswitch_24
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    const/4 v0, -0x1

    const/16 v38, -0x1

    :goto_14
    const-string v0, "\u06eb\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v12, v0, v52

    mul-int/lit16 v12, v12, -0x650d

    const v36, -0x4aa8f1c4

    xor-int v12, v12, v36

    const v36, -0x5bd9af4c

    goto/16 :goto_17

    :sswitch_25
    move-object/from16 v37, v4

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v4, v29

    move/from16 v33, v35

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move/from16 v35, v5

    move-object/from16 v39, v6

    move-object/from16 v29, v7

    move-object/from16 v6, v36

    move-object/from16 v7, p0

    move-object v5, v2

    .line 460
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    move-object v2, v0

    check-cast v2, Ll/۟᩺֫;

    .line 461
    iget-object v3, v2, Ll/۟᩺֫;->ۚ:Lbin/mt/plugin/api/preference/PluginPreference$OnTextItemClickListener;

    if-eqz v3, :cond_13

    const-string v12, "\u06e2\u1a7b"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v52

    mul-int/lit8 v12, v12, 0x79

    move-object/from16 v34, v0

    xor-int v0, v12, v51

    mul-int/lit16 v0, v0, 0x4747

    const v36, 0x39e62017

    xor-int v0, v0, v36

    const v36, 0x6837610d

    xor-int v12, v12, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v12

    goto/16 :goto_1b

    :cond_13
    move-object/from16 v34, v0

    const-string v0, "\u0736\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, -0x35

    xor-int v12, v0, v52

    mul-int/lit16 v12, v12, -0x5273

    const v36, 0x526f3746

    xor-int v12, v12, v36

    const v36, -0x5c82cab3

    xor-int v0, v0, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v0

    move v0, v12

    goto/16 :goto_1b

    :sswitch_26
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 451
    iget-object v0, v4, Ll/֡᩺֫;->ۧ:Ljava/lang/CharSequence;

    goto :goto_15

    :sswitch_27
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    iget-object v0, v4, Ll/֡᩺֫;->֫:Ljava/lang/CharSequence;

    :goto_15
    move-object/from16 v31, v0

    const-string v0, "\u06ec\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v12, v0, v52

    mul-int/lit16 v12, v12, 0x4075

    const v36, 0x2f879bf3

    xor-int v12, v12, v36

    const v36, -0x15b16060

    goto :goto_17

    :sswitch_28
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 414
    iget-object v10, v5, Ll/᩶᩺֫;->֫:Ljava/util/ArrayList;

    const/16 v25, 0x0

    if-eqz v6, :cond_14

    const-string v0, "\u073f\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    mul-int/lit8 v0, v0, -0x45

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, -0x43d

    const v36, -0x419060af

    xor-int v12, v12, v36

    const v36, 0x18d0fd9f

    goto :goto_17

    :cond_14
    :goto_16
    const-string v0, "\u073a\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v12, v0, v51

    mul-int/lit16 v12, v12, 0x3319

    const v36, 0x47a7a3b6

    xor-int v12, v12, v36

    const v36, 0x31d4b3ba

    :goto_17
    xor-int v0, v0, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v0

    move v0, v12

    :goto_18
    move-object/from16 v12, v54

    move-object/from16 v58, v34

    move-object/from16 v34, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v58

    goto/16 :goto_0

    :sswitch_29
    move-object/from16 v7, p0

    move-object/from16 v12, v28

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    .line 403
    invoke-virtual {v11, v12}, Ll/۠ۢᩴ;->ۤ(Ljava/lang/String;)V

    .line 404
    invoke-virtual {v11}, Ll/۠ۢᩴ;->ۙ()V

    .line 405
    invoke-virtual {v11}, Ll/۠ۢᩴ;->ۗ()V

    iget v0, v8, Ll/᩺᩺֫;->ۧ:I

    .line 406
    invoke-virtual {v11, v0}, Ll/۠ۢᩴ;->ᩴ(I)V

    move/from16 v1, v56

    .line 202
    invoke-virtual {v11, v1}, Ll/۠ۢᩴ;->᩷(Z)V

    return-void

    :sswitch_2a
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v28

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move-object/from16 v2, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    const/4 v0, 0x4

    move-object/from16 v28, v10

    move/from16 v10, v27

    if-eq v10, v0, :cond_15

    :goto_19
    const-string v0, "\u06dc\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, 0x4d

    move-object/from16 v27, v2

    xor-int v2, v0, v52

    mul-int/lit16 v2, v2, -0x7e19

    const v36, -0xd933e5e

    xor-int v2, v2, v36

    const v36, 0x5eea0aeb

    goto :goto_1a

    :cond_15
    move-object/from16 v27, v2

    const-string v0, "\u06d8\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, -0x13

    xor-int v2, v0, v52

    mul-int/lit16 v2, v2, -0x2e9f

    const v36, 0x57829190

    xor-int v2, v2, v36

    const v36, -0x4617d569

    :goto_1a
    xor-int v0, v0, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v0

    move v0, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v12

    :goto_1b
    move-object/from16 v12, v54

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v6, v36

    move-object/from16 v3, v37

    move-object/from16 v37, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 449
    invoke-static {v12, v2}, Ll/ۗܰ;->ۗۛܳ(Ljava/lang/Object;Z)V

    .line 450
    invoke-static {v9}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    move-object/from16 v26, v3

    iget-object v3, v4, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-nez v21, :cond_16

    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v51

    mul-int/lit8 v0, v0, 0x5b

    xor-int v3, v0, v52

    mul-int/lit16 v3, v3, -0x6e0d

    const v36, 0x4fe919f5

    xor-int v3, v3, v36

    const v36, 0x5117a260

    goto :goto_1c

    :cond_16
    const-string v0, "\u06e1\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x51

    xor-int v3, v0, v51

    mul-int/lit16 v3, v3, -0x181

    const v36, 0x1506cf30

    xor-int v3, v3, v36

    const v36, 0xb31f222

    :goto_1c
    xor-int v0, v0, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v26

    move-object/from16 v26, v12

    move-object/from16 v12, v54

    move-object/from16 v58, v53

    move/from16 v53, v0

    move v0, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v58

    move-object/from16 v59, v22

    move/from16 v22, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v59

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move-object/from16 v22, v28

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v4, v29

    move-object/from16 v27, v34

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v34, v33

    move/from16 v33, v35

    move-object/from16 v7, p0

    move/from16 v35, v5

    move-object v5, v2

    xor-int/lit8 v0, v21, 0x1

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_17

    move-object/from16 v40, v1

    move-object/from16 v36, v23

    move-object/from16 v3, v24

    move/from16 v48, v33

    move/from16 v57, v38

    move-object/from16 v33, v4

    move-object/from16 v38, v6

    move-object/from16 v24, v12

    move-object/from16 v12, v54

    move-object/from16 v54, v5

    goto/16 :goto_30

    :cond_17
    const-string v2, "\u06d6\u06e2"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v51

    mul-int/lit8 v2, v2, -0x77

    xor-int v3, v2, v52

    mul-int/lit16 v3, v3, -0x3df9

    const v36, 0x40d0767b

    xor-int v3, v3, v36

    const v36, -0x5e93658b

    xor-int v2, v2, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v26

    move-object/from16 v26, v12

    move-object/from16 v12, v54

    move-object/from16 v58, v22

    move/from16 v22, v0

    move v0, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v2

    goto/16 :goto_26

    :cond_18
    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v51, v4

    mul-int/lit8 v4, v4, 0x2d

    xor-int v12, v4, v52

    mul-int/lit16 v12, v12, -0x60c5

    const v36, -0x4afc346d

    xor-int v12, v12, v36

    const v36, 0x5008460b

    xor-int v4, v4, v36

    move-object/from16 v40, v1

    move-object/from16 v36, v6

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v0

    move-object/from16 v41, v8

    move v0, v12

    move-object/from16 v8, v49

    move-object/from16 v12, v54

    move-object/from16 v58, v22

    move/from16 v22, v2

    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v58

    move-object/from16 v59, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v4

    move-object/from16 v4, v37

    move-object/from16 v37, v59

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 413
    iget-object v0, v5, Ll/᩶᩺֫;->ۚ:Ljava/lang/String;

    move-object/from16 v36, v23

    move-object/from16 v3, v24

    move-object/from16 v23, v1

    move-object/from16 v24, v12

    move-object/from16 v12, v54

    move-object v1, v0

    move-object v0, v5

    goto/16 :goto_1f

    :sswitch_2e
    move-object/from16 v49, v8

    move-object/from16 v28, v10

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v34, v33

    move/from16 v33, v35

    move-object/from16 v6, v36

    move/from16 v35, v5

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move-object v5, v2

    move/from16 v2, v22

    .line 403
    invoke-static/range {v18 .. v18}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v36, v23

    move-object/from16 v3, v24

    move-object/from16 v23, v1

    move-object/from16 v24, v12

    move-object/from16 v1, v42

    move-object/from16 v12, v54

    goto/16 :goto_20

    :sswitch_2f
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 359
    :try_start_4
    new-instance v0, Ll/ۙۛ֫;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-object/from16 v3, v24

    :try_start_5
    invoke-direct {v0, v9, v3}, Ll/ۙۛ֫;-><init>(Ll/ۤۛ֫;Ll/ܰ᩺֫;)V

    iput-object v0, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object/from16 v24, v12

    move-object/from16 v36, v23

    move-object/from16 v12, v54

    move-object/from16 v23, v1

    goto/16 :goto_22

    :catchall_4
    move-exception v0

    move-object/from16 v40, v1

    move-object/from16 v24, v12

    goto/16 :goto_1d

    :catchall_5
    move-exception v0

    move-object/from16 v40, v1

    move-object/from16 v36, v23

    move-object/from16 v3, v24

    move/from16 v48, v33

    move/from16 v57, v38

    move/from16 v23, v2

    move-object/from16 v33, v4

    move-object/from16 v38, v6

    move-object/from16 v24, v12

    move-object/from16 v12, v54

    move-object/from16 v54, v5

    goto/16 :goto_29

    :sswitch_30
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v54, v12

    move-object/from16 v12, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v1, v40

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 361
    :try_start_6
    iget-object v0, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    move-object/from16 v24, v12

    move-object/from16 v12, v23

    :try_start_7
    invoke-interface {v12, v1, v0}, Lbin/mt/plugin/api/preference/PluginPreference$OnClickInterceptListener;->onClick(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;)Z

    move-result v30
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    const-string v0, "\u0733\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v52, v0

    mul-int/lit8 v0, v0, 0x5

    move-object/from16 v23, v1

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x1a99

    const v36, -0x66cc2866

    xor-int v1, v1, v36

    const v36, 0x2e706735

    xor-int v0, v0, v36

    move-object/from16 v36, v6

    move-object/from16 v40, v23

    move-object/from16 v7, v29

    move-object/from16 v6, v39

    move-object/from16 v48, v41

    move/from16 v39, v56

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v23, v12

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v12, v54

    goto/16 :goto_24

    :catchall_6
    move-exception v0

    move-object/from16 v40, v1

    move/from16 v23, v2

    move-object/from16 v36, v12

    move/from16 v48, v33

    move/from16 v57, v38

    move-object/from16 v12, v54

    goto :goto_1e

    :catchall_7
    move-exception v0

    move-object/from16 v24, v12

    move-object/from16 v40, v1

    :goto_1d
    move-object/from16 v36, v23

    move/from16 v48, v33

    move/from16 v57, v38

    move-object/from16 v12, v54

    move/from16 v23, v2

    :goto_1e
    move-object/from16 v33, v4

    move-object/from16 v54, v5

    move-object/from16 v38, v6

    goto/16 :goto_29

    :sswitch_31
    move-object/from16 v7, p0

    move-object/from16 v54, v12

    move-object/from16 v41, v48

    .line 365
    invoke-static {v9}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    move-object/from16 v1, v41

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    move-object/from16 v2, v54

    .line 546
    invoke-static {v9, v1, v2}, Ll/֡᩵;->ۤܳۜ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_32
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v1, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v6, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v36, v23

    move-object/from16 v4, v29

    move-object/from16 v23, v40

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    const/4 v0, 0x3

    if-eq v10, v0, :cond_19

    const-string v0, "\u1a7b\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v52, v0

    mul-int/lit8 v0, v0, 0x27

    move-object/from16 v41, v1

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x21b3

    const v40, 0x4655064

    xor-int v1, v1, v40

    const v40, 0x11997fb5

    goto/16 :goto_23

    :cond_19
    move-object/from16 v41, v1

    const-string v0, "\u1a77\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x31

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x6291

    const v40, -0x5c1ae9e0    # -2.48376E-17f

    xor-int v1, v1, v40

    const v40, 0x2ab7fa56

    goto/16 :goto_23

    :sswitch_33
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v2, v22

    move-object/from16 v22, v28

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v28, v10

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v6, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v36, v23

    move-object/from16 v4, v29

    move-object/from16 v34, v33

    move/from16 v33, v35

    move-object/from16 v23, v40

    move/from16 v35, v5

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    .line 411
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    check-cast v0, Ll/᩶᩺֫;

    .line 412
    invoke-static {v9}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v1

    iget-object v5, v0, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-static {v1, v5, v12}, Ll/֨ۚ;->ۛ᩻ۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    if-nez v19, :cond_1a

    const-string v1, "\u06d9\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v52

    xor-int v5, v1, v51

    mul-int/lit16 v5, v5, 0x7a0f

    const v40, 0xb557d92

    xor-int v5, v5, v40

    const v40, 0x2e87d3e5

    xor-int v1, v1, v40

    move-object/from16 v40, v23

    move-object/from16 v7, v29

    move-object/from16 v23, v36

    move-object/from16 v48, v41

    move-object/from16 v29, v4

    move-object/from16 v36, v6

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move-object/from16 v8, v49

    move/from16 v39, v56

    move-object/from16 v37, v26

    move-object/from16 v26, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v1

    move/from16 v58, v2

    move-object v2, v0

    move v0, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v22

    move/from16 v22, v58

    goto/16 :goto_0

    :cond_1a
    move-object/from16 v1, v19

    :goto_1f
    const-string v5, "\u06e7\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v52

    xor-int v6, v5, v51

    mul-int/lit16 v6, v6, 0x38db

    const v40, 0x73d0da27

    xor-int v6, v6, v40

    const v40, -0x601494fb

    xor-int v5, v5, v40

    move-object/from16 v40, v23

    move-object/from16 v7, v29

    move-object/from16 v23, v36

    move-object/from16 v48, v41

    move-object/from16 v36, v1

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v26

    move-object/from16 v26, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v22

    move/from16 v22, v2

    move-object v2, v0

    move v0, v6

    goto/16 :goto_21

    :sswitch_34
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v36, v23

    move-object/from16 v23, v40

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 402
    iget-object v0, v8, Ll/᩺᩺֫;->ۚ:Ljava/lang/CharSequence;

    move-object/from16 v54, v5

    move/from16 v48, v33

    move/from16 v57, v38

    move/from16 v23, v2

    move-object v11, v3

    move-object/from16 v33, v4

    move-object/from16 v38, v6

    move-object v3, v0

    goto/16 :goto_27

    :sswitch_35
    move-object v1, v3

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v36, v23

    move-object/from16 v23, v40

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    invoke-virtual {v11, v1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    .line 403
    iget-object v0, v8, Ll/᩺᩺֫;->֫:Ljava/lang/CharSequence;

    if-nez v0, :cond_1b

    move-object/from16 v18, v0

    move-object v0, v12

    :goto_20
    const-string v22, "\u06df\u1a77"

    invoke-static/range {v22 .. v22}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v51

    mul-int/lit8 v22, v22, -0x31

    move-object/from16 v40, v0

    xor-int v0, v22, v52

    mul-int/lit16 v0, v0, -0x7893

    const v42, 0x1822c95

    xor-int v0, v0, v42

    const v42, 0x4189ac81

    xor-int v22, v22, v42

    move-object/from16 v42, v11

    move-object/from16 v7, v29

    move-object/from16 v48, v41

    move-object/from16 v11, v53

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move/from16 v53, v22

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move/from16 v22, v2

    move-object v2, v5

    move-object/from16 v37, v26

    move/from16 v5, v35

    move-object/from16 v26, v24

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v24, v3

    move-object/from16 v34, v27

    move-object v3, v1

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v40

    move-object/from16 v40, v23

    move-object/from16 v23, v36

    move-object/from16 v36, v6

    :goto_21
    move-object/from16 v6, v39

    move/from16 v39, v56

    goto/16 :goto_0

    :cond_1b
    const-string v18, "\u06e0\u1a76"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v51

    move-object/from16 v40, v0

    xor-int v0, v18, v52

    mul-int/lit16 v0, v0, 0x251d

    const v42, 0x2ac628ff

    xor-int v0, v0, v42

    const v42, -0x6f1741f4

    xor-int v18, v18, v42

    move-object/from16 v42, v11

    move-object/from16 v7, v29

    move-object/from16 v48, v41

    move-object/from16 v11, v53

    move-object/from16 v29, v4

    move-object/from16 v41, v8

    move/from16 v53, v18

    move-object/from16 v4, v37

    move-object/from16 v18, v40

    move-object/from16 v8, v49

    move-object/from16 v40, v23

    move-object/from16 v37, v26

    move-object/from16 v23, v36

    move-object/from16 v36, v6

    move-object/from16 v26, v24

    move-object/from16 v6, v39

    move/from16 v39, v56

    move-object/from16 v24, v3

    move-object v3, v1

    goto/16 :goto_25

    :sswitch_36
    move-object v1, v3

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v36, v23

    move-object/from16 v23, v40

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    if-nez v16, :cond_1c

    const-string v0, "\u1a74\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x5f

    move-object/from16 v42, v1

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x5d41

    const v40, 0x395816a2

    xor-int v1, v1, v40

    const v40, 0x71e8249

    goto/16 :goto_23

    :cond_1c
    move-object/from16 v42, v1

    :goto_22
    const-string v0, "\u06e8\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x7c4f

    const v40, 0x7b080b0b

    xor-int v1, v1, v40

    const v40, -0x6be8efef

    goto/16 :goto_23

    :sswitch_37
    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v6, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v36, v23

    move-object/from16 v4, v29

    move-object/from16 v23, v40

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    const/4 v0, 0x2

    if-eq v10, v0, :cond_1d

    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x2fc5

    const v40, 0x74cee65f

    xor-int v1, v1, v40

    const v40, -0x49416a89

    goto :goto_23

    :cond_1d
    const-string v0, "\u0736\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x66a3

    const v40, 0x52efcd9d

    xor-int v1, v1, v40

    const v40, -0x23ab22c5

    :goto_23
    xor-int v0, v0, v40

    move-object/from16 v40, v23

    move-object/from16 v7, v29

    move-object/from16 v23, v36

    move-object/from16 v48, v41

    move-object/from16 v29, v4

    move-object/from16 v36, v6

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move-object/from16 v8, v49

    move/from16 v39, v56

    :goto_24
    move-object/from16 v37, v26

    move-object/from16 v26, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v42

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v0

    move v0, v1

    :goto_25
    move-object/from16 v58, v22

    move/from16 v22, v2

    :goto_26
    move-object v2, v5

    move/from16 v5, v35

    move/from16 v35, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v27

    move/from16 v27, v10

    move-object/from16 v10, v28

    move-object/from16 v28, v58

    goto/16 :goto_0

    :sswitch_38
    move-object/from16 v42, v3

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v37

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v41, v48

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v4, v29

    move-object/from16 v6, v36

    move-object/from16 v29, v7

    move-object/from16 v36, v23

    move-object/from16 v23, v40

    move-object/from16 v7, p0

    move/from16 v58, v5

    move-object v5, v2

    move/from16 v2, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move/from16 v33, v35

    move/from16 v35, v58

    .line 374
    new-instance v0, Ll/۠ۨ֫;

    move-object v1, v0

    move/from16 v23, v2

    move-object/from16 v2, p0

    move-object v11, v3

    move-object v3, v9

    move/from16 v48, v33

    move-object/from16 v33, v4

    move-object v4, v8

    move-object/from16 v54, v5

    move-object/from16 v5, v17

    move/from16 v57, v38

    move-object/from16 v38, v6

    move-object/from16 v6, v40

    invoke-direct/range {v1 .. v6}, Ll/۠ۨ֫;-><init>(Ll/ۜۨ֫;Ll/ܽ֡֫;Ll/᩺᩺֫;Ljava/lang/String;Ll/ܿܰ֫;)V

    iget-object v1, v8, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    .line 401
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->᩷(Ljava/lang/CharSequence;)V

    if-nez v17, :cond_1e

    const-string v1, "\u06ec\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v52

    mul-int/lit8 v1, v1, 0x57

    xor-int v2, v1, v51

    mul-int/lit16 v2, v2, -0x5db

    const v3, -0x408be1a4

    xor-int/2addr v2, v3

    const v3, -0x22576618

    xor-int/2addr v1, v3

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move-object/from16 v3, v42

    move/from16 v35, v48

    move/from16 v39, v56

    move-object/from16 v42, v0

    move v0, v2

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v2, v54

    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    move-object/from16 v24, v11

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v23, v36

    move-object/from16 v36, v38

    move-object/from16 v11, v53

    move/from16 v38, v57

    goto/16 :goto_34

    :cond_1e
    move-object/from16 v42, v0

    move-object/from16 v3, v17

    :goto_27
    const-string v0, "\u1a74\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x53af

    const v2, 0xdeb63d4

    xor-int/2addr v1, v2

    const v2, 0xd4d50e9

    xor-int/2addr v0, v2

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move-object/from16 v2, v54

    move/from16 v39, v56

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    move-object/from16 v24, v11

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v23, v36

    move-object/from16 v36, v38

    move-object/from16 v11, v53

    move/from16 v38, v57

    goto/16 :goto_3c

    :sswitch_39
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    .line 372
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    check-cast v0, Ll/᩺᩺֫;

    .line 373
    invoke-static {v9}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v1

    iget-object v2, v0, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-static {v1, v2, v12}, Ll/ۘܶ;->ۢ᩸᩸(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 181
    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v1, :cond_1f

    move-object v8, v0

    move-object/from16 v0, v33

    :goto_28
    const-string v1, "\u1a75\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v52

    mul-int/lit8 v1, v1, 0x45

    xor-int v2, v1, v51

    mul-int/lit16 v2, v2, 0x4295

    const v4, 0x5d7af058

    xor-int/2addr v2, v4

    const v4, -0x5d5a888f

    xor-int/2addr v1, v4

    move-object/from16 v7, v29

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move/from16 v39, v56

    move-object/from16 v29, v0

    move v0, v2

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v2, v54

    goto/16 :goto_32

    :cond_1f
    const-string v1, "\u06ec\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v52

    xor-int v2, v1, v51

    mul-int/lit16 v2, v2, 0x199d

    const v4, 0x54573ae2

    xor-int/2addr v2, v4

    const v4, 0x56162860

    xor-int/2addr v1, v4

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move-object/from16 v8, v49

    move/from16 v39, v56

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v41, v0

    move v0, v2

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v2, v54

    goto/16 :goto_33

    :sswitch_3a
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    .line 358
    :try_start_8
    iget-object v0, v3, Ll/ܰ᩺֫;->᩷:Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v51, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v2, v1, v52

    mul-int/lit16 v2, v2, 0x2be3

    const v4, 0x7d76ccbd

    xor-int/2addr v2, v4

    const v4, 0x7b8f6439

    xor-int/2addr v1, v4

    move-object/from16 v16, v0

    goto/16 :goto_31

    :catchall_8
    move-exception v0

    :goto_29
    const-string v1, "\u073d\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v51, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v2, v1, v52

    mul-int/lit16 v2, v2, 0x3f6f

    const v4, -0x61cf2a5e

    xor-int/2addr v2, v4

    const v4, 0x54a1cf1b

    xor-int/2addr v1, v4

    move-object/from16 v41, v8

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move-object/from16 v8, v49

    move/from16 v39, v56

    move-object/from16 v48, v0

    move v0, v2

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v2, v54

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    goto/16 :goto_33

    :sswitch_3b
    move-object/from16 v54, v2

    move-object/from16 v39, v6

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move-object/from16 v27, v34

    move/from16 v57, v38

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move-object/from16 v34, v33

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v7, p0

    move-object/from16 v28, v10

    .line 370
    invoke-static/range {v20 .. v20}, Ll/ۖܰ;->ܺ۬ܿ(Ljava/lang/Object;)I

    move-result v0

    aget v0, p1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_20

    const-string v2, "\u06eb\u05a1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v51, v2

    mul-int/lit8 v2, v2, 0x5

    xor-int v4, v2, v52

    mul-int/lit16 v4, v4, 0x61f5

    const v5, 0x3f8d27db

    xor-int/2addr v4, v5

    const v5, 0x5475f076

    goto :goto_2a

    :cond_20
    const-string v2, "\u06e8\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v51

    xor-int v4, v2, v52

    mul-int/lit16 v4, v4, -0x7c4f

    const v5, 0x549961ac

    xor-int/2addr v4, v5

    const v5, 0xc053160

    :goto_2a
    xor-int/2addr v2, v5

    move-object/from16 v10, v28

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v6, v39

    move/from16 v35, v48

    const/16 v39, 0x1

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v34, v27

    move-object/from16 v23, v36

    move-object/from16 v36, v38

    move-object/from16 v48, v41

    move/from16 v38, v57

    move/from16 v27, v0

    move v0, v4

    move-object/from16 v41, v8

    move-object/from16 v4, v37

    move-object/from16 v8, v49

    move-object/from16 v37, v26

    move-object/from16 v26, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v42

    goto/16 :goto_2f

    :sswitch_3c
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    sget-object v0, Ll/ᩳۨ֫;->ۙ:[I

    iget-object v1, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    invoke-virtual {v1}, Ll/ܰ᩺֫;->ۙ()Ll/ۘ᩺֫;

    move-result-object v20

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_21

    :goto_2b
    const-string v1, "\u073a\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v51

    xor-int v2, v1, v52

    mul-int/lit16 v2, v2, -0x463

    const v4, 0xf1d8c22

    xor-int/2addr v2, v4

    const v4, -0xb858ff2

    goto :goto_2c

    :cond_21
    const-string v1, "\u06e0\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v52, v1

    mul-int/lit8 v1, v1, 0x79

    xor-int v2, v1, v51

    mul-int/lit16 v2, v2, -0x15f1

    const v4, -0x62d7a96a

    xor-int/2addr v2, v4

    const v4, 0xd8c3b1d

    :goto_2c
    xor-int/2addr v1, v4

    move-object/from16 p1, v0

    goto/16 :goto_31

    :sswitch_3d
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v23, v22

    move-object/from16 v24, v26

    move-object/from16 v22, v28

    move-object/from16 v26, v37

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v39, v6

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move/from16 v48, v35

    move-object/from16 v38, v36

    move/from16 v35, v5

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    .line 356
    iget-object v0, v7, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    iget-object v1, v0, Ll/ܰ᩺֫;->᩸:Lbin/mt/plugin/api/preference/PluginPreference$OnClickInterceptListener;

    const/4 v12, 0x0

    if-eqz v1, :cond_22

    const-string v2, "\u06df\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v52, v2

    mul-int/lit8 v2, v2, 0x41

    xor-int v3, v2, v51

    mul-int/lit16 v3, v3, 0x1e45

    const v4, -0xab275f3

    xor-int/2addr v3, v4

    const v4, 0x5bf7370c

    goto :goto_2e

    :cond_22
    :goto_2d
    const-string v2, "\u1a78\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v51

    xor-int v3, v2, v52

    mul-int/lit16 v3, v3, 0x7e2f

    const v4, -0x3a519209

    xor-int/2addr v3, v4

    const v4, -0x1abe8d5e

    :goto_2e
    xor-int/2addr v2, v4

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v36, v38

    move-object/from16 v6, v39

    move/from16 v35, v48

    move/from16 v39, v56

    move/from16 v38, v57

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    move-object/from16 v24, v0

    move v0, v3

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v3, v42

    move-object/from16 v23, v1

    :goto_2f
    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move/from16 v53, v2

    move-object/from16 v2, v54

    goto/16 :goto_0

    :sswitch_3e
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    .line 354
    new-instance v0, Ll/ܿܰ֫;

    iget-object v9, v7, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    invoke-static {v9}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    invoke-direct {v0, v1, v9}, Ll/ܿܰ֫;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ܽ֡֫;)V

    .line 438
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_23

    move-object/from16 v40, v0

    move/from16 v0, v23

    :goto_30
    const-string v1, "\u05a8\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v51

    xor-int v2, v1, v52

    mul-int/lit16 v2, v2, 0x1145

    const v4, 0x17099be1

    xor-int/2addr v2, v4

    const v4, 0x5b22361f    # 4.5658453E16f

    xor-int/2addr v1, v4

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v23, v36

    move-object/from16 v4, v37

    move-object/from16 v36, v38

    move-object/from16 v6, v39

    move/from16 v35, v48

    move/from16 v39, v56

    move/from16 v38, v57

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    move-object/from16 v24, v3

    move-object/from16 v28, v22

    move-object/from16 v3, v42

    move/from16 v22, v0

    move v0, v2

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    move-object/from16 v2, v54

    goto :goto_34

    :cond_23
    const-string v1, "\u06e0\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v51

    xor-int v2, v1, v52

    mul-int/lit16 v2, v2, 0x148f

    const v4, -0x15231c5f

    xor-int/2addr v2, v4

    const v4, -0xcc56424

    xor-int/2addr v1, v4

    move-object/from16 v40, v0

    :goto_31
    move v0, v2

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move-object/from16 v2, v54

    move/from16 v39, v56

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    :goto_32
    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    :goto_33
    move-object/from16 v24, v3

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v23, v36

    move-object/from16 v36, v38

    move-object/from16 v3, v42

    move/from16 v38, v57

    move-object/from16 v42, v11

    move-object/from16 v11, v53

    :goto_34
    move/from16 v53, v1

    goto/16 :goto_0

    :sswitch_3f
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    const v0, 0xc5d4

    const v5, 0xc5d4

    goto :goto_35

    :sswitch_40
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    const/16 v0, 0x5a36

    const/16 v5, 0x5a36

    :goto_35
    const-string v0, "\u05a1\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x3755

    const v2, -0x7774ab5c

    xor-int/2addr v1, v2

    const v2, 0x7f5e7246

    xor-int/2addr v0, v2

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    goto/16 :goto_39

    :sswitch_41
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    const v0, 0x14d86aa9

    add-int v0, v47, v0

    const v1, 0x921a

    mul-int v1, v1, v46

    sub-int/2addr v0, v1

    if-ltz v0, :cond_24

    const-string v0, "\u06e2\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v52

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0xd2d

    const v2, 0x5f8d23f3

    xor-int/2addr v1, v2

    const v2, -0x372d6c1b

    goto/16 :goto_38

    :cond_24
    const-string v0, "\u073a\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x5fef

    const v2, 0x6d85cc33

    xor-int/2addr v1, v2

    const v2, -0x64e36e97

    goto/16 :goto_38

    :sswitch_42
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    aget-short v46, v44, v45

    mul-int v47, v46, v46

    .line 2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v0

    if-nez v0, :cond_25

    :goto_36
    const-string v0, "\u1a7a\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v52, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, 0x2edb

    const v2, 0x57f732d7

    xor-int/2addr v1, v2

    const v2, -0x48ad479e

    goto/16 :goto_38

    :cond_25
    const-string v0, "\u06ec\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v52

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v51

    mul-int/lit16 v1, v1, -0x7963

    const v2, -0x64536bac

    xor-int/2addr v1, v2

    const v2, 0x16a579dd

    goto/16 :goto_38

    :sswitch_43
    move-object/from16 v54, v2

    move-object/from16 v49, v8

    move-object/from16 v53, v11

    move/from16 v57, v38

    move/from16 v56, v39

    move-object/from16 v8, v41

    move-object/from16 v11, v42

    move-object/from16 v41, v48

    move-object/from16 v42, v3

    move-object/from16 v39, v6

    move-object/from16 v3, v24

    move-object/from16 v24, v26

    move/from16 v48, v35

    move-object/from16 v38, v36

    move-object/from16 v26, v37

    move-object/from16 v37, v4

    move/from16 v35, v5

    move-object/from16 v36, v23

    move/from16 v23, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v10

    move/from16 v10, v27

    move-object/from16 v27, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v29

    move-object/from16 v29, v7

    move-object/from16 v7, p0

    sget-object v44, Ll/ۜۨ֫;->֡᩵᩹:[S

    const/16 v45, 0x4

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v0

    if-eqz v0, :cond_26

    :goto_37
    const-string v0, "\u05a8\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, 0x5611

    const v2, -0x1c9662a7

    xor-int/2addr v1, v2

    const v2, 0x271395dc

    goto :goto_38

    :cond_26
    const-string v0, "\u05a1\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v51

    xor-int v1, v0, v52

    mul-int/lit16 v1, v1, -0x1335

    const v2, -0x602b9722

    xor-int/2addr v1, v2

    const v2, -0x537818f8

    :goto_38
    xor-int/2addr v0, v2

    move-object/from16 v7, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v34

    move/from16 v5, v35

    :goto_39
    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move/from16 v35, v48

    move-object/from16 v2, v54

    move/from16 v39, v56

    move-object/from16 v37, v26

    move-object/from16 v34, v27

    move-object/from16 v48, v41

    move-object/from16 v41, v8

    move/from16 v27, v10

    move-object/from16 v26, v24

    move-object/from16 v10, v28

    move-object/from16 v8, v49

    move-object/from16 v24, v3

    move-object/from16 v28, v22

    move/from16 v22, v23

    move-object/from16 v23, v36

    move-object/from16 v36, v38

    move-object/from16 v3, v42

    move/from16 v38, v57

    :goto_3a
    move-object/from16 v42, v11

    :goto_3b
    move-object/from16 v11, v53

    :goto_3c
    move/from16 v53, v0

    :goto_3d
    move v0, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78cbb1b0 -> :sswitch_3b
        -0x7395e376 -> :sswitch_27
        -0x72b0595b -> :sswitch_2b
        -0x72a60bf9 -> :sswitch_35
        -0x71ceaa6a -> :sswitch_1
        -0x7117d8d9 -> :sswitch_2f
        -0x706da1e6 -> :sswitch_4
        -0x6d717c48 -> :sswitch_2a
        -0x699757ae -> :sswitch_c
        -0x639405d4 -> :sswitch_41
        -0x638584ff -> :sswitch_3b
        -0x6223862f -> :sswitch_a
        -0x5860bbf9 -> :sswitch_d
        -0x53002fdb -> :sswitch_43
        -0x51fe0ed2 -> :sswitch_1e
        -0x516f693b -> :sswitch_2d
        -0x50732eee -> :sswitch_38
        -0x4ec1f7b5 -> :sswitch_3
        -0x4e3c34ac -> :sswitch_24
        -0x4d27d83d -> :sswitch_1b
        -0x4a5b6dc2 -> :sswitch_3e
        -0x49de6a17 -> :sswitch_2a
        -0x489f8cdb -> :sswitch_36
        -0x44d4b9f9 -> :sswitch_33
        -0x43cd498f -> :sswitch_0
        -0x437e2de0 -> :sswitch_11
        -0x421dcf0b -> :sswitch_f
        -0x3ef8b22c -> :sswitch_1c
        -0x3c47e140 -> :sswitch_34
        -0x390686b0 -> :sswitch_37
        -0x36d1c111 -> :sswitch_2f
        -0x3622dc67 -> :sswitch_2
        -0x33e01682 -> :sswitch_6
        -0x32f02b98 -> :sswitch_7
        -0x32bd6277 -> :sswitch_3a
        -0x31be8a5f -> :sswitch_c
        -0x2d8aeb60 -> :sswitch_23
        -0x2ba23169 -> :sswitch_10
        -0x2b01a4b0 -> :sswitch_40
        -0x2aebb966 -> :sswitch_14
        -0x2abb636c -> :sswitch_3d
        -0x29fe94e1 -> :sswitch_38
        -0x299bb57b -> :sswitch_9
        -0x297a27a6 -> :sswitch_13
        -0x28e4aecd -> :sswitch_3f
        -0x28be47e0 -> :sswitch_8
        -0x24ffacb3 -> :sswitch_13
        -0x2458998a -> :sswitch_11
        -0x2410484c -> :sswitch_16
        -0x233f7d0f -> :sswitch_1b
        -0x228dd5b0 -> :sswitch_d
        -0x21cf849b -> :sswitch_3a
        -0x21b20f43 -> :sswitch_5
        -0x1e852f67 -> :sswitch_29
        -0x1db04058 -> :sswitch_15
        -0x1cdc55a3 -> :sswitch_20
        -0x1c011686 -> :sswitch_21
        -0x19e6e41c -> :sswitch_39
        -0x171ddf7a -> :sswitch_20
        -0x1238fdb9 -> :sswitch_a
        -0x12258cf7 -> :sswitch_18
        -0xeb5935b -> :sswitch_0
        -0xae955f6 -> :sswitch_17
        -0xace11dd -> :sswitch_2c
        -0x82bf20b -> :sswitch_42
        -0x7f02a92 -> :sswitch_25
        -0x77c6336 -> :sswitch_a
        -0x3000a45 -> :sswitch_3
        -0x27d6912 -> :sswitch_2e
        -0xb6a6d8 -> :sswitch_3e
        0x52b54b -> :sswitch_22
        0x11d4d73 -> :sswitch_31
        0x4278973 -> :sswitch_1d
        0x7629dba -> :sswitch_12
        0xd8f0533 -> :sswitch_9
        0xf5ebf16 -> :sswitch_3c
        0x108010d5 -> :sswitch_b
        0x1256c7b9 -> :sswitch_41
        0x17ed35d2 -> :sswitch_15
        0x18c831d9 -> :sswitch_18
        0x1926b005 -> :sswitch_3d
        0x1e667df5 -> :sswitch_5
        0x1ffc29d9 -> :sswitch_28
        0x25e4befc -> :sswitch_2
        0x260208c3 -> :sswitch_25
        0x266244e4 -> :sswitch_43
        0x286e8635 -> :sswitch_39
        0x299510bc -> :sswitch_7
        0x29cbe409 -> :sswitch_8
        0x2b4d1416 -> :sswitch_21
        0x2b8391b6 -> :sswitch_28
        0x2cd6417d -> :sswitch_3f
        0x2d982124 -> :sswitch_36
        0x2dfce0b9 -> :sswitch_10
        0x317ff76e -> :sswitch_27
        0x34933577 -> :sswitch_1f
        0x35376d05 -> :sswitch_e
        0x3648cc78 -> :sswitch_33
        0x36aa445f -> :sswitch_32
        0x38603531 -> :sswitch_2b
        0x469bd876 -> :sswitch_42
        0x482a407c -> :sswitch_b
        0x48c5d1d8 -> :sswitch_40
        0x49895e71 -> :sswitch_19
        0x4a375503 -> :sswitch_17
        0x4b4705f2 -> :sswitch_22
        0x4e3a7a82 -> :sswitch_1d
        0x4f781ccd -> :sswitch_1a
        0x51f10b59 -> :sswitch_35
        0x528b3673 -> :sswitch_14
        0x553bf45c -> :sswitch_32
        0x557f50a3 -> :sswitch_1
        0x564f55b8 -> :sswitch_1a
        0x59b9f85e -> :sswitch_26
        0x5a409780 -> :sswitch_34
        0x5a4eb752 -> :sswitch_3c
        0x5bc88f41 -> :sswitch_19
        0x5e00b5de -> :sswitch_31
        0x5ed777b8 -> :sswitch_24
        0x60365f63 -> :sswitch_30
        0x615516a6 -> :sswitch_1f
        0x617c6e56 -> :sswitch_23
        0x667cf179 -> :sswitch_4
        0x67200fa1 -> :sswitch_6
        0x6984c93e -> :sswitch_26
        0x6b41a070 -> :sswitch_37
        0x6c1474cb -> :sswitch_2d
        0x702e9f4d -> :sswitch_a
        0x70f2fce1 -> :sswitch_e
        0x71169b45 -> :sswitch_29
        0x757fcd92 -> :sswitch_16
        0x75aa135f -> :sswitch_f
        0x75c3efb5 -> :sswitch_1c
        0x768e45e1 -> :sswitch_2c
        0x7af4a61e -> :sswitch_2e
        0x7de597a8 -> :sswitch_12
        0x7e0b3ac0 -> :sswitch_30
        0x7f84a74d -> :sswitch_1e
    .end sparse-switch
.end method

.method public final ۙ(Ll/ܰ᩺֫;)V
    .locals 55

    move-object/from16 v1, p0

    move-object/from16 v2, p1

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const v46, 0x5e0e93f4

    sget v47, Ll/᩶;->ᩴ᩶ۛ:I

    sget v48, Ll/ۖ֨;->֨ۨۧ:I

    const-string v49, "\u0730\u0733"

    invoke-static/range {v49 .. v49}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v49

    xor-int v49, v49, v47

    xor-int v0, v49, v48

    mul-int/lit16 v0, v0, 0x2d8b

    const v51, -0x1dc86081

    xor-int v0, v0, v51

    const v51, 0x32eaafb2

    xor-int v49, v49, v51

    move-object/from16 v37, v14

    move-object/from16 v4, v16

    move-object/from16 v1, v30

    move-object/from16 v2, v32

    move-object/from16 v10, v34

    move-object/from16 v9, v35

    const/4 v3, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    move-object/from16 v16, v15

    move-object/from16 v30, v21

    move-object/from16 v32, v25

    move-object/from16 v34, v26

    move-object/from16 v35, v27

    move-object/from16 v15, v38

    const/16 v21, 0x0

    move-object/from16 v38, v12

    move-object/from16 v25, v18

    move-object/from16 v26, v19

    move-object/from16 v27, v20

    move-object/from16 v12, v31

    const/16 v19, 0x0

    move-object/from16 v18, v5

    move-object/from16 v20, v8

    move-object/from16 v31, v22

    move-object/from16 v5, v33

    move-object v8, v7

    move-object/from16 v22, v11

    move-object/from16 v33, v24

    const/4 v11, 0x0

    const/16 v24, 0x0

    move-object v7, v6

    move-object/from16 v6, v17

    const/16 v17, 0x0

    move-object/from16 v54, v40

    move-object/from16 v40, v13

    move-object/from16 v13, v54

    :goto_0
    xor-int v14, v46, v48

    mul-int/lit16 v14, v14, 0x1f25

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v0, v14

    xor-int v46, v49, v0

    sparse-switch v46, :sswitch_data_0

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v1, v52

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    sget-object v41, Ll/ۜۨ֫;->֡᩵᩹:[S

    const/16 v42, 0x22

    .line 131
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_21

    goto/16 :goto_34

    .line 90
    :sswitch_0
    sget v0, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    :goto_1
    move/from16 v49, v53

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    goto/16 :goto_30

    .line 317
    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v0, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v17

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    goto/16 :goto_27

    .line 216
    :sswitch_2
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_3

    :cond_2
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v19

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v19, v3

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    goto/16 :goto_24

    :cond_3
    :goto_2
    const-string v0, "\u1a74\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, -0x3ab9

    const v43, 0xe8511b9

    xor-int v14, v14, v43

    const v43, -0x373ae4ee

    goto/16 :goto_9

    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v0, :cond_2

    :goto_3
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v1, v52

    :goto_4
    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    goto/16 :goto_34

    :sswitch_4
    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v0, :cond_4

    goto :goto_6

    :cond_4
    const-string v0, "\u06ec\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v48, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, -0x1221

    const v43, 0x480e8e8e

    xor-int v14, v14, v43

    const v43, 0x444e7b08

    goto/16 :goto_9

    .line 245
    :sswitch_5
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    const-string v0, "\u1a7a\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, 0x6f

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, 0x27a7

    const v43, 0x6a4b34a8

    xor-int v14, v14, v43

    const v43, -0x70988025

    goto/16 :goto_9

    .line 339
    :sswitch_6
    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_6
    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, -0x1053

    const v43, 0xe8eaa69

    xor-int v14, v14, v43

    const v43, 0x11a758ae

    goto/16 :goto_9

    :sswitch_7
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v0, "\u1a7b\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, -0x8a5

    const v43, 0x5a99306f

    xor-int v14, v14, v43

    const v43, -0x412f7a73

    goto/16 :goto_9

    :sswitch_8
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto/16 :goto_3

    :sswitch_9
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    return-void

    .line 336
    :sswitch_a
    iget-object v0, v6, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    move-object v13, v0

    goto :goto_7

    .line 337
    :sswitch_b
    iget-object v0, v6, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v7, v0}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 338
    invoke-static {v8, v13}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    invoke-static {v3, v11}, Ll/ۗܰ;->ۗۛܳ(Ljava/lang/Object;Z)V

    goto/16 :goto_a

    .line 316
    :sswitch_c
    iget-object v0, v15, Ll/ܿ᩺֫;->ۤ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    move-object v9, v0

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    goto/16 :goto_f

    :sswitch_d
    if-nez v39, :cond_8

    const-string v0, "\u073f\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v48, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, -0x2753

    const v43, 0x56fedbea

    xor-int v14, v14, v43

    const v43, 0x47008a58

    goto/16 :goto_9

    :cond_8
    move-object/from16 v13, v39

    :goto_7
    const-string v0, "\u1a76\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, 0x2cdf

    const v43, 0x766c3a5f

    xor-int v14, v14, v43

    const v43, 0x1d6bf330

    goto/16 :goto_9

    .line 314
    :sswitch_e
    invoke-static/range {v36 .. v36}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ll/ܿ᩺֫;

    .line 315
    iget-object v0, v15, Ll/ܿ᩺֫;->᩸:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "\u0736\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, -0x151d

    const v43, 0x7d20bb26

    xor-int v14, v14, v43

    const v43, 0x32442666

    goto/16 :goto_9

    .line 334
    :sswitch_f
    iget-object v0, v6, Ll/֡᩺֫;->ۧ:Ljava/lang/CharSequence;

    goto :goto_8

    :sswitch_10
    iget-object v0, v6, Ll/֡᩺֫;->֫:Ljava/lang/CharSequence;

    :goto_8
    move-object/from16 v39, v0

    const-string v0, "\u0730\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, -0x47

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, -0x399d

    const v43, -0x61cad4aa

    xor-int v14, v14, v43

    const v43, 0xe01f504

    goto/16 :goto_9

    .line 314
    :sswitch_11
    invoke-static/range {v36 .. v36}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u1a77\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, -0x789b

    const v43, -0x8eb9dfd

    xor-int v14, v14, v43

    const v43, -0x5ad0bb64

    goto/16 :goto_9

    :cond_9
    move-object/from16 v14, v38

    move-object/from16 v38, v2

    goto/16 :goto_e

    :sswitch_12
    if-eqz v11, :cond_a

    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, -0x5

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, 0x9bd

    const v43, -0x44a132b4

    xor-int v14, v14, v43

    const v43, -0x1868ccc2

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06e1\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x31

    xor-int v14, v0, v48

    mul-int/lit16 v14, v14, 0xcbf

    const v43, 0x339e718e

    xor-int v14, v14, v43

    const v43, -0x4e27db7c

    goto :goto_9

    .line 307
    :sswitch_13
    :try_start_0
    iget-object v0, v4, Ll/᩶᩺֫;->ۚ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, v33

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object/from16 v33, v0

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    goto/16 :goto_1c

    .line 314
    :sswitch_14
    iget-object v0, v4, Ll/᩶᩺֫;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v36, v0

    :cond_b
    const-string v0, "\u1a78\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v14, v0, v47

    mul-int/lit16 v14, v14, 0x13a9

    const v43, -0x4f8ca770

    xor-int v14, v14, v43

    const v43, 0x38698cb8

    :goto_9
    xor-int v49, v0, v43

    move v0, v14

    goto/16 :goto_0

    .line 321
    :sswitch_15
    iget-object v0, v4, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v7, v0}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    invoke-static {v8, v9}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_a
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v6, v27

    move-object/from16 v1, p1

    goto/16 :goto_19

    .line 331
    :sswitch_16
    invoke-static {v5, v10}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0, v12}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    iget-boolean v0, v6, Ll/֡᩺֫;->ۚ:Z

    move v11, v0

    move-object/from16 v45, v9

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v1, p1

    goto/16 :goto_13

    .line 331
    :sswitch_17
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 v14, v38

    invoke-direct {v5, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v6, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    .line 235
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v0

    if-ltz v0, :cond_c

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    goto/16 :goto_1

    :cond_c
    const-string v0, "\u0733\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    move-object/from16 v38, v2

    xor-int v2, v0, v47

    mul-int/lit16 v2, v2, 0x89d

    const v43, 0x2223b6f4

    xor-int v2, v2, v43

    const v43, 0x155d9241

    :goto_b
    xor-int v49, v0, v43

    move v0, v2

    :goto_c
    move-object/from16 v2, v38

    goto/16 :goto_17

    :sswitch_18
    move-object/from16 v14, v38

    if-nez v28, :cond_d

    const-string v0, "\u1a77\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    move-object/from16 v38, v2

    xor-int v2, v0, v48

    mul-int/lit16 v2, v2, 0x5455

    const v43, 0x12ba2498

    xor-int v2, v2, v43

    const v43, 0x24c12f6

    goto :goto_b

    :cond_d
    move-object/from16 v38, v2

    move-object/from16 v0, v28

    move-object/from16 v1, v33

    :goto_d
    move-object/from16 v2, v37

    move-object/from16 v54, v34

    move-object/from16 v34, v5

    move-object/from16 v5, v32

    move-object/from16 v32, v35

    move-object/from16 v35, v54

    goto/16 :goto_10

    :sswitch_19
    move-object/from16 v14, v38

    move-object/from16 v38, v2

    .line 313
    iget-object v0, v4, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_e

    const-string v2, "\u1a7b\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v48

    move-object/from16 v29, v0

    xor-int v0, v2, v47

    mul-int/lit16 v0, v0, -0x53cf

    const v43, -0x78c150e5

    xor-int v0, v0, v43

    const v43, -0x16d36d5

    xor-int v49, v2, v43

    goto :goto_c

    :cond_e
    move-object/from16 v29, v0

    :goto_e
    move-object/from16 v9, v29

    :goto_f
    const-string v0, "\u06ec\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x3d

    xor-int v2, v0, v48

    mul-int/lit16 v2, v2, 0x1fc9

    const v43, 0x5904db13

    xor-int v2, v2, v43

    const v43, -0xb89a9e5

    goto :goto_b

    :sswitch_1a
    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    .line 289
    :try_start_1
    iget-object v0, v2, Ll/᩺᩺֫;->ۚ:Ljava/lang/CharSequence;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v37, v1

    move-object/from16 v54, v34

    move-object/from16 v34, v5

    move-object/from16 v5, v32

    move-object/from16 v32, v35

    move-object/from16 v35, v54

    goto/16 :goto_12

    :catch_1
    move-exception v0

    move-object/from16 v37, v1

    move-object/from16 v26, v6

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v1, p1

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    goto/16 :goto_1e

    :sswitch_1b
    move-object/from16 v1, v34

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v34, v5

    move-object/from16 v5, v35

    move-object/from16 v2, v37

    .line 310
    invoke-static {v1, v5}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v35, v1

    move-object/from16 v1, v33

    move-object/from16 v54, v32

    move-object/from16 v32, v5

    move-object/from16 v5, v54

    invoke-interface {v5, v0, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    iget-object v0, v4, Ll/᩶᩺֫;->ۚ:Ljava/lang/String;

    :goto_10
    const-string v33, "\u0736\u06e4"

    invoke-static/range {v33 .. v33}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v47

    move-object/from16 v37, v0

    xor-int v0, v33, v48

    mul-int/lit16 v0, v0, -0x53a3

    const v43, 0x6d977e5

    xor-int v0, v0, v43

    const v43, 0x391e6143

    xor-int v49, v33, v43

    move-object/from16 v33, v1

    goto/16 :goto_11

    :sswitch_1c
    move-object/from16 v34, v5

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v1, v33

    .line 310
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v32

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v4, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    .line 206
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v33

    if-eqz v33, :cond_f

    move-object/from16 v35, v0

    move-object/from16 v33, v1

    move-object v0, v5

    move-object/from16 v45, v9

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v9, v31

    move/from16 v49, v53

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v31, v26

    move-object/from16 v22, v2

    move-object/from16 v26, v6

    move/from16 v2, v17

    move-object/from16 v6, p0

    goto/16 :goto_27

    :cond_f
    const-string v33, "\u06e4\u073d"

    invoke-static/range {v33 .. v33}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v48

    move-object/from16 v35, v0

    xor-int v0, v33, v47

    mul-int/lit16 v0, v0, 0x5cef

    const v43, -0x1b9b8aa6

    xor-int v0, v0, v43

    const v43, -0x3bceb230

    xor-int v49, v33, v43

    move-object/from16 v33, v1

    move-object/from16 v1, v37

    move-object/from16 v37, v2

    move-object/from16 v2, v38

    move-object/from16 v38, v14

    move-object/from16 v54, v35

    move-object/from16 v35, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v54

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v1, v33

    move-object/from16 v54, v34

    move-object/from16 v34, v5

    move-object/from16 v5, v32

    move-object/from16 v32, v35

    move-object/from16 v35, v54

    if-nez v23, :cond_10

    const-string v0, "\u06eb\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    mul-int/lit8 v0, v0, -0x4b

    move-object/from16 v33, v1

    xor-int v1, v0, v48

    mul-int/lit16 v1, v1, -0x2a8f

    const v43, -0x73ec2dcf

    xor-int v1, v1, v43

    const v43, -0x402f18d5

    xor-int v49, v0, v43

    move v0, v1

    :goto_11
    move-object/from16 v1, v37

    move-object/from16 v37, v2

    move-object/from16 v2, v38

    move-object/from16 v38, v14

    move-object/from16 v54, v32

    move-object/from16 v32, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v35, v54

    goto/16 :goto_0

    :cond_10
    move-object/from16 v33, v1

    move-object/from16 v0, v23

    :goto_12
    move-object/from16 v1, p1

    move-object/from16 v16, v0

    move-object/from16 v43, v5

    move-object/from16 v45, v9

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v9, v31

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v31, v26

    move-object/from16 v26, v6

    goto/16 :goto_20

    :sswitch_1e
    return-void

    :sswitch_1f
    move-object/from16 v1, p1

    .line 343
    move-object v0, v1

    check-cast v0, Ll/۟᩺֫;

    .line 344
    iget-object v1, v0, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v7, v1}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    iget-object v0, v0, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    invoke-static {v8, v0}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_20
    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    move-object/from16 v54, v34

    move-object/from16 v34, v5

    move-object/from16 v5, v32

    move-object/from16 v32, v35

    move-object/from16 v35, v54

    .line 329
    :try_start_2
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    move-object/from16 v43, v5

    :try_start_3
    iget-object v5, v6, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object/from16 v45, v9

    :try_start_4
    iget-boolean v9, v6, Ll/֡᩺֫;->ۚ:Z

    invoke-interface {v0, v5, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move v11, v0

    :goto_13
    const-string v0, "\u06eb\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v5, v0, v47

    mul-int/lit16 v5, v5, -0xe0d

    const v9, 0x7f2070f0

    xor-int/2addr v5, v9

    const v9, -0x394faa5d

    goto :goto_16

    :catch_2
    move-exception v0

    goto :goto_15

    :catch_3
    move-exception v0

    goto :goto_14

    :catch_4
    move-exception v0

    move-object/from16 v43, v5

    :goto_14
    move-object/from16 v45, v9

    :goto_15
    move-object v12, v0

    const-string v0, "\u1a74\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v5, v0, v48

    mul-int/lit16 v5, v5, 0x3525

    const v9, -0x5e63c2b2

    xor-int/2addr v5, v9

    const v9, -0x30c19284

    :goto_16
    xor-int v49, v0, v9

    move v0, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v1, v37

    move-object/from16 v9, v45

    move-object/from16 v37, v2

    move-object/from16 v35, v32

    move-object/from16 v2, v38

    move-object/from16 v32, v43

    :goto_17
    move-object/from16 v38, v14

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v5, v30

    move-object/from16 v1, p1

    .line 292
    invoke-static {v5, v9}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v26

    move-object/from16 v26, v6

    move-object/from16 v6, v27

    invoke-interface {v6, v0, v5}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 293
    iget-object v0, v2, Ll/᩺᩺֫;->ۚ:Ljava/lang/CharSequence;

    move-object/from16 v16, v0

    move-object/from16 v27, v4

    move-object/from16 v31, v5

    move-object/from16 v4, v22

    move/from16 v5, v24

    move-object/from16 v24, v6

    goto/16 :goto_20

    :sswitch_22
    move-object/from16 v45, v9

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v5, v26

    move-object/from16 v1, p1

    move-object/from16 v26, v6

    .line 292
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v27

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v2, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    .line 32
    sget v9, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v9, :cond_11

    move-object/from16 v30, v0

    move-object/from16 v31, v5

    move-object v9, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move/from16 v1, v52

    move/from16 v49, v53

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v2

    goto/16 :goto_4

    :cond_11
    const-string v9, "\u06da\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v47, v9

    mul-int/lit8 v9, v9, 0x9

    move-object/from16 v30, v0

    xor-int v0, v9, v48

    mul-int/lit16 v0, v0, 0x12eb

    const v31, -0x4fb5ddc0

    xor-int v0, v0, v31

    const v31, -0x3e4828b

    xor-int v49, v9, v31

    move-object/from16 v31, v6

    move-object/from16 v6, v26

    move-object/from16 v1, v37

    move-object/from16 v9, v45

    move-object/from16 v37, v2

    move-object/from16 v26, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v2, v38

    :goto_18
    move-object/from16 v38, v14

    goto/16 :goto_2b

    :sswitch_23
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move-object/from16 v5, v25

    move-object/from16 v6, v27

    move-object/from16 v1, p1

    .line 298
    invoke-static {v8, v5}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v5, v24

    goto :goto_19

    :sswitch_24
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move-object/from16 v5, v25

    move-object/from16 v6, v27

    move-object/from16 v1, p1

    const/4 v0, 0x4

    move/from16 v5, v24

    if-eq v5, v0, :cond_12

    :goto_19
    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    move-object/from16 v24, v6

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, 0x778d

    const v27, 0x4e01576

    xor-int v6, v6, v27

    const v27, 0x61e482ae

    goto :goto_1a

    :cond_12
    move-object/from16 v24, v6

    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x69

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, -0x5b4f

    const v27, -0x2bd9b72e

    xor-int v6, v6, v27

    const v27, -0x3a83929c

    goto :goto_1a

    :sswitch_25
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    .line 326
    move-object v6, v1

    check-cast v6, Ll/֡᩺֫;

    const-string v0, "\u0730\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    move-object/from16 v26, v6

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, 0x1c8b

    const v27, -0x15099af8

    xor-int v6, v6, v27

    const v27, 0x1566b2aa

    :goto_1a
    xor-int v49, v0, v27

    move v0, v6

    move-object/from16 v27, v24

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move-object/from16 v37, v2

    move/from16 v24, v5

    move-object/from16 v31, v9

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v2, v38

    move-object/from16 v9, v45

    goto/16 :goto_18

    :sswitch_26
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    .line 305
    :try_start_5
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v6, v4, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    :try_start_6
    invoke-static {v0, v6, v4}, Ll/ۘܶ;->ۢ᩸᩸(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    const-string v0, "\u06eb\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    mul-int/lit8 v0, v0, -0x1f

    xor-int v6, v0, v47

    mul-int/lit8 v6, v6, 0x63

    const v22, -0x1ea2b1d8

    xor-int v6, v6, v22

    const v22, 0x3a400bb9

    goto/16 :goto_21

    :catch_5
    move-exception v0

    goto :goto_1b

    :catch_6
    move-exception v0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    :goto_1b
    move-object/from16 v33, v0

    :goto_1c
    const-string v0, "\u0730\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, 0x78f7

    const v22, 0x3f18603

    xor-int v6, v6, v22

    const v22, -0x4d3ad63

    goto/16 :goto_21

    :sswitch_27
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    .line 296
    invoke-static/range {v16 .. v16}, Ll/֨ۖ;->᩹ۡۢ(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_1f

    :cond_13
    move-object/from16 v25, v16

    goto :goto_1d

    :sswitch_28
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    .line 297
    iget-object v0, v2, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    move-object/from16 v25, v0

    :goto_1d
    const-string v0, "\u1a74\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x3d

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, -0x3bc5

    const v22, 0x3d6ff05a

    xor-int v6, v6, v22

    const v22, -0x74fbb612

    goto/16 :goto_21

    :sswitch_29
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    const/4 v0, 0x3

    if-eq v5, v0, :cond_14

    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, -0x2269

    const v22, 0x17cfaf12

    xor-int v6, v6, v22

    const v22, -0x77dde3e

    goto/16 :goto_21

    :cond_14
    const-string v0, "\u0730\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, 0x7543

    const v22, -0x3996ce4b

    xor-int v6, v6, v22

    const v22, 0x4d2ffba6    # 1.8453155E8f

    goto/16 :goto_21

    :sswitch_2a
    move-object/from16 v45, v9

    move-object/from16 v4, v22

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    .line 302
    move-object v0, v1

    check-cast v0, Ll/᩶᩺֫;

    const-string v6, "\u06d9\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v48

    mul-int/lit8 v6, v6, 0x61

    move-object/from16 v22, v0

    xor-int v0, v6, v47

    mul-int/lit16 v0, v0, -0x482d

    const v27, -0x65efa484

    xor-int v0, v0, v27

    const v27, -0x1cd3b148

    xor-int v49, v6, v27

    move-object/from16 v27, v24

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move-object/from16 v37, v2

    move/from16 v24, v5

    move-object/from16 v31, v9

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v2, v38

    move-object/from16 v9, v45

    move-object/from16 v38, v14

    move-object/from16 v35, v32

    move-object/from16 v32, v43

    move-object/from16 v54, v22

    move-object/from16 v22, v4

    move-object/from16 v4, v54

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    .line 287
    :try_start_7
    invoke-static/range {v40 .. v40}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v6, v2, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    invoke-static {v0, v6, v4}, Ll/֨ۚ;->ۛ᩻ۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    const-string v0, "\u1a73\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x5

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, 0x52b9

    const v22, 0x16e745de

    xor-int v6, v6, v22

    const v22, 0x3e1515bf

    goto/16 :goto_21

    :catch_7
    move-exception v0

    :goto_1e
    const-string v6, "\u06d7\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v48

    mul-int/lit8 v6, v6, 0x15

    move-object/from16 v22, v0

    xor-int v0, v6, v47

    mul-int/lit16 v0, v0, 0x2275

    const v31, 0x24d608c

    xor-int v0, v0, v31

    const v31, -0x7b6abe4e

    xor-int v49, v6, v31

    move-object/from16 v31, v9

    move-object/from16 v6, v26

    move-object/from16 v1, v37

    move-object/from16 v9, v45

    move-object/from16 v37, v2

    move-object/from16 v26, v22

    move-object/from16 v2, v38

    move-object/from16 v22, v4

    move-object/from16 v38, v14

    goto/16 :goto_22

    :sswitch_2c
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    if-eqz v16, :cond_15

    const-string v0, "\u06da\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x31

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, -0x4dc7

    const v22, -0x27644558

    xor-int v6, v6, v22

    const v22, -0x7d2c4252

    goto/16 :goto_21

    :cond_15
    :goto_1f
    const-string v0, "\u073a\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, 0x1419

    const v22, -0x9cd202b    # -9.070007E32f

    xor-int v6, v6, v22

    const v22, 0x5b3f5ce2

    goto/16 :goto_21

    :sswitch_2d
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v1, p1

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    const/4 v0, 0x2

    if-eq v5, v0, :cond_16

    const-string v0, "\u073a\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x27

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, 0x4261

    const v22, 0x6656fb3e

    xor-int v6, v6, v22

    const v22, -0x17196e4a

    goto/16 :goto_21

    :cond_16
    const-string v0, "\u06e7\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v6, v0, v48

    mul-int/lit16 v6, v6, -0x51f1

    const v22, 0xe9fe186

    xor-int v6, v6, v22

    const v22, -0x57a64c6b

    goto/16 :goto_21

    :sswitch_2e
    move-object/from16 v37, v1

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v1, p1

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    .line 282
    move-object v0, v1

    check-cast v0, Ll/᩺᩺֫;

    .line 283
    iget-object v2, v0, Ll/ܰ᩺֫;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v7, v2}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 285
    iget-boolean v2, v0, Ll/᩺᩺֫;->ܺ:Z

    if-eqz v2, :cond_17

    const-string v2, "\u06e8\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v48

    mul-int/lit8 v2, v2, -0x7b

    xor-int v6, v2, v47

    mul-int/lit16 v6, v6, -0x24a5

    const v22, -0x27fa8c99

    xor-int v6, v6, v22

    const v22, -0xd914671

    xor-int v49, v2, v22

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    move-object/from16 v1, v37

    move-object/from16 v2, v38

    move-object/from16 v37, v0

    move v0, v6

    move-object/from16 v38, v14

    move-object/from16 v27, v24

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move/from16 v24, v5

    move-object/from16 v31, v9

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v9, v45

    goto/16 :goto_2b

    :cond_17
    move-object v2, v0

    move-object/from16 v16, v4

    :goto_20
    const-string v0, "\u1a7a\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x35

    xor-int v6, v0, v47

    mul-int/lit16 v6, v6, 0x42b

    const v22, -0xeb4081f    # -1.010002E30f

    xor-int v6, v6, v22

    const v22, -0x12010521

    :goto_21
    xor-int v49, v0, v22

    move-object/from16 v22, v4

    move v0, v6

    move-object/from16 v6, v26

    move-object/from16 v4, v27

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move-object/from16 v37, v2

    move-object/from16 v31, v9

    move-object/from16 v27, v24

    move-object/from16 v2, v38

    move-object/from16 v9, v45

    goto/16 :goto_28

    :sswitch_2f
    move-object/from16 v38, v2

    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v1, p1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    .line 280
    sget-object v0, Ll/ۜۨ֫;->֡᩵᩹:[S

    const/16 v6, 0x23

    const/16 v14, 0x17

    move-object/from16 v22, v2

    move/from16 v2, v53

    invoke-static {v0, v6, v14, v2}, Ll/֡ۢ;->֡֨ۛ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, p0

    iget-object v14, v6, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    move/from16 v49, v2

    move/from16 v2, v21

    if-eq v5, v2, :cond_18

    const-string v21, "\u06d7\u06dc"

    invoke-static/range {v21 .. v21}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v21

    sub-int v21, v47, v21

    mul-int/lit8 v21, v21, 0x35

    move-object/from16 v40, v0

    xor-int v0, v21, v48

    mul-int/lit16 v0, v0, 0x4dd3

    const v50, -0x63fdfba5

    xor-int v0, v0, v50

    const v50, -0x5a6477ba

    xor-int v21, v21, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move-object/from16 v31, v9

    move/from16 v49, v21

    move-object/from16 v37, v22

    move-object/from16 v9, v45

    move/from16 v21, v2

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    move-object/from16 v2, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v14

    goto/16 :goto_26

    :cond_18
    move-object/from16 v40, v0

    const-string v0, "\u06d6\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x6f

    move/from16 v21, v2

    xor-int v2, v0, v47

    mul-int/lit16 v2, v2, -0x513d

    const v50, 0x53fd96ce

    xor-int v2, v2, v50

    const v50, 0x7c09ebbf

    xor-int v0, v0, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move/from16 v49, v0

    move v0, v2

    move-object/from16 v31, v9

    move-object/from16 v37, v22

    move-object/from16 v2, v38

    move-object/from16 v38, v40

    move-object/from16 v9, v45

    move-object/from16 v22, v4

    move-object/from16 v40, v14

    :goto_22
    move-object/from16 v4, v27

    goto/16 :goto_26

    :sswitch_30
    move-object/from16 v45, v9

    move-object/from16 v24, v27

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v22, v37

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v37, v1

    move-object/from16 v38, v2

    move-object/from16 v27, v4

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v1, p1

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move-object/from16 v6, p0

    invoke-virtual/range {p1 .. p1}, Ll/ܰ᩺֫;->ۙ()Ll/ۘ᩺֫;

    move-result-object v0

    invoke-static {v0}, Ll/ۖܰ;->ܺ۬ܿ(Ljava/lang/Object;)I

    move-result v0

    aget v0, v20, v0

    const/16 v21, 0x1

    const/4 v2, 0x0

    .line 62
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_19

    move-object v4, v2

    move/from16 v2, v19

    goto/16 :goto_23

    :cond_19
    const-string v4, "\u06e2\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v47

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v48

    mul-int/lit16 v5, v5, 0x3f99

    const v50, -0x31119fa9    # -1.9996456E9f

    xor-int v5, v5, v50

    const v50, 0x7e70b7a3    # 7.9992054E37f

    xor-int v4, v4, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move/from16 v49, v4

    move-object/from16 v31, v9

    move-object/from16 v37, v22

    move-object/from16 v4, v27

    move-object/from16 v9, v45

    move-object/from16 v22, v2

    move-object/from16 v27, v24

    move-object/from16 v2, v38

    move/from16 v24, v0

    move v0, v5

    goto/16 :goto_29

    :sswitch_31
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v19

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    .line 278
    invoke-static {v3, v2}, Ll/᩺;->᩺᩶ۤ(Ljava/lang/Object;Z)V

    .line 280
    sget-object v20, Ll/ᩳۨ֫;->ۙ:[I

    .line 170
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_1a

    move v0, v5

    :goto_23
    const-string v5, "\u06db\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v48

    mul-int/lit8 v5, v5, 0x43

    move/from16 v19, v0

    xor-int v0, v5, v47

    mul-int/lit16 v0, v0, 0x1593

    const v50, 0x6fb109ae

    xor-int v0, v0, v50

    const v50, -0x55b8dfcc

    xor-int v5, v5, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move/from16 v49, v5

    move-object/from16 v31, v9

    move-object/from16 v37, v22

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v9, v45

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    move-object/from16 v35, v32

    move-object/from16 v32, v43

    move-object/from16 v27, v24

    move/from16 v24, v19

    move/from16 v19, v2

    goto/16 :goto_c

    :cond_1a
    const-string v0, "\u06db\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x7

    move-object/from16 v19, v3

    xor-int v3, v0, v47

    mul-int/lit16 v3, v3, -0x109b

    const v50, 0x6c2d6ce0

    xor-int v3, v3, v50

    const v50, 0x3a72358f

    goto :goto_25

    :sswitch_32
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v19

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v19, v3

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    .line 276
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 277
    iget-object v8, v6, Ll/ۜۨ֫;->᩶:Landroid/widget/TextView;

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 328
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v0

    if-ltz v0, :cond_1b

    :goto_24
    const-string v0, "\u0733\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, -0x7b

    xor-int v3, v0, v48

    mul-int/lit16 v3, v3, 0x2419

    const v50, -0x4c39f801

    xor-int v3, v3, v50

    const v50, 0x5ffe9ed

    goto :goto_25

    :cond_1b
    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v3, v0, v48

    mul-int/lit16 v3, v3, 0x3193

    const v50, -0x1d5fb0dd

    xor-int v3, v3, v50

    const v50, -0x12a7cbdf

    :goto_25
    xor-int v0, v0, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move/from16 v49, v0

    move v0, v3

    move-object/from16 v31, v9

    move-object/from16 v3, v19

    move-object/from16 v37, v22

    move-object/from16 v9, v45

    move/from16 v19, v2

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    move-object/from16 v2, v38

    move-object/from16 v38, v14

    :goto_26
    move-object/from16 v27, v24

    move/from16 v24, v5

    goto/16 :goto_2a

    :sswitch_33
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v19

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v19, v3

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move-object/from16 v3, v18

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    .line 275
    invoke-static {v3, v2}, Ll/ۖۖ;->ܿۙ᩸(Ljava/lang/Object;Z)V

    .line 276
    iget-object v7, v6, Ll/ۜۨ֫;->۟:Landroid/widget/TextView;

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_1c

    move-object/from16 v18, v3

    move-object/from16 v3, v19

    move-object/from16 v0, v32

    move-object/from16 v32, v43

    move/from16 v19, v2

    move/from16 v2, v17

    goto :goto_27

    :cond_1c
    const-string v0, "\u06db\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    mul-int/lit8 v0, v0, 0x41

    move/from16 v18, v2

    xor-int v2, v0, v48

    mul-int/lit16 v2, v2, 0x5c41

    const v50, 0x33016b29

    xor-int v2, v2, v50

    const v50, 0x54ef3ebc

    goto/16 :goto_2d

    :sswitch_34
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    .line 270
    iget-object v3, v6, Ll/ۜۨ֫;->ܿ:Ll/֨ܶ;

    move/from16 v2, v17

    invoke-static {v3, v2}, Ll/ۖۜ;->᩸᩷᩶(Ljava/lang/Object;I)V

    .line 274
    iget-boolean v0, v1, Ll/ܰ᩺֫;->ۙ:Z

    move/from16 v17, v0

    .line 275
    iget-object v0, v6, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 72
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v18

    if-eqz v18, :cond_1d

    move-object/from16 v18, v0

    move/from16 v19, v17

    move-object/from16 v0, v32

    move-object/from16 v32, v43

    :goto_27
    const-string v17, "\u1a76\u1a73"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v47

    mul-int/lit8 v17, v17, 0x4f

    move-object/from16 v43, v0

    xor-int v0, v17, v48

    mul-int/lit16 v0, v0, 0x1d57

    const v50, 0x1070bda1

    xor-int v0, v0, v50

    const v50, 0x477249b5

    xor-int v17, v17, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move-object/from16 v31, v9

    move/from16 v49, v17

    move-object/from16 v37, v22

    move-object/from16 v9, v45

    move/from16 v17, v2

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    move-object/from16 v2, v38

    move-object/from16 v38, v14

    move-object/from16 v27, v24

    move/from16 v24, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v35, v43

    goto/16 :goto_0

    :cond_1d
    const-string v18, "\u06e1\u06d9"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v48

    mul-int/lit8 v18, v18, -0x79

    move-object/from16 v19, v0

    xor-int v0, v18, v47

    mul-int/lit16 v0, v0, 0x580b

    const v50, -0x1f2195cd

    xor-int v0, v0, v50

    const v50, -0x5c3332d3

    xor-int v18, v18, v50

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move-object/from16 v31, v9

    move/from16 v49, v18

    move-object/from16 v18, v19

    move-object/from16 v37, v22

    move-object/from16 v9, v45

    move-object/from16 v22, v4

    move/from16 v19, v17

    move-object/from16 v4, v27

    move/from16 v17, v2

    move-object/from16 v27, v24

    move-object/from16 v2, v38

    :goto_28
    move/from16 v24, v5

    :goto_29
    move-object/from16 v38, v14

    :goto_2a
    move-object/from16 v5, v34

    move-object/from16 v34, v35

    :goto_2b
    move-object/from16 v35, v32

    move-object/from16 v32, v43

    goto/16 :goto_0

    :sswitch_35
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    const/16 v0, 0x8

    const/16 v17, 0x8

    goto :goto_2c

    :sswitch_36
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    const/4 v0, 0x0

    const/16 v17, 0x0

    :goto_2c
    const-string v0, "\u1a78\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v2, v0, v48

    mul-int/lit16 v2, v2, -0x2f05

    const v50, -0x137cb522

    xor-int v2, v2, v50

    const v50, 0x52593afb

    :goto_2d
    xor-int v0, v0, v50

    goto/16 :goto_36

    :sswitch_37
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v17

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move-object/from16 v1, p1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    .line 269
    iput-object v1, v6, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    .line 271
    invoke-virtual/range {p1 .. p1}, Ll/ܰ᩺֫;->ۙ()Ll/ۘ᩺֫;

    move-result-object v0

    sget-object v1, Ll/ۘ᩺֫;->۟:Ll/ۘ᩺֫;

    if-eq v0, v1, :cond_1e

    const-string v0, "\u06df\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    mul-int/lit8 v0, v0, 0x4b

    xor-int v1, v0, v47

    mul-int/lit16 v1, v1, 0x218d

    const v17, 0xabf4456

    xor-int v1, v1, v17

    const v17, -0x39f86859

    goto :goto_2e

    :cond_1e
    const-string v0, "\u06d9\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v47, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v48

    mul-int/lit16 v1, v1, -0x3acb

    const v17, -0x10909df

    xor-int v1, v1, v17

    const v17, 0x5d4750a8

    :goto_2e
    xor-int v0, v0, v17

    move/from16 v17, v2

    goto/16 :goto_31

    :sswitch_38
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move/from16 v2, v17

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    const v0, 0xe125

    const v53, 0xe125

    goto :goto_2f

    :sswitch_39
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move-object/from16 v38, v2

    move/from16 v2, v17

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    const/16 v0, 0x5ef

    const/16 v53, 0x5ef

    :goto_2f
    const-string v0, "\u1a76\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v1, v0, v47

    mul-int/lit16 v1, v1, 0x5a59

    const v17, 0x798ae3f4

    xor-int v1, v1, v17

    const v17, -0x697bf117

    xor-int v49, v0, v17

    move v0, v1

    move/from16 v17, v2

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move-object/from16 v2, v38

    move-object/from16 v31, v9

    move-object/from16 v38, v14

    move-object/from16 v37, v22

    move-object/from16 v9, v45

    goto/16 :goto_33

    :sswitch_3a
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move/from16 v2, v17

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    const v0, 0x5e13290

    add-int v0, v44, v0

    move/from16 v1, v52

    mul-int/lit16 v2, v1, 0x4d98

    sub-int/2addr v0, v2

    if-ltz v0, :cond_1f

    const-string v0, "\u06d7\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v47

    mul-int/lit8 v0, v0, -0x5

    xor-int v2, v0, v48

    mul-int/lit16 v2, v2, -0x4e01

    const v50, 0x613b2a83

    xor-int v2, v2, v50

    const v50, 0xf5af95a

    goto/16 :goto_35

    :cond_1f
    const-string v0, "\u05a1\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v2, v0, v47

    mul-int/lit16 v2, v2, -0x3bd7

    const v50, 0x30d3dd3e

    xor-int v2, v2, v50

    const v50, 0x5f6a07ea

    goto/16 :goto_35

    :sswitch_3b
    move-object/from16 v45, v9

    move-object/from16 v9, v31

    move-object/from16 v43, v32

    move-object/from16 v32, v35

    move-object/from16 v14, v38

    move/from16 v49, v53

    move-object/from16 v38, v2

    move-object/from16 v31, v26

    move-object/from16 v35, v34

    move-object/from16 v34, v5

    move-object/from16 v26, v6

    move/from16 v5, v24

    move-object/from16 v24, v27

    move-object/from16 v6, p0

    move-object/from16 v27, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v37

    move-object/from16 v37, v1

    move/from16 v54, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v18

    move/from16 v18, v54

    aget-short v52, v41, v42

    mul-int v44, v52, v52

    .line 280
    sget v0, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v0, :cond_20

    move-object/from16 v2, v38

    :goto_30
    const-string v0, "\u1a77\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v1, v0, v48

    mul-int/lit16 v1, v1, 0x96f

    const v38, 0x149d3f7b

    xor-int v1, v1, v38

    const v38, -0x56296cf4

    xor-int v0, v0, v38

    move-object/from16 v38, v14

    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move/from16 v53, v49

    move/from16 v49, v0

    move v0, v1

    move-object/from16 v31, v9

    goto :goto_32

    :cond_20
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v47

    xor-int v1, v0, v48

    mul-int/lit16 v1, v1, 0x6abd

    const v2, -0x725c0422

    xor-int/2addr v1, v2

    const v2, 0x11bc807a

    xor-int/2addr v0, v2

    :goto_31
    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v2, v38

    move/from16 v53, v49

    move/from16 v49, v0

    move v0, v1

    move-object/from16 v31, v9

    move-object/from16 v38, v14

    :goto_32
    move-object/from16 v1, v37

    move-object/from16 v9, v45

    move-object/from16 v37, v22

    :goto_33
    move-object/from16 v22, v4

    goto :goto_37

    :goto_34
    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v2, v0, v47

    mul-int/lit16 v2, v2, 0xa5f

    const v50, -0x18f4ac41

    xor-int v2, v2, v50

    const v50, 0x5eb2dbf6

    goto :goto_35

    :cond_21
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v48

    xor-int v2, v0, v47

    mul-int/lit16 v2, v2, -0x737

    const v50, 0x1b26b09a

    xor-int v2, v2, v50

    const v50, -0x3fe83da6

    :goto_35
    xor-int v0, v0, v50

    move/from16 v52, v1

    :goto_36
    move-object/from16 v6, v26

    move-object/from16 v26, v31

    move-object/from16 v1, v37

    move/from16 v53, v49

    move/from16 v49, v0

    move v0, v2

    move-object/from16 v31, v9

    move-object/from16 v37, v22

    move-object/from16 v2, v38

    move-object/from16 v9, v45

    move-object/from16 v22, v4

    move-object/from16 v38, v14

    :goto_37
    move-object/from16 v4, v27

    move-object/from16 v27, v24

    move/from16 v24, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v35

    move-object/from16 v35, v32

    move-object/from16 v32, v43

    move/from16 v54, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v19

    move/from16 v19, v54

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa02641 -> :sswitch_5
        -0x7f479993 -> :sswitch_10
        -0x7d6a7483 -> :sswitch_2a
        -0x7ce69f24 -> :sswitch_1
        -0x7c2b62ac -> :sswitch_18
        -0x777ff36e -> :sswitch_9
        -0x76c023fe -> :sswitch_32
        -0x76a73bba -> :sswitch_38
        -0x75023eb3 -> :sswitch_11
        -0x73a08a6f -> :sswitch_15
        -0x69018e19 -> :sswitch_19
        -0x6810f340 -> :sswitch_e
        -0x66212e6c -> :sswitch_d
        -0x64e2e901 -> :sswitch_25
        -0x63e7d2d4 -> :sswitch_2e
        -0x63238f23 -> :sswitch_d
        -0x625b6937 -> :sswitch_26
        -0x5ff83eae -> :sswitch_9
        -0x5cf410ae -> :sswitch_30
        -0x5af4475b -> :sswitch_0
        -0x5a46521a -> :sswitch_34
        -0x529f3265 -> :sswitch_f
        -0x4ee382c6 -> :sswitch_e
        -0x4d8f523e -> :sswitch_3
        -0x4c3f15ce -> :sswitch_27
        -0x4b06b479 -> :sswitch_2c
        -0x4777749b -> :sswitch_23
        -0x4757315b -> :sswitch_14
        -0x43e8827a -> :sswitch_2d
        -0x41b3cfa7 -> :sswitch_23
        -0x407bb893 -> :sswitch_3b
        -0x3d00d24d -> :sswitch_10
        -0x3caba3b8 -> :sswitch_20
        -0x3c9080e3 -> :sswitch_16
        -0x3a7ad189 -> :sswitch_0
        -0x38892286 -> :sswitch_15
        -0x386bde0b -> :sswitch_31
        -0x386a560e -> :sswitch_7
        -0x3809948e -> :sswitch_6
        -0x361ad272 -> :sswitch_1a
        -0x359ae29f -> :sswitch_26
        -0x330f16df -> :sswitch_31
        -0x2db22d5a -> :sswitch_24
        -0x2b69d42d -> :sswitch_a
        -0x231152c2 -> :sswitch_7
        -0x1ee91224 -> :sswitch_30
        -0x1b59af87 -> :sswitch_2c
        -0x1a0e1488 -> :sswitch_17
        -0x19275a75 -> :sswitch_4
        -0x181b73a8 -> :sswitch_2b
        -0x17fafac2 -> :sswitch_1d
        -0x15a3c05c -> :sswitch_2a
        -0x11a7371f -> :sswitch_11
        -0x11616603 -> :sswitch_1e
        -0xf0a46e6 -> :sswitch_2f
        -0x8fdf265 -> :sswitch_2
        -0x7b8c804 -> :sswitch_16
        -0x48cf008 -> :sswitch_1d
        0xa553de -> :sswitch_25
        0x20370a6 -> :sswitch_6
        0x39024ad -> :sswitch_20
        0x47ecd19 -> :sswitch_2b
        0x4ed6358 -> :sswitch_37
        0x4f5d3a1 -> :sswitch_8
        0x6e4b47c -> :sswitch_35
        0x85fcbc0 -> :sswitch_1
        0x878d896 -> :sswitch_28
        0x1021b383 -> :sswitch_1a
        0x1082ae17 -> :sswitch_12
        0x12039a50 -> :sswitch_1b
        0x13d24fa8 -> :sswitch_19
        0x15d24383 -> :sswitch_1c
        0x1625153a -> :sswitch_3b
        0x16b9a5d4 -> :sswitch_22
        0x188814e2 -> :sswitch_c
        0x19dcff33 -> :sswitch_c
        0x1ef42aa5 -> :sswitch_3
        0x1f9c0ac7 -> :sswitch_1f
        0x25e030ec -> :sswitch_35
        0x26a12db9 -> :sswitch_39
        0x2772f147 -> :sswitch_27
        0x2883e1ef -> :sswitch_13
        0x28a3f9bb -> :sswitch_14
        0x2a92d08c -> :sswitch_32
        0x2d1ebc6c -> :sswitch_1c
        0x2fe86664 -> :sswitch_12
        0x31cf7bad -> :sswitch_2f
        0x34493353 -> :sswitch_1f
        0x35981edc -> :sswitch_18
        0x36967022 -> :sswitch_f
        0x37150ec5 -> :sswitch_8
        0x37a4003c -> :sswitch_b
        0x3991737c -> :sswitch_39
        0x39a41c98 -> :sswitch_a
        0x3b7373dc -> :sswitch_3a
        0x40b53e94 -> :sswitch_37
        0x439934e9 -> :sswitch_38
        0x44d78c4b -> :sswitch_5
        0x455f694f -> :sswitch_24
        0x4621d468 -> :sswitch_b
        0x464ae241 -> :sswitch_3a
        0x4673f87f -> :sswitch_36
        0x4924774b -> :sswitch_29
        0x4a847947 -> :sswitch_17
        0x4b28ff40 -> :sswitch_1e
        0x509e6ce7 -> :sswitch_22
        0x522b2c38 -> :sswitch_36
        0x5ac7fd4f -> :sswitch_33
        0x623c56ba -> :sswitch_33
        0x6ff1a837 -> :sswitch_13
        0x717822fd -> :sswitch_2
        0x71b943e4 -> :sswitch_21
        0x71d5b53b -> :sswitch_34
        0x71f3728a -> :sswitch_28
        0x72032ea1 -> :sswitch_1b
        0x75f5c41c -> :sswitch_4
        0x7728070d -> :sswitch_29
        0x783b1520 -> :sswitch_2e
        0x79a3ba66 -> :sswitch_2d
        0x7d302a18 -> :sswitch_21
    .end sparse-switch
.end method
