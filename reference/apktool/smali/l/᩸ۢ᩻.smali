.class public final synthetic Ll/᩸ۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩴᩳ᩶:[S


# instance fields
.field public final synthetic ܰ:Landroid/view/Window;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ۢ᩻;->ᩴᩳ᩶:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1cc2s
        -0x5003s
        0x53f4s
        0x4e30s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/view/Window;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۢ᩻;->ܰ:Landroid/view/Window;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

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

    const v14, 0x13de868a

    sget v15, Ll/ۘ֡;->᩹ܶ۬:I

    sget v16, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v17, "\u1a74\u1a73"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x7ce7

    const v19, -0x42457782

    xor-int v0, v0, v19

    const v19, 0x1ec27a

    xor-int v17, v17, v19

    move-object v2, v1

    move-object/from16 v19, v4

    move-object v13, v12

    move/from16 v18, v17

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, 0x13de868a

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x3f21

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v17, v18, v0

    sparse-switch v17, :sswitch_data_0

    const/4 v0, 0x3

    .line 2
    invoke-static {v13, v14, v0, v12}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v0

    if-lez v0, :cond_7

    goto/16 :goto_2

    .line 95
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_2

    .line 223
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v0, :cond_5

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    return-void

    :sswitch_5
    xor-int v0, v3, v4

    .line 336
    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    return-void

    .line 2
    :sswitch_6
    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7d36416b

    .line 70
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "\u06ec\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x4a43

    const v18, -0x6e1cdbcb

    xor-int v5, v5, v18

    const v18, -0x28319760

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u0736\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x9

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x6e29

    const v18, -0x58da428a

    xor-int v5, v5, v18

    const v18, -0x4ff3146f

    goto/16 :goto_6

    :sswitch_7
    const/4 v14, 0x1

    .line 164
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v0

    if-gtz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2e8d

    const v18, -0x706e480    # -4.041999E34f

    xor-int v5, v5, v18

    const v18, 0x1132ee60

    goto/16 :goto_6

    :sswitch_8
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/᩸ۢ᩻;->ܰ:Landroid/view/Window;

    sget-object v13, Ll/᩸ۢ᩻;->ᩴᩳ᩶:[S

    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06d8\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v15

    xor-int v0, v5, v16

    mul-int/lit16 v0, v0, -0x2cbb

    const v18, -0x33e4b52

    xor-int v0, v0, v18

    const v18, -0x7d151ad9

    xor-int v18, v5, v18

    goto/16 :goto_0

    :sswitch_9
    const v0, 0xbead

    const v12, 0xbead

    goto :goto_1

    :sswitch_a
    const/16 v0, 0x217c

    const/16 v12, 0x217c

    :goto_1
    const-string v0, "\u0733\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x7b33

    const v18, -0x636d4a07

    xor-int v5, v5, v18

    const v18, -0x5d05bc87

    goto/16 :goto_6

    :sswitch_b
    add-int v0, v7, v11

    mul-int v0, v0, v0

    sub-int v0, v10, v0

    if-ltz v0, :cond_4

    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x1d

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x779d

    const v18, 0x2c961165

    xor-int v5, v5, v18

    const v18, -0x576c422b

    goto/16 :goto_6

    :cond_4
    const-string v0, "\u06db\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x63

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0xb53

    const v18, -0x16bf0ad1

    xor-int v5, v5, v18

    const v18, 0x79f927cc

    goto/16 :goto_6

    :sswitch_c
    const/16 v11, 0x4478

    .line 321
    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_6

    :cond_5
    :goto_2
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x11

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x56d

    const v18, -0x54db03c2

    xor-int v5, v5, v18

    const v18, 0x2ab97ba6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06e1\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x65

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x569d

    const v18, 0x558449fe

    xor-int v5, v5, v18

    const v18, 0x46dc342

    goto/16 :goto_6

    :sswitch_d
    add-int v0, v8, v9

    add-int v10, v0, v0

    .line 264
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_8

    :cond_7
    :goto_3
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x8c7

    const v18, 0x280e082f

    xor-int v5, v5, v18

    const v18, -0x629aa24d

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06df\u1a74"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x5d2d

    const v18, -0x7d85a5cc

    xor-int v5, v5, v18

    const v18, -0xff99e90

    goto/16 :goto_6

    :sswitch_e
    mul-int v8, v7, v7

    const v9, 0x124ff840

    .line 282
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_9

    :goto_4
    const-string v0, "\u05ab\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x3f69

    const v18, 0x282ee01f

    xor-int v5, v5, v18

    const v18, -0x39b8e2cc

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x37

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6565

    const v18, -0x2d06bdf1

    xor-int v5, v5, v18

    const v18, -0x55709904

    goto/16 :goto_6

    :sswitch_f
    aget-short v7, v19, v6

    .line 122
    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v0, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "\u073d\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x297f

    const v18, 0x3278bfa0

    xor-int v5, v5, v18

    const v18, 0x168884a3

    goto :goto_6

    :sswitch_10
    const/4 v6, 0x0

    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_c

    :cond_b
    const-string v0, "\u06d9\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x4369

    const v18, -0x7c11597

    xor-int v5, v5, v18

    const v18, 0x386e5758

    goto :goto_6

    :cond_c
    const-string v0, "\u06e7\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x7f

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x2e87

    const v18, -0x1c39a9e3

    xor-int v5, v5, v18

    const v18, 0x23ffbbf5

    goto :goto_6

    :sswitch_11
    sget-object v19, Ll/᩸ۢ᩻;->ᩴᩳ᩶:[S

    .line 215
    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v0, :cond_d

    :goto_5
    const-string v0, "\u073f\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x27

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x7b49

    const v18, 0x6df3216

    xor-int v5, v5, v18

    const v18, -0x2fa29033

    goto :goto_6

    :cond_d
    const-string v0, "\u0730\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0xe15

    const v18, 0x77768305    # 4.9998532E33f

    xor-int v5, v5, v18

    const v18, 0x79955e40

    :goto_6
    xor-int v18, v0, v18

    move v0, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7da84d66 -> :sswitch_a
        -0x79e782a9 -> :sswitch_4
        -0x7007a1b2 -> :sswitch_f
        -0x66a9f1d3 -> :sswitch_1
        -0x668ccc60 -> :sswitch_d
        -0x5aaf3286 -> :sswitch_5
        -0x548d9911 -> :sswitch_7
        -0x4b022781 -> :sswitch_1
        -0x48793564 -> :sswitch_6
        -0x3c89ef0a -> :sswitch_b
        -0x3a929cb5 -> :sswitch_e
        -0x2f9b2229 -> :sswitch_8
        -0x28c9a36a -> :sswitch_8
        -0x273ff3bb -> :sswitch_0
        -0x268c08eb -> :sswitch_3
        -0x266128cd -> :sswitch_c
        -0x22b9ec27 -> :sswitch_c
        -0x20c443ae -> :sswitch_e
        -0x1cbc7f75 -> :sswitch_5
        0x10b2871 -> :sswitch_f
        0xb210ff2 -> :sswitch_11
        0xfef3728 -> :sswitch_10
        0x1610b534 -> :sswitch_3
        0x19026664 -> :sswitch_7
        0x1e3e3b4e -> :sswitch_b
        0x403dec99 -> :sswitch_6
        0x454bfb42 -> :sswitch_d
        0x4af0f619 -> :sswitch_2
        0x500dfe33 -> :sswitch_10
        0x536ee13c -> :sswitch_a
        0x65d2ee41 -> :sswitch_2
        0x6aba67f1 -> :sswitch_0
        0x6c6c8e0e -> :sswitch_9
        0x6e5086ca -> :sswitch_4
        0x6ff80590 -> :sswitch_9
        0x7283f4ac -> :sswitch_11
    .end sparse-switch
.end method
