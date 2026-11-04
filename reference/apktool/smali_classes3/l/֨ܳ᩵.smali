.class public final Ll/֨ܳ᩵;
.super Ljava/lang/Object;
.source "H6EJ"

# interfaces
.implements Ll/ۨܳ᩵;


# instance fields
.field public final ۙ:Ll/ۛ֨ۗ;

.field public final ۤ:Ll/ܳۢۗ;

.field public final ᩷:Ll/֫֨ۗ;

.field public final ᩸:Ll/֫ۖۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;Ll/ܳۢۗ;Ll/ۛ֨ۗ;Ll/֫֨ۗ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/֨ܳ᩵;->᩸:Ll/֫ۖۗ;

    .line 20
    iput-object p2, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    .line 21
    iput-object p3, p0, Ll/֨ܳ᩵;->ۙ:Ll/ۛ֨ۗ;

    .line 22
    iput-object p4, p0, Ll/֨ܳ᩵;->᩷:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 58
    const-class v0, Ll/֨ܳ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 61
    :cond_1
    check-cast p1, Ll/֨ܳ᩵;

    .line 62
    iget-object v0, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    iget-object p1, p1, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 4

    .line 37
    iget-object v0, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    invoke-virtual {v0}, Ll/ܳۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    iget-object v1, p0, Ll/֨ܳ᩵;->ۙ:Ll/ۛ֨ۗ;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    .line 41
    iget-object v2, p0, Ll/֨ܳ᩵;->᩸:Ll/֫ۖۗ;

    invoke-virtual {v2}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v2

    iget-object v3, p0, Ll/֨ܳ᩵;->᩷:Ll/֫֨ۗ;

    .line 166
    invoke-virtual {v2, v0, v0, v3}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final hashCode()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InvokeAssign{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    invoke-virtual {v1}, Ll/ܳۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", argType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֨ܳ᩵;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", currentType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {p0}, Ll/֨ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", instanceArg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-virtual {v1}, Ll/ܳۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۜ۫᩵;)Ll/֫֨ۗ;
    .locals 3

    .line 32
    iget-object v0, p0, Ll/֨ܳ᩵;->ۤ:Ll/ܳۢۗ;

    invoke-virtual {v0}, Ll/ܳۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۜ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    iget-object v1, p0, Ll/֨ܳ᩵;->ۙ:Ll/ۛ֨ۗ;

    invoke-virtual {p1, v1}, Ll/ۜ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    .line 41
    iget-object v1, p0, Ll/֨ܳ᩵;->᩸:Ll/֫ۖۗ;

    invoke-virtual {v1}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v1

    iget-object v2, p0, Ll/֨ܳ᩵;->᩷:Ll/֫֨ۗ;

    .line 166
    invoke-virtual {v1, v0, v0, v2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public final ۙ()Ll/ܳܳ᩵;
    .locals 1

    .line 27
    sget-object v0, Ll/ܳܳ᩵;->ܿ:Ll/ܳܳ᩵;

    return-object v0
.end method
