.class public final Ll/֨ܿۨ;
.super Ljava/lang/Object;
.source "760C"

# interfaces
.implements Ll/ۨܿۨ;


# static fields
.field private static final ᩵᩺۟:[S


# instance fields
.field public final synthetic ܺ:Ll/۬ܿۨ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֨ܿۨ;->᩵᩺۟:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1d67s
        -0x515as
        0x4210s
        0x45e2s
    .end array-data
.end method

.method public constructor <init>(Ll/۬ܿۨ;)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܿۨ;->ܺ:Ll/۬ܿۨ;

    return-void
.end method


# virtual methods
.method public final ֨()Z
    .locals 1

    .line 225
    iget-object v0, p0, Ll/֨ܿۨ;->ܺ:Ll/۬ܿۨ;

    .line 301
    invoke-static {v0}, Ll/ۗܺ;->ۘܺۨ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ܰ()V
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

    const v14, 0xec0a0e

    sget v15, Ll/֫۟;->᩸ᩴܿ:I

    sget v16, Ll/֡֡;->᩶ۤ۠:I

    const-string v17, "\u073a\u05a8"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v0, v17, v16

    mul-int/lit16 v0, v0, -0x47b

    const v19, 0x7662631f

    xor-int v0, v0, v19

    const v19, -0x2873fb2

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

    const v17, 0xec0a0e

    :goto_0
    xor-int v5, v17, v16

    mul-int/lit16 v5, v5, 0xcfb

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v17, v18, v0

    sparse-switch v17, :sswitch_data_0

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_9

    goto :goto_1

    .line 64
    :sswitch_0
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v0, :cond_2

    :goto_1
    move-object/from16 v0, p0

    goto/16 :goto_3

    .line 30
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget-boolean v0, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v0, :cond_b

    goto/16 :goto_5

    .line 149
    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto :goto_1

    .line 214
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    :sswitch_4
    xor-int v0, v3, v4

    .line 220
    invoke-virtual {v1, v0}, Ll/ᩳ۟ۜ;->ۚ(I)V

    return-void

    :sswitch_5
    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7eb7d608

    .line 75
    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v0, "\u06e1\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x51

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x5157

    const v18, 0x2dcd1ccb

    xor-int v5, v5, v18

    const v18, 0x75fe110e

    goto/16 :goto_8

    :sswitch_6
    const/4 v0, 0x3

    .line 220
    invoke-static {v13, v14, v0, v12}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 65
    sget-boolean v0, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    const-string v0, "\u06eb\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x8c1

    const v18, 0x474f27f9

    xor-int v5, v5, v18

    const v18, 0x1f812857

    goto/16 :goto_8

    :sswitch_7
    const/4 v14, 0x1

    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_3

    :cond_2
    :goto_2
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0xe09

    const v18, -0x64e999fb

    xor-int v5, v5, v18

    const v18, 0x7d664210

    goto/16 :goto_8

    :cond_3
    const-string v0, "\u0736\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x2d43

    const v18, 0x7f911bef

    xor-int v5, v5, v18

    const v18, -0x19f8716

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v0, p0

    .line 220
    iget-object v1, v0, Ll/֨ܿۨ;->ܺ:Ll/۬ܿۨ;

    sget-object v13, Ll/֨ܿۨ;->᩵᩺۟:[S

    .line 113
    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_4

    :goto_3
    const-string v5, "\u1a76\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v16

    mul-int/lit8 v5, v5, -0x43

    xor-int v0, v5, v15

    mul-int/lit16 v0, v0, 0x6921

    const v18, -0x67c67db9

    xor-int v0, v0, v18

    const v18, -0x48080188

    xor-int v18, v5, v18

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06da\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x31

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x7093

    const v18, -0x2f3bcbf8

    xor-int v5, v5, v18

    const v18, 0x7e12311d

    goto/16 :goto_8

    :sswitch_9
    const/16 v0, 0x54e8

    const/16 v12, 0x54e8

    goto :goto_4

    :sswitch_a
    const v0, 0xc546

    const v12, 0xc546

    :goto_4
    const-string v0, "\u1a78\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x53ed

    const v18, 0x5f192332

    xor-int v5, v5, v18

    const v18, 0x6a28e4d

    goto/16 :goto_8

    :sswitch_b
    add-int v0, v10, v11

    add-int/2addr v0, v0

    sub-int/2addr v0, v9

    if-ltz v0, :cond_5

    const-string v0, "\u06d7\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x5975

    const v18, 0x729d3635

    xor-int v5, v5, v18

    const v18, 0x761d95ab

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x7

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x492b

    const v18, -0x66807695

    xor-int v5, v5, v18

    const v18, 0x13b18ab1

    goto/16 :goto_8

    :sswitch_c
    const v11, 0xc6be71

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x168d

    const v18, 0x2bd27902

    xor-int v5, v5, v18

    const v18, 0x6f49e9c9

    goto/16 :goto_8

    :sswitch_d
    mul-int v9, v8, v8

    mul-int v10, v7, v7

    .line 108
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06d9\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x15

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x4853

    const v18, 0x68b15a16

    xor-int v5, v5, v18

    const v18, 0x610bc07e

    goto/16 :goto_8

    :sswitch_e
    add-int/lit16 v8, v7, 0xe19

    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u1a79\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x4619

    const v18, 0x5ac9deda

    xor-int v5, v5, v18

    const v18, -0x7d921015

    goto/16 :goto_8

    :sswitch_f
    aget-short v7, v19, v6

    .line 27
    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_a

    :cond_9
    :goto_5
    const-string v0, "\u0733\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x639f

    const v18, -0x51374af7

    xor-int v5, v5, v18

    const v18, -0x42cc9506

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06da\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x21

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0xe4b

    const v18, -0x6290dffb

    xor-int v5, v5, v18

    const v18, -0x3948209b

    goto :goto_8

    :sswitch_10
    const/4 v6, 0x0

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_c

    :cond_b
    :goto_6
    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v5, v0, v15

    mul-int/lit8 v5, v5, 0x17

    const v18, 0x63d01b05

    xor-int v5, v5, v18

    const v18, 0x4681b9ef

    goto :goto_8

    :cond_c
    const-string v0, "\u05a1\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0xf1

    const v18, -0x278829e8    # -1.0899956E15f

    xor-int v5, v5, v18

    const v18, 0x41f8d03a

    goto :goto_8

    :sswitch_11
    sget-object v19, Ll/֨ܿۨ;->᩵᩺۟:[S

    .line 155
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_d

    :goto_7
    const-string v0, "\u06df\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x7d

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x4eaf

    const v18, 0x6cf3cf50

    xor-int v5, v5, v18

    const v18, -0x1c37bbc9

    goto :goto_8

    :cond_d
    const-string v0, "\u06eb\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x75

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x639

    const v18, 0x3d833104

    xor-int v5, v5, v18

    const v18, 0x10be8368

    :goto_8
    xor-int v18, v0, v18

    move v0, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fb45c58 -> :sswitch_7
        -0x7fa865b3 -> :sswitch_e
        -0x7d79f442 -> :sswitch_d
        -0x7c3f29aa -> :sswitch_4
        -0x7704e657 -> :sswitch_5
        -0x69c563d0 -> :sswitch_a
        -0x62754a3e -> :sswitch_7
        -0x608a45fa -> :sswitch_6
        -0x591267f7 -> :sswitch_3
        -0x3cf8541c -> :sswitch_0
        -0x2a466320 -> :sswitch_3
        -0x17d64e31 -> :sswitch_e
        -0x15e06a51 -> :sswitch_1
        -0x12bb9b8d -> :sswitch_5
        -0x7cc27e7 -> :sswitch_b
        0x698fcd1 -> :sswitch_9
        0xdd2fc86 -> :sswitch_f
        0x151438ae -> :sswitch_d
        0x1983343f -> :sswitch_10
        0x1b4403f0 -> :sswitch_8
        0x1e0f40e4 -> :sswitch_6
        0x24daca6f -> :sswitch_9
        0x26fe1830 -> :sswitch_2
        0x2a497fc2 -> :sswitch_2
        0x2b22c133 -> :sswitch_10
        0x2c8c5266 -> :sswitch_0
        0x353f3a96 -> :sswitch_1
        0x4234eb2d -> :sswitch_a
        0x4267897a -> :sswitch_11
        0x4a8b2d9e -> :sswitch_8
        0x5d5e3593 -> :sswitch_f
        0x5e9b601c -> :sswitch_c
        0x604bdbf3 -> :sswitch_c
        0x6798e8ab -> :sswitch_4
        0x6a00a70c -> :sswitch_b
        0x6a02c97f -> :sswitch_11
    .end sparse-switch
.end method

.method public final ܰ(II)V
    .locals 8

    const-wide/16 v0, 0x0

    const v2, 0x3e04217d

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v5, "\u1a7a\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x41d9

    const v7, -0x20b69423

    xor-int/2addr v6, v7

    const v7, -0x407bae8

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x41f7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v5, :cond_a

    goto :goto_1

    .line 124
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v5, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u05a1\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5a09

    const v7, -0x3ac78db8

    xor-int/2addr v6, v7

    const v7, -0x71a14abb

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    return-void

    :sswitch_5
    int-to-long p1, p2

    .line 215
    iget-object v2, p0, Ll/֨ܿۨ;->ܺ:Ll/۬ܿۨ;

    invoke-virtual {v2, v0, v1, p1, p2}, Ll/ᩳ۟ۜ;->ܰ(JJ)V

    return-void

    :sswitch_6
    int-to-long v0, p1

    .line 76
    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v5, "\u06d8\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x29f5

    const v7, 0x64ff18c3

    xor-int/2addr v6, v7

    const v7, 0x26ba851a

    goto :goto_0

    :goto_2
    const-string v5, "\u1a73\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x736d

    const v7, -0x7c77b1d

    xor-int/2addr v6, v7

    const v7, -0x4bc4f998

    goto :goto_0

    :cond_2
    const-string v5, "\u06d9\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x70d1

    const v7, -0x70224ba1

    xor-int/2addr v6, v7

    const v7, 0x17088113

    goto/16 :goto_0

    .line 164
    :sswitch_7
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_3

    goto :goto_3

    :cond_3
    const-string v5, "\u06e1\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x475d

    const v7, -0x2b8204fa

    xor-int/2addr v6, v7

    const v7, -0x6e98c9a9

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_5

    :cond_4
    :goto_3
    const-string v5, "\u073a\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e3f

    const v7, 0x3cc0c405

    xor-int/2addr v6, v7

    const v7, 0x505754d2

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06df\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2ddd

    const v7, 0x776606f5

    xor-int/2addr v6, v7

    const v7, -0x6aa75fc7

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u05a1\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x37

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3b05

    const v7, 0x3cf3958

    xor-int/2addr v6, v7

    const v7, 0x31dc06d8

    goto/16 :goto_0

    .line 75
    :sswitch_a
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u06ec\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xddb

    const v7, 0x56e9cbfd

    xor-int/2addr v6, v7

    const v7, 0x62f49cd8

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    const-string v5, "\u073d\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7ecb

    const v7, -0x56addfd8

    xor-int/2addr v6, v7

    const v7, 0x6b2aa98a

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u06d7\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x77c5

    const v7, 0x3ea72536

    xor-int/2addr v6, v7

    const v7, -0x6994d4a5

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u06d8\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x364d

    const v7, 0x380a6c9d

    xor-int/2addr v6, v7

    const v7, 0x460315a8

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06db\u05a1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4661

    const v7, -0x36917c5a

    xor-int/2addr v6, v7

    const v7, 0xc458b2a

    goto/16 :goto_0

    .line 197
    :sswitch_e
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v5

    if-gtz v5, :cond_c

    :goto_5
    const-string v5, "\u1a75\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7c6b

    const v7, 0x4b1c20be    # 1.0231998E7f

    xor-int/2addr v6, v7

    const v7, 0x5672616d

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x44f3

    const v7, -0x3f767853

    xor-int/2addr v6, v7

    const v7, 0xb23d7d1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7be040b3 -> :sswitch_1
        -0x717da969 -> :sswitch_8
        -0x6eb9f551 -> :sswitch_4
        -0x6e58f09f -> :sswitch_1
        -0x67f30985 -> :sswitch_5
        -0x4fd98761 -> :sswitch_7
        -0x4cea3848 -> :sswitch_b
        -0x3cc0e6a1 -> :sswitch_3
        -0x2dd71c34 -> :sswitch_0
        -0x2b13f0c6 -> :sswitch_e
        -0x217bed7e -> :sswitch_a
        -0x217ac205 -> :sswitch_e
        -0x1e1f6218 -> :sswitch_2
        -0x1b4909bd -> :sswitch_6
        -0x1b2e1de7 -> :sswitch_d
        -0xa7152cd -> :sswitch_9
        0xd79342c -> :sswitch_a
        0x215951db -> :sswitch_9
        0x26e71480 -> :sswitch_2
        0x2aa7a8b1 -> :sswitch_5
        0x2e5d3b9b -> :sswitch_d
        0x3c2af32b -> :sswitch_8
        0x3e5c8334 -> :sswitch_4
        0x439d1736 -> :sswitch_c
        0x47f2c90e -> :sswitch_3
        0x4e43ba61 -> :sswitch_6
        0x4ec97e4b -> :sswitch_c
        0x52709ba1 -> :sswitch_7
        0x54fce1e2 -> :sswitch_b
        0x730f1812 -> :sswitch_0
    .end sparse-switch
.end method
