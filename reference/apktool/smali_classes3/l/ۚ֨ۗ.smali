.class public final Ll/ۚ֨ۗ;
.super Ll/ۤ֨ۗ;
.source "J6GG"


# instance fields
.field public final ᩴۙ:Ll/֫֨ۗ;

.field public final ᩸ۙ:Ll/۫֨ۗ;


# direct methods
.method public constructor <init>(Ll/֫֨ۗ;Ll/۫֨ۗ;)V
    .locals 1

    .line 344
    sget-object v0, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۤ֨ۗ;-><init>(Ljava/lang/String;)V

    .line 345
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۚ֨ۗ;->ᩴۙ:Ll/֫֨ۗ;

    .line 346
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۚ֨ۗ;->᩸ۙ:Ll/۫֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 378
    sget-object v0, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    iget-object v1, p0, Ll/ۚ֨ۗ;->᩸ۙ:Ll/۫֨ۗ;

    if-ne v1, v0, :cond_0

    .line 379
    invoke-virtual {v1}, Ll/۫֨ۗ;->᩸()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 381
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/۫֨ۗ;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚ֨ۗ;->ᩴۙ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Ll/۫֨ۗ;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/ۚ֨ۗ;->᩸ۙ:Ll/۫֨ۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 2

    .line 371
    invoke-super {p0, p1}, Ll/ۤ֨ۗ;->ۙ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۚ֨ۗ;

    iget-object v0, p1, Ll/ۚ֨ۗ;->᩸ۙ:Ll/۫֨ۗ;

    iget-object v1, p0, Ll/ۚ֨ۗ;->᩸ۙ:Ll/۫֨ۗ;

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Ll/ۚ֨ۗ;->ᩴۙ:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/ۚ֨ۗ;->ᩴۙ:Ll/֫֨ۗ;

    .line 373
    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

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

.method public final ᩵()Ll/֫֨ۗ;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۚ֨ۗ;->ᩴۙ:Ll/֫֨ۗ;

    return-object v0
.end method
