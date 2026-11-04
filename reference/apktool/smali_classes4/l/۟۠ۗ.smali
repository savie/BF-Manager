.class public final synthetic Ll/۟۠ۗ;
.super Ljava/lang/Object;
.source "EIX3"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡۗ;

.field public final synthetic ᩶:[Z


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;[Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۠ۗ;->ܰ:Ll/ۖۡۗ;

    iput-object p2, p0, Ll/۟۠ۗ;->᩶:[Z

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
    .locals 3

    .line 2
    check-cast p1, Ll/ᩳۡۗ;

    .line 426
    instance-of v0, p1, Ll/ۜ֨ۗ;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll/ۜ֨ۗ;

    .line 427
    invoke-virtual {v0}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v0

    iget-object v1, p0, Ll/۟۠ۗ;->ܰ:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 428
    iget-object v1, p0, Ll/۟۠ۗ;->᩶:[Z

    const/4 v2, 0x0

    aput-boolean v0, v1, v2

    .line 429
    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    sget-object v0, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 429
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
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
