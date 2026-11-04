.class public final synthetic Ll/۟ܺ᩹;
.super Ljava/lang/Object;
.source "0CMQ"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ܿ᩻᩷;


# direct methods
.method public static ۙ(Ll/ܰ᩷۫;Ljava/lang/String;Ll/᩶᩷۫;Ll/᩶᩷۫;ZZ)I
    .locals 0

    if-eqz p5, :cond_0

    const/4 p0, 0x1

    return p0

    .line 44
    :cond_0
    invoke-interface {p0}, Ll/ܰ᩷۫;->ۗ()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 45
    invoke-interface {p0, p1, p2, p3, p4}, Ll/ܰ᩷۫;->ۙ(Ljava/lang/String;Ll/᩶᩷۫;Ll/᩶᩷۫;Z)V

    .line 47
    :cond_1
    invoke-interface {p0}, Ll/ܰ᩷۫;->ᩳ()I

    move-result p0

    return p0
.end method

.method public static ۙ(Ljava/util/Collection;)J
    .locals 2

    .line 63
    instance-of v0, p0, Ll/ᩳܺ᩹;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ᩳܺ᩹;

    invoke-interface {p0}, Ll/ᩳܺ᩹;->ۙ()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 1
    invoke-static {p0}, Ll/ۨᩴۚ;->ۙ(Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-virtual {p2, p3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۛ֡᩵;->ۙ(II)Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۙ(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;

    .line 1
    invoke-direct {v0}, Lorg/bouncycastle/pqc/jcajce/provider/snova/SnovaKeyFactorySpi;-><init>()V

    .line 2
    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(IIIII)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
