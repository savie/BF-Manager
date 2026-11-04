.class public final Ll/ܶܺۙ;
.super Ljava/lang/Object;
.source "195U"


# static fields
.field public static final ᩷:Ll/ܽܺۙ;


# instance fields
.field public final ۙ:Ll/ܰܺۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 68
    new-instance v0, Ll/ܽܺۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 353
    sput-object v0, Ll/ܶܺۙ;->᩷:Ll/ܽܺۙ;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺۙ;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-interface {p1}, Ll/ۗܺۙ;->getViewModelStore()Ll/᩹ܺۙ;

    move-result-object v0

    .line 65
    instance-of v1, p1, Ll/᩶ۧۙ;

    if-eqz v1, :cond_0

    .line 66
    move-object v2, p1

    check-cast v2, Ll/᩶ۧۙ;

    invoke-interface {v2}, Ll/᩶ۧۙ;->getDefaultViewModelProviderFactory()Ll/ۧܺۙ;

    move-result-object v2

    goto :goto_0

    .line 69
    :cond_0
    sget-object v2, Ll/᩶ܺۙ;->ۙ:Ll/᩶ܺۙ;

    :goto_0
    if-eqz v1, :cond_1

    .line 73
    check-cast p1, Ll/᩶ۧۙ;

    invoke-interface {p1}, Ll/᩶ۧۙ;->getDefaultViewModelCreationExtras()Ll/᩺ܺۙ;

    move-result-object p1

    goto :goto_1

    .line 75
    :cond_1
    sget-object p1, Ll/ۛܺۙ;->᩷:Ll/ۛܺۙ;

    .line 66
    :goto_1
    invoke-direct {p0, v0, v2, p1}, Ll/ܶܺۙ;-><init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-object v0, Ll/ۛܺۙ;->᩷:Ll/ۛܺۙ;

    .line 48
    invoke-direct {p0, p1, p2, v0}, Ll/ܶܺۙ;-><init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    new-instance v0, Ll/ܰܺۙ;

    invoke-direct {v0, p1, p2, p3}, Ll/ܰܺۙ;-><init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object v0, p0, Ll/ܶܺۙ;->ۙ:Ll/ܰܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;
    .locals 2

    .line 81
    invoke-static {p1}, Ll/ܺۡ᩵;->ۙ(Ljava/lang/Class;)Ll/۬֨᩵;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ll/۬֨᩵;->᩷()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    iget-object v1, p0, Ll/ܶܺۙ;->ۙ:Ll/ܰܺۙ;

    invoke-virtual {v1, p1, v0}, Ll/ܰܺۙ;->ۙ(Ll/۬֨᩵;Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/۬֨᩵;)Ll/۫ܺۙ;
    .locals 2

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 110
    iget-object v1, p0, Ll/ܶܺۙ;->ۙ:Ll/ܰܺۙ;

    invoke-virtual {v1, p1, v0}, Ll/ܰܺۙ;->ۙ(Ll/۬֨᩵;Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1
.end method
