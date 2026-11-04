.class public Ll/᩵ܿ֫;
.super Landroid/app/Service;
.source "F5X0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static ۟:Ljava/lang/String; = null

.field public static ۢ:Ljava/lang/String; = ""

.field public static ᩳ:Ll/᩶ۤۤ;

.field private static final ᩳ᩷᩷:[S


# instance fields
.field public final ֡:Landroid/content/BroadcastReceiver;

.field public ܰ:Ll/᩶ۤۤ;

.field public ܿ:Ll/᩵ܿ᩻;

.field public ᩶:Ll/ۗܿ֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    return-void

    :array_0
    .array-data 2
        0x5a6s
        0x54abs
        0x54b8s
        0x54b9s
        0x54a9s
        -0x2447s
        0x32as
        0x3d83s
        0x3223s
        -0x3070s
        0x2664s
        0x548bs
        0x5489s
        0x549es
        0x5483s
        0x5485s
        0x5484s
        0x5495s
        0x5487s
        0x549es
        0x5495s
        0x5489s
        0x5486s
        0x5485s
        0x5499s
        0x548fs
        0x5495s
        0x5498s
        0x548fs
        0x5499s
        0x5485s
        0x549fs
        0x5498s
        0x5489s
        0x548fs
        0x5495s
        0x549bs
        0x549fs
        0x548fs
        0x5498s
        0x5483s
        0x548fs
        0x5498s
        0x11e2s
        0x1d10s
        0x1d17s
        0x1d10s
        0x1d0ds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x58c2a7d5

    sget v2, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    .line 20
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v4, "\u0736\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x57c3

    const v6, -0x391d7001    # -28999.998f

    xor-int/2addr v5, v6

    const v6, -0x567cc3cb

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x6e05

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 29
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_4

    goto/16 :goto_1

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_7

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u1a79\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6309

    const v6, -0x3709d3f4

    xor-int/2addr v5, v6

    const v6, -0x25749efa

    goto :goto_0

    .line 38
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    .line 116
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_3

    .line 78
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 120
    :sswitch_5
    iput-object v0, p0, Ll/᩵ܿ֫;->֡:Landroid/content/BroadcastReceiver;

    return-void

    :sswitch_6
    sget-boolean v4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u0733\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5a1d

    const v6, 0x5db0c82a

    xor-int/2addr v5, v6

    const v6, -0x6588caa7

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06eb\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x813

    const v6, 0x55293855

    xor-int/2addr v5, v6

    const v6, -0x5b06da03

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string v4, "\u06d9\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v3

    mul-int/lit8 v5, v5, -0x41

    const v6, -0x4e0c7f35

    xor-int/2addr v5, v6

    const v6, -0x9e08da0

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u073d\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x305b

    const v6, 0x686dd737

    xor-int/2addr v5, v6

    const v6, -0x5c2655e8

    goto/16 :goto_0

    .line 36
    :sswitch_8
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0736\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x292b

    const v6, 0x663b1bff

    xor-int/2addr v5, v6

    const v6, 0x36a111e0

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06db\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x34df

    const v6, 0x5d04051e

    xor-int/2addr v5, v6

    const v6, 0x7d4501ee

    goto/16 :goto_0

    .line 78
    :sswitch_a
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u1a75\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x63d1

    const v6, 0xac8245f

    xor-int/2addr v5, v6

    const v6, 0x524191e9

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x67f

    const v6, 0x159852b3

    xor-int/2addr v5, v6

    const v6, 0x46515aaf

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4fad

    const v6, -0x7ed17cca

    xor-int/2addr v5, v6

    const v6, 0x6bbba512

    goto/16 :goto_0

    .line 71
    :sswitch_c
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u06da\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4ddb

    const v6, 0x78fe354b

    xor-int/2addr v5, v6

    const v6, 0x2e0b9426

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_b

    :goto_3
    const-string v4, "\u073f\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x51d1

    const v6, 0x4116ecf0

    xor-int/2addr v5, v6

    const v6, 0x5fa76d73

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7a\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xaa3

    const v6, -0x19fdb81c

    xor-int/2addr v5, v6

    const v6, 0x71174d88

    goto/16 :goto_0

    .line 120
    :sswitch_e
    new-instance v0, Ll/᩹ܿ֫;

    invoke-direct {v0, p0}, Ll/᩹ܿ֫;-><init>(Ll/᩵ܿ֫;)V

    .line 93
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u05a1\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x321d

    const v6, 0x33f8892a

    xor-int/2addr v5, v6

    const v6, 0xe3c2217

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a79\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3375

    const v6, 0x77e29528

    xor-int/2addr v5, v6

    const v6, 0x2248c171

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78bd5c84 -> :sswitch_7
        -0x75a9b8ad -> :sswitch_a
        -0x71d59383 -> :sswitch_3
        -0x583d8086 -> :sswitch_2
        -0x5671bc9e -> :sswitch_9
        -0x4f8456f3 -> :sswitch_4
        -0x385cb531 -> :sswitch_c
        -0x36146a68 -> :sswitch_8
        -0x3268523b -> :sswitch_d
        -0x2599ad06 -> :sswitch_4
        -0x1e9aab2e -> :sswitch_d
        -0x1cad4f8b -> :sswitch_2
        -0x1b0a683e -> :sswitch_1
        -0x1822d523 -> :sswitch_a
        -0x1703a0f4 -> :sswitch_e
        -0x16a2f191 -> :sswitch_5
        -0x141fee1d -> :sswitch_b
        0xec47cb6 -> :sswitch_7
        0xf23c4c0 -> :sswitch_3
        0x124ec59f -> :sswitch_6
        0x15183e4d -> :sswitch_b
        0x1f34e776 -> :sswitch_e
        0x209e3632 -> :sswitch_c
        0x221d51c6 -> :sswitch_5
        0x23cb6511 -> :sswitch_0
        0x467a3a12 -> :sswitch_6
        0x5545cd32 -> :sswitch_1
        0x62a94822 -> :sswitch_8
        0x68a01347 -> :sswitch_0
        0x7791b4cd -> :sswitch_9
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/᩵ܿ֫;)Ll/᩶ۤۤ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ܿ֫;->ܰ:Ll/᩶ۤۤ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩵ܿ֫;)Ll/᩵ܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    return-object p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 48
    iget-object p1, p0, Ll/᩵ܿ֫;->᩶:Ll/ۗܿ֫;

    return-object p1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x644c0145

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v5, "\u0730\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3dbb

    const v7, 0x76e058da

    xor-int/2addr v6, v7

    const v7, 0x78ab62e4

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x265f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    .line 38
    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_a

    goto/16 :goto_5

    :sswitch_1
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_8

    goto/16 :goto_5

    .line 19
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_d

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    return-void

    .line 114
    :sswitch_5
    sput-object p1, Ll/᩵ܿ֫;->ۢ:Ljava/lang/String;

    goto/16 :goto_2

    :sswitch_6
    const/16 v5, 0xd

    .line 113
    invoke-static {p1, v5}, Ll/ۖۗ;->᩺ۘ᩵(Ljava/lang/Object;I)I

    move-result v5

    if-ne v5, v1, :cond_3

    const-string v5, "\u0733\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x74b9

    const v8, -0x3014cdde

    xor-int/2addr v6, v8

    const v8, 0x6ade2093

    goto/16 :goto_7

    :sswitch_7
    const/16 v1, 0xa

    .line 112
    invoke-static {p1, v1}, Ll/ۧ;->᩹ۙۨ(Ljava/lang/Object;I)I

    move-result v1

    const/4 v5, -0x1

    if-ne v1, v5, :cond_0

    const-string v1, "\u1a74\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v6, v1, v3

    mul-int/lit16 v6, v6, 0x4a15

    const v8, 0x530faa76

    xor-int/2addr v6, v8

    const v8, 0xe019392

    xor-int/2addr v1, v8

    move v5, v1

    const/4 v1, -0x1

    goto :goto_1

    :cond_0
    const/4 v1, -0x1

    goto :goto_2

    .line 111
    :sswitch_8
    invoke-static {p1}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v5

    const/16 v6, 0x64

    if-ge v5, v6, :cond_3

    const-string v5, "\u0730\u06e7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x629d

    const v8, -0x141556bc

    xor-int/2addr v6, v8

    const v8, -0x55490002

    goto/16 :goto_7

    :sswitch_9
    const/high16 p1, 0x10000000

    .line 116
    invoke-static {v7, p1}, Ll/֡ۖ;->ۙۖ۟(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 117
    invoke-static {p0, v7}, Ll/ۖ᩵;->᩶ᩳۚ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 115
    :sswitch_a
    new-instance v7, Landroid/content/Intent;

    const-class v5, Ll/ۨܿ֫;

    .line 89
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_6

    .line 115
    :cond_1
    invoke-direct {v7, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_2

    goto :goto_3

    :cond_2
    const-string v5, "\u06df\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x59d7

    const v8, 0x398105c5

    xor-int/2addr v6, v8

    const v8, -0x5d299296

    goto/16 :goto_7

    .line 110
    :sswitch_b
    invoke-static {}, Ll/ܽ֡֫;->ۙۙ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v5, "\u06db\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7b35

    const v8, -0x70f8e22c

    xor-int/2addr v6, v8

    const v8, 0x2715a151

    goto/16 :goto_7

    :cond_3
    :goto_2
    const-string v5, "\u1a75\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xf85

    const v8, 0xf53d978

    xor-int/2addr v6, v8

    const v8, -0x5bbcad35

    goto/16 :goto_7

    :cond_4
    const-string v5, "\u06d7\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5049

    const v8, 0x6e7d0b22

    xor-int/2addr v6, v8

    const v8, 0x22003b18

    goto/16 :goto_7

    .line 58
    :sswitch_c
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_5

    :goto_3
    const-string v5, "\u1a74\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x64f

    const v8, 0x484b3acd

    xor-int/2addr v6, v8

    const v8, -0x15a4ff0b

    goto/16 :goto_7

    :cond_5
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7dd9

    const v8, -0x2a99b7dd

    xor-int/2addr v6, v8

    const v8, -0xf26d0f1

    goto/16 :goto_7

    :sswitch_d
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u05a8\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4461

    const v8, -0x73682319

    xor-int/2addr v6, v8

    const v8, 0x15a7838a

    goto/16 :goto_7

    :sswitch_e
    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u1a74\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x13ef

    const v8, -0x3111f18b

    xor-int/2addr v6, v8

    const v8, 0x7ce7152c    # 9.5988E36f

    goto/16 :goto_7

    :sswitch_f
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u0730\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x261f

    const v8, -0x3c4ed27a

    xor-int/2addr v6, v8

    const v8, 0x34381099

    goto/16 :goto_7

    :cond_9
    const-string v5, "\u06d9\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xfeb

    const v8, 0x5fa13c3

    xor-int/2addr v6, v8

    const v8, -0x5e3f2cb7

    goto/16 :goto_7

    .line 18
    :sswitch_10
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    const-string v5, "\u05a1\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1ed1

    const v8, -0x2e148bc0

    xor-int/2addr v6, v8

    const v8, -0x73653141

    goto :goto_7

    :cond_b
    const-string v5, "\u1a79\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x33cf

    const v8, 0x2f9054db

    xor-int/2addr v6, v8

    const v8, 0x13935fc9

    goto :goto_7

    :sswitch_11
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_c

    :goto_5
    const-string v5, "\u073f\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x334b

    const v8, -0x3b2bae11

    xor-int/2addr v6, v8

    const v8, 0x1a43957d

    goto :goto_7

    :cond_c
    const-string v5, "\u1a7a\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x735

    const v8, 0x45c2332c

    xor-int/2addr v6, v8

    const v8, -0x6a1b40f0

    goto :goto_7

    .line 58
    :sswitch_12
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v5

    if-eqz v5, :cond_e

    :cond_d
    :goto_6
    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x103

    const v7, -0x143010cc

    xor-int/2addr v6, v7

    const v7, -0x139fb6e5

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u0733\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x29f3

    const v8, 0x389b8a97

    xor-int/2addr v6, v8

    const v8, 0x102f5a34

    :goto_7
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a801f24 -> :sswitch_a
        -0x79fe2fad -> :sswitch_8
        -0x6d4a5732 -> :sswitch_0
        -0x57c63b35 -> :sswitch_1
        -0x4ebbc45c -> :sswitch_10
        -0x44274200 -> :sswitch_4
        -0x40f59a29 -> :sswitch_11
        -0x3f50c29f -> :sswitch_9
        -0x3a06bdbd -> :sswitch_7
        -0x39feeda3 -> :sswitch_5
        -0x392de5f1 -> :sswitch_7
        -0x33607779 -> :sswitch_f
        -0x2d9073dc -> :sswitch_e
        -0x2702539b -> :sswitch_2
        -0x2210a11b -> :sswitch_1
        -0x1ba39f3e -> :sswitch_5
        -0x9d08414 -> :sswitch_d
        0x3b6c51f -> :sswitch_8
        0x10723cf9 -> :sswitch_9
        0x160ec62b -> :sswitch_c
        0x185debdf -> :sswitch_a
        0x20f97dd9 -> :sswitch_12
        0x21146822 -> :sswitch_6
        0x2aa11664 -> :sswitch_6
        0x369507df -> :sswitch_b
        0x3980eeec -> :sswitch_c
        0x3ee0cdea -> :sswitch_4
        0x4561dd96 -> :sswitch_3
        0x4bc29ec4 -> :sswitch_f
        0x5b796edf -> :sswitch_d
        0x5beb00f6 -> :sswitch_0
        0x7398c44d -> :sswitch_e
        0x73a38ed4 -> :sswitch_2
        0x74de892e -> :sswitch_10
        0x7a521b7f -> :sswitch_b
        0x7cc220c2 -> :sswitch_11
        0x7e4f5fcb -> :sswitch_12
        0x7ece80e7 -> :sswitch_3
    .end sparse-switch
.end method

.method public final onCreate()V
    .locals 22

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, -0xb8d342b

    sget v15, Ll/ۖ֨;->֨ۨۧ:I

    sget v16, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v17, "\u06eb\u06db"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v16

    mul-int/lit8 v17, v17, 0x4b

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x752f

    const v19, 0x587ef4f1

    xor-int v1, v1, v19

    const v19, 0x60b1954f

    xor-int v17, v17, v19

    move-object v3, v2

    move-object v10, v9

    move-object v13, v12

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, -0xb8d342b

    const/16 v20, 0x0

    :goto_0
    xor-int v7, v17, v15

    mul-int/lit16 v7, v7, -0x266b

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v1, v7

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    move/from16 v18, v6

    .line 34
    invoke-static {v10, v11, v12, v9}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Ll/᩵ܿ᩻;->ۙ(Landroid/content/Context;Ljava/lang/String;)Ll/᩵ܿ᩻;

    move-result-object v2

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget-object v13, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    const/4 v14, 0x5

    .line 45
    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_8

    goto/16 :goto_5

    :sswitch_0
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    move/from16 v18, v6

    goto/16 :goto_5

    .line 56
    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move/from16 v18, v6

    goto/16 :goto_9

    :cond_2
    :goto_1
    const-string v1, "\u1a74\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x3e25

    const v18, -0x2bb0ee43

    xor-int v7, v7, v18

    const v18, -0x1bdad268

    goto/16 :goto_3

    .line 94
    :sswitch_2
    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_1

    :goto_2
    move/from16 v18, v6

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto :goto_2

    .line 41
    :sswitch_4
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    return-void

    :sswitch_5
    iget-object v1, v0, Ll/᩵ܿ֫;->֡:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v4}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 42
    new-instance v1, Ll/ۗܿ֫;

    invoke-direct {v1, v0}, Ll/ۗܿ֫;-><init>(Ll/᩵ܿ֫;)V

    iput-object v1, v0, Ll/᩵ܿ֫;->᩶:Ll/ۗܿ֫;

    return-void

    :sswitch_6
    const v1, 0x7e9f9391

    xor-int/2addr v1, v6

    .line 39
    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 41
    new-instance v4, Landroid/content/IntentFilter;

    .line 38
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_6

    .line 41
    :cond_3
    sget-object v1, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    const/16 v7, 0xb

    move/from16 v18, v6

    const/16 v6, 0x20

    invoke-static {v1, v7, v6, v9}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 45
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v1

    if-ltz v1, :cond_4

    goto/16 :goto_9

    :cond_4
    const-string v1, "\u06eb\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, 0x3fe5

    const v7, -0x376a5805

    xor-int/2addr v6, v7

    const v7, -0x6afd4fbf

    goto/16 :goto_a

    .line 38
    :sswitch_7
    iput-object v2, v0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    sget-object v1, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    const/16 v6, 0x8

    const/4 v7, 0x3

    invoke-static {v1, v6, v7, v9}, Ll/֡᩵;->ܽۛܰ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u1a76\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7b

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x72cd

    const v18, 0x3a27de80

    xor-int v7, v7, v18

    const v18, -0x16b8a281

    :goto_3
    xor-int v18, v1, v18

    move v1, v7

    goto/16 :goto_0

    :sswitch_8
    move/from16 v18, v6

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-static {v3, v5, v1}, Ll/᩻۠᩷;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻۠᩷;

    move-result-object v1

    .line 100
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 105
    invoke-static {v2, v0}, Ll/ۧ;->֫۠᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_6

    :goto_4
    move/from16 v6, v18

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06e8\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x77

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x10b5

    const v7, -0x3f5b7031

    xor-int/2addr v6, v7

    const v7, -0x5d21f4ea

    goto/16 :goto_a

    :sswitch_9
    move/from16 v18, v6

    const/4 v1, 0x3

    .line 37
    invoke-static {v13, v14, v1, v9}, Ll/ۖ֡;->ۢ۫᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7d2d8d71

    xor-int/2addr v5, v1

    .line 92
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v1

    if-ltz v1, :cond_7

    goto :goto_5

    :cond_7
    const-string v1, "\u06ec\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, -0x7d11

    const v7, -0x39157916

    xor-int/2addr v6, v7

    const v7, 0x68c64bcf

    goto/16 :goto_a

    :goto_5
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x79

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x5f01

    const v7, 0x616cd26f

    xor-int/2addr v6, v7

    const v7, 0x17f58195

    goto/16 :goto_a

    :cond_8
    const-string v1, "\u1a77\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x68f9

    const v7, -0x48e292ca

    xor-int/2addr v6, v7

    const v7, -0x2beb6d77

    goto/16 :goto_a

    :sswitch_a
    move/from16 v18, v6

    const/4 v11, 0x1

    const/4 v12, 0x4

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v1, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u05a8\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, -0x3241

    const v7, -0x38e724d9

    xor-int/2addr v6, v7

    const v7, 0x59ea4d03

    goto/16 :goto_a

    :sswitch_b
    move/from16 v18, v6

    .line 33
    invoke-super/range {p0 .. p0}, Landroid/app/Service;->onCreate()V

    .line 34
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->setTheme(I)V

    sget-object v10, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_a

    goto/16 :goto_4

    :goto_6
    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x19

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xbc7

    const v7, -0x517c4069

    xor-int/2addr v4, v7

    const v7, -0x797074c3

    xor-int v18, v1, v7

    move v1, v4

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u1a78\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x11

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x49ad

    const v7, -0x13aff0c6

    xor-int/2addr v6, v7

    const v7, 0x4528da51

    goto/16 :goto_a

    :sswitch_c
    move/from16 v18, v6

    const/16 v1, 0x19d1

    const/16 v9, 0x19d1

    goto :goto_7

    :sswitch_d
    move/from16 v18, v6

    const/16 v1, 0x54ca

    const/16 v9, 0x54ca

    :goto_7
    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x65

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, -0x7a1b

    const v7, -0x14bbe9f0

    xor-int/2addr v6, v7

    const v7, 0x1ecf00a2

    goto/16 :goto_a

    :sswitch_e
    move/from16 v18, v6

    add-int/lit8 v1, v8, 0x1

    add-int/lit8 v6, v20, 0x1

    mul-int v6, v6, v6

    sub-int/2addr v1, v6

    if-lez v1, :cond_b

    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, -0x5ae5

    const v7, -0x2c9d67cb

    xor-int/2addr v6, v7

    const v7, -0x4bf20ee8

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u06e2\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, -0x185b

    const v7, -0x1a25e8f3

    xor-int/2addr v6, v7

    const v7, 0x711e7d3d

    goto :goto_a

    :sswitch_f
    move/from16 v18, v6

    mul-int/lit8 v8, v20, 0x2

    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_c

    :goto_8
    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x5b

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, 0x22b3

    const v7, 0x22d091f3

    xor-int/2addr v6, v7

    const v7, -0x6609f972

    goto :goto_a

    :cond_c
    const-string v1, "\u1a78\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v6, v1, v16

    mul-int/lit16 v6, v6, 0x26d5

    const v7, -0x7e0f89c9

    xor-int/2addr v6, v7

    const v7, 0x6b3febdc

    goto :goto_a

    :sswitch_10
    move/from16 v18, v6

    sget-object v1, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    const/4 v6, 0x0

    aget-short v20, v1, v6

    .line 8
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_d

    :goto_9
    const-string v1, "\u1a77\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x3

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x66f9

    const v7, 0x71e90813

    xor-int/2addr v6, v7

    const v7, -0xcf644e4

    goto :goto_a

    :cond_d
    const-string v1, "\u06e7\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v6, v1, v15

    mul-int/lit16 v6, v6, 0x683f

    const v7, -0x29c8c7ee

    xor-int/2addr v6, v7

    const v7, 0x2b32cda5

    :goto_a
    xor-int/2addr v1, v7

    move/from16 v21, v18

    move/from16 v18, v1

    move v1, v6

    move/from16 v6, v21

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d309452 -> :sswitch_a
        -0x79744b9e -> :sswitch_7
        -0x6ca87722 -> :sswitch_1
        -0x6738bcf2 -> :sswitch_3
        -0x65bfa5a7 -> :sswitch_4
        -0x64a1e33b -> :sswitch_9
        -0x633cd35f -> :sswitch_b
        -0x562645f9 -> :sswitch_e
        -0x42f12411 -> :sswitch_e
        -0x410b621b -> :sswitch_8
        -0x38c7d9be -> :sswitch_0
        -0x14a17dd9 -> :sswitch_c
        -0x13eeb257 -> :sswitch_10
        -0x100a88a0 -> :sswitch_9
        -0x91cae97 -> :sswitch_8
        -0x684099f -> :sswitch_a
        0xf4f64b1 -> :sswitch_6
        0x1143afa3 -> :sswitch_0
        0x1ed6107e -> :sswitch_3
        0x2832d7a2 -> :sswitch_5
        0x316feaa3 -> :sswitch_1
        0x32141c25 -> :sswitch_2
        0x3a0473a1 -> :sswitch_d
        0x3e57273a -> :sswitch_d
        0x4203a454 -> :sswitch_4
        0x43304bf3 -> :sswitch_5
        0x43b68524 -> :sswitch_6
        0x47d97ba7 -> :sswitch_2
        0x57158416 -> :sswitch_f
        0x59dd020e -> :sswitch_b
        0x5a688f2f -> :sswitch_10
        0x623f1559 -> :sswitch_c
        0x647ba490 -> :sswitch_f
        0x6745f782 -> :sswitch_7
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0xc50f2d

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xa97

    const v6, -0x324184b0

    xor-int/2addr v5, v6

    const v6, -0x1e8742c8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x2eb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v4, :cond_6

    goto/16 :goto_5

    .line 73
    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_a

    goto/16 :goto_5

    :sswitch_1
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_8

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_5

    .line 42
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

    .line 96
    :sswitch_4
    iget-object v0, p0, Ll/᩵ܿ֫;->֡:Landroid/content/BroadcastReceiver;

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;)V

    return-void

    .line 95
    :sswitch_5
    iget-object v4, p0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    invoke-virtual {v4}, Ll/᩵ܿ᩻;->ۤ()V

    .line 27
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u0730\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x73ad

    const v6, -0x33066983

    xor-int/2addr v5, v6

    const v6, -0x3a141eb9

    goto :goto_0

    .line 94
    :sswitch_6
    sput-object v0, Ll/᩵ܿ֫;->۟:Ljava/lang/String;

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06da\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2295

    const v6, -0x5882bc6d

    xor-int/2addr v5, v6

    const v6, 0x3f7fa2ab

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x0

    .line 10
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x105d

    const v6, -0xe3c0584

    xor-int/2addr v5, v6

    const v6, -0x38b1c922

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u1a75\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14bd

    const v6, -0x34a23f35    # -1.4532811E7f

    xor-int/2addr v5, v6

    const v6, -0x3500dbc5    # -8360477.5f

    goto/16 :goto_0

    .line 62
    :sswitch_8
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u073f\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4529

    const v6, -0x4dabfd13

    xor-int/2addr v5, v6

    const v6, 0xa715939

    goto/16 :goto_0

    .line 10
    :sswitch_9
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e2\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x104b

    const v6, 0x52d099df

    xor-int/2addr v5, v6

    const v6, 0x253040fd

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06d8\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6ffd

    const v6, 0x770806cf

    xor-int/2addr v5, v6

    const v6, -0x743ad907

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06df\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x700b

    const v6, 0x4fd996d5    # 7.3010816E9f

    xor-int/2addr v5, v6

    const v6, 0x76887fa7

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06db\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6481

    const v6, 0x44baabc

    xor-int/2addr v5, v6

    const v6, -0x7d133e84

    goto/16 :goto_0

    .line 53
    :sswitch_c
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u05a1\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ae1

    const v6, -0x60e13202

    xor-int/2addr v5, v6

    const v6, 0x6fa4e7b8

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05ab\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e7f

    const v6, -0x5d88a35c

    xor-int/2addr v5, v6

    const v6, -0x4adf5c22

    goto/16 :goto_0

    .line 12
    :sswitch_d
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u1a73\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c29

    const v6, -0x578e689

    xor-int/2addr v5, v6

    const v6, -0x6a3fc461

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06ec\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xae3

    const v6, -0x73b1507

    xor-int/2addr v5, v6

    const v6, -0x6d08a2db

    goto/16 :goto_0

    .line 93
    :sswitch_e
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_c

    :goto_5
    const-string v4, "\u06eb\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e75

    const v6, 0x290bc8a2

    xor-int/2addr v5, v6

    const v6, -0x26e12349

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e1\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x340f

    const v6, -0x6ca0755c

    xor-int/2addr v5, v6

    const v6, 0x8824513

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6acae0c6 -> :sswitch_2
        -0x56e97815 -> :sswitch_e
        -0x4ff7239d -> :sswitch_8
        -0x4df252e9 -> :sswitch_4
        -0x45f71f4a -> :sswitch_7
        -0x3c54e445 -> :sswitch_9
        -0x254e0c04 -> :sswitch_4
        -0x228ca478 -> :sswitch_0
        -0x1d29d1f2 -> :sswitch_5
        -0x19ed42ba -> :sswitch_6
        -0x165887fe -> :sswitch_a
        -0x2b10d13 -> :sswitch_b
        0x7d3770 -> :sswitch_7
        0x131e35ee -> :sswitch_5
        0x13bc223c -> :sswitch_6
        0x187934b4 -> :sswitch_9
        0x228ede51 -> :sswitch_c
        0x25ba5f51 -> :sswitch_1
        0x314b4470 -> :sswitch_0
        0x3ce419f0 -> :sswitch_c
        0x3ee643fa -> :sswitch_2
        0x43417465 -> :sswitch_d
        0x4d734001 -> :sswitch_3
        0x545e9dd3 -> :sswitch_a
        0x5b145dfc -> :sswitch_e
        0x5b31c6f8 -> :sswitch_b
        0x5d2f88b6 -> :sswitch_8
        0x61221c98 -> :sswitch_1
        0x69675fe9 -> :sswitch_3
        0x78d9c57a -> :sswitch_d
    .end sparse-switch
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x139e6fea

    sget v12, Ll/ۖۙ;->ۤۧۤ:I

    sget v13, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v14, "\u06e4\u1a7a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x64c1

    const v16, 0x628c84e5

    xor-int v15, v15, v16

    const v16, 0x5932e7b9

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x3d3

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/app/Service;->stopSelf()V

    goto/16 :goto_1

    .line 92
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v14, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v14, :cond_c

    goto/16 :goto_2

    :sswitch_1
    sget v14, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v14, :cond_f

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v14, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v14, :cond_1

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    const/4 v1, 0x0

    return v1

    .line 101
    :sswitch_5
    iget-object v14, v0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    invoke-virtual {v14}, Ll/᩵ܿ᩻;->show()V

    goto :goto_1

    .line 103
    :sswitch_6
    iget-object v14, v0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    invoke-virtual {v14}, Ll/᩵ܿ᩻;->ۙ()V

    goto :goto_1

    :sswitch_7
    const/4 v1, 0x2

    return v1

    .line 81
    :sswitch_8
    sget-object v14, Ll/᩵ܿ֫;->ᩳ:Ll/᩶ۤۤ;

    iput-object v14, v0, Ll/᩵ܿ֫;->ܰ:Ll/᩶ۤۤ;

    const/4 v14, 0x0

    .line 82
    sput-object v14, Ll/᩵ܿ֫;->ᩳ:Ll/᩶ۤۤ;

    goto/16 :goto_3

    .line 100
    :sswitch_9
    iget-object v14, v0, Ll/᩵ܿ֫;->ܿ:Ll/᩵ܿ᩻;

    invoke-virtual {v14}, Ll/᩵ܿ᩻;->᩷()Z

    move-result v14

    if-eqz v14, :cond_0

    const-string v14, "\u073a\u06e7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x51

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1437

    const v16, -0x39dee829

    xor-int v15, v15, v16

    const v16, -0x5df54cbc

    goto :goto_0

    :cond_0
    const-string v14, "\u1a7b\u073a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0xd

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x5393

    const v16, -0x41aeff4a

    xor-int v15, v15, v16

    const v16, -0x1ef3ce8e

    goto/16 :goto_0

    :goto_1
    const-string v14, "\u0730\u06e7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x4b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x4657

    const v16, -0x526e7e40

    xor-int v15, v15, v16

    const v16, -0x2dddc6f2

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {v8, v9, v10, v7}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    .line 80
    invoke-virtual {v1, v14, v15}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_4

    const-string v14, "\u06ec\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x70cd

    const v16, -0x4f6c13de

    xor-int v15, v15, v16

    const v16, 0xd8c3e19

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget-object v8, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    const/16 v9, 0x2c

    const/4 v10, 0x4

    .line 59
    sget v14, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v14, :cond_2

    :cond_1
    :goto_2
    const-string v14, "\u073d\u1a73"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x13

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2995

    const v16, -0x186ef98d

    xor-int v15, v15, v16

    const v16, 0x4b4b9f6f    # 1.3344623E7f

    goto/16 :goto_0

    :cond_2
    const-string v14, "\u06db\u1a77"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6a43

    const v16, 0x683c7128

    xor-int v15, v15, v16

    const v16, -0x107653a2

    goto/16 :goto_0

    .line 84
    :sswitch_c
    iget-object v14, v0, Ll/᩵ܿ֫;->ܰ:Ll/᩶ۤۤ;

    if-eqz v14, :cond_3

    const-string v14, "\u0736\u0736"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x7d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x31f3

    const v16, 0x35a2d87b

    xor-int v15, v15, v16

    const v16, -0x614fae21

    goto/16 :goto_0

    :cond_3
    const-string v14, "\u05a1\u1a73"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x65

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x61c7

    const v16, 0x33ea3ca0

    xor-int v15, v15, v16

    const v16, -0x6dbade32

    goto/16 :goto_0

    :sswitch_d
    if-eqz v1, :cond_4

    const-string v14, "\u06d9\u06da"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x226f

    const v16, 0x794035a8

    xor-int v15, v15, v16

    const v16, -0x14843fbe

    goto/16 :goto_0

    :cond_4
    :goto_3
    const-string v14, "\u073f\u073f"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x9e1

    const v16, -0x47cd67b7

    xor-int v15, v15, v16

    const v16, 0x4d44ba87    # 2.0628491E8f

    goto/16 :goto_0

    :sswitch_e
    const/16 v7, 0x139c

    goto :goto_4

    :sswitch_f
    const/16 v7, 0x1d79

    :goto_4
    const-string v14, "\u06dc\u06db"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x46fb

    const v16, -0x980a30d

    xor-int v15, v15, v16

    const v16, 0x701de086

    goto/16 :goto_0

    :sswitch_10
    add-int v14, v3, v6

    mul-int v14, v14, v14

    sub-int/2addr v14, v5

    if-gtz v14, :cond_5

    const-string v14, "\u0736\u073a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x4023

    const v16, 0x4dee0963    # 4.9919907E8f

    xor-int v15, v15, v16

    const v16, -0x1ae76983

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u0733\u1a76"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x1f9b

    const v16, -0xecb9b5a

    xor-int v15, v15, v16

    const v16, 0x1d4e7540

    goto/16 :goto_0

    :sswitch_11
    const v5, 0x5a36804

    add-int/2addr v5, v4

    add-int/2addr v5, v5

    const/16 v6, 0x25fe

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v14

    if-gtz v14, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v14, "\u1a74\u073d"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x35

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x23ef

    const v16, 0x1be780c6

    xor-int v15, v15, v16

    const v16, -0x73107412

    goto/16 :goto_0

    :sswitch_12
    const/16 v3, 0x2b

    aget-short v3, v2, v3

    mul-int v4, v3, v3

    sget v14, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v14, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v14, "\u0736\u06e1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x450f

    const v16, 0x4c663a05    # 6.0352532E7f

    xor-int v15, v15, v16

    const v16, 0x3d53ff0f

    goto/16 :goto_0

    :sswitch_13
    sget-object v2, Ll/᩵ܿ֫;->ᩳ᩷᩷:[S

    sget v14, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v14, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v14, "\u1a7a\u06d7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1911

    const v16, 0x110efebf

    xor-int v15, v15, v16

    const v16, 0x6dfe35fc

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v14

    if-eqz v14, :cond_9

    :goto_5
    const-string v14, "\u1a7b\u05a8"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6d77

    const v16, -0x19319892

    xor-int v15, v15, v16

    const v16, -0x327b60d9    # -2.7812784E8f

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u1a79\u06d9"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x26dd

    const v16, -0x29a401b5

    xor-int v15, v15, v16

    const v16, -0x71573a1d

    goto/16 :goto_0

    :sswitch_15
    sget v14, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v14, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v14, "\u06e4\u06db"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0xd

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1913

    const v16, 0x3e764db8

    xor-int v15, v15, v16

    const v16, -0x132fe07d

    goto/16 :goto_0

    .line 78
    :sswitch_16
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v14

    if-ltz v14, :cond_b

    goto :goto_6

    :cond_b
    const-string v14, "\u06e7\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x2d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7bdf

    const v16, -0x7bf23d4f

    xor-int v15, v15, v16

    const v16, -0x53648869

    goto/16 :goto_0

    .line 72
    :sswitch_17
    sget v14, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v14, :cond_d

    :cond_c
    const-string v14, "\u06da\u06e4"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x4f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x671f

    const v16, 0x1ab20368

    xor-int v15, v15, v16

    const v16, 0x64787ac5

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u06e2\u1a74"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1a05

    const v16, 0x6317e1d9

    xor-int v15, v15, v16

    const v16, -0x1a04426b

    goto/16 :goto_0

    :sswitch_18
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v14

    if-eqz v14, :cond_e

    :goto_6
    const-string v14, "\u06eb\u05a8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x68bb

    const v16, -0x17f73c23

    xor-int v15, v15, v16

    const v16, 0x438baf39

    goto/16 :goto_0

    :cond_e
    const-string v14, "\u06e1\u073a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x201f

    const v16, -0x47c1bcaa

    xor-int v15, v15, v16

    const v16, 0x1f637d3b

    goto/16 :goto_0

    .line 102
    :sswitch_19
    sget v14, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v14, :cond_10

    :cond_f
    :goto_7
    const-string v14, "\u06db\u06e0"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6415

    const v16, -0x157959f7

    xor-int v15, v15, v16

    const v16, -0x2ff69e42

    goto/16 :goto_0

    :cond_10
    const-string v14, "\u06d8\u1a7a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x19

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x203f

    const v16, -0x40b20823

    xor-int v15, v15, v16

    const v16, -0xa3cd0ba

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d84c96f -> :sswitch_18
        -0x79401faf -> :sswitch_1
        -0x781e061b -> :sswitch_12
        -0x6ac6b297 -> :sswitch_e
        -0x68eb9f38 -> :sswitch_17
        -0x65fe3383 -> :sswitch_d
        -0x56687b60 -> :sswitch_0
        -0x528024d2 -> :sswitch_16
        -0x5259e4c0 -> :sswitch_11
        -0x51a8ae16 -> :sswitch_15
        -0x507a388b -> :sswitch_8
        -0x4e9d4a7a -> :sswitch_11
        -0x425fd5f5 -> :sswitch_14
        -0x3c9e7eff -> :sswitch_9
        -0x3acc6313 -> :sswitch_c
        -0x3881b837 -> :sswitch_1
        -0x3625e48a -> :sswitch_c
        -0x351b5d5b -> :sswitch_4
        -0x2eba29db -> :sswitch_19
        -0x2a1a85c4 -> :sswitch_f
        -0x297d5bf4 -> :sswitch_18
        -0x24d34699 -> :sswitch_12
        -0x201e82f4 -> :sswitch_7
        -0x186febe3 -> :sswitch_8
        -0x14f4516f -> :sswitch_2
        -0x89319be -> :sswitch_15
        -0x7a43f5c -> :sswitch_a
        -0x58b0b64 -> :sswitch_0
        -0x971528 -> :sswitch_19
        0x167ece7 -> :sswitch_b
        0x2b2e85c -> :sswitch_10
        0x595b526 -> :sswitch_a
        0x6dc3fe9 -> :sswitch_13
        0xcfcd1e3 -> :sswitch_6
        0xf04873d -> :sswitch_f
        0xfbd402a -> :sswitch_14
        0x251a3058 -> :sswitch_3
        0x279b522e -> :sswitch_4
        0x330fbf65 -> :sswitch_10
        0x3a154d5f -> :sswitch_2
        0x3e9e668e -> :sswitch_e
        0x433f50b1 -> :sswitch_5
        0x441b6dff -> :sswitch_7
        0x474a67f7 -> :sswitch_17
        0x4a87cd14 -> :sswitch_9
        0x4aaef9c8 -> :sswitch_13
        0x555f3ea4 -> :sswitch_6
        0x6b92f8bb -> :sswitch_3
        0x6e262023 -> :sswitch_16
        0x6ec02345 -> :sswitch_d
        0x73d8011d -> :sswitch_5
        0x7a6bcc2e -> :sswitch_b
    .end sparse-switch
.end method
