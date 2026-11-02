.class public final Ll/֨ۢۨ;
.super Ljava/lang/Object;
.source "79RC"


# instance fields
.field public ۖ:Z

.field public final ۙ:Ll/ܶۜᩴ;

.field public ۨ:Ljava/lang/String;

.field public final ܰ:I


# direct methods
.method public constructor <init>(I)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2f969abd

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7477

    const v6, -0x2a05a988

    xor-int/2addr v5, v6

    const v6, -0x6de58e28

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x65eb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 v0, 0x0

    .line 214
    iput-boolean v0, p0, Ll/֨ۢۨ;->ۖ:Z

    .line 218
    iput p1, p0, Ll/֨ۢۨ;->ܰ:I

    return-void

    :sswitch_0
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v4, :cond_8

    goto/16 :goto_4

    .line 163
    :sswitch_1
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v4, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06ec\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6bf9

    const v6, 0x5f018fb7

    xor-int/2addr v5, v6

    const v6, -0x3db1fa32

    goto :goto_0

    .line 140
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 213
    :sswitch_5
    iput-object v0, p0, Ll/֨ۢۨ;->ۙ:Ll/ܶۜᩴ;

    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0736\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5c7

    const v6, -0x5b32dcb8

    xor-int/2addr v5, v6

    const v6, 0x31db197a

    goto :goto_0

    :sswitch_6
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6a61

    const v6, -0x41fc1447

    xor-int/2addr v5, v6

    const v6, -0x490de5e0

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5205

    const v6, -0xd4c3f47

    xor-int/2addr v5, v6

    const v6, 0x1c2b6e77

    goto/16 :goto_0

    .line 40
    :sswitch_8
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u06e8\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7741

    const v6, 0x610af440

    xor-int/2addr v5, v6

    const v6, 0x1a2918d1

    goto/16 :goto_0

    .line 32
    :sswitch_9
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_5

    :goto_1
    const-string v4, "\u06df\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5747

    const v6, 0x9aeca24

    xor-int/2addr v5, v6

    const v6, 0x63a1b6d2

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d7\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x40e7

    const v6, 0x119a3168

    xor-int/2addr v5, v6

    const v6, 0x2a71a60c

    goto/16 :goto_0

    .line 155
    :sswitch_a
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06d7\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xfab

    const v6, -0x3aa96d02

    xor-int/2addr v5, v6

    const v6, 0x4850bfdb

    goto/16 :goto_0

    .line 10
    :sswitch_b
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06e0\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4e69

    const v6, 0x31df4013

    xor-int/2addr v5, v6

    const v6, -0x5deb33d9

    goto/16 :goto_0

    .line 157
    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1835

    const v6, -0x5f5e411

    xor-int/2addr v5, v6

    const v6, 0x3c927f1b

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xd31

    const v6, -0xaf12f62

    xor-int/2addr v5, v6

    const v6, 0x1c209e9c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v4

    if-nez v4, :cond_a

    :goto_3
    const-string v4, "\u1a75\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2063

    const v6, -0x3f289c2a

    xor-int/2addr v5, v6

    const v6, 0x45b5c193

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6fdb

    const v6, -0x3c84e7dc

    xor-int/2addr v5, v6

    const v6, -0x6ac08813

    goto/16 :goto_0

    .line 213
    :sswitch_e
    new-instance v0, Ll/ܶۜᩴ;

    invoke-direct {v0}, Ll/ܶۜᩴ;-><init>()V

    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x69e7

    const v6, 0x5363aad8

    xor-int/2addr v5, v6

    const v6, 0x56ab9557

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xabb

    const v6, -0x63ba8824

    xor-int/2addr v5, v6

    const v6, 0x162accbf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a9191a7 -> :sswitch_1
        -0x7a173ddd -> :sswitch_a
        -0x79e6a556 -> :sswitch_2
        -0x776f86b8 -> :sswitch_4
        -0x6af8f1b5 -> :sswitch_0
        -0x644fe865 -> :sswitch_8
        -0x3ad8084c -> :sswitch_d
        -0x3967fd7d -> :sswitch_d
        -0x35c3e61c -> :sswitch_3
        -0x3567cf1a -> :sswitch_7
        -0x336daecf -> :sswitch_b
        -0x33285acc -> :sswitch_9
        -0x2a9a2ee5 -> :sswitch_8
        -0x285c4857 -> :sswitch_1
        -0x1a0ba93e -> :sswitch_6
        0x12ff2ccb -> :sswitch_3
        0x18848c95 -> :sswitch_9
        0x1c226c42 -> :sswitch_2
        0x1cd17cbc -> :sswitch_7
        0x29dbeb6a -> :sswitch_5
        0x2a5c8ca2 -> :sswitch_0
        0x2ff59daf -> :sswitch_b
        0x37226dd6 -> :sswitch_c
        0x42ab5e56 -> :sswitch_e
        0x548ad86b -> :sswitch_e
        0x571633b1 -> :sswitch_5
        0x57967585 -> :sswitch_a
        0x5bee8419 -> :sswitch_6
        0x6a7b1b01 -> :sswitch_4
        0x7e0ed12a -> :sswitch_c
    .end sparse-switch
.end method
