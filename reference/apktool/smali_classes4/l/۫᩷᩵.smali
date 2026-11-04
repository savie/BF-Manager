.class public final synthetic Ll/۫᩷᩵;
.super Ljava/lang/Object;
.source "B6EY"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/᩷ۡۗ;

.field public final synthetic ᩶:Ll/᩷ۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩷᩵;->ܰ:Ll/᩷ۡۗ;

    iput-object p2, p0, Ll/۫᩷᩵;->᩶:Ll/᩷ۡۗ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/᩷ۡۗ;

    .line 419
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/۫᩷᩵;->ܰ:Ll/᩷ۡۗ;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 420
    iget-object v0, p0, Ll/۫᩷᩵;->᩶:Ll/᩷ۡۗ;

    invoke-static {p1, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 421
    invoke-static {p1, v1, v0}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 422
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩹ۙ()V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
