.class public final synthetic Ll/ᩴᩳۤ;
.super Ljava/lang/Object;
.source "JAGX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Lbin/mt/plus/Main;

.field public final synthetic ۟:Ljava/lang/String;

.field public final synthetic ܰ:Ll/ܺᩳۤ;

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩶:Ll/ܰ᩺᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ܺᩳۤ;Lbin/mt/plus/Main;Ll/۠ۖۧ;Ll/ܰ᩺᩻;Ljava/lang/String;)V
    .locals 6

    const v0, -0x7564c22e

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x324d

    const v5, -0x2121f717    # -7.999647E18f

    xor-int/2addr v4, v5

    const v5, -0x5748e492

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xddf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_3

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f25

    const v5, -0xaba15ae

    xor-int/2addr v4, v5

    const v5, 0x438e0a55

    goto :goto_0

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_2

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ᩴᩳۤ;->֡:Lbin/mt/plus/Main;

    iput-object p5, p0, Ll/ᩴᩳۤ;->۟:Ljava/lang/String;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ᩴᩳۤ;->ܿ:Ll/۠ۖۧ;

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_1

    const-string v3, "\u0733\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4247

    const v5, -0x2fcf9e76

    xor-int/2addr v4, v5

    const v5, -0x2678018

    goto :goto_0

    :cond_1
    const-string v3, "\u06e2\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4433

    const v5, 0x1580ee5e

    xor-int/2addr v4, v5

    const v5, -0x5197f586    # -5.2759998E-11f

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u05a1\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b15

    const v5, -0x535a3eb0

    xor-int/2addr v4, v5

    const v5, -0x4ba0f4f0

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x136b

    const v5, 0x1b152c51

    xor-int/2addr v4, v5

    const v5, 0x1a881cad

    goto/16 :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5823

    const v5, -0x35b0ab55

    xor-int/2addr v4, v5

    const v5, -0x3157204b

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x577

    const v5, 0x3786ee64

    xor-int/2addr v4, v5

    const v5, 0x14b25661

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x66fb

    const v5, 0x3a39f51f

    xor-int/2addr v4, v5

    const v5, 0x387a1f97

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f11

    const v5, 0x6c6b55fc

    xor-int/2addr v4, v5

    const v5, 0x6c00d7a5

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d6\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7041

    const v5, -0x4b1eb8fe

    xor-int/2addr v4, v5

    const v5, 0x7311ef7b

    goto/16 :goto_0

    .line 1
    :sswitch_c
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u06da\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ed1

    const v5, 0x5153090f

    xor-int/2addr v4, v5

    const v5, 0x341306a2

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_a

    :goto_2
    const-string v3, "\u05a8\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28cd

    const v5, -0x3402796d    # -3.3230118E7f

    xor-int/2addr v4, v5

    const v5, 0x15c3e815

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1aaf

    const v5, 0x7e386926

    xor-int/2addr v4, v5

    const v5, -0x617f2957

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴᩳۤ;->ܰ:Ll/ܺᩳۤ;

    iput-object p4, p0, Ll/ᩴᩳۤ;->᩶:Ll/ܰ᩺᩻;

    .line 3
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u05a8\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x722d

    const v5, 0x4beb573c    # 3.0846584E7f

    xor-int/2addr v4, v5

    const v5, -0x146d4d8f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3663

    const v5, 0x155f8e7c

    xor-int/2addr v4, v5

    const v5, -0x3728478d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d7b22c8 -> :sswitch_1
        -0x7aacc8b8 -> :sswitch_2
        -0x7868fa64 -> :sswitch_6
        -0x765282e0 -> :sswitch_7
        -0x5b63bf8d -> :sswitch_1
        -0x5a9ac081 -> :sswitch_8
        -0x38def3c4 -> :sswitch_c
        -0x31335621 -> :sswitch_7
        -0x2f5df6a1 -> :sswitch_4
        -0x2b4edfb8 -> :sswitch_e
        -0x24667fe7 -> :sswitch_3
        -0x245d02a1 -> :sswitch_5
        -0x13f2dd47 -> :sswitch_a
        -0x4a52d3c -> :sswitch_8
        0x107bf05 -> :sswitch_c
        0x420ca1b -> :sswitch_d
        0x1226d73a -> :sswitch_9
        0x246eecfc -> :sswitch_9
        0x29400625 -> :sswitch_2
        0x300bf222 -> :sswitch_6
        0x3223d72f -> :sswitch_5
        0x39d1aaf5 -> :sswitch_d
        0x3df6c928 -> :sswitch_0
        0x3e8df67e -> :sswitch_b
        0x41d86c3a -> :sswitch_b
        0x5aea188d -> :sswitch_a
        0x5dadc665 -> :sswitch_4
        0x6087438d -> :sswitch_0
        0x768dc181 -> :sswitch_3
        0x790d0002 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x219bc31b

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v6, "\u1a78\u1a7b"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x297d

    const v8, 0x6ad17ff1

    xor-int/2addr v7, v8

    const v8, -0x369abc9f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x7c63

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 2
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v6, :cond_8

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v6, Ll/᩺;->۫۬۫:I

    if-gtz v6, :cond_9

    goto/16 :goto_5

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_2

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v6

    if-eqz v6, :cond_5

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v3, p0, Ll/ᩴᩳۤ;->᩶:Ll/ܰ᩺᩻;

    invoke-static {v1, p1, v2, v3, v0}, Ll/ܺᩳۤ;->ۙ(Ll/ܺᩳۤ;Lbin/mt/plus/Main;Ll/۠ۖۧ;Ll/ܰ᩺᩻;Ljava/lang/String;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ᩴᩳۤ;->ܰ:Ll/ܺᩳۤ;

    iget-object v2, p0, Ll/ᩴᩳۤ;->ܿ:Ll/۠ۖۧ;

    .line 2
    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u1a77\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x303b

    const v8, -0x6ca0213f

    xor-int/2addr v7, v8

    const v8, 0x77373128

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v0, p0, Ll/ᩴᩳۤ;->۟:Ljava/lang/String;

    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "\u06e7\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4295

    const v8, -0x677c01e9

    xor-int/2addr v7, v8

    const v8, 0x39d212f8

    goto :goto_0

    :sswitch_8
    iget-object p1, p0, Ll/ᩴᩳۤ;->֡:Lbin/mt/plus/Main;

    sget v6, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v6, :cond_2

    :goto_1
    const-string v6, "\u0736\u06d8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x641f

    const v8, -0x5a17d2bf

    xor-int/2addr v7, v8

    const v8, 0xd338e46

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06e8\u05a1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x27eb

    const v8, 0x416b9121

    xor-int/2addr v7, v8

    const v8, 0x5b5d58af

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v6, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v6, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v6, "\u0733\u1a78"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5fb

    const v8, -0x4b4394c4

    xor-int/2addr v7, v8

    const v8, -0x21cba0b0

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_4

    goto :goto_3

    :cond_4
    const-string v6, "\u06e7\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x69f3

    const v8, 0x1509a378

    xor-int/2addr v7, v8

    const v8, -0x2e70dccf

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v6, :cond_6

    :cond_5
    :goto_2
    const-string v6, "\u06eb\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x31

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xe3d

    const v8, -0x5998a391

    xor-int/2addr v7, v8

    const v8, 0x169667b2

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u1a77\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x34e5

    const v8, -0x52fd49bd

    xor-int/2addr v7, v8

    const v8, -0x4e5f9e3f

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_7

    :goto_3
    const-string v6, "\u1a7b\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x43

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1499

    const v8, 0x4e646399    # 9.579331E8f

    xor-int/2addr v7, v8

    const v8, 0x3976d0ab

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e0\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x48b1

    const v8, -0x3e8299e8

    xor-int/2addr v7, v8

    const v8, 0x757d5aa6

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a79\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xb3b

    const v8, 0x1460476d

    xor-int/2addr v7, v8

    const v8, -0x58a6e4f9

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u1a78\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2553

    const v8, 0x49215c9a    # 660937.6f

    xor-int/2addr v7, v8

    const v8, 0x20738434

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06d7\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6b45

    const v8, -0xf4eaeb2

    xor-int/2addr v7, v8

    const v8, 0x2a77f018

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06db\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x62c1

    const v8, -0x2a8ff3b5

    xor-int/2addr v7, v8

    const v8, -0x3dee9c61

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6b8b

    const v8, -0x24577bb9

    xor-int/2addr v7, v8

    const v8, -0x4691c43b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ec0e3fc -> :sswitch_9
        -0x7d74d858 -> :sswitch_e
        -0x7bdcecd7 -> :sswitch_7
        -0x76036cf5 -> :sswitch_2
        -0x75e68d51 -> :sswitch_c
        -0x6e79214d -> :sswitch_5
        -0x6d513fe8 -> :sswitch_0
        -0x682531d9 -> :sswitch_a
        -0x6684e759 -> :sswitch_8
        -0x5f13dd6b -> :sswitch_4
        -0x57b65774 -> :sswitch_1
        -0x57b565ba -> :sswitch_5
        -0x55fceea0 -> :sswitch_b
        -0x2a595a45 -> :sswitch_e
        -0x1962364b -> :sswitch_4
        -0x13bc7bcc -> :sswitch_7
        -0x1348f4d7 -> :sswitch_c
        -0x5b18ebf -> :sswitch_a
        -0xf1a4f6 -> :sswitch_1
        0x17f471e4 -> :sswitch_d
        0x2e66a53f -> :sswitch_3
        0x3291c9ab -> :sswitch_2
        0x40027dad -> :sswitch_8
        0x46de43ee -> :sswitch_0
        0x4796bf34 -> :sswitch_b
        0x4d3ec58f -> :sswitch_9
        0x4e1c69c4 -> :sswitch_d
        0x671c7145 -> :sswitch_3
        0x6f1dc298 -> :sswitch_6
        0x723fe5d3 -> :sswitch_6
    .end sparse-switch
.end method
