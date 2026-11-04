.class public final synthetic Ll/᩹ۖۗ;
.super Ljava/lang/Object;
.source "95VI"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/ۗۖۗ;

.field public final synthetic ᩶:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۖۗ;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۖۗ;->ܰ:Ll/ۗۖۗ;

    iput-object p2, p0, Ll/᩹ۖۗ;->᩶:Ljava/util/Map;

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
    check-cast p1, Ll/֫֨ۗ;

    .line 324
    iget-object v0, p0, Ll/᩹ۖۗ;->ܰ:Ll/ۗۖۗ;

    iget-object v1, p0, Ll/᩹ۖۗ;->᩶:Ljava/util/Map;

    invoke-virtual {v0, p1, v1}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
