.class public final Ll/ۢۢۗ;
.super Ll/ᩳۡۗ;
.source "3BBC"


# instance fields
.field public final ۖ:I

.field public final ۠:[I

.field public final ۡ:[I


# direct methods
.method public constructor <init>(Ll/᩸ܿۗ;)V
    .locals 2

    .line 13
    sget-object v0, Ll/᩺ۢۗ;->ۜۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 14
    invoke-interface {p1}, Ll/᩸ܿۗ;->getSize()I

    move-result v0

    iput v0, p0, Ll/ۢۢۗ;->ۖ:I

    .line 15
    invoke-interface {p1}, Ll/᩸ܿۗ;->֫()[I

    move-result-object v0

    iput-object v0, p0, Ll/ۢۢۗ;->ۡ:[I

    .line 16
    invoke-interface {p1}, Ll/᩸ܿۗ;->ۚ()[I

    move-result-object p1

    iput-object p1, p0, Ll/ۢۢۗ;->۠:[I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "switch-data {"

    .line 0
    invoke-static {v0}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 43
    :goto_0
    iget v2, p0, Ll/ۢۢۗ;->ۖ:I

    if-ge v1, v2, :cond_0

    .line 44
    iget-object v2, p0, Ll/ۢۢۗ;->ۡ:[I

    aget v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۢۢۗ;->۠:[I

    aget v2, v2, v1

    invoke-static {v2}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 v1, 0x7d

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۛۙ()I
    .locals 1

    .line 28
    iget v0, p0, Ll/ۢۢۗ;->ۖ:I

    return v0
.end method

.method public final ۫(I)V
    .locals 3

    const/4 v0, 0x0

    .line 22
    :goto_0
    iget v1, p0, Ll/ۢۢۗ;->ۖ:I

    if-ge v0, v1, :cond_0

    .line 23
    iget-object v1, p0, Ll/ۢۢۗ;->۠:[I

    aget v2, v1, v0

    add-int/2addr v2, p1

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩵ۙ()[I
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۢۢۗ;->ۡ:[I

    return-object v0
.end method

.method public final ᩺ۙ()[I
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۢۢۗ;->۠:[I

    return-object v0
.end method
