.class public final synthetic Ll/᩷᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:[I

.field public final synthetic ܺ:Ll/ۨۜ᩹;

.field public final synthetic ܽ:[I

.field public final synthetic ᩶:Ll/ۖ۬᩹;


# direct methods
.method public synthetic constructor <init>(Ll/ۨۜ᩹;Ll/ۖ۬᩹;[I[I)V
    .locals 6

    const v0, -0x759a9e77

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e7

    const v5, -0x65cbfa65

    xor-int/2addr v4, v5

    const v5, 0x223636d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x409

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v3, :cond_4

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6119

    const v5, -0x62ea5c12

    xor-int/2addr v4, v5

    const v5, -0x62083ab8

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/᩷᩺᩹;->֡:[I

    iput-object p4, p0, Ll/᩷᩺᩹;->ܽ:[I

    return-void

    :sswitch_6
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2dc1

    const v5, 0x7f6f6afe

    xor-int/2addr v4, v5

    const v5, 0x4b0c6cd5    # 9202901.0f

    goto :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2b85

    const v5, -0x62f9dc82

    xor-int/2addr v4, v5

    const v5, 0x4315c651

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xfc3

    const v5, -0xeaafdb3

    xor-int/2addr v4, v5

    const v5, -0x53b52e89

    goto/16 :goto_0

    .line 3
    :sswitch_9
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u073a\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ed

    const v5, 0xdd2207c

    xor-int/2addr v4, v5

    const v5, -0x7f04bc73

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a73\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7775

    const v5, 0x345a5578

    xor-int/2addr v4, v5

    const v5, 0x72c5f4a8

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c89

    const v5, 0x25daee79

    xor-int/2addr v4, v5

    const v5, 0x3bdf518e

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06d9\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x807

    const v5, -0x1c2707b

    xor-int/2addr v4, v5

    const v5, -0x26bacd00

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v3, "\u1a77\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x25c5

    const v5, 0x666f2f3

    xor-int/2addr v4, v5

    const v5, -0x27a8daf0

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0730\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7a4b

    const v5, 0x72043afb

    xor-int/2addr v4, v5

    const v5, 0x66302073

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5995

    const v5, -0x3c8f932d

    xor-int/2addr v4, v5

    const v5, -0x59b80248

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_b

    :goto_3
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f55

    const v5, 0x4193c39

    xor-int/2addr v4, v5

    const v5, 0x44bce8e3

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1091

    const v5, 0x7ee03620

    xor-int/2addr v4, v5

    const v5, 0x3da2501b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩷᩺᩹;->ܺ:Ll/ۨۜ᩹;

    iput-object p2, p0, Ll/᩷᩺᩹;->᩶:Ll/ۖ۬᩹;

    .line 3
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u1a75\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2dd9

    const v5, -0x4ca6cff5

    xor-int/2addr v4, v5

    const v5, 0x484c8285

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x209

    const v5, -0x5abe3133

    xor-int/2addr v4, v5

    const v5, -0x1dd843db

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f7fe5d0 -> :sswitch_2
        -0x7c7914d6 -> :sswitch_9
        -0x6d2ec993 -> :sswitch_b
        -0x60dba8b3 -> :sswitch_d
        -0x5e5827f8 -> :sswitch_9
        -0x59bb7ea7 -> :sswitch_0
        -0x594916e3 -> :sswitch_4
        -0x59452048 -> :sswitch_6
        -0x4e67ea50 -> :sswitch_a
        -0x444829f9 -> :sswitch_b
        -0x43f0d38e -> :sswitch_5
        -0x4395c933 -> :sswitch_e
        -0x3bcd2124 -> :sswitch_a
        -0x3adc9755 -> :sswitch_3
        -0x2e3dea33 -> :sswitch_5
        -0x1058beac -> :sswitch_1
        -0xc0fa030 -> :sswitch_3
        -0xaf9cb7 -> :sswitch_d
        0xd750dd5 -> :sswitch_c
        0xde3bb0d -> :sswitch_6
        0xe9cd600 -> :sswitch_7
        0x14ace213 -> :sswitch_2
        0x1a36e733 -> :sswitch_1
        0x51aae9b2 -> :sswitch_c
        0x532a332f -> :sswitch_0
        0x55e4edd9 -> :sswitch_7
        0x593161f7 -> :sswitch_8
        0x5d9783d9 -> :sswitch_e
        0x65288917 -> :sswitch_4
        0x6f7f485f -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    const/4 p1, 0x0

    const/4 p2, 0x0

    const v0, 0x7d757226

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v3, "\u06db\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x59f3

    const v5, 0x15994164

    xor-int/2addr v4, v5

    const v5, 0x1f338c92

    :goto_0
    xor-int/2addr v3, v5

    move-object v5, p1

    :goto_1
    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0xb81

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 167
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_5

    .line 971
    :sswitch_0
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v3, :cond_9

    goto/16 :goto_5

    :sswitch_1
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    .line 1146
    :sswitch_2
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    .line 459
    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    return-void

    .line 1317
    :sswitch_5
    iget-object p1, p0, Ll/᩷᩺᩹;->᩶:Ll/ۖ۬᩹;

    invoke-static {p2, p1, v5}, Ll/֨ۖ;->֨֨᩹(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_6
    new-instance v5, Ll/ܺ᩺᩹;

    iget-object p2, p0, Ll/᩷᩺᩹;->ܺ:Ll/ۨۜ᩹;

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_0

    const-string v3, "\u1a77\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x52eb

    const v5, 0x4bc251f0    # 2.546992E7f

    xor-int/2addr v4, v5

    const v5, 0x5b9aa496

    goto :goto_0

    :cond_0
    iget-object v3, p0, Ll/᩷᩺᩹;->֡:[I

    iget-object v4, p0, Ll/᩷᩺᩹;->ܽ:[I

    invoke-direct {v5, p2, v3, v4}, Ll/ܺ᩺᩹;-><init>(Ll/ۨۜ᩹;[I[I)V

    .line 937
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x671d

    const v6, -0x782f330a

    xor-int/2addr v4, v6

    const v6, 0x3eafc803

    goto/16 :goto_6

    :sswitch_7
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2359

    const v6, 0xf5412a7    # 1.0455999E-29f

    xor-int/2addr v4, v6

    const v6, -0x481f51f0

    goto/16 :goto_6

    :sswitch_8
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_2
    const-string v3, "\u05a8\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5909

    const v6, -0x7304a968    # -3.872479E-31f

    xor-int/2addr v4, v6

    const v6, 0x63c14c82

    goto/16 :goto_6

    :cond_4
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x68e1

    const v6, 0x4832716c

    xor-int/2addr v4, v6

    const v6, 0x6a9675e0

    goto/16 :goto_6

    :sswitch_9
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5633

    const v6, -0x3a4edfbc

    xor-int/2addr v4, v6

    const v6, -0x37aef69d

    goto/16 :goto_6

    :sswitch_a
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_6

    :goto_3
    const-string v3, "\u1a79\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x43cd

    const v6, 0x65a53e56

    xor-int/2addr v4, v6

    const v6, 0x4ed37c65

    goto/16 :goto_6

    :cond_6
    const-string v3, "\u06d8\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b6d

    const v6, 0x474b6f8f

    xor-int/2addr v4, v6

    const v6, 0x547e1f4

    goto/16 :goto_6

    .line 1267
    :sswitch_b
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06e7\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x754d

    const v6, -0x58e86ec6

    xor-int/2addr v4, v6

    const v6, 0x1759a5ef

    goto/16 :goto_6

    :sswitch_c
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x753f

    const v6, -0x3b50431b

    xor-int/2addr v4, v6

    const v6, 0x35def52a

    goto :goto_6

    .line 59
    :sswitch_d
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06eb\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6495

    const v6, 0x76a2a0e2

    xor-int/2addr v4, v6

    const v6, 0x24c050bd

    goto :goto_6

    :cond_a
    const-string v3, "\u1a7b\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f3d

    const v6, 0x1f4a47fd

    xor-int/2addr v4, v6

    const v6, 0x70b60463    # 4.506526E29f

    goto :goto_6

    :cond_b
    :goto_5
    const-string v3, "\u0733\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1069

    const v6, 0xc843705

    xor-int/2addr v4, v6

    const v6, 0x6c04bedf

    goto :goto_6

    :cond_c
    const-string v3, "\u1a73\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7913

    const v6, -0x2a44dcb2

    xor-int/2addr v4, v6

    const v6, -0x2f40b0a5

    :goto_6
    xor-int/2addr v3, v6

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7f5108eb -> :sswitch_c
        -0x79eea85c -> :sswitch_9
        -0x5ef5dcf5 -> :sswitch_7
        -0x5e7df631 -> :sswitch_1
        -0x5a41b66e -> :sswitch_5
        -0x53522dbf -> :sswitch_a
        -0x51e8e003 -> :sswitch_8
        -0x50067c53 -> :sswitch_c
        -0x4cac48e2 -> :sswitch_4
        -0x46e2f4ec -> :sswitch_1
        -0x407bf94c -> :sswitch_7
        -0x32348a4e -> :sswitch_d
        -0x320d6a87 -> :sswitch_d
        -0x168d2d01 -> :sswitch_6
        -0x11579f7b -> :sswitch_b
        -0x99cc41c -> :sswitch_5
        -0x1bf2b81 -> :sswitch_6
        0x129bd9e9 -> :sswitch_8
        0x25d03666 -> :sswitch_3
        0x2926e9e7 -> :sswitch_4
        0x2e4925ad -> :sswitch_2
        0x3c91782e -> :sswitch_2
        0x46eee915 -> :sswitch_0
        0x5e4a5f58 -> :sswitch_b
        0x64974958 -> :sswitch_3
        0x716172be -> :sswitch_9
        0x72166014 -> :sswitch_0
        0x7627cd7a -> :sswitch_a
    .end sparse-switch
.end method
