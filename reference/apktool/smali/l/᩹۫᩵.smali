.class public final synthetic Ll/᩹۫᩵;
.super Ljava/lang/Object;
.source "B6I6"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/ۗۖۗ;

.field public final synthetic ܿ:Ljava/util/List;

.field public final synthetic ᩶:Ll/֫֨ۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۖۗ;Ll/֫֨ۗ;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۫᩵;->ܰ:Ll/ۗۖۗ;

    iput-object p2, p0, Ll/᩹۫᩵;->᩶:Ll/֫֨ۗ;

    iput-object p3, p0, Ll/᩹۫᩵;->ܿ:Ljava/util/List;

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
    check-cast p1, Ljava/lang/Integer;

    .line 445
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ll/᩹۫᩵;->ܿ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫֨ۗ;

    .line 166
    iget-object v0, p0, Ll/᩹۫᩵;->ܰ:Ll/ۗۖۗ;

    iget-object v1, p0, Ll/᩹۫᩵;->᩶:Ll/֫֨ۗ;

    invoke-virtual {v0, v1, v1, p1}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
