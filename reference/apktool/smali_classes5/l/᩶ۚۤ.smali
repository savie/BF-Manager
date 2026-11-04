.class public abstract Ll/᩶ۚۤ;
.super Ljava/lang/Object;
.source "IIVV"


# instance fields
.field public final ۙ:Ll/᩵ۧܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ll/᩵ۧܺ;

    invoke-direct {v0}, Ll/᩵ۧܺ;-><init>()V

    iput-object v0, p0, Ll/᩶ۚۤ;->ۙ:Ll/᩵ۧܺ;

    return-void
.end method


# virtual methods
.method public abstract ۙ()I
.end method

.method public final ۙ(I)I
    .locals 1

    if-ltz p1, :cond_1

    .line 60
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v0

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v0

    sub-int/2addr v0, p1

    return v0

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ۙ(II)V
    .locals 1

    if-ltz p2, :cond_0

    const v0, 0x1fffffff

    if-gt p2, v0, :cond_0

    mul-int/lit8 p2, p2, 0x4

    .line 84
    invoke-virtual {p0, p1, p2}, Ll/᩶ۚۤ;->᩷(II)V

    return-void

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid int array length: "

    .line 0
    invoke-static {p2, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 83
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۙ(II[B)V
.end method

.method public ۙ(Ljava/io/OutputStream;)V
    .locals 5

    .line 89
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v0

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 90
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 91
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 93
    :try_start_0
    invoke-virtual {p0, v3, v4, v1}, Ll/᩶ۚۤ;->ۙ(II[B)V
    :try_end_0
    .catch Ll/᩻ۚۤ; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    invoke-virtual {p1, v1, v2, v4}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v3, v4

    goto :goto_0

    :catch_0
    move-exception p1

    .line 95
    invoke-virtual {p1}, Ll/᩻ۚۤ;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ܺۚۤ;)V
    .locals 1

    .line 72
    iget-object v0, p1, Ll/ܺۚۤ;->ۙ:Ll/᩶ۚۤ;

    if-ne v0, p0, :cond_0

    .line 73
    iget-object v0, p0, Ll/᩶ۚۤ;->ۙ:Ll/᩵ۧܺ;

    invoke-virtual {v0, p1}, Ll/᩵ۧܺ;->ۙ(Ljava/lang/Object;)Z

    return-void

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Reader belongs to another buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۤ(I)I
.end method

.method public ۤ(II)[I
    .locals 3

    .line 35
    invoke-virtual {p0, p1, p2}, Ll/᩶ۚۤ;->ۙ(II)V

    .line 36
    new-array v0, p2, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 37
    invoke-virtual {p0, p1}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۫(I)Ll/ܺۚۤ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩶ۚۤ;->ۙ:Ll/᩵ۧܺ;

    invoke-virtual {v0}, Ll/᩵ۧܺ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۚۤ;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Ll/ܺۚۤ;

    invoke-direct {v0, p0, p1}, Ll/ܺۚۤ;-><init>(Ll/᩶ۚۤ;I)V

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۤ;->ۤ(I)V

    return-object v0
.end method

.method public ܳ(I)I
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Ll/᩶ۚۤ;->᩸(I)S

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    return p1
.end method

.method public ᩴ(I)I
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Ll/᩶ۚۤ;->᩷(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public abstract ᩷(I)B
.end method

.method public final ᩷(II)V
    .locals 4

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 77
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v0

    sub-int/2addr v0, p2

    if-gt p1, v0, :cond_0

    return-void

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", count="

    const-string v2, ", length="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 78
    invoke-virtual {p0}, Ll/᩶ۚۤ;->ۙ()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ᩸(I)S
.end method
