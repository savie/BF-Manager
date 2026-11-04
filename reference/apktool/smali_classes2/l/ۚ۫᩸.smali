.class public final Ll/ۚ۫᩸;
.super Ljava/lang/Object;
.source "SB38"


# direct methods
.method public static ۙ(Ll/᩷ۨᩴ;)Ljava/util/List;
    .locals 10

    .line 219
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 212
    invoke-static {v0}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 213
    invoke-virtual {v0}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v0

    sget-object v1, Ll/᩻ܳ᩸;->᩶:Ll/᩻ܳ᩸;

    if-ne v0, v1, :cond_5

    .line 222
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 224
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 226
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 227
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 228
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x3

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v5, 0x0

    .line 0
    invoke-static {v4, v5, v2}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    const/4 v6, 0x1

    :goto_0
    const/16 v7, 0x3e7

    if-gt v6, v7, :cond_3

    if-ne v6, v3, :cond_1

    .line 232
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 235
    :cond_1
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v2, v9, v5

    aput-object v8, v9, v4

    const-string v8, "%s%03d"

    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v7

    .line 236
    invoke-virtual {v7}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 237
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    if-ge v6, v3, :cond_3

    .line 240
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 246
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_4

    return-object v1

    :cond_4
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/util/function/Consumer;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 6

    const-string v0, ".part1.rar"

    .line 45
    invoke-static {}, Ll/᩻۫᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 48
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    new-instance v2, Ll/ᩴ۫᩸;

    invoke-direct {v2, v1, p1}, Ll/ᩴ۫᩸;-><init>(Ljava/lang/String;Ljava/util/function/Consumer;)V

    const/4 v1, 0x0

    .line 71
    :try_start_0
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 212
    invoke-static {v3}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 213
    invoke-virtual {v3}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v3

    sget-object v5, Ll/᩻ܳ᩸;->᩶:Ll/᩻ܳ᩸;

    if-ne v3, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 72
    invoke-static {p0, p1}, Ll/ۚ۫᩸;->᩷(Ll/᩷ۨᩴ;Ljava/util/function/Consumer;)Ll/ۖ᩸ۨ;

    move-result-object p1

    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v5, ".*\\.part[0-9]+\\.rar"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 74
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v5, ".part"

    invoke-virtual {v3, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 77
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Ll/᩷ۨᩴ;->ᩴ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object p0, p1

    .line 84
    :cond_2
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ܶܳ᩸;->getStream(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInStream;

    move-result-object p1

    goto :goto_1

    .line 87
    :cond_3
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 89
    new-instance p1, Ll/ۖ᩸ۨ;

    invoke-direct {p1, p0}, Ll/ۖ᩸ۨ;-><init>(Ll/᩷ۨᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    :goto_1
    :try_start_1
    move-object v0, p1

    check-cast v0, Ll/ۖ᩸ۨ;

    invoke-static {v0, v2}, Lnet/sf/sevenzipjbinding/SevenZip;->ۙ(Ll/ۖ᩸ۨ;Ll/ܶܳ᩸;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v1

    .line 92
    invoke-interface {v1, p1}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 93
    invoke-interface {v1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 94
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileName(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileSize(J)V

    .line 96
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileTime(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catchall_1
    move-exception p0

    move-object p1, v1

    .line 102
    :goto_2
    invoke-static {v1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 103
    invoke-static {p1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 104
    invoke-static {v2}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 106
    throw p0

    .line 46
    :cond_4
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-static {}, Ll/᩻۫᩸;->᩸()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Lbin/mt/plus/Main;Ll/᩷ۨᩴ;Ll/۫۫᩸;)V
    .locals 6

    const-string v0, ".part1.rar"

    .line 114
    invoke-static {}, Ll/᩻۫᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 117
    new-instance v1, Ll/ܳ۫᩸;

    invoke-direct {v1, p0, p2}, Ll/ܳ۫᩸;-><init>(Ll/ܽ֡֫;Ll/۫۫᩸;)V

    .line 129
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/᩵ܳ᩸;->ܺ(Ljava/lang/String;)V

    .line 130
    new-instance p0, Ll/ۤ۫᩸;

    invoke-direct {p0, p2}, Ll/ۤ۫᩸;-><init>(Ll/۫۫᩸;)V

    invoke-virtual {v1, p0}, Ll/᩵ܳ᩸;->ۙ(Ljava/util/function/BooleanSupplier;)V

    :goto_0
    const/4 p0, 0x0

    .line 137
    :try_start_0
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 212
    invoke-static {v2}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 213
    invoke-virtual {v2}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v2

    sget-object v4, Ll/᩻ܳ᩸;->᩶:Ll/᩻ܳ᩸;

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    .line 138
    new-instance v2, Ll/᩸۫᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p2}, Ll/᩸۫᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v2}, Ll/ۚ۫᩸;->᩷(Ll/᩷ۨᩴ;Ljava/util/function/Consumer;)Ll/ۖ᩸ۨ;

    move-result-object v2

    goto :goto_2

    .line 139
    :cond_1
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, ".*\\.part[0-9]+\\.rar"

    invoke-virtual {v2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 140
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 142
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".part"

    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 143
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-virtual {p1, v2}, Ll/᩷ۨᩴ;->ᩴ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 145
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->֨()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object p1, v2

    .line 150
    :cond_2
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܶܳ᩸;->getStream(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInStream;

    move-result-object v2

    goto :goto_2

    .line 152
    :cond_3
    invoke-interface {p2, p1}, Ll/۫۫᩸;->ۙ(Ll/᩷ۨᩴ;)V

    .line 153
    new-instance v2, Ll/ۖ᩸ۨ;

    invoke-direct {v2, p1}, Ll/ۖ᩸ۨ;-><init>(Ll/᩷ۨᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 156
    :goto_2
    :try_start_1
    move-object v3, v2

    check-cast v3, Ll/ۖ᩸ۨ;

    invoke-static {v3, v1}, Lnet/sf/sevenzipjbinding/SevenZip;->ۙ(Ll/ۖ᩸ۨ;Ll/ܶܳ᩸;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0
    :try_end_1
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    :try_start_2
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileName(Ljava/lang/String;)V

    .line 176
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileSize(J)V

    .line 177
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileTime(J)V

    .line 178
    invoke-interface {p0, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 179
    invoke-interface {p0, v1}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 180
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->᩶ۙ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 181
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->ۘۙ()Ljava/lang/String;

    move-result-object v0

    .line 182
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 183
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Ll/᩶ۘܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :cond_4
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->۠()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 187
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->ۘۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ᩳۜ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :cond_5
    invoke-interface {p2, p0}, Ll/۫۫᩸;->ۙ(Lnet/sf/sevenzipjbinding/IInArchive;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception v3

    .line 158
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->ܰۙ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 159
    invoke-interface {p2}, Ll/۫۫᩸;->᩷()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 198
    :try_start_3
    invoke-static {v2}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 199
    invoke-virtual {v1}, Ll/ܶܳ᩸;->ܿۙ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 206
    invoke-virtual {v1}, Ll/ܶܳ᩸;->close()V

    return-void

    .line 162
    :cond_6
    :try_start_4
    invoke-interface {p2}, Ll/۟֡֫;->۫()Z

    move-result v4

    if-nez v4, :cond_9

    .line 166
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->᩶ۙ()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 167
    invoke-virtual {v1}, Ll/᩵ܳ᩸;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 168
    invoke-static {}, Ll/ᩳۜ۫;->ۙ()V

    .line 170
    :cond_7
    invoke-virtual {v1, p0}, Ll/᩵ܳ᩸;->ܺ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    :try_start_5
    invoke-static {v2}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 199
    invoke-virtual {v1}, Ll/ܶܳ᩸;->ܿۙ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_0

    .line 173
    :cond_8
    :try_start_6
    throw v3

    .line 163
    :cond_9
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_1
    move-exception p1

    move-object v2, p0

    :goto_3
    if-eqz p0, :cond_a

    .line 196
    :try_start_7
    invoke-static {p0}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    goto :goto_4

    .line 198
    :cond_a
    invoke-static {v2}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 199
    invoke-virtual {v1}, Ll/ܶܳ᩸;->ܿۙ()V

    .line 202
    :goto_4
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    .line 206
    invoke-virtual {v1}, Ll/ܶܳ᩸;->close()V

    .line 208
    throw p0

    .line 115
    :cond_b
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-static {}, Ll/᩻۫᩸;->᩸()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩷(Ll/᩷ۨᩴ;Ljava/util/function/Consumer;)Ll/ۖ᩸ۨ;
    .locals 4

    .line 250
    invoke-static {p0}, Ll/ۚ۫᩸;->ۙ(Ll/᩷ۨᩴ;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 255
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 256
    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    .line 259
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 260
    new-instance p1, Ll/ۖ᩸ۨ;

    invoke-direct {p1, p0}, Ll/ۖ᩸ۨ;-><init>(Ll/᩷ۨᩴ;)V

    return-object p1

    .line 262
    :cond_1
    new-instance p1, Ll/᩷ۢ᩹;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p1, v1}, Ll/᩷ۢ᩹;-><init>(I)V

    .line 263
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 264
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/᩷ۢ᩹;->add(J)Z

    goto :goto_1

    .line 267
    :cond_2
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ll/۫ᩳ᩹;->ᩴ()[J

    move-result-object p1

    new-instance v1, Ll/᩶ۜ᩻;

    invoke-direct {v1, v0}, Ll/᩶ۜ᩻;-><init>(Ljava/lang/Object;)V

    .line 266
    invoke-static {p0, p1, v1}, Ll/᩵ܽۤ;->ۙ(Ljava/lang/String;[JLl/ۗܽۤ;)Ll/᩵ܽۤ;

    move-result-object p0

    invoke-static {p0}, Ll/ۧܽۤ;->ۙ(Ll/ܳܽۤ;)Ll/۬ܺۤ;

    move-result-object p0

    .line 268
    new-instance p1, Ll/ۖ᩸ۨ;

    invoke-direct {p1, p0}, Ll/ۖ᩸ۨ;-><init>(Ll/ܽܽۤ;)V

    return-object p1

    .line 252
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Not a split 7z file"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
