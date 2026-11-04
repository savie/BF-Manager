.class public final Ll/ۗۚۤ;
.super Ll/᩶ۚۤ;
.source "91HA"


# instance fields
.field public final ᩷:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ll/᩶ۚۤ;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ۗۚۤ;->᩷:[B

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    array-length v0, v0

    return v0
.end method

.method public final ۙ(II[B)V
    .locals 2

    const/4 v0, 0x0

    .line 51
    iget-object v1, p0, Ll/ۗۚۤ;->᩷:[B

    invoke-static {v1, p1, p3, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۙ(Ljava/io/OutputStream;)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public final ۤ(I)I
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    invoke-static {p1, v0}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result p1

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    invoke-static {p1, v0}, Ll/ۜۚܺ;->ۤ(I[B)I

    move-result p1

    return p1
.end method

.method public final ᩴ(I)I
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ᩷(I)B
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ᩷()[B
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۗۚۤ;->᩷:[B

    return-object v0
.end method

.method public final ᩸(I)S
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 6
    iget-object v1, p0, Ll/ۗۚۤ;->᩷:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p1, v1, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    int-to-short p1, p1

    return p1
.end method
