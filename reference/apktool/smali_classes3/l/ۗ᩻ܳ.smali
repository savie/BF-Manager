.class public final Ll/ۗ᩻ܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ll/᩵᩻ܳ;


# instance fields
.field public final ֫:Ljava/io/OutputStream;

.field public ۗ:I

.field public final ۙ:Ljava/util/ArrayList;

.field public ۚ:Ll/ۨ᩻ܳ;

.field public ۛ:Ljava/lang/String;

.field public ۤ:Ll/۬֫ۧ;

.field public ۧ:Ljava/util/HashMap;

.field public final synthetic ۨ:Ll/֨᩻ܳ;

.field public final ۫:Ll/ۛ᩻ܳ;

.field public ܳ:Ljava/util/HashMap;

.field public ܶ:J

.field public ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ᩴ:Z

.field public final ᩵:Ll/ܶ᩻ܳ;

.field public ᩷:Ljava/lang/String;

.field public ᩸:Ll/ۧ᩻ܳ;

.field public ᩹:I

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨᩻ܳ;Ll/ܶ᩻ܳ;Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/net/InetAddress;)V
    .locals 0

    .line 729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩻ܳ;->ۨ:Ll/֨᩻ܳ;

    .line 705
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۗ᩻ܳ;->ۙ:Ljava/util/ArrayList;

    .line 730
    iput-object p2, p0, Ll/ۗ᩻ܳ;->᩵:Ll/ܶ᩻ܳ;

    .line 731
    new-instance p1, Ll/ۛ᩻ܳ;

    const/16 p2, 0x2000

    .line 619
    invoke-direct {p1, p3, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 731
    iput-object p1, p0, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    .line 732
    iput-object p4, p0, Ll/ۗ᩻ܳ;->֫:Ljava/io/OutputStream;

    .line 733
    invoke-virtual {p5}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p5}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "127.0.0.1"

    :goto_1
    iput-object p1, p0, Ll/ۗ᩻ܳ;->ܽ:Ljava/lang/String;

    .line 734
    invoke-virtual {p5}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p5}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p5}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    :cond_3
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    return-void
.end method

.method private ۗ()Ljava/lang/String;
    .locals 2

    .line 1202
    iget-object v0, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    const-string v1, "HTTP/1.0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "HTTP/1.1"

    return-object v0
.end method

