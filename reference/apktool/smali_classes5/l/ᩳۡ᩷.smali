.class public final Ll/ᩳۡ᩷;
.super Ll/۟ۡ᩷;
.source "K5ZM"


# instance fields
.field public final synthetic ۙ:Ll/ۢۡ᩷;

.field public final synthetic ᩷:Ll/ܰۗ;


# direct methods
.method public constructor <init>(Ll/ۢۡ᩷;Ll/ܰۗ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 286
    iput-object p1, p0, Ll/ᩳۡ᩷;->ۙ:Ll/ۢۡ᩷;

    iput-object p2, p0, Ll/ᩳۡ᩷;->᩷:Ll/ܰۗ;

    return-void
.end method


# virtual methods
.method public final onTransitionEnd(Ll/֡ۡ᩷;)V
    .locals 2

    .line 289
    iget-object v0, p0, Ll/ᩳۡ᩷;->ۙ:Ll/ۢۡ᩷;

    iget-object v0, v0, Ll/ۢۡ᩷;->ܰ:Landroid/view/ViewGroup;

    iget-object v1, p0, Ll/ᩳۡ᩷;->᩷:Ll/ܰۗ;

    invoke-virtual {v1, v0}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 290
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 291
    invoke-virtual {p1, p0}, Ll/֡ۡ᩷;->removeListener(Ll/ۨۡ᩷;)Ll/֡ۡ᩷;

    return-void
.end method
