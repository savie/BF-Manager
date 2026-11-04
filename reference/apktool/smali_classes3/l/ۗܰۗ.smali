.class public final Ll/ۗܰۗ;
.super Ljava/lang/Object;
.source "MITP"

# interfaces
.implements Ll/ܺܰۗ;


# instance fields
.field public final ֡:I

.field public final ۟:I

.field public ܰ:I

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/᩵ܰۗ;

.field public final ᩶:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V
    .locals 3

    .line 66
    invoke-virtual {p2}, Ll/ܿ֨ۗ;->᩻()I

    move-result v0

    invoke-virtual {p2}, Ll/ܿ֨ۗ;->ۛ()I

    move-result v1

    .line 67
    invoke-virtual {p2}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۧ֨ۗ;->ۤ()Ljava/lang/String;

    move-result-object p2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/ۗܰۗ;->᩶:Ll/ۖۡۗ;

    .line 72
    iput v0, p0, Ll/ۗܰۗ;->֡:I

    .line 73
    iput v1, p0, Ll/ۗܰۗ;->۟:I

    .line 75
    iput-object p2, p0, Ll/ۗܰۗ;->ܿ:Ljava/lang/String;

    .line 23
    new-instance p1, Ll/᩵ܰۗ;

    invoke-direct {p1, p0}, Ll/᩵ܰۗ;-><init>(Ll/ۗܰۗ;)V

    .line 76
    iput-object p1, p0, Ll/ۗܰۗ;->ᩳ:Ll/᩵ܰۗ;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)Ll/ۗܰۗ;
    .locals 2

    .line 34
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll/ۧ֨ۗ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 38
    :cond_0
    invoke-virtual {v0}, Ll/ۧ֨ۗ;->᩷()Ll/ۗܰۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 42
    :cond_1
    new-instance v1, Ll/ۗܰۗ;

    invoke-direct {v1, p0, p1}, Ll/ۗܰۗ;-><init>(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V

    .line 43
    invoke-virtual {v0, v1}, Ll/ۧ֨ۗ;->ۙ(Ll/ۗܰۗ;)V

    return-object v1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۛ֨ۗ;)Ll/᩵ܰۗ;
    .locals 1

    .line 20
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p0, v0

    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p0, p1}, Ll/ۗܰۗ;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)Ll/ۗܰۗ;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    return-object v0

    .line 105
    :cond_1
    iget-object p0, p0, Ll/ۗܰۗ;->ᩳ:Ll/᩵ܰۗ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 134
    :cond_0
    instance-of v1, p1, Ll/ۗܰۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 137
    :cond_1
    check-cast p1, Ll/ۗܰۗ;

    .line 84
    iget v1, p0, Ll/ۗܰۗ;->֡:I

    iget v3, p1, Ll/ۗܰۗ;->֡:I

    if-ne v1, v3, :cond_2

    .line 88
    iget v1, p0, Ll/ۗܰۗ;->۟:I

    iget v3, p1, Ll/ۗܰۗ;->۟:I

    if-ne v1, v3, :cond_2

    .line 80
    iget-object v1, p0, Ll/ۗܰۗ;->᩶:Ll/ۖۡۗ;

    iget-object p1, p1, Ll/ۗܰۗ;->᩶:Ll/ۖۡۗ;

    .line 140
    invoke-virtual {v1, p1}, Ll/ۖۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 84
    iget v0, p0, Ll/ۗܰۗ;->֡:I

    mul-int/lit8 v0, v0, 0x1f

    .line 88
    iget v1, p0, Ll/ۗܰۗ;->۟:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 126
    iget-object v1, p0, Ll/ۗܰۗ;->᩶:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VarNode{r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۗܰۗ;->֡:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x76

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗܰۗ;->۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/֫ܰۗ;
    .locals 1

    .line 120
    sget-object v0, Ll/֫ܰۗ;->ۡ:Ll/֫ܰۗ;

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 110
    iget v0, p0, Ll/ۗܰۗ;->ܰ:I

    return v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 115
    iput p1, p0, Ll/ۗܰۗ;->ܰ:I

    return-void
.end method

.method public final ۤ()Ll/ۖۡۗ;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ۗܰۗ;->᩶:Ll/ۖۡۗ;

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۗܰۗ;->ܿ:Ljava/lang/String;

    return-object v0
.end method
