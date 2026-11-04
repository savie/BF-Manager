.class public final Ll/ۤۤܽ;
.super Ll/ܰ᩷ܽ;
.source "E3QI"


# instance fields
.field public final synthetic ᩶:Ll/ۚ᩸ܽ;


# direct methods
.method public constructor <init>(Ll/ۚ᩸ܽ;)V
    .locals 0

    .line 4467
    iput-object p1, p0, Ll/ۤۤܽ;->᩶:Ll/ۚ᩸ܽ;

    invoke-direct {p0, p1}, Ll/ܰ᩷ܽ;-><init>(Ll/ۚ᩸ܽ;)V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 4476
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4479
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 4480
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 4484
    :cond_1
    iget-object v2, p0, Ll/ۤۤܽ;->᩶:Ll/ۚ᩸ܽ;

    invoke-virtual {v2, v0}, Ll/ۚ᩸ܽ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4486
    iget-object v2, v2, Ll/ۚ᩸ܽ;->ܳۙ:Ll/۫ۙܽ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Ll/۫ۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 4471
    new-instance v0, Ll/᩷ۤܽ;

    iget-object v1, p0, Ll/ۤۤܽ;->᩶:Ll/ۚ᩸ܽ;

    .line 4397
    invoke-direct {v0, v1}, Ll/᩸ۤܽ;-><init>(Ll/ۚ᩸ܽ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 3

    .line 4491
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4494
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 4495
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4496
    iget-object v2, p0, Ll/ۤۤܽ;->᩶:Ll/ۚ᩸ܽ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Ll/ۚ᩸ܽ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method
