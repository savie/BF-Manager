.class public final synthetic Ll/۟᩺ۘ;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۫ۧۤ:[S


# instance fields
.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۟᩺ۘ;->۫ۧۤ:[S

    return-void

    :array_0
    .array-data 2
        0x1ba0s
        0x4facs
        0x4fabs
        0x4fbes
        0x4fads
        0x4fabs
        0x4f9cs
        0x4fb3s
        0x4fb6s
        0x4fbas
        0x4fb1s
        0x4fabs
        0x4fffs
        0x4f8ds
        0x4fbas
        0x4facs
        0x4faas
        0x4fb3s
        0x4fabs
        0x4fa4s
        0x4fa2s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x4dcafa51

    sget v1, Ll/֫;->ܶܺ᩻:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    .line 0
    iput p1, p0, Ll/۟᩺ۘ;->ܺ:I

    iput-object p2, p0, Ll/۟᩺ۘ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a77\u1a76"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6d5

    const v3, 0x61e560c7

    xor-int/2addr p2, v3

    const v3, 0xf321ace

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x70d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto :goto_2

    :sswitch_0
    sget p1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u06ec\u05ab"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x418f

    const v3, 0x189216c

    xor-int/2addr p2, v3

    const v3, 0x4367ac43

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06d6\u073a"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x2b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x15c9

    const v3, 0x106006b8

    xor-int/2addr p2, v3

    const v3, 0x42f13e01

    goto :goto_0

    .line 1
    :sswitch_2
    sget p1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e2\u1a7b"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2dc5

    const v3, -0x3180bc99

    xor-int/2addr p2, v3

    const v3, -0x5522a449

    goto :goto_0

    :goto_2
    const-string p1, "\u06e8\u1a75"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1281

    const v3, -0x6694d628

    xor-int/2addr p2, v3

    const v3, -0xfd0dc6f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 2
    :sswitch_5
    sget p1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz p1, :cond_3

    const-string p1, "\u1a7b\u06e1"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6029

    const v3, -0x276d7e9f

    xor-int/2addr p2, v3

    const v3, 0x1e7104a5

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a78\u1a73"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x57

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x487b

    const v3, 0x2c96ddf6

    xor-int/2addr p2, v3

    const v3, 0x48beb6ee

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76f72c04 -> :sswitch_0
        -0x67b44772 -> :sswitch_5
        -0x588e0a36 -> :sswitch_1
        -0x4ab49614 -> :sswitch_1
        -0x41d48cd2 -> :sswitch_3
        -0x32e89916 -> :sswitch_4
        -0x2689879a -> :sswitch_4
        -0x89da4a0 -> :sswitch_2
        0xd529887 -> :sswitch_2
        0x143956aa -> :sswitch_3
        0x5fc2dbe7 -> :sswitch_5
        0x6a77bada -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 25

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const v15, -0x5a02a2bb

    sget v16, Ll/ۗ;->֨۬ۖ:I

    sget v17, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v18, "\u1a75\u1a75"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x55

    xor-int v1, v18, v16

    mul-int/lit16 v1, v1, -0x1147

    const v20, 0x2fcba23f

    xor-int v1, v1, v20

    const v20, -0x2df2cb9a

    xor-int v18, v18, v20

    const/4 v4, 0x0

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v16

    mul-int/lit16 v15, v15, 0x2ad7

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    .line 77
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_0

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    goto/16 :goto_9

    :cond_0
    const-string v1, "\u06d6\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0xd

    move/from16 v18, v15

    xor-int v15, v1, v16

    mul-int/lit16 v15, v15, -0x7dfb

    const v21, -0x52fb2ea9

    xor-int v15, v15, v21

    const v21, 0x581edab5

    goto :goto_2

    :sswitch_0
    move/from16 v18, v15

    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v1, :cond_2

    :cond_1
    move-object/from16 v22, v3

    goto/16 :goto_7

    :cond_2
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    goto/16 :goto_9

    :sswitch_1
    move/from16 v18, v15

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_1

    :goto_1
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    goto/16 :goto_5

    :sswitch_2
    move/from16 v18, v15

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    return-void

    .line 7
    :sswitch_4
    iget-object v1, v0, Ll/۟᩺ۘ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Lbin/mt/plus/Main;

    .line 12
    invoke-static {v1}, Lbin/mt/plus/Main;->֨(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_5
    const/4 v1, 0x1

    .line 583
    invoke-static {v13, v14, v1, v12}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ᩳۨ;->ۙ(Ljava/lang/String;)V

    return-void

    :sswitch_6
    move/from16 v18, v15

    sget-object v13, Ll/۟᩺ۘ;->۫ۧۤ:[S

    const/16 v14, 0x14

    .line 379
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x59

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x55fb

    const v21, -0x76861cc9

    xor-int v15, v15, v21

    const v21, 0x17ca29ce

    :goto_2
    xor-int v1, v1, v21

    move/from16 v24, v18

    move/from16 v18, v1

    move v1, v15

    move/from16 v15, v24

    goto/16 :goto_0

    :sswitch_7
    move/from16 v18, v15

    .line 582
    invoke-static {v2, v3}, Lbin/mt/plus/Features3;->startMTIO(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 583
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v15, Ll/۟᩺ۘ;->۫ۧۤ:[S

    .line 471
    sget-boolean v21, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v21, :cond_4

    move-object/from16 v21, v2

    goto/16 :goto_8

    :cond_4
    move-object/from16 v21, v2

    const/16 v2, 0x13

    sget-boolean v23, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v23, :cond_5

    goto/16 :goto_8

    :cond_5
    move-object/from16 v22, v3

    const/4 v3, 0x1

    .line 583
    invoke-static {v15, v3, v2, v12}, Ll/֡ۛ;->ܰۙۚ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v1}, Ll/֫᩺;->۠ᩴᩴ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 252
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a78\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x5

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, 0x1ef5

    const v3, -0x396188e6

    xor-int/2addr v2, v3

    const v3, -0x2ce672ad

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v21, v2

    move/from16 v18, v15

    const/4 v1, 0x2

    .line 582
    aget-object v3, v19, v1

    .line 370
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u06e8\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x59

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x3337

    const v15, -0x6af8316d

    xor-int/2addr v2, v15

    const v15, -0x50331578

    xor-int/2addr v1, v15

    move/from16 v15, v18

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v22, v3

    move/from16 v18, v15

    .line 15
    iget-object v1, v0, Ll/۟᩺ۘ;->᩶:Ljava/lang/Object;

    .line 17
    move-object/from16 v19, v1

    check-cast v19, [Ljava/lang/String;

    const/4 v1, 0x1

    .line 582
    aget-object v2, v19, v1

    .line 460
    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06d9\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x5f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x7595

    const v15, 0x5ffc8d7b

    xor-int/2addr v3, v15

    const v15, 0x5154feab

    :goto_3
    xor-int/2addr v1, v15

    move/from16 v15, v18

    move/from16 v18, v1

    move v1, v3

    move-object/from16 v3, v22

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    .line 2
    iget v1, v0, Ll/۟᩺ۘ;->ܺ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u06db\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0xd

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, 0x68ab

    const v3, -0x3ae53b4e

    xor-int/2addr v2, v3

    const v3, 0xfd75220

    goto/16 :goto_a

    :pswitch_0
    const-string v1, "\u1a73\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x7f

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x20e9

    const v3, -0x702032d0

    xor-int/2addr v2, v3

    const v3, 0x4491d764

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    const v1, 0xc7df

    const v12, 0xc7df

    goto :goto_4

    :sswitch_c
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    const/16 v1, 0x4fdf

    const/16 v12, 0x4fdf

    :goto_4
    const-string v1, "\u073d\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, 0x1777

    const v3, 0x34af9bde

    xor-int/2addr v2, v3

    const v3, -0x6c55bbd0

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    add-int v1, v7, v11

    mul-int v1, v1, v1

    sub-int v1, v10, v1

    if-gez v1, :cond_9

    const-string v1, "\u06da\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x5b

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0xc63

    const v3, 0x25ecd783

    xor-int/2addr v2, v3

    const v3, 0x1a3d8ec5

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u0733\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x63

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, -0x49bb

    const v3, -0x285ce3ea

    xor-int/2addr v2, v3

    const v3, -0x5132d1d

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    add-int v1, v8, v9

    add-int v10, v1, v1

    const/16 v11, 0x79e

    .line 174
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_a

    :goto_5
    const-string v1, "\u1a75\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x3db1

    const v3, -0x5b544e4a

    xor-int/2addr v2, v3

    const v3, 0x7af9bba7

    goto/16 :goto_a

    :cond_a
    const-string v1, "\u1a74\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, 0x489d

    const v3, 0x1583dbd4

    xor-int/2addr v2, v3

    const v3, -0x7c7da289

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    mul-int v8, v7, v7

    const v9, 0x3a0584

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_b

    :goto_6
    move-object/from16 v2, v21

    :goto_7
    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x4b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x36bf

    const v15, -0x72c59bc5

    xor-int/2addr v3, v15

    const v15, 0x504266bf

    goto/16 :goto_3

    :cond_b
    const-string v1, "\u06e4\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x6f

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x78cd

    const v3, 0x53c978ad

    xor-int/2addr v2, v3

    const v3, -0x36364d2d

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    aget-short v7, v5, v6

    .line 403
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_c

    move-object/from16 v3, v22

    :goto_8
    const-string v1, "\u05a8\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x2501

    const v4, -0x2be129e0

    xor-int/2addr v2, v4

    const v4, 0x3e23b6a7

    xor-int/2addr v1, v4

    move/from16 v15, v18

    const/4 v4, 0x0

    goto :goto_b

    :cond_c
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x38d9

    const v3, 0x73980a01

    xor-int/2addr v2, v3

    const v3, 0x1b33e84a

    goto :goto_a

    :sswitch_11
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move/from16 v18, v15

    sget-object v5, Ll/۟᩺ۘ;->۫ۧۤ:[S

    const/4 v6, 0x0

    .line 278
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_d

    :goto_9
    const-string v1, "\u1a77\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x25

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, -0x72d5

    const v3, 0x5a8b9f63

    xor-int/2addr v2, v3

    const v3, 0x30da5852

    goto :goto_a

    :cond_d
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x5d

    xor-int v2, v1, v16

    mul-int/lit16 v2, v2, 0x62a5

    const v3, 0x81fc451

    xor-int/2addr v2, v3

    const v3, -0x5a935629

    :goto_a
    xor-int/2addr v1, v3

    move/from16 v15, v18

    move-object/from16 v3, v22

    :goto_b
    move/from16 v18, v1

    move v1, v2

    move-object/from16 v2, v21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e66f74a -> :sswitch_b
        -0x75f191e1 -> :sswitch_1
        -0x5fa00c08 -> :sswitch_e
        -0x5d5beab6 -> :sswitch_0
        -0x5b389b7b -> :sswitch_11
        -0x563cd91b -> :sswitch_f
        -0x540f5f2a -> :sswitch_d
        -0x4e563f45 -> :sswitch_9
        -0x470d4cac -> :sswitch_a
        -0x413dc3ba -> :sswitch_c
        -0x37f56d8b -> :sswitch_3
        -0x2a199447 -> :sswitch_e
        -0x26d27407 -> :sswitch_b
        -0xef577e9 -> :sswitch_1
        -0x9ecf532 -> :sswitch_10
        -0x9e39f39 -> :sswitch_6
        0x16779e52 -> :sswitch_a
        0x227fc68f -> :sswitch_5
        0x22d8a43d -> :sswitch_4
        0x27f84652 -> :sswitch_10
        0x298ff116 -> :sswitch_3
        0x2be22d9b -> :sswitch_d
        0x2d6c244c -> :sswitch_f
        0x330af454 -> :sswitch_4
        0x3d05817a -> :sswitch_2
        0x3e62f28d -> :sswitch_11
        0x4c0cc61c -> :sswitch_8
        0x4db0988a -> :sswitch_5
        0x65f0709d -> :sswitch_7
        0x6693f5b3 -> :sswitch_2
        0x6ea1aab7 -> :sswitch_8
        0x71f99fc0 -> :sswitch_7
        0x72d3e625 -> :sswitch_6
        0x753a53be -> :sswitch_0
        0x78112957 -> :sswitch_9
        0x7c573d5d -> :sswitch_c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
