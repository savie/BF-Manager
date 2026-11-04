.class public Ll/۠᩷ۧ;
.super Landroid/app/Activity;
.source "67G1"


# instance fields
.field public doingOnConfigurationChanged:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x550977d8

    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v5, "\u05a1\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x359d

    const v7, 0x6e77508a

    xor-int/2addr v6, v7

    const v7, -0x6f74697

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x5b55

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 46
    invoke-static {p1, v0, v1}, Ll/۬᩷ۧ;->ۙ(Landroid/content/res/Configuration;IZ)V

    goto/16 :goto_5

    :sswitch_0
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v5, :cond_a

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06e8\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x530d

    const v7, 0x5b6b07b8

    xor-int/2addr v6, v7

    const v7, -0x191edd92

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v5, "\u073f\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3c97

    const v7, -0x6b2f85a1

    xor-int/2addr v6, v7

    const v7, 0x51ff7f63

    goto :goto_0

    .line 13
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    :goto_2
    const-string v5, "\u05a8\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xc9

    const v7, -0x34787277    # -1.7767186E7f

    xor-int/2addr v6, v7

    const v7, 0x18cc8393

    goto :goto_0

    .line 43
    :sswitch_4
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    return-void

    .line 3
    :sswitch_5
    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06d6\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x52af

    const v7, 0x2510ce63

    xor-int/2addr v6, v7

    const v7, -0x6286ccad

    goto/16 :goto_0

    .line 23
    :sswitch_6
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06df\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5435

    const v7, 0x5ad91aa5

    xor-int/2addr v6, v7

    const v7, -0x71628b75

    goto/16 :goto_0

    :sswitch_7
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u1a79\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x499b

    const v7, -0x6fd7b0a9

    xor-int/2addr v6, v7

    const v7, -0x91251db

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u05a8\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x75b9

    const v7, -0x47048f73

    xor-int/2addr v6, v7

    const v7, 0x46ebe951

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u05a1\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xd8f

    const v7, 0x7c37413c

    xor-int/2addr v6, v7

    const v7, 0x7132f5d9

    goto/16 :goto_0

    .line 5
    :sswitch_a
    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06da\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x250f

    const v7, 0x70af6302

    xor-int/2addr v6, v7

    const v7, -0x4dfa64e8

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06da\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x39bf

    const v7, 0x2f7714d

    xor-int/2addr v6, v7

    const v7, -0x2584b808

    goto/16 :goto_0

    .line 6
    :sswitch_c
    sget v5, Ll/ۖ;->ܿۚ֡:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u0730\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x17b7

    const v7, -0x33ff9de

    xor-int/2addr v6, v7

    const v7, 0x394eaebd

    goto/16 :goto_0

    .line 11
    :sswitch_d
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06da\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f75

    const v7, 0x163e4b32

    xor-int/2addr v6, v7

    const v7, -0x724b14eb

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a75\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b9b

    const v7, -0x67f1da04

    xor-int/2addr v6, v7

    const v7, -0x7ca52b8d

    goto/16 :goto_0

    .line 46
    :sswitch_e
    invoke-virtual {p0}, Ll/۠᩷ۧ;->getUiConfigNightMode()I

    move-result v0

    invoke-virtual {p0}, Ll/۠᩷ۧ;->shouldApplyUiConfigNightMode()Z

    move-result v1

    .line 35
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_c

    :goto_4
    const-string v5, "\u06d7\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x79dd

    const v7, -0x442a43c8

    xor-int/2addr v6, v7

    const v7, 0x2d586010

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e1\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x59b3

    const v7, -0x4484de65

    xor-int/2addr v6, v7

    const v7, -0x1028cfb5

    goto/16 :goto_0

    .line 48
    :sswitch_f
    invoke-super {p0, p1}, Landroid/app/Activity;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V

    return-void

    :sswitch_10
    if-eqz p1, :cond_d

    const-string v5, "\u1a76\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5a5b

    const v7, 0x77e8f724

    xor-int/2addr v6, v7

    const v7, -0x200cff6d

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v5, "\u1a77\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x750f

    const v7, 0x72cf1f54

    xor-int/2addr v6, v7

    const v7, -0x384bed17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x766223a7 -> :sswitch_c
        -0x69db370c -> :sswitch_8
        -0x6504cdf1 -> :sswitch_1
        -0x63023a61 -> :sswitch_6
        -0x6277c51a -> :sswitch_6
        -0x521ffc9f -> :sswitch_e
        -0x520b77ee -> :sswitch_2
        -0x40025fc9 -> :sswitch_5
        -0x392bf1c8 -> :sswitch_3
        -0x30912d7b -> :sswitch_3
        -0x269c8e72 -> :sswitch_a
        -0x24d4ff7b -> :sswitch_7
        -0x1fd12a0d -> :sswitch_10
        -0x1d81eb44 -> :sswitch_a
        -0x152bfcdd -> :sswitch_b
        -0x15016f36 -> :sswitch_10
        -0x14d2e9ed -> :sswitch_b
        -0x11f9758a -> :sswitch_0
        0xb3aa91a -> :sswitch_4
        0x11ad1239 -> :sswitch_d
        0x12f01d88 -> :sswitch_c
        0x1373e116 -> :sswitch_2
        0x252ed60b -> :sswitch_9
        0x34cf6d03 -> :sswitch_7
        0x3e321b47 -> :sswitch_8
        0x3eae125b -> :sswitch_0
        0x4544939f -> :sswitch_f
        0x5c92a3bc -> :sswitch_e
        0x5f4420ac -> :sswitch_1
        0x62382155 -> :sswitch_5
        0x682d9992 -> :sswitch_d
        0x6d5bc6e0 -> :sswitch_4
        0x722d8733 -> :sswitch_9
        0x7e69b8d6 -> :sswitch_f
    .end sparse-switch
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5e837bb0

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    const-string v4, "\u06d9\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5a37

    const v6, 0x674c4f19

    xor-int/2addr v5, v6

    const v6, -0x4e26b156

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4179

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 16
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v4, "\u06db\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28f

    const v6, 0x4e8fa379

    xor-int/2addr v5, v6

    const v6, -0x195d8fce

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto/16 :goto_4

    .line 5
    :sswitch_3
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    .line 36
    :sswitch_4
    invoke-virtual {p0}, Ll/۠᩷ۧ;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p1, v0, v1}, Ll/۬᩷ۧ;->ۙ(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void

    :sswitch_5
    invoke-virtual {p0}, Ll/۠᩷ۧ;->getUiConfigNightMode()I

    move-result v0

    .line 10
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u05a1\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x53d1

    const v6, -0x1f6199b2

    xor-int/2addr v5, v6

    const v6, -0x55459499

    goto :goto_0

    .line 8
    :sswitch_6
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u1a78\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5d67

    const v6, -0xc650a6a

    xor-int/2addr v5, v6

    const v6, -0x4fa25ffa

    goto/16 :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06da\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d9f

    const v6, 0x41519bc7

    xor-int/2addr v5, v6

    const v6, 0x2658ae8b

    goto/16 :goto_0

    .line 29
    :sswitch_8
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u06e4\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4dcb

    const v6, -0x14d4a893

    xor-int/2addr v5, v6

    const v6, 0x21ecb947

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e0\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x43f1

    const v6, -0x58f6aa67

    xor-int/2addr v5, v6

    const v6, -0x4356ce3f

    goto/16 :goto_0

    .line 14
    :sswitch_a
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06db\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x445f

    const v6, 0x675c7735

    xor-int/2addr v5, v6

    const v6, -0x5e7ef378

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u073f\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6f09

    const v6, 0x4fde187e

    xor-int/2addr v5, v6

    const v6, -0x3092072b

    goto/16 :goto_0

    .line 17
    :sswitch_b
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_8

    :goto_3
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4763

    const v6, 0x45dcc9e3

    xor-int/2addr v5, v6

    const v6, 0x789953cf

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e7\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7d2f

    const v6, -0xfde2436

    xor-int/2addr v5, v6

    const v6, -0x7c95d943

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_9

    :goto_4
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5a3f

    const v6, 0x3374cc58

    xor-int/2addr v5, v6

    const v6, 0x19bce8f6

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ab3

    const v6, 0x1874e9c3

    xor-int/2addr v5, v6

    const v6, 0x574fb5e4

    goto/16 :goto_0

    .line 35
    :sswitch_d
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e49

    const v6, -0xdbe28e0

    xor-int/2addr v5, v6

    const v6, -0xd29d5aa

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06e7\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xcaf

    const v6, -0x6bce14cd

    xor-int/2addr v5, v6

    const v6, -0x546cbd0c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a75\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x38dd

    const v6, -0x5cc7a669

    xor-int/2addr v5, v6

    const v6, -0x3ab8f052

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f84f963 -> :sswitch_3
        -0x6657c63d -> :sswitch_3
        -0x63ca8087 -> :sswitch_2
        -0x620f5b34 -> :sswitch_1
        -0x5e0404c6 -> :sswitch_7
        -0x569b4594 -> :sswitch_e
        -0x4cfc3cc1 -> :sswitch_0
        -0x46f84c1b -> :sswitch_5
        -0x402c2835 -> :sswitch_d
        -0x3c497bde -> :sswitch_2
        -0x39c1c015 -> :sswitch_8
        -0x387b5958 -> :sswitch_9
        -0x2fd2c041 -> :sswitch_4
        -0x24e9c8e3 -> :sswitch_1
        -0x1f96760f -> :sswitch_7
        -0x19f7b381 -> :sswitch_8
        -0x9517f5d -> :sswitch_c
        0x30788cc -> :sswitch_0
        0x7148652 -> :sswitch_a
        0x19af1a98 -> :sswitch_d
        0x2dd8e26e -> :sswitch_b
        0x3049056e -> :sswitch_5
        0x3533579b -> :sswitch_6
        0x3914141b -> :sswitch_e
        0x4689b67c -> :sswitch_a
        0x4ab18408 -> :sswitch_9
        0x5ccf953f -> :sswitch_6
        0x74540e50 -> :sswitch_4
        0x78c3e06c -> :sswitch_c
        0x7cb06f34 -> :sswitch_b
    .end sparse-switch
.end method

.method public getUiConfigNightMode()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x3b545bbe

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    sget v4, Ll/᩺;->۫۬۫:I

    const-string v5, "\u073f\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xfcb

    const v7, -0x1af8333b

    xor-int/2addr v6, v7

    const v7, 0x73f8f0fb

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x214b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 65
    iget-boolean v5, p0, Ll/۠᩷ۧ;->doingOnConfigurationChanged:Z

    if-eqz v5, :cond_1

    const-string v5, "\u06e0\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x579f

    const v7, 0x24516565

    xor-int/2addr v6, v7

    const v7, 0x28fb95f

    goto :goto_0

    .line 25
    :sswitch_0
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06e8\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27ef

    const v7, 0xcc9980c

    xor-int/2addr v6, v7

    const v7, -0x66626907

    goto :goto_0

    .line 29
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v5, :cond_7

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-lez v5, :cond_b

    goto :goto_1

    .line 111
    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    :goto_1
    const-string v5, "\u06d8\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3597

    const v7, -0xc35cfdd

    xor-int/2addr v6, v7

    const v7, -0x53e4d020

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 74
    :sswitch_5
    iput-boolean v0, p0, Ll/۠᩷ۧ;->doingOnConfigurationChanged:Z

    return-void

    :sswitch_6
    iput-boolean v0, p0, Ll/۠᩷ۧ;->doingOnConfigurationChanged:Z

    .line 75
    throw v1

    .line 122
    :sswitch_7
    :try_start_0
    invoke-static {}, Ll/ۗۡ֫;->ۙ()V

    .line 71
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 72
    invoke-virtual {p0}, Ll/۠᩷ۧ;->getUiConfigNightMode()I

    move-result v5

    invoke-virtual {p0}, Ll/۠᩷ۧ;->shouldApplyUiConfigNightMode()Z

    move-result v6

    invoke-static {p0, v5, v6}, Ll/۬᩷ۧ;->᩷(Landroid/app/Activity;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u0736\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4e51

    const v7, -0x5281a29f

    xor-int/2addr v6, v7

    const v7, 0x764a5318

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    const-string v5, "\u073d\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3147

    const v7, 0x34eb6dba

    xor-int/2addr v6, v7

    const v7, -0x65a4a0b5

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Ll/۠᩷ۧ;->doingOnConfigurationChanged:Z

    const/4 v0, 0x0

    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1da3

    const v7, 0x5933187e

    xor-int/2addr v6, v7

    const v7, 0x22e59d7

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06d9\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ce1

    const v7, -0x145d1329

    xor-int/2addr v6, v7

    const v7, -0x26507fb7

    goto/16 :goto_0

    .line 88
    :sswitch_a
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u1a76\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3c0b

    const v7, -0x669b8646

    xor-int/2addr v6, v7

    const v7, 0x694dca38

    goto/16 :goto_0

    .line 64
    :sswitch_b
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u05a1\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x44d7

    const v7, -0x9f3a2b8

    xor-int/2addr v6, v7

    const v7, -0xfd0d0b3

    goto/16 :goto_0

    .line 118
    :sswitch_c
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ccb

    const v7, 0x173fa853

    xor-int/2addr v6, v7

    const v7, 0x66ae7579

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u05a1\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6615

    const v7, 0x4564ddde

    xor-int/2addr v6, v7

    const v7, 0x9525511

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u06d6\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, -0x6f

    const v7, -0x37d9efc5

    xor-int/2addr v6, v7

    const v7, -0x61885e42

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    :goto_2
    const-string v5, "\u05a1\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3493

    const v7, 0x66452dc6

    xor-int/2addr v6, v7

    const v7, 0x7b465c49

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d8\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7cbd

    const v7, -0x17ba779d

    xor-int/2addr v6, v7

    const v7, -0x3c9e15e1

    goto/16 :goto_0

    .line 95
    :sswitch_10
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06da\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d7b

    const v7, 0x36458887

    xor-int/2addr v6, v7

    const v7, 0x18a042f3

    goto/16 :goto_0

    .line 28
    :sswitch_11
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-gtz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u0733\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1307

    const v7, -0x1b92c164

    xor-int/2addr v6, v7

    const v7, 0x498e45ad

    goto/16 :goto_0

    .line 117
    :sswitch_12
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u06e2\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6be9

    const v7, 0xe179e48

    xor-int/2addr v6, v7

    const v7, -0x15810d03

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4fa5

    const v7, 0x1f5cbca1

    xor-int/2addr v6, v7

    const v7, -0x46e94f85

    goto/16 :goto_0

    .line 37
    :sswitch_13
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_d

    :goto_4
    const-string v5, "\u0733\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x199

    const v7, -0x3f182c5b

    xor-int/2addr v6, v7

    const v7, 0x65c1b10f

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e4\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5175

    const v7, -0x69cee18f

    xor-int/2addr v6, v7

    const v7, -0xc3d297

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7068e5dd -> :sswitch_13
        -0x6dbd8ffb -> :sswitch_9
        -0x650a5b15 -> :sswitch_10
        -0x60d2dd5e -> :sswitch_e
        -0x5e6cc912 -> :sswitch_3
        -0x5d289e11 -> :sswitch_c
        -0x5c81e795 -> :sswitch_1
        -0x5018d7ab -> :sswitch_3
        -0x4ee618b0 -> :sswitch_0
        -0x322f1387 -> :sswitch_2
        -0x2a65aeb0 -> :sswitch_d
        -0x296fb302 -> :sswitch_4
        -0x27fb0dad -> :sswitch_5
        -0x18e4a06d -> :sswitch_d
        -0x67d9d7a -> :sswitch_e
        -0x5df4073 -> :sswitch_10
        -0x8bd04 -> :sswitch_6
        0x23c9931 -> :sswitch_2
        0xc1eb188 -> :sswitch_8
        0xd16cd0b -> :sswitch_f
        0x12b3c33f -> :sswitch_11
        0x13e465e4 -> :sswitch_11
        0x2e2c6363 -> :sswitch_0
        0x309dd9b4 -> :sswitch_9
        0x33b1b3e4 -> :sswitch_c
        0x34cebf1f -> :sswitch_a
        0x38cdf03f -> :sswitch_7
        0x3efba21b -> :sswitch_7
        0x476ff1a0 -> :sswitch_13
        0x4ca9e6e0 -> :sswitch_5
        0x4f06d842 -> :sswitch_12
        0x4f6768fe -> :sswitch_b
        0x55254b15 -> :sswitch_4
        0x57eed361 -> :sswitch_6
        0x686b454f -> :sswitch_1
        0x71d170d1 -> :sswitch_8
        0x730d3476 -> :sswitch_f
        0x75f338ac -> :sswitch_12
        0x7a80e51c -> :sswitch_b
        0x7c0c87e1 -> :sswitch_a
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x363676e2

    sget v2, Ll/ۖ;->ܿۚ֡:I

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    const-string v4, "\u06e7\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x19d3

    const v6, -0x40e26110

    xor-int/2addr v5, v6

    const v6, -0x2d549ae0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x465f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 28
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    .line 29
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_7

    goto/16 :goto_3

    .line 54
    :sswitch_1
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v4, :cond_a

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    return-void

    .line 56
    :sswitch_5
    invoke-virtual {p0}, Ll/۠᩷ۧ;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p0, v0, v1}, Ll/۬᩷ۧ;->ۤ(Landroid/app/Activity;IZ)V

    .line 57
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    return-void

    .line 56
    :sswitch_6
    invoke-virtual {p0}, Ll/۠᩷ۧ;->getUiConfigNightMode()I

    move-result v0

    .line 12
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u073d\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x153f

    const v6, -0x1ed0b0f2

    xor-int/2addr v5, v6

    const v6, 0x6aa0189e

    goto :goto_0

    .line 14
    :sswitch_7
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_2

    :cond_1
    const-string v4, "\u1a78\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5505

    const v6, -0x15a8951a

    xor-int/2addr v5, v6

    const v6, 0x67f9b825

    goto :goto_0

    :cond_2
    const-string v4, "\u06df\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3175

    const v6, -0x65e9a1a3

    xor-int/2addr v5, v6

    const v6, 0x371d0dbd

    goto/16 :goto_0

    .line 18
    :sswitch_8
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_3

    :goto_1
    const-string v4, "\u1a7b\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x103

    const v6, 0x11cfcdc6

    xor-int/2addr v5, v6

    const v6, -0x12901d12

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u05a8\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b71

    const v6, 0x743a2ae3

    xor-int/2addr v5, v6

    const v6, 0x778970f6

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06e2\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5255

    const v6, -0x426c806d

    xor-int/2addr v5, v6

    const v6, -0x33d6ffeb    # -4.430242E7f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06dc\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4789

    const v6, 0x166bb4c2

    xor-int/2addr v5, v6

    const v6, -0x381c60bb

    goto/16 :goto_0

    .line 30
    :sswitch_a
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u073d\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1aef

    const v6, -0x141a0d2b

    xor-int/2addr v5, v6

    const v6, -0x42742037

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u06e2\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14b9

    const v6, 0x6bceead2

    xor-int/2addr v5, v6

    const v6, 0x63640c6f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d7\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x71c3

    const v6, -0x15e7efec

    xor-int/2addr v5, v6

    const v6, -0x24ffca9b

    goto/16 :goto_0

    .line 20
    :sswitch_c
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u1a7b\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2427

    const v6, 0x3e7f3911

    xor-int/2addr v5, v6

    const v6, -0x7ec05160

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06d9\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1ceb

    const v6, -0x6d631258

    xor-int/2addr v5, v6

    const v6, -0x174ef2bc

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d6\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1de5

    const v6, 0x35abc092

    xor-int/2addr v5, v6

    const v6, -0x6d972df2

    goto/16 :goto_0

    .line 8
    :sswitch_e
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6eb3

    const v6, 0x2abe3bab

    xor-int/2addr v5, v6

    const v6, -0x1d91452d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7789

    const v6, -0x1371203c

    xor-int/2addr v5, v6

    const v6, -0xb818586

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6de9400b -> :sswitch_0
        -0x5ee20842 -> :sswitch_1
        -0x5d5c23a7 -> :sswitch_5
        -0x532d3cab -> :sswitch_7
        -0x4d39c7c8 -> :sswitch_a
        -0x48f5b7a7 -> :sswitch_6
        -0x483abaf0 -> :sswitch_3
        -0x39fbaef1 -> :sswitch_2
        -0x2f5194ea -> :sswitch_5
        -0x2dec4ab1 -> :sswitch_d
        -0x272713c6 -> :sswitch_9
        -0x1b318a39 -> :sswitch_c
        -0x1032842c -> :sswitch_d
        0x5ed5ccb -> :sswitch_e
        0x9711dd8 -> :sswitch_b
        0x127f96cd -> :sswitch_c
        0x13006ad3 -> :sswitch_0
        0x1d4ae175 -> :sswitch_1
        0x31260faf -> :sswitch_6
        0x3e783fbc -> :sswitch_7
        0x3fbdd025 -> :sswitch_8
        0x47f4daad -> :sswitch_9
        0x4c3e4224 -> :sswitch_8
        0x4e29090c -> :sswitch_2
        0x5479d265 -> :sswitch_3
        0x656b0c1c -> :sswitch_4
        0x6ba9776b -> :sswitch_4
        0x74336688 -> :sswitch_e
        0x7e6ae8dc -> :sswitch_a
        0x7ed4c4bc -> :sswitch_b
    .end sparse-switch
.end method

.method public shouldApplyUiConfigNightMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
