.class public final Ll/ۛ᩸ۚ;
.super Ljava/lang/Object;
.source "Y6Y9"


# static fields
.field private static final ۘ֫᩺:[S

.field public static final ۙ:Ljava/util/WeakHashMap;

.field public static ۤ:I

.field public static final ܳ:Ljava/util/Set;

.field public static final ᩴ:Landroid/content/BroadcastReceiver;

.field public static ᩷:Z

.field public static ᩸:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x44

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛ᩸ۚ;->ۘ֫᩺:[S

    .line 81
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ۛ᩸ۚ;->ܳ:Ljava/util/Set;

    .line 82
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ۛ᩸ۚ;->ۙ:Ljava/util/WeakHashMap;

    .line 824
    new-instance v0, Ll/ۨ᩸ۚ;

    invoke-direct {v0}, Landroid/content/BroadcastReceiver;-><init>()V

    sput-object v0, Ll/ۛ᩸ۚ;->ᩴ:Landroid/content/BroadcastReceiver;

    return-void

    :array_0
    .array-data 2
        0x15f2s
        -0x1508s
        0x12dfs
        0x57cs
        -0x12d4s
        -0x42cs
        0x26e4s
        0x6d2s
        -0x4ebs
        0x2321s
        0x2d92s
        -0xb85s
        0x6ds
        0x71f0s
    .end array-data
.end method

.method public static ۙ(Ll/᩶ܳۚ;)I
    .locals 1

    .line 600
    sget-object v0, Ll/۫᩸ۚ;->ۙ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const p0, 0x7f1205f5

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    :cond_1
    const p0, 0x7f1205f0

    return p0

    :cond_2
    const p0, 0x7f1205f3

    return p0

    :cond_3
    const p0, 0x7f1205f4

    return p0

    :cond_4
    const p0, 0x7f1205ef

    return p0
.end method

.method public static synthetic ۙ(Landroid/view/View;)V
    .locals 1

    const v0, 0x7f0a018d

    .line 396
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Ll/ۛ᩸ۚ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public static native ۙ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/view/View;Landroid/view/View;)V
.end method

.method public static ۙ(Landroid/widget/TextView;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 272
    invoke-static {p0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 274
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 275
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 276
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 277
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/֨ܶ;Ll/֨ܶ;)V
    .locals 0

    .line 532
    invoke-static {p0, p1}, Ll/ۛ᩸ۚ;->᩷(Ll/֨ܶ;Ll/֨ܶ;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۛ᩸ۚ;->ۤ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;Ll/ܽ֡֫;Ll/۠ۖۧ;)V
    .locals 2

    .line 464
    invoke-static {p0, p1}, Ll/ۛ᩸ۚ;->ۤ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 467
    :cond_0
    :try_start_0
    invoke-static {}, Ll/֡ܳۚ;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 468
    invoke-static {v0}, Ll/֡ܳۚ;->ᩴ(Ljava/lang/String;)V

    .line 471
    :cond_1
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 472
    invoke-virtual {p1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ll/ܿܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 475
    iget-object p1, p1, Ll/ܿܳۚ;->ܰ:Ll/᩶ܳۚ;

    invoke-static {p1}, Ll/ۛ᩸ۚ;->ۙ(Ll/᩶ܳۚ;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 477
    invoke-virtual {p3}, Ll/۠ۖۧ;->۫()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p1}, Ll/ۛ᩸ۚ;->ۙ(Ll/᩶ܳۚ;)I

    move-result p0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/֫ۖ᩸;Ll/᩺ۤۚ;Ll/᩹ۖ᩸;Ll/ܽ֡֫;)V
    .locals 7

    .line 374
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 375
    invoke-virtual {p1}, Ll/᩺ۤۚ;->run()V

    .line 745
    invoke-virtual {p2}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۚۤ;->᩷(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const v3, 0x7f120a1a

    .line 747
    invoke-static {v3}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 749
    :cond_0
    invoke-virtual {p0, v1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 750
    invoke-virtual {p0, v2}, Ll/֫ۖ᩸;->᩷(Z)V

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 761
    :cond_1
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-static {}, Ll/ۛܳۚ;->ۚ()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v3, v5, :cond_3

    .line 763
    :cond_2
    :try_start_0
    new-instance v3, Ljava/net/ServerSocket;

    invoke-direct {v3}, Ljava/net/ServerSocket;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 764
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/net/ServerSocket;->setReuseAddress(Z)V

    .line 765
    new-instance v5, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-virtual {v3, v5}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 766
    :try_start_2
    invoke-virtual {v3}, Ljava/net/ServerSocket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    .line 773
    :cond_3
    invoke-virtual {p0, v1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 774
    invoke-virtual {p0, v2}, Ll/֫ۖ᩸;->᩷(Z)V

    .line 377
    invoke-static {}, Ll/֡ܳۚ;->᩸()I

    move-result v0

    .line 378
    invoke-virtual {p2}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/֡ܳۚ;->ܳ(Ljava/lang/String;)V

    .line 380
    invoke-virtual {p0, v2}, Ll/֫ۖ᩸;->ۙ(Z)V

    .line 381
    invoke-static {}, Ll/ۛܳۚ;->֫()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, Ll/֡ܳۚ;->᩸()I

    move-result p2

    if-eq v0, p2, :cond_4

    .line 382
    sput-boolean v4, Ll/ۛ᩸ۚ;->᩷:Z

    .line 124
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object p2

    .line 125
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۛܳۚ;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 385
    :cond_4
    invoke-static {}, Ll/ۛ᩸ۚ;->ᩴ()V

    const p2, 0x7f120a90

    .line 386
    invoke-virtual {p3, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֫ۖ᩸;->ۤ(Ljava/lang/CharSequence;)V

    const-wide/16 p2, 0x7d0

    .line 388
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    .line 763
    :try_start_3
    invoke-virtual {v3}, Ljava/net/ServerSocket;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p3

    :try_start_4
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 767
    :goto_2
    instance-of p1, p1, Ljava/net/BindException;

    if-eqz p1, :cond_5

    const p1, 0x7f120af4

    goto :goto_3

    :cond_5
    const p1, 0x7f12075e

    :goto_3
    new-array p3, v4, [Ljava/lang/Object;

    aput-object v0, p3, v2

    invoke-static {p1, p3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 769
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public static synthetic ۙ(Ll/۠᩷ۚ;Ll/᩻֫ܺ;Ll/֫ۖ᩸;Ll/᩹ۖ᩸;Ll/ܽ֡֫;Ll/۠ۖۧ;Ll/۠ۖۧ;)V
    .locals 0

    .line 452
    invoke-virtual {p0}, Ll/۠᩷ۚ;->᩷()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p1}, Ll/᩻֫ܺ;->ۙ()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 453
    invoke-static {p2, p3}, Ll/ۛ᩸ۚ;->᩸(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 455
    :cond_0
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۢۙۚ;->ۙ(Ljava/lang/String;)V

    .line 456
    new-instance p0, Ll/ۧ۠֫;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5, p6}, Ll/ۧ۠֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4, p0}, Ll/᩸᩷ۚ;->ۙ(Ll/ܽ֡֫;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;)V
    .locals 15

    const v0, 0x7f0d00d1

    .line 97
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0308

    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    const v1, 0x7f0a02e6

    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    const v1, 0x7f0a0213

    .line 100
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const v1, 0x7f0a0095

    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const v1, 0x7f0a0558

    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0268

    .line 103
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a035a

    .line 104
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x3

    new-array v7, v4, [Landroid/view/View;

    const/4 v10, 0x0

    aput-object v3, v7, v10

    const/4 v11, 0x1

    aput-object v1, v7, v11

    const/4 v12, 0x2

    aput-object v2, v7, v12

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v4, :cond_0

    .line 105
    aget-object v13, v7, v12

    .line 106
    invoke-virtual {v13}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v14

    invoke-static {v13, v14}, Ll/ۛ᩹;->ۙ(Landroid/view/View;Ljava/lang/CharSequence;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_0
    new-array v4, v11, [Z

    aput-boolean v11, v4, v10

    .line 110
    new-instance v7, Ll/᩸ۤۚ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v12

    .line 118
    invoke-virtual {v12, v0}, Ll/ۖۖۧ;->᩷(Landroid/view/View;)V

    const v13, 0x7f1209d7

    const/4 v14, 0x0

    .line 119
    invoke-virtual {v12, v13, v14}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v13, 0x7f1209d9

    .line 120
    invoke-virtual {v12, v13, v14}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v13, 0x7f1209da

    .line 121
    invoke-virtual {v12, v13, v14}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v13, Ll/᩹ۤۚ;

    invoke-direct {v13, v4, p0, v7}, Ll/᩹ۤۚ;-><init>([ZLl/ܽ֡֫;Ll/᩸ۤۚ;)V

    .line 122
    invoke-virtual {v12, v13}, Ll/ۖۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 130
    invoke-virtual {v12}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object v12

    .line 132
    invoke-virtual {v12}, Ll/۠ۖۧ;->ܳ()Landroid/view/Window;

    move-result-object v13

    const/16 v14, 0x80

    invoke-virtual {v13, v14}, Landroid/view/Window;->addFlags(I)V

    new-array v11, v11, [Ll/۠ۖۧ;

    aput-object v12, v11, v10

    .line 134
    new-instance v10, Ll/۟ۤۚ;

    invoke-direct {v10, p0, v7}, Ll/۟ۤۚ;-><init>(Ll/ܽ֡֫;Ll/᩸ۤۚ;)V

    invoke-virtual {v12, v10}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnShowListener;)V

    .line 138
    invoke-virtual {v12}, Ll/۠ۖۧ;->ۚ()V

    const v7, 0x7f0a030a

    .line 141
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 140
    invoke-static {v7, p0, v12}, Ll/ۡ᩷ܺ;->ۙ(Landroid/view/View;Ll/ܽ֡֫;Ll/۠ۖۧ;)Ll/֨᩷ܺ;

    move-result-object v7

    .line 142
    invoke-virtual {v12}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v10

    .line 143
    new-instance v13, Ll/۬ۤۚ;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v10, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    invoke-virtual {v12}, Ll/۠ۖۧ;->ۤ()Landroid/widget/Button;

    move-result-object v13

    new-instance v14, Ll/ۙ᩸ۚ;

    invoke-direct {v14, p0, v12}, Ll/ۙ᩸ۚ;-><init>(Ll/ܽ֡֫;Ll/۠ۖۧ;)V

    invoke-virtual {v13, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    invoke-static {}, Ll/᩻֫ܺ;->ᩴ()Ll/᩻֫ܺ;

    move-result-object v12

    .line 152
    new-instance v13, Ll/᩷᩸ۚ;

    invoke-direct {v13, v12, p0}, Ll/᩷᩸ۚ;-><init>(Ll/᩻֫ܺ;Ll/ܽ֡֫;)V

    invoke-virtual {v3, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    new-instance v3, Ll/ۤ᩸ۚ;

    const/4 v13, 0x0

    invoke-direct {v3, v13, v12, p0}, Ll/ۤ᩸ۚ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    new-instance v3, Ll/᩸᩸ۚ;

    invoke-direct {v3, v12, p0, v11, v13}, Ll/᩸᩸ۚ;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    new-instance v1, Ll/ᩴ᩸ۚ;

    invoke-direct {v1, v12, p0}, Ll/ᩴ᩸ۚ;-><init>(Ll/᩻֫ܺ;Ll/ܽ֡֫;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    new-instance p0, Ll/ܳ᩸ۚ;

    move-object v2, p0

    move-object v3, v4

    move-object v4, v7

    move-object v7, v10

    invoke-direct/range {v2 .. v9}, Ll/ܳ᩸ۚ;-><init>([ZLl/֨᩷ܺ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/view/View;Landroid/view/View;)V

    .line 186
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 803
    sget-object v0, Ll/ۛ᩸ۚ;->ܳ:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 188
    invoke-static {}, Ll/ۛ᩸ۚ;->ᩴ()V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/۠ۖۧ;Ll/֨ܶ;Ll/֨ܶ;Landroid/widget/Button;Z)V
    .locals 8

    if-eqz p5, :cond_1

    .line 521
    invoke-static {p0}, Ll/۟۠ۧ;->ۙ(Landroid/content/Context;)Z

    move-result p5

    if-nez p5, :cond_1

    const/4 p5, 0x0

    .line 614
    invoke-virtual {p2, p5}, Ll/֨ܶ;->setChecked(Z)V

    .line 615
    instance-of v0, p0, Ll/᩵᩸ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 616
    move-object v0, p0

    check-cast v0, Ll/᩵᩸ۧ;

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    :goto_0
    const/4 v0, 0x1

    new-array v7, v0, [Z

    aput-boolean p5, v7, p5

    .line 618
    new-instance p5, Ll/᩹᩸ۚ;

    move-object v2, p5

    move-object v3, p2

    move-object v4, p0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Ll/᩹᩸ۚ;-><init>(Ll/֨ܶ;Ll/ܽ֡֫;Ll/᩵᩸ۧ;Ll/۠ۖۧ;[Z)V

    .line 650
    :try_start_0
    invoke-static {p0, p5}, Ll/۟֨ܺ;->ۤ(Landroid/content/Context;Ll/֡֨ܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 652
    invoke-virtual {p5}, Ll/᩹᩸ۚ;->ۙ()V

    .line 546
    invoke-virtual {p0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 525
    :cond_1
    :goto_1
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    .line 526
    invoke-virtual {p3, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 527
    invoke-virtual {p4, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 528
    invoke-static {p2, p3}, Ll/ۛ᩸ۚ;->᩷(Ll/֨ܶ;Ll/֨ܶ;)V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/᩸ۤۚ;)V
    .locals 4

    .line 865
    sget-boolean v0, Ll/ۛ᩸ۚ;->᩸:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 867
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 868
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.net.wifi.WIFI_AP_STATE_CHANGED"

    .line 869
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 870
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 871
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v2

    sget-object v3, Ll/ۛ᩸ۚ;->ᩴ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 873
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "bin.mt.mcp.ACTION_STARTED"

    .line 874
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "bin.mt.mcp.ACTION_STOPPED"

    .line 875
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "bin.mt.mcp.ACTION_FAILED_TO_START"

    .line 876
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 877
    invoke-static {v3, v0}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 878
    sput-boolean v1, Ll/ۛ᩸ۚ;->᩸:Z

    .line 880
    :cond_0
    sget v0, Ll/ۛ᩸ۚ;->ۤ:I

    add-int/2addr v0, v1

    sput v0, Ll/ۛ᩸ۚ;->ۤ:I

    .line 881
    sget-object v0, Ll/ۛ᩸ۚ;->ۙ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_0

    .line 882
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v1, v2

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    invoke-virtual {p0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    return-void
.end method

.method public static ۙ(Ll/᩶֨֫;Ll/֡ۤۚ;Ll/ۤᩴۚ;Ll/ܽ֡֫;Ll/ܽۤۚ;Ll/֫ۖ᩸;Ll/᩺ۤۚ;Ll/۫ۤۚ;Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 546
    invoke-virtual {p0}, Ll/ܶ֨֫;->ۙ()V

    .line 547
    invoke-virtual {p1}, Ll/֡ۤۚ;->run()V

    .line 548
    invoke-virtual {p2}, Ll/ۤᩴۚ;->᩷()V

    .line 549
    invoke-virtual {p3}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-virtual {p0, p4}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    .line 550
    invoke-virtual {p5, p6}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 551
    invoke-virtual {p6}, Ll/᩺ۤۚ;->run()V

    .line 553
    invoke-virtual {p7}, Ll/۫ۤۚ;->run()V

    .line 554
    invoke-static {p8, p9}, Ll/ۛ᩸ۚ;->᩸(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 555
    invoke-static {}, Ll/ۢۙۚ;->ۙ()I

    move-result p0

    .line 556
    invoke-virtual {p9}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۢۙۚ;->ۙ(Ljava/lang/String;)V

    .line 557
    invoke-static {}, Ll/ۢۙۚ;->ۙ()I

    move-result p1

    if-eq p1, p0, :cond_0

    .line 558
    sget p0, Ll/ۛܳۚ;->ᩳ:I

    .line 96
    sget-object p0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Ll/۬ۧܺ;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Ll/۬ۧܺ;-><init>(I)V

    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ([ZLl/֨᩷ܺ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 178
    aget-boolean p0, p0, v0

    if-nez p0, :cond_0

    return-void

    .line 181
    :cond_0
    invoke-virtual {p1}, Ll/֨᩷ܺ;->run()V

    .line 182
    invoke-static {p2, p3, p4, p5, p6}, Ll/ۛ᩸ۚ;->ۙ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static ۙ([ZLl/ܽ֡֫;Ll/᩸ۤۚ;)V
    .locals 2

    const/4 v0, 0x0

    .line 123
    aput-boolean v0, p0, v0

    .line 124
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-virtual {p0, p2}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    .line 889
    sget-object p0, Ll/ۛ᩸ۚ;->ۙ:Ljava/util/WeakHashMap;

    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 891
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 892
    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 894
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    :cond_1
    :goto_0
    sget p0, Ll/ۛ᩸ۚ;->ۤ:I

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr p0, v0

    .line 900
    sput p0, Ll/ۛ᩸ۚ;->ۤ:I

    .line 901
    invoke-static {}, Ll/ۛ᩸ۚ;->᩸()V

    .line 126
    :goto_1
    instance-of p0, p1, Ll/᩵᩸ۧ;

    if-eqz p0, :cond_3

    .line 127
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ۙ()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/ۛ᩸ۚ;->᩷:Z

    return v0
.end method

.method public static ۙ(Lbin/mt/plus/Main;)Z
    .locals 2

    if-eqz p0, :cond_0

    .line 820
    invoke-virtual {p0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    invoke-virtual {v0, v1}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/ۛ᩸ۚ;->ۙ:Ljava/util/WeakHashMap;

    .line 821
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۤ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 577
    :try_start_0
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/֡ܳۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 578
    invoke-virtual {p0, v0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 579
    invoke-virtual {p0, v1}, Ll/֫ۖ᩸;->᩷(Z)V
    :try_end_0
    .catch Ll/ܿܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 582
    iget-object p1, p1, Ll/ܿܳۚ;->ܰ:Ll/᩶ܳۚ;

    invoke-static {p1}, Ll/ۛ᩸ۚ;->ۙ(Ll/᩶ܳۚ;)I

    move-result p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public static bridge synthetic ۤ()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۛ᩸ۚ;->᩸()V

    return-void
.end method

.method public static ᩴ()V
    .locals 2

    .line 810
    sget-object v0, Ll/ۛ᩸ۚ;->ܳ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 811
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-boolean v0, Ll/ۛ᩸ۚ;->᩷:Z

    return-void
.end method

.method public static native ᩷(Landroid/view/View;)V
.end method

.method public static ᩷(Ll/֨ܶ;Ll/֨ܶ;)V
    .locals 3

    .line 589
    invoke-static {}, Ll/֡ܳۚ;->ܳ()Z

    move-result v0

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-ne v0, v1, :cond_0

    .line 187
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "floating_button_stick_to_edge"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 590
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 591
    :cond_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-static {p0, p1}, Ll/֡ܳۚ;->ۙ(ZZ)V

    .line 592
    invoke-static {}, Ll/ۛܳۚ;->ۧ()V

    .line 593
    invoke-static {}, Ll/ۛ᩸ۚ;->ᩴ()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۛ᩸ۚ;->᩸(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z

    return-void
.end method

.method public static ᩸()V
    .locals 2

    .line 908
    sget-boolean v0, Ll/ۛ᩸ۚ;->᩸:Z

    if-eqz v0, :cond_0

    sget v0, Ll/ۛ᩸ۚ;->ۤ:I

    if-nez v0, :cond_0

    sget-boolean v0, Ll/ۛ᩸ۚ;->᩷:Z

    if-nez v0, :cond_0

    .line 909
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    sget-object v1, Ll/ۛ᩸ۚ;->ᩴ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 910
    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 911
    sput-boolean v0, Ll/ۛ᩸ۚ;->᩸:Z

    :cond_0
    return-void
.end method

.method public static ᩸(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z
    .locals 4

    .line 782
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120077

    const/4 v1, 0x0

    .line 785
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-lt p1, v2, :cond_0

    const/16 v3, 0x64

    if-gt p1, v3, :cond_0

    const/4 p1, 0x0

    .line 794
    invoke-virtual {p0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 795
    invoke-virtual {p0, v1}, Ll/֫ۖ᩸;->᩷(Z)V

    return v2

    .line 791
    :cond_0
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return v1

    .line 787
    :catch_0
    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return v1
.end method
