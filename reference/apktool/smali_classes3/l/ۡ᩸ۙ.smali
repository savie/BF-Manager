.class public final Ll/ۡ᩸ۙ;
.super Ljava/lang/Object;
.source "JB0Y"


# direct methods
.method public static ۙ(Ljava/nio/MappedByteBuffer;)Ll/ۚᩴۙ;
    .locals 12

    .line 86
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 87
    new-instance v0, Ll/ۢ᩸ۙ;

    invoke-direct {v0, p0}, Ll/ۢ᩸ۙ;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 v1, 0x4

    .line 117
    invoke-virtual {v0, v1}, Ll/ۢ᩸ۙ;->ۙ(I)V

    .line 119
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->᩸()I

    move-result v2

    const/16 v3, 0x64

    const-string v4, "Cannot read metadata."

    if-gt v2, v3, :cond_5

    const/4 v3, 0x6

    .line 125
    invoke-virtual {v0, v3}, Ll/ۢ᩸ۙ;->ۙ(I)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    const-wide/16 v6, -0x1

    if-ge v5, v2, :cond_1

    .line 129
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->᩷()I

    move-result v8

    .line 131
    invoke-virtual {v0, v1}, Ll/ۢ᩸ۙ;->ۙ(I)V

    .line 132
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->ۤ()J

    move-result-wide v9

    .line 134
    invoke-virtual {v0, v1}, Ll/ۢ᩸ۙ;->ۙ(I)V

    const v11, 0x6d657461

    if-ne v11, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-wide v9, v6

    :goto_1
    cmp-long v1, v9, v6

    if-eqz v1, :cond_4

    .line 143
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->ۙ()J

    move-result-wide v1

    sub-long v1, v9, v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Ll/ۢ᩸ۙ;->ۙ(I)V

    const/16 v1, 0xc

    .line 145
    invoke-virtual {v0, v1}, Ll/ۢ᩸ۙ;->ۙ(I)V

    .line 147
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->ۤ()J

    move-result-wide v1

    :goto_2
    int-to-long v5, v3

    cmp-long v7, v5, v1

    if-gez v7, :cond_4

    .line 149
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->᩷()I

    move-result v5

    .line 150
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->ۤ()J

    move-result-wide v6

    .line 151
    invoke-virtual {v0}, Ll/ۢ᩸ۙ;->ۤ()J

    const v8, 0x456d6a69

    if-eq v8, v5, :cond_3

    const v8, 0x656d6a69

    if-ne v8, v5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 153
    :cond_3
    :goto_3
    new-instance v0, Ll/֨᩸ۙ;

    add-long/2addr v6, v9

    invoke-direct {v0, v6, v7}, Ll/֨᩸ۙ;-><init>(J)V

    .line 90
    invoke-virtual {v0}, Ll/֨᩸ۙ;->ۙ()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 91
    invoke-static {p0}, Ll/ۚᩴۙ;->ۙ(Ljava/nio/ByteBuffer;)Ll/ۚᩴۙ;

    move-result-object p0

    return-object p0

    .line 158
    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 122
    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
