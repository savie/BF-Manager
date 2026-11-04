.class public final synthetic Ll/ܺۗ֫;
.super Ljava/lang/Object;
.source "82RX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Z

.field public final synthetic ܰ:Ll/ۛۗ֫;

.field public final synthetic ܿ:Ljava/lang/Runnable;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(ILl/ۛۗ֫;Ljava/lang/Runnable;Z)V
    .locals 6

    const v0, -0x3c685852    # -303.31f

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    sget v2, Ll/᩺;->۫۬۫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f9

    const v5, 0x6371c04a

    xor-int/2addr v4, v5

    const v5, -0x7306e709

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xd1b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_5

    goto/16 :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_4

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x39d7

    const v5, 0x7db4e674

    xor-int/2addr v4, v5

    const v5, 0x2e248c2a

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_3

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܺۗ֫;->ܿ:Ljava/lang/Runnable;

    iput-boolean p4, p0, Ll/ܺۗ֫;->֡:Z

    return-void

    :sswitch_6
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06d9\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1217

    const v5, -0x6fc87c91

    xor-int/2addr v4, v5

    const v5, 0x4ab20c4f    # 5834279.5f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5247

    const v5, -0x6f897ac0

    xor-int/2addr v4, v5

    const v5, 0xd389b57

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d9\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c03

    const v5, 0x6b4effab

    xor-int/2addr v4, v5

    const v5, 0x3a628d73

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70f7

    const v5, 0x62cee61a

    xor-int/2addr v4, v5

    const v5, 0x2b35a65d

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a79\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2177

    const v5, 0x59fe21f6

    xor-int/2addr v4, v5

    const v5, 0x6c86274a

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e0\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ad1

    const v5, -0x1528f3c0

    xor-int/2addr v4, v5

    const v5, -0x68652ca4    # -1.0005371E-24f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u05a8\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63c9

    const v5, -0x71d1bada

    xor-int/2addr v4, v5

    const v5, -0x2d497e81

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_8

    :goto_2
    const-string v3, "\u06e2\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6db

    const v5, 0x4bdaaf55    # 2.8663466E7f

    xor-int/2addr v4, v5

    const v5, -0x51a85c78

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4da1

    const v5, 0x2ac55fba

    xor-int/2addr v4, v5

    const v5, 0x75978144

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_9

    :goto_3
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x34a7

    const v5, 0x3884eb46

    xor-int/2addr v4, v5

    const v5, 0x1932dc2a

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06da\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4b47

    const v5, 0x29d36ab3

    xor-int/2addr v4, v5

    const v5, 0x984c893

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4cbd

    const v5, -0x4ad4d76a

    xor-int/2addr v4, v5

    const v5, 0x2a8a8274

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p2, p0, Ll/ܺۗ֫;->ܰ:Ll/ۛۗ֫;

    iput p1, p0, Ll/ܺۗ֫;->᩶:I

    .line 2
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59e5

    const v5, -0x22250cdb

    xor-int/2addr v4, v5

    const v5, -0x18610ffb

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1ab

    const v5, 0x7edfd814

    xor-int/2addr v4, v5

    const v5, 0x28f63101

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f71e35e -> :sswitch_7
        -0x7ec0de89 -> :sswitch_e
        -0x6fd98cf9 -> :sswitch_c
        -0x6878b855 -> :sswitch_6
        -0x61b36aec -> :sswitch_0
        -0x26209b4c -> :sswitch_a
        -0x2282ba64 -> :sswitch_1
        -0x22415fda -> :sswitch_1
        -0x19a7fa1d -> :sswitch_b
        -0x17aa9b2b -> :sswitch_9
        -0x16eae8c0 -> :sswitch_5
        -0x14f0723c -> :sswitch_3
        -0x9123bc2 -> :sswitch_4
        -0x7b91c9a -> :sswitch_b
        -0x196e2d7 -> :sswitch_d
        0xd21970d -> :sswitch_e
        0x14c4e438 -> :sswitch_3
        0x29aa880e -> :sswitch_d
        0x32551e2d -> :sswitch_7
        0x33a7ac8f -> :sswitch_0
        0x342cfadc -> :sswitch_8
        0x3d55adcc -> :sswitch_5
        0x4816b25a -> :sswitch_c
        0x4f7409be -> :sswitch_a
        0x58137d8d -> :sswitch_2
        0x5c177fe1 -> :sswitch_2
        0x683d794a -> :sswitch_4
        0x695e53ed -> :sswitch_8
        0x7e67ec30 -> :sswitch_6
        0x7edf57f3 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x589ca497

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v5, "\u06e8\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa07

    const v7, -0x27f5217c

    xor-int/2addr v6, v7

    const v7, 0x52f52e75

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x64f5

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 4
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_a

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    .line 1
    :sswitch_1
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v5, :cond_b

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v5, "\u1a75\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x747b

    const v7, -0x75a3c10f

    xor-int/2addr v6, v7

    const v7, -0x7f8c5fc1

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_3

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 0
    :sswitch_5
    iget v2, p0, Ll/ܺۗ֫;->᩶:I

    iget-object v3, p0, Ll/ܺۗ֫;->ܰ:Ll/ۛۗ֫;

    invoke-static {v2, v3, v0, v1}, Ll/ۛۗ֫;->ۙ(ILl/ۛۗ֫;Ljava/lang/Runnable;Z)V

    return-void

    :sswitch_6
    iget-boolean v1, p0, Ll/ܺۗ֫;->֡:Z

    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06eb\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4b61

    const v7, -0x402953c1

    xor-int/2addr v6, v7

    const v7, 0x75fd61ed

    goto :goto_0

    :sswitch_7
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06e4\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7a67

    const v7, 0x798c149b

    xor-int/2addr v6, v7

    const v7, 0x67d362dc

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06d8\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x9d5

    const v7, 0x9e6a16a

    xor-int/2addr v6, v7

    const v7, -0x67c6b28e

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_5

    :cond_4
    :goto_2
    const-string v5, "\u1a7a\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x107d

    const v7, 0x39abe101

    xor-int/2addr v6, v7

    const v7, 0x2b2916ef

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06dc\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1997

    const v7, -0xd9fe53a

    xor-int/2addr v6, v7

    const v7, 0x3cc09edc

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u1a79\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x68c9

    const v7, 0xd4e394b

    xor-int/2addr v6, v7

    const v7, 0x14478b2

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u06e7\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7781

    const v7, 0x3c1bcabd

    xor-int/2addr v6, v7

    const v7, 0x382ad19b

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u1a77\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x78bd

    const v7, -0x60890108

    xor-int/2addr v6, v7

    const v7, 0x2cfc22cc

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v5

    if-nez v5, :cond_9

    :goto_3
    const-string v5, "\u0730\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5d19

    const v7, -0x4055b5

    xor-int/2addr v6, v7

    const v7, -0x3d8d073a

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e8\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x71c5

    const v7, -0x1fd443b0

    xor-int/2addr v6, v7

    const v7, 0x77a577e8

    goto/16 :goto_0

    :goto_4
    const-string v5, "\u1a7a\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3ad7

    const v7, 0x68557ee

    xor-int/2addr v6, v7

    const v7, 0x56ff94ba

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xf3f

    const v7, 0x60e1da9e

    xor-int/2addr v6, v7

    const v7, 0x1e7b0055

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ܺۗ֫;->ܿ:Ljava/lang/Runnable;

    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06e2\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x69f

    const v7, -0x3155af70

    xor-int/2addr v6, v7

    const v7, -0x22cfa9dd

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06df\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x101f

    const v7, 0x7c65ff87

    xor-int/2addr v6, v7

    const v7, 0x238d2523

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bf614e8 -> :sswitch_7
        -0x7991e5bd -> :sswitch_9
        -0x78d0551a -> :sswitch_4
        -0x6a30086a -> :sswitch_1
        -0x5414fc40 -> :sswitch_0
        -0x50fe6488 -> :sswitch_a
        -0x4ee5854c -> :sswitch_8
        -0x4ebce4cd -> :sswitch_a
        -0x4c01c020 -> :sswitch_d
        -0x496f19e5 -> :sswitch_6
        -0x4365d695 -> :sswitch_7
        -0x279e528e -> :sswitch_3
        -0x1f71c583 -> :sswitch_c
        -0x1d29d570 -> :sswitch_5
        -0x1d27e483 -> :sswitch_d
        -0x133acd7f -> :sswitch_0
        -0x112b2875 -> :sswitch_3
        0xf899265 -> :sswitch_1
        0x2422f725 -> :sswitch_9
        0x29cb8c2c -> :sswitch_b
        0x337f7278 -> :sswitch_2
        0x4108cde3 -> :sswitch_b
        0x43702dc6 -> :sswitch_6
        0x4a1b1c35 -> :sswitch_2
        0x539225cc -> :sswitch_e
        0x56816b80 -> :sswitch_4
        0x643765ad -> :sswitch_c
        0x6c01b437 -> :sswitch_8
        0x6e2725a5 -> :sswitch_e
        0x7b7f95c7 -> :sswitch_5
    .end sparse-switch
.end method
