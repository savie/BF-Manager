.class public final synthetic Ll/ۡ᩻ۨ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final ۠ܳ᩷:[S


# instance fields
.field public final synthetic ܺ:Landroid/widget/CheckBox;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡ᩻ۨ;->۠ܳ᩷:[S

    return-void

    :array_0
    .array-data 2
        0x119ds
        0x3280s
        0x3287s
        0x3283s
        0x328cs
        0x328as
        0x329ds
        0x32b6s
        0x3285s
        0x3286s
        0x328es
        0x32b6s
        0x3299s
        0x3288s
        0x329ds
        0x3281s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩻ۨ;->ܺ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 18

    const/4 v0, 0x0

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

    const v11, -0x6758e41c

    sget v12, Ll/֨ܰ;->ۢ᩷۟:I

    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v14, "\u0730\u06e0"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x2b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3fff

    const v16, -0x4d52bd3d

    xor-int v15, v15, v16

    const v16, -0x722aaf5d

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x2099

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p0

    move-object/from16 v16, v0

    sget-object v3, Ll/ۡ᩻ۨ;->۠ܳ᩷:[S

    .line 379
    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_b

    goto/16 :goto_6

    .line 289
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v14

    if-lez v14, :cond_1

    :cond_0
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_6

    :cond_1
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_8

    .line 105
    :sswitch_1
    sget v14, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v14, :cond_2

    :goto_1
    move-object/from16 v14, p0

    goto/16 :goto_2

    :cond_2
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_7

    .line 503
    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v14, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v14, :cond_0

    goto :goto_1

    .line 515
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto :goto_1

    .line 35
    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    :sswitch_5
    move-object/from16 v14, p0

    .line 596
    iget-object v0, v14, Ll/ۡ᩻ۨ;->ܺ:Landroid/widget/CheckBox;

    invoke-static {v0, v2}, Ll/֫ܺ;->ۖܰۘ(Ljava/lang/Object;Z)V

    return-void

    :sswitch_6
    move-object/from16 v14, p0

    .line 595
    invoke-interface {v0, v1}, Ll/ܿۧ᩺;->remove(Ljava/lang/String;)Ll/ܿۧ᩺;

    move-result-object v2

    invoke-static {v2}, Ll/ۘۗ;->۠ۘۛ(Ljava/lang/Object;)V

    .line 458
    sget-boolean v15, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v15, :cond_3

    const/4 v2, 0x0

    goto/16 :goto_2

    :cond_3
    const-string v15, "\u06d9\u06df"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x7d

    xor-int v2, v15, v12

    mul-int/lit16 v2, v2, -0x7c8f

    const v16, 0x78d19844

    xor-int v2, v2, v16

    const v16, 0x7624b523

    xor-int v15, v15, v16

    move v14, v15

    move v15, v2

    const/4 v2, 0x0

    goto :goto_0

    :sswitch_7
    move-object/from16 v14, p0

    const/16 v1, 0xf

    .line 595
    invoke-static {v9, v10, v1, v8}, Ll/ۗᩳ;->ۖ᩶۫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 149
    sget v15, Ll/֫;->ܶܺ᩻:I

    if-ltz v15, :cond_4

    move-object/from16 v16, v0

    goto/16 :goto_5

    :cond_4
    const-string v15, "\u073d\u06e7"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x3f6b

    const v17, 0x1b9f3f4c

    xor-int v0, v0, v17

    const v17, -0x3464e1c6

    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/4 v10, 0x1

    .line 91
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u073d\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x48d1

    const v17, -0x68c9c5b2

    xor-int v15, v15, v17

    const v17, 0x7707a419

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v14, p0

    .line 595
    sget-object v0, Ll/֡᩺ۘ;->ܽ:Ll/ۛۧ᩺;

    invoke-static {v0}, Ll/ۖᩴ;->᩷ۘۧ(Ljava/lang/Object;)Ll/ܿۧ᩺;

    move-result-object v0

    sget-object v9, Ll/ۡ᩻ۨ;->۠ܳ᩷:[S

    .line 403
    sget v15, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v15, :cond_6

    :goto_2
    const-string v15, "\u0736\u06e2"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, -0x2b

    move-object/from16 p1, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x6851

    const v16, 0x2a10dcb7

    xor-int v0, v0, v16

    const v16, -0x58ef54cb

    goto :goto_3

    :cond_6
    const-string v15, "\u06e7\u06e4"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x5

    move-object/from16 p1, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x32a7

    const v16, 0x1f9e8876

    xor-int v0, v0, v16

    const v16, -0x71e8326

    :goto_3
    xor-int v15, v15, v16

    move v14, v15

    move v15, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v0, 0x10e9

    const/16 v8, 0x10e9

    goto :goto_4

    :sswitch_b
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v0, 0x32e9

    const/16 v8, 0x32e9

    :goto_4
    const-string v0, "\u06db\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x3

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x75cd

    const v17, 0x220c4dd4

    xor-int v15, v15, v17

    const v17, 0x6afe0cd4

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    add-int v0, v4, v7

    mul-int v0, v0, v0

    sub-int v0, v6, v0

    if-gtz v0, :cond_7

    const-string v0, "\u1a7a\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x29d

    const v17, 0x12dfe3c2

    xor-int v15, v15, v17

    const v17, -0x7f73fa37

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u05ab\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x4011

    const v17, 0x29640fe7

    xor-int v15, v15, v17

    const v17, 0x359ee644

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/4 v7, 0x1

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u06e1\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x529b

    const v17, 0x2eea5e6e

    xor-int v15, v15, v17

    const v17, -0x482ef481

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    mul-int v0, v4, v5

    add-int/lit8 v6, v0, 0x1

    .line 223
    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06e4\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x6b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x69f

    const v17, -0x1b92c324

    xor-int v15, v15, v17

    const v17, -0x47b8dd65

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/4 v0, 0x0

    aget-short v4, v3, v0

    const/4 v5, 0x2

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u05ab\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x47

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x571d

    const v17, -0x1b0086ea

    xor-int v15, v15, v17

    const v17, -0x39345482

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u1a74\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x527

    const v17, -0x7caa935f

    xor-int v15, v15, v17

    const v17, -0x33407b5a

    goto/16 :goto_9

    :goto_6
    const-string v0, "\u06e4\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x3513

    const v17, -0x4aaf982d

    xor-int v15, v15, v17

    const v17, -0x231c3291

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06ec\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x202b

    const v17, -0x3887f0f3

    xor-int v15, v15, v17

    const v17, -0xaf97650

    goto :goto_9

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_c

    :goto_7
    const-string v0, "\u06d7\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3793

    const v17, 0x354c319e

    xor-int v15, v15, v17

    const v17, -0x1bee9489

    goto :goto_9

    :cond_c
    const-string v0, "\u05a1\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x4fdd

    const v17, 0x3d580b8d

    xor-int v15, v15, v17

    const v17, -0x38aefa73

    goto :goto_9

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_d

    :goto_8
    const-string v0, "\u06e1\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x6d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x57e1

    const v17, 0x3d5ce910

    xor-int v15, v15, v17

    const v17, 0x71266083

    goto :goto_9

    :cond_d
    const-string v0, "\u06e2\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x65

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3781

    const v17, -0x52f69541

    xor-int v15, v15, v17

    const v17, -0x58ab52d1

    :goto_9
    xor-int v0, v0, v17

    move v14, v0

    :goto_a
    move-object/from16 v0, v16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d54e2e6 -> :sswitch_5
        -0x6582fc3c -> :sswitch_b
        -0x645d2713 -> :sswitch_2
        -0x6344d454 -> :sswitch_7
        -0x5d0e3cc2 -> :sswitch_1
        -0x58756019 -> :sswitch_9
        -0x586d04dd -> :sswitch_0
        -0x56333d0d -> :sswitch_9
        -0x4cf01df8 -> :sswitch_e
        -0x4bd75b69 -> :sswitch_6
        -0x4a3421ff -> :sswitch_10
        -0x37154e4d -> :sswitch_3
        -0x2ea48d00 -> :sswitch_1
        -0x1833cb71 -> :sswitch_4
        -0x13d22be7 -> :sswitch_8
        -0x59ca0e4 -> :sswitch_e
        -0x4a86226 -> :sswitch_f
        -0x43f98f3 -> :sswitch_11
        -0x10559c2 -> :sswitch_11
        0x12396db4 -> :sswitch_d
        0x1eba21b7 -> :sswitch_f
        0x27bfd977 -> :sswitch_d
        0x2a154562 -> :sswitch_4
        0x2ba1a5a0 -> :sswitch_5
        0x375f647c -> :sswitch_3
        0x39df4658 -> :sswitch_2
        0x3ab1a784 -> :sswitch_10
        0x3e25d1b2 -> :sswitch_c
        0x48404627 -> :sswitch_0
        0x4a2d7188 -> :sswitch_a
        0x5100cd20 -> :sswitch_a
        0x5c6d91a1 -> :sswitch_c
        0x5f9cd510 -> :sswitch_7
        0x690b8e9b -> :sswitch_6
        0x6b334ca4 -> :sswitch_b
        0x799ba6f6 -> :sswitch_8
    .end sparse-switch
.end method
