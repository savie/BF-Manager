.class public final synthetic Ll/ᩴᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/ۙ۠ۘ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۙ۠ۘ;I)V
    .locals 6

    const v0, -0x21b014ed

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ac7

    const v5, 0x443854e1

    xor-int/2addr v4, v5

    const v5, -0x35001605    # -8385789.5f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x356d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_6

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_4

    .line 3
    :sswitch_1
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_8

    goto :goto_1

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_a

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    :goto_1
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ebb

    const v5, -0x21aecd00

    xor-int/2addr v4, v5

    const v5, 0xc02c2d5

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p2, p0, Ll/ᩴᩳۘ;->᩶:I

    return-void

    :sswitch_6
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ecb

    const v5, 0x70a4fe79

    xor-int/2addr v4, v5

    const v5, 0x5dcba5fb

    goto :goto_0

    .line 3
    :sswitch_7
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6a17

    const v5, -0x1f5102c4

    xor-int/2addr v4, v5

    const v5, 0x2b1bd34e

    goto :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06df\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x502d

    const v5, 0x6e73f789

    xor-int/2addr v4, v5

    const v5, 0x3fa8a3e9

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2dcb

    const v5, -0x4950b7b7

    xor-int/2addr v4, v5

    const v5, -0x4b513117

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b1f

    const v5, 0x3298e08b

    xor-int/2addr v4, v5

    const v5, -0x3f574c14

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a78\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x66a7

    const v5, -0x4b592738

    xor-int/2addr v4, v5

    const v5, -0x4ef033fb

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1111

    const v5, 0x6e10e28f

    xor-int/2addr v4, v5

    const v5, 0x677b0cdd

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x476f

    const v5, -0x57598c9f

    xor-int/2addr v4, v5

    const v5, 0x403e0292

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3073

    const v5, -0x3adb5c98

    xor-int/2addr v4, v5

    const v5, -0x7f66487c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e7\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6af3

    const v5, 0x44f569bc

    xor-int/2addr v4, v5

    const v5, -0x237f348d

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e1\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x79

    const v5, 0x36c542d0

    xor-int/2addr v4, v5

    const v5, -0x7bb650f4

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1b33

    const v5, -0x2fea5eb7

    xor-int/2addr v4, v5

    const v5, -0x31ca512d

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_c

    :goto_5
    const-string v3, "\u06df\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2a81

    const v5, 0x604f975f

    xor-int/2addr v4, v5

    const v5, -0x33d46c5    # -8.0885E36f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0733\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7565

    const v5, 0x1a232b48

    xor-int/2addr v4, v5

    const v5, -0x99c890

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c6d11f5 -> :sswitch_7
        -0x7a5f4f95 -> :sswitch_6
        -0x6cafb2f9 -> :sswitch_d
        -0x5cdda101 -> :sswitch_0
        -0x5a2eda35 -> :sswitch_c
        -0x4d295f73 -> :sswitch_a
        -0x4a795d58 -> :sswitch_b
        -0x45749cfd -> :sswitch_e
        -0x44373078 -> :sswitch_1
        -0x167f3619 -> :sswitch_e
        -0xd5ef7a5 -> :sswitch_8
        -0x7921ca0 -> :sswitch_4
        -0x6dc3512 -> :sswitch_a
        -0x63771f9 -> :sswitch_2
        -0x4556ef4 -> :sswitch_6
        0x22b4209 -> :sswitch_5
        0x1712ca3c -> :sswitch_8
        0x2099a84f -> :sswitch_3
        0x2340a057 -> :sswitch_c
        0x2fd73a17 -> :sswitch_d
        0x357cbb2f -> :sswitch_5
        0x4797af2b -> :sswitch_0
        0x4b13df6a -> :sswitch_9
        0x51811783 -> :sswitch_2
        0x53e222cb -> :sswitch_4
        0x54f8b479 -> :sswitch_3
        0x5c9f560a -> :sswitch_1
        0x5faf7f1d -> :sswitch_9
        0x6048708d -> :sswitch_7
        0x6369ec42 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ᩴᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    iget v1, p0, Ll/ᩴᩳۘ;->᩶:I

    invoke-static {v0, v1}, Ll/ۙ۠ۘ;->ۨ(Ll/ۙ۠ۘ;I)V

    return-void
.end method
