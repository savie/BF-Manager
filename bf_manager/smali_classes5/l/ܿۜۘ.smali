.class public final Ll/ܿۜۘ;
.super Ll/᩹֡۟;
.source "P418"


# static fields
.field private static final ۙ۟ۖ:[S


# instance fields
.field public final ۨ:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿۜۘ;->ۙ۟ۖ:[S

    return-void

    :array_0
    .array-data 2
        0x1ed5s
        0x1d43s
        0x1d18s
        0x1d09s
        0x1d1fs
        0x1d18s
        0x1d42s
        0x1d06s
        0x1d0ds
        0x1d1as
        0x1d0ds
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 7

    const v0, 0x38727b4b

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    sget-object v3, Ll/ܿۜۘ;->ۙ۟ۖ:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    mul-int v4, v3, v3

    const v5, 0x6dec1

    add-int/2addr v4, v5

    mul-int/lit16 v3, v3, 0x53e

    sub-int/2addr v3, v4

    if-lez v3, :cond_0

    const v3, 0x9901

    goto :goto_0

    :cond_0
    const/16 v3, 0x1d6c

    :goto_0
    sget-object v4, Ll/ܿۜۘ;->ۙ۟ۖ:[S

    const/4 v5, 0x1

    const/16 v6, 0xa

    invoke-static {v4, v5, v6, v3}, Ll/֫ᩳ;->᩵ۡ᩻([SIII)Ljava/lang/String;

    move-result-object v3

    .line 224
    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    sget-object v4, Ll/ۨ֡۟;->ܿ:Ll/ۨ֡۟;

    invoke-direct {p0, v3, v4}, Ll/᩹֡۟;-><init>(Ljava/net/URI;Ll/ۨ֡۟;)V

    const-string v3, "\u073a\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x654f

    const v5, -0x5e0a43d3

    xor-int/2addr v4, v5

    const v5, -0x1a4b9b6f

    :goto_1
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x68bd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_c

    goto/16 :goto_5

    .line 34
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_8

    goto/16 :goto_5

    .line 168
    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-nez v3, :cond_a

    goto :goto_2

    .line 10
    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    :goto_2
    const-string v3, "\u06d8\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x547

    const v5, -0x76680ff7

    xor-int/2addr v4, v5

    const v5, 0x63aab289

    goto :goto_1

    .line 37
    :sswitch_4
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06ec\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ab7

    const v5, -0x119872ae

    xor-int/2addr v4, v5

    const v5, -0x1ac19425

    goto :goto_1

    .line 101
    :sswitch_6
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06d8\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x23df

    const v5, -0xc8da419

    xor-int/2addr v4, v5

    const v5, 0x7fd2d716

    goto :goto_1

    .line 64
    :sswitch_7
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u073f\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb4d

    const v5, -0x3448049

    xor-int/2addr v4, v5

    const v5, -0x22aaea8a

    goto/16 :goto_1

    .line 153
    :sswitch_8
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v3, "\u06d8\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45b9

    const v5, 0x5e66992b

    xor-int/2addr v4, v5

    const v5, -0x22051a0b

    goto/16 :goto_1

    .line 58
    :sswitch_9
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v3, "\u06d6\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x51fd

    const v5, 0x2ebcdd2c

    xor-int/2addr v4, v5

    const v5, -0x609fb8d9

    goto/16 :goto_1

    .line 65
    :sswitch_a
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u0736\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7cd7

    const v5, -0x57b6e297

    xor-int/2addr v4, v5

    const v5, 0x328d98b5

    goto/16 :goto_1

    :sswitch_b
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_7

    :goto_3
    const-string v3, "\u06df\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2529

    const v5, 0x259b2032

    xor-int/2addr v4, v5

    const v5, 0x5a56bb8d

    goto/16 :goto_1

    :cond_7
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2839

    const v5, -0x7ca04cf5

    xor-int/2addr v4, v5

    const v5, 0x4c07e141    # 3.56201E7f

    goto/16 :goto_1

    .line 181
    :sswitch_c
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4123

    const v5, 0x4b4dfa1c

    xor-int/2addr v4, v5

    const v5, 0x664d556b

    goto/16 :goto_1

    :cond_9
    const-string v3, "\u05ab\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e8b

    const v5, -0x50f56ba8

    xor-int/2addr v4, v5

    const v5, 0xca3d73

    goto/16 :goto_1

    .line 67
    :sswitch_d
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_b

    :cond_a
    :goto_5
    const-string v3, "\u1a78\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x65f1

    const v5, -0x24f2a006

    xor-int/2addr v4, v5

    const v5, -0xcf6c99e

    goto/16 :goto_1

    :cond_b
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a95

    const v5, -0x22e2f701

    xor-int/2addr v4, v5

    const v5, -0x415e6482

    goto/16 :goto_1

    .line 225
    :sswitch_e
    iput-object p1, p0, Ll/ܿۜۘ;->ۨ:Ljava/lang/CharSequence;

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_d

    :cond_c
    :goto_6
    const-string v3, "\u06da\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x282f

    const v5, -0x19be6e92

    xor-int/2addr v4, v5

    const v5, 0x63303ea3

    goto/16 :goto_1

    :cond_d
    const-string v3, "\u1a79\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x38a3

    const v5, 0x273b6d5

    xor-int/2addr v4, v5

    const v5, -0x7af39245

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x6f0b315a -> :sswitch_a
        -0x6ccf2f0e -> :sswitch_7
        -0x63625394 -> :sswitch_3
        -0x4bd56b03 -> :sswitch_c
        -0x3a67a788 -> :sswitch_2
        -0x3906a26b -> :sswitch_7
        -0x28f540e3 -> :sswitch_d
        -0x28dbfc5b -> :sswitch_8
        -0x2883c97a -> :sswitch_6
        -0x16e037ed -> :sswitch_e
        -0x10068f9d -> :sswitch_b
        -0xea448ee -> :sswitch_9
        -0x9fc1e44 -> :sswitch_5
        -0x8f749c9 -> :sswitch_d
        -0x67c49c5 -> :sswitch_0
        -0x33d5639 -> :sswitch_4
        -0x326c409 -> :sswitch_0
        0x70fd23b -> :sswitch_4
        0x142a50ac -> :sswitch_b
        0x286a31b0 -> :sswitch_1
        0x2dd79342 -> :sswitch_5
        0x3126be67 -> :sswitch_8
        0x31354dc7 -> :sswitch_1
        0x36844e6f -> :sswitch_9
        0x3c9917ef -> :sswitch_c
        0x46962f41 -> :sswitch_e
        0x50dfaece -> :sswitch_3
        0x5a630dd5 -> :sswitch_6
        0x7510463f -> :sswitch_2
        0x751ac4b9 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Z)Ljava/lang/CharSequence;
    .locals 0

    .line 230
    iget-object p1, p0, Ll/ܿۜۘ;->ۨ:Ljava/lang/CharSequence;

    return-object p1
.end method
