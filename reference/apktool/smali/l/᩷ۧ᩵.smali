.class public final synthetic Ll/᩷ۧ᩵;
.super Ljava/lang/Object;
.source "76EN"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۧ᩵;->ܰ:Ljava/util/function/Function;

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
    check-cast p1, Ll/ܽܿۗ;

    .line 33
    new-instance v0, Ll/ۧۧ᩵;

    iget-object v1, p0, Ll/᩷ۧ᩵;->ܰ:Ljava/util/function/Function;

    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۜۗ;

    invoke-interface {p1}, Ll/ܽܿۗ;->ۤ()Ll/ܶܿۗ;

    invoke-direct {v0, p1, v1}, Ll/ۧۧ᩵;-><init>(Ll/ܽܿۗ;Ll/۬ۜۗ;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
