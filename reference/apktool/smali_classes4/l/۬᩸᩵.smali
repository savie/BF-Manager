.class public abstract Ll/۬᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "H6C3"


# instance fields
.field public ֡:Ll/ܰۖۗ;

.field public ۟:Z

.field public final ܿ:Ljava/util/HashSet;

.field public final ᩶:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 193
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۬᩸᩵;->᩶:Ljava/util/HashSet;

    .line 194
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۬᩸᩵;->ܿ:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 196
    iput-boolean v0, p0, Ll/۬᩸᩵;->۟:Z

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬᩸᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩹ۡۗ;Ll/ۛۡۗ;)V
    .locals 3

    .line 251
    invoke-interface {p1}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 252
    invoke-static {v0}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    if-eqz v1, :cond_0

    .line 253
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_0

    .line 254
    invoke-static {v0}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    .line 255
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    sget-object v0, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-interface {p1, v0}, Ll/ۛ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 257
    iget-object p1, p0, Ll/۬᩸᩵;->ܿ:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 232
    iget-boolean v0, p0, Ll/۬᩸᩵;->۟:Z

    return v0
.end method

.method public final ۙ(Ll/᩹ۡۗ;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 241
    invoke-interface {p1}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۡۗ;

    if-eqz p1, :cond_0

    .line 242
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    .line 243
    sget-object v0, Ll/ۧ۟ۗ;->۠:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    check-cast p1, Ll/ۘᩳۗ;

    if-eqz p1, :cond_0

    .line 244
    invoke-virtual {p1}, Ll/ۘᩳۗ;->ۙ()Ll/ܿۡۗ;

    move-result-object p1

    iget-object v0, p0, Ll/۬᩸᩵;->֡:Ll/ܰۖۗ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 222
    iput-boolean v0, p0, Ll/۬᩸᩵;->۟:Z

    .line 223
    iget-object v0, p0, Ll/۬᩸᩵;->᩶:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 224
    iget-object v0, p0, Ll/۬᩸᩵;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    .line 202
    invoke-virtual {p0, p1, p2}, Ll/۬᩸᩵;->᩸(Ll/ۖۡۗ;Ll/ܿۡۗ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 228
    iput-boolean v0, p0, Ll/۬᩸᩵;->۟:Z

    return-void
.end method

.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 4

    .line 208
    iget-object p1, p0, Ll/۬᩸᩵;->᩶:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 210
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Ll/۬᩸᩵;->֡:Ll/ܰۖۗ;

    sget v1, Ll/ܰᩴ᩵;->ۤ:I

    .line 429
    new-instance v1, Ll/ᩳۡۗ;

    sget-object v2, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 430
    sget-object v2, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 431
    new-instance v2, Ll/ۘᩳۗ;

    invoke-direct {v2, v0}, Ll/ۘᩳۗ;-><init>(Ll/ܰۖۗ;)V

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 432
    new-instance v0, Ll/֡ۡۗ;

    invoke-direct {v0, v1}, Ll/֡ۡۗ;-><init>(Ll/ᩳۡۗ;)V

    .line 210
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    :cond_0
    iget-object p1, p0, Ll/۬᩸᩵;->ܿ:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 214
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll/᩵ۨܳ;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Ll/᩵ۨܳ;-><init>(I)V

    invoke-static {p1, p2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    :cond_1
    return-void
.end method

.method public abstract ᩸(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
.end method
