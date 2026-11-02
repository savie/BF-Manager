.class public final synthetic Ll/ᩳۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ܶ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/᩻ۡ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۡ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۡ᩺;->ܺ:Ll/᩻ۡ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x26cde043

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v4, "\u06e2\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x389

    const v6, -0x5991a6d8

    xor-int/2addr v5, v6

    const v6, -0x44ec7e03

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x7313

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    check-cast p1, Ll/ۡᩴ᩺;

    invoke-static {v0, p1}, Ll/᩻ۡ᩺;->ۙ(Ll/᩻ۡ᩺;Ll/ۡᩴ᩺;)Ll/۟۟۠;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :sswitch_1
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_2
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_9

    goto/16 :goto_3

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ᩳۡ᩺;->ܺ:Ll/᩻ۡ᩺;

    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06eb\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c23

    const v6, -0x15567c09

    xor-int/2addr v5, v6

    const v6, 0x5327dec7

    goto :goto_0

    .line 1
    :sswitch_6
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x16b7

    const v6, 0xb5001b3

    xor-int/2addr v5, v6

    const v6, 0x23b016b5

    goto :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6275

    const v6, -0x4d355a65

    xor-int/2addr v5, v6

    const v6, -0x35000ba6    # -8387117.0f

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_4

    :cond_3
    :goto_1
    const-string v4, "\u06e4\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x555b

    const v6, 0x119d4094

    xor-int/2addr v5, v6

    const v6, -0xeb03441

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x575f

    const v6, -0x5dc7cf9a

    xor-int/2addr v5, v6

    const v6, -0x78bf7140

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_5

    :goto_2
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x65cf

    const v6, -0x2503f4bd

    xor-int/2addr v5, v6

    const v6, 0x5575b1cb

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06df\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x157

    const v6, -0xdaf3403

    xor-int/2addr v5, v6

    const v6, 0x51c41507

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u05a1\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x37eb

    const v6, -0x5e0b73c6

    xor-int/2addr v5, v6

    const v6, 0x34c3b1d2

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06e8\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x65ab

    const v6, -0x696a47cc

    xor-int/2addr v5, v6

    const v6, -0x605810dd

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_8

    :goto_3
    const-string v4, "\u073a\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc73

    const v6, 0x3857c794

    xor-int/2addr v5, v6

    const v6, -0x49db39ec

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u073f\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4895

    const v6, -0x7e99e4b4

    xor-int/2addr v5, v6

    const v6, 0x5ce632e3

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u06e0\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c6f

    const v6, -0x368bdb1c    # -1000014.25f

    xor-int/2addr v5, v6

    const v6, 0x59d8e88

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073a\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x47f9

    const v6, -0x5a08dd4c

    xor-int/2addr v5, v6

    const v6, -0x761f5a1a

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d7\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb91

    const v6, 0x7a8e5bd1

    xor-int/2addr v5, v6

    const v6, 0x3dfee9f9

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1307

    const v6, -0x5fa38afd

    xor-int/2addr v5, v6

    const v6, 0x53f5cf1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5b465986 -> :sswitch_4
        -0x47296e8f -> :sswitch_6
        -0x457529d6 -> :sswitch_b
        -0x37195b6b -> :sswitch_7
        -0x357504d2 -> :sswitch_e
        -0x28d7eb7e -> :sswitch_9
        -0x2670d08c -> :sswitch_7
        -0x20808ef0 -> :sswitch_9
        -0x1a23e125 -> :sswitch_e
        -0x18243fa9 -> :sswitch_d
        0x4acab65 -> :sswitch_8
        0xbf33d51 -> :sswitch_3
        0xfdec08d -> :sswitch_1
        0x119decb0 -> :sswitch_c
        0x1868f3dd -> :sswitch_0
        0x1a0628e8 -> :sswitch_3
        0x1aa4c86b -> :sswitch_d
        0x21435c79 -> :sswitch_6
        0x22654933 -> :sswitch_2
        0x2bf8d820 -> :sswitch_a
        0x2e656b27 -> :sswitch_c
        0x3799aba0 -> :sswitch_b
        0x3c28557d -> :sswitch_5
        0x47d5d992 -> :sswitch_0
        0x58552275 -> :sswitch_2
        0x59e07181 -> :sswitch_8
        0x687e55c1 -> :sswitch_1
        0x6a1296c3 -> :sswitch_5
        0x6c058df9 -> :sswitch_a
        0x7a6ba5be -> :sswitch_4
    .end sparse-switch
.end method
