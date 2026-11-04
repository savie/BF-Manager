.class public final synthetic Ll/ۢ۬ۗ;
.super Ljava/lang/Object;
.source "W6DM"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ᩳۡۗ;

    .line 151
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    .line 164
    sget-object v1, Ll/ۙۙ᩵;->᩷:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 154
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/᩹֨ۗ;

    if-eqz v1, :cond_0

    .line 155
    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    sget-object v2, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    if-eq v1, v2, :cond_0

    .line 156
    sget-object v1, Ll/֫۟ۗ;->ܽۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_0

    :cond_1
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
