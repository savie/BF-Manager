.class public final synthetic Ll/֫ܿ᩸;
.super Ljava/lang/Object;
.source "I6UD"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫ܿ᩸;->ܰ:I

    iput-object p2, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۗۖۗ;Ll/ۖۡۗ;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/֫ܿ᩸;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

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
    iget v0, p0, Ll/֫ܿ᩸;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ᩴᩳۘ;

    .line 290
    instance-of v1, p1, Ll/ܳᩳۘ;

    if-eqz v1, :cond_1

    check-cast p1, Ll/ܳᩳۘ;

    .line 291
    invoke-virtual {v0, p1}, Ll/ᩴᩳۘ;->ۙ(Ll/ܳᩳۘ;)Ll/ܺᩳۘ;

    move-result-object p1

    goto :goto_1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۖۡۗ;

    check-cast p1, Ll/֫֨ۗ;

    .line 198
    invoke-static {v0, p1}, Ll/ۗۖۗ;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    return-object p1

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩹ۖ᩸;

    check-cast p1, Ljava/lang/CharSequence;

    .line 241
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    :goto_0
    return-object p1

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/֫ܿ᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺܿ᩸;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0}, Ll/ܺܿ᩸;->ۙ(Ll/ܺܿ᩸;)Ll/᩷֡᩸;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
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
