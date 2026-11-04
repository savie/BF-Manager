.class public Ll/֫ۛۨ;
.super Ll/ܳۛۨ;
.source "C650"

# interfaces
.implements Ll/᩸ۛۨ;


# static fields
.field public static final ۤۙ:Ljava/util/regex/Pattern;

.field public static final synthetic ᩷ۙ:I


# instance fields
.field public ֡:I

.field public ֨:Ll/ܰۛۨ;

.field public ۖ:Ll/۫ۛۨ;

.field public ۘ:I

.field public ۙۙ:Ljava/lang/String;

.field public ۜ:Z

.field public ۟:I

.field public ۠:I

.field public ۡ:Ljava/lang/String;

.field public ۢ:Z

.field public ۬:J

.field public ܰ:Ll/ܿۤۗ;

.field public ܿ:Ljava/util/HashMap;

.field public ᩳ:Ll/ۧۛۨ;

.field public ᩶:Ll/ܶۛۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})"

    .line 450
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֫ۛۨ;->ۤۙ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 627
    invoke-direct {p0}, Ll/ܳۛۨ;-><init>()V

    const-wide/16 v0, -0x1

    .line 519
    invoke-static {v0, v1}, Ll/ܿۤۗ;->ofMillis(J)Ll/ܿۤۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->ܰ:Ll/ܿۤۗ;

    .line 523
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v0, 0x1

    .line 540
    iput-boolean v0, p0, Ll/֫ۛۨ;->ۜ:Z

    .line 544
    new-instance v0, Ll/ܰۛۨ;

    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 544
    iput-object v0, p0, Ll/֫ۛۨ;->֨:Ll/ܰۛۨ;

    .line 587
    sget-object v0, Ll/ܿۤۗ;->ZERO:Ll/ܿۤۗ;

    const-wide/16 v0, 0x1

    .line 592
    invoke-static {v0, v1}, Ll/ܿۤۗ;->ofSeconds(J)Ll/ܿۤۗ;

    .line 602
    new-instance v0, Ll/۫ۛۨ;

    invoke-direct {v0, p0}, Ll/۫ۛۨ;-><init>(Ll/֫ۛۨ;)V

    iput-object v0, p0, Ll/֫ۛۨ;->ۖ:Ll/۫ۛۨ;

    const-string v0, "org.apache.commons.net.ftp.ipAddressFromPasvResponse"

    .line 610
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/֫ۛۨ;->ۢ:Z

    .line 628
    invoke-direct {p0}, Ll/֫ۛۨ;->ۜ()V

    return-void
.end method

.method private ۜ()V
    .locals 4

    const/4 v0, 0x0

    .line 1939
    iput v0, p0, Ll/֫ۛۨ;->ۘ:I

    const/4 v1, 0x0

    .line 1940
    iput-object v1, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    const/4 v2, -0x1

    .line 1941
    iput v2, p0, Ll/֫ۛۨ;->۠:I

    .line 1946
    iput v0, p0, Ll/֫ۛۨ;->۟:I

    const/16 v0, 0xa

    .line 1949
    iput v0, p0, Ll/֫ۛۨ;->֡:I

    const-wide/16 v2, 0x0

    .line 1950
    iput-wide v2, p0, Ll/֫ۛۨ;->۬:J

    .line 1951
    iput-object v1, p0, Ll/֫ۛۨ;->ۙۙ:Ljava/lang/String;

    .line 1952
    iput-object v1, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    .line 1954
    iput-object v1, p0, Ll/֫ۛۨ;->ܿ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֨()I
    .locals 1

    .line 1702
    iget v0, p0, Ll/֫ۛۨ;->۠:I

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 845
    sget-object v0, Ll/᩻ۛۨ;->ۗۙ:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 2496
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1
.end method

.method public final ۖ()Z
    .locals 1

    .line 2180
    iget-boolean v0, p0, Ll/֫ۛۨ;->ۜ:Z

    return v0
.end method

