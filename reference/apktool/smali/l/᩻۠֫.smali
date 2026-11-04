.class public final synthetic Ll/᩻۠֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    const v0, -0x75efea1f

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    .line 0
    iput p1, p0, Ll/᩻۠֫;->ܰ:I

    iput-object p2, p0, Ll/᩻۠֫;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩻۠֫;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a77\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x56a9

    const p3, 0x125b934a

    xor-int/2addr p2, p3

    const p3, 0x77f6efb2

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x7d9b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "\u06d8\u073a"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x3d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7259

    const p3, -0x71de8715

    xor-int/2addr p2, p3

    const p3, -0x68723266

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e1\u0736"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x48f1

    const p3, 0x1dff56bd

    xor-int/2addr p2, p3

    const p3, 0x7468c877

    goto :goto_0

    .line 3
    :sswitch_1
    sget p1, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a74\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0xe9

    const p3, -0x4787f36c

    xor-int/2addr p2, p3

    const p3, 0x5d2ad572

    goto :goto_0

    .line 4
    :sswitch_2
    sget p1, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u073a\u06eb"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7ae1

    const p3, 0x6945ea1b

    xor-int/2addr p2, p3

    const p3, 0x1450394a

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    :goto_1
    const-string p1, "\u06e4\u073d"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x39

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2f2b

    const p3, 0x5de9f41c

    xor-int/2addr p2, p3

    const p3, -0xf5b8a6f

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u073d\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x35

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x35ed

    const p3, 0x286c45d3

    xor-int/2addr p2, p3

    const p3, 0x52e201f4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7370c9b7 -> :sswitch_5
        -0x71df7bb8 -> :sswitch_2
        -0x41a5e01f -> :sswitch_0
        -0x3fd64867 -> :sswitch_1
        -0x13f162fa -> :sswitch_4
        0x2eb38c2d -> :sswitch_3
        0x2ef6b3ee -> :sswitch_4
        0x33a698ec -> :sswitch_5
        0x37ff08ad -> :sswitch_2
        0x4e8b4794 -> :sswitch_1
        0x515df062 -> :sswitch_3
        0x5d8eb329 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x169dfcd6

    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v7, "\u06d9\u0736"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x7

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x35cf

    const v9, 0x45f094f

    xor-int/2addr v8, v9

    const v9, 0x2c766247

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x4a2f

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 0
    iget v7, p0, Ll/᩻۠֫;->ܰ:I

    packed-switch v7, :pswitch_data_0

    const-string v7, "\u06d8\u06d6"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x404b

    const v9, -0x1a9e8f0e

    xor-int/2addr v8, v9

    const v9, -0x608f3324

    goto :goto_0

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v7, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v7, :cond_5

    goto/16 :goto_2

    :sswitch_1
    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v7, :cond_8

    goto/16 :goto_4

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v7, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto/16 :goto_3

    .line 3
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    return-void

    .line 0
    :sswitch_5
    check-cast v3, Ll/ܳۢۙ;

    invoke-static {v2, v3}, Ll/᩸ۢۙ;->᩷(Ll/᩸ۢۙ;Ll/ܳۢۙ;)V

    return-void

    :sswitch_6
    iget-object v3, p0, Ll/᩻۠֫;->ܿ:Ljava/lang/Object;

    .line 1
    sget v7, Ll/۬;->᩸ۜ᩹:I

    if-eqz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v7, "\u06db\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x19

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x13b9

    const v9, 0x462f99d9

    xor-int/2addr v8, v9

    const v9, 0x55c58ee9

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v2, p0, Ll/᩻۠֫;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/᩸ۢۙ;

    sget v7, Ll/֫֡;->֫ۙۖ:I

    if-gtz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u06d6\u06eb"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3e21

    const v9, 0x2cc562c2

    xor-int/2addr v8, v9

    const v9, -0x11914a7c

    goto/16 :goto_0

    :sswitch_8
    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lbin/mt/plus/Main;->ۙ(Lbin/mt/plus/Main;Ljava/lang/String;)V

    return-void

    :sswitch_9
    iget-object v1, p0, Ll/᩻۠֫;->ܿ:Ljava/lang/Object;

    .line 2
    sget v7, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v7, :cond_2

    const-string v7, "\u06e1\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6cd7

    const v9, -0x13ae966c

    xor-int/2addr v8, v9

    const v9, 0x5de4ac72

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06e8\u0736"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x573

    const v9, 0x2182277

    xor-int/2addr v8, v9

    const v9, 0x24e8613f

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v7

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v7, "\u1a79\u06da"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1987

    const v9, 0xf9fd9b6

    xor-int/2addr v8, v9

    const v9, 0x43172d07

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_4

    goto :goto_1

    :cond_4
    const-string v7, "\u0733\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4117

    const v9, -0x72be3f43

    xor-int/2addr v8, v9

    const v9, 0x63ddfab6

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v7

    if-eqz v7, :cond_6

    :cond_5
    :goto_1
    const-string v7, "\u1a75\u06eb"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x195d

    const v9, -0x51471b19

    xor-int/2addr v8, v9

    const v9, 0x57710c3a

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u1a78\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x4d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6ba7

    const v9, -0x417af1f5

    xor-int/2addr v8, v9

    const v9, -0x43f6ab86

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v7, :cond_7

    goto :goto_2

    :cond_7
    const-string v7, "\u05a1\u0736"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2c9

    const v9, -0xec1cb76

    xor-int/2addr v8, v9

    const v9, -0x1a8a6c63

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v7, :cond_9

    :cond_8
    :goto_2
    const-string v7, "\u0733\u1a75"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0xb

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7733

    const v9, -0x545b64c1

    xor-int/2addr v8, v9

    const v9, 0x3d9df256

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06d7\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x1b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x33b3

    const v9, -0x904c26e

    xor-int/2addr v8, v9

    const v9, 0x17c6295

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_a

    :goto_3
    const-string v7, "\u1a77\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x67

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3897

    const v9, -0x44158c4b

    xor-int/2addr v8, v9

    const v9, 0x3e8f01

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u073d\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x17

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x69b3

    const v9, 0x77becf3b

    xor-int/2addr v8, v9

    const v9, 0x633c22fd

    goto/16 :goto_0

    .line 0
    :sswitch_10
    iget-object v0, p0, Ll/᩻۠֫;->᩶:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plus/Main;

    sget v7, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u1a7b\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x332b

    const v9, 0x448daee3

    xor-int/2addr v8, v9

    const v9, 0x2233ea62

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e0\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x9

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x433d

    const v9, 0x7d3491df

    xor-int/2addr v8, v9

    const v9, 0x6e78595e

    goto/16 :goto_0

    :pswitch_0
    const-string v7, "\u06dc\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4b69

    const v9, 0x3bb69f08

    xor-int/2addr v8, v9

    const v9, -0x37dea9cd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x676d0d27 -> :sswitch_8
        -0x6547f1da -> :sswitch_b
        -0x64a5e588 -> :sswitch_8
        -0x58673f1e -> :sswitch_f
        -0x533b7534 -> :sswitch_10
        -0x4a990e08 -> :sswitch_1
        -0x442c56c9 -> :sswitch_7
        -0x40f7eb0a -> :sswitch_4
        -0x3fcbadac -> :sswitch_c
        -0x35322fbc -> :sswitch_6
        -0x3027bfb7 -> :sswitch_0
        -0x2d1b4a92 -> :sswitch_a
        -0x2006defd -> :sswitch_c
        -0x148a9a4a -> :sswitch_3
        -0xd8639cd -> :sswitch_4
        0x3887a64 -> :sswitch_3
        0x7382f31 -> :sswitch_a
        0x12c1b4fa -> :sswitch_d
        0x23ddd3f1 -> :sswitch_d
        0x247a777e -> :sswitch_9
        0x262d00c3 -> :sswitch_e
        0x27c1123b -> :sswitch_f
        0x339704cb -> :sswitch_1
        0x34acec41 -> :sswitch_7
        0x45cff185 -> :sswitch_b
        0x4819c07f -> :sswitch_6
        0x4eca69ae -> :sswitch_2
        0x509c7659 -> :sswitch_2
        0x5c4d58a3 -> :sswitch_5
        0x67b7a993 -> :sswitch_9
        0x6b569d3e -> :sswitch_10
        0x70431963 -> :sswitch_5
        0x73bec1a0 -> :sswitch_e
        0x7947cf7e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
