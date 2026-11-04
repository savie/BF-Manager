.class public Ll/֨ۛܽ;
.super Ll/ܽۨܽ;
.source "26GL"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 293
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 4

    .line 296
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 299
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    sget-object v3, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    if-eq v2, v3, :cond_2

    .line 300
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "totalSeconds"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 310
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 306
    :cond_1
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩶()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    .line 313
    :cond_2
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    if-eqz v0, :cond_3

    .line 315
    invoke-static {v0}, Ll/᩷᩸ۗ;->of(Ljava/lang/String;)Ll/᩷᩸ۗ;

    move-result-object p1

    return-object p1

    :cond_3
    if-eqz v1, :cond_4

    .line 317
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ll/ۤ᩸ۗ;->ofTotalSeconds(I)Ll/ۤ᩸ۗ;

    move-result-object p1

    return-object p1

    .line 319
    :cond_4
    new-instance v0, Ll/ۜ᩵ܽ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing id or totalSeconds field; at path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 320
    throw v0
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 293
    check-cast p2, Ll/᩷᩸ۗ;

    .line 326
    instance-of v0, p2, Ll/ۤ᩸ۗ;

    if-eqz v0, :cond_0

    .line 327
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "totalSeconds"

    .line 328
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 329
    check-cast p2, Ll/ۤ᩸ۗ;

    invoke-virtual {p2}, Ll/ۤ᩸ۗ;->getTotalSeconds()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/᩶ܰܽ;->᩷(J)V

    .line 330
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void

    .line 332
    :cond_0
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "id"

    .line 333
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 334
    invoke-virtual {p2}, Ll/᩷᩸ۗ;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩶ܰܽ;->᩷(Ljava/lang/String;)V

    .line 335
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method
