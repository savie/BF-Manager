.class public final Ll/ܽ᩸ۘ;
.super Ljava/lang/Object;
.source "V60Y"


# instance fields
.field public final ۙ:Ljava/lang/Class;

.field public final ܰ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 6

    const v0, 0x7032955c

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    sget v2, Ll/֨ۧ;->֫۠֡:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31ad

    const v5, 0x29dcc4ab

    xor-int/2addr v4, v5

    const v5, -0x3a783c19

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3e3b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 83
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_2

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_8

    goto/16 :goto_1

    .line 139
    :sswitch_1
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v3, :cond_4

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 147
    :sswitch_4
    iput-object p2, p0, Ll/ܽ᩸ۘ;->ܰ:Ljava/lang/Object;

    return-void

    .line 135
    :sswitch_5
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e4\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x62db

    const v5, 0x75366f95

    xor-int/2addr v4, v5

    const v5, -0x51b8f140

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x462b

    const v5, 0xef5aaec

    xor-int/2addr v4, v5

    const v5, 0x26ddb7be

    goto :goto_0

    .line 87
    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const-string v3, "\u06d9\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7917

    const v5, -0x754dad82

    xor-int/2addr v4, v5

    const v5, -0x2848cb58

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a8f

    const v5, -0x7c7116cc

    xor-int/2addr v4, v5

    const v5, -0x78249d72

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f6d

    const v5, 0x62a9baa1

    xor-int/2addr v4, v5

    const v5, 0x5a011f3e

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c7

    const v5, -0x695a654f

    xor-int/2addr v4, v5

    const v5, 0x73429558

    goto/16 :goto_0

    .line 49
    :sswitch_9
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u06e1\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14c9

    const v5, -0x5528d321

    xor-int/2addr v4, v5

    const v5, 0x62cd4e48

    goto/16 :goto_0

    .line 53
    :sswitch_a
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_7

    goto :goto_1

    :cond_7
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63dd

    const v5, -0x2e43e13a

    xor-int/2addr v4, v5

    const v5, 0x7623d874

    goto/16 :goto_0

    .line 72
    :sswitch_b
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_9

    :cond_8
    const-string v3, "\u06e2\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c49

    const v5, 0x13958664

    xor-int/2addr v4, v5

    const v5, 0x301d3955

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4749

    const v5, -0x3b27772

    xor-int/2addr v4, v5

    const v5, 0x180bb62f

    goto/16 :goto_0

    .line 130
    :sswitch_c
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_a

    :goto_1
    const-string v3, "\u1a7b\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x729b

    const v5, 0x64bbbdf1

    xor-int/2addr v4, v5

    const v5, -0x1248e520

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4059

    const v5, -0x72989938

    xor-int/2addr v4, v5

    const v5, -0x24e8502

    goto/16 :goto_0

    .line 108
    :sswitch_d
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_b

    goto :goto_2

    :cond_b
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c0f

    const v5, -0x55e4e825

    xor-int/2addr v4, v5

    const v5, 0x7b97f624

    goto/16 :goto_0

    .line 146
    :sswitch_e
    iput-object p1, p0, Ll/ܽ᩸ۘ;->ۙ:Ljava/lang/Class;

    .line 61
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_c

    :goto_2
    const-string v3, "\u05a1\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2e99

    const v5, -0x28e5975f

    xor-int/2addr v4, v5

    const v5, 0x5472c375

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x141d

    const v5, -0x1b7cbfe3

    xor-int/2addr v4, v5

    const v5, -0x65fe72a3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73450657 -> :sswitch_8
        -0x7059278e -> :sswitch_a
        -0x6bc8fc0c -> :sswitch_4
        -0x67f2701a -> :sswitch_b
        -0x5fc4f37d -> :sswitch_e
        -0x5ce6b1ad -> :sswitch_3
        -0x4078508d -> :sswitch_e
        -0x3c23d53e -> :sswitch_0
        -0x37378573 -> :sswitch_b
        -0x1f1a7dd4 -> :sswitch_0
        -0x12f703e1 -> :sswitch_c
        -0x12cb715e -> :sswitch_7
        -0x7731f61 -> :sswitch_4
        -0x42874d -> :sswitch_d
        0x7e5cc9 -> :sswitch_d
        0x813ead5 -> :sswitch_6
        0xd50e166 -> :sswitch_2
        0x16fd8772 -> :sswitch_7
        0x2b67d7fc -> :sswitch_9
        0x35870284 -> :sswitch_6
        0x3fbdfc7e -> :sswitch_2
        0x4019cef4 -> :sswitch_1
        0x4361700b -> :sswitch_5
        0x46992f05 -> :sswitch_9
        0x5db8dd89 -> :sswitch_a
        0x663f2a49 -> :sswitch_5
        0x672d89c1 -> :sswitch_c
        0x6f2807f4 -> :sswitch_1
        0x72d080cf -> :sswitch_8
        0x7a1a74fd -> :sswitch_3
    .end sparse-switch
.end method
