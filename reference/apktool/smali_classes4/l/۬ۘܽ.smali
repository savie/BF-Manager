.class public final Ll/۬ۘܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# instance fields
.field public final ۙ:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 493
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    .line 494
    iput-boolean p1, p0, Ll/۬ۘܽ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 2

    .line 499
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    .line 500
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    const/4 p1, 0x0

    return-object p1

    .line 503
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܰ()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 490
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    .line 509
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܶ()Ll/᩶ܰܽ;

    return-void

    .line 512
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 513
    iget-boolean p2, p0, Ll/۬ۘܽ;->ۙ:Z

    if-eqz p2, :cond_1

    .line 514
    invoke-static {v0, v1}, Ll/᩸ܰܽ;->ۙ(D)V

    .line 516
    :cond_1
    invoke-virtual {p1, v0, v1}, Ll/᩶ܰܽ;->ۙ(D)V

    return-void
.end method
