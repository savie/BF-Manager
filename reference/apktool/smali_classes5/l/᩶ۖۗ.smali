.class public final Ll/᩶ۖۗ;
.super Ll/᩵ۖۗ;
.source "U6G3"


# instance fields
.field public final ۟:Ll/ᩳۡۗ;

.field public final ۢ:Ll/ۨۖۗ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۨۖۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Ll/᩵ۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩶ۖۗ;->ᩳ:Ljava/util/ArrayList;

    .line 21
    iput-object p2, p0, Ll/᩶ۖۗ;->۟:Ll/ᩳۡۗ;

    .line 22
    new-instance p1, Ll/ۨۖۗ;

    invoke-direct {p1, p0}, Ll/ۨۖۗ;-><init>(Ll/ܿۡۗ;)V

    iput-object p1, p0, Ll/᩶ۖۗ;->ۢ:Ll/ۨۖۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Synchronized:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶ۖۗ;->ۢ:Ll/ۨۖۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Ll/ᩳۡۗ;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/᩶ۖۗ;->۟:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 44
    invoke-virtual {p1, p0, p2}, Ll/۬֡ۗ;->ۙ(Ll/᩶ۖۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۜ()Ll/ۨۖۗ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩶ۖۗ;->ۢ:Ll/ۨۖۗ;

    return-object v0
.end method

.method public final ۠()Ljava/util/ArrayList;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩶ۖۗ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/᩶ۖۗ;->ۢ:Ll/ۨۖۗ;

    invoke-virtual {v0}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩶ۖۗ;->۟:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getOffset()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
