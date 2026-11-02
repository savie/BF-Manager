.class public final Ll/ᩴۛۨ;
.super Ljava/lang/Object;
.source "819S"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final ܺۢ۠:[S


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ۫:Ljava/lang/String;

.field public final synthetic ܺ:Ll/ۤۛۨ;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x47

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴۛۨ;->ܺۢ۠:[S

    return-void

    :array_0
    .array-data 2
        0x1e7s
        -0x3881s
        -0x3881s
        -0x38fcs
        -0x38fds
        -0x38d4s
        -0x389bs
        -0x38fes
        -0x388cs
        -0x38ees
        -0x38e5s
        -0x3896s
        -0x3881s
        -0x3878s
        -0x38ees
        -0x38e5s
        -0x3896s
        -0x3881s
        -0x1abbs
        -0x38f4s
        -0x38e9s
        -0x38e2s
        -0x3892s
        -0x3881s
        -0x3878s
        -0x38f4s
        -0x38e9s
        -0x38e2s
        -0x3892s
        -0x3881s
        -0x1abbs
        -0x38d4s
        -0x38c2s
        -0x38cfs
        -0x38d4s
        -0x388es
        -0x38d4s
        -0x38c6s
        -0x38d3s
        -0x38cas
        -0x38c7s
        -0x38f4s
        -0x38e9s
        -0x38e2s
        -0x3893s
        -0x3896s
        -0x3897s
        -0x3881s
        -0x3878s
        -0x38f4s
        -0x38e9s
        -0x38e2s
        -0x3893s
        -0x3896s
        -0x3897s
        -0x3881s
        -0x1abbs
        -0x38a0s
        -0x38e9s
        -0x38e2s
        -0x38f4s
        -0x38e9s
        -0x3881s
        -0x1abbs
        -0x38e4s
        -0x38f3s
        -0x38e4s
        -0x3894s
        -0x3893s
        -0x3881s
        -0x1abbs
    .end array-data
.end method

.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۤۛۨ;)V
    .locals 6

    const v0, 0x360f685c

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    .line 853
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2969

    const v5, 0x62eda4f2

    xor-int/2addr v4, v5

    const v5, -0x174b2fd5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x630b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 212
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    .line 482
    :sswitch_0
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v3, :cond_9

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-gez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_1

    .line 548
    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 853
    :sswitch_4
    iput-object p4, p0, Ll/ᩴۛۨ;->ܽ:Ljava/lang/String;

    iput-object p5, p0, Ll/ᩴۛۨ;->۫:Ljava/lang/String;

    iput-object p6, p0, Ll/ᩴۛۨ;->ܺ:Ll/ۤۛۨ;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/ᩴۛۨ;->᩶:Ljava/lang/String;

    .line 396
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e0f

    const v5, 0x70db2e4b

    xor-int/2addr v4, v5

    const v5, 0x5c45e531

    goto :goto_0

    .line 788
    :sswitch_6
    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u0733\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x79db

    const v5, 0x1abac095

    xor-int/2addr v4, v5

    const v5, -0x199fe5

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05a1\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7dcf

    const v5, -0x3fba38b

    xor-int/2addr v4, v5

    const v5, -0xa096ef0

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6989

    const v5, -0x5bb0dc42

    xor-int/2addr v4, v5

    const v5, 0x68215d5c

    goto/16 :goto_0

    .line 737
    :sswitch_9
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_4

    :goto_1
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3813

    const v5, 0x11d86826

    xor-int/2addr v4, v5

    const v5, 0xfa5c5ae

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4513

    const v5, 0x101e8ec7    # 3.1269997E-29f

    xor-int/2addr v4, v5

    const v5, -0x2a637be1

    goto/16 :goto_0

    .line 440
    :sswitch_a
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2749

    const v5, -0x1b54dbc2

    xor-int/2addr v4, v5

    const v5, 0x112d6e4b

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11e9

    const v5, 0x5db3e293

    xor-int/2addr v4, v5

    const v5, 0x2198796d

    goto/16 :goto_0

    .line 242
    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u1a77\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a6b

    const v5, -0x614948f3

    xor-int/2addr v4, v5

    const v5, 0x77b99d63

    goto/16 :goto_0

    .line 679
    :sswitch_c
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6f53

    const v5, 0x1b0771bd

    xor-int/2addr v4, v5

    const v5, 0x6e856a35

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53a3

    const v5, 0x55a0f993

    xor-int/2addr v4, v5

    const v5, -0x570e2e95

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x17bb

    const v5, -0x44f46e82

    xor-int/2addr v4, v5

    const v5, -0x1160c731

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7913

    const v5, 0x48556389

    xor-int/2addr v4, v5

    const v5, -0x712fb456

    goto/16 :goto_0

    .line 853
    :sswitch_e
    iput-object p1, p0, Ll/ᩴۛۨ;->ܿ:Landroid/widget/TextView;

    iput-object p2, p0, Ll/ᩴۛۨ;->֡:Ljava/lang/String;

    .line 520
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6123

    const v5, 0x6ff51e05

    xor-int/2addr v4, v5

    const v5, -0x41b1da4e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d31

    const v5, 0x26dd6d21

    xor-int/2addr v4, v5

    const v5, -0x750bd5fa

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a0efb2b -> :sswitch_a
        -0x7782e04d -> :sswitch_5
        -0x676b7f87 -> :sswitch_9
        -0x66fba73d -> :sswitch_1
        -0x5fe32780 -> :sswitch_d
        -0x4d6e7a74 -> :sswitch_e
        -0x4b04a009 -> :sswitch_b
        -0x3c7d0572 -> :sswitch_2
        -0x39a1f202 -> :sswitch_6
        -0x36501bd2 -> :sswitch_2
        -0x33cd2e63 -> :sswitch_7
        -0x294e3866 -> :sswitch_c
        -0x20800174 -> :sswitch_c
        0x20cb9df -> :sswitch_4
        0x5ec7574 -> :sswitch_3
        0x13f7763c -> :sswitch_a
        0x232ec1a0 -> :sswitch_6
        0x24786eff -> :sswitch_4
        0x3880e56a -> :sswitch_8
        0x494c962d -> :sswitch_0
        0x5d41b8fe -> :sswitch_e
        0x5d948ff8 -> :sswitch_b
        0x5fdac0d4 -> :sswitch_1
        0x693b0d6b -> :sswitch_3
        0x6a0b8fcc -> :sswitch_7
        0x77102489 -> :sswitch_d
        0x7742098d -> :sswitch_5
        0x79fa1488 -> :sswitch_9
        0x7a571a06 -> :sswitch_0
        0x7f4f9647 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 43

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x5e060811

    sget v34, Ll/֨᩹;->᩻ᩳ֨:I

    sget v35, Ll/֫᩺;->᩺۟ۘ:I

    const-string v36, "\u06da\u1a77"

    invoke-static/range {v36 .. v36}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v36

    sub-int v36, v35, v36

    mul-int/lit8 v36, v36, 0x15

    xor-int v1, v36, v34

    mul-int/lit16 v1, v1, -0x5757

    const v38, -0x6bdd1a2d

    xor-int v1, v1, v38

    const v38, -0x77b40306

    xor-int v36, v36, v38

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    move-object/from16 v37, v17

    move-object/from16 v13, v23

    move-object/from16 v27, v26

    move-object/from16 v39, v31

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v40, 0x0

    move-object/from16 v23, v2

    move-object/from16 v17, v3

    move-object v5, v4

    move-object v8, v7

    move-object/from16 v26, v14

    move-object/from16 v31, v15

    move-object/from16 v7, v21

    move-object/from16 v3, v22

    move-object/from16 v15, v25

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    move-object/from16 v25, v24

    move-object/from16 v24, v12

    const/4 v12, 0x0

    :goto_0
    xor-int v6, v33, v34

    mul-int/lit16 v6, v6, -0x2953

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v33, v36, v1

    sparse-switch v33, :sswitch_data_0

    move/from16 v36, v9

    .line 893
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v6, 0x31

    const/16 v9, 0x8

    invoke-static {v1, v6, v9, v14}, Ll/֨᩹;->ۚܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 894
    invoke-static {v5, v1}, Ll/֨֫;->֨ۜ֡(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_1
    move/from16 v9, v36

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    goto/16 :goto_f

    :sswitch_0
    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x424f

    const v36, 0x341eee70

    xor-int v6, v6, v36

    const v36, -0x4b64ed84

    goto/16 :goto_6

    .line 167
    :sswitch_1
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v6, v18

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move-object/from16 v3, v19

    move-object/from16 v41, v20

    move-object/from16 v20, v2

    move-object/from16 v2, v41

    goto/16 :goto_1d

    .line 625
    :sswitch_2
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_3

    :cond_2
    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    goto/16 :goto_23

    :cond_3
    move-object/from16 v1, v37

    move-object/from16 v37, v3

    move/from16 v3, v32

    goto/16 :goto_c

    :sswitch_3
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v1, :cond_2

    :cond_4
    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    move-object v3, v5

    move-object/from16 v2, v17

    :goto_2
    move-object/from16 v5, v39

    goto/16 :goto_21

    :sswitch_4
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    goto/16 :goto_2a

    .line 46
    :sswitch_5
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_4

    goto :goto_3

    .line 794
    :sswitch_6
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_3
    const-string v1, "\u073a\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, 0x37

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x524d

    const v36, 0x6800835c

    xor-int v6, v6, v36

    const v36, 0x480b1d0b

    goto :goto_6

    .line 78
    :sswitch_7
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v1, :cond_7

    :goto_4
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    goto/16 :goto_28

    :cond_7
    :goto_5
    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x62e3

    const v36, 0x2e62895

    xor-int v6, v6, v36

    const v36, -0x7d39e81a

    :goto_6
    xor-int v36, v1, v36

    goto/16 :goto_16

    :sswitch_8
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto :goto_4

    .line 513
    :sswitch_9
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    .line 917
    :sswitch_a
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v6, 0x40

    move/from16 v36, v9

    const/4 v9, 0x7

    invoke-static {v1, v6, v9, v14}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 918
    invoke-static {v5, v1}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_1

    :sswitch_b
    move/from16 v36, v9

    .line 921
    invoke-static {v5, v13}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_7

    :sswitch_c
    move/from16 v36, v9

    .line 914
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v6, 0x3a

    const/4 v9, 0x6

    invoke-static {v1, v6, v9, v14}, Ll/֡᩸;->ۤ᩺ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 915
    invoke-static {v5, v1}, Ll/֨֫;->֨ۜ֡(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_1

    :sswitch_d
    move/from16 v36, v9

    .line 917
    invoke-static/range {v25 .. v25}, Ll/֨ۖ;->ۙܳ᩵(Ljava/lang/Object;)I

    move-result v1

    iget v6, v15, Ll/ۤۛۨ;->ۙ:I

    if-ne v1, v6, :cond_8

    const-string v1, "\u073f\u06db"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x5d

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x2d4d

    const v9, 0x122c774b

    xor-int/2addr v6, v9

    const v9, 0x4bf0c4a6    # 3.1557964E7f

    goto/16 :goto_a

    :cond_8
    const-string v1, "\u06d8\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, 0x5ad3

    const v9, -0x472c4869

    xor-int/2addr v6, v9

    const v9, 0x2b8a330f

    goto/16 :goto_a

    :sswitch_e
    move/from16 v36, v9

    const v1, -0xffff01

    move-object/from16 v36, v37

    const v32, -0xffff01

    goto/16 :goto_9

    :sswitch_f
    move/from16 v36, v9

    .line 914
    invoke-static/range {v25 .. v25}, Ll/֫᩺;->ۜ᩺ۢ(Ljava/lang/Object;)I

    move-result v1

    iget-object v15, v0, Ll/ᩴۛۨ;->ܺ:Ll/ۤۛۨ;

    iget v6, v15, Ll/ۤۛۨ;->ܰ:I

    if-ne v1, v6, :cond_9

    const-string v1, "\u073d\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x3f

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x4599

    const v9, -0x3f164525

    xor-int/2addr v6, v9

    const v9, 0x7185cd23

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u1a76\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x6d

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0xc59

    const v9, 0x488cf7c3

    xor-int/2addr v6, v9

    const v9, -0x5795dd64

    goto/16 :goto_a

    :sswitch_10
    move/from16 v36, v9

    .line 925
    invoke-static {v5, v13}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_7
    const-string v1, "\u06d9\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x33

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x7525

    const v9, -0x7e2039e0

    xor-int/2addr v6, v9

    const v9, -0x42db79d

    goto/16 :goto_a

    :sswitch_11
    move/from16 v36, v9

    .line 911
    invoke-static {v3, v11}, Ll/֨᩸;->᩷᩷ۛ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۜ֫᩺;->۬(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ll/֨ܰ;->᩸ܽ֨(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_8

    :sswitch_12
    move/from16 v36, v9

    const/4 v1, 0x0

    goto/16 :goto_8

    :sswitch_13
    move/from16 v36, v9

    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v6, 0x39

    const/4 v9, 0x1

    invoke-static {v1, v6, v9, v14}, Ll/ۖۗ;->᩺᩻ܰ([SIII)Ljava/lang/String;

    move-result-object v13

    if-eqz v25, :cond_a

    const-string v1, "\u073d\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x27

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x8a1

    const v9, 0x26519754

    xor-int/2addr v6, v9

    const v9, 0x2390fb39

    goto/16 :goto_a

    :cond_a
    const-string v1, "\u06d8\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x5317

    const v9, -0x4aff5235

    xor-int/2addr v6, v9

    const v9, -0x5338d50b

    goto/16 :goto_a

    :sswitch_14
    move/from16 v36, v9

    .line 909
    invoke-static {v3}, Ll/ۜ֫᩺;->۬(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ll/֨ܰ;->᩸ܽ֨(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_8

    :sswitch_15
    move/from16 v36, v9

    .line 910
    invoke-static {v3}, Ll/ۜ֫᩺;->ܰ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "\u0736\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x2b

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x6c57

    const v9, -0x3fd56df1

    xor-int/2addr v6, v9

    const v9, 0x691297bb

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x7b41

    const v9, -0x33660259    # -8.0735544E7f

    xor-int/2addr v6, v9

    const v9, 0x30e5d74e

    goto/16 :goto_a

    :sswitch_16
    move/from16 v36, v9

    .line 907
    invoke-static {v3}, Ll/֡ܽ;->۬ᩳܿ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ۖ᩸;->᩷֡ۗ(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_8
    move-object/from16 v25, v1

    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x3b17

    const v9, 0x75397c5f

    xor-int/2addr v6, v9

    const v9, 0x613f78d

    goto/16 :goto_a

    :sswitch_17
    move/from16 v36, v9

    .line 908
    invoke-static {v3}, Ll/ۜ֫᩺;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "\u06db\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, 0x41

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x590d

    const v9, 0x31204b51

    xor-int/2addr v6, v9

    const v9, 0x2f35510c

    goto/16 :goto_a

    :cond_c
    const-string v1, "\u1a74\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x1e9b

    const v9, 0x52947a38

    xor-int/2addr v6, v9

    const v9, 0x5aa71dc1

    goto :goto_a

    :sswitch_18
    move/from16 v36, v9

    .line 894
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v6, 0x29

    const/16 v9, 0x8

    invoke-static {v1, v6, v9, v14}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 897
    invoke-static {v5, v1}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 898
    sget v1, Ll/᩶᩵ۘ;->ۖۙ:I

    move/from16 v32, v1

    move/from16 v9, v36

    move-object/from16 v36, v37

    :goto_9
    move-object/from16 v37, v3

    goto/16 :goto_11

    :sswitch_19
    move/from16 v36, v9

    const/4 v1, 0x0

    .line 903
    invoke-static {v8, v1, v4}, Ll/ۘۛ;->ۖ᩸᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    move/from16 v3, v32

    move-object/from16 v36, v37

    goto/16 :goto_e

    :sswitch_1a
    move/from16 v36, v9

    .line 906
    invoke-static {v3}, Ll/ۜ֫᩺;->ۖ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x782b

    const v9, -0x5e1d0d77

    xor-int/2addr v6, v9

    const v9, 0x19765bce

    goto :goto_a

    :cond_d
    const-string v1, "\u1a75\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x2013

    const v9, -0x7110bee

    xor-int/2addr v6, v9

    const v9, 0x58133853

    :goto_a
    xor-int/2addr v1, v9

    move/from16 v9, v36

    goto/16 :goto_15

    .line 930
    :sswitch_1b
    invoke-static {v5}, Ll/ۗ۬;->ۘ᩷۟(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v5, v7, v12, v1, v10}, Ll/ۘۧ;->ܽ֫ۖ(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 931
    invoke-static {v2, v5}, Ll/ۗ۬;->ۚܶۜ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_1c
    move-object/from16 v1, v37

    .line 929
    invoke-static {v5, v1, v12, v9, v10}, Ll/ۘۧ;->ܽ֫ۖ(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 930
    new-instance v7, Landroid/text/style/TypefaceSpan;

    sget-object v6, Ll/ᩴۛۨ;->ܺۢ۠:[S

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v36

    if-gtz v36, :cond_e

    move-object/from16 v36, v1

    move-object/from16 v37, v3

    :goto_b
    move-object/from16 v1, v23

    move-object/from16 v41, v20

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v41

    goto/16 :goto_1f

    :cond_e
    move-object/from16 v36, v1

    const/16 v1, 0x1f

    move-object/from16 v37, v3

    const/16 v3, 0xa

    invoke-static {v6, v1, v3, v14}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_f

    goto :goto_b

    :cond_f
    const-string v1, "\u1a77\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x5f

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, -0x504f

    const v6, -0x6a028cfe

    xor-int/2addr v3, v6

    const v6, 0x2c80e7bb

    goto/16 :goto_12

    :sswitch_1d
    move-object/from16 v37, v3

    .line 929
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    move/from16 v3, v32

    invoke-direct {v1, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {v5}, Ll/ۗ۬;->ۘ᩷۟(Ljava/lang/Object;)I

    move-result v9

    const/16 v10, 0x21

    sget-boolean v6, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v6, :cond_10

    :goto_c
    const-string v6, "\u1a75\u06df"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v35

    mul-int/lit8 v6, v6, 0xf

    move-object/from16 v32, v1

    xor-int v1, v6, v34

    mul-int/lit16 v1, v1, -0x30a3

    const v36, -0x53ab64e2

    xor-int v1, v1, v36

    const v36, 0x2e7aeedc

    xor-int v36, v6, v36

    move-object/from16 v41, v32

    move/from16 v32, v3

    goto/16 :goto_25

    :cond_10
    const-string v6, "\u0730\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    xor-int v32, v6, v35

    mul-int/lit8 v32, v32, 0x71

    const v36, -0x6f1547a7

    xor-int v32, v32, v36

    const v36, 0x5712c133

    xor-int v36, v6, v36

    move-object/from16 v41, v37

    move-object/from16 v37, v1

    move/from16 v1, v32

    :goto_d
    move/from16 v32, v3

    move-object/from16 v3, v41

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    .line 885
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v3, 0x19

    const/4 v6, 0x6

    invoke-static {v1, v3, v6, v14}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 886
    invoke-static {v5, v1}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_f

    :sswitch_1f
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v3, 0x13

    const/4 v6, 0x6

    invoke-static {v1, v3, v6, v14}, Ll/ۖۧ;->᩶ܽܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 889
    invoke-static {v5, v1}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 890
    sget v1, Ll/᩶᩵ۘ;->ۖۙ:I

    goto/16 :goto_10

    :sswitch_20
    move-object/from16 v1, v31

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move/from16 v3, v32

    .line 893
    invoke-static {v8, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    const-string v6, "\u1a74\u1a78"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v34

    mul-int/lit8 v6, v6, -0x4f

    move-object/from16 v31, v1

    xor-int v1, v6, v35

    mul-int/lit16 v1, v1, 0x36a5

    const v32, 0x7cafd16e

    xor-int v1, v1, v32

    const v32, 0x1255bcdb

    goto/16 :goto_13

    :cond_11
    move-object/from16 v31, v1

    const-string v1, "\u1a76\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x4133

    const v32, 0x29c54210

    xor-int v6, v6, v32

    const v32, -0x10525161

    goto/16 :goto_14

    :sswitch_21
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move/from16 v3, v32

    const/16 v1, 0x28

    .line 901
    invoke-static {v8, v1}, Ll/ۗܺ;->᩻᩷ܶ(Ljava/lang/Object;I)I

    move-result v4

    const/4 v1, -0x1

    if-eq v4, v1, :cond_12

    const-string v1, "\u05a8\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x21

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, 0x5197

    const v32, -0x11a117d2

    xor-int v6, v6, v32

    const v32, -0x3dce0c96

    goto/16 :goto_14

    :cond_12
    move-object v1, v8

    :goto_e
    const-string v6, "\u06e8\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v35

    move-object/from16 v32, v1

    xor-int v1, v6, v34

    mul-int/lit16 v1, v1, -0x3167

    const v37, -0x64e6d8f9

    xor-int v1, v1, v37

    const v37, -0x2ab62e99

    xor-int v6, v6, v37

    move-object/from16 v37, v36

    move/from16 v36, v6

    move-object/from16 v41, v32

    goto/16 :goto_d

    :sswitch_22
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    .line 877
    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v3, 0xe

    const/4 v6, 0x5

    invoke-static {v1, v3, v6, v14}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    .line 878
    invoke-static {v5, v1}, Ll/֨֫;->֨ۜ֡(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_f
    move/from16 v32, v16

    goto :goto_11

    :sswitch_23
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    sget-object v1, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v3, 0x9

    const/4 v6, 0x5

    invoke-static {v1, v3, v6, v14}, Ll/ۘۧ;->ܿܶ֫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 881
    invoke-static {v5, v1}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 882
    sget v1, Ll/᩶᩵ۘ;->ۖۙ:I

    :goto_10
    move/from16 v32, v1

    :goto_11
    const-string v1, "\u06d9\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, 0x787

    const v6, 0x53931e61

    xor-int/2addr v3, v6

    const v6, -0x27854f74

    :goto_12
    xor-int/2addr v1, v6

    goto/16 :goto_1a

    :sswitch_24
    move-object/from16 v1, v26

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move/from16 v3, v32

    .line 885
    invoke-static {v8, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    const-string v6, "\u05ab\u073a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    mul-int/lit8 v6, v6, -0x57

    move-object/from16 v26, v1

    xor-int v1, v6, v35

    mul-int/lit16 v1, v1, -0x226f

    const v32, 0x293c5529

    xor-int v1, v1, v32

    const v32, 0x13e5e215

    :goto_13
    xor-int v6, v6, v32

    move/from16 v32, v3

    goto/16 :goto_1c

    :cond_13
    move-object/from16 v26, v1

    const-string v1, "\u06e7\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x3ae1

    const v32, 0x66af432e

    xor-int v6, v6, v32

    const v32, -0x753e0bfb

    :goto_14
    xor-int v1, v1, v32

    move/from16 v32, v3

    move-object/from16 v3, v37

    move-object/from16 v37, v36

    :goto_15
    move/from16 v36, v1

    :goto_16
    move v1, v6

    goto/16 :goto_0

    :sswitch_25
    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move/from16 v3, v32

    .line 892
    invoke-static {v8}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v1

    iget-object v6, v0, Ll/ᩴۛۨ;->۫:Ljava/lang/String;

    invoke-static {v6}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    if-ne v1, v3, :cond_14

    const-string v1, "\u06eb\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, 0x7eb5

    const v31, 0x499c01ea    # 1278013.2f

    xor-int v3, v3, v31

    const v31, 0x39be0c11

    goto :goto_17

    :cond_14
    const-string v1, "\u1a7b\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, -0x3999

    const v31, -0x4b22b1e9

    xor-int v3, v3, v31

    const v31, -0x7583ff60

    :goto_17
    xor-int v1, v1, v31

    move-object/from16 v31, v6

    goto/16 :goto_1a

    :sswitch_26
    move-object/from16 v1, v24

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    .line 877
    invoke-static {v8, v1}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    const-string v3, "\u1a74\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, -0x292b

    const v24, -0x511a3813

    xor-int v6, v6, v24

    const v24, -0x30470e67

    goto :goto_18

    :cond_15
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v6, v3, v34

    mul-int/lit16 v6, v6, -0x597

    const v24, 0x5f9d8be6

    xor-int v6, v6, v24

    const v24, -0x7eb1fc2d

    :goto_18
    xor-int v3, v3, v24

    move-object/from16 v24, v1

    move v1, v6

    goto/16 :goto_24

    :sswitch_27
    move-object/from16 v1, v24

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    .line 884
    invoke-static {v8}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    iget-object v6, v0, Ll/ᩴۛۨ;->ܽ:Ljava/lang/String;

    invoke-static {v6}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    if-ne v3, v1, :cond_16

    const-string v1, "\u06e2\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, -0x189d

    const v26, 0x443c963f

    xor-int v3, v3, v26

    const v26, 0x11b5ad2b

    goto :goto_19

    :cond_16
    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x71

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, 0x3365

    const v26, 0x415db3bd

    xor-int v3, v3, v26

    const v26, 0x7bdb2f48

    :goto_19
    xor-int v1, v1, v26

    move-object/from16 v26, v6

    :goto_1a
    move-object/from16 v41, v36

    move/from16 v36, v1

    move v1, v3

    goto/16 :goto_25

    :sswitch_28
    move-object/from16 v1, v23

    .line 868
    invoke-static {v2, v1}, Ll/ۗ۬;->ۚܶۜ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_29
    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    const/4 v11, 0x2

    add-int/lit8 v12, v22, 0x2

    .line 876
    invoke-static {v8}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v3

    iget-object v6, v0, Ll/ᩴۛۨ;->᩶:Ljava/lang/String;

    invoke-static {v6}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v11

    const v23, -0xff3400

    if-ne v3, v11, :cond_17

    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v11, v3, v34

    mul-int/lit16 v11, v11, -0x2c53

    const v24, 0x5d537de1

    xor-int v11, v11, v24

    const v24, 0x3e375ccf

    goto :goto_1b

    :cond_17
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, -0x4971

    const v24, 0x2e2aa02c

    xor-int v11, v11, v24

    const v24, -0x5fc48396

    :goto_1b
    xor-int v3, v3, v24

    move-object/from16 v23, v1

    move-object/from16 v24, v6

    move v1, v11

    const/4 v11, 0x2

    const v16, -0xff3400

    goto/16 :goto_24

    :sswitch_2a
    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move-object/from16 v3, v20

    .line 873
    invoke-virtual {v3, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 874
    invoke-static {v1}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v22

    sget-boolean v6, Ll/᩶;->ۚۤۘ:Z

    if-eqz v6, :cond_18

    move-object/from16 v20, v2

    move-object/from16 v2, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move/from16 v23, v40

    move-object/from16 v19, v3

    move-object v3, v5

    goto/16 :goto_2

    :cond_18
    const-string v6, "\u1a77\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v34, v6

    mul-int/lit8 v6, v6, 0x5

    move-object/from16 v20, v2

    xor-int v2, v6, v35

    mul-int/lit16 v2, v2, 0x1fa7

    const v23, 0x44e1f2bc

    xor-int v2, v2, v23

    const v23, 0x3da68acf

    xor-int v6, v6, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v3

    :goto_1c
    move-object/from16 v3, v37

    move-object/from16 v37, v36

    move/from16 v36, v6

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v20, v2

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    const-string v2, ""

    move-object/from16 v6, v18

    move-object/from16 v3, v19

    .line 872
    invoke-static {v6, v3, v2}, Ll/ۖۛ;->۠۟֨(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫֡;->֫ۜ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 873
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget v18, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v18, :cond_19

    :goto_1d
    const-string v18, "\u1a75\u1a79"

    invoke-static/range {v18 .. v18}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v35

    move-object/from16 v19, v2

    xor-int v2, v18, v34

    mul-int/lit16 v2, v2, 0x70ad

    const v23, 0x21d0767c

    xor-int v2, v2, v23

    const v23, -0x5b5ceab9

    goto :goto_1e

    :cond_19
    const-string v18, "\u073d\u1a73"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v35

    move-object/from16 v19, v2

    xor-int v2, v18, v34

    mul-int/lit16 v2, v2, -0x78db

    const v23, 0x1b0ee626

    xor-int v2, v2, v23

    const v23, -0x494e1a23

    :goto_1e
    xor-int v18, v18, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v37

    move-object/from16 v37, v36

    move/from16 v36, v18

    goto/16 :goto_2c

    :sswitch_2c
    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v2

    .line 872
    invoke-static/range {p1 .. p1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    sget-object v2, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/4 v6, 0x3

    move-object/from16 v19, v3

    const/4 v3, 0x6

    invoke-static {v2, v6, v3, v14}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_1a

    :goto_1f
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v34

    mul-int/lit8 v3, v3, -0x23

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, 0x2613

    const v7, 0x3a1039bf

    xor-int/2addr v6, v7

    const v7, -0x771b8327

    xor-int/2addr v3, v7

    move-object/from16 v23, v1

    move v1, v6

    move-object/from16 v7, v21

    goto :goto_20

    :cond_1a
    const-string v3, "\u06db\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, -0x7b31

    const v23, -0x72890297

    xor-int v6, v6, v23

    const v23, -0x2b1c4f21

    xor-int v3, v3, v23

    move-object/from16 v23, v1

    move v1, v6

    :goto_20
    move-object/from16 v41, v19

    move-object/from16 v19, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v41

    move-object/from16 v42, v36

    move/from16 v36, v3

    move-object/from16 v3, v37

    move-object/from16 v37, v42

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v6, v18

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v37, v3

    move-object/from16 v41, v20

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v41

    const/4 v3, 0x2

    move-object/from16 v18, v2

    move-object/from16 v5, v39

    move/from16 v2, v40

    .line 871
    invoke-static {v5, v2, v3, v14}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v3

    move/from16 v23, v2

    move-object/from16 v2, v17

    invoke-static {v2, v3}, Ll/֨ۢ;->᩶ܿ᩹(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 13
    sget-boolean v17, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v17, :cond_1b

    :goto_21
    const-string v17, "\u06e0\u06d8"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v35

    move-object/from16 v38, v2

    xor-int v2, v17, v34

    mul-int/lit16 v2, v2, -0x40f5

    const v39, -0x1ee7ad8b

    xor-int v2, v2, v39

    const v39, 0xc85ca5f

    xor-int v17, v17, v39

    move-object/from16 v39, v5

    move/from16 v40, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object v5, v3

    move-object/from16 v2, v20

    move-object/from16 v3, v37

    move-object/from16 v20, v19

    move-object/from16 v37, v36

    move/from16 v36, v17

    move-object/from16 v19, v18

    move-object/from16 v17, v38

    goto/16 :goto_2c

    :cond_1b
    move-object/from16 v38, v2

    const-string v2, "\u06d6\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v34, v2

    mul-int/lit8 v2, v2, 0x49

    move-object/from16 v17, v3

    xor-int v3, v2, v35

    mul-int/lit16 v3, v3, 0x47d5

    const v39, -0x199095e7

    xor-int v3, v3, v39

    const v39, 0x6fffa5fb

    xor-int v2, v2, v39

    move-object/from16 v39, v5

    move-object/from16 v5, v17

    move/from16 v40, v23

    move-object/from16 v17, v38

    :goto_22
    move-object/from16 v23, v1

    move v1, v3

    move-object/from16 v3, v37

    move-object/from16 v37, v36

    goto/16 :goto_29

    :sswitch_2e
    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v36, v37

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    .line 871
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    sget-object v39, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v40, 0x1

    .line 476
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_1c

    move-object/from16 v17, v2

    :goto_23
    const-string v2, "\u0730\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v34, v2

    mul-int/lit8 v2, v2, -0x5f

    xor-int v3, v2, v35

    mul-int/lit16 v3, v3, 0x3a1b

    const v23, -0x36417671

    xor-int v3, v3, v23

    const v23, 0xcbfc59e

    xor-int v2, v2, v23

    goto :goto_22

    :cond_1c
    const-string v3, "\u1a79\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    mul-int/lit8 v3, v3, 0x71

    move-object/from16 v17, v1

    xor-int v1, v3, v34

    mul-int/lit16 v1, v1, 0x62a1

    const v23, 0x3217aef7

    xor-int v1, v1, v23

    const v23, -0x2c5bae11

    xor-int v3, v3, v23

    move-object/from16 v23, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v6

    :goto_24
    move-object/from16 v41, v36

    move/from16 v36, v3

    :goto_25
    move-object/from16 v3, v37

    move-object/from16 v37, v41

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v37, v3

    .line 867
    invoke-static/range {p1 .. p1}, Ll/֫ܳ;->ۡܽ᩵(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, v0, Ll/ᩴۛۨ;->ܿ:Landroid/widget/TextView;

    iget-object v3, v0, Ll/ᩴۛۨ;->֡:Ljava/lang/String;

    if-nez v1, :cond_1d

    const-string v1, "\u06df\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x61

    xor-int v0, v1, v34

    mul-int/lit16 v0, v0, 0x3ef3

    const v17, -0x436829bd

    xor-int v0, v0, v17

    const v17, 0x7f01dca4

    xor-int v1, v1, v17

    move-object/from16 v20, v19

    move/from16 v40, v23

    move-object/from16 v17, v38

    move-object/from16 v23, v3

    move-object/from16 v19, v18

    move-object/from16 v3, v37

    move-object/from16 v18, v6

    move-object/from16 v37, v36

    move/from16 v36, v1

    move v1, v0

    goto :goto_26

    :cond_1d
    const-string v0, "\u073d\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x11

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x3279

    const v17, -0x503f10f5

    xor-int v1, v1, v17

    const v17, 0x13c519c1

    xor-int v0, v0, v17

    move-object/from16 v20, v19

    move/from16 v40, v23

    move-object/from16 v17, v38

    move-object/from16 v23, v3

    move-object/from16 v19, v18

    move-object/from16 v3, v37

    move-object/from16 v18, v6

    move-object/from16 v37, v36

    move/from16 v36, v0

    :goto_26
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_30
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    const/16 v0, 0x7c03

    const/16 v14, 0x7c03

    goto :goto_27

    :sswitch_31
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    const v0, 0xc75f

    const v14, 0xc75f

    :goto_27
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0x3891

    const v2, -0x16b3379c

    xor-int/2addr v1, v2

    const v2, 0x4a1b4272    # 2543772.5f

    goto/16 :goto_2b

    :sswitch_32
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    mul-int v0, v30, v30

    mul-int v1, v29, v29

    const v2, 0x821ff41

    add-int/2addr v1, v2

    add-int/2addr v1, v1

    sub-int/2addr v1, v0

    if-ltz v1, :cond_1e

    const-string v0, "\u073a\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v34, v0

    mul-int/lit8 v0, v0, 0x1b

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0x25cd

    const v2, -0x21d32a6b

    xor-int/2addr v1, v2

    const v2, -0x293faac6

    goto/16 :goto_2b

    :cond_1e
    const-string v0, "\u06df\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x5d7

    const v2, -0x538b8367

    xor-int/2addr v1, v2

    const v2, -0x330cbca2

    goto/16 :goto_2b

    :sswitch_33
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    aget-short v0, v27, v28

    add-int/lit16 v1, v0, 0x2da1

    sget v2, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v2, :cond_1f

    move/from16 v29, v0

    move/from16 v30, v1

    :goto_28
    const-string v0, "\u05a1\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x41

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0x3fe9

    const v2, -0x219e5aa9

    xor-int/2addr v1, v2

    const v2, 0x5b36f618

    goto/16 :goto_2b

    :cond_1f
    const-string v2, "\u06e4\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    mul-int/lit8 v2, v2, -0x79

    xor-int v3, v2, v35

    mul-int/lit16 v3, v3, -0x798f

    const v29, 0x21c18573

    xor-int v3, v3, v29

    const v29, 0x72ecc1d0

    xor-int v2, v2, v29

    move/from16 v29, v0

    move/from16 v30, v1

    move v1, v3

    move/from16 v40, v23

    move-object/from16 v3, v37

    move-object/from16 v0, p0

    move-object/from16 v23, v17

    move-object/from16 v37, v36

    move-object/from16 v17, v38

    :goto_29
    move/from16 v36, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v18

    goto :goto_2c

    :sswitch_34
    move-object/from16 v38, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move-object/from16 v36, v37

    move/from16 v23, v40

    move-object/from16 v20, v2

    move-object/from16 v37, v3

    sget-object v27, Ll/ᩴۛۨ;->ܺۢ۠:[S

    const/16 v28, 0x0

    .line 511
    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_20

    :goto_2a
    const-string v0, "\u06e1\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x9

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, 0x235

    const v2, 0x785c6242

    xor-int/2addr v1, v2

    const v2, 0xe242a9f

    goto :goto_2b

    :cond_20
    const-string v0, "\u05ab\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x7399

    const v2, -0x2ffe41e8

    xor-int/2addr v1, v2

    const v2, 0x22bb2135

    :goto_2b
    xor-int/2addr v0, v2

    move-object/from16 v2, v20

    move/from16 v40, v23

    move-object/from16 v3, v37

    move-object/from16 v23, v17

    move-object/from16 v20, v19

    move-object/from16 v37, v36

    move-object/from16 v17, v38

    move/from16 v36, v0

    move-object/from16 v19, v18

    move-object/from16 v0, p0

    :goto_2c
    move-object/from16 v18, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fea58e6 -> :sswitch_11
        -0x7f66dab1 -> :sswitch_25
        -0x7ca1f129 -> :sswitch_22
        -0x74d2f8f0 -> :sswitch_27
        -0x6eb732d8 -> :sswitch_e
        -0x6ce182b9 -> :sswitch_0
        -0x6b2dc5aa -> :sswitch_30
        -0x698573e0 -> :sswitch_20
        -0x67f6c168 -> :sswitch_33
        -0x67ca99a9 -> :sswitch_18
        -0x615df925 -> :sswitch_26
        -0x6071040c -> :sswitch_1
        -0x60647cee -> :sswitch_14
        -0x5d2d746b -> :sswitch_1a
        -0x5bd34e36 -> :sswitch_5
        -0x5459cb7b -> :sswitch_9
        -0x543755bf -> :sswitch_2c
        -0x510b159f -> :sswitch_2b
        -0x501e1257 -> :sswitch_1d
        -0x4f958a41 -> :sswitch_19
        -0x4d896431 -> :sswitch_10
        -0x495129c8 -> :sswitch_17
        -0x4497e6eb -> :sswitch_30
        -0x4467578d -> :sswitch_d
        -0x4440c018 -> :sswitch_f
        -0x3fc6b3bd -> :sswitch_24
        -0x3ed56700 -> :sswitch_2a
        -0x390158d2 -> :sswitch_29
        -0x38b6baee -> :sswitch_12
        -0x38230ead -> :sswitch_a
        -0x3202d509 -> :sswitch_2e
        -0x2fd4159d -> :sswitch_c
        -0x2fb1143a -> :sswitch_32
        -0x2d40c669 -> :sswitch_28
        -0x2cc42218 -> :sswitch_2
        -0x25d9ee63 -> :sswitch_10
        -0x2055cdcb -> :sswitch_14
        -0x1efb3175 -> :sswitch_c
        -0x1dfbff99 -> :sswitch_b
        -0x1be047ad -> :sswitch_2f
        -0x1b510230 -> :sswitch_22
        -0x1500909d -> :sswitch_29
        -0xf52cbf6 -> :sswitch_4
        -0xaa2b33c -> :sswitch_8
        -0x92934e7 -> :sswitch_23
        -0x5dbf17a -> :sswitch_2a
        -0x2a5513f -> :sswitch_1f
        -0x21b3610 -> :sswitch_21
        -0x9a182 -> :sswitch_2b
        0x9fddfe -> :sswitch_b
        0x59746f6 -> :sswitch_1f
        0x9cb2e4f -> :sswitch_7
        0xb06d170 -> :sswitch_23
        0xbfab527 -> :sswitch_3
        0xd0a4f23 -> :sswitch_27
        0xfc9914d -> :sswitch_4
        0x19cff6ab -> :sswitch_2d
        0x1b445c30 -> :sswitch_f
        0x1bf03e8d -> :sswitch_12
        0x1cdbc517 -> :sswitch_1
        0x1d6b9a64 -> :sswitch_2e
        0x1f81f85e -> :sswitch_28
        0x1fd97ec8 -> :sswitch_20
        0x201cdc92 -> :sswitch_1b
        0x24f432c3 -> :sswitch_13
        0x251a38a8 -> :sswitch_9
        0x26c2f998 -> :sswitch_16
        0x2731a502 -> :sswitch_2c
        0x279c842e -> :sswitch_7
        0x28d31e76 -> :sswitch_1b
        0x297e324e -> :sswitch_25
        0x2b23cbda -> :sswitch_16
        0x2c536af7 -> :sswitch_0
        0x2d3fd54a -> :sswitch_15
        0x2df81afc -> :sswitch_15
        0x2f89fdd3 -> :sswitch_3
        0x2f8bf0fd -> :sswitch_17
        0x31a268a9 -> :sswitch_11
        0x339c3d36 -> :sswitch_18
        0x3639bed1 -> :sswitch_1c
        0x46a4dd65 -> :sswitch_1a
        0x47e59a3c -> :sswitch_34
        0x485596f7 -> :sswitch_1e
        0x48c94cc8 -> :sswitch_e
        0x48cad61c -> :sswitch_34
        0x49ac2bc8 -> :sswitch_26
        0x4bb42f43 -> :sswitch_6
        0x4f85c220 -> :sswitch_1d
        0x53e04878 -> :sswitch_32
        0x552011db -> :sswitch_33
        0x56921af2 -> :sswitch_d
        0x5823bbfe -> :sswitch_2
        0x58d8f07c -> :sswitch_21
        0x59419a56 -> :sswitch_31
        0x5de42d3e -> :sswitch_31
        0x610ead7a -> :sswitch_2f
        0x63c77927 -> :sswitch_1e
        0x662ef715 -> :sswitch_24
        0x6f06c9ec -> :sswitch_8
        0x6f1d4005 -> :sswitch_2d
        0x71889f46 -> :sswitch_13
        0x721d77b7 -> :sswitch_5
        0x7ab25d63 -> :sswitch_19
        0x7b1e97ac -> :sswitch_6
        0x7b291380 -> :sswitch_a
        0x7c071175 -> :sswitch_1c
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, -0x4882884e

    sget p2, Ll/ۧ;->֫۠ᩴ:I

    sget p3, Ll/֫ᩳ;->۬֨᩸:I

    const-string p4, "\u1a7a\u06d8"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x44d9

    const v1, 0x2a3182bc

    xor-int/2addr v0, v1

    const v1, -0x1c67913e

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x15ef

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 2
    sget p4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz p4, :cond_6

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget-boolean p4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez p4, :cond_8

    goto :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget p4, Ll/ۗ;->֨۬ۖ:I

    if-gez p4, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string p4, "\u06d9\u1a7a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x19

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x28dd

    const v1, 0x740e578a

    xor-int/2addr v0, v1

    const v1, 0x512e12b2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget p4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz p4, :cond_a

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    :sswitch_5
    return-void

    .line 3
    :sswitch_6
    sget-boolean p4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez p4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string p4, "\u05a8\u06e7"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x61

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2e61

    const v1, 0x48672148

    xor-int/2addr v0, v1

    const v1, -0x17766f66

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean p4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez p4, :cond_2

    :goto_2
    const-string p4, "\u1a78\u06d7"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x6d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x3389

    const v1, -0x3a37391c

    xor-int/2addr v0, v1

    const v1, -0x7d1e2a2a

    goto :goto_0

    :cond_2
    const-string p4, "\u06e1\u06e7"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4229

    const v1, 0x39d91eee

    xor-int/2addr v0, v1

    const v1, -0x47c3a604

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget-boolean p4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez p4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string p4, "\u0730\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x9

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x238d

    const v1, -0x22adbe4e

    xor-int/2addr v0, v1

    const v1, -0x5dbe9edb

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result p4

    if-gtz p4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string p4, "\u1a7b\u05a1"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x2e0f

    const v1, -0x225bcb6f

    xor-int/2addr v0, v1

    const v1, 0x59b0910d

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget p4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string p4, "\u1a7b\u073a"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x7dbf

    const v1, 0x6e22fafb    # 1.2609997E28f

    xor-int/2addr v0, v1

    const v1, -0x69cf7c22

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u06e2\u06e1"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2e45

    const v1, 0x3036792d

    xor-int/2addr v0, v1

    const v1, 0x7db0a372

    goto/16 :goto_0

    :sswitch_b
    sget p4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz p4, :cond_7

    goto :goto_4

    :cond_7
    const-string p4, "\u1a79\u1a7a"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0xb17

    const v1, 0x27f0a0e6

    xor-int/2addr v0, v1

    const v1, 0x6e409419    # 1.490004E28f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget p4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz p4, :cond_9

    :cond_8
    :goto_3
    const-string p4, "\u1a75\u06db"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x3f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x41e5

    const v1, 0x5a78fa4c

    xor-int/2addr v0, v1

    const v1, -0x1f8b4d55

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u1a7a\u06e1"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x2f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x373b

    const v1, 0x47aac099

    xor-int/2addr v0, v1

    const v1, -0x89ede6b

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget p4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p4, :cond_b

    :cond_a
    :goto_4
    const-string p4, "\u0733\u073f"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x63

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x70d9

    const v1, -0x9b6c3bb

    xor-int/2addr v0, v1

    const v1, -0x52606f0f

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u06d9\u0733"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x33

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x5f5d

    const v1, 0x4f3ca512

    xor-int/2addr v0, v1

    const v1, 0x462595d9

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_c

    :goto_5
    const-string p4, "\u06e2\u06dc"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x265d

    const v1, 0x65515f10

    xor-int/2addr v0, v1

    const v1, 0x1f38bf2e

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06e2\u05ab"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x4f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5e51

    const v1, 0x75ca54a

    xor-int/2addr v0, v1

    const v1, 0x170db075

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77e8f9ca -> :sswitch_5
        -0x73a335e1 -> :sswitch_0
        -0x6e34dee9 -> :sswitch_4
        -0x53a6530f -> :sswitch_2
        -0x4e613728 -> :sswitch_e
        -0x4886b8ad -> :sswitch_b
        -0x3d4b7cda -> :sswitch_a
        -0x3bc9ddbb -> :sswitch_9
        -0x37777fe9 -> :sswitch_7
        -0x374fb2aa -> :sswitch_5
        -0x35900716 -> :sswitch_c
        -0x1cabe7ad -> :sswitch_e
        -0x1a3f3347 -> :sswitch_d
        -0x15c6e7a2 -> :sswitch_6
        -0x15758931 -> :sswitch_7
        -0x7010090 -> :sswitch_b
        0x45f6709 -> :sswitch_4
        0xbb6360f -> :sswitch_8
        0x10d73227 -> :sswitch_c
        0x1ee5da8e -> :sswitch_1
        0x3cee8cfb -> :sswitch_a
        0x40dbde3b -> :sswitch_d
        0x442ace7f -> :sswitch_6
        0x4d3dfe90 -> :sswitch_0
        0x56b69eae -> :sswitch_9
        0x667dc447 -> :sswitch_8
        0x669f9616 -> :sswitch_3
        0x72d929d4 -> :sswitch_3
        0x7700bac7 -> :sswitch_1
        0x787e5803 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, -0x49057ce9

    sget p2, Ll/֨᩺;->۬᩺ܰ:I

    sget p3, Ll/۟;->ۨᩴۛ:I

    const-string p4, "\u06da\u1a75"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0xfdd

    const v1, 0x4a3e866f    # 3121563.8f

    xor-int/2addr v0, v1

    const v1, 0x5a926ba8

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x18b3

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    return-void

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result p4

    if-nez p4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string p4, "\u0736\u0730"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x79

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7709

    const v1, -0x3c5ae9aa

    xor-int/2addr v0, v1

    const v1, -0x1df7049a

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result p4

    if-nez p4, :cond_a

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget p4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz p4, :cond_7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_4

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result p4

    if-gtz p4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p4, "\u073d\u06e1"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x47

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x69eb

    const v1, -0x3558251b    # -5500274.5f

    xor-int/2addr v0, v1

    const v1, -0x116419d

    goto :goto_0

    .line 0
    :sswitch_6
    sget p4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz p4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p4, "\u06ec\u1a7b"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x3bf9

    const v1, 0x388b687c

    xor-int/2addr v0, v1

    const v1, 0x47081ec

    goto/16 :goto_0

    :sswitch_7
    sget p4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz p4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string p4, "\u1a74\u073f"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x23

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x76b5

    const v1, -0x6d4db0cd

    xor-int/2addr v0, v1

    const v1, -0x546a5923

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget p4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p4, :cond_4

    goto :goto_1

    :cond_4
    const-string p4, "\u1a7b\u06e8"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x65

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x18b3

    const v1, -0x2d88e625

    xor-int/2addr v0, v1

    const v1, -0x1d5876df

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_5

    goto :goto_1

    :cond_5
    const-string p4, "\u1a78\u06e1"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x62a5

    const v1, -0x7b9ec3e

    xor-int/2addr v0, v1

    const v1, -0x27cac59d

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget p4, Ll/֨ۧ;->֫۠֡:I

    if-gtz p4, :cond_6

    :goto_1
    const-string p4, "\u06e0\u05a8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x55

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x7ae3

    const v1, 0x4f6308cb

    xor-int/2addr v0, v1

    const v1, 0x692547df

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u06e1\u05ab"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x6a7d

    const v1, -0x191302ec

    xor-int/2addr v0, v1

    const v1, 0x4fedc42d

    goto/16 :goto_0

    :sswitch_b
    sget p4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p4, :cond_8

    :cond_7
    :goto_2
    const-string p4, "\u06ec\u1a78"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1bf1

    const v1, -0x1ea88dc3

    xor-int/2addr v0, v1

    const v1, -0x6a9150a5

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u073f\u073f"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x77c1

    const v1, -0x7d2dd5d3

    xor-int/2addr v0, v1

    const v1, 0x751464dd

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget p4, Ll/۟;->ۨᩴۛ:I

    if-ltz p4, :cond_9

    goto :goto_3

    :cond_9
    const-string p4, "\u1a78\u1a78"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x6aff

    const v1, -0x6f1794ab

    xor-int/2addr v0, v1

    const v1, -0x55a64817

    goto/16 :goto_0

    :sswitch_d
    sget p4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p4, :cond_b

    :cond_a
    :goto_3
    const-string p4, "\u073f\u06e8"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x55

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2159

    const v1, -0x4b7dc09f

    xor-int/2addr v0, v1

    const v1, -0x324bf5c0

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u0733\u06e0"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x77

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x470f

    const v1, 0x7573e34

    xor-int/2addr v0, v1

    const v1, -0x1bea9628

    goto/16 :goto_0

    :sswitch_e
    sget p4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p4, :cond_c

    :goto_4
    const-string p4, "\u06dc\u1a73"

    invoke-static {p4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x31

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x27e3

    const v1, 0x4115d9ef

    xor-int/2addr v0, v1

    const v1, -0x36206956

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06e0\u06db"

    invoke-static {p4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3723

    const v1, 0x656e1b6e

    xor-int/2addr v0, v1

    const v1, 0x39dc97a4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e5aa841 -> :sswitch_9
        -0x7a76b418 -> :sswitch_9
        -0x78bcf23b -> :sswitch_0
        -0x6fb143a4 -> :sswitch_6
        -0x6f092fa4 -> :sswitch_e
        -0x5f4b75b9 -> :sswitch_a
        -0x5b8553a0 -> :sswitch_7
        -0x4bd1aa47 -> :sswitch_1
        -0x4022d424 -> :sswitch_1
        -0x3320e8c6 -> :sswitch_5
        -0x31ebda34 -> :sswitch_5
        -0x2a10056b -> :sswitch_4
        -0x24da9a1a -> :sswitch_8
        -0x1a644ac8 -> :sswitch_b
        -0x1832ea8e -> :sswitch_3
        -0x1383badb -> :sswitch_d
        0x7bd6673 -> :sswitch_6
        0xd960870 -> :sswitch_8
        0xf25d2ea -> :sswitch_c
        0x1816b081 -> :sswitch_d
        0x23c40fbf -> :sswitch_2
        0x298c20a5 -> :sswitch_e
        0x38e0e8f1 -> :sswitch_0
        0x3c617916 -> :sswitch_c
        0x41c1a6ad -> :sswitch_7
        0x41c3276e -> :sswitch_2
        0x44f4061f -> :sswitch_a
        0x5f0a0b78 -> :sswitch_3
        0x603eadc6 -> :sswitch_b
        0x759a2a4a -> :sswitch_4
    .end sparse-switch
.end method
