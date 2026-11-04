.class public final Ll/ۖ֨ۗ;
.super Ll/ۡۢۗ;
.source "P6EQ"


# instance fields
.field public final ۡ:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 13
    sget-object v0, Ll/᩺ۢۗ;->ܺۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 18
    iput p1, p0, Ll/ۖ֨ۗ;->ۡ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۖ֨ۗ;->ۡ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

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

    .line 27
    new-instance v0, Ll/ۖ֨ۗ;

    iget v1, p0, Ll/ۖ֨ۗ;->ۡ:I

    invoke-direct {v0, v1}, Ll/ۖ֨ۗ;-><init>(I)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩵ۙ()I
    .locals 1

    .line 22
    iget v0, p0, Ll/ۖ֨ۗ;->ۡ:I

    return v0
.end method
