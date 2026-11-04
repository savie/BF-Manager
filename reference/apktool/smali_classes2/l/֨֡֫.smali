.class public Ll/֨֡֫;
.super Landroid/content/BroadcastReceiver;
.source "C14K"


# static fields
.field private static final ᩵۠ۘ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֨֡֫;->᩵۠ۘ:[S

    return-void

    :array_0
    .array-data 2
        0xc1es
        -0x4f99s
        -0x4f98s
        -0x4f93s
        -0x4f8cs
        -0x4f9as
        -0x4f95s
        -0x4f9bs
        -0x4f8as
        -0x4fa0s
        -0x4f97s
        -0x4f90s
        -0x4fd6s
        -0x4f99s
        -0x4f98s
        -0x4f93s
        -0x4f8cs
        -0x4f8cs
        -0x4f9fs
        -0x4f8as
        -0x4fd6s
        -0x4f89s
        -0x4f9fs
        -0x4f90s
        -0x4f97s
        -0x4f90s
        -0x4fd6s
        -0x4f99s
        -0x4f98s
        -0x4f93s
        -0x4f8cs
        -0x4f8cs
        -0x4f9fs
        -0x4f8as
        -0x4fd6s
        -0x4f9ds
        -0x4f9fs
        -0x4f90s
        -0x4f90s
        -0x4f9fs
        -0x4f84s
        -0x4f90s
        -0x4fb6s
        -0x4f95s
        -0x4fdcs
        -0x4f90s
        -0x4f9fs
        -0x4f84s
        -0x4f90s
        -0x4fdcs
        -0x4f93s
        -0x4f89s
        -0x4fdcs
        -0x4f8cs
        -0x4f8as
        -0x4f95s
        -0x4f8es
        -0x4f93s
        -0x4fa0s
        -0x4f9fs
        -0x4fa0s
        -0x4fd6s
        -0x4fdcs
        -0x4fafs
        -0x4f89s
        -0x4f9fs
        -0x4fdcs
        -0x4fd7s
        -0x4f9fs
        -0x4fdcs
        -0x4f90s
        -0x4f9fs
        -0x4f84s
        -0x4f90s
        -0x4fdcs
        -0x4fdas
        -0x4f90s
        -0x4f9fs
        -0x4f84s
        -0x4f90s
        -0x4fdcs
        -0x4f90s
        -0x4f95s
        -0x4fdcs
        -0x4f9as
        -0x4f9fs
        -0x4fdcs
        -0x4f8cs
        -0x4f9bs
        -0x4f89s
        -0x4f90s
        -0x4f9fs
        -0x4fa0s
        -0x4fdas
        0x325bs
        -0x2503s
        0x2cd3s
        -0x4ff2s
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

    const v16, -0x41bb02e4

    sget v17, Ll/ۖ֡;->ۚۛᩳ:I

    sget v18, Ll/֡᩵;->ۤܳ۬:I

    const-string v19, "\u1a75\u06d8"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v18

    mul-int/lit8 v19, v19, -0x63

    xor-int v1, v19, v17

    mul-int/lit16 v1, v1, 0x6327

    const v21, -0x50fd2272

    xor-int v1, v1, v21

    const v21, -0x3de37b46

    xor-int v19, v19, v21

    move-object v5, v4

    move-object/from16 v16, v10

    move-object v15, v14

    move/from16 v20, v19

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, -0x41bb02e4

    const/16 v21, 0x0

    move-object v4, v3

    move-object v10, v9

    move-object v3, v2

    move-object v9, v8

    const/4 v2, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    :goto_0
    xor-int v13, v19, v17

    mul-int/lit16 v13, v13, -0x4d9b

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    sget-object v12, Ll/֨֡֫;->᩵۠ۘ:[S

    const/16 v13, 0x18

    const/16 v0, 0xe

    invoke-static {v12, v13, v0, v14}, Ll/֨ۚ;->֨֨۟([SIII)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v0, v1}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u06d8\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x4627

    const v12, 0x114a2c7c

    xor-int/2addr v1, v12

    const v12, 0x224bc78f

    goto/16 :goto_8

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v1, :cond_1

    :cond_0
    :goto_1
    move-object v1, v2

    move-object/from16 v2, p2

    goto/16 :goto_f

    :cond_1
    move-object/from16 v22, v2

    move/from16 v20, v12

    :goto_2
    move-object/from16 v2, p2

    goto/16 :goto_7

    :sswitch_1
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    goto/16 :goto_e

    .line 8
    :sswitch_2
    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v1, :cond_0

    goto :goto_3

    .line 25
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    :goto_3
    const-string v1, "\u0730\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v13, v1, v17

    mul-int/lit16 v13, v13, -0xe15

    const v20, -0x61b33aa5

    xor-int v13, v13, v20

    const v20, 0x7e058dd9

    xor-int v20, v1, v20

    goto/16 :goto_11

    .line 26
    :sswitch_4
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 43
    :sswitch_5
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v13, Ll/֨֡֫;->᩵۠ۘ:[S

    move/from16 v20, v12

    const/16 v12, 0x61

    .line 26
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v22

    if-nez v22, :cond_3

    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    goto/16 :goto_a

    :cond_3
    move-object/from16 v22, v2

    const/4 v2, 0x1

    .line 44
    invoke-static {v13, v12, v2, v14}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 29
    sget v12, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v12, :cond_4

    goto :goto_2

    .line 44
    :cond_4
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

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

    goto/16 :goto_6

    .line 34
    :sswitch_7
    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7ee4fbb7

    xor-int/2addr v1, v2

    .line 35
    invoke-static {v1}, Ll/ۗ᩵;->۬֫ۛ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_8
    move-object/from16 v22, v2

    move/from16 v20, v12

    const/4 v1, 0x3

    .line 34
    invoke-static {v15, v11, v1, v14}, Ll/ۖ᩵;->ܿۖᩳ([SIII)Ljava/lang/String;

    move-result-object v10

    .line 26
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_5

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v12, v20

    move-object/from16 v1, v22

    goto/16 :goto_e

    :cond_5
    const-string v1, "\u06e0\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x6b

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x150d

    const v12, -0x367f8868    # -1052403.0f

    xor-int/2addr v2, v12

    const v12, 0x5b8f2944

    goto :goto_4

    :sswitch_9
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 33
    invoke-virtual {v3, v8}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v15, Ll/֨֡֫;->᩵۠ۘ:[S

    const/16 v11, 0x5e

    .line 33
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_6

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v1, v22

    goto/16 :goto_a

    :cond_6
    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x377b

    const v12, -0x53dfa4f9

    xor-int/2addr v2, v12

    const v12, -0x1e59b9d8

    :goto_4
    xor-int/2addr v1, v12

    move/from16 v12, v20

    move/from16 v20, v1

    move v1, v2

    move-object/from16 v2, v22

    goto/16 :goto_0

    .line 37
    :sswitch_a
    invoke-virtual {v0, v6}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v1, Ll/֨֡֫;->᩵۠ۘ:[S

    const/16 v2, 0x2a

    const/16 v3, 0x34

    invoke-static {v1, v2, v3, v14}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

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

    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x419f

    const v12, 0x1dc87f7f

    xor-int/2addr v2, v12

    const v12, -0x63a28742

    goto :goto_4

    :cond_7
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x613d

    const v12, -0x69ef97bc

    xor-int/2addr v2, v12

    const v12, -0xa475865

    goto :goto_4

    :sswitch_c
    return-void

    :sswitch_d
    move-object/from16 v22, v2

    move/from16 v20, v12

    .line 23
    sget-object v1, Ll/֨֡֫;->᩵۠ۘ:[S

    const/16 v2, 0x26

    const/4 v8, 0x4

    invoke-static {v1, v2, v8, v14}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    .line 31
    invoke-static {v2, v1}, Ll/֡ᩴ;->ۨۜۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    const-string v1, "\u1a76\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v12, v1, v17

    mul-int/lit16 v12, v12, 0x2ecd

    const v13, -0x566a04ee

    xor-int/2addr v12, v13

    const v13, -0xfd28731

    goto :goto_5

    :cond_8
    const-string v1, "\u06e4\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v12, v1, v17

    mul-int/lit16 v12, v12, -0x4ed3

    const v13, 0xe27734b

    xor-int/2addr v12, v13

    const v13, 0x7c6d1815

    :goto_5
    xor-int/2addr v1, v13

    move-object/from16 v2, v22

    move/from16 v23, v20

    move/from16 v20, v1

    move v1, v12

    goto/16 :goto_d

    :cond_9
    :goto_6
    const-string v0, "\u06db\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x5459

    const v12, 0x23d3386f

    xor-int/2addr v1, v12

    const v12, 0x27b6a2e4

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 23
    invoke-static {v5, v4}, Ll/ۗܶ;->᩵֡ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-eqz v0, :cond_a

    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x5f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x50d

    const v12, -0x138effc0

    xor-int/2addr v1, v12

    const v12, -0x1778b963

    goto :goto_8

    :cond_a
    const-string v0, "\u1a75\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x57c5

    const v12, -0x1b332fb6

    xor-int/2addr v1, v12

    const v12, 0x52276479

    goto :goto_8

    :sswitch_f
    move-object/from16 v22, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 30
    sget-object v0, Ll/֨֡֫;->᩵۠ۘ:[S

    const/16 v1, 0xa

    const/16 v5, 0xe

    invoke-static {v0, v1, v5, v14}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v5

    .line 46
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u073f\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x645d

    const v12, -0x775ebed2

    xor-int/2addr v1, v12

    const v12, 0x42a98be8

    goto :goto_8

    :cond_b
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4fc3

    const v12, -0x418d1d48

    xor-int/2addr v1, v12

    const v12, -0x6bcf4c4f

    :goto_8
    xor-int/2addr v0, v12

    move/from16 v12, v20

    move-object/from16 v2, v22

    move/from16 v20, v0

    :goto_9
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    .line 29
    invoke-static {v0, v1}, Ll/᩺;->֡᩶ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/ClipboardManager;

    .line 30
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 22
    sget v12, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v12, :cond_c

    :goto_a
    const-string v12, "\u073a\u073a"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v17

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, -0x5777

    const v22, 0x1db11a2

    xor-int v13, v13, v22

    const v22, -0x73404fd3

    goto/16 :goto_c

    :cond_c
    const-string v12, "\u06db\u06ec"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v17, v12

    mul-int/lit8 v12, v12, 0x57

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, 0x25b

    const v22, -0x73b23d05

    xor-int v13, v13, v22

    const v22, 0x4720d9b6

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v20, v12

    .line 0
    sget-object v1, Ll/֨֡֫;->᩵۠ۘ:[S

    const/4 v12, 0x1

    const/16 v13, 0x9

    invoke-static {v1, v12, v13, v14}, Ll/ۗ֫;->᩸ᩴ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    sget v12, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v12, :cond_d

    move/from16 v12, v20

    goto/16 :goto_e

    :cond_d
    const-string v12, "\u06dc\u1a74"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v18

    mul-int/lit8 v12, v12, 0x41

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, 0xa2f

    const v22, -0x3374a258    # -7.306784E7f

    xor-int v13, v13, v22

    const v22, 0x64ac5848

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const/16 v12, 0x13fa

    const/16 v14, 0x13fa

    goto :goto_b

    :sswitch_13
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const v12, 0xb004

    const v14, 0xb004

    :goto_b
    const-string v12, "\u06db\u073f"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v18

    xor-int v13, v12, v17

    mul-int/lit16 v13, v13, 0x8c3

    const v22, 0x450be5ff

    xor-int v13, v13, v22

    const v22, -0x72cae7ba

    goto :goto_c

    :sswitch_14
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    const v12, 0xa8d0

    mul-int v12, v12, v20

    sub-int v12, v21, v12

    if-gez v12, :cond_e

    const-string v12, "\u06e0\u06e2"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v17

    mul-int/lit8 v12, v12, 0x15

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, 0x3a09

    const v22, -0x36ddd9

    xor-int v13, v13, v22

    const v22, -0x7382ed71

    goto :goto_c

    :cond_e
    const-string v12, "\u06d7\u06e1"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v17

    mul-int/lit8 v12, v12, -0x63

    xor-int v13, v12, v18

    mul-int/lit16 v13, v13, -0x7195

    const v22, 0x5fa378fe

    xor-int v13, v13, v22

    const v22, -0x30f732e7

    :goto_c
    xor-int v12, v12, v22

    move-object/from16 v0, p0

    move-object v2, v1

    move v1, v13

    move/from16 v23, v20

    move/from16 v20, v12

    :goto_d
    move/from16 v12, v23

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v20, v12

    move-object/from16 v2, p2

    add-int/lit16 v13, v12, 0x2a34

    mul-int v21, v13, v13

    .line 33
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_f

    :goto_e
    const-string v13, "\u06d7\u1a74"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v17

    xor-int v0, v13, v18

    mul-int/lit16 v0, v0, -0x5d83

    const v20, 0x3acbb483

    xor-int v0, v0, v20

    const v20, -0x785daeb5

    xor-int v20, v13, v20

    move-object v2, v1

    move v1, v0

    goto/16 :goto_9

    :cond_f
    const-string v0, "\u073f\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x4b

    xor-int v13, v0, v17

    mul-int/lit16 v13, v13, 0x1a67

    const v20, 0x1fa2a184

    xor-int v13, v13, v20

    const v20, 0x21360dc

    goto :goto_10

    :sswitch_16
    move-object v1, v2

    move-object/from16 v2, p2

    const/4 v0, 0x0

    aget-short v12, v16, v0

    .line 3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_f

    :cond_10
    const-string v0, "\u05a1\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x17

    xor-int v13, v0, v18

    mul-int/lit16 v13, v13, 0x25f1

    const v20, 0x72778032

    xor-int v13, v13, v20

    const v20, 0x6a2e6f32

    goto :goto_10

    :sswitch_17
    move-object v1, v2

    move-object/from16 v2, p2

    sget-object v16, Ll/֨֡֫;->᩵۠ۘ:[S

    .line 28
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_11

    :goto_f
    const-string v0, "\u1a74\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v13, v0, v17

    mul-int/lit16 v13, v13, -0x4d31

    const v20, -0x38001198

    xor-int v13, v13, v20

    const v20, -0x1a95a1ab

    goto :goto_10

    :cond_11
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v13, v0, v17

    mul-int/lit16 v13, v13, -0x161

    const v20, 0x17eee412

    xor-int v13, v13, v20

    const v20, -0xf2945ea

    :goto_10
    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move-object v2, v1

    :goto_11
    move v1, v13

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c08a45f -> :sswitch_8
        -0x73c44a05 -> :sswitch_17
        -0x6bb8e5ad -> :sswitch_d
        -0x6b70ac81 -> :sswitch_1
        -0x634dabbc -> :sswitch_12
        -0x5fba27e7 -> :sswitch_e
        -0x529c1389 -> :sswitch_c
        -0x433f2978 -> :sswitch_7
        -0x3de15c85 -> :sswitch_b
        -0x34844b7a -> :sswitch_c
        -0x33381193 -> :sswitch_5
        -0x2f15ccaa -> :sswitch_6
        -0x2e56433c -> :sswitch_9
        -0x1ed700bf -> :sswitch_8
        -0x1a0f6795 -> :sswitch_2
        -0x13dd07f9 -> :sswitch_a
        -0x1341ef4b -> :sswitch_4
        -0x11128fd0 -> :sswitch_0
        -0xb2f0265 -> :sswitch_4
        -0x99db1ee -> :sswitch_e
        -0x947aed5 -> :sswitch_a
        -0x1f3ef03 -> :sswitch_5
        0x5d4b575 -> :sswitch_0
        0x7e05670 -> :sswitch_11
        0x8895cae -> :sswitch_3
        0x9381a62 -> :sswitch_2
        0x189b170e -> :sswitch_11
        0x1db72162 -> :sswitch_12
        0x24db9fc2 -> :sswitch_10
        0x2e5a5a31 -> :sswitch_17
        0x2e801482 -> :sswitch_f
        0x308ed2e5 -> :sswitch_16
        0x358b6f3b -> :sswitch_1
        0x36eed392 -> :sswitch_13
        0x374e5913 -> :sswitch_14
        0x40baaf38 -> :sswitch_15
        0x4eceda36 -> :sswitch_7
        0x513afc18 -> :sswitch_14
        0x53dd5910 -> :sswitch_6
        0x57272b11 -> :sswitch_b
        0x57ec6f13 -> :sswitch_10
        0x5b22c2ff -> :sswitch_13
        0x67a5cc1b -> :sswitch_f
        0x6bc081e7 -> :sswitch_d
        0x6fbcf213 -> :sswitch_3
        0x7a03c991 -> :sswitch_16
        0x7afbd6b9 -> :sswitch_9
        0x7c23e972 -> :sswitch_15
    .end sparse-switch
.end method
