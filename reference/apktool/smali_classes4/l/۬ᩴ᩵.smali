.class public final Ll/۬ᩴ᩵;
.super Ljava/lang/Object;
.source "VIXE"


# instance fields
.field public final ۙ:Ll/ۛ֨ۗ;

.field public final ᩷:Ll/ᩳۡۗ;


# direct methods
.method public constructor <init>(Ll/ᩳۡۗ;Ll/ۛ֨ۗ;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/۬ᩴ᩵;->᩷:Ll/ᩳۡۗ;

    .line 12
    iput-object p2, p0, Ll/۬ᩴ᩵;->ۙ:Ll/ۛ֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WrapInfo: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۬ᩴ᩵;->ۙ:Ll/ۛ֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬ᩴ᩵;->᩷:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ۛ֨ۗ;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/۬ᩴ᩵;->ۙ:Ll/ۛ֨ۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ᩳۡۗ;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/۬ᩴ᩵;->᩷:Ll/ᩳۡۗ;

    return-object v0
.end method
