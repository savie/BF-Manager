.class public final Ll/۠֡ܳ;
.super Ljava/lang/Object;
.source "473S"


# static fields
.field public static final ۙ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "MIUI BACKUP\n"

    .line 68
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ll/۠֡ܳ;->ۙ:[B

    return-void
.end method

.method public static bridge synthetic ۙ(JJ)J
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۙ(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;
    .locals 3

    .line 829
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 830
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 831
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 832
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    .line 833
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    .line 834
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 837
    :cond_1
    instance-of v2, p0, Ljava/io/IOException;

    if-eqz v2, :cond_2

    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-nez v2, :cond_2

    .line 838
    check-cast p0, Ljava/io/IOException;

    return-object p0

    .line 840
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 841
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 843
    :cond_3
    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-eqz v2, :cond_0

    check-cast p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    .line 845
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 846
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 848
    :cond_4
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 849
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 851
    :cond_5
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 852
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/۟ۘܳ;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۠֡ܳ;->᩸(Ll/۟ۘܳ;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/᩷ۨᩴ;)Ll/ۘ֡ܳ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۠֡ܳ;->᩷(Ll/᩷ۨᩴ;)Ll/ۘ֡ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/۟ۘܳ;Ll/ܶᩳܳ;)Ll/᩶֡ܳ;
    .locals 2

    const/4 v0, 0x0

    .line 131
    :try_start_0
    instance-of v1, p0, Ll/᩺۬۫;

    if-eqz v1, :cond_0

    check-cast p0, Ll/᩺۬۫;

    .line 132
    invoke-static {p0, p1}, Ll/۠֡ܳ;->ۙ(Ll/᩺۬۫;Ll/ܶᩳܳ;)V

    goto :goto_0

    .line 133
    :cond_0
    instance-of v1, p0, Ll/ۧۖ۫;

    if-eqz v1, :cond_1

    check-cast p0, Ll/ۧۖ۫;

    .line 134
    invoke-static {p0, p1}, Ll/۠֡ܳ;->ۙ(Ll/ۧۖ۫;Ll/ܶᩳܳ;)V

    goto :goto_0

    .line 135
    :cond_1
    instance-of v1, p0, Ll/ܺᩴ۫;

    if-eqz v1, :cond_2

    check-cast p0, Ll/ܺᩴ۫;

    .line 136
    invoke-static {p0, p1}, Ll/۠֡ܳ;->ۙ(Ll/ܺᩴ۫;Ll/ܶᩳܳ;)V

    goto :goto_0

    .line 137
    :cond_2
    instance-of v1, p0, Ll/ۡᩴ۫;

    if-eqz v1, :cond_4

    check-cast p0, Ll/ۡᩴ۫;

    .line 138
    invoke-static {p0, p1}, Ll/۠֡ܳ;->ۙ(Ll/ۡᩴ۫;Ll/ܶᩳܳ;)V

    .line 142
    :goto_0
    invoke-virtual {p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 918
    new-instance p0, Ll/᩶֡ܳ;

    sget-object p1, Ll/֨֡ܳ;->᩶:Ll/֨֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 906
    :cond_3
    new-instance p0, Ll/᩶֡ܳ;

    sget-object p1, Ll/֨֡ܳ;->ᩳ:Ll/֨֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 140
    :cond_4
    new-instance p0, Ll/ۖ֡ܳ;

    .line 1089
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 140
    throw p0
    :try_end_0
    .catch Ll/ۡ֡ܳ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ۖ֡ܳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ܰ֡ܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 922
    new-instance p1, Ll/᩶֡ܳ;

    sget-object v1, Ll/֨֡ܳ;->ܿ:Ll/֨֡ܳ;

    invoke-direct {p1, v1, v0, p0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p1

    :catch_1
    move-exception p0

    .line 148
    invoke-static {p0}, Ll/ܰ֡ܳ;->ۙ(Ll/ܰ֡ܳ;)Ljava/lang/String;

    move-result-object p0

    .line 910
    new-instance p1, Ll/᩶֡ܳ;

    sget-object v1, Ll/֨֡ܳ;->֡:Ll/֨֡ܳ;

    invoke-direct {p1, v1, p0, v0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p1

    .line 914
    :catch_2
    new-instance p0, Ll/᩶֡ܳ;

    sget-object p1, Ll/֨֡ܳ;->۟:Ll/֨֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 918
    :catch_3
    new-instance p0, Ll/᩶֡ܳ;

    sget-object p1, Ll/֨֡ܳ;->᩶:Ll/֨֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/᩶֡ܳ;-><init>(Ll/֨֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0
.end method

.method public static ۙ(Ljava/io/BufferedInputStream;)V
    .locals 7

    .line 564
    sget-object v0, Ll/۠֡ܳ;->ۙ:[B

    array-length v1, v0

    const/16 v2, 0x800

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 565
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-byte v5, v0, v4

    .line 566
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v6

    and-int/lit16 v5, v5, 0xff

    if-eq v6, v5, :cond_0

    .line 567
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    return-void

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x8

    if-ge v3, v2, :cond_4

    if-ge v0, v1, :cond_4

    .line 573
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_2

    :cond_2
    const/16 v1, 0xa

    if-ne v4, v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-eq v0, v1, :cond_5

    .line 582
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    :cond_5
    return-void
.end method

.method public static ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 778
    check-cast p0, Ll/ܶᩳܳ;

    invoke-virtual {p0}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    return-void

    .line 779
    :cond_1
    new-instance p0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 779
    throw p0
.end method

.method public static ۙ(Ll/ۡᩴ۫;Ll/ܶᩳܳ;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 532
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۡᩴ۫;->ۙ(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 536
    invoke-virtual {p0}, Ll/ۡᩴ۫;->ܶ()Ll/ᩳᩴ۫;

    move-result-object v0

    .line 537
    invoke-virtual {p0}, Ll/ۡᩴ۫;->ۚ()Ll/᩷ۨᩴ;

    move-result-object p0

    .line 538
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v2

    .line 539
    :try_start_1
    new-instance v3, Ll/᩺֡ܳ;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v4

    invoke-direct {v3, v2, v4, v5, p1}, Ll/᩺֡ܳ;-><init>(Ljava/io/InputStream;JLl/ܶᩳܳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 540
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳᩴ۫;->ۤ()Ll/᩻ܳ۫;

    move-result-object p0

    invoke-virtual {p0, v3}, Ll/᩻ܳ۫;->᩷(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_2
    .catch Ll/ۡ֡ܳ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/high16 v3, 0x10000

    :try_start_3
    new-array v3, v3, [B

    .line 737
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 738
    invoke-static {p1, v1}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    goto :goto_0

    .line 741
    :cond_0
    invoke-static {p1, v1}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 542
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ll/ۡ֡ܳ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v2, :cond_1

    .line 559
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 540
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
    :try_end_6
    .catch Ll/ۡ֡ܳ; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_0
    move-exception p0

    .line 550
    :try_start_7
    const-class p1, Ll/ᩳ֡ܳ;

    move-object v3, p0

    :goto_2
    if-eqz v3, :cond_4

    .line 863
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 864
    invoke-virtual {p1, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_3

    .line 862
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    goto :goto_2

    .line 550
    :cond_4
    :goto_3
    check-cast v1, Ll/ᩳ֡ܳ;

    if-nez v1, :cond_6

    .line 554
    invoke-static {p0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 555
    new-instance p1, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 555
    throw p1

    .line 557
    :cond_5
    new-instance p1, Ll/ܰ֡ܳ;

    invoke-virtual {v0}, Ll/۫᩶ܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1

    .line 552
    :cond_6
    throw v1

    :catch_1
    move-exception p0

    .line 545
    invoke-static {p0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 546
    new-instance p1, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 546
    throw p1

    .line 548
    :cond_7
    throw p0

    :catch_2
    move-exception p0

    .line 543
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    if-eqz v2, :cond_8

    .line 538
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_4
    throw p0

    :catch_3
    move-exception p0

    .line 534
    new-instance p1, Ll/ܰ֡ܳ;

    invoke-direct {p1, v1, p0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1
.end method

.method public static ۙ(Ll/ۧۖ۫;Ll/ܶᩳܳ;)V
    .locals 17

    move-object/from16 v0, p1

    .line 467
    invoke-virtual/range {p0 .. p0}, Ll/ۧۖ۫;->᩹()Ll/۫ۖ۫;

    move-result-object v1

    .line 468
    new-instance v2, Ll/᩺֡ܳ;

    invoke-virtual {v1}, Ll/۫ۖ۫;->ᩴ()Ljava/io/BufferedInputStream;

    move-result-object v3

    invoke-virtual {v1}, Ll/۫ۖ۫;->᩸()J

    move-result-wide v4

    invoke-direct {v2, v3, v4, v5, v0}, Ll/᩺֡ܳ;-><init>(Ljava/io/InputStream;JLl/ܶᩳܳ;)V

    .line 469
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    const/high16 v3, 0x10000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v4, 0x0

    .line 472
    :try_start_1
    new-instance v5, Ll/ܽ֡ܳ;

    invoke-direct {v5, v1}, Ll/ܽ֡ܳ;-><init>(Ljava/io/BufferedInputStream;)V

    invoke-static {v1, v5}, Ll/ۢۡ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/ܽ֡ܳ;)Ljava/io/InputStream;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v5, v1

    .line 476
    :cond_0
    instance-of v6, v5, Ljava/io/BufferedInputStream;

    if-eqz v6, :cond_1

    .line 477
    check-cast v5, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-direct {v6, v5, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v5, v6

    .line 478
    :goto_0
    invoke-static {v5}, Ll/۠֡ܳ;->ۙ(Ljava/io/BufferedInputStream;)V

    .line 479
    invoke-virtual/range {p0 .. p0}, Ll/ۧۖ۫;->ۚ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/16 v7, 0x200

    if-eqz v6, :cond_2

    .line 480
    new-instance v6, Ll/۬᩹ۨ;

    .line 184
    invoke-direct {v6, v5, v7, v4}, Ll/۬᩹ۨ;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    goto :goto_1

    .line 481
    :cond_2
    new-instance v6, Ll/۬᩹ۨ;

    invoke-virtual/range {p0 .. p0}, Ll/ۧۖ۫;->ۚ()Ljava/lang/String;

    move-result-object v8

    .line 236
    invoke-direct {v6, v5, v7, v8}, Ll/۬᩹ۨ;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    :goto_1
    const/4 v7, 0x1

    .line 482
    invoke-virtual {v6, v7}, Ll/۬᩹ۨ;->ۙ(Z)V
    :try_end_1
    .catch Ll/ۡ֡ܳ; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ll/ܰ֡ܳ; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 487
    :cond_3
    :goto_2
    :try_start_2
    invoke-virtual {v6}, Ll/۬᩹ۨ;->ܳ()Ll/ۜ᩹ۨ;

    move-result-object v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v8, -0x1

    if-nez v7, :cond_7

    :try_start_3
    new-array v3, v3, [B

    .line 750
    :cond_4
    invoke-virtual {v5, v3}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-eq v7, v8, :cond_6

    .line 751
    invoke-static {v0, v4}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v7, :cond_4

    .line 753
    aget-byte v10, v3, v9

    if-nez v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 754
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const v3, 0x7f120be3

    invoke-static {v3}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 758
    :cond_6
    invoke-static {v0, v4}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 508
    :try_start_4
    invoke-virtual {v6}, Ll/۬᩹ۨ;->close()V
    :try_end_4
    .catch Ll/ۡ֡ܳ; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ll/ܰ֡ܳ; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 526
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-virtual {v2}, Ll/᩺֡ܳ;->close()V

    return-void

    .line 498
    :cond_7
    :try_start_6
    invoke-virtual {v7}, Ll/ۜ᩹ۨ;->᩹()Ljava/lang/String;

    move-result-object v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    new-array v10, v3, [B

    const-wide/16 v11, 0x0

    .line 737
    :goto_4
    invoke-virtual {v6, v10}, Ljava/io/InputStream;->read([B)I

    move-result v13

    if-eq v13, v8, :cond_8

    .line 738
    invoke-static {v0, v4}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v13, v13

    add-long/2addr v11, v13

    goto :goto_4

    :cond_8
    const-wide/16 v13, 0x0

    .line 741
    invoke-static {v0, v4}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 500
    invoke-virtual {v7}, Ll/ۜ᩹ۨ;->᩵()J

    move-result-wide v15

    cmp-long v8, v15, v13

    if-ltz v8, :cond_3

    invoke-virtual {v7}, Ll/ۜ᩹ۨ;->᩵()J

    move-result-wide v13

    cmp-long v8, v11, v13

    if-nez v8, :cond_9

    goto :goto_2

    .line 501
    :cond_9
    new-instance v0, Ll/ܰ֡ܳ;

    new-instance v3, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unexpected TAR entry size: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " != "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    invoke-virtual {v7}, Ll/ۜ᩹ۨ;->᩵()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v9, v3}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 489
    :try_start_8
    invoke-virtual {v6}, Ll/۬᩹ۨ;->᩷()Ll/ۜ᩹ۨ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 490
    invoke-virtual {v0}, Ll/ۜ᩹ۨ;->ܰ()Z

    move-result v5

    if-nez v5, :cond_a

    .line 491
    invoke-virtual {v0}, Ll/ۜ᩹ۨ;->᩹()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object v9, v0

    goto :goto_5

    :cond_a
    move-object v9, v4

    .line 493
    :goto_5
    :try_start_9
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_6
    move-object v3, v0

    goto :goto_8

    :goto_7
    move-object v3, v0

    move-object v9, v4

    .line 482
    :goto_8
    :try_start_a
    invoke-virtual {v6}, Ll/۬᩹ۨ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v5, v0

    :try_start_b
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v3
    :try_end_b
    .catch Ll/ۡ֡ܳ; {:try_start_b .. :try_end_b} :catch_5
    .catch Ll/ܰ֡ܳ; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catch_1
    move-exception v0

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v3, v0

    goto :goto_e

    :catch_2
    move-exception v0

    move-object v9, v4

    .line 517
    :goto_a
    :try_start_c
    const-class v3, Ll/ᩳ֡ܳ;

    move-object v5, v0

    :goto_b
    if-eqz v5, :cond_c

    .line 863
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 864
    invoke-virtual {v3, v5}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Throwable;

    goto :goto_c

    .line 862
    :cond_b
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    goto :goto_b

    .line 517
    :cond_c
    :goto_c
    check-cast v4, Ll/ᩳ֡ܳ;

    if-nez v4, :cond_e

    .line 521
    invoke-static {v0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 522
    new-instance v3, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 522
    throw v3

    .line 524
    :cond_d
    new-instance v3, Ll/ܰ֡ܳ;

    invoke-direct {v3, v9, v0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v3

    .line 519
    :cond_e
    throw v4

    :catch_3
    move-exception v0

    .line 512
    invoke-static {v0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 513
    new-instance v3, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 513
    throw v3

    .line 515
    :cond_f
    throw v0

    :catch_4
    move-exception v0

    goto :goto_d

    :catch_5
    move-exception v0

    .line 510
    :goto_d
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 468
    :goto_e
    :try_start_d
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_f

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_e
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-exception v0

    move-object v1, v0

    :try_start_f
    invoke-virtual {v2}, Ll/᩺֡ܳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_10

    :catchall_6
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v1
.end method

.method public static ۙ(Ll/ܺᩴ۫;Ll/ܶᩳܳ;)V
    .locals 9

    .line 589
    :try_start_0
    new-instance v0, Ll/ܶ֡ܳ;

    invoke-direct {v0, p1}, Ll/ܶ֡ܳ;-><init>(Ll/ܶᩳܳ;)V

    invoke-virtual {p0, v0}, Ll/ܺᩴ۫;->ۙ(Ll/ܶ֡ܳ;)Z

    move-result v0
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    if-eqz v0, :cond_7

    .line 605
    invoke-virtual {p0}, Ll/ܺᩴ۫;->ܿ᩷()Ljava/util/List;

    move-result-object v3

    .line 606
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 607
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 608
    new-instance v8, Ll/ۨ֡ܳ;

    move-object v1, v8

    move-object v2, p0

    move-object v4, v0

    move-object v5, p1

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Ll/ۨ֡ܳ;-><init>(Ll/ܺᩴ۫;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicReference;Ll/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 665
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    .line 666
    new-instance v1, Ll/ᩳ᩶ᩴ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v8}, Ll/ᩳ᩶ᩴ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 670
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 674
    :goto_0
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x64

    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 676
    invoke-virtual {p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result v2

    if-nez v2, :cond_0

    const/16 v2, 0x64

    .line 193
    invoke-virtual {p1, v2}, Ll/ᩳۜۧ;->ۧ(I)V
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 710
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    .line 677
    :cond_0
    :try_start_2
    new-instance v2, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v2}, Ljava/io/IOException;-><init>()V

    .line 677
    throw v2
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v1

    .line 688
    :try_start_3
    invoke-virtual {p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result v2

    if-nez v2, :cond_5

    .line 691
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 823
    instance-of v2, v1, Ljava/lang/Exception;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/Exception;

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v2

    .line 692
    :goto_1
    invoke-static {v1}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 695
    instance-of v2, v1, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Lnet/sf/sevenzipjbinding/SevenZipException;

    .line 696
    invoke-static {v2}, Ll/۠֡ܳ;->ۙ(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 698
    invoke-static {v2}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v2

    .line 700
    :cond_2
    new-instance v2, Ll/ܰ֡ܳ;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/io/IOException;

    invoke-direct {v2, v0, v1}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v2

    .line 702
    :cond_3
    invoke-static {v1}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v1

    .line 693
    :cond_4
    new-instance v0, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 693
    throw v0

    .line 689
    :cond_5
    new-instance v0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 689
    throw v0

    .line 682
    :catch_1
    invoke-virtual {p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    .line 686
    :cond_6
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 193
    invoke-virtual {p1, v2}, Ll/ᩳۜۧ;->ۧ(I)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 706
    :catch_2
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 183
    invoke-virtual {p1}, Ll/ܶᩳܳ;->cancel()V

    .line 708
    new-instance p1, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 708
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 710
    :goto_2
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 711
    throw p1

    .line 183
    :cond_7
    :try_start_5
    invoke-virtual {p1}, Ll/ܶᩳܳ;->cancel()V

    .line 591
    new-instance p0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 591
    throw p0
    :try_end_5
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    .line 603
    throw p0

    .line 594
    :goto_3
    invoke-virtual {p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result p1

    if-nez p1, :cond_9

    .line 597
    invoke-static {p0}, Ll/۠֡ܳ;->ۙ(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 599
    throw p1

    .line 601
    :cond_8
    new-instance p1, Ll/ܰ֡ܳ;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1

    .line 595
    :cond_9
    new-instance p0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 595
    throw p0
.end method

.method public static ۙ(Ll/᩸ܽܺ;Ll/᩺۬۫;Ll/۟ܺܺ;[BLl/۟֡ܳ;ZLl/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p6

    .line 315
    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->᩹()Z

    move-result v0

    const/4 v7, -0x1

    if-eqz v0, :cond_15

    .line 340
    invoke-static/range {p2 .. p2}, Ll/ᩳۜ۫;->ۙ(Ll/۟ܺܺ;)Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_8

    .line 413
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->᩹()Ljava/lang/String;

    move-result-object v0

    move-object v9, v8

    .line 415
    :goto_0
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    if-eqz v0, :cond_1

    .line 417
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v10, v9

    move-wide v12, v11

    const/4 v11, 0x0

    :goto_1
    move-object v9, v0

    goto :goto_3

    :cond_1
    :goto_2
    if-nez v9, :cond_2

    .line 419
    new-instance v0, Ll/᩵֡ܳ;

    invoke-direct {v0, v6}, Ll/᩵֡ܳ;-><init>(Ll/ܶᩳܳ;)V

    invoke-static {v1, v3, v0}, Ll/ᩳۜ۫;->ۙ(Ll/᩸ܽܺ;Ll/۟ܺܺ;Ll/۟֡֫;)Ljava/util/List;

    move-result-object v9

    .line 421
    :cond_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 422
    new-instance v10, Ll/ۢۢܳ;

    new-instance v11, Ll/ۧۚۧ;

    const-wide/16 v12, 0x0

    const/4 v14, 0x3

    invoke-direct {v11, v14, v0}, Ll/ۧۚۧ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v10, v8, v11}, Ll/ۢۢܳ;-><init>(Ll/ܽ֡֫;Ll/ᩳۢܳ;)V

    .line 423
    new-instance v11, Ll/ܶ֡ܳ;

    invoke-direct {v11, v6}, Ll/ܶ֡ܳ;-><init>(Ll/ܶᩳܳ;)V

    invoke-virtual {v10, v11}, Ll/ۢۢܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 424
    invoke-virtual {v10, v9}, Ll/ۢۢܳ;->ۙ(Ljava/util/List;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 428
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v10, 0x1

    move-object v10, v9

    const/4 v11, 0x1

    goto :goto_1

    .line 432
    :goto_3
    invoke-virtual {v1, v9}, Ll/᩸ܽܺ;->ۙ(Ljava/lang/String;)V

    .line 433
    :try_start_0
    new-instance v14, Ljava/io/BufferedInputStream;

    invoke-virtual {v1, v3}, Ll/᩸ܽܺ;->ۤ(Ll/۟ܺܺ;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v14, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ll/ۡ֡ܳ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ܶܽܺ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 434
    :try_start_1
    invoke-static {v3, v14}, Ll/ᩳۜ۫;->ۙ(Ll/۟ܺܺ;Ljava/io/BufferedInputStream;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 767
    :goto_4
    invoke-virtual {v14, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-eq v0, v7, :cond_3

    .line 768
    :try_start_2
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v15, v9

    int-to-long v8, v0

    .line 769
    :try_start_3
    invoke-static {v12, v13, v8, v9}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide v12

    .line 770
    invoke-virtual {v5, v8, v9}, Ll/۟֡ܳ;->᩷(J)V

    .line 771
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    const/4 v0, -0x1

    move-object v9, v15

    const/4 v7, -0x1

    const/4 v8, 0x0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v15, v9

    :goto_5
    move-object v8, v15

    goto :goto_6

    :cond_3
    move-object v15, v9

    .line 773
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 438
    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9, v12, v13}, Ll/۟֡ܳ;->ۙ(JJ)V

    .line 439
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->ۗ()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v8, v15

    :try_start_4
    invoke-static {v0, v8}, Ll/᩶ۘܳ;->ۤ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 441
    :try_start_5
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ll/ۡ֡ܳ; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ll/ܶܽܺ; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_d

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_4
    move-object v8, v9

    .line 435
    :try_start_6
    new-instance v0, Ll/ܶܽܺ;

    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Ll/ܶܽܺ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v8, v9

    :goto_6
    move-object v9, v0

    .line 433
    :try_start_7
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object v12, v0

    :try_start_8
    invoke-virtual {v9, v12}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v9
    :try_end_8
    .catch Ll/ۡ֡ܳ; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ll/ܶܽܺ; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception v0

    .line 452
    invoke-static {v0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 453
    new-instance v1, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 453
    throw v1

    .line 455
    :cond_5
    new-instance v1, Ll/ܰ֡ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    :catch_1
    move-object v8, v9

    .line 444
    :catch_2
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۙ()V

    .line 445
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    .line 446
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->ۗ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Ll/᩶ۘܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v11, :cond_6

    .line 448
    invoke-static {}, Ll/ᩳۜ۫;->ۙ()V

    :cond_6
    const/4 v0, -0x1

    move-object v9, v10

    const/4 v0, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    goto/16 :goto_0

    :catch_3
    move-exception v0

    .line 442
    throw v0

    .line 183
    :cond_7
    invoke-virtual/range {p6 .. p6}, Ll/ܶᩳܳ;->cancel()V

    .line 426
    new-instance v0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 426
    throw v0

    :cond_8
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 346
    :cond_9
    :goto_8
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 349
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->᩹()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_b

    .line 350
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_9

    :cond_a
    const/4 v0, 0x0

    goto :goto_a

    :cond_b
    :goto_9
    if-nez v7, :cond_c

    .line 352
    invoke-static {}, Ll/᩶ۘܳ;->᩷()Ljava/util/Iterator;

    move-result-object v7

    .line 354
    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 355
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 356
    invoke-virtual {v2, v0}, Ll/᩺۬۫;->᩸(Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_b

    .line 359
    :cond_d
    new-instance v10, Ll/ۢۢܳ;

    new-instance v11, Ll/᩺۠֫;

    invoke-direct {v11, v2}, Ll/᩺۠֫;-><init>(Ljava/lang/Object;)V

    invoke-direct {v10, v0, v11}, Ll/ۢۢܳ;-><init>(Ll/ܽ֡֫;Ll/ᩳۢܳ;)V

    .line 360
    new-instance v0, Ll/ܶ֡ܳ;

    invoke-direct {v0, v6}, Ll/ܶ֡ܳ;-><init>(Ll/ܶᩳܳ;)V

    invoke-virtual {v10, v0}, Ll/ۢۢܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 361
    invoke-virtual {v10}, Ll/ۢۢܳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 366
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->᩹()Ljava/lang/String;

    move-result-object v10

    :goto_a
    const/4 v11, 0x0

    move-object/from16 v16, v10

    move v10, v0

    move-object/from16 v0, v16

    .line 369
    :goto_b
    invoke-virtual {v1, v0}, Ll/᩸ܽܺ;->ۙ(Ljava/lang/String;)V

    .line 370
    :try_start_9
    new-instance v12, Ljava/io/BufferedInputStream;

    invoke-virtual {v1, v3}, Ll/᩸ܽܺ;->ۤ(Ll/۟ܺܺ;)Ljava/io/InputStream;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_9
    .catch Ll/ۡ֡ܳ; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ll/ܶܽܺ; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 371
    :try_start_a
    invoke-static {v3, v12}, Ll/ᩳۜ۫;->ۙ(Ll/۟ܺܺ;Ljava/io/BufferedInputStream;)Z

    move-result v13

    if-eqz v13, :cond_11

    const-wide/16 v13, 0x0

    .line 767
    :goto_c
    invoke-virtual {v12, v4}, Ljava/io/InputStream;->read([B)I

    move-result v15

    const/4 v8, -0x1

    if-eq v15, v8, :cond_e

    .line 768
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v8, v15

    .line 769
    invoke-static {v13, v14, v8, v9}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide v13

    .line 770
    invoke-virtual {v5, v8, v9}, Ll/۟֡ܳ;->᩷(J)V

    .line 771
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    goto :goto_c

    .line 773
    :cond_e
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 375
    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9, v13, v14}, Ll/۟֡ܳ;->ۙ(JJ)V

    if-eqz v11, :cond_f

    .line 377
    invoke-virtual/range {p1 .. p1}, Ll/᩺۬۫;->ۗ()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Ll/ᩳۜ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 380
    :cond_f
    :try_start_b
    invoke-virtual {v12}, Ljava/io/BufferedInputStream;->close()V
    :try_end_b
    .catch Ll/ۡ֡ܳ; {:try_start_b .. :try_end_b} :catch_6
    .catch Ll/ܶܽܺ; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4

    :goto_d
    if-eqz p5, :cond_10

    .line 318
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    :cond_10
    return-void

    .line 372
    :cond_11
    :try_start_c
    new-instance v0, Ll/ܶܽܺ;

    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v8}, Ll/ܶܽܺ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :catchall_5
    move-exception v0

    move-object v8, v0

    .line 370
    :try_start_d
    invoke-virtual {v12}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    goto :goto_e

    :catchall_6
    move-exception v0

    move-object v9, v0

    :try_start_e
    invoke-virtual {v8, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v8
    :try_end_e
    .catch Ll/ۡ֡ܳ; {:try_start_e .. :try_end_e} :catch_6
    .catch Ll/ܶܽܺ; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_4

    :catch_4
    move-exception v0

    .line 391
    invoke-static {v0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v8

    if-nez v8, :cond_13

    .line 395
    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->ۜ()Z

    move-result v8

    if-eqz v11, :cond_12

    if-eqz v8, :cond_12

    .line 396
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۙ()V

    .line 397
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    const/4 v0, 0x0

    .line 398
    invoke-virtual {v2, v0}, Ll/᩺۬۫;->᩸(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 401
    :cond_12
    new-instance v1, Ll/ܰ֡ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    .line 392
    :cond_13
    new-instance v1, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 392
    throw v1

    .line 384
    :catch_5
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۙ()V

    .line 385
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    const/4 v0, 0x0

    .line 386
    invoke-virtual {v2, v0}, Ll/᩺۬۫;->᩸(Ljava/lang/String;)V

    if-eqz v10, :cond_9

    .line 388
    invoke-static {}, Ll/ᩳۜ۫;->ۙ()V

    goto/16 :goto_8

    :catch_6
    move-exception v0

    .line 382
    throw v0

    .line 183
    :cond_14
    invoke-virtual/range {p6 .. p6}, Ll/ܶᩳܳ;->cancel()V

    .line 364
    new-instance v0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 364
    throw v0

    :cond_15
    const-wide/16 v7, 0x0

    .line 322
    :try_start_f
    invoke-virtual {v1, v3}, Ll/᩸ܽܺ;->ۤ(Ll/۟ܺܺ;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_f
    .catch Ll/ۡ֡ܳ; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7

    .line 720
    :cond_16
    :goto_f
    :try_start_10
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_17

    .line 721
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v9, v0

    .line 723
    invoke-virtual {v5, v9, v10}, Ll/۟֡ܳ;->ۙ(J)V

    if-eqz p5, :cond_16

    .line 725
    invoke-virtual/range {p4 .. p4}, Ll/۟֡ܳ;->ۤ()V

    goto :goto_f

    .line 728
    :cond_17
    invoke-static/range {p6 .. p7}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 324
    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v9

    cmp-long v0, v9, v7

    if-nez v0, :cond_18

    const-wide/16 v6, 0x1

    .line 981
    invoke-virtual {v5, v6, v7}, Ll/۟֡ܳ;->ۙ(J)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 325
    :cond_18
    :try_start_11
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ll/ۡ֡ܳ; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7

    return-void

    :catchall_7
    move-exception v0

    move-object v2, v0

    .line 322
    :try_start_12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    goto :goto_10

    :catchall_8
    move-exception v0

    move-object v1, v0

    :try_start_13
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v2
    :try_end_13
    .catch Ll/ۡ֡ܳ; {:try_start_13 .. :try_end_13} :catch_8
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_7

    :catch_7
    move-exception v0

    .line 329
    invoke-static {v0}, Ll/۠֡ܳ;->ۙ(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 330
    new-instance v1, Ll/ۖ֡ܳ;

    .line 1093
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 330
    throw v1

    .line 332
    :cond_19
    new-instance v1, Ll/ܰ֡ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    :catch_8
    move-exception v0

    .line 327
    throw v0
.end method

.method public static synthetic ۙ(Ll/᩺۬۫;Ljava/util/List;Ll/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۟֡ܳ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 10

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 217
    :try_start_0
    invoke-virtual {p0}, Ll/᩺۬۫;->᩵()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩺۬۫;->ۘ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/᩸ܽܺ;->ۙ(Ll/᩷ۨᩴ;[B)Ll/᩸ܽܺ;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 218
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/۟ܺܺ;

    .line 219
    invoke-static {p2, p3}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p0

    move-object v4, v0

    move-object v5, p4

    move-object v7, p2

    move-object v8, p3

    .line 220
    invoke-static/range {v1 .. v8}, Ll/۠֡ܳ;->ۙ(Ll/᩸ܽܺ;Ll/᩺۬۫;Ll/۟ܺܺ;[BLl/۟֡ܳ;ZLl/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 222
    :cond_0
    :try_start_2
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception p0

    goto :goto_3

    .line 217
    :goto_1
    :try_start_3
    invoke-virtual {v9}, Ll/᩸ܽܺ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 223
    :goto_3
    instance-of p1, p0, Ll/ۡ֡ܳ;

    if-nez p1, :cond_3

    :cond_1
    const/4 p1, 0x0

    .line 0
    invoke-virtual {p5, p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_3
    :goto_4
    const/4 p0, 0x1

    .line 226
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static ۙ(Ll/᩺۬۫;Ll/ܶᩳܳ;)V
    .locals 17

    move-object/from16 v0, p1

    .line 156
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    .line 164
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ll/᩺۬۫;->۟()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 169
    new-instance v3, Ll/ܿۡۤ;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/ܿۡۤ;-><init>(I)V

    invoke-static {v2, v3}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 170
    new-instance v3, Ll/᩹֡ܳ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ll/ۖ۫ۗ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v2, v3}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 171
    new-instance v9, Ll/۟֡ܳ;

    .line 785
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-wide/16 v7, 0x1

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ܺܺ;

    .line 786
    invoke-virtual {v6}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v10

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide v4

    goto :goto_0

    .line 788
    :cond_0
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 171
    invoke-direct {v9, v3, v4, v0}, Ll/۟֡ܳ;-><init>(JLl/ܶᩳܳ;)V

    .line 173
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 174
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 175
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ܺܺ;

    .line 176
    invoke-virtual {v4}, Ll/۟ܺܺ;->᩹()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ll/۟ܺܺ;->ۛ()I

    move-result v5

    if-eqz v5, :cond_1

    .line 177
    invoke-virtual {v4}, Ll/۟ܺܺ;->ۛ()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_2

    .line 178
    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 180
    :cond_2
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 184
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/᩺۬۫;->᩵()Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v2

    .line 185
    invoke-virtual/range {p0 .. p0}, Ll/᩺۬۫;->᩶()Z

    move-result v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-eqz v2, :cond_6

    const/4 v2, 0x2

    if-ge v5, v2, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x4

    .line 203
    :goto_2
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v1, 0x1

    :goto_4
    if-le v1, v6, :cond_15

    .line 261
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v4, 0x0

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ܺܺ;

    .line 292
    invoke-virtual {v6}, Ll/۟ܺܺ;->ܳ()J

    move-result-wide v11

    invoke-virtual {v6}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v13

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    .line 262
    invoke-static {v4, v5, v11, v12}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide v4

    goto :goto_5

    :cond_7
    const-wide/16 v11, 0x0

    int-to-long v13, v1

    .line 264
    div-long v15, v4, v13

    .line 265
    rem-long/2addr v4, v13

    const/4 v2, 0x0

    cmp-long v6, v4, v11

    if-nez v6, :cond_8

    const/4 v4, 0x0

    goto :goto_6

    :cond_8
    const/4 v4, 0x1

    :goto_6
    int-to-long v4, v4

    add-long/2addr v4, v15

    .line 264
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 266
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 269
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v2, v8, :cond_b

    .line 270
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v2

    .line 271
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    sub-int v13, v1, v13

    .line 273
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_a

    const/4 v14, 0x1

    if-le v13, v14, :cond_a

    add-int/lit8 v13, v13, -0x1

    if-lt v8, v13, :cond_a

    cmp-long v14, v11, v4

    if-gez v14, :cond_9

    if-ne v8, v13, :cond_a

    .line 276
    :cond_9
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v11, 0x0

    .line 280
    :cond_a
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۟ܺܺ;

    .line 281
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    invoke-virtual {v8}, Ll/۟ܺܺ;->ܳ()J

    move-result-wide v13

    move-wide v15, v4

    invoke-virtual {v8}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v4

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide/16 v13, 0x1

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 282
    invoke-static {v11, v12, v4, v5}, Ll/۠֡ܳ;->᩷(JJ)J

    move-result-wide v11

    add-int/lit8 v2, v2, 0x1

    move-wide v4, v15

    goto :goto_7

    .line 284
    :cond_b
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    .line 285
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    .line 211
    new-instance v11, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 212
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 213
    new-instance v13, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    .line 215
    new-instance v15, Ll/ۗ֡ܳ;

    move-object v1, v15

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move-object v5, v11

    move-object v6, v9

    move-object v7, v12

    invoke-direct/range {v1 .. v7}, Ll/ۗ֡ܳ;-><init>(Ll/᩺۬۫;Ljava/util/List;Ll/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۟֡ܳ;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v8, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 230
    :cond_d
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 232
    :cond_e
    :goto_9
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x64

    invoke-interface {v8, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 233
    invoke-virtual {v9}, Ll/۟֡ܳ;->ۤ()V

    .line 234
    invoke-virtual/range {p1 .. p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_e

    :cond_f
    const/4 v1, 0x1

    .line 235
    invoke-virtual {v11, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 236
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    const/4 v3, 0x1

    .line 237
    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_a

    .line 239
    :cond_10
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    .line 249
    :cond_11
    invoke-virtual/range {p1 .. p1}, Ll/ܶᩳܳ;->ۢۙ()Z

    move-result v1

    if-nez v1, :cond_14

    .line 252
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-nez v1, :cond_12

    goto :goto_c

    .line 823
    :cond_12
    instance-of v0, v1, Ljava/lang/Exception;

    if-eqz v0, :cond_13

    check-cast v1, Ljava/lang/Exception;

    goto :goto_b

    :cond_13
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v0

    .line 254
    :goto_b
    invoke-static {v1}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v1

    .line 250
    :cond_14
    new-instance v0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 250
    throw v0

    .line 243
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 183
    invoke-virtual/range {p1 .. p1}, Ll/ܶᩳܳ;->cancel()V

    const/4 v0, 0x1

    .line 245
    invoke-virtual {v11, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 246
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 247
    new-instance v0, Ll/ۡ֡ܳ;

    .line 1097
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 247
    throw v0

    .line 189
    :cond_15
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    new-instance v1, Ll/᩹֡ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/ۖ۫ۗ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v10, v1}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 298
    :goto_c
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_e

    .line 301
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ll/᩺۬۫;->᩵()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ll/᩺۬۫;->ۘ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/᩸ܽܺ;->ۙ(Ll/᩷ۨᩴ;[B)Ll/᩸ܽܺ;

    move-result-object v11

    .line 302
    :try_start_2
    new-instance v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    const/high16 v1, 0x10000

    new-array v13, v1, [B

    .line 304
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/۟ܺܺ;

    .line 305
    invoke-static {v0, v12}, Ll/۠֡ܳ;->ۙ(Ll/ۛ֡ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v6, 0x1

    move-object v1, v11

    move-object/from16 v2, p0

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v7, p1

    move-object v8, v12

    .line 306
    invoke-static/range {v1 .. v8}, Ll/۠֡ܳ;->ۙ(Ll/᩸ܽܺ;Ll/᩺۬۫;Ll/۟ܺܺ;[BLl/۟֡ܳ;ZLl/ܶᩳܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_d

    .line 308
    :cond_17
    invoke-virtual {v11}, Ll/᩸ܽܺ;->close()V

    .line 193
    :goto_e
    invoke-virtual {v9}, Ll/۟֡ܳ;->᩷()V

    .line 194
    invoke-virtual {v9}, Ll/۟֡ܳ;->ۤ()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 301
    :try_start_3
    invoke-virtual {v11}, Ll/᩸ܽܺ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_f

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1

    :catch_1
    move-exception v0

    .line 166
    new-instance v1, Ll/ܰ֡ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/ܰ֡ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1
.end method

.method public static ۙ(Ljava/lang/Exception;)Z
    .locals 3

    :goto_0
    if-eqz p0, :cond_3

    .line 800
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "unsupported"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 803
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unsupported compression method"

    .line 806
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupported encryption method"

    .line 807
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupported method"

    .line 808
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupportedmethod"

    .line 809
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "not implemented"

    .line 810
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "e_notimpl"

    .line 811
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "dictionary mismatch"

    .line 812
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "dictionary required"

    .line 813
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "requires a dictionary"

    .line 814
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    .line 799
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ۤ(Ll/۟ۘܳ;)Ll/᩷ۨᩴ;
    .locals 1

    .line 871
    instance-of v0, p0, Ll/᩺۬۫;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩺۬۫;

    .line 872
    invoke-virtual {p0}, Ll/᩺۬۫;->᩵()Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 874
    :cond_0
    instance-of v0, p0, Ll/ۧۖ۫;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۧۖ۫;

    .line 875
    invoke-virtual {p0}, Ll/ۧۖ۫;->ܽ()Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 877
    :cond_1
    instance-of v0, p0, Ll/ܺᩴ۫;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ܺᩴ۫;

    .line 878
    invoke-virtual {p0}, Ll/ܺᩴ۫;->ܽ()Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 880
    :cond_2
    instance-of v0, p0, Ll/ۡᩴ۫;

    if-eqz v0, :cond_3

    check-cast p0, Ll/ۡᩴ۫;

    .line 881
    invoke-virtual {p0}, Ll/ۡᩴ۫;->ۚ()Ll/᩷ۨᩴ;

    move-result-object p0

    return-object p0

    .line 883
    :cond_3
    new-instance p0, Ll/ۖ֡ܳ;

    .line 1089
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 883
    throw p0
.end method

.method public static ᩴ(Ll/۟ۘܳ;)Ljava/lang/String;
    .locals 0

    .line 77
    invoke-static {p0}, Ll/۠֡ܳ;->ۤ(Ll/۟ۘܳ;)Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(JJ)J
    .locals 5

    const-wide v0, 0x7fffffffffffffffL

    sub-long v2, v0, p0

    cmp-long v4, p2, v2

    if-lez v4, :cond_0

    return-wide v0

    :cond_0
    add-long/2addr p0, p2

    return-wide p0
.end method

.method public static ᩷(Ll/᩷ۨᩴ;)Ll/ۘ֡ܳ;
    .locals 7

    .line 122
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    new-instance v0, Ll/ۘ֡ܳ;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v3

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v5

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/ۘ֡ܳ;-><init>(Ljava/lang/String;JJ)V

    return-object v0

    .line 123
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩷(Ll/۟ۘܳ;)Ll/ۢ֡ܳ;
    .locals 4

    .line 82
    invoke-static {p0}, Ll/۠֡ܳ;->᩸(Ll/۟ۘܳ;)Ljava/util/LinkedHashMap;

    move-result-object p0

    .line 83
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 84
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۨᩴ;

    .line 85
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ll/۠֡ܳ;->᩷(Ll/᩷ۨᩴ;)Ll/ۘ֡ܳ;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 87
    :cond_0
    new-instance p0, Ll/ۢ֡ܳ;

    .line 0
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ll/ۙۚۗ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 87
    invoke-direct {p0, v0}, Ll/ۢ֡ܳ;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static ᩸(Ll/۟ۘܳ;)Ljava/util/LinkedHashMap;
    .locals 6

    const-string v0, "Invalid ZIP split volume count: "

    .line 93
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 94
    invoke-static {p0}, Ll/۠֡ܳ;->ۤ(Ll/۟ۘܳ;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    instance-of v3, p0, Ll/᩺۬۫;

    if-eqz v3, :cond_1

    move-object v3, p0

    check-cast v3, Ll/᩺۬۫;

    invoke-virtual {v3}, Ll/᩺۬۫;->᩶()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 98
    :try_start_0
    new-instance p0, Ll/᩵ۚۤ;

    invoke-virtual {v3}, Ll/᩺۬۫;->ۘ()[B

    move-result-object v3

    invoke-direct {p0, v3}, Ll/᩵ۚۤ;-><init>([B)V

    .line 99
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readInt()I

    move-result v3

    if-lez v3, :cond_0

    const/16 v4, 0x2710

    if-gt v3, v4, :cond_0

    .line 103
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۧۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_2

    .line 105
    invoke-virtual {p0}, Ll/᩵ۚۤ;->᩶()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    .line 106
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readLong()J

    .line 107
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 101
    :cond_0
    new-instance p0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 110
    :goto_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid ZIP split metadata"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 112
    :cond_1
    instance-of v0, p0, Ll/ܺᩴ۫;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ܺᩴ۫;

    .line 113
    invoke-virtual {p0}, Ll/ܺᩴ۫;->᩹()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۨᩴ;

    .line 114
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-object v1
.end method
