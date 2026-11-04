.class public final synthetic Ll/ܿۚ᩵;
.super Ljava/lang/Object;
.source "Z6H9"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ܰ:Ll/ᩳۚ᩵;

.field public final synthetic ᩶:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۚ᩵;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۚ᩵;->ܰ:Ll/ᩳۚ᩵;

    iput-object p2, p0, Ll/ܿۚ᩵;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    iget-object v0, p0, Ll/ܿۚ᩵;->ܰ:Ll/ᩳۚ᩵;

    iget-object v1, p0, Ll/ܿۚ᩵;->᩶:Ljava/util/ArrayList;

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۚ᩵;->ۙ(Ll/ᩳۚ᩵;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
