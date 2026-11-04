.class public final Ll/ܿۢۗ;
.super Ll/᩶ۢۗ;
.source "BIWV"


# instance fields
.field public final ۜ:Ll/ۜܰۗ;

.field public final ۠:Ll/᩷ۢۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۢۗ;ILl/ۜܰۗ;Ll/᩷ۢۗ;)V
    .locals 1

    .line 20
    sget-object v0, Ll/֡ۢۗ;->ᩳ:Ll/֡ۢۗ;

    invoke-direct {p0, p1, v0, p2}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 21
    iput-object p3, p0, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    .line 22
    iput-object p4, p0, Ll/ܿۢۗ;->۠:Ll/᩷ۢۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/ۜܰۗ;Ll/᩷ۢۗ;Z)V
    .locals 6

    .line 14
    sget-object v3, Ll/֡ۢۗ;->ᩳ:Ll/֡ۢۗ;

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;ZZ)V

    .line 15
    iput-object p3, p0, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    .line 16
    iput-object p4, p0, Ll/ܿۢۗ;->۠:Ll/᩷ۢۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": INVOKE_POLYMORPHIC "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 57
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    :cond_0
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/lang/StringBuilder;)Z

    move-result v1

    const/16 v2, 0xa

    if-nez v1, :cond_1

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    :cond_1
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    const-string v1, " base: "

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۢۗ;->۠:Ll/᩷ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, " proto: "

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 5

    .line 35
    new-instance v0, Ll/ܿۢۗ;

    invoke-virtual {p0}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    iget-object v3, p0, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    iget-object v4, p0, Ll/ܿۢۗ;->۠:Ll/᩷ۢۗ;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܿۢۗ;-><init>(Ll/᩷ۢۗ;ILl/ۜܰۗ;Ll/᩷ۢۗ;)V

    .line 36
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 45
    :cond_0
    instance-of v0, p1, Ll/ܿۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/᩶ۢۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    check-cast p1, Ll/ܿۢۗ;

    .line 49
    iget-object v0, p0, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    iget-object p1, p1, Ll/ܿۢۗ;->ۜ:Ll/ۜܰۗ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
