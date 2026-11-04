.class public Ll/ᩳۘ۫;
.super Ll/ᩳۛ۫;
.source "5AG2"


# static fields
.field public static final ۙۙ:Ljava/text/SimpleDateFormat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation
.end field

.field public static final synthetic ۬:I


# instance fields
.field public ֨:Ll/ۢۘ۫;

.field public ۖ:Ljava/lang/Boolean;

.field public volatile ۜ:Ljava/lang/Boolean;

.field public ۠:Z

.field public ۡ:Ljava/lang/Boolean;

.field public ۢ:Ljava/lang/Boolean;

.field public final ᩳ:Ll/ܶ᩵۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 157
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ᩳۘ۫;->ۙۙ:Ljava/text/SimpleDateFormat;

    const-string v1, "GMT"

    .line 160
    invoke-static {v1}, Ll/ۤۚۗ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method public constructor <init>(ILl/֡ۗ۫;)V
    .locals 3

    .line 76
    invoke-direct {p0, p1, p2}, Ll/ᩳۛ۫;-><init>(ILl/֡ۗ۫;)V

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Ll/ᩳۘ۫;->۠:Z

    .line 51
    new-instance v0, Ll/ܶ᩵۫;

    new-instance v1, Ll/ۘۘ۫;

    invoke-direct {v1, p0}, Ll/ۘۘ۫;-><init>(Ll/ᩳۘ۫;)V

    .line 73
    invoke-virtual {p0}, Ll/ᩳۘ۫;->ۤ()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ܶ᩵۫;-><init>(Ll/ܺ᩵۫;Z)V

    iput-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    .line 77
    invoke-static {p1, p2}, Ll/ۢۘ۫;->ۙ(ILl/֡ۗ۫;)Ll/ۢۘ۫;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    return-void
.end method

.method public constructor <init>(ILl/֡ۗ۫;Ll/᩵ۚۤ;)V
    .locals 0

    .line 93
    invoke-direct {p0, p1, p2}, Ll/ᩳۘ۫;-><init>(ILl/֡ۗ۫;)V

    .line 94
    invoke-virtual {p3}, Ll/᩵ۚۤ;->᩹()Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    .line 95
    invoke-virtual {p3}, Ll/᩵ۚۤ;->᩹()Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ۫;->ۖ:Ljava/lang/Boolean;

    .line 96
    invoke-virtual {p3}, Ll/᩵ۚۤ;->᩹()Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    .line 97
    invoke-virtual {p3}, Ll/᩵ۚۤ;->᩹()Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    .line 98
    invoke-virtual {p3}, Ll/᩵ۚۤ;->ܳ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ᩳۘ۫;->۠:Z

    .line 99
    iget-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 100
    iget-object p2, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵۫;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method private ۙ(JLjava/lang/String;Z)Ljava/io/InputStream;
    .locals 5

    .line 653
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 258
    :try_start_0
    invoke-static {p3}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 261
    invoke-interface {v0, p1, p2}, Ll/֨ۘ۫;->ۙ(J)V

    .line 262
    invoke-static {p3}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/֨ۘ۫;->ᩴ(Ljava/lang/String;)Ll/ۤ᩺ۨ;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_0

    .line 279
    new-instance p1, Ll/᩶ۘ۫;

    invoke-direct {p1, p0, v3, v0}, Ll/᩶ۘ۫;-><init>(Ll/ᩳۘ۫;Ljava/io/InputStream;Ll/֨ۘ۫;)V

    return-object p1

    .line 264
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v4

    .line 259
    :cond_1
    invoke-interface {v0}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 275
    :goto_0
    invoke-interface {v0, v1, v2}, Ll/֨ۘ۫;->ۙ(J)V

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 277
    throw p1

    :catch_2
    move-exception v3

    .line 267
    invoke-interface {v0, v1, v2}, Ll/֨ۘ۫;->ۙ(J)V

    if-eqz p4, :cond_2

    .line 268
    invoke-static {v3}, Ll/ᩳۘ۫;->ۙ(Ljava/io/IOException;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 661
    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/֨ۘ۫;)V

    const/4 p4, 0x0

    .line 270
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ᩳۘ۫;->ۙ(JLjava/lang/String;Z)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 657
    :cond_2
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 273
    throw v3
.end method

