.class public final Ll/᩻ܿᩴ;
.super Ll/ۧۨᩴ;
.source "I6YB"


# instance fields
.field public final ۤ:Ll/֫ܿᩴ;

.field public ᩷:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/֫ܿᩴ;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Ll/ۧۨᩴ;-><init>(Ll/᩷ۨᩴ;)V

    .line 35
    iput-object p1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    return-void
.end method

.method private ֫()Ll/֫ۨᩴ;
    .locals 12

    .line 406
    iget-object v0, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-virtual {v1}, Ll/֫ܿᩴ;->۟᩷()Ll/֫ܿᩴ;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 97
    :try_start_0
    new-instance v3, Ll/᩻ܿᩴ;

    invoke-direct {v3, v2}, Ll/᩻ܿᩴ;-><init>(Ll/֫ܿᩴ;)V

    .line 173
    invoke-virtual {v3}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v2

    invoke-direct {v3, v2}, Ll/᩻ܿᩴ;->᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;

    move-result-object v2
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_0

    .line 419
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۨᩴ;

    .line 420
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ll/֫ۨᩴ;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 423
    :cond_0
    invoke-virtual {v3}, Ll/֫ۨᩴ;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    check-cast v0, Ll/֫ܿᩴ;

    .line 424
    invoke-virtual {v0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v0

    .line 425
    invoke-virtual {v3}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v2

    sget-object v4, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne v2, v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 424
    :goto_1
    invoke-virtual {v1, v0, v2}, Ll/᩸ܿᩴ;->ۙ(Landroid/net/Uri;Z)V

    .line 426
    new-instance v0, Ll/֫ۨᩴ;

    invoke-virtual {v3}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v6

    invoke-virtual {v3}, Ll/֫ۨᩴ;->ۤ()J

    move-result-wide v7

    invoke-virtual {v3}, Ll/֫ۨᩴ;->᩷()J

    move-result-wide v9

    .line 427
    invoke-virtual {v3}, Ll/֫ۨᩴ;->᩸()Ljava/lang/String;

    move-result-object v11

    iget-object v5, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Ll/֫ۨᩴ;-><init>(Ll/᩷ۨᩴ;Ll/۫ۨᩴ;JJLjava/lang/String;)V

    return-object v0

    .line 429
    :cond_2
    invoke-static {v0}, Ll/֫ۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/֫ۨᩴ;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    .line 414
    invoke-virtual {v1}, Ll/᩸ۨᩴ;->ۤ()Ll/ۤۨᩴ;

    move-result-object v2

    sget-object v3, Ll/ۤۨᩴ;->ۢ:Ll/ۤۨᩴ;

    if-ne v2, v3, :cond_3

    .line 415
    invoke-static {v0}, Ll/֫ۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/֫ۨᩴ;

    move-result-object v0

    return-object v0

    .line 417
    :cond_3
    throw v1

    .line 408
    :cond_4
    sget-object v0, Ll/ۚۨᩴ;->ۡ:Ll/ۚۨᩴ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method

.method private ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;
    .locals 9

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Checked file operation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " failed for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    iget-object v1, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    invoke-static {v1, v0}, Ll/֨᩵ᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v7

    if-nez p3, :cond_0

    .line 466
    new-instance p3, Ll/᩸ۨᩴ;

    sget-object v4, Ll/ۤۨᩴ;->۟:Ll/ۤۨᩴ;

    .line 467
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v5

    move-object v2, p3

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Ll/᩸ۨᩴ;-><init>(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    .line 469
    :cond_0
    instance-of v0, p3, Ljava/io/IOException;

    if-eqz v0, :cond_1

    check-cast p3, Ljava/io/IOException;

    .line 470
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2, p3}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/io/IOException;)Ll/᩸ۨᩴ;

    move-result-object p1

    return-object p1

    .line 472
    :cond_1
    new-instance v0, Ll/᩸ۨᩴ;

    sget-object v4, Ll/ۤۨᩴ;->۟:Ll/ۤۨᩴ;

    .line 473
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v5

    move-object v2, v0

    move-object v3, p1

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Ll/᩸ۨᩴ;-><init>(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method private ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;
    .locals 8

    .line 458
    new-instance v7, Ll/᩸ۨᩴ;

    sget-object v2, Ll/ۤۨᩴ;->ۡ:Ll/ۤۨᩴ;

    .line 459
    iget-object v0, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Checked file operation "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " failed for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v0, v1}, Ll/֨᩵ᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    move-object v0, v7

    move-object v1, p1

    move-object v4, p2

    move-object v6, p3

    .line 460
    invoke-direct/range {v0 .. v6}, Ll/᩸ۨᩴ;-><init>(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v7
.end method

.method public static ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V
    .locals 3

    .line 446
    invoke-virtual {p0}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v0

    sget-object v1, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    .line 450
    invoke-virtual {p0}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v0

    sget-object v1, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne v0, v1, :cond_0

    return-void

    .line 451
    :cond_0
    sget-object v0, Ll/ۤۨᩴ;->ᩳ:Ll/ۤۨᩴ;

    .line 452
    invoke-virtual {p0}, Ll/֫ۨᩴ;->ۙ()Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    .line 451
    invoke-static {p1, v0, p0, v2}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p0

    throw p0

    .line 447
    :cond_1
    sget-object v0, Ll/ۤۨᩴ;->ۢ:Ll/ۤۨᩴ;

    .line 448
    invoke-virtual {p0}, Ll/֫ۨᩴ;->ۙ()Ll/᩷ۨᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    .line 447
    invoke-static {p1, v0, p0, v2}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p0

    throw p0
.end method

.method private ۙ(Ll/ۚۨᩴ;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_2

    .line 393
    invoke-static {p2}, Ll/ᩴ᩶ᩴ;->ᩴ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 394
    invoke-static {p3, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 395
    invoke-static {p2}, Ll/᩸᩶ᩴ;->ۤ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 396
    :cond_0
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Provider returned an unexpected document name"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p4, p2}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 p2, 0x0

    .line 391
    invoke-direct {p0, p1, p4, p2}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
.end method

.method public static ۙ(Ll/֫ܿᩴ;)Z
    .locals 1

    .line 435
    instance-of v0, p0, Ll/֡᩶ᩴ;

    if-eqz v0, :cond_1

    .line 434
    check-cast p0, Ll/֡᩶ᩴ;

    .line 125
    iget-boolean v0, p0, Ll/֫᩶ᩴ;->ۖ:Z

    if-nez v0, :cond_0

    .line 435
    invoke-virtual {p0}, Ll/֡᩶ᩴ;->᩻ۤ()Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;
    .locals 11

    .line 179
    iget-object v0, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    sget-object v1, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    invoke-static {p1, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V

    .line 180
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    .line 181
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    .line 183
    :try_start_0
    invoke-virtual {v0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v3

    iget-object v9, v0, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    invoke-static {v3}, Ll/᩸᩶ᩴ;->ۙ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 184
    invoke-virtual {v0}, Ll/֫ܿᩴ;->֨᩷()[Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 182
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_5

    .line 189
    :try_start_1
    invoke-static {v2}, Ll/ᩴ᩶ᩴ;->ۙ(Landroid/database/Cursor;)V

    .line 190
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 191
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    .line 192
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 193
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_3

    if-eqz v5, :cond_3

    .line 200
    invoke-static {v1, v5, v4}, Ll/ۧۚۗ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 202
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 203
    :cond_0
    sget-object p1, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Provider returned ambiguous child names"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v8, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 210
    :cond_1
    invoke-virtual {v0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v6

    .line 209
    invoke-static {v6, v4}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 211
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v9, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v6, v4, v2}, Ll/֫ܿᩴ;->ۙ(Ljava/io/File;Landroid/net/Uri;Landroid/database/Cursor;)Ll/᩷ۨᩴ;

    move-result-object v6

    .line 213
    check-cast v6, Ll/֫ܿᩴ;

    invoke-virtual {v6, v2}, Ll/֫ܿᩴ;->᩷(Landroid/database/Cursor;)Ll/֫ۨᩴ;

    move-result-object v6

    .line 214
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v9, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 216
    invoke-virtual {v6}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v5

    sget-object v10, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne v5, v10, :cond_2

    const/4 v3, 0x1

    .line 214
    :cond_2
    invoke-virtual {v0, v7, v4, v3}, Ll/֫ܿᩴ;->ۙ(Ljava/io/File;Landroid/net/Uri;Z)V

    .line 217
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 195
    :cond_3
    sget-object p1, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    invoke-direct {p0, p1, v8, v8}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    :cond_4
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ll/᩸ۨᩴ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    .line 187
    :cond_5
    :try_start_3
    invoke-direct {p0, v1, v8, v8}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_6

    .line 182
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_1
    throw p1
    :try_end_5
    .catch Ll/᩸ۨᩴ; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p1

    .line 225
    sget-object v0, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    invoke-direct {p0, v0, v8, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 223
    sget-object v0, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    invoke-direct {p0, v0, v8, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 221
    throw p1
.end method

.method private ᩷(Ll/ۚۨᩴ;)V
    .locals 1

    .line 440
    iget-object v0, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-static {v0}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ܿᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 441
    invoke-virtual {p0, p1, v0}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ۙ(Ll/֫ۨᩴ;)Ljava/util/List;
    .locals 2

    .line 165
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    if-ne v0, v1, :cond_0

    .line 168
    invoke-direct {p0, p1}, Ll/᩻ܿᩴ;->᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 166
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Directory snapshot belongs to another file"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/ۚۨᩴ;)Ll/ܳۨᩴ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-static {v0}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ܿᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/ۚۨᩴ;->ۡ:Ll/ۚۨᩴ;

    if-eq p1, v0, :cond_0

    sget-object v0, Ll/ۚۨᩴ;->ᩳ:Ll/ۚۨᩴ;

    if-eq p1, v0, :cond_0

    .line 42
    sget-object p1, Ll/ܳۨᩴ;->۟:Ll/ܳۨᩴ;

    return-object p1

    .line 44
    :cond_0
    sget-object v0, Ll/ۧܿᩴ;->ۙ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p1

    .line 51
    :pswitch_0
    sget-object p1, Ll/ܳۨᩴ;->۟:Ll/ܳۨᩴ;

    return-object p1

    .line 49
    :pswitch_1
    sget-object p1, Ll/ܳۨᩴ;->ܿ:Ll/ܳۨᩴ;

    return-object p1

    .line 45
    :pswitch_2
    sget-object p1, Ll/ܳۨᩴ;->֡:Ll/ܳۨᩴ;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 11

    .line 324
    sget-object v0, Ll/ۚۨᩴ;->ۢ:Ll/ۚۨᩴ;

    invoke-direct {p0, v0}, Ll/᩻ܿᩴ;->᩷(Ll/ۚۨᩴ;)V

    .line 325
    instance-of v1, p1, Ll/֫ܿᩴ;

    iget-object v2, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    if-eqz v1, :cond_9

    move-object v1, p1

    check-cast v1, Ll/֫ܿᩴ;

    iget-object v3, v1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    .line 326
    iget-object v4, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-virtual {v4}, Ll/֫ܿᩴ;->ۡ᩷()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    invoke-virtual {v1}, Ll/֫ܿᩴ;->ۡ᩷()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 330
    invoke-static {v1}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ܿᩴ;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 157
    invoke-virtual {v6}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v7

    .line 335
    invoke-static {v5, v7}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 146
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 336
    invoke-static {v5, v7}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 337
    invoke-virtual {p0, v0, p1}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 339
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v5

    .line 340
    invoke-virtual {v5}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v7

    sget-object v8, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-eq v7, v8, :cond_7

    .line 97
    new-instance v7, Ll/᩻ܿᩴ;

    invoke-direct {v7, v1}, Ll/᩻ܿᩴ;-><init>(Ll/֫ܿᩴ;)V

    .line 344
    invoke-virtual {v7}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v7

    invoke-virtual {v7}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v7

    if-ne v7, v8, :cond_6

    .line 348
    invoke-virtual {v4}, Ll/֫ܿᩴ;->۟᩷()Ll/֫ܿᩴ;

    move-result-object v7

    .line 349
    invoke-virtual {v1}, Ll/֫ܿᩴ;->۟᩷()Ll/֫ܿᩴ;

    move-result-object v8

    if-eqz v7, :cond_5

    if-eqz v8, :cond_5

    .line 351
    invoke-virtual {v7}, Ll/֫ܿᩴ;->ۡ᩷()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ll/֫ܿᩴ;->ۡ᩷()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 97
    new-instance v2, Ll/᩻ܿᩴ;

    invoke-direct {v2, v8}, Ll/᩻ܿᩴ;-><init>(Ll/֫ܿᩴ;)V

    .line 355
    invoke-virtual {v2}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v2

    invoke-static {v2, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V

    .line 356
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    .line 357
    invoke-virtual {v4}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v9

    invoke-static {v9}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v9

    .line 157
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v10

    .line 359
    invoke-static {v6, v10}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 361
    invoke-static {v2, v9, v6}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 362
    check-cast p1, Ll/֫ܿᩴ;

    .line 151
    iget-object p1, p1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 360
    invoke-direct {p0, v0, v2, v6, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 365
    :cond_2
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x18

    if-lt v6, v10, :cond_4

    .line 370
    invoke-virtual {v7}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v6

    invoke-static {v6}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v6

    .line 371
    invoke-virtual {v8}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v7

    invoke-static {v7}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v7

    .line 369
    invoke-static {v2, v9, v6, v7}, Landroid/provider/DocumentsContract;->moveDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 372
    check-cast p1, Ll/֫ܿᩴ;

    .line 151
    iget-object p1, p1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 368
    invoke-direct {p0, v0, v2, v6, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    :goto_1
    invoke-virtual {v4}, Ll/֫ܿᩴ;->ܿ᩷()V

    .line 375
    invoke-virtual {v5}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object p1

    sget-object v0, Ll/۫ۨᩴ;->᩶:Ll/۫ۨᩴ;

    if-ne p1, v0, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {v1, v2, p1}, Ll/᩸ܿᩴ;->ۙ(Landroid/net/Uri;Z)V

    return-void

    .line 366
    :cond_4
    check-cast p1, Ll/֫ܿᩴ;

    .line 151
    iget-object p1, p1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 366
    invoke-virtual {p0, v0, p1}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 383
    sget-object v0, Ll/ۚۨᩴ;->ۢ:Ll/ۚۨᩴ;

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 383
    invoke-direct {p0, v0, v1, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 381
    :catch_1
    sget-object p1, Ll/ۚۨᩴ;->ۢ:Ll/ۚۨᩴ;

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 381
    invoke-virtual {p0, p1, v0}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 379
    sget-object v0, Ll/ۚۨᩴ;->ۢ:Ll/ۚۨᩴ;

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 379
    invoke-direct {p0, v0, v1, p1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 377
    throw p1

    .line 352
    :cond_5
    sget-object p1, Ll/ۤۨᩴ;->ܿ:Ll/ۤۨᩴ;

    .line 353
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 352
    invoke-static {v0, p1, v1, v2}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 345
    :cond_6
    sget-object p1, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    .line 346
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 345
    invoke-static {v0, p1, v1, v2}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 341
    :cond_7
    sget-object p1, Ll/ۤۨᩴ;->ۢ:Ll/ۤۨᩴ;

    .line 342
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 341
    invoke-static {v0, p1, v1, v2}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 151
    :cond_8
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 331
    invoke-virtual {p0, v0, p1}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1

    .line 327
    :cond_9
    sget-object v1, Ll/ۤۨᩴ;->ܿ:Ll/ۤۨᩴ;

    .line 328
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    .line 327
    invoke-static {v0, v1, v2, p1}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object p1

    throw p1
.end method

.method public final ۙ()Z
    .locals 3

    .line 100
    iget-object v0, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 101
    invoke-super {p0}, Ll/ۧۨᩴ;->ۙ()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 104
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v1

    iget-object v2, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    invoke-static {v1, v2}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 107
    :cond_1
    iput-object v0, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    .line 108
    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-virtual {v1}, Ll/֫ܿᩴ;->ܿ᩷()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    .line 113
    sget-object v2, Ll/ۚۨᩴ;->۟:Ll/ۚۨᩴ;

    invoke-direct {p0, v2, v0, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    .line 111
    sget-object v2, Ll/ۚۨᩴ;->۟:Ll/ۚۨᩴ;

    invoke-direct {p0, v2, v0, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method

.method public final ۚ()Ll/֫ۨᩴ;
    .locals 9

    .line 119
    iget-object v0, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v8, 0x0

    .line 121
    :try_start_0
    invoke-virtual {v1}, Ll/֫ܿᩴ;->۬᩷()Z

    move-result v3

    if-nez v3, :cond_0

    .line 122
    invoke-static {v0}, Ll/֫ۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/֫ۨᩴ;

    move-result-object v0

    return-object v0

    .line 125
    :cond_0
    invoke-virtual {v1}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 126
    invoke-virtual {v1}, Ll/֫ܿᩴ;->ᩳ᩷()[Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 124
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_1

    .line 128
    :try_start_1
    invoke-direct {p0}, Ll/᩻ܿᩴ;->֫()Ll/֫ۨᩴ;

    move-result-object v3

    if-eqz v2, :cond_4

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {v2}, Ll/ᩴ᩶ᩴ;->ۙ(Landroid/database/Cursor;)V

    .line 131
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_3

    .line 132
    instance-of v3, v1, Ll/֫᩶ᩴ;

    if-eqz v3, :cond_2

    .line 133
    invoke-direct {p0}, Ll/᩻ܿᩴ;->֫()Ll/֫ۨᩴ;

    move-result-object v3

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ll/֫ۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/֫ۨᩴ;

    move-result-object v3

    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v1, v2}, Ll/֫ܿᩴ;->ۙ(Landroid/database/Cursor;)Ll/֫ۨᩴ;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :goto_0
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ll/᩸ۨᩴ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_4
    return-object v3

    :catchall_0
    move-exception v3

    if-eqz v2, :cond_5

    .line 124
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    throw v3
    :try_end_4
    .catch Ll/᩸ۨᩴ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v2

    .line 142
    sget-object v3, Ll/ۚۨᩴ;->ۡ:Ll/ۚۨᩴ;

    invoke-direct {p0, v3, v8, v2}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ll/᩸ۨᩴ;->ۤ()Ll/ۤۨᩴ;

    move-result-object v3

    sget-object v4, Ll/ۤۨᩴ;->ۢ:Ll/ۤۨᩴ;

    if-ne v3, v4, :cond_7

    .line 144
    instance-of v1, v1, Ll/֫᩶ᩴ;

    if-eqz v1, :cond_6

    .line 145
    invoke-direct {p0}, Ll/᩻ܿᩴ;->֫()Ll/֫ۨᩴ;

    move-result-object v0

    goto :goto_2

    :cond_6
    invoke-static {v0}, Ll/֫ۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/֫ۨᩴ;

    move-result-object v0

    :goto_2
    return-object v0

    .line 147
    :cond_7
    throw v2

    :catch_1
    move-exception v0

    .line 140
    sget-object v1, Ll/ۚۨᩴ;->ۡ:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v8, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 138
    throw v0
.end method

.method public final ۤ()V
    .locals 9

    .line 57
    sget-object v0, Ll/ۚۨᩴ;->ܿ:Ll/ۚۨᩴ;

    invoke-direct {p0, v0}, Ll/᩻ܿᩴ;->᩷(Ll/ۚۨᩴ;)V

    .line 58
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v1

    sget-object v2, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    iget-object v3, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    const/4 v4, 0x0

    if-ne v1, v2, :cond_4

    .line 62
    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-virtual {v1}, Ll/֫ܿᩴ;->۟᩷()Ll/֫ܿᩴ;

    move-result-object v2

    iget-object v5, v1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    if-eqz v2, :cond_3

    .line 97
    new-instance v6, Ll/᩻ܿᩴ;

    invoke-direct {v6, v2}, Ll/᩻ܿᩴ;-><init>(Ll/֫ܿᩴ;)V

    .line 66
    invoke-virtual {v6}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v6

    invoke-static {v6, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V

    .line 68
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v6

    .line 69
    invoke-virtual {v2}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    const-string v7, "*/*"

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    .line 68
    invoke-static {v6, v2, v7, v8}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 75
    iput-object v2, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    const/4 v6, 0x0

    .line 76
    invoke-virtual {v1, v2, v6}, Ll/᩸ܿᩴ;->ۙ(Landroid/net/Uri;Z)V

    .line 77
    invoke-static {v2}, Ll/ᩴ᩶ᩴ;->ᩴ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 78
    invoke-static {v6, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-static {v2}, Ll/᩸᩶ᩴ;->ۤ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 80
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v2}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 81
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to clean up provider-renamed file"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v4, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    .line 84
    :cond_0
    iput-object v4, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    .line 85
    sget-object v1, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    .line 86
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-static {v0, v1, v2, v4}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    .line 88
    :cond_1
    iput-object v4, p0, Ll/᩻ܿᩴ;->᩷:Landroid/net/Uri;

    return-void

    .line 72
    :cond_2
    invoke-direct {p0, v0, v4, v4}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 94
    sget-object v1, Ll/ۚۨᩴ;->ܿ:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v4, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 92
    sget-object v1, Ll/ۚۨᩴ;->ܿ:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v4, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 90
    throw v0

    .line 64
    :cond_3
    invoke-virtual {p0, v0, v4}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    .line 59
    :cond_4
    sget-object v1, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    .line 60
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 59
    invoke-static {v0, v1, v2, v4}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method

.method public final ۫()Ljava/util/List;
    .locals 1

    .line 173
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩻ܿᩴ;->᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 173
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩻ܿᩴ;->᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()V
    .locals 7

    .line 268
    iget-object v0, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    sget-object v1, Ll/ۚۨᩴ;->۟:Ll/ۚۨᩴ;

    invoke-direct {p0, v1}, Ll/᩻ܿᩴ;->᩷(Ll/ۚۨᩴ;)V

    .line 269
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v3

    sget-object v4, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    iget-object v5, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    const/4 v6, 0x0

    if-eq v3, v4, :cond_3

    .line 274
    invoke-virtual {v2}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v3

    sget-object v4, Ll/۫ۨᩴ;->ᩳ:Ll/۫ۨᩴ;

    if-eq v3, v4, :cond_1

    invoke-virtual {v2}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v2

    sget-object v3, Ll/۫ۨᩴ;->ܿ:Ll/۫ۨᩴ;

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 275
    :cond_0
    sget-object v0, Ll/ۤۨᩴ;->֨:Ll/ۤۨᩴ;

    .line 276
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 275
    invoke-static {v1, v0, v2, v6}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    .line 279
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    .line 280
    invoke-virtual {v0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 279
    invoke-static {v2, v3}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 283
    invoke-virtual {v0}, Ll/֫ܿᩴ;->ܿ᩷()V

    return-void

    .line 281
    :cond_2
    invoke-direct {p0, v1, v6, v6}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 289
    sget-object v1, Ll/ۚۨᩴ;->۟:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v6, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 287
    sget-object v1, Ll/ۚۨᩴ;->۟:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v6, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 285
    throw v0

    .line 271
    :cond_3
    sget-object v0, Ll/ۤۨᩴ;->ۢ:Ll/ۤۨᩴ;

    .line 272
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 271
    invoke-static {v1, v0, v2, v6}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method

.method public final ᩷()V
    .locals 9

    .line 231
    sget-object v0, Ll/ۚۨᩴ;->᩶:Ll/ۚۨᩴ;

    invoke-direct {p0, v0}, Ll/᩻ܿᩴ;->᩷(Ll/ۚۨᩴ;)V

    .line 232
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v1

    sget-object v2, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    iget-object v3, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    const/4 v4, 0x0

    if-ne v1, v2, :cond_4

    .line 236
    iget-object v1, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    invoke-virtual {v1}, Ll/֫ܿᩴ;->۟᩷()Ll/֫ܿᩴ;

    move-result-object v2

    iget-object v5, v1, Ll/֫ܿᩴ;->֨:Ljava/io/File;

    if-eqz v2, :cond_3

    .line 97
    new-instance v6, Ll/᩻ܿᩴ;

    invoke-direct {v6, v2}, Ll/᩻ܿᩴ;-><init>(Ll/֫ܿᩴ;)V

    .line 240
    invoke-virtual {v6}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v6

    invoke-static {v6, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V

    .line 242
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v6

    .line 243
    invoke-virtual {v2}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    const-string v7, "vnd.android.document/directory"

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    .line 242
    invoke-static {v6, v2, v7, v8}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 248
    invoke-static {v2}, Ll/ᩴ᩶ᩴ;->ᩴ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 249
    invoke-static {v7, v6}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 146
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 250
    invoke-static {v2}, Ll/᩸᩶ᩴ;->ۤ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 252
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v2}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 253
    sget-object v1, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    .line 254
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 253
    invoke-static {v0, v1, v2, v4}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 256
    invoke-virtual {v1, v2, v0}, Ll/᩸ܿᩴ;->ۙ(Landroid/net/Uri;Z)V

    return-void

    .line 246
    :cond_2
    invoke-direct {p0, v0, v4, v4}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 262
    sget-object v1, Ll/ۚۨᩴ;->᩶:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v4, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 260
    sget-object v1, Ll/ۚۨᩴ;->᩶:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v4, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 258
    throw v0

    .line 238
    :cond_3
    invoke-virtual {p0, v0, v4}, Ll/ۧۨᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    .line 233
    :cond_4
    sget-object v1, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    .line 234
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 233
    invoke-static {v0, v1, v2, v4}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method

.method public final ᩸()V
    .locals 5

    .line 298
    iget-object v0, p0, Ll/᩻ܿᩴ;->ۤ:Ll/֫ܿᩴ;

    sget-object v1, Ll/ۚۨᩴ;->֡:Ll/ۚۨᩴ;

    invoke-direct {p0, v1}, Ll/᩻ܿᩴ;->᩷(Ll/ۚۨᩴ;)V

    .line 299
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v2

    invoke-static {v2, v1}, Ll/᩻ܿᩴ;->ۙ(Ll/֫ۨᩴ;Ll/ۚۨᩴ;)V

    .line 173
    invoke-virtual {p0}, Ll/᩻ܿᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/᩻ܿᩴ;->᩷(Ll/֫ۨᩴ;)Ljava/util/ArrayList;

    move-result-object v2

    .line 300
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 305
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->᩸()Landroid/content/ContentResolver;

    move-result-object v2

    .line 306
    invoke-virtual {v0}, Ll/᩸ܿᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v4

    invoke-static {v4}, Ll/᩸᩶ᩴ;->᩷(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v4

    .line 305
    invoke-static {v2, v4}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 309
    invoke-virtual {v0}, Ll/֫ܿᩴ;->ܿ᩷()V

    return-void

    .line 307
    :cond_0
    invoke-direct {p0, v1, v3, v3}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 315
    sget-object v1, Ll/ۚۨᩴ;->֡:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v3, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/Exception;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 313
    sget-object v1, Ll/ۚۨᩴ;->֡:Ll/ۚۨᩴ;

    invoke-direct {p0, v1, v3, v0}, Ll/᩻ܿᩴ;->ۙ(Ll/ۚۨᩴ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 311
    throw v0

    .line 301
    :cond_1
    sget-object v0, Ll/ۤۨᩴ;->֡:Ll/ۤۨᩴ;

    iget-object v2, p0, Ll/ۧۨᩴ;->ۙ:Ll/᩷ۨᩴ;

    .line 302
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 301
    invoke-static {v1, v0, v2, v3}, Ll/᩸ۨᩴ;->ۙ(Ll/ۚۨᩴ;Ll/ۤۨᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ۨᩴ;

    move-result-object v0

    throw v0
.end method
