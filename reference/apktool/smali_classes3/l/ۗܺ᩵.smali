.class public final Ll/ۗܺ᩵;
.super Ljava/lang/Object;
.source "66DD"

# interfaces
.implements Ll/ۜܰۗ;


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/ۗܺ᩵;->᩷:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Ll/ۗܺ᩵;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    instance-of v0, p1, Ll/ۜܰۗ;

    if-nez v0, :cond_1

    goto :goto_1

    .line 35
    :cond_1
    check-cast p1, Ll/ۜܰۗ;

    .line 36
    iget-object v0, p0, Ll/ۗܺ᩵;->ۙ:Ljava/util/List;

    invoke-interface {p1}, Ll/ۜܰۗ;->ᩴ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۗܺ᩵;->᩷:Ljava/lang/String;

    .line 37
    invoke-interface {p1}, Ll/ۜܰۗ;->ۤ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 42
    iget-object v0, p0, Ll/ۗܺ᩵;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۗܺ᩵;->᩷:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗܺ᩵;->ۙ:Ljava/util/List;

    invoke-static {v1}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗܺ᩵;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ۗܺ᩵;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ۗܺ᩵;->ۙ:Ljava/util/List;

    return-object v0
.end method
