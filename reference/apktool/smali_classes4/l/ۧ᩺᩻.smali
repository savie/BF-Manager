.class public final synthetic Ll/ۧ᩺᩻;
.super Ljava/lang/Object;
.source "H1KB"

# interfaces
.implements Ll/ۚۙܽ;
.implements Ll/ᩴۨۙ;
.implements Ll/ܺۛ۫;
.implements Ll/ۘ᩺᩻;


# direct methods
.method public static ۙ(JJJJ)J
    .locals 0

    mul-long p0, p0, p2

    add-long/2addr p0, p4

    add-long/2addr p0, p6

    return-wide p0
.end method

.method public static bridge synthetic ۙ(Landroid/system/StructTimespec;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Landroid/system/StructTimespec;->tv_nsec:J

    return-wide v0
.end method

.method public static bridge synthetic ۙ()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Ljava/lang/reflect/Executable;

    return-object v0
.end method

.method public static ۙ(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(IILorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/util/HashMap;Ljava/lang/Integer;)V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSMTParameters;

    .line 1
    invoke-direct {v0, p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/xmss/XMSSMTParameters;-><init>(IILorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    .line 2
    invoke-virtual {p3, p4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۙ(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/᩸֫᩷;

    .line 820
    invoke-interface {p1}, Ll/᩸֫᩷;->ۤ()Ll/᩸֫᩷;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/lang/String;Z)I
    .locals 0

    if-eqz p2, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 10
    :try_start_0
    invoke-static {}, Ll/ۢ᩵᩵;->ܶ()Ll/ۢ᩵᩵;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ll/֡᩵᩵;->ۤ()Ll/ܽ᩵᩵;

    move-result-object v0

    .line 33
    check-cast v0, Ll/۬ܰ᩵;

    invoke-virtual {v0, p1}, Ll/۬ܰ᩵;->᩷(Ljava/lang/String;)[Ll/ܶ᩵᩵;

    move-result-object p1

    .line 34
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 35
    aget-object p1, p1, v0

    invoke-interface {p1}, Ll/ۤ᩵᩵;->᩷()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
