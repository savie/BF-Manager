.class public final Ll/ۨ᩹ܳ;
.super Ljava/io/DataInputStream;
.source "D6GY"

# interfaces
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ljava/io/ByteArrayInputStream;

.field public final synthetic ܿ:Ll/ۛ᩹ܳ;

.field public final ᩶:I


# direct methods
.method public constructor <init>(Ll/ۛ᩹ܳ;II)V
    .locals 2

    .line 241
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-static {p1}, Ll/ۛ᩹ܳ;->ۙ(Ll/ۛ᩹ܳ;)[B

    move-result-object v1

    invoke-direct {v0, v1, p2, p3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    add-int/2addr p2, p3

    .line 244
    iput-object p1, p0, Ll/ۨ᩹ܳ;->ܿ:Ll/ۛ᩹ܳ;

    .line 245
    invoke-direct {p0, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 246
    iput-object v0, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    .line 247
    iput p2, p0, Ll/ۨ᩹ܳ;->᩶:I

    return-void
.end method

.method private ۙ(IIZ)Ljava/util/List;
    .locals 3

    .line 251
    iget-object v0, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-gt p1, v0, :cond_3

    if-eqz p3, :cond_0

    .line 292
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_2

    .line 294
    invoke-direct {p0, p2, p3}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    move-result-object v2

    if-eqz p3, :cond_1

    .line 295
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    .line 290
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid type count"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩷(IZ)Ljava/lang/String;
    .locals 6

    const/16 v0, 0x40

    if-gt p1, v0, :cond_7

    .line 317
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    .line 350
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid type kind"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 345
    :pswitch_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result p1

    int-to-char p1, p1

    const-string v0, "VZBSCIJFD"

    .line 346
    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    if-eqz p2, :cond_6

    .line 347
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 346
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid primitive type"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    add-int/2addr p1, v2

    .line 341
    invoke-direct {p0, p1, p2}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_6

    const-string p2, "["

    .line 0
    invoke-static {p2, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    add-int/2addr p1, v2

    .line 338
    invoke-direct {p0, p1, v1}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    .line 339
    invoke-direct {p0, p1, p2}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 333
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩹ܳ;->ۙ()Ljava/lang/String;

    add-int/2addr p1, v2

    .line 334
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    move-result-object p1

    if-nez p2, :cond_1

    goto :goto_1

    .line 335
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 327
    :pswitch_4
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    if-ltz v3, :cond_4

    .line 328
    iget-object v4, p0, Ll/ۨ᩹ܳ;->ܿ:Ll/ۛ᩹ܳ;

    invoke-static {v4}, Ll/ۛ᩹ܳ;->᩷(Ll/ۛ᩹ܳ;)[Ljava/lang/String;

    move-result-object v5

    array-length v5, v5

    if-ge v3, v5, :cond_4

    if-ne v0, v2, :cond_3

    add-int/2addr p1, v2

    .line 329
    invoke-virtual {p0, p1, v1}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    :cond_3
    if-eqz p2, :cond_6

    .line 330
    invoke-static {v4}, Ll/ۛ᩹ܳ;->᩷(Ll/ۛ᩹ܳ;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v3

    return-object p1

    .line 328
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid type index"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 322
    :pswitch_5
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    if-nez v0, :cond_5

    if-eqz p2, :cond_6

    :goto_0
    const-string p1, "Ljava/lang/Object;"

    return-object p1

    :cond_5
    add-int/2addr p1, v2

    .line 323
    invoke-direct {p0, p1, p2}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_1
    :pswitch_6
    const/4 p1, 0x0

    return-object p1

    .line 316
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Excessive type nesting"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final position()I
    .locals 2

    .line 250
    iget-object v0, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    iget v1, p0, Ll/ۨ᩹ܳ;->᩶:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 3

    .line 254
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 251
    iget-object v2, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    if-gt v0, v2, :cond_0

    .line 265
    new-array v0, v0, [B

    .line 266
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 267
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v2

    .line 263
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated class set string"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(IZ)Ljava/util/List;
    .locals 1

    .line 285
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    invoke-direct {p0, v0, p1, p2}, Ll/ۨ᩹ܳ;->ۙ(IIZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Z)Ll/᩵᩹ܳ;
    .locals 5

    .line 301
    invoke-virtual {p0}, Ll/ۨ᩹ܳ;->ۙ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 302
    invoke-virtual {p0, v1, p1}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    move-result-object v2

    .line 303
    invoke-direct {p0, v1, p1}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    move-result-object v3

    .line 304
    invoke-virtual {p0, v1, v1}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    .line 305
    invoke-direct {p0, v1, v1}, Ll/ۨ᩹ܳ;->᩷(IZ)Ljava/lang/String;

    .line 306
    invoke-virtual {p0, v1, v1}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    .line 307
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 308
    invoke-virtual {p0, v1, v1}, Ll/ۨ᩹ܳ;->ۙ(IZ)Ljava/util/List;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 310
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x28

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 312
    :cond_1
    new-instance v0, Ll/᩵᩹ܳ;

    const/16 v1, 0x29

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v4}, Ll/᩵᩹ܳ;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public final ۤ()I
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 3

    .line 258
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 251
    iget-object v2, p0, Ll/ۨ᩹ܳ;->ܰ:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    if-gt v0, v2, :cond_0

    .line 265
    new-array v0, v0, [B

    .line 266
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 267
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v2

    .line 263
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated class set string"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷(Z)Ljava/util/List;
    .locals 2

    .line 271
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    if-eqz p1, :cond_1

    const-string p1, "Ljava/lang/Object;"

    .line 276
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_2
    if-ltz v0, :cond_3

    const/4 v1, 0x0

    .line 281
    invoke-direct {p0, v0, v1, p1}, Ll/ۨ᩹ܳ;->ۙ(IIZ)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 279
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid parent count"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 273
    :cond_4
    :goto_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method
