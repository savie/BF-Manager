.class public final Ll/֨۟ۗ;
.super Ljava/lang/Object;
.source "RIXM"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/List;

.field public ᩶:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/֨۟ۗ;->ܰ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Enum fields: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֨۟ۗ;->ܰ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/֨۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/ۧ۟ۗ;->ۚ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/֨۟ۗ;->ܰ:Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 0

    .line 62
    iput-object p1, p0, Ll/֨۟ۗ;->᩶:Ll/ۖۡۗ;

    return-void
.end method

.method public final ᩷()Ll/ۖۡۗ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֨۟ۗ;->᩶:Ll/ۖۡۗ;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
