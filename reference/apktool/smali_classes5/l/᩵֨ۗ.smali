.class public final Ll/᩵֨ۗ;
.super Ll/ܺ֨ۗ;
.source "9IST"

# interfaces
.implements Ll/ۗ֨ۗ;


# instance fields
.field public ۢ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֫֨ۗ;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ll/ܺ֨ۗ;-><init>()V

    .line 11
    iput-object p2, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    .line 12
    iput-object p1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 45
    :cond_0
    instance-of v0, p1, Ll/᩵֨ۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 48
    :cond_1
    iget-object v0, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    check-cast p1, Ll/᩵֨ۗ;

    iget-object p1, p1, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۠()Ll/ܺ֨ۗ;
    .locals 3

    .line 32
    new-instance v0, Ll/᩵֨ۗ;

    iget-object v1, p0, Ll/᩵֨ۗ;->ۢ:Ljava/lang/String;

    iget-object v2, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-direct {v0, v2, v1}, Ll/᩵֨ۗ;-><init>(Ll/֫֨ۗ;Ljava/lang/String;)V

    .line 323
    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 324
    iget-object v1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ll/ܺ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    return-object v0
.end method
