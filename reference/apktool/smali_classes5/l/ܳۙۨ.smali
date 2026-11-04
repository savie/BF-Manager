.class public final Ll/ܳۙۨ;
.super Ll/ۡ۬᩵;
.source "M96R"


# instance fields
.field public final ᩻:Ll/ᩳ۬᩵;


# direct methods
.method public constructor <init>(ILl/ᩳ۬᩵;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Ll/ۡ۬᩵;-><init>(I)V

    .line 20
    iput-object p2, p0, Ll/ܳۙۨ;->᩻:Ll/ᩳ۬᩵;

    .line 24
    sget-object v0, Ll/ᩳ۬᩵;->۟:Ll/ᩳ۬᩵;

    if-eq p2, v0, :cond_1

    const/4 p2, 0x1

    if-lt p1, p2, :cond_0

    return-void

    :cond_0
    const-string p2, "Buffered channel capacity must be at least 1, but "

    const-string v0, " was specified"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 27
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "This implementation does not support suspension for senders, use "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class p2, Ll/ۡ۬᩵;

    invoke-static {p2}, Ll/ܺۡ᩵;->ۙ(Ljava/lang/Class;)Ll/۬֨᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/۬֨᩵;->ۤ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " instead"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final ۙ(Ll/۬᩷ۤ;)Ljava/lang/Object;
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ܳۙۨ;->᩻:Ll/ᩳ۬᩵;

    sget-object v1, Ll/ᩳ۬᩵;->ܿ:Ll/ᩳ۬᩵;

    if-ne v0, v1, :cond_2

    .line 61
    invoke-super {p0, p1}, Ll/ۡ۬᩵;->ۙ(Ll/۬᩷ۤ;)Ljava/lang/Object;

    move-result-object p1

    .line 422
    instance-of v0, p1, Ll/ۙۙۨ;

    if-eqz v0, :cond_1

    .line 444
    instance-of v0, p1, Ll/۬۬᩵;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    :cond_1
    :goto_0
    return-object p1

    .line 57
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۡ۬᩵;->᩷(Ll/۬᩷ۤ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ᩴ()Z
    .locals 2

    .line 33
    iget-object v0, p0, Ll/ܳۙۨ;->᩻:Ll/ᩳ۬᩵;

    sget-object v1, Ll/ᩳ۬᩵;->֡:Ll/ᩳ۬᩵;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
