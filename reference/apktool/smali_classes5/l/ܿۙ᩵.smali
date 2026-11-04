.class public final synthetic Ll/ܿۙ᩵;
.super Ljava/lang/Object;
.source "A6I0"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܰ:Ll/ᩴ۠ۗ;

.field public final synthetic ᩶:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;Ll/ᩴ۠ۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܿۙ᩵;->ܰ:Ll/ᩴ۠ۗ;

    iput-object p1, p0, Ll/ܿۙ᩵;->᩶:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 2
    check-cast p1, Ll/ᩴ۠ۗ;

    .line 708
    iget-object v0, p0, Ll/ܿۙ᩵;->ܰ:Ll/ᩴ۠ۗ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 711
    :cond_0
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ᩴ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ᩳۗ;

    .line 73
    iget-object v3, p0, Ll/ܿۙ᩵;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v0, v3, v2}, Ll/ᩴ۠ۗ;->ۙ(Ll/ۖۡۗ;Ll/֨ᩳۗ;)V

    goto :goto_0

    .line 712
    :cond_1
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ܽ()V

    const/4 p1, 0x1

    return p1
.end method
