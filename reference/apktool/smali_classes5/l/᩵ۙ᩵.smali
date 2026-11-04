.class public final synthetic Ll/᩵ۙ᩵;
.super Ljava/lang/Object;
.source "V6HP"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۙ᩵;->ܰ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/֫֨ۗ;

    .line 105
    new-instance v0, Ll/᩻᩵ᩴ;

    const/4 v1, 0x2

    iget-object v2, p0, Ll/᩵ۙ᩵;->ܰ:Ljava/util/HashSet;

    invoke-direct {v0, v1, v2}, Ll/᩻᩵ᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/֫֨ۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
