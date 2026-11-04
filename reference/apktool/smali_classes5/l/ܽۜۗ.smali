.class public final synthetic Ll/ܽۜۗ;
.super Ljava/lang/Object;
.source "K6HV"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/᩺ۢۗ;

.field public final synthetic ᩶:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۢۗ;Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۜۗ;->ܰ:Ll/᩺ۢۗ;

    iput-object p2, p0, Ll/ܽۜۗ;->᩶:Ljava/util/Set;

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

    .line 277
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    iget-object v1, p0, Ll/ܽۜۗ;->ܰ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    .line 278
    check-cast p1, Ll/ۗۢۗ;

    invoke-virtual {p1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ᩳۗ;

    .line 279
    iget-object v0, p0, Ll/ܽۜۗ;->᩶:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 280
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
