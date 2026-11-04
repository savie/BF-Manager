.class public final Ll/۟ۢۗ;
.super Ll/ᩳۡۗ;
.source "EIYI"


# instance fields
.field public final ۡ:Ll/֫֨ۗ;


# direct methods
.method public constructor <init>(ILl/֫֨ۗ;)V
    .locals 1

    .line 11
    sget-object v0, Ll/᩺ۢۗ;->ۘۙ:Ll/᩺ۢۗ;

    invoke-direct {p0, v0, p1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 12
    iput-object p2, p0, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 3

    .line 37
    new-instance v0, Ll/۟ۢۗ;

    iget-object v1, p0, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    invoke-direct {v0, v2, v1}, Ll/۟ۢۗ;-><init>(ILl/֫֨ۗ;)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 28
    :cond_0
    instance-of v1, p1, Ll/۟ۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 31
    :cond_1
    check-cast p1, Ll/۟ۢۗ;

    .line 32
    iget-object v1, p0, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v2
.end method

.method public final ᩵ۙ()Ll/֫֨ۗ;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/۟ۢۗ;->ۡ:Ll/֫֨ۗ;

    return-object v0
.end method
