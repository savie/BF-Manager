.class public final synthetic Ll/ܰۚۘ;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ܺ:Ll/᩹ۚۘ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۚۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۚۘ;->ܺ:Ll/᩹ۚۘ;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, 0x709d70a2

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    sget v1, Ll/֡֡;->᩶ۤ۠:I

    const-string v2, "\u06e8\u06e8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0xf

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x11b7

    const v4, 0x5bc26670

    xor-int/2addr v3, v4

    const v4, -0x155b24f9

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x5b6b

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 2
    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v2, :cond_7

    goto/16 :goto_4

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v2, :cond_2

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v2

    if-lez v2, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v2, :cond_4

    goto/16 :goto_5

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_5

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ܰۚۘ;->ܺ:Ll/᩹ۚۘ;

    invoke-static {p1, p2}, Ll/᩹ۚۘ;->ܰ(Ll/᩹ۚۘ;Landroid/view/MotionEvent;)V

    goto :goto_1

    :sswitch_6
    sget-boolean v2, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u06db\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x61

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x14dd

    const v4, -0x5b8bb3b5

    xor-int/2addr v3, v4

    const v4, -0x5ed36aa4

    goto :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "\u06e7\u06da"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5619

    const v4, -0x4d93e50b

    xor-int/2addr v3, v4

    const v4, 0x41a24c8a

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    :goto_2
    const-string v2, "\u06e4\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x77

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4b9f

    const v4, -0x1f76b33e

    xor-int/2addr v3, v4

    const v4, 0x3248bd0d

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u073f\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5bbf

    const v4, -0x133cd8fe

    xor-int/2addr v3, v4

    const v4, -0x3404abda

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v2, :cond_5

    :cond_4
    :goto_3
    const-string v2, "\u06eb\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x17

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3085

    const v4, 0x9917c67

    xor-int/2addr v3, v4

    const v4, -0x4b4abe9e

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u073a\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x9a5

    const v4, -0x5cd6f06f

    xor-int/2addr v3, v4

    const v4, 0x2aea9a54

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v2, "\u06ec\u06e4"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2ad7

    const v4, 0x4e8261b8

    xor-int/2addr v3, v4

    const v4, 0x36c29988

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e4\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2bbb

    const v4, -0x558aa05b

    xor-int/2addr v3, v4

    const v4, 0x188ef923

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v2, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v2, :cond_8

    goto :goto_6

    :cond_8
    const-string v2, "\u06db\u06e0"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6cf9

    const v4, 0x7114b24b

    xor-int/2addr v3, v4

    const v4, 0x7ab83adb

    goto/16 :goto_0

    :sswitch_c
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_9

    :goto_4
    const-string v2, "\u06dc\u06db"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4779

    const v4, 0x62984566

    xor-int/2addr v3, v4

    const v4, -0x3037d96d    # -6.7159424E9f

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u073f\u06e8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4787

    const v4, 0x77bc2437

    xor-int/2addr v3, v4

    const v4, -0x14c56f53

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v2, :cond_a

    :goto_5
    const-string v2, "\u1a73\u1a7b"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x48dd

    const v4, 0x7a24e079

    xor-int/2addr v3, v4

    const v4, 0x32023c17

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u073f\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x7583

    const v4, -0xa152069

    xor-int/2addr v3, v4

    const v4, 0x6fa796e2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v2

    if-gtz v2, :cond_c

    :cond_b
    :goto_6
    const-string v2, "\u06d9\u1a76"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x24b5

    const v4, 0x20e8f985

    xor-int/2addr v3, v4

    const v4, -0x7251814d

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u05a8\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3cb3

    const v4, 0x6a8cd67

    xor-int/2addr v3, v4

    const v4, -0x3f0189b2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c1b0de4 -> :sswitch_1
        -0x6b2a2770 -> :sswitch_1
        -0x653dd3b9 -> :sswitch_7
        -0x6467c107 -> :sswitch_5
        -0x632935b6 -> :sswitch_e
        -0x58ef1139 -> :sswitch_b
        -0x3e7bf613 -> :sswitch_2
        -0x39f95c45 -> :sswitch_9
        -0x2fac782a -> :sswitch_0
        -0x2b9f3661 -> :sswitch_7
        -0x2a58ae0f -> :sswitch_4
        -0x209a3a48 -> :sswitch_d
        -0x15924a65 -> :sswitch_c
        -0xd15ead5 -> :sswitch_e
        0x7b212c6 -> :sswitch_0
        0xc838824 -> :sswitch_2
        0x105104a5 -> :sswitch_8
        0x15d84320 -> :sswitch_b
        0x16faec38 -> :sswitch_a
        0x1a87d5bb -> :sswitch_3
        0x238df415 -> :sswitch_c
        0x29593eca -> :sswitch_9
        0x2c8faf8e -> :sswitch_d
        0x2d9a0845 -> :sswitch_4
        0x54a4bcb3 -> :sswitch_a
        0x5b29736c -> :sswitch_6
        0x5e39ea63 -> :sswitch_6
        0x6352f432 -> :sswitch_3
        0x66c0e55f -> :sswitch_8
        0x7afd9fdd -> :sswitch_5
    .end sparse-switch
.end method
