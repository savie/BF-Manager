.class public final Ll/ۛ᩹ܳ;
.super Ljava/lang/Object;
.source "D6GY"


# static fields
.field public static volatile ֫:Ljava/lang/ref/SoftReference;

.field public static final ۚ:Ljava/lang/Object;


# instance fields
.field public final ۙ:[I

.field public final ۤ:Ljava/util/HashMap;

.field public final ۫:[Ljava/lang/String;

.field public final ܳ:[I

.field public final ᩴ:I

.field public final ᩷:[B

.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۛ᩹ܳ;->ۚ:Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/lang/ref/SoftReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/ۛ᩹ܳ;->֫:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 10

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/ۛ᩹ܳ;->᩷:[B

    .line 63
    new-instance v0, Ll/ۨ᩹ܳ;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/ۨ᩹ܳ;-><init>(Ll/ۛ᩹ܳ;II)V

    .line 64
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const v3, 0x4d544353    # 2.2257387E8f

    if-ne v1, v3, :cond_f

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_f

    .line 67
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    iput v1, p0, Ll/ۛ᩹ܳ;->᩸:I

    .line 68
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->position()I

    move-result v4

    iput v4, p0, Ll/ۛ᩹ܳ;->ᩴ:I

    const/16 v5, 0x11

    if-lt v1, v5, :cond_e

    .line 69
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->ۤ()I

    move-result v0

    if-gt v1, v0, :cond_e

    .line 72
    new-instance v0, Ll/ۨ᩹ܳ;

    invoke-direct {v0, p0, v4, v1}, Ll/ۨ᩹ܳ;-><init>(Ll/ۛ᩹ܳ;II)V

    const/16 v1, 0x8

    new-array v1, v1, [B

    .line 74
    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 75
    new-instance v4, Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-direct {v4, v1, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v1, "jadx-cst"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 76
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    const/4 v4, 0x5

    if-ne v1, v4, :cond_d

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const/16 v4, 0x22

    if-ne v1, v4, :cond_d

    .line 79
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    if-lez v1, :cond_c

    .line 80
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->ۤ()I

    move-result v4

    div-int/lit8 v4, v4, 0x6

    if-gt v1, v4, :cond_c

    .line 83
    new-array v4, v1, [Ljava/lang/String;

    iput-object v4, p0, Ll/ۛ᩹ܳ;->۫:[Ljava/lang/String;

    .line 84
    new-array v4, v1, [I

    iput-object v4, p0, Ll/ۛ᩹ܳ;->ۙ:[I

    .line 85
    new-array v4, v1, [I

    iput-object v4, p0, Ll/ۛ᩹ܳ;->ܳ:[I

    .line 86
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v4, p0, Ll/ۛ᩹ܳ;->ۤ:Ljava/util/HashMap;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    .line 88
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 89
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v5

    if-lt v5, v3, :cond_1

    const/4 v6, 0x3

    if-gt v5, v6, :cond_1

    .line 93
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->ۙ()Ljava/lang/String;

    move-result-object v5

    .line 94
    iget-object v6, p0, Ll/ۛ᩹ܳ;->۫:[Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "L"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v8, 0x2e

    const/16 v9, 0x2f

    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3b

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v4

    .line 95
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Ll/ۛ᩹ܳ;->ۤ:Ljava/util/HashMap;

    iget-object v6, p0, Ll/ۛ᩹ܳ;->۫:[Ljava/lang/String;

    aget-object v6, v6, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 96
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid or duplicate class name"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 91
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid class source"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_4

    .line 100
    iget-object v4, p0, Ll/ۛ᩹ܳ;->ۙ:[I

    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->position()I

    move-result v5

    aput v5, v4, v3

    .line 101
    invoke-virtual {v0, v2}, Ll/ۨ᩹ܳ;->᩷(Z)Ljava/util/List;

    .line 102
    invoke-virtual {v0, v2, v2}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    .line 103
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_3

    .line 105
    invoke-virtual {v0, v2}, Ll/ۨ᩹ܳ;->ۙ(Z)Ll/᩵᩹ܳ;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->ۤ()I

    move-result v0

    if-nez v0, :cond_b

    .line 111
    new-instance v0, Ll/ۨ᩹ܳ;

    iget v2, p0, Ll/ۛ᩹ܳ;->ᩴ:I

    iget v3, p0, Ll/ۛ᩹ܳ;->᩸:I

    add-int v4, v2, v3

    array-length p1, p1

    sub-int/2addr p1, v2

    sub-int/2addr p1, v3

    invoke-direct {v0, p0, v4, p1}, Ll/ۨ᩹ܳ;-><init>(Ll/ۛ᩹ܳ;II)V

    const/4 p1, 0x0

    :goto_3
    if-ge p1, v1, :cond_9

    .line 113
    iget-object v2, p0, Ll/ۛ᩹ܳ;->ܳ:[I

    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->position()I

    move-result v3

    aput v3, v2, p1

    const/4 v2, 0x0

    :goto_4
    const/4 v3, 0x2

    if-ge v2, v3, :cond_8

    .line 115
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v3, :cond_7

    .line 117
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->᩷()Ljava/lang/String;

    move-result-object v5

    .line 118
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v6

    if-nez v2, :cond_5

    const/16 v6, 0x3a

    .line 119
    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-lez v5, :cond_6

    goto :goto_6

    :cond_5
    const/16 v7, 0x28

    .line 120
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-lez v5, :cond_6

    and-int/lit8 v5, v6, 0x42

    const/16 v6, 0x40

    if-ne v5, v6, :cond_6

    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 121
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid supplemental member"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 126
    :cond_9
    invoke-virtual {v0}, Ll/ۨ᩹ܳ;->ۤ()I

    move-result p1

    if-nez p1, :cond_a

    return-void

    .line 127
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Trailing shared class set data"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 109
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Trailing embedded class set data"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 81
    :cond_c
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid class count"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 77
    :cond_d
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Expected JADX v5 API 34 class set"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_e
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid embedded class set length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported shared class set format"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ۙ(Ll/ۛ᩹ܳ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩹ܳ;->᩷:[B

    return-object p0
.end method

.method public static ᩷()Ll/ۛ᩹ܳ;
    .locals 5

    .line 39
    sget-object v0, Ll/ۛ᩹ܳ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩹ܳ;

    if-eqz v0, :cond_0

    return-object v0

    .line 43
    :cond_0
    sget-object v0, Ll/ۛ᩹ܳ;->ۚ:Ljava/lang/Object;

    monitor-enter v0

    .line 44
    :try_start_0
    sget-object v1, Ll/ۛ᩹ܳ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩹ܳ;

    if-nez v1, :cond_2

    .line 47
    const-class v1, Ll/ۛ᩹ܳ;

    const-string v2, "/assets/a"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_1

    .line 52
    :try_start_1
    new-instance v2, Ll/ۛ᩹ܳ;

    invoke-static {v1}, Ll/᩺᩻ܺ;->ۙ(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v3

    const/4 v4, 0x0

    .line 51
    invoke-static {v3, v4}, Ll/᩵֫ܺ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v3

    .line 52
    invoke-direct {v2, v3}, Ll/ۛ᩹ܳ;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 54
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Ll/ۛ᩹ܳ;->֫:Ljava/lang/ref/SoftReference;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v1, v2

    goto :goto_1

    :catchall_0
    move-exception v2

    .line 51
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    .line 49
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Class set asset not found: /assets/a"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 56
    :cond_2
    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_2
    move-exception v1

    .line 57
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1
.end method

.method public static bridge synthetic ᩷(Ll/ۛ᩹ܳ;)[Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩹ܳ;->۫:[Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ۙ()Ljava/io/ByteArrayInputStream;
    .locals 4

    .line 133
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget v1, p0, Ll/ۛ᩹ܳ;->ᩴ:I

    iget v2, p0, Ll/ۛ᩹ܳ;->᩸:I

    iget-object v3, p0, Ll/ۛ᩹ܳ;->᩷:[B

    invoke-direct {v0, v3, v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ۗ᩹ܳ;
    .locals 13

    .line 146
    iget-object v0, p0, Ll/ۛ᩹ܳ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 150
    :cond_0
    new-instance v1, Ll/ۨ᩹ܳ;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Ll/ۛ᩹ܳ;->ۙ:[I

    aget v2, v3, v2

    iget v4, p0, Ll/ۛ᩹ܳ;->ᩴ:I

    iget v5, p0, Ll/ۛ᩹ܳ;->᩸:I

    add-int/2addr v4, v5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget v3, v3, v5

    sub-int/2addr v4, v3

    invoke-direct {v1, p0, v2, v4}, Ll/ۨ᩹ܳ;-><init>(Ll/ۛ᩹ܳ;II)V

    const/4 v2, 0x1

    .line 151
    invoke-virtual {v1, v2}, Ll/ۨ᩹ܳ;->᩷(Z)Ljava/util/List;

    move-result-object v5

    const/4 v3, 0x0

    .line 152
    invoke-virtual {v1, v3, v3}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    .line 153
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 154
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 155
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    const-string v7, "<clinit>("

    const-string v10, "<init>("

    if-ge v6, v4, :cond_3

    .line 157
    invoke-virtual {v1, v2}, Ll/ۨ᩹ܳ;->ۙ(Z)Ll/᩵᩹ܳ;

    move-result-object v11

    .line 158
    iget-object v12, v11, Ll/᩵᩹ܳ;->᩷:Ljava/lang/String;

    iget v11, v11, Ll/᩵᩹ܳ;->ۙ:I

    and-int/lit8 v11, v11, 0xa

    if-nez v11, :cond_2

    .line 177
    invoke-virtual {v12, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v12, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    move-object v7, v9

    goto :goto_2

    :cond_2
    :goto_1
    move-object v7, v8

    .line 178
    :goto_2
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 160
    :cond_3
    new-instance v1, Ll/ۨ᩹ܳ;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Ll/ۛ᩹ܳ;->ܳ:[I

    aget v2, v4, v2

    iget-object v6, p0, Ll/ۛ᩹ܳ;->᩷:[B

    array-length v6, v6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget v0, v4, v0

    sub-int/2addr v6, v0

    invoke-direct {v1, p0, v2, v6}, Ll/ۨ᩹ܳ;-><init>(Ll/ۛ᩹ܳ;II)V

    .line 161
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_5

    .line 165
    invoke-virtual {v1}, Ll/ۨ᩹ܳ;->᩷()Ljava/lang/String;

    move-result-object v11

    .line 166
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v12

    and-int/lit8 v12, v12, 0x8

    if-eqz v12, :cond_4

    move-object v12, v6

    goto :goto_4

    :cond_4
    move-object v12, v0

    .line 167
    :goto_4
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 169
    :cond_5
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    :goto_5
    if-ge v3, v2, :cond_8

    .line 171
    invoke-virtual {v1}, Ll/ۨ᩹ܳ;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v11

    and-int/lit8 v11, v11, 0xa

    if-nez v11, :cond_7

    .line 177
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_7

    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_6

    :cond_6
    move-object v11, v9

    goto :goto_7

    :cond_7
    :goto_6
    move-object v11, v8

    .line 178
    :goto_7
    invoke-interface {v11, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 173
    :cond_8
    new-instance v1, Ll/ۗ᩹ܳ;

    move-object v3, v1

    move-object v4, p1

    move-object v7, v0

    invoke-direct/range {v3 .. v9}, Ll/ۗ᩹ܳ;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v1
.end method
