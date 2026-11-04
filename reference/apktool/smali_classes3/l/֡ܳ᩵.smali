.class public final Ll/֡ܳ᩵;
.super Ljava/lang/Object;
.source "HIUX"

# interfaces
.implements Ll/ۨܳ᩵;


# instance fields
.field public final ۙ:Ll/ۗۢۗ;

.field public final ᩷:Ll/֫ۖۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;Ll/ۗۢۗ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/֡ܳ᩵;->᩷:Ll/֫ۖۗ;

    .line 20
    iput-object p2, p0, Ll/֡ܳ᩵;->ۙ:Ll/ۗۢۗ;

    return-void
.end method


# virtual methods
.method public final getType()Ll/֫֨ۗ;
    .locals 3

    const/4 v0, 0x0

    .line 35
    iget-object v1, p0, Ll/֡ܳ᩵;->ۙ:Ll/ۗۢۗ;

    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    .line 39
    invoke-virtual {v1}, Ll/ۗۢۗ;->ۛۙ()Ll/֫֨ۗ;

    move-result-object v1

    .line 40
    iget-object v2, p0, Ll/֡ܳ᩵;->᩷:Ll/֫ۖۗ;

    invoke-virtual {v2}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ll/ۜܳ᩵;->۫()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CHECK_CAST_ASSIGN{("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡ܳ᩵;->ۙ:Ll/ۗۢۗ;

    invoke-virtual {v1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۜ۫᩵;)Ll/֫֨ۗ;
    .locals 2

    const/4 v0, 0x0

    .line 30
    iget-object v1, p0, Ll/֡ܳ᩵;->ۙ:Ll/ۗۢۗ;

    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۜ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    .line 39
    invoke-virtual {v1}, Ll/ۗۢۗ;->ۛۙ()Ll/֫֨ۗ;

    move-result-object v0

    .line 40
    iget-object v1, p0, Ll/֡ܳ᩵;->᩷:Ll/֫ۖۗ;

    invoke-virtual {v1}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ll/ۜܳ᩵;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۙ()Ll/ܳܳ᩵;
    .locals 1

    .line 25
    sget-object v0, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    return-object v0
.end method

.method public final ᩷()Ll/ۗۢۗ;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/֡ܳ᩵;->ۙ:Ll/ۗۢۗ;

    return-object v0
.end method
