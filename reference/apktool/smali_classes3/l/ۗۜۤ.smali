.class public final synthetic Ll/ۗۜۤ;
.super Ljava/lang/Object;
.source "D60A"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field private static final ܽ᩷᩸:[S


# instance fields
.field public final synthetic ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۜۤ;->ܽ᩷᩸:[S

    return-void

    :array_0
    .array-data 2
        0x1da0s
        0xcf7s
        0xcd0s
        0xcd6s
        0xccds
        0xccas
        0xcc3s
        0xc84s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;)V
    .locals 6

    const v0, 0x27dc0a45

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/֫۠;->ۢᩴ᩺:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5551

    const v5, 0x396e25e3

    xor-int/2addr v4, v5

    const v5, -0x5ae7f9c7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4ecb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_0
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v3, :cond_9

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    :goto_1
    const-string v3, "\u06eb\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64cf

    const v5, 0x26750e1b

    xor-int/2addr v4, v5

    const v5, 0x73d035ce

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ۗۜۤ;->᩶:Ljava/lang/String;

    return-void

    :sswitch_5
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u073f\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6835

    const v5, -0xe2cc146

    xor-int/2addr v4, v5

    const v5, -0x42ffa909

    goto :goto_0

    .line 2
    :sswitch_6
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2037

    const v5, -0x54f02e1e

    xor-int/2addr v4, v5

    const v5, -0x47208384

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a76\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76fd

    const v5, 0x11d0b158

    xor-int/2addr v4, v5

    const v5, -0x7e17e9b7

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06eb\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x554d

    const v5, -0x5a822bf0

    xor-int/2addr v4, v5

    const v5, 0x1c46bb97

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06e8\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x748f

    const v5, -0x6523b551

    xor-int/2addr v4, v5

    const v5, 0x2d5a8b3b

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_5

    :goto_2
    const-string v3, "\u06d9\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e15

    const v5, 0x494686a8    # 813162.5f

    xor-int/2addr v4, v5

    const v5, 0x5dede321

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f3f

    const v5, 0x1f045ed3

    xor-int/2addr v4, v5

    const v5, 0x349d5ecd

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06d8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ce3

    const v5, 0x2ee8c3e7

    xor-int/2addr v4, v5

    const v5, -0x576501dd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x793

    const v5, -0xe002400

    xor-int/2addr v4, v5

    const v5, -0x1e3593e7

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e41

    const v5, 0x73c17cd3

    xor-int/2addr v4, v5

    const v5, -0x56b0f8e9

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06e1\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x29ef

    const v5, 0x22dce5c9

    xor-int/2addr v4, v5

    const v5, -0x34908c8e    # -1.5692658E7f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x511

    const v5, -0x6242eab8

    xor-int/2addr v4, v5

    const v5, -0x7eb7a504

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۗۜۤ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7b\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6eb7

    const v5, 0x3f7c1716

    xor-int/2addr v4, v5

    const v5, -0x3e72515d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5391

    const v5, -0x29218c6c

    xor-int/2addr v4, v5

    const v5, 0x712ce258

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79eb9704 -> :sswitch_e
        -0x7561c18e -> :sswitch_b
        -0x5c234dc7 -> :sswitch_1
        -0x4cc4a4d5 -> :sswitch_c
        -0x3bd5b41f -> :sswitch_4
        -0x3a3a1b14 -> :sswitch_2
        -0x38b6e5f2 -> :sswitch_e
        -0x34e26928 -> :sswitch_b
        -0x31513082 -> :sswitch_2
        -0x2420dbfb -> :sswitch_5
        -0x12d9a0ef -> :sswitch_6
        -0xd1405ae -> :sswitch_5
        -0x9d34479 -> :sswitch_8
        -0x9be6dc6 -> :sswitch_9
        -0xc3d4eb -> :sswitch_a
        0x10c1c928 -> :sswitch_9
        0x17d951fe -> :sswitch_0
        0x1ba402e3 -> :sswitch_1
        0x1fc67296 -> :sswitch_a
        0x2cb491bf -> :sswitch_6
        0x3097f700 -> :sswitch_0
        0x39e48190 -> :sswitch_3
        0x3b1871af -> :sswitch_d
        0x3c868f8d -> :sswitch_d
        0x3ecfb8fb -> :sswitch_4
        0x4f40c152 -> :sswitch_c
        0x4f790b92 -> :sswitch_7
        0x5c307b18 -> :sswitch_3
        0x676e3e39 -> :sswitch_8
        0x7ccf970c -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    const/4 v2, 0x0

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

    const v14, 0x70d744f2

    sget v15, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v16, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v17, "\u06db\u05a1"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0x32c9

    const v19, 0x327e3fa7

    xor-int v1, v1, v19

    const v19, -0x373b0e3f

    xor-int v17, v17, v19

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v18, v17

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, 0x70d744f2

    move-object v4, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, 0x3237

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v1, :cond_8

    goto/16 :goto_4

    .line 81
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v1, :cond_3

    goto/16 :goto_2

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_b

    goto/16 :goto_2

    .line 77
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 v1, 0x0

    return-object v1

    .line 101
    :sswitch_4
    new-instance v1, Ll/ܰܿ᩹;

    invoke-direct {v1}, Ll/ܰܿ᩹;-><init>()V

    invoke-virtual {v3, v1}, Ll/ۧ۬ۤ;->ۙ(Ll/ܰܿ᩹;)V

    return-object v3

    .line 24
    :sswitch_5
    new-instance v3, Ll/ۧ۬ۤ;

    const/4 v1, 0x0

    iget-object v5, v0, Ll/ۗۜۤ;->᩶:Ljava/lang/String;

    .line 80
    sget-boolean v18, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v18, :cond_0

    goto/16 :goto_5

    .line 24
    :cond_0
    invoke-direct {v3, v5, v2, v4, v1}, Ll/ۧ۬ۤ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u0736\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2601

    const v18, 0x1b0a4cc2

    xor-int v5, v5, v18

    const v18, 0x74dd9597

    goto/16 :goto_6

    :sswitch_6
    const/4 v1, 0x7

    .line 99
    invoke-static {v13, v14, v1, v12}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v2, v1}, Ll/ۖۖ;->ܽۘ᩻(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 94
    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u06e7\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x272d

    const v18, -0x6fae85c

    xor-int v5, v5, v18

    const v18, -0x55551206

    goto/16 :goto_6

    .line 99
    :sswitch_7
    sget-object v13, Ll/ۗۜۤ;->ܽ᩷᩸:[S

    const/4 v14, 0x1

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x6373

    const v18, -0x35beebb1

    xor-int v5, v5, v18

    const v18, 0x57e0d408

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x13af

    const v18, -0x41564f2f

    xor-int v5, v5, v18

    const v18, -0x5814d355

    goto/16 :goto_6

    .line 2
    :sswitch_8
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    .line 99
    iget-object v1, v0, Ll/ۗۜۤ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1}, Ll/ۖ᩵;->ܺ᩵ᩴ(Ljava/lang/Object;)I

    move-result v2

    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u05a1\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2f

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0xc4b

    const v18, 0x6eb62f45

    xor-int v5, v5, v18

    const v18, -0x2effb870

    goto/16 :goto_6

    :sswitch_9
    const/16 v1, 0x3024

    const/16 v12, 0x3024

    goto :goto_1

    :sswitch_a
    const/16 v1, 0xca4

    const/16 v12, 0xca4

    :goto_1
    const-string v1, "\u06df\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x25b5

    const v18, -0x3819163c

    xor-int v5, v5, v18

    const v18, 0x73c2e3ea

    goto/16 :goto_6

    :sswitch_b
    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int/2addr v1, v9

    if-gez v1, :cond_6

    const-string v1, "\u06e7\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x67

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x4175

    const v18, -0x60bbd246

    xor-int v5, v5, v18

    const v18, -0x67da4084

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x75

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x71ad

    const v18, 0x72a9f854

    xor-int v5, v5, v18

    const v18, -0x31f636af

    goto/16 :goto_6

    :sswitch_c
    mul-int v9, v8, v8

    mul-int v10, v7, v7

    const v11, 0x4cebfb9

    .line 42
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_7

    :goto_2
    const-string v1, "\u06da\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7aa1

    const v18, -0x35ee3de2    # -2388103.5f

    xor-int v5, v5, v18

    const v18, 0x52a392e9

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x77d3

    const v18, -0x76bbc79b

    xor-int v5, v5, v18

    const v18, 0x705d6f8e

    goto/16 :goto_6

    :sswitch_d
    aget-short v7, v20, v6

    add-int/lit16 v8, v7, 0x2315

    .line 67
    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_9

    :cond_8
    :goto_3
    const-string v1, "\u06db\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0xf

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0xcdd

    const v18, 0x48a59467

    xor-int v5, v5, v18

    const v18, 0x4343afb6

    goto/16 :goto_6

    :cond_9
    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4cfb

    const v18, -0x522b5d48

    xor-int v5, v5, v18

    const v18, 0x39d6b28c

    goto/16 :goto_6

    :sswitch_e
    const/4 v6, 0x0

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u073a\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x1b45

    const v18, -0x2b8281b

    xor-int v5, v5, v18

    const v18, 0x2d806a70

    goto :goto_6

    :sswitch_f
    sget-object v20, Ll/ۗۜۤ;->ܽ᩷᩸:[S

    .line 53
    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u1a75\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x27

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x48d1

    const v18, 0x8fc167f

    xor-int v5, v5, v18

    const v18, -0x765d772b

    goto :goto_6

    :cond_c
    const-string v1, "\u1a7a\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x63

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x23bb

    const v18, -0x621d2436

    xor-int v5, v5, v18

    const v18, 0x15a02afa

    goto :goto_6

    .line 47
    :sswitch_10
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v1

    if-gtz v1, :cond_d

    :goto_5
    const-string v1, "\u06d8\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x2503

    const v5, 0x49afdafe

    xor-int/2addr v3, v5

    const v5, -0x7ea0ae18

    xor-int v18, v1, v5

    move v1, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u073a\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x42cd

    const v18, 0x6aa566d5

    xor-int v5, v5, v18

    const v18, -0x2174ad0d

    :goto_6
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76bb0e8d -> :sswitch_9
        -0x7237c00f -> :sswitch_f
        -0x70787207 -> :sswitch_a
        -0x5c21983c -> :sswitch_1
        -0x55c05b78 -> :sswitch_0
        -0x553a7421 -> :sswitch_6
        -0x4e185e72 -> :sswitch_3
        -0x45916491 -> :sswitch_f
        -0x3cf13bb1 -> :sswitch_6
        -0x3932dded -> :sswitch_e
        -0x31b0fa44 -> :sswitch_5
        -0x2bf54210 -> :sswitch_0
        -0x13986b0e -> :sswitch_10
        -0xa0a7e3 -> :sswitch_c
        0x855b4c -> :sswitch_4
        0xb57ed1 -> :sswitch_9
        0x9233259 -> :sswitch_d
        0xcd66add -> :sswitch_8
        0x14460b1f -> :sswitch_e
        0x14b8804a -> :sswitch_b
        0x15c9c0d9 -> :sswitch_10
        0x2940621e -> :sswitch_2
        0x343d2d3a -> :sswitch_d
        0x34797b6c -> :sswitch_b
        0x34e0ec8f -> :sswitch_5
        0x44670ace -> :sswitch_a
        0x507ecc3f -> :sswitch_4
        0x5612ee56 -> :sswitch_7
        0x5761871c -> :sswitch_8
        0x5d337b12 -> :sswitch_c
        0x68eea5dd -> :sswitch_7
        0x73438d71 -> :sswitch_1
        0x7600f6bb -> :sswitch_3
        0x78c1fe5f -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
