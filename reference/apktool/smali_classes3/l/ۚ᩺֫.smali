.class public final Ll/ۚ᩺֫;
.super Ll/֫᩺֫;
.source "K3YT"


# instance fields
.field public final ۙ:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 379
    iput-object p1, p0, Ll/ۚ᩺֫;->ۙ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    const v0, -0x52c80de4

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v3, "\u1a78\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7939

    const v5, 0x57481cbc

    xor-int/2addr v4, v5

    const v5, -0x13f23fc0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3823

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 218
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_6

    goto/16 :goto_1

    .line 180
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :sswitch_1
    sget v3, Ll/᩺;->۫۬۫:I

    if-lez v3, :cond_8

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_3

    .line 354
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    const/4 p1, 0x0

    return-object p1

    .line 384
    :sswitch_4
    new-instance v3, Ljava/io/File;

    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v4, p0, Ll/ۚ᩺֫;->ۙ:Ljava/io/File;

    .line 298
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v5

    if-gtz v5, :cond_1

    goto/16 :goto_4

    .line 384
    :cond_1
    invoke-direct {v3, v4, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 385
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object p1

    .line 159
    :sswitch_5
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x53ab

    const v5, -0x69cea5f1

    xor-int/2addr v4, v5

    const v5, -0x6f8bb11c

    goto :goto_0

    .line 265
    :sswitch_6
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ba1

    const v5, -0x957511a

    xor-int/2addr v4, v5

    const v5, 0x7cf7eff8

    goto :goto_0

    .line 37
    :sswitch_7
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v3

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u1a73\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ac1

    const v5, -0x31b76789

    xor-int/2addr v4, v5

    const v5, 0x2b6cfb85

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6985

    const v5, -0x4ed0a68c

    xor-int/2addr v4, v5

    const v5, 0x45621c3b

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u06dc\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1aeb

    const v5, -0x20b41350

    xor-int/2addr v4, v5

    const v5, 0x664471ad

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x44dd

    const v5, -0x7ad02431

    xor-int/2addr v4, v5

    const v5, -0x195396fd

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06e2\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x511

    const v5, 0x49aadfd0    # 1399802.0f

    xor-int/2addr v4, v5

    const v5, 0x4e7b5739    # 1.05419936E9f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05a8\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x673f

    const v5, -0x2b32393d

    xor-int/2addr v4, v5

    const v5, -0x793ec4a3

    goto/16 :goto_0

    .line 8
    :sswitch_a
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u1a77\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x187f

    const v5, -0x3cbab7f1

    xor-int/2addr v4, v5

    const v5, -0x3de04eeb

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b1d

    const v5, -0xfe6fb13

    xor-int/2addr v4, v5

    const v5, -0x1afd9de

    goto/16 :goto_0

    .line 263
    :sswitch_b
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06e8\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4741

    const v5, -0xdd2f6cb

    xor-int/2addr v4, v5

    const v5, -0x4f709bfa

    goto/16 :goto_0

    .line 189
    :sswitch_c
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x27c1

    const v5, -0x5a868536

    xor-int/2addr v4, v5

    const v5, -0x7509a56b

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63d5

    const v5, -0x58fa5468

    xor-int/2addr v4, v5

    const v5, 0x76355db2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f0599c6 -> :sswitch_5
        -0x6a00bba3 -> :sswitch_b
        -0x59354907 -> :sswitch_a
        -0x58012c74 -> :sswitch_a
        -0x57ed8b7a -> :sswitch_1
        -0x55d914a1 -> :sswitch_0
        -0x32d326a7 -> :sswitch_8
        -0x261ac3d4 -> :sswitch_3
        -0x16de421d -> :sswitch_9
        -0xe22344f -> :sswitch_7
        -0xcab631a -> :sswitch_7
        -0x48043c7 -> :sswitch_c
        0x3bc1dd3 -> :sswitch_0
        0x596a0b5 -> :sswitch_2
        0xd810aca -> :sswitch_4
        0x27656746 -> :sswitch_b
        0x36e40586 -> :sswitch_8
        0x371a1ed6 -> :sswitch_5
        0x3e84375d -> :sswitch_3
        0x431856aa -> :sswitch_1
        0x43d9815e -> :sswitch_c
        0x644813d9 -> :sswitch_6
        0x7529f989 -> :sswitch_4
        0x79e6e2b1 -> :sswitch_2
        0x7b3c394f -> :sswitch_6
        0x7c953ccf -> :sswitch_9
    .end sparse-switch
.end method
