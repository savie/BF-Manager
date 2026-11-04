.class public final Ll/ۚۢۗ;
.super Ll/ᩳۡۗ;
.source "JIT5"


# instance fields
.field public final ۡ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 11
    sget-object v0, Ll/᩺ۢۗ;->ۙۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 12
    iput-object p1, p0, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getString()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ll/ۨۧ᩵;->ۙ()Ll/ۨۧ᩵;

    move-result-object v1

    iget-object v2, p0, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۨۧ᩵;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 21
    new-instance v0, Ll/ۚۢۗ;

    iget-object v1, p0, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

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
    instance-of v0, p1, Ll/ۚۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 32
    :cond_1
    check-cast p1, Ll/ۚۢۗ;

    .line 33
    iget-object v0, p0, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۚۢۗ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
