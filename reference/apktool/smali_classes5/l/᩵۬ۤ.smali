.class public final synthetic Ll/᩵۬ۤ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۢ۬ۤ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۬ۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵۬ۤ;->ܰ:Ll/ۢ۬ۤ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, -0x19594a1f

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b1f

    const v5, 0x134aecaa

    xor-int/2addr v4, v5

    const v5, 0x6f54df08

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5147

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06e1\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa95

    const v5, -0x488be64a

    xor-int/2addr v4, v5

    const v5, 0x667e3614

    goto :goto_0

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_7

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    invoke-static {p1}, Ll/ۢ۬ۤ;->۫(Ll/ۢ۬ۤ;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object p1, p0, Ll/᩵۬ۤ;->ܰ:Ll/ۢ۬ۤ;

    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u05a8\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5773

    const v5, 0x137b215a

    xor-int/2addr v4, v5

    const v5, 0x4f93ca1

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u0736\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3775

    const v5, -0x2f0fd033

    xor-int/2addr v4, v5

    const v5, -0x7ae4e0ac

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a76\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xdbf

    const v5, 0x7ff2f796

    xor-int/2addr v4, v5

    const v5, -0x5e1876cf

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f2f

    const v5, 0x30dddea

    xor-int/2addr v4, v5

    const v5, 0x73ec422b

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u1a74\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3129

    const v5, 0xd5f4d3f

    xor-int/2addr v4, v5

    const v5, -0x1665f8f0

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3eb1

    const v5, 0x2602704b

    xor-int/2addr v4, v5

    const v5, -0x1ea83cd7

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b1

    const v5, -0x4682d220

    xor-int/2addr v4, v5

    const v5, -0x65e0ada4

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a79\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x68df

    const v5, 0x4d750f

    xor-int/2addr v4, v5

    const v5, -0x7c062618

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5183

    const v5, -0x31a4a3a8

    xor-int/2addr v4, v5

    const v5, 0x2004973e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e4b

    const v5, -0x572a8392

    xor-int/2addr v4, v5

    const v5, 0x4d304c50    # 1.8486195E8f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_b

    :goto_2
    const-string v3, "\u06ec\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x524d

    const v5, -0x637cc67

    xor-int/2addr v4, v5

    const v5, 0x510ef8b0

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a1\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7289

    const v5, -0x42c48863

    xor-int/2addr v4, v5

    const v5, 0x5e6c4df3

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a1b

    const v5, 0x3ba7bd8f

    xor-int/2addr v4, v5

    const v5, -0x43e13b82

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x53e5

    const v5, 0x4eab45ec

    xor-int/2addr v4, v5

    const v5, -0x1633628f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7efafb63 -> :sswitch_6
        -0x7b0ef067 -> :sswitch_d
        -0x71992144 -> :sswitch_8
        -0x6c97ef3e -> :sswitch_4
        -0x6a76717d -> :sswitch_9
        -0x62ed2a99 -> :sswitch_d
        -0x605235da -> :sswitch_0
        -0x5a05b05c -> :sswitch_7
        -0x5991ef35 -> :sswitch_3
        -0x4e73f380 -> :sswitch_e
        -0x48eaafe0 -> :sswitch_6
        -0x43baa9af -> :sswitch_4
        -0x32f94c39 -> :sswitch_a
        -0x21c57771 -> :sswitch_c
        -0x1c3132e -> :sswitch_0
        0x955a777 -> :sswitch_5
        0xb99329e -> :sswitch_3
        0xc54728e -> :sswitch_2
        0x22052421 -> :sswitch_5
        0x225daf9e -> :sswitch_8
        0x241ab1bd -> :sswitch_1
        0x29079dde -> :sswitch_7
        0x2c54edfe -> :sswitch_9
        0x38204f16 -> :sswitch_b
        0x39ee045e -> :sswitch_b
        0x405b45de -> :sswitch_a
        0x417d420b -> :sswitch_1
        0x5a720517 -> :sswitch_c
        0x5e3dbbe5 -> :sswitch_e
        0x7734abda -> :sswitch_2
    .end sparse-switch
.end method
