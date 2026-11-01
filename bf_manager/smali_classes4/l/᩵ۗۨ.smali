.class public final synthetic Ll/᩵ۗۨ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܺ:Ll/ۛۗۨ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۗۨ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۗۨ;->ܺ:Ll/ۛۗۨ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, 0x2430ddb6

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3d6b

    const v5, 0x3864ed8b

    xor-int/2addr v4, v5

    const v5, -0x5323db34

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c21

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    const/4 p1, 0x0

    return p1

    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v3, :cond_6

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_b

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    goto :goto_1

    .line 0
    :sswitch_4
    invoke-static {p1}, Ll/ۛۗۨ;->֨(Ll/ۛۗۨ;)V

    const/4 p1, 0x1

    return p1

    :sswitch_5
    iget-object p1, p0, Ll/᩵ۗۨ;->ܺ:Ll/ۛۗۨ;

    .line 1
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x569d

    const v5, -0x31c7eb0a    # -7.7209536E8f

    xor-int/2addr v4, v5

    const v5, -0x5ec23edb

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x625d

    const v5, -0x3938d46c

    xor-int/2addr v4, v5

    const v5, 0x71cb1939

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06dc\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e09

    const v5, 0x653514a

    xor-int/2addr v4, v5

    const v5, -0x6ad42073

    goto/16 :goto_0

    .line 3
    :sswitch_8
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_3

    :goto_1
    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3727

    const v5, 0x3e4833f6

    xor-int/2addr v4, v5

    const v5, -0x849817f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06dc\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x56cd

    const v5, -0x35d6e3dd

    xor-int/2addr v4, v5

    const v5, -0x6919b253

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a76\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x261f

    const v5, -0x3f3a187

    xor-int/2addr v4, v5

    const v5, -0x7a64af79

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x33f

    const v5, -0x3e608e03

    xor-int/2addr v4, v5

    const v5, 0x5f66c2b4

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x641f

    const v5, -0x634869ac

    xor-int/2addr v4, v5

    const v5, -0x4d9778eb

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2f67

    const v5, 0x6f74471e

    xor-int/2addr v4, v5

    const v5, 0x342a730a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_9

    :cond_8
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1407

    const v5, 0x44fa2d0

    xor-int/2addr v4, v5

    const v5, -0x7120a63b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073f\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2049

    const v5, -0x1350d0c7

    xor-int/2addr v4, v5

    const v5, 0x521f921b

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u06e1\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x141

    const v5, -0x7ca70cc4

    xor-int/2addr v4, v5

    const v5, -0x6f87d377

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a3d

    const v5, -0x76c307df

    xor-int/2addr v4, v5

    const v5, -0x30bbaa2d

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49e9

    const v5, 0x145c98a

    xor-int/2addr v4, v5

    const v5, 0x416c499d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x625

    const v5, 0x3b893c0f

    xor-int/2addr v4, v5

    const v5, -0x4d97d841

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a76b9ec -> :sswitch_7
        -0x7a0b388f -> :sswitch_0
        -0x6663fea6 -> :sswitch_8
        -0x655931fb -> :sswitch_3
        -0x5ef847b7 -> :sswitch_2
        -0x5ad0a508 -> :sswitch_a
        -0x4dad0044 -> :sswitch_4
        -0x43a2380c -> :sswitch_1
        -0x40a1fc9e -> :sswitch_2
        -0x404cd0fc -> :sswitch_e
        -0x3c3d63aa -> :sswitch_e
        -0x2cbce3a8 -> :sswitch_d
        -0x270210bb -> :sswitch_6
        -0x26fe9e38 -> :sswitch_9
        -0x213980e2 -> :sswitch_4
        -0x9023201 -> :sswitch_b
        -0x56eee45 -> :sswitch_7
        0x1f3f9df7 -> :sswitch_a
        0x2bd38056 -> :sswitch_8
        0x3045d669 -> :sswitch_1
        0x37739eed -> :sswitch_0
        0x38797a69 -> :sswitch_d
        0x4170a55a -> :sswitch_b
        0x4410aba2 -> :sswitch_c
        0x489b7ecb -> :sswitch_5
        0x4c09dba3 -> :sswitch_9
        0x5349df5c -> :sswitch_c
        0x5add1762 -> :sswitch_5
        0x65b4b55a -> :sswitch_6
        0x6763ad38 -> :sswitch_3
    .end sparse-switch
.end method
