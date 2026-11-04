.class public final Ll/ۢ۟ۗ;
.super Ljava/lang/Object;
.source "RIXM"


# instance fields
.field public ۙ:Ll/᩻ۡۗ;

.field public final ۤ:Ll/ܽۡۗ;

.field public final ᩷:Ll/ۜ֨ۗ;


# direct methods
.method public constructor <init>(Ll/ܽۡۗ;Ll/ۜ֨ۗ;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/ۢ۟ۗ;->ۤ:Ll/ܽۡۗ;

    .line 21
    iput-object p2, p0, Ll/ۢ۟ۗ;->᩷:Ll/ۜ֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۢ۟ۗ;->ۤ:Ll/ܽۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۢ۟ۗ;->᩷:Ll/ۜ֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۢ۟ۗ;->ۙ:Ll/᩻ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/᩻ۡۗ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۢ۟ۗ;->ۙ:Ll/᩻ۡۗ;

    return-object v0
.end method

.method public final ۙ(Ll/᩻ۡۗ;)V
    .locals 0

    .line 37
    iput-object p1, p0, Ll/ۢ۟ۗ;->ۙ:Ll/᩻ۡۗ;

    return-void
.end method

.method public final ۤ()Ll/ܽۡۗ;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۢ۟ۗ;->ۤ:Ll/ܽۡۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۜ֨ۗ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۢ۟ۗ;->᩷:Ll/ۜ֨ۗ;

    return-object v0
.end method
