.class public abstract Ll/ۜ᩻ܽ;
.super Ljava/lang/Object;
.source "L3BC"


# static fields
.field public static final ۙ:Ll/ۜ᩻ܽ;

.field public static final ᩷:Ll/ۜ᩻ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 334
    new-instance v0, Ll/ۡ᩻ܽ;

    const-string v1, "base64()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 336
    invoke-direct {v0, v1, v2}, Ll/ۡ᩻ܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    new-instance v0, Ll/ۡ᩻ܽ;

    const-string v1, "base64Url()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 357
    invoke-direct {v0, v1, v2}, Ll/ۡ᩻ܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    new-instance v0, Ll/۠᩻ܽ;

    const-string v1, "base32()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    .line 378
    invoke-direct {v0, v1, v2}, Ll/۠᩻ܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ۜ᩻ܽ;->᩷:Ll/ۜ᩻ܽ;

    .line 396
    new-instance v0, Ll/۠᩻ܽ;

    const-string v1, "base32Hex()"

    const-string v2, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    .line 397
    invoke-direct {v0, v1, v2}, Ll/۠᩻ܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    new-instance v0, Ll/֨᩻ܽ;

    invoke-direct {v0}, Ll/֨᩻ܽ;-><init>()V

    sput-object v0, Ll/ۜ᩻ܽ;->ۙ:Ll/ۜ᩻ܽ;

    return-void
.end method

.method public static ۤ()Ll/ۜ᩻ܽ;
    .locals 1

    .line 433
    sget-object v0, Ll/ۜ᩻ܽ;->ۙ:Ll/ۜ᩻ܽ;

    return-object v0
.end method

.method public static ᩸()Ll/ۜ᩻ܽ;
    .locals 1

    .line 393
    sget-object v0, Ll/ۜ᩻ܽ;->᩷:Ll/ۜ᩻ܽ;

    return-object v0
.end method


# virtual methods
.method public abstract ۙ([BLjava/lang/CharSequence;)I
.end method

.method public abstract ۙ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
.end method

.method public final ۙ([B)Ljava/lang/String;
    .locals 5

    .line 148
    array-length v0, p1

    .line 156
    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ll/ۨۙܽ;->ۙ(III)V

    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    move-object v2, p0

    check-cast v2, Ll/۠᩻ܽ;

    .line 637
    iget-object v2, v2, Ll/۠᩻ܽ;->ۤ:Ll/ۢ᩻ܽ;

    iget v3, v2, Ll/ۢ᩻ܽ;->᩸:I

    iget v2, v2, Ll/ۢ᩻ܽ;->᩷:I

    sget-object v4, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v0, v2}, Ll/᩹ܺܽ;->ۙ(II)I

    move-result v2

    mul-int v2, v2, v3

    .line 157
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 159
    :try_start_0
    invoke-virtual {p0, v1, p1, v0}, Ll/ۜ᩻ܽ;->ۙ(Ljava/lang/StringBuilder;[BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 161
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract ۙ()Ll/ۜ᩻ܽ;
.end method

.method public abstract ۙ(Ljava/lang/StringBuilder;[BI)V
.end method

.method public final ۙ(Ljava/lang/String;)[B
    .locals 5

    .line 233
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۜ᩻ܽ;->ۙ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    .line 234
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    move-object v1, p0

    check-cast v1, Ll/۠᩻ܽ;

    .line 722
    iget-object v1, v1, Ll/۠᩻ܽ;->ۤ:Ll/ۢ᩻ܽ;

    iget v1, v1, Ll/ۢ᩻ܽ;->ۙ:I

    int-to-long v1, v1

    int-to-long v3, v0

    mul-long v1, v1, v3

    const-wide/16 v3, 0x7

    add-long/2addr v1, v3

    const-wide/16 v3, 0x8

    div-long/2addr v1, v3

    long-to-int v0, v1

    .line 234
    new-array v1, v0, [B

    .line 235
    invoke-virtual {p0, v1, p1}, Ll/ۜ᩻ܽ;->ۙ([BLjava/lang/CharSequence;)I

    move-result p1

    if-ne p1, v0, :cond_0

    return-object v1

    .line 196
    :cond_0
    new-array v0, p1, [B

    const/4 v2, 0x0

    .line 197
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ll/ۖ᩻ܽ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 220
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract ᩷()Ll/ۜ᩻ܽ;
.end method
