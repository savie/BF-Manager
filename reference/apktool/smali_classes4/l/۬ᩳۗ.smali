.class public final Ll/۬ᩳۗ;
.super Ljava/lang/Object;
.source "HAVQ"

# interfaces
.implements Ll/ۘۡۗ;


# instance fields
.field public final ֡:Ll/֫֨ۗ;

.field public ܰ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩶:Ll/֨ᩳۗ;


# direct methods
.method public constructor <init>(Ll/֨ᩳۗ;Ljava/lang/String;Ll/֫֨ۗ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    .line 20
    iput-object p2, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    .line 22
    iput-object p2, p0, Ll/۬ᩳۗ;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֨ܰۗ;)Ll/۬ᩳۗ;
    .locals 3

    .line 31
    invoke-interface {p1}, Ll/֨ܰۗ;->᩸()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/֨ᩳۗ;

    move-result-object v0

    .line 32
    new-instance v1, Ll/۬ᩳۗ;

    invoke-interface {p1}, Ll/֨ܰۗ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ll/֨ܰۗ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Ll/۬ᩳۗ;-><init>(Ll/֨ᩳۗ;Ljava/lang/String;Ll/֫֨ۗ;)V

    .line 33
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object p0

    invoke-virtual {p0, v1}, Ll/ۙۢۗ;->ۙ(Ll/۬ᩳۗ;)Ll/۬ᩳۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/֫֨ۗ;)Ll/۬ᩳۗ;
    .locals 1

    .line 26
    new-instance v0, Ll/۬ᩳۗ;

    invoke-direct {v0, p1, p2, p3}, Ll/۬ᩳۗ;-><init>(Ll/֨ᩳۗ;Ljava/lang/String;Ll/֫֨ۗ;)V

    .line 27
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/ۙۢۗ;->ۙ(Ll/۬ᩳۗ;)Ll/۬ᩳۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 90
    const-class v2, Ll/۬ᩳۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 93
    :cond_1
    check-cast p1, Ll/۬ᩳۗ;

    .line 94
    iget-object v2, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    iget-object v3, p1, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    .line 95
    invoke-virtual {v2, v3}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    iget-object p1, p1, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    .line 96
    invoke-virtual {v2, p1}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 101
    iget-object v0, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 102
    iget-object v1, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    invoke-virtual {v1}, Ll/֫֨ۗ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 103
    iget-object v0, p0, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    invoke-virtual {v0}, Ll/֨ᩳۗ;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/۬ᩳۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(Ll/۬ᩳۗ;)Z
    .locals 2

    .line 77
    iget-object v0, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    iget-object v1, p1, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۬ᩳۗ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/֨ᩳۗ;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/۬ᩳۗ;->᩶:Ll/֨ᩳۗ;

    return-object v0
.end method

.method public final ᩸()Ll/֫֨ۗ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۬ᩳۗ;->֡:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ᩺()Ll/۬ᩳۗ;
    .locals 0

    return-object p0
.end method
