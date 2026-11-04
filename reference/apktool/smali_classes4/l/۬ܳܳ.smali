.class public final synthetic Ll/۬ܳܳ;
.super Ljava/lang/Object;
.source "L70P"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۙܽ;
.implements Ll/ۤۢۘ;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬ܳܳ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ll/ܳۢۙ;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/۬ܳܳ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;ZI)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/۬ܳܳ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(III)V
    .locals 5

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    int-to-long v2, p0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 169
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", length="

    const-string v2, ", arrayLength="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 169
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ([B)[I
    .locals 5

    .line 145
    array-length v0, p0

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 146
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    :goto_1
    if-lez v2, :cond_0

    .line 147
    aget-byte v3, p0, v1

    aget-byte v4, p0, v2

    if-eq v3, v4, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 148
    aget v2, v0, v2

    goto :goto_1

    .line 150
    :cond_0
    aget-byte v3, p0, v1

    aget-byte v4, p0, v2

    if-ne v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 153
    :cond_1
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ᩷(III)V
    .locals 5

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    int-to-long v2, p0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 161
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", length="

    const-string v2, ", totalLength="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 161
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ll/ܶܶ᩷;

    .line 53
    iget-wide v0, p1, Ll/ܶܶ᩷;->᩷:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/۬ܳܳ;->ܰ:I

    .line 4
    check-cast p1, Ll/ᩴᩳۙ;

    packed-switch v0, :pswitch_data_0

    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 570
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(II[B)Ljava/lang/Object;
    .locals 0

    .line 152
    invoke-static {p1, p2, p3}, Ll/᩵ܽۘ;->ۙ(II[B)[B

    move-result-object p1

    const/4 p2, 0x0

    .line 171
    array-length p3, p1

    invoke-static {p2, p3, p1}, Ll/᩷۟ۘ;->ۙ(II[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
