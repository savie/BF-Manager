.class public final Ll/ۗۢۗ;
.super Ll/ᩳۡۗ;
.source "3IVQ"


# instance fields
.field public ۡ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p3}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 16
    iput-object p2, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 50
    sget-object v0, Ll/᩹ۢۗ;->ۙ:[I

    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    const/16 v3, 0x20

    if-eq v0, v2, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    iget v2, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v2}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 57
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x28

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v1

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 24
    iput-object p1, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    return-void
.end method

.method public final ۛۙ()Ll/֫֨ۗ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    check-cast v0, Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 4

    .line 33
    new-instance v0, Ll/ۗۢۗ;

    iget-object v1, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    iget-object v3, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    invoke-direct {v0, v3, v1, v2}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 41
    :cond_0
    instance-of v0, p1, Ll/ۗۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 44
    :cond_1
    check-cast p1, Ll/ۗۢۗ;

    .line 45
    iget-object v0, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵ۙ()Ljava/lang/Object;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۗۢۗ;->ۡ:Ljava/lang/Object;

    return-object v0
.end method
