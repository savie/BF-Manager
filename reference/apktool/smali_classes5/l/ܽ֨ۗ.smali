.class public final Ll/ܽ֨ۗ;
.super Ll/ܺ֨ۗ;
.source "VIV4"


# instance fields
.field public final ۢ:Ll/ᩳۡۗ;


# direct methods
.method public constructor <init>(Ll/ᩳۡۗ;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ll/ܺ֨ۗ;-><init>()V

    .line 19
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    :goto_0
    iput-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 21
    iput-object p1, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 71
    :cond_0
    instance-of v1, p1, Ll/ܽ֨ۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 74
    :cond_1
    check-cast p1, Ll/ܽ֨ۗ;

    .line 76
    iget-object p1, p1, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    .line 77
    iget-object v1, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    .line 80
    :cond_2
    invoke-virtual {v1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    .line 82
    invoke-virtual {v1, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    invoke-virtual {p1, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    return v2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 99
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۙۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ll/ۚۢۗ;

    invoke-virtual {v0}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 102
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(wrap "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۙۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ll/ۚۢۗ;

    invoke-virtual {v0}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 94
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(wrap "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ᩳۡۗ;)V
    .locals 3

    .line 36
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    if-eq p1, v0, :cond_0

    .line 39
    iput-object p1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t wrap instruction info itself: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 37
    throw v0
.end method

.method public final ۠()Ll/ܺ֨ۗ;
    .locals 3

    .line 459
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 46
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v2, Ll/֫۟ۗ;->ۗۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 48
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 49
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 51
    :cond_0
    new-instance v0, Ll/ܽ֨ۗ;

    invoke-direct {v0, v1}, Ll/ܽ֨ۗ;-><init>(Ll/ᩳۡۗ;)V

    .line 52
    iget-object v1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 14
    iput-object v1, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 323
    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 324
    iget-object v1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ll/ܽ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ۧۙ()Ll/ᩳۡۗ;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ᩻ۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 29
    iget-object v0, p0, Ll/ܽ֨ۗ;->ۢ:Ll/ᩳۡۗ;

    .line 459
    invoke-virtual {v0}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 30
    sget-object v1, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    return-object v0
.end method
