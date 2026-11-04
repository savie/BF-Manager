.class public final Ll/ۗܺ֫;
.super Ljava/lang/Object;
.source "F6JI"


# direct methods
.method public static ۙ(D)Ljava/lang/String;
    .locals 1

    .line 216
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p0

    const/4 p1, 0x3

    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {p0, p1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p0

    .line 0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->signum()I

    move-result p1

    if-nez p1, :cond_0

    new-instance p0, Ljava/math/BigDecimal;

    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object p0

    .line 216
    :goto_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 174
    invoke-virtual {p0, p1}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 177
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    const/16 p1, 0x200

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/۠ᩴۙ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 221
    invoke-static {p0, p1}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 222
    invoke-static {p0, p2}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_a

    .line 223
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v0, 0x13

    if-eq p2, v0, :cond_0

    goto/16 :goto_4

    .line 224
    :cond_0
    new-instance p2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy:MM:dd HH:mm:ss"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {p2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v0, "UTC"

    .line 225
    invoke-static {v0}, Ll/ۤۚۗ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v0, 0x0

    .line 226
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 227
    new-instance v1, Ljava/text/ParsePosition;

    invoke-direct {v1, v0}, Ljava/text/ParsePosition;-><init>(I)V

    .line 228
    invoke-virtual {p2, p1, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {v1}, Ljava/text/ParsePosition;->getIndex()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq p2, v1, :cond_1

    goto/16 :goto_4

    .line 229
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x5

    const/4 v4, 0x7

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    .line 0
    invoke-static {v3, p1, p2}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    if-eqz p0, :cond_9

    .line 230
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v3, 0x6

    if-ne p2, v3, :cond_9

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v4, 0x2b

    if-eq p2, v4, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-ne p2, v2, :cond_9

    :cond_2
    const/4 p2, 0x3

    .line 231
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x3a

    if-ne v0, v2, :cond_9

    const/4 v0, 0x1

    const/4 v2, 0x1

    :goto_0
    const/16 v4, 0x39

    const/16 v5, 0x30

    if-ge v2, p2, :cond_5

    .line 238
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_4

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-le v5, v4, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-object p1

    :cond_5
    const/4 v2, 0x4

    :goto_2
    if-ge v2, v3, :cond_8

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_7

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-le v6, v4, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    return-object p1

    .line 232
    :cond_8
    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x17

    if-gt p2, v0, :cond_9

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x3b

    if-gt p2, v0, :cond_9

    const-string p2, " "

    .line 0
    invoke-static {p1, p2, p0}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    return-object p1

    :cond_a
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/۟ۧ֫;)Ll/᩹ܺ֫;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 82
    invoke-static/range {p2 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 83
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->ۗ()Ll/ܳۧ֫;

    move-result-object v2

    if-eqz v0, :cond_1

    .line 84
    iget-object v3, v0, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    invoke-virtual {v3, v2}, Ll/ܳۧ֫;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    new-instance v0, Ll/ᩴۧ֫;

    const-string v1, "Image changed before reading details"

    .line 175
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    throw v0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    .line 86
    :cond_2
    iget-object v3, v0, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    :goto_1
    const/4 v4, 0x0

    if-nez v0, :cond_3

    const/4 v5, 0x0

    goto :goto_2

    .line 87
    :cond_3
    iget v5, v0, Ll/ۡ֫֫;->֫:I

    :goto_2
    if-nez v0, :cond_4

    const/4 v6, 0x0

    goto :goto_3

    :cond_4
    iget v6, v0, Ll/ۡ֫֫;->ۤ:I

    :goto_3
    const/4 v7, 0x1

    if-nez v0, :cond_5

    const/4 v8, 0x1

    goto :goto_4

    .line 88
    :cond_5
    iget v8, v0, Ll/ۡ֫֫;->ᩴ:I

    .line 89
    :goto_4
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const v11, 0x7f120436

    if-eqz v0, :cond_7

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    goto :goto_8

    .line 95
    :cond_7
    :goto_5
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object v12
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v12}, Ll/ᩳ۠ۚ;->ۙ(Ljava/io/InputStream;)Ll/۟۠ۚ;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v14, v13, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    if-eqz v12, :cond_8

    :try_start_2
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V

    .line 96
    :cond_8
    iget-object v3, v13, Ll/۟۠ۚ;->ۤ:Ljava/lang/String;

    .line 97
    sget-object v12, Ll/֡۠ۚ;->۟:Ll/֡۠ۚ;

    if-ne v14, v12, :cond_9

    const-string v3, "image/svg+xml"
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_6

    :cond_9
    if-nez v0, :cond_a

    .line 100
    :try_start_3
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    invoke-static {v1, v0}, Ll/۬֫֫;->᩷(Ll/۫ۧ֫;Ll/ۜ֫֫;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    .line 101
    iget v12, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget v12, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-nez v3, :cond_a

    .line 102
    iget-object v3, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_6

    :catch_0
    const/4 v0, 0x1

    goto :goto_7

    :cond_a
    :goto_6
    const/4 v0, 0x0

    :goto_7
    if-nez v3, :cond_b

    .line 108
    :try_start_4
    sget-object v12, Ll/֡۠ۚ;->֡:Ll/֡۠ۚ;

    if-ne v14, v12, :cond_b

    const-string v3, "image/gif"

    :cond_b
    :goto_8
    const-string v12, "image/jpeg"

    .line 110
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    const-string v12, "image/png"

    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    const-string v12, "image/webp"

    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    if-eqz v12, :cond_c

    goto :goto_9

    :cond_c
    const v4, 0x7f12043a

    move-object/from16 v13, p2

    goto :goto_a

    :catch_1
    move-object/from16 v13, p2

    goto :goto_c

    :cond_d
    :goto_9
    move-object/from16 v13, p2

    .line 113
    :try_start_5
    invoke-static {v1, v3, v13}, Ll/ۨܺ֫;->ۙ(Ll/۫ۧ֫;Ljava/lang/String;Ll/۟ۧ֫;)[B

    move-result-object v12

    if-eqz v12, :cond_e

    .line 115
    new-instance v14, Ll/۠ᩴۙ;

    new-instance v15, Ljava/io/ByteArrayInputStream;

    invoke-static {v12}, Ll/ۨܺ֫;->ۙ([B)[B

    move-result-object v12

    invoke-direct {v15, v12}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v14, v15, v7}, Ll/۠ᩴۙ;-><init>(Ljava/io/InputStream;I)V

    .line 117
    invoke-static {v14, v9}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/util/ArrayList;)V

    .line 118
    invoke-static {v14, v10}, Ll/ۗܺ֫;->᩷(Ll/۠ᩴۙ;Ljava/util/ArrayList;)V

    const-string v12, "Orientation"

    .line 119
    invoke-virtual {v14, v8, v12}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v8

    .line 120
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v7
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    add-int/2addr v12, v7

    if-lez v12, :cond_e

    goto :goto_a

    :catch_2
    nop

    goto :goto_c

    :cond_e
    const v4, 0x7f120436

    :goto_a
    move v7, v0

    move v11, v4

    goto :goto_c

    :catchall_0
    move-exception v0

    move-object/from16 v13, p2

    move-object v4, v0

    if-eqz v12, :cond_f

    .line 95
    :try_start_6
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v12, v0

    :try_start_7
    invoke-virtual {v4, v12}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    :goto_b
    throw v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 126
    :goto_c
    invoke-static/range {p2 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 127
    invoke-virtual {v1, v2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    const/4 v0, 0x5

    if-lt v8, v0, :cond_10

    const/16 v0, 0x8

    if-gt v8, v0, :cond_10

    move v4, v5

    move v5, v6

    goto :goto_d

    :cond_10
    move v4, v6

    .line 129
    :goto_d
    new-instance v8, Ll/᩹ܺ֫;

    if-eqz v7, :cond_11

    const v0, 0x7f120428

    const v7, 0x7f120428

    goto :goto_e

    :cond_11
    move v7, v11

    :goto_e
    move-object v0, v8

    move-object v1, v2

    move-object v2, v3

    move v3, v5

    move-object v5, v9

    move-object v6, v10

    invoke-direct/range {v0 .. v7}, Ll/᩹ܺ֫;-><init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/ArrayList;Ljava/util/ArrayList;I)V

    return-object v8
.end method

.method public static ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 243
    new-instance v0, Ll/ܶܺ֫;

    invoke-direct {v0, p0, p1}, Ll/ܶܺ֫;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/۠ᩴۙ;Ljava/util/ArrayList;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "Make"

    .line 133
    invoke-static {v0, v2}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Model"

    invoke-static {v0, v3}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "DateTimeOriginal"

    const-string v5, "OffsetTimeOriginal"

    .line 134
    invoke-static {v0, v4, v5}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    if-nez v2, :cond_0

    if-eqz v3, :cond_1

    :cond_0
    const v5, 0x7f120438

    goto :goto_0

    :cond_1
    const v5, 0x7f12042d

    :goto_0
    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "DateTimeDigitized"

    const-string v6, "OffsetTimeDigitized"

    .line 139
    invoke-static {v0, v4, v6}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 140
    :goto_1
    invoke-static {v5, v4, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    const v4, 0x7f120433

    .line 141
    invoke-static {v4, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    const v2, 0x7f120435

    .line 142
    invoke-static {v2, v3, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    const-string v2, "LensModel"

    .line 143
    invoke-static {v0, v2}, Ll/ۗܺ֫;->ۙ(Ll/۠ᩴۙ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f120430

    invoke-static {v3, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    const-string v2, "FocalLength"

    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    .line 181
    invoke-virtual {v0, v2, v3, v4}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;D)D

    move-result-wide v5

    .line 182
    invoke-static {v5, v6}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move-wide v5, v3

    :goto_2
    const-wide/16 v7, 0x0

    cmpl-double v2, v5, v7

    if-lez v2, :cond_4

    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v6}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v5

    const-string v6, " mm"

    .line 0
    invoke-static {v2, v5, v6}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v5, 0x7f12042c

    .line 145
    invoke-static {v5, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_4
    const-string v2, "FNumber"

    .line 181
    invoke-virtual {v0, v2, v3, v4}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;D)D

    move-result-wide v5

    .line 182
    invoke-static {v5, v6}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    move-wide v5, v3

    :goto_3
    cmpl-double v2, v5, v7

    if-lez v2, :cond_6

    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "f/"

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v6}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v5, 0x7f12041f

    invoke-static {v5, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_6
    const-string v2, "ExposureTime"

    .line 181
    invoke-virtual {v0, v2, v3, v4}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;D)D

    move-result-wide v5

    .line 182
    invoke-static {v5, v6}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move-wide v5, v3

    :goto_4
    cmpl-double v2, v5, v7

    if-lez v2, :cond_9

    const-string v2, " s"

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpg-double v11, v5, v9

    if-gez v11, :cond_8

    .line 150
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "1/"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    div-double/2addr v9, v5

    invoke-static {v9, v10}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v5

    .line 0
    invoke-static {v11, v5, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    .line 150
    :cond_8
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v6}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v5

    .line 0
    invoke-static {v9, v5, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_5
    const v5, 0x7f120427

    .line 149
    invoke-static {v5, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_9
    const-string v2, "PhotographicSensitivity"

    const/4 v5, -0x1

    .line 189
    invoke-virtual {v0, v5, v2}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v2

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x1

    if-lez v2, :cond_a

    const v12, 0xffff

    if-ge v2, v12, :cond_a

    int-to-long v12, v2

    goto :goto_8

    :cond_a
    const-string v2, "SensitivityType"

    .line 191
    invoke-virtual {v0, v6, v2}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v2

    const/4 v12, 0x3

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x7

    if-eq v2, v12, :cond_c

    if-eq v2, v14, :cond_c

    if-eq v2, v13, :cond_c

    if-ne v2, v15, :cond_b

    goto :goto_6

    :cond_b
    const-wide/16 v16, -0x1

    goto :goto_7

    :cond_c
    :goto_6
    const-string v12, "ISOSpeed"

    .line 195
    invoke-static {v0, v12}, Ll/ۗܺ֫;->᩷(Ll/۠ᩴۙ;Ljava/lang/String;)J

    move-result-wide v16

    :goto_7
    const/4 v12, 0x4

    cmp-long v18, v16, v9

    if-gtz v18, :cond_e

    const/4 v6, 0x2

    if-eq v2, v6, :cond_d

    if-eq v2, v12, :cond_d

    if-eq v2, v13, :cond_d

    if-ne v2, v15, :cond_e

    :cond_d
    const-string v6, "RecommendedExposureIndex"

    .line 198
    invoke-static {v0, v6}, Ll/ۗܺ֫;->᩷(Ll/۠ᩴۙ;Ljava/lang/String;)J

    move-result-wide v16

    :cond_e
    cmp-long v6, v16, v9

    if-gtz v6, :cond_10

    if-eq v2, v11, :cond_f

    if-eq v2, v12, :cond_f

    if-eq v2, v14, :cond_f

    if-ne v2, v15, :cond_10

    :cond_f
    const-string v2, "StandardOutputSensitivity"

    .line 201
    invoke-static {v0, v2}, Ll/ۗܺ֫;->᩷(Ll/۠ᩴۙ;Ljava/lang/String;)J

    move-result-wide v12

    goto :goto_8

    :cond_10
    move-wide/from16 v12, v16

    :goto_8
    cmp-long v2, v12, v9

    if-lez v2, :cond_11

    const v2, 0x7f12042e

    .line 152
    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_11
    const-string v2, "ExposureBiasValue"

    .line 181
    invoke-virtual {v0, v2, v3, v4}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;D)D

    move-result-wide v9

    .line 182
    invoke-static {v9, v10}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v2

    if-eqz v2, :cond_12

    move-wide v3, v9

    .line 154
    :cond_12
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_14

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    cmpl-double v6, v3, v7

    if-lez v6, :cond_13

    const-string v6, "+"

    goto :goto_9

    :cond_13
    const-string v6, ""

    :goto_9
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v3

    const-string v4, " EV"

    .line 0
    invoke-static {v2, v3, v4}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f120421

    .line 154
    invoke-static {v3, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_14
    const-string v2, "Flash"

    .line 155
    invoke-virtual {v0, v5, v2}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_16

    and-int/2addr v2, v11

    if-eqz v2, :cond_15

    const-string v2, "1"

    goto :goto_a

    :cond_15
    const-string v2, "0"

    :goto_a
    const v3, 0x7f120429

    .line 156
    invoke-static {v3, v2, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_16
    const-string v2, "Orientation"

    const/4 v3, 0x0

    .line 157
    invoke-virtual {v0, v3, v2}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v0

    if-lt v0, v11, :cond_17

    const/16 v2, 0x8

    if-gt v0, v2, :cond_17

    const v2, 0x7f120437

    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_17
    return-void
.end method

.method public static ᩷(Ll/۠ᩴۙ;Ljava/lang/String;)J
    .locals 5

    .line 207
    invoke-virtual {p0, p1}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v0, -0x1

    if-nez p0, :cond_0

    goto :goto_0

    .line 210
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v2, 0x0

    cmp-long v4, p0, v2

    if-lez v4, :cond_1

    const-wide v2, 0xffffffffL

    cmp-long v4, p0, v2

    if-gtz v4, :cond_1

    return-wide p0

    :catch_0
    :cond_1
    :goto_0
    return-wide v0
.end method

.method public static ᩷(Ll/۠ᩴۙ;Ljava/util/ArrayList;)V
    .locals 8

    .line 163
    invoke-virtual {p0}, Ll/۠ᩴۙ;->ᩴ()[D

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    .line 164
    aget-wide v3, v0, v2

    invoke-static {v3, v4}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v3

    if-eqz v3, :cond_0

    aget-wide v3, v0, v1

    invoke-static {v3, v4}, Ll/ۗܺ֫;->᩷(D)Z

    move-result v3

    if-eqz v3, :cond_0

    aget-wide v3, v0, v2

    .line 165
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    const-wide v5, 0x4056800000000000L    # 90.0

    cmpg-double v7, v3, v5

    if-gtz v7, :cond_0

    aget-wide v3, v0, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    const-wide v5, 0x4066800000000000L    # 180.0

    cmpg-double v7, v3, v5

    if-gtz v7, :cond_0

    .line 166
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    aget-wide v4, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v4, v5, v2

    const-string v4, "%.6f\u00b0"

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f12042f

    invoke-static {v6, v5, p1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 167
    aget-wide v5, v0, v1

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v0, v5, v2

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f120432

    invoke-static {v2, v0, p1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_0
    const-string v0, "GPSAltitude"

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 5298
    invoke-virtual {p0, v0, v2, v3}, Ll/۠ᩴۙ;->ۙ(Ljava/lang/String;D)D

    move-result-wide v2

    const/4 v0, -0x1

    const-string v4, "GPSAltitudeRef"

    .line 5299
    invoke-virtual {p0, v0, v4}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result p0

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_2

    if-ltz p0, :cond_2

    if-ne p0, v1, :cond_1

    const/4 v1, -0x1

    :cond_1
    int-to-double v0, v1

    mul-double v2, v2, v0

    goto :goto_0

    :cond_2
    const-wide/high16 v2, 0x7ff8000000000000L    # Double.NaN

    .line 170
    :goto_0
    invoke-static {v2, v3}, Ll/ۗܺ֫;->᩷(D)Z

    move-result p0

    if-eqz p0, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v3}, Ll/ۗܺ֫;->ۙ(D)Ljava/lang/String;

    move-result-object v0

    const-string v1, " m"

    .line 0
    invoke-static {p0, v0, v1}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x7f12041e

    .line 170
    invoke-static {v0, p0, p1}, Ll/ۗܺ֫;->ۙ(ILjava/lang/String;Ljava/util/ArrayList;)V

    :cond_3
    return-void
.end method

.method public static ᩷(D)Z
    .locals 1

    .line 185
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
