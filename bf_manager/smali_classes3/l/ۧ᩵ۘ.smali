.class public final Ll/ۧ᩵ۘ;
.super Ljava/lang/Object;
.source "G6K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ܺ:Z

.field public final synthetic ᩶:Ll/᩻᩵ۘ;


# direct methods
.method public constructor <init>(Ll/᩻᩵ۘ;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩵ۘ;->᩶:Ll/᩻᩵ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const v0, -0x740423dc

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    sget v2, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v3, "\u06e7\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1013

    const v5, -0x2e00e90

    xor-int/2addr v4, v5

    const v5, -0x3e4fcf02

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x12b5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 88
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_0

    const-string v3, "\u06eb\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4703

    const v5, -0x77508f70

    xor-int/2addr v4, v5

    const v5, -0x357c391c    # -4318066.0f

    goto :goto_0

    :sswitch_0
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 28
    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_3

    .line 67
    :sswitch_2
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto/16 :goto_1

    .line 86
    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    return-void

    .line 115
    :sswitch_5
    iget-object v3, p0, Ll/ۧ᩵ۘ;->᩶:Ll/᩻᩵ۘ;

    invoke-virtual {v3}, Ll/᩻᩵ۘ;->ۙ()V

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06e1\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c13

    const v5, -0x174140e8

    xor-int/2addr v4, v5

    const v5, 0x687c4ecd

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06d9\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2307

    const v5, 0x71c131a4

    xor-int/2addr v4, v5

    const v5, 0x773d2c98

    goto :goto_0

    .line 48
    :sswitch_7
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v3, "\u1a7a\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4561

    const v5, -0x19b77190

    xor-int/2addr v4, v5

    const v5, -0x6d78fec4    # -8.520002E-28f

    goto/16 :goto_0

    .line 52
    :sswitch_8
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_4

    :cond_3
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ad9

    const v5, 0x1cc91141

    xor-int/2addr v4, v5

    const v5, 0x274efddc

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u05a8\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xdb

    const v5, -0x6bc8dec1

    xor-int/2addr v4, v5

    const v5, 0x39b984ab

    goto/16 :goto_0

    .line 105
    :sswitch_9
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3401

    const v5, -0x66018a93

    xor-int/2addr v4, v5

    const v5, -0x1fbd2daa

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f57

    const v5, 0x302c79d8

    xor-int/2addr v4, v5

    const v5, -0x68d4768a

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_1
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd2f

    const v5, 0x6f0bfac6

    xor-int/2addr v4, v5

    const v5, -0x5843ada0

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x34d9

    const v5, -0x1a5e8d9a

    xor-int/2addr v4, v5

    const v5, 0x26cfcd4

    goto/16 :goto_0

    .line 61
    :sswitch_c
    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e7\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x8f

    const v5, 0x5a614dcf

    xor-int/2addr v4, v5

    const v5, 0x20044f0

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6c37

    const v5, 0x7a9610d7

    xor-int/2addr v4, v5

    const v5, 0x68fc879a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d8\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4caf

    const v5, -0x494f86bf

    xor-int/2addr v4, v5

    const v5, 0x133a95ab

    goto/16 :goto_0

    :sswitch_e
    const/4 v3, 0x1

    .line 114
    iput-boolean v3, p0, Ll/ۧ᩵ۘ;->ܺ:Z

    .line 21
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06e7\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2885

    const v5, 0x753a81f0

    xor-int/2addr v4, v5

    const v5, -0xde2cc3d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x255f

    const v5, 0x6bad889c

    xor-int/2addr v4, v5

    const v5, 0x5344c052

    goto/16 :goto_0

    :sswitch_f
    return-void

    .line 113
    :sswitch_10
    iget-boolean v3, p0, Ll/ۧ᩵ۘ;->ܺ:Z

    if-nez v3, :cond_d

    const-string v3, "\u06e7\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5143

    const v5, -0x8207cd9

    xor-int/2addr v4, v5

    const v5, -0x488db4e9

    goto/16 :goto_0

    :cond_d
    :goto_4
    const-string v3, "\u1a75\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e5d

    const v5, 0x634c8980

    xor-int/2addr v4, v5

    const v5, 0x74f4187c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79ebb3e6 -> :sswitch_4
        -0x775ff9f7 -> :sswitch_7
        -0x6a6e902e -> :sswitch_2
        -0x692e4c51 -> :sswitch_f
        -0x68de8309 -> :sswitch_10
        -0x61af2fd2 -> :sswitch_10
        -0x52d3ff1e -> :sswitch_b
        -0x4b2005cf -> :sswitch_6
        -0x405df70c -> :sswitch_8
        -0x336c4bd2 -> :sswitch_5
        -0x2333ad6b -> :sswitch_2
        -0x207aaacc -> :sswitch_3
        -0x1a65a95f -> :sswitch_a
        -0x176d789a -> :sswitch_e
        -0x17398913 -> :sswitch_d
        -0x13fb51b4 -> :sswitch_3
        -0xfc2ec10 -> :sswitch_5
        -0x55ee96b -> :sswitch_a
        0x3852e7b -> :sswitch_d
        0xae116ea -> :sswitch_c
        0x12ac076f -> :sswitch_7
        0x336204cd -> :sswitch_6
        0x39e2fcb1 -> :sswitch_1
        0x4fc946c6 -> :sswitch_8
        0x525f5040 -> :sswitch_9
        0x5a202ad7 -> :sswitch_c
        0x5de0a43f -> :sswitch_b
        0x5fe2168a -> :sswitch_f
        0x61496796 -> :sswitch_0
        0x6d3471ab -> :sswitch_0
        0x6f189fe5 -> :sswitch_e
        0x75858e77 -> :sswitch_9
        0x7aef6e15 -> :sswitch_4
        0x7c7fc3e0 -> :sswitch_1
    .end sparse-switch
.end method
