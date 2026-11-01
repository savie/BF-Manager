.class public final Ll/ܿۡۘ;
.super Ll/ܿᩴܶ;
.source "UAQE"


# static fields
.field private static final ᩸᩸֨:[S


# instance fields
.field public final ۙ:Ljava/io/InputStream;

.field public final ۨ:Landroid/net/Uri;

.field public final ܰ:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿۡۘ;->᩸᩸֨:[S

    return-void

    :array_0
    .array-data 2
        0xc44s
        -0x20c8s
        -0x20c1s
        -0x20dcs
        -0x208as
        -0x20dcs
        -0x20c2s
        -0x208as
        -0x20dfs
        -0x20d8s
        -0x20dds
        -0x20d6s
        -0x20c7s
        -0x20dbs
        -0x208as
        -0x20eas
        -0x20f0s
        -0x2090s
        -0x209fs
        -0x2093s
    .end array-data
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/io/InputStream;J)V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    iput-object p2, p0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    iput-wide p3, p0, Ll/ܿۡۘ;->ܰ:J

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿۡۘ;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    return-object p0
.end method

.method public static bridge synthetic ܰ(Ll/ܿۡۘ;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, 0x622e3450

    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    sget v5, Ll/ۧ;->֫۠ᩴ:I

    const-string v6, "\u073f\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2bbf

    const v8, 0x10135bf6

    xor-int/2addr v7, v8

    const v8, 0x24c7f1d2

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x3d2d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    const/4 p1, 0x0

    return p1

    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v6

    if-ltz v6, :cond_6

    goto/16 :goto_3

    .line 134
    :sswitch_1
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v6

    if-gtz v6, :cond_a

    goto/16 :goto_2

    .line 121
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v6

    if-nez v6, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    .line 198
    :sswitch_6
    iget-object v6, p0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    iget-object v7, v0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    invoke-static {v6, v7}, Ll/֫ۛ;->ۖܳ۬(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u06e8\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x57

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7cad

    const v8, 0x62bfb8ee

    xor-int/2addr v7, v8

    const v8, 0x6d66e167

    goto :goto_0

    :sswitch_7
    iget-object v6, p0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    iget-object v7, v0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    invoke-static {v6, v7}, Ll/ۖᩴ;->ܳۘᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u06e2\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x25e1

    const v8, 0x79d384cc

    xor-int/2addr v7, v8

    const v8, 0x45aa0e0f

    goto :goto_0

    :sswitch_8
    iget-wide v6, v0, Ll/ܿۡۘ;->ܰ:J

    cmp-long v8, v1, v6

    if-nez v8, :cond_1

    const-string v6, "\u06ec\u1a7b"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x22d5

    const v8, -0x17a1ab93

    xor-int/2addr v7, v8

    const v8, -0x679b3bc6

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/ܿۡۘ;

    iget-wide v1, p0, Ll/ܿۡۘ;->ܰ:J

    .line 85
    sget v6, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v6, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v6, "\u06e8\u1a76"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x40f

    const v8, 0x4683870b

    xor-int/2addr v7, v8

    const v8, 0x3928d580

    goto/16 :goto_0

    .line 198
    :sswitch_a
    instance-of v6, p1, Ll/ܿۡۘ;

    if-eqz v6, :cond_1

    const-string v6, "\u1a7b\u0733"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4ea9

    const v8, 0x232a27c3

    xor-int/2addr v7, v8

    const v8, -0x6ebe774

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u1a75\u1a78"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4339

    const v8, -0x73b495cf

    xor-int/2addr v7, v8

    const v8, -0x199b215b

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v6, Ll/᩶;->ۚۤۘ:Z

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u06d7\u06eb"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x37

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5c23

    const v8, 0x463337e8

    xor-int/2addr v7, v8

    const v8, 0xab9f850

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u06e0\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4c1

    const v8, 0x57afa1c4

    xor-int/2addr v7, v8

    const v8, -0x1359a3d7

    goto/16 :goto_0

    .line 144
    :sswitch_d
    sget v6, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v6, :cond_4

    :goto_1
    const-string v6, "\u1a79\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6103

    const v8, -0x5e9ef9a4

    xor-int/2addr v7, v8

    const v8, 0x465a7f70

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u073a\u1a77"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6d37

    const v8, -0x161bb7e7

    xor-int/2addr v7, v8

    const v8, -0x21aef4f2

    goto/16 :goto_0

    .line 28
    :sswitch_e
    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v6, "\u06df\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2715

    const v8, 0x41eeb07f

    xor-int/2addr v7, v8

    const v8, -0x5711b989

    goto/16 :goto_0

    .line 97
    :sswitch_f
    sget v6, Ll/֨ۧ;->֫۠֡:I

    if-gtz v6, :cond_7

    :cond_6
    const-string v6, "\u1a78\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x5d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5bc3

    const v8, 0xf71f44c

    xor-int/2addr v7, v8

    const v8, -0x740fc213

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06eb\u06e1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2db9

    const v8, -0x43101a8e

    xor-int/2addr v7, v8

    const v8, 0xbe424a2

    goto/16 :goto_0

    .line 5
    :sswitch_10
    sget v6, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v6, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v6, "\u1a77\u06dc"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6563

    const v8, -0x53f7b288

    xor-int/2addr v7, v8

    const v8, 0x6010469d

    goto/16 :goto_0

    .line 61
    :sswitch_11
    sget-boolean v6, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v6, :cond_9

    :goto_2
    const-string v6, "\u06ec\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4cc7

    const v8, -0x41f2e045

    xor-int/2addr v7, v8

    const v8, 0x1ad8420a

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06d7\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x307f

    const v8, -0x226cc946

    xor-int/2addr v7, v8

    const v8, -0x2a155704

    goto/16 :goto_0

    .line 15
    :sswitch_12
    sget v6, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_3
    const-string v6, "\u06d8\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x13

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1635

    const v8, 0x49b60a4d

    xor-int/2addr v7, v8

    const v8, -0x10ca3467

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e4\u0733"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x19ff

    const v8, 0x3e644344

    xor-int/2addr v7, v8

    const v8, 0x2214ce4e

    goto/16 :goto_0

    :sswitch_13
    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v6, :cond_d

    :cond_c
    :goto_4
    const-string v6, "\u073d\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5819

    const v8, -0x425b7a86

    xor-int/2addr v7, v8

    const v8, 0x44e58f80

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06d8\u073a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x72f3

    const v8, -0x7be41c7f

    xor-int/2addr v7, v8

    const v8, -0x504e7e18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78f06586 -> :sswitch_5
        -0x77d516bd -> :sswitch_d
        -0x6e6ed252 -> :sswitch_6
        -0x69c6b418 -> :sswitch_6
        -0x66bd0fa1 -> :sswitch_10
        -0x544592f7 -> :sswitch_3
        -0x4f16131c -> :sswitch_9
        -0x4ed47b4a -> :sswitch_7
        -0x4174d139 -> :sswitch_3
        -0x3d84a5e8 -> :sswitch_2
        -0x33e49734 -> :sswitch_4
        -0x2b1d5bc4 -> :sswitch_8
        -0x2442a0e6 -> :sswitch_5
        -0x212bbce7 -> :sswitch_13
        -0x1c8009ba -> :sswitch_b
        -0x158bcaa9 -> :sswitch_a
        -0x10c521e9 -> :sswitch_0
        -0xe2e4f25 -> :sswitch_b
        0x7af9c12 -> :sswitch_4
        0x8d71d58 -> :sswitch_1
        0x10b5a6e1 -> :sswitch_12
        0x12d52af6 -> :sswitch_12
        0x17ea60b5 -> :sswitch_d
        0x22734f61 -> :sswitch_11
        0x269c5ea6 -> :sswitch_0
        0x38ffb491 -> :sswitch_1
        0x433f6bbb -> :sswitch_13
        0x4b9f3625 -> :sswitch_8
        0x4d5f97a2 -> :sswitch_7
        0x5cc60859 -> :sswitch_9
        0x5edb48e5 -> :sswitch_a
        0x602b6c63 -> :sswitch_e
        0x619f7902 -> :sswitch_f
        0x6294c416 -> :sswitch_11
        0x65451560 -> :sswitch_c
        0x65467dcb -> :sswitch_2
        0x674cb8ed -> :sswitch_e
        0x6aee8e66 -> :sswitch_10
        0x7d647ebf -> :sswitch_f
        0x7e094c96 -> :sswitch_c
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 21

    move-object/from16 v0, p0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, -0x6dba11b8

    sget v15, Ll/֡ܳ;->֡۠ۧ:I

    sget v16, Ll/ۘۗ;->ۖۧ۬:I

    const-string v17, "\u1a74\u1a75"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, -0x4d21

    const v19, -0x79217774

    xor-int v1, v1, v19

    const v19, -0xfcea0ae

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int v14, v14, v16

    mul-int/lit16 v14, v14, 0x40b5

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v1, v14

    xor-int v14, v17, v1

    sparse-switch v14, :sswitch_data_0

    move/from16 v17, v14

    .line 80
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_2

    .line 102
    :sswitch_0
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v1, :cond_1

    :cond_0
    move/from16 v17, v14

    goto/16 :goto_5

    :cond_1
    move/from16 v17, v14

    goto/16 :goto_4

    .line 58
    :sswitch_1
    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-lez v1, :cond_0

    :goto_1
    move/from16 v17, v14

    goto :goto_2

    .line 94
    :sswitch_2
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u06eb\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    move/from16 v17, v14

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x23a3

    const v19, 0x68ccd0b3

    xor-int v14, v14, v19

    const v19, -0x2d109662

    goto/16 :goto_6

    :goto_2
    const-string v1, "\u06da\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x77

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x7187

    const v19, 0x593ecf81

    xor-int v14, v14, v19

    const v19, 0x4aeb1aab    # 7703893.5f

    goto/16 :goto_6

    .line 148
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    const/4 v1, 0x0

    return v1

    .line 198
    :sswitch_4
    invoke-static {v13}, Ll/ܰۛᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    return v1

    :sswitch_5
    move/from16 v17, v14

    mul-int v12, v10, v11

    iget-object v13, v0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    .line 173
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06e1\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x45

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x5213

    const v19, 0x27f7dc04

    xor-int v14, v14, v19

    const v19, 0x163d919c

    goto/16 :goto_6

    :sswitch_6
    move/from16 v17, v14

    const/16 v11, 0x1f

    .line 70
    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x6fcb

    const v19, -0x34128c4c    # -3.1123304E7f

    xor-int v14, v14, v19

    const v19, 0x31743f5e

    goto/16 :goto_6

    :sswitch_7
    move/from16 v17, v14

    add-int v10, v9, v8

    .line 171
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06d6\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x9b7

    const v19, -0x342220eb    # -2.908113E7f

    xor-int v14, v14, v19

    const v19, 0x100703db

    goto/16 :goto_6

    :sswitch_8
    move/from16 v17, v14

    .line 198
    iget-object v1, v0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    invoke-static {v1}, Ll/ܰۛᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v9

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06df\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x19

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x1221

    const v19, 0x1275fb39

    xor-int v14, v14, v19

    const v19, -0x4d8851b7

    goto/16 :goto_6

    :sswitch_9
    move/from16 v17, v14

    mul-int v8, v6, v7

    .line 38
    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x3635

    const v19, -0x68040429

    xor-int v14, v14, v19

    const v19, 0x1a9c42ec

    goto/16 :goto_6

    :sswitch_a
    move/from16 v17, v14

    long-to-int v6, v4

    const/16 v7, 0x1f

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_3
    const-string v1, "\u1a7b\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x4ee7

    const v19, 0x16bc832f

    xor-int v14, v14, v19

    const v19, -0x118c13cb

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u073d\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x21f3

    const v19, -0x54131b89

    xor-int v14, v14, v19

    const v19, -0x3fe58cb4

    goto/16 :goto_6

    :sswitch_b
    move/from16 v17, v14

    ushr-long v4, v2, v18

    xor-long/2addr v4, v2

    .line 190
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x27f5

    const v19, 0x54ee15a6

    xor-int v14, v14, v19

    const v19, -0x6bda4edf

    goto/16 :goto_6

    :sswitch_c
    move/from16 v17, v14

    .line 0
    iget-wide v2, v0, Ll/ܿۡۘ;->ܰ:J

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_a

    :goto_4
    const-string v1, "\u073f\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x675b

    const v19, 0x2f8924c8

    xor-int v14, v14, v19

    const v19, -0x29a73f8e

    goto :goto_6

    :cond_a
    const-string v1, "\u06df\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x3a29

    const v19, 0x1c550ac0

    xor-int v14, v14, v19

    const v19, -0x206c52d

    goto :goto_6

    :sswitch_d
    move/from16 v17, v14

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_b

    goto :goto_5

    :cond_b
    const-string v1, "\u06d7\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x43

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x136b

    const v19, -0x7a5ddbe1

    xor-int v14, v14, v19

    const v19, -0x42e6238c

    goto :goto_6

    :sswitch_e
    move/from16 v17, v14

    const/16 v18, 0x20

    .line 157
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_c

    :goto_5
    const-string v1, "\u1a74\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x4edf

    const v19, 0x3701fc50

    xor-int v14, v14, v19

    const v19, 0x664e40f4

    goto :goto_6

    :cond_c
    const-string v1, "\u1a79\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x47

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, -0x4927

    const v19, -0x733321dc

    xor-int v14, v14, v19

    const v19, -0x7f652491

    :goto_6
    xor-int v1, v1, v19

    move/from16 v20, v17

    move/from16 v17, v1

    move v1, v14

    move/from16 v14, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d9c4bf2 -> :sswitch_7
        -0x72cd408b -> :sswitch_8
        -0x6f009d7b -> :sswitch_d
        -0x63244287 -> :sswitch_c
        -0x6089f8fd -> :sswitch_e
        -0x5f2ba375 -> :sswitch_3
        -0x57af590c -> :sswitch_e
        -0x45525d99 -> :sswitch_2
        -0x33b825d9 -> :sswitch_a
        -0x18ba96e4 -> :sswitch_b
        -0x15c9aaff -> :sswitch_5
        -0x1151fef5 -> :sswitch_0
        -0x871ca32 -> :sswitch_4
        0x7c6c9f4 -> :sswitch_8
        0x11cdd444 -> :sswitch_9
        0x12c60265 -> :sswitch_4
        0x1e67f3a6 -> :sswitch_9
        0x1f87f564 -> :sswitch_d
        0x2d6a692f -> :sswitch_0
        0x38d96b55 -> :sswitch_6
        0x3e2fcd23 -> :sswitch_2
        0x41f6064c -> :sswitch_1
        0x48655a9c -> :sswitch_6
        0x517d33fc -> :sswitch_c
        0x5f6b5657 -> :sswitch_7
        0x604554c1 -> :sswitch_3
        0x657a5888 -> :sswitch_a
        0x69163e39 -> :sswitch_5
        0x6a57c075 -> :sswitch_b
        0x71526067 -> :sswitch_1
    .end sparse-switch
.end method

.method public final length()J
    .locals 2

    .line 198
    iget-wide v0, p0, Ll/ܿۡۘ;->ܰ:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 32

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

    const v25, 0x2663cad1

    sget v26, Ll/֨᩹;->᩻ᩳ֨:I

    sget v27, Ll/ۧ;->֫۠ᩴ:I

    const-string v28, "\u06eb\u0730"

    invoke-static/range {v28 .. v28}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v28

    xor-int v28, v28, v26

    xor-int v1, v28, v27

    mul-int/lit16 v1, v1, -0xf1d

    const v30, -0x42572610

    xor-int v1, v1, v30

    const v30, -0x6201b4

    xor-int v28, v28, v30

    move-object/from16 v21, v6

    move-object/from16 v16, v12

    move-object/from16 v22, v17

    move-object/from16 v14, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v23

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    :goto_0
    xor-int v4, v25, v27

    mul-int/lit16 v4, v4, -0x257b

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v25, v28, v1

    sparse-switch v25, :sswitch_data_0

    move-object/from16 v28, v2

    move/from16 v1, v20

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    move-object/from16 v0, p0

    const/16 v2, 0x4f49

    const/16 v12, 0x4f49

    goto/16 :goto_a

    .line 172
    :sswitch_0
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v1, :cond_1

    :cond_0
    move-object/from16 v28, v2

    move/from16 v2, v18

    move/from16 v1, v20

    move-object/from16 v20, v22

    goto/16 :goto_10

    :cond_1
    const-string v1, "\u1a73\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, -0x61

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, 0x77ad

    const v28, 0x5eda3e7

    xor-int v4, v4, v28

    const v28, -0x543f2b2

    goto/16 :goto_6

    .line 175
    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v1

    if-gtz v1, :cond_0

    :cond_2
    move-object/from16 v28, v14

    goto/16 :goto_2

    .line 18
    :sswitch_2
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v1, :cond_2

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_5

    .line 80
    :sswitch_4
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    const/4 v0, 0x0

    return-object v0

    .line 198
    :sswitch_5
    sget-object v1, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v4, 0x12

    move-object/from16 v28, v14

    const/4 v14, 0x2

    invoke-static {v1, v4, v14, v12}, Ll/֡ܽ;->ۗܺۛ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :sswitch_6
    move-object/from16 v28, v14

    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_4

    :sswitch_7
    move-object/from16 v28, v14

    invoke-static {v8, v10}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-object v1, v3, v9

    invoke-static {v8, v1}, Ll/ۘۚ;->ۢܽۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v1, v11

    sub-int/2addr v1, v5

    if-eq v9, v1, :cond_3

    const-string v1, "\u1a75\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, 0x31

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x3e21

    const v14, 0x62186a76

    xor-int/2addr v4, v14

    const v14, -0x3f624204

    goto/16 :goto_3

    :cond_3
    :goto_1
    const-string v1, "\u1a7a\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x5a33

    const v14, 0x47ff7eaf

    xor-int/2addr v4, v14

    const v14, -0x2eb7946f

    goto/16 :goto_3

    :sswitch_8
    move-object/from16 v28, v14

    const/4 v1, 0x1

    invoke-static {v13, v7, v1, v12}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v10

    .line 196
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_4

    move-object/from16 v14, v28

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06d9\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, -0x189b

    const v14, -0x741235be

    xor-int/2addr v4, v14

    const v14, -0x1b1fba73

    goto/16 :goto_3

    :sswitch_9
    move-object/from16 v28, v14

    .line 198
    aget-object v1, v11, v9

    invoke-static {v8, v1}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v13, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v7, 0x11

    .line 8
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_5

    :goto_2
    const-string v1, "\u06db\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x1cb5

    const v14, 0x1d0aa63c

    xor-int/2addr v4, v14

    const v14, -0x4520312f

    goto/16 :goto_3

    :cond_5
    const-string v1, "\u1a78\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, 0x3f

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x4a87

    const v14, 0x278311f4

    xor-int/2addr v4, v14

    const v14, -0x57d740c1

    goto :goto_3

    .line 198
    :sswitch_a
    invoke-static {v2, v0, v6, v12}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_b
    move-object/from16 v28, v14

    sget-object v2, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v0, 0x10

    const/4 v6, 0x1

    .line 144
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v1

    if-gtz v1, :cond_6

    move/from16 v1, v20

    move-object/from16 v20, v22

    move-object/from16 v14, v28

    move-object/from16 v28, v2

    move/from16 v2, v18

    goto/16 :goto_10

    :cond_6
    const-string v1, "\u073f\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v27

    mul-int/lit8 v1, v1, -0x2f

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x7c15

    const v14, 0x1507c4a1

    xor-int/2addr v4, v14

    const v14, 0x65bd5374

    goto :goto_3

    :sswitch_c
    move-object/from16 v28, v14

    .line 198
    array-length v1, v11

    if-ge v9, v1, :cond_7

    const-string v1, "\u0733\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x1a0b

    const v14, 0x578622e3

    xor-int/2addr v4, v14

    const v14, -0x472fe6c9

    goto :goto_3

    :cond_7
    const-string v1, "\u0733\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, 0x55d7

    const v14, 0x3656aa73

    xor-int/2addr v4, v14

    const v14, 0x7f0e9dec

    :goto_3
    xor-int/2addr v1, v14

    move-object/from16 v14, v28

    move/from16 v28, v1

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v28, v14

    const/4 v1, 0x1

    invoke-static {v14, v15, v1, v12}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    const-class v4, Ll/ܿۡۘ;

    invoke-static {v4, v8, v1}, Ll/ᩳ֫ᩳ;->ۙ(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    move/from16 v9, v24

    :goto_4
    const-string v1, "\u1a7a\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v27, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x52f5

    const v28, -0x61f25734

    xor-int v4, v4, v28

    const v28, -0x7f3f3cfe

    goto :goto_6

    .line 198
    :sswitch_e
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v15, 0xf

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_8

    :goto_5
    const-string v1, "\u06d6\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v27, v1

    mul-int/lit8 v1, v1, -0x53

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x212d

    const v28, -0x57e28ab6

    xor-int v4, v4, v28

    const v28, -0x5f8b1d36

    goto :goto_6

    :cond_8
    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, 0x3d

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x4041

    const v28, 0x2e37266a

    xor-int v4, v4, v28

    const v28, -0x46ada375

    :goto_6
    xor-int v28, v1, v28

    goto/16 :goto_9

    :sswitch_f
    move/from16 v4, v24

    new-array v1, v4, [Ljava/lang/String;

    move/from16 v24, v0

    move-object v11, v1

    move-object/from16 v1, v23

    goto :goto_7

    :sswitch_10
    move/from16 v4, v24

    sget-object v1, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v11, 0xe

    move/from16 v24, v0

    const/4 v0, 0x1

    invoke-static {v1, v11, v0, v12}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-static {v1, v0}, Ll/֫;->ܳ᩻֨(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    :goto_7
    const-string v0, "\u1a79\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x23

    move-object/from16 v23, v1

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x17c9

    const v28, -0x574c934e

    xor-int v1, v1, v28

    const v28, 0x7b12f4c1

    xor-int v28, v0, v28

    goto/16 :goto_13

    :sswitch_11
    move/from16 v4, v24

    move/from16 v24, v0

    const/4 v0, 0x1

    const/16 v1, 0xd

    move-object/from16 v28, v2

    move-object/from16 v2, v22

    invoke-static {v2, v0, v1, v12}, Ll/֡ۚ;->ۖ᩶ܿ([SIII)Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "\u06da\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x277b

    const v22, -0x2fd2799d

    xor-int v1, v1, v22

    const v22, 0x1e9a30e7

    goto :goto_8

    :cond_9
    const-string v0, "\u1a77\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x76a1

    const v22, -0x4ca2044c

    xor-int v1, v1, v22

    const v22, 0x114c2878

    :goto_8
    xor-int v0, v0, v22

    move-object/from16 v22, v2

    goto/16 :goto_12

    :sswitch_12
    move-object/from16 v28, v2

    move/from16 v4, v24

    move/from16 v24, v0

    aput-object v21, v3, v5

    const/4 v0, 0x2

    aput-object v29, v3, v0

    sget-object v22, Ll/ܿۡۘ;->᩸᩸֨:[S

    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_a

    move/from16 v0, v18

    move/from16 v18, v20

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u073a\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x71b7

    const v2, -0x4862fb1c

    xor-int/2addr v1, v2

    const v2, 0x639f2268

    xor-int/2addr v0, v2

    goto/16 :goto_12

    :sswitch_13
    move-object/from16 v28, v2

    move-object/from16 v2, v22

    move/from16 v4, v24

    move/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/ܿۡۘ;->ۨ:Landroid/net/Uri;

    aput-object v1, v3, v4

    iget-object v1, v0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    sget-boolean v21, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v21, :cond_b

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    move/from16 v0, v18

    move/from16 v18, v20

    const/4 v5, 0x1

    goto/16 :goto_c

    :cond_b
    const-string v21, "\u1a79\u06da"

    invoke-static/range {v21 .. v21}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v26

    xor-int v5, v21, v27

    mul-int/lit16 v5, v5, -0x3baf

    const v30, -0x7a190f02

    xor-int v5, v5, v30

    const v30, 0xdede9ed

    xor-int v21, v21, v30

    move-object/from16 v22, v2

    move/from16 v0, v24

    move-object/from16 v2, v28

    move/from16 v24, v4

    move/from16 v28, v21

    move-object/from16 v21, v1

    move v1, v5

    const/4 v5, 0x1

    goto/16 :goto_0

    :sswitch_14
    move/from16 v24, v0

    move-object/from16 v28, v2

    move/from16 v1, v20

    move-object/from16 v2, v22

    move-object/from16 v0, p0

    new-array v3, v1, [Ljava/lang/Object;

    .line 40
    sget-boolean v20, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v20, :cond_c

    move-object/from16 v20, v2

    move/from16 v2, v18

    move/from16 v0, v24

    const/16 v24, 0x0

    goto/16 :goto_10

    :cond_c
    const-string v20, "\u06d8\u1a7b"

    invoke-static/range {v20 .. v20}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v27

    xor-int v4, v20, v26

    mul-int/lit16 v4, v4, -0x6c7d

    const v30, -0x108fb971

    xor-int v4, v4, v30

    const v30, 0x52e0f239

    xor-int v20, v20, v30

    move-object/from16 v22, v2

    move/from16 v0, v24

    move-object/from16 v2, v28

    const/16 v24, 0x0

    move/from16 v28, v20

    move/from16 v20, v1

    :goto_9
    move v1, v4

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v28, v2

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    move-object/from16 v0, p0

    .line 198
    iget-wide v1, v0, Ll/ܿۡۘ;->ܰ:J

    invoke-static {v1, v2}, Ll/ۗܺ;->᩻֡ۗ(J)Ljava/lang/Long;

    move-result-object v29

    .line 111
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v2

    if-nez v2, :cond_d

    move/from16 v2, v18

    move/from16 v0, v24

    const/4 v1, 0x3

    goto/16 :goto_f

    :cond_d
    const-string v2, "\u06e2\u06db"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    xor-int v1, v2, v27

    mul-int/lit16 v1, v1, -0x2c6f

    const v30, 0x5b36e1d1

    xor-int v1, v1, v30

    const v30, 0xe42a847

    xor-int v2, v2, v30

    move-object/from16 v22, v20

    move/from16 v0, v24

    const/16 v20, 0x3

    goto :goto_b

    :sswitch_16
    move-object/from16 v28, v2

    move/from16 v1, v20

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    move-object/from16 v0, p0

    const v2, 0xdf4d

    const v12, 0xdf4d

    :goto_a
    const-string v2, "\u073d\u06d9"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v27

    xor-int v0, v2, v26

    mul-int/lit16 v0, v0, -0x4233

    const v22, -0x40ecef9c

    xor-int v0, v0, v22

    const v22, -0x33e05c50    # -4.184851E7f

    xor-int v2, v2, v22

    move-object/from16 v22, v20

    move/from16 v20, v1

    move v1, v0

    move/from16 v0, v24

    :goto_b
    move/from16 v24, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    goto/16 :goto_e

    :sswitch_17
    move-object/from16 v28, v2

    move/from16 v1, v20

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    const v0, 0x74de304

    add-int v0, v19, v0

    move/from16 v2, v18

    move/from16 v18, v1

    mul-int/lit16 v1, v2, 0x567c

    sub-int/2addr v1, v0

    if-lez v1, :cond_e

    const-string v0, "\u1a77\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x5

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x891

    const v22, -0x41cef1a2

    xor-int v1, v1, v22

    const v22, -0x3ecb4282

    goto/16 :goto_11

    :cond_e
    const-string v0, "\u05a1\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x45

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x1939

    const v22, 0x7dffd7c2

    xor-int v1, v1, v22

    const v22, -0x7b623713

    goto/16 :goto_11

    :sswitch_18
    move-object/from16 v28, v2

    move/from16 v18, v20

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    aget-short v0, v16, v17

    mul-int v19, v0, v0

    .line 150
    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_f

    move-object/from16 v22, v20

    :goto_c
    const-string v1, "\u1a75\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v27, v1

    mul-int/lit8 v1, v1, -0x3d

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x64b5

    const v20, -0x115b831d

    xor-int v2, v2, v20

    const v20, -0x6a4134db

    xor-int v1, v1, v20

    goto :goto_d

    :cond_f
    const-string v1, "\u05a1\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, -0x4fd

    const v22, -0x7318bcb1

    xor-int v2, v2, v22

    const v22, -0x6ef61c39

    xor-int v1, v1, v22

    move-object/from16 v22, v20

    :goto_d
    move/from16 v20, v18

    move/from16 v18, v0

    move/from16 v0, v24

    move/from16 v24, v4

    move-object/from16 v31, v28

    move/from16 v28, v1

    move v1, v2

    :goto_e
    move-object/from16 v2, v31

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v28, v2

    move/from16 v2, v18

    move/from16 v18, v20

    move-object/from16 v20, v22

    move/from16 v4, v24

    move/from16 v24, v0

    sget-object v16, Ll/ܿۡۘ;->᩸᩸֨:[S

    const/16 v17, 0x0

    .line 2
    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_10

    move/from16 v1, v18

    move/from16 v0, v24

    :goto_f
    move/from16 v24, v4

    :goto_10
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v26

    mul-int/lit8 v4, v4, -0x71

    move/from16 v18, v0

    xor-int v0, v4, v27

    mul-int/lit16 v0, v0, -0x70cf

    const v22, 0x843463f

    xor-int v0, v0, v22

    const v22, 0x7fb78b6d

    xor-int v4, v4, v22

    move-object/from16 v22, v20

    move/from16 v20, v1

    move v1, v0

    move/from16 v0, v18

    move/from16 v18, v2

    move-object/from16 v2, v28

    move/from16 v28, v4

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u073a\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x79

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x3f5

    const v22, -0x17a50d9b

    xor-int v1, v1, v22

    const v22, 0x2b6f8b09

    :goto_11
    xor-int v0, v0, v22

    move-object/from16 v22, v20

    move/from16 v20, v18

    move/from16 v18, v2

    :goto_12
    move-object/from16 v2, v28

    move/from16 v28, v0

    :goto_13
    move/from16 v0, v24

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b16dcf0 -> :sswitch_2
        -0x77a98b51 -> :sswitch_a
        -0x6f5347a0 -> :sswitch_8
        -0x69149a30 -> :sswitch_3
        -0x662f7e0a -> :sswitch_e
        -0x602d9d71 -> :sswitch_0
        -0x5d43dab3 -> :sswitch_14
        -0x51b410d4 -> :sswitch_10
        -0x4e4119ac -> :sswitch_16
        -0x4e246e5e -> :sswitch_4
        -0x4579f8e7 -> :sswitch_2
        -0x39d6bba1 -> :sswitch_17
        -0x35e8c576 -> :sswitch_1
        -0x35a3ddd8 -> :sswitch_12
        -0x2b77e9ec -> :sswitch_19
        -0x217cb75f -> :sswitch_15
        -0x16d5da27 -> :sswitch_0
        -0x121b1f0f -> :sswitch_13
        -0x5a1eed3 -> :sswitch_6
        -0x29f4fc6 -> :sswitch_d
        -0x10faaf0 -> :sswitch_a
        -0x2fdea0 -> :sswitch_5
        0x5dbe89c -> :sswitch_3
        0x7d4033c -> :sswitch_9
        0xd2bfdcf -> :sswitch_c
        0x1870fab4 -> :sswitch_16
        0x1e481622 -> :sswitch_e
        0x25574183 -> :sswitch_14
        0x26fbe791 -> :sswitch_12
        0x27e92ab2 -> :sswitch_c
        0x2cc6e53f -> :sswitch_5
        0x2e0daacf -> :sswitch_17
        0x32a0fb7c -> :sswitch_8
        0x358fde48 -> :sswitch_f
        0x392d692f -> :sswitch_10
        0x4146e2a9 -> :sswitch_6
        0x4480e035 -> :sswitch_18
        0x488aedee -> :sswitch_11
        0x4bce2a4d -> :sswitch_9
        0x4c1179d9 -> :sswitch_4
        0x50c176dd -> :sswitch_19
        0x541b4e05 -> :sswitch_b
        0x56c7258f -> :sswitch_1
        0x5badb807 -> :sswitch_f
        0x5be46262 -> :sswitch_7
        0x6058aef6 -> :sswitch_d
        0x6d78f458 -> :sswitch_b
        0x6ff1f73a -> :sswitch_7
        0x70dfad9f -> :sswitch_11
        0x731bb8e7 -> :sswitch_15
        0x7581d961 -> :sswitch_13
        0x76136087 -> :sswitch_18
    .end sparse-switch
.end method

.method public final ۙ()Ljava/io/InputStream;
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ܿۡۘ;->ۙ:Ljava/io/InputStream;

    return-object v0
.end method
