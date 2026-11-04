.class public final Ll/ܳ᩹ܳ;
.super Ljava/lang/Object;
.source "YIWY"


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ۤ:Landroid/os/Bundle;

.field public final ᩷:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/ܺ᩹ܳ;Landroid/os/Bundle;)V
    .locals 4

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Ll/ܺ᩹ܳ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻᩹ܳ;

    new-instance v3, Ll/ᩴ᩹ܳ;

    invoke-direct {v3, v2}, Ll/ᩴ᩹ܳ;-><init>(Ll/᩻᩹ܳ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    .line 39
    iget-object p1, p1, Ll/ܺ᩹ܳ;->ۤ:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩹ܳ;->᩷:Ljava/util/Set;

    .line 41
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Ll/ܳ᩹ܳ;->ۤ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final ۙ(D)V
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ܳ᩹ܳ;->ۤ:Landroid/os/Bundle;

    const-string v1, "capture_to_parsed_ms"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    return-void
.end method
