.class public final Ll/ۙܺۙ;
.super Ljava/lang/Object;
.source "MANZ"


# static fields
.field public static final ۙ:Ll/۬᩻ۙ;

.field public static final ۤ:Ll/ۜ᩻ۙ;

.field public static final ᩷:Ll/۠᩻ۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 68
    new-instance v0, Ll/۠᩻ۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 230
    sput-object v0, Ll/ۙܺۙ;->᩷:Ll/۠᩻ۙ;

    .line 68
    new-instance v0, Ll/ۜ᩻ۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 235
    sput-object v0, Ll/ۙܺۙ;->ۤ:Ll/ۜ᩻ۙ;

    .line 68
    new-instance v0, Ll/۬᩻ۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 239
    sput-object v0, Ll/ۙܺۙ;->ۙ:Ll/۬᩻ۙ;

    return-void
.end method

.method public static final ۙ(Ll/ۘܺۙ;)Ll/ۢ᩻ۙ;
    .locals 6

    .line 94
    sget-object v0, Ll/ۙܺۙ;->᩷:Ll/۠᩻ۙ;

    .line 107
    invoke-virtual {p0}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 94
    check-cast v0, Ll/֫ۢ᩷;

    if-eqz v0, :cond_8

    .line 99
    sget-object v1, Ll/ۙܺۙ;->ۤ:Ll/ۜ᩻ۙ;

    .line 107
    invoke-virtual {p0}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 99
    check-cast v1, Ll/ۗܺۙ;

    if-eqz v1, :cond_7

    .line 104
    sget-object v2, Ll/ۙܺۙ;->ۙ:Ll/۬᩻ۙ;

    .line 107
    invoke-virtual {p0}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 104
    check-cast v2, Landroid/os/Bundle;

    .line 106
    sget-object v3, Ll/ܶܺۙ;->᩷:Ll/ܽܺۙ;

    .line 107
    invoke-virtual {p0}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 106
    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_6

    .line 135
    invoke-interface {v0}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۢ᩷;->ۙ()Ll/ᩴۢ᩷;

    move-result-object v0

    instance-of v3, v0, Ll/᩷ܺۙ;

    if-eqz v3, :cond_0

    check-cast v0, Ll/᩷ܺۙ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    .line 69
    invoke-static {v1}, Ll/ۙܺۙ;->ۙ(Ll/ۗܺۙ;)Ll/ۤܺۙ;

    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ll/ۤܺۙ;->᩸()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ᩻ۙ;

    if-nez v3, :cond_4

    .line 74
    invoke-virtual {v0, p0}, Ll/᩷ܺۙ;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-nez v2, :cond_2

    .line 209
    new-instance v0, Ll/ۢ᩻ۙ;

    invoke-direct {v0}, Ll/ۢ᩻ۙ;-><init>()V

    goto :goto_3

    .line 215
    :cond_2
    const-class v0, Ll/ۢ᩻ۙ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 804
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v0

    .line 51
    new-instance v3, Ll/ܰᩳ᩵;

    invoke-direct {v3, v0}, Ll/ܰᩳ᩵;-><init>(I)V

    .line 805
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 806
    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ll/ܰᩳ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 57
    :cond_3
    invoke-virtual {v3}, Ll/ܰᩳ᩵;->ۙ()Ll/ܰᩳ᩵;

    move-result-object v0

    .line 217
    new-instance v2, Ll/ۢ᩻ۙ;

    invoke-direct {v2, v0}, Ll/ۢ᩻ۙ;-><init>(Ll/ܰᩳ᩵;)V

    move-object v0, v2

    .line 75
    :goto_3
    invoke-virtual {v1}, Ll/ۤܺۙ;->᩸()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_4
    return-object v3

    .line 136
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 107
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 100
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 95
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۙ(Ll/ۗܺۙ;)Ll/ۤܺۙ;
    .locals 3

    .line 123
    new-instance v0, Ll/ۖ᩻ۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    instance-of v1, p0, Ll/᩶ۧۙ;

    if-eqz v1, :cond_0

    .line 73
    move-object v1, p0

    check-cast v1, Ll/᩶ۧۙ;

    invoke-interface {v1}, Ll/᩶ۧۙ;->getDefaultViewModelCreationExtras()Ll/᩺ܺۙ;

    move-result-object v1

    goto :goto_0

    .line 75
    :cond_0
    sget-object v1, Ll/ۛܺۙ;->᩷:Ll/ۛܺۙ;

    :goto_0
    const-string v2, "extras"

    .line 0
    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    new-instance v2, Ll/ܶܺۙ;

    invoke-interface {p0}, Ll/ۗܺۙ;->getViewModelStore()Ll/᩹ܺۙ;

    move-result-object p0

    invoke-direct {v2, p0, v0, v1}, Ll/ܶܺۙ;-><init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V

    .line 131
    const-class p0, Ll/ۤܺۙ;

    invoke-static {p0}, Ll/ܺۡ᩵;->ۙ(Ljava/lang/Class;)Ll/۬֨᩵;

    move-result-object p0

    .line 120
    invoke-virtual {v2, p0}, Ll/ܶܺۙ;->ۙ(Ll/۬֨᩵;)Ll/۫ܺۙ;

    move-result-object p0

    check-cast p0, Ll/ۤܺۙ;

    return-object p0
.end method

.method public static final ۙ(Ll/֫ۢ᩷;)V
    .locals 3

    .line 50
    invoke-interface {p0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    .line 51
    sget-object v1, Ll/ۖۧۙ;->۟:Ll/ۖۧۙ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ۖۧۙ;->ܿ:Ll/ۖۧۙ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 55
    :cond_1
    :goto_0
    invoke-interface {p0}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۢ᩷;->ۙ()Ll/ᩴۢ᩷;

    move-result-object v0

    if-nez v0, :cond_2

    .line 56
    new-instance v0, Ll/᩷ܺۙ;

    invoke-interface {p0}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Ll/ۗܺۙ;

    invoke-direct {v0, v1, v2}, Ll/᩷ܺۙ;-><init>(Ll/ܳۢ᩷;Ll/ۗܺۙ;)V

    .line 57
    invoke-interface {p0}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Ll/ܳۢ᩷;->ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V

    .line 58
    invoke-interface {p0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    new-instance v1, Ll/֨᩻ۙ;

    invoke-direct {v1, v0}, Ll/֨᩻ۙ;-><init>(Ll/᩷ܺۙ;)V

    invoke-virtual {p0, v1}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    :cond_2
    return-void
.end method
