.class public final Ll/۟ۛ֫;
.super Ljava/lang/Object;
.source "K2SQ"


# static fields
.field public static ۙ:Ljava/lang/String;

.field public static ۤ:Ljava/lang/String;

.field public static ᩷:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Ll/ܿۛ֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۖ֡;->ۘܶܿ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۙ()Ljava/lang/String;
    .locals 1

    .line 29
    sget-object v0, Ll/۟ۛ֫;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;)V
    .locals 0

    .line 33
    sput-object p0, Ll/۟ۛ֫;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/۠۠᩻;)V
    .locals 6

    const v0, -0x25537229

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x66f1

    const v5, 0x55799e48

    xor-int/2addr v4, v5

    const v5, -0x61f63b3e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x8b7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 6
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_3

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v3

    if-lez v3, :cond_5

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_4

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    return-void

    :sswitch_5
    const/4 v3, 0x0

    .line 25
    sput-boolean v3, Ll/۟ۛ֫;->᩷:Z

    goto :goto_1

    :sswitch_6
    return-void

    .line 14
    :sswitch_7
    invoke-virtual {p0}, Ll/۠۠᩻;->᩸()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x21fb

    const v5, 0x1f6606e5

    xor-int/2addr v4, v5

    const v5, 0x28515a77

    goto :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x215d

    const v5, -0x66a320c0

    xor-int/2addr v4, v5

    const v5, 0x77c77b50

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06e1\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e63

    const v5, -0x268bce85

    xor-int/2addr v4, v5

    const v5, 0x16e94c56

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u1a73\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7983

    const v5, -0x9ec2b3c

    xor-int/2addr v4, v5

    const v5, 0x5b1bcb41

    goto/16 :goto_0

    .line 21
    :sswitch_a
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_3

    :goto_2
    const-string v3, "\u06ec\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3ba3

    const v5, 0x3de84f2d

    xor-int/2addr v4, v5

    const v5, 0x90120f1

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ab5

    const v5, -0x19351879

    xor-int/2addr v4, v5

    const v5, 0x2b5e0efc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x22cf

    const v5, 0x1b1a71f7

    xor-int/2addr v4, v5

    const v5, 0x6d094b91

    goto/16 :goto_0

    .line 13
    :sswitch_c
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_6

    :cond_5
    :goto_3
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x38e1

    const v5, -0x1e15cfcf    # -5.4000133E20f

    xor-int/2addr v4, v5

    const v5, -0x1d3a9866

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5477

    const v5, -0x3ee45cf1

    xor-int/2addr v4, v5

    const v5, 0x38c4ceb6

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_7

    :goto_4
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63af

    const v5, 0x2bd1fb2e

    xor-int/2addr v4, v5

    const v5, -0x50b5af41

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12a5

    const v5, -0xf03ac84

    xor-int/2addr v4, v5

    const v5, -0x484298b1

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_6

    :cond_8
    const-string v3, "\u1a76\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b65

    const v5, 0x3559b074

    xor-int/2addr v4, v5

    const v5, -0x7ba995f4

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_5
    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22af

    const v5, 0x17e6bf62

    xor-int/2addr v4, v5

    const v5, -0x4fb22a15

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28ed

    const v5, -0x2edea195

    xor-int/2addr v4, v5

    const v5, -0x20ee58f4

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0733\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xce7

    const v5, 0x1713968e

    xor-int/2addr v4, v5

    const v5, 0x1161515

    goto/16 :goto_0

    .line 11
    :sswitch_10
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_d

    :cond_c
    :goto_6
    const-string v3, "\u1a76\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64d

    const v5, -0x727e0e1c

    xor-int/2addr v4, v5

    const v5, 0x6404c15e

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d7\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2609

    const v5, 0x384e40

    xor-int/2addr v4, v5

    const v5, -0x19cc1041

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c2b978a -> :sswitch_0
        -0x6fa7afd4 -> :sswitch_2
        -0x6bc5eaa5 -> :sswitch_3
        -0x5cc01642 -> :sswitch_8
        -0x52731bc9 -> :sswitch_e
        -0x4ab664a1 -> :sswitch_5
        -0x4053fa49 -> :sswitch_e
        -0x3adfaee6 -> :sswitch_c
        -0x363e5020 -> :sswitch_6
        -0x20ecbb91 -> :sswitch_8
        -0x1c2d6cb9 -> :sswitch_7
        -0x189839aa -> :sswitch_10
        -0x1368aced -> :sswitch_10
        -0x13003748 -> :sswitch_4
        -0x112d9066 -> :sswitch_1
        -0xc5f2eb8 -> :sswitch_a
        -0xa2c4e08 -> :sswitch_5
        -0x1bc92b7 -> :sswitch_1
        0x9214fcf -> :sswitch_9
        0x178f3ac5 -> :sswitch_c
        0x201291d6 -> :sswitch_b
        0x259cf956 -> :sswitch_4
        0x2a399fed -> :sswitch_0
        0x2d5f056d -> :sswitch_d
        0x3cb5465a -> :sswitch_6
        0x519beb0f -> :sswitch_f
        0x59f06a56 -> :sswitch_9
        0x5b0deab2 -> :sswitch_b
        0x5cb8f980 -> :sswitch_d
        0x6477e8ea -> :sswitch_7
        0x6ae71dd9 -> :sswitch_2
        0x6c5043d9 -> :sswitch_f
        0x6e186699 -> :sswitch_a
        0x7dc44ec3 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۙ(Z)V
    .locals 0

    .line 25
    sput-boolean p0, Ll/۟ۛ֫;->᩷:Z

    return-void
.end method

.method public static ۤ()Z
    .locals 1

    .line 21
    sget-boolean v0, Ll/۟ۛ֫;->᩷:Z

    return v0
.end method

.method public static ᩷()Ljava/lang/String;
    .locals 1

    .line 37
    sget-object v0, Ll/۟ۛ֫;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public static ᩷(Ljava/lang/String;)V
    .locals 0

    .line 41
    sput-object p0, Ll/۟ۛ֫;->ۤ:Ljava/lang/String;

    return-void
.end method
