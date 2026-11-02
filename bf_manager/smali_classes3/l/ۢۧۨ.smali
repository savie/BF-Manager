.class public final synthetic Ll/ۢۧۨ;
.super Ljava/lang/Object;
.source "44W5"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۢۘ֫:[S


# instance fields
.field public final synthetic ֡:Ljava/lang/ThreadLocal;

.field public final synthetic ۫:Ll/᩶᩷᩵;

.field public final synthetic ܺ:Ll/ۙ᩻ۨ;

.field public final synthetic ܽ:Ll/۟᩻᩵;

.field public final synthetic ܿ:Ll/᩺ۢ᩺;

.field public final synthetic ᩶:Ll/۠᩻᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۢۧۨ;->ۢۘ֫:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x194es
        -0x55b0s
        -0x55f3s
        -0x55eds
        -0x55e1s
        -0x55ees
        -0x55e9s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ۙ᩻ۨ;Ll/۠᩻᩺;Ljava/lang/ThreadLocal;Ll/۟᩻᩵;Ll/᩶᩷᩵;Ll/᩺ۢ᩺;)V
    .locals 6

    const v0, -0x7ce265ec

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d6\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x383b

    const v5, 0x4db1ba83    # 3.727238E8f

    xor-int/2addr v4, v5

    const v5, -0x61957716

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x68a5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v3, :cond_a

    goto :goto_1

    :cond_0
    const-string v3, "\u06df\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6f7b

    const v5, 0x1d423790

    xor-int/2addr v4, v5

    const v5, -0x725f0504

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_1

    .line 4
    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p4, p0, Ll/ۢۧۨ;->ܽ:Ll/۟᩻᩵;

    iput-object p5, p0, Ll/ۢۧۨ;->۫:Ll/᩶᩷᩵;

    iput-object p6, p0, Ll/ۢۧۨ;->ܿ:Ll/᩺ۢ᩺;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/ۢۧۨ;->֡:Ljava/lang/ThreadLocal;

    .line 2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u05a8\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30a9

    const v5, -0x11210cd4

    xor-int/2addr v4, v5

    const v5, 0x2550809f

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_2

    :goto_1
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x586f

    const v5, 0x34a8185f

    xor-int/2addr v4, v5

    const v5, -0x7fa8a97

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u0736\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4303

    const v5, 0xebb4087

    xor-int/2addr v4, v5

    const v5, -0x1862646

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e0\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1721

    const v5, 0x1e92f7a

    xor-int/2addr v4, v5

    const v5, -0x673eb35a

    goto/16 :goto_0

    .line 2
    :sswitch_8
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xcd5

    const v5, 0x1807746d

    xor-int/2addr v4, v5

    const v5, 0x58ac6a0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x16ed

    const v5, -0x4677a9e9

    xor-int/2addr v4, v5

    const v5, 0x4d69c2c1    # 2.4511592E8f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xceb

    const v5, 0x1c0480a1

    xor-int/2addr v4, v5

    const v5, 0xc4a529f

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5971

    const v5, -0x1590fcd7

    xor-int/2addr v4, v5

    const v5, 0x51ab9b63

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d23

    const v5, 0x76bb9dfc

    xor-int/2addr v4, v5

    const v5, 0x5b93068f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c71

    const v5, -0x6f63cb02

    xor-int/2addr v4, v5

    const v5, 0x4b963612    # 1.9688484E7f

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a78\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c75

    const v5, 0x51bed449

    xor-int/2addr v4, v5

    const v5, -0x1f598f31

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2c61

    const v5, -0x3d5f32b9

    xor-int/2addr v4, v5

    const v5, -0x74aa38a1

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۢۧۨ;->ܺ:Ll/ۙ᩻ۨ;

    iput-object p2, p0, Ll/ۢۧۨ;->᩶:Ll/۠᩻᩺;

    .line 1
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u1a7a\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7af5

    const v5, 0x6118012b

    xor-int/2addr v4, v5

    const v5, 0x63c3bab5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f25

    const v5, -0x6627a42

    xor-int/2addr v4, v5

    const v5, -0x74b5f749

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b1a48c5 -> :sswitch_7
        -0x7971f8f2 -> :sswitch_8
        -0x770e6d50 -> :sswitch_0
        -0x7464a1b3 -> :sswitch_6
        -0x5f147601 -> :sswitch_1
        -0x5b5096a4 -> :sswitch_8
        -0x549e8976 -> :sswitch_2
        -0x4f480531 -> :sswitch_7
        -0x49dbb0f5 -> :sswitch_5
        -0x4565ac0f -> :sswitch_a
        -0x42405e43 -> :sswitch_6
        -0x35930ce2 -> :sswitch_c
        -0x186a0da9 -> :sswitch_d
        0x75ad37c -> :sswitch_3
        0xf929cff -> :sswitch_9
        0x1334836c -> :sswitch_3
        0x15483017 -> :sswitch_5
        0x2407c320 -> :sswitch_4
        0x24c071cd -> :sswitch_c
        0x26570bee -> :sswitch_4
        0x297dd48f -> :sswitch_9
        0x2ee1a409 -> :sswitch_1
        0x34cde87b -> :sswitch_e
        0x376e3f91 -> :sswitch_b
        0x4e0519e0 -> :sswitch_a
        0x5fe355f0 -> :sswitch_0
        0x607bc09b -> :sswitch_d
        0x6ee8f882 -> :sswitch_b
        0x755b4184 -> :sswitch_e
        0x7eee7f94 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Ll/ۢۧۨ;->ۢۘ֫:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    add-int/lit16 v1, v0, 0x48a4

    mul-int v1, v1, v1

    mul-int v0, v0, v0

    const v2, 0x149ca910

    add-int/2addr v0, v2

    add-int/2addr v0, v0

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const v0, 0xaa7e

    goto :goto_0

    :cond_0
    const/16 v0, 0x241e

    .line 2
    :goto_0
    iget-object v1, p0, Ll/ۢۧۨ;->ܺ:Ll/ۙ᩻ۨ;

    .line 4
    iget-object v2, p0, Ll/ۢۧۨ;->᩶:Ll/۠᩻᩺;

    .line 6
    iget-object v3, p0, Ll/ۢۧۨ;->֡:Ljava/lang/ThreadLocal;

    .line 8
    iget-object v4, p0, Ll/ۢۧۨ;->ܽ:Ll/۟᩻᩵;

    .line 10
    iget-object v5, p0, Ll/ۢۧۨ;->۫:Ll/᩶᩷᩵;

    .line 12
    iget-object v6, p0, Ll/ۢۧۨ;->ܿ:Ll/᩺ۢ᩺;

    .line 188
    iget-object v7, v1, Ll/ۙ᩻ۨ;->᩹:Ljava/lang/Exception;

    if-nez v7, :cond_2

    iget-object v7, v1, Ll/ۙ᩻ۨ;->۬:Ll/֫ۧۚ;

    invoke-static {v7}, Ll/֨۟;->᩻ۛ֨(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    .line 41
    invoke-static {v2, v7}, Ll/ۗᩳ;->ۖܿᩳ(Ljava/lang/Object;I)Z

    .line 193
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ܶᩴ;

    invoke-static {v2}, Ll/ۗܳ;->֫ܽۢ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    invoke-virtual {v2}, Ll/᩵ܶᩴ;->ۙ()V

    .line 195
    new-instance v3, Ll/ۢ᩸ۨ;

    invoke-direct {v3, v2}, Ll/ۢ᩸ۨ;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v3, v4, v5}, Ll/ܺ᩷᩵;->ۙ(Ljava/io/Writer;Ll/᩺ۙۡ;Ll/᩶᩷᩵;)V

    .line 196
    invoke-static {v4}, Ll/֫۟;->ܽܿۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 197
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int/2addr v5, v7

    invoke-static {v3, v7, v5}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ll/ۖ᩸;->᩻᩸ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ll/ۢۧۨ;->ۢۘ֫:[S

    const/4 v5, 0x1

    const/4 v7, 0x6

    invoke-static {v3, v5, v7, v0}, Ll/ۖܽ;->᩸ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֨ܰ;->ۜܳۜ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    .line 198
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 199
    :try_start_1
    invoke-static {v6, v3}, Ll/ۘۗ;->ۖۛ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    iget-object v3, v2, Ll/᩵ܶᩴ;->ܺ:[B

    iget v2, v2, Ll/᩵ܶᩴ;->᩶:I

    const/4 v4, 0x0

    invoke-virtual {v6, v3, v4, v2}, Ll/᩺ۢ᩺;->write([BII)V

    .line 201
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 205
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object v2, v1, Ll/ۙ᩻ۨ;->᩹:Ljava/lang/Exception;

    goto :goto_1

    :catch_0
    move-exception v0

    .line 203
    iput-object v0, v1, Ll/ۙ᩻ۨ;->᩹:Ljava/lang/Exception;

    :cond_2
    :goto_1
    return-void
.end method
