.class public final synthetic Ll/ۜۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۜ۟᩺;


# instance fields
.field public final synthetic ֡:Ll/᩻ۡ᩺;

.field public final synthetic ܺ:Ll/ܿܿۚ;

.field public final synthetic ܽ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:Ll/᩵ۡۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿܿۚ;Ll/᩵ۡۜ;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 6

    const v0, 0xd26e794

    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4879

    const v5, 0x32a4720d

    xor-int/2addr v4, v5

    const v5, -0x63df37af

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x33a7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_9

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-gez v3, :cond_4

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u06db\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e65

    const v5, 0x67ead1d4

    xor-int/2addr v4, v5

    const v5, -0x4703fb7f

    goto :goto_0

    :sswitch_2
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۜۡ᩺;->֡:Ll/᩻ۡ᩺;

    iput-object p4, p0, Ll/ۜۡ᩺;->ܽ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void

    .line 1
    :sswitch_6
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u073f\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x8e9

    const v5, 0x7850fb28

    xor-int/2addr v4, v5

    const v5, -0x1558b143

    goto :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x510b

    const v5, 0x381e7c7c

    xor-int/2addr v4, v5

    const v5, 0x4f03562b    # 2.2034624E9f

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d6\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x215b

    const v5, 0x23b4c87c

    xor-int/2addr v4, v5

    const v5, -0x74c76a3d

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_5

    :cond_4
    const-string v3, "\u06db\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa15

    const v5, -0x5c9388e3

    xor-int/2addr v4, v5

    const v5, 0x42480d92

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1423

    const v5, -0x357fe165    # -4198221.5f

    xor-int/2addr v4, v5

    const v5, 0x5f0f8f7f

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4df7

    const v5, -0x54811ec7

    xor-int/2addr v4, v5

    const v5, -0x331082e7

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a73\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xd0d

    const v5, 0x702173b5

    xor-int/2addr v4, v5

    const v5, 0x5bf6fccd

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f5f

    const v5, -0x1e464504

    xor-int/2addr v4, v5

    const v5, 0x3928e1f1

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c9b

    const v5, -0x6f8a8964

    xor-int/2addr v4, v5

    const v5, 0x3548f627

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e1\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2013

    const v5, -0x544cad60

    xor-int/2addr v4, v5

    const v5, 0x76ad217d

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27df

    const v5, -0xa6a39e4

    xor-int/2addr v4, v5

    const v5, 0x51d1684d

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x240f

    const v5, 0x3b73d325

    xor-int/2addr v4, v5

    const v5, -0x39661734

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۜۡ᩺;->ܺ:Ll/ܿܿۚ;

    iput-object p2, p0, Ll/ۜۡ᩺;->᩶:Ll/᩵ۡۜ;

    .line 1
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56a3

    const v5, -0x12317fce

    xor-int/2addr v4, v5

    const v5, -0x5851c2ed

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6243

    const v5, -0x7e1231be

    xor-int/2addr v4, v5

    const v5, 0x1c49ae52

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x680a58ad -> :sswitch_e
        -0x60a2a2e8 -> :sswitch_7
        -0x5f89d2c3 -> :sswitch_0
        -0x5c1e9b01 -> :sswitch_5
        -0x4e8ebd8e -> :sswitch_b
        -0x43ccfa0b -> :sswitch_e
        -0x3a96cd10 -> :sswitch_1
        -0x3a0ac859 -> :sswitch_a
        -0x38a23648 -> :sswitch_0
        -0x2efcbf57 -> :sswitch_6
        -0x2925446a -> :sswitch_c
        -0x25f04449 -> :sswitch_a
        -0x1d3aca8c -> :sswitch_3
        -0x15959bd1 -> :sswitch_8
        -0x1117d2d1 -> :sswitch_3
        -0xfec8054 -> :sswitch_4
        -0x210416e -> :sswitch_5
        0xb0e2efd -> :sswitch_1
        0xcbf150a -> :sswitch_9
        0x1538bdee -> :sswitch_7
        0x1e5b7654 -> :sswitch_2
        0x220f21d8 -> :sswitch_d
        0x3378e102 -> :sswitch_4
        0x38aa6e10 -> :sswitch_c
        0x3aee3281 -> :sswitch_2
        0x4246f66e -> :sswitch_6
        0x4d21be45 -> :sswitch_d
        0x61329cb5 -> :sswitch_8
        0x65c30b3f -> :sswitch_9
        0x706d1740 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/֨ᩴ᩺;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x3cdafad2

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v5, "\u1a74\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1fdd

    const v7, -0x4407bcf9

    xor-int/2addr v6, v7

    const v7, 0x67cef5b5

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0xa6f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u06e1\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x33b3

    const v7, 0x190ecdc8

    xor-int/2addr v6, v7

    const v7, -0x16ded4da

    goto :goto_0

    .line 1
    :sswitch_2
    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v5, :cond_8

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/ۜۡ᩺;->ܺ:Ll/ܿܿۚ;

    iget-object v3, p0, Ll/ۜۡ᩺;->᩶:Ll/᩵ۡۜ;

    invoke-static {v2, v3, p1, v0, v1}, Ll/᩻ۡ᩺;->ۙ(Ll/ܿܿۚ;Ll/᩵ۡۜ;Ll/֨ᩴ᩺;Ll/᩻ۡ᩺;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ۜۡ᩺;->ܽ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u1a73\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4cbb

    const v7, 0x74a8ff00    # 1.07114E32f

    xor-int/2addr v6, v7

    const v7, 0x542dbe1f

    goto :goto_0

    :cond_1
    const-string v5, "\u0733\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x597b

    const v7, 0x3a0de544

    xor-int/2addr v6, v7

    const v7, -0x6e065c80

    goto/16 :goto_0

    .line 0
    :sswitch_7
    iget-object v0, p0, Ll/ۜۡ᩺;->֡:Ll/᩻ۡ᩺;

    .line 1
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06e7\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x417d

    const v7, -0x59200af6

    xor-int/2addr v6, v7

    const v7, -0xe9ee3eb

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u1a76\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x210f

    const v7, -0x25d3401f

    xor-int/2addr v6, v7

    const v7, 0xfc2451b

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u06d8\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x28c1

    const v7, 0x6945657a

    xor-int/2addr v6, v7

    const v7, -0x716467e2

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u0733\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x53c9

    const v7, -0x2b59159e

    xor-int/2addr v6, v7

    const v7, 0x79082266

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e4\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x659b

    const v7, -0x77d29b7d

    xor-int/2addr v6, v7

    const v7, 0x5c24e1bf

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u05a1\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x353

    const v7, 0x1c7cbdca

    xor-int/2addr v6, v7

    const v7, 0x2f4a469b

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u06d7\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4d7f

    const v7, -0x9640d82

    xor-int/2addr v6, v7

    const v7, -0x6cd81922

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06df\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1619

    const v7, -0x2a33eb6b

    xor-int/2addr v6, v7

    const v7, 0x671cb02f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v5

    if-ltz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06da\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x594d

    const v7, -0x336c9c8b    # -7.7274024E7f

    xor-int/2addr v6, v7

    const v7, -0x6e7525fa

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a7a\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1127

    const v7, 0x36960ff

    xor-int/2addr v6, v7

    const v7, -0x1fe6947c

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget-boolean v5, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v5, :cond_c

    :goto_4
    const-string v5, "\u0736\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1dd3

    const v7, -0x7afef2ce

    xor-int/2addr v6, v7

    const v7, -0x67a331d9

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x62ed

    const v7, -0x368df497

    xor-int/2addr v6, v7

    const v7, -0x4a353383

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x788cde64 -> :sswitch_3
        -0x74cc07dc -> :sswitch_4
        -0x612ac362 -> :sswitch_8
        -0x6120ddfc -> :sswitch_d
        -0x5a71891d -> :sswitch_8
        -0x562f5274 -> :sswitch_7
        -0x47cdf63a -> :sswitch_3
        -0x429d4796 -> :sswitch_d
        -0x2cd8ce28 -> :sswitch_b
        -0x2828c9ca -> :sswitch_6
        -0x1df1c343 -> :sswitch_6
        -0x182211fd -> :sswitch_9
        -0x124c4166 -> :sswitch_1
        -0x10b8c69d -> :sswitch_5
        -0x88df620 -> :sswitch_2
        0xa8b2bb5 -> :sswitch_c
        0x22992936 -> :sswitch_a
        0x2721c497 -> :sswitch_2
        0x3480a5d4 -> :sswitch_a
        0x34fcb15b -> :sswitch_7
        0x4cd8fb0a -> :sswitch_e
        0x5137e54c -> :sswitch_4
        0x531cf39a -> :sswitch_5
        0x64ee469b -> :sswitch_0
        0x6f229548 -> :sswitch_b
        0x7397355e -> :sswitch_c
        0x74054d22 -> :sswitch_e
        0x760b4439 -> :sswitch_9
        0x7f19f467 -> :sswitch_1
        0x7f3bb13b -> :sswitch_0
    .end sparse-switch
.end method
