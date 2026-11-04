.class public final Ll/ܰۖᩴ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۙ᩵۟:[S

.field public static ۜ:Ljava/lang/ref/WeakReference;

.field public static final ۠:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static ۬:Z


# instance fields
.field public ֡:Ll/۠ۖۧ;

.field public ֨:Z

.field public final ۖ:Ll/۠ۨܳ;

.field public final ۟:Ll/᩷ۨᩴ;

.field public ۡ:Landroid/view/View;

.field public ۢ:Z

.field public ܰ:Ll/ۧۙܺ;

.field public ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩳ:Z

.field public ᩶:Ll/ܿ᩷᩸;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x61

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    .line 101
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ܰۖᩴ;->۠:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    .line 102
    sput-boolean v0, Ll/ܰۖᩴ;->۬:Z

    return-void

    :array_0
    .array-data 2
        0x1eds
        -0x5ff9s
        -0x5fe1s
        -0x5fcds
        -0x5ff2s
        -0x5ff3s
        -0x5ffes
        -0x5fcds
        -0x5fe4s
        -0x5ff9s
        -0x5fe1s
        -0x5fc0s
        -0x5fc1s
        -0x5ffds
        -0x5fe2s
        -0x5fe2s
        -0x5febs
        -0x5fc0s
        -0x5fb4s
        -0x5fe8s
        -0x5ffcs
        -0x5ffbs
        -0x5fe1s
        -0x5fb4s
        -0x5ff6s
        -0x5fe7s
        -0x5ffes
        -0x5ff1s
        -0x5fe8s
        -0x5ffbs
        -0x5ffds
        -0x5ffes
        -0x5fb4s
        -0x5ffbs
        -0x5fe1s
        -0x5fb4s
        -0x5ffes
        -0x5ffds
        -0x5fe8s
        -0x5fb4s
        -0x5fe1s
        -0x5fe7s
        -0x5fe4s
        -0x5fe4s
        -0x5ffds
        -0x5fe2s
        -0x5fe8s
        -0x5ff7s
        -0x5ff8s
        -0x5fb4s
        -0x5ff6s
        -0x5ffds
        -0x5fe2s
        -0x5fb4s
        -0x5fe8s
        -0x5ffcs
        -0x5ffbs
        -0x5fe1s
        -0x5fb4s
        -0x5ff3s
        -0x5fe4s
        -0x5fe4s
        -0x5fb4s
        -0x5ff3s
        -0x5fe8s
        -0x5fb4s
        -0x5fe8s
        -0x5ffcs
        -0x5ff7s
        -0x5fb4s
        -0x5fffs
        -0x5ffds
        -0x5fffs
        -0x5ff7s
        -0x5ffes
        -0x5fe8s
        -0x5fb3s
        -0x1cs
        -0x3d23s
        -0x34dbs
        0x5f60s
        -0x3912s
        -0x3a66s
        -0x119fs
        -0x3abds
        -0x3c93s
        -0x46bs
        0x2b89s
        -0x108s
        -0x2abcs
        -0x10eds
        -0x2abcs
        -0xc29s
        -0x24ees
        -0xd0ds
        0x2091s
        0x5f6ds
    .end array-data
.end method

.method public constructor <init>(Ll/۠ۨܳ;Ljava/lang/String;)V
    .locals 3

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܰۖᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Ll/ܰۖᩴ;->֨:Z

    .line 115
    iput-object p1, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 116
    invoke-static {p2, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p2

    iput-object p2, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    .line 117
    sget-object p2, Ll/ܰۖᩴ;->۠:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    .line 118
    new-instance v0, Ll/۬֨ᩴ;

    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v1

    const v2, 0x7f12057b

    invoke-direct {v0, v1, v2}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    .line 119
    new-instance v1, Ll/ۜۡᩴ;

    invoke-direct {v1, p0, v0, p2, p1}, Ll/ۜۡᩴ;-><init>(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILl/۠ۨܳ;)V

    .line 232
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰۖᩴ;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    return-object p0
.end method

.method public static ۙ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 375
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 376
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/high16 v2, 0x43480000    # 200.0f

    .line 377
    invoke-static {v2}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v2

    if-ge v0, v2, :cond_0

    int-to-float v3, v2

    int-to-float v0, v0

    div-float/2addr v3, v0

    int-to-float v0, v1

    mul-float v0, v0, v3

    float-to-int v1, v0

    move v0, v2

    .line 384
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 385
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 386
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v5, 0x0

    .line 387
    invoke-virtual {p0, v5, v5, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 388
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 389
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public static synthetic ۙ(Ljava/lang/String;Ljava/lang/Runnable;Ll/۠ۨܳ;Ll/᩷ۨᩴ;I)V
    .locals 2

    const v0, 0x7f120521

    if-ne p4, v0, :cond_0

    .line 845
    invoke-static {p0}, Ll/ܰۖᩴ;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 849
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    const p1, 0x7f12008b

    if-ne p4, p1, :cond_2

    .line 852
    invoke-virtual {p3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p2, p1, p0, p3, p4}, Ll/ۗ۟ۤ;->ۙ(Ll/۠ۨܳ;[Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void

    :cond_2
    const p1, 0x7f12007f

    if-ne p4, p1, :cond_3

    .line 854
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ۚ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_3
    const p1, 0x7f12004a

    if-ne p4, p1, :cond_4

    .line 856
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->᩷(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_4
    const p1, 0x7f120a65

    if-ne p4, p1, :cond_5

    .line 858
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->᩻(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_5
    const p1, 0x7f120a64

    if-ne p4, p1, :cond_6

    .line 860
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ۙ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_6
    if-ne p4, v0, :cond_7

    .line 862
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->۫(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_7
    const p1, 0x7f12010f

    if-ne p4, p1, :cond_8

    .line 864
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ܽ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_8
    const p1, 0x7f120586

    if-ne p4, p1, :cond_9

    .line 866
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ܳ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_9
    const p1, 0x7f1204c2

    if-ne p4, p1, :cond_b

    .line 868
    invoke-static {}, Ll/ᩳۡ᩻;->ܺ()Z

    move-result p1

    if-nez p1, :cond_a

    const p0, 0x7f120916

    .line 869
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 871
    :cond_a
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ᩴ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_b
    const p1, 0x7f120278

    if-ne p4, p1, :cond_c

    .line 874
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->᩸(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_c
    const p1, 0x7f120261

    if-ne p4, p1, :cond_d

    .line 876
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->֫(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_d
    const p1, 0x7f120290

    if-ne p4, p1, :cond_e

    .line 878
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ۧ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_e
    const p1, 0x7f120227

    if-ne p4, p1, :cond_f

    .line 880
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ۤ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_f
    const p1, 0x7f120a6f

    if-ne p4, p1, :cond_10

    .line 882
    invoke-static {p3, p2, p0}, Ll/ۗ۟ۤ;->ܺ(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void

    :cond_10
    const p1, 0x7f120d57

    if-ne p4, p1, :cond_11

    .line 884
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p2}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p4

    const-class v0, Ll/᩹ۜۤ;

    invoke-direct {p1, p4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p4, "android.intent.action.VIEW"

    .line 885
    invoke-virtual {p1, p4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 886
    invoke-virtual {p3}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p3, "packageName"

    .line 887
    invoke-virtual {p1, p3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 888
    invoke-virtual {p2}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    :cond_11
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;Ljava/lang/String;Ll/᩷ܿ֫;)V
    .locals 16

    .line 800
    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f050008

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 801
    new-instance v1, Ll/᩹۟᩻;

    invoke-virtual/range {p0 .. p0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/᩹۟᩻;-><init>(Lbin/mt/plus/Main;Landroid/view/View;)V

    const v2, 0x7f120290

    const v3, 0x7f120586

    const v4, 0x7f120261

    const v5, 0x7f120227

    const v6, 0x7f120278

    const v7, 0x7f120521

    const v8, 0x7f120a64

    const v9, 0x7f120a6f

    const v10, 0x7f120a65

    const v11, 0x7f12004a

    const v12, 0x7f12010f

    const v13, 0x7f12007f

    const v14, 0x7f120d57

    const v15, 0x7f12008b

    if-eqz v0, :cond_0

    .line 803
    invoke-virtual {v1, v15, v15}, Ll/᩹۟᩻;->ۙ(II)V

    .line 804
    invoke-virtual {v1, v14, v14}, Ll/᩹۟᩻;->ۙ(II)V

    .line 806
    invoke-virtual {v1, v13, v13}, Ll/᩹۟᩻;->ۙ(II)V

    .line 807
    invoke-virtual {v1, v12, v12}, Ll/᩹۟᩻;->ۙ(II)V

    .line 809
    invoke-virtual {v1, v11, v11}, Ll/᩹۟᩻;->ۙ(II)V

    .line 810
    invoke-virtual {v1, v10, v10}, Ll/᩹۟᩻;->ۙ(II)V

    .line 812
    invoke-virtual {v1, v9, v9}, Ll/᩹۟᩻;->ۙ(II)V

    .line 813
    invoke-virtual {v1, v8, v8}, Ll/᩹۟᩻;->ۙ(II)V

    .line 815
    invoke-virtual {v1, v7, v7}, Ll/᩹۟᩻;->ۙ(II)V

    .line 816
    invoke-virtual {v1, v6, v6}, Ll/᩹۟᩻;->ۙ(II)V

    .line 818
    invoke-virtual {v1, v5, v5}, Ll/᩹۟᩻;->ۙ(II)V

    .line 819
    invoke-virtual {v1, v4, v4}, Ll/᩹۟᩻;->ۙ(II)V

    .line 821
    invoke-virtual {v1, v3, v3}, Ll/᩹۟᩻;->ۙ(II)V

    .line 822
    invoke-virtual {v1, v2, v2}, Ll/᩹۟᩻;->ۙ(II)V

    const v2, 0x7f1204c2

    .line 824
    invoke-virtual {v1, v2, v2}, Ll/᩹۟᩻;->ۙ(II)V

    goto :goto_0

    .line 826
    :cond_0
    invoke-virtual {v1, v15, v15}, Ll/᩹۟᩻;->ۙ(II)V

    .line 827
    invoke-virtual {v1, v11, v11}, Ll/᩹۟᩻;->ۙ(II)V

    .line 828
    invoke-virtual {v1, v13, v13}, Ll/᩹۟᩻;->ۙ(II)V

    .line 830
    invoke-virtual {v1, v2, v2}, Ll/᩹۟᩻;->ۙ(II)V

    .line 831
    invoke-virtual {v1, v4, v4}, Ll/᩹۟᩻;->ۙ(II)V

    .line 832
    invoke-virtual {v1, v6, v6}, Ll/᩹۟᩻;->ۙ(II)V

    .line 833
    invoke-virtual {v1, v10, v10}, Ll/᩹۟᩻;->ۙ(II)V

    .line 834
    invoke-virtual {v1, v8, v8}, Ll/᩹۟᩻;->ۙ(II)V

    .line 835
    invoke-virtual {v1, v9, v9}, Ll/᩹۟᩻;->ۙ(II)V

    .line 837
    invoke-virtual {v1, v12, v12}, Ll/᩹۟᩻;->ۙ(II)V

    .line 838
    invoke-virtual {v1, v14, v14}, Ll/᩹۟᩻;->ۙ(II)V

    .line 839
    invoke-virtual {v1, v7, v7}, Ll/᩹۟᩻;->ۙ(II)V

    .line 840
    invoke-virtual {v1, v5, v5}, Ll/᩹۟᩻;->ۙ(II)V

    const v2, 0x7f1204c2

    .line 841
    invoke-virtual {v1, v2, v2}, Ll/᩹۟᩻;->ۙ(II)V

    .line 842
    invoke-virtual {v1, v3, v3}, Ll/᩹۟᩻;->ۙ(II)V

    .line 844
    :goto_0
    new-instance v2, Ll/ᩴۖᩴ;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    invoke-direct {v2, v5, v6, v3, v4}, Ll/ᩴۖᩴ;-><init>(Ljava/lang/String;Ljava/lang/Runnable;Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    invoke-virtual {v1, v2}, Ll/᩹۟᩻;->ۙ(Ll/ܶ۟᩻;)V

    if-eqz v0, :cond_1

    .line 892
    invoke-virtual {v1}, Ll/᩹۟᩻;->᩷()V

    return-void

    .line 894
    :cond_1
    invoke-virtual {v1}, Ll/᩹۟᩻;->ۤ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/۬֨ᩴ;)V
    .locals 1

    .line 123
    sget-object v0, Ll/ܰۖᩴ;->۠:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 124
    invoke-virtual {p0}, Ll/۬֨ᩴ;->ۙ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 608
    invoke-direct {p0, v0}, Ll/ܰۖᩴ;->ۙ(Z)V

    return-void
.end method

.method public static ۙ(Ll/ܰۖᩴ;Landroid/content/DialogInterface;I)V
    .locals 4

    .line 276
    iget-object v0, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    if-eq p2, v1, :cond_0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    return-void

    :cond_0
    const-string v1, ".png"

    const-string v2, ".webp"

    .line 329
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v3}, Ll/ۧۙܺ;->ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_icon"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, p2, -0x1

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2157
    invoke-virtual {v0, v1, p1}, Ll/۠ۨܳ;->ۙ(Ljava/lang/String;Z)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 331
    new-instance v0, Ll/ܺۖᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܺۖᩴ;-><init>(Ll/ܰۖᩴ;Ll/᩷ۨᩴ;I)V

    .line 368
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void

    .line 279
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v1}, Ll/ۧۙܺ;->ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_icon.zip"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2157
    invoke-virtual {v0, p2, p1}, Ll/۠ۨܳ;->ۙ(Ljava/lang/String;Z)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 280
    new-instance p2, Ll/᩻ۖᩴ;

    invoke-direct {p2, p0, p1}, Ll/᩻ۖᩴ;-><init>(Ll/ܰۖᩴ;Ll/᩷ۨᩴ;)V

    .line 326
    invoke-virtual {p2}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static ۙ(Ll/ܰۖᩴ;Landroid/view/View;)V
    .locals 3

    .line 600
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_verify"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    invoke-direct {p0, v2}, Ll/ܰۖᩴ;->ۙ(Z)V

    return-void

    .line 604
    :cond_0
    iget-object v0, p0, Ll/ܰۖᩴ;->᩶:Ll/ܿ᩷᩸;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܿ᩷᩸;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܰۖᩴ;->᩶:Ll/ܿ᩷᩸;

    invoke-virtual {v0}, Ll/ܿ᩷᩸;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 605
    iget-object p1, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const v0, 0x7f120d44

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->᩷(I)V

    const v0, 0x7f12005b

    .line 606
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(I)V

    const v0, 0x7f12018c

    const/4 v1, 0x0

    .line 607
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۚ᩶ۤ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۚ᩶ۤ;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f1204e4

    .line 608
    invoke-virtual {p1, p0, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 609
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p0

    .line 610
    invoke-static {p0}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 613
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 614
    new-instance v0, Ll/᩵ۖᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩵ۖᩴ;-><init>(Ll/ܰۖᩴ;Landroid/view/View;)V

    .line 738
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Landroid/widget/TextView;)V
    .locals 3

    .line 220
    :try_start_0
    iget-object v0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-static {v0}, Ll/᩹ۙܺ;->ۙ(Ll/᩷ۨᩴ;)Ljava/lang/String;

    move-result-object v0

    .line 221
    iget-object v1, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    new-instance v1, Ll/ۤۖᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, v0}, Ll/ۤۖᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    nop

    .line 224
    iget-object p0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 225
    new-instance p0, Ll/ۙۤۧ;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Ll/ۙۤۧ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/۠ۨܳ;)V
    .locals 0

    .line 201
    iget-object p0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-static {p1, p0}, Ll/᩻ܰᩴ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/۠ۨܳ;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 154
    iget-object p0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    if-nez p4, :cond_0

    .line 156
    invoke-static {p1, p0}, Ll/֫ۘܳ;->ᩴ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void

    :cond_0
    const/4 p3, 0x0

    .line 158
    invoke-static {p1, p0, p2, p3}, Ll/ܰۖᩴ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;Ljava/lang/String;Ll/᩷ܿ֫;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/۬֨ᩴ;)V
    .locals 1

    .line 121
    iget-boolean p0, p0, Ll/ܰۖᩴ;->֨:Z

    if-eqz p0, :cond_0

    .line 122
    new-instance p0, Ll/۫᩷ۚ;

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ll/۫᩷ۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0}, Ll/۬֨ᩴ;->ۙ(Ljava/lang/Runnable;)V

    .line 126
    invoke-virtual {p1}, Ll/۬֨ᩴ;->ܳ()V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILjava/lang/String;Ll/۠ۨܳ;)V
    .locals 9

    .line 141
    iget-object v0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {p1}, Ll/۬֨ᩴ;->ۙ()V

    .line 142
    sget-object p1, Ll/ܰۖᩴ;->۠:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-eq p2, p1, :cond_0

    return-void

    .line 145
    :cond_0
    iget-object p1, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    const p2, 0x7f120418

    const v1, 0x7f120d27

    if-nez p1, :cond_2

    if-nez p3, :cond_1

    .line 147
    invoke-static {p4, v0}, Ll/֫ۘܳ;->ᩴ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void

    .line 150
    :cond_1
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    .line 151
    invoke-static {p2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {p4}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p2

    new-instance v0, Ll/ܳۖᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p4, p3, v1}, Ll/ܳۖᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p0, -0x1

    invoke-virtual {p2, p1, p0, v0}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f1207ad

    .line 160
    invoke-virtual {p2, p0}, Ll/ۖۖۧ;->᩷(I)V

    invoke-virtual {p2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 164
    :cond_2
    invoke-virtual {p4}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    const p3, 0x7f0d0076

    .line 165
    invoke-virtual {p1, p3}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a0296

    .line 166
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 167
    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->۫()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 168
    new-instance v2, Ll/ܿ۠֫;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p0}, Ll/ܿ۠֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a0079

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->ۤ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 170
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a0073

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 171
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a06c9

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 172
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a06ca

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->֫()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 173
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a057b

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->᩸()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 174
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a0607

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->ۚ()I

    move-result v2

    invoke-static {v2}, Ll/ۗۚܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 175
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a03e3

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v2}, Ll/ۧۙܺ;->ᩴ()I

    move-result v2

    invoke-static {v2}, Ll/ۗۚܺ;->ۙ(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 176
    iget-object p3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a04ac

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 177
    iget-object v2, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v3, 0x7f0a0572

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    .line 178
    iget-object v2, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v3, 0x7f0a0575

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 179
    invoke-static {p3}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;)V

    .line 181
    invoke-direct {p0}, Ll/ܰۖᩴ;->ۤ()V

    .line 183
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v2

    iget-object v3, p0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    .line 184
    invoke-virtual {v2, v3}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v3, 0x7f1204e2

    const/4 v4, 0x0

    .line 185
    invoke-virtual {v2, v3, v4}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 186
    invoke-virtual {v2, v1, p0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const-string v1, "local"

    .line 187
    invoke-virtual {p4, v1}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 188
    invoke-virtual {v2, p2, p0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 189
    :cond_3
    sget-object p2, Ll/ܰۖᩴ;->ۜ:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_4

    .line 190
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۠ۖۧ;

    if-eqz p2, :cond_4

    .line 191
    invoke-virtual {p2}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 192
    invoke-virtual {p2}, Ll/۠ۖۧ;->dismiss()V

    .line 195
    :cond_4
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p2

    iput-object p2, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    .line 196
    new-instance p2, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-direct {p2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p2, Ll/ܰۖᩴ;->ۜ:Ljava/lang/ref/WeakReference;

    .line 197
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۙۙ()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩻۫ۚ;->ۙ(Ljava/lang/String;)J

    move-result-wide v1

    .line 198
    iget-object p2, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {p2}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p2

    .line 199
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/۫ۖᩴ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Ll/۫ۖᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/ۚۖᩴ;

    invoke-direct {v3, p0, p4}, Ll/ۚۖᩴ;-><init>(Ll/ܰۖᩴ;Ll/۠ۨܳ;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 204
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    new-instance v4, Ll/ۘۖᩴ;

    invoke-direct {v4, p0}, Ll/ۘۖᩴ;-><init>(Ll/ܰۖᩴ;)V

    .line 207
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p2

    invoke-virtual {p2, v4}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 208
    invoke-static {p1}, Ll/ۜܺۙ;->ۙ(Landroid/content/ContextWrapper;)Ll/ۜܺۙ;

    move-result-object v5

    .line 209
    new-instance v6, Ll/᩺ۖᩴ;

    invoke-direct {v6, p0}, Ll/᩺ۖᩴ;-><init>(Ll/ܰۖᩴ;)V

    .line 210
    new-instance p2, Landroid/content/IntentFilter;

    const-string p4, "bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"

    invoke-direct {p2, p4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6, p2}, Ll/ۜܺۙ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 211
    iget-object p2, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    new-instance p4, Ll/֫ۖᩴ;

    move-object v0, p4

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Ll/֫ۖᩴ;-><init>(JLbin/mt/plus/Main;Ll/ۙ᩻ۙ;Ll/ۜܺۙ;Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p2, p4}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 216
    sget-object p2, Ll/۟᩺ᩴ;->ۙ:Ll/ܽ᩻ۙ;

    iget-object p4, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    new-instance v0, Ll/ۧۖᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۧۖᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p4, v0}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    .line 218
    sget-object p2, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Ll/ܺ۠֫;

    const/4 v0, 0x1

    invoke-direct {p4, v0, p0, p3}, Ll/ܺ۠֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2, p4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 228
    iget-object v2, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    new-instance v5, Ll/۬ۡᩴ;

    invoke-direct {v5, p0}, Ll/۬ۡᩴ;-><init>(Ll/ܰۖᩴ;)V

    new-instance v6, Ll/ۙۖᩴ;

    invoke-direct {v6, p0}, Ll/ۙۖᩴ;-><init>(Ll/ܰۖᩴ;)V

    iget-object p0, p0, Ll/ܰۖᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    move-object v0, v7

    move-object v1, v8

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Ll/ܽۢۤ;->ۙ(Landroid/widget/TextView;Landroid/view/View;Ll/᩷ۨᩴ;Ll/ܽ֡֫;ZLl/۬ۡᩴ;Ll/۟֡֫;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILl/۠ۨܳ;)V
    .locals 9

    .line 120
    new-instance v0, Ll/᩻ۨᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/᩻ۨᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, v0}, Ll/᩶᩷ۧ;->ۙ(JLjava/lang/Runnable;)V

    .line 129
    iget-object v0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-static {v0}, Ll/᩻ۙܺ;->ۤ(Ll/᩷ۨᩴ;)Ll/ۧۙܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 132
    :try_start_0
    new-instance v1, Ll/᩸ܽܺ;

    invoke-direct {v1, v0}, Ll/᩸ܽܺ;-><init>(Ll/᩷ۨᩴ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :try_start_1
    invoke-static {v1}, Ll/ܿ᩻ܺ;->ۙ(Ll/᩸ܽܺ;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :try_start_2
    invoke-virtual {v1}, Ll/᩸ܽܺ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 132
    :try_start_3
    invoke-virtual {v1}, Ll/᩸ܽܺ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_0
    :goto_1
    move-object v7, v2

    const/4 v0, 0x0

    .line 138
    iput-boolean v0, p0, Ll/ܰۖᩴ;->֨:Z

    .line 140
    new-instance v0, Ll/᩸ۖᩴ;

    move-object v3, v0

    move-object v4, p0

    move-object v5, p1

    move v6, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Ll/᩸ۖᩴ;-><init>(Ll/ܰۖᩴ;Ll/۬֨ᩴ;ILjava/lang/String;Ll/۠ۨܳ;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܰۖᩴ;Ll/ܿ᩷᩸;)V
    .locals 0

    .line 229
    iput-object p1, p0, Ll/ܰۖᩴ;->᩶:Ll/ܿ᩷᩸;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܰۖᩴ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܰۖᩴ;->ۢ:Z

    return-void
.end method

.method public static ۙ(Ll/᩸ܽܺ;Ll/᩻ܽܺ;Ll/᩶ۤۤ;IZLl/᩸ᩴۤ;)V
    .locals 14

    move-object v6, p0

    .line 394
    invoke-virtual/range {p2 .. p3}, Ll/᩶ۤۤ;->ۙ(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܳۤ;

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    .line 211
    invoke-interface {v0}, Ll/۠ܳۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object v2

    .line 212
    invoke-interface {v0}, Ll/۠ܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v3

    .line 213
    invoke-interface {v0}, Ll/۠ܳۤ;->ᩴ()Ll/ۖܳۤ;

    move-result-object v4

    .line 214
    invoke-interface {v2}, Ll/ۤ۫ۤ;->۫()I

    move-result v5

    invoke-interface {v2}, Ll/ۤ۫ۤ;->getPackageName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p5

    invoke-virtual {v9, v5, v8}, Ll/᩸ᩴۤ;->ۙ(ILjava/lang/String;)Ll/᩻ᩴۤ;

    move-result-object v5

    .line 215
    invoke-interface {v2}, Ll/ۤ۫ۤ;->ۙ᩷()Ll/ܿۤۤ;

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/᩻ᩴۤ;->ۙ(Ll/ܿۤۤ;)V

    .line 216
    invoke-interface {v3}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v3

    invoke-virtual {v5, v3, v2}, Ll/᩻ᩴۤ;->᩷(ILjava/lang/String;)Ll/᩹ᩴۤ;

    move-result-object v2

    .line 217
    invoke-interface {v4}, Ll/ۖܳۤ;->۬()Ll/᩵ۤۤ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩹ᩴۤ;->ۙ(Ll/᩵ۤۤ;)Ll/ᩴᩴۤ;

    move-result-object v3

    .line 218
    invoke-interface {v0}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result v4

    invoke-interface {v0}, Ll/۠ܳۤ;->۬ۙ()Ljava/lang/String;

    move-result-object v5

    .line 102
    invoke-virtual {v2, v4, v5, v1}, Ll/᩹ᩴۤ;->ۙ(ILjava/lang/String;Z)V

    .line 219
    invoke-interface {v0}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ᩴᩴۤ;->ۙ(I)Ll/۫ᩴۤ;

    move-result-object v1

    .line 220
    invoke-virtual {v1, v0}, Ll/۫ᩴۤ;->ۙ(Ll/۠ܳۤ;)V

    goto :goto_1

    :cond_1
    move-object/from16 v9, p5

    .line 398
    :goto_1
    invoke-interface {v0}, Ll/۠ܳۤ;->۫ۙ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 401
    :cond_2
    invoke-interface {v0}, Ll/۠ܳۤ;->getValue()Ll/ۚ۫ۤ;

    move-result-object v0

    .line 402
    invoke-interface {v0}, Ll/ۚ۫ۤ;->᩸ۙ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 403
    invoke-interface {v0}, Ll/ۚ۫ۤ;->ᩴ᩷()Ll/ܶ۫ۤ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۫ۤ;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩸ܽܺ;->getEntry(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    if-eqz v0, :cond_5

    move-object v8, p1

    .line 405
    invoke-virtual {p1, v0, p0}, Ll/᩻ܽܺ;->ۙ(Ll/۟ܺܺ;Ll/᩸ܽܺ;)V

    const/4 v1, 0x0

    .line 1757
    invoke-virtual {p0, v0, v1}, Ll/᩸ܽܺ;->ۙ(Ll/۟ܺܺ;Ll/ۗۧܺ;)[B

    move-result-object v0

    .line 408
    :try_start_0
    invoke-static {v0}, Ll/ܰ᩻ܺ;->᩷([B)Ll/ܰ᩻ܺ;

    move-result-object v0

    .line 409
    invoke-virtual {v0}, Ll/ܰ᩻ܺ;->۫()Ll/ۡ᩻ܺ;

    move-result-object v10

    .line 411
    :cond_3
    invoke-virtual {v10}, Ll/ۡ᩻ܺ;->next()I

    move-result v0

    const/4 v11, 0x1

    if-eq v0, v11, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 413
    invoke-virtual {v10}, Ll/ۡ᩻ܺ;->getAttributeCount()I

    move-result v12

    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_3

    .line 415
    invoke-virtual {v10, v13}, Ll/ۡ᩻ܺ;->۫(I)I

    move-result v0

    if-ne v0, v11, :cond_4

    .line 416
    invoke-virtual {v10, v13}, Ll/ۡ᩻ܺ;->᩸(I)I

    move-result v3

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Ll/ܰۖᩴ;->ۙ(Ll/᩸ܽܺ;Ll/᩻ܽܺ;Ll/᩶ۤۤ;IZLl/᩸ᩴۤ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :catch_0
    nop

    goto/16 :goto_0

    :cond_5
    move-object v8, p1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private ۙ(Z)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 742
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v2, "apk_installation_confirm"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 746
    invoke-static {}, Ll/۟᩺ᩴ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1453
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v2

    const-string v3, "disable_install_by_shizuku"

    .line 1454
    invoke-virtual {v2, v3}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 746
    invoke-static {}, Ll/۟᩺ᩴ;->᩸()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 747
    :goto_0
    invoke-static {}, Ll/۟᩺ᩴ;->ᩴ()Z

    move-result v3

    if-nez v2, :cond_2

    if-nez v3, :cond_2

    const/4 p1, 0x0

    .line 752
    :cond_2
    iget-object v2, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    iget-object v3, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    if-eqz p1, :cond_3

    .line 753
    invoke-virtual {v3}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const v3, 0x7f1204c0

    .line 754
    invoke-virtual {p1, v3}, Ll/ۖۖۧ;->᩷(I)V

    .line 755
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v0

    const v2, 0x7f1204e3

    invoke-static {v2, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩷ۖᩴ;

    invoke-direct {v1, v0, p0}, Ll/᩷ۖᩴ;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f1208c9

    .line 756
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 757
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 758
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 760
    :cond_3
    invoke-virtual {v3}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    iget-object v0, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v0}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Ll/۟᩺ᩴ;->ۙ(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ۙ()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/ܰۖᩴ;->۬:Z

    return v0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 6

    sget-object v0, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    const/4 v1, 0x0

    .line 60
    sget-boolean v2, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    aget-short v0, v0, v1

    mul-int v1, v0, v0

    .line 321
    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v2, :cond_1

    goto/16 :goto_5

    :cond_1
    const v2, 0x7596400

    add-int/2addr v1, v2

    .line 458
    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_2

    goto/16 :goto_2

    :cond_2
    mul-int/lit16 v0, v0, 0x56c0

    sub-int/2addr v1, v0

    if-ltz v1, :cond_3

    const v0, 0xa06c

    goto :goto_0

    :cond_3
    const/16 v0, 0x1573

    .line 899
    :goto_0
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v1

    sget-object v2, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    const/4 v3, 0x1

    .line 452
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    const/16 v4, 0xa

    .line 698
    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v5, :cond_5

    goto/16 :goto_4

    .line 899
    :cond_5
    invoke-static {v2, v3, v4, v0}, Ll/ۖۜ;->ۤܿ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Ll/ۧ;->ۨۗܰ:I

    if-ltz v2, :cond_6

    goto :goto_1

    :cond_6
    sget-object v2, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    const/16 v3, 0xb

    const/4 v4, 0x1

    .line 459
    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v5, :cond_7

    goto :goto_5

    .line 899
    :cond_7
    invoke-static {v2, v3, v4, v0}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 155
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_8

    goto :goto_4

    .line 899
    :cond_8
    invoke-static {v1, v2}, Ll/ۖ᩵;->ܺۚ۟(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    .line 900
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    .line 901
    invoke-static {}, Ll/ۙ۠֫;->᩷()Z

    move-result p0

    if-eqz p0, :cond_c

    sget-object p0, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    const/16 v1, 0x4d

    const/16 v2, 0x14

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 472
    :goto_1
    sget p0, Ll/᩺;->۫۬۫:I

    if-gtz p0, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_4

    .line 295
    :cond_a
    :goto_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget p0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz p0, :cond_d

    goto :goto_5

    .line 901
    :cond_b
    invoke-static {p0, v1, v2, v0}, Ll/֡᩻;->ܺܽ۠([SIII)Ljava/lang/String;

    move-result-object p0

    .line 902
    invoke-static {p0}, Ll/᩸۠ۧ;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_c
    sget-object p0, Ll/ܰۖᩴ;->ۙ᩵۟:[S

    const/16 v1, 0xc

    const/16 v2, 0x41

    .line 372
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_e

    :cond_d
    :goto_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    .line 840
    :goto_5
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    const/4 p0, 0x0

    return p0

    .line 902
    :cond_e
    invoke-static {p0, v1, v2, v0}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object p0

    .line 904
    invoke-static {p0}, Ll/᩸۠ۧ;->᩷(Ljava/lang/CharSequence;)V

    :goto_6
    const/4 p0, 0x1

    return p0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ܰۖᩴ;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private ۤ()V
    .locals 19

    move-object/from16 v0, p0

    .line 460
    iget-boolean v1, v0, Ll/ܰۖᩴ;->ᩳ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 462
    iput-boolean v2, v0, Ll/ܰۖᩴ;->ᩳ:Z

    .line 465
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    .line 470
    :try_start_0
    invoke-virtual {v3, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    :cond_1
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/PackageInfo;

    .line 471
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v8, v8, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v8, v8, 0x81

    if-nez v8, :cond_2

    add-int/lit8 v6, v6, 0x1

    .line 477
    :cond_2
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-object v9, v0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v9}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v8, :cond_1

    goto :goto_0

    :catchall_0
    const/4 v6, 0x0

    :catchall_1
    :cond_3
    move-object v7, v4

    :goto_0
    const/4 v5, 0x1

    if-nez v7, :cond_4

    if-gt v6, v5, :cond_4

    .line 486
    :try_start_2
    iget-object v5, v0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v5}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    nop

    :cond_4
    :goto_1
    if-eqz v7, :cond_8

    .line 491
    iget-object v2, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 492
    iget v3, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 493
    iget-object v5, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 494
    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 495
    sget-object v8, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Android/data/"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v9

    .line 496
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 497
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    .line 498
    :cond_5
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x22

    if-lt v10, v11, :cond_6

    invoke-static {}, Ll/ۘ۟ᩴ;->᩸()Ll/᩹۟ᩴ;

    move-result-object v10

    invoke-interface {v10}, Ll/᩹۟ᩴ;->ۙ()Z

    move-result v10

    if-nez v10, :cond_6

    .line 499
    iget-object v10, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v10, v10, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v10, v10, 0x81

    if-nez v10, :cond_6

    .line 501
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :cond_6
    move-object v9, v4

    .line 504
    :goto_2
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Android/obb/"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v8

    .line 506
    invoke-virtual {v8}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result v10

    if-eqz v10, :cond_7

    .line 507
    invoke-virtual {v8}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v4

    .line 509
    :cond_7
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v8, v8, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 510
    iget-wide v10, v7, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 511
    iget-wide v12, v7, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    move-object/from16 v18, v6

    move-object v6, v2

    move-object v2, v4

    move-object/from16 v4, v18

    goto :goto_3

    :cond_8
    const-wide/16 v10, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v2, v4

    move-object v5, v2

    move-object v6, v5

    move-object v9, v6

    move-wide v12, v10

    :goto_3
    const v7, 0x7f0a0075

    const v14, 0x7f0a05f2

    if-eqz v4, :cond_9

    .line 513
    iget-object v15, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v15, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v15

    if-nez v15, :cond_9

    .line 514
    iget-object v15, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v15, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 515
    invoke-virtual {v7}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_8

    :cond_9
    const v7, 0x7f0a05f4

    if-eqz v4, :cond_e

    .line 520
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v1, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 521
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 522
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a05f5

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    if-eqz v5, :cond_a

    const/high16 v1, 0x41500000    # 13.0f

    .line 525
    iget-object v7, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v15, 0x7f0a05f3

    invoke-virtual {v7, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 526
    iget-object v7, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v15, 0x7f0a013c

    invoke-virtual {v7, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 527
    new-instance v15, Landroid/text/SpannableString;

    invoke-direct {v15, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 528
    new-instance v5, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v1}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v14

    invoke-direct {v5, v14}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v15}, Landroid/text/SpannableString;->length()I

    move-result v14

    const/16 v1, 0x11

    move-wide/from16 v16, v12

    const/4 v12, 0x0

    invoke-virtual {v15, v5, v12, v14, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 529
    invoke-virtual {v7, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 530
    invoke-static {v7}, Ll/ܳۤܺ;->᩷(Landroid/widget/TextView;)V

    .line 531
    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/high16 v1, 0x41500000    # 13.0f

    goto :goto_4

    :cond_a
    move-wide/from16 v16, v12

    const/high16 v1, 0x41500000    # 13.0f

    .line 533
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a05f3

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v7, 0x8

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    if-eqz v9, :cond_b

    .line 536
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a05f6

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 537
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a0647

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v7, 0x7f120226

    invoke-static {v7}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, " 1"

    invoke-virtual {v12, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 538
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v12, 0x7f0a0635

    invoke-virtual {v5, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    invoke-static {v7}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v7

    const-string v12, " 2"

    invoke-virtual {v7, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 539
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a013d

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 540
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 541
    new-instance v9, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v1}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v12

    invoke-direct {v9, v12}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    move-result v12

    const/4 v13, 0x0

    const/16 v14, 0x11

    invoke-virtual {v7, v9, v13, v12, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 542
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 543
    invoke-static {v5}, Ll/ܳۤܺ;->᩷(Landroid/widget/TextView;)V

    .line 544
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    .line 546
    :cond_b
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a05f6

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v7, 0x8

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    if-eqz v2, :cond_c

    .line 549
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v7, 0x7f0a05f9

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 550
    iget-object v5, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v9, 0x7f0a042e

    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 551
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 552
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v1}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v12

    invoke-direct {v2, v12}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v9}, Landroid/text/SpannableString;->length()I

    move-result v12

    const/16 v13, 0x11

    invoke-virtual {v9, v2, v7, v12, v13}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 553
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 554
    invoke-static {v5}, Ll/ܳۤܺ;->᩷(Landroid/widget/TextView;)V

    .line 555
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_6

    .line 557
    :cond_c
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v5, 0x7f0a05f9

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v5, 0x8

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 563
    :goto_6
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v5, 0x7f0a02c1

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 565
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v5, 0x7f0a0075

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 566
    new-instance v5, Landroid/text/SpannableString;

    invoke-direct {v5, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 567
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v1}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v1

    invoke-direct {v4, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v5}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v6, 0x0

    const/16 v7, 0x11

    invoke-virtual {v5, v4, v6, v1, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 568
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    invoke-static {v2}, Ll/ܳۤܺ;->᩷(Landroid/widget/TextView;)V

    .line 570
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 572
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a06a9

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 573
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a0208

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v10, v11}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 574
    iget-object v1, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v2, 0x7f0a02ed

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static/range {v16 .. v17}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    int-to-long v1, v3

    .line 576
    iget-object v3, v0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v3}, Ll/ۧۙܺ;->֫()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-lez v5, :cond_d

    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    const/4 v1, 0x0

    :goto_7
    iput-boolean v1, v0, Ll/ܰۖᩴ;->ۢ:Z

    goto :goto_8

    .line 578
    :cond_e
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v2, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 579
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f3

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 580
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 581
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f5

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 582
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f6

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 583
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f7

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 584
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f8

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 585
    iget-object v2, v0, Ll/ܰۖᩴ;->ۡ:Landroid/view/View;

    const v4, 0x7f0a05f9

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const/4 v2, 0x0

    .line 587
    iput-boolean v2, v0, Ll/ܰۖᩴ;->ۢ:Z

    if-eqz v1, :cond_f

    .line 589
    invoke-direct {v0, v2}, Ll/ܰۖᩴ;->ۙ(Z)V

    :cond_f
    :goto_8
    return-void
.end method

.method public static synthetic ۤ(Ll/ܰۖᩴ;)V
    .locals 0

    .line 216
    invoke-direct {p0}, Ll/ܰۖᩴ;->ۤ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܰۖᩴ;)Ll/᩷ۨᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/ܰۖᩴ;)Ll/ܿ᩷᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->᩶:Ll/ܿ᩷᩸;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܰۖᩴ;)Ll/ۧۙܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    return-object p0
.end method

.method public static bridge synthetic ܶ(Ll/ܰۖᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܰۖᩴ;->ۤ()V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܰۖᩴ;)Ll/۠ۨܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܰۖᩴ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܰۖᩴ;->ᩳ:Z

    return-void
.end method

.method public static synthetic ᩴ(Ll/ܰۖᩴ;)V
    .locals 2

    .line 756
    iget-object v0, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    iget-object v1, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    iget-object p0, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {p0}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ll/۟᩺ᩴ;->ۙ(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-boolean v0, Ll/ܰۖᩴ;->۬:Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܰۖᩴ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܰۖᩴ;->ۙ(Z)V

    return-void
.end method

.method public static synthetic ᩷(Ll/ܰۖᩴ;)Z
    .locals 0

    .line 229
    iget-object p0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ᩸(Ll/ܰۖᩴ;)V
    .locals 5

    const v0, 0x7f12036a

    .line 271
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120368

    .line 272
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120369

    .line 273
    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/CharSequence;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v1, 0x2

    aput-object v2, v3, v1

    .line 275
    iget-object v1, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    invoke-virtual {v1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v2, 0x7f120367

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v2, Ll/۫᩶ۤ;

    invoke-direct {v2, v0, p0}, Ll/۫᩶ۤ;-><init>(ILjava/lang/Object;)V

    const/4 p0, -0x1

    invoke-virtual {v1, v3, p0, v2}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    .line 371
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܰۖᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܰۖᩴ;->ۢ:Z

    return p0
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 596
    iget-object p1, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    iget-object p2, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-static {p1, p2}, Ll/֫ۘܳ;->ᩴ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 766
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a013c

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܰۖᩴ;->ۖ:Ll/۠ۨܳ;

    if-ne v0, v1, :cond_1

    .line 767
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 768
    invoke-static {}, Ll/۟۠ۧ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 769
    iget-object v0, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v0}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->᩷(Ljava/lang/String;)Ll/᩻᩶ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 771
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/᩻᩶ᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/data"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 775
    :cond_0
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 776
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a013d

    if-ne v0, v1, :cond_3

    .line 777
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 778
    invoke-static {}, Ll/۟۠ۧ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 779
    iget-object v0, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {v0}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->᩷(Ljava/lang/String;)Ll/᩻᩶ᩴ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 781
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/᩻᩶ᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/android_data"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 785
    :cond_2
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 786
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a042e

    if-ne v0, v1, :cond_4

    .line 787
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 788
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 789
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0075

    if-ne v0, v1, :cond_5

    .line 790
    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 791
    new-instance v0, Ljava/io/File;

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 792
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/۠ۨܳ;->᩸(Ljava/lang/String;)V

    .line 793
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 795
    :cond_5
    iget-object p1, p0, Ll/ܰۖᩴ;->ܰ:Ll/ۧۙܺ;

    invoke-virtual {p1}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܰۖᩴ;->֡:Ll/۠ۖۧ;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩷ܿ֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/᩷ܿ֫;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, Ll/ܰۖᩴ;->۟:Ll/᩷ۨᩴ;

    invoke-static {v3, v0, p1, v1}, Ll/ܰۖᩴ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;Ljava/lang/String;Ll/᩷ܿ֫;)V

    return-void
.end method
