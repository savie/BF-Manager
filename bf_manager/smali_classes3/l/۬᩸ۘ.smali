.class public Ll/۬᩸ۘ;
.super Landroid/content/BroadcastReceiver;
.source "C14K"


# static fields
.field private static final ۡ֡۠:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬᩸ۘ;->ۡ֡۠:[S

    return-void

    :array_0
    .array-data 2
        0x8c5s
        -0x44bas
        -0x44b7s
        -0x44b4s
        -0x44abs
        -0x44b9s
        -0x44b6s
        -0x44bcs
        -0x44a9s
        -0x44bfs
        -0x44b8s
        -0x44afs
        -0x44f5s
        -0x44bas
        -0x44b7s
        -0x44b4s
        -0x44abs
        -0x44abs
        -0x44c0s
        -0x44a9s
        -0x44f5s
        -0x44aas
        -0x44c0s
        -0x44afs
        -0x44b8s
        -0x44afs
        -0x44f5s
        -0x44bas
        -0x44b7s
        -0x44b4s
        -0x44abs
        -0x44abs
        -0x44c0s
        -0x44a9s
        -0x44f5s
        -0x44bes
        -0x44c0s
        -0x44afs
        -0x44afs
        -0x44c0s
        -0x44a3s
        -0x44afs
        -0x4495s
        -0x44b6s
        -0x44fbs
        -0x44afs
        -0x44c0s
        -0x44a3s
        -0x44afs
        -0x44fbs
        -0x44b4s
        -0x44aas
        -0x44fbs
        -0x44abs
        -0x44a9s
        -0x44b6s
        -0x44ads
        -0x44b4s
        -0x44bfs
        -0x44c0s
        -0x44bfs
        -0x44f5s
        -0x44fbs
        -0x4490s
        -0x44aas
        -0x44c0s
        -0x44fbs
        -0x44f8s
        -0x44c0s
        -0x44fbs
        -0x44afs
        -0x44c0s
        -0x44a3s
        -0x44afs
        -0x44fbs
        -0x44f9s
        -0x44afs
        -0x44c0s
        -0x44a3s
        -0x44afs
        -0x44fbs
        -0x44afs
        -0x44b6s
        -0x44fbs
        -0x44b9s
        -0x44c0s
        -0x44fbs
        -0x44abs
        -0x44bcs
        -0x44aas
        -0x44afs
        -0x44c0s
        -0x44bfs
        -0x44f9s
        -0xa6fs
        -0x1695s
        -0x2b9bs
        -0x44d1s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 24

    move-object/from16 v0, p0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x540ece7d

    sget v17, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v18, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v19, "\u06d8\u05a1"

    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v17, v19

    mul-int/lit8 v19, v19, -0x73

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, -0x6d9

    const v21, -0x67c59e10

    xor-int v1, v1, v21

    const v21, -0x128ee4a5

    xor-int v19, v19, v21

    move-object v5, v4

    move-object/from16 v16, v10

    move-object v15, v14

    move/from16 v20, v19

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, -0x540ece7d

    const/16 v21, 0x0

    move-object v4, v3

    move-object v10, v9

    move-object v3, v2

    move-object v9, v8

    const/4 v2, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    :goto_0
    xor-int v13, v19, v18

    mul-int/lit16 v13, v13, -0x6397

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    const/4 v12, 0x0

    aget-short v12, v16, v12

    .line 35
    sget v13, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v13, :cond_10

    goto/16 :goto_c

    :sswitch_0
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v1, :cond_0

    :goto_1
    move-object/from16 v22, v2

    move/from16 v20, v12

    goto/16 :goto_2

    :cond_0
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    goto/16 :goto_c

    .line 12
    :sswitch_2
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    goto/16 :goto_9

    .line 27
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    goto :goto_1

    .line 45
    :sswitch_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    return-void

    .line 43
    :sswitch_5
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v13, Ll/۬᩸ۘ;->ۡ֡۠:[S

    move/from16 v20, v12

    const/16 v12, 0x61

    sget v22, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v22, :cond_3

    move-object/from16 v22, v2

    goto :goto_2

    :cond_3
    move-object/from16 v22, v2

    const/4 v2, 0x1

    invoke-static {v13, v12, v2, v14}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v12

    if-gtz v12, :cond_4

    goto :goto_2

    .line 44
    :cond_4
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_6
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 46
    invoke-virtual {v0, v6}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    const-string v1, ""

    .line 47
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    move-object/from16 v2, p2

    goto/16 :goto_5

    .line 34
    :sswitch_7
    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7e23d207

    xor-int/2addr v1, v2

    .line 35
    invoke-static {v1}, Ll/֫ܳ;->֨᩷֨(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_8
    move-object/from16 v22, v2

    move/from16 v20, v12

    const/4 v1, 0x3

    .line 34
    invoke-static {v15, v11, v1, v14}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v10

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_5

    :goto_2
    const-string v1, "\u073d\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x9

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x3c45

    const v12, -0x77b343fb

    xor-int/2addr v2, v12

    const v12, 0x74fa2148

    goto :goto_3

    :cond_5
    const-string v1, "\u06e1\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x1c79

    const v12, -0x6b9f6217

    xor-int/2addr v2, v12

    const v12, -0xf691641

    goto :goto_3

    :sswitch_9
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 33
    invoke-virtual {v3, v8}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v15, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/16 v11, 0x5e

    .line 42
    sget v1, Ll/֫;->ܶܺ᩻:I

    if-ltz v1, :cond_6

    move-object/from16 v2, p2

    move-object/from16 v1, v22

    goto/16 :goto_d

    :cond_6
    const-string v1, "\u06e0\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x3d

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x624b

    const v12, -0x70c25d1c

    xor-int/2addr v2, v12

    const v12, -0x6979a18d

    :goto_3
    xor-int/2addr v1, v12

    move/from16 v12, v20

    move/from16 v20, v1

    move v1, v2

    move-object/from16 v2, v22

    goto/16 :goto_0

    .line 37
    :sswitch_a
    invoke-virtual {v0, v6}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v1, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/16 v2, 0x2a

    const/16 v3, 0x34

    invoke-static {v1, v2, v3, v14}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_b
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 41
    invoke-virtual {v3}, Landroid/text/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    if-eqz v9, :cond_7

    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x444b

    const v12, -0x7f4cc936

    xor-int/2addr v2, v12

    const v12, -0x3f7ed327

    goto :goto_3

    :cond_7
    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x50b7

    const v12, 0x467baddf

    xor-int/2addr v2, v12

    const v12, -0x282c1701

    goto :goto_3

    :sswitch_c
    return-void

    :sswitch_d
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 23
    sget-object v1, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/16 v2, 0x26

    const/4 v8, 0x4

    invoke-static {v1, v2, v8, v14}, Ll/֫;->ۗܿܶ([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    .line 31
    invoke-static {v2, v1}, Ll/ۗᩳ;->ۢ۬ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    const-string v1, "\u06e7\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x5f

    xor-int v12, v1, v18

    mul-int/lit16 v12, v12, 0x52b3

    const v13, -0x4d282273

    xor-int/2addr v12, v13

    const v13, -0x168bd20c

    goto :goto_4

    :cond_8
    const-string v1, "\u0730\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x6d

    xor-int v12, v1, v18

    mul-int/lit16 v12, v12, -0x3aa9

    const v13, 0x43c9dff9

    xor-int/2addr v12, v13

    const v13, -0x5e130cbb

    :goto_4
    xor-int/2addr v1, v13

    move-object/from16 v2, v22

    move/from16 v23, v20

    move/from16 v20, v1

    move v1, v12

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    sget-object v12, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/16 v13, 0x18

    const/16 v0, 0xe

    invoke-static {v12, v13, v0, v14}, Ll/֫ۘ;->ۜۖܺ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v0, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x43ed

    const v12, 0xeb26542

    xor-int/2addr v1, v12

    const v12, 0x3ac6096c

    goto/16 :goto_7

    :cond_9
    :goto_5
    const-string v0, "\u1a7a\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x71cd

    const v12, 0xa9bf518

    xor-int/2addr v1, v12

    const v12, -0x5fae7768

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 23
    invoke-static {v5, v4}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-eqz v0, :cond_a

    const-string v0, "\u05ab\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x3a1d

    const v12, -0x22258dd1

    xor-int/2addr v1, v12

    const v12, 0x57c37237

    goto :goto_7

    :cond_a
    const-string v0, "\u06d6\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x6f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x78f5

    const v12, -0x4de6de07

    xor-int/2addr v1, v12

    const v12, -0x285359b8

    goto :goto_7

    :sswitch_10
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 30
    sget-object v0, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/16 v1, 0xa

    const/16 v5, 0xe

    invoke-static {v0, v1, v5, v14}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_6
    const-string v0, "\u073f\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0xc33

    const v12, -0x21d8649c

    xor-int/2addr v1, v12

    const v12, 0x33de3ca8

    goto :goto_7

    :cond_b
    const-string v0, "\u1a77\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x6e63

    const v12, 0x716d6698

    xor-int/2addr v1, v12

    const v12, -0x6cac7c5c

    :goto_7
    xor-int/2addr v0, v12

    move/from16 v12, v20

    move-object/from16 v2, v22

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 29
    invoke-static {v0, v1}, Ll/֡۠;->۟᩸ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/ClipboardManager;

    .line 30
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 4
    sget v12, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v12, :cond_c

    goto/16 :goto_d

    :cond_c
    const-string v12, "\u06e1\u06e7"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v18

    mul-int/lit8 v12, v12, -0x21

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, 0x2825

    const v22, 0x339c3995

    xor-int v13, v13, v22

    const v22, 0x5be4fe66

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v20, v12

    .line 0
    sget-object v1, Ll/۬᩸ۘ;->ۡ֡۠:[S

    const/4 v12, 0x1

    const/16 v13, 0x9

    invoke-static {v1, v12, v13, v14}, Ll/ۘ֡;->۫ۡ۫([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v12

    if-nez v12, :cond_d

    goto/16 :goto_9

    :cond_d
    const-string v12, "\u06db\u06e1"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v17

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, -0x62d1

    const v22, 0x2256bf72

    xor-int v13, v13, v22

    const v22, -0x6005a605

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const/16 v12, 0x2116

    const/16 v14, 0x2116

    goto :goto_8

    :sswitch_14
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const v12, 0xbb25

    const v14, 0xbb25

    :goto_8
    const-string v12, "\u1a74\u06df"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v17

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, 0x4fdd

    const v22, -0x780b7f4c

    xor-int v13, v13, v22

    const v22, 0x210bd613

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const v12, 0x947e

    mul-int v12, v12, v20

    sub-int v12, v12, v21

    if-lez v12, :cond_e

    const-string v12, "\u06d8\u06e4"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v18

    mul-int/lit8 v12, v12, -0x61

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, -0x457

    const v22, -0x6d2e7288

    xor-int v13, v13, v22

    const v22, 0x72a444b7

    goto :goto_a

    :cond_e
    const-string v12, "\u06da\u06df"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v18

    mul-int/lit8 v12, v12, -0x9

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, -0x2ec3

    const v22, -0x2354e627

    xor-int v13, v13, v22

    const v22, -0x20faee39

    goto :goto_a

    :sswitch_16
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    mul-int v12, v20, v20

    const v13, 0x15887b81

    add-int v21, v12, v13

    .line 24
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v12

    if-gtz v12, :cond_f

    :goto_9
    const-string v12, "\u06da\u06e1"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v18

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, 0x52a1

    const v22, 0x26d6e3c1

    xor-int v13, v13, v22

    const v22, -0x1be1fd1

    goto :goto_a

    :cond_f
    const-string v12, "\u06df\u073d"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v17

    mul-int/lit8 v12, v12, -0x4d

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, -0x2b9d

    const v22, 0x71ff333f

    xor-int v13, v13, v22

    const v22, -0x40571cd9

    :goto_a
    xor-int v12, v12, v22

    move-object/from16 v0, p0

    move-object v2, v1

    move v1, v13

    move/from16 v23, v20

    move/from16 v20, v12

    :goto_b
    move/from16 v12, v23

    goto/16 :goto_0

    :goto_c
    const-string v13, "\u06e2\u05ab"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v17

    mul-int/lit8 v13, v13, 0x3b

    xor-int v0, v13, v18

    mul-int/lit16 v0, v0, 0x3555

    const v20, 0x4b7d1c4

    xor-int v0, v0, v20

    const v20, -0x61f59255

    xor-int v20, v13, v20

    move-object v2, v1

    move v1, v0

    goto :goto_10

    :cond_10
    const-string v0, "\u0736\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v13, v0, v17

    mul-int/lit16 v13, v13, -0x6357

    const v20, 0x4a32a7b

    xor-int v13, v13, v20

    const v20, -0x5637f80d

    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move-object v2, v1

    move v1, v13

    goto/16 :goto_0

    :sswitch_17
    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    sget-object v16, Ll/۬᩸ۘ;->ۡ֡۠:[S

    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_11

    :goto_d
    const-string v0, "\u05ab\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, 0x24e7

    const v13, -0x3863df4

    xor-int/2addr v12, v13

    const v13, 0x6b93adf0

    goto :goto_e

    :cond_11
    const-string v0, "\u1a75\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x173b

    const v13, -0x20f7d268

    xor-int/2addr v12, v13

    const v13, 0x6acfa9d6

    :goto_e
    xor-int/2addr v0, v13

    move-object v2, v1

    move v1, v12

    move/from16 v12, v20

    :goto_f
    move/from16 v20, v0

    :goto_10
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b6e1161 -> :sswitch_0
        -0x7096b2fd -> :sswitch_13
        -0x6f6e2202 -> :sswitch_4
        -0x691e6538 -> :sswitch_5
        -0x633ab956 -> :sswitch_14
        -0x59dbf935 -> :sswitch_3
        -0x590a73f8 -> :sswitch_7
        -0x5628c689 -> :sswitch_d
        -0x4c341b3d -> :sswitch_8
        -0x439a22ff -> :sswitch_15
        -0x3ecdac8f -> :sswitch_10
        -0x3e77b32e -> :sswitch_9
        -0x38b8e707 -> :sswitch_e
        -0x3666f767 -> :sswitch_11
        -0x31b2f68b -> :sswitch_f
        -0x2b71d5a6 -> :sswitch_6
        -0x232431dc -> :sswitch_17
        -0x1f3b2bff -> :sswitch_4
        -0x1b570b8d -> :sswitch_0
        -0x1856e88d -> :sswitch_9
        -0xe523fad -> :sswitch_16
        -0xc382cfa -> :sswitch_13
        -0x32f1c7c -> :sswitch_11
        0xaceeb1c -> :sswitch_2
        0xb32436c -> :sswitch_6
        0xc4c438d -> :sswitch_d
        0x13e41183 -> :sswitch_c
        0x16e7f75b -> :sswitch_10
        0x191baa7c -> :sswitch_f
        0x21fa88d4 -> :sswitch_12
        0x2bafda50 -> :sswitch_17
        0x3a3dbc2e -> :sswitch_b
        0x3b6c0e1f -> :sswitch_14
        0x3edbdb6c -> :sswitch_16
        0x3fd27a79 -> :sswitch_a
        0x5cc46e51 -> :sswitch_15
        0x5d685b88 -> :sswitch_1
        0x6018ddea -> :sswitch_3
        0x6034c095 -> :sswitch_7
        0x62a3e9e6 -> :sswitch_b
        0x69ba74bf -> :sswitch_a
        0x6bbbe67c -> :sswitch_1
        0x6c5de5b6 -> :sswitch_c
        0x76e9c054 -> :sswitch_2
        0x776b66fc -> :sswitch_12
        0x7931824b -> :sswitch_8
        0x7bd43ae9 -> :sswitch_e
        0x7d1666d8 -> :sswitch_5
    .end sparse-switch
.end method
