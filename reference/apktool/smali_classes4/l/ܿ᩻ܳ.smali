.class public Ll/ܿ᩻ܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ֡:Ljava/io/InputStream;

.field public final ֨:Ljava/util/HashMap;

.field public ۖ:Ljava/lang/String;

.field public ۜ:Ll/ۨ᩻ܳ;

.field public ۟:Z

.field public final ۠:Ljava/util/ArrayList;

.field public ۡ:Ljava/lang/String;

.field public ۢ:Z

.field public ۬:Ll/ܰ᩻ܳ;

.field public ܰ:Z

.field public ܿ:J

.field public final ᩳ:Ljava/util/Map;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/io/InputStream;J)V
    .locals 2

    .line 1919
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1832
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩻ܳ;->۠:Ljava/util/ArrayList;

    .line 1838
    new-instance v0, Ll/᩺᩻ܳ;

    invoke-direct {v0, p0}, Ll/᩺᩻ܳ;-><init>(Ll/ܿ᩻ܳ;)V

    iput-object v0, p0, Ll/ܿ᩻ܳ;->ᩳ:Ljava/util/Map;

    .line 1893
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩻ܳ;->֨:Ljava/util/HashMap;

    .line 1920
    iput-object p1, p0, Ll/ܿ᩻ܳ;->۬:Ll/ܰ᩻ܳ;

    .line 1921
    iput-object p2, p0, Ll/ܿ᩻ܳ;->ۡ:Ljava/lang/String;

    const-wide/16 p1, 0x0

    const/4 v0, 0x0

    if-nez p3, :cond_0

    .line 1923
    new-instance p3, Ljava/io/ByteArrayInputStream;

    new-array p4, v0, [B

    invoke-direct {p3, p4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object p3, p0, Ll/ܿ᩻ܳ;->֡:Ljava/io/InputStream;

    .line 1924
    iput-wide p1, p0, Ll/ܿ᩻ܳ;->ܿ:J

    goto :goto_0

    .line 1926
    :cond_0
    iput-object p3, p0, Ll/ܿ᩻ܳ;->֡:Ljava/io/InputStream;

    .line 1927
    iput-wide p4, p0, Ll/ܿ᩻ܳ;->ܿ:J

    .line 1929
    :goto_0
    iget-wide p3, p0, Ll/ܿ᩻ܳ;->ܿ:J

    const/4 p5, 0x1

    cmp-long v1, p3, p1

    if-gez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    iput-boolean v0, p0, Ll/ܿ᩻ܳ;->ܰ:Z

    .line 1930
    iput-boolean p5, p0, Ll/ܿ᩻ܳ;->᩶:Z

    const-string p1, "HTTP/1.1"

    .line 1931
    iput-object p1, p0, Ll/ܿ᩻ܳ;->ۖ:Ljava/lang/String;

    .line 1932
    iput-boolean p5, p0, Ll/ܿ᩻ܳ;->ۢ:Z

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿ᩻ܳ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩻ܳ;->֨:Ljava/util/HashMap;

    return-object p0
.end method

.method private ۙ(Ljava/io/OutputStream;J)V
    .locals 9

    const-wide/16 v0, 0x4000

    long-to-int v2, v0

    .line 2195
    new-array v2, v2, [B

    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    cmp-long v6, p2, v3

    if-nez v6, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    const-wide/16 v6, 0x0

    cmp-long v4, p2, v6

    if-gtz v4, :cond_2

    if-eqz v3, :cond_4

    :cond_2
    if-eqz v3, :cond_3

    move-wide v6, v0

    goto :goto_1

    .line 2198
    :cond_3
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 2199
    :goto_1
    iget-object v8, p0, Ll/ܿ᩻ܳ;->֡:Ljava/io/InputStream;

    long-to-int v7, v6

    invoke-virtual {v8, v2, v5, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-gtz v6, :cond_6

    if-gtz v4, :cond_5

    :cond_4
    return-void

    .line 2201
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Response ended before Content-Length"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2204
    :cond_6
    invoke-virtual {p1, v2, v5, v6}, Ljava/io/OutputStream;->write([BII)V

    if-nez v3, :cond_1

    int-to-long v6, v6

    sub-long/2addr p2, v6

    goto :goto_0
.end method

.method public static ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2104
    invoke-static {p1, p2}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    .line 2105
    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p0

    const-string p1, ": "

    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p0

    const-string p1, "\r\n"

    invoke-virtual {p0, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܿ᩻ܳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩻ܳ;->۠:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    if-eqz p0, :cond_8

    .line 2112
    invoke-static {}, Ll/֨᩻ܳ;->֫()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Invalid HTTP header value"

    if-eqz p1, :cond_7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2118
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 2119
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ge v3, v4, :cond_0

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    :cond_0
    const/16 v4, 0x7f

    if-eq v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2121
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const-string v2, "content-length"

    .line 2124
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_6

    .line 2125
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 2126
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    .line 2130
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-ge v1, p1, :cond_4

    .line 2131
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v2, 0x30

    if-lt p1, v2, :cond_3

    const/16 v2, 0x39

    if-gt p1, v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2133
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2137
    :cond_4
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 2139
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 2127
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return-void

    .line 2116
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2113
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid HTTP header name"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1937
    iget-object v0, p0, Ll/ܿ᩻ܳ;->֡:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 1938
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/io/PrintWriter;J)J
    .locals 2

    const-string v0, "content-length"

    .line 2145
    invoke-virtual {p0, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2149
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    .line 2151
    :catch_0
    invoke-static {}, Ll/֨᩻ܳ;->ۧ()Ljava/util/logging/Logger;

    move-result-object p1

    const-string v1, "content-length was no number "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    return-wide p2

    .line 2155
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Content-Length: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-wide p2
.end method

.method public final ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1983
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܿ᩻ܳ;->֨:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ۙ()V
    .locals 3

    const-string v0, "close"

    .line 1965
    iget-object v1, p0, Ll/ܿ᩻ܳ;->ᩳ:Ljava/util/Map;

    check-cast v1, Ll/᩺᩻ܳ;

    const-string v2, "connection"

    invoke-virtual {v1, v2, v0}, Ll/᩺᩻ܳ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۙ(Ljava/io/OutputStream;)V
    .locals 13

    .line 2024
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "GMT"

    .line 2025
    invoke-static {v1}, Ll/ۤۚۗ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 2029
    iget-object v1, p0, Ll/ܿ᩻ܳ;->۬:Ll/ܰ᩻ܳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1c

    .line 2033
    :try_start_0
    new-instance v3, Ljava/io/PrintWriter;

    new-instance v4, Ljava/io/BufferedWriter;

    new-instance v5, Ljava/io/OutputStreamWriter;

    const-string v6, "ISO-8859-1"

    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v6

    invoke-direct {v5, p1, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    invoke-direct {v3, v4, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    .line 2034
    iget-object v4, p0, Ll/ܿ᩻ܳ;->ۖ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v4

    invoke-interface {v1}, Ll/ܰ᩻ܳ;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v4

    const-string v5, " \r\n"

    invoke-virtual {v4, v5}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    .line 2035
    iget-object v4, p0, Ll/ܿ᩻ܳ;->ۡ:Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v5, "Content-Type"

    .line 2036
    invoke-static {v3, v5, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v4, "date"

    .line 2038
    invoke-virtual {p0, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v4, "Date"

    .line 2039
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    .line 2041
    :cond_1
    iget-object v0, p0, Ll/ܿ᩻ܳ;->ᩳ:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 2042
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v3, v5, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2044
    :cond_2
    iget-object v0, p0, Ll/ܿ᩻ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 2045
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v3, v5, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v0, "connection"

    .line 2047
    invoke-virtual {p0, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "Connection"

    .line 2048
    iget-boolean v4, p0, Ll/ܿ᩻ܳ;->ۢ:Z

    if-eqz v4, :cond_4

    const-string v4, "keep-alive"

    goto :goto_2

    :cond_4
    const-string v4, "close"

    :goto_2
    invoke-static {v3, v0, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    .line 2051
    :cond_5
    invoke-interface {v1}, Ll/ܰ᩻ܳ;->ۙ()I

    move-result v0

    .line 2052
    iget-object v1, p0, Ll/ܿ᩻ܳ;->ۜ:Ll/ۨ᩻ܳ;

    sget-object v4, Ll/ۨ᩻ܳ;->ᩳ:Ll/ۨ᩻ܳ;

    const/4 v5, 0x1

    if-ne v1, v4, :cond_6

    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    const/16 v4, 0x64

    if-lt v0, v4, :cond_7

    const/16 v4, 0xc8

    if-lt v0, v4, :cond_9

    .line 2053
    :cond_7
    sget-object v4, Ll/᩶᩻ܳ;->۫ۙ:Ll/᩶᩻ܳ;

    .line 2054
    invoke-virtual {v4}, Ll/᩶᩻ܳ;->ۙ()I

    move-result v4

    if-eq v0, v4, :cond_9

    sget-object v4, Ll/᩶᩻ܳ;->ܳۙ:Ll/᩶᩻ܳ;

    .line 2055
    invoke-virtual {v4}, Ll/᩶᩻ܳ;->ۙ()I

    move-result v4

    if-ne v0, v4, :cond_8

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v4, 0x1

    :goto_5
    if-nez v1, :cond_b

    if-eqz v4, :cond_a

    goto :goto_6

    :cond_a
    const/4 v1, 0x0

    goto :goto_7

    :cond_b
    :goto_6
    const/4 v1, 0x1

    .line 2057
    :goto_7
    sget-object v6, Ll/᩶᩻ܳ;->֫ۙ:Ll/᩶᩻ܳ;

    invoke-virtual {v6}, Ll/᩶᩻ܳ;->ۙ()I

    move-result v6

    if-eq v0, v6, :cond_d

    const-string v0, "content-range"

    .line 2058
    invoke-virtual {p0, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v0, 0x1

    :goto_9
    const-string v6, "content-length"

    .line 2059
    invoke-virtual {p0, v6}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_e

    const/4 v6, 0x1

    goto :goto_a

    :cond_e
    const/4 v6, 0x0

    .line 2060
    :goto_a
    iget-boolean v7, p0, Ll/ܿ᩻ܳ;->۟:Z

    if-eqz v7, :cond_f

    iget-boolean v7, p0, Ll/ܿ᩻ܳ;->᩶:Z

    if-eqz v7, :cond_f

    if-nez v1, :cond_f

    if-nez v0, :cond_f

    if-nez v6, :cond_f

    const-string v0, "content-encoding"

    .line 2065
    invoke-virtual {p0, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_b

    :cond_f
    const/4 v0, 0x0

    .line 2066
    :goto_b
    iget-boolean v7, p0, Ll/ܿ᩻ܳ;->᩶:Z

    if-eqz v7, :cond_11

    if-nez v1, :cond_11

    if-nez v6, :cond_11

    iget-boolean v7, p0, Ll/ܿ᩻ܳ;->ܰ:Z

    if-nez v7, :cond_10

    if-eqz v0, :cond_11

    :cond_10
    const/4 v7, 0x1

    goto :goto_c

    :cond_11
    const/4 v7, 0x0

    :goto_c
    if-eqz v0, :cond_12

    const-string v8, "Content-Encoding"

    const-string v9, "gzip"

    .line 2071
    invoke-static {v3, v8, v9}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_12
    const-wide/16 v8, 0x0

    .line 2073
    iget-object v10, p0, Ll/ܿ᩻ܳ;->֡:Ljava/io/InputStream;

    if-eqz v10, :cond_13

    :try_start_1
    iget-wide v11, p0, Ll/ܿ᩻ܳ;->ܿ:J

    goto :goto_d

    :cond_13
    move-wide v11, v8

    :goto_d
    if-eqz v7, :cond_14

    const-string v4, "Transfer-Encoding"

    const-string v6, "chunked"

    .line 2075
    invoke-static {v3, v4, v6}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_14
    if-nez v4, :cond_16

    cmp-long v4, v11, v8

    if-gez v4, :cond_15

    if-eqz v6, :cond_16

    .line 2078
    :cond_15
    invoke-virtual {p0, v3, v11, v12}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/PrintWriter;J)J

    move-result-wide v11

    :cond_16
    :goto_e
    const-string v4, "\r\n"

    .line 2080
    invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    .line 2081
    invoke-virtual {v3}, Ljava/io/PrintWriter;->flush()V

    .line 2083
    invoke-virtual {v3}, Ljava/io/PrintWriter;->checkError()Z

    move-result v3

    if-nez v3, :cond_1b

    if-nez v1, :cond_1a

    const-wide/16 v3, -0x1

    if-eqz v7, :cond_18

    .line 2162
    new-instance v1, Ll/ۘ᩻ܳ;

    .line 1781
    invoke-direct {v1, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    if-eqz v0, :cond_17

    .line 2172
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2173
    invoke-direct {p0, v0, v3, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;J)V

    .line 2174
    invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->finish()V

    goto :goto_f

    .line 2176
    :cond_17
    invoke-direct {p0, v1, v3, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;J)V

    .line 2164
    :goto_f
    invoke-virtual {v1}, Ll/ۘ᩻ܳ;->finish()V

    goto :goto_10

    :cond_18
    if-eqz v0, :cond_19

    .line 2172
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2173
    invoke-direct {p0, v0, v3, v4}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;J)V

    .line 2174
    invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->finish()V

    goto :goto_10

    .line 2176
    :cond_19
    invoke-direct {p0, p1, v11, v12}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;J)V

    .line 2087
    :cond_1a
    :goto_10
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 2088
    invoke-static {v10}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2094
    invoke-virtual {p0, v5}, Ll/ܿ᩻ܳ;->ۙ(Z)V

    return-void

    .line 2083
    :cond_1b
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Could not send response headers"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2030
    :cond_1c
    new-instance p1, Ljava/lang/Error;

    const-string v0, "sendResponse(): Status can\'t be null."

    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_11

    :catch_0
    move-exception p1

    .line 2091
    :try_start_3
    invoke-virtual {p0}, Ll/ܿ᩻ܳ;->ۙ()V

    .line 2092
    invoke-static {}, Ll/֨᩻ܳ;->ۧ()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "Could not send response to the client"

    invoke-virtual {v0, v1, v3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2094
    invoke-virtual {p0, v2}, Ll/ܿ᩻ܳ;->ۙ(Z)V

    return-void

    :goto_11
    invoke-virtual {p0, v2}, Ll/ܿ᩻ܳ;->ۙ(Z)V

    .line 2095
    throw p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1946
    invoke-static {p1, p2}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "set-cookie"

    .line 1947
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1949
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ll/ܿ᩻ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1950
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܿ᩻ܳ;->֨:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 1952
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ܳ;->ᩳ:Ljava/util/Map;

    check-cast v0, Ll/᩺᩻ܳ;

    invoke-virtual {v0, p1, p2}, Ll/᩺᩻ܳ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۙ(Ll/ۨ᩻ܳ;)V
    .locals 0

    .line 2224
    iput-object p1, p0, Ll/ܿ᩻ܳ;->ۜ:Ll/ۨ᩻ܳ;

    return-void
.end method

.method public ۙ(Z)V
    .locals 0

    return-void
.end method

.method public final ۤ(Z)V
    .locals 0

    .line 2006
    iput-boolean p1, p0, Ll/ܿ᩻ܳ;->۟:Z

    return-void
.end method

.method public final ۤ()Z
    .locals 2

    const-string v0, "connection"

    .line 1975
    invoke-virtual {p0, v0}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "close"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 1987
    iget-object v0, p0, Ll/ܿ᩻ܳ;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    const-string v0, "HTTP/1.0"

    .line 2002
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "HTTP/1.1"

    :goto_0
    iput-object v0, p0, Ll/ܿ᩻ܳ;->ۖ:Ljava/lang/String;

    return-void
.end method

.method public final ᩷(Z)V
    .locals 0

    .line 2013
    iput-boolean p1, p0, Ll/ܿ᩻ܳ;->᩶:Z

    return-void
.end method

.method public final ᩸(Z)V
    .locals 0

    .line 2017
    iput-boolean p1, p0, Ll/ܿ᩻ܳ;->ۢ:Z

    return-void
.end method
