.class public final Ll/֡ۜۗ;
.super Ll/ܺ۠ۗ;
.source "W6GA"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 6

    .line 13
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    if-nez v2, :cond_1

    goto :goto_1

    .line 21
    :cond_1
    sget-object v3, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/᩷۠ۗ;

    if-eqz v4, :cond_2

    .line 23
    sget-object v4, Ll/ܿۜۗ;->ۙ:[I

    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 37
    :pswitch_0
    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
