.class public final Ll/֫᩸ۙ;
.super Ljava/lang/Object;
.source "DB30"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static volatile ۧ:Ll/֫᩸ۙ;


# instance fields
.field public final ۙ:Ll/ۙ᩸ۙ;

.field public final ۚ:Ll/۬ۤۙ;

.field public final ۤ:Ll/ܿۗ;

.field public final ۫:Ll/ܳ᩸ۙ;

.field public final ܳ:I

.field public volatile ᩴ:I

.field public final ᩷:Ll/۠ۤۙ;

.field public final ᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 340
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֫᩸ۙ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ۜۤۙ;)V
    .locals 4

    .line 447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v1, 0x3

    .line 449
    iput v1, p0, Ll/֫᩸ۙ;->ᩴ:I

    .line 455
    iget-object v1, p1, Ll/ۜۤۙ;->ۤ:Ll/ܳ᩸ۙ;

    iput-object v1, p0, Ll/֫᩸ۙ;->۫:Ll/ܳ᩸ۙ;

    .line 456
    iget v1, p1, Ll/ۜۤۙ;->᩷:I

    iput v1, p0, Ll/֫᩸ۙ;->ܳ:I

    .line 457
    iget-object p1, p1, Ll/ۜۤۙ;->ۙ:Ll/ۙ᩸ۙ;

    iput-object p1, p0, Ll/֫᩸ۙ;->ۙ:Ll/ۙ᩸ۙ;

    .line 458
    new-instance p1, Ll/ܿۗ;

    const/4 v2, 0x0

    .line 47
    invoke-direct {p1, v2}, Ll/ܿۗ;-><init>(I)V

    .line 458
    iput-object p1, p0, Ll/֫᩸ۙ;->ۤ:Ll/ܿۗ;

    .line 460
    new-instance p1, Ll/۬ۤۙ;

    .line 1220
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 460
    iput-object p1, p0, Ll/֫᩸ۙ;->ۚ:Ll/۬ۤۙ;

    .line 464
    new-instance p1, Ll/۠ۤۙ;

    invoke-direct {p1, p0}, Ll/۠ۤۙ;-><init>(Ll/֫᩸ۙ;)V

    iput-object p1, p0, Ll/֫᩸ۙ;->᩷:Ll/۠ۤۙ;

    .line 675
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    if-nez v1, :cond_0

    .line 678
    :try_start_0
    iput v2, p0, Ll/֫᩸ۙ;->ᩴ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 681
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 682
    throw p1

    .line 681
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 684
    invoke-virtual {p0}, Ll/֫᩸ۙ;->ۙ()I

    move-result v0

    if-nez v0, :cond_1

    .line 685
    invoke-virtual {p1}, Ll/۠ۤۙ;->ۙ()V

    :cond_1
    return-void
.end method

.method public static synthetic ۙ(Ll/֫᩸ۙ;)Ll/۬ۤۙ;
    .locals 0

    .line 107
    iget-object p0, p0, Ll/֫᩸ۙ;->ۚ:Ll/۬ۤۙ;

    return-object p0
.end method

.method public static ۙ(Ll/ۜۤۙ;)V
    .locals 2

    .line 536
    sget-object v0, Ll/֫᩸ۙ;->ۧ:Ll/֫᩸ۙ;

    if-nez v0, :cond_1

    .line 538
    sget-object v0, Ll/֫᩸ۙ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 539
    :try_start_0
    sget-object v1, Ll/֫᩸ۙ;->ۧ:Ll/֫᩸ۙ;

    if-nez v1, :cond_0

    .line 541
    new-instance v1, Ll/֫᩸ۙ;

    invoke-direct {v1, p0}, Ll/֫᩸ۙ;-><init>(Ll/ۜۤۙ;)V

    .line 542
    sput-object v1, Ll/֫᩸ۙ;->ۧ:Ll/֫᩸ۙ;

    .line 544
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method

