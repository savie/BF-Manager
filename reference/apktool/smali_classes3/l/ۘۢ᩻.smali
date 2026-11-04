.class public final synthetic Ll/ۘۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ۗ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/᩶ۢ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۢ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۢ᩻;->ܰ:Ll/᩶ۢ᩻;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, -0x5c5d9331

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6a6d

    const v5, -0x73af37c8

    xor-int/2addr v4, v5

    const v5, 0x12b3da31

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x6219

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_4

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6a31

    const v5, -0x494db820

    xor-int/2addr v4, v5

    const v5, -0x21d2551e

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v3, :cond_8

    goto/16 :goto_1

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_a

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ۘۢ᩻;->ܰ:Ll/᩶ۢ᩻;

    invoke-static {p1}, Ll/᩶ۢ᩻;->ۙ(Ll/᩶ۢ᩻;)Ll/ۧ۟᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    .line 1
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d9\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d89

    const v5, 0x57975adf

    xor-int/2addr v4, v5

    const v5, -0x1df86eb5

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x51d3

    const v5, 0x505f5778

    xor-int/2addr v4, v5

    const v5, -0x7ccda3ae

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a7b\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6753

    const v5, 0x32f44d22

    xor-int/2addr v4, v5

    const v5, 0x7c8730a3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1de7

    const v5, 0x80a369b

    xor-int/2addr v4, v5

    const v5, -0x564ef72f

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5151

    const v5, 0x63ccb705

    xor-int/2addr v4, v5

    const v5, -0x432c0e5c

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "\u1a78\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xa3

    const v5, 0x1c774d6e

    xor-int/2addr v4, v5

    const v5, 0x3e6c1bd2

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_7

    :goto_1
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ac5

    const v5, -0x14e71113

    xor-int/2addr v4, v5

    const v5, -0x4a387bf6

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a76\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6263

    const v5, 0x5e6df953

    xor-int/2addr v4, v5

    const v5, -0x1721f352

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06e7\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x431b

    const v5, 0x711adcf9

    xor-int/2addr v4, v5

    const v5, 0x790ecf95

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e2\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x486f

    const v5, 0x6dc05b5c

    xor-int/2addr v4, v5

    const v5, 0x40b82532

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1355

    const v5, -0x117f3706

    xor-int/2addr v4, v5

    const v5, 0x25e60b6b

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2c89

    const v5, 0x72611a8f

    xor-int/2addr v4, v5

    const v5, 0x67350cee

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xfd9

    const v5, 0x75528b0a

    xor-int/2addr v4, v5

    const v5, -0x47dfce14

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x759b

    const v5, 0x10c7d618

    xor-int/2addr v4, v5

    const v5, 0x79647d86

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f13a95f -> :sswitch_4
        -0x7b0c2851 -> :sswitch_0
        -0x766d9fb2 -> :sswitch_5
        -0x727816e1 -> :sswitch_e
        -0x723ca14c -> :sswitch_8
        -0x6ed2e22c -> :sswitch_d
        -0x6b2a6f62 -> :sswitch_6
        -0x6a5b3aa4 -> :sswitch_b
        -0x6699f2c6 -> :sswitch_5
        -0x51f322b9 -> :sswitch_3
        -0x462e2ae5 -> :sswitch_6
        -0x41089fd9 -> :sswitch_7
        -0x32537313 -> :sswitch_3
        -0x2dc19936 -> :sswitch_a
        -0x28a0dfa0 -> :sswitch_d
        -0x25d33a46 -> :sswitch_1
        -0x22130a10 -> :sswitch_8
        -0x17af3fd8 -> :sswitch_0
        -0x506a399 -> :sswitch_e
        -0x2185688 -> :sswitch_b
        0x48c731b -> :sswitch_9
        0x8483163 -> :sswitch_a
        0x16c795b3 -> :sswitch_4
        0x36672cb3 -> :sswitch_1
        0x3ad97cd8 -> :sswitch_9
        0x3ded5351 -> :sswitch_c
        0x43ed6c73 -> :sswitch_2
        0x5d1ea4c5 -> :sswitch_7
        0x5dd565ad -> :sswitch_c
        0x731744ca -> :sswitch_2
    .end sparse-switch
.end method
