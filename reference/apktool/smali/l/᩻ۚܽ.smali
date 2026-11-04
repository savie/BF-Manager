.class public final Ll/᩻ۚܽ;
.super Ll/֡ܳܽ;
.source "F5KS"


# instance fields
.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;I)V
    .locals 0

    .line 999
    iput-object p1, p0, Ll/᩻ۚܽ;->᩶:Ljava/lang/Iterable;

    iput p2, p0, Ll/᩻ۚܽ;->ܿ:I

    invoke-direct {p0}, Ll/֡ܳܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1002
    iget-object v0, p0, Ll/᩻ۚܽ;->᩶:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    iget v1, p0, Ll/᩻ۚܽ;->ܿ:I

    if-ltz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "limit is negative"

    invoke-static {v3, v2}, Ll/ۨۙܽ;->ۙ(Ljava/lang/String;Z)V

    .line 956
    new-instance v2, Ll/᩵ۚܽ;

    invoke-direct {v2, v1, v0}, Ll/᩵ۚܽ;-><init>(ILjava/util/Iterator;)V

    return-object v2
.end method
