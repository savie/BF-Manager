.class public final synthetic Ll/ܺ᩺᩹;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ᩴܶ᩹;


# instance fields
.field public final synthetic ֡:[I

.field public final synthetic ܺ:Ll/ۨۜ᩹;

.field public final synthetic ᩶:[I


# direct methods
.method public synthetic constructor <init>(Ll/ۨۜ᩹;[I[I)V
    .locals 6

    const v0, -0x1e3d704b

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/۟;->ۨᩴۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6cc7

    const v5, -0x77f59a47

    xor-int/2addr v4, v5

    const v5, 0x59a88928

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xc93

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_9

    goto/16 :goto_4

    :sswitch_0
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_b

    goto/16 :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/ܺ᩺᩹;->֡:[I

    return-void

    :sswitch_5
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06ec\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c95

    const v5, -0x61d5cef2

    xor-int/2addr v4, v5

    const v5, -0x7795d89f

    goto :goto_0

    .line 4
    :sswitch_6
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a7b\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4359

    const v5, -0x3116e8b0

    xor-int/2addr v4, v5

    const v5, 0x53a61273

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u0730\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4dd5

    const v5, 0x6a5cdd6c

    xor-int/2addr v4, v5

    const v5, -0x5e3b7d55

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06eb\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e27

    const v5, 0x693e4786

    xor-int/2addr v4, v5

    const v5, 0x68cb6cba

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1cbd

    const v5, -0x4ae36cca

    xor-int/2addr v4, v5

    const v5, 0x1a1f38cc

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_5

    :goto_1
    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5add

    const v5, 0x7beedd2a

    xor-int/2addr v4, v5

    const v5, -0x3943aebf

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x26f7

    const v5, -0x64262a89

    xor-int/2addr v4, v5

    const v5, 0x4e406450    # 8.069499E8f

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a59

    const v5, -0x7129f81f

    xor-int/2addr v4, v5

    const v5, -0x9ae8565

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4edf

    const v5, 0x2f20ecaf

    xor-int/2addr v4, v5

    const v5, 0x1904a89a

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u1a78\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1cd3

    const v5, -0x23fd5fde

    xor-int/2addr v4, v5

    const v5, -0x4714bcce

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b11

    const v5, -0x20bc22fd

    xor-int/2addr v4, v5

    const v5, -0x3d5f76f7

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x37e7

    const v5, -0x2081d08e

    xor-int/2addr v4, v5

    const v5, 0x2a3d3906

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2b01

    const v5, 0x2b6bdaa6

    xor-int/2addr v4, v5

    const v5, 0x66cad1ff

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܺ᩺᩹;->ܺ:Ll/ۨۜ᩹;

    iput-object p2, p0, Ll/ܺ᩺᩹;->᩶:[I

    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e0\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x549b

    const v5, 0x10393cf5

    xor-int/2addr v4, v5

    const v5, -0x463ad252

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4db9

    const v5, 0x6bcc67c9

    xor-int/2addr v4, v5

    const v5, -0x66cd7db

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bdb1488 -> :sswitch_9
        -0x79e8d1d2 -> :sswitch_2
        -0x79857a5e -> :sswitch_3
        -0x762a9d1c -> :sswitch_d
        -0x6c301a35 -> :sswitch_e
        -0x69b2ca33 -> :sswitch_7
        -0x5fe0d7b0 -> :sswitch_6
        -0x5888ac5d -> :sswitch_b
        -0x5351cf06 -> :sswitch_c
        -0x456a46f8 -> :sswitch_1
        -0x41d48b2e -> :sswitch_0
        -0x344d64a6 -> :sswitch_a
        -0x2e7d231e -> :sswitch_6
        -0x1df1dfd5 -> :sswitch_7
        -0x1654f192 -> :sswitch_3
        -0x12d4eab4 -> :sswitch_e
        -0x9b62b87 -> :sswitch_8
        -0x74e0298 -> :sswitch_c
        0x568beda -> :sswitch_4
        0x22f8d323 -> :sswitch_0
        0x23e3938b -> :sswitch_5
        0x245aadd3 -> :sswitch_d
        0x42d4fb45 -> :sswitch_2
        0x4a3cbdeb -> :sswitch_b
        0x4ae030ee -> :sswitch_9
        0x589d882a -> :sswitch_4
        0x5f1b4490 -> :sswitch_1
        0x694129eb -> :sswitch_a
        0x6a595914 -> :sswitch_8
        0x7d7dc764 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final ܰ(Ll/᩷۠ۚ;)V
    .locals 8

    const v0, 0x6f62e154

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v3, "\u06e1\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42d9

    const v5, -0x18c6356c

    xor-int/2addr v4, v5

    const v5, 0x5c5898dd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3171

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 979
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    .line 442
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-lez v3, :cond_7

    goto :goto_1

    .line 1339
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x72cf

    const v5, -0x162ecb21

    xor-int/2addr v4, v5

    const v5, 0x51905089

    goto :goto_0

    .line 201
    :sswitch_2
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_a

    goto/16 :goto_5

    .line 608
    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto/16 :goto_5

    .line 1317
    :sswitch_4
    new-instance v3, Ll/ܳ᩺᩹;

    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v4, p0, Ll/ܺ᩺᩹;->ܺ:Ll/ۨۜ᩹;

    .line 1015
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_2

    goto/16 :goto_3

    .line 1317
    :cond_2
    iget-object v5, p0, Ll/ܺ᩺᩹;->᩶:[I

    iget-object v6, p0, Ll/ܺ᩺᩹;->֡:[I

    sget v7, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v7, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-direct {v3, p1, v4, v5, v6}, Ll/ܳ᩺᩹;-><init>(Ll/᩷۠ۚ;Ll/ۨۜ᩹;[I[I)V

    .line 1380
    invoke-static {v3}, Ll/ۖۛ;->ܺۙܽ(Ljava/lang/Object;)V

    return-void

    :sswitch_5
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c05

    const v5, 0x7cb85465

    xor-int/2addr v4, v5

    const v5, -0x32a00c94

    goto/16 :goto_0

    .line 467
    :sswitch_6
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5dad

    const v5, -0xab9d74e

    xor-int/2addr v4, v5

    const v5, 0x3d255795

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u06d9\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2057

    const v5, 0x17a57210

    xor-int/2addr v4, v5

    const v5, -0x5f3eb70a

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06dc\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f1

    const v5, 0x324bc54e

    xor-int/2addr v4, v5

    const v5, -0x1a5e8365

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06ec\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6159

    const v5, -0x1666324c

    xor-int/2addr v4, v5

    const v5, -0x10310677

    goto/16 :goto_0

    .line 655
    :sswitch_9
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_9

    :goto_3
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x11d

    const v5, 0x7916640

    xor-int/2addr v4, v5

    const v5, -0x7a3183f4

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d6\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x26b9

    const v5, 0x4ee2d795    # 1.9028896E9f

    xor-int/2addr v4, v5

    const v5, 0x1ca040cc

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x45e1

    const v5, -0x41441b91

    xor-int/2addr v4, v5

    const v5, -0x2abb5c73

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3331

    const v5, -0x275f26a3

    xor-int/2addr v4, v5

    const v5, 0x224f0757

    goto/16 :goto_0

    .line 1132
    :sswitch_b
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u1a77\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bfb

    const v5, 0x39a1b002

    xor-int/2addr v4, v5

    const v5, 0x62767a79

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x69c5

    const v5, 0x3e86705f

    xor-int/2addr v4, v5

    const v5, -0xd9f3e1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5f442b4e -> :sswitch_5
        -0x538dd9d8 -> :sswitch_0
        -0x49705854 -> :sswitch_7
        -0x37cf645f -> :sswitch_3
        -0x2d89b1f6 -> :sswitch_4
        -0x22242510 -> :sswitch_b
        -0x10270409 -> :sswitch_0
        -0xd02371e -> :sswitch_9
        -0x9075d8f -> :sswitch_6
        -0x14b9cef -> :sswitch_2
        -0x52b161 -> :sswitch_a
        0x1d79968 -> :sswitch_8
        0x3fa010d -> :sswitch_7
        0x18808aac -> :sswitch_1
        0x1f08e471 -> :sswitch_9
        0x2a737bff -> :sswitch_2
        0x31933052 -> :sswitch_1
        0x325eb3c8 -> :sswitch_5
        0x331d15ec -> :sswitch_a
        0x412f4791 -> :sswitch_b
        0x51c1faae -> :sswitch_8
        0x5d993d4d -> :sswitch_3
        0x6baf5481 -> :sswitch_6
        0x6ef02292 -> :sswitch_4
    .end sparse-switch
.end method
