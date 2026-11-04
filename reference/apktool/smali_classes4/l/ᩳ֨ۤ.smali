.class public final synthetic Ll/ᩳ֨ۤ;
.super Ljava/lang/Object;
.source "44W5"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۠ᩳܳ:[S


# instance fields
.field public final synthetic ֡:Ll/᩸ۤۛ;

.field public final synthetic ۟:Ll/ۚۢۨ;

.field public final synthetic ܰ:Ll/֨֨ۤ;

.field public final synthetic ܿ:Ljava/lang/ThreadLocal;

.field public final synthetic ᩳ:Ll/᩻ܽܺ;

.field public final synthetic ᩶:Ll/ۗۧܺ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ֨ۤ;->۠ᩳܳ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x288s
        -0x3735s
        -0x376as
        -0x3778s
        -0x377cs
        -0x3777s
        -0x3774s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/֨֨ۤ;Ll/ۗۧܺ;Ljava/lang/ThreadLocal;Ll/᩸ۤۛ;Ll/ۚۢۨ;Ll/᩻ܽܺ;)V
    .locals 6

    const v0, -0x4427db18

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e3f

    const v5, 0xdc09bba

    xor-int/2addr v4, v5

    const v5, -0x171d3c1f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7b19

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_4

    :sswitch_0
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_6

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u05a1\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d1b

    const v5, 0x16358aab

    xor-int/2addr v4, v5

    const v5, -0x6a73c3bc

    goto :goto_0

    .line 0
    :sswitch_2
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_9

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput-object p4, p0, Ll/ᩳ֨ۤ;->֡:Ll/᩸ۤۛ;

    iput-object p5, p0, Ll/ᩳ֨ۤ;->۟:Ll/ۚۢۨ;

    iput-object p6, p0, Ll/ᩳ֨ۤ;->ᩳ:Ll/᩻ܽܺ;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/ᩳ֨ۤ;->ܿ:Ljava/lang/ThreadLocal;

    .line 1
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6141

    const v5, 0x2e087556

    xor-int/2addr v4, v5

    const v5, 0x4b6dc1c7    # 1.5581639E7f

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06df\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6785

    const v5, -0x41d5336e

    xor-int/2addr v4, v5

    const v5, 0x74fcc26f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d31

    const v5, 0x13869cc6

    xor-int/2addr v4, v5

    const v5, -0x252499b1

    goto/16 :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u05a8\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a97

    const v5, -0x3af0d84f

    xor-int/2addr v4, v5

    const v5, -0x4265709c

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3241

    const v5, 0x120ee296

    xor-int/2addr v4, v5

    const v5, 0x311064a0

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x287d

    const v5, 0x136b0943

    xor-int/2addr v4, v5

    const v5, -0x1961fe33

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x119b

    const v5, -0x3a85ca76

    xor-int/2addr v4, v5

    const v5, -0x382345e7

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d9\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6dcb

    const v5, 0x5936a768

    xor-int/2addr v4, v5

    const v5, -0x232588e0

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u1a77\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76cd

    const v5, 0x7ce06de2

    xor-int/2addr v4, v5

    const v5, -0xebc2ecf

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d8f

    const v5, 0xe79a959

    xor-int/2addr v4, v5

    const v5, -0x6ecf4bb6

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_b

    :goto_3
    const-string v3, "\u073d\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x53bd

    const v5, -0x465ca9f7

    xor-int/2addr v4, v5

    const v5, 0x2557bc34

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x68b3

    const v5, -0xcf375e8

    xor-int/2addr v4, v5

    const v5, -0x9fcba0e

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩳ֨ۤ;->ܰ:Ll/֨֨ۤ;

    iput-object p2, p0, Ll/ᩳ֨ۤ;->᩶:Ll/ۗۧܺ;

    .line 4
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1f51

    const v5, -0x2d6b27f4

    xor-int/2addr v4, v5

    const v5, -0x5602f478

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x385f

    const v5, -0x5214d157

    xor-int/2addr v4, v5

    const v5, -0x158f3c31

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79840429 -> :sswitch_d
        -0x78efc910 -> :sswitch_7
        -0x68c776bd -> :sswitch_c
        -0x6864ce96 -> :sswitch_2
        -0x672449bc -> :sswitch_e
        -0x594c23f0 -> :sswitch_5
        -0x553e3a13 -> :sswitch_2
        -0x38a9effe -> :sswitch_b
        -0x33be656a -> :sswitch_e
        -0x2f35e7cd -> :sswitch_4
        -0x20a0c019 -> :sswitch_d
        -0x1766e718 -> :sswitch_9
        -0x143811ed -> :sswitch_3
        -0xeefded1 -> :sswitch_a
        -0xeb91217 -> :sswitch_8
        -0xe531312 -> :sswitch_c
        -0xc63cbf0 -> :sswitch_a
        -0x88e34e7 -> :sswitch_7
        -0x1841d1f -> :sswitch_6
        0x9e32b38 -> :sswitch_6
        0x15b0e0da -> :sswitch_8
        0x16dc0456 -> :sswitch_0
        0x21e4b2f8 -> :sswitch_b
        0x2a24f2ba -> :sswitch_4
        0x312feef1 -> :sswitch_3
        0x505fa6ad -> :sswitch_5
        0x51b3106e -> :sswitch_9
        0x57a854bb -> :sswitch_1
        0x6895a09f -> :sswitch_1
        0x6ede8eb6 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Ll/ᩳ֨ۤ;->۠ᩳܳ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    add-int/lit16 v1, v0, 0x1e6a

    mul-int v1, v1, v1

    mul-int/lit16 v0, v0, 0x79a8

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    const v0, 0xc8e5

    goto :goto_0

    :cond_0
    const v0, 0xd2da

    .line 2
    :goto_0
    iget-object v1, p0, Ll/ᩳ֨ۤ;->ܰ:Ll/֨֨ۤ;

    .line 4
    iget-object v2, p0, Ll/ᩳ֨ۤ;->᩶:Ll/ۗۧܺ;

    .line 6
    iget-object v3, p0, Ll/ᩳ֨ۤ;->ܿ:Ljava/lang/ThreadLocal;

    .line 8
    iget-object v4, p0, Ll/ᩳ֨ۤ;->֡:Ll/᩸ۤۛ;

    .line 10
    iget-object v5, p0, Ll/ᩳ֨ۤ;->۟:Ll/ۚۢۨ;

    .line 12
    iget-object v6, p0, Ll/ᩳ֨ۤ;->ᩳ:Ll/᩻ܽܺ;

    .line 189
    iget-object v7, v1, Ll/֨֨ۤ;->ܳ:Ljava/lang/Exception;

    if-nez v7, :cond_2

    iget-object v7, v1, Ll/֨֨ۤ;->ۚ:Ll/ۤ۠ᩴ;

    invoke-static {v7}, Ll/֨᩻;->ܺܺۤ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    .line 41
    invoke-static {v2, v7}, Ll/ܽ;->ܳ᩻۬(Ljava/lang/Object;I)Z

    .line 194
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ۟᩹;

    invoke-static {v2}, Ll/֨ܿ;->ۜۜ᩸(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-virtual {v2}, Ll/ۢ۟᩹;->ۙ()V

    .line 196
    new-instance v3, Ll/۟ܽۤ;

    invoke-direct {v3, v2}, Ll/۟ܽۤ;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v3, v4, v5}, Ll/۫ۢۨ;->ۙ(Ljava/io/Writer;Ll/ۢ۫ۛ;Ll/ۚۢۨ;)V

    .line 197
    invoke-static {v4}, Ll/᩶;->ᩴۜ۫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 198
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v5

    sub-int/2addr v5, v7

    invoke-static {v3, v7, v5}, Ll/֡ۖ;->ܳ᩶᩷(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ll/ᩳ֨ۤ;->۠ᩳܳ:[S

    const/4 v5, 0x1

    const/4 v7, 0x6

    invoke-static {v3, v5, v7, v0}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/ۘ֡;->ۗۚۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    .line 199
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 200
    :try_start_1
    invoke-static {v6, v3}, Ll/֫۠;->᩹ᩳ᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    iget-object v3, v2, Ll/ۢ۟᩹;->ܰ:[B

    iget v2, v2, Ll/ۢ۟᩹;->᩶:I

    const/4 v4, 0x0

    invoke-virtual {v6, v3, v4, v2}, Ll/᩻ܽܺ;->write([BII)V

    .line 202
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

    .line 206
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object v2, v1, Ll/֨֨ۤ;->ܳ:Ljava/lang/Exception;

    goto :goto_1

    :catch_0
    move-exception v0

    .line 204
    iput-object v0, v1, Ll/֨֨ۤ;->ܳ:Ljava/lang/Exception;

    :cond_2
    :goto_1
    return-void
.end method
