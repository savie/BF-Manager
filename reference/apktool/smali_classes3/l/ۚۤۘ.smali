.class public final synthetic Ll/ۚۤۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/۠᩶ۘ;


# instance fields
.field public final synthetic ܺ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۤۘ;->ܺ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 6

    const v0, -0x52777693

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v3, "\u06df\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1f85

    const v5, -0x74a416d2

    xor-int/2addr v4, v5

    const v5, -0x78a137ca

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x4613

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_8

    goto/16 :goto_3

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-gez v3, :cond_7

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_5

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v3, :cond_b

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۚۤۘ;->ܺ:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۖ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06df\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d27

    const v5, 0x778c2b37

    xor-int/2addr v4, v5

    const v5, -0x760120e3

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e0\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6603

    const v5, 0x1e383709

    xor-int/2addr v4, v5

    const v5, -0x4cef31fc

    goto :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u06df\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x46e3

    const v5, 0x6a479038

    xor-int/2addr v4, v5

    const v5, 0x401f52d0

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a79\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1a8d

    const v5, 0x2cd0b5a9

    xor-int/2addr v4, v5

    const v5, 0x6b69bfa2

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u06db\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5f21

    const v5, 0x2a9def4d

    xor-int/2addr v4, v5

    const v5, -0x5d50615c

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a0b

    const v5, -0x1bd06a1

    xor-int/2addr v4, v5

    const v5, 0xe33b680

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x127

    const v5, 0x4129adfd

    xor-int/2addr v4, v5

    const v5, -0x66cc750b

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v3

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u0733\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2cdb

    const v5, -0x5d1b5e32

    xor-int/2addr v4, v5

    const v5, -0x6a87c65c

    goto/16 :goto_0

    :cond_7
    :goto_3
    const-string v3, "\u06e7\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xa11

    const v5, -0x687a07d8

    xor-int/2addr v4, v5

    const v5, 0x4e58f01f    # 9.099038E8f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1d33

    const v5, -0x5f08d579

    xor-int/2addr v4, v5

    const v5, -0x29e961e8

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06d9\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xea3

    const v5, -0x3c28c74c

    xor-int/2addr v4, v5

    const v5, 0x59e108d5

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u05a8\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67d5

    const v5, -0x14535dff

    xor-int/2addr v4, v5

    const v5, -0x5de8b1fd

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e6b

    const v5, 0x70880a44

    xor-int/2addr v4, v5

    const v5, -0x65270a31

    goto/16 :goto_0

    .line 2
    :sswitch_e
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e5b

    const v5, -0x1a6a20a3

    xor-int/2addr v4, v5

    const v5, 0x3c2e2752

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b97

    const v5, -0x651ced00

    xor-int/2addr v4, v5

    const v5, -0x5905353d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7afab6a5 -> :sswitch_b
        -0x6eea6deb -> :sswitch_2
        -0x64491559 -> :sswitch_1
        -0x62f0be0a -> :sswitch_d
        -0x4e60b98d -> :sswitch_b
        -0x482989a2 -> :sswitch_e
        -0x28ec9b9b -> :sswitch_c
        -0x253bb031 -> :sswitch_0
        -0x1ae248bd -> :sswitch_7
        -0x163fefd1 -> :sswitch_3
        -0x10e68116 -> :sswitch_1
        -0x9c435fa -> :sswitch_4
        -0x218c232 -> :sswitch_7
        0x2125ba82 -> :sswitch_3
        0x241388fd -> :sswitch_0
        0x24e4973c -> :sswitch_a
        0x265c7e5b -> :sswitch_6
        0x2cca7288 -> :sswitch_4
        0x428082f4 -> :sswitch_2
        0x499e63f1 -> :sswitch_8
        0x4bd590d2 -> :sswitch_a
        0x4cdd9a5a -> :sswitch_9
        0x526445a7 -> :sswitch_5
        0x5715ea3c -> :sswitch_5
        0x58213232 -> :sswitch_6
        0x6c6f0078 -> :sswitch_e
        0x71e93aff -> :sswitch_c
        0x74cd5b5e -> :sswitch_d
        0x7887d7a1 -> :sswitch_8
        0x7f0840e9 -> :sswitch_9
    .end sparse-switch
.end method
