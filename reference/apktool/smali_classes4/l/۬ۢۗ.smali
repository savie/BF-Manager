.class public final Ll/۬ۢۗ;
.super Ll/ۤ֨ۗ;
.source "J6GG"


# instance fields
.field public final ᩸ۙ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 389
    invoke-direct {p0, p1}, Ll/ۤ֨ۗ;-><init>(Ljava/lang/String;)V

    .line 390
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Ll/۬ۢۗ;->᩸ۙ:Ljava/util/List;

    .line 395
    iget-object p1, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-interface {p2}, Ljava/util/List;->hashCode()I

    move-result p2

    mul-int/lit8 p2, p2, 0x1f

    add-int/2addr p2, p1

    .line 391
    iput p2, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    iget-object v1, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    .line 416
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬ۢۗ;->᩸ۙ:Ljava/util/List;

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 416
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 405
    iget-object v0, p0, Ll/۬ۢۗ;->᩸ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 410
    invoke-super {p0, p1}, Ll/ۤ֨ۗ;->ۙ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/۬ۢۗ;

    iget-object p1, p1, Ll/۬ۢۗ;->᩸ۙ:Ljava/util/List;

    .line 411
    iget-object v0, p0, Ll/۬ۢۗ;->᩸ۙ:Ljava/util/List;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
