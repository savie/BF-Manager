.class public final Ll/ۡۛܽ;
.super Ll/ܽۨܽ;
.source "26GL"


# instance fields
.field public final synthetic ۙ:Ll/ܽۨܽ;

.field public final synthetic ۤ:Ll/ܽۨܽ;

.field public final synthetic ᩷:Ll/ܽۨܽ;


# direct methods
.method public constructor <init>(Ll/ܽۨܽ;Ll/ܽۨܽ;Ll/ܽۨܽ;)V
    .locals 0

    .line 344
    iput-object p1, p0, Ll/ۡۛܽ;->ۙ:Ll/ܽۨܽ;

    iput-object p2, p0, Ll/ۡۛܽ;->ۤ:Ll/ܽۨܽ;

    iput-object p3, p0, Ll/ۡۛܽ;->᩷:Ll/ܽۨܽ;

    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 9

    .line 347
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    .line 351
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v3

    sget-object v4, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    const-string v5, "dateTime"

    const-string v6, "zone"

    const-string v7, "offset"

    if-eq v3, v4, :cond_3

    .line 352
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v3

    .line 353
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v8, -0x1

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v8, 0x2

    goto :goto_1

    :sswitch_1
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v8, 0x1

    goto :goto_1

    :sswitch_2
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    packed-switch v8, :pswitch_data_0

    .line 365
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 355
    :pswitch_0
    iget-object v0, p0, Ll/ۡۛܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {v0, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۗ;

    goto :goto_0

    .line 361
    :pswitch_1
    iget-object v2, p0, Ll/ۡۛܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {v2, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩸ۗ;

    goto :goto_0

    .line 358
    :pswitch_2
    iget-object v1, p0, Ll/ۡۛܽ;->ۤ:Ll/ܽۨܽ;

    invoke-virtual {v1, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩸ۗ;

    goto :goto_0

    .line 368
    :cond_3
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    .line 370
    invoke-static {v0, v5, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 371
    invoke-static {v1, v7, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 372
    invoke-static {v2, v6, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 369
    invoke-static {v0, v1, v2}, Ll/᩸᩸ۗ;->ofInstant(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;Ll/᩷᩸ۗ;)Ll/᩸᩸ۗ;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3cc89b6d -> :sswitch_2
        0x3923ac -> :sswitch_1
        0x6adb2f9b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 344
    check-cast p2, Ll/᩸᩸ۗ;

    if-nez p2, :cond_0

    .line 378
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܶ()Ll/᩶ܰܽ;

    return-void

    .line 381
    :cond_0
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "dateTime"

    .line 382
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 383
    iget-object v0, p0, Ll/ۡۛܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/᩸᩸ۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    const-string v0, "offset"

    .line 384
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 385
    iget-object v0, p0, Ll/ۡۛܽ;->ۤ:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/᩸᩸ۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    const-string v0, "zone"

    .line 386
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Ll/ۡۛܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/᩸᩸ۗ;->getZone()Ll/᩷᩸ۗ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    .line 388
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method
