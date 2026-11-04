.class public final synthetic Ll/۠ۛܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ۚۘܳ;
.implements Ll/ܶ᩸֫;
.implements Ll/ܰܽ;


# static fields
.field private static final ܺᩴܽ:[S


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x23

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۛܳ;->ܺᩴܽ:[S

    return-void

    :array_0
    .array-data 2
        0x62s
        0x1161s
        0x116es
        0x1164s
        0x1172s
        0x116fs
        0x1169s
        0x1164s
        0x112es
        0x1169s
        0x116es
        0x1174s
        0x1165s
        0x116es
        0x1174s
        0x112es
        0x1161s
        0x1163s
        0x1174s
        0x1169s
        0x116fs
        0x116es
        0x112es
        0x1156s
        0x1149s
        0x1145s
        0x1157s
        0x1161s
        0x1172s
        0x1173s
        0x1163s
        0x1146s
        0x1169s
        0x116cs
        0x1165s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    const v0, 0x36d546c

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/֨ۨ;->ۜܳ᩵:I

    .line 0
    iput-object p1, p0, Ll/۠ۛܳ;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/۠ۛܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06e2\u06e2"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6005

    const v3, -0x37cc8317

    xor-int/2addr p2, v3

    const v3, 0x2d123797

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3449

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget p1, Ll/ۖ֨;->֨ۨۧ:I

    if-gez p1, :cond_2

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a79\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x49

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3c85

    const v3, 0x25b0211e

    xor-int/2addr p2, v3

    const v3, 0x69cdd808

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget p1, Ll/᩺;->۫۬۫:I

    if-lez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a74\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2a7f

    const v3, -0x494d14d0

    xor-int/2addr p2, v3

    const v3, -0x427374cc

    goto :goto_0

    :cond_2
    const-string p1, "\u06d7\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x51

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x711b

    const v3, -0x77eab1f0

    xor-int/2addr p2, v3

    const v3, -0x1c1c7433

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    :goto_2
    const-string p1, "\u1a73\u05a1"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x46f9

    const v3, 0x3217743e

    xor-int/2addr p2, v3

    const v3, 0x68b2abfe

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 3
    :sswitch_5
    sget p1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06d8\u06e8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x23

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x49cd

    const v3, 0x4904d6fb

    xor-int/2addr p2, v3

    const v3, -0x1cd70a3f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e7\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x7d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1f07

    const v3, 0x1de7ec08

    xor-int/2addr p2, v3

    const v3, 0x1dc29ed7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e491978 -> :sswitch_1
        -0x62944a2b -> :sswitch_5
        -0x177a998e -> :sswitch_3
        -0x116f326d -> :sswitch_2
        -0x254ae31 -> :sswitch_2
        0xfed9dbf -> :sswitch_0
        0x30e368f6 -> :sswitch_3
        0x369640ce -> :sswitch_4
        0x37141261 -> :sswitch_4
        0x386261f4 -> :sswitch_1
        0x575649f0 -> :sswitch_0
        0x7c85ed10 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public ۙ(Ll/᩻᩺ۙ;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4b7e34a3

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    const-string v5, "\u06e8\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2657

    const v7, 0x5a925cb3

    xor-int/2addr v6, v7

    const v7, -0x3ff8c9ab

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x4035

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 0
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_c

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06d6\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3d01

    const v7, 0x3e25262e

    xor-int/2addr v6, v7

    const v7, -0x5491a4da

    goto :goto_0

    .line 0
    :sswitch_1
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_9

    goto :goto_1

    :sswitch_2
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v5, :cond_b

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    :goto_1
    const-string v5, "\u073d\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x53d3

    const v7, 0x18280cfa

    xor-int/2addr v6, v7

    const v7, -0x285383c5

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    iget-object v0, p0, Ll/۠ۛܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܶᩴ֫;

    invoke-static {v1, v0, p1}, Ll/ۜ۫֫;->ۙ(Ll/ۜ۫֫;Ll/ܶᩴ֫;Ll/᩻᩺ۙ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_6
    move-object v1, v0

    check-cast v1, Ll/ۜ۫֫;

    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u0733\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3ef

    const v7, -0x4e87f490

    xor-int/2addr v6, v7

    const v7, 0xbb401e4

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Ll/۠ۛܳ;->ܰ:Ljava/lang/Object;

    .line 3
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06eb\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2a77

    const v7, -0x1558ab8d

    xor-int/2addr v6, v7

    const v7, -0x372dc204

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u0736\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1c6d

    const v7, 0x57ad96a

    xor-int/2addr v6, v7

    const v7, -0x17edd6ae

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u05a8\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3f41

    const v7, -0x3d9d7ad5

    xor-int/2addr v6, v7

    const v7, -0x1e478906

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u1a7a\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xfab

    const v7, 0x3174cfb2

    xor-int/2addr v6, v7

    const v7, -0x7c34f4c3

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_6

    :goto_2
    const-string v5, "\u06ec\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6653

    const v7, -0x3ce2e784

    xor-int/2addr v6, v7

    const v7, 0x1a7e91d4

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u073a\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x365f

    const v7, 0x31f531f4

    xor-int/2addr v6, v7

    const v7, -0xbc5761a

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06d9\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x719b

    const v7, -0x48573a8b

    xor-int/2addr v6, v7

    const v7, -0x476ea07e

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u1a78\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4313

    const v7, 0x28c76eaa

    xor-int/2addr v6, v7

    const v7, 0xe81b5bd

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a76\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x434f

    const v7, 0x338cfb37

    xor-int/2addr v6, v7

    const v7, 0x3ab8e417

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u05ab\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3a89

    const v7, 0x116bb2e0

    xor-int/2addr v6, v7

    const v7, -0x6fdf6226

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v5, "\u06dc\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4145

    const v7, -0x57e1f162

    xor-int/2addr v6, v7

    const v7, -0x15875d70

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05a1\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3097

    const v7, 0x469efe77

    xor-int/2addr v6, v7

    const v7, 0x1c9f8013

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e9e8de5 -> :sswitch_5
        -0x6f5426b6 -> :sswitch_0
        -0x6ee781e8 -> :sswitch_2
        -0x6a5d754a -> :sswitch_9
        -0x69b55fa8 -> :sswitch_e
        -0x48a2293d -> :sswitch_a
        -0x45b366b8 -> :sswitch_6
        -0x3d8b8c56 -> :sswitch_7
        -0x29b176ab -> :sswitch_c
        -0x26204ae3 -> :sswitch_0
        -0x260f076b -> :sswitch_1
        -0x1d41ac19 -> :sswitch_d
        -0x1cf638e0 -> :sswitch_3
        -0x120286d7 -> :sswitch_9
        -0x3ed6dfc -> :sswitch_1
        -0xf4e6c2 -> :sswitch_d
        0xd7a6d36 -> :sswitch_b
        0x201d92f8 -> :sswitch_8
        0x22d219e9 -> :sswitch_2
        0x2fc56a7e -> :sswitch_7
        0x32441157 -> :sswitch_b
        0x390811f8 -> :sswitch_4
        0x45cf9361 -> :sswitch_e
        0x60d711dd -> :sswitch_5
        0x6385af47 -> :sswitch_3
        0x659b747e -> :sswitch_4
        0x6b6d2ad9 -> :sswitch_8
        0x6e1d514d -> :sswitch_6
        0x7c1cf64b -> :sswitch_c
        0x7eeffacb -> :sswitch_a
    .end sparse-switch
.end method

.method public ۙ(Ll/ܿܽ;)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7bb5af03

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v5, "\u06dc\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xb65

    const v7, 0x667d5502

    xor-int/2addr v6, v7

    const v7, 0x3ce32385

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x1a23

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 65
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_4

    goto/16 :goto_1

    :sswitch_0
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v5, :cond_7

    goto/16 :goto_4

    :sswitch_1
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_9

    goto/16 :goto_4

    .line 5
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_b

    goto/16 :goto_1

    .line 55
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    .line 11
    :sswitch_5
    invoke-static {v0}, Ll/ܽ;->ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;

    .line 72
    invoke-interface {v1, v0}, Lbin/mt/plugin/api/ui/menu/PluginPopupMenu$OnDismissListener;->onDismiss(Lbin/mt/plugin/api/ui/menu/PluginPopupMenu;)V

    return-void

    .line 6
    :sswitch_6
    iget-object v1, p0, Ll/۠ۛܳ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Lbin/mt/plugin/api/ui/menu/PluginPopupMenu$OnDismissListener;

    .line 54
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u06dc\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x19f1

    const v7, 0x3b57f972

    xor-int/2addr v6, v7

    const v7, 0x14fffe2e

    goto :goto_0

    .line 4
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/֨ܰ֫;

    .line 55
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u05a8\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x670f

    const v7, 0xb11dec3

    xor-int/2addr v6, v7

    const v7, -0x460a1f91

    goto :goto_0

    .line 2
    :sswitch_8
    iget-object p1, p0, Ll/۠ۛܳ;->ܰ:Ljava/lang/Object;

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u1a74\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3b97

    const v7, 0x692c2e72

    xor-int/2addr v6, v7

    const v7, -0x42f0695d

    goto/16 :goto_0

    .line 16
    :sswitch_9
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a73\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4dab

    const v7, -0x25f06332

    xor-int/2addr v6, v7

    const v7, 0x35b1ed16

    goto/16 :goto_0

    :goto_1
    const-string v5, "\u06d6\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x66ab

    const v7, -0x2eae9d10

    xor-int/2addr v6, v7

    const v7, 0x66946cd3

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3b3d

    const v7, -0xe2dd003

    xor-int/2addr v6, v7

    const v7, -0x2c6eeb70

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v5

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06eb\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x565

    const v7, -0x276c1eaf

    xor-int/2addr v6, v7

    const v7, 0x5cb5e1d9

    goto/16 :goto_0

    .line 42
    :sswitch_b
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_6

    :goto_2
    const-string v5, "\u073a\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5567

    const v7, -0xa930800

    xor-int/2addr v6, v7

    const v7, 0x7d4b0709

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06da\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x382f

    const v7, -0x615f9a60

    xor-int/2addr v6, v7

    const v7, -0x11a821e2

    goto/16 :goto_0

    .line 17
    :sswitch_c
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_8

    :cond_7
    const-string v5, "\u05a8\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x16b5

    const v7, -0x18c7f089

    xor-int/2addr v6, v7

    const v7, -0x539f74ca

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a74\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d47

    const v7, -0x75106e63

    xor-int/2addr v6, v7

    const v7, 0x47fc0ce2

    goto/16 :goto_0

    .line 19
    :sswitch_d
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u06e0\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x50cf

    const v7, 0xa23c4c4

    xor-int/2addr v6, v7

    const v7, 0x1e0e7410

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06df\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x26a5

    const v7, 0xbd5732f

    xor-int/2addr v6, v7

    const v7, -0x6354c853

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a75\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1a37

    const v7, -0x25ddad41

    xor-int/2addr v6, v7

    const v7, 0x1958c47

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e0\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b99

    const v7, -0x77738b8e

    xor-int/2addr v6, v7

    const v7, 0x60b4a702

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7942f172 -> :sswitch_0
        -0x75809ae3 -> :sswitch_3
        -0x74874f34 -> :sswitch_4
        -0x6c0c672b -> :sswitch_6
        -0x697ae4d7 -> :sswitch_d
        -0x63368206 -> :sswitch_a
        -0x5c9b28f4 -> :sswitch_7
        -0x597e0fb2 -> :sswitch_7
        -0x577a9571 -> :sswitch_c
        -0x4f37cab3 -> :sswitch_2
        -0x2101baf8 -> :sswitch_1
        -0x12754bcf -> :sswitch_8
        -0xde02742 -> :sswitch_b
        -0x5eeaf94 -> :sswitch_9
        -0x32b48f3 -> :sswitch_9
        -0x2840fcb -> :sswitch_d
        0xfc1e62c -> :sswitch_5
        0xfd59942 -> :sswitch_0
        0x1af44fcf -> :sswitch_8
        0x1d656f13 -> :sswitch_5
        0x2ed02f54 -> :sswitch_3
        0x314837f8 -> :sswitch_2
        0x37620ed4 -> :sswitch_1
        0x3d1031b8 -> :sswitch_4
        0x4e7d80a4 -> :sswitch_e
        0x68b9ae16 -> :sswitch_b
        0x6cf026b1 -> :sswitch_c
        0x78dbdcd0 -> :sswitch_e
        0x7a470cb1 -> :sswitch_a
        0x7ba0a98d -> :sswitch_6
    .end sparse-switch
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 23

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, 0x34ef7bcb

    sget v17, Ll/֨ܿ;->᩹᩻۟:I

    sget v18, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v19, "\u06d8\u1a7b"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, 0x18c7

    const v21, -0x6e0a628a

    xor-int v1, v1, v21

    const v21, -0x3221be7f

    xor-int v19, v19, v21

    move-object/from16 v22, v6

    const/4 v3, 0x0

    const/16 v20, 0x0

    :goto_0
    xor-int v6, v16, v17

    mul-int/lit16 v6, v6, 0x442b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    .line 1427
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_4

    .line 530
    :sswitch_0
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_1

    goto/16 :goto_1

    .line 1036
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v1, :cond_a

    goto/16 :goto_1

    .line 1517
    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    .line 792
    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    return-void

    .line 234
    :sswitch_4
    invoke-static {v2, v5}, Ll/ᩴ᩶ܳ;->ۙ(Ll/ۖۗܳ;I)V

    .line 1849
    invoke-static/range {v20 .. v20}, Ll/֡᩵;->ۨۗ᩺(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v3}, Ll/ۗ֡;->ᩴ֨ᩳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1847
    :sswitch_5
    invoke-static/range {p1 .. p1}, Ll/֨ۨ;->֨֡ܳ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Ll/ۖۙ;->ۡۡᩴ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    const/16 v5, 0x7d0

    .line 103
    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u06d9\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x41

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x6e85

    const v19, -0x24f14857

    xor-int v6, v6, v19

    const v19, 0x442f7455

    goto/16 :goto_5

    :sswitch_6
    const/16 v1, 0x8

    .line 1846
    invoke-static {v14, v15, v1, v10}, Ll/֫֨;->ۡᩴۛ([SIII)Ljava/lang/String;

    move-result-object v4

    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x43

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x2179

    const v19, 0x640cb00b

    xor-int v6, v6, v19

    const v19, -0xde6eba

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x45

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x4999

    const v19, 0x53b410e9

    xor-int v6, v6, v19

    const v19, -0x3f6d7b20

    goto/16 :goto_5

    .line 1845
    :sswitch_7
    invoke-static {v11, v12, v13, v10}, Ll/֫ۢ;->۬ۡ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1846
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v14, Ll/۠ۛܳ;->ܺᩴܽ:[S

    const/16 v15, 0x1b

    .line 819
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u06d6\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x57

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x26a5

    const v19, 0x257cca2d

    xor-int v6, v6, v19

    const v19, 0x414d21bc

    goto/16 :goto_5

    :sswitch_8
    const/4 v12, 0x1

    const/16 v13, 0x1a

    .line 47
    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v1, "\u1a77\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x71

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x180d

    const v19, 0x65873d4c

    xor-int v6, v6, v19

    const v19, -0xcb91be7

    goto/16 :goto_5

    .line 1844
    :sswitch_9
    new-instance v3, Landroid/content/Intent;

    invoke-static/range {v20 .. v20}, Ll/ۗ֨;->᩷۟ۚ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    const-class v6, Ll/֨֫ۧ;

    .line 860
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v19

    if-eqz v19, :cond_6

    :cond_5
    :goto_1
    const-string v1, "\u06d6\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x19

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x7055

    const v6, -0x6a35b8c2

    xor-int/2addr v3, v6

    const v6, -0x4fd49252

    xor-int v19, v1, v6

    move v1, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    .line 1844
    :cond_6
    invoke-direct {v3, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1845
    invoke-static {v3, v1}, Ll/֡ۖ;->ۙۖ۟(Ljava/lang/Object;I)Landroid/content/Intent;

    sget-object v11, Ll/۠ۛܳ;->ܺᩴܽ:[S

    .line 218
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x442d

    const v19, -0x29cce341

    xor-int v6, v6, v19

    const v19, -0x7afb78de

    goto/16 :goto_5

    .line 2
    :sswitch_a
    iget-object v1, v0, Ll/۠ۛܳ;->ܰ:Ljava/lang/Object;

    .line 4
    move-object/from16 v20, v1

    check-cast v20, Ll/۠ۨܳ;

    .line 6
    iget-object v1, v0, Ll/۠ۛܳ;->᩶:Ljava/lang/Object;

    .line 8
    move-object v2, v1

    check-cast v2, Ll/ۖۗܳ;

    .line 1103
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x7f

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x502b

    const v19, -0x27414fd2

    xor-int v6, v6, v19

    const v19, -0x19af1aa2

    goto/16 :goto_5

    :sswitch_b
    const/16 v1, 0x4c3b

    const/16 v10, 0x4c3b

    goto :goto_2

    :sswitch_c
    const/16 v1, 0x1100

    const/16 v10, 0x1100

    :goto_2
    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x7011

    const v19, 0xa7d948

    xor-int v6, v6, v19

    const v19, -0x9df6121

    goto/16 :goto_5

    :sswitch_d
    add-int v1, v8, v9

    mul-int v1, v1, v1

    mul-int/lit16 v6, v8, 0x7bd0

    sub-int/2addr v1, v6

    if-ltz v1, :cond_9

    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x3f

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x2331

    const v19, 0x77bf551c

    xor-int v6, v6, v19

    const v19, -0x31faa92

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u0730\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2b

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x40db

    const v19, -0x34cd035d    # -1.1730083E7f

    xor-int v6, v6, v19

    const v19, 0x7e6cf1b5

    goto/16 :goto_5

    :sswitch_e
    aget-short v8, v22, v7

    const/16 v9, 0x1ef4

    .line 586
    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_b

    :cond_a
    const-string v1, "\u073f\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x4729

    const v19, -0x462f360c

    xor-int v6, v6, v19

    const v19, -0x658b9d1e

    goto/16 :goto_5

    :cond_b
    const-string v1, "\u06e1\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x7979

    const v19, 0x5afaae7a

    xor-int v6, v6, v19

    const v19, 0x57ce0572

    goto :goto_5

    :sswitch_f
    const/4 v7, 0x0

    .line 1377
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v1, :cond_c

    :goto_3
    const-string v1, "\u073a\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x47

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x5d99

    const v19, -0x1c836ea7

    xor-int v6, v6, v19

    const v19, 0x2596d34a

    goto :goto_5

    :cond_c
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x2f

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x5f5f

    const v19, 0x2f0e5233

    xor-int v6, v6, v19

    const v19, 0x67c08dd2

    goto :goto_5

    :sswitch_10
    sget-object v22, Ll/۠ۛܳ;->ܺᩴܽ:[S

    .line 1287
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_d

    :goto_4
    const-string v1, "\u1a7a\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x4629

    const v19, -0x5ede9889

    xor-int v6, v6, v19

    const v19, -0x4aa63b0e

    goto :goto_5

    :cond_d
    const-string v1, "\u073d\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x14ef

    const v19, -0x7da90488

    xor-int v6, v6, v19

    const v19, 0x666700ba

    :goto_5
    xor-int v19, v1, v19

    move v1, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c39c818 -> :sswitch_6
        -0x705b2da6 -> :sswitch_e
        -0x651d8896 -> :sswitch_1
        -0x5057495d -> :sswitch_4
        -0x4ae0d457 -> :sswitch_f
        -0x49c380be -> :sswitch_0
        -0x4528fc7e -> :sswitch_d
        -0x3b5a4096 -> :sswitch_10
        -0x393e1d76 -> :sswitch_5
        -0x26ce01dd -> :sswitch_9
        -0x231b4a2a -> :sswitch_6
        -0x2025b65a -> :sswitch_3
        -0x1560a4e7 -> :sswitch_9
        -0x88bd46d -> :sswitch_4
        -0x487ddc2 -> :sswitch_f
        -0x3914e14 -> :sswitch_c
        0x14536db -> :sswitch_2
        0x1bff268 -> :sswitch_1
        0x76b40ac -> :sswitch_2
        0xea1cc5d -> :sswitch_e
        0xfe0d7b5 -> :sswitch_d
        0x239cb7ec -> :sswitch_8
        0x28453acd -> :sswitch_3
        0x3145b0ac -> :sswitch_a
        0x4a5728a0 -> :sswitch_0
        0x50c16ae1 -> :sswitch_10
        0x50cbf29a -> :sswitch_7
        0x567f07ef -> :sswitch_b
        0x6609156a -> :sswitch_5
        0x66522c1a -> :sswitch_8
        0x6b3f8720 -> :sswitch_a
        0x747d5b7f -> :sswitch_c
        0x78464e4e -> :sswitch_7
        0x7a4466a1 -> :sswitch_b
    .end sparse-switch
.end method
