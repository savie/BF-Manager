.class public final Ll/ۢܳ᩵;
.super Ljava/lang/Object;
.source "LIYL"

# interfaces
.implements Ll/ۨܳ᩵;


# instance fields
.field public final ۙ:Ll/֫֨ۗ;

.field public final ۤ:Ll/֫ۖۗ;

.field public final ᩷:Ll/᩶ۢۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;Ll/᩶ۢۗ;Ll/֫֨ۗ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۢܳ᩵;->ۤ:Ll/֫ۖۗ;

    .line 24
    iput-object p2, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    .line 25
    iput-object p3, p0, Ll/ۢܳ᩵;->ۙ:Ll/֫֨ۗ;

    return-void
.end method

.method private ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;
    .locals 4

    .line 45
    iget-object v0, p0, Ll/ۢܳ᩵;->ۤ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v1

    iget-object v2, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    invoke-virtual {v1, v2}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 48
    invoke-interface {v1}, Ll/᩶ۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    .line 52
    :goto_0
    invoke-virtual {v0}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v0

    iget-object v3, p0, Ll/ۢܳ᩵;->ۙ:Ll/֫֨ۗ;

    invoke-virtual {v0, p1, v1, v3}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1}, Ll/֫֨ۗ;->֡()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩵()Ll/֫֨ۗ;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_3

    return-object p1

    .line 57
    :cond_3
    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 85
    const-class v0, Ll/ۢܳ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 88
    :cond_1
    check-cast p1, Ll/ۢܳ᩵;

    .line 89
    iget-object v0, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    iget-object p1, p1, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۢܳ᩵;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InvokeAssign{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    invoke-virtual {v1}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", returnType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۢܳ᩵;->ۙ:Ll/֫֨ۗ;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", currentType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {p0}, Ll/ۢܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", instanceArg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    .line 72
    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۜ۫᩵;)Ll/֫֨ۗ;
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۢܳ᩵;->᩷:Ll/᩶ۢۗ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Ll/ۜ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۢܳ᩵;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ll/ܳܳ᩵;
    .locals 1

    .line 30
    sget-object v0, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    return-object v0
.end method