.method private ۙ(Ll/֡ۘ۫;)Ljava/lang/Object;
    .locals 3

    .line 653
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0

    .line 695
    :try_start_0
    invoke-interface {p1, v0}, Ll/֡ۘ۫;->ۙ(Ll/֨ۘ۫;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 697
    :try_start_1
    invoke-static {v1}, Ll/ᩳۘ۫;->ۙ(Ljava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 661
    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/֨ۘ۫;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 653
    :try_start_2
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 703
    :try_start_3
    invoke-interface {p1, v0}, Ll/֡ۘ۫;->ۙ(Ll/֨ۘ۫;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_1

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    :cond_1
    return-object p1

    :catchall_1
    move-exception p1

    const/4 v0, 0x0

    goto :goto_0

    .line 705
    :cond_2
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    if-eqz v0, :cond_3

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 710
    :cond_3
    throw p1
.end method

.method public static synthetic ۙ(Ll/ᩳۘ۫;Ll/֨ۘ۫;)Ljava/lang/String;
    .locals 1

    .line 180
    iget-object p0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    iget-object p0, p0, Ll/ۢۘ۫;->᩸:Ljava/lang/String;

    .line 181
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p0}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 182
    invoke-interface {p1}, Ll/֨ۘ۫;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 184
    :cond_0
    invoke-interface {p1}, Ll/֨ۘ۫;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۘ۫;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 562
    invoke-static {p1}, Ll/ۜ᩵ܳ;->۫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 563
    new-instance v0, Ll/᩵ۘ۫;

    invoke-direct {v0, p0, p1}, Ll/᩵ۘ۫;-><init>(Ll/ᩳۘ۫;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/֡ۘ۫;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۘ۫;Ljava/lang/String;Ll/֨ۘ۫;)Ljava/util/List;
    .locals 11

    .line 564
    iget-object v0, p0, Ll/ᩳۘ۫;->ۖ:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 565
    sget-object v0, Ll/᩻ۛۨ;->ۨۙ:Ll/᩻ۛۨ;

    invoke-interface {p2, v0}, Ll/֨ۘ۫;->ۙ(Ll/᩻ۛۨ;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۘ۫;->ۖ:Ljava/lang/Boolean;

    .line 566
    sget-object v0, Ll/᩻ۛۨ;->᩹ۙ:Ll/᩻ۛۨ;

    invoke-interface {p2, v0}, Ll/֨ۘ۫;->ۙ(Ll/᩻ۛۨ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ᩳۘ۫;->۠:Z

    .line 568
    :cond_0
    invoke-interface {p2, p1}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 572
    iget-object v0, p0, Ll/ᩳۘ۫;->ۖ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    .line 573
    invoke-interface {p2}, Ll/֨ۘ۫;->ۤ()[Ll/ܽۛۨ;

    move-result-object v0

    const/4 v3, 0x0

    .line 641
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_2

    .line 642
    aget-object v4, v0, v3

    invoke-virtual {v4}, Ll/ܽۛۨ;->᩸()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "type=cdir;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 643
    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    new-array v4, v4, [Ll/ܽۛۨ;

    .line 644
    invoke-static {v0, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v3, 0x1

    .line 645
    array-length v6, v0

    sub-int/2addr v6, v3

    add-int/lit8 v6, v6, -0x1

    invoke-static {v0, v5, v4, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 574
    :cond_2
    :goto_1
    iget-object v3, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    if-nez v3, :cond_11

    array-length v3, v0

    if-lez v3, :cond_11

    .line 507
    array-length v3, v0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_11

    aget-object v5, v0, v4

    .line 508
    invoke-virtual {v5}, Ll/ܽۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x3d

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ne v6, v1, :cond_5

    .line 509
    invoke-virtual {v5}, Ll/ܽۛۨ;->᩸()Ljava/lang/String;

    move-result-object v1

    const-string v3, "UNIX.mode="

    .line 510
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "perm="

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const/4 v2, 0x1

    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    goto/16 :goto_9

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 578
    :cond_6
    invoke-interface {p2}, Ll/֨ۘ۫;->ᩴ()[Ll/ܽۛۨ;

    move-result-object v0

    .line 581
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 582
    array-length v3, v0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_e

    aget-object v5, v0, v4

    .line 583
    invoke-virtual {v5}, Ll/ܽۛۨ;->᩻()Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_7

    .line 586
    :cond_7
    invoke-virtual {v5}, Ll/ܽۛۨ;->᩷()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_7

    :cond_8
    const/16 v7, 0x2f

    .line 591
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-ne v7, v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "/"

    .line 595
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 596
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 598
    :cond_a
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, p1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    .line 600
    :goto_4
    invoke-static {v6}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 601
    invoke-static {v6}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_b
    const/4 v6, 0x0

    :goto_5
    if-eqz v6, :cond_d

    .line 605
    array-length v7, v0

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v7, :cond_d

    aget-object v9, v0, v8

    .line 606
    invoke-virtual {v9}, Ll/ܽۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    .line 607
    new-instance v6, Ll/ܺۘ۫;

    invoke-direct {v6, v5, v9}, Ll/ܺۘ۫;-><init>(Ll/ܽۛۨ;Ll/ܽۛۨ;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_d
    :goto_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 622
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_f
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/function/BooleanSupplier;

    .line 623
    invoke-interface {v4}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v3, 0x1

    goto :goto_8

    :cond_10
    if-nez v3, :cond_e

    .line 629
    :cond_11
    :goto_9
    iget-object v1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    if-nez v1, :cond_12

    array-length v1, v0

    if-lez v1, :cond_12

    .line 631
    :try_start_0
    invoke-direct {p0, p2, v0, p1}, Ll/ᩳۘ۫;->ۙ(Ll/֨ۘ۫;[Ll/ܽۛۨ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 636
    :catch_0
    :cond_12
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_13
    const/4 p0, 0x0

    .line 569
    invoke-interface {p2}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw p0
.end method

.method public static synthetic ۙ(JLjava/lang/String;Ll/֨ۘ۫;)V
    .locals 2

    .line 167
    sget-object v1, Ll/ᩳۘ۫;->ۙۙ:Ljava/text/SimpleDateFormat;

    move-object v0, v1

    monitor-enter v0

    .line 168
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 169
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    invoke-static {p2}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 171
    invoke-static {p2}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1, p0}, Ll/֨ۘ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 172
    :cond_0
    invoke-interface {p3}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    .line 169
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ۙ(Ll/֨ۘ۫;[Ll/ܽۛۨ;Ljava/lang/String;)V
    .locals 7

    .line 520
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 521
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p2, v3

    .line 522
    invoke-virtual {v4}, Ll/ܽۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 524
    :cond_0
    array-length v1, p2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_8

    aget-object v4, p2, v3

    .line 525
    invoke-virtual {v4}, Ll/ܽۛۨ;->ۧ()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_4

    .line 528
    :cond_1
    invoke-virtual {v4}, Ll/ܽۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v4

    .line 529
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x61

    if-gt v6, v5, :cond_2

    const/16 v6, 0x7a

    if-gt v5, v6, :cond_2

    .line 531
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/16 v6, 0x41

    if-gt v6, v5, :cond_7

    const/16 v6, 0x5a

    if-gt v5, v6, :cond_7

    .line 533
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 537
    :goto_2
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 538
    invoke-interface {p1, p3}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_5

    .line 541
    :cond_3
    invoke-interface {p1, v4}, Ll/֨ۘ۫;->ܳ(Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0xd5

    if-ne p1, p2, :cond_4

    .line 543
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    const/16 p2, 0x226

    if-ne p1, p2, :cond_5

    .line 545
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    goto :goto_3

    :cond_5
    const/16 p2, 0x1f6

    if-ne p1, p2, :cond_6

    .line 547
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    .line 549
    :cond_6
    :goto_3
    iget-object p1, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    if-eqz p1, :cond_8

    .line 550
    iget-object p2, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵۫;->ۙ(Z)V

    return-void

    :cond_7
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    :goto_5
    return-void
.end method

.method private ۙ(Ll/۟ۘ۫;)V
    .locals 3

    .line 653
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0

    .line 724
    :try_start_0
    invoke-interface {p1, v0}, Ll/۟ۘ۫;->ۙ(Ll/֨ۘ۫;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 726
    :try_start_1
    invoke-static {v1}, Ll/ᩳۘ۫;->ۙ(Ljava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 661
    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/֨ۘ۫;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 653
    :try_start_2
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 732
    :try_start_3
    invoke-interface {p1, v0}, Ll/۟ۘ۫;->ۙ(Ll/֨ۘ۫;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_0

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    :cond_0
    return-void

    :catchall_1
    move-exception p1

    const/4 v0, 0x0

    goto :goto_0

    .line 735
    :cond_1
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    if-eqz v0, :cond_2

    .line 657
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 740
    :cond_2
    throw p1
.end method

.method public static synthetic ۙ(Ll/ᩳۘ۫;)V
    .locals 0

    .line 190
    iget-object p0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {p0}, Ll/֨᩺۫;->᩷(Ll/ۢۘ۫;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩳۘ۫;Ljava/lang/String;ILl/֨ۘ۫;)V
    .locals 3

    .line 134
    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "CHMOD "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toOctalString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Ll/֨ۘ۫;->۫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 138
    invoke-interface {p3}, Ll/֨ۘ۫;->᩷()I

    move-result p1

    const/16 p2, 0x226

    if-ne p1, p2, :cond_0

    .line 139
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    .line 141
    :cond_0
    invoke-interface {p3}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v1

    :cond_1
    return-void

    .line 135
    :cond_2
    invoke-interface {p3}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v1
.end method

.method public static ۙ(Ljava/io/IOException;)Z
    .locals 1

    .line 668
    instance-of v0, p0, Ll/ܺۛۨ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 671
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 673
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "connection"

    .line 674
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "closed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "reset"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "broken pipe"

    .line 677
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "connection abort"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private ᩸(Ljava/lang/String;Z)Ljava/io/OutputStream;
    .locals 3

    .line 653
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;

    move-result-object v0

    .line 324
    :try_start_0
    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֨ۘ۫;->᩷(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 327
    invoke-static {p1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֨ۘ۫;->ۤ(Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    .line 342
    new-instance p1, Ll/ܿۘ۫;

    invoke-direct {p1, p0, v1, v0, v1}, Ll/ܿۘ۫;-><init>(Ll/ᩳۘ۫;Ljava/io/OutputStream;Ll/֨ۘ۫;Ljava/io/OutputStream;)V

    return-object p1

    .line 329
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v2

    .line 325
    :cond_1
    invoke-interface {v0}, Ll/֨ۘ۫;->۫()Ljava/io/IOException;

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 657
    :goto_0
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 340
    throw p1

    :catch_2
    move-exception v1

    if-eqz p2, :cond_2

    .line 332
    invoke-static {v1}, Ll/ᩳۘ۫;->ۙ(Ljava/io/IOException;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 661
    invoke-static {v0}, Ll/֨᩺۫;->ۙ(Ll/֨ۘ۫;)V

    const/4 p2, 0x0

    .line 334
    invoke-direct {p0, p1, p2}, Ll/ᩳۘ۫;->᩸(Ljava/lang/String;Z)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1

    .line 657
    :cond_2
    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/֨ۘ۫;)V

    .line 337
    throw v1
.end method


# virtual methods
.method public final ֡()Z
    .locals 2

    .line 203
    iget-object v0, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 204
    monitor-enter v0

    .line 205
    :try_start_0
    iget-object v1, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 206
    new-instance v1, Ll/ۨۘ۫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v1}, Ll/ᩳۘ۫;->ۙ(Ll/֡ۘ۫;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    iput-object v1, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    .line 208
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 210
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 179
    new-instance v0, Ll/ܽۘ۫;

    invoke-direct {v0, p0}, Ll/ܽۘ۫;-><init>(Ll/ᩳۘ۫;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/֡ۘ۫;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(JLjava/lang/String;)Ljava/io/InputStream;
    .locals 1

    const/4 v0, 0x1

    .line 251
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ᩳۘ۫;->ۙ(JLjava/lang/String;Z)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 5

    .line 482
    invoke-static {p1}, Ll/ۜ᩵ܳ;->۫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 483
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0, p1}, Ll/ܶ᩵۫;->᩸(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    .line 484
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 485
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۛۨ;

    if-nez p2, :cond_1

    .line 486
    invoke-virtual {v2}, Ll/ܽۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 487
    :cond_1
    new-instance v3, Ll/ۡ᩺۫;

    invoke-direct {v3, v2, p1}, Ll/ۡ᩺۫;-><init>(Ll/ܽۛۨ;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ۖۗܳ;
    .locals 2

    .line 471
    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 472
    invoke-static {p1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 473
    iget-object v1, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v1, v0, p1}, Ll/ܶ᩵۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۛۨ;

    if-eqz p1, :cond_0

    .line 475
    new-instance v1, Ll/ۡ᩺۫;

    invoke-direct {v1, p1, v0}, Ll/ۡ᩺۫;-><init>(Ll/ܽۛۨ;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "/"

    .line 422
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 423
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 424
    :goto_1
    new-instance v0, Ll/ܶۘ۫;

    invoke-direct {v0, p1, p2}, Ll/ܶۘ۫;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/۟ۘ۫;)V

    return-void
.end method

.method public final ۙ(Ll/֡ۗ۫;)V
    .locals 1

    .line 82
    invoke-super {p0, p1}, Ll/ᩳۛ۫;->ۙ(Ll/֡ۗ۫;)V

    .line 83
    iget v0, p0, Ll/ᩳۛ۫;->ܿ:I

    invoke-static {v0, p1}, Ll/ۢۘ۫;->ۙ(ILl/֡ۗ۫;)Ll/ۢۘ۫;

    move-result-object p1

    .line 84
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-virtual {v0, p1}, Ll/ۢۘ۫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {v0}, Ll/֨᩺۫;->᩷(Ll/ۢۘ۫;)V

    .line 86
    iput-object p1, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    .line 87
    iget-object p1, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {p1}, Ll/ܶ᩵۫;->ۙ()V

    :cond_0
    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0}, Ll/ܶ᩵۫;->ۙ()V

    if-eqz p1, :cond_0

    .line 197
    iget-object p1, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    invoke-static {p1}, Ll/֨᩺۫;->᩷(Ll/ۢۘ۫;)V

    :cond_0
    return-void
.end method

.method public final ۚ(Ljava/lang/String;)Z
    .locals 1

    .line 450
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0, p1}, Ll/ܶ᩵۫;->ۤ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۟()Z
    .locals 1

    .line 153
    iget-boolean v0, p0, Ll/ᩳۘ۫;->۠:Z

    return v0
.end method

.method public final ۤ(JLjava/lang/String;)V
    .locals 1

    .line 165
    new-instance v0, Ll/ۛۘ۫;

    invoke-direct {v0, p1, p2, p3}, Ll/ۛۘ۫;-><init>(JLjava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/۟ۘ۫;)V

    return-void
.end method

.method public final ۤ(Ljava/lang/String;Z)V
    .locals 1

    .line 397
    new-instance v0, Ll/᩻ۘ۫;

    invoke-direct {v0, p1, p2}, Ll/᩻ۘ۫;-><init>(Ljava/lang/String;Z)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/۟ۘ۫;)V

    return-void
.end method

.method public final ۤ()Z
    .locals 2

    .line 500
    iget-object v0, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 495
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0, p1}, Ll/ܶ᩵۫;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 465
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0, p1}, Ll/ܶ᩵۫;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܰ()V
    .locals 3

    .line 190
    sget-object v0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Ll/ۜۙ᩻;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ۜۙ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܶ()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    iget-object v0, v0, Ll/ۢۘ۫;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ᩳۘ۫;->֨:Ll/ۢۘ۫;

    iget-object v0, v0, Ll/ۢۘ۫;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ(Ljava/lang/String;)V
    .locals 1

    .line 440
    new-instance v0, Ll/᩺ۘ۫;

    invoke-direct {v0, p1}, Ll/᩺ۘ۫;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/۟ۘ۫;)V

    return-void
.end method

.method public final ᩶()Z
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷(JLjava/lang/String;)Ljava/io/OutputStream;
    .locals 0

    const/4 p1, 0x1

    .line 317
    invoke-direct {p0, p3, p1}, Ll/ᩳۘ۫;->᩸(Ljava/lang/String;Z)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(ILjava/lang/String;)V
    .locals 1

    .line 133
    new-instance v0, Ll/ۗۘ۫;

    invoke-direct {v0, p0, p2, p1}, Ll/ۗۘ۫;-><init>(Ll/ᩳۘ۫;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/۟ۘ۫;)V

    return-void
.end method

.method public final ᩷(Ll/ۛۚۤ;)V
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ᩳۘ۫;->ۢ:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/Boolean;)V

    .line 107
    iget-object v0, p0, Ll/ᩳۘ۫;->ۖ:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/Boolean;)V

    .line 108
    iget-object v0, p0, Ll/ᩳۘ۫;->ۡ:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/Boolean;)V

    .line 109
    iget-object v0, p0, Ll/ᩳۘ۫;->ۜ:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/Boolean;)V

    .line 110
    iget-boolean v0, p0, Ll/ᩳۘ۫;->۠:Z

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Z)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "/"

    .line 415
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 416
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 417
    :goto_1
    new-instance v0, Ll/᩹ۘ۫;

    invoke-direct {v0, p1, p2}, Ll/᩹ۘ۫;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ᩳۘ۫;->ۙ(Ll/֡ۘ۫;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final ᩸(Ljava/lang/String;)Z
    .locals 2

    .line 460
    iget-object v0, p0, Ll/ᩳۘ۫;->ᩳ:Ll/ܶ᩵۫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ll/ܶ᩵۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
