.class public final synthetic Ll/ᩳᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۠᩹ۡ:[S


# instance fields
.field public final synthetic ܺ:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳᩳۘ;->۠᩹ۡ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xa3s
        -0x1d8ds
        -0x8das
        0x333s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳᩳۘ;->ܺ:Landroid/widget/TextView;

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

    const v13, 0x3cf27dc3

    sget v14, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v15, Ll/֫;->ܶܺ᩻:I

    const-string v16, "\u06e4\u06e4"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    mul-int/lit8 v16, v16, 0x61

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, -0x4c39

    const v18, 0xe24f356

    xor-int v0, v0, v18

    const v18, -0x3af719ac

    xor-int v16, v16, v18

    move-object v2, v1

    move-object/from16 v18, v4

    move-object v12, v11

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, 0x3cf27dc3

    :goto_0
    xor-int v5, v16, v15

    mul-int/lit16 v5, v5, 0x2e01

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    .line 47
    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v0

    if-lez v0, :cond_7

    goto/16 :goto_4

    .line 738
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    move-object/from16 v0, p0

    goto :goto_1

    .line 87
    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_c

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_4

    :sswitch_4
    move-object/from16 v0, p0

    .line 1973
    iget-object v2, v0, Ll/ᩳᩳۘ;->ܺ:Landroid/widget/TextView;

    invoke-static {v2, v1}, Ll/᩶;->ۤۡۢ(Ljava/lang/Object;I)V

    return-void

    :sswitch_5
    move-object/from16 v0, p0

    xor-int v1, v3, v4

    .line 1324
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_1

    :goto_1
    const-string v5, "\u06db\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v15, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v0, v5, v14

    mul-int/lit16 v0, v0, -0x4ca9

    const v17, 0x4cfa7ea4    # 1.3133136E8f

    xor-int v0, v0, v17

    const v17, 0x329eda3c

    xor-int v17, v5, v17

    goto :goto_0

    :cond_1
    const-string v0, "\u073a\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x75

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x441b

    const v17, 0x74547f3a

    xor-int v5, v5, v17

    const v17, 0x2986d965

    goto/16 :goto_6

    .line 2
    :sswitch_6
    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7e844aec

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v0

    if-gtz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u05a1\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x1dfb

    const v17, 0x4636e24b

    xor-int v5, v5, v17

    const v17, -0x3fd0def6

    goto/16 :goto_6

    :sswitch_7
    const/4 v0, 0x3

    invoke-static {v12, v13, v0, v11}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u06d6\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x7b

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x7f41

    const v17, 0x24600b49

    xor-int v5, v5, v17

    const v17, -0x5c1b945b

    goto/16 :goto_6

    :sswitch_8
    const/4 v13, 0x1

    .line 354
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v0

    if-gtz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x4ca7

    const v17, -0x1315fb45

    xor-int v5, v5, v17

    const v17, -0x4cc6ed2f

    goto/16 :goto_6

    .line 2
    :sswitch_9
    sget v0, Ll/ۙ۠ۘ;->᩻ܰ:I

    sget-object v12, Ll/ᩳᩳۘ;->۠᩹ۡ:[S

    .line 207
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u1a7b\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x379d

    const v17, 0x5892b85b

    xor-int v5, v5, v17

    const v17, 0x16a7f770

    goto/16 :goto_6

    :sswitch_a
    const/16 v0, 0x1d5

    const/16 v11, 0x1d5

    goto :goto_2

    :sswitch_b
    const v0, 0x8a7f

    const v11, 0x8a7f

    :goto_2
    const-string v0, "\u06e8\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x6d5b

    const v17, 0x3b74d3eb

    xor-int v5, v5, v17

    const v17, -0x4b498eb3

    goto/16 :goto_6

    :sswitch_c
    mul-int v0, v7, v10

    sub-int v0, v9, v0

    if-ltz v0, :cond_6

    const-string v0, "\u06e8\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x26c1

    const v17, 0x5b34e539

    xor-int v5, v5, v17

    const v17, 0x63482435

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u073d\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x27

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x369b

    const v17, -0x3e616c50

    xor-int v5, v5, v17

    const v17, 0x4c91d388    # 7.645498E7f

    goto/16 :goto_6

    :sswitch_d
    const v10, 0x12500

    .line 32
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_8

    :cond_7
    :goto_3
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x7ba7

    const v17, -0x58bf6ecf

    xor-int v5, v5, v17

    const v17, -0x27d4b151

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a78\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x37

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x7bf

    const v17, -0x51ded794

    xor-int v5, v5, v17

    const v17, 0x11df04dc

    goto/16 :goto_6

    :sswitch_e
    add-int v0, v7, v8

    mul-int v9, v0, v0

    .line 1460
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u1a7b\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x3a43

    const v17, -0x111d248c

    xor-int v5, v5, v17

    const v17, -0x531c6109

    goto/16 :goto_6

    :sswitch_f
    aget-short v7, v18, v6

    const/16 v8, 0x4940

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_a

    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x3605

    const v17, -0x7bd91783

    xor-int v5, v5, v17

    const v17, -0x5e5ea572

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x6e3

    const v17, 0x7f574995

    xor-int v5, v5, v17

    const v17, 0x2a069b10

    goto :goto_6

    :sswitch_10
    const/4 v6, 0x0

    .line 1685
    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_b

    :goto_4
    const-string v0, "\u1a7a\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x15fb

    const v17, -0x437e749e

    xor-int v5, v5, v17

    const v17, 0x185a0b14

    goto :goto_6

    :cond_b
    const-string v0, "\u06e2\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x3f

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x5d2b

    const v17, -0x2d467a2a

    xor-int v5, v5, v17

    const v17, -0x319ee405

    goto :goto_6

    :sswitch_11
    sget-object v18, Ll/ᩳᩳۘ;->۠᩹ۡ:[S

    .line 35
    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u1a7a\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x47

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x7b9f

    const v17, 0x3ef900fe

    xor-int v5, v5, v17

    const v17, 0x50737a0b

    goto :goto_6

    :cond_d
    const-string v0, "\u06e0\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x3a57

    const v17, 0x29a5ea14

    xor-int v5, v5, v17

    const v17, 0x4d5656af    # 2.2475032E8f

    :goto_6
    xor-int v17, v0, v17

    move v0, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cc7567a -> :sswitch_2
        -0x7880806b -> :sswitch_8
        -0x6fd0aac5 -> :sswitch_d
        -0x6e836dfa -> :sswitch_e
        -0x36947fb3 -> :sswitch_3
        -0x33ca3173 -> :sswitch_4
        -0x1174ee69 -> :sswitch_c
        -0x10ca5181 -> :sswitch_f
        -0xfe034b2 -> :sswitch_11
        -0xfc3c838 -> :sswitch_1
        -0xd4dc268 -> :sswitch_8
        -0xb734694 -> :sswitch_4
        -0x2aa5d73 -> :sswitch_1
        0x579695b -> :sswitch_a
        0x6b559ac -> :sswitch_11
        0x8c27a19 -> :sswitch_0
        0xbc49129 -> :sswitch_5
        0x190c2063 -> :sswitch_f
        0x1ca7493c -> :sswitch_7
        0x1e4c5115 -> :sswitch_10
        0x243911dd -> :sswitch_5
        0x395855b3 -> :sswitch_e
        0x3ea84acc -> :sswitch_a
        0x45b73be0 -> :sswitch_0
        0x4636e360 -> :sswitch_b
        0x472c8b82 -> :sswitch_2
        0x50a02804 -> :sswitch_9
        0x5334072a -> :sswitch_c
        0x548a197a -> :sswitch_b
        0x54eb46a3 -> :sswitch_3
        0x5ce71eae -> :sswitch_9
        0x5f27dbae -> :sswitch_6
        0x68288eed -> :sswitch_10
        0x688cb71a -> :sswitch_6
        0x73656442 -> :sswitch_d
        0x794df673 -> :sswitch_7
    .end sparse-switch
.end method
