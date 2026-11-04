.class public final synthetic Ll/۠ᩴ᩵;
.super Ljava/lang/Object;
.source "UIVK"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ᩴ᩵;->ܰ:Ljava/lang/String;

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
    check-cast p1, Ll/ܺ֨ۗ;

    .line 187
    instance-of v0, p1, Ll/ۗ֨ۗ;

    if-eqz v0, :cond_0

    .line 188
    move-object v0, p1

    check-cast v0, Ll/ۗ֨ۗ;

    invoke-interface {v0}, Ll/ۗ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 189
    iget-object v1, p0, Ll/۠ᩴ᩵;->ܰ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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
