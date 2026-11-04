.class public final Ll/ᩳ۟ۗ;
.super Ljava/lang/Object;
.source "IIVL"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ll/᩷ۡۗ;

.field public final ܿ:Ll/᩷ۡۗ;

.field public final ᩶:Ll/ᩳۡۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    .line 34
    iput-object p2, p0, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    .line 35
    iput-object p3, p0, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    return-void
.end method

.method public static ۙ(Ll/ܺۡۗ;Ll/ᩳۡۗ;)V
    .locals 3

    .line 19
    invoke-virtual {p0}, Ll/ܺۡۗ;->ۖ()Ll/᩷ۡۗ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܺۡۗ;->۠()Ll/᩷ۡۗ;

    move-result-object p0

    .line 23
    new-instance v1, Ll/ᩳ۟ۗ;

    invoke-direct {v1, v0, p0, p1}, Ll/ᩳ۟ۗ;-><init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    .line 24
    sget-object p1, Ll/ۧ۟ۗ;->۫:Ll/ۧ۟ۗ;

    invoke-virtual {v0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 25
    invoke-virtual {v0, p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 28
    invoke-virtual {p0, p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 60
    const-class v0, Ll/ᩳ۟ۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 63
    :cond_1
    check-cast p1, Ll/ᩳ۟ۗ;

    .line 64
    iget-object v0, p0, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    iget-object v1, p1, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    iget-object v1, p1, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    .line 65
    invoke-virtual {v0, v1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    iget-object p1, p1, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    .line 66
    invoke-virtual {v0, p1}, Ll/ᩳۡۗ;->᩸(Ll/ᩳۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 71
    iget-object v2, p0, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EDGE_INSN: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/ᩳ۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/ۧ۟ۗ;->۫:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ᩳ۟ۗ;->ܰ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ܳ()Ll/᩷ۡۗ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ᩳ۟ۗ;->ܿ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ᩳۡۗ;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ᩳ۟ۗ;->᩶:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
