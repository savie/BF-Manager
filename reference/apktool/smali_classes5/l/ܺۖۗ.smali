.class public final synthetic Ll/ܺۖۗ;
.super Ljava/lang/Object;
.source "95VI"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ljava/util/Collection;

.field public final synthetic ܿ:Ll/֫֨ۗ;

.field public final synthetic ᩶:Ll/ۨᩳۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨᩳۗ;Ll/֫֨ۗ;Ljava/util/Collection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ܺۖۗ;->ܰ:Ljava/util/Collection;

    iput-object p1, p0, Ll/ܺۖۗ;->᩶:Ll/ۨᩳۗ;

    iput-object p2, p0, Ll/ܺۖۗ;->ܿ:Ll/֫֨ۗ;

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
    .locals 4

    .line 2
    check-cast p1, Ll/֫֨ۗ;

    .line 93
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    .line 95
    iget-object v1, p0, Ll/ܺۖۗ;->ܰ:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 96
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 97
    invoke-virtual {v2}, Ll/֫֨ۗ;->ۚ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫֨ۗ;->ۙ(Ljava/util/List;)V

    goto :goto_0

    .line 101
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unknown type variable: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " in type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ܺۖۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܺۖۗ;->᩶:Ll/ۨᩳۗ;

    invoke-virtual {v0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_2
    :goto_0
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
