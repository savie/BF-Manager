.class public final Ll/ۘۢۗ;
.super Ll/᩶ۢۗ;
.source "4IRZ"


# instance fields
.field public ۙۙ:Z

.field public ۜ:Ll/᩷᩶ۗ;

.field public ۠:Ll/ܳۢۗ;

.field public ۬:Ll/᩷ۢۗ;

.field public ᩷ۙ:Z


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": INVOKE_CUSTOM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 123
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_0
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/lang/StringBuilder;)Z

    .line 126
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    const-string v1, "\n handle type: "

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n lambda: "

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n call insn: "

    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡ۙ()Ll/᩷᩶ۗ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    return-object v0
.end method

.method public final ֨ۙ()Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Ll/ۘۢۗ;->᩷ۙ:Z

    return v0
.end method

.method public final ۙ(Ll/ܳۢۗ;)V
    .locals 0

    .line 76
    iput-object p1, p0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    return-void
.end method

.method public final ۙ(Ll/᩷ۢۗ;)V
    .locals 0

    .line 60
    iput-object p1, p0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    return-void
.end method

.method public final ۙ(Ll/᩷᩶ۗ;)V
    .locals 0

    .line 68
    iput-object p1, p0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 92
    iput-boolean p1, p0, Ll/ۘۢۗ;->᩷ۙ:Z

    return-void
.end method

.method public final ۛۙ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۟ۙ()Ll/᩷ۢۗ;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    return-object v0
.end method

.method public final ۡۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Ll/ۘۢۗ;->ۙۙ:Z

    return-void
.end method

.method public final ۢۙ()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Ll/ۘۢۗ;->ۙۙ:Z

    return v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 4

    .line 29
    new-instance v0, Ll/ۘۢۗ;

    invoke-virtual {p0}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩶ۢۗ;->ܰۙ()Ll/֡ۢۗ;

    move-result-object v2

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    .line 24
    invoke-direct {v0, v1, v2, v3}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 30
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    .line 31
    iget-object v1, p0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    .line 60
    iput-object v1, v0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    .line 32
    iget-object v1, p0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    .line 68
    iput-object v1, v0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    .line 33
    iget-object v1, p0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    .line 76
    iput-object v1, v0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    .line 34
    iget-boolean v1, p0, Ll/ۘۢۗ;->ۙۙ:Z

    .line 84
    iput-boolean v1, v0, Ll/ۘۢۗ;->ۙۙ:Z

    .line 35
    iget-boolean v1, p0, Ll/ۘۢۗ;->᩷ۙ:Z

    .line 92
    iput-boolean v1, v0, Ll/ۘۢۗ;->᩷ۙ:Z

    return-object v0
.end method

.method public final ܿۙ()Ll/ᩳۡۗ;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    instance-of v0, p1, Ll/ۘۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/᩶ۢۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 47
    :cond_1
    check-cast p1, Ll/ۘۢۗ;

    .line 48
    iget-object v0, p0, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    iget-object v1, p1, Ll/ۘۢۗ;->ۜ:Ll/᩷᩶ۗ;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    iget-object v1, p1, Ll/ۘۢۗ;->۬:Ll/᩷ۢۗ;

    .line 49
    invoke-virtual {v0, v1}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    iget-object v1, p1, Ll/ۘۢۗ;->۠:Ll/ܳۢۗ;

    .line 50
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/ۘۢۗ;->ۙۙ:Z

    iget-boolean v1, p1, Ll/ۘۢۗ;->ۙۙ:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۘۢۗ;->᩷ۙ:Z

    iget-boolean p1, p1, Ll/ۘۢۗ;->᩷ۙ:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩺ۙ()Ll/ܺ֨ۗ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
