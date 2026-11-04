.class public final synthetic Ll/ۙ᩻᩵;
.super Ljava/lang/Object;
.source "B6FR"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:Ll/᩸᩻᩵;

.field public final synthetic ܿ:[B

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩻᩵;Ljava/lang/String;[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩻᩵;->ܰ:Ll/᩸᩻᩵;

    iput-object p2, p0, Ll/ۙ᩻᩵;->᩶:Ljava/lang/String;

    iput-object p3, p0, Ll/ۙ᩻᩵;->ܿ:[B

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
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۙ᩻᩵;->ܿ:[B

    check-cast p1, Ljava/lang/Integer;

    iget-object v1, p0, Ll/ۙ᩻᩵;->ܰ:Ll/᩸᩻᩵;

    iget-object v2, p0, Ll/ۙ᩻᩵;->᩶:Ljava/lang/String;

    invoke-static {v1, v2, v0, p1}, Ll/᩸᩻᩵;->ۙ(Ll/᩸᩻᩵;Ljava/lang/String;[BLjava/lang/Integer;)Ll/֫᩻᩵;

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
