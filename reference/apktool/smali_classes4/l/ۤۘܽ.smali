.class public Ll/ۤۘܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 412
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 2

    .line 415
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    .line 416
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    const/4 p1, 0x0

    return-object p1

    .line 420
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܿ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 422
    new-instance v0, Ll/ۜ᩵ܽ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 422
    throw v0
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 412
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    .line 429
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܶ()Ll/᩶ܰܽ;

    return-void

    .line 431
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/᩶ܰܽ;->᩷(J)V

    return-void
.end method
