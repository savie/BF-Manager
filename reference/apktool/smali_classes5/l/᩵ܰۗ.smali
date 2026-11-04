.class public final Ll/᩵ܰۗ;
.super Ll/ۨܰۗ;
.source "PIUX"


# instance fields
.field public final ܰ:Ll/ۗܰۗ;


# direct methods
.method public constructor <init>(Ll/ۗܰۗ;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ll/ۨܰۗ;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩵ܰۗ;->ܰ:Ll/ۗܰۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VarRef{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ܰۗ;->ܰ:Ll/ۗܰۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", name="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۗܰۗ;->᩸()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", mth="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۗܰۗ;->ۤ()Ll/ۖۡۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩵ܰۗ;->ܰ:Ll/ۗܰۗ;

    invoke-virtual {v0}, Ll/ۗܰۗ;->ۙ()I

    move-result v0

    return v0
.end method
