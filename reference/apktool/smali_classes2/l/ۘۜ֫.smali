.class public final synthetic Ll/ۘۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Ljava/lang/Runnable;)V
    .locals 6

    const v0, 0x7b991636

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073f\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1efb

    const v5, 0x578fee1f

    xor-int/2addr v4, v5

    const v5, 0x41edc864

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3055

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_1

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_8

    goto/16 :goto_4

    :sswitch_2
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_4

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ۘۜ֫;->᩶:Ljava/lang/Runnable;

    return-void

    :sswitch_5
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x774b

    const v5, -0x60d82b3c

    xor-int/2addr v4, v5

    const v5, 0x917daa2

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x286f

    const v5, -0x410b5c47

    xor-int/2addr v4, v5

    const v5, 0x646c00a9

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06d6\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x53b

    const v5, 0x34e59bf6

    xor-int/2addr v4, v5

    const v5, -0x30e7af72

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u06df\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1239

    const v5, 0x204e5d4e

    xor-int/2addr v4, v5

    const v5, -0x4e4d71e6

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d8\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x13f

    const v5, 0x37b6fec7

    xor-int/2addr v4, v5

    const v5, -0x6602a9c2

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05ab\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x347b

    const v5, 0x3efdeba9

    xor-int/2addr v4, v5

    const v5, 0x51b74279

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_6

    :goto_2
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x53b5

    const v5, -0x1148a6c6

    xor-int/2addr v4, v5

    const v5, 0x9ae58bf

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x959

    const v5, -0x4550dc32

    xor-int/2addr v4, v5

    const v5, 0x18ac8dbd

    goto/16 :goto_0

    .line 3
    :sswitch_b
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2459

    const v5, -0x6058d72c

    xor-int/2addr v4, v5

    const v5, -0x2c964b91

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_9

    :cond_8
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e85

    const v5, 0x379638d0

    xor-int/2addr v4, v5

    const v5, 0x69b9ca56

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2249

    const v5, -0x56011071

    xor-int/2addr v4, v5

    const v5, -0x13ac3358

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u073a\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x60c1

    const v5, -0x63e1b8ba

    xor-int/2addr v4, v5

    const v5, -0x8d32e2

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0733\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70c5

    const v5, -0xb7af346

    xor-int/2addr v4, v5

    const v5, -0xbef2468

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۘۜ֫;->ܰ:Lbin/mt/plus/Main;

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u073d\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x524d

    const v5, 0x2f52b1b0

    xor-int/2addr v4, v5

    const v5, -0x5c51e92c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x54f

    const v5, 0x6937b520

    xor-int/2addr v4, v5

    const v5, 0x6898f25f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78bbc946 -> :sswitch_d
        -0x74f5f540 -> :sswitch_5
        -0x6de7dd17 -> :sswitch_7
        -0x668588d6 -> :sswitch_6
        -0x6631741c -> :sswitch_0
        -0x587b01ef -> :sswitch_e
        -0x51cef3b5 -> :sswitch_e
        -0x419428b2 -> :sswitch_8
        -0x402f769e -> :sswitch_1
        -0x37398b3c -> :sswitch_3
        -0x2fe70cdc -> :sswitch_8
        -0x2a8928cf -> :sswitch_b
        -0x1c7bf0d0 -> :sswitch_1
        -0x15a1644e -> :sswitch_6
        -0xacacc7f -> :sswitch_d
        -0xa8de37c -> :sswitch_2
        0x38f16ff -> :sswitch_b
        0xad8d41d -> :sswitch_5
        0x12a553ad -> :sswitch_c
        0x1a325045 -> :sswitch_0
        0x21d337a6 -> :sswitch_4
        0x29384a01 -> :sswitch_a
        0x38a7ae47 -> :sswitch_4
        0x3cdf42d6 -> :sswitch_9
        0x43095a1f -> :sswitch_a
        0x58d2b30c -> :sswitch_2
        0x5e6e42ca -> :sswitch_3
        0x60b901b2 -> :sswitch_c
        0x7621ae9c -> :sswitch_7
        0x790c7901 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x40d97868

    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v6, "\u06dc\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2cb3

    const v8, -0xb233ed7

    xor-int/2addr v7, v8

    const v8, 0xd322a25

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3cbf

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 1039
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v6

    if-gtz v6, :cond_9

    goto/16 :goto_5

    .line 299
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_7

    goto/16 :goto_6

    .line 384
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v6, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v6, :cond_b

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v6, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v6, :cond_d

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    :goto_2
    const-string v6, "\u073d\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xd

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1cbb

    const v8, -0x5aa77d9f

    xor-int/2addr v7, v8

    const v8, 0x1c0b6381

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    :sswitch_5
    const/4 v3, 0x0

    .line 0
    invoke-static {v0, v2, v3, v1}, Ll/ܽۢ᩻;->ۙ(Ll/ܽ֡֫;ZZLjava/lang/Runnable;)V

    return-void

    :sswitch_6
    sget v2, Ll/֨ۢ᩻;->ᩴ:I

    const/4 v2, 0x1

    .line 1234
    sget v6, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u0733\u06dc"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3e67

    const v8, -0x4e184614

    xor-int/2addr v7, v8

    const v8, -0x57c2deea

    goto :goto_0

    .line 1267
    :sswitch_7
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_3

    :cond_1
    const-string v6, "\u0736\u06d8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3b33

    const v8, 0x1e1c12c2

    xor-int/2addr v7, v8

    const v8, -0x7ae8b987

    goto/16 :goto_0

    .line 1268
    :sswitch_8
    check-cast v1, Ll/ۘۡ֫;

    invoke-virtual {v1}, Ll/ۘۡ֫;->run()V

    return-void

    .line 1267
    :sswitch_9
    invoke-static {v0}, Ll/ۖ᩹;->ܿۚ֨(Ljava/lang/Object;)Z

    move-result v1

    iget-object v6, p0, Ll/ۘۜ֫;->᩶:Ljava/lang/Runnable;

    if-nez v1, :cond_2

    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v4

    mul-int/lit8 v1, v1, 0x49

    xor-int v7, v1, v5

    mul-int/lit16 v7, v7, -0x7469

    const v8, -0x29863084

    xor-int/2addr v7, v8

    const v8, -0x13acd45b

    xor-int/2addr v1, v8

    move-object v9, v6

    move v6, v1

    move-object v1, v9

    goto/16 :goto_1

    :cond_2
    move-object v1, v6

    :goto_3
    const-string v6, "\u1a77\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x29

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3a65

    const v8, -0x2a782502

    xor-int/2addr v7, v8

    const v8, -0xae76aa2

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Ll/ۘۜ֫;->ܰ:Lbin/mt/plus/Main;

    .line 98
    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u1a77\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x48ed

    const v8, 0x26a5db02

    xor-int/2addr v7, v8

    const v8, -0x5da48cd4

    goto/16 :goto_0

    .line 282
    :sswitch_b
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u06e7\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5641

    const v8, 0x5276bd1e

    xor-int/2addr v7, v8

    const v8, 0x63627a99

    goto/16 :goto_0

    .line 755
    :sswitch_c
    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u05a8\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4925

    const v8, 0x42ff1698

    xor-int/2addr v7, v8

    const v8, 0x45d6fb41

    goto/16 :goto_0

    .line 782
    :sswitch_d
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u06e7\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x191

    const v8, 0x44e4f44a

    xor-int/2addr v7, v8

    const v8, 0x14a99a24

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v6, :cond_8

    :cond_7
    const-string v6, "\u1a76\u06e1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x65

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3c9f

    const v8, 0x4bae62f

    xor-int/2addr v7, v8

    const v8, -0x128b7930

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06e0\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2f71

    const v8, 0x787bf6

    xor-int/2addr v7, v8

    const v8, -0x774f1849

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e8\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4135

    const v8, -0x660bf313

    xor-int/2addr v7, v8

    const v8, -0x4ac3ba38

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_a

    :goto_4
    const-string v6, "\u06dc\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6bad

    const v8, 0x5843aa8a

    xor-int/2addr v7, v8

    const v8, 0x658945a5

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a73\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7f51

    const v8, -0x71250248

    xor-int/2addr v7, v8

    const v8, -0x7607edb2

    goto/16 :goto_0

    .line 616
    :sswitch_10
    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06e0\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x1b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6b8d

    const v8, 0x110d392

    xor-int/2addr v7, v8

    const v8, -0x155161d9

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u05ab\u06d7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3095

    const v8, -0x3bc16673

    xor-int/2addr v7, v8

    const v8, -0x750d52e1

    goto/16 :goto_0

    .line 2
    :sswitch_11
    sget v6, Lbin/mt/plus/Main;->ܳۤ:I

    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_e

    :cond_d
    :goto_6
    const-string v6, "\u05a1\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x32e1

    const v8, -0x51888d9d

    xor-int/2addr v7, v8

    const v8, 0x494b7fe1

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06ec\u1a7a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x11cf

    const v8, 0x6a914dde

    xor-int/2addr v7, v8

    const v8, 0x9dea5f4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dea42e2 -> :sswitch_3
        -0x793f7216 -> :sswitch_b
        -0x790abe20 -> :sswitch_4
        -0x74e95ae5 -> :sswitch_0
        -0x71b27a1a -> :sswitch_10
        -0x711319d1 -> :sswitch_f
        -0x69caa594 -> :sswitch_3
        -0x60ea6db7 -> :sswitch_11
        -0x5f11821e -> :sswitch_2
        -0x5d6ab06a -> :sswitch_8
        -0x58c713aa -> :sswitch_9
        -0x53dcc55d -> :sswitch_5
        -0x51ea1c1b -> :sswitch_8
        -0x4ff265cb -> :sswitch_6
        -0x4798ec37 -> :sswitch_5
        -0x457271aa -> :sswitch_4
        -0x454d573b -> :sswitch_0
        -0x3ea6c720 -> :sswitch_7
        -0x34282905 -> :sswitch_c
        -0x2a7dc296 -> :sswitch_7
        -0x2a387248 -> :sswitch_1
        -0x295f3b3b -> :sswitch_10
        -0xba534ef -> :sswitch_e
        0x825cddf -> :sswitch_b
        0x102dab27 -> :sswitch_d
        0x1a2b7cf8 -> :sswitch_a
        0x2d46fea2 -> :sswitch_c
        0x4cf4f5f3 -> :sswitch_1
        0x5259ef21 -> :sswitch_11
        0x5a693024 -> :sswitch_6
        0x677c5bfd -> :sswitch_a
        0x6a420900 -> :sswitch_e
        0x6d5fcfe7 -> :sswitch_f
        0x7a7cef94 -> :sswitch_2
        0x7d26adf3 -> :sswitch_9
        0x7eb2a510 -> :sswitch_d
    .end sparse-switch
.end method
