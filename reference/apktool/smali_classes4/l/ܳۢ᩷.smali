.class public final Ll/ܳۢ᩷;
.super Ljava/lang/Object;
.source "M6BV"


# instance fields
.field public final ۙ:Ll/᩻ۢ᩷;

.field public ᩷:Ll/ۙۢ᩷;


# direct methods
.method public constructor <init>(Ll/᩻ۢ᩷;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ܳۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ܳۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0, p1}, Ll/᩻ۢ᩷;->ۙ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ll/ᩴۢ᩷;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ܳۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0}, Ll/᩻ۢ᩷;->ۙ()Ll/ᩴۢ᩷;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V
    .locals 1

    const-string v0, "provider"

    .line 5
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Ll/ܳۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۢ᩷;->ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V

    return-void
.end method

.method public final ᩷()V
    .locals 5

    .line 2
    const-class v0, Ll/ܿۧۙ;

    .line 83
    iget-object v1, p0, Ll/ܳۢ᩷;->ۙ:Ll/᩻ۢ᩷;

    invoke-virtual {v1}, Ll/᩻ۢ᩷;->᩷()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 86
    iget-object v1, p0, Ll/ܳۢ᩷;->᩷:Ll/ۙۢ᩷;

    if-nez v1, :cond_0

    new-instance v1, Ll/ۙۢ᩷;

    invoke-direct {v1, p0}, Ll/ۙۢ᩷;-><init>(Ll/ܳۢ᩷;)V

    :cond_0
    iput-object v1, p0, Ll/ܳۢ᩷;->᩷:Ll/ۙۢ᩷;

    const/4 v1, 0x0

    .line 88
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    iget-object v1, p0, Ll/ܳۢ᩷;->᩷:Ll/ۙۢ᩷;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۙۢ᩷;->ۙ(Ljava/lang/String;)V

    :cond_1
    return-void

    :catch_0
    move-exception v1

    .line 90
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 91
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Class "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 83
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
