.class public final synthetic Ll/֨ᩴ᩺;
.super Ljava/lang/Object;
.source "64JA"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨ᩴ᩺;->ܰ:I

    iput-object p2, p0, Ll/֨ᩴ᩺;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 7

    .line 2
    iget v0, p0, Ll/֨ᩴ᩺;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/֨ᩴ᩺;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩷᩻᩺;

    .line 11
    check-cast p1, Ljava/util/Map$Entry;

    .line 14
    invoke-static {v1, p1}, Ll/᩷᩻᩺;->ۙ(Ll/᩷᩻᩺;Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 18
    :pswitch_0
    check-cast v1, Lcom/google/android/material/color/utilities/TemperatureCache;

    .line 20
    check-cast p1, Lcom/google/android/material/color/utilities/Hct;

    .line 23
    invoke-static {v1, p1}, Lcom/google/android/material/color/utilities/TemperatureCache;->$r8$lambda$VKoHiU00a9ybz_sbHTTerV8DYaI(Lcom/google/android/material/color/utilities/TemperatureCache;Lcom/google/android/material/color/utilities/Hct;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 27
    :pswitch_1
    check-cast v1, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 29
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 32
    invoke-static {v1, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$flOmK91DuQNU6ZQSz7iP36OcNL0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;

    move-result-object p1

    return-object p1

    .line 36
    :pswitch_2
    check-cast v1, Ljava/lang/String;

    .line 38
    check-cast p1, Ljava/lang/String;

    .line 1309
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, ".java"

    aput-object v3, v2, v1

    const-string v3, ".jcod"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, ".jasm"

    const/4 v5, 0x2

    aput-object v3, v2, v5

    const-string v3, ".class"

    const/4 v5, 0x3

    aput-object v3, v2, v5

    .line 0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_0

    aget-object v6, v2, v5

    invoke-static {v6, v3, v6, v5, v4}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 359
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 360
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 361
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    .line 364
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1310
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    .line 1309
    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
