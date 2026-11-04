.class public final synthetic Ll/ܳ۬ۗ;
.super Ljava/lang/Object;
.source "Z6EN"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ۬ۗ;->ܰ:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    check-cast p1, Ll/ᩳۡۗ;

    .line 212
    sget-object v0, Ll/۫۬ۗ;->ۙ:[I

    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, Ll/ܳ۬ۗ;->ܰ:Ll/ۖۡۗ;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 223
    :pswitch_0
    check-cast p1, Ll/ۗۢۗ;

    invoke-virtual {p1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ᩳۗ;

    .line 224
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 225
    invoke-static {v1, p1}, Ll/ܽ۠ۗ;->ۙ(Ll/ۖۡۗ;Ll/ܽۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 215
    :pswitch_1
    check-cast p1, Ll/ܳۢۗ;

    invoke-virtual {p1}, Ll/ܳۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p1

    .line 216
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 217
    invoke-static {v1, p1}, Ll/ܽ۠ۗ;->ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 204
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
