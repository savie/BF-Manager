.class public final synthetic Ll/ܺ۠᩻;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/۠ۖۧ;

.field public final synthetic ᩶:Ll/֨۠᩻;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۖۧ;Ll/֨۠᩻;)V
    .locals 6

    const v0, 0x15eb603f

    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ce7

    const v5, 0x1e58c104

    xor-int/2addr v4, v5

    const v5, 0x1c96937

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x98d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v3, :cond_4

    goto/16 :goto_2

    .line 3
    :sswitch_0
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v3, :cond_6

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_a

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ܺ۠᩻;->᩶:Ll/֨۠᩻;

    return-void

    :sswitch_5
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4035

    const v5, 0x78bafbea

    xor-int/2addr v4, v5

    const v5, -0x109fee10

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b4d

    const v5, 0x61f26667

    xor-int/2addr v4, v5

    const v5, 0x8156ab3

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v3

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a7a\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x479b

    const v5, -0x21ea3615

    xor-int/2addr v4, v5

    const v5, 0x60714df

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u05a8\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x386f

    const v5, 0x27efc19

    xor-int/2addr v4, v5

    const v5, -0x7881182f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06d8\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d31

    const v5, -0x28fa5db5

    xor-int/2addr v4, v5

    const v5, 0x3cf3c299

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e4\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7ec5

    const v5, 0x6bed80a5

    xor-int/2addr v4, v5

    const v5, 0x352548e6

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_7

    :cond_6
    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67dd

    const v5, -0xcebf777

    xor-int/2addr v4, v5

    const v5, 0x58dbcf44

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06dc\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x68a1

    const v5, -0x265038b2

    xor-int/2addr v4, v5

    const v5, -0x7479c8f8

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2fc9

    const v5, 0xb4f78da

    xor-int/2addr v4, v5

    const v5, -0x74b0f54f

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u06e1\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e1d

    const v5, -0x126712e4

    xor-int/2addr v4, v5

    const v5, -0x6786c169

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x653

    const v5, 0x469ade4d

    xor-int/2addr v4, v5

    const v5, 0x477b5fc6

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a75\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1267

    const v5, 0x617e0797

    xor-int/2addr v4, v5

    const v5, 0x2fde185

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6169

    const v5, -0x672e2fb4

    xor-int/2addr v4, v5

    const v5, 0x3bbbea70

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܺ۠᩻;->ܰ:Ll/۠ۖۧ;

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ee1

    const v5, -0x64136722

    xor-int/2addr v4, v5

    const v5, -0x38d0fdd3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7893

    const v5, 0x5f457174

    xor-int/2addr v4, v5

    const v5, -0x678fe47d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e629ee6 -> :sswitch_e
        -0x7c6d510e -> :sswitch_8
        -0x777313aa -> :sswitch_8
        -0x75bbdb41 -> :sswitch_2
        -0x6c221bec -> :sswitch_7
        -0x6b4bff53 -> :sswitch_b
        -0x6a7bb986 -> :sswitch_b
        -0x671190f3 -> :sswitch_c
        -0x6001d3eb -> :sswitch_6
        -0x5d4bbac9 -> :sswitch_4
        -0x5c779ffb -> :sswitch_2
        -0x56a20a6c -> :sswitch_0
        -0x53c15b6b -> :sswitch_5
        -0x34bccb58 -> :sswitch_4
        -0x17e728b7 -> :sswitch_1
        0x62e42b6 -> :sswitch_3
        0x15201db2 -> :sswitch_3
        0x357c4327 -> :sswitch_9
        0x3ccb6fcc -> :sswitch_a
        0x3dfb0c5e -> :sswitch_a
        0x563953d4 -> :sswitch_1
        0x62219344 -> :sswitch_d
        0x62e11ca4 -> :sswitch_6
        0x652c879e -> :sswitch_e
        0x6628d481 -> :sswitch_d
        0x66aaa94f -> :sswitch_7
        0x6c0b0d26 -> :sswitch_c
        0x6cf0be16 -> :sswitch_5
        0x7296d8af -> :sswitch_9
        0x758412f6 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x57cfb960

    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v7, "\u06db\u06d8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2395

    const v9, 0x56e4a3c7

    xor-int/2addr v8, v9

    const v9, -0x3dfcdbb3

    :goto_0
    xor-int/2addr v7, v9

    move-object v9, v3

    :goto_1
    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x5f25

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 574
    iget-object v0, p0, Ll/ܺ۠᩻;->ܰ:Ll/۠ۖۧ;

    sget-boolean v7, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v7, :cond_8

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_7

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v7, :cond_2

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    const/4 v0, 0x0

    return-object v0

    .line 577
    :sswitch_5
    new-instance v7, Ll/֡۠᩻;

    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v8, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-direct {v7, v9}, Ll/֡۠᩻;-><init>(Ll/ܶ۠᩻;)V

    invoke-static {v1, v2, v7}, Ll/ۖ֨;->ܽ۫֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 584
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0

    .line 576
    :sswitch_6
    invoke-virtual {v1, v2}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;)V

    .line 577
    new-instance v9, Ll/ܶ۠᩻;

    .line 368
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_5

    .line 577
    :cond_1
    invoke-direct {v9, v2}, Ll/ܶ۠᩻;-><init>(Ll/֨۠᩻;)V

    sget v7, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v7, :cond_3

    :cond_2
    :goto_2
    const-string v7, "\u0730\u073d"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x686f

    const v10, -0x7bdee1e7

    xor-int/2addr v8, v10

    const v10, 0x5d29a5bd

    goto/16 :goto_7

    :cond_3
    const-string v7, "\u06e7\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x41e1

    const v10, 0x7ccb1b51

    xor-int/2addr v8, v10

    const v10, -0x53a4c471

    goto/16 :goto_7

    .line 576
    :sswitch_7
    iget-object v2, p0, Ll/ܺ۠᩻;->᩶:Ll/֨۠᩻;

    .line 281
    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_4

    goto :goto_3

    :cond_4
    const-string v7, "\u06e4\u06da"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x67

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3a7f

    const v10, -0x5c0eada

    xor-int/2addr v8, v10

    const v10, 0x6d95306e

    goto/16 :goto_7

    :sswitch_8
    const/4 v7, 0x0

    .line 575
    invoke-virtual {v1, v7}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    sget v7, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v7, :cond_5

    :goto_3
    const-string v7, "\u0736\u06e0"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6405

    const v10, -0x6d8dd7e1

    xor-int/2addr v8, v10

    const v10, -0x6fcc2fc3

    goto/16 :goto_7

    :cond_5
    const-string v7, "\u1a75\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x53

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5b99

    const v10, 0x4771e65

    xor-int/2addr v8, v10

    const v10, -0x1026d79

    goto/16 :goto_7

    .line 574
    :sswitch_9
    invoke-static {v0}, Ll/ۧ;->ۧᩴܺ(Ljava/lang/Object;)V

    .line 575
    sget-object v1, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    .line 266
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_6

    goto :goto_4

    :cond_6
    const-string v7, "\u06da\u1a75"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x702d

    const v10, -0x3700eff6

    xor-int/2addr v8, v10

    const v10, -0x151e85d9

    goto/16 :goto_7

    :cond_7
    :goto_4
    const-string v7, "\u073d\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x73

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7141

    const v10, 0x479c95ea

    xor-int/2addr v8, v10

    const v10, -0x75e0642d

    goto/16 :goto_7

    :cond_8
    const-string v7, "\u06da\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x413b

    const v10, -0x66b57e3a

    xor-int/2addr v8, v10

    const v10, 0x42564c31

    goto/16 :goto_7

    :sswitch_a
    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v7, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "\u06e0\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x23

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x17bb

    const v10, -0x6c2e147

    xor-int/2addr v8, v10

    const v10, 0xd22e2dd

    goto :goto_7

    .line 547
    :sswitch_b
    sget v7, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_5
    const-string v7, "\u06e7\u1a79"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4d73

    const v9, -0x2e0d4d43

    xor-int/2addr v8, v9

    const v9, -0x15619d23

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06df\u1a78"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6de3

    const v10, -0x4706a8f0

    xor-int/2addr v8, v10

    const v10, 0x30b1512f

    goto :goto_7

    .line 2
    :sswitch_c
    sget v7, Ll/֨۠᩻;->ۧ᩷:I

    .line 529
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v7

    if-eqz v7, :cond_c

    :goto_6
    const-string v7, "\u06e7\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6ebf

    const v10, -0x71ae7a16

    xor-int/2addr v8, v10

    const v10, -0x44159834

    goto :goto_7

    :cond_c
    const-string v7, "\u1a78\u06df"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x7f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5cdd

    const v10, -0x33c31b42    # -4.9517304E7f

    xor-int/2addr v8, v10

    const v10, -0x31f24467

    :goto_7
    xor-int/2addr v7, v10

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x78bd8eb1 -> :sswitch_0
        -0x6e32b9e0 -> :sswitch_1
        -0x6703fa86 -> :sswitch_b
        -0x6694e316 -> :sswitch_2
        -0x44d55e5c -> :sswitch_5
        -0x1ff13338 -> :sswitch_0
        -0x112764c3 -> :sswitch_9
        -0x101639b0 -> :sswitch_6
        -0xff86f24 -> :sswitch_4
        -0xd35d156 -> :sswitch_7
        -0xaf6f785 -> :sswitch_8
        -0x26f2c1c -> :sswitch_8
        -0x2102a49 -> :sswitch_2
        0xe33d400 -> :sswitch_3
        0x12dcd0ce -> :sswitch_4
        0x16fc32ca -> :sswitch_5
        0x1eaf9e2e -> :sswitch_6
        0x2277c0d8 -> :sswitch_c
        0x27c0f94e -> :sswitch_a
        0x45423c9f -> :sswitch_1
        0x4a5804a8 -> :sswitch_3
        0x4d111f95 -> :sswitch_b
        0x5527d07b -> :sswitch_9
        0x5de121ff -> :sswitch_a
        0x608adc5a -> :sswitch_c
        0x60d2e04d -> :sswitch_7
    .end sparse-switch
.end method
