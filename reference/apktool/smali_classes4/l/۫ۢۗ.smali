.class public final Ll/۫ۢۗ;
.super Ll/ᩳۡۗ;
.source "X6CE"


# instance fields
.field public final ۡ:Ll/֫֨ۗ;


# direct methods
.method public constructor <init>(Ll/֫֨ۗ;)V
    .locals 2

    .line 11
    sget-object v0, Ll/᩺ۢۗ;->۬:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 12
    iput-object p1, p0, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".class"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 21
    new-instance v0, Ll/۫ۢۗ;

    iget-object v1, p0, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    invoke-direct {v0, v1}, Ll/۫ۢۗ;-><init>(Ll/֫֨ۗ;)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 29
    :cond_0
    instance-of v0, p1, Ll/۫ۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 32
    :cond_1
    check-cast p1, Ll/۫ۢۗ;

    .line 33
    iget-object v0, p0, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵ۙ()Ll/֫֨ۗ;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/۫ۢۗ;->ۡ:Ll/֫֨ۗ;

    return-object v0
.end method
