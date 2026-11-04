.class public final Ll/ۧۤ᩵;
.super Ll/᩷ۤ᩵;
.source "L6BT"


# instance fields
.field public final ۤ:Ll/ۨۤ᩵;


# direct methods
.method public constructor <init>(Ll/ۨۤ᩵;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Ll/᩷ۤ᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 19
    iput-object p1, p0, Ll/ۧۤ᩵;->ۤ:Ll/ۨۤ᩵;

    return-void
.end method


# virtual methods
.method public final ᩷()V
    .locals 7

    .line 29
    invoke-virtual {p0}, Ll/᩷ۤ᩵;->ۙ()Ll/֨ۤ᩵;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll/֨ۤ᩵;->ۤ()Ll/۟ۤ᩵;

    move-result-object v1

    .line 31
    invoke-virtual {v1, v0}, Ll/۟ۤ᩵;->᩷(Ll/֨ۤ᩵;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 35
    iget-object v2, p0, Ll/ۧۤ᩵;->ۤ:Ll/ۨۤ᩵;

    invoke-virtual {v2}, Ll/ۨۤ᩵;->ۧ()Ll/᩷ۡۗ;

    move-result-object v2

    .line 36
    new-instance v3, Ll/ۙ᩸᩵;

    .line 18
    invoke-direct {v3, v0}, Ll/ۖۤ᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 23
    invoke-virtual {v3}, Ll/ۖۤ᩵;->᩷()Ll/֨ۤ᩵;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v4

    .line 25
    invoke-virtual {v0}, Ll/֨ۤ᩵;->ᩴ()Ll/ۡ᩷᩵;

    move-result-object v0

    .line 27
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    .line 28
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ll/ۤ᩻ۧ;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v0}, Ll/ۤ᩻ۧ;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, v5}, Ll/ۜ֫᩵;->᩷(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v5, 0x1

    if-eq v2, v5, :cond_0

    .line 38
    new-instance v2, Ll/ۡۤ᩵;

    invoke-virtual {v3}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v3

    invoke-direct {v2, v3, v4, v0}, Ll/ۡۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 35
    new-instance v5, Ll/ᩳۤ᩵;

    .line 17
    invoke-direct {v5, v0, v2, v2}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 36
    new-instance v2, Ll/ۗۤ᩵;

    invoke-virtual {v3}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    invoke-direct {v2, v0, v4, v5}, Ll/ۗۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    goto :goto_0

    .line 32
    :cond_1
    new-instance v2, Ll/᩶ۤ᩵;

    invoke-virtual {v3}, Ll/ۖۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    sget-object v3, Ll/ܰۤ᩵;->᩶:Ll/ܰۤ᩵;

    invoke-direct {v2, v0, v3}, Ll/᩶ۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/ܰۤ᩵;)V

    .line 39
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    .line 33
    :cond_2
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Orphaned traverser state"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 33
    throw v0
.end method
