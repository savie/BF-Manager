.class public final Ll/᩷ۡ᩺;
.super Ll/ۗ᩷᩺;
.source "H1R6"


# static fields
.field private static final ۬۠۬:[S


# instance fields
.field public ֨:Ll/֨ᩴ᩺;

.field public final synthetic ᩹:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۡ᩺;->۬۠۬:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1377s
        -0x3168s
        -0x3cefs
        -0x3d8bs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/᩷ۡ᩺;->᩹:Ljava/lang/ref/WeakReference;

    .line 120
    invoke-direct {p0}, Ll/ۗ᩷᩺;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۖ()V
    .locals 0

    return-void
.end method

.method public final ۙ()V
    .locals 22

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

    const v16, -0x4ad5264d

    sget v17, Ll/ۖۗ;->᩶۫ۗ:I

    sget v18, Ll/֡ܳ;->֡۠ۧ:I

    const-string v19, "\u06ec\u1a74"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, 0x5827

    const v21, 0x3d5c6906

    xor-int v1, v1, v21

    const v21, -0x609e337e

    xor-int v19, v19, v21

    move-object/from16 v21, v6

    const/16 v20, 0x0

    :goto_0
    xor-int v6, v16, v17

    mul-int/lit16 v6, v6, 0x2b3d

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    add-int v0, v8, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-ltz v0, :cond_7

    const-string v0, "\u06d8\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x1c75

    const v6, -0x718844ba

    xor-int/2addr v1, v6

    const v6, 0x380042be

    goto/16 :goto_7

    .line 46
    :sswitch_0
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\u1a79\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x56f1

    const v19, 0x3a4d1465

    xor-int v6, v6, v19

    const v19, 0x77d06b85

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_e

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    return-void

    :sswitch_5
    const v1, 0x7e29eb69

    xor-int/2addr v1, v5

    .line 140
    invoke-static {v1}, Ll/֨ܶ;->ۚۛۢ(I)Ll/ܺۡۜ;

    .line 141
    invoke-static {v4}, Ll/֡ۛ;->ۨܶ۠(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 139
    :sswitch_6
    invoke-static {v13, v14, v15, v12}, Ll/ۘ֡;->۫ۡ۫([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    .line 27
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u1a77\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1e29

    const v19, -0x687e54d1

    xor-int v6, v6, v19

    const v19, 0x21cc68dc

    goto/16 :goto_3

    :sswitch_7
    const/4 v15, 0x3

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_2

    :goto_1
    const-string v1, "\u0736\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0xb

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x5773

    const v19, 0x8674b65

    xor-int v6, v6, v19

    const v19, -0x2e325345

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06d8\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x160d

    const v19, 0x1a1d50f8

    xor-int v6, v6, v19

    const v19, 0x52295017

    goto/16 :goto_3

    .line 139
    :sswitch_8
    sget-object v13, Ll/᩷ۡ᩺;->۬۠۬:[S

    const/4 v14, 0x1

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u1a7a\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x17

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x71d5

    const v19, -0x4a4bf5a9

    xor-int v6, v6, v19

    const v19, -0x2da6f697

    goto/16 :goto_3

    .line 134
    :sswitch_9
    invoke-static {v3}, Ll/᩻ۡ᩺;->֨(Ll/᩻ۡ᩺;)V

    return-void

    .line 139
    :sswitch_a
    invoke-static {v4}, Ll/֫ۘ;->֨ۡۙ(Ljava/lang/Object;)Ll/ۗۜۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۜۙ;->ۙ()Ll/ۢۜۙ;

    move-result-object v1

    sget-object v6, Ll/ۢۜۙ;->֡:Ll/ۢۜۙ;

    if-eq v1, v6, :cond_4

    const-string v1, "\u05ab\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x71

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x1865

    const v19, -0x7b8a00ba

    xor-int v6, v6, v19

    const v19, -0x5f9d2e16

    goto/16 :goto_3

    .line 133
    :sswitch_b
    invoke-static {v3}, Ll/֨۟;->ۧ۠᩸(Ljava/lang/Object;)Ll/ۗۜۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۜۙ;->ۙ()Ll/ۢۜۙ;

    move-result-object v1

    sget-object v6, Ll/ۢۜۙ;->֡:Ll/ۢۜۙ;

    if-eq v1, v6, :cond_4

    const-string v1, "\u073f\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1b2f

    const v19, -0x38e920fc

    xor-int v6, v6, v19

    const v19, 0x19388845

    goto/16 :goto_3

    .line 138
    :sswitch_c
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/᩻ۡ᩺;

    if-eqz v4, :cond_4

    const-string v1, "\u1a74\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x3daf

    const v19, -0x3c8fde40

    xor-int v6, v6, v19

    const v19, -0x48d26cb1

    goto/16 :goto_3

    :sswitch_d
    return-void

    .line 132
    :sswitch_e
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/᩻ۡ᩺;

    if-eqz v3, :cond_4

    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x75

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x6a77

    const v19, 0x49e08816

    xor-int v6, v6, v19

    const v19, 0x3a5b4a06

    goto :goto_3

    .line 137
    :sswitch_f
    invoke-virtual/range {v20 .. v20}, Ll/֨ᩴ᩺;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "\u1a73\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x3f

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x5e2d

    const v19, 0x111b3942

    xor-int v6, v6, v19

    const v19, -0x2af108a7

    goto :goto_3

    :cond_4
    :goto_2
    const-string v1, "\u06d8\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x2da5

    const v19, -0x6c9663fe

    xor-int v6, v6, v19

    const v19, 0x15540cbe

    goto :goto_3

    .line 131
    :sswitch_10
    invoke-static/range {v20 .. v20}, Ll/֨۟;->֡۠ܽ(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Ll/᩷ۡ᩺;->᩹:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_5

    const-string v1, "\u073a\u06e1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1755

    const v19, 0x55b6dff9

    xor-int v6, v6, v19

    const v19, -0x1f80d0d3

    goto :goto_3

    :cond_5
    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x2b31

    const v19, 0x28ccf11e

    xor-int v6, v6, v19

    const v19, -0x7e00568

    :goto_3
    xor-int v19, v1, v19

    move v1, v6

    goto/16 :goto_0

    .line 130
    :sswitch_11
    iget-object v1, v0, Ll/᩷ۡ᩺;->֨:Ll/֨ᩴ᩺;

    invoke-static {v1}, Ll/֫ܺ;->᩹᩷ۧ(Ljava/lang/Object;)V

    .line 19
    sget v6, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v6, :cond_6

    move-object/from16 v20, v1

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u06d9\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v17

    mul-int/lit8 v6, v6, -0x27

    xor-int v0, v6, v18

    mul-int/lit16 v0, v0, 0x661b

    const v19, -0x5b129b01

    xor-int v0, v0, v19

    const v19, 0x3d64f1f

    xor-int v19, v6, v19

    move-object/from16 v20, v1

    move v1, v0

    goto/16 :goto_8

    :sswitch_12
    const/16 v0, 0x15c0

    const/16 v12, 0x15c0

    goto :goto_4

    :sswitch_13
    const v0, 0x9f88

    const v12, 0x9f88

    :goto_4
    const-string v0, "\u1a73\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x69

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x12b7

    const v6, -0x4a347ddf

    xor-int/2addr v1, v6

    const v6, 0x45c69363

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0xb

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5401

    const v6, 0x7d7406cc

    xor-int/2addr v1, v6

    const v6, -0x2b57da5a

    goto/16 :goto_7

    :sswitch_14
    const/4 v11, 0x1

    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a75\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x21d7

    const v6, 0x166d4d78

    xor-int/2addr v1, v6

    const v6, 0x55f5b7c2

    goto/16 :goto_7

    :sswitch_15
    add-int/lit8 v10, v9, 0x1

    .line 112
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v0

    if-gtz v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u1a77\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x510b

    const v6, -0x5d0a9103

    xor-int/2addr v1, v6

    const v6, -0x72e6e249

    goto/16 :goto_7

    :sswitch_16
    mul-int/lit8 v9, v8, 0x2

    .line 137
    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_a

    const-string v0, "\u1a7b\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x63

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x73c5

    const v6, 0x234c5204

    xor-int/2addr v1, v6

    const v6, 0xb5734f0

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0xf95

    const v6, -0xb2f1d7e

    xor-int/2addr v1, v6

    const v6, -0x559734a0

    goto/16 :goto_7

    :sswitch_17
    aget-short v8, v21, v7

    .line 121
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_c

    :cond_b
    :goto_5
    const-string v0, "\u06ec\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0xf0d

    const v6, -0x6b2a0c7f

    xor-int/2addr v1, v6

    const v6, 0x21b707ef

    goto :goto_7

    :cond_c
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x51

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x57c1

    const v6, -0x105cea84

    xor-int/2addr v1, v6

    const v6, -0x28a2fa7d

    goto :goto_7

    :sswitch_18
    const/4 v7, 0x0

    .line 35
    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_d

    goto :goto_6

    :cond_d
    const-string v0, "\u073a\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5dbb

    const v6, 0x72fa63c8

    xor-int/2addr v1, v6

    const v6, 0x24858df9

    goto :goto_7

    :sswitch_19
    sget-object v21, Ll/᩷ۡ᩺;->۬۠۬:[S

    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_f

    :cond_e
    :goto_6
    const-string v0, "\u06ec\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x3055

    const v6, 0x56937e66

    xor-int/2addr v1, v6

    const v6, -0x6e146215

    goto :goto_7

    :cond_f
    const-string v0, "\u1a75\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x21b

    const v6, 0x3e2f4f51

    xor-int/2addr v1, v6

    const v6, 0x5e23c6ae

    :goto_7
    xor-int v19, v0, v6

    :goto_8
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d549a7d -> :sswitch_c
        -0x757768c3 -> :sswitch_10
        -0x73563ebd -> :sswitch_4
        -0x730597af -> :sswitch_7
        -0x6db5274f -> :sswitch_6
        -0x685e8d92 -> :sswitch_17
        -0x67eb0d5d -> :sswitch_14
        -0x6628468f -> :sswitch_15
        -0x62cf520f -> :sswitch_e
        -0x61bc533e -> :sswitch_18
        -0x5bd2c7c6 -> :sswitch_6
        -0x4c9486f1 -> :sswitch_10
        -0x4c7bb503 -> :sswitch_8
        -0x484f8a38 -> :sswitch_1
        -0x47e28113 -> :sswitch_e
        -0x407019d4 -> :sswitch_5
        -0x3c997993 -> :sswitch_11
        -0x3ba4b7b7 -> :sswitch_3
        -0x38fc7553 -> :sswitch_19
        -0x2b37bf28 -> :sswitch_16
        -0x203c7452 -> :sswitch_9
        -0x18b85b55 -> :sswitch_8
        -0x10051c3e -> :sswitch_9
        -0xce68617 -> :sswitch_14
        -0xc5334ed -> :sswitch_0
        -0xc1bcd0f -> :sswitch_f
        -0x87be6a8 -> :sswitch_16
        -0x79c373e -> :sswitch_13
        -0x6cf059a -> :sswitch_3
        0x5c5aef4 -> :sswitch_11
        0x112db149 -> :sswitch_d
        0x12ad72ed -> :sswitch_13
        0x18c94e45 -> :sswitch_12
        0x22cb5c86 -> :sswitch_7
        0x26ee4ff3 -> :sswitch_0
        0x2cb44ee6 -> :sswitch_a
        0x31829938 -> :sswitch_f
        0x4b608b28 -> :sswitch_2
        0x4c355ef9 -> :sswitch_b
        0x4d3660fe -> :sswitch_d
        0x518811f1 -> :sswitch_2
        0x5194f084 -> :sswitch_18
        0x5d7a9dfd -> :sswitch_12
        0x5fd92a5a -> :sswitch_b
        0x6a7a8ec7 -> :sswitch_4
        0x6c510912 -> :sswitch_15
        0x7277696b -> :sswitch_19
        0x72967967 -> :sswitch_1
        0x7644cfb8 -> :sswitch_c
        0x774df8c3 -> :sswitch_a
        0x79ade4bb -> :sswitch_5
        0x7ce7dde2 -> :sswitch_17
    .end sparse-switch
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public final ۚ()V
    .locals 1

    .line 126
    invoke-static {}, Ll/᩸۟᩺;->ۙ()Ll/֨ᩴ᩺;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۡ᩺;->֨:Ll/֨ᩴ᩺;

    return-void
.end method

.method public final ܰ()V
    .locals 0

    return-void
.end method
