.class public final Ll/ۡᩴۘ;
.super Ll/ܰܽܰ;
.source "C2R7"


# instance fields
.field public final synthetic ۙ:Ljava/util/List;

.field public final synthetic ܰ:Ll/۠᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/۠᩵ᩴ;Ljava/util/List;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 907
    iput-object p1, p0, Ll/ۡᩴۘ;->ܰ:Ll/۠᩵ᩴ;

    iput-object p2, p0, Ll/ۡᩴۘ;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 915
    iget-object v0, p0, Ll/ۡᩴۘ;->ۙ:Ljava/util/List;

    invoke-static {v0}, Ll/۟;->ܰۢᩴ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۙ(II)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x52f47cef

    sget v7, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v8, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v9, "\u1a77\u06da"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x23

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x705

    const v11, 0xd50eb13

    xor-int/2addr v10, v11

    const v11, 0x4187de2d

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x240b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 926
    iget-object v9, v5, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    .line 2258
    iget-wide v9, v9, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v11, v2, v9

    if-nez v11, :cond_0

    const-string v9, "\u06eb\u05a1"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x4d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x216b

    const v11, 0x5285c10d

    xor-int/2addr v10, v11

    const v11, 0x7bcc16aa

    goto :goto_0

    .line 1746
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v9

    if-nez v9, :cond_1

    goto/16 :goto_2

    .line 68
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v9

    if-ltz v9, :cond_b

    goto/16 :goto_2

    .line 661
    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget-boolean v9, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v9, :cond_8

    goto/16 :goto_3

    .line 642
    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_3

    .line 350
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    :sswitch_6
    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v9, "\u06d6\u1a75"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x809

    const v11, 0x61d8694b

    xor-int/2addr v10, v11

    const v11, -0x708d7ecf

    goto :goto_0

    .line 926
    :sswitch_7
    move-object v5, v4

    check-cast v5, Ll/ܽᩴۘ;

    .line 1539
    sget v9, Ll/֨ۧ;->֫۠֡:I

    if-gtz v9, :cond_2

    :cond_1
    const-string v9, "\u073a\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x49

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1789

    const v11, -0x399c3650

    xor-int/2addr v10, v11

    const v11, 0x2fe9049d

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u1a76\u06d9"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1379

    const v11, -0x24453b69

    xor-int/2addr v10, v11

    const v11, -0x7b793c9b

    goto/16 :goto_0

    .line 2258
    :sswitch_8
    iget-wide v2, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 925
    iget-object v4, p0, Ll/ۡᩴۘ;->ۙ:Ljava/util/List;

    .line 926
    invoke-static {v4, p2}, Ll/֫ۚ;->ᩳۨ۬(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    .line 983
    sget-boolean v9, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u1a7a\u073d"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4037

    const v11, -0x7923536d

    xor-int/2addr v10, v11

    const v11, -0x19f4e4fd

    goto/16 :goto_0

    .line 925
    :sswitch_9
    move-object v1, v0

    check-cast v1, Ll/ܽᩴۘ;

    iget-object v1, v1, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    sget v9, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 2030
    sget v9, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v9, :cond_4

    goto :goto_1

    :cond_4
    const-string v9, "\u073d\u0730"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x27

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x464b

    const v11, 0xd09f541

    xor-int/2addr v10, v11

    const v11, -0x4ea98284

    goto/16 :goto_0

    .line 925
    :sswitch_a
    iget-object v0, p0, Ll/ۡᩴۘ;->ܰ:Ll/۠᩵ᩴ;

    invoke-virtual {v0, p1}, Ll/۠᩵ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget v9, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v9, :cond_5

    goto :goto_1

    :cond_5
    const-string v9, "\u06d8\u06df"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x31

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xa61

    const v11, -0x16bb3f20

    xor-int/2addr v10, v11

    const v11, -0x58b51aa5

    goto/16 :goto_0

    .line 104
    :sswitch_b
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v9

    if-eqz v9, :cond_6

    :goto_1
    const-string v9, "\u06e4\u1a7b"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x3f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4b43

    const v11, -0xcbf5592

    xor-int/2addr v10, v11

    const v11, -0x59ee7324

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u1a76\u06e7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x6cfd

    const v11, 0x27b735df

    xor-int/2addr v10, v11

    const v11, 0x1c002f0f

    goto/16 :goto_0

    .line 419
    :sswitch_c
    sget-boolean v9, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v9, :cond_7

    goto :goto_2

    :cond_7
    const-string v9, "\u1a78\u05a1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x33

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x69fb

    const v11, -0x3d320d69

    xor-int/2addr v10, v11

    const v11, 0xac16c30

    goto/16 :goto_0

    :sswitch_d
    sget v9, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v9, :cond_9

    :cond_8
    :goto_2
    const-string v9, "\u1a77\u1a74"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x47

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2b7f

    const v11, 0x13f38126

    xor-int/2addr v10, v11

    const v11, 0x6c8c69d5

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u05a1\u05a1"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3c9d

    const v11, 0x4405de03

    xor-int/2addr v10, v11

    const v11, -0x48eec9f2

    goto/16 :goto_0

    :sswitch_e
    sget v9, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v9, :cond_a

    goto :goto_3

    :cond_a
    const-string v9, "\u06e4\u0730"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7395

    const v11, 0x555f29bc

    xor-int/2addr v10, v11

    const v11, 0x2913f477

    goto/16 :goto_0

    .line 1592
    :sswitch_f
    sget v9, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v9, :cond_c

    :cond_b
    const-string v9, "\u1a7a\u06db"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1957

    const v11, -0xcce706

    xor-int/2addr v10, v11

    const v11, -0x4b73e02b

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u0736\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2f5d

    const v11, -0x31703bc1

    xor-int/2addr v10, v11

    const v11, 0x18df477d

    goto/16 :goto_0

    :sswitch_10
    sget v9, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v9, :cond_d

    :goto_3
    const-string v9, "\u06d6\u06db"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x69b7

    const v11, -0x66b612b3

    xor-int/2addr v10, v11

    const v11, 0x1fdc6f1a

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06d9\u1a75"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x79b5

    const v11, 0x50da2df9

    xor-int/2addr v10, v11

    const v11, 0x3199c693

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6cbd0d94 -> :sswitch_3
        -0x631ac4d4 -> :sswitch_5
        -0x5a69c85e -> :sswitch_b
        -0x593ddda9 -> :sswitch_5
        -0x5607d8ed -> :sswitch_2
        -0x54b70adb -> :sswitch_f
        -0x530ceca5 -> :sswitch_10
        -0x420de958 -> :sswitch_2
        -0x3308f799 -> :sswitch_7
        -0x3257bfd0 -> :sswitch_8
        -0x2f6dac8f -> :sswitch_6
        -0x2e60a73f -> :sswitch_0
        -0x23a753f4 -> :sswitch_1
        -0x170e41cf -> :sswitch_c
        -0xe141c84 -> :sswitch_9
        -0x480db99 -> :sswitch_7
        0x1741759 -> :sswitch_a
        0x2b92133 -> :sswitch_9
        0x8928b3a -> :sswitch_c
        0x13c60832 -> :sswitch_b
        0x18d42aa3 -> :sswitch_a
        0x2cee2b48 -> :sswitch_f
        0x34642bdc -> :sswitch_d
        0x3e786d96 -> :sswitch_0
        0x3ebadb96 -> :sswitch_4
        0x403c89c0 -> :sswitch_4
        0x4060b909 -> :sswitch_3
        0x41795fde -> :sswitch_8
        0x46314f13 -> :sswitch_10
        0x473f9ddf -> :sswitch_e
        0x5b6a579b -> :sswitch_6
        0x63759e5c -> :sswitch_d
        0x646ae18f -> :sswitch_e
        0x7940b23d -> :sswitch_1
    .end sparse-switch
.end method

.method public final ܰ()I
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ۡᩴۘ;->ܰ:Ll/۠᩵ᩴ;

    invoke-virtual {v0}, Ll/۠᩵ᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ܰ(II)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x521f9fd8

    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v6, Ll/ۧ;->֫۠ᩴ:I

    const-string v7, "\u06d9\u06e2"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x63

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7d35

    const v9, 0x32217d61    # 9.399941E-9f

    xor-int/2addr v8, v9

    const v9, -0x6a81c66    # -7.006001E34f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x3a17

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 920
    iget-object v2, v1, Ll/ܽᩴۘ;->ܶ:Ljava/lang/String;

    iget-object v3, p0, Ll/ۡᩴۘ;->ۙ:Ljava/util/List;

    invoke-static {v3, p2}, Ll/ۖۧ;->ۘ۟ᩴ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    .line 820
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_1

    .line 844
    :sswitch_0
    sget v7, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v7, :cond_b

    goto/16 :goto_2

    .line 345
    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget-boolean v7, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v7, "\u06e0\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x33

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2b39

    const v9, -0x509d5784

    xor-int/2addr v8, v9

    const v9, -0x45fc8ab9

    goto :goto_0

    .line 34
    :sswitch_2
    sget v7, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v7, :cond_9

    goto/16 :goto_2

    .line 550
    :sswitch_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_2

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    const/4 p1, 0x0

    return p1

    .line 920
    :sswitch_5
    check-cast v3, Ll/ܽᩴۘ;

    iget-object p1, v3, Ll/ܽᩴۘ;->ܶ:Ljava/lang/String;

    invoke-static {v2, p1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const-string v7, "\u06d7\u06ec"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x35d

    const v9, 0xc571555

    xor-int/2addr v8, v9

    const v9, 0x4c98c9b

    goto :goto_0

    :sswitch_6
    invoke-virtual {v0, p1}, Ll/۠᩵ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽᩴۘ;

    sget-boolean v7, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v7, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v7, "\u073d\u06e1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x2d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3c81

    const v9, 0xbc7b802

    xor-int/2addr v8, v9

    const v9, 0x76ec1e8a

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Ll/ۡᩴۘ;->ܰ:Ll/۠᩵ᩴ;

    sget v7, Ll/֫;->ܶܺ᩻:I

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v7, "\u05a8\u1a75"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x1d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5dcd

    const v9, -0x10e02ead

    xor-int/2addr v8, v9

    const v9, 0x5c7c1797

    goto/16 :goto_0

    .line 645
    :sswitch_8
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v7

    if-eqz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u1a78\u06e7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x58ff

    const v9, -0xf90ac8c

    xor-int/2addr v8, v9

    const v9, -0x5b8880dc

    goto/16 :goto_0

    .line 523
    :sswitch_9
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v7

    if-eqz v7, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v7, "\u073d\u1a76"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x641

    const v9, 0x5b7514e

    xor-int/2addr v8, v9

    const v9, -0x6fbb4b37

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v7, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v7, :cond_6

    :goto_1
    const-string v7, "\u06db\u05ab"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4d55

    const v9, -0x7eed9f08

    xor-int/2addr v8, v9

    const v9, -0x3aa5d646

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u05a8\u1a76"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2b11

    const v9, 0x3ecea111

    xor-int/2addr v8, v9

    const v9, -0x1d129f99

    goto/16 :goto_0

    :sswitch_b
    sget v7, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v7, :cond_7

    :goto_2
    const-string v7, "\u06e8\u05a8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4267

    const v9, 0x2fc2ee9e

    xor-int/2addr v8, v9

    const v9, 0x20c0df11

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u1a76\u06ec"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x581f

    const v9, -0x3fd3d0f2

    xor-int/2addr v8, v9

    const v9, -0x247278cc

    goto/16 :goto_0

    .line 685
    :sswitch_c
    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u06d7\u1a79"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3b47

    const v9, -0x22720a77

    xor-int/2addr v8, v9

    const v9, -0x5a3071f0

    goto/16 :goto_0

    .line 610
    :sswitch_d
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u06dc\u06da"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x791

    const v9, -0x40209b49

    xor-int/2addr v8, v9

    const v9, -0x310c8285

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u05a8\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1279

    const v9, -0x6b701c12

    xor-int/2addr v8, v9

    const v9, 0x2d194d17

    goto/16 :goto_0

    .line 609
    :sswitch_e
    sget v7, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u06d8\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x6d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3bcd

    const v9, 0x6555a06f

    xor-int/2addr v8, v9

    const v9, -0x53af9401

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e4\u073d"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3015

    const v9, 0x47d56b0a

    xor-int/2addr v8, v9

    const v9, 0x65f07ab4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bf4fbef -> :sswitch_5
        -0x6a1b7c2b -> :sswitch_a
        -0x61fbebc3 -> :sswitch_5
        -0x603b0746 -> :sswitch_4
        -0x5670ad03 -> :sswitch_7
        -0x482b468d -> :sswitch_c
        -0x2aaa4f47 -> :sswitch_6
        -0x250ba5fa -> :sswitch_d
        -0x1f6903bf -> :sswitch_9
        -0x1a470e4f -> :sswitch_0
        -0x76bf972 -> :sswitch_1
        -0x336c645 -> :sswitch_3
        -0x2ff96de -> :sswitch_b
        0x4b63d96 -> :sswitch_2
        0x19cfb955 -> :sswitch_6
        0x1b70b820 -> :sswitch_7
        0x22317874 -> :sswitch_c
        0x245c06a4 -> :sswitch_e
        0x275c6117 -> :sswitch_8
        0x3f0222c1 -> :sswitch_b
        0x412e7d79 -> :sswitch_d
        0x45fc3ba2 -> :sswitch_e
        0x543ee456 -> :sswitch_3
        0x648a4069 -> :sswitch_a
        0x6cbb1113 -> :sswitch_2
        0x6fa81f1c -> :sswitch_4
        0x7820ebfa -> :sswitch_9
        0x7909cd27 -> :sswitch_1
        0x79dc076a -> :sswitch_8
        0x7a5e0fe1 -> :sswitch_0
    .end sparse-switch
.end method
