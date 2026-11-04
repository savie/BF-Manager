.class public final synthetic Ll/᩸ۙ᩵;
.super Ljava/lang/Object;
.source "M6E4"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ܰ:Ll/۫ۙ᩵;

.field public final synthetic ܿ:Ljava/util/HashMap;

.field public final synthetic ᩶:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۙ᩵;Ljava/util/HashSet;Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۙ᩵;->ܰ:Ll/۫ۙ᩵;

    iput-object p2, p0, Ll/᩸ۙ᩵;->᩶:Ljava/util/HashSet;

    iput-object p3, p0, Ll/᩸ۙ᩵;->ܿ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 0
    check-cast p1, Ll/᩻ۡۗ;

    check-cast p2, Ljava/util/List;

    iget-object v0, p0, Ll/᩸ۙ᩵;->ܰ:Ll/۫ۙ᩵;

    iget-object v1, p0, Ll/᩸ۙ᩵;->᩶:Ljava/util/HashSet;

    iget-object v2, p0, Ll/᩸ۙ᩵;->ܿ:Ljava/util/HashMap;

    invoke-static {v0, v1, v2, p1, p2}, Ll/۫ۙ᩵;->ۙ(Ll/۫ۙ᩵;Ljava/util/HashSet;Ljava/util/HashMap;Ll/᩻ۡۗ;Ljava/util/List;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
