.class public final synthetic Ll/ᩴۖ᩻;
.super Ljava/lang/Object;
.source "44LP"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ܰ:Ll/ۚۖ᩻;

.field public final synthetic ᩶:Ll/ܺۖ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۖ᩻;Ll/ܺۖ᩻;)V
    .locals 6

    const v0, 0x46e34701

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2163

    const v5, -0x55b773f2

    xor-int/2addr v4, v5

    const v5, -0x67f824c2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x6e73

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v3, :cond_b

    goto :goto_1

    :sswitch_0
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :sswitch_1
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v3, :cond_5

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ᩴۖ᩻;->᩶:Ll/ܺۖ᩻;

    return-void

    .line 1
    :sswitch_5
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e0\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5b19

    const v5, 0x67f5504e

    xor-int/2addr v4, v5

    const v5, -0x496630dd

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44e9

    const v5, 0x67e338c3

    xor-int/2addr v4, v5

    const v5, 0x17e0c31b

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5127

    const v5, 0x144936c0

    xor-int/2addr v4, v5

    const v5, 0x4d5d8663    # 2.3228574E8f

    goto :goto_0

    :cond_2
    const-string v3, "\u06ec\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2f1

    const v5, 0x19f0596e

    xor-int/2addr v4, v5

    const v5, -0x79c34e65

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4dab

    const v5, 0x4e53bd6d    # 8.881017E8f

    xor-int/2addr v4, v5

    const v5, -0x41de4aaa

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v3

    if-eqz v3, :cond_4

    :goto_2
    const-string v3, "\u06d6\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42b9

    const v5, 0x1aac3025

    xor-int/2addr v4, v5

    const v5, 0x7a30ff8

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x755d

    const v5, 0x75e723b9

    xor-int/2addr v4, v5

    const v5, -0x5b300343    # -9.0200095E-17f

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_3
    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f4f

    const v5, 0x12255e95

    xor-int/2addr v4, v5

    const v5, 0x3775b746

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073a\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2ec5

    const v5, -0x5167cb5d

    xor-int/2addr v4, v5

    const v5, 0x398ee1db

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7d0f

    const v5, 0x67ecd674

    xor-int/2addr v4, v5

    const v5, 0x68ec5614

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2375

    const v5, -0x2f6b6904

    xor-int/2addr v4, v5

    const v5, -0x6fcd08a6

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4213

    const v5, -0x38d78b6a

    xor-int/2addr v4, v5

    const v5, 0x83e7dd6

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x11b9

    const v5, -0x4a5c05f0

    xor-int/2addr v4, v5

    const v5, -0x31736420

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴۖ᩻;->ܰ:Ll/ۚۖ᩻;

    .line 4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c5d

    const v5, -0x3ce5c459

    xor-int/2addr v4, v5

    const v5, -0x163d5646    # -2.941664E25f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7907

    const v5, 0x244ef798

    xor-int/2addr v4, v5

    const v5, -0x666089b5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f592e9b -> :sswitch_1
        -0x7c781d4a -> :sswitch_d
        -0x7b1737b6 -> :sswitch_2
        -0x53f6ff8d -> :sswitch_8
        -0x532278d1 -> :sswitch_c
        -0x42b15e1d -> :sswitch_0
        -0x3d2a37aa -> :sswitch_9
        -0x3734cf6e -> :sswitch_2
        -0x34651955 -> :sswitch_3
        -0x2bae4d57 -> :sswitch_3
        -0x2a563137 -> :sswitch_7
        -0x26c7c3ce -> :sswitch_7
        -0x1f8b0420 -> :sswitch_b
        -0x1b91b50d -> :sswitch_6
        -0x10ae4c77 -> :sswitch_d
        -0xe3997cb -> :sswitch_4
        -0xd9ff5ea -> :sswitch_a
        -0x5737ee8 -> :sswitch_a
        -0x21b8c18 -> :sswitch_e
        0x24959d2 -> :sswitch_5
        0x320f7d6 -> :sswitch_4
        0x513267d -> :sswitch_1
        0x1d3b5756 -> :sswitch_e
        0x385fd88f -> :sswitch_6
        0x407ad262 -> :sswitch_0
        0x41d2e079 -> :sswitch_b
        0x5550ff7b -> :sswitch_8
        0x5bdc21bf -> :sswitch_9
        0x75b23fdf -> :sswitch_5
        0x770c99de -> :sswitch_c
    .end sparse-switch
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 5

    const p1, -0x9b70084

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v2, "\u06e8\u06e2"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x5d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x70b

    const v4, 0x6093911e

    xor-int/2addr v3, v4

    const v4, -0x5dd7ded2

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x4169

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 3
    sget v2, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v2, :cond_6

    goto/16 :goto_3

    .line 4
    :sswitch_0
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v2, :cond_8

    goto/16 :goto_1

    .line 0
    :sswitch_1
    sget-boolean v2, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v2, :cond_a

    goto/16 :goto_1

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v2, :cond_4

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ᩴۖ᩻;->ܰ:Ll/ۚۖ᩻;

    iget-object v0, p0, Ll/ᩴۖ᩻;->᩶:Ll/ܺۖ᩻;

    invoke-static {p1, v0, p2, p3}, Ll/ܺۖ᩻;->ۙ(Ll/ۚۖ᩻;Ll/ܺۖ᩻;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :sswitch_6
    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u0730\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x11

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x793b

    const v4, -0x22f6cd9

    xor-int/2addr v3, v4

    const v4, 0x9558d94

    goto :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v2, "\u06d6\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7e3b

    const v4, 0x582e7535

    xor-int/2addr v3, v4

    const v4, 0x6cfec19e

    goto :goto_0

    :sswitch_8
    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u06dc\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x15

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4a95

    const v4, 0x4352e298

    xor-int/2addr v3, v4

    const v4, -0x4a1968ba

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u06df\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x3f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x57f9

    const v4, 0x729bf375

    xor-int/2addr v3, v4

    const v4, -0x201463e2

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v2, :cond_5

    :cond_4
    :goto_1
    const-string v2, "\u1a77\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x659

    const v4, -0xedcfd53

    xor-int/2addr v3, v4

    const v4, 0x389853b4

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e2\u0730"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1f4d

    const v4, -0x241a4c4b

    xor-int/2addr v3, v4

    const v4, -0x36a6ceb4    # -889620.75f

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06d6\u1a76"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x56f7

    const v4, -0x76cc1165

    xor-int/2addr v3, v4

    const v4, 0x219249e5

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget-boolean v2, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v2, :cond_7

    :goto_2
    const-string v2, "\u06d7\u06eb"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x61

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x25e9

    const v4, 0x3490a2a

    xor-int/2addr v3, v4

    const v4, -0x138d03a6

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06df\u1a79"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x53

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x78bf

    const v4, 0x2de37ffb

    xor-int/2addr v3, v4

    const v4, 0x33b4e3ca

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    const-string v2, "\u1a73\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7ccd

    const v4, 0x5e033028

    xor-int/2addr v3, v4

    const v4, 0x2c4a5591

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06d6\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x6b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x23b1

    const v4, -0x154e142e

    xor-int/2addr v3, v4

    const v4, -0x1c292df4

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v2, :cond_b

    :cond_a
    const-string v2, "\u06e4\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2a9f

    const v4, -0x23545da8

    xor-int/2addr v3, v4

    const v4, 0x64b70346

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u0733\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x56bd

    const v4, 0x6f552fd9

    xor-int/2addr v3, v4

    const v4, 0x2f426fce

    goto/16 :goto_0

    .line 1
    :sswitch_e
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v2

    if-gtz v2, :cond_c

    :goto_3
    const-string v2, "\u06e0\u1a73"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x59

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x7f7

    const v4, 0xf44d964

    xor-int/2addr v3, v4

    const v4, -0x2f1ca0e3

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x4d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x42bd

    const v4, 0x4e3ed1b8    # 8.003538E8f

    xor-int/2addr v3, v4

    const v4, -0x32311dc3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x771dbc98 -> :sswitch_3
        -0x68431bc0 -> :sswitch_2
        -0x66d3b265 -> :sswitch_1
        -0x6539d934 -> :sswitch_b
        -0x597af564 -> :sswitch_6
        -0x577d1d83 -> :sswitch_e
        -0x4611013a -> :sswitch_e
        -0x44511790 -> :sswitch_d
        -0x3d4dd30b -> :sswitch_5
        -0x3cf504b7 -> :sswitch_0
        -0x38ab9859 -> :sswitch_2
        -0x28a6a35f -> :sswitch_4
        -0x2378bb7f -> :sswitch_6
        -0x20181fba -> :sswitch_3
        0xbda35a7 -> :sswitch_8
        0xbf7c0d7 -> :sswitch_0
        0x19745b2a -> :sswitch_4
        0x26f2cdb3 -> :sswitch_d
        0x2e684731 -> :sswitch_8
        0x301fd675 -> :sswitch_7
        0x303ab833 -> :sswitch_b
        0x45779462 -> :sswitch_a
        0x45edcad7 -> :sswitch_5
        0x48ac5fe3 -> :sswitch_1
        0x4ba7ba21 -> :sswitch_c
        0x4d8d2989 -> :sswitch_7
        0x4e58525a -> :sswitch_9
        0x559981ff -> :sswitch_c
        0x7920b3c0 -> :sswitch_9
        0x7b75e9aa -> :sswitch_a
    .end sparse-switch
.end method
