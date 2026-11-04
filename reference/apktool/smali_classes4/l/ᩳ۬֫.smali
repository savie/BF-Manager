.class public final Ll/ᩳ۬֫;
.super Ljava/lang/Object;
.source "H6HS"


# instance fields
.field public final ۙ:Ljava/util/Map;

.field public ۤ:Z

.field public ᩷:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    const v0, 0xc594282

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f47

    const v5, 0x3632b099

    xor-int/2addr v4, v5

    const v5, -0x1aefc823

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x6cf3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 17
    :sswitch_0
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06d8\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x73db

    const v5, 0x56ca9e0a

    xor-int/2addr v4, v5

    const v5, -0x3b39ec8e

    goto :goto_0

    :sswitch_1
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v3, :cond_a

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xa41

    const v5, 0x5c40401a

    xor-int/2addr v4, v5

    const v5, 0x1792ffb7

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto :goto_2

    .line 49
    :sswitch_4
    new-instance v3, Ll/۟۬֫;

    const/high16 v4, 0x3f400000    # 0.75f

    .line 1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_3

    .line 36
    :cond_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    .line 27
    :cond_5
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    .line 24
    :cond_6
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_7

    goto :goto_3

    .line 9
    :cond_7
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_8

    :goto_2
    const-string v3, "\u1a75\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x41

    const v5, -0x6cb24247

    xor-int/2addr v4, v5

    const v5, -0x7eee102f

    goto/16 :goto_0

    :cond_8
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_9

    goto :goto_3

    .line 0
    :cond_9
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v5

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a7b\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x58ef

    const v5, 0x7afdb04e

    xor-int/2addr v4, v5

    const v5, 0x755e9bc8

    goto/16 :goto_0

    :cond_b
    const/4 v5, 0x1

    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_c

    const-string v3, "\u06e1\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1353

    const v5, 0x6f449cde

    xor-int/2addr v4, v5

    const v5, 0x5212b391

    goto/16 :goto_0

    :cond_c
    const/16 v0, 0x10

    .line 49
    invoke-direct {v3, v0, v4, v5}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v3, p0, Ll/ᩳ۬֫;->ۙ:Ljava/util/Map;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x52826119 -> :sswitch_4
        -0x3b4e2b9a -> :sswitch_0
        -0x31226683 -> :sswitch_3
        -0x2ab5d7a1 -> :sswitch_3
        -0x292c9e17 -> :sswitch_0
        0x4b9210c -> :sswitch_1
        0x3d3347c9 -> :sswitch_2
        0x4e135d90 -> :sswitch_1
        0x4f0ebd06 -> :sswitch_4
        0x64b6665a -> :sswitch_2
    .end sparse-switch
.end method
