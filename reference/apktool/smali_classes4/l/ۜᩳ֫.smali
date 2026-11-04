.class public final Ll/ۜᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/ۙۜ᩷;


# instance fields
.field public final synthetic ܰ:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;)V
    .locals 0

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜᩳ֫;->ܰ:Ll/۟ۢ֫;

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public final onPageSelected(I)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, 0x57ec4960

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ba7

    const v6, 0x1700badc

    xor-int/2addr v5, v6

    const v6, -0x6d5a9f2c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x6997

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 254
    invoke-static {v0, p1}, Ll/۟ۢ֫;->᩸(Ll/۟ۢ֫;I)V

    const/4 p1, -0x2

    .line 255
    iput p1, v0, Ll/۟ۢ֫;->᩹᩷:I

    return-void

    .line 109
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-nez v4, :cond_a

    goto :goto_2

    .line 64
    :sswitch_1
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v4, :cond_5

    goto/16 :goto_5

    .line 148
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_5

    .line 57
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_5

    .line 80
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    return-void

    .line 254
    :sswitch_5
    iget-object v0, p0, Ll/ۜᩳ֫;->ܰ:Ll/۟ۢ֫;

    .line 143
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3cfb

    const v6, 0x589f6cd4

    xor-int/2addr v5, v6

    const v6, 0xb8b4d4a

    goto :goto_0

    :sswitch_6
    const/4 p1, -0x1

    .line 93
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_1
    const-string v4, "\u06d9\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x22e3

    const v6, 0x20dca710    # 3.7380002E-19f

    xor-int/2addr v5, v6

    const v6, 0x39896199

    goto :goto_0

    :cond_1
    const-string v4, "\u06d8\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6fbb

    const v6, 0x5fcc859e

    xor-int/2addr v5, v6

    const v6, 0x3209c4ba

    goto :goto_0

    .line 82
    :sswitch_7
    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_3

    :cond_2
    :goto_2
    const-string v4, "\u06dc\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6903

    const v6, 0x518b788

    xor-int/2addr v5, v6

    const v6, -0x72eb085e

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a78\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x351d

    const v6, -0x49bdea05

    xor-int/2addr v5, v6

    const v6, 0xa9872a8

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x65e1

    const v6, 0x1c38cdcf

    xor-int/2addr v5, v6

    const v6, -0x69098b82

    goto/16 :goto_0

    .line 65
    :sswitch_9
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    :goto_3
    const-string v4, "\u06db\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x69af

    const v6, -0x2f8f72b6

    xor-int/2addr v5, v6

    const v6, 0x3eb05c35

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e4\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3487

    const v6, -0x2bc6bda

    xor-int/2addr v5, v6

    const v6, -0x5bc3f52f

    goto/16 :goto_0

    .line 167
    :sswitch_a
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x72f9

    const v6, -0x58bf3286

    xor-int/2addr v5, v6

    const v6, -0x238b3b73

    goto/16 :goto_0

    .line 51
    :sswitch_b
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06eb\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3669

    const v6, 0x5bff6639

    xor-int/2addr v5, v6

    const v6, -0x6e6379a1

    goto/16 :goto_0

    .line 176
    :sswitch_c
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u06e4\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6a5b

    const v6, 0x141c1523

    xor-int/2addr v5, v6

    const v6, -0x68b551c7

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06da\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a5f

    const v6, -0x63065152

    xor-int/2addr v5, v6

    const v6, 0x6972bd63

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06eb\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fb1

    const v6, -0x349c35

    xor-int/2addr v5, v6

    const v6, 0x663969e9

    goto/16 :goto_0

    .line 188
    :sswitch_e
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_c

    :goto_5
    const-string v4, "\u06d6\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d8d

    const v6, -0x72aeb280

    xor-int/2addr v5, v6

    const v6, 0x4b83457b    # 1.7206006E7f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e0\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1923

    const v6, 0x10a2ed6e

    xor-int/2addr v5, v6

    const v6, 0x396d6794

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7912e2af -> :sswitch_a
        -0x760f1b58 -> :sswitch_0
        -0x6e312dfb -> :sswitch_6
        -0x659a94a5 -> :sswitch_3
        -0x64414428 -> :sswitch_b
        -0x5a812d09 -> :sswitch_7
        -0x550486a6 -> :sswitch_c
        -0x4a4b772c -> :sswitch_5
        -0x458ecc17 -> :sswitch_8
        -0x3f1bfd43 -> :sswitch_2
        -0x2ac04aff -> :sswitch_d
        -0x29fe2435 -> :sswitch_1
        -0x277fc8f8 -> :sswitch_e
        -0x26f4f244 -> :sswitch_1
        -0x1bba215e -> :sswitch_8
        -0x126ee724 -> :sswitch_3
        -0x68cbd75 -> :sswitch_7
        -0x4053f9c -> :sswitch_4
        0x105e201d -> :sswitch_0
        0x1dea0ed7 -> :sswitch_6
        0x1f33afca -> :sswitch_d
        0x25785a6b -> :sswitch_5
        0x29c1c073 -> :sswitch_2
        0x2b7a8ac1 -> :sswitch_4
        0x2ce5023a -> :sswitch_9
        0x3d98ed4d -> :sswitch_9
        0x47d01406 -> :sswitch_e
        0x731d3678 -> :sswitch_b
        0x7c32a057 -> :sswitch_c
        0x7ec4dd7c -> :sswitch_a
    .end sparse-switch
.end method
