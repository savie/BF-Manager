.class public final Ll/ۧۢۗ;
.super Ll/ᩳۡۗ;
.source "Q6E4"


# instance fields
.field public final ۖ:I

.field public ۡ:Ll/֫ۢۗ;


# direct methods
.method public constructor <init>(ILl/ܺ֨ۗ;)V
    .locals 2

    .line 16
    sget-object v0, Ll/᩺ۢۗ;->᩸ۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 17
    iput p1, p0, Ll/ۧۢۗ;->ۖ:I

    .line 18
    invoke-virtual {p0, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)Ljava/util/ArrayList;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-virtual {v0, p1}, Ll/֫ۢۗ;->ۙ(Ll/֫֨ۗ;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/֫ۢۗ;)V
    .locals 0

    .line 26
    iput-object p1, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    return-void
.end method

.method public final ۛۙ()Ll/֫֨ۗ;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-virtual {v0}, Ll/֫ۢۗ;->᩵ۙ()Ll/֫֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 3

    .line 43
    new-instance v0, Ll/ۧۢۗ;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    iget v2, p0, Ll/ۧۢۗ;->ۖ:I

    invoke-direct {v0, v2, v1}, Ll/ۧۢۗ;-><init>(ILl/ܺ֨ۗ;)V

    .line 44
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ܰۙ()I
    .locals 1

    .line 22
    iget v0, p0, Ll/ۧۢۗ;->ۖ:I

    return v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 34
    :cond_0
    instance-of v0, p1, Ll/ۧۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    check-cast p1, Ll/ۧۢۗ;

    .line 38
    iget-object v0, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    iget-object p1, p1, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵ۙ()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-static {v0}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩺ۙ()I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۧۢۗ;->ۡ:Ll/֫ۢۗ;

    invoke-virtual {v0}, Ll/֫ۢۗ;->ۛۙ()I

    move-result v0

    return v0
.end method
