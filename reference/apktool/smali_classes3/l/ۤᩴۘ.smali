.class public final Ll/ۤᩴۘ;
.super Ll/ۜܿܰ;
.source "C2R7"


# instance fields
.field public final synthetic ۖ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ۨ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ܰ:Ll/۬۫ܰ;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;Ll/۬۫ܰ;)V
    .locals 3

    const v0, 0x4cd7bcca    # 1.1310856E8f

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    .line 1011
    iput-object p1, p0, Ll/ۤᩴۘ;->ۖ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Ll/ۤᩴۘ;->ۨ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/ۤᩴۘ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Ll/ۤᩴۘ;->ܰ:Ll/۬۫ܰ;

    invoke-direct {p0}, Ll/ۜܿܰ;-><init>()V

    const-string p1, "\u06d8\u06da"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x680f

    const p3, 0x3b8ff8c1

    xor-int/2addr p2, p3

    const p3, -0x40ef2fc6

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x3e03

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 230
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result p1

    if-ltz p1, :cond_2

    goto :goto_2

    .line 916
    :sswitch_0
    sget p1, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e4\u06e1"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x331b

    const p3, 0x686efb05

    xor-int/2addr p2, p3

    const p3, -0x6044ca7c

    goto :goto_0

    .line 106
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u05ab\u1a75"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x41

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6501

    const p3, 0x1c852f4f

    xor-int/2addr p2, p3

    const p3, -0x5829e2a5

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "\u06dc\u073a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x63

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2a2b

    const p3, -0x6b65321

    xor-int/2addr p2, p3

    const p3, -0x7f92d066

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    :goto_2
    const-string p1, "\u05ab\u1a73"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x702f

    const p3, 0x4d11775b    # 1.525324E8f

    xor-int/2addr p2, p3

    const p3, 0x64bc358b

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u1a79\u073f"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x3d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3a95

    const p3, 0x3ecea972

    xor-int/2addr p2, p3

    const p3, 0x5453718c

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d9\u06df"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x3d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x77ed

    const p3, -0x7d3a524c

    xor-int/2addr p2, p3

    const p3, -0x67bbe4a0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d331562 -> :sswitch_1
        -0x75544254 -> :sswitch_5
        -0x1aca1fef -> :sswitch_2
        -0x168c7ec4 -> :sswitch_5
        -0xa49ff5f -> :sswitch_4
        0xdc7b186 -> :sswitch_4
        0x12bbe5b1 -> :sswitch_1
        0x2688900d -> :sswitch_0
        0x3ea6ecaa -> :sswitch_0
        0x482269cb -> :sswitch_2
        0x6d0c5ea4 -> :sswitch_3
        0x79cbfcc4 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/ܿܿܰ;I)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x420f3f00

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v5, "\u1a76\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa65

    const v7, -0x71f202f4

    xor-int/2addr v6, v7

    const v7, -0x71aab461

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0xfa7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_8

    goto/16 :goto_6

    .line 558
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_5

    .line 788
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v5

    if-lez v5, :cond_c

    goto/16 :goto_6

    .line 43
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v5, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v5, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v5, "\u06db\u073a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x374d

    const v7, -0x6a58b7b3

    xor-int/2addr v6, v7

    const v7, 0x5475c367

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_6

    .line 857
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    return-void

    .line 1017
    :sswitch_5
    invoke-virtual {v1}, Ll/۬۫ܰ;->findFirstVisibleItemPosition()I

    move-result v5

    iget-object v6, p0, Ll/ۤᩴۘ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_1

    .line 1016
    :sswitch_6
    iget-object v1, p0, Ll/ۤᩴۘ;->ۨ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1017
    iget-object v1, p0, Ll/ۤᩴۘ;->ܰ:Ll/۬۫ܰ;

    .line 272
    sget v5, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06d7\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x145f

    const v7, 0x696c3fdf

    xor-int/2addr v6, v7

    const v7, 0x7ae6e902

    goto :goto_0

    :sswitch_7
    if-nez v0, :cond_2

    const-string v5, "\u0730\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x185f

    const v7, -0x58ad43d3

    xor-int/2addr v6, v7

    const v7, 0x7b2d57b3    # 9.000461E35f

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    xor-int/lit8 v5, v0, 0x1

    .line 1015
    iget-object v6, p0, Ll/ۤᩴۘ;->ۖ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u0736\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x65c1

    const v7, 0x12d052f5

    xor-int/2addr v6, v7

    const v7, -0x3ae8a2e7

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v5, "\u06e4\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x37ab

    const v7, -0x31d88c18

    xor-int/2addr v6, v7

    const v7, -0xaf6db2e

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_b
    const/4 v0, 0x0

    :goto_2
    const-string v5, "\u073d\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3be1

    const v7, -0x207b5930

    xor-int/2addr v6, v7

    const v7, -0x57379757

    goto/16 :goto_0

    :sswitch_c
    const/4 p1, 0x1

    if-eqz p2, :cond_3

    const-string v5, "\u06e7\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c55

    const v7, 0x512c8075

    xor-int/2addr v6, v7

    const v7, -0x66297538

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06db\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x405

    const v7, 0xb4db05c

    xor-int/2addr v6, v7

    const v7, -0xf1f6fb0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u073a\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x46e7

    const v7, -0x357d0fe2    # -4290575.0f

    xor-int/2addr v6, v7

    const v7, 0x2b7918a0

    goto/16 :goto_0

    .line 523
    :sswitch_e
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u1a78\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7c7f

    const v7, 0x36bc4efe

    xor-int/2addr v6, v7

    const v7, 0x3f9ec5a4

    goto/16 :goto_0

    .line 711
    :sswitch_f
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06e8\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x61ad

    const v7, 0xda80e53

    xor-int/2addr v6, v7

    const v7, 0x40b871f1

    goto/16 :goto_0

    .line 217
    :sswitch_10
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v5

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u0730\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1d31

    const v7, -0x1bd43c84

    xor-int/2addr v6, v7

    const v7, 0x73d60271

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u05ab\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x253

    const v7, -0x37f62640    # -141159.0f

    xor-int/2addr v6, v7

    const v7, -0x71db7245

    goto/16 :goto_0

    .line 724
    :sswitch_11
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u0733\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3113

    const v7, 0x7abb509a

    xor-int/2addr v6, v7

    const v7, 0x73af412a

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d8\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x44d

    const v7, -0x1031d422

    xor-int/2addr v6, v7

    const v7, -0x49ce1efe

    goto/16 :goto_0

    .line 398
    :sswitch_12
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_b

    :goto_4
    const-string v5, "\u06da\u1a73"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3521

    const v7, 0x1968d2dc

    xor-int/2addr v6, v7

    const v7, 0x10f77a98

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d9\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xb47

    const v7, 0x4e36e8ea    # 7.671794E8f

    xor-int/2addr v6, v7

    const v7, -0x75072ae

    goto/16 :goto_0

    .line 287
    :sswitch_13
    sget v5, Ll/۟;->ۨᩴۛ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06e1\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x71b

    const v7, 0x4b259ca7    # 1.0853543E7f

    xor-int/2addr v6, v7

    const v7, 0x42aa76bd

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e8\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1963

    const v7, -0x2061920c

    xor-int/2addr v6, v7

    const v7, 0x258f884e

    goto/16 :goto_0

    .line 627
    :sswitch_14
    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v5, :cond_e

    :goto_6
    const-string v5, "\u06e7\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c17

    const v7, 0x7c2250e

    xor-int/2addr v6, v7

    const v7, -0x219b1d47

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u073d\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x78f3

    const v7, 0x73ea40b0

    xor-int/2addr v6, v7

    const v7, 0x4f336fa4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f044253 -> :sswitch_6
        -0x70af2671 -> :sswitch_13
        -0x6ea5b975 -> :sswitch_5
        -0x6be9b649 -> :sswitch_3
        -0x61a01f09 -> :sswitch_8
        -0x612a4897 -> :sswitch_6
        -0x5745b1da -> :sswitch_11
        -0x54503878 -> :sswitch_9
        -0x4fd53cb9 -> :sswitch_e
        -0x4fb0181b -> :sswitch_4
        -0x4c3309b5 -> :sswitch_1
        -0x4b4f6c47 -> :sswitch_b
        -0x38bf4d01 -> :sswitch_12
        -0x31ccde24 -> :sswitch_12
        -0x303ff60e -> :sswitch_5
        -0x2bde01cc -> :sswitch_d
        -0x2728c5f6 -> :sswitch_14
        -0x2337ebcb -> :sswitch_1
        -0x14e55398 -> :sswitch_c
        -0x4b41ed4 -> :sswitch_0
        0xd0e0b6c -> :sswitch_2
        0x180c8008 -> :sswitch_a
        0x1b5c3e86 -> :sswitch_b
        0x1bbd7a6b -> :sswitch_c
        0x1efb4ecb -> :sswitch_0
        0x21d69d86 -> :sswitch_e
        0x25ee823d -> :sswitch_2
        0x2638e67e -> :sswitch_4
        0x2eabce1d -> :sswitch_7
        0x2ee3f88c -> :sswitch_f
        0x305af74f -> :sswitch_11
        0x356a85af -> :sswitch_8
        0x4e3521dc -> :sswitch_14
        0x4f5ff160 -> :sswitch_f
        0x53e08723 -> :sswitch_3
        0x54e77fd0 -> :sswitch_10
        0x59b50773 -> :sswitch_a
        0x64b1284b -> :sswitch_d
        0x659832fa -> :sswitch_10
        0x671e5543 -> :sswitch_7
        0x69c1df43 -> :sswitch_9
        0x7455b24d -> :sswitch_13
    .end sparse-switch
.end method
