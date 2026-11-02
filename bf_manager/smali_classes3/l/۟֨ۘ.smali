.class public final Ll/۟֨ۘ;
.super Ll/᩷֨ۘ;
.source "K3YT"


# instance fields
.field public final ۙ:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 379
    iput-object p1, p0, Ll/۟֨ۘ;->ۙ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    const v0, 0x19471464

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e55

    const v5, 0x7fa31c44

    xor-int/2addr v4, v5

    const v5, 0x3325863f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7333

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 221
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_2

    .line 168
    :sswitch_0
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_9

    goto/16 :goto_4

    .line 134
    :sswitch_1
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v3, :cond_7

    goto :goto_1

    .line 48
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ff

    const v5, -0x676b62c1

    xor-int/2addr v4, v5

    const v5, -0x7df3b70d

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    const/4 p1, 0x0

    return-object p1

    .line 384
    :sswitch_5
    new-instance v3, Ljava/io/File;

    .line 344
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_1

    goto/16 :goto_4

    .line 384
    :cond_1
    iget-object v4, p0, Ll/۟֨ۘ;->ۙ:Ljava/io/File;

    .line 278
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_5

    .line 384
    :cond_2
    invoke-direct {v3, v4, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 385
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object p1

    .line 49
    :sswitch_6
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073d\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5967

    const v5, 0x26dd74cd

    xor-int/2addr v4, v5

    const v5, 0x60a7618e

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d5b

    const v5, 0x1073e8e1

    xor-int/2addr v4, v5

    const v5, -0xf84d90a

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x676b

    const v5, 0x414d99ba

    xor-int/2addr v4, v5

    const v5, 0x68efe96e

    goto/16 :goto_0

    .line 333
    :sswitch_8
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x34d1

    const v5, 0x41aa9137

    xor-int/2addr v4, v5

    const v5, -0x1d463ebc

    goto/16 :goto_0

    .line 291
    :sswitch_9
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u1a76\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11cb

    const v5, -0x1aad3971

    xor-int/2addr v4, v5

    const v5, 0x5fc28926

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x418b

    const v5, -0x42cb554d

    xor-int/2addr v4, v5

    const v5, -0x594d111f

    goto/16 :goto_0

    .line 171
    :sswitch_a
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e0\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x403f

    const v5, 0x67fd3f84

    xor-int/2addr v4, v5

    const v5, 0x42a526f3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b69

    const v5, -0x602ee0be

    xor-int/2addr v4, v5

    const v5, -0x3ad7ef97

    goto/16 :goto_0

    .line 161
    :sswitch_b
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_b

    :goto_4
    const-string v3, "\u1a77\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1287

    const v5, -0x3e8370f3

    xor-int/2addr v4, v5

    const v5, 0x5d95e686

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a8\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7b4f

    const v5, 0x1a3c4bd0

    xor-int/2addr v4, v5

    const v5, 0x7a32b4dd

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_c

    :goto_5
    const-string v3, "\u1a7a\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x68c5

    const v5, -0x474f51d1

    xor-int/2addr v4, v5

    const v5, 0x3ffeb9c1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2127

    const v5, -0xcd01998

    xor-int/2addr v4, v5

    const v5, -0x71f3217c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b9fca52 -> :sswitch_9
        -0x7a8e0b61 -> :sswitch_3
        -0x60afaafb -> :sswitch_7
        -0x44f6e57a -> :sswitch_1
        -0x3fb64d8c -> :sswitch_c
        -0x3c8daf62 -> :sswitch_5
        -0x36ebf050 -> :sswitch_0
        -0x36760584 -> :sswitch_0
        -0x29b8e40b -> :sswitch_9
        -0x1cebf926 -> :sswitch_6
        -0x17335544 -> :sswitch_2
        -0x1578f21a -> :sswitch_a
        -0x1bcf468 -> :sswitch_4
        0x567e3f2 -> :sswitch_8
        0x7377563 -> :sswitch_4
        0x9e34be7 -> :sswitch_5
        0xb379b02 -> :sswitch_b
        0x204a9e01 -> :sswitch_c
        0x2066bc02 -> :sswitch_8
        0x28b4aa45 -> :sswitch_2
        0x36384264 -> :sswitch_b
        0x42d3b11e -> :sswitch_7
        0x4d662c1e -> :sswitch_6
        0x4da71dea -> :sswitch_a
        0x4e36859f -> :sswitch_3
        0x627e3a58 -> :sswitch_1
    .end sparse-switch
.end method
