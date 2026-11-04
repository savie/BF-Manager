.class public Ll/ۖۛܽ;
.super Ljava/lang/Object;
.source "26GL"

# interfaces
.implements Ll/ܶۨܽ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩺᩵ܽ;Ll/ۛܰܽ;)Ll/ܽۨܽ;
    .locals 3

    .line 397
    invoke-virtual {p2}, Ll/ۛܰܽ;->ۙ()Ljava/lang/Class;

    move-result-object p2

    .line 398
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.time."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 404
    :cond_0
    const-class v0, Ll/ܿۤۗ;

    if-ne p2, v0, :cond_1

    .line 405
    invoke-static {}, Ll/۫᩺ܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 406
    :cond_1
    const-class v0, Ll/֡ۤۗ;

    if-ne p2, v0, :cond_2

    .line 407
    invoke-static {}, Ll/۫᩺ܽ;->᩸()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 408
    :cond_2
    const-class v0, Ll/۟ۤۗ;

    if-ne p2, v0, :cond_3

    .line 409
    invoke-static {}, Ll/۫᩺ܽ;->ᩴ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 410
    :cond_3
    const-class v0, Ll/ۢۤۗ;

    if-ne p2, v0, :cond_4

    .line 411
    sget-object p1, Ll/۫᩺ܽ;->ᩴ:Ll/ܽۨܽ;

    return-object p1

    .line 412
    :cond_4
    const-class v1, Ll/ᩳۤۗ;

    if-ne p2, v1, :cond_5

    .line 413
    invoke-static {p1}, Ll/۫᩺ܽ;->᩷(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 414
    :cond_5
    const-class v1, Ll/֨ۤۗ;

    if-ne p2, v1, :cond_6

    .line 415
    invoke-static {}, Ll/۫᩺ܽ;->ܳ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 416
    :cond_6
    const-class v1, Ll/ۡۤۗ;

    if-ne p2, v1, :cond_7

    .line 417
    invoke-static {p1}, Ll/۫᩺ܽ;->ۤ(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 418
    :cond_7
    const-class v1, Ll/ۖۤۗ;

    const-class v2, Ll/ۤ᩸ۗ;

    if-ne p2, v1, :cond_8

    .line 419
    sget-object p2, Ll/۫᩺ܽ;->ᩴ:Ll/ܽۨܽ;

    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    invoke-static {v0}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p2

    invoke-static {v2}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p1

    .line 210
    new-instance v0, Ll/ᩴ᩺ܽ;

    invoke-direct {v0, p2, p1}, Ll/ᩴ᩺ܽ;-><init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V

    .line 245
    invoke-virtual {v0}, Ll/ܽۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 420
    :cond_8
    const-class v0, Ll/۠ۤۗ;

    if-ne p2, v0, :cond_9

    .line 421
    invoke-static {}, Ll/۫᩺ܽ;->۫()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 422
    :cond_9
    const-class v0, Ll/۬ۤۗ;

    if-ne p2, v0, :cond_a

    .line 423
    invoke-static {}, Ll/۫᩺ܽ;->ۚ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 424
    :cond_a
    const-class v0, Ll/ۙ᩸ۗ;

    if-ne p2, v0, :cond_b

    .line 425
    invoke-static {}, Ll/۫᩺ܽ;->᩷()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 426
    :cond_b
    const-class v0, Ll/᩷᩸ۗ;

    if-eq p2, v0, :cond_e

    if-ne p2, v2, :cond_c

    goto :goto_1

    .line 433
    :cond_c
    const-class v0, Ll/᩸᩸ۗ;

    if-ne p2, v0, :cond_d

    .line 434
    invoke-static {p1}, Ll/۫᩺ܽ;->ۙ(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 432
    :cond_e
    :goto_1
    invoke-static {}, Ll/۫᩺ܽ;->ۤ()Ll/ܽۨܽ;

    move-result-object p1

    return-object p1
.end method
