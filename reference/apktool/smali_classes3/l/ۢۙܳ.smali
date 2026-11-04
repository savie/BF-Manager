.class public final Ll/ۢۙܳ;
.super Ljava/lang/Object;
.source "FIQP"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ܰ:I

.field public final synthetic ᩶:Ll/۬ۙܳ;


# direct methods
.method public constructor <init>(Ll/۬ۙܳ;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۙܳ;->᩶:Ll/۬ۙܳ;

    .line 84
    iget-object p1, p1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p1, Ll/ۙ۬ᩴ;->᩸:I

    :goto_0
    iput p1, p0, Ll/ۢۙܳ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 87
    new-instance v0, Ll/ᩳۙܳ;

    invoke-direct {v0, p0}, Ll/ᩳۙܳ;-><init>(Ll/ۢۙܳ;)V

    return-object v0
.end method
