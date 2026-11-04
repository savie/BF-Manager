.class public final Ll/ᩴۧۤ;
.super Ljava/lang/Object;
.source "15XV"

# interfaces
.implements Ll/᩸ۧۤ;
.implements Ll/ۙ᩸᩻;


# virtual methods
.method public ۙ(Ljava/lang/CharSequence;Ll/۫᩸᩻;Ll/ۤ᩻ᩴ;)V
    .locals 2

    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    new-instance v0, Ll/۠ۛ᩻;

    invoke-direct {v0}, Ll/۠ۛ᩻;-><init>()V

    .line 15
    invoke-virtual {p2}, Ll/۫᩸᩻;->᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 16
    invoke-virtual {v0}, Ll/۠ۛ᩻;->ۤ()V

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p2}, Ll/۫᩸᩻;->ۙ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۠ۛ᩻;->ۙ(Ljava/lang/Integer;)V

    .line 20
    :goto_0
    invoke-virtual {p2}, Ll/۫᩸᩻;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/۠ۛ᩻;->᩸()V

    .line 22
    :cond_1
    :try_start_0
    new-instance v1, Ll/ۖۛ᩻;

    invoke-direct {v1, v0}, Ll/ۖۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    invoke-virtual {v1, p1}, Ll/ۖۛ᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-virtual {p3, p1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p2}, Ll/۫᩸᩻;->ۤ()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p3, p2, Lorg/xml/sax/SAXParseException;

    if-eqz p3, :cond_2

    check-cast p2, Lorg/xml/sax/SAXParseException;

    .line 25
    new-instance p1, Ll/ۚ᩸᩻;

    invoke-virtual {p2}, Lorg/xml/sax/SAXParseException;->getLineNumber()I

    move-result p3

    invoke-virtual {p2}, Lorg/xml/sax/SAXParseException;->getColumnNumber()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p3, v0, p2}, Ll/ۚ᩸᩻;-><init>(IILjava/lang/String;)V

    throw p1

    .line 27
    :cond_2
    throw p1
.end method

.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 3

    .line 14
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫ۤ;

    invoke-virtual {v0}, Ll/ܰ֫ۤ;->ۚ()I

    move-result v0

    .line 15
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰ֫ۤ;

    invoke-virtual {p1}, Ll/ܰ֫ۤ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    const/4 v1, 0x0

    .line 16
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 17
    aget-byte v2, p1, v1

    xor-int/2addr v2, v0

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
