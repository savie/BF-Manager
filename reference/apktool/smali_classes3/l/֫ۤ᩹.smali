.class public final Ll/֫ۤ᩹;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/ۙ᩸᩻;


# direct methods
.method public static ۙ(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "MD5Utils"

    if-nez p0, :cond_0

    const-string p0, "md5 stream is null"

    .line 24
    invoke-static {v1, p0}, Ll/᩶᩷᩹;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    :try_start_0
    const-string v2, "MD5"

    .line 28
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    const/16 v3, 0x2000

    new-array v4, v3, [B

    :goto_0
    const/4 v5, 0x0

    .line 31
    invoke-virtual {p0, v4, v5, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-lez v6, :cond_1

    .line 32
    invoke-virtual {v2, v4, v5, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/᩵ۤ᩹;->ۙ([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const-string v2, "md5 exception"

    .line 36
    invoke-static {v1, v2, p0}, Ll/᩶᩷᩹;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p0, "md5 return null"

    .line 39
    invoke-static {v1, p0}, Ll/᩶᩷᩹;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۙ(Ljava/lang/CharSequence;[CII)V
    .locals 2

    .line 61
    instance-of v0, p0, Ll/ۘۘܶ;

    if-eqz v0, :cond_0

    .line 62
    check-cast p0, Ll/ۘۘܶ;

    add-int/2addr p3, p2

    invoke-virtual {p0, p1, p2, p3}, Ll/ۘۘܶ;->ۙ([CII)V

    return-void

    :cond_0
    const/16 v0, 0xa

    const/4 v1, 0x0

    if-lt p3, v0, :cond_5

    .line 67
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 68
    check-cast p0, Ljava/lang/String;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/String;->getChars(II[CI)V

    return-void

    .line 70
    :cond_1
    instance-of v0, p0, Ljava/nio/CharBuffer;

    if-eqz v0, :cond_2

    .line 71
    check-cast p0, Ljava/nio/CharBuffer;

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr p2, v0

    .line 73
    invoke-virtual {p0, p2}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    .line 74
    invoke-virtual {p0, p1, v1, p3}, Ljava/nio/CharBuffer;->get([CII)Ljava/nio/CharBuffer;

    .line 75
    invoke-virtual {p0, v0}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    .line 77
    :cond_2
    instance-of v0, p0, Ll/᩺ۘܶ;

    if-eqz v0, :cond_3

    add-int/2addr p3, p2

    .line 78
    invoke-interface {p0, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ll/᩺ۘܶ;

    invoke-interface {p0}, Ll/᩺ۘܶ;->᩻᩷()V

    return-void

    .line 80
    :cond_3
    instance-of v0, p0, Ljava/lang/StringBuffer;

    if-eqz v0, :cond_4

    .line 81
    check-cast p0, Ljava/lang/StringBuffer;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    return-void

    .line 83
    :cond_4
    instance-of v0, p0, Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    .line 84
    check-cast p0, Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {p0, p2, p3, p1, v1}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    return-void

    :cond_5
    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_6

    .line 89
    array-length v0, p1

    if-ge v1, v0, :cond_6

    .line 90
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    aput-char v0, p1, v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method


# virtual methods
.method public ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ۤ᩻ᩴ;)V
    .locals 4

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance p2, Ll/ۜۨۛ;

    invoke-direct {p2}, Ll/ۜۨۛ;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p2, Ll/ۜۨۛ;->ۙ:Z

    const/16 v0, 0x1c

    .line 23
    iput v0, p2, Ll/ۜۨۛ;->᩷:I

    .line 24
    invoke-virtual {p2}, Ll/ۜۨۛ;->ۙ()Ll/۠᩵ۛ;

    move-result-object v1

    .line 25
    invoke-static {p1, v1, p2}, Ll/ᩳۨۛ;->ۙ(Ljava/lang/String;Ll/۠᩵ۛ;Ll/ۜۨۛ;)Ll/ۜ᩹ۛ;

    move-result-object p2

    .line 26
    new-instance v1, Ll/ۚۢۨ;

    invoke-direct {v1}, Ll/ۚۢۨ;-><init>()V

    .line 27
    iput v0, v1, Ll/ۚۢۨ;->ۙ:I

    .line 29
    new-instance v0, Ll/ܿܽۤ;

    invoke-direct {v0}, Ll/ܿܽۤ;-><init>()V

    .line 31
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 33
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v3, "#"

    .line 35
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    invoke-virtual {v0, p1}, Ll/ܿܽۤ;->᩷(Ljava/lang/String;)V

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ll/ܿܽۤ;->append(C)V

    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ll/֡ܽۤ;

    invoke-direct {p1, v0}, Ll/֡ܽۤ;-><init>(Ll/ܿܽۤ;)V

    invoke-static {p1, p2, v1}, Ll/۫ۢۨ;->ۙ(Ljava/io/Writer;Ll/ۢ۫ۛ;Ll/ۚۢۨ;)V

    .line 42
    invoke-virtual {v0}, Ll/ܿܽۤ;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p3, p1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void
.end method
