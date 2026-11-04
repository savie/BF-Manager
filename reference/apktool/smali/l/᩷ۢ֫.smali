.class public final synthetic Ll/᩷ۢ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/ۚۢ֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۢ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۢ֫;->ܰ:Ll/ۚۢ֫;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4bc469b5

    sget v2, Ll/᩺;->۫۬۫:I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x105f

    const v6, 0x4b8bdb4

    xor-int/2addr v5, v6

    const v6, -0x4ba28c67

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2f6d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    sget v4, Ll/᩺;->۫۬۫:I

    if-lez v4, :cond_a

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u1a77\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5931

    const v6, 0x7892d436

    xor-int/2addr v5, v6

    const v6, 0x65d20b38

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

    .line 0
    :sswitch_4
    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0, p1}, Ll/ۚۢ֫;->ۙ(Ljava/lang/Exception;)V

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/᩷ۢ֫;->ܰ:Ll/ۚۢ֫;

    .line 2
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06d8\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6411

    const v6, -0x2732c235

    xor-int/2addr v5, v6

    const v6, -0x69736fa0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u05ab\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x717

    const v6, -0x1c62e8cc

    xor-int/2addr v5, v6

    const v6, 0x709d5724

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u0733\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x64bd

    const v6, 0x3f9166b5

    xor-int/2addr v5, v6

    const v6, -0x109a6394

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x483b

    const v6, 0x34f8e0db

    xor-int/2addr v5, v6

    const v6, -0x6ab0a98c

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u05a1\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34d3

    const v6, -0x38d70467

    xor-int/2addr v5, v6

    const v6, -0x637e0f8f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4321

    const v6, 0x33c687f

    xor-int/2addr v5, v6

    const v6, 0x5ead3d52

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06d6\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x71b

    const v6, 0x2f28fcce

    xor-int/2addr v5, v6

    const v6, -0x3d6e091d

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u0730\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x616f

    const v6, -0x556ce81b

    xor-int/2addr v5, v6

    const v6, -0x56684e9

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4b2f

    const v6, -0x1c783b02

    xor-int/2addr v5, v6

    const v6, -0x4cd8d88d

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x257

    const v6, 0x40d2854f

    xor-int/2addr v5, v6

    const v6, 0x151f36bc

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06e8\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5881

    const v6, 0x3c1ca4bc

    xor-int/2addr v5, v6

    const v6, -0x6d466844

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d7\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7007

    const v6, -0x4b793ce2

    xor-int/2addr v5, v6

    const v6, -0xeca3974

    goto/16 :goto_0

    .line 3
    :sswitch_e
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v4

    if-nez v4, :cond_c

    :goto_4
    const-string v4, "\u1a79\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6e57

    const v6, 0x44322d44

    xor-int/2addr v5, v6

    const v6, 0x1d9e780e

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e17

    const v6, 0x501982ee

    xor-int/2addr v5, v6

    const v6, 0x69aa98d9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76370808 -> :sswitch_8
        -0x6cb761fb -> :sswitch_5
        -0x67f6840e -> :sswitch_c
        -0x6007d723 -> :sswitch_2
        -0x599de974 -> :sswitch_2
        -0x5790093f -> :sswitch_9
        -0x50530a8e -> :sswitch_7
        -0x49e50a1e -> :sswitch_0
        -0x46a0cbcb -> :sswitch_1
        -0x3f8532d8 -> :sswitch_a
        -0x3f64d93e -> :sswitch_d
        -0x34393a89 -> :sswitch_6
        -0x28be917c -> :sswitch_e
        -0x1a281196 -> :sswitch_4
        -0x11c607a4 -> :sswitch_9
        0xbd539fb -> :sswitch_a
        0x109dea91 -> :sswitch_5
        0x15eedb05 -> :sswitch_4
        0x23dbce8c -> :sswitch_3
        0x31bc55b2 -> :sswitch_b
        0x3a8c7b66 -> :sswitch_0
        0x3ffde846 -> :sswitch_3
        0x46a09ca5 -> :sswitch_b
        0x4fc76059 -> :sswitch_8
        0x52ce8225 -> :sswitch_6
        0x53492d90 -> :sswitch_d
        0x5d7a6826 -> :sswitch_e
        0x5f3263ea -> :sswitch_1
        0x64003a36 -> :sswitch_7
        0x6f2ab0b4 -> :sswitch_c
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
