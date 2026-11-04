.class public final Ll/ܰ᩺ܳ;
.super Ljava/io/FilterInputStream;
.source "05ZQ"

# interfaces
.implements Ll/۠ۜ᩹;


# static fields
.field private static final ܰᩳۛ:[S


# instance fields
.field public ܰ:Ll/ۗۧܺ;

.field public final synthetic ᩶:Ll/ۖ᩺ܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܰ᩺ܳ;->ܰᩳۛ:[S

    return-void

    :array_0
    .array-data 2
        0x1e6bs
        0x49d3s
        0x49f1s
        0x49fes
        0x49f3s
        0x49f5s
        0x49fcs
        0x49f5s
        0x49f4s
        0x1ac1s
        -0x555as
        -0x557cs
        -0x5575s
        -0x557as
        -0x5580s
        -0x5577s
        -0x5580s
        -0x557fs
    .end array-data
.end method

.method public constructor <init>(Ll/ۖ᩺ܳ;Ljava/io/BufferedInputStream;Ll/۫ۖ۫;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x127c8016

    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    .line 605
    iput-object p1, p0, Ll/ܰ᩺ܳ;->᩶:Ll/ۖ᩺ܳ;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string p2, "\u0730\u1a76"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x7805

    const v7, -0x7858d019

    xor-int/2addr v6, v7

    const v7, 0x3fb1c8ba

    :goto_0
    xor-int/2addr p2, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x56d9

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v6

    xor-int/2addr v3, p2

    sparse-switch v3, :sswitch_data_0

    .line 15
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 489
    :sswitch_0
    sget p2, Ll/֨ۖ;->ۜۜۖ:I

    if-nez p2, :cond_a

    goto :goto_2

    .line 592
    :sswitch_1
    sget p2, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_2
    const-string p2, "\u06da\u073d"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x54c9

    const v8, -0x41b1d580    # -0.201334f

    xor-int/2addr v6, v8

    const v8, -0x2d2e7383    # -4.5000258E11f

    goto/16 :goto_6

    .line 324
    :sswitch_2
    sget p2, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez p2, :cond_7

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto/16 :goto_5

    .line 606
    :sswitch_4
    invoke-static {v7, v2}, Ll/ۗ֨;->ܽۜܰ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v7, p0, Ll/ܰ᩺ܳ;->ܰ:Ll/ۗۧܺ;

    return-void

    :sswitch_5
    new-instance v2, Ll/ۘ᩺ܳ;

    invoke-direct {v2, v1}, Ll/ۘ᩺ܳ;-><init>(Ll/ۖۨܳ;)V

    .line 176
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_3

    :cond_1
    const-string p2, "\u05a8\u0733"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x2479

    const v8, -0x3fc9f405

    xor-int/2addr v6, v8

    const v8, 0x48e7cf82

    goto/16 :goto_6

    .line 606
    :sswitch_6
    iget-object v1, p1, Ll/ۖ᩺ܳ;->ܳ:Ll/ۖۨܳ;

    invoke-static {v1}, Ll/ۗۖ;->ۡۖ۬(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_4

    :cond_2
    const-string p2, "\u06db\u1a7b"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x71eb

    const v8, -0x3461cffe

    xor-int/2addr v6, v8

    const v8, 0x373dc737

    goto/16 :goto_6

    :sswitch_7
    new-instance v7, Ll/ۗۧܺ;

    invoke-virtual {p3}, Ll/۫ۖ۫;->᩸()J

    move-result-wide v8

    sget p2, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz p2, :cond_3

    goto :goto_5

    .line 75
    :cond_3
    sget p2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz p2, :cond_4

    goto :goto_4

    .line 390
    :cond_4
    sget p2, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz p2, :cond_5

    goto :goto_3

    .line 383
    :cond_5
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_4

    .line 414
    :cond_6
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result p2

    if-eqz p2, :cond_8

    :cond_7
    :goto_3
    const-string p2, "\u1a7b\u06d7"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x2dad

    const v7, 0x65cbb3a4

    xor-int/2addr v6, v7

    const v7, 0x13e9e289

    goto/16 :goto_0

    .line 319
    :cond_8
    sget p2, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz p2, :cond_9

    :goto_4
    const-string p2, "\u1a74\u0736"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x6009

    const v7, 0x1c70fc5d

    xor-int/2addr v6, v7

    const v7, 0x5f5cf649

    goto/16 :goto_0

    .line 60
    :cond_9
    sget p2, Ll/֫֡;->֫ۙۖ:I

    if-gtz p2, :cond_b

    :cond_a
    const-string p2, "\u05a1\u073d"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v4

    mul-int/lit8 p2, p2, -0x23

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x37fb

    const v7, 0x9e5d5ba

    xor-int/2addr v6, v7

    const v7, -0xe352ea4

    goto/16 :goto_0

    .line 606
    :cond_b
    invoke-direct {v7, v8, v9}, Ll/ۗۧܺ;-><init>(J)V

    sget p2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz p2, :cond_c

    :goto_5
    const-string p2, "\u1a7a\u06e1"

    invoke-static {p2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x574f

    const v7, 0x58bc5980

    xor-int/2addr v6, v7

    const v7, 0x2891787

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u06d9\u06d6"

    invoke-static {p2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v4

    mul-int/lit8 p2, p2, -0x9

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x2b1f

    const v8, 0x3d65cc46

    xor-int/2addr v6, v8

    const v8, 0x64ede263

    :goto_6
    xor-int/2addr p2, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x74d246a4 -> :sswitch_5
        -0x59731ae7 -> :sswitch_6
        -0x44be526c -> :sswitch_3
        -0x3aead242 -> :sswitch_6
        -0x3a370404 -> :sswitch_7
        -0x32bbe18d -> :sswitch_1
        -0x1a34f80a -> :sswitch_4
        0x157df979 -> :sswitch_7
        0x1b5261ce -> :sswitch_2
        0x1c0b90bd -> :sswitch_0
        0x1df1e0b2 -> :sswitch_5
        0x392611b0 -> :sswitch_3
        0x47c19967 -> :sswitch_2
        0x622bb18c -> :sswitch_4
        0x6f50355d -> :sswitch_1
        0x7593058e -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final read()I
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x32941bb2

    sget v11, Ll/ۖ֨;->֨ۨۧ:I

    sget v12, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v13, "\u0730\u073f"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x6f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x211f

    const v15, -0x247667ce

    xor-int/2addr v14, v15

    const v15, -0x618ee479

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x285f

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const/16 v9, 0x2244

    goto/16 :goto_3

    .line 406
    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v13, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v13, :cond_a

    goto :goto_2

    :sswitch_1
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_1

    goto/16 :goto_4

    :sswitch_2
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v13, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    :goto_1
    const-string v13, "\u05ab\u1a78"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x6f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x49ff

    const v15, 0x5e17a1df

    xor-int/2addr v14, v15

    const v15, 0x4de42213    # 4.784298E8f

    goto :goto_0

    .line 475
    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v3, 0x1

    .line 41
    invoke-static {v2, v3}, Ll/ܽ;->ܳ᩻۬(Ljava/lang/Object;I)Z

    return v1

    .line 613
    :sswitch_6
    invoke-super/range {p0 .. p0}, Ljava/io/FilterInputStream;->read()I

    move-result v1

    .line 614
    iget-object v2, v0, Ll/ܰ᩺ܳ;->ܰ:Ll/ۗۧܺ;

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v13

    if-ltz v13, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v13, "\u06e1\u1a73"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7cc9

    const v15, -0x2a5de150

    xor-int/2addr v14, v15

    const v15, 0x37913167

    goto :goto_0

    .line 611
    :sswitch_7
    new-instance v13, Ljava/lang/RuntimeException;

    sget-object v14, Ll/ܰ᩺ܳ;->ܰᩳۛ:[S

    .line 81
    sget v15, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v15, :cond_2

    :cond_1
    :goto_2
    const-string v13, "\u0736\u06dc"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x52a3

    const v15, 0x3794c3eb

    xor-int/2addr v14, v15

    const v15, -0x586a9acd

    goto/16 :goto_0

    :cond_2
    const/4 v15, 0x1

    sget v16, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v16, :cond_3

    goto/16 :goto_4

    :cond_3
    const/16 v1, 0x8

    .line 611
    invoke-static {v14, v15, v1, v9}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 610
    :sswitch_8
    iget-object v13, v0, Ll/ܰ᩺ܳ;->᩶:Ll/ۖ᩺ܳ;

    iget-object v13, v13, Ll/ۖ᩺ܳ;->ܳ:Ll/ۖۨܳ;

    invoke-virtual {v13}, Ll/ۖۨܳ;->᩷()Z

    move-result v13

    if-nez v13, :cond_4

    const-string v13, "\u05a1\u05a8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0xd

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x141d

    const v15, -0x69d1c4ad

    xor-int/2addr v14, v15

    const v15, 0x2698c984

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u05a1\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x33cd

    const v15, 0x38a95329

    xor-int/2addr v14, v15

    const v15, 0x64278f12

    goto/16 :goto_0

    :sswitch_9
    const/16 v9, 0x4990

    :goto_3
    const-string v13, "\u06eb\u06e7"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3cf

    const v15, 0x8965d14

    xor-int/2addr v14, v15

    const v15, 0x11da581a

    goto/16 :goto_0

    :sswitch_a
    add-int v13, v5, v8

    mul-int v13, v13, v13

    sub-int/2addr v13, v7

    if-ltz v13, :cond_5

    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4b2d

    const v15, -0x1dc92ceb

    xor-int/2addr v14, v15

    const v15, 0x27cea55b

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u06e2\u073f"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5b4f

    const v15, 0x7f68b764

    xor-int/2addr v14, v15

    const v15, -0x1c511430

    goto/16 :goto_0

    :sswitch_b
    const/4 v8, 0x1

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v13

    if-nez v13, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v13, "\u05a8\u06d8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x49e1

    const v15, 0x30706ae0

    xor-int/2addr v14, v15

    const v15, -0x6b2bf61e

    goto/16 :goto_0

    :sswitch_c
    add-int/lit8 v7, v6, 0x1

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v13

    if-eqz v13, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v13, "\u073d\u06ec"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3229

    const v15, -0x778c4406

    xor-int/2addr v14, v15

    const v15, -0x2d559ce3

    goto/16 :goto_0

    :sswitch_d
    mul-int/lit8 v6, v5, 0x2

    .line 300
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v13

    if-eqz v13, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v13, "\u0733\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2cc7

    const v15, -0x1f993ba6

    xor-int/2addr v14, v15

    const v15, 0x2a8a2b56

    goto/16 :goto_0

    :sswitch_e
    aget-short v5, v3, v4

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_4

    :cond_9
    const-string v13, "\u06d8\u06e4"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1aaf

    const v15, -0x6fad076a

    xor-int/2addr v14, v15

    const v15, -0x6f332466

    goto/16 :goto_0

    :sswitch_f
    const/4 v4, 0x0

    .line 185
    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_b

    :cond_a
    const-string v13, "\u073f\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x22ab

    const v15, -0x16fddbd2

    xor-int/2addr v14, v15

    const v15, 0x50370e62

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u1a74\u06d7"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x47fb

    const v15, -0x8dffe3b

    xor-int/2addr v14, v15

    const v15, -0x753b27c5

    goto/16 :goto_0

    :sswitch_10
    sget v13, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v13, :cond_d

    :cond_c
    :goto_4
    const-string v13, "\u06e4\u05a8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x3f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1d71

    const v15, 0x5f3d0b20

    xor-int/2addr v14, v15

    const v15, -0x24f2ddc5

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06df\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x71

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7307

    const v15, -0x636537cb

    xor-int/2addr v14, v15

    const v15, 0x3cdee8d2

    goto/16 :goto_0

    :sswitch_11
    sget-object v3, Ll/ܰ᩺ܳ;->ܰᩳۛ:[S

    .line 425
    sget v13, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v13, :cond_e

    :goto_5
    const-string v13, "\u073f\u0736"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2a4f

    const v15, 0x55ae8364

    xor-int/2addr v14, v15

    const v15, -0x11a7fd2a

    goto/16 :goto_0

    :cond_e
    const-string v13, "\u06d7\u1a7a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x21

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4a3

    const v15, -0x5c31f0be

    xor-int/2addr v14, v15

    const v15, 0x53bce6fe

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bd813a1 -> :sswitch_7
        -0x79fa01d4 -> :sswitch_1
        -0x742f0c5b -> :sswitch_4
        -0x72809dae -> :sswitch_3
        -0x6b8ed9d5 -> :sswitch_a
        -0x65a1d097 -> :sswitch_f
        -0x63c20d56 -> :sswitch_c
        -0x61c93c32 -> :sswitch_6
        -0x6029c772 -> :sswitch_f
        -0x555f26c4 -> :sswitch_11
        -0x51a03bcf -> :sswitch_1
        -0x4f0fbc3b -> :sswitch_0
        -0x4ed5f249 -> :sswitch_10
        -0x413e3093 -> :sswitch_11
        -0x40269c46 -> :sswitch_6
        -0x3e85696b -> :sswitch_4
        -0x381771e1 -> :sswitch_8
        -0x3017ae98 -> :sswitch_10
        -0x23822aeb -> :sswitch_d
        -0x1e5c2a74 -> :sswitch_5
        -0x1c3bad79 -> :sswitch_9
        -0x14a7e5e8 -> :sswitch_b
        -0x1071cfd2 -> :sswitch_9
        0x4988f0b -> :sswitch_b
        0x1122be7c -> :sswitch_2
        0x267b3dbf -> :sswitch_d
        0x42e6b48b -> :sswitch_a
        0x442a3d62 -> :sswitch_7
        0x51747f9f -> :sswitch_8
        0x556fc592 -> :sswitch_5
        0x58efd828 -> :sswitch_0
        0x5cf5e981 -> :sswitch_e
        0x6d8be298 -> :sswitch_3
        0x74602cb3 -> :sswitch_c
        0x776cf795 -> :sswitch_2
        0x7b3ef165 -> :sswitch_e
    .end sparse-switch
.end method

.method public final read([BII)I
    .locals 15

    move-object v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0xbcfaff

    sget v9, Ll/ۖ;->ܿۚ֡:I

    sget v10, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v11, "\u06d7\u06d9"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2afd

    const v13, 0x777eba2c

    xor-int/2addr v12, v13

    const v13, 0x398ce04

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, -0x3057

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 601
    sget-boolean v11, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v11, :cond_e

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v11, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v11, :cond_d

    goto/16 :goto_4

    .line 380
    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v11, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v11, :cond_9

    goto :goto_1

    .line 574
    :sswitch_2
    sget v11, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v11, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v11, "\u06dc\u06db"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x79

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5069

    const v13, 0x11a4970b

    xor-int/2addr v12, v13

    const v13, -0x4d696c3b

    goto :goto_0

    .line 175
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_4

    .line 212
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    const/4 v1, 0x0

    return v1

    .line 623
    :sswitch_5
    invoke-super/range {p0 .. p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v1

    .line 624
    iget-object v2, v0, Ll/ܰ᩺ܳ;->ܰ:Ll/ۗۧܺ;

    invoke-static {v2, v1}, Ll/ۗ᩺;->֡ܶᩳ(Ljava/lang/Object;I)Z

    return v1

    .line 621
    :sswitch_6
    new-instance v11, Ljava/lang/RuntimeException;

    sget-object v12, Ll/ܰ᩺ܳ;->ܰᩳۛ:[S

    const/16 v13, 0xa

    sget-boolean v14, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v14, :cond_1

    goto/16 :goto_5

    :cond_1
    const/16 v1, 0x8

    invoke-static {v12, v13, v1, v7}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v11, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v11

    .line 620
    :sswitch_7
    iget-object v11, v0, Ll/ܰ᩺ܳ;->᩶:Ll/ۖ᩺ܳ;

    iget-object v11, v11, Ll/ۖ᩺ܳ;->ܳ:Ll/ۖۨܳ;

    invoke-virtual {v11}, Ll/ۖۨܳ;->᩷()Z

    move-result v11

    if-nez v11, :cond_2

    const-string v11, "\u05a1\u06e7"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x7

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x51e7

    const v13, -0x5902b3ad

    xor-int/2addr v12, v13

    const v13, -0xf9e07ec

    goto/16 :goto_0

    :cond_2
    const-string v11, "\u06dc\u06e0"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x53

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x62b

    const v13, 0x6e8a82e6

    xor-int/2addr v12, v13

    const v13, -0x2fdd890e

    goto/16 :goto_0

    :sswitch_8
    const v7, 0xc5a3

    goto :goto_2

    :sswitch_9
    const v7, 0xaae5

    :goto_2
    const-string v11, "\u073d\u073f"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4e91

    const v13, 0x69b22f15

    xor-int/2addr v12, v13

    const v13, 0x35681560

    goto/16 :goto_0

    :sswitch_a
    add-int v11, v5, v6

    add-int/2addr v11, v11

    sub-int v11, v4, v11

    if-lez v11, :cond_3

    const-string v11, "\u06da\u06eb"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x2b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3981

    const v13, 0x40c84069

    xor-int/2addr v12, v13

    const v13, 0x8938492

    goto/16 :goto_0

    :cond_3
    const-string v11, "\u1a75\u06e2"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x18cf

    const v13, 0x586a1b26

    xor-int/2addr v12, v13

    const v13, 0x677c72a9

    goto/16 :goto_0

    :sswitch_b
    add-int v4, v2, v3

    mul-int v4, v4, v4

    mul-int v5, v2, v2

    const v6, 0x2f9a171

    sget v11, Ll/۬;->᩸ۜ᩹:I

    if-eqz v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u06db\u073d"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x108f

    const v13, -0x26393375

    xor-int/2addr v12, v13

    const v13, -0x5126b941

    goto/16 :goto_0

    :sswitch_c
    const/16 v2, 0x9

    aget-short v2, v1, v2

    const/16 v3, 0x1b99

    sget v11, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v11, :cond_5

    goto :goto_3

    :cond_5
    const-string v11, "\u073a\u06e8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x277d

    const v13, 0x7695b603

    xor-int/2addr v12, v13

    const v13, -0x493b7de3

    goto/16 :goto_0

    :sswitch_d
    sget-object v1, Ll/ܰ᩺ܳ;->ܰᩳۛ:[S

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_3

    :cond_6
    const-string v11, "\u06df\u06d8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x379f

    const v13, 0x7cbd25bf

    xor-int/2addr v12, v13

    const v13, -0x1574a85e

    goto/16 :goto_0

    .line 363
    :sswitch_e
    sget v11, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v11, :cond_7

    :goto_3
    const-string v11, "\u06da\u0733"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x45f9

    const v13, -0x3a0ee1f0

    xor-int/2addr v12, v13

    const v13, 0x1596a787

    goto/16 :goto_0

    :cond_7
    const-string v11, "\u06d6\u06dc"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x549f

    const v13, 0x25e6c723

    xor-int/2addr v12, v13

    const v13, 0x406c836a

    goto/16 :goto_0

    .line 169
    :sswitch_f
    sget-boolean v11, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v11, :cond_8

    goto :goto_4

    :cond_8
    const-string v11, "\u1a75\u06dc"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4029

    const v13, -0x25dff551

    xor-int/2addr v12, v13

    const v13, 0x3863c6c8

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v11, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v11, :cond_a

    :cond_9
    const-string v11, "\u06d9\u0736"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x27

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x73a9

    const v13, -0x126d43c9

    xor-int/2addr v12, v13

    const v13, 0x45c2928d

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u073a\u1a7a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4e2b

    const v13, -0x6c477d7a

    xor-int/2addr v12, v13

    const v13, 0x4a8f0b17    # 4687243.5f

    goto/16 :goto_0

    .line 558
    :sswitch_11
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_4

    :cond_b
    const-string v11, "\u073f\u073f"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3149

    const v13, -0x7a4c9828

    xor-int/2addr v12, v13

    const v13, -0x121ffc99

    goto/16 :goto_0

    .line 410
    :sswitch_12
    sget-boolean v11, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v11, :cond_c

    :goto_4
    const-string v11, "\u06e4\u1a77"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3201

    const v13, 0x500cbf65

    xor-int/2addr v12, v13

    const v13, 0xdfab7b8

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u1a74\u1a75"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x75

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x34cd

    const v13, -0x104c4cf4

    xor-int/2addr v12, v13

    const v13, -0x5ea0112

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v11, "\u06d6\u06d7"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x7e3d

    const v13, -0x61aac334

    xor-int/2addr v12, v13

    const v13, -0x5b41eb9b

    goto/16 :goto_0

    :cond_e
    const-string v11, "\u1a77\u06dc"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x11

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4837

    const v13, -0x74df2d2e

    xor-int/2addr v12, v13

    const v13, 0x451c049c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f61fbd0 -> :sswitch_5
        -0x788e9a53 -> :sswitch_8
        -0x765be600 -> :sswitch_11
        -0x74becf86 -> :sswitch_8
        -0x7212265e -> :sswitch_4
        -0x6f3805c7 -> :sswitch_9
        -0x6cbbd009 -> :sswitch_3
        -0x4acc30f0 -> :sswitch_10
        -0x3f84385b -> :sswitch_d
        -0x35679062 -> :sswitch_f
        -0x2843219b -> :sswitch_e
        -0x254b2e98 -> :sswitch_7
        -0x18972853 -> :sswitch_9
        -0x156e0f9c -> :sswitch_1
        -0x121df65c -> :sswitch_3
        -0x100e8e07 -> :sswitch_f
        -0xb634914 -> :sswitch_7
        -0x98a3788 -> :sswitch_11
        -0x5b5a04c -> :sswitch_0
        0x23cc72d -> :sswitch_10
        0x55a448e -> :sswitch_e
        0x6e93497 -> :sswitch_4
        0x1cf0011c -> :sswitch_2
        0x315c6406 -> :sswitch_5
        0x3479ec0b -> :sswitch_c
        0x3720a4c3 -> :sswitch_d
        0x394ace21 -> :sswitch_2
        0x3f3e276c -> :sswitch_6
        0x4105bed7 -> :sswitch_a
        0x4146413d -> :sswitch_b
        0x4b62ed0e -> :sswitch_1
        0x4e38cd8d -> :sswitch_a
        0x4f20ae32 -> :sswitch_0
        0x574367ed -> :sswitch_6
        0x578495d7 -> :sswitch_12
        0x59184759 -> :sswitch_b
        0x65a2902b -> :sswitch_12
        0x6a9c1272 -> :sswitch_c
    .end sparse-switch
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
