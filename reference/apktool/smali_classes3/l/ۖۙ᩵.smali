.class public final synthetic Ll/ۖۙ᩵;
.super Ljava/lang/Object;
.source "A6I0"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙ᩵;->ܰ:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴ۠ۗ;

    .line 4
    check-cast p2, Ljava/util/List;

    .line 324
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 436
    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ܽ()V

    .line 437
    iget-object p2, p0, Ll/ۖۙ᩵;->ܰ:Ll/ۖۡۗ;

    invoke-virtual {p2}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object p1

    invoke-static {p2, p1}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    :cond_0
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
