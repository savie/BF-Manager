.class public final synthetic Ll/۟᩵֫;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ܰ:Ll/ۡ᩵֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩵֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩵֫;->ܰ:Ll/ۡ᩵֫;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, 0x116b9ca4

    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v2, "\u06d8\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x7f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0xaeb

    const v4, -0x20911fe0

    xor-int/2addr v3, v4

    const v4, 0x4c185fe9    # 3.99441E7f

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x30c3

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v2

    if-ltz v2, :cond_9

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_4

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u06e2\u1a76"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x5f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2f15

    const v4, 0x11a2d390

    xor-int/2addr v3, v4

    const v4, -0x6fb53e44

    goto :goto_0

    .line 3
    :sswitch_2
    sget v2, Ll/᩺;->۫۬۫:I

    if-lez v2, :cond_b

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    :goto_1
    const/4 p1, 0x0

    return p1

    :sswitch_5
    iget-object p1, p0, Ll/۟᩵֫;->ܰ:Ll/ۡ᩵֫;

    invoke-static {p1, p2}, Ll/ۡ᩵֫;->᩷(Ll/ۡ᩵֫;Landroid/view/MotionEvent;)V

    goto :goto_1

    :sswitch_6
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "\u06e2\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4303

    const v4, -0x2e2224b3

    xor-int/2addr v3, v4

    const v4, -0x657a1285

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x1b9f

    const v4, -0x6defc0e9

    xor-int/2addr v3, v4

    const v4, 0x3e6e6da9

    goto :goto_0

    .line 1
    :sswitch_7
    sget v2, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v2, "\u1a76\u06eb"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x49

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x541b

    const v4, -0x41d5bbdd

    xor-int/2addr v3, v4

    const v4, 0x18892589

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u073d\u06eb"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4637

    const v4, 0x2cbcc919

    xor-int/2addr v3, v4

    const v4, 0x7dcb6c1f

    goto/16 :goto_0

    :sswitch_9
    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v2, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u1a77\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x66fd

    const v4, 0x5adf7b94

    xor-int/2addr v3, v4

    const v4, -0x6f1c05ec

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v2

    if-gtz v2, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v2, "\u0736\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x65

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x49d5

    const v4, 0x5b472d03

    xor-int/2addr v3, v4

    const v4, 0x7a5c403a

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v2, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v2, "\u05a8\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2e6f

    const v4, 0x4b3c6f02    # 1.2349186E7f

    xor-int/2addr v3, v4

    const v4, -0x3e5418f8

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "\u073f\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x1b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x61bb

    const v4, -0x8eeb8b7

    xor-int/2addr v3, v4

    const v4, 0x111466a7

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v2, "\u06d9\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x465b

    const v4, 0x2fa94297

    xor-int/2addr v3, v4

    const v4, -0x62c24dde

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e2\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5199

    const v4, 0x484940dc

    xor-int/2addr v3, v4

    const v4, 0xcb6bf5

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v2, :cond_a

    :goto_3
    const-string v2, "\u06d9\u06ec"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x54d3

    const v4, -0x7bf62a6b

    xor-int/2addr v3, v4

    const v4, 0xec4c8d2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e1\u1a74"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x17d9

    const v4, -0x7ce163cc

    xor-int/2addr v3, v4

    const v4, 0x20a88545

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v2, :cond_c

    :cond_b
    :goto_4
    const-string v2, "\u1a78\u06d6"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4b81

    const v4, 0x4292740

    xor-int/2addr v3, v4

    const v4, 0x3c4468ba

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u1a79\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x71

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x21a7

    const v4, 0x5342a705

    xor-int/2addr v3, v4

    const v4, -0x705e24b2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79c52713 -> :sswitch_b
        -0x76c748da -> :sswitch_b
        -0x6f1a04fa -> :sswitch_c
        -0x62d0e68e -> :sswitch_5
        -0x5ffd5f8e -> :sswitch_9
        -0x5bb3fb61 -> :sswitch_2
        -0x54933a38 -> :sswitch_3
        -0x53be52a6 -> :sswitch_e
        -0x46d5a2f9 -> :sswitch_1
        -0x40b76866 -> :sswitch_d
        -0x3dc9bc50 -> :sswitch_0
        -0x35b9b0c9 -> :sswitch_7
        -0x340b57a6 -> :sswitch_d
        -0x3259b623 -> :sswitch_3
        -0x2cf56944 -> :sswitch_c
        -0x2709e748 -> :sswitch_4
        -0x2180ec48 -> :sswitch_9
        -0x17a345de -> :sswitch_5
        -0x151fe283 -> :sswitch_7
        -0x4d09122 -> :sswitch_6
        0xea27387 -> :sswitch_6
        0x16607f24 -> :sswitch_8
        0x17995ac4 -> :sswitch_a
        0x1c968c26 -> :sswitch_a
        0x46d2ca04 -> :sswitch_8
        0x4cb73a62 -> :sswitch_0
        0x4dd578c1 -> :sswitch_e
        0x51e3d163 -> :sswitch_4
        0x56eb9c5d -> :sswitch_1
        0x763087bc -> :sswitch_2
    .end sparse-switch
.end method
