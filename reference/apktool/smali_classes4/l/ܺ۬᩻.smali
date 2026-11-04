.class public final Ll/ܺ۬᩻;
.super Ljava/lang/Object;
.source "KA2Z"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ܰ:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ܺ۬᩻;->ܰ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x283aa20e

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x456d

    const v5, 0x4c360cd1    # 4.7723332E7f

    xor-int/2addr v4, v5

    const v5, -0x4adae16c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7481

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_8

    goto/16 :goto_3

    .line 50
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v3, :cond_4

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-gez v3, :cond_c

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u05ab\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e99

    const v5, -0x661925ba

    xor-int/2addr v4, v5

    const v5, 0x600d7a0c

    goto :goto_0

    .line 18
    :sswitch_3
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    return-void

    :sswitch_5
    const/4 v3, 0x0

    .line 99
    invoke-virtual {p1, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_2

    :sswitch_6
    return-void

    .line 98
    :sswitch_7
    iget-object p1, p0, Ll/ܺ۬᩻;->ܰ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "\u0730\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e0b

    const v5, 0x5d873090

    xor-int/2addr v4, v5

    const v5, -0x22bb84c8

    goto :goto_0

    :cond_1
    :goto_2
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5243

    const v5, -0x306793ae

    xor-int/2addr v4, v5

    const v5, 0x2ec7ad42

    goto :goto_0

    .line 88
    :sswitch_8
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d47

    const v5, -0x1d22f065

    xor-int/2addr v4, v5

    const v5, -0x6631a6b7

    goto/16 :goto_0

    .line 86
    :sswitch_9
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u05a1\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4c97

    const v5, 0x1bbe7aab

    xor-int/2addr v4, v5

    const v5, -0x4196cc0b

    goto/16 :goto_0

    .line 57
    :sswitch_a
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_5

    :cond_4
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11ef

    const v5, 0x7d537ef5

    xor-int/2addr v4, v5

    const v5, -0x7b4d5356

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d9\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f79

    const v5, -0x16490702

    xor-int/2addr v4, v5

    const v5, -0x6037a106

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u05a1\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b97

    const v5, -0x2dc5883b

    xor-int/2addr v4, v5

    const v5, -0x487a9bad

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4659

    const v5, -0x50a32320

    xor-int/2addr v4, v5

    const v5, -0x28343564

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a1\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2023

    const v5, -0x513cea4d

    xor-int/2addr v4, v5

    const v5, -0x1c8e5dae

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_9

    :goto_3
    const-string v3, "\u06df\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7bbf

    const v5, 0x845d14d

    xor-int/2addr v4, v5

    const v5, 0x4f757743

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06eb\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x704f

    const v5, -0x4873784a

    xor-int/2addr v4, v5

    const v5, 0x5e43235f

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u05a8\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x59f3

    const v5, 0xb89e2c

    xor-int/2addr v4, v5

    const v5, 0x4fee4e15

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a76\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x128b

    const v5, -0x287809c0

    xor-int/2addr v4, v5

    const v5, -0x214dea22

    goto/16 :goto_0

    .line 40
    :sswitch_f
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v3

    if-gtz v3, :cond_b

    goto :goto_5

    :cond_b
    const-string v3, "\u06d8\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x174f

    const v5, -0xb217794

    xor-int/2addr v4, v5

    const v5, 0x6855f490

    goto/16 :goto_0

    .line 21
    :sswitch_10
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u1a74\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x96b

    const v5, -0x6e35c93a

    xor-int/2addr v4, v5

    const v5, -0x413cb6df

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d9\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1073

    const v5, -0x3c5ae96b

    xor-int/2addr v4, v5

    const v5, 0x46daf8fe

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b7aba3d -> :sswitch_d
        -0x688f0882 -> :sswitch_5
        -0x6200b38e -> :sswitch_b
        -0x544d93dd -> :sswitch_10
        -0x40491980 -> :sswitch_d
        -0x2a3e2480 -> :sswitch_8
        -0x2a03111c -> :sswitch_9
        -0x23b546aa -> :sswitch_b
        -0x1fdd11f6 -> :sswitch_e
        -0x17858e54 -> :sswitch_3
        -0x17754e1b -> :sswitch_1
        -0x16d33436 -> :sswitch_e
        -0x121f5708 -> :sswitch_0
        -0xf44a43c -> :sswitch_7
        -0xb847c90 -> :sswitch_6
        0xcee7fb5 -> :sswitch_f
        0x106fb82a -> :sswitch_5
        0x1758e0eb -> :sswitch_7
        0x1f7ae480 -> :sswitch_a
        0x2c58ad70 -> :sswitch_3
        0x3717dfa5 -> :sswitch_c
        0x3d5239f6 -> :sswitch_10
        0x3ff21081 -> :sswitch_a
        0x41447f6e -> :sswitch_6
        0x48104e6d -> :sswitch_f
        0x4cbd968f -> :sswitch_4
        0x53d084a3 -> :sswitch_1
        0x5e822209 -> :sswitch_0
        0x6258b316 -> :sswitch_9
        0x6766d842 -> :sswitch_8
        0x6b06d68d -> :sswitch_c
        0x70e4ed88 -> :sswitch_4
        0x7a53dd92 -> :sswitch_2
        0x7fbb5c7d -> :sswitch_2
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, 0x687ef0b2

    sget p2, Ll/ۖۖ;->᩵ۜ֨:I

    sget p3, Ll/֨ۚ;->֡᩸ۛ:I

    const-string p4, "\u0730\u06d8"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x1f7

    const v1, 0x18d621b

    xor-int/2addr v0, v1

    const v1, -0x7c8ea6fb

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, -0x40ff

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result p4

    if-nez p4, :cond_7

    goto/16 :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget p4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz p4, :cond_b

    goto/16 :goto_1

    :sswitch_1
    sget p4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz p4, :cond_6

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result p4

    if-ltz p4, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    :sswitch_5
    return-void

    .line 3
    :sswitch_6
    sget p4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string p4, "\u06ec\u073f"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x37

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x5d99

    const v1, -0x81875ef

    xor-int/2addr v0, v1

    const v1, -0x5cc6aaac

    goto :goto_0

    :sswitch_7
    sget p4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz p4, :cond_1

    goto :goto_1

    :cond_1
    const-string p4, "\u06e4\u06e1"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x1f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7799

    const v1, 0x34288615

    xor-int/2addr v0, v1

    const v1, -0x31648d20

    goto :goto_0

    :sswitch_8
    sget-boolean p4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string p4, "\u05a1\u06ec"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7513

    const v1, -0x2085a20

    xor-int/2addr v0, v1

    const v1, -0x2d72da5c

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result p4

    if-gtz p4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p4, "\u06e2\u05a1"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x5563

    const v1, 0x441ffde7

    xor-int/2addr v0, v1

    const v1, -0x2265bcdf

    goto/16 :goto_0

    :sswitch_a
    sget-boolean p4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p4, :cond_4

    goto :goto_1

    :cond_4
    const-string p4, "\u1a7b\u06e0"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x77

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x63c3

    const v1, 0x11f0d2d3

    xor-int/2addr v0, v1

    const v1, -0x337054ba    # -7.532395E7f

    goto/16 :goto_0

    :sswitch_b
    sget-boolean p4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz p4, :cond_5

    :goto_1
    const-string p4, "\u0736\u0736"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x55

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5caf

    const v1, 0x2ff461b7

    xor-int/2addr v0, v1

    const v1, 0x42df7f9f

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u073a\u1a75"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x5b

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x2c43

    const v1, -0x101a9787

    xor-int/2addr v0, v1

    const v1, 0x1e0f9f9d

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string p4, "\u06ec\u073a"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x29

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x3011

    const v1, 0xb253ab3

    xor-int/2addr v0, v1

    const v1, 0x79c18228

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u1a73\u0736"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x1953

    const v1, -0x1727cf4c

    xor-int/2addr v0, v1

    const v1, 0x57041561

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result p4

    if-nez p4, :cond_9

    :cond_8
    :goto_3
    const-string p4, "\u05a8\u06ec"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x19a7

    const v1, 0x5941da5b

    xor-int/2addr v0, v1

    const v1, 0x1c743623

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u06d9\u06d8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3737

    const v1, 0x1ee824e9

    xor-int/2addr v0, v1

    const v1, 0x4790f459

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget p4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz p4, :cond_a

    :goto_4
    const-string p4, "\u1a73\u0733"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x59f5

    const v1, 0x4703a93a

    xor-int/2addr v0, v1

    const v1, -0x3517413d    # -7626593.5f

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u06e2\u1a79"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0xa59

    const v1, 0x4db631af    # 3.8208867E8f

    xor-int/2addr v0, v1

    const v1, 0x45a8fcb

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result p4

    if-eqz p4, :cond_c

    :cond_b
    :goto_5
    const-string p4, "\u1a78\u06ec"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x5

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x405d

    const v1, 0x5557eb7d

    xor-int/2addr v0, v1

    const v1, 0x1e347fdb

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u073f\u1a75"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x5d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x569d

    const v1, -0x6898843f

    xor-int/2addr v0, v1

    const v1, -0x7f7039f2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x798f88c0 -> :sswitch_a
        -0x74a0e9b5 -> :sswitch_3
        -0x6bc59674 -> :sswitch_c
        -0x5dede4f0 -> :sswitch_c
        -0x5d9fe290 -> :sswitch_a
        -0x5d79d3f8 -> :sswitch_7
        -0x58b4cf31 -> :sswitch_5
        -0x4d0f4af1 -> :sswitch_4
        -0x47d00a6e -> :sswitch_e
        -0x3fd34792 -> :sswitch_b
        -0x34c0ab28 -> :sswitch_3
        -0x27206cfd -> :sswitch_6
        -0x2437e003 -> :sswitch_0
        -0x1c8dd6db -> :sswitch_9
        0x111f667f -> :sswitch_5
        0x1311b53d -> :sswitch_e
        0x260195be -> :sswitch_8
        0x2853fde5 -> :sswitch_9
        0x2b39878a -> :sswitch_1
        0x303bd937 -> :sswitch_1
        0x36ab8a9b -> :sswitch_d
        0x45a606e3 -> :sswitch_7
        0x4c2ea51a -> :sswitch_2
        0x4dfa904e -> :sswitch_8
        0x5a8b8c73 -> :sswitch_0
        0x5c546e57 -> :sswitch_b
        0x604a203c -> :sswitch_4
        0x6a49681c -> :sswitch_d
        0x6fb41897 -> :sswitch_2
        0x7f5972d1 -> :sswitch_6
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, 0x75fedc00

    sget p2, Ll/ۖ֨;->֨ۨۧ:I

    sget p3, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string p4, "\u073a\u06d7"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x3

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x577b

    const v1, -0x7764f71d

    xor-int/2addr v0, v1

    const v1, -0x7ba418b5

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, 0x4a81

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result p4

    if-lez p4, :cond_a

    goto :goto_1

    .line 4
    :sswitch_1
    sget-boolean p4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p4, :cond_3

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget p4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz p4, :cond_5

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result p4

    if-ltz p4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string p4, "\u0736\u073f"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x403d

    const v1, -0x3c0c9d9

    xor-int/2addr v0, v1

    const v1, -0xe5f8244

    goto :goto_0

    .line 1
    :sswitch_6
    sget p4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p4, :cond_1

    goto :goto_2

    :cond_1
    const-string p4, "\u1a7b\u1a78"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4fc9

    const v1, -0x6e326312

    xor-int/2addr v0, v1

    const v1, -0x5e90df27

    goto :goto_0

    :sswitch_7
    sget p4, Ll/᩺;->۫۬۫:I

    if-gtz p4, :cond_2

    goto :goto_1

    :cond_2
    const-string p4, "\u073a\u0730"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4cf

    const v1, 0x7e76532

    xor-int/2addr v0, v1

    const v1, -0x33940d84    # -6.1852144E7f

    goto :goto_0

    :sswitch_8
    sget p4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz p4, :cond_4

    :cond_3
    :goto_1
    const-string p4, "\u06e7\u05a1"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3d59

    const v1, -0x1d811c9

    xor-int/2addr v0, v1

    const v1, -0x15ca93fa

    goto/16 :goto_0

    :cond_4
    const-string p4, "\u0733\u073f"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x558f

    const v1, 0x28b581c2

    xor-int/2addr v0, v1

    const v1, 0x4216b373

    goto/16 :goto_0

    :sswitch_9
    sget p4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz p4, :cond_6

    :cond_5
    :goto_2
    const-string p4, "\u073f\u05ab"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x59a7

    const v1, -0xcef3599

    xor-int/2addr v0, v1

    const v1, 0x6f4d0bbf

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u073f\u0733"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x73

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x651f

    const v1, 0x7f3aa24b

    xor-int/2addr v0, v1

    const v1, 0x3236c1b6

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget p4, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz p4, :cond_7

    goto :goto_4

    :cond_7
    const-string p4, "\u073f\u06da"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x27

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3525

    const v1, -0x3ad35ec2

    xor-int/2addr v0, v1

    const v1, 0x4b339266    # 1.1768422E7f

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result p4

    if-ltz p4, :cond_8

    goto :goto_5

    :cond_8
    const-string p4, "\u0730\u1a78"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1b7b

    const v1, 0x34a53876

    xor-int/2addr v0, v1

    const v1, 0x40c508f5

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget p4, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz p4, :cond_9

    :goto_3
    const-string p4, "\u073a\u1a75"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x572b

    const v1, 0x7a8531c3

    xor-int/2addr v0, v1

    const v1, -0x7bea28cb

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u1a75\u073a"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0xe39

    const v1, 0x33574942

    xor-int/2addr v0, v1

    const v1, -0x5576e33

    goto/16 :goto_0

    :sswitch_d
    sget p4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz p4, :cond_b

    :cond_a
    :goto_4
    const-string p4, "\u0736\u06d7"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x7d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x19df

    const v1, 0x22b4d747

    xor-int/2addr v0, v1

    const v1, -0x7891debd

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u073f\u05a1"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x75

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x525d

    const v1, -0x52a2005f

    xor-int/2addr v0, v1

    const v1, -0x68dd5061

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget p4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p4, :cond_c

    :goto_5
    const-string p4, "\u06d9\u1a74"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x79

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5049

    const v1, 0x533482f6

    xor-int/2addr v0, v1

    const v1, -0x1a5ba5de

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06e4\u06d8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x49

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x23c3

    const v1, 0x4a3fbaee    # 3141307.5f

    xor-int/2addr v0, v1

    const v1, 0x4d874d61    # 2.837494E8f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a7f2e1a -> :sswitch_7
        -0x534deee6 -> :sswitch_8
        -0x4116d15b -> :sswitch_4
        -0x3f36569f -> :sswitch_1
        -0x3405b341 -> :sswitch_5
        -0x300062b0 -> :sswitch_1
        -0x2aa21fbe -> :sswitch_4
        -0x2164f8fc -> :sswitch_8
        -0x159af652 -> :sswitch_6
        -0x150e93d6 -> :sswitch_9
        -0x1204af6c -> :sswitch_0
        -0x1c2143b -> :sswitch_c
        0xdbf869 -> :sswitch_2
        0x6c32fc7 -> :sswitch_e
        0xd5fe0cf -> :sswitch_7
        0xf8c446d -> :sswitch_a
        0x1159af6b -> :sswitch_d
        0x1a591e13 -> :sswitch_6
        0x2319aec7 -> :sswitch_b
        0x276d2370 -> :sswitch_0
        0x2c99a1f1 -> :sswitch_b
        0x3c07bcc5 -> :sswitch_2
        0x52272617 -> :sswitch_3
        0x545e61d9 -> :sswitch_c
        0x59f816b4 -> :sswitch_d
        0x64e6a7e8 -> :sswitch_e
        0x775e64dd -> :sswitch_5
        0x7a1a575e -> :sswitch_a
        0x7b7f3a8e -> :sswitch_3
        0x7f14f498 -> :sswitch_9
    .end sparse-switch
.end method
