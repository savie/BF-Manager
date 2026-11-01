.class public final Ll/ܿᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ۖ:Ll/۠᩵ᩴ;

.field public final ۙ:I

.field public final ۨ:Ll/۠᩵ᩴ;

.field public final ܰ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;Ljava/lang/String;I)V
    .locals 6

    const v0, -0x1164911

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    sget v2, Ll/ۘۗ;->ۖۧ۬:I

    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f5b

    const v5, 0x61772be3

    xor-int/2addr v4, v5

    const v5, 0x64efd182

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7f4d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 293
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_2

    goto/16 :goto_1

    .line 8
    :sswitch_0
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x8d

    const v5, -0x33d31954    # -4.5324976E7f

    xor-int/2addr v4, v5

    const v5, 0x21c08f9b

    goto :goto_0

    .line 207
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-lez v3, :cond_5

    goto/16 :goto_3

    .line 125
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_3

    .line 192
    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 307
    :sswitch_5
    iput-object p3, p0, Ll/ܿᩴۘ;->ܰ:Ljava/lang/String;

    .line 308
    iput p4, p0, Ll/ܿᩴۘ;->ۙ:I

    return-void

    .line 153
    :sswitch_6
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06da\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x733

    const v5, -0x48e47180

    xor-int/2addr v4, v5

    const v5, 0x38e92367    # 1.11169E-4f

    goto :goto_0

    :cond_2
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x293f

    const v5, -0x398343a8

    xor-int/2addr v4, v5

    const v5, -0x2a3c6164

    goto :goto_0

    .line 27
    :sswitch_7
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a78\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5993

    const v5, -0x4bf58170

    xor-int/2addr v4, v5

    const v5, -0x2264bde1

    goto/16 :goto_0

    .line 46
    :sswitch_8
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06d8\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5033

    const v5, -0x73a272d4

    xor-int/2addr v4, v5

    const v5, -0x35ca0c66    # -2981094.5f

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u05ab\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1653

    const v5, -0x24fd3a2e

    xor-int/2addr v4, v5

    const v5, 0x6c32d51a

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06da\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7baf

    const v5, 0x65d7b66b

    xor-int/2addr v4, v5

    const v5, -0x7765ca10

    goto/16 :goto_0

    .line 56
    :sswitch_a
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u06e1\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5f69

    const v5, -0x130c8b96

    xor-int/2addr v4, v5

    const v5, 0x3b8ef04d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e27

    const v5, -0x765eb878

    xor-int/2addr v4, v5

    const v5, 0x3459554

    goto/16 :goto_0

    .line 141
    :sswitch_b
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x241f

    const v5, 0x2ccf7479

    xor-int/2addr v4, v5

    const v5, -0x5d76b800

    goto/16 :goto_0

    .line 13
    :sswitch_c
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6115

    const v5, 0x38fa7a9a

    xor-int/2addr v4, v5

    const v5, 0x198f62d1

    goto/16 :goto_0

    .line 176
    :sswitch_d
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u06df\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x24cf

    const v5, 0x615e3f78

    xor-int/2addr v4, v5

    const v5, 0x181d37ba

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6421

    const v5, 0x616ebb42

    xor-int/2addr v4, v5

    const v5, 0x3d464d79

    goto/16 :goto_0

    .line 305
    :sswitch_e
    iput-object p1, p0, Ll/ܿᩴۘ;->ۨ:Ll/۠᩵ᩴ;

    .line 306
    iput-object p2, p0, Ll/ܿᩴۘ;->ۖ:Ll/۠᩵ᩴ;

    .line 160
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x46e3

    const v5, 0x552ccc5e

    xor-int/2addr v4, v5

    const v5, -0x1ae8052a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3489

    const v5, 0x3d8b585b

    xor-int/2addr v4, v5

    const v5, 0xc758d75

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7660b893 -> :sswitch_a
        -0x71de53ba -> :sswitch_b
        -0x70578283 -> :sswitch_3
        -0x6f62b6e5 -> :sswitch_d
        -0x6cda5fdf -> :sswitch_0
        -0x6c6a99bc -> :sswitch_8
        -0x66a0fdcc -> :sswitch_4
        -0x659c3c86 -> :sswitch_a
        -0x5c70112f -> :sswitch_8
        -0x551748fb -> :sswitch_c
        -0x50b8133b -> :sswitch_5
        -0x378b975c -> :sswitch_1
        -0x30e15cce -> :sswitch_0
        -0x2eb10002 -> :sswitch_e
        -0x24a3f747 -> :sswitch_7
        -0x1edfe368 -> :sswitch_7
        -0x1edcb779 -> :sswitch_9
        -0x137e1e5d -> :sswitch_2
        -0x463bd4f -> :sswitch_3
        -0x3751f6e -> :sswitch_b
        0x5185507 -> :sswitch_6
        0xad681c0 -> :sswitch_1
        0x2a98a291 -> :sswitch_6
        0x3d9427ab -> :sswitch_d
        0x3f59a095 -> :sswitch_2
        0x43d0988f -> :sswitch_4
        0x4a04f7e8 -> :sswitch_9
        0x5ae8e456 -> :sswitch_5
        0x739311c6 -> :sswitch_e
        0x7ac22fe6 -> :sswitch_c
    .end sparse-switch
.end method