.method public ۗ()V
    .locals 0

    .line 643
    invoke-super {p0}, Ll/ܳۛۨ;->֡()V

    .line 644
    invoke-direct {p0}, Ll/֫ۛۨ;->ۜ()V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x2

    .line 1336
    iput v0, p0, Ll/֫ۛۨ;->ۘ:I

    const/4 v0, 0x0

    .line 1339
    iput-object v0, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    const/4 v0, -0x1

    .line 1340
    iput v0, p0, Ll/֫ۛۨ;->۠:I

    return-void
.end method

.method public final ۙ(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 3273
    iput-wide p1, p0, Ll/֫ۛۨ;->۬:J

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۧۛۨ;)V
    .locals 0

    .line 1217
    iput-object p1, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 1161
    sget-object v0, Ll/᩻ۛۨ;->֫᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 2776
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 831
    sget-object v0, Ll/᩻ۛۨ;->᩹ۙ:Ll/᩻ۛۨ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 3166
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ll/᩻ۛۨ;)Z
    .locals 6

    .line 1895
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 1961
    iget-object v0, p0, Ll/֫ۛۨ;->ܿ:Ljava/util/HashMap;

    if-nez v0, :cond_4

    .line 569
    sget-object v0, Ll/᩻ۛۨ;->ܳۙ:Ll/᩻ۛۨ;

    const/4 v1, 0x0

    .line 1218
    invoke-virtual {p0, v0, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x212

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 1967
    :cond_0
    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0

    .line 1969
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/֫ۛۨ;->ܿ:Ljava/util/HashMap;

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 1973
    :cond_1
    iget-object v0, p0, Ll/ܳۛۨ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, " "

    .line 1974
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    const/4 v3, 0x1

    .line 1977
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-lez v2, :cond_3

    .line 1979
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    .line 1980
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 1982
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v1, ""

    .line 1984
    :goto_2
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 1985
    iget-object v3, p0, Ll/֫ۛۨ;->ܿ:Ljava/util/HashMap;

    new-instance v4, Ll/ۢ֡ۗ;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Ll/ۢ֡ۗ;-><init>(I)V

    invoke-static {v3, v2, v4}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    .line 1986
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1912
    :cond_4
    iget-object v0, p0, Ll/֫ۛۨ;->ܿ:Ljava/util/HashMap;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۟()I
    .locals 1

    .line 1586
    iget v0, p0, Ll/֫ۛۨ;->ۘ:I

    return v0
.end method

.method public final ۠()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0xea60

    int-to-long v0, v0

    .line 3020
    invoke-static {v0, v1}, Ll/ܿۤۗ;->ofMillis(J)Ll/ܿۤۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->ܰ:Ll/ܿۤۗ;

    return-void
.end method

.method public final ۡ()J
    .locals 2

    .line 1735
    iget-wide v0, p0, Ll/֫ۛۨ;->۬:J

    return-wide v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 1682
    iget-object v0, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public ۤ(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 3

    .line 3349
    sget-object v0, Ll/᩻ۛۨ;->ۛ᩷:Ll/᩻ۛۨ;

    .line 3327
    invoke-virtual {v0}, Ll/᩻ۛۨ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 1004
    invoke-virtual {p0, v0, p1}, Ll/֫ۛۨ;->ᩴ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1009
    :cond_0
    iget v0, p0, Ll/֫ۛۨ;->۟:I

    if-nez v0, :cond_1

    .line 1017
    new-instance v0, Ll/ᩴ᩺ۨ;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 1485
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1017
    invoke-direct {v0, v2}, Ll/ᩴ᩺ۨ;-><init>(Ljava/io/BufferedOutputStream;)V

    goto :goto_0

    .line 1019
    :cond_1
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    .line 1021
    :goto_0
    new-instance v1, Ll/᩸᩺ۨ;

    invoke-direct {v1, p1, v0}, Ll/᩸᩺ۨ;-><init>(Ljava/net/Socket;Ljava/io/OutputStream;)V

    return-object v1
.end method

.method public final ۤ()[Ll/ܽۛۨ;
    .locals 4

    const/4 v0, 0x0

    .line 2145
    sget-object v1, Ll/᩻ۛۨ;->᩵ۙ:Ll/᩻ۛۨ;

    invoke-virtual {p0, v1, v0}, Ll/֫ۛۨ;->᩷(Ll/᩻ۛۨ;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object v0

    .line 2146
    new-instance v1, Ll/ۗۛۨ;

    invoke-static {}, Ll/ܿۛۨ;->ۙ()Ll/ܿۛۨ;

    move-result-object v2

    iget-object v3, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    invoke-direct {v1, v2, v3}, Ll/ۗۛۨ;-><init>(Ll/ܶۛۨ;Ll/ۧۛۨ;)V

    if-nez v0, :cond_0

    goto :goto_0

    .line 2151
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 586
    iget-object v3, p0, Ll/ܳۛۨ;->ܺ:Ljava/lang/String;

    .line 2151
    invoke-virtual {v1, v2, v3}, Ll/ۗۛۨ;->ۙ(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 779
    invoke-static {v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 2154
    invoke-virtual {p0}, Ll/֫ۛۨ;->᩸()Z

    .line 2595
    :goto_0
    invoke-virtual {v1}, Ll/ۗۛۨ;->ۙ()[Ll/ܽۛۨ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 779
    invoke-static {v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 2154
    invoke-virtual {p0}, Ll/֫ۛۨ;->᩸()Z

    .line 2155
    throw v1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 6

    const/16 v0, 0x28

    .line 816
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const/16 v2, 0x29

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 817
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 818
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x2

    .line 819
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 0
    invoke-static {v1, p1}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result v4

    const-string v5, "Could not parse extended passive host information.\nServer Reply: "

    if-ne v0, v2, :cond_0

    if-ne v2, v3, :cond_0

    if-ne v3, v4, :cond_0

    .line 826
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 831
    invoke-virtual {p0}, Ll/ۤۛۨ;->ܰ()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    .line 832
    iput p1, p0, Ll/֫ۛۨ;->۠:I

    return-void

    .line 828
    :catch_0
    new-instance v0, Ll/ۖۨۨ;

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 828
    throw v0

    .line 822
    :cond_0
    new-instance v0, Ll/ۖۨۨ;

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 822
    throw v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 978
    sget-object v0, Ll/᩻ۛۨ;->᩶ۙ:Ll/᩻ۛۨ;

    const/4 v1, 0x0

    .line 1218
    invoke-virtual {p0, v0, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v0

    .line 2869
    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0

    return v0
.end method

.method public final ۫(Ljava/lang/String;)Z
    .locals 1

    .line 1373
    sget-object v0, Ll/᩻ۛۨ;->ܽ᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 2883
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1
.end method

.method public final ᩳ()Ll/ܿۤۗ;
    .locals 1

    .line 1600
    iget-object v0, p0, Ll/֫ۛۨ;->ܰ:Ll/ܿۤۗ;

    return-object v0
.end method

.method public ᩴ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 10

    .line 711
    iget v0, p0, Ll/֫ۛۨ;->ۘ:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto/16 :goto_8

    .line 714
    :cond_0
    invoke-virtual {p0}, Ll/ۤۛۨ;->ܰ()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    .line 716
    iget-object v2, p0, Ll/֫ۛۨ;->ܰ:Ll/ܿۤۗ;

    .line 36
    invoke-virtual {v2}, Ll/ܿۤۗ;->toMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    const-wide/32 v6, 0x7fffffff

    .line 37
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/32 v6, -0x80000000

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_0
    long-to-int v3, v2

    .line 717
    iget v2, p0, Ll/֫ۛۨ;->ۘ:I

    const/16 v6, 0xd

    const/4 v7, 0x0

    if-nez v2, :cond_b

    .line 720
    iget-object v2, p0, Ll/ۤۛۨ;->᩸:Ljavax/net/ServerSocketFactory;

    const/4 v8, 0x1

    .line 1619
    invoke-virtual {p0}, Ll/ۤۛۨ;->ۘ()Ljava/net/InetAddress;

    move-result-object v9

    .line 720
    invoke-virtual {v2, v7, v8, v9}, Ljavax/net/ServerSocketFactory;->createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;

    move-result-object v2

    if-eqz v0, :cond_2

    .line 1619
    :try_start_0
    invoke-virtual {p0}, Ll/ۤۛۨ;->ۘ()Ljava/net/InetAddress;

    move-result-object v0

    .line 729
    invoke-virtual {v2}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v7

    invoke-virtual {p0, v0, v7}, Ll/ܳۛۨ;->ۙ(Ljava/net/InetAddress;I)I

    move-result v0

    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_3

    .line 756
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    return-object v1

    .line 1619
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Ll/ۤۛۨ;->ۘ()Ljava/net/InetAddress;

    move-result-object v0

    .line 732
    invoke-virtual {v2}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v7

    invoke-virtual {p0, v0, v7}, Ll/ܳۛۨ;->᩷(Ljava/net/InetAddress;I)I

    move-result v0

    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_3

    .line 756
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    return-object v1

    .line 735
    :cond_3
    :try_start_2
    iget-wide v7, p0, Ll/֫ۛۨ;->۬:J

    cmp-long v0, v7, v4

    if-lez v0, :cond_4

    invoke-virtual {p0, v7, v8}, Ll/֫ۛۨ;->᩷(J)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-virtual {p0, p1, p2}, Ll/ܳۛۨ;->ۤ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ll/᩺ۚ᩵;->᩷(I)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_6

    :cond_5
    if-eqz v2, :cond_17

    .line 756
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    return-object v1

    :cond_6
    if-ltz v3, :cond_7

    .line 743
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 745
    :cond_7
    invoke-virtual {v2}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object p1

    .line 3451
    iget p2, p0, Ll/֫ۛۨ;->֡:I

    if-eq p2, v6, :cond_8

    goto :goto_1

    .line 3453
    :cond_8
    new-instance p2, Ll/ᩴۛۨ;

    invoke-direct {p2, p1}, Ll/ᩴۛۨ;-><init>(Ljava/net/Socket;)V

    move-object p1, p2

    :goto_1
    if-ltz v3, :cond_9

    .line 748
    invoke-virtual {p1, v3}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 756
    :cond_9
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_a

    .line 720
    :try_start_4
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_2
    throw p1

    .line 766
    :cond_b
    iget-object v2, p0, Ll/ܳۛۨ;->᩵:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    .line 558
    sget-object v8, Ll/᩻ۛۨ;->ᩴۙ:Ll/᩻ۛۨ;

    .line 1218
    invoke-virtual {p0, v8, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v8

    const/16 v9, 0xe5

    if-ne v8, v9, :cond_c

    .line 768
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ll/֫ۛۨ;->ۧ(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    if-nez v0, :cond_17

    .line 1055
    sget-object v0, Ll/᩻ۛۨ;->ۢۙ:Ll/᩻ۛۨ;

    .line 1218
    invoke-virtual {p0, v0, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v0

    const/16 v8, 0xe3

    if-eq v0, v8, :cond_d

    goto/16 :goto_8

    .line 774
    :cond_d
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ll/֫ۛۨ;->᩻(Ljava/lang/String;)V

    .line 776
    :goto_3
    iget-object v0, p0, Ll/ۤۛۨ;->ᩴ:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    .line 3451
    iget v2, p0, Ll/֫ۛۨ;->֡:I

    if-eq v2, v6, :cond_e

    goto :goto_4

    .line 3453
    :cond_e
    new-instance v2, Ll/ᩴۛۨ;

    invoke-direct {v2, v0}, Ll/ᩴۛۨ;-><init>(Ljava/net/Socket;)V

    move-object v0, v2

    :goto_4
    if-ltz v3, :cond_f

    .line 791
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 793
    :cond_f
    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    iget v6, p0, Ll/֫ۛۨ;->۠:I

    invoke-direct {v2, v3, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    iget v3, p0, Ll/ۤۛۨ;->ۚ:I

    invoke-virtual {v0, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 794
    iget-wide v2, p0, Ll/֫ۛۨ;->۬:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_10

    invoke-virtual {p0, v2, v3}, Ll/֫ۛۨ;->᩷(J)Z

    move-result v2

    if-eqz v2, :cond_11

    :cond_10
    invoke-virtual {p0, p1, p2}, Ll/ܳۛۨ;->ۤ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ll/᩺ۚ᩵;->᩷(I)Z

    move-result p1

    if-nez p1, :cond_12

    .line 795
    :cond_11
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    return-object v1

    :cond_12
    move-object p1, v0

    .line 799
    :goto_5
    iget-boolean p2, p0, Ll/֫ۛۨ;->ۜ:Z

    if-eqz p2, :cond_16

    invoke-virtual {p0, p1}, Ll/ۤۛۨ;->ۙ(Ljava/net/Socket;)Z

    move-result p2

    if-eqz p2, :cond_13

    goto :goto_7

    .line 82
    :cond_13
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p2

    if-eqz p2, :cond_14

    .line 71
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    :cond_14
    move-object p2, v1

    .line 802
    :goto_6
    iget-object v0, p0, Ll/ۤۛۨ;->ܳ:Ljava/net/Socket;

    .line 82
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 71
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    .line 779
    :cond_15
    invoke-static {p1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 804
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Host attempting data connection "

    const-string v2, " is not same as server "

    .line 0
    invoke-static {v0, p2, v2, v1}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 804
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_7
    return-object p1

    :cond_17
    :goto_8
    return-object v1
.end method

.method public final ᩴ(Ljava/lang/String;)Ll/ۤ᩺ۨ;
    .locals 3

    .line 2856
    sget-object v0, Ll/᩻ۛۨ;->۫᩷:Ll/᩻ۛۨ;

    invoke-virtual {v0}, Ll/᩻ۛۨ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 931
    invoke-virtual {p0, v0, p1}, Ll/֫ۛۨ;->ᩴ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 936
    :cond_0
    iget v0, p0, Ll/֫ۛۨ;->۟:I

    if-nez v0, :cond_1

    .line 944
    new-instance v0, Ll/᩷᩺ۨ;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 1478
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 944
    invoke-direct {v0, v2}, Ll/᩷᩺ۨ;-><init>(Ljava/io/BufferedInputStream;)V

    goto :goto_0

    .line 946
    :cond_1
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 948
    :goto_0
    new-instance v1, Ll/ۤ᩺ۨ;

    invoke-direct {v1, p1, v0}, Ll/ۤ᩺ۨ;-><init>(Ljava/net/Socket;Ljava/io/InputStream;)V

    return-object v1
.end method

.method public final ᩴ()[Ll/ܽۛۨ;
    .locals 5

    .line 1225
    iget-object v0, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 1231
    :cond_0
    iget-object v0, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    iget-object v2, p0, Ll/֫ۛۨ;->֨:Ll/ܰۛۨ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۧۛۨ;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1234
    iget-object v0, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    invoke-virtual {v2, v0}, Ll/ܰۛۨ;->ۙ(Ll/ۧۛۨ;)Ll/ܶۛۨ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    .line 1235
    iget-object v0, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :cond_1
    const-string v0, "org.apache.commons.net.ftp.systemType"

    .line 1870
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 1844
    iget-object v0, p0, Ll/֫ۛۨ;->ۙۙ:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 1508
    sget-object v0, Ll/᩻ۛۨ;->֡᩷:Ll/᩻ۛۨ;

    .line 1218
    invoke-virtual {p0, v0, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v0

    .line 1845
    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1847
    iget-object v0, p0, Ll/ܳۛۨ;->᩵:Ljava/util/ArrayList;

    const/4 v3, 0x1

    .line 0
    invoke-static {v0, v3}, Lcom/umeng/analytics/pro/j$$ExternalSyntheticOutline0;->m(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 1847
    check-cast v0, Ljava/lang/String;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->ۙۙ:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, "org.apache.commons.net.ftp.systemType.default"

    .line 1850
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1854
    iput-object v0, p0, Ll/֫ۛۨ;->ۙۙ:Ljava/lang/String;

    goto :goto_0

    .line 1852
    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to determine system type - response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܳۛۨ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1857
    :cond_4
    :goto_0
    iget-object v0, p0, Ll/֫ۛۨ;->ۙۙ:Ljava/lang/String;

    .line 453
    sget-object v3, Ll/ۚۛۨ;->ۙ:Ljava/util/Properties;

    if-eqz v3, :cond_5

    .line 1875
    invoke-virtual {v3, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    move-object v0, v3

    .line 1242
    :cond_5
    iget-object v3, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    if-eqz v3, :cond_6

    .line 1243
    new-instance v3, Ll/ۧۛۨ;

    iget-object v4, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    invoke-direct {v3, v0, v4}, Ll/ۧۛۨ;-><init>(Ljava/lang/String;Ll/ۧۛۨ;)V

    invoke-virtual {v2, v3}, Ll/ܰۛۨ;->ۙ(Ll/ۧۛۨ;)Ll/ܶۛۨ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    goto :goto_1

    .line 1245
    :cond_6
    invoke-virtual {v2, v0}, Ll/ܰۛۨ;->ۙ(Ljava/lang/String;)Ll/ܶۛۨ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    .line 2124
    :goto_1
    iget-object v0, p0, Ll/֫ۛۨ;->᩶:Ll/ܶۛۨ;

    .line 2029
    sget-object v2, Ll/᩻ۛۨ;->᩻ۙ:Ll/᩻ۛۨ;

    invoke-virtual {p0, v2, v1}, Ll/֫ۛۨ;->᩷(Ll/᩻ۛۨ;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object v1

    .line 2030
    new-instance v2, Ll/ۗۛۨ;

    iget-object v3, p0, Ll/֫ۛۨ;->ᩳ:Ll/ۧۛۨ;

    invoke-direct {v2, v0, v3}, Ll/ۗۛۨ;-><init>(Ll/ܶۛۨ;Ll/ۧۛۨ;)V

    if-nez v1, :cond_7

    goto :goto_2

    .line 2035
    :cond_7
    :try_start_0
    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 586
    iget-object v3, p0, Ll/ܳۛۨ;->ܺ:Ljava/lang/String;

    .line 2035
    invoke-virtual {v2, v0, v3}, Ll/ۗۛۨ;->ۙ(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 779
    invoke-static {v1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 2039
    invoke-virtual {p0}, Ll/֫ۛۨ;->᩸()Z

    .line 2323
    :goto_2
    invoke-virtual {v2}, Ll/ۗۛۨ;->ۙ()[Ll/ܽۛۨ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 779
    invoke-static {v1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 2038
    throw v0
.end method

.method public final ᩷(Ll/᩻ۛۨ;Ljava/lang/String;)Ljava/net/Socket;
    .locals 0

    .line 678
    invoke-virtual {p1}, Ll/᩻ۛۨ;->ۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/֫ۛۨ;->ᩴ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    .line 2811
    iput-wide v0, p0, Ll/֫ۛۨ;->۬:J

    .line 2812
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    .line 1131
    sget-object p2, Ll/᩻ۛۨ;->ᩴ᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, p2, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0x12c

    if-lt p1, p2, :cond_0

    const/16 p2, 0x190

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1559
    sget-object v0, Ll/᩻ۛۨ;->֨᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    .line 2427
    iget p1, p0, Ll/ܳۛۨ;->ۗ:I

    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2432
    :cond_0
    iget p1, p0, Ll/ܳۛۨ;->ۗ:I

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_1

    const/16 v0, 0x190

    if-ge p1, v0, :cond_1

    .line 1041
    sget-object p1, Ll/᩻ۛۨ;->֡ۙ:Ll/᩻ۛۨ;

    invoke-virtual {p0, p1, p2}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 2435
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩸()Z
    .locals 1

    .line 1205
    invoke-virtual {p0}, Ll/ܳۛۨ;->ۚ()I

    move-result v0

    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0

    return v0
.end method

.method public final ᩸(Ljava/lang/String;)Z
    .locals 1

    .line 485
    sget-object v0, Ll/᩻ۛۨ;->᩷ۙ:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 1263
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1
.end method

.method public final ᩸(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1175
    sget-object v0, Ll/᩻ۛۨ;->ۧ᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, v0, p1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_0

    const/16 v0, 0x190

    if-ge p1, v0, :cond_0

    .line 1190
    sget-object p1, Ll/᩻ۛۨ;->᩻᩷:Ll/᩻ۛۨ;

    invoke-virtual {p0, p1, p2}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result p1

    .line 2794
    invoke-static {p1}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩹()Z
    .locals 4

    .line 1522
    sget-object v0, Ll/᩻ۛۨ;->ۢ᩷:Ll/᩻ۛۨ;

    const-string v1, "AEILNTCFRPSBCZ"

    const/4 v2, 0x3

    const/4 v3, 0x2

    .line 934
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1522
    invoke-virtual {p0, v0, v1}, Ll/ܳۛۨ;->ۙ(Ll/᩻ۛۨ;Ljava/lang/String;)I

    move-result v0

    .line 3079
    invoke-static {v0}, Ll/᩺ۚ᩵;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3080
    iput v3, p0, Ll/֫ۛۨ;->۟:I

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩻()V
    .locals 0

    .line 1273
    invoke-super {p0}, Ll/ܳۛۨ;->᩻()V

    .line 1274
    invoke-direct {p0}, Ll/֫ۛۨ;->ۜ()V

    return-void
.end method

.method public final ᩻(Ljava/lang/String;)V
    .locals 5

    .line 843
    sget-object v0, Ll/֫ۛۨ;->ۤۙ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 844
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    const-string v2, "Could not parse passive host information.\nServer Reply: "

    if-eqz v1, :cond_4

    const-string v1, "0,0,0,0"

    const/4 v3, 0x1

    .line 849
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۤۛۨ;->ܳ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x2c

    const/16 v4, 0x2e

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v3, 0x2

    .line 851
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x3

    .line 852
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v0, v3

    .line 2170
    iget-boolean v3, p0, Ll/֫ۛۨ;->ۢ:Z

    if-eqz v3, :cond_1

    .line 859
    iget-object v3, p0, Ll/֫ۛۨ;->ۖ:Ll/۫ۛۨ;

    if-eqz v3, :cond_3

    .line 861
    :try_start_1
    invoke-virtual {v3, v1}, Ll/۫ۛۨ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 862
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 863
    invoke-virtual {p0}, Ll/ۤۛۨ;->ۛ()V
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v1, v3

    goto :goto_1

    .line 867
    :catch_0
    new-instance v0, Ll/ۖۨۨ;

    .line 0
    invoke-static {v2, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 867
    throw v0

    .line 870
    :cond_1
    iget-object p1, p0, Ll/ۤۛۨ;->ܳ:Ljava/net/Socket;

    if-nez p1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    .line 873
    :cond_2
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    .line 875
    :cond_3
    :goto_1
    iput-object v1, p0, Ll/֫ۛۨ;->ۡ:Ljava/lang/String;

    .line 876
    iput v0, p0, Ll/֫ۛۨ;->۠:I

    return-void

    .line 855
    :catch_1
    new-instance v0, Ll/ۖۨۨ;

    const-string v1, "Could not parse passive port information.\nServer Reply: "

    .line 0
    invoke-static {v1, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 855
    throw v0

    .line 845
    :cond_4
    new-instance v0, Ll/ۖۨۨ;

    .line 0
    invoke-static {v2, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 845
    throw v0
.end method