.method public static ۙ(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 889
    invoke-static {p0, p1, p2}, Ll/ܰ᩸ۙ;->ۙ(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_19

    if-ltz p2, :cond_19

    if-gez p3, :cond_0

    goto/16 :goto_9

    .line 516
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    .line 517
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v1, v3, :cond_19

    if-eq v2, v3, :cond_19

    if-eq v1, v2, :cond_1

    goto/16 :goto_9

    :cond_1
    const/4 v4, 0x1

    if-eqz p4, :cond_16

    .line 528
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 802
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ltz v1, :cond_b

    if-ge p4, v1, :cond_2

    goto :goto_2

    :cond_2
    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    const/4 p4, 0x0

    :goto_1
    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_6

    if-eqz p4, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    goto :goto_3

    .line 823
    :cond_6
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_8

    .line 825
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 832
    :cond_8
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_9

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    .line 836
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_2

    :cond_a
    const/4 p4, 0x1

    goto :goto_1

    :cond_b
    :goto_2
    const/4 v1, -0x1

    .line 530
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 858
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ltz v2, :cond_14

    if-ge p3, v2, :cond_c

    goto :goto_6

    :cond_c
    if-gez p2, :cond_d

    goto :goto_6

    :cond_d
    :goto_4
    const/4 p4, 0x0

    :goto_5
    if-nez p2, :cond_e

    move p3, v2

    goto :goto_7

    :cond_e
    if-lt v2, p3, :cond_f

    if-eqz p4, :cond_15

    goto :goto_6

    .line 879
    :cond_f
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_11

    .line 881
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_10

    goto :goto_6

    :cond_10
    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 889
    :cond_11
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_12

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 894
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_6

    :cond_13
    add-int/lit8 v2, v2, 0x1

    const/4 p4, 0x1

    goto :goto_5

    :cond_14
    :goto_6
    const/4 p3, -0x1

    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    if-ne p3, v3, :cond_17

    goto :goto_9

    :cond_16
    sub-int/2addr v1, p2

    .line 537
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v2, p3

    .line 538
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 541
    :cond_17
    const-class p2, Ll/᩶᩸ۙ;

    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/᩶᩸ۙ;

    if-eqz p2, :cond_19

    .line 542
    array-length p4, p2

    if-lez p4, :cond_19

    .line 543
    array-length p4, p2

    const/4 v2, 0x0

    :goto_8
    if-ge v2, p4, :cond_18

    .line 545
    aget-object v3, p2, v2

    .line 546
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 547
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    .line 548
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 549
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 552
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 553
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 555
    check-cast p0, Landroid/view/inputmethod/InputConnectionWrapper;

    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 556
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 557
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    return v4

    :cond_19
    :goto_9
    return v0
.end method

.method public static ᩴ()Z
    .locals 1

    .line 580
    sget-object v0, Ll/֫᩸ۙ;->ۧ:Ll/֫᩸ۙ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic ᩷(Ll/֫᩸ۙ;)Ll/ۙ᩸ۙ;
    .locals 0

    .line 107
    iget-object p0, p0, Ll/֫᩸ۙ;->ۙ:Ll/ۙ᩸ۙ;

    return-object p0
.end method

.method public static ᩸()Ll/֫᩸ۙ;
    .locals 4

    .line 635
    sget-object v0, Ll/֫᩸ۙ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 636
    :try_start_0
    sget-object v1, Ll/֫᩸ۙ;->ۧ:Ll/֫᩸ۙ;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    if-eqz v2, :cond_1

    .line 638
    monitor-exit v0

    return-object v1

    .line 168
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 639
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ۙ()I
    .locals 2

    .line 808
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 810
    :try_start_0
    iget v0, p0, Ll/֫᩸ۙ;->ᩴ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 812
    iget-object v1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 813
    throw v0
.end method

.method public final ۙ(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 4

    .line 820
    invoke-virtual {p0}, Ll/֫᩸ۙ;->ۙ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_9

    if-ltz p1, :cond_8

    if-ltz p2, :cond_7

    if-gt p1, p2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v3, "start should be <= than end"

    .line 1118
    invoke-static {v3, v0}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/String;Z)V

    if-nez p3, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 1125
    :cond_2
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    const-string v3, "start should be < than charSequence length"

    invoke-static {v3, v0}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/String;Z)V

    .line 1127
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    const-string v0, "end should be < than charSequence length"

    invoke-static {v0, v2}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/String;Z)V

    .line 1131
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_6

    if-ne p1, p2, :cond_5

    goto :goto_4

    .line 1149
    :cond_5
    iget-object v0, p0, Ll/֫᩸ۙ;->᩷:Ll/۠ۤۙ;

    invoke-virtual {v0, p3, p1, p2, v1}, Ll/۠ۤۙ;->ۙ(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_4
    return-object p3

    .line 208
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 168
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not initialized yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    .line 820
    invoke-virtual {p0}, Ll/֫᩸ۙ;->ۙ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_0

    return-void

    .line 1189
    :cond_0
    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 1190
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 1192
    :cond_1
    iget-object v0, p0, Ll/֫᩸ۙ;->᩷:Ll/۠ۤۙ;

    invoke-virtual {v0, p1}, Ll/۠ۤۙ;->ۙ(Landroid/view/inputmethod/EditorInfo;)V

    :cond_2
    return-void
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 5

    .line 709
    iget-object v0, p0, Ll/֫᩸ۙ;->ۤ:Ll/ܿۗ;

    .line 710
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ܿۗ;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 711
    iget-object v2, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v2, 0x2

    .line 713
    :try_start_0
    iput v2, p0, Ll/֫᩸ۙ;->ᩴ:I

    .line 714
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 715
    invoke-virtual {v0}, Ll/ܿۗ;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 717
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v0, 0x0

    .line 719
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 720
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ᩸ۙ;

    .line 1286
    iget-object v3, v2, Ll/ᩴ᩸ۙ;->ۙ:Ll/᩶ۤۙ;

    new-instance v4, Ll/᩸᩸ۙ;

    invoke-direct {v4, v2, p1}, Ll/᩸᩸ۙ;-><init>(Ll/ᩴ᩸ۙ;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v4}, Ll/᩶ۤۙ;->execute(Ljava/lang/Runnable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 717
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 718
    throw p1
.end method

.method public final ۙ(Ll/᩷᩸ۙ;)V
    .locals 3

    .line 84
    invoke-static {}, Ll/۟ۤۙ;->ۙ()Landroid/os/Handler;

    move-result-object v0

    .line 97
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩶ۤۙ;

    invoke-direct {v1, v0}, Ll/᩶ۤۙ;-><init>(Landroid/os/Handler;)V

    const-string v0, "initCallback cannot be null"

    .line 757
    invoke-static {p1, v0}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 760
    new-instance v0, Ll/ᩴ᩸ۙ;

    .line 1276
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1277
    iput-object p1, v0, Ll/ᩴ᩸ۙ;->᩷:Ll/᩷᩸ۙ;

    .line 1278
    iput-object v1, v0, Ll/ᩴ᩸ۙ;->ۙ:Ll/᩶ۤۙ;

    .line 761
    iget-object p1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 763
    :try_start_0
    iget p1, p0, Ll/֫᩸ۙ;->ᩴ:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    .line 1282
    new-instance p1, Ll/ۤ᩸ۙ;

    invoke-direct {p1, v0}, Ll/ۤ᩸ۙ;-><init>(Ll/ᩴ᩸ۙ;)V

    invoke-virtual {v1, p1}, Ll/᩶ۤۙ;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 765
    :cond_0
    iget p1, p0, Ll/֫᩸ۙ;->ᩴ:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 766
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v2, "Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1286
    new-instance v2, Ll/᩸᩸ۙ;

    invoke-direct {v2, v0, p1}, Ll/᩸᩸ۙ;-><init>(Ll/ᩴ᩸ۙ;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ll/᩶ۤۙ;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 770
    :cond_1
    iget-object p1, p0, Ll/֫᩸ۙ;->ۤ:Ll/ܿۗ;

    invoke-virtual {p1, v0}, Ll/ܿۗ;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 773
    :goto_0
    iget-object p1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 774
    throw p1
.end method

.method public final ۤ()V
    .locals 5

    .line 691
    iget-object v0, p0, Ll/֫᩸ۙ;->ۤ:Ll/ܿۗ;

    .line 692
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ܿۗ;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 693
    iget-object v2, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v2, 0x1

    .line 695
    :try_start_0
    iput v2, p0, Ll/֫᩸ۙ;->ᩴ:I

    .line 696
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 697
    invoke-virtual {v0}, Ll/ܿۗ;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 699
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v0, 0x0

    .line 702
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 703
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ᩸ۙ;

    .line 1282
    iget-object v3, v2, Ll/ᩴ᩸ۙ;->ۙ:Ll/᩶ۤۙ;

    new-instance v4, Ll/ۤ᩸ۙ;

    invoke-direct {v4, v2}, Ll/ۤ᩸ۙ;-><init>(Ll/ᩴ᩸ۙ;)V

    invoke-virtual {v3, v4}, Ll/᩶ۤۙ;->execute(Ljava/lang/Runnable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 699
    iget-object v1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 700
    throw v0
.end method

.method public final ᩷()V
    .locals 3

    .line 659
    iget v0, p0, Ll/֫᩸ۙ;->ܳ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 820
    invoke-virtual {p0}, Ll/֫᩸ۙ;->ۙ()I

    move-result v0

    if-ne v0, v2, :cond_1

    return-void

    .line 663
    :cond_1
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 665
    :try_start_0
    iget v0, p0, Ll/֫᩸ۙ;->ᩴ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    .line 668
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    .line 666
    :cond_2
    :try_start_1
    iput v1, p0, Ll/֫᩸ۙ;->ᩴ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 668
    iget-object v0, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 671
    iget-object v0, p0, Ll/֫᩸ۙ;->᩷:Ll/۠ۤۙ;

    invoke-virtual {v0}, Ll/۠ۤۙ;->ۙ()V

    return-void

    :catchall_0
    move-exception v0

    .line 668
    iget-object v1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 669
    throw v0

    .line 168
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷(Ll/᩷᩸ۙ;)V
    .locals 6

    .line 783
    iget-object v0, p0, Ll/֫᩸ۙ;->ۤ:Ll/ܿۗ;

    const-string v1, "initCallback cannot be null"

    invoke-static {p1, v1}, Ll/ۧ֫ܺ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 784
    iget-object v1, p0, Ll/֫᩸ۙ;->᩸:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 786
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 787
    invoke-virtual {v0}, Ll/ܿۗ;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    move-object v4, v3

    check-cast v4, Ll/۟ۗ;

    invoke-virtual {v4}, Ll/۟ۗ;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll/۟ۗ;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ᩸ۙ;

    .line 788
    iget-object v5, v4, Ll/ᩴ᩸ۙ;->᩷:Ll/᩷᩸ۙ;

    if-ne v5, p1, :cond_0

    .line 789
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 792
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ᩸ۙ;

    .line 793
    invoke-virtual {v0, v2}, Ll/ܿۗ;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 796
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 797
    throw p1
.end method
