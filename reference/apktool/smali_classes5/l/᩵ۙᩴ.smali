.class public final Ll/᩵ۙᩴ;
.super Ljava/lang/Object;
.source "O6SW"


# instance fields
.field public final ۙ:Ljava/lang/Byte;

.field public final ۤ:Ljava/lang/String;

.field public final ᩴ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Z


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-boolean p1, p0, Ll/᩵ۙᩴ;->ᩴ:Z

    iput-boolean p2, p0, Ll/᩵ۙᩴ;->᩸:Z

    .line 20
    iput-object p3, p0, Ll/᩵ۙᩴ;->ۤ:Ljava/lang/String;

    iput-object p4, p0, Ll/᩵ۙᩴ;->᩷:Ljava/lang/String;

    iput-object p5, p0, Ll/᩵ۙᩴ;->ۙ:Ljava/lang/Byte;

    return-void
.end method

.method public static ۙ(I[BII)I
    .locals 2

    if-ltz p3, :cond_4

    if-gt p2, p3, :cond_4

    const/16 p3, 0xa

    if-lt p2, p3, :cond_4

    if-ltz p0, :cond_4

    .line 78
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p0, v0, :cond_4

    add-int v0, p0, p2

    add-int/lit8 v1, p0, 0x2

    .line 82
    invoke-static {v1, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v1

    if-ltz v1, :cond_3

    sub-int/2addr p2, p3

    if-gt v1, p2, :cond_3

    add-int/lit8 p0, p0, 0x6

    add-int/2addr p0, v1

    .line 85
    invoke-static {p0, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result p2

    if-ltz p2, :cond_2

    sub-int p3, v0, p0

    add-int/lit8 p3, p3, -0x4

    if-gt p2, p3, :cond_2

    add-int/lit8 p3, p0, 0x4

    add-int/2addr p3, p2

    if-eq p3, v0, :cond_1

    sub-int/2addr v0, p3

    const/4 p2, 0x3

    if-ne v0, p2, :cond_0

    .line 88
    invoke-static {p3, p1}, Ll/ۜۚܺ;->ۤ(I[B)I

    move-result p1

    const/16 p2, 0x7272

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy search parameter trailer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return p0

    .line 86
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy replacement text length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 83
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy search text length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 79
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy search field length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(II[B)Ljava/lang/String;
    .locals 3

    const v0, 0x249f0

    const-string v1, ""

    if-le p1, v0, :cond_0

    return-object v1

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p2, p0, p1, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    const p1, 0xc350

    if-gt p0, p1, :cond_1

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static ۙ(Ll/ܺ֡᩸;I)Ljava/lang/String;
    .locals 6

    .line 52
    invoke-virtual {p0}, Ll/ܺ֡᩸;->readInt()I

    move-result v0

    if-ltz v0, :cond_2

    if-gt v0, p1, :cond_2

    int-to-long v1, v0

    .line 53
    invoke-virtual {p0}, Ll/ܺ֡᩸;->᩷()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_2

    const v3, 0x249f0

    const-string v4, ""

    if-le v0, v3, :cond_0

    .line 54
    invoke-virtual {p0, v1, v2}, Ll/ܺ֡᩸;->᩷(J)V

    return-object v4

    .line 55
    :cond_0
    invoke-virtual {p0, v0, p1}, Ll/ܺ֡᩸;->ۙ(II)Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const v0, 0xc350

    if-gt p1, v0, :cond_1

    return-object p0

    :cond_1
    return-object v4

    .line 53
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy search text length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(IJLjava/io/InputStream;)Ll/᩵ۙᩴ;
    .locals 9

    .line 96
    invoke-static {p1, p2, p3}, Ll/ܺ֡᩸;->ۙ(JLjava/io/InputStream;)Ll/ܺ֡᩸;

    move-result-object p3

    if-ltz p0, :cond_2

    int-to-long v0, p0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_2

    .line 98
    :try_start_0
    invoke-virtual {p3}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v4

    invoke-virtual {p3}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v5

    .line 99
    invoke-static {p3, p0}, Ll/᩵ۙᩴ;->ۙ(Ll/ܺ֡᩸;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {p3, p0}, Ll/᩵ۙᩴ;->ۙ(Ll/ܺ֡᩸;I)Ljava/lang/String;

    move-result-object v7

    .line 101
    invoke-virtual {p3}, Ll/ܺ֡᩸;->᩷()J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-eqz p2, :cond_1

    .line 102
    invoke-virtual {p3}, Ll/ܺ֡᩸;->᩷()J

    move-result-wide p0

    const-wide/16 v0, 0x3

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    invoke-virtual {p3}, Ll/ܺ֡᩸;->ۡ᩷()I

    move-result p0

    const/16 p1, 0x7272

    if-ne p0, p1, :cond_0

    .line 103
    invoke-virtual {p3}, Ll/ܺ֡᩸;->readByte()I

    move-result p0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    .line 102
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid legacy search parameter trailer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    move-object v8, p0

    .line 105
    invoke-virtual {p3}, Ll/ܺ֡᩸;->ۤ()V

    .line 106
    new-instance p0, Ll/᩵ۙᩴ;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Ll/᩵ۙᩴ;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    invoke-virtual {p3}, Ll/ܺ֡᩸;->close()V

    return-object p0

    .line 97
    :cond_2
    :try_start_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy search exceeds app state limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 96
    :try_start_2
    invoke-virtual {p3}, Ll/ܺ֡᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static ۙ(Ll/᩵ۚۤ;)Ll/᩵ۙᩴ;
    .locals 9

    .line 112
    invoke-virtual {p0}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v1

    invoke-virtual {p0}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v2

    .line 113
    invoke-static {p0}, Ll/᩵ۙᩴ;->᩷(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Ll/᩵ۙᩴ;->᩷(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v4

    .line 115
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v5

    const-wide/16 v7, 0x3

    cmp-long v0, v5, v7

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ll/᩵ۚۤ;->ۤ()I

    move-result v0

    const/16 v5, 0x7272

    if-ne v0, v5, :cond_0

    const/4 v0, 0x2

    .line 116
    invoke-virtual {p0, v0}, Ll/᩵ۚۤ;->skipBytes(I)V

    invoke-virtual {p0}, Ll/᩵ۚۤ;->readByte()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    move-object v5, p0

    .line 118
    new-instance p0, Ll/᩵ۙᩴ;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/᩵ۙᩴ;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V

    return-object p0
.end method

.method public static ۤ(I[BII)Ll/᩵ۙᩴ;
    .locals 10

    .line 31
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۙᩴ;->ۙ(I[BII)I

    move-result p3

    add-int/lit8 v0, p0, 0x2

    .line 32
    invoke-static {v0, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v0

    .line 33
    invoke-static {p3, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v1

    add-int/lit8 p3, p3, 0x4

    add-int v2, p3, v1

    .line 35
    new-instance v9, Ll/᩵ۙᩴ;

    aget-byte v3, p1, p0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v3, p0, 0x1

    aget-byte v3, p1, v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v3, p0, 0x6

    .line 36
    invoke-static {v3, v0, p1}, Ll/᩵ۙᩴ;->ۙ(II[B)Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-static {p3, v1, p1}, Ll/᩵ۙᩴ;->ۙ(II[B)Ljava/lang/String;

    move-result-object v7

    add-int/2addr p0, p2

    if-ne v2, p0, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x2

    .line 38
    aget-byte p0, p1, v2

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    :goto_2
    move-object v8, p0

    move-object v3, v9

    move v4, v5

    move v5, v6

    move-object v6, v0

    invoke-direct/range {v3 .. v8}, Ll/᩵ۙᩴ;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V

    return-object v9
.end method

.method public static ᩷(I[BII)I
    .locals 2

    .line 25
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۙᩴ;->ۙ(I[BII)I

    move-result p2

    add-int/lit8 p0, p0, 0x2

    .line 26
    invoke-static {p0, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result p0

    const p3, 0xc350

    const/4 v0, 0x0

    const v1, 0x249f0

    if-le p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 42
    :cond_0
    invoke-static {p0, p3}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 26
    :goto_0
    invoke-static {p2, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result p1

    if-le p1, v1, :cond_1

    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_1
    add-int/2addr p0, v0

    return p0
.end method

.method public static ᩷(Ll/᩵ۚۤ;)Ljava/lang/String;
    .locals 6

    .line 60
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    int-to-long v1, v0

    .line 61
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 62
    invoke-virtual {p0}, Ll/᩵ۚۤ;->ۙ()I

    move-result v1

    .line 63
    invoke-virtual {p0, v0}, Ll/᩵ۚۤ;->skipBytes(I)V

    .line 64
    iget-object p0, p0, Ll/᩵ۚۤ;->ܰ:[B

    invoke-static {v1, v0, p0}, Ll/᩵ۙᩴ;->ۙ(II[B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 61
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid legacy search text length"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ۙ()[B
    .locals 3

    .line 69
    new-instance v0, Ll/ۛۚۤ;

    invoke-direct {v0}, Ll/ۛۚۤ;-><init>()V

    .line 70
    iget-boolean v1, p0, Ll/᩵ۙᩴ;->ᩴ:Z

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Z)V

    iget-boolean v1, p0, Ll/᩵ۙᩴ;->᩸:Z

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Z)V

    .line 71
    iget-object v1, p0, Ll/᩵ۙᩴ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Ll/᩵ۙᩴ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v1, p0, Ll/᩵ۙᩴ;->ۙ:Ljava/lang/Byte;

    if-eqz v1, :cond_0

    const/16 v2, 0x7272

    invoke-virtual {v0, v2}, Ll/ۛۚۤ;->᩻(I)V

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeByte(I)V

    .line 73
    :cond_0
    invoke-virtual {v0}, Ll/ۛۚۤ;->۫()[B

    move-result-object v0

    return-object v0
.end method
