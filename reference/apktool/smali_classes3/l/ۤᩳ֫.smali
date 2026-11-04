.class public final synthetic Ll/ۤᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ljava/text/Collator;


# direct methods
.method public synthetic constructor <init>(Ljava/text/Collator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤᩳ֫;->ܰ:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0xcab44db

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v6, Ll/֫۠;->ۢᩴ᩺:I

    const-string v7, "\u06e7\u073a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xd11

    const v9, 0x69731aec

    xor-int/2addr v8, v9

    const v9, 0x1d948d2

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x54fb

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 731
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v7, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v7, :cond_7

    goto/16 :goto_1

    .line 997
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_3

    .line 534
    :sswitch_1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v7, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v7, :cond_b

    goto :goto_1

    .line 140
    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto :goto_1

    .line 745
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    const/4 p1, 0x0

    return p1

    .line 2360
    :sswitch_4
    iget-object p1, p0, Ll/ۤᩳ֫;->ܰ:Ljava/text/Collator;

    invoke-virtual {p1, v2, v3}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    .line 6
    :sswitch_5
    sget v2, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2360
    invoke-virtual {v0}, Ll/᩵ۢ֫;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ll/᩵ۢ֫;->ۙ()Ljava/lang/String;

    move-result-object v3

    .line 305
    sget-boolean v7, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v7, "\u06d7\u0736"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x74ad

    const v9, -0x292459d6

    xor-int/2addr v8, v9

    const v9, -0x2620af1f

    goto :goto_0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/᩵ۢ֫;

    .line 1198
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v7, "\u0736\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xa77

    const v9, -0x153f7a24

    xor-int/2addr v8, v9

    const v9, 0x793dc5ac

    goto/16 :goto_0

    .line 1279
    :sswitch_7
    sget v7, Ll/ۧ;->ۨۗܰ:I

    if-ltz v7, :cond_2

    :goto_1
    const-string v7, "\u06dc\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4acb

    const v9, -0x60c893ca

    xor-int/2addr v8, v9

    const v9, 0xbb8e3a0

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u0730\u1a78"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x403d

    const v9, -0x517194af

    xor-int/2addr v8, v9

    const v9, 0x77c4ad5

    goto/16 :goto_0

    :sswitch_8
    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v7, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v7, "\u06d6\u0733"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3cdb

    const v9, -0x24bfe57c

    xor-int/2addr v8, v9

    const v9, -0x6e069ae7

    goto/16 :goto_0

    .line 359
    :sswitch_9
    sget v7, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u1a73\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4ce1

    const v9, -0x5e2095b8

    xor-int/2addr v8, v9

    const v9, 0x689e2962

    goto/16 :goto_0

    .line 1031
    :sswitch_a
    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v7, :cond_5

    goto :goto_4

    :cond_5
    const-string v7, "\u05a8\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6b2b

    const v9, 0xae484d2

    xor-int/2addr v8, v9

    const v9, -0x3b7da666    # -1042.8f

    goto/16 :goto_0

    .line 1243
    :sswitch_b
    sget v7, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v7, :cond_6

    :goto_2
    const-string v7, "\u05a8\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7f2f

    const v9, -0x7f0244df

    xor-int/2addr v8, v9

    const v9, -0x58c18b45

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06e7\u06e7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4c4d

    const v9, 0x40e6d097

    xor-int/2addr v8, v9

    const v9, -0x235d8c94

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v7, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v7, :cond_8

    :cond_7
    :goto_3
    const-string v7, "\u06db\u06ec"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x14f7

    const v9, -0x8d5952a

    xor-int/2addr v8, v9

    const v9, 0x3ab9d327

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06eb\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x7d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x15a7

    const v9, -0x3b551a57

    xor-int/2addr v8, v9

    const v9, 0x7d31d0e

    goto/16 :goto_0

    .line 67
    :sswitch_d
    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v7, :cond_a

    :cond_9
    :goto_4
    const-string v7, "\u06e1\u06ec"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1e25

    const v9, -0x4fc6b3a

    xor-int/2addr v8, v9

    const v9, -0xcbe5441

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u0733\u073a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2f8f

    const v9, -0x25927108

    xor-int/2addr v8, v9

    const v9, -0x1cf05095

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    const-string v7, "\u06d7\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x690f

    const v9, 0x783ddb77

    xor-int/2addr v8, v9

    const v9, 0x5624fcef

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06d8\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x37

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6b61

    const v9, -0x3fad4311

    xor-int/2addr v8, v9

    const v9, -0x35d42f0d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b6e8fd8 -> :sswitch_c
        -0x79130285 -> :sswitch_6
        -0x74fb3927 -> :sswitch_d
        -0x6d8e3398 -> :sswitch_1
        -0x6c141dd8 -> :sswitch_4
        -0x6192d240 -> :sswitch_3
        -0x5c863cb6 -> :sswitch_5
        -0x5b725023 -> :sswitch_0
        -0x42f0faa2 -> :sswitch_3
        -0x3ec4a972 -> :sswitch_b
        -0x3075e120 -> :sswitch_5
        -0x2af1ecc1 -> :sswitch_a
        -0x25e51a75 -> :sswitch_8
        -0x12f55421 -> :sswitch_0
        -0x775e396 -> :sswitch_d
        0x729fe62 -> :sswitch_4
        0xed39706 -> :sswitch_9
        0x1c104ca8 -> :sswitch_2
        0x24633948 -> :sswitch_e
        0x2633eb5f -> :sswitch_7
        0x274e832d -> :sswitch_7
        0x27f5ee1a -> :sswitch_c
        0x2f6f5401 -> :sswitch_6
        0x2f9daa4c -> :sswitch_e
        0x3cf8b5a7 -> :sswitch_b
        0x5b650f51 -> :sswitch_2
        0x66a9f603 -> :sswitch_8
        0x6a1592a5 -> :sswitch_a
        0x708d61a0 -> :sswitch_1
        0x7235d28a -> :sswitch_9
    .end sparse-switch
.end method
