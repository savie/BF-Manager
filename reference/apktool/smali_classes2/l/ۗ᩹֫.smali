.class public final synthetic Ll/ۗ᩹֫;
.super Ljava/lang/Object;
.source "X2T2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Z

.field public final synthetic ۟:Ljava/lang/Runnable;

.field public final synthetic ܰ:Ll/ۢ᩹֫;

.field public final synthetic ܿ:Ljava/lang/Runnable;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۢ᩹֫;ILjava/lang/Runnable;ZLjava/lang/Runnable;)V
    .locals 6

    const v0, -0x395cb997

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x207d

    const v5, 0x7cd47912

    xor-int/2addr v4, v5

    const v5, -0x50d6d681

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7647

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_0
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    iput-boolean p4, p0, Ll/ۗ᩹֫;->֡:Z

    iput-object p5, p0, Ll/ۗ᩹֫;->۟:Ljava/lang/Runnable;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/ۗ᩹֫;->ܿ:Ljava/lang/Runnable;

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a75\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7a49

    const v5, 0x647b1b18

    xor-int/2addr v4, v5

    const v5, 0x42ae2060

    goto :goto_0

    .line 4
    :sswitch_6
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a77\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ad

    const v5, 0x303705f4

    xor-int/2addr v4, v5

    const v5, -0x2c693302

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b1b

    const v5, 0x5d66629e

    xor-int/2addr v4, v5

    const v5, -0x426aed8d

    goto/16 :goto_0

    .line 3
    :sswitch_8
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f69

    const v5, -0x2c135532

    xor-int/2addr v4, v5

    const v5, -0x5492cad8

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-eqz v3, :cond_4

    :goto_1
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x744f

    const v5, -0x1c309f95

    xor-int/2addr v4, v5

    const v5, 0x457c7106

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a76\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x556d

    const v5, -0x56c699ff

    xor-int/2addr v4, v5

    const v5, -0x67ce8272

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a77\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f5

    const v5, 0x9dbee6e

    xor-int/2addr v4, v5

    const v5, 0x3c0b7737

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_7

    :cond_6
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ecb

    const v5, 0x702e4008

    xor-int/2addr v4, v5

    const v5, -0x580dfcf3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c29

    const v5, -0x7ffcacf2

    xor-int/2addr v4, v5

    const v5, 0x111bb7e4

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a47

    const v5, 0x220f9a7c

    xor-int/2addr v4, v5

    const v5, -0xfa94a67

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7b\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x644d

    const v5, 0x423cd77d

    xor-int/2addr v4, v5

    const v5, 0x4052fdc4

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x288b

    const v5, -0x5c8a8f09

    xor-int/2addr v4, v5

    const v5, 0x4290b26f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f4f

    const v5, -0x7da8fca2

    xor-int/2addr v4, v5

    const v5, 0x7ae5b176

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۗ᩹֫;->ܰ:Ll/ۢ᩹֫;

    iput p2, p0, Ll/ۗ᩹֫;->᩶:I

    .line 4
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u1a76\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fa7

    const v5, 0x3f6aa39c

    xor-int/2addr v4, v5

    const v5, 0x2797b4e5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2361

    const v5, 0x103a69a8

    xor-int/2addr v4, v5

    const v5, -0x2f38b83f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73fb388f -> :sswitch_a
        -0x7061ee28 -> :sswitch_4
        -0x62cae701 -> :sswitch_2
        -0x5ee87644 -> :sswitch_9
        -0x5a9b880a -> :sswitch_c
        -0x58b9a9a3 -> :sswitch_5
        -0x55af84da -> :sswitch_d
        -0x53ca5fd3 -> :sswitch_4
        -0x3c3f785d -> :sswitch_7
        -0x33fb7a08 -> :sswitch_5
        -0x3163bfd6 -> :sswitch_d
        -0x2e05f0fe -> :sswitch_7
        -0x2070544d -> :sswitch_2
        -0x76b9f5c -> :sswitch_8
        -0x5966847 -> :sswitch_8
        0x44ba81e -> :sswitch_0
        0x6af374a -> :sswitch_9
        0x1510af26 -> :sswitch_b
        0x1d14407a -> :sswitch_e
        0x243b0115 -> :sswitch_c
        0x2d9bb9b6 -> :sswitch_e
        0x3207b0ce -> :sswitch_6
        0x3aed1a46 -> :sswitch_3
        0x4572dfa0 -> :sswitch_0
        0x5034d916 -> :sswitch_3
        0x61639e2a -> :sswitch_6
        0x6659b73f -> :sswitch_1
        0x6c0eec95 -> :sswitch_a
        0x6e351a12 -> :sswitch_1
        0x7bfcdf48 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x13b08c5

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v6, "\u06df\u06e1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4751

    const v8, -0x6f49828f

    xor-int/2addr v7, v8

    const v8, -0x74598d7f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x79d1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_5

    :sswitch_0
    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v6, :cond_b

    goto/16 :goto_4

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :sswitch_2
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v6, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v6, "\u06dc\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6d29

    const v8, -0x1d9868a1

    xor-int/2addr v7, v8

    const v8, -0x1ee11143

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_2

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    return-void

    .line 0
    :sswitch_5
    iget v3, p0, Ll/ۗ᩹֫;->᩶:I

    iget-object v4, p0, Ll/ۗ᩹֫;->ܿ:Ljava/lang/Runnable;

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۢ᩹֫;->ۙ(Ll/ۢ᩹֫;ILjava/lang/Runnable;ZLjava/lang/Runnable;)V

    return-void

    :sswitch_6
    iget-object v2, p0, Ll/ۗ᩹֫;->ܰ:Ll/ۢ᩹֫;

    .line 4
    sget v6, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u06df\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x79bf

    const v8, 0x1ad283fc

    xor-int/2addr v7, v8

    const v8, 0x6c62c8a8

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v1, p0, Ll/ۗ᩹֫;->۟:Ljava/lang/Runnable;

    .line 1
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u073f\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x79

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2bb5

    const v8, -0x2be9bd33

    xor-int/2addr v7, v8

    const v8, -0x255628c6

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u06e8\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x409d

    const v8, 0x1ef135bb

    xor-int/2addr v7, v8

    const v8, -0x458c3998

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget-boolean v6, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u06da\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x65

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1e2f

    const v8, 0x15655f2c

    xor-int/2addr v7, v8

    const v8, -0x62d407a2

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_5

    :goto_2
    const-string v6, "\u06e8\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2853

    const v8, -0x229d9c77

    xor-int/2addr v7, v8

    const v8, -0x1383206

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06e0\u05a1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4f97

    const v8, 0x1baa69dc

    xor-int/2addr v7, v8

    const v8, -0x623fbdee

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06db\u06db"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3481

    const v8, 0x2ed5320a

    xor-int/2addr v7, v8

    const v8, -0x4c26891

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    const-string v6, "\u06df\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2bdb

    const v8, -0x1fa31ea1

    xor-int/2addr v7, v8

    const v8, -0x5bd4de2e

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_8

    :goto_3
    const-string v6, "\u06d8\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1a4f

    const v8, 0x2d996373

    xor-int/2addr v7, v8

    const v8, 0x1764eed3

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06e1\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2c93

    const v8, -0x46d314c6

    xor-int/2addr v7, v8

    const v8, 0x672d16cb

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u06dc\u06da"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1f31

    const v8, -0x2557cabd

    xor-int/2addr v7, v8

    const v8, -0x2ba5ec94

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a79\u06df"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x14b5

    const v8, -0x3c0b8c4c

    xor-int/2addr v7, v8

    const v8, -0x457fc3a6

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-boolean v0, p0, Ll/ۗ᩹֫;->֡:Z

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v6

    if-ltz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06dc\u1a76"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x51

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x111d

    const v8, -0x7d3959b6

    xor-int/2addr v7, v8

    const v8, 0x323145e

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e1\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x142b

    const v8, -0x2a7e7a7d

    xor-int/2addr v7, v8

    const v8, -0x40661d1c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6fb030a7 -> :sswitch_c
        -0x5e959e1a -> :sswitch_e
        -0x57437b5f -> :sswitch_b
        -0x4b8b0621 -> :sswitch_a
        -0x46c7565a -> :sswitch_1
        -0x4096799c -> :sswitch_7
        -0x3acbd3f8 -> :sswitch_3
        -0x2b45b0a0 -> :sswitch_a
        -0x2987bc3c -> :sswitch_2
        -0x1fd47508 -> :sswitch_6
        -0xdcc84ba -> :sswitch_9
        -0xac550b6 -> :sswitch_7
        -0x8ed1814 -> :sswitch_0
        -0x1b2fcb8 -> :sswitch_d
        0x15a9c70 -> :sswitch_e
        0x814ae2a -> :sswitch_2
        0x16c333c2 -> :sswitch_c
        0x2506ae91 -> :sswitch_4
        0x36fc8f46 -> :sswitch_9
        0x3a238c51 -> :sswitch_5
        0x3da8fd59 -> :sswitch_0
        0x42e42d73 -> :sswitch_6
        0x43c53dfe -> :sswitch_8
        0x4852107b -> :sswitch_b
        0x6ea947ed -> :sswitch_5
        0x718e1bb9 -> :sswitch_4
        0x727daae7 -> :sswitch_3
        0x764462ef -> :sswitch_1
        0x780794c6 -> :sswitch_d
        0x7f47184c -> :sswitch_8
    .end sparse-switch
.end method
