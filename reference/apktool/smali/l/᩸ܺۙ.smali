.class public final Ll/᩸ܺۙ;
.super Ll/ܺܺۙ;
.source "K6EA"

# interfaces
.implements Ll/ۧܺۙ;


# instance fields
.field public ۙ:Landroid/app/Application;

.field public final ۤ:Ll/֫ܺۙ;

.field public ᩴ:Ll/ܳۢ᩷;

.field public ᩷:Landroid/os/Bundle;

.field public ᩸:Ll/۠ۧۙ;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ll/֫ۢ᩷;Landroid/os/Bundle;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ll/ܺܺۙ;-><init>()V

    .line 102
    invoke-interface {p2}, Ll/֫ۢ᩷;->getSavedStateRegistry()Ll/ܳۢ᩷;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܺۙ;->ᩴ:Ll/ܳۢ᩷;

    .line 103
    invoke-interface {p2}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p2

    iput-object p2, p0, Ll/᩸ܺۙ;->᩸:Ll/۠ۧۙ;

    .line 104
    iput-object p3, p0, Ll/᩸ܺۙ;->᩷:Landroid/os/Bundle;

    .line 105
    iput-object p1, p0, Ll/᩸ܺۙ;->ۙ:Landroid/app/Application;

    if-eqz p1, :cond_1

    .line 323
    invoke-static {}, Ll/֫ܺۙ;->ۙ()Ll/֫ܺۙ;

    move-result-object p2

    if-nez p2, :cond_0

    .line 324
    new-instance p2, Ll/֫ܺۙ;

    invoke-direct {p2, p1}, Ll/֫ܺۙ;-><init>(Landroid/app/Application;)V

    invoke-static {p2}, Ll/֫ܺۙ;->ۙ(Ll/֫ܺۙ;)V

    .line 326
    :cond_0
    invoke-static {}, Ll/֫ܺۙ;->ۙ()Ll/֫ܺۙ;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    goto :goto_0

    .line 108
    :cond_1
    new-instance p1, Ll/֫ܺۙ;

    invoke-direct {p1}, Ll/֫ܺۙ;-><init>()V

    .line 106
    :goto_0
    iput-object p1, p0, Ll/᩸ܺۙ;->ۤ:Ll/֫ܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;
    .locals 1

    .line 230
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {p0, p1, v0}, Ll/᩸ܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 231
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Class;Ljava/lang/String;)Ll/۫ܺۙ;
    .locals 6

    .line 182
    iget-object v0, p0, Ll/᩸ܺۙ;->᩸:Ll/۠ۧۙ;

    if-eqz v0, :cond_5

    .line 187
    const-class v1, Ll/ܽۧۙ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    .line 189
    iget-object v2, p0, Ll/᩸ܺۙ;->ۙ:Landroid/app/Application;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 190
    invoke-static {}, Ll/ᩴܺۙ;->ۙ()Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    goto :goto_0

    .line 192
    :cond_0
    invoke-static {}, Ll/ᩴܺۙ;->᩷()Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_3

    if-eqz v2, :cond_1

    .line 198
    iget-object p2, p0, Ll/᩸ܺۙ;->ۤ:Ll/֫ܺۙ;

    invoke-virtual {p2, p1}, Ll/֫ܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 209
    :cond_1
    invoke-static {}, Ll/᩻ܺۙ;->ۙ()Ll/᩻ܺۙ;

    move-result-object p2

    if-nez p2, :cond_2

    .line 210
    new-instance p2, Ll/᩻ܺۙ;

    .line 181
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 210
    invoke-static {p2}, Ll/᩻ܺۙ;->ۙ(Ll/᩻ܺۙ;)V

    .line 212
    :cond_2
    invoke-static {}, Ll/᩻ܺۙ;->ۙ()Ll/᩻ܺۙ;

    move-result-object p2

    invoke-static {p2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 185
    invoke-static {p1}, Ll/ۨۤۤ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 202
    :cond_3
    iget-object v4, p0, Ll/᩸ܺۙ;->ᩴ:Ll/ܳۢ᩷;

    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 205
    iget-object v5, p0, Ll/᩸ܺۙ;->᩷:Landroid/os/Bundle;

    .line 201
    invoke-static {v4, v0, p2, v5}, Ll/۟ۧۙ;->ۙ(Ll/ܳۢ᩷;Ll/۠ۧۙ;Ljava/lang/String;Landroid/os/Bundle;)Ll/ۡ᩻ۙ;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    .line 209
    invoke-virtual {p2}, Ll/ۡ᩻ۙ;->ۙ()Ll/ۢ᩻ۙ;

    move-result-object v1

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v4

    aput-object v1, v5, v0

    invoke-static {p1, v3, v5}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/۫ܺۙ;

    move-result-object p1

    goto :goto_1

    .line 211
    :cond_4
    invoke-virtual {p2}, Ll/ۡ᩻ۙ;->ۙ()Ll/ۢ᩻ۙ;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v4

    invoke-static {p1, v3, v0}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/۫ܺۙ;

    move-result-object p1

    .line 213
    :goto_1
    invoke-virtual {p1, p2}, Ll/۫ܺۙ;->ۙ(Ll/ۡ᩻ۙ;)V

    return-object p1

    .line 183
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;
    .locals 5

    .line 123
    sget-object v0, Ll/ܶܺۙ;->᩷:Ll/ܽܺۙ;

    .line 107
    invoke-virtual {p2}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 123
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 129
    sget-object v1, Ll/ۙܺۙ;->᩷:Ll/۠᩻ۙ;

    .line 107
    invoke-virtual {p2}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 130
    sget-object v1, Ll/ۙܺۙ;->ۤ:Ll/ۜ᩻ۙ;

    .line 107
    invoke-virtual {p2}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 132
    sget-object v0, Ll/֫ܺۙ;->ۤ:Ll/ۚܺۙ;

    .line 107
    invoke-virtual {p2}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 132
    check-cast v0, Landroid/app/Application;

    .line 133
    const-class v1, Ll/ܽۧۙ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {}, Ll/ᩴܺۙ;->ۙ()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 138
    :cond_0
    invoke-static {}, Ll/ᩴܺۙ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    .line 142
    iget-object v0, p0, Ll/᩸ܺۙ;->ۤ:Ll/֫ܺۙ;

    invoke-virtual {v0, p1, p2}, Ll/֫ܺۙ;->ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 150
    invoke-static {p2}, Ll/ۙܺۙ;->ۙ(Ll/ۘܺۙ;)Ll/ۢ᩻ۙ;

    move-result-object p2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v4

    aput-object p2, v1, v3

    .line 146
    invoke-static {p1, v2, v1}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 153
    :cond_2
    invoke-static {p2}, Ll/ۙܺۙ;->ۙ(Ll/ۘܺۙ;)Ll/ۢ᩻ۙ;

    move-result-object p2

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p2, v0, v4

    invoke-static {p1, v2, v0}, Ll/ᩴܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 158
    :cond_3
    iget-object p2, p0, Ll/᩸ܺۙ;->᩸:Ll/۠ۧۙ;

    if-eqz p2, :cond_4

    .line 159
    invoke-virtual {p0, p1, v0}, Ll/᩸ܺۙ;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 161
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/۬֨᩵;Ll/ۘܺۙ;)Ll/۫ܺۙ;
    .locals 0

    .line 112
    invoke-static {p1}, Ll/ۙ֨ܺ;->ۙ(Ll/۬֨᩵;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/᩸ܺۙ;->ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/۫ܺۙ;)V
    .locals 2

    .line 241
    iget-object v0, p0, Ll/᩸ܺۙ;->᩸:Ll/۠ۧۙ;

    if-eqz v0, :cond_0

    .line 244
    iget-object v1, p0, Ll/᩸ܺۙ;->ᩴ:Ll/ܳۢ᩷;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 242
    invoke-static {p1, v1, v0}, Ll/۟ۧۙ;->ۙ(Ll/۫ܺۙ;Ll/ܳۢ᩷;Ll/۠ۧۙ;)V

    :cond_0
    return-void
.end method
