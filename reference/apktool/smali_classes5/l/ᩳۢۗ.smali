.class public final Ll/ᩳۢۗ;
.super Ll/ᩳۡۗ;
.source "2BFT"


# instance fields
.field public final ۡ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 33
    sget-object v0, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    invoke-direct {p0, v0, p1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 26
    invoke-direct {p0, p2}, Ll/ᩳۢۗ;-><init>(I)V

    .line 27
    sget-object p2, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    sget v0, Ll/ܺ֨ۗ;->۟:I

    .line 31
    new-instance v0, Ll/ۛ֨ۗ;

    invoke-direct {v0, p1, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 27
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 28
    sget-object p1, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 29
    sget-object p1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " binds: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(ILl/ܺ֨ۗ;)V
    .locals 0

    .line 151
    new-instance p1, Ll/۠ۧ᩵;

    const-string p2, "Direct setArg is forbidden for PHI insn, bindArg must be used"

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1
.end method

.method public final ۙ(Ll/ۛ֨ۗ;Ll/᩷ۡۗ;)V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_0

    .line 50
    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 51
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 48
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Null bind block in PHI insn: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p1

    .line 45
    :cond_1
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Duplicate predecessors in PHI insn: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1
.end method

.method public final ۙ(Ll/ܺ֨ۗ;)V
    .locals 1

    .line 146
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Direct addArg is forbidden for PHI insn, bindArg must be used"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 146
    throw p1
.end method

.method public final ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z
    .locals 3

    .line 128
    instance-of v0, p1, Ll/ۛ֨ۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ll/ۛ֨ۗ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ۤ(Ll/ܺ֨ۗ;)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    .line 136
    :cond_1
    move-object v1, p2

    check-cast v1, Ll/ۛ֨ۗ;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    invoke-virtual {v1, p0}, Ll/ܿ֨ۗ;->ۙ(Ll/ᩳۢۗ;)V

    .line 137
    invoke-super {p0, v0, p2}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    const/4 p2, 0x0

    .line 139
    invoke-static {p2, p1}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    .line 140
    check-cast p1, Ll/ۛ֨ۗ;

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->۟()V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final ۤ(Ll/ۛ֨ۗ;)V
    .locals 2

    .line 84
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ۤ(Ll/ܺ֨ۗ;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 94
    :cond_0
    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(I)Ll/ܺ֨ۗ;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 95
    iget-object v1, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 96
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->۟()V

    return-void
.end method

.method public final ۫(I)Ll/᩷ۡۗ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    return-object p1
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 156
    new-instance v0, Ll/ᩳۢۗ;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ᩳۢۗ;-><init>(I)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(I)Ll/ܺ֨ۗ;
    .locals 2

    const/4 p1, 0x0

    .line 94
    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(I)Ll/ܺ֨ۗ;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 95
    iget-object v1, p0, Ll/ᩳۢۗ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 96
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->۟()V

    return-object v0
.end method

.method public final ᩸(I)Ll/ۛ֨ۗ;
    .locals 0

    .line 70
    invoke-super {p0, p1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    check-cast p1, Ll/ۛ֨ۗ;

    return-object p1
.end method

.method public final ᩸(I)Ll/ܺ֨ۗ;
    .locals 0

    .line 70
    invoke-super {p0, p1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    check-cast p1, Ll/ۛ֨ۗ;

    return-object p1
.end method
