.class public final synthetic Ll/᩻᩷ۧ;
.super Ljava/lang/Object;
.source "B1VR"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ܿۤܳ:[S


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻᩷ۧ;->ܿۤܳ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x62as
        0x5f0cs
        -0x7204s
        -0x73a2s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x3f958595    # 1.1681391f

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v2, Ll/֨᩻;->ۛ֫ܶ:I

    .line 0
    iput p1, p0, Ll/᩻᩷ۧ;->ܰ:I

    iput-object p2, p0, Ll/᩻᩷ۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a7a\u06e7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x17

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5953

    const v3, 0x4e545b6

    xor-int/2addr p2, v3

    const v3, -0x21dad0a9    # -2.975707E18f

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4cf5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget p1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0736\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x315f

    const v3, -0x24f73159

    xor-int/2addr p2, v3

    const v3, 0x436ca42f

    goto :goto_0

    .line 3
    :sswitch_0
    sget p1, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u06d8\u06d7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x5f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x410d

    const v3, -0x6a0d5bfd

    xor-int/2addr p2, v3

    const v3, 0x1bda90f6

    goto :goto_0

    .line 4
    :sswitch_1
    sget-boolean p1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u1a74\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x9

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x142b

    const v3, -0x3f7f0d79

    xor-int/2addr p2, v3

    const v3, 0x2d6da211

    goto :goto_0

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    :goto_2
    const-string p1, "\u1a77\u0730"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6125

    const v3, 0x75071ea7

    xor-int/2addr p2, v3

    const v3, 0x70351e37

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz p1, :cond_3

    const-string p1, "\u1a74\u06e2"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1e77

    const v3, 0x6409a1d5

    xor-int/2addr p2, v3

    const v3, 0x58c2a96a

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u0733\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x4d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5f4b

    const v3, 0x1165931

    xor-int/2addr p2, v3

    const v3, 0x454bc75d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c96a364 -> :sswitch_0
        -0x633d048f -> :sswitch_2
        -0x51836d86 -> :sswitch_5
        -0x3298ef18 -> :sswitch_0
        -0x1cf1a9b5 -> :sswitch_1
        -0xb832dca -> :sswitch_1
        0xc465616 -> :sswitch_5
        0x3bdb0e64 -> :sswitch_3
        0x4652a654 -> :sswitch_4
        0x77576b5f -> :sswitch_3
        0x79ab2998 -> :sswitch_2
        0x7c1d7632 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 24

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

    const v18, 0x50044bc8

    sget v19, Ll/ۗ᩺;->֡ۙۜ:I

    sget v20, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v21, "\u06db\u06e2"

    invoke-static/range {v21 .. v21}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, 0x7a53

    const v23, -0x6710a065

    xor-int v1, v1, v23

    const v23, -0x3a098054

    xor-int v21, v21, v23

    move-object/from16 v16, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_0
    xor-int v9, v18, v20

    mul-int/lit16 v9, v9, 0x31e7

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v18, v21, v1

    sparse-switch v18, :sswitch_data_0

    .line 0
    iget-object v1, v0, Ll/᩻᩷ۧ;->᩶:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 141
    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 71
    :sswitch_0
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v1, :cond_4

    goto :goto_1

    .line 266
    :sswitch_1
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 8
    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v1, :cond_d

    goto :goto_1

    .line 340
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    :goto_1
    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x396d

    const v21, -0x70a50ed5

    xor-int v9, v9, v21

    const v21, -0x13ce262

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    :sswitch_5
    return-void

    :sswitch_6
    xor-int v1, v5, v6

    .line 425
    invoke-virtual {v2, v1, v3, v4}, Ll/ܽ֡֫;->ۙ(ILjava/lang/String;Z)V

    goto/16 :goto_4

    .line 218
    :sswitch_7
    invoke-static {v15, v7, v8, v14}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    const v6, 0x7d092b5e

    .line 390
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u0733\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x4f

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x468f

    const v21, 0x3bf6f0cd

    xor-int v9, v9, v21

    const v21, 0x2fbea7b8

    goto/16 :goto_6

    :sswitch_8
    const/4 v7, 0x1

    const/4 v8, 0x3

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u06dc\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, -0x3db

    const v21, 0xebe420e

    xor-int v9, v9, v21

    const v21, -0x4e81ab57

    goto/16 :goto_6

    .line 218
    :sswitch_9
    sget-object v15, Ll/᩻᩷ۧ;->ܿۤܳ:[S

    .line 172
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_3

    :cond_2
    :goto_2
    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, -0x2d1

    const v21, -0x4d0c7561

    xor-int v9, v9, v21

    const v21, 0x180946e0

    goto/16 :goto_6

    :cond_3
    const-string v1, "\u0730\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, -0x3b39

    const v21, -0x6f5e19d4

    xor-int v9, v9, v21

    const v21, -0x3e512ddd

    goto/16 :goto_6

    .line 218
    :sswitch_a
    invoke-static/range {v22 .. v22}, Ll/ۢ᩶֫;->ۙ(Ll/ۢ᩶֫;)Ll/ᩳ᩶֫;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳ᩶֫;->ᩴ(Ll/ᩳ᩶֫;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 349
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    :goto_3
    const-string v1, "\u05ab\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x61

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x1311

    const v21, -0x55e7c8f7

    xor-int v9, v9, v21

    const v21, -0x8309edc

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06eb\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x4dd9

    const v21, -0x1a956cbe

    xor-int v9, v9, v21

    const v21, -0x43b19472

    goto/16 :goto_6

    .line 220
    :sswitch_b
    invoke-static/range {v22 .. v22}, Ll/ۢ᩶֫;->ۙ(Ll/ۢ᩶֫;)Ll/ᩳ᩶֫;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳ᩶֫;->ᩴ(Ll/ᩳ᩶֫;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩸۠ۧ;->᩷(Ljava/lang/CharSequence;)V

    :goto_4
    const-string v1, "\u1a74\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x6075

    const v21, -0xf5a6622    # -4.1000833E29f

    xor-int v9, v9, v21

    const v21, 0x7a7da3c7

    goto/16 :goto_6

    .line 7
    :sswitch_c
    iget-object v1, v0, Ll/᩻᩷ۧ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/ܰۡ֫;

    .line 12
    invoke-static {v1}, Ll/ܰۡ֫;->ۙ(Ll/ܰۡ֫;)V

    return-void

    .line 15
    :sswitch_d
    iget-object v1, v0, Ll/᩻᩷ۧ;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v1, Ll/۟᩶֫;

    .line 216
    iget-object v1, v1, Ll/۟᩶֫;->ܳ:Ll/ۢ᩶֫;

    invoke-static {}, Ll/ۛۤۧ;->ۙ()Lbin/mt/plus/Main;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v9, "\u0730\u1a75"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v20

    mul-int/lit8 v9, v9, 0x7f

    move-object/from16 v21, v1

    xor-int v1, v9, v19

    mul-int/lit16 v1, v1, 0x1559

    const v22, 0x7bfac86d

    xor-int v1, v1, v22

    const v22, 0x2f8882b3

    xor-int v9, v9, v22

    move-object/from16 v22, v21

    move/from16 v21, v9

    goto/16 :goto_0

    :cond_6
    move-object/from16 v21, v1

    const-string v1, "\u06e8\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x100d

    const v22, -0x171bd2e8

    xor-int v9, v9, v22

    const v22, -0x5d257de4

    xor-int v1, v1, v22

    move-object/from16 v22, v21

    move/from16 v21, v1

    goto/16 :goto_7

    .line 2
    :sswitch_e
    iget v1, v0, Ll/᩻᩷ۧ;->ܰ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x5b

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x4375

    const v21, -0x5352d660

    xor-int v9, v9, v21

    const v21, 0x2ddaa6c5

    goto/16 :goto_6

    :pswitch_0
    const-string v1, "\u06e2\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x79bf

    const v21, 0xecacebe    # 4.999593E-30f

    xor-int v9, v9, v21

    const v21, 0x10d613c4

    goto/16 :goto_6

    :pswitch_1
    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x3753

    const v21, 0x127bac59

    xor-int v9, v9, v21

    const v21, -0x6fea3205

    goto/16 :goto_6

    :sswitch_f
    const/16 v1, 0xd97

    const/16 v14, 0xd97

    goto :goto_5

    :sswitch_10
    const v1, 0xd370

    const v14, 0xd370

    :goto_5
    const-string v1, "\u0733\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, -0x71df

    const v21, 0x3b04cbab

    xor-int v9, v9, v21

    const v21, -0x79ce51d4

    goto/16 :goto_6

    :sswitch_11
    add-int v1, v12, v13

    add-int/2addr v1, v1

    sub-int/2addr v1, v11

    if-gez v1, :cond_7

    const-string v1, "\u06da\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x71

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x2a77

    const v21, -0x7a63073a

    xor-int v9, v9, v21

    const v21, -0x56d1e8fa

    goto :goto_6

    :cond_7
    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x5e23

    const v21, 0x458b498f

    xor-int v9, v9, v21

    const v21, -0x66395387

    goto :goto_6

    :sswitch_12
    const v13, 0x59e5d69

    .line 87
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_b

    :cond_8
    const-string v1, "\u1a75\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x248f

    const v21, -0x5eaaa542

    xor-int v9, v9, v21

    const v21, -0x708128d0

    goto :goto_6

    :sswitch_13
    mul-int v11, v10, v10

    mul-int v12, v23, v23

    .line 199
    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_9

    move/from16 v9, v23

    goto :goto_a

    :cond_9
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v20

    mul-int/lit16 v9, v9, 0x47f3

    const v21, -0x51295ca4

    xor-int v9, v9, v21

    const v21, 0x5f26ea85

    :goto_6
    xor-int v21, v1, v21

    :goto_7
    move v1, v9

    goto/16 :goto_0

    :sswitch_14
    move/from16 v9, v23

    add-int/lit16 v10, v9, 0x25ed

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v1, :cond_a

    goto :goto_a

    :cond_a
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v0, v1, v20

    mul-int/lit16 v0, v0, 0x4fdd

    const v21, -0x4f1f6732

    xor-int v0, v0, v21

    const v21, 0x630ddfa9

    xor-int v21, v1, v21

    move v1, v0

    move/from16 v23, v9

    goto :goto_9

    :sswitch_15
    aget-short v23, v16, v17

    .line 413
    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v0, :cond_b

    goto :goto_b

    :cond_b
    const-string v0, "\u1a73\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, 0xb

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x394b

    const v9, 0x4bcd45c2    # 2.6905476E7f

    xor-int/2addr v1, v9

    const v9, 0x64160dea

    :goto_8
    xor-int v21, v0, v9

    :goto_9
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_16
    move/from16 v9, v23

    const/16 v17, 0x0

    .line 28
    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v0, :cond_c

    :goto_a
    const-string v0, "\u06e1\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x641b

    const v21, -0x570c2c03

    xor-int v1, v1, v21

    const v21, -0x39c2216b

    goto :goto_c

    :cond_c
    const-string v0, "\u06d6\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x5471

    const v21, 0x6c97bf36

    xor-int v1, v1, v21

    const v21, 0x7b7a46b4

    goto :goto_c

    :sswitch_17
    move/from16 v9, v23

    sget-object v16, Ll/᩻᩷ۧ;->ܿۤܳ:[S

    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_e

    move/from16 v23, v9

    :cond_d
    :goto_b
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x4cd3

    const v9, 0x10bc0c9c

    xor-int/2addr v1, v9

    const v9, 0x55f201fc

    goto :goto_8

    :cond_e
    const-string v0, "\u1a76\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x789b

    const v21, -0x29c52c84

    xor-int v1, v1, v21

    const v21, -0x8672504

    :goto_c
    xor-int v21, v0, v21

    move-object/from16 v0, p0

    move/from16 v23, v9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7be24a27 -> :sswitch_9
        -0x7a39fe1a -> :sswitch_d
        -0x781f840e -> :sswitch_6
        -0x6b0871b0 -> :sswitch_1
        -0x6a363971 -> :sswitch_16
        -0x697a664f -> :sswitch_2
        -0x689a67cc -> :sswitch_c
        -0x66e8611a -> :sswitch_7
        -0x6484fc65 -> :sswitch_14
        -0x60f796f2 -> :sswitch_13
        -0x5b90da2a -> :sswitch_0
        -0x3b8e8ae6 -> :sswitch_2
        -0x35c96d4e -> :sswitch_12
        -0x33a5ba43 -> :sswitch_16
        -0x3070395b -> :sswitch_f
        -0x217cbefe -> :sswitch_c
        -0x1a3c6f69 -> :sswitch_15
        -0x176b50a5 -> :sswitch_a
        -0x16ad6934 -> :sswitch_4
        -0x15435169 -> :sswitch_11
        -0x12d0410d -> :sswitch_11
        -0x9e21e9f -> :sswitch_13
        -0x272508b -> :sswitch_0
        0x64ecb1f -> :sswitch_a
        0xcd6bf8b -> :sswitch_10
        0x1321869a -> :sswitch_e
        0x182cbe71 -> :sswitch_5
        0x1c7c8775 -> :sswitch_f
        0x246e419f -> :sswitch_7
        0x2bdd8c82 -> :sswitch_6
        0x37a0c1e2 -> :sswitch_3
        0x37cabc35 -> :sswitch_b
        0x3c5239f9 -> :sswitch_9
        0x40d76adb -> :sswitch_3
        0x4ea23f99 -> :sswitch_d
        0x50e66a72 -> :sswitch_17
        0x543883e9 -> :sswitch_10
        0x54bef928 -> :sswitch_8
        0x58b23274 -> :sswitch_5
        0x5c482a7a -> :sswitch_e
        0x5d722432 -> :sswitch_14
        0x6bd36646 -> :sswitch_4
        0x70dc1bc9 -> :sswitch_b
        0x7321242b -> :sswitch_1
        0x7896c670 -> :sswitch_12
        0x79c920c3 -> :sswitch_15
        0x7d6c71de -> :sswitch_8
        0x7e81fb90 -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
