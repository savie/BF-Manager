.class public final Ll/᩹᩶֫;
.super Ll/ۗۡۘ;
.source "P418"


# static fields
.field private static final ۡۗۘ:[S


# instance fields
.field public final ۤ:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹᩶֫;->ۡۗۘ:[S

    return-void

    :array_0
    .array-data 2
        0xfe5s
        0x3952s
        0x3909s
        0x3918s
        0x390es
        0x3909s
        0x3953s
        0x3917s
        0x391cs
        0x390bs
        0x391cs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 7

    const v0, 0x1cf2edcd

    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    sget-object v3, Ll/᩹᩶֫;->ۡۗۘ:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    mul-int v4, v3, v3

    const v5, 0x3abce4

    add-int/2addr v4, v5

    mul-int/lit16 v3, v3, 0xf54

    sub-int/2addr v4, v3

    if-gez v4, :cond_0

    const/16 v3, 0x7b65

    goto :goto_0

    :cond_0
    const/16 v3, 0x397d

    :goto_0
    sget-object v4, Ll/᩹᩶֫;->ۡۗۘ:[S

    const/4 v5, 0x1

    const/16 v6, 0xa

    invoke-static {v4, v5, v6, v3}, Ll/֡ۖ;->ܰᩴۢ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 222
    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    sget-object v4, Ll/ܽۡۘ;->ᩳ:Ll/ܽۡۘ;

    invoke-direct {p0, v3, v4}, Ll/ۗۡۘ;-><init>(Ljava/net/URI;Ll/ܽۡۘ;)V

    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5cbb

    const v5, -0x12edde48

    xor-int/2addr v4, v5

    const v5, -0x12146d3c

    :goto_1
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1ba3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_3

    :sswitch_2
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v3, :cond_5

    goto/16 :goto_3

    .line 37
    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :sswitch_6
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a73\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b9f

    const v5, -0x13567119

    xor-int/2addr v4, v5

    const v5, 0x2ead7df3

    goto :goto_1

    .line 158
    :sswitch_7
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06d6\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f71

    const v5, 0x27197633

    xor-int/2addr v4, v5

    const v5, -0x61f3009b

    goto :goto_1

    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06e4\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x66cd

    const v5, 0xc9217d2

    xor-int/2addr v4, v5

    const v5, 0x5d06a209

    goto/16 :goto_1

    :cond_4
    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6101

    const v5, 0x7aefce45

    xor-int/2addr v4, v5

    const v5, -0x2de72779

    goto/16 :goto_1

    .line 103
    :sswitch_9
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_6

    :cond_5
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b27

    const v5, -0x32fcde2a

    xor-int/2addr v4, v5

    const v5, 0x29cd4299

    goto/16 :goto_1

    :cond_6
    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x44eb

    const v5, -0x4c01cfb8

    xor-int/2addr v4, v5

    const v5, 0x7cf97b4c

    goto/16 :goto_1

    :sswitch_a
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a73\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67f1

    const v5, 0x2165473d

    xor-int/2addr v4, v5

    const v5, -0x1a2dbd88

    goto/16 :goto_1

    .line 5
    :sswitch_b
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06e2\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x65e3

    const v5, -0x78696b5c

    xor-int/2addr v4, v5

    const v5, -0x69da99d2

    goto/16 :goto_1

    :cond_9
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x61c5

    const v5, -0x4f3302a9

    xor-int/2addr v4, v5

    const v5, -0x47e554b4

    goto/16 :goto_1

    .line 98
    :sswitch_c
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x74b7

    const v5, 0x50c2a5ca

    xor-int/2addr v4, v5

    const v5, 0x45b310fe

    goto/16 :goto_1

    :goto_3
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x794d

    const v5, 0x38853c0

    xor-int/2addr v4, v5

    const v5, 0x759067a9

    goto/16 :goto_1

    :cond_b
    const-string v3, "\u05a1\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1f5f

    const v5, 0x1fd6e674

    xor-int/2addr v4, v5

    const v5, 0x205afec0

    goto/16 :goto_1

    .line 53
    :sswitch_d
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_c

    goto :goto_4

    :cond_c
    const-string v3, "\u06e2\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b6d

    const v5, 0x1e5972c5

    xor-int/2addr v4, v5

    const v5, -0x5273c481

    goto/16 :goto_1

    .line 223
    :sswitch_e
    iput-object p1, p0, Ll/᩹᩶֫;->ۤ:Ljava/lang/CharSequence;

    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_d

    :goto_4
    const-string v3, "\u1a78\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x19f5

    const v5, -0x73d29ab9

    xor-int/2addr v4, v5

    const v5, -0x20c7c56f

    goto/16 :goto_1

    :cond_d
    const-string v3, "\u06d7\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d73

    const v5, -0x1af827b4

    xor-int/2addr v4, v5

    const v5, -0xcf03254

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7804bd73 -> :sswitch_0
        -0x778dfdf3 -> :sswitch_c
        -0x690cc3cb -> :sswitch_d
        -0x678d6052 -> :sswitch_4
        -0x55d5ffa6 -> :sswitch_3
        -0x4d9db1f0 -> :sswitch_2
        -0x4668796e -> :sswitch_3
        -0x447ada8a -> :sswitch_a
        -0x409826b2 -> :sswitch_1
        -0x29907cc4 -> :sswitch_9
        -0x29877607 -> :sswitch_2
        -0x27ab48b5 -> :sswitch_e
        -0x244cf9b7 -> :sswitch_7
        -0x242fcf97 -> :sswitch_0
        -0x23ec7793 -> :sswitch_b
        -0x1f7f8a94 -> :sswitch_4
        -0xb57e707 -> :sswitch_6
        -0x36c030d -> :sswitch_5
        0x1f25fd5 -> :sswitch_8
        0x575e656 -> :sswitch_a
        0x18e2306b -> :sswitch_8
        0x265521f3 -> :sswitch_5
        0x47643efa -> :sswitch_1
        0x53b1517d -> :sswitch_e
        0x661fd9fe -> :sswitch_d
        0x69c78599 -> :sswitch_c
        0x6d1d8a30 -> :sswitch_6
        0x6fc85245 -> :sswitch_9
        0x769899b4 -> :sswitch_b
        0x7d68490d -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Z)Ljava/lang/CharSequence;
    .locals 0

    .line 228
    iget-object p1, p0, Ll/᩹᩶֫;->ۤ:Ljava/lang/CharSequence;

    return-object p1
.end method
