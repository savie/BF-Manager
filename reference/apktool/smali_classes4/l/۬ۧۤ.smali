.class public final Ll/۬ۧۤ;
.super Ljava/lang/Object;
.source "P53K"

# interfaces
.implements Ll/᩸ۧۤ;


# direct methods
.method public static ۙ()Ljava/util/ArrayList;
    .locals 5

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/NetworkInterface;

    .line 27
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetAddress;

    .line 31
    instance-of v4, v3, Ljava/net/Inet4Address;

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    if-nez v4, :cond_2

    .line 32
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_3
    return-object v0
.end method

.method public static ۙ(I)Ljava/util/ArrayList;
    .locals 5

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-static {}, Ll/۬ۧۤ;->ۙ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "http://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/mcp"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/ۙۢ᩵;)Ll/ۙۢ᩵;
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    instance-of v0, p0, Ll/ۛۢ᩵;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/ۛۢ᩵;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۛۢ᩵;->ۚ()Ll/ۙۢ᩵;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static ۙ(Ll/᩺֨᩵;Ljava/lang/Object;Ll/ۙۢ᩵;)Ll/ۙۢ᩵;
    .locals 2

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    instance-of v0, p0, Ll/᩵ۢ᩵;

    if-eqz v0, :cond_0

    .line 163
    check-cast p0, Ll/᩵ۢ᩵;

    invoke-virtual {p0, p1, p2}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;Ll/ۙۢ᩵;)Ll/ۙۢ᩵;

    move-result-object p0

    return-object p0

    .line 276
    :cond_0
    invoke-interface {p2}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v0

    .line 278
    sget-object v1, Ll/᩻ۢ᩵;->ܰ:Ll/᩻ۢ᩵;

    if-ne v0, v1, :cond_1

    .line 279
    new-instance v0, Ll/ܽۢ᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/ܽۢ᩵;-><init>(Ll/᩺֨᩵;Ljava/lang/Object;Ll/ۙۢ᩵;)V

    return-object v0

    .line 280
    :cond_1
    new-instance v1, Ll/ܶۢ᩵;

    invoke-direct {v1, p2, v0, p0, p1}, Ll/ܶۢ᩵;-><init>(Ll/ۙۢ᩵;Ll/ۧۢ᩵;Ll/᩺֨᩵;Ljava/lang/Object;)V

    return-object v1
.end method

.method public static ᩷(I)Ljava/lang/String;
    .locals 2

    const-string v0, "http://127.0.0.1:"

    const-string v1, "/mcp"

    .line 0
    invoke-static {p0, v0, v1}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 2

    .line 15
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫ۤ;

    invoke-virtual {v0}, Ll/ܰ֫ۤ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 16
    invoke-static {v0}, Ll/ܳ֫ܺ;->ۙ([B)Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Ll/ܰ֫ۤ;

    invoke-direct {v1}, Ll/ܰ֫ۤ;-><init>()V

    .line 18
    invoke-virtual {v1, v0}, Ll/ܰ֫ۤ;->ۙ(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1, v1}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method
