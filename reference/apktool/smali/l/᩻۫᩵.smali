.class public final Ll/᩻۫᩵;
.super Ljava/lang/Object;
.source "56C5"


# instance fields
.field public ۙ:Ljava/util/List;

.field public ۤ:I

.field public final ܳ:Ll/ܿ֨ۗ;

.field public ᩴ:Z

.field public ᩷:Ljava/util/List;

.field public ᩸:Ll/֫֨ۗ;


# direct methods
.method public constructor <init>(Ll/ܿ֨ۗ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Ll/᩻۫᩵;->ۤ:I

    .line 18
    iput-object p1, p0, Ll/᩻۫᩵;->ܳ:Ll/ܿ֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    iget-object v1, p0, Ll/᩻۫᩵;->ܳ:Ll/ܿ֨ۗ;

    invoke-virtual {v1}, Ll/ܿ֨ۗ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    iget-boolean v1, p0, Ll/᩻۫᩵;->ᩴ:Z

    if-eqz v1, :cond_0

    const-string v1, ", resolved type: "

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ", currentType="

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", candidateTypes="

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻۫᩵;->᩷:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩻۫᩵;->᩷:Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 0

    .line 75
    iput-object p1, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 22
    iput-object p1, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Ll/᩻۫᩵;->ᩴ:Z

    .line 24
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 59
    iput-boolean p1, p0, Ll/᩻۫᩵;->ᩴ:Z

    return-void
.end method

.method public final ۤ()Ll/ܿ֨ۗ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩻۫᩵;->ܳ:Ll/ܿ֨ۗ;

    return-object v0
.end method

.method public final ܳ()V
    .locals 2

    .line 28
    iget-boolean v0, p0, Ll/᩻۫᩵;->ᩴ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ll/᩻۫᩵;->ۤ:I

    .line 32
    iget-object v1, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    iput-object v0, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    return-void
.end method

.method public final ᩴ()Z
    .locals 3

    .line 41
    iget-boolean v0, p0, Ll/᩻۫᩵;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 45
    iget v1, p0, Ll/᩻۫᩵;->ۤ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    rem-int/2addr v1, v0

    iput v1, p0, Ll/᩻۫᩵;->ۤ:I

    .line 46
    iget-object v0, p0, Ll/᩻۫᩵;->ۙ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    iput-object v0, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    .line 47
    iget v0, p0, Ll/᩻۫᩵;->ۤ:I

    if-nez v0, :cond_1

    return v2

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/֫֨ۗ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ᩷(Ljava/util/List;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/᩻۫᩵;->᩷:Ljava/util/List;

    return-void
.end method

.method public final ᩷(Ll/֫֨ۗ;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/᩻۫᩵;->᩸:Ll/֫֨ۗ;

    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/᩻۫᩵;->ᩴ:Z

    return v0
.end method
