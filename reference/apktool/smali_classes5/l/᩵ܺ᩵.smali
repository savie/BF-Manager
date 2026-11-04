.class public final Ll/᩵ܺ᩵;
.super Ljava/lang/Object;
.source "16FI"

# interfaces
.implements Ll/۬ܰۗ;


# instance fields
.field public ۙ:Ljava/util/List;

.field public ۤ:Ljava/lang/String;

.field public ۫:I

.field public ܳ:Ll/ۨܺ᩵;

.field public ᩴ:Ljava/lang/String;

.field public ᩷:I

.field public ᩸:Ljava/lang/String;


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩵ܺ᩵;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 91
    iget-object v0, p0, Ll/᩵ܺ᩵;->ۤ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 93
    iget v0, p0, Ll/᩵ܺ᩵;->۫:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 95
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    iget-object v1, p0, Ll/᩵ܺ᩵;->᩸:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    iget-object v1, p0, Ll/᩵ܺ᩵;->ۤ:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    iget-object v1, p0, Ll/᩵ܺ᩵;->ۙ:Ljava/util/List;

    .line 95
    invoke-static {v1}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget-object v1, p0, Ll/᩵ܺ᩵;->ᩴ:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 2

    .line 27
    iget-object v0, p0, Ll/᩵ܺ᩵;->ܳ:Ll/ۨܺ᩵;

    if-eqz v0, :cond_0

    .line 28
    iget v1, p0, Ll/᩵ܺ᩵;->᩷:I

    invoke-virtual {v0, v1, p0}, Ll/ۨܺ᩵;->᩷(ILl/᩵ܺ᩵;)V

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Ll/᩵ܺ᩵;->ܳ:Ll/ۨܺ᩵;

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 0

    .line 34
    iput p1, p0, Ll/᩵ܺ᩵;->᩷:I

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Ll/᩵ܺ᩵;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 0

    .line 86
    iput-object p1, p0, Ll/᩵ܺ᩵;->ۙ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/֫᩻᩵;I)V
    .locals 1

    .line 22
    invoke-virtual {p1}, Ll/֫᩻᩵;->᩸()I

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    iput p1, p0, Ll/᩵ܺ᩵;->۫:I

    return-void
.end method

.method public final ۙ(Ll/ۨܺ᩵;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/᩵ܺ᩵;->ܳ:Ll/ۨܺ᩵;

    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩵ܺ᩵;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/᩵ܺ᩵;->ᩴ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Ll/᩵ܺ᩵;->ۤ:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Ll/᩵ܺ᩵;->᩸:Ljava/lang/String;

    .line 49
    iput-object v0, p0, Ll/᩵ܺ᩵;->ᩴ:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Ll/᩵ܺ᩵;->ۙ:Ljava/util/List;

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 43
    iget v0, p0, Ll/᩵ܺ᩵;->۫:I

    return v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩵ܺ᩵;->ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/᩵ܺ᩵;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩵ܺ᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method
