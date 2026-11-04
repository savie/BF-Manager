.class public final Ll/ᩳ۠ۚ;
.super Ljava/lang/Object;
.source "Y6LM"


# direct methods
.method public static ۙ(Ljava/io/InputStream;)Ll/۟۠ۚ;
    .locals 15

    const/16 v0, 0x200

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    rsub-int v4, v3, 0x200

    .line 68
    invoke-virtual {p0, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    if-nez v4, :cond_2

    .line 71
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v3, 0x1

    int-to-byte v4, v4

    .line 73
    aput-byte v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_2
    add-int/2addr v3, v4

    goto :goto_0

    :cond_3
    :goto_1
    const-string p0, "\u0089PNG\r\n\u001a\n"

    .line 116
    invoke-static {v3, v2, p0, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    const-string v5, "WEBP"

    const-string v6, "RIFF"

    const-string v7, "\u0000\u0000\u0001\u0000"

    const/16 v8, -0x28

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, -0x1

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-nez v4, :cond_a

    if-lt v3, v9, :cond_4

    aget-byte v4, v1, v2

    if-ne v4, v11, :cond_4

    aget-byte v4, v1, v13

    if-ne v4, v8, :cond_4

    aget-byte v4, v1, v12

    if-eq v4, v11, :cond_a

    :cond_4
    const-string v4, "BM"

    .line 118
    invoke-static {v3, v2, v4, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-static {v3, v2, v7, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "GIF87a"

    .line 120
    invoke-static {v3, v2, v4, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-nez v4, :cond_9

    const-string v4, "GIF89a"

    invoke-static {v3, v2, v4, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    .line 121
    :cond_6
    invoke-static {v3, v2, v6, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {v3, v10, v5, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x1e

    if-lt v3, v4, :cond_7

    const/16 v4, 0xc

    const-string v14, "VP8X"

    .line 122
    invoke-static {v3, v4, v14, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x14

    aget-byte v4, v1, v4

    and-int/2addr v4, v12

    if-eqz v4, :cond_7

    .line 123
    sget-object v4, Ll/֡۠ۚ;->᩶:Ll/֡۠ۚ;

    goto :goto_4

    :cond_7
    sget-object v4, Ll/֡۠ۚ;->ܿ:Ll/֡۠ۚ;

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    goto :goto_4

    .line 120
    :cond_9
    :goto_2
    sget-object v4, Ll/֡۠ۚ;->֡:Ll/֡۠ۚ;

    goto :goto_4

    .line 119
    :cond_a
    :goto_3
    sget-object v4, Ll/֡۠ۚ;->ܿ:Ll/֡۠ۚ;

    :goto_4
    const/16 v14, 0x21

    if-eqz v4, :cond_10

    .line 79
    invoke-static {v3, v2, p0, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    const-string v0, "image/png"

    if-eqz p0, :cond_b

    move-object p0, v0

    goto :goto_5

    :cond_b
    if-lt v3, v9, :cond_c

    .line 80
    aget-byte p0, v1, v2

    if-ne p0, v11, :cond_c

    aget-byte p0, v1, v13

    if-ne p0, v8, :cond_c

    aget-byte p0, v1, v12

    if-ne p0, v11, :cond_c

    const-string p0, "image/jpeg"

    goto :goto_5

    .line 82
    :cond_c
    invoke-static {v3, v2, v6, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-static {v3, v10, v5, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_d

    const-string p0, "image/webp"

    goto :goto_5

    .line 83
    :cond_d
    invoke-static {v3, v2, v7, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_e

    const-string p0, "image/x-ico"

    goto :goto_5

    :cond_e
    const/4 p0, 0x0

    .line 84
    :goto_5
    new-instance v5, Ll/۟۠ۚ;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    if-lt v3, v14, :cond_f

    const-string v0, "\u0000\u0000\u0000\rIHDR"

    .line 85
    invoke-static {v3, v10, v0, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x1c

    aget-byte v0, v1, v0

    if-nez v0, :cond_f

    const/4 v2, 0x1

    :cond_f
    invoke-direct {v5, v4, p0, v2}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Ljava/lang/String;Z)V

    return-object v5

    :cond_10
    const/4 p0, -0x2

    if-lt v3, v12, :cond_11

    .line 89
    aget-byte v4, v1, v2

    if-ne v4, v11, :cond_11

    aget-byte v4, v1, v13

    if-ne v4, p0, :cond_11

    .line 90
    new-instance p0, Ljava/lang/String;

    add-int/lit8 v4, v3, -0x2

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v12, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_6

    :cond_11
    if-lt v3, v12, :cond_12

    .line 91
    aget-byte v4, v1, v2

    if-ne v4, p0, :cond_12

    aget-byte p0, v1, v13

    if-ne p0, v11, :cond_12

    .line 92
    new-instance p0, Ljava/lang/String;

    add-int/lit8 v4, v3, -0x2

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v12, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_6

    :cond_12
    const-string p0, "<\u0000?\u0000"

    .line 94
    invoke-static {v3, v2, p0, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_13

    .line 95
    new-instance p0, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_6

    :cond_13
    const-string p0, "\u0000<\u0000?"

    .line 96
    invoke-static {v3, v2, p0, v1}, Ll/ᩳ۠ۚ;->ۙ(IILjava/lang/String;[B)Z

    move-result p0

    if-eqz p0, :cond_14

    .line 97
    new-instance p0, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_6

    .line 98
    :cond_14
    new-instance p0, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_6
    const-string v4, "\ufeff"

    .line 99
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {p0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 101
    :cond_15
    :goto_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_17

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x20

    if-eq v4, v5, :cond_16

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_16

    .line 102
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xd

    if-eq v4, v5, :cond_16

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xa

    if-ne v4, v5, :cond_17

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_17
    add-int/lit8 v4, v2, 0x1

    .line 104
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_18

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3c

    if-ne v5, v6, :cond_18

    .line 105
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v5

    if-nez v5, :cond_19

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x5f

    if-eq v5, v6, :cond_19

    .line 106
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3a

    if-eq v5, v6, :cond_19

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3f

    if-eq v5, v6, :cond_19

    .line 107
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v14, :cond_18

    goto :goto_8

    :cond_18
    if-ne v3, v0, :cond_1a

    .line 108
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-ne v2, p0, :cond_1a

    .line 109
    :cond_19
    :goto_8
    new-instance p0, Ll/۟۠ۚ;

    sget-object v0, Ll/֡۠ۚ;->۟:Ll/֡۠ۚ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p0

    :cond_1a
    const/4 p0, 0x0

    const/16 v0, 0x12

    if-lt v3, v0, :cond_1b

    .line 110
    invoke-static {v1}, Ll/ۜۧܺ;->ۙ([B)Z

    move-result v0

    if-eqz v0, :cond_1b

    new-instance v0, Ll/۟۠ۚ;

    sget-object v1, Ll/֡۠ۚ;->ᩳ:Ll/֡۠ۚ;

    invoke-direct {v0, v1, p0}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Landroid/graphics/BitmapFactory$Options;)V

    return-object v0

    .line 111
    :cond_1b
    new-instance v0, Ll/۟۠ۚ;

    sget-object v1, Ll/֡۠ۚ;->ۢ:Ll/֡۠ۚ;

    invoke-direct {v0, v1, p0}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Landroid/graphics/BitmapFactory$Options;)V

    return-object v0
.end method

.method public static ۙ(Ll/۟۠ۚ;Ll/ܿ۠ۚ;)Ll/۟۠ۚ;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    sget-object v1, Ll/֡۠ۚ;->ܿ:Ll/֡۠ۚ;

    if-eq v0, v1, :cond_2

    sget-object v2, Ll/֡۠ۚ;->֡:Ll/֡۠ۚ;

    if-eq v0, v2, :cond_2

    sget-object v2, Ll/֡۠ۚ;->᩶:Ll/֡۠ۚ;

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {p1}, Ll/ܿ۠ۚ;->read()Landroid/graphics/BitmapFactory$Options;

    move-result-object p1

    .line 59
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v2, :cond_1

    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v2, :cond_1

    new-instance p0, Ll/۟۠ۚ;

    invoke-direct {p0, v1, p1}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Landroid/graphics/BitmapFactory$Options;)V

    return-object p0

    .line 60
    :cond_1
    sget-object v1, Ll/֡۠ۚ;->ۢ:Ll/֡۠ۚ;

    if-ne v0, v1, :cond_2

    new-instance p0, Ll/۟۠ۚ;

    invoke-direct {p0, v1, p1}, Ll/۟۠ۚ;-><init>(Ll/֡۠ۚ;Landroid/graphics/BitmapFactory$Options;)V

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static ۙ(IILjava/lang/String;[B)Z
    .locals 3

    sub-int/2addr p0, p1

    .line 129
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    .line 130
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_2

    add-int v0, p1, p0

    .line 131
    aget-byte v0, p3, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v0, v2, :cond_1

    :goto_1
    return v1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method
