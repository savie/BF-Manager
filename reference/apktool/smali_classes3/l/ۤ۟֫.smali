.class public final synthetic Ll/ۤ۟֫;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩺᩻ۡ:[S


# instance fields
.field public final synthetic ܰ:Ll/ܳ۟֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤ۟֫;->᩺᩻ۡ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x15b6s
        -0x3354s
        0x339as
        0x22f0s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ܳ۟֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۟֫;->ܰ:Ll/ܳ۟֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

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

    const v13, 0x49ed9888    # 1946385.0f

    sget v14, Ll/֨ۚ;->֡᩸ۛ:I

    sget v15, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v16, "\u073f\u06d7"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x51

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x643

    const v18, -0xfb056ac

    xor-int v0, v0, v18

    const v18, -0x72cf79e4

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v12, v11

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, 0x49ed9888    # 1946385.0f

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v15

    mul-int/lit16 v4, v4, 0x7c1d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    const/4 v0, 0x3

    .line 215
    invoke-static {v12, v13, v0, v11}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v3

    .line 101
    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_1

    const-string v0, "\u1a7a\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x1f

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x3843

    const v17, 0x22f6c

    xor-int v4, v4, v17

    const v17, 0x5887ddc7

    goto/16 :goto_5

    .line 94
    :sswitch_0
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v0, :cond_a

    goto/16 :goto_2

    .line 27
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v0

    if-gtz v0, :cond_c

    goto/16 :goto_2

    .line 0
    :sswitch_2
    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_7

    goto/16 :goto_3

    .line 162
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    return-void

    .line 215
    :sswitch_5
    invoke-static {v1, v2}, Ll/ۖ᩵;->֫᩻֨(Ljava/lang/Object;I)Landroid/view/View;

    .line 216
    invoke-virtual {v1}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return-void

    .line 215
    :sswitch_6
    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7ee75285

    xor-int/2addr v2, v0

    .line 193
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "\u06db\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x184f

    const v17, -0x4c43a78c

    xor-int v4, v4, v17

    const v17, 0x1a110621    # 2.9990248E-23f

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u06e2\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x763b

    const v17, 0x8b64fef

    xor-int v4, v4, v17

    const v17, -0x3433c5b6    # -2.6768532E7f

    goto/16 :goto_5

    :sswitch_7
    const/4 v13, 0x1

    .line 49
    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u1a79\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x5215

    const v17, -0x3b55e7cb

    xor-int v4, v4, v17

    const v17, -0x7eddeb6f

    goto/16 :goto_5

    .line 215
    :sswitch_8
    sget-object v12, Ll/ۤ۟֫;->᩺᩻ۡ:[S

    .line 107
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u1a76\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x33db

    const v17, -0x350098e3    # -8369038.5f

    xor-int v4, v4, v17

    const v17, -0x112beee4

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ۤ۟֫;->ܰ:Ll/ܳ۟֫;

    .line 215
    iget-object v1, v1, Ll/ܳ۟֫;->ܳ:Ll/ܺ۟֫;

    .line 92
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u0736\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v15

    mul-int/lit8 v4, v4, -0x5d

    xor-int v0, v4, v14

    mul-int/lit16 v0, v0, -0x2719

    const v17, 0x2217b6c3

    xor-int v0, v0, v17

    const v17, -0x159ce0d3

    xor-int v17, v4, v17

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x5e02

    const/16 v11, 0x5e02

    goto :goto_1

    :sswitch_b
    const/16 v0, 0x4df6

    const/16 v11, 0x4df6

    :goto_1
    const-string v0, "\u06e2\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3adf

    const v17, -0x3020a8cb

    xor-int v4, v4, v17

    const v17, -0x3a5cfa4d

    goto/16 :goto_5

    :sswitch_c
    add-int v0, v9, v10

    sub-int/2addr v0, v8

    if-ltz v0, :cond_5

    const-string v0, "\u0730\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x602d

    const v17, -0x1ee9be3b

    xor-int v4, v4, v17

    const v17, 0x6762f9f8

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x11

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x6321

    const v17, 0x26bdc907

    xor-int v4, v4, v17

    const v17, 0x54e61bf

    goto/16 :goto_5

    :sswitch_d
    const v10, 0x349ae09

    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_6

    goto :goto_3

    :cond_6
    const-string v0, "\u06da\u0733"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x73

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x3cc9

    const v17, -0x10ca9ee0

    xor-int v4, v4, v17

    const v17, 0x6e5b6398

    goto/16 :goto_5

    :sswitch_e
    mul-int v8, v6, v7

    mul-int v9, v6, v6

    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_8

    :cond_7
    :goto_2
    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0xef1

    const v17, 0x44728bc3

    xor-int v4, v4, v17

    const v17, 0x5840bc56

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u0733\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x63

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x4dcd

    const v17, 0x3b146e71

    xor-int v4, v4, v17

    const v17, -0x1edd181d

    goto/16 :goto_5

    :sswitch_f
    aget-short v6, v18, v5

    const/16 v7, 0x3a06

    .line 140
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v0

    if-eqz v0, :cond_9

    :goto_3
    const-string v0, "\u1a78\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0xb

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3ce7

    const v17, -0x7323577b

    xor-int v4, v4, v17

    const v17, 0x43ae2ac7

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x5

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x55c1

    const v17, 0x46675542

    xor-int v4, v4, v17

    const v17, 0x69ace5fa

    goto :goto_5

    :sswitch_10
    const/4 v5, 0x0

    sget v0, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u1a7b\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3e1b

    const v17, -0x5be1b7c2

    xor-int v4, v4, v17

    const v17, 0x7aa13f78

    goto :goto_5

    :cond_b
    const-string v0, "\u0730\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x1339

    const v17, 0x26e419d8

    xor-int v4, v4, v17

    const v17, 0x6f322858

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ۤ۟֫;->᩺᩻ۡ:[S

    .line 150
    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v0, :cond_d

    :cond_c
    const-string v0, "\u06e8\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x63

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x4cd5

    const v17, 0x7765d417

    xor-int v4, v4, v17

    const v17, -0x58640fc9

    goto :goto_5

    :cond_d
    const-string v0, "\u1a78\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6b

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x721b

    const v17, -0x5cb50816

    xor-int v4, v4, v17

    const v17, -0x5815bfa6

    :goto_5
    xor-int v17, v0, v17

    move v0, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d5a3712 -> :sswitch_2
        -0x76077ac2 -> :sswitch_10
        -0x72d835eb -> :sswitch_0
        -0x6c753e18 -> :sswitch_e
        -0x6b113a43 -> :sswitch_d
        -0x59ba2b48 -> :sswitch_e
        -0x50768d8e -> :sswitch_10
        -0x47c0fe17 -> :sswitch_b
        -0x41821ab6 -> :sswitch_1
        -0x3ea9f1e1 -> :sswitch_c
        -0x3d115900 -> :sswitch_4
        -0x230616d7 -> :sswitch_5
        -0x12766d17 -> :sswitch_1
        -0x9b73da6 -> :sswitch_11
        -0x8b12899 -> :sswitch_b
        -0x4550f09 -> :sswitch_3
        0x8c04e74 -> :sswitch_d
        0x9efa931 -> :sswitch_8
        0xe3e94a2 -> :sswitch_8
        0x17f4c27c -> :sswitch_c
        0x2a61ce77 -> :sswitch_6
        0x2d3a8dc8 -> :sswitch_9
        0x2e5c157b -> :sswitch_2
        0x2ee0ad1b -> :sswitch_7
        0x338984a2 -> :sswitch_5
        0x39a07e3a -> :sswitch_a
        0x46aa9761 -> :sswitch_f
        0x5150d80c -> :sswitch_0
        0x52884f11 -> :sswitch_9
        0x582346f8 -> :sswitch_11
        0x5ce77026 -> :sswitch_6
        0x5e41c5ea -> :sswitch_f
        0x63a2aef2 -> :sswitch_4
        0x6851510a -> :sswitch_a
        0x71dbde81 -> :sswitch_3
        0x79fcbcb7 -> :sswitch_7
    .end sparse-switch
.end method
