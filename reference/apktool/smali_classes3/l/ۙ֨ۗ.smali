.class public final Ll/ۙ֨ۗ;
.super Ll/ۤ֨ۗ;
.source "J6GG"


# instance fields
.field public ᩸ۙ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 278
    invoke-direct {p0, p1}, Ll/ۤ֨ۗ;-><init>(Ljava/lang/String;)V

    .line 279
    iput-object p2, p0, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 305
    iget-object v0, p0, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    .line 306
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    if-eqz v1, :cond_0

    return-object v2

    .line 309
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " extends "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " & "

    invoke-static {v0, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 0

    .line 294
    iput-object p1, p0, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 299
    invoke-super {p0, p1}, Ll/ۤ֨ۗ;->ۙ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    check-cast p1, Ll/ۙ֨ۗ;

    iget-object p1, p1, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    .line 300
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/util/List;
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۙ֨ۗ;->᩸ۙ:Ljava/util/List;

    return-object v0
.end method
