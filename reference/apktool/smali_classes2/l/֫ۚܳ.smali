.class public final Ll/֫ۚܳ;
.super Ljava/lang/Object;
.source "K6JJ"


# static fields
.field public static final ۤ:Ll/᩺ܳۨ;


# instance fields
.field public volatile ۙ:Ll/ۛᩴۨ;

.field public volatile ᩷:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 16
    new-instance v0, Ll/ۛܳۨ;

    invoke-direct {v0}, Ll/ۛܳۨ;-><init>()V

    .line 17
    invoke-virtual {v0}, Ll/ۛܳۨ;->᩷()V

    invoke-virtual {v0}, Ll/ۛܳۨ;->ۤ()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x14

    .line 18
    invoke-virtual {v0, v2, v3, v1}, Ll/ۛܳۨ;->ۙ(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Ll/ۛܳۨ;->᩷(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0}, Ll/ۛܳۨ;->ۙ()Ll/᩺ܳۨ;

    move-result-object v0

    sput-object v0, Ll/֫ۚܳ;->ۤ:Ll/᩺ܳۨ;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "appassets.androidplatform.net"

    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".appassets.androidplatform.net"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 65
    invoke-static {p0}, Ll/ᩴۧܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۡܳۨ;
    .locals 7

    const/4 v0, 0x0

    .line 904
    :try_start_0
    invoke-static {p1}, Ll/ܺܳۨ;->ۤ(Ljava/lang/String;)Ll/ܺܳۨ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v0

    :goto_0
    const/4 v1, 0x0

    :goto_1
    const/16 v2, 0xa

    if-gt v1, v2, :cond_10

    .line 25
    iget-boolean v2, p0, Ll/֫ۚܳ;->᩷:Z

    if-nez v2, :cond_f

    if-eqz p1, :cond_e

    .line 26
    invoke-virtual {p1}, Ll/ܺܳۨ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫ۚܳ;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 27
    new-instance v2, Ll/֡ܳۨ;

    invoke-direct {v2}, Ll/֡ܳۨ;-><init>()V

    invoke-virtual {v2, p1}, Ll/֡ܳۨ;->ۙ(Ll/ܺܳۨ;)V

    if-eqz p2, :cond_0

    .line 28
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "User-Agent"

    invoke-virtual {v2, v3, p2}, Ll/֡ܳۨ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v3

    invoke-virtual {p1}, Ll/ܺܳۨ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "Cookie"

    invoke-virtual {v2, v4, v3}, Ll/֡ܳۨ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-nez p3, :cond_2

    goto :goto_2

    .line 904
    :cond_2
    :try_start_1
    invoke-static {p3}, Ll/ܺܳۨ;->ۤ(Ljava/lang/String;)Ll/ܺܳۨ;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    :goto_2
    move-object v3, v0

    :goto_3
    if-eqz v3, :cond_6

    .line 70
    invoke-virtual {v3}, Ll/ܺܳۨ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۚܳ;->ۙ(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3}, Ll/ܺܳۨ;->۫()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Ll/ܺܳۨ;->۫()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_4

    .line 71
    :cond_3
    invoke-virtual {v3}, Ll/ܺܳۨ;->ۚ()Ll/᩻ܳۨ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻ܳۨ;->ܳ()V

    invoke-virtual {v4}, Ll/᩻ܳۨ;->᩸()V

    invoke-virtual {v4}, Ll/᩻ܳۨ;->ۤ()V

    .line 72
    invoke-virtual {v3}, Ll/ܺܳۨ;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ll/ܺܳۨ;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Ll/ܺܳۨ;->᩻()I

    move-result v5

    invoke-virtual {p1}, Ll/ܺܳۨ;->᩻()I

    move-result v6

    if-ne v5, v6, :cond_4

    .line 73
    invoke-virtual {v3}, Ll/ܺܳۨ;->ܶ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ll/ܺܳۨ;->ܶ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-virtual {v4}, Ll/᩻ܳۨ;->᩷()V

    invoke-virtual {v4}, Ll/᩻ܳۨ;->ᩴ()V

    .line 74
    :cond_5
    invoke-virtual {v4}, Ll/᩻ܳۨ;->ۙ()Ll/ܺܳۨ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺܳۨ;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_6
    :goto_4
    move-object v3, v0

    :goto_5
    if-eqz v3, :cond_7

    const-string v4, "Referer"

    .line 32
    invoke-virtual {v2, v4, v3}, Ll/֡ܳۨ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :cond_7
    sget-object v3, Ll/֫ۚܳ;->ۤ:Ll/᩺ܳۨ;

    invoke-virtual {v2}, Ll/֡ܳۨ;->ۙ()Ll/۟ܳۨ;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/᩺ܳۨ;->ۙ(Ll/۟ܳۨ;)Ll/ۛᩴۨ;

    move-result-object v2

    .line 34
    iput-object v2, p0, Ll/֫ۚܳ;->ۙ:Ll/ۛᩴۨ;

    .line 35
    iget-boolean v3, p0, Ll/֫ۚܳ;->᩷:Z

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ll/ۛᩴۨ;->cancel()V

    .line 36
    :cond_8
    invoke-interface {v2}, Ll/ۛᩴۨ;->execute()Ll/ۡܳۨ;

    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ll/ۡܳۨ;->۫()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 38
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v5

    invoke-virtual {p1}, Ll/ܺܳۨ;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 40
    :cond_9
    invoke-virtual {v2}, Ll/ۡܳۨ;->ۤ()I

    move-result v3

    const/16 v4, 0x12d

    if-eq v3, v4, :cond_c

    const/16 v4, 0x12e

    if-eq v3, v4, :cond_c

    const/16 v4, 0x12f

    if-eq v3, v4, :cond_c

    const/16 v4, 0x133

    if-eq v3, v4, :cond_c

    const/16 v4, 0x134

    if-ne v3, v4, :cond_a

    goto :goto_7

    .line 48
    :cond_a
    invoke-virtual {v2}, Ll/ۡܳۨ;->ۚ()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v2}, Ll/ۡܳۨ;->ۙ()Ll/۠ܳۨ;

    move-result-object p1

    if-eqz p1, :cond_b

    return-object v2

    .line 49
    :cond_b
    invoke-virtual {v2}, Ll/ۡܳۨ;->close()V

    .line 50
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Download HTTP status "

    .line 0
    invoke-static {v3, p2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_7
    const-string v3, "Location"

    .line 42
    invoke-virtual {v2, v3}, Ll/ۡܳۨ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_d

    move-object p1, v0

    goto :goto_8

    .line 43
    :cond_d
    invoke-virtual {p1, v3}, Ll/ܺܳۨ;->ۙ(Ljava/lang/String;)Ll/ܺܳۨ;

    move-result-object p1

    .line 44
    :goto_8
    invoke-virtual {v2}, Ll/ۡܳۨ;->close()V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 26
    :cond_e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid download URL"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Download canceled"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_10
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Too many download redirects"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Ll/֫ۚܳ;->᩷:Z

    .line 59
    iget-object v0, p0, Ll/֫ۚܳ;->ۙ:Ll/ۛᩴۨ;

    if-eqz v0, :cond_0

    .line 60
    invoke-interface {v0}, Ll/ۛᩴۨ;->cancel()V

    :cond_0
    return-void
.end method
