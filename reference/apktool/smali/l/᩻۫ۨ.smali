.class public final synthetic Ll/᩻۫ۨ;
.super Ljava/lang/Object;
.source "760C"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۙ:[I

.field public final synthetic ܰ:Ll/ۧۧۖ;


# direct methods
.method public synthetic constructor <init>([ILl/ۧۧۖ;)V
    .locals 6

    const v0, 0x7a7b79a1

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5f45

    const v5, -0x516c0e40

    xor-int/2addr v4, v5

    const v5, -0x1ce5f6c9

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x24d3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 0
    :sswitch_2
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    :goto_1
    const-string v3, "\u1a7b\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e3f

    const v5, -0x59ec93ae

    xor-int/2addr v4, v5

    const v5, -0x1348d39

    goto :goto_0

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/᩻۫ۨ;->ܰ:Ll/ۧۧۖ;

    return-void

    :cond_0
    const-string v3, "\u1a78\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e3b

    const v5, 0x83f10dc

    xor-int/2addr v4, v5

    const v5, -0x35537cd1    # -5652887.5f

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0733\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xee9

    const v5, -0x36dbfd3c    # -671788.25f

    xor-int/2addr v4, v5

    const v5, 0x691b3d11

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7059

    const v5, -0x33a6a59

    xor-int/2addr v4, v5

    const v5, -0x98a651d

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a7a\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42d1

    const v5, 0xbf86245

    xor-int/2addr v4, v5

    const v5, 0x4378796f

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e2\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a41

    const v5, -0x7a5e555a

    xor-int/2addr v4, v5

    const v5, 0x64695175

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x56af

    const v5, 0x5019901c

    xor-int/2addr v4, v5

    const v5, -0x50b596ee

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06e8\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xf59

    const v5, 0x3b52d9e0

    xor-int/2addr v4, v5

    const v5, -0xb27034

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a75\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7197

    const v5, 0xbb7268c

    xor-int/2addr v4, v5

    const v5, -0x323900cb

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6981

    const v5, 0x1ef37ccb

    xor-int/2addr v4, v5

    const v5, -0x7ed93750

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06eb\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x59fb

    const v5, -0x49c5914a

    xor-int/2addr v4, v5

    const v5, 0x2331912c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u1a7a\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6f21

    const v5, -0x4832b8c0

    xor-int/2addr v4, v5

    const v5, 0x1e59107a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x23b

    const v5, 0x67a1d9bf

    xor-int/2addr v4, v5

    const v5, 0x5706577c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩻۫ۨ;->ۙ:[I

    .line 1
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e4\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c25

    const v5, -0x1215c36f

    xor-int/2addr v4, v5

    const v5, 0x5307f11d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x17c3

    const v5, -0x39dbde7c

    xor-int/2addr v4, v5

    const v5, -0x531a6ec

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a4bcd9f -> :sswitch_e
        -0x6cfef157 -> :sswitch_d
        -0x60569af6 -> :sswitch_4
        -0x5669624b -> :sswitch_6
        -0x551e8d7c -> :sswitch_3
        -0x4ab9bd26 -> :sswitch_a
        -0x451bed85 -> :sswitch_c
        -0x40b2a27a -> :sswitch_1
        -0x3628655f -> :sswitch_6
        -0x322dcdfd -> :sswitch_1
        -0x2b2a9c30 -> :sswitch_7
        -0x2a6ceef8 -> :sswitch_e
        -0x24ac9422 -> :sswitch_5
        -0x1a8fe1de -> :sswitch_a
        -0x15ae163c -> :sswitch_0
        -0x15266870 -> :sswitch_c
        -0x910d61f -> :sswitch_9
        0xb138350 -> :sswitch_8
        0xc508fb7 -> :sswitch_3
        0x12550cf3 -> :sswitch_5
        0x17e8aa41 -> :sswitch_b
        0x1cfee9b9 -> :sswitch_b
        0x22105ab7 -> :sswitch_d
        0x3b89b795 -> :sswitch_8
        0x3f776570 -> :sswitch_9
        0x41ba635b -> :sswitch_2
        0x4a2336f5 -> :sswitch_7
        0x5138c745 -> :sswitch_2
        0x69661cda -> :sswitch_4
        0x6b274c45 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, 0x40ffa05b

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    const-string v4, "\u06e0\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x465b

    const v6, -0x51677e20

    xor-int/2addr v5, v6

    const v6, 0xd064105

    :goto_0
    xor-int/2addr v4, v6

    :goto_1
    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x360f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_4

    goto/16 :goto_5

    :sswitch_0
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_7

    goto/16 :goto_3

    .line 53
    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_5

    .line 68
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_a

    goto/16 :goto_5

    .line 11
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 78
    invoke-static {v0, p1}, Ll/֫ܶ;->۟ܽܶ(Ljava/lang/Object;I)V

    return-void

    :sswitch_6
    const/16 p1, 0x8

    .line 80
    invoke-static {v0, p1}, Ll/ۘۚ;->֨ܳۚ(Ljava/lang/Object;I)V

    return-void

    .line 77
    :sswitch_7
    iget-object v0, p0, Ll/᩻۫ۨ;->ۙ:[I

    aget v0, v0, p1

    iget-object v4, p0, Ll/᩻۫ۨ;->ܰ:Ll/ۧۧۖ;

    if-ne p2, v0, :cond_0

    const-string v0, "\u0736\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v2, v0

    mul-int/lit8 v0, v0, -0x5f

    xor-int v5, v0, v3

    mul-int/lit16 v5, v5, 0x12bd

    const v6, 0x92828ee

    xor-int/2addr v5, v6

    const v6, 0x7705a0a4

    goto :goto_2

    :cond_0
    const-string v0, "\u06db\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v3

    xor-int v5, v0, v2

    mul-int/lit16 v5, v5, -0x53eb

    const v6, -0x1cd69f25

    xor-int/2addr v5, v6

    const v6, -0x111227a4

    :goto_2
    xor-int/2addr v0, v6

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    goto :goto_1

    :sswitch_8
    const/4 p1, 0x3

    .line 20
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_1

    goto :goto_4

    :cond_1
    const-string v4, "\u1a73\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x34bf

    const v6, 0x687af102

    xor-int/2addr v5, v6

    const v6, 0xfbbaa44

    goto/16 :goto_0

    .line 25
    :sswitch_9
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_3

    :cond_2
    :goto_3
    const-string v4, "\u1a77\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa95

    const v6, 0x472c7376

    xor-int/2addr v5, v6

    const v6, 0x36a4e097

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a73\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a99

    const v6, -0x17360bc3

    xor-int/2addr v5, v6

    const v6, 0x55f70d59

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e8\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb1f

    const v6, -0x286e8aa6

    xor-int/2addr v5, v6

    const v6, -0x663358ee

    goto/16 :goto_0

    .line 64
    :sswitch_a
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_5

    :goto_4
    const-string v4, "\u06e0\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6d63

    const v6, 0x2bdb8406

    xor-int/2addr v5, v6

    const v6, -0x485ec965

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d9\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1729

    const v6, -0xe4fd54

    xor-int/2addr v5, v6

    const v6, 0x6774235e

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u073d\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x59e3

    const v6, 0x5ccda44

    xor-int/2addr v5, v6

    const v6, 0x2d339cd9

    goto/16 :goto_0

    .line 67
    :sswitch_c
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_8

    :cond_7
    const-string v4, "\u1a79\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x64a7

    const v6, 0x7d967cc0

    xor-int/2addr v5, v6

    const v6, 0x77ae79a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a73\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7891

    const v6, -0x39abe837

    xor-int/2addr v5, v6

    const v6, -0x398869fd

    goto/16 :goto_0

    .line 9
    :sswitch_d
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2647

    const v6, 0x230d8edb

    xor-int/2addr v5, v6

    const v6, 0x38674f9d

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_b

    :cond_a
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ecb

    const v6, -0x411136ed

    xor-int/2addr v5, v6

    const v6, -0x73ad6a0f

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a73\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6d37

    const v6, 0x3c640031

    xor-int/2addr v5, v6

    const v6, -0x3e2d231c

    goto/16 :goto_0

    .line 13
    :sswitch_f
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_c

    goto :goto_5

    :cond_c
    const-string v4, "\u06e0\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a25

    const v6, 0x7ea7b9a0

    xor-int/2addr v5, v6

    const v6, -0x5da8a833

    goto/16 :goto_0

    .line 77
    :sswitch_10
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_d

    :goto_5
    const-string v4, "\u05a8\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4205

    const v6, -0x34beac3

    xor-int/2addr v5, v6

    const v6, 0x6d2063c5

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06ec\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x415

    const v6, 0x4294dfe2

    xor-int/2addr v5, v6

    const v6, 0x408ca872

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c4ee69b -> :sswitch_1
        -0x7446162e -> :sswitch_c
        -0x70da2f55 -> :sswitch_9
        -0x6a6898eb -> :sswitch_8
        -0x673d83f6 -> :sswitch_7
        -0x6583899d -> :sswitch_10
        -0x612d0e00 -> :sswitch_0
        -0x5e22c8b8 -> :sswitch_2
        -0x5820fb73 -> :sswitch_5
        -0x534be650 -> :sswitch_f
        -0x5267d4e3 -> :sswitch_b
        -0x404b9c5e -> :sswitch_a
        -0x3438250d -> :sswitch_f
        -0x31ba4ecd -> :sswitch_8
        -0x2a83de67 -> :sswitch_1
        -0x241ff8a7 -> :sswitch_c
        -0x137bd24b -> :sswitch_5
        -0x11520768 -> :sswitch_3
        -0x5a5b96a -> :sswitch_4
        -0x1848c67 -> :sswitch_3
        0x139904d0 -> :sswitch_e
        0x1a3a9e55 -> :sswitch_0
        0x2cf6b34e -> :sswitch_10
        0x352d54c1 -> :sswitch_e
        0x3a29a41e -> :sswitch_a
        0x4598ee87 -> :sswitch_4
        0x4f63b6a8 -> :sswitch_6
        0x503ece6b -> :sswitch_9
        0x510e41b0 -> :sswitch_b
        0x56ab7e18 -> :sswitch_d
        0x5ab095bc -> :sswitch_d
        0x5d42004e -> :sswitch_2
        0x6f7af769 -> :sswitch_7
        0x7997dbc3 -> :sswitch_6
    .end sparse-switch
.end method
