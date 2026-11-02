.class public final synthetic Ll/ۛᩳ᩺;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܶ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/᩻ᩳ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ᩳ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x6e0b230c

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    sget v2, Ll/۟;->ۨᩴۛ:I

    const-string v3, "\u06e0\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x59b3

    const v5, 0x3ea68e37

    xor-int/2addr v4, v5

    const v5, 0x7f746764

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x2209

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    :sswitch_0
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    .line 3
    :sswitch_1
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    .line 0
    :sswitch_2
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ۛᩳ᩺;->ܺ:Ll/᩻ᩳ᩺;

    invoke-static {p1}, Ll/᩻ᩳ᩺;->ۙ(Ll/᩻ᩳ᩺;)Ll/۟۟۠;

    move-result-object p1

    return-object p1

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a78\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3f03

    const v5, -0x464e2611

    xor-int/2addr v4, v5

    const v5, -0xca95078

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06e4\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71c3

    const v5, 0x1c1a8280

    xor-int/2addr v4, v5

    const v5, 0x2d15cc39

    goto :goto_0

    :sswitch_8
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_2

    :goto_1
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x36e1

    const v5, 0x3622eee3

    xor-int/2addr v4, v5

    const v5, -0x5967eedc

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x669b

    const v5, -0x18bd84bc

    xor-int/2addr v4, v5

    const v5, -0x8cf1320

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06e7\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5909

    const v5, 0x332ed71f

    xor-int/2addr v4, v5

    const v5, -0x63208637

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u0730\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x279b

    const v5, -0x8820efa

    xor-int/2addr v4, v5

    const v5, 0x73ab24cf

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06eb\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7943

    const v5, 0x63be25d5

    xor-int/2addr v4, v5

    const v5, -0x3e046941

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xbf9

    const v5, 0x666af851

    xor-int/2addr v4, v5

    const v5, 0x1b591742

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x13

    const v5, -0x14a64b83

    xor-int/2addr v4, v5

    const v5, -0x25251f2e

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24a5

    const v5, -0x311c0e1

    xor-int/2addr v4, v5

    const v5, -0x66e9f67

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7b23

    const v5, -0x49bcdbde

    xor-int/2addr v4, v5

    const v5, -0x1c325129

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u073a\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x362d

    const v5, -0x65241750

    xor-int/2addr v4, v5

    const v5, -0x1f187e5e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x570f

    const v5, -0x4eddb589

    xor-int/2addr v4, v5

    const v5, -0x97035d8

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x598d

    const v5, -0x2968465f

    xor-int/2addr v4, v5

    const v5, -0x6f7d05f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x328d

    const v5, -0x1257884f

    xor-int/2addr v4, v5

    const v5, 0x10a75728

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e4b11a1 -> :sswitch_d
        -0x74c5a1df -> :sswitch_5
        -0x6efdaaa1 -> :sswitch_b
        -0x6178f4e2 -> :sswitch_2
        -0x5aba6dd9 -> :sswitch_3
        -0x4a0d68a7 -> :sswitch_9
        -0x47af707e -> :sswitch_e
        -0x3cc980ce -> :sswitch_5
        -0x37245f2d -> :sswitch_c
        -0x2ec27443 -> :sswitch_2
        -0x151181e1 -> :sswitch_9
        -0xad672fb -> :sswitch_7
        0x3ea877e -> :sswitch_b
        0xca7325d -> :sswitch_e
        0x1b8041e9 -> :sswitch_8
        0x2f44795f -> :sswitch_4
        0x327ef1dc -> :sswitch_1
        0x336ccc2f -> :sswitch_3
        0x3782083a -> :sswitch_4
        0x37e260e7 -> :sswitch_1
        0x3c2f905c -> :sswitch_a
        0x3d5462e8 -> :sswitch_7
        0x3e3e493e -> :sswitch_d
        0x451764ee -> :sswitch_c
        0x4884ba49 -> :sswitch_6
        0x4bba2264 -> :sswitch_8
        0x68c8d894 -> :sswitch_6
        0x6f2cfc56 -> :sswitch_a
        0x6f3784ca -> :sswitch_0
        0x77883391 -> :sswitch_0
    .end sparse-switch
.end method
