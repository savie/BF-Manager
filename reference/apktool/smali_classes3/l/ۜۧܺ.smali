.class public final Ll/ۜۧܺ;
.super Ljava/lang/Object;
.source "N7JL"


# direct methods
.method public static ۙ(II)I
    .locals 0

    mul-int/lit8 p1, p1, 0x4

    xor-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x10

    xor-int/2addr p0, p1

    const p1, -0x7a143595

    mul-int p0, p0, p1

    ushr-int/lit8 p1, p0, 0xd

    xor-int/2addr p0, p1

    const p1, -0x3d4d51cb

    mul-int p0, p0, p1

    ushr-int/lit8 p1, p0, 0x10

    xor-int/2addr p0, p1

    return p0
.end method

.method public static ۙ(ILjava/lang/Object;)I
    .locals 0

    if-eqz p1, :cond_0

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Ll/ۜۧܺ;->᩷(II)I

    move-result p0

    return p0
.end method

.method public static ۙ([B)Z
    .locals 15

    .line 14
    array-length v0, p0

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x1

    .line 19
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x2

    .line 20
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x6

    .line 21
    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x8

    shl-int/2addr v4, v5

    const/4 v6, 0x5

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v4, v6

    const/4 v6, 0x7

    .line 22
    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0xd

    .line 23
    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/2addr v7, v5

    const/16 v8, 0xc

    aget-byte v8, p0, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v7, v8

    const/16 v8, 0xf

    .line 24
    aget-byte v9, p0, v8

    and-int/lit16 v9, v9, 0xff

    shl-int/2addr v9, v5

    const/16 v10, 0xe

    aget-byte v10, p0, v10

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v9, v10

    const/16 v10, 0x10

    .line 25
    aget-byte p0, p0, v10

    and-int/lit16 p0, p0, 0xff

    if-eqz v1, :cond_1

    if-eq v1, v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const/16 v11, 0xb

    const/16 v12, 0xa

    const/4 v13, 0x3

    const/16 v14, 0x9

    if-eq v3, v0, :cond_2

    if-eq v3, v2, :cond_2

    if-eq v3, v13, :cond_2

    if-eq v3, v14, :cond_2

    if-eq v3, v12, :cond_2

    if-ne v3, v11, :cond_d

    :cond_2
    if-eqz v7, :cond_d

    if-nez v9, :cond_3

    goto :goto_5

    :cond_3
    if-eq v3, v0, :cond_5

    if-ne v3, v14, :cond_4

    goto :goto_0

    :cond_4
    if-nez v1, :cond_d

    goto :goto_1

    :cond_5
    :goto_0
    if-ne v1, v0, :cond_d

    :goto_1
    const/16 v7, 0x20

    const/16 v9, 0x18

    if-ne v1, v0, :cond_6

    if-lez v4, :cond_d

    if-eq v6, v8, :cond_6

    if-eq v6, v10, :cond_6

    if-eq v6, v9, :cond_6

    if-ne v6, v7, :cond_d

    :cond_6
    if-eq v3, v0, :cond_b

    if-ne v3, v14, :cond_7

    goto :goto_3

    :cond_7
    if-eq v3, v2, :cond_a

    if-ne v3, v12, :cond_8

    goto :goto_2

    :cond_8
    if-eq v3, v13, :cond_9

    if-ne v3, v11, :cond_d

    :cond_9
    if-eq p0, v5, :cond_c

    if-ne p0, v10, :cond_d

    goto :goto_4

    :cond_a
    :goto_2
    if-eq p0, v8, :cond_c

    if-eq p0, v10, :cond_c

    if-eq p0, v9, :cond_c

    if-ne p0, v7, :cond_d

    goto :goto_4

    :cond_b
    :goto_3
    if-eq p0, v5, :cond_c

    if-ne p0, v10, :cond_d

    :cond_c
    :goto_4
    return v0

    :cond_d
    :goto_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(II)I
    .locals 1

    const v0, -0x3361d2af    # -8.293031E7f

    mul-int p1, p1, v0

    shl-int/lit8 v0, p1, 0xf

    ushr-int/lit8 p1, p1, 0x11

    or-int/2addr p1, v0

    const v0, 0x1b873593

    mul-int p1, p1, v0

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0xd

    ushr-int/lit8 p0, p0, 0x13

    or-int/2addr p0, p1

    mul-int/lit8 p0, p0, 0x5

    const p1, -0x19ab949c

    add-int/2addr p0, p1

    return p0
.end method
