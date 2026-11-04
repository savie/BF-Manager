.class public final Ll/᩺ܰܽ;
.super Ll/ۢۨܽ;
.source "2B08"


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)V
    .locals 1

    .line 1997
    instance-of v0, p1, Ll/ܽ᩺ܽ;

    if-nez v0, :cond_1

    .line 2001
    iget v0, p1, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 2003
    invoke-virtual {p1}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 2016
    invoke-static {p1}, Ll/ۘܰܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :pswitch_0
    const/16 v0, 0xa

    .line 2013
    iput v0, p1, Ll/ۘܰܽ;->ۖ:I

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x9

    .line 2007
    iput v0, p1, Ll/ۘܰܽ;->ۖ:I

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x8

    .line 2010
    iput v0, p1, Ll/ۘܰܽ;->ۖ:I

    .line 2019
    :goto_0
    invoke-static {p1}, Ll/ۘܰܽ;->᩷(Ll/ۘܰܽ;)V

    return-void

    .line 1998
    :cond_1
    check-cast p1, Ll/ܽ᩺ܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 0
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
