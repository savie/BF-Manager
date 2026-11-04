.class public final synthetic Ll/ۙۤۧ;
.super Ljava/lang/Object;
.source "650G"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩵ۛ۠:[S


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙۤۧ;->᩵ۛ۠:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x8e4s
        -0x2bccs
        0x343cs
        0x191s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x16d5148a

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 0
    iput p1, p0, Ll/ۙۤۧ;->ܰ:I

    iput-object p2, p0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06d9\u0730"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x393f

    const v3, 0x5356532

    xor-int/2addr p2, v3

    const v3, -0x3665fc0f

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5455

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget p1, Ll/᩺;->۫۬۫:I

    if-lez p1, :cond_1

    goto :goto_2

    :sswitch_0
    sget p1, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06db\u1a7b"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x7d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x26bf

    const v3, -0x32559fcb

    xor-int/2addr p2, v3

    const v3, 0x4753eee1

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u06e4\u06e4"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x4f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x243b

    const v3, -0x2f439797

    xor-int/2addr p2, v3

    const v3, -0x38c63bf9

    goto :goto_0

    .line 2
    :sswitch_1
    sget p1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u06db\u1a7a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3d75

    const v3, 0x224b0dda

    xor-int/2addr p2, v3

    const v3, -0x7f0aa1b2

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    :goto_3
    const-string p1, "\u06eb\u05ab"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x45

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x112d

    const v3, 0x3d5dd282

    xor-int/2addr p2, v3

    const v3, -0x2e14c311

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p1, :cond_3

    const-string p1, "\u073a\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x529f

    const v3, -0x7cf83593

    xor-int/2addr p2, v3

    const v3, 0x1872f3f2

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073f\u1a7a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6433

    const v3, -0x740827e9

    xor-int/2addr p2, v3

    const v3, 0x4397bfaf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x416e64b9 -> :sswitch_2
        -0x28113f72 -> :sswitch_4
        -0x198f0175 -> :sswitch_4
        -0xfc44ad6 -> :sswitch_0
        0x3713db68 -> :sswitch_3
        0x489828ba -> :sswitch_1
        0x502f018c -> :sswitch_1
        0x56743c27 -> :sswitch_3
        0x6458dd7a -> :sswitch_0
        0x68bc0c17 -> :sswitch_2
        0x6f0207fd -> :sswitch_5
        0x7d8d2919 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 20

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

    const v14, 0x11495144

    sget v15, Ll/֡᩻;->᩷ۧ᩺:I

    sget v16, Ll/֨ۢ;->۬ܿܺ:I

    const-string v17, "\u06e4\u05a1"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x455d

    const v19, 0x5eeb1a6e

    xor-int v1, v1, v19

    const v19, -0x64545e5d

    xor-int v17, v17, v19

    move-object/from16 v19, v4

    move-object v12, v11

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x11495144

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x11bf

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    const/4 v13, 0x1

    const/4 v14, 0x3

    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v1, :cond_3

    goto/16 :goto_3

    .line 99
    :sswitch_0
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_c

    goto :goto_1

    .line 112
    :sswitch_1
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5515

    const v18, -0x63ef4750

    xor-int v5, v5, v18

    const v18, 0x5cf8d471

    goto/16 :goto_7

    .line 71
    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v1

    if-eqz v1, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    return-void

    .line 7
    :sswitch_5
    iget-object v1, v0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/ۛ۬᩻;

    .line 12
    invoke-static {v1}, Ll/ۛ۬᩻;->ۙ(Ll/ۛ۬᩻;)V

    return-void

    .line 15
    :sswitch_6
    iget-object v1, v0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v1, Ll/ܰ᩺᩻;

    .line 20
    invoke-static {v1}, Ll/ܰ᩺᩻;->ۙ(Ll/ܰ᩺᩻;)V

    return-void

    .line 23
    :sswitch_7
    iget-object v1, v0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v1, [B

    .line 28
    invoke-static {v1}, Ll/᩸ܿܳ;->ۙ([B)V

    return-void

    :sswitch_8
    xor-int v1, v3, v4

    .line 225
    invoke-static {v2, v1}, Ll/֫ܺ;->۠֫ۖ(Ljava/lang/Object;I)V

    return-void

    :sswitch_9
    const v4, 0x7eef3c3f    # 1.5899915E38f

    .line 188
    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "\u1a76\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1b1b

    const v18, -0x166a8c6c

    xor-int v5, v5, v18

    const v18, 0x3afc1642

    goto/16 :goto_7

    .line 33
    :sswitch_a
    invoke-static {v12, v13, v14, v11}, Ll/ۖ֨;->۟ۢ۫([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u1a76\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x75

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0xc35

    const v18, 0x476a8163

    xor-int v5, v5, v18

    const v18, 0x78b2cf76

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u1a7a\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x643b

    const v18, -0x14f450bd

    xor-int v5, v5, v18

    const v18, 0x76b9e974

    goto/16 :goto_7

    :sswitch_b
    sget-object v12, Ll/ۙۤۧ;->᩵ۛ۠:[S

    .line 193
    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u0730\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x13

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1927

    const v18, -0x77e1d82e

    xor-int v5, v5, v18

    const v18, 0x51c5f650

    goto/16 :goto_7

    .line 31
    :sswitch_c
    iget-object v1, v0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    .line 33
    move-object v2, v1

    check-cast v2, Landroid/widget/TextView;

    .line 194
    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u06da\u1a79"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x57

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1e21

    const v18, 0x24769f17

    xor-int v5, v5, v18

    const v18, -0x61a39c20

    goto/16 :goto_7

    .line 0
    :sswitch_d
    iget-object v1, v0, Ll/ۙۤۧ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/۫ۤۧ;

    invoke-static {v1}, Ll/۫ۤۧ;->᩷(Ll/۫ۤۧ;)V

    return-void

    .line 2
    :sswitch_e
    iget v1, v0, Ll/ۙۤۧ;->ܰ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u06d6\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0xa71

    const v18, -0x577523cb

    xor-int v5, v5, v18

    const v18, 0x159ca2ed

    goto/16 :goto_7

    :pswitch_0
    const-string v1, "\u1a76\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5705

    const v18, -0x19a047a

    xor-int v5, v5, v18

    const v18, -0x246036fe

    goto/16 :goto_7

    :pswitch_1
    const-string v1, "\u06e0\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5a37

    const v18, -0x5662c162

    xor-int v5, v5, v18

    const v18, 0x3a1473f

    goto/16 :goto_7

    :pswitch_2
    const-string v1, "\u06d9\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x71

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x729b

    const v18, 0x15d8a892

    xor-int v5, v5, v18

    const v18, -0x74be7ca5

    goto/16 :goto_7

    :pswitch_3
    const-string v1, "\u0733\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x355f

    const v18, -0x489037da

    xor-int v5, v5, v18

    const v18, 0x7bba0c82

    goto/16 :goto_7

    :sswitch_f
    const v1, 0xb2a0

    const v11, 0xb2a0

    goto :goto_2

    :sswitch_10
    const/16 v1, 0x5067

    const/16 v11, 0x5067

    :goto_2
    const-string v1, "\u1a75\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x31

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2e2f

    const v18, -0x68a89f4f

    xor-int v5, v5, v18

    const v18, -0x231ca748

    goto/16 :goto_7

    :sswitch_11
    mul-int v1, v7, v10

    sub-int v1, v9, v1

    if-gez v1, :cond_6

    const-string v1, "\u06ec\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x3d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x29fb

    const v18, 0x153cb963

    xor-int v5, v5, v18

    const v18, -0x19380e01

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u06df\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x59e5

    const v18, -0x57a1c436

    xor-int v5, v5, v18

    const v18, 0x27ab5cf6

    goto/16 :goto_7

    :sswitch_12
    const/16 v10, 0x2b1a

    .line 26
    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v1, :cond_7

    :goto_3
    const-string v1, "\u06d7\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0xb

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x46f5

    const v18, 0x134e3f8

    xor-int v5, v5, v18

    const v18, -0x41a0d1f

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u1a7a\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x65

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2ab

    const v18, 0x74a4e18

    xor-int v5, v5, v18

    const v18, -0x1bd19ee7

    goto/16 :goto_7

    :sswitch_13
    const v1, 0x1d06fa9

    add-int v9, v8, v1

    .line 149
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_8

    goto :goto_5

    :cond_8
    const-string v1, "\u06e8\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7ff

    const v18, 0x3bb3eb90

    xor-int v5, v5, v18

    const v18, -0x3121fa99    # -1.862448E9f

    goto/16 :goto_7

    :sswitch_14
    aget-short v7, v19, v6

    mul-int v8, v7, v7

    .line 0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v1

    if-gtz v1, :cond_9

    :goto_4
    const-string v1, "\u06eb\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x27

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x741d

    const v18, 0x5faf05b7

    xor-int v5, v5, v18

    const v18, -0x5b01e69

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u1a77\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x696d

    const v18, -0x228f8d5d

    xor-int v5, v5, v18

    const v18, -0x35c5007a    # -3063777.5f

    goto :goto_7

    :sswitch_15
    const/4 v6, 0x0

    .line 63
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_b

    :cond_a
    :goto_5
    const-string v1, "\u06e4\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4e53

    const v18, 0xfd50b75

    xor-int v5, v5, v18

    const v18, 0x57f2f0e9

    goto :goto_7

    :cond_b
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x76a5

    const v18, -0x6cc4b88f

    xor-int v5, v5, v18

    const v18, 0x693c192a

    goto :goto_7

    :sswitch_16
    sget-object v19, Ll/ۙۤۧ;->᩵ۛ۠:[S

    .line 199
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u0733\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x29db

    const v18, -0x4dd53172

    xor-int v5, v5, v18

    const v18, 0x6d0513c2

    goto :goto_7

    :cond_d
    const-string v1, "\u06e1\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0xcb1

    const v18, 0x4ce840b5    # 1.21767336E8f

    xor-int v5, v5, v18

    const v18, 0x7785b43a

    :goto_7
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x694642ff -> :sswitch_4
        -0x685689c4 -> :sswitch_13
        -0x5ea9001f -> :sswitch_12
        -0x56cf8d7c -> :sswitch_f
        -0x531cc135 -> :sswitch_15
        -0x52237b96 -> :sswitch_a
        -0x499c5cd7 -> :sswitch_1
        -0x3d3dfa30 -> :sswitch_e
        -0x3bd02571 -> :sswitch_14
        -0x3bac8fd3 -> :sswitch_1
        -0x384253ec -> :sswitch_16
        -0x303b8c18 -> :sswitch_11
        -0x273835d2 -> :sswitch_7
        -0x249b4ab0 -> :sswitch_0
        -0x18403ccb -> :sswitch_9
        -0x78e5606 -> :sswitch_a
        0xfaa4c0 -> :sswitch_6
        0x9248d8e -> :sswitch_d
        0xe59d4d0 -> :sswitch_5
        0x112a38ef -> :sswitch_b
        0x115f922b -> :sswitch_13
        0x178e7fda -> :sswitch_4
        0x20e9aa7c -> :sswitch_3
        0x2117ce92 -> :sswitch_e
        0x2471daa1 -> :sswitch_14
        0x256c54c7 -> :sswitch_3
        0x25b95462 -> :sswitch_b
        0x26411434 -> :sswitch_d
        0x2e664ad4 -> :sswitch_2
        0x2f8f2f56 -> :sswitch_15
        0x31e1b85c -> :sswitch_12
        0x36f0a08e -> :sswitch_8
        0x399f0d35 -> :sswitch_2
        0x40cd2c76 -> :sswitch_16
        0x45c3c638 -> :sswitch_f
        0x4861571e -> :sswitch_8
        0x4ea2e575 -> :sswitch_5
        0x5305178c -> :sswitch_c
        0x5535ff88 -> :sswitch_10
        0x56ff0ca8 -> :sswitch_c
        0x58b19751 -> :sswitch_6
        0x647f116c -> :sswitch_10
        0x6acd5010 -> :sswitch_11
        0x6d5374cf -> :sswitch_9
        0x73f90bb1 -> :sswitch_0
        0x7b858e38 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
