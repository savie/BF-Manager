.class public Ll/᩹ۘܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# instance fields
.field public final ۙ:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 762
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    const-string v0, ".*:.*|[0-9]+(\\.[0-9]+){3}"

    .line 768
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۘܽ;->ۙ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 4

    .line 772
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    .line 773
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    const/4 p1, 0x0

    return-object p1

    .line 776
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 777
    iget-object v1, p0, Ll/᩹ۘܽ;->ۙ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "gson.allowDnsInetAddress"

    .line 778
    invoke-static {v1}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 779
    :cond_1
    new-instance v1, Ll/ۜ᩵ܽ;

    const-string v2, "Failed parsing \'"

    const-string v3, "\' as InetAddress; at path "

    .line 0
    invoke-static {v2, v0, v3}, Ll/᩸ۨۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 783
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; to allow DNS addresses, set system property gson.allowDnsInetAddress to \"true\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 783
    throw v1

    .line 788
    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 0

    .line 762
    check-cast p2, Ljava/net/InetAddress;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 794
    :cond_0
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ll/᩶ܰܽ;->᩷(Ljava/lang/String;)V

    return-void
.end method
