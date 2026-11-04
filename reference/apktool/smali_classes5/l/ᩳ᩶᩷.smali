.class public final Ll/ᩳ᩶᩷;
.super Ljava/lang/Object;
.source "W9NV"


# static fields
.field public static final ۙ:[B

.field public static final ᩷:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 67
    fill-array-data v1, :array_0

    sput-object v1, Ll/ᩳ᩶᩷;->ۙ:[B

    new-array v0, v0, [B

    .line 68
    fill-array-data v0, :array_1

    sput-object v0, Ll/ᩳ᩶᩷;->᩷:[B

    return-void

    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data
.end method

.method public static ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 38
    sget-object v0, Ll/۠᩶᩷;->ۤ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    sget-object v2, Ll/۠᩶᩷;->᩸:[B

    const-string v3, "!"

    const-string v4, ":"

    if-eqz v1, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    move-object v1, v4

    goto :goto_1

    :cond_1
    move-object v1, v3

    .line 1082
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_3

    .line 1095
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 1096
    invoke-virtual {p2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1097
    :cond_2
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 1098
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v5, "classes.dex"

    .line 1083
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    return-object p0

    .line 1084
    :cond_4
    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, ".apk"

    .line 1087
    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    .line 0
    :cond_6
    invoke-static {p0}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 38
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    .line 40
    :cond_7
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_2
    move-object v3, v4

    .line 0
    :cond_8
    invoke-static {p0, v3, p2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1095
    :cond_9
    :goto_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 1096
    invoke-virtual {p2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1097
    :cond_a
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 1098
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_4
    return-object p2
.end method

.method public static ۙ(Ljava/io/ByteArrayOutputStream;ILl/ܶ᩶᩷;)V
    .locals 10

    .line 737
    iget v0, p2, Ll/ܶ᩶᩷;->֫:I

    and-int/lit8 v1, p1, -0x2

    .line 619
    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    mul-int v1, v1, v0

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    .line 621
    div-int/lit8 v1, v1, 0x8

    .line 740
    new-array v1, v1, [B

    .line 741
    iget-object p2, p2, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 742
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 743
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_0
    const/4 v7, 0x4

    if-gt v6, v7, :cond_0

    if-ne v6, v4, :cond_1

    goto :goto_1

    :cond_1
    and-int v7, v6, p1

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    and-int v7, v6, v2

    if-ne v7, v6, :cond_3

    mul-int v7, v5, v0

    add-int/2addr v7, v3

    .line 758
    div-int/lit8 v8, v7, 0x8

    .line 759
    aget-byte v9, v1, v8

    rem-int/lit8 v7, v7, 0x8

    shl-int v7, v4, v7

    or-int/2addr v7, v9

    int-to-byte v7, v7

    .line 760
    aput-byte v7, v1, v8

    :cond_3
    add-int/lit8 v5, v5, 0x1

    :goto_1
    shl-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 766
    :cond_4
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V
    .locals 8

    .line 679
    invoke-static {p0, p1}, Ll/ᩳ᩶᩷;->᩷(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V

    iget v0, p1, Ll/ܶ᩶᩷;->֫:I

    .line 725
    iget-object v1, p1, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget v5, v1, v3

    sub-int v4, v5, v4

    .line 727
    invoke-static {p0, v4}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    .line 615
    div-int/lit8 v1, v1, 0x8

    .line 778
    new-array v1, v1, [B

    .line 779
    iget-object p1, p1, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 780
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 781
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    .line 643
    div-int/lit8 v4, v3, 0x8

    .line 644
    aget-byte v6, v1, v4

    rem-int/lit8 v7, v3, 0x8

    shl-int v7, v5, v7

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 645
    aput-byte v6, v1, v4

    :cond_2
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_1

    add-int/2addr v3, v0

    .line 643
    div-int/lit8 v2, v3, 0x8

    .line 644
    aget-byte v4, v1, v2

    rem-int/lit8 v3, v3, 0x8

    shl-int v3, v5, v3

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 645
    aput-byte v3, v1, v2

    goto :goto_1

    .line 791
    :cond_3
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;Ljava/lang/String;)V
    .locals 4

    .line 45
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    array-length v1, v1

    .line 659
    invoke-static {p0, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 660
    iget v1, p1, Ll/ܶ᩶᩷;->᩷:I

    invoke-static {p0, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 661
    iget v1, p1, Ll/ܶ᩶᩷;->ܳ:I

    int-to-long v1, v1

    const/4 v3, 0x4

    .line 66
    invoke-static {p0, v1, v2, v3}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 662
    iget-wide v1, p1, Ll/ܶ᩶᩷;->᩸:J

    .line 66
    invoke-static {p0, v1, v2, v3}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 663
    iget p1, p1, Ll/ܶ᩶᩷;->֫:I

    int-to-long v1, p1

    .line 66
    invoke-static {p0, v1, v2, v3}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 70
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ۙ(Ljava/io/ByteArrayOutputStream;[B[Ll/ܶ᩶᩷;)Z
    .locals 13

    .line 99
    sget-object v0, Ll/۠᩶᩷;->۫:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_a

    .line 238
    new-instance p1, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 239
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 289
    :try_start_0
    array-length v6, p2

    invoke-static {v1, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v6, 0x0

    const/4 v7, 0x2

    .line 290
    :goto_0
    array-length v8, p2

    if-ge v6, v8, :cond_0

    .line 291
    aget-object v8, p2, v6

    .line 294
    iget-wide v9, v8, Ll/ܶ᩶᩷;->᩸:J

    .line 66
    invoke-static {v1, v9, v10, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 300
    iget-wide v9, v8, Ll/ܶ᩶᩷;->۫:J

    .line 66
    invoke-static {v1, v9, v10, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 303
    iget v9, v8, Ll/ܶ᩶᩷;->֫:I

    int-to-long v9, v9

    .line 66
    invoke-static {v1, v9, v10, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 305
    iget-object v9, v8, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v8, v8, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v9, v0, v8}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0xe

    .line 45
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    array-length v10, v10

    .line 312
    invoke-static {v1, v10}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/2addr v7, v10

    .line 70
    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 316
    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 317
    array-length v6, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    const-string v8, ", does not match actual size "

    const-string v9, "Expected size "

    if-ne v7, v6, :cond_9

    .line 323
    :try_start_1
    new-instance v6, Ll/ۜ᩶᩷;

    sget-object v7, Ll/ۗ᩶᩷;->۟:Ll/ۗ᩶᩷;

    invoke-direct {v6, v7, v0, v3}, Ll/ۜ᩶᩷;-><init>(Ll/ۗ᩶᩷;[BZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 329
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 240
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 337
    :goto_1
    :try_start_2
    array-length v6, p2

    if-ge v1, v6, :cond_2

    .line 338
    aget-object v6, p2, v1

    .line 341
    invoke-static {v0, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v3, v3, 0x4

    .line 344
    iget v7, v6, Ll/ܶ᩶᩷;->᩷:I

    invoke-static {v0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 346
    iget v7, v6, Ll/ܶ᩶᩷;->᩷:I

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v3, v7

    .line 725
    iget-object v6, v6, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v7, v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v10, v7, :cond_1

    aget v12, v6, v10

    sub-int v11, v12, v11

    .line 727
    invoke-static {v0, v11}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v10, v10, 0x1

    move v11, v12

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 349
    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 350
    array-length v6, v1

    if-ne v3, v6, :cond_8

    .line 356
    new-instance v3, Ll/ۜ᩶᩷;

    sget-object v6, Ll/ۗ᩶᩷;->֡:Ll/ۗ᩶᩷;

    invoke-direct {v3, v6, v1, v4}, Ll/ۜ᩶᩷;-><init>(Ll/ۗ᩶᩷;[BZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 362
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 241
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 370
    :goto_3
    :try_start_3
    array-length v4, p2

    if-ge v1, v4, :cond_4

    .line 371
    aget-object v4, p2, v1

    .line 429
    iget-object v6, v4, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 430
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    or-int/2addr v7, v10

    goto :goto_4

    .line 412
    :cond_3
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 413
    :try_start_4
    invoke-static {v6, v7, v4}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;ILl/ܶ᩶᩷;)V

    .line 414
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 415
    :try_start_5
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 421
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 422
    :try_start_6
    invoke-static {v6, v4}, Ll/ᩳ᩶᩷;->᩷(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V

    .line 423
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 424
    :try_start_7
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 380
    invoke-static {v0, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 382
    array-length v6, v10

    add-int/lit8 v6, v6, 0x2

    array-length v11, v4

    add-int/2addr v6, v11

    add-int/lit8 v3, v3, 0x6

    int-to-long v11, v6

    .line 66
    invoke-static {v0, v11, v12, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 387
    invoke-static {v0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 388
    invoke-virtual {v0, v10}, Ljava/io/OutputStream;->write([B)V

    .line 389
    invoke-virtual {v0, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    add-int/2addr v3, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :catchall_0
    move-exception p0

    .line 421
    :try_start_8
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p1

    :try_start_9
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_2
    move-exception p0

    .line 412
    :try_start_a
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception p1

    :try_start_b
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0

    .line 392
    :cond_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    .line 393
    array-length v1, p2

    if-ne v3, v1, :cond_7

    .line 399
    new-instance v1, Ll/ۜ᩶᩷;

    sget-object v3, Ll/ۗ᩶᩷;->ۢ:Ll/ۗ᩶᩷;

    const/4 v4, 0x1

    invoke-direct {v1, v3, p2, v4}, Ll/ۜ᩶᩷;-><init>(Ll/ۗ᩶᩷;[BZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 405
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 242
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    int-to-long v0, v2

    add-long/2addr v0, v0

    const-wide/16 v3, 0x4

    add-long/2addr v0, v3

    .line 249
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    mul-int/lit8 p2, p2, 0x10

    int-to-long v3, p2

    add-long/2addr v0, v3

    .line 250
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    int-to-long v3, p2

    .line 66
    invoke-static {p0, v3, v4, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    const/4 p2, 0x0

    .line 251
    :goto_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p2, v3, :cond_6

    .line 252
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩶᩷;

    .line 254
    iget-object v4, v3, Ll/ۜ᩶᩷;->ۤ:Ll/ۗ᩶᩷;

    iget-object v6, v3, Ll/ۜ᩶᩷;->ۙ:[B

    invoke-virtual {v4}, Ll/ۗ᩶᩷;->getValue()J

    move-result-wide v7

    .line 66
    invoke-static {p0, v7, v8, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {p0, v0, v1, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 258
    iget-boolean v3, v3, Ll/ۜ᩶᩷;->᩷:Z

    if-eqz v3, :cond_5

    .line 259
    array-length v3, v6

    int-to-long v3, v3

    .line 260
    invoke-static {v6}, Ll/᩹᩶᩷;->ۙ([B)[B

    move-result-object v6

    .line 261
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    array-length v7, v6

    int-to-long v7, v7

    .line 66
    invoke-static {p0, v7, v8, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    invoke-static {p0, v3, v4, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 266
    array-length v3, v6

    goto :goto_8

    .line 268
    :cond_5
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    array-length v3, v6

    int-to-long v3, v3

    .line 66
    invoke-static {p0, v3, v4, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    const-wide/16 v3, 0x0

    invoke-static {p0, v3, v4, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 273
    array-length v3, v6

    :goto_8
    int-to-long v3, v3

    add-long/2addr v0, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_7

    :cond_6
    const/4 p1, 0x0

    .line 277
    :goto_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_12

    .line 278
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    .line 394
    :cond_7
    :try_start_c
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 202
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception p0

    .line 369
    :try_start_d
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw p0

    .line 351
    :cond_8
    :try_start_e
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, v1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 202
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception p0

    .line 336
    :try_start_f
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_b

    :catchall_7
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw p0

    .line 318
    :cond_9
    :try_start_10
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 202
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 318
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :catchall_8
    move-exception p0

    .line 286
    :try_start_11
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    goto :goto_c

    :catchall_9
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw p0

    .line 104
    :cond_a
    sget-object v0, Ll/۠᩶᩷;->ܳ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 475
    invoke-static {p2, v0}, Ll/ᩳ᩶᩷;->ۙ([Ll/ܶ᩶᩷;[B)[B

    move-result-object p1

    .line 476
    array-length p2, p2

    int-to-long v0, p2

    const/4 p2, 0x1

    .line 58
    invoke-static {p0, v0, v1, p2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 169
    array-length v0, p1

    int-to-long v0, v0

    .line 66
    invoke-static {p0, v0, v1, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 170
    invoke-static {p1}, Ll/᩹᩶᩷;->ۙ([B)[B

    move-result-object p1

    .line 171
    array-length v0, p1

    int-to-long v0, v0

    .line 66
    invoke-static {p0, v0, v1, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 172
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return p2

    :cond_b
    const/4 v0, 0x1

    .line 109
    sget-object v1, Ll/۠᩶᩷;->᩸:[B

    invoke-static {p1, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 523
    array-length p1, p2

    int-to-long v3, p1

    .line 58
    invoke-static {p0, v3, v4, v0}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 524
    array-length p1, p2

    const/4 v0, 0x0

    :goto_d
    if-ge v0, p1, :cond_12

    aget-object v3, p2, v0

    .line 525
    iget-object v4, v3, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    .line 528
    iget-object v5, v3, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v6, v3, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v5, v1, v6}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 45
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    array-length v7, v7

    .line 529
    invoke-static {p0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 530
    iget-object v7, v3, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v7, v7

    invoke-static {p0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    int-to-long v7, v4

    .line 66
    invoke-static {p0, v7, v8, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 532
    iget-wide v7, v3, Ll/ܶ᩶᩷;->᩸:J

    .line 66
    invoke-static {p0, v7, v8, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 70
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write([B)V

    .line 535
    iget-object v4, v3, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 536
    invoke-static {p0, v5}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    const/4 v5, 0x0

    .line 538
    invoke-static {p0, v5}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_e

    .line 541
    :cond_c
    iget-object v3, v3, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v4, v3

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v4, :cond_d

    aget v6, v3, v5

    .line 542
    invoke-static {p0, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    .line 114
    :cond_e
    sget-object v0, Ll/۠᩶᩷;->ᩴ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 484
    invoke-static {p2, v0}, Ll/ᩳ᩶᩷;->ۙ([Ll/ܶ᩶᩷;[B)[B

    move-result-object p1

    .line 485
    array-length p2, p2

    int-to-long v0, p2

    const/4 p2, 0x1

    .line 58
    invoke-static {p0, v0, v1, p2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 169
    array-length v0, p1

    int-to-long v0, v0

    .line 66
    invoke-static {p0, v0, v1, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 170
    invoke-static {p1}, Ll/᩹᩶᩷;->ۙ([B)[B

    move-result-object p1

    .line 171
    array-length v0, p1

    int-to-long v0, v0

    .line 66
    invoke-static {p0, v0, v1, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 172
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return p2

    .line 119
    :cond_f
    sget-object v0, Ll/۠᩶᩷;->ۤ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 146
    array-length p1, p2

    invoke-static {p0, p1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 147
    array-length p1, p2

    const/4 v1, 0x0

    :goto_10
    if-ge v1, p1, :cond_12

    aget-object v3, p2, v1

    .line 148
    iget-object v4, v3, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v5, v3, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    iget-object v6, v3, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v4, v0, v6}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 45
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    array-length v7, v7

    .line 149
    invoke-static {p0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 150
    invoke-virtual {v5}, Ljava/util/TreeMap;->size()I

    move-result v7

    invoke-static {p0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 151
    iget-object v7, v3, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v7, v7

    invoke-static {p0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 152
    iget-wide v7, v3, Ll/ܶ᩶᩷;->᩸:J

    .line 66
    invoke-static {p0, v7, v8, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;JI)V

    .line 70
    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write([B)V

    .line 155
    invoke-virtual {v5}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 156
    invoke-static {p0, v5}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_11

    .line 159
    :cond_10
    iget-object v3, v3, Ll/ܶ᩶᩷;->ۤ:[I

    array-length v4, v3

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v4, :cond_11

    aget v6, v3, v5

    .line 160
    invoke-static {p0, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_12
    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ([Ll/ܶ᩶᩷;[B)[B
    .locals 8

    .line 564
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    .line 571
    iget-object v5, v4, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v6, v4, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v5, p1, v6}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 45
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    array-length v5, v5

    add-int/lit8 v5, v5, 0x10

    .line 573
    iget v6, v4, Ll/ܶ᩶᩷;->᩷:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v5

    iget v5, v4, Ll/ܶ᩶᩷;->ܳ:I

    add-int/2addr v6, v5

    iget v4, v4, Ll/ܶ᩶᩷;->֫:I

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x7

    and-int/lit8 v4, v4, -0x8

    .line 615
    div-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v6

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 579
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 585
    sget-object v2, Ll/۠᩶᩷;->ᩴ:[B

    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 587
    array-length v2, p0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v4, p0, v1

    .line 588
    iget-object v5, v4, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v6, v4, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v5, p1, v6}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 589
    invoke-static {v0, v4, v5}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;Ljava/lang/String;)V

    .line 590
    invoke-static {v0, v4}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 595
    :cond_1
    array-length v2, p0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v2, :cond_2

    aget-object v5, p0, v4

    .line 596
    iget-object v6, v5, Ll/ܶ᩶᩷;->ۙ:Ljava/lang/String;

    iget-object v7, v5, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-static {v6, p1, v7}, Ll/ᩳ᩶᩷;->ۙ(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 597
    invoke-static {v0, v5, v6}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 601
    :cond_2
    array-length p1, p0

    :goto_3
    if-ge v1, p1, :cond_3

    aget-object v2, p0, v1

    .line 602
    invoke-static {v0, v2}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 606
    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p0

    if-ne p0, v3, :cond_4

    .line 610
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    .line 607
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "The bytes saved do not match expectation. actual="

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " expected="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 202
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 607
    throw p1
.end method

.method public static ۙ(Ljava/io/ByteArrayInputStream;I)[I
    .locals 5

    .line 1238
    new-array v0, p1, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const/4 v3, 0x2

    .line 105
    invoke-static {p0, v3}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v4, v3

    add-int/2addr v2, v4

    .line 1243
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ljava/io/ByteArrayInputStream;I[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;
    .locals 7

    .line 1031
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [Ll/ܶ᩶᩷;

    return-object p0

    .line 1034
    :cond_0
    array-length v0, p2

    if-ne p1, v0, :cond_4

    .line 1038
    new-array v0, p1, [Ljava/lang/String;

    .line 1039
    new-array v2, p1, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    const/4 v4, 0x2

    .line 105
    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v6, v5

    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v5, v4

    .line 1042
    aput v5, v2, v3

    .line 113
    new-instance v4, Ljava/lang/String;

    invoke-static {p0, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v5

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1043
    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    .line 1048
    aget-object v3, p2, v1

    .line 1049
    iget-object v4, v3, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1052
    aget v4, v2, v1

    iput v4, v3, Ll/ܶ᩶᩷;->᩷:I

    .line 1054
    invoke-static {p0, v4}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v4

    iput-object v4, v3, Ll/ܶ᩶᩷;->ۤ:[I

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 202
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Order of dexfiles in metadata did not match baseline"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1050
    throw p0

    :cond_3
    return-object p2

    .line 202
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1035
    throw p0
.end method

.method public static ۙ(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Ll/ܶ᩶᩷;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 1130
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-array v0, v3, [Ll/ܶ᩶᩷;

    return-object v0

    .line 1134
    :cond_0
    new-array v2, v1, [Ll/ܶ᩶᩷;

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v1, :cond_1

    .line 105
    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v6, v5

    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v12, v4

    const/4 v4, 0x4

    .line 109
    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v7

    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v10

    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    .line 1142
    new-instance v17, Ll/ܶ᩶᩷;

    .line 113
    new-instance v9, Ljava/lang/String;

    invoke-static {v0, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v6

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v6, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    long-to-int v13, v7

    long-to-int v14, v4

    .line 1144
    new-array v15, v12, [I

    new-instance v16, Ljava/util/TreeMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/TreeMap;-><init>()V

    move-object/from16 v7, v17

    move-object/from16 v8, p1

    invoke-direct/range {v7 .. v16}, Ll/ܶ᩶᩷;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    aput-object v17, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_e

    .line 1158
    aget-object v5, v2, v3

    .line 1178
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v6

    iget v7, v5, Ll/ܶ᩶᩷;->ܳ:I

    iget v8, v5, Ll/ܶ᩶᩷;->֫:I

    iget-object v9, v5, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    sub-int/2addr v6, v7

    const/4 v7, 0x0

    .line 1182
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v10

    const/4 v11, 0x7

    if-le v10, v6, :cond_7

    .line 105
    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v12

    long-to-int v10, v12

    add-int/2addr v7, v10

    .line 1188
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v9, v10, v13}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v13

    long-to-int v10, v13

    :goto_2
    if-lez v10, :cond_2

    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    .line 101
    invoke-static {v0, v12}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v13

    long-to-int v14, v13

    const/4 v13, 0x6

    if-ne v14, v13, :cond_4

    :cond_3
    :goto_3
    move-object/from16 p1, v5

    goto :goto_6

    :cond_4
    if-ne v14, v11, :cond_5

    goto :goto_3

    :cond_5
    :goto_4
    if-lez v14, :cond_3

    invoke-static {v0, v12}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-object/from16 p1, v5

    invoke-static {v0, v12}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v5, v4

    :goto_5
    if-lez v5, :cond_6

    const/4 v4, 0x2

    .line 105
    invoke-static {v0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    add-int/lit8 v5, v5, -0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x2

    add-int/lit8 v14, v14, -0x1

    move-object/from16 v5, p1

    goto :goto_4

    :goto_6
    add-int/lit8 v10, v10, -0x1

    move-object/from16 v5, p1

    goto :goto_2

    :cond_7
    move-object/from16 p1, v5

    const/4 v5, 0x0

    .line 1201
    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v7

    if-ne v7, v6, :cond_d

    move-object/from16 v6, p1

    .line 1163
    iget v7, v6, Ll/ܶ᩶᩷;->᩷:I

    invoke-static {v0, v7}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v7

    iput-object v7, v6, Ll/ܶ᩶᩷;->ۤ:[I

    mul-int/lit8 v6, v8, 0x2

    add-int/2addr v6, v11

    and-int/lit8 v6, v6, -0x8

    .line 74
    div-int/lit8 v6, v6, 0x8

    .line 1254
    invoke-static {v0, v6}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v6

    .line 1255
    invoke-static {v6}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object v6

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v8, :cond_c

    .line 1268
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v10

    if-eqz v10, :cond_8

    const/4 v10, 0x2

    goto :goto_8

    :cond_8
    const/4 v10, 0x0

    :goto_8
    add-int v11, v7, v8

    .line 1271
    invoke-virtual {v6, v11}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-eqz v11, :cond_9

    or-int/lit8 v10, v10, 0x4

    :cond_9
    if-eqz v10, :cond_b

    .line 1259
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-nez v11, :cond_a

    .line 1260
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 1261
    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    or-int/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v12, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 202
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Read too much data during profile line parse"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1202
    throw v0

    :cond_e
    return-object v2
.end method

.method public static ۙ(Ljava/io/ByteArrayInputStream;[BI[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;
    .locals 9

    .line 963
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [Ll/ܶ᩶᩷;

    return-object p0

    .line 966
    :cond_0
    array-length v0, p3

    if-ne p2, v0, :cond_9

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_8

    const/4 v1, 0x2

    .line 105
    invoke-static {p0, v1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    invoke-static {p0, v1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v2

    long-to-int v3, v2

    .line 113
    new-instance v2, Ljava/lang/String;

    invoke-static {p0, v3}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v3

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/4 v3, 0x4

    .line 109
    invoke-static {p0, v3}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v3

    .line 105
    invoke-static {p0, v1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v5

    long-to-int v1, v5

    .line 1004
    array-length v5, p3

    const/4 v6, 0x0

    if-gtz v5, :cond_1

    goto :goto_3

    :cond_1
    const-string v5, "!"

    .line 1106
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-gez v5, :cond_2

    const-string v5, ":"

    .line 1108
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    :cond_2
    if-lez v5, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 1112
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v2

    :goto_1
    const/4 v7, 0x0

    .line 1010
    :goto_2
    array-length v8, p3

    if-ge v7, v8, :cond_5

    .line 1011
    aget-object v8, p3, v7

    iget-object v8, v8, Ll/ܶ᩶᩷;->ᩴ:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1012
    aget-object v6, p3, v7

    goto :goto_3

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-eqz v6, :cond_7

    .line 984
    iput-wide v3, v6, Ll/ܶ᩶᩷;->۫:J

    .line 988
    invoke-static {p0, v1}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;I)[I

    move-result-object v2

    .line 991
    sget-object v3, Ll/۠᩶᩷;->ۤ:[B

    invoke-static {p1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 992
    iput v1, v6, Ll/ܶ᩶᩷;->᩷:I

    .line 993
    iput-object v2, v6, Ll/ܶ᩶᩷;->ۤ:[I

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    const-string p0, "Missing profile key: "

    .line 981
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 202
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 981
    throw p1

    :cond_8
    return-object p3

    .line 202
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Mismatched number of dex files found in metadata"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 967
    throw p0
.end method

.method public static ۙ(Ljava/io/FileInputStream;[BLjava/lang/String;)[Ll/ܶ᩶᩷;
    .locals 5

    .line 836
    sget-object v0, Ll/۠᩶᩷;->ܳ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 101
    invoke-static {p0, p1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    const/4 v0, 0x4

    .line 109
    invoke-static {p0, v0}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v1

    invoke-static {p0, v0}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v3

    long-to-int v0, v3

    long-to-int v2, v1

    .line 845
    invoke-static {p0, v0, v2}, Ll/᩹᩶᩷;->ۙ(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    .line 850
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    .line 852
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 853
    :try_start_0
    invoke-static {p0, p2, p1}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Ll/ܶ᩶᩷;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 854
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 852
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 202
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Content found after the end of file"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 850
    throw p0

    .line 202
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unsupported version"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 837
    throw p0
.end method

.method public static ۙ(Ljava/io/FileInputStream;[B[B[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;
    .locals 6

    .line 864
    sget-object v0, Ll/۠᩶᩷;->ۙ:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const-string v2, "Unsupported meta version"

    const-string v3, "Content found after the end of file"

    const/4 v4, 0x4

    if-eqz v1, :cond_3

    .line 865
    sget-object v1, Ll/۠᩶᩷;->۫:[B

    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_2

    .line 895
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 101
    invoke-static {p0, p1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide p1

    long-to-int p2, p1

    .line 109
    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int p1, v4

    long-to-int v1, v0

    .line 904
    invoke-static {p0, p1, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/FileInputStream;II)[B

    move-result-object p1

    .line 909
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    .line 911
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 912
    :try_start_0
    invoke-static {p0, p2, p3}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;I[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 913
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 911
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 202
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 909
    throw p0

    .line 202
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 896
    throw p0

    .line 202
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 869
    throw p0

    .line 874
    :cond_3
    sget-object v0, Ll/۠᩶᩷;->᩷:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x2

    .line 105
    invoke-static {p0, p1}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v0

    long-to-int p1, v0

    .line 109
    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v0

    invoke-static {p0, v4}, Ll/᩹᩶᩷;->᩷(Ljava/io/InputStream;I)J

    move-result-wide v4

    long-to-int v2, v4

    long-to-int v1, v0

    .line 939
    invoke-static {p0, v2, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/FileInputStream;II)[B

    move-result-object v0

    .line 944
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_4

    .line 945
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 946
    :try_start_2
    invoke-static {p0, p2, p1, p3}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayInputStream;[BI[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 952
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_2
    move-exception p1

    .line 945
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 202
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 944
    throw p0

    .line 202
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 877
    throw p0
.end method

.method public static ᩷(Ljava/io/ByteArrayOutputStream;Ll/ܶ᩶᩷;)V
    .locals 4

    .line 697
    iget-object p1, p1, Ll/ܶ᩶᩷;->ۚ:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 698
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 699
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int v1, v3, v1

    .line 704
    invoke-static {p0, v1}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    .line 705
    invoke-static {p0, v0}, Ll/᩹᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;I)V

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method
