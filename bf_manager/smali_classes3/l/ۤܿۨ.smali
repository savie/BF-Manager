.class public final synthetic Ll/ۤܿۨ;
.super Ljava/lang/Object;
.source "H508"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/۬ܳۨ;

.field public final synthetic ۛ:Ll/ۨۜ᩹;

.field public final synthetic ۧ:Z

.field public final synthetic ۫:Lbin/mt/plus/Main;

.field public final synthetic ܺ:Ll/۫ܿۨ;

.field public final synthetic ܽ:Ll/᩹ܳۨ;

.field public final synthetic ܿ:[Ljava/lang/String;

.field public final synthetic ᩶:Ll/᩵ۡۜ;

.field public final synthetic ᩻:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll/۫ܿۨ;Ll/᩵ۡۜ;Ll/۬ܳۨ;Ll/᩹ܳۨ;Lbin/mt/plus/Main;[Ljava/lang/String;Ll/ۨۜ᩹;ZLandroid/widget/TextView;)V
    .locals 6

    const v0, -0x45cc0c0e

    sget v1, Ll/֨ۧ;->֫۠֡:I

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5873

    const v5, -0x742a91a6

    xor-int/2addr v4, v5

    const v5, -0x4de52947

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xfcd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_6

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string v3, "\u1a75\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d37

    const v5, 0x59b2022

    xor-int/2addr v4, v5

    const v5, -0x49452a37

    goto :goto_0

    :sswitch_1
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v3, :cond_b

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput-boolean p8, p0, Ll/ۤܿۨ;->ۧ:Z

    iput-object p9, p0, Ll/ۤܿۨ;->᩻:Landroid/widget/TextView;

    return-void

    :sswitch_5
    iput-object p6, p0, Ll/ۤܿۨ;->ܿ:[Ljava/lang/String;

    iput-object p7, p0, Ll/ۤܿۨ;->ۛ:Ll/ۨۜ᩹;

    .line 4
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1029

    const v5, -0x15235ed

    xor-int/2addr v4, v5

    const v5, 0x4590f951

    goto :goto_0

    .line 0
    :sswitch_6
    iput-object p4, p0, Ll/ۤܿۨ;->ܽ:Ll/᩹ܳۨ;

    iput-object p5, p0, Ll/ۤܿۨ;->۫:Lbin/mt/plus/Main;

    .line 4
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5fb1

    const v5, 0x2797606e

    xor-int/2addr v4, v5

    const v5, -0x29a1b67b

    goto/16 :goto_0

    .line 0
    :sswitch_7
    iput-object p3, p0, Ll/ۤܿۨ;->֡:Ll/۬ܳۨ;

    .line 2
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a77\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7efb

    const v5, 0x7965ffea

    xor-int/2addr v4, v5

    const v5, 0x70c52199

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5bc9

    const v5, -0x10886f40

    xor-int/2addr v4, v5

    const v5, 0x12352e98

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a75\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x551d

    const v5, -0x5810ec45

    xor-int/2addr v4, v5

    const v5, -0x7c74537a

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06e4\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76e3

    const v5, -0x65fa97fb

    xor-int/2addr v4, v5

    const v5, 0x2debc9fd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d9\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7bb5

    const v5, 0x60c5eb8c

    xor-int/2addr v4, v5

    const v5, -0x7b52357

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u06eb\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c3f

    const v5, 0x5854a257

    xor-int/2addr v4, v5

    const v5, 0x7eea36e9

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x676b

    const v5, -0x6fcc130d

    xor-int/2addr v4, v5

    const v5, -0xd5b15d5

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_9

    :goto_4
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d5d

    const v5, 0x7878ae6d

    xor-int/2addr v4, v5

    const v5, 0x677175c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0733\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3391

    const v5, 0x3d5b1efb

    xor-int/2addr v4, v5

    const v5, -0x4fdad8b0

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x382f

    const v5, -0x532dac1c

    xor-int/2addr v4, v5

    const v5, 0x7c93740b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۤܿۨ;->ܺ:Ll/۫ܿۨ;

    iput-object p2, p0, Ll/ۤܿۨ;->᩶:Ll/᩵ۡۜ;

    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d6\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2da9

    const v5, -0x30154b82

    xor-int/2addr v4, v5

    const v5, 0xfc7a061

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21ed

    const v5, -0x5287e8da

    xor-int/2addr v4, v5

    const v5, 0x58fe6a51

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f27ecd3 -> :sswitch_d
        -0x773dfd42 -> :sswitch_0
        -0x6c8dea64 -> :sswitch_8
        -0x6b14ebb0 -> :sswitch_3
        -0x4f51bb15 -> :sswitch_5
        -0x44aeae2e -> :sswitch_c
        -0x445c1a68 -> :sswitch_c
        -0x2cfa4dfd -> :sswitch_1
        -0x1bdb6eee -> :sswitch_2
        -0x19cb4102 -> :sswitch_8
        -0x1805b517 -> :sswitch_d
        -0x178ec14a -> :sswitch_1
        -0x30618a4 -> :sswitch_a
        0x52125ad -> :sswitch_e
        0xd1ef6a7 -> :sswitch_e
        0x18358c9f -> :sswitch_7
        0x202c3595 -> :sswitch_4
        0x2c5f61d0 -> :sswitch_b
        0x35665b1b -> :sswitch_9
        0x3f912410 -> :sswitch_3
        0x43d18099 -> :sswitch_7
        0x4590b105 -> :sswitch_6
        0x474efbe3 -> :sswitch_9
        0x519d6872 -> :sswitch_b
        0x540b4381 -> :sswitch_4
        0x55c69b3f -> :sswitch_0
        0x625b22a9 -> :sswitch_6
        0x6a7b53d9 -> :sswitch_2
        0x7c2ed164 -> :sswitch_a
        0x7d08e09e -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 22

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x10390d7f

    sget v9, Ll/ۧ;->֫۠ᩴ:I

    sget v10, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v11, "\u05a1\u0736"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x5

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x32f

    const v13, -0x48935404

    xor-int/2addr v12, v13

    const v13, 0x6484683b

    xor-int/2addr v11, v13

    move-object/from16 v21, v2

    move-object v13, v3

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v8, v9

    mul-int/lit16 v1, v1, -0x4a9d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v12

    xor-int v8, v11, v1

    sparse-switch v8, :sswitch_data_0

    .line 1
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_9

    goto/16 :goto_5

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v1

    if-lez v1, :cond_7

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v1

    if-ltz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, -0x214d

    const v3, -0x441ce200

    xor-int v12, v2, v3

    const v2, -0x1c838258

    goto/16 :goto_6

    .line 3
    :sswitch_2
    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-lez v1, :cond_a

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v1, v0, Ll/ۤܿۨ;->ܿ:[Ljava/lang/String;

    iget-object v2, v0, Ll/ۤܿۨ;->ۛ:Ll/ۨۜ᩹;

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    invoke-static/range {v13 .. v21}, Ll/۫ܿۨ;->ۙ(Ll/۫ܿۨ;Ll/᩵ۡۜ;Ll/۬ܳۨ;Ll/᩹ܳۨ;Lbin/mt/plus/Main;[Ljava/lang/String;Ll/ۨۜ᩹;ZLandroid/widget/TextView;)V

    return-void

    :sswitch_6
    iget-object v1, v0, Ll/ۤܿۨ;->۫:Lbin/mt/plus/Main;

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v2

    if-gtz v2, :cond_1

    move-object/from16 v17, v1

    goto/16 :goto_5

    :cond_1
    const-string v2, "\u06e1\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v10

    mul-int/lit8 v2, v2, -0xb

    xor-int v3, v2, v9

    mul-int/lit16 v3, v3, -0x52cd

    const v4, 0x60c08af4

    xor-int v12, v3, v4

    const v3, -0x579ba99f

    xor-int v11, v2, v3

    move-object/from16 v17, v1

    goto :goto_0

    :sswitch_7
    iget-object v15, v0, Ll/ۤܿۨ;->֡:Ll/۬ܳۨ;

    iget-object v1, v0, Ll/ۤܿۨ;->ܽ:Ll/᩹ܳۨ;

    .line 4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v2

    if-gtz v2, :cond_2

    move-object/from16 v16, v1

    goto/16 :goto_5

    :cond_2
    const-string v2, "\u06da\u06d8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v9, v2

    mul-int/lit8 v2, v2, 0x57

    xor-int v3, v2, v10

    mul-int/lit16 v3, v3, -0x6353

    const v4, 0x76a68c87

    xor-int v12, v3, v4

    const v3, -0x7682af47

    xor-int v11, v2, v3

    move-object/from16 v16, v1

    goto/16 :goto_0

    .line 0
    :sswitch_8
    iget-object v13, v0, Ll/ۤܿۨ;->ܺ:Ll/۫ܿۨ;

    iget-object v14, v0, Ll/ۤܿۨ;->᩶:Ll/᩵ۡۜ;

    .line 2
    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u073f\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, 0x461d

    const v3, -0x1060397b

    xor-int v12, v2, v3

    const v2, 0x66642a32

    goto/16 :goto_6

    .line 0
    :sswitch_9
    iget-object v1, v0, Ll/ۤܿۨ;->᩻:Landroid/widget/TextView;

    .line 4
    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v2, :cond_4

    move-object/from16 v21, v1

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u073d\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v10

    mul-int/lit8 v2, v2, 0x31

    xor-int v3, v2, v9

    mul-int/lit16 v3, v3, 0xde1

    const v4, 0x21a62dbf

    xor-int v12, v3, v4

    const v3, 0x188a7e6d

    xor-int v11, v2, v3

    move-object/from16 v21, v1

    goto/16 :goto_0

    .line 0
    :sswitch_a
    iget-boolean v1, v0, Ll/ۤܿۨ;->ۧ:Z

    .line 3
    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v2, :cond_5

    move/from16 v20, v1

    goto :goto_2

    :cond_5
    const-string v2, "\u06d8\u0730"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v10

    xor-int v3, v2, v9

    mul-int/lit16 v3, v3, 0x7925

    const v4, 0x4fc436c6

    xor-int v12, v3, v4

    const v3, -0x594faaba

    xor-int v11, v2, v3

    move/from16 v20, v1

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_2
    const-string v1, "\u1a76\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v10, v1

    mul-int/lit8 v1, v1, 0x1f

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x37f3

    const v3, 0x64b101

    xor-int v12, v2, v3

    const v2, 0x10e6f996

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a76\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    mul-int/lit8 v1, v1, -0x41

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, 0x4a4b

    const v3, 0x27f9037

    xor-int v12, v2, v3

    const v2, 0x308a12e6

    goto/16 :goto_6

    :sswitch_c
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u073f\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v10

    mul-int/lit8 v1, v1, 0xf

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x4d81

    const v3, -0x14571880

    xor-int v12, v2, v3

    const v2, 0x16e1a4c6

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u0730\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, 0x71a1

    const v3, 0x45141c08

    xor-int v12, v2, v3

    const v2, 0x6c04e1cf

    goto/16 :goto_6

    :cond_9
    const-string v1, "\u06e4\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v10

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, 0x7515

    const v3, -0x3bb1fc37

    xor-int v12, v2, v3

    const v2, -0x6b584fb6

    goto :goto_6

    .line 0
    :sswitch_d
    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_b

    :cond_a
    :goto_4
    const-string v1, "\u06e8\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v9

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, -0x5081

    const v3, 0x72c7ffb7

    xor-int v12, v2, v3

    const v2, 0x35c82d74

    goto :goto_6

    :cond_b
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v9

    mul-int/lit8 v1, v1, -0x73

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, 0x4239

    const v3, -0x3d41b7bf

    xor-int v12, v2, v3

    const v2, 0x4c3ef2b0    # 5.005587E7f

    goto :goto_6

    .line 2
    :sswitch_e
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_c

    :goto_5
    const-string v1, "\u06df\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v9, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v10

    mul-int/lit16 v2, v2, 0x1c4d

    const v3, 0x1da04a58

    xor-int v12, v2, v3

    const v2, -0x36ad42cc    # -863187.25f

    goto :goto_6

    :cond_c
    const-string v1, "\u05ab\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v10, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v9

    mul-int/lit16 v2, v2, -0x3657

    const v3, 0x3ec334ff

    xor-int v12, v2, v3

    const v2, -0x2a91a521

    :goto_6
    xor-int v11, v1, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cd9757c -> :sswitch_c
        -0x7533f3ac -> :sswitch_3
        -0x4a0d653c -> :sswitch_5
        -0x375ddead -> :sswitch_0
        -0x32451f64 -> :sswitch_d
        -0x2ef2f9ef -> :sswitch_1
        -0x2cff1b12 -> :sswitch_b
        -0x269fd2be -> :sswitch_7
        -0x14cc56d3 -> :sswitch_1
        -0xdbdfd16 -> :sswitch_b
        -0xc8a421d -> :sswitch_e
        -0x5ed93f5 -> :sswitch_d
        0x96e8510 -> :sswitch_3
        0x12f03cc9 -> :sswitch_0
        0x13030dbe -> :sswitch_a
        0x1c1b772a -> :sswitch_8
        0x2066d6c2 -> :sswitch_e
        0x3876ae1b -> :sswitch_6
        0x3b4820ce -> :sswitch_7
        0x4182ed39 -> :sswitch_8
        0x475c2e67 -> :sswitch_2
        0x4cbd8c81 -> :sswitch_5
        0x4d819db3 -> :sswitch_9
        0x4f8c2d78 -> :sswitch_a
        0x53cae3a3 -> :sswitch_9
        0x5c7bcf5c -> :sswitch_2
        0x631a16f2 -> :sswitch_6
        0x65bd1026 -> :sswitch_4
        0x6a6c21c0 -> :sswitch_4
        0x7f967f94 -> :sswitch_c
    .end sparse-switch
.end method
