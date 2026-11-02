.class public final synthetic Ll/ᩴ᩸ۘ;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩹ܶۙ:[S


# instance fields
.field public final synthetic ܺ:Ll/۠᩸ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ᩸ۘ;->᩹ܶۙ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x771s
        -0x52d0s
        -0x4dd2s
        -0x482bs
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/۠᩸ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩸ۘ;->ܺ:Ll/۠᩸ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v13, 0x2e4ee8c0

    sget v14, Ll/֫᩺;->᩺۟ۘ:I

    sget v15, Ll/۟;->ۨᩴۛ:I

    const-string v16, "\u0733\u06eb"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v15

    mul-int/lit8 v16, v16, 0xb

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x37ad

    const v18, 0x22f24fa5

    xor-int v0, v0, v18

    const v18, 0x746082d1

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v12, v11

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, 0x2e4ee8c0

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, 0x244b

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    .line 223
    sget-object v12, Ll/ᩴ᩸ۘ;->᩹ܶۙ:[S

    .line 123
    sget v0, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v0, :cond_3

    goto/16 :goto_4

    .line 13
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v0, Ll/֫;->ܶܺ᩻:I

    if-gez v0, :cond_7

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v0, :cond_a

    goto/16 :goto_4

    .line 137
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_2

    .line 201
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    return-void

    .line 223
    :sswitch_5
    invoke-static {v1, v2}, Ll/ۖۛ;->᩵ۖ۠(Ljava/lang/Object;I)Landroid/view/View;

    .line 224
    invoke-virtual {v1}, Ll/ۤۚ;->invalidateOptionsMenu()V

    return-void

    .line 223
    :sswitch_6
    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7d1b6a3b

    xor-int/2addr v2, v0

    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "\u1a73\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x31

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x7067

    const v17, -0x61630510

    xor-int v4, v4, v17

    const v17, -0x29224b26

    goto/16 :goto_5

    :sswitch_7
    const/4 v0, 0x3

    invoke-static {v12, v13, v0, v11}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_1

    const-string v0, "\u0730\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0xd

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x68ed

    const v17, 0x74a5391f

    xor-int v4, v4, v17

    const v17, -0x7052e89a

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u1a76\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x1839

    const v17, -0x16dc0a37

    xor-int v4, v4, v17

    const v17, 0x33448263

    goto/16 :goto_5

    :sswitch_8
    const/4 v13, 0x1

    .line 183
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u1a7a\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3dd

    const v17, -0x67fc05e3

    xor-int v4, v4, v17

    const v17, 0x4e2864e1    # 7.062959E8f

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u1a73\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0xc6f

    const v17, 0x26f9a9f9

    xor-int v4, v4, v17

    const v17, 0x14f42c0

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ᩴ᩸ۘ;->ܺ:Ll/۠᩸ۘ;

    .line 223
    iget-object v1, v1, Ll/۠᩸ۘ;->᩹:Ll/᩶᩸ۘ;

    sget v4, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u073f\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v15, v4

    mul-int/lit8 v4, v4, -0x13

    xor-int v0, v4, v14

    mul-int/lit16 v0, v0, 0x7877

    const v17, -0x5f340ac8

    xor-int v0, v0, v17

    const v17, -0x69451122

    xor-int v17, v4, v17

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x2e2b

    const/16 v11, 0x2e2b

    goto :goto_1

    :sswitch_b
    const/16 v0, 0x288f

    const/16 v11, 0x288f

    :goto_1
    const-string v0, "\u06db\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x311b

    const v17, -0x6fd71913

    xor-int v4, v4, v17

    const v17, -0x5a600637

    goto/16 :goto_5

    :sswitch_c
    mul-int v0, v10, v10

    sub-int/2addr v0, v8

    if-gez v0, :cond_5

    const-string v0, "\u1a73\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x3

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x5591

    const v17, -0x4a1e900e

    xor-int v4, v4, v17

    const v17, 0xe6f0c4d

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06e2\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x55

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x54cd

    const v17, -0x43d0fcf4

    xor-int v4, v4, v17

    const v17, 0x6b9b8317

    goto/16 :goto_5

    :sswitch_d
    add-int v10, v6, v9

    .line 2
    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "\u1a76\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x1071

    const v17, 0x661be03b

    xor-int v4, v4, v17

    const v17, -0x113bd27d

    goto/16 :goto_5

    :sswitch_e
    mul-int v8, v6, v7

    const/16 v9, 0x3ee3

    .line 171
    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v0, :cond_8

    :cond_7
    const-string v0, "\u05a8\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x16ab

    const v17, 0x39d55ba0

    xor-int v4, v4, v17

    const v17, -0x1fc9beeb

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u1a7a\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x1f71

    const v17, 0x7b5b5e1b

    xor-int v4, v4, v17

    const v17, -0x2d092223

    goto/16 :goto_5

    :sswitch_f
    aget-short v6, v18, v5

    const v7, 0xfb8c

    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_9

    :goto_2
    const-string v0, "\u06da\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x21

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x5a6b

    const v17, -0x2ee12bf0

    xor-int v4, v4, v17

    const v17, -0x17969fad

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06d6\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x95b

    const v17, 0x13a3535b

    xor-int v4, v4, v17

    const v17, -0x20e63b51

    goto :goto_5

    :sswitch_10
    const/4 v5, 0x0

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    :goto_3
    const-string v0, "\u0736\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x4f

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x16e3

    const v17, 0x13be28b5

    xor-int v4, v4, v17

    const v17, 0x18513b59

    goto :goto_5

    :cond_b
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x21

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x2afd

    const v17, 0x56b6406e

    xor-int v4, v4, v17

    const v17, -0x14035f92

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ᩴ᩸ۘ;->᩹ܶۙ:[S

    .line 81
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_d

    :cond_c
    :goto_4
    const-string v0, "\u06dc\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x2e0b

    const v17, 0x3c1f58f6

    xor-int v4, v4, v17

    const v17, -0xe5e2ffc

    goto :goto_5

    :cond_d
    const-string v0, "\u1a78\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x387b

    const v17, -0x70e0e19b

    xor-int v4, v4, v17

    const v17, -0x49452fd

    :goto_5
    xor-int v17, v0, v17

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f042fb0 -> :sswitch_f
        -0x68528ea2 -> :sswitch_1
        -0x67c95a0a -> :sswitch_8
        -0x66a36d86 -> :sswitch_c
        -0x577d6791 -> :sswitch_e
        -0x3b9fd818 -> :sswitch_0
        -0x39c6f124 -> :sswitch_11
        -0x37594238 -> :sswitch_0
        -0xf1ffca6 -> :sswitch_2
        -0x6dc6674 -> :sswitch_6
        -0x1eade37 -> :sswitch_5
        -0x146affd -> :sswitch_4
        0x5b4f585 -> :sswitch_3
        0x13f31479 -> :sswitch_6
        0x155dfbf3 -> :sswitch_f
        0x1891b355 -> :sswitch_d
        0x1f00939d -> :sswitch_d
        0x2547a9df -> :sswitch_10
        0x25a98faf -> :sswitch_9
        0x26004213 -> :sswitch_2
        0x310cc345 -> :sswitch_10
        0x32e1878b -> :sswitch_5
        0x37ee7258 -> :sswitch_b
        0x39b0d91c -> :sswitch_7
        0x3a2025c1 -> :sswitch_e
        0x3bc55efc -> :sswitch_3
        0x45d24020 -> :sswitch_a
        0x4f7cae8b -> :sswitch_11
        0x54167a37 -> :sswitch_c
        0x58e997ba -> :sswitch_b
        0x5bbc504b -> :sswitch_7
        0x6766b21a -> :sswitch_4
        0x68a55573 -> :sswitch_a
        0x6ffb7782 -> :sswitch_9
        0x72377b32 -> :sswitch_1
        0x76d78aa9 -> :sswitch_8
    .end sparse-switch
.end method
