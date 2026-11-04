.class public final synthetic Ll/ۗ۠֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/ܶۤۧ;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۠֫;->ܰ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 6

    const v0, -0x6d47dfce

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    sget v2, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v3, "\u05ab\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2eb7

    const v5, -0x74515558

    xor-int/2addr v4, v5

    const v5, -0x16616095

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x2aa1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_b

    goto/16 :goto_4

    .line 1
    :sswitch_1
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_9

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_7

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۗ۠֫;->ܰ:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۤ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06dc\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1091

    const v5, 0x15fab294

    xor-int/2addr v4, v5

    const v5, -0x54ec6390

    goto :goto_0

    :sswitch_7
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u073a\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30a9

    const v5, -0x2ccdd159

    xor-int/2addr v4, v5

    const v5, 0x795c1525

    goto :goto_0

    :sswitch_8
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_2

    :goto_1
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x492f

    const v5, -0x57204bf5

    xor-int/2addr v4, v5

    const v5, -0xdd17075

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x58c9

    const v5, -0x5a9bba1

    xor-int/2addr v4, v5

    const v5, 0x60772641

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073a\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5513

    const v5, 0x28ad3d9a

    xor-int/2addr v4, v5

    const v5, 0x70657c54

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06da\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f7f

    const v5, -0x37aea6a3

    xor-int/2addr v4, v5

    const v5, 0x2da94e46

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3bd7

    const v5, 0x60baefc9

    xor-int/2addr v4, v5

    const v5, -0x110ec3ed

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_6

    :goto_2
    const-string v3, "\u06da\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x11e9

    const v5, -0x7726f3d3

    xor-int/2addr v4, v5

    const v5, -0x6026eda2

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c01

    const v5, -0x68846db1

    xor-int/2addr v4, v5

    const v5, 0xc2dc313

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u05ab\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x309b

    const v5, -0x52f5bd97

    xor-int/2addr v4, v5

    const v5, 0x564838be

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x89d

    const v5, 0x5b59ed55

    xor-int/2addr v4, v5

    const v5, 0x36b1874d

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u0730\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4beb

    const v5, 0xc0ffd7f

    xor-int/2addr v4, v5

    const v5, 0x46c1ec10

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d11

    const v5, -0x75f6df85

    xor-int/2addr v4, v5

    const v5, 0x2c7e4ad1

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7fd9

    const v5, -0x14084b6

    xor-int/2addr v4, v5

    const v5, 0x348979dc

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xfb3

    const v5, 0x2ab7a1ff

    xor-int/2addr v4, v5

    const v5, 0x6936aba2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73ce8e51 -> :sswitch_4
        -0x6bed6090 -> :sswitch_c
        -0x69f29554 -> :sswitch_0
        -0x6420443f -> :sswitch_e
        -0x5be191f8 -> :sswitch_1
        -0x3874cc85 -> :sswitch_0
        -0x24d78b82 -> :sswitch_3
        -0x24b1e6e2 -> :sswitch_a
        -0x2473c7df -> :sswitch_8
        -0x214af58b -> :sswitch_6
        -0x1e3cb58b -> :sswitch_3
        -0x178e385e -> :sswitch_5
        -0x1556b456 -> :sswitch_9
        -0x5fb48f7 -> :sswitch_d
        -0x16358f5 -> :sswitch_d
        0x8d0fbda -> :sswitch_b
        0x11f0e9a1 -> :sswitch_1
        0x1d76e2d4 -> :sswitch_4
        0x210e0949 -> :sswitch_6
        0x28376033 -> :sswitch_8
        0x3109cee9 -> :sswitch_2
        0x3992e601 -> :sswitch_b
        0x4278f35e -> :sswitch_7
        0x4ae42d16 -> :sswitch_2
        0x55c8048a -> :sswitch_7
        0x5cba404f -> :sswitch_c
        0x5ce30032 -> :sswitch_5
        0x6140cf94 -> :sswitch_a
        0x74a81227 -> :sswitch_e
        0x75fb6f8e -> :sswitch_9
    .end sparse-switch
.end method
