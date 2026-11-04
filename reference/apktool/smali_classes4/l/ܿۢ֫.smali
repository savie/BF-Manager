.class public final Ll/ܿۢ֫;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public ۙ:I

.field public final ۤ:Ljava/util/ArrayList;

.field public final ᩷:I

.field public final synthetic ᩸:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;Ljava/util/ArrayList;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0xa53d68c

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    .line 400
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u1a79\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x64d3

    const v7, 0x67051c0c

    xor-int/2addr v6, v7

    const v7, 0x44c7e98f

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x3375

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    iput-object p1, p0, Ll/ܿۢ֫;->᩸:Ll/۟ۢ֫;

    .line 396
    invoke-static {p1}, Ll/۟ۢ֫;->ܺ(Ll/۟ۢ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_c

    goto/16 :goto_5

    .line 272
    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_b

    goto/16 :goto_1

    .line 197
    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_6

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_9

    goto :goto_1

    .line 68
    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x0

    .line 402
    iput p1, p0, Ll/ܿۢ֫;->ۙ:I

    return-void

    .line 396
    :sswitch_6
    iput v1, p0, Ll/ܿۢ֫;->᩷:I

    .line 401
    new-instance v5, Ljava/util/ArrayList;

    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-direct {v5, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, p0, Ll/ܿۢ֫;->ۤ:Ljava/util/ArrayList;

    .line 341
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a7b\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x180d

    const v7, 0x1b4b7e80

    xor-int/2addr v6, v7

    const v7, -0xdc0cf47

    goto :goto_0

    .line 396
    :sswitch_7
    invoke-static {v0}, Ll/֡ۢ;->֫ۡᩳ(Ljava/lang/Object;)I

    move-result v1

    .line 215
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u05a1\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6629

    const v7, -0x7fafe374

    xor-int/2addr v6, v7

    const v7, 0x6f1cf62e

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_3

    :goto_1
    const-string v5, "\u06e7\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa5

    const v7, -0x29d94a9e

    xor-int/2addr v6, v7

    const v7, -0x6bc22cbd

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u073a\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x62b3

    const v7, 0x2aa4c6fb

    xor-int/2addr v6, v7

    const v7, -0x2f1af01f

    goto/16 :goto_0

    .line 137
    :sswitch_9
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v5

    if-gtz v5, :cond_4

    :goto_2
    const-string v5, "\u06eb\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3519

    const v7, -0x5302c3d

    xor-int/2addr v6, v7

    const v7, -0x3b692735

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u0736\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v3

    mul-int/lit8 v6, v6, 0x6f

    const v7, -0x2fb89777

    xor-int/2addr v6, v7

    const v7, -0x1a4c0f2c

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a79\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7157

    const v7, -0x47fbfaf6

    xor-int/2addr v6, v7

    const v7, 0x51988c4

    goto/16 :goto_0

    .line 318
    :sswitch_b
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_7

    :cond_6
    :goto_3
    const-string v5, "\u05ab\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x57a7

    const v7, -0x5c78463a

    xor-int/2addr v6, v7

    const v7, -0xbabdea7

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d9\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x72d7

    const v7, 0x35f60eab

    xor-int/2addr v6, v7

    const v7, 0x789bc971

    goto/16 :goto_0

    .line 153
    :sswitch_c
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    const-string v5, "\u06e2\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2bd3

    const v7, 0x3f09f152

    xor-int/2addr v6, v7

    const v7, -0x270d387f

    goto/16 :goto_0

    .line 370
    :sswitch_d
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u0730\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5b47

    const v7, -0x280923d3

    xor-int/2addr v6, v7

    const v7, -0x29f1053f

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u05a8\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x43d3

    const v7, 0x592e16e2

    xor-int/2addr v6, v7

    const v7, 0x5cda1a75

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v5, "\u1a74\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b11

    const v7, -0x66d375dc

    xor-int/2addr v6, v7

    const v7, 0x58fea0ed

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a79\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6cf3

    const v7, 0x2cccdd44

    xor-int/2addr v6, v7

    const v7, -0x512849f9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f8da0ce -> :sswitch_d
        -0x7d824356 -> :sswitch_4
        -0x6926c766 -> :sswitch_5
        -0x65dffe53 -> :sswitch_a
        -0x64c1e470 -> :sswitch_7
        -0x62f8dd87 -> :sswitch_5
        -0x5b0c76b1 -> :sswitch_8
        -0x5a11782a -> :sswitch_8
        -0x4f30a332 -> :sswitch_4
        -0x4d14cf93 -> :sswitch_3
        -0x43e8e44b -> :sswitch_b
        -0x2dd7f008 -> :sswitch_1
        -0x281d2e7b -> :sswitch_6
        -0x27d4e693 -> :sswitch_d
        -0x244d3152 -> :sswitch_3
        -0x1a362997 -> :sswitch_6
        -0x12d0052b -> :sswitch_b
        -0xdb17864 -> :sswitch_a
        -0xae27558 -> :sswitch_0
        0xd1b8e1c -> :sswitch_c
        0x1bbf24bc -> :sswitch_0
        0x3125dcf4 -> :sswitch_c
        0x3ce59e01 -> :sswitch_7
        0x4cda6067 -> :sswitch_9
        0x6133f7ce -> :sswitch_1
        0x6bf119e0 -> :sswitch_2
        0x75dc1289 -> :sswitch_9
        0x7e81023a -> :sswitch_2
    .end sparse-switch
.end method
