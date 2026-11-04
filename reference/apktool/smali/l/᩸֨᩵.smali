.class public final Ll/᩸֨᩵;
.super Ljava/lang/Object;
.source "ZAX9"


# direct methods
.method public static ۙ(C)C
    .locals 1

    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x61

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x5a

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, 0x20

    int-to-char p0, p0

    return p0

    .line 69
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    :cond_2
    :goto_0
    return p0
.end method

.method public static ۙ(ILjava/lang/String;)I
    .locals 8

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p0, v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    if-gez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    const-string v2, "E"

    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p0, v0, :cond_5

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v1}, Ll/᩸֨᩵;->ۙ(CC)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    add-int/lit8 p0, p0, 0x1

    if-gt p0, v0, :cond_2

    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v1}, Ll/᩸֨᩵;->ۙ(CC)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    if-gt p0, v0, :cond_4

    add-int/lit8 v3, p0, 0x1

    add-int/lit8 v4, p0, 0x1

    const/4 v5, 0x1

    :goto_2
    if-ge v3, v4, :cond_3

    .line 41
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v6, v7}, Ll/᩸֨᩵;->ۙ(CC)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    if-ne v3, v4, :cond_4

    return p0

    :cond_4
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(Ll/ۨܺ᩵;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 35
    :cond_0
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v2

    and-int/lit8 v3, v2, 0x7f

    mul-int/lit8 v4, v1, 0x7

    shl-int/2addr v3, v4

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_1

    const/4 v4, 0x5

    if-lt v1, v4, :cond_0

    :cond_1
    if-eq v2, v3, :cond_2

    return v0

    .line 41
    :cond_2
    new-instance p0, Ll/۬ۧ᩵;

    const-string v0, "Invalid LEB128 sequence"

    .line 11
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    throw p0
.end method

.method public static varargs ۙ(Ljava/lang/String;[Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 5

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 51
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۙ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    .line 47
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void

    .line 50
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 52
    invoke-static {p1, p0}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public static ۙ(CC)Z
    .locals 3

    const/16 v0, 0x7a

    const/16 v1, 0x61

    if-ge p0, v1, :cond_0

    move v2, p0

    goto :goto_0

    :cond_0
    if-gt p0, v0, :cond_1

    add-int/lit8 v2, p0, -0x20

    int-to-char v2, v2

    goto :goto_0

    .line 63
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    :goto_0
    if-ge p1, v1, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    if-gt p1, v0, :cond_3

    add-int/lit8 v0, p1, -0x20

    int-to-char v0, v0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    :goto_1
    if-eq v2, v0, :cond_5

    .line 57
    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(C)C

    move-result p0

    invoke-static {p1}, Ll/᩸֨᩵;->ۙ(C)C

    move-result p1

    if-ne p0, p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0
.end method
