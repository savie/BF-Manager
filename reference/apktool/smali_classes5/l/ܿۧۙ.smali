.class public final Ll/ܿۧۙ;
.super Ljava/lang/Object;
.source "J6G6"

# interfaces
.implements Ll/᩸ۢ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֫ۢ᩷;)V
    .locals 5

    .line 78
    instance-of v0, p1, Ll/ۗܺۙ;

    if-eqz v0, :cond_3

    .line 82
    move-object v0, p1

    check-cast v0, Ll/ۗܺۙ;

    invoke-interface {v0}, Ll/ۗܺۙ;->getViewModelStore()Ll/᩹ܺۙ;

    move-result-object v0

    .line 83
    invoke-interface {p1}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v1

    .line 84
    invoke-virtual {v0}, Ll/᩹ܺۙ;->᩷()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 85
    invoke-virtual {v0, v3}, Ll/᩹ܺۙ;->ۙ(Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v4

    invoke-static {v3, v1, v4}, Ll/۟ۧۙ;->ۙ(Ll/۫ܺۙ;Ll/ܳۢ᩷;Ll/۠ۧۙ;)V

    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {v0}, Ll/᩹ܺۙ;->᩷()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 89
    invoke-virtual {v1}, Ll/ܳۢ᩷;->᩷()V

    :cond_2
    return-void

    .line 79
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 78
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