.method public static ۙ(I[B)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    if-ge v2, p0, :cond_2

    .line 1214
    aget-byte v3, p1, v1

    const/16 v4, 0xd

    const/16 v5, 0xa

    if-ne v3, v4, :cond_0

    aget-byte v6, p1, v2

    if-ne v6, v5, :cond_0

    add-int/lit8 v6, v1, 0x3

    if-ge v6, p0, :cond_0

    add-int/lit8 v7, v1, 0x2

    aget-byte v7, p1, v7

    if-ne v7, v4, :cond_0

    aget-byte v4, p1, v6

    if-ne v4, v5, :cond_0

    add-int/lit8 v1, v1, 0x4

    return v1

    :cond_0
    if-ne v3, v5, :cond_1

    .line 1219
    aget-byte v3, p1, v2

    if-ne v3, v5, :cond_1

    add-int/lit8 v1, v1, 0x2

    return v1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return v0
.end method

.method private ۙ(Ljava/nio/ByteBuffer;IILjava/lang/String;)Ljava/lang/String;
    .locals 3

    if-lez p3, :cond_0

    const/4 p4, 0x0

    .line 1527
    :try_start_0
    iget-object v0, p0, Ll/ۗ᩻ܳ;->᩵:Ll/ܶ᩻ܳ;

    invoke-virtual {v0}, Ll/ܶ᩻ܳ;->᩷()Ll/ܽ᩻ܳ;

    move-result-object v0

    .line 1528
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 1529
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ll/ܽ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1530
    :try_start_1
    invoke-static {v1}, Ll/ۨ۠ۗ;->ۙ(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;

    move-result-object p4

    .line 1531
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v2

    add-int/2addr p2, p3

    invoke-virtual {v2, p2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 1532
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 1533
    invoke-virtual {v0}, Ll/ܽ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1537
    invoke-static {v1}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object p4, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 1535
    :goto_0
    :try_start_2
    new-instance p2, Ljava/lang/Error;

    invoke-direct {p2, p1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    move-object v1, p4

    .line 1537
    :goto_2
    invoke-static {v1}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1538
    throw p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private ۙ(Ljava/io/BufferedReader;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 8

    const-string v0, "HTTP VERSION NOT SUPPORTED: "

    .line 744
    :try_start_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v2, " "

    const/4 v3, -0x1

    .line 750
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 751
    array-length v2, v1

    const/4 v3, 0x3

    if-ne v2, v3, :cond_e

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    const/4 v3, 0x1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    const/4 v4, 0x2

    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_e

    const-string v5, "method"

    .line 755
    aget-object v6, v1, v2

    invoke-virtual {p2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    aget-object v3, v1, v3

    const/16 v5, 0x3f

    .line 759
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    const-string v6, "BAD REQUEST: Malformed percent-encoding."

    if-ltz v5, :cond_1

    add-int/lit8 v7, v5, 0x1

    .line 761
    :try_start_1
    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v7, p3}, Ll/ۗ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/util/Map;)V

    .line 762
    invoke-virtual {v3, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 884
    :try_start_2
    invoke-static {p3}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_0
    move-exception p1

    .line 886
    :try_start_3
    new-instance p2, Ll/֡᩻ܳ;

    sget-object p3, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p2, p3, v6, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 884
    :cond_1
    :try_start_4
    invoke-static {v3}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 771
    :goto_0
    :try_start_5
    aget-object v1, v1, v4

    iput-object v1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    const-string v3, "HTTP/1.0"

    .line 772
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    const-string v3, "HTTP/1.1"

    if-nez v1, :cond_3

    :try_start_6
    iget-object v1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 773
    :cond_2
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->ۘۙ:Ll/᩶᩻ܳ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    .line 775
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    :goto_2
    const-string v1, "host"

    if-eqz v0, :cond_b

    .line 776
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    const/16 v4, 0x3a

    .line 777
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    const-string v5, "BAD REQUEST: Invalid header name."

    if-lez v4, :cond_a

    .line 781
    :try_start_8
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 783
    invoke-static {}, Ll/֨᩻ܳ;->֫()Ljava/util/regex/Pattern;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 786
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "authorization"

    .line 787
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 788
    iget-object v6, p0, Ll/ۗ᩻ܳ;->ۙ:Ljava/util/ArrayList;

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 790
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v4, "content-length"

    .line 791
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    .line 792
    :cond_5
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string p3, "BAD REQUEST: Multiple Content-Length headers."

    invoke-direct {p1, p2, p3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    .line 794
    :cond_6
    :goto_3
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_4

    .line 795
    :cond_7
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string p3, "BAD REQUEST: Multiple Host headers."

    invoke-direct {p1, p2, p3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    .line 797
    :cond_8
    :goto_4
    invoke-virtual {p4, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    .line 784
    :cond_9
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p1, p2, v5}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    .line 779
    :cond_a
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p1, p2, v5}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    .line 801
    :cond_b
    iget-object p1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {p4, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_5

    .line 802
    :cond_c
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string p3, "BAD REQUEST: Missing Host header."

    invoke-direct {p1, p2, p3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1

    :cond_d
    :goto_5
    const-string p1, "uri"

    .line 805
    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catch_1
    move-exception p1

    .line 886
    new-instance p2, Ll/֡᩻ܳ;

    sget-object p3, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p2, p3, v6, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    .line 752
    :cond_e
    new-instance p1, Ll/֡᩻ܳ;

    sget-object p2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string p3, "BAD REQUEST: Syntax error. Usage: GET /example/file.html"

    invoke-direct {p1, p2, p3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    move-exception p1

    .line 807
    new-instance p2, Ll/֡᩻ܳ;

    sget-object p3, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "SERVER INTERNAL ERROR: IOException: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p4}, Ll/ۧ᩺᩻;->ۙ(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p4

    .line 807
    invoke-direct {p2, p3, p4, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private ۙ(Ljava/lang/String;Ljava/util/Map;)V
    .locals 5

    const-string v0, ""

    if-nez p1, :cond_0

    .line 1011
    iput-object v0, p0, Ll/ۗ᩻ܳ;->ܺ:Ljava/lang/String;

    return-void

    .line 1015
    :cond_0
    iput-object p1, p0, Ll/ۗ᩻ܳ;->ܺ:Ljava/lang/String;

    .line 1016
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, "&"

    invoke-direct {v1, p1, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1017
    :goto_0
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1018
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x3d

    .line 1019
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const-string v3, "BAD REQUEST: Malformed percent-encoding."

    if-ltz v2, :cond_1

    const/4 v4, 0x0

    .line 1024
    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 1046
    :try_start_0
    invoke-static {v4}, Ll/֨᩻ܳ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1024
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    .line 1025
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 1046
    :try_start_1
    invoke-static {p1}, Ll/֨᩻ܳ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1048
    new-instance p2, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p2, v0, v3, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p2, v0, v3, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    .line 1046
    :cond_1
    :try_start_2
    invoke-static {p1}, Ll/֨᩻ܳ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1027
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    move-object p1, v0

    .line 1031
    :goto_1
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_2

    .line 1033
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1034
    invoke-interface {p2, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1037
    :cond_2
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_2
    move-exception p1

    .line 1048
    new-instance p2, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p2, v0, v3, p1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :cond_3
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۗ᩻ܳ;Ll/۬֫ۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۗ᩻ܳ;->ۤ:Ll/۬֫ۧ;

    return-void
.end method

.method private ۙ(Ll/ۚ᩻ܳ;Ljava/nio/ByteBuffer;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 19

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 896
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ll/ۚ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "US-ASCII"

    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v0, v3}, Ll/ۗ᩻ܳ;->ۙ(Ljava/nio/ByteBuffer;[B)[I

    move-result-object v3

    .line 897
    array-length v4, v3

    const/4 v5, 0x2

    if-lt v4, v5, :cond_12

    const/16 v4, 0x400

    new-array v6, v4, [B

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 902
    :goto_0
    array-length v10, v3

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    if-ge v8, v10, :cond_11

    .line 903
    aget v10, v3, v8

    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 904
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->remaining()I

    move-result v10

    if-ge v10, v4, :cond_0

    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    goto :goto_1

    :cond_0
    const/16 v4, 0x400

    .line 905
    :goto_1
    invoke-virtual {v0, v6, v7, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 906
    new-instance v10, Ljava/io/BufferedReader;

    new-instance v12, Ljava/io/InputStreamReader;

    new-instance v13, Ljava/io/ByteArrayInputStream;

    invoke-direct {v13, v6, v7, v4}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 907
    invoke-virtual/range {p1 .. p1}, Ll/ۚ᩻ܳ;->᩸()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-direct {v12, v13, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v10, v12, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 911
    invoke-virtual {v10}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_10

    .line 913
    invoke-virtual/range {p1 .. p1}, Ll/ۚ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 919
    invoke-virtual {v10}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    const/4 v13, 0x2

    move-object v13, v12

    move-object v14, v13

    const/4 v15, 0x2

    :goto_2
    if-eqz v7, :cond_8

    .line 921
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_8

    .line 922
    invoke-static {}, Ll/֨᩻ܳ;->۫()Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 923
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v17

    if-eqz v17, :cond_6

    move/from16 v17, v9

    const/4 v9, 0x2

    .line 924
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 925
    invoke-static {}, Ll/֨᩻ܳ;->ܳ()Ljava/util/regex/Pattern;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    move/from16 v9, v17

    .line 926
    :goto_3
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v17

    if-eqz v17, :cond_5

    .line 927
    invoke-virtual {v5, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v17, v14

    const-string v14, "name"

    .line 928
    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    const/4 v14, 0x2

    .line 929
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    move-object v12, v11

    :cond_1
    move-object/from16 v14, v17

    goto :goto_4

    :cond_2
    const-string v14, "filename"

    .line 930
    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x2

    .line 931
    invoke-virtual {v5, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    .line 934
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_4

    if-lez v9, :cond_3

    .line 936
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v9, 0x1

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move/from16 v18, v12

    move-object v12, v9

    move/from16 v9, v18

    goto :goto_4

    :cond_3
    add-int/lit8 v9, v9, 0x1

    :cond_4
    :goto_4
    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    move-object/from16 v17, v14

    goto :goto_5

    :cond_6
    move/from16 v17, v9

    .line 943
    :goto_5
    invoke-static {}, Ll/֨᩻ܳ;->ۚ()Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 944
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, 0x2

    .line 945
    invoke-virtual {v5, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    move-object v13, v5

    goto :goto_6

    :cond_7
    const/4 v7, 0x2

    .line 947
    :goto_6
    invoke-virtual {v10}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v15, v15, 0x1

    const/4 v11, 0x1

    move-object v7, v5

    const/4 v5, 0x2

    goto/16 :goto_2

    :cond_8
    move/from16 v17, v9

    const/4 v7, 0x2

    const/4 v5, 0x0

    :goto_7
    add-int/lit8 v9, v15, -0x1

    if-lez v15, :cond_a

    .line 998
    :goto_8
    aget-byte v10, v6, v5

    const/16 v11, 0xa

    add-int/lit8 v5, v5, 0x1

    if-eq v10, v11, :cond_9

    goto :goto_8

    :cond_9
    move v15, v9

    goto :goto_7

    :cond_a
    add-int/lit8 v4, v4, -0x4

    if-ge v5, v4, :cond_f

    .line 958
    aget v4, v3, v8

    add-int/2addr v4, v5

    add-int/lit8 v8, v8, 0x1

    .line 959
    aget v5, v3, v8

    add-int/lit8 v5, v5, -0x4

    .line 961
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 963
    invoke-virtual {v1, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    if-nez v9, :cond_b

    .line 965
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 966
    invoke-virtual {v1, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    if-nez v13, :cond_c

    sub-int/2addr v5, v4

    .line 971
    new-array v4, v5, [B

    .line 972
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 974
    new-instance v5, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Ll/ۚ᩻ܳ;->᩸()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v5, v4, v10}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/֡᩻ܳ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v10, p0

    goto :goto_b

    :cond_c
    sub-int/2addr v5, v4

    move-object/from16 v10, p0

    .line 977
    :try_start_1
    invoke-direct {v10, v0, v4, v5, v14}, Ll/ۗ᩻ܳ;->ۙ(Ljava/nio/ByteBuffer;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 978
    invoke-virtual {v2, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 979
    invoke-virtual {v2, v12, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_d
    const/4 v5, 0x2

    .line 982
    :goto_9
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 985
    :cond_e
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    :goto_a
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    const/16 v4, 0x400

    const/4 v5, 0x0

    move/from16 v9, v17

    const/4 v5, 0x2

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_f
    move-object/from16 v10, p0

    .line 956
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    const-string v2, "Multipart header size exceeds MAX_HEADER_SIZE."

    invoke-direct {v0, v1, v2}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    :cond_10
    move-object/from16 v10, p0

    .line 914
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v2, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary."

    invoke-direct {v0, v1, v2}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object/from16 v10, p0

    return-void

    :cond_12
    move-object/from16 v10, p0

    .line 898
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v2, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings."

    invoke-direct {v0, v1, v2}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ll/֡᩻ܳ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_d

    :catch_2
    move-exception v0

    move-object/from16 v10, p0

    .line 993
    :goto_c
    new-instance v1, Ll/֡᩻ܳ;

    sget-object v2, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v1

    :catch_3
    move-exception v0

    move-object/from16 v10, p0

    .line 991
    :goto_d
    throw v0
.end method

.method public static ۙ(Ljava/nio/ByteBuffer;[B)[I
    .locals 11

    .line 1231
    array-length v0, p1

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    array-length v2, p1

    const/4 v3, 0x2

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    goto/16 :goto_6

    .line 1234
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1235
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v2

    const/4 v4, 0x0

    .line 1236
    :goto_0
    array-length v5, p1

    sub-int v5, v2, v5

    if-gt v4, v5, :cond_a

    const/16 v5, 0x2d

    const/4 v6, 0x1

    if-ne v4, v3, :cond_1

    .line 1237
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-ne v7, v5, :cond_1

    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-ne v7, v5, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    const/16 v8, 0xa

    const/16 v9, 0xd

    const/4 v10, 0x4

    if-lt v4, v10, :cond_2

    add-int/lit8 v10, v4, -0x4

    .line 1239
    invoke-virtual {p0, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    if-ne v10, v9, :cond_2

    add-int/lit8 v10, v4, -0x3

    .line 1240
    invoke-virtual {p0, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    if-ne v10, v8, :cond_2

    add-int/lit8 v10, v4, -0x2

    .line 1241
    invoke-virtual {p0, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    if-ne v10, v5, :cond_2

    add-int/lit8 v10, v4, -0x1

    .line 1242
    invoke-virtual {p0, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    if-ne v10, v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-nez v7, :cond_3

    if-nez v6, :cond_3

    goto :goto_4

    .line 1246
    :cond_3
    array-length v6, p1

    add-int/2addr v6, v4

    add-int/lit8 v7, v6, 0x1

    if-lt v7, v2, :cond_4

    goto :goto_4

    .line 1250
    :cond_4
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    if-ne v10, v9, :cond_5

    invoke-virtual {p0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    if-eq v9, v8, :cond_6

    .line 1251
    :cond_5
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    if-ne v6, v5, :cond_9

    invoke-virtual {p0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    if-ne v6, v5, :cond_9

    :cond_6
    const/4 v5, 0x0

    .line 1256
    :goto_3
    array-length v6, p1

    if-ge v5, v6, :cond_8

    add-int v6, v4, v5

    .line 1257
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    aget-byte v7, p1, v5

    if-eq v6, v7, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 1263
    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1266
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [I

    .line 1267
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_b

    .line 1268
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput p1, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    return-object p0

    :cond_c
    :goto_6
    new-array p0, v1, [I

    return-object p0
.end method

.method private ۨ()Z
    .locals 5

    .line 1400
    iget-wide v0, p0, Ll/ۗ᩻ܳ;->ܶ:J

    iget-object v2, p0, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    invoke-virtual {v2}, Ll/ۛ᩻ܳ;->ۙ()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ܶ()V
    .locals 1

    const/4 v0, 0x0

    .line 1330
    iput-object v0, p0, Ll/ۗ᩻ܳ;->᩷:Ljava/lang/String;

    const/4 v0, 0x0

    .line 1331
    iput-boolean v0, p0, Ll/ۗ᩻ܳ;->ᩴ:Z

    return-void
.end method

.method private ᩵()V
    .locals 7

    .line 843
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v1, "expect"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 844
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, ","

    .line 864
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 866
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v5, v0, v3

    .line 867
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 868
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "100-continue"

    .line 871
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move v2, v4

    :goto_2
    if-eqz v2, :cond_5

    const-string v0, "HTTP/1.1"

    .line 850
    iget-object v1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 854
    iget-wide v0, p0, Ll/ۗ᩻ܳ;->ܶ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_6

    .line 855
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    const-string v2, " 100 Continue\r\n\r\n"

    .line 0
    invoke-static {v0, v1, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "US-ASCII"

    .line 855
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iget-object v1, p0, Ll/ۗ᩻ܳ;->֫:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 856
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    return-void

    .line 852
    :cond_4
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->֨:Ll/᩶᩻ܳ;

    const-string v2, "EXPECTATION FAILED: Expect header requires HTTP/1.1."

    invoke-direct {v0, v1, v2}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    .line 848
    :cond_5
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->֨:Ll/᩶᩻ܳ;

    const-string v2, "EXPECTATION FAILED: Unsupported Expect header."

    invoke-direct {v0, v1, v2}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_3
    return-void
.end method

.method public static ᩷(Ljava/util/HashMap;)V
    .locals 4

    const-string v0, "transfer-encoding"

    .line 815
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 816
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 817
    :cond_0
    new-instance p0, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v1, "BAD REQUEST: Transfer-Encoding is not supported."

    invoke-direct {p0, v0, v1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const-string v0, "content-length"

    .line 819
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_2

    return-void

    .line 823
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "BAD REQUEST: Invalid Content-Length."

    if-nez v0, :cond_5

    const/4 v0, 0x0

    .line 826
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 827
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_3

    const/16 v3, 0x39

    if-gt v2, v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 829
    :cond_3
    new-instance p0, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p0, v0, v1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p0

    .line 833
    :cond_4
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 835
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {v0, v2, v1, p0}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 824
    :cond_5
    new-instance p0, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-direct {p0, v0, v1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 13

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, ","

    .line 1411
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 1412
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_a

    aget-object v4, p0, v2

    const-string v5, ";"

    .line 1413
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 1414
    array-length v5, v4

    if-nez v5, :cond_1

    goto/16 :goto_4

    .line 1417
    :cond_1
    aget-object v5, v4, v0

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 1418
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_4

    :cond_2
    const/4 v6, 0x1

    .line 1422
    :goto_1
    array-length v7, v4

    const-wide/16 v8, 0x0

    if-ge v6, v7, :cond_5

    .line 1423
    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x3d

    .line 1424
    invoke-virtual {v7, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-gez v10, :cond_3

    goto :goto_2

    .line 1428
    :cond_3
    invoke-virtual {v7, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    const-string v12, "q"

    .line 1429
    invoke-virtual {v12, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 1433
    :try_start_0
    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-wide v6, v8

    goto :goto_3

    :cond_5
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    :goto_3
    const-string v4, "gzip"

    .line 1439
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    cmpl-double p0, v6, v8

    if-lez p0, :cond_6

    const/4 v0, 0x1

    :cond_6
    return v0

    :cond_7
    const-string v4, "*"

    .line 1442
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    cmpl-double v3, v6, v8

    if-lez v3, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    :cond_9
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_a
    return v3
.end method

.method private ᩹()J
    .locals 2

    .line 1392
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v1, "content-length"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 1393
    :cond_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final ֫()Ljava/util/HashMap;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1345
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1346
    iget-object v1, p0, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1347
    iget-object v3, p0, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۙ()V
    .locals 1

    .line 1292
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ۤ:Ll/۬֫ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬֫ۧ;->run()V

    return-void

    .line 1293
    :cond_0
    iget-object v0, p0, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    invoke-static {v0}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 1322
    iput-object p1, p0, Ll/ۗ᩻ܳ;->᩷:Ljava/lang/String;

    const/4 p1, 0x1

    .line 1323
    iput-boolean p1, p0, Ll/ۗ᩻ܳ;->ᩴ:Z

    return-void
.end method

.method public final ۙ(Ljava/util/HashMap;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    .line 1381
    :try_start_0
    iget-object v3, v1, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v4, "content-length"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const-wide/16 v5, 0x0

    if-eqz v3, :cond_0

    .line 1382
    iget-object v3, v1, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v5

    :goto_0
    const-wide/16 v7, 0x400

    cmp-long v9, v3, v7

    if-gez v9, :cond_1

    .line 1459
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1460
    new-instance v8, Ljava/io/DataOutputStream;

    invoke-direct {v8, v7}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v9, v8

    move-object v8, v2

    goto :goto_1

    .line 1365
    :cond_1
    :try_start_1
    iget-object v7, v1, Ll/ۗ᩻ܳ;->᩵:Ll/ܶ᩻ܳ;

    invoke-virtual {v7}, Ll/ܶ᩻ܳ;->᩷()Ll/ܽ᩻ܳ;

    move-result-object v7

    .line 1366
    new-instance v8, Ljava/io/RandomAccessFile;

    invoke-virtual {v7}, Ll/ܽ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object v7

    const-string v9, "rw"

    invoke-direct {v8, v7, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v7, v2

    move-object v9, v8

    :goto_1
    const/16 v10, 0x200

    :try_start_2
    new-array v10, v10, [B

    :goto_2
    const/4 v11, 0x0

    cmp-long v12, v3, v5

    if-lez v12, :cond_3

    .line 1469
    iget-object v12, v1, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    const-wide/16 v13, 0x200

    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    long-to-int v14, v13

    invoke-virtual {v12, v10, v11, v14}, Ll/ۛ᩻ܳ;->read([BII)I

    move-result v12

    iput v12, v1, Ll/ۗ᩻ܳ;->᩹:I

    if-lez v12, :cond_2

    int-to-long v13, v12

    sub-long/2addr v3, v13

    .line 1474
    invoke-interface {v9, v10, v11, v12}, Ljava/io/DataOutput;->write([BII)V

    goto :goto_2

    .line 1471
    :cond_2
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v3, "BAD REQUEST: Request body ended before Content-Length."

    invoke-direct {v0, v2, v3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eqz v7, :cond_4

    .line 1479
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v4

    invoke-static {v3, v11, v4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v3

    goto :goto_3

    .line 1481
    :cond_4
    invoke-static {v8}, Ll/ۚܽۤ;->ۙ(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;

    move-result-object v12

    sget-object v13, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v16

    const-wide/16 v14, 0x0

    invoke-virtual/range {v12 .. v17}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v3

    .line 1482
    invoke-virtual {v8, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 1487
    :goto_3
    sget-object v4, Ll/ۨ᩻ܳ;->ۜ:Ll/ۨ᩻ܳ;

    iget-object v5, v1, Ll/ۗ᩻ܳ;->ۚ:Ll/ۨ᩻ܳ;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 1488
    new-instance v2, Ll/ۚ᩻ܳ;

    iget-object v4, v1, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v5, "content-type"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v4}, Ll/ۚ᩻ܳ;-><init>(Ljava/lang/String;)V

    .line 1489
    invoke-virtual {v2}, Ll/ۚ᩻ܳ;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 1490
    invoke-virtual {v2}, Ll/ۚ᩻ܳ;->ۙ()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 1491
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 1495
    iget-object v4, v1, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    invoke-direct {v1, v2, v3, v4, v0}, Ll/ۗ᩻ܳ;->ۙ(Ll/ۚ᩻ܳ;Ljava/nio/ByteBuffer;Ljava/util/HashMap;Ljava/util/HashMap;)V

    goto :goto_4

    .line 1492
    :cond_5
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v3, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html"

    invoke-direct {v0, v2, v3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    .line 1497
    :cond_6
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    new-array v4, v4, [B

    .line 1498
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 1499
    new-instance v3, Ljava/lang/String;

    invoke-virtual {v2}, Ll/ۚ᩻ܳ;->᩸()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "application/x-www-form-urlencoded"

    .line 1501
    invoke-virtual {v2}, Ll/ۚ᩻ܳ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1502
    iget-object v0, v1, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    invoke-direct {v1, v3, v0}, Ll/ۗ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_4

    .line 1503
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "postData"

    .line 1507
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 1510
    :cond_8
    sget-object v4, Ll/ۨ᩻ܳ;->᩷ۙ:Ll/ۨ᩻ܳ;

    iget-object v5, v1, Ll/ۗ᩻ܳ;->ۚ:Ll/ۨ᩻ܳ;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const-string v4, "content"

    .line 1511
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v5

    invoke-direct {v1, v3, v11, v5, v2}, Ll/ۗ᩻ܳ;->ۙ(Ljava/nio/ByteBuffer;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1514
    :cond_9
    :goto_4
    invoke-static {v8}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v8

    goto :goto_5

    :catch_0
    move-exception v0

    .line 1368
    :try_start_3
    new-instance v3, Ljava/lang/Error;

    invoke-direct {v3, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 1514
    :goto_5
    invoke-static {v2}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1515
    throw v0
.end method

.method public final ۚ()Ljava/util/Map;
    .locals 1

    .line 1355
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ۤ()Ljava/util/List;
    .locals 1

    .line 1286
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 1360
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܺ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۫()Ll/ۨ᩻ܳ;
    .locals 1

    .line 1336
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ۚ:Ll/ۨ᩻ܳ;

    return-object v0
.end method

.method public final ܳ()Ljava/io/InputStream;
    .locals 1

    .line 1298
    iget-object v0, p0, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 1374
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 1306
    iget-boolean v0, p0, Ll/ۗ᩻ܳ;->ᩴ:Z

    return v0
.end method

.method public final ᩴ()Ljava/util/Map;
    .locals 1

    .line 1280
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ᩷()V
    .locals 15

    const-string v0, "method"

    const-string v1, "HTTP/1.1"

    const-string v2, "text/plain"

    const-string v3, "NanoHttpd Shutdown"

    .line 1054
    iget-object v4, p0, Ll/ۗ᩻ܳ;->ۨ:Ll/֨᩻ܳ;

    iget-object v5, p0, Ll/ۗ᩻ܳ;->᩵:Ll/ܶ᩻ܳ;

    iget-object v6, p0, Ll/ۗ᩻ܳ;->۫:Ll/ۛ᩻ܳ;

    iget-object v7, p0, Ll/ۗ᩻ܳ;->֫:Ljava/io/OutputStream;

    const/16 v8, 0x2000

    const/4 v9, 0x0

    :try_start_0
    new-array v10, v8, [B

    const/4 v11, 0x0

    .line 1062
    iput v11, p0, Ll/ۗ᩻ܳ;->ۗ:I

    .line 1063
    iput v11, p0, Ll/ۗ᩻ܳ;->᩹:I

    .line 1065
    iput-object v1, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    .line 1067
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ܶ()V

    .line 1070
    invoke-virtual {v6, v8}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/֡᩻ܳ; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1072
    :try_start_1
    invoke-virtual {v6, v10, v11, v8}, Ll/ۛ᩻ܳ;->read([BII)I

    move-result v8
    :try_end_1
    .catch Ljavax/net/ssl/SSLException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/֡᩻ܳ; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v12, -0x1

    if-eq v8, v12, :cond_e

    :goto_0
    if-lez v8, :cond_1

    .line 1087
    :try_start_2
    iget v12, p0, Ll/ۗ᩻ܳ;->᩹:I

    add-int/2addr v12, v8

    iput v12, p0, Ll/ۗ᩻ܳ;->᩹:I

    .line 1088
    invoke-static {v12, v10}, Ll/ۗ᩻ܳ;->ۙ(I[B)I

    move-result v8

    iput v8, p0, Ll/ۗ᩻ܳ;->ۗ:I

    if-lez v8, :cond_0

    goto :goto_1

    .line 1092
    :cond_0
    iget v8, p0, Ll/ۗ᩻ܳ;->᩹:I

    rsub-int v12, v8, 0x2000

    invoke-virtual {v6, v10, v8, v12}, Ll/ۛ᩻ܳ;->read([BII)I

    move-result v8

    goto :goto_0

    .line 1094
    :cond_1
    :goto_1
    iget v8, p0, Ll/ۗ᩻ܳ;->ۗ:I

    if-eqz v8, :cond_d

    .line 1098
    iget v12, p0, Ll/ۗ᩻ܳ;->᩹:I

    if-ge v8, v12, :cond_2

    .line 1099
    invoke-virtual {v6}, Ljava/io/InputStream;->reset()V

    .line 1100
    iget v8, p0, Ll/ۗ᩻ܳ;->ۗ:I

    int-to-long v12, v8

    invoke-virtual {v6, v12, v13}, Ll/ۛ᩻ܳ;->skip(J)J

    .line 1103
    :cond_2
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, p0, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    .line 1104
    iget-object v8, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    if-nez v8, :cond_3

    .line 1105
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    goto :goto_2

    .line 1107
    :cond_3
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    .line 1111
    :goto_2
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v12, Ljava/io/InputStreamReader;

    new-instance v13, Ljava/io/ByteArrayInputStream;

    iget v14, p0, Ll/ۗ᩻ܳ;->᩹:I

    invoke-direct {v13, v10, v11, v14}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {v12, v13}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v8, v12}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1114
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 1116
    iput-object v9, p0, Ll/ۗ᩻ܳ;->ܺ:Ljava/lang/String;

    .line 1117
    iget-object v12, p0, Ll/ۗ᩻ܳ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 1118
    iget-object v12, p0, Ll/ۗ᩻ܳ;->ۧ:Ljava/util/HashMap;

    iget-object v13, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    invoke-direct {p0, v8, v10, v12, v13}, Ll/ۗ᩻ܳ;->ۙ(Ljava/io/BufferedReader;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 1119
    iget-object v8, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    invoke-static {v8}, Ll/ۗ᩻ܳ;->᩷(Ljava/util/HashMap;)V

    .line 1120
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->᩹()J

    move-result-wide v12

    iput-wide v12, p0, Ll/ۗ᩻ܳ;->ܶ:J

    .line 1121
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ll/ۨ᩻ܳ;->ۙ(Ljava/lang/String;)Ll/ۨ᩻ܳ;

    move-result-object v8

    iput-object v8, p0, Ll/ۗ᩻ܳ;->ۚ:Ll/ۨ᩻ܳ;

    if-eqz v8, :cond_c

    const-string v0, "uri"

    .line 1125
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/ۗ᩻ܳ;->ۛ:Ljava/lang/String;

    .line 1126
    invoke-virtual {v6}, Ll/ۛ᩻ܳ;->᩷()V
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljavax/net/ssl/SSLException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/֡᩻ܳ; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1128
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܽ:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 1129
    :try_start_3
    iget-object v6, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v8, "remote-addr"

    invoke-virtual {v6, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1130
    iget-object v6, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v8, "http-client-ip"

    invoke-virtual {v6, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1133
    :cond_4
    new-instance v0, Ll/ۧ᩻ܳ;

    iget-object v6, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    invoke-direct {v0, v6}, Ll/ۧ᩻ܳ;-><init>(Ljava/util/HashMap;)V

    iput-object v0, p0, Ll/ۗ᩻ܳ;->᩸:Ll/ۧ᩻ܳ;

    .line 1135
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v6, "connection"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1136
    iget-object v6, p0, Ll/ۗ᩻ܳ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v0, :cond_5

    const-string v6, "(?i).*close.*"

    .line 1137
    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    .line 1141
    :goto_3
    invoke-virtual {v4, p0}, Ll/֨᩻ܳ;->ۙ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object v9

    if-nez v9, :cond_7

    .line 1143
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->᩵()V

    .line 1144
    invoke-virtual {v4, p0}, Ll/֨᩻ܳ;->᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object v6

    move-object v9, v6

    :cond_7
    if-eqz v9, :cond_b

    .line 1150
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ۨ()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 1152
    invoke-virtual {v9}, Ll/ܿ᩻ܳ;->ۙ()V

    .line 1154
    :cond_8
    iget-object v6, p0, Ll/ۗ᩻ܳ;->ܳ:Ljava/util/HashMap;

    const-string v8, "accept-encoding"

    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 1155
    iget-object v8, p0, Ll/ۗ᩻ܳ;->᩸:Ll/ۧ᩻ܳ;

    invoke-virtual {v8, v9}, Ll/ۧ᩻ܳ;->ۙ(Ll/ܿ᩻ܳ;)V

    .line 1156
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ۗ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;)V

    .line 1157
    iget-object v8, p0, Ll/ۗ᩻ܳ;->ۚ:Ll/ۨ᩻ܳ;

    invoke-virtual {v9, v8}, Ll/ܿ᩻ܳ;->ۙ(Ll/ۨ᩻ܳ;)V

    .line 1158
    invoke-virtual {v9, v1}, Ll/ܿ᩻ܳ;->᩷(Z)V

    if-eqz v1, :cond_9

    .line 1159
    invoke-virtual {v4, v9}, Ll/֨᩻ܳ;->ۙ(Ll/ܿ᩻ܳ;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {v6}, Ll/ۗ᩻ܳ;->᩷(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v11, 0x1

    :cond_9
    invoke-virtual {v9, v11}, Ll/ܿ᩻ܳ;->ۤ(Z)V

    .line 1160
    invoke-virtual {v9, v0}, Ll/ܿ᩻ܳ;->᩸(Z)V

    .line 1161
    invoke-virtual {v9, v7}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;)V

    if-eqz v0, :cond_a

    .line 1163
    invoke-virtual {v9}, Ll/ܿ᩻ܳ;->ۤ()Z

    move-result v0
    :try_end_3
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljavax/net/ssl/SSLException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ll/֡᩻ܳ; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_a

    .line 1192
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ܶ()V

    .line 1193
    invoke-static {v9}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1194
    invoke-virtual {v5}, Ll/ܶ᩻ܳ;->ۙ()V

    return-void

    .line 1164
    :cond_a
    :try_start_4
    new-instance v0, Ljava/net/SocketException;

    invoke-direct {v0, v3}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1148
    :cond_b
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    const-string v3, "SERVER INTERNAL ERROR: Serve() returned a null response."

    invoke-direct {v0, v1, v3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    .line 1123
    :cond_c
    new-instance v1, Ll/֡᩻ܳ;

    sget-object v3, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "BAD REQUEST: Syntax error. HTTP verb "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " unhandled."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v1

    .line 1095
    :cond_d
    new-instance v0, Ll/֡᩻ܳ;

    sget-object v1, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v3, "BAD REQUEST: Header section too large."

    invoke-direct {v0, v1, v3}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw v0

    .line 1082
    :cond_e
    invoke-static {v6}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1083
    invoke-static {v7}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1084
    new-instance v0, Ljava/net/SocketException;

    invoke-direct {v0, v3}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1076
    :catch_0
    invoke-static {v6}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1077
    invoke-static {v7}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1078
    new-instance v0, Ljava/net/SocketException;

    invoke-direct {v0, v3}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    .line 1074
    throw v0
    :try_end_4
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljavax/net/ssl/SSLException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ll/֡᩻ܳ; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_2
    move-exception v0

    .line 1185
    :try_start_5
    invoke-virtual {v0}, Ll/֡᩻ܳ;->ۙ()Ll/᩶᩻ܳ;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 1186
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ۗ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;)V

    .line 1188
    invoke-virtual {v0}, Ll/ܿ᩻ܳ;->ۙ()V

    .line 1189
    invoke-virtual {v0, v7}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;)V

    .line 1190
    invoke-static {v7}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    goto :goto_4

    :catch_3
    move-exception v0

    .line 1180
    sget-object v1, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SERVER INTERNAL ERROR: IOException: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 1181
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ۗ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;)V

    .line 1182
    invoke-virtual {v0, v7}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;)V

    .line 1183
    invoke-static {v7}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    goto :goto_4

    :catch_4
    move-exception v0

    .line 1175
    sget-object v1, Ll/᩶᩻ܳ;->ۜ:Ll/᩶᩻ܳ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SSL PROTOCOL FAILURE: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 1176
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ۗ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩻ܳ;->᩷(Ljava/lang/String;)V

    .line 1177
    invoke-virtual {v0, v7}, Ll/ܿ᩻ܳ;->ۙ(Ljava/io/OutputStream;)V

    .line 1178
    invoke-static {v7}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1192
    :goto_4
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ܶ()V

    .line 1193
    invoke-static {v9}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1194
    invoke-virtual {v5}, Ll/ܶ᩻ܳ;->ۙ()V

    return-void

    :catch_5
    move-exception v0

    .line 1173
    :try_start_6
    throw v0

    :catch_6
    move-exception v0

    .line 1168
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1192
    :goto_5
    invoke-direct {p0}, Ll/ۗ᩻ܳ;->ܶ()V

    .line 1193
    invoke-static {v9}, Ll/֨᩻ܳ;->ۙ(Ljava/lang/Object;)V

    .line 1194
    invoke-virtual {v5}, Ll/ܶ᩻ܳ;->ۙ()V

    .line 1195
    throw v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 1314
    iget-object v0, p0, Ll/ۗ᩻ܳ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 1545
    iget-object v0, p0, Ll/ۗ᩻ܳ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
