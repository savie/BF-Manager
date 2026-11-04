.class public final Ll/᩸֨ۗ;
.super Ll/ۤ֨ۗ;
.source "J6GG"


# instance fields
.field public final ᩴۙ:Ll/ۤ֨ۗ;

.field public final ᩸ۙ:Ll/ۤ֨ۗ;


# direct methods
.method public constructor <init>(Ll/ۤ֨ۗ;Ll/ۤ֨ۗ;)V
    .locals 2

    .line 425
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    iget-object v1, p1, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 242
    iget-object v1, p2, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۤ֨ۗ;-><init>(Ljava/lang/String;)V

    .line 426
    iput-object p1, p0, Ll/᩸֨ۗ;->ᩴۙ:Ll/ۤ֨ۗ;

    .line 427
    iput-object p2, p0, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    .line 432
    iget-object v0, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 930
    iget p1, p1, Ll/֫֨ۗ;->ۙ:I

    iget p2, p2, Ll/֫֨ۗ;->ۙ:I

    mul-int/lit8 p2, p2, 0x1f

    add-int/2addr p2, p1

    mul-int/lit8 p2, p2, 0x1f

    add-int/2addr p2, v0

    .line 428
    iput p2, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩸֨ۗ;->ᩴۙ:Ll/ۤ֨ۗ;

    invoke-virtual {v1}, Ll/ۤ֨ۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    invoke-virtual {v1}, Ll/ۤ֨ۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 442
    iget-object v0, p0, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 2

    .line 457
    invoke-super {p0, p1}, Ll/ۤ֨ۗ;->ۙ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩸֨ۗ;

    iget-object v0, p1, Ll/᩸֨ۗ;->ᩴۙ:Ll/ۤ֨ۗ;

    .line 458
    iget-object v1, p0, Ll/᩸֨ۗ;->ᩴۙ:Ll/ۤ֨ۗ;

    invoke-static {v1, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    iget-object p1, p1, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    .line 459
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۛ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()Ll/֫֨ۗ;
    .locals 1

    .line 452
    iget-object v0, p0, Ll/᩸֨ۗ;->᩸ۙ:Ll/ۤ֨ۗ;

    return-object v0
.end method

.method public final ܺ()Ll/֫֨ۗ;
    .locals 1

    .line 447
    iget-object v0, p0, Ll/᩸֨ۗ;->ᩴۙ:Ll/ۤ֨ۗ;

    return-object v0
.end method
