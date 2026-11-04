.class public final synthetic Ll/۫ܿ֫;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۙܺܰ:[S


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    return-void

    :array_0
    .array-data 2
        0x7a7s
        -0x2588s
        -0x259fs
        -0x25d9s
        -0x25b6s
        -0x259bs
        -0x258cs
        -0x259fs
        -0x2583s
        -0x25c6s
        -0x259as
        -0x258fs
        -0x258as
        -0x258cs
        -0x2599s
        -0x258fs
        -0x25c6s
        -0x25a8s
        -0x25bfs
        -0x25d9s
        0x4ce3s
        -0x72d7s
        -0x56d6s
        0x490fs
        0x4383s
        -0x58fbs
        0x4c43s
        -0x5087s
        -0x4adfs
        0x5704s
        -0x588es
        0x4784s
        0x5a26s
        -0x7bfcs
        0x5185s
        -0x25bas
        -0x2583s
        -0x2584s
        -0x2591s
        -0x25a0s
        -0x2582s
        -0x25a0s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫ܿ֫;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 35

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const v26, -0x9db9d28

    sget v27, Ll/ۘܽ;->᩹ۧۚ:I

    sget v28, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v29, "\u06d9\u06d7"

    invoke-static/range {v29 .. v29}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v29

    add-int v29, v29, v28

    mul-int/lit8 v29, v29, 0x4d

    xor-int v0, v29, v27

    mul-int/lit16 v0, v0, -0x1bc1

    const v31, -0x2f3a9f42

    xor-int v0, v0, v31

    const v31, -0x57ac319f

    xor-int v29, v29, v31

    move-object/from16 v21, v2

    move-object v7, v6

    move-object/from16 v24, v14

    move-object/from16 v33, v19

    move-object/from16 v12, v20

    move-object/from16 v13, v23

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v32, 0x0

    move-object v2, v1

    move-object/from16 v20, v3

    move-object v6, v5

    move-object/from16 v19, v11

    const/4 v1, 0x0

    move-object v5, v4

    move-object v11, v10

    const/4 v4, 0x0

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v3, v26, v27

    mul-int/lit16 v3, v3, -0x3c7f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v26, v29, v0

    sparse-switch v26, :sswitch_data_0

    move-object/from16 v0, p0

    move-object/from16 v30, v2

    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v21, v4

    move-object/from16 v4, v33

    .line 2
    iget v2, v0, Ll/۫ܿ֫;->ܰ:I

    packed-switch v2, :pswitch_data_0

    const-string v0, "\u06df\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x2b

    xor-int v2, v0, v28

    mul-int/lit16 v2, v2, 0x3b07

    const v18, 0xe6adace

    xor-int v2, v2, v18

    const v18, 0x4e6fd963    # 1.0060003E9f

    goto/16 :goto_10

    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v29, v5

    goto/16 :goto_6

    .line 185
    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v29, v5

    goto/16 :goto_4

    :sswitch_2
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_2

    :goto_1
    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v18, v1

    move/from16 v21, v4

    goto/16 :goto_13

    :cond_2
    :goto_2
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, 0x3d7b

    const v29, 0x7712005b

    xor-int v3, v3, v29

    const v29, -0x5dc5e69b

    xor-int v29, v0, v29

    goto/16 :goto_e

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    goto :goto_1

    .line 153
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    return-void

    .line 388
    :sswitch_5
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 389
    invoke-static {v5}, Ll/ۛۨᩴ;->ۤ(Ljava/lang/String;)V

    move-object/from16 v3, v18

    move-object/from16 v18, v21

    goto :goto_3

    .line 392
    :sswitch_6
    invoke-static {v11}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    .line 393
    invoke-static {v11}, Ll/ۖ֨;->ܳ᩸ۘ(Ljava/lang/Object;)Landroid/widget/Button;

    move-result-object v0

    .line 394
    new-instance v3, Ll/᩷ۤۧ;

    move-object/from16 v29, v5

    const/4 v5, 0x4

    invoke-direct {v3, v5, v6}, Ll/᩷ۤۧ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v3}, Ll/ۖۗ;->᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v3, v18

    move-object/from16 v18, v21

    move-object/from16 v5, v29

    :goto_3
    move/from16 v21, v4

    move-object/from16 v4, v33

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v29, v5

    .line 389
    sget-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v3, 0x23

    const/4 v5, 0x7

    invoke-static {v0, v3, v5, v1}, Ll/ۖ֨;->۟ۢ۫([SIII)Ljava/lang/String;

    move-result-object v0

    .line 390
    invoke-virtual {v7, v0, v9}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 391
    invoke-static {v7}, Ll/֨ܿ;->᩺ܳۘ(Ljava/lang/Object;)Ll/۠ۖۧ;

    move-result-object v11

    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_3

    goto :goto_4

    :cond_3
    const-string v0, "\u06e7\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, 0x329d

    const v5, 0x4b193b1b    # 1.0042139E7f

    xor-int/2addr v3, v5

    const v5, -0x428c9d73

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v29, v5

    .line 388
    invoke-static {v13, v14, v15, v1}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7eff2370

    xor-int/2addr v0, v3

    .line 389
    invoke-static {v7, v0, v10}, Ll/֫ۤ;->ۜ۫۬(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v0, "\u06d8\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, 0x57c9

    const v5, 0x51d89f3b

    xor-int/2addr v3, v5

    const v5, 0x47ad9f45

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v29, v5

    .line 388
    invoke-static {v7, v8, v9}, Ll/ۗܶ;->۫֫᩹(Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance v10, Ll/ܶ᩷ۚ;

    const/4 v0, 0x4

    invoke-direct {v10, v0, v6}, Ll/ܶ᩷ۚ;-><init>(ILjava/lang/Object;)V

    sget-object v13, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v14, 0x20

    const/4 v15, 0x3

    .line 265
    sget v0, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v0, :cond_5

    :goto_4
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    mul-int/lit8 v0, v0, 0x79

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, -0x688f

    const v5, -0x55f7341c

    xor-int/2addr v3, v5

    const v5, 0x3ff1ea98

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u05ab\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, 0x566f

    const v5, -0x5e1be0e1

    xor-int/2addr v3, v5

    const v5, -0x4aba338c

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v29, v5

    move/from16 v0, v25

    .line 387
    invoke-static {v12, v4, v0, v1}, Ll/᩺;->۠᩸ۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    const v5, 0x7d335857

    xor-int v8, v3, v5

    const/4 v9, 0x0

    .line 102
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_6

    move/from16 v25, v0

    goto :goto_5

    :cond_6
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v27

    xor-int v5, v3, v28

    mul-int/lit16 v5, v5, -0x5f91

    const v25, 0x27216d71

    xor-int v5, v5, v25

    const v25, 0x654b19e3

    xor-int v3, v3, v25

    move/from16 v25, v0

    move v0, v5

    move-object/from16 v5, v29

    move/from16 v29, v3

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v29, v5

    .line 386
    invoke-static/range {v24 .. v24}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7d510b17

    xor-int/2addr v0, v3

    .line 387
    invoke-static {v7, v0}, Ll/֨ܿ;->ܽ᩷ܺ(Ljava/lang/Object;I)V

    sget-object v12, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v4, 0x1d

    const/16 v25, 0x3

    .line 139
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v28, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, 0x7eff

    const v5, -0x1a4fcab9

    xor-int/2addr v3, v5

    const v5, -0x3710f7c4

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v29, v5

    move/from16 v0, v25

    xor-int v3, v22, v23

    .line 386
    invoke-static {v7, v3}, Ll/۬;->ۙۙ᩺(Ljava/lang/Object;I)V

    sget-object v3, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v5, 0x1a

    const/4 v0, 0x3

    invoke-static {v3, v5, v0, v1}, Ll/֨ۚ;->֨֨۟([SIII)Ljava/lang/String;

    move-result-object v24

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_8

    :goto_5
    const-string v0, "\u06ec\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x67

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, -0x75df

    const v5, 0x52504f63

    xor-int/2addr v3, v5

    const v5, -0x6b19fec5

    goto :goto_7

    :cond_8
    const-string v0, "\u073f\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, -0x23cd

    const v5, -0xc96036a

    xor-int/2addr v3, v5

    const v5, 0x485733a3

    goto :goto_7

    :sswitch_d
    move-object/from16 v29, v5

    invoke-static {v6}, Ll/֨ۚ;->ܿ֡֨(Ljava/lang/Object;)Ll/ۖۖۧ;

    move-result-object v7

    sget-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v3, 0x17

    const/4 v5, 0x3

    invoke-static {v0, v3, v5, v1}, Ll/֨ᩳ;->ۘ᩸֨([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v22

    const v23, 0x7d294e14

    .line 10
    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_9

    :goto_6
    const-string v0, "\u1a77\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x6b

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, 0x7c2d

    const v5, -0x6968ea19

    xor-int/2addr v3, v5

    const v5, -0x2d5618a8

    goto :goto_7

    :cond_9
    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x17

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, 0x7b6b

    const v5, -0x5119aed2

    xor-int/2addr v3, v5

    const v5, -0x2c21bc12

    :goto_7
    xor-int/2addr v0, v5

    goto/16 :goto_d

    :sswitch_e
    return-void

    :sswitch_f
    move-object/from16 v29, v5

    .line 385
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    move-object/from16 v3, v21

    invoke-static {v0, v2, v3}, Ll/֨ۚ;->ۛ᩻ۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v20

    invoke-static {v5, v0}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    move/from16 v21, v4

    move-object/from16 v20, v5

    move-object/from16 v5, v29

    move-object/from16 v4, v33

    move-object/from16 v34, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v34

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v28, v0

    mul-int/lit8 v0, v0, -0x77

    move-object/from16 v20, v3

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, -0x141b

    const v21, 0x118bc63c

    xor-int v3, v3, v21

    const v21, 0x44c70f3d

    goto :goto_8

    :sswitch_10
    move-object/from16 v29, v5

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    .line 384
    invoke-static {}, Ll/ۛۤۧ;->ۙ()Lbin/mt/plus/Main;

    move-result-object v6

    if-eqz v6, :cond_b

    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v3, v0, v28

    mul-int/lit16 v3, v3, 0x6ebb

    const v21, 0x5671807f

    xor-int v3, v3, v21

    const v21, 0x7746fbc7

    :goto_8
    xor-int v0, v0, v21

    goto/16 :goto_c

    :cond_b
    move/from16 v21, v4

    move-object/from16 v3, v18

    move-object/from16 v18, v20

    move-object/from16 v4, v33

    move-object/from16 v20, v5

    move-object/from16 v5, v29

    goto :goto_9

    .line 89
    :sswitch_11
    invoke-static {}, Ll/֨ܿ;->ܺۚ۠()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/۬᩷ۧ;->ۙ(Landroid/content/Context;)V

    return-void

    :sswitch_12
    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d53b42e

    xor-int/2addr v0, v1

    .line 353
    invoke-static {v0}, Ll/ۗ᩺;->ۚۨܳ(I)V

    return-void

    :sswitch_13
    move-object/from16 v29, v5

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    .line 89
    sget-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/16 v3, 0x14

    move/from16 v21, v4

    const/4 v4, 0x3

    invoke-static {v0, v3, v4, v1}, Ll/֨ۖ;->ۜ᩸ۖ([SIII)Ljava/lang/String;

    move-result-object v19

    .line 288
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_c

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u1a78\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, -0x35c3

    const v4, 0x37ce99a5

    xor-int/2addr v3, v4

    const v4, 0x46929071

    goto/16 :goto_b

    .line 0
    :sswitch_14
    invoke-static {}, Ll/᩸ܿܳ;->ۙ()V

    return-void

    :sswitch_15
    move/from16 v21, v4

    const/16 v0, 0x9

    const/16 v3, 0xb

    move-object/from16 v4, v33

    .line 380
    invoke-static {v4, v0, v3, v1}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, v18

    invoke-static {v3, v2, v0}, Ll/֨ۚ;->ۛ᩻ۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v18, v0

    .line 381
    invoke-static {v5}, Ll/ۛۨᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 382
    invoke-static {v0, v5}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_d

    move-object/from16 v20, v5

    move-object v5, v0

    :goto_9
    const-string v0, "\u05a8\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    move-object/from16 v30, v2

    xor-int v2, v0, v27

    mul-int/lit16 v2, v2, 0x7189

    const v29, -0x5311c1f6

    xor-int v2, v2, v29

    const v29, 0x5571b74e

    xor-int v29, v0, v29

    move v0, v2

    move-object/from16 v33, v4

    move/from16 v4, v21

    move-object/from16 v2, v30

    move-object/from16 v21, v18

    goto/16 :goto_16

    :cond_d
    move-object/from16 v30, v2

    const-string v2, "\u06db\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v28

    move-object/from16 v20, v0

    xor-int v0, v2, v27

    mul-int/lit16 v0, v0, 0x39d1

    const v29, 0x796a5806

    xor-int v0, v0, v29

    const v29, 0x709bc366

    xor-int v29, v2, v29

    move-object/from16 v33, v4

    move/from16 v4, v21

    move-object/from16 v2, v30

    move-object/from16 v21, v18

    move-object/from16 v18, v3

    move-object/from16 v34, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v34

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v29, v5

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v21, v4

    .line 380
    sget-object v18, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    sget-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/4 v2, 0x1

    const/16 v3, 0x8

    invoke-static {v0, v2, v3, v1}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v33, Ll/۫ܿ֫;->ۙܺܰ:[S

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_a
    move-object/from16 v3, v18

    move/from16 v18, v1

    goto/16 :goto_13

    :cond_e
    const-string v0, "\u0730\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    mul-int/lit8 v0, v0, -0x7d

    xor-int v3, v0, v27

    mul-int/lit16 v3, v3, 0x74e1

    const v4, -0x744ec505

    xor-int/2addr v3, v4

    const v4, 0x6a2f1ce4

    :goto_b
    xor-int/2addr v0, v4

    move/from16 v4, v21

    :goto_c
    move-object/from16 v21, v20

    move-object/from16 v20, v5

    :goto_d
    move-object/from16 v5, v29

    move/from16 v29, v0

    :goto_e
    move v0, v3

    goto/16 :goto_0

    :pswitch_0
    const-string v2, "\u1a74\u06d6"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v27

    mul-int/lit8 v2, v2, 0x57

    xor-int v0, v2, v28

    mul-int/lit16 v0, v0, -0x1509

    const v18, -0x1a41c7e2

    xor-int v0, v0, v18

    const v18, -0x3e286a2f

    xor-int v2, v2, v18

    move-object/from16 v18, v3

    move-object/from16 v33, v4

    move/from16 v4, v21

    move-object/from16 v21, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v29

    move/from16 v29, v2

    goto/16 :goto_11

    :pswitch_1
    const-string v0, "\u06e2\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v2, v0, v27

    mul-int/lit16 v2, v2, 0x5b97

    const v18, 0x60771948

    xor-int v2, v2, v18

    const v18, -0x349bdb3e    # -1.4951618E7f

    goto/16 :goto_10

    :pswitch_2
    const-string v0, "\u06ec\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v2, v0, v28

    mul-int/lit16 v2, v2, -0x5d77

    const v18, 0x11661756

    xor-int v2, v2, v18

    const v18, -0xcc0b8e3

    goto :goto_10

    :pswitch_3
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v2, v0, v28

    mul-int/lit16 v2, v2, 0x485b

    const v18, 0x7c9b5fa9

    xor-int v2, v2, v18

    const v18, 0x4506d5bf

    goto :goto_10

    :sswitch_17
    move-object/from16 v30, v2

    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v21, v4

    move-object/from16 v4, v33

    const v0, 0xbe5a

    const v1, 0xbe5a

    goto :goto_f

    :sswitch_18
    move-object/from16 v30, v2

    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v21, v4

    move-object/from16 v4, v33

    const v0, 0xda15

    const v1, 0xda15

    :goto_f
    const-string v0, "\u06e4\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x15

    xor-int v2, v0, v28

    mul-int/lit16 v2, v2, 0x5fb3

    const v18, -0x43d6782e

    xor-int v2, v2, v18

    const v18, -0x12d10c62

    :goto_10
    xor-int v0, v0, v18

    move-object/from16 v18, v3

    move-object/from16 v33, v4

    move/from16 v4, v21

    move-object/from16 v21, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v29

    move/from16 v29, v0

    move v0, v2

    :goto_11
    move-object/from16 v2, v30

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v30, v2

    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v21, v4

    move-object/from16 v4, v33

    add-int v0, v16, v17

    add-int/2addr v0, v0

    move/from16 v18, v1

    move/from16 v2, v32

    add-int/lit16 v1, v2, 0xe38

    mul-int v1, v1, v1

    sub-int/2addr v1, v0

    if-lez v1, :cond_f

    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v28, v0

    mul-int/lit8 v0, v0, -0x13

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x5ce5

    const v31, -0x6e1bd6d4

    xor-int v1, v1, v31

    const v31, -0x64051c94

    goto :goto_12

    :cond_f
    const-string v0, "\u06e7\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, -0x276f

    const v31, 0x7c38f51a

    xor-int v1, v1, v31

    const v31, -0x48cae438

    :goto_12
    xor-int v0, v0, v31

    move/from16 v32, v2

    goto :goto_14

    :sswitch_1a
    move-object/from16 v30, v2

    move-object/from16 v29, v5

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v21

    move/from16 v18, v1

    move/from16 v21, v4

    move-object/from16 v4, v33

    sget-object v0, Ll/۫ܿ֫;->ۙܺܰ:[S

    const/4 v1, 0x0

    aget-short v32, v0, v1

    mul-int v16, v32, v32

    const v17, 0xca2c40

    .line 49
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_10

    move-object/from16 v33, v4

    move-object/from16 v2, v30

    :goto_13
    const-string v0, "\u06e8\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x41

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, -0x3645

    const v4, -0x326e1566

    xor-int/2addr v1, v4

    const v4, -0x6295889f

    xor-int/2addr v0, v4

    move/from16 v4, v21

    goto :goto_15

    :cond_10
    const-string v0, "\u073d\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v28

    mul-int/lit8 v0, v0, -0x3d

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x51df

    const v2, 0x6b03ea98

    xor-int/2addr v1, v2

    const v2, 0x1df78d4f

    xor-int/2addr v0, v2

    :goto_14
    move-object/from16 v33, v4

    move/from16 v4, v21

    move-object/from16 v2, v30

    :goto_15
    move-object/from16 v21, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v29

    move/from16 v29, v0

    move v0, v1

    move/from16 v1, v18

    :goto_16
    move-object/from16 v18, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7622085f -> :sswitch_e
        -0x72ab47e7 -> :sswitch_13
        -0x71c109b4 -> :sswitch_8
        -0x6e193a76 -> :sswitch_8
        -0x6c6987ee -> :sswitch_18
        -0x6c29654a -> :sswitch_1a
        -0x68b632de -> :sswitch_19
        -0x66e84673 -> :sswitch_c
        -0x662fff4c -> :sswitch_6
        -0x56c321e6 -> :sswitch_1a
        -0x505738cd -> :sswitch_7
        -0x4e33a71d -> :sswitch_3
        -0x4daf459d -> :sswitch_9
        -0x4a9698e0 -> :sswitch_11
        -0x465c1002 -> :sswitch_1
        -0x311a65ee -> :sswitch_a
        -0x2fe9eae5 -> :sswitch_4
        -0x2adbf0e7 -> :sswitch_3
        -0x295a9f7d -> :sswitch_0
        -0x276d9bc2 -> :sswitch_13
        -0x1e6d4770 -> :sswitch_a
        -0x1abcf1ce -> :sswitch_10
        -0x16bba33b -> :sswitch_17
        -0xbdd8053 -> :sswitch_c
        -0x91f843b -> :sswitch_14
        -0x3f5daf6 -> :sswitch_5
        -0xb62073 -> :sswitch_16
        0x8740ccb -> :sswitch_18
        0x1f45097d -> :sswitch_17
        0x2156ba71 -> :sswitch_0
        0x23f25f8a -> :sswitch_19
        0x26a00f29 -> :sswitch_2
        0x2a9f6c64 -> :sswitch_15
        0x2f486840 -> :sswitch_4
        0x312e7e5c -> :sswitch_5
        0x3dbed736 -> :sswitch_11
        0x406e6a4b -> :sswitch_d
        0x41e84116 -> :sswitch_9
        0x46879d15 -> :sswitch_e
        0x4e56a36a -> :sswitch_15
        0x50a80301 -> :sswitch_2
        0x53e5a34f -> :sswitch_d
        0x545bd973 -> :sswitch_7
        0x556737d8 -> :sswitch_12
        0x5ba148bd -> :sswitch_b
        0x5daed335 -> :sswitch_f
        0x5e4c361a -> :sswitch_b
        0x61a6512b -> :sswitch_16
        0x6258fdf7 -> :sswitch_1
        0x636db0af -> :sswitch_f
        0x64e592b1 -> :sswitch_12
        0x6941029f -> :sswitch_6
        0x69c688e7 -> :sswitch_10
        0x7406078a -> :sswitch_14
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
