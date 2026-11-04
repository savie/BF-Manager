.class public final Ll/ۙۢ᩷;
.super Ljava/lang/Object;
.source "Y6DO"

# interfaces
.implements Ll/ᩴۢ᩷;


# instance fields
.field public final ۙ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ll/ܳۢ᩷;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۙۢ᩷;->ۙ:Ljava/util/LinkedHashSet;

    const-string v0, "androidx.savedstate.Restarter"

    .line 81
    invoke-virtual {p1, v0, p0}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ll/᩷۟᩵;

    .line 37
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷۟᩵;

    invoke-static {v0}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object v0

    .line 85
    iget-object v1, p0, Ll/ۙۢ᩷;->ۙ:Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ll/۟۟᩵;->᩷(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 238
    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v1, v2

    :goto_0
    const-string v2, "classes_to_restore"

    .line 137
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۙۢ᩷;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
