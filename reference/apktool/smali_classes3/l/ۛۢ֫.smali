.class public final Ll/ۛۢ֫;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ll/ۢۖ᩹;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ll/ۢۖ᩹;


# direct methods
.method public constructor <init>(Ll/ۢۖ᩹;Ll/ۢۖ᩹;Ljava/lang/String;I)V
    .locals 6

    const v0, -0x216485c8

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    sget v2, Ll/ۧ;->ۨۗܰ:I

    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d09

    const v5, -0x1f344058

    xor-int/2addr v4, v5

    const v5, -0x77d5a09e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x2d85

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 267
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_a

    goto/16 :goto_3

    .line 199
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-gez v3, :cond_9

    goto/16 :goto_2

    :sswitch_2
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    :goto_1
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1323

    const v5, 0x30088380

    xor-int/2addr v4, v5

    const v5, -0x15cc0073

    goto :goto_0

    .line 180
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 313
    :sswitch_5
    iput-object p3, p0, Ll/ۛۢ֫;->᩷:Ljava/lang/String;

    .line 314
    iput p4, p0, Ll/ۛۢ֫;->ۙ:I

    return-void

    .line 235
    :sswitch_6
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "\u06d8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12b9

    const v5, -0x2bb15cc2    # -3.550008E12f

    xor-int/2addr v4, v5

    const v5, 0x5a165592

    goto :goto_0

    :cond_0
    const-string v3, "\u06dc\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a09

    const v5, -0x54886adb

    xor-int/2addr v4, v5

    const v5, 0x131ba2fb

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb61

    const v5, 0x33d5e227

    xor-int/2addr v4, v5

    const v5, 0x2a5f700a

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1df1

    const v5, 0x7c073688

    xor-int/2addr v4, v5

    const v5, -0x3922f5cc

    goto/16 :goto_0

    .line 289
    :sswitch_9
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6e9f

    const v5, -0x2a450619

    xor-int/2addr v4, v5

    const v5, -0x40637bf3

    goto/16 :goto_0

    .line 294
    :sswitch_a
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a78\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6097

    const v5, -0x70f72565

    xor-int/2addr v4, v5

    const v5, -0x40b8dbd0

    goto/16 :goto_0

    .line 301
    :sswitch_b
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18cb

    const v5, -0x2a7047b5

    xor-int/2addr v4, v5

    const v5, -0x7a4f8c8f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05ab\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x42c7

    const v5, 0x77cc9197

    xor-int/2addr v4, v5

    const v5, -0x698d4a30

    goto/16 :goto_0

    .line 244
    :sswitch_c
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb33

    const v5, 0x7675d7c6

    xor-int/2addr v4, v5

    const v5, 0x70a6dcbb

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c55

    const v5, -0x716abe76

    xor-int/2addr v4, v5

    const v5, -0x2f6135d0

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v3, "\u1a7a\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x70cd

    const v5, -0x71648c35

    xor-int/2addr v4, v5

    const v5, -0x2d618e42

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e1\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3533

    const v5, 0x47c55995

    xor-int/2addr v4, v5

    const v5, 0x3e775a86

    goto/16 :goto_0

    .line 311
    :sswitch_e
    iput-object p1, p0, Ll/ۛۢ֫;->ۤ:Ll/ۢۖ᩹;

    .line 312
    iput-object p2, p0, Ll/ۛۢ֫;->᩸:Ll/ۢۖ᩹;

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05a8\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d41

    const v5, 0x3ff416c2

    xor-int/2addr v4, v5

    const v5, 0x4859c4df

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3c09

    const v5, 0x70ebec81

    xor-int/2addr v4, v5

    const v5, -0x6e952e77

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x64937391 -> :sswitch_5
        -0x536a7999 -> :sswitch_d
        -0x49ccdcce -> :sswitch_c
        -0x48126be8 -> :sswitch_0
        -0x41ffa035 -> :sswitch_4
        -0x3e63235d -> :sswitch_d
        -0x3be5def9 -> :sswitch_6
        -0x2d9e8546 -> :sswitch_0
        -0x264c1e97 -> :sswitch_9
        -0x21293bf9 -> :sswitch_2
        -0x2008c190 -> :sswitch_7
        -0x1dbba6b2 -> :sswitch_b
        -0x1b237fba -> :sswitch_e
        -0x61414e5 -> :sswitch_2
        -0x4f90a9 -> :sswitch_6
        0x7d984c7 -> :sswitch_1
        0xc346d65 -> :sswitch_9
        0xdc4fde1 -> :sswitch_3
        0x10e6603e -> :sswitch_3
        0x219f94c5 -> :sswitch_b
        0x22434bea -> :sswitch_7
        0x37ebaaff -> :sswitch_8
        0x3e338fb1 -> :sswitch_1
        0x416ca157 -> :sswitch_4
        0x5604928a -> :sswitch_5
        0x58e9fb37 -> :sswitch_c
        0x5afde30b -> :sswitch_a
        0x61d064db -> :sswitch_a
        0x770bed02 -> :sswitch_8
        0x7b2b9a32 -> :sswitch_e
    .end sparse-switch
.end method
