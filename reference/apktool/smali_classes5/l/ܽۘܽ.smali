.class public Ll/ܽۘܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 706
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 5

    .line 709
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 710
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    return-object v2

    .line 713
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    .line 714
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v2

    .line 718
    :cond_1
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 720
    new-instance v2, Ll/ۜ᩵ܽ;

    const-string v3, "Failed parsing \'"

    const-string v4, "\' as URL; at path "

    .line 0
    invoke-static {v3, v0, v4}, Ll/᩸ۨۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 721
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 721
    throw v2
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 0

    .line 706
    check-cast p2, Ljava/net/URL;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 727
    :cond_0
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ll/᩶ܰܽ;->᩷(Ljava/lang/String;)V

    return-void
.end method
