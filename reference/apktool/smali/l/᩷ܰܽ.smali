.class public final Ll/᩷ܰܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# instance fields
.field public final ۙ:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 460
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    .line 461
    iput-boolean p1, p0, Ll/᩷ܰܽ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 2

    .line 466
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    .line 467
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    const/4 p1, 0x0

    return-object p1

    .line 470
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܰ()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 3

    .line 457
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    .line 476
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܶ()Ll/᩶ܰܽ;

    return-void

    .line 479
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 480
    iget-boolean v1, p0, Ll/᩷ܰܽ;->ۙ:Z

    if-eqz v1, :cond_1

    float-to-double v1, v0

    .line 481
    invoke-static {v1, v2}, Ll/᩸ܰܽ;->ۙ(D)V

    .line 485
    :cond_1
    instance-of v1, p2, Ljava/lang/Float;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 486
    :goto_0
    invoke-virtual {p1, p2}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/Number;)V

    return-void
.end method
