.class public final Ll/ۚ۠ۗ;
.super Ljava/lang/Object;
.source "W6FG"


# instance fields
.field public final ۙ:Ll/ܶۚۗ;

.field public final ۤ:Ll/᩷ۡۗ;

.field public final ᩷:Ll/᩷ۡۗ;

.field public final ᩸:Ll/᩻۠ۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩻۠ۗ;)V
    .locals 1

    .line 23
    invoke-static {}, Ll/ܶۚۗ;->empty()Ll/ܶۚۗ;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۚ۠ۗ;-><init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩻۠ۗ;Ll/ܶۚۗ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩻۠ۗ;Ll/ܶۚۗ;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ۚ۠ۗ;->᩷:Ll/᩷ۡۗ;

    .line 32
    iput-object p2, p0, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    .line 33
    iput-object p4, p0, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    .line 34
    iput-object p3, p0, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    .line 36
    invoke-virtual {p0}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result p1

    const-string p2, "\" type"

    if-eqz p1, :cond_1

    invoke-virtual {p4}, Ll/ܶۚۗ;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Attempted to add a null exception handler as an edge of \""

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ۚ۠ۗ;->᩸()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p4}, Ll/ܶۚۗ;->isPresent()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    .line 39
    :cond_2
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Attempted to add an exception handler as an edge of \""

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    throw p1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 62
    instance-of v0, p1, Ll/ۚ۠ۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 66
    :cond_0
    check-cast p1, Ll/ۚ۠ۗ;

    .line 68
    iget-object v0, p0, Ll/ۚ۠ۗ;->᩷:Ll/᩷ۡۗ;

    iget-object v2, p1, Ll/ۚ۠ۗ;->᩷:Ll/᩷ۡۗ;

    invoke-virtual {v0, v2}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    iget-object v2, p1, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    .line 69
    invoke-virtual {v0, v2}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    iget-object v2, p1, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    .line 70
    invoke-virtual {v0, v2}, Ll/ܶۚۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    iget-object p1, p1, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 76
    iget-object v2, p0, Ll/ۚ۠ۗ;->᩷:Ll/᩷ۡۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TryEdge: ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    iget-object v1, p0, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    iget-object v1, p0, Ll/ۚ۠ۗ;->᩷:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    iget-object v1, p0, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] - Handler: "

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    iget-object v1, p0, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    invoke-virtual {v1}, Ll/ܶۚۗ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "None"

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v1}, Ll/ܶۚۗ;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۠ۗ;

    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ᩴ۠ۗ;
    .locals 2

    .line 100
    invoke-virtual {p0}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    iget-object v0, p0, Ll/ۚ۠ۗ;->ۙ:Ll/ܶۚۗ;

    invoke-virtual {v0}, Ll/ܶۚۗ;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 108
    invoke-virtual {v0}, Ll/ܶۚۗ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ۠ۗ;

    return-object v0

    .line 105
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Attempted to get the exception handler of a handler edge type, however none was present"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 105
    throw v0

    .line 101
    :cond_1
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Attempted to get the exception handler of a non-handler edge type"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 101
    throw v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۚ۠ۗ;->᩸:Ll/᩻۠ۗ;

    sget-object v1, Ll/᩻۠ۗ;->᩶:Ll/᩻۠ۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/᩷ۡۗ;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۚ۠ۗ;->ۤ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 96
    invoke-virtual {p0}, Ll/ۚ۠ۗ;->ۤ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
