.class public abstract Ll/֡ۖۗ;
.super Ll/᩵ۖۗ;
.source "DIU7"

# interfaces
.implements Ll/ۨۡۗ;


# instance fields
.field public ۟:Ll/ۢۖۗ;

.field public ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۨۖۗ;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Ll/᩵ۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 19
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/֡ۖۗ;->ᩳ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۖ()Ll/ۢۖۗ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    return-object v0
.end method

.method public final ۙ(Ll/֨ۖۗ;)V
    .locals 1

    .line 74
    invoke-virtual {p1}, Ll/֨ۖۗ;->ۙ()Ll/ۢۖۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    .line 75
    invoke-virtual {p1}, Ll/֨ۖۗ;->ᩴ()Ll/ܿۧ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿۧ᩵;->ۤ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۖۗ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 1

    .line 65
    invoke-static {p1}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 69
    :cond_0
    check-cast v0, Ll/ܽۢۗ;

    invoke-static {v0}, Ll/ۢۖۗ;->ۙ(Ll/ܽۢۗ;)Ll/ۢۖۗ;

    move-result-object v0

    .line 84
    :goto_0
    iput-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    .line 85
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۖۗ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public final ۜ()Z
    .locals 3

    .line 45
    iget-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 48
    :cond_0
    invoke-static {v0}, Ll/ۢۖۗ;->ۤ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v0

    .line 49
    iget-object v2, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    if-eq v0, v2, :cond_1

    .line 50
    iput-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final ۠()V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    if-eqz v0, :cond_0

    .line 39
    invoke-static {v0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۖۗ;->۟:Ll/ۢۖۗ;

    :cond_0
    return-void
.end method

.method public final ۨ()I
    .locals 2

    .line 58
    iget-object v0, p0, Ll/֡ۖۗ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 59
    invoke-static {v1}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {v1}, Ll/ۚᩳۗ;->۠()I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫()Ljava/util/List;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/֡ۖۗ;->ᩳ:Ljava/util/List;

    return-object v0
.end method
