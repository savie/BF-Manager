.class public final synthetic Ll/ܶۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/content/Intent;)V
    .locals 6

    const v0, -0x5da20c23

    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6789

    const v5, 0x6d8b13c8

    xor-int/2addr v4, v5

    const v5, -0x660cf7e7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x678d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_a

    goto :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49ab

    const v5, 0x149ddeb6

    xor-int/2addr v4, v5

    const v5, 0x6d589b4e

    goto :goto_0

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v3, :cond_6

    goto :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    :goto_2
    const-string v3, "\u1a7b\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6863

    const v5, 0x41519f19

    xor-int/2addr v4, v5

    const v5, 0x6aaf4542

    goto :goto_0

    .line 2
    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ܶۜ֫;->᩶:Landroid/content/Intent;

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x62f1

    const v5, -0x75b634a5

    xor-int/2addr v4, v5

    const v5, 0x2d99181

    goto/16 :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x69fb

    const v5, 0x570fff8f

    xor-int/2addr v4, v5

    const v5, -0x1ba458c1

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x33e7

    const v5, 0x115b3b9c

    xor-int/2addr v4, v5

    const v5, 0x49f962c7

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xae7

    const v5, 0x64ab9c52

    xor-int/2addr v4, v5

    const v5, 0x6708b0c9

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x442f

    const v5, 0x2307947b

    xor-int/2addr v4, v5

    const v5, -0x3d944cc9

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06df\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x793

    const v5, -0x37cdcd77

    xor-int/2addr v4, v5

    const v5, 0x3ce9dc29

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d07

    const v5, 0x4699d958

    xor-int/2addr v4, v5

    const v5, -0x2034de95

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e0\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6719

    const v5, -0x54aedf3

    xor-int/2addr v4, v5

    const v5, -0x3e87fe1f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_9

    goto :goto_5

    :cond_9
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59d

    const v5, 0x5e4e121f

    xor-int/2addr v4, v5

    const v5, 0x405fbd14

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e7\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x49a1

    const v5, -0x2beae476

    xor-int/2addr v4, v5

    const v5, 0x68ae1195

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a1\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fc3

    const v5, -0x6cf4bfdf

    xor-int/2addr v4, v5

    const v5, -0x9abfb88

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܶۜ֫;->ܰ:Lbin/mt/plus/Main;

    .line 4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_5
    const-string v3, "\u0730\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3055

    const v5, 0x684c2e9a

    xor-int/2addr v4, v5

    const v5, -0x2030f6f3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d33

    const v5, 0x30bf46e9

    xor-int/2addr v4, v5

    const v5, -0x30c8d8d3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7679bed2 -> :sswitch_9
        -0x756a098c -> :sswitch_a
        -0x6d6025b4 -> :sswitch_7
        -0x6c61bb62 -> :sswitch_5
        -0x5d8771a8 -> :sswitch_c
        -0x45fb2012 -> :sswitch_1
        -0x407ccc89 -> :sswitch_7
        -0x2f67ce86 -> :sswitch_0
        -0x1870aee3 -> :sswitch_3
        -0x10c3e4e9 -> :sswitch_1
        -0xbf2996c -> :sswitch_9
        -0xa0d07bd -> :sswitch_8
        -0x9b734b5 -> :sswitch_e
        0x4ddf95 -> :sswitch_2
        0x18349b2 -> :sswitch_3
        0x1f3952b -> :sswitch_0
        0x14524a3c -> :sswitch_d
        0x21415544 -> :sswitch_4
        0x2194d457 -> :sswitch_4
        0x264d68f2 -> :sswitch_6
        0x2ce6a109 -> :sswitch_8
        0x2fcb4425 -> :sswitch_e
        0x34b1f786 -> :sswitch_2
        0x3bbcf44c -> :sswitch_a
        0x3eb7cdab -> :sswitch_6
        0x5cd755d1 -> :sswitch_c
        0x60e54074 -> :sswitch_d
        0x670b0f64 -> :sswitch_b
        0x7496f469 -> :sswitch_b
        0x7839b9bc -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x53a7761d

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v4, "\u0730\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x529

    const v6, -0xb425e27

    xor-int/2addr v5, v6

    const v6, -0x2f03c8f4

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x273

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1926
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 1927
    iget-object v1, p0, Ll/ܶۜ֫;->ܰ:Lbin/mt/plus/Main;

    invoke-static {v1, v0}, Ll/۫᩶ᩴ;->ۙ(Ll/ܶ֡֫;Landroid/net/Uri;)V

    return-void

    .line 1777
    :sswitch_0
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_9

    goto/16 :goto_4

    .line 634
    :sswitch_1
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06d7\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d73

    const v6, 0x1eee7bb8

    xor-int/2addr v5, v6

    const v6, -0xe9978a5

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v4

    if-gtz v4, :cond_b

    goto/16 :goto_1

    .line 821
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    return-void

    .line 1926
    :sswitch_5
    iget-object v0, p0, Ll/ܶۜ֫;->᩶:Landroid/content/Intent;

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a78\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x48df

    const v6, 0x3246d59b

    xor-int/2addr v5, v6

    const v6, -0xc029cd8

    goto :goto_0

    :sswitch_6
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u1a75\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x791

    const v6, -0x31b83251

    xor-int/2addr v5, v6

    const v6, -0x6054b740

    goto/16 :goto_0

    .line 138
    :sswitch_7
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06df\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x323

    const v6, -0x41e7ed9d

    xor-int/2addr v5, v6

    const v6, -0x5022ac7f

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06e2\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x82b

    const v6, 0x5d5c23bb

    xor-int/2addr v5, v6

    const v6, 0x7a69bda

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06d9\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xb8f

    const v6, 0x9d12163

    xor-int/2addr v5, v6

    const v6, -0x7875355e

    goto/16 :goto_0

    .line 501
    :sswitch_a
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u1a74\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7fcb

    const v6, 0x3e1312cc

    xor-int/2addr v5, v6

    const v6, 0x520ad260

    goto/16 :goto_0

    .line 521
    :sswitch_b
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v4

    if-eqz v4, :cond_7

    :goto_1
    const-string v4, "\u06e7\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13a5

    const v6, -0x7dc5ecc5

    xor-int/2addr v5, v6

    const v6, -0x483ddc8a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d9\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6729

    const v6, 0x3cc7afd7

    xor-int/2addr v5, v6

    const v6, -0x4e782a6a

    goto/16 :goto_0

    .line 1113
    :sswitch_c
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_8

    :goto_2
    const-string v4, "\u05ab\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7cd5

    const v6, -0x69a272cd

    xor-int/2addr v5, v6

    const v6, -0x46ab2f54

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x30b3

    const v6, -0x45b76f2f

    xor-int/2addr v5, v6

    const v6, -0x683b568b

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06df\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x36d5

    const v6, -0x5f838860

    xor-int/2addr v5, v6

    const v6, -0x5344c272

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a77\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ecf

    const v6, -0x3a201b16

    xor-int/2addr v5, v6

    const v6, 0x5c56dd94

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Lbin/mt/plus/Main;->ܳۤ:I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xacf

    const v6, 0x3cf2b5d8

    xor-int/2addr v5, v6

    const v6, -0x38e7dca8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e1\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3b15

    const v6, -0x5201a5cd

    xor-int/2addr v5, v6

    const v6, 0x3accb64e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f019b5a -> :sswitch_c
        -0x76e477bd -> :sswitch_7
        -0x76ce4139 -> :sswitch_4
        -0x73cba6d4 -> :sswitch_1
        -0x68ff637b -> :sswitch_0
        -0x67e0a86d -> :sswitch_a
        -0x62316750 -> :sswitch_9
        -0x6003eeb2 -> :sswitch_6
        -0x5d258ec2 -> :sswitch_6
        -0x58483d09 -> :sswitch_8
        -0x56c8a2b1 -> :sswitch_b
        -0x2701cf12 -> :sswitch_2
        -0x1d4539d5 -> :sswitch_5
        -0x16215763 -> :sswitch_7
        -0x13001dff -> :sswitch_4
        -0x11f070d8 -> :sswitch_e
        -0x117f5f5b -> :sswitch_3
        -0x1061f229 -> :sswitch_1
        0x66649f9 -> :sswitch_2
        0x8319470 -> :sswitch_3
        0x10950094 -> :sswitch_8
        0x1354335e -> :sswitch_d
        0x2e7e1461 -> :sswitch_0
        0x30cc94d3 -> :sswitch_9
        0x3ee1b4ef -> :sswitch_e
        0x40f8e997 -> :sswitch_a
        0x62a6d217 -> :sswitch_c
        0x75f8bb57 -> :sswitch_5
        0x7c3c0d02 -> :sswitch_b
        0x7cb6845d -> :sswitch_d
    .end sparse-switch
.end method
