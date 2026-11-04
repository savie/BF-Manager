.class public final synthetic Ll/ܳᩳۤ;
.super Ljava/lang/Object;
.source "JAGX"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ۟:Ll/ܰ᩺᩻;

.field public final synthetic ܰ:Ll/ܺᩳۤ;

.field public final synthetic ܿ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ܺᩳۤ;Lbin/mt/plus/Main;Ll/۠ۖۧ;Ll/ܰ᩺᩻;Ljava/lang/String;)V
    .locals 6

    const v0, 0x52618f29

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7cd7

    const v5, -0x5b32b754

    xor-int/2addr v4, v5

    const v5, -0x3890afdd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x491d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_9

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-lez v3, :cond_b

    goto/16 :goto_4

    .line 3
    :sswitch_1
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-lez v3, :cond_6

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p5, p0, Ll/ܳᩳۤ;->֡:Ljava/lang/String;

    iput-object p4, p0, Ll/ܳᩳۤ;->۟:Ll/ܰ᩺᩻;

    return-void

    :sswitch_6
    iput-object p2, p0, Ll/ܳᩳۤ;->ܿ:Lbin/mt/plus/Main;

    .line 3
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e4\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3dbd

    const v5, 0x3772e5f7

    xor-int/2addr v4, v5

    const v5, -0x15bb5eac

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ff9

    const v5, 0x5bf9746d

    xor-int/2addr v4, v5

    const v5, -0x4b523729

    goto :goto_0

    .line 2
    :sswitch_8
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a77\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d7f

    const v5, -0x6596f0e8

    xor-int/2addr v4, v5

    const v5, 0x5adef0d2

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u073d\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x230f

    const v5, -0x3b36839

    xor-int/2addr v4, v5

    const v5, 0x439433ee

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e8\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x556f

    const v5, -0xea3240c

    xor-int/2addr v4, v5

    const v5, 0x6f026f9

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u073a\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x51e5

    const v5, 0x51b76537

    xor-int/2addr v4, v5

    const v5, 0xb94e6bf

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b75

    const v5, -0x51fffae

    xor-int/2addr v4, v5

    const v5, 0x6fee763

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ed

    const v5, 0x7e9adf7e

    xor-int/2addr v4, v5

    const v5, 0x3291d874

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u06db\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x69db

    const v5, 0x10fde08

    xor-int/2addr v4, v5

    const v5, 0x416d81c1

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x44c7

    const v5, -0x69365713

    xor-int/2addr v4, v5

    const v5, 0x70fcc9a9

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5793

    const v5, 0x71b2943f

    xor-int/2addr v4, v5

    const v5, -0x4ccd449e

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u1a7a\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3e89

    const v5, -0x65d5d477

    xor-int/2addr v4, v5

    const v5, 0x44c7bde6

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e7\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3705

    const v5, 0x67c780f4

    xor-int/2addr v4, v5

    const v5, 0x521ae225

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܳᩳۤ;->ܰ:Ll/ܺᩳۤ;

    iput-object p3, p0, Ll/ܳᩳۤ;->᩶:Ll/۠ۖۧ;

    .line 2
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xddb

    const v5, 0x3e3db3a0

    xor-int/2addr v4, v5

    const v5, 0x35c22483

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2217

    const v5, -0x7485be43

    xor-int/2addr v4, v5

    const v5, 0x6c11b9ef

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ebe6bf2 -> :sswitch_9
        -0x7ea17f39 -> :sswitch_c
        -0x6bcc1036 -> :sswitch_a
        -0x5caad504 -> :sswitch_c
        -0x5b29a138 -> :sswitch_4
        -0x53efa3fa -> :sswitch_0
        -0x49acc12c -> :sswitch_6
        -0x3ba1ded2 -> :sswitch_6
        -0x36bebeae -> :sswitch_2
        -0x33878d01 -> :sswitch_8
        -0x31eeec1e -> :sswitch_4
        -0x24ced5c1 -> :sswitch_3
        -0x1c5bf12f -> :sswitch_d
        -0x122638f0 -> :sswitch_a
        -0xe95e40e -> :sswitch_b
        -0x283dad8 -> :sswitch_2
        0x7d6c76 -> :sswitch_1
        0x10b21a0e -> :sswitch_5
        0x13e4b02b -> :sswitch_1
        0x1612ec7b -> :sswitch_7
        0x1a535044 -> :sswitch_7
        0x20357b8f -> :sswitch_9
        0x2de57218 -> :sswitch_e
        0x3341c39c -> :sswitch_3
        0x4db9fe28 -> :sswitch_e
        0x5c924226 -> :sswitch_0
        0x5f040852 -> :sswitch_d
        0x6091c4b4 -> :sswitch_5
        0x6384bbeb -> :sswitch_b
        0x70148eab -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    const/4 p1, 0x0

    const p2, -0x3772293e

    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    const-string v2, "\u1a78\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x13

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0xba1

    const v4, -0x3b05497f

    xor-int/2addr v3, v4

    const v4, -0x15d3eece

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, 0x3a29

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v3

    xor-int/2addr p2, v2

    sparse-switch p2, :sswitch_data_0

    .line 54
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v2

    if-eqz v2, :cond_9

    goto/16 :goto_4

    .line 38
    :sswitch_0
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_b

    goto :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    sget-boolean v2, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v2, :cond_8

    goto :goto_1

    .line 41
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v2, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v2, "\u05a1\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x73

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2e97

    const v4, -0x44d6b21a

    xor-int/2addr v3, v4

    const v4, -0x794c9f67

    goto :goto_0

    .line 123
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    :goto_2
    const-string v2, "\u073a\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x67

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0xe45

    const v4, 0x78ea7768

    xor-int/2addr v3, v4

    const v4, 0x70a58cc5

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    return-void

    .line 141
    :sswitch_5
    invoke-static {p1}, Ll/ۖۗ;->ۢ᩸ۙ(Ljava/lang/Object;)V

    .line 142
    new-instance v2, Ll/۫ᩳۤ;

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_1

    goto :goto_3

    :cond_1
    iget-object v3, p0, Ll/ܳᩳۤ;->ܰ:Ll/ܺᩳۤ;

    iget-object v4, p0, Ll/ܳᩳۤ;->۟:Ll/ܰ᩺᩻;

    iget-object v5, p0, Ll/ܳᩳۤ;->ܿ:Lbin/mt/plus/Main;

    .line 105
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_2

    goto/16 :goto_5

    .line 142
    :cond_2
    invoke-direct {v2, v3, v4, v5}, Ll/۫ᩳۤ;-><init>(Ll/ܺᩳۤ;Ll/ܰ᩺᩻;Lbin/mt/plus/Main;)V

    iget-object p1, p0, Ll/ܳᩳۤ;->֡:Ljava/lang/String;

    invoke-static {v2, v5, p1}, Ll/֨ۙ۫;->ۙ(Ll/ᩳۙ۫;Ll/ܽ֡֫;Ljava/lang/String;)V

    return-void

    .line 141
    :sswitch_6
    iget-object p1, p0, Ll/ܳᩳۤ;->᩶:Ll/۠ۖۧ;

    .line 84
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v2

    if-gtz v2, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v2, "\u073f\u1a79"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x79

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5c45

    const v4, -0x7738926e

    xor-int/2addr v3, v4

    const v4, -0x56120cad

    goto/16 :goto_0

    .line 21
    :sswitch_7
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v2

    if-eqz v2, :cond_4

    :goto_3
    const-string v2, "\u1a73\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0xd15

    const v4, -0x4a654bb9

    xor-int/2addr v3, v4

    const v4, -0x59639a8d

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u0730\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x69

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x1067

    const v4, -0x5b6cb7ce

    xor-int/2addr v3, v4

    const v4, 0x412113a

    goto/16 :goto_0

    .line 17
    :sswitch_8
    sget v2, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v2, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v2, "\u06eb\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5b99

    const v4, 0x3b23d80b    # 0.0025000598f

    xor-int/2addr v3, v4

    const v4, 0x56482e8d

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v2, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v2, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v2, "\u0730\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x53ff

    const v4, -0x2436f5cf

    xor-int/2addr v3, v4

    const v4, -0x74e6f734

    goto/16 :goto_0

    .line 15
    :sswitch_a
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    const-string v2, "\u1a76\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4ddb

    const v4, 0x27f7c3e0

    xor-int/2addr v3, v4

    const v4, -0x292fbc6

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string v2, "\u0730\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x22ab

    const v4, -0x75876d31

    xor-int/2addr v3, v4

    const v4, 0x3cd99a83

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u073f\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x4f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x737b

    const v4, 0x2a218a80

    xor-int/2addr v3, v4

    const v4, 0x1e60e640

    goto/16 :goto_0

    .line 28
    :sswitch_b
    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v2, :cond_a

    goto :goto_5

    :cond_a
    const-string v2, "\u06db\u1a73"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x3

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x74c9

    const v4, -0x696f4c75

    xor-int/2addr v3, v4

    const v4, 0x5a85fcb5

    goto/16 :goto_0

    .line 29
    :sswitch_c
    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v2, :cond_c

    :cond_b
    :goto_5
    const-string v2, "\u1a77\u05a1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x69

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3515

    const v4, 0x770ba7e4

    xor-int/2addr v3, v4

    const v4, 0x212e29ff

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e0\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x31c5

    const v4, 0x3c883825

    xor-int/2addr v3, v4

    const v4, 0x3c8a8289

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a355683 -> :sswitch_a
        -0x6cdf5e86 -> :sswitch_0
        -0x68c26447 -> :sswitch_c
        -0x68276855 -> :sswitch_2
        -0x671fcce7 -> :sswitch_7
        -0x5f0ae7cb -> :sswitch_8
        -0x4159ec49 -> :sswitch_8
        -0x372e4bcf -> :sswitch_9
        -0x34230d0e -> :sswitch_a
        -0x29012165 -> :sswitch_3
        -0xc470c18 -> :sswitch_0
        0x952a83 -> :sswitch_5
        0x80f2860 -> :sswitch_6
        0xbeab9bf -> :sswitch_1
        0x1080c8f2 -> :sswitch_4
        0x10845463 -> :sswitch_b
        0x15120046 -> :sswitch_b
        0x15413af0 -> :sswitch_2
        0x175140a2 -> :sswitch_c
        0x2b429d32 -> :sswitch_1
        0x3ba16268 -> :sswitch_3
        0x3d636800 -> :sswitch_9
        0x3dd314de -> :sswitch_6
        0x5beee84a -> :sswitch_5
        0x5fe460df -> :sswitch_4
        0x7fd0aa10 -> :sswitch_7
    .end sparse-switch
.end method
