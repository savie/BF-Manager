.class public final Ll/ܳܺܳ;
.super Ljava/lang/Object;
.source "7IS1"


# direct methods
.method public static ۙ(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    .line 53
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string p0, "enabled_accessibility_services"

    .line 54
    invoke-static {p0}, Landroid/provider/Settings$Secure;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string p0, "_id"

    const-string v3, "value"

    filled-new-array {p0, v3}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 53
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    if-eqz p0, :cond_5

    goto :goto_1

    .line 57
    :cond_0
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, ""

    if-nez v1, :cond_1

    .line 63
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :cond_1
    const/4 v1, 0x0

    .line 58
    :try_start_3
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    .line 59
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_4

    .line 60
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_4

    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 62
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    :try_start_4
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_5
    return-object v0

    :catchall_0
    move-exception v1

    .line 53
    :try_start_5
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    return-object v0
.end method

.method public static ۙ(Landroid/app/Application;Ljava/lang/String;)Ll/ᩴܺܳ;
    .locals 2

    .line 18
    invoke-static {}, Ll/ܳܺܳ;->ۙ()V

    .line 19
    invoke-static {p0}, Ll/ܳܺܳ;->ۙ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 20
    new-instance v1, Ll/ᩴܺܳ;

    invoke-direct {v1, v0, p0, p1}, Ll/ᩴܺܳ;-><init>(Ljava/lang/String;Landroid/app/Application;Ljava/lang/String;)V

    return-object v1
.end method

.method public static ۙ()V
    .locals 2

    .line 46
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "iao"

    invoke-interface {v0, v1}, Ll/ᩳ֫ܺ;->remove(Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public static synthetic ۙ(Ljava/lang/String;Landroid/app/Application;Ljava/lang/String;)V
    .locals 5

    if-nez p0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1}, Ll/ܳܺܳ;->ۙ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    .line 25
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    cmp-long p0, v1, v3

    if-gtz p0, :cond_3

    goto :goto_0

    .line 30
    :cond_3
    sget-object p0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    const-string p2, "iao"

    invoke-interface {p0, p2, p1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->commit()Z

    :cond_4
    :goto_0
    return-void
.end method

.method public static ۙ(Landroid/content/ContextWrapper;)Z
    .locals 3

    .line 35
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    const-string v1, "iao"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p0}, Ll/ܳܺܳ;->ۙ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    return v1

    .line 39
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    .line 41
    :cond_2
    invoke-static {}, Ll/ܳܺܳ;->ۙ()V

    return v1
.end method
