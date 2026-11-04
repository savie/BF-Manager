.class public final Ll/ۡ᩶ۗ;
.super Ljava/lang/Object;
.source "AIT2"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final ܰ:Ljava/util/function/Function;

.field public ᩶:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡ᩶ۗ;->᩶:Ljava/util/List;

    .line 15
    iput-object p1, p0, Ll/ۡ᩶ۗ;->ܰ:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 25
    iget-object v0, p0, Ll/ۡ᩶ۗ;->᩶:Ljava/util/List;

    iget-object v1, p0, Ll/ۡ᩶ۗ;->ܰ:Ljava/util/function/Function;

    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۡ᩶ۗ;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 1

    if-nez p1, :cond_0

    .line 20
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Ll/ۡ᩶ۗ;->᩶:Ljava/util/List;

    return-void
.end method
