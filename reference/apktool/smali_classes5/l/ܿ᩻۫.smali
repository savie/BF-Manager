.class public final Ll/ܿ᩻۫;
.super Ll/ܿ᩵ܳ;
.source "22BV"


# instance fields
.field public final synthetic ᩸:Ll/ۜ᩻۫;


# direct methods
.method public constructor <init>(Ll/ۜ᩻۫;)V
    .locals 1

    .line 854
    iput-object p1, p0, Ll/ܿ᩻۫;->᩸:Ll/ۜ᩻۫;

    const p1, 0x7f120187

    const v0, 0x7f0801f9

    invoke-direct {p0, p1, v0}, Ll/ܿ᩵ܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۠ۨܳ;)V
    .locals 5

    .line 857
    new-instance v0, Ll/᩸۬ܳ;

    const-string v1, "local"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩸۬ܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۜ᩻۫;->᩷(Ll/᩸۬ܳ;)V

    .line 858
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩷()V

    .line 859
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩻()Ll/۠ۨܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۨܳ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 860
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩻()Ll/۠ۨܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۨܳ;->᩷()V

    goto :goto_0

    .line 862
    :cond_0
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    .line 864
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 865
    iget-object v1, p0, Ll/ܿ᩻۫;->᩸:Ll/ۜ᩻۫;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩻()Ll/۠ۨܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۨܳ;->ܺ()Ll/ۜ᩵ܳ;

    move-result-object v1

    .line 867
    instance-of v2, v1, Ll/ۜ᩻۫;

    if-eqz v2, :cond_1

    .line 868
    check-cast v1, Ll/ۜ᩻۫;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    :cond_1
    invoke-virtual {p1}, Ll/۠ۨܳ;->۟()Ll/ᩴ᩶ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ᩶ܳ;->۫()Ll/ۖ᩷ܺ;

    move-result-object v1

    .line 871
    invoke-virtual {v1}, Ll/ۖ᩷ܺ;->ۤ()V

    .line 873
    :try_start_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩵ܳ;

    .line 874
    instance-of v4, v3, Ll/ۜ᩻۫;

    if-eqz v4, :cond_2

    .line 875
    check-cast v3, Ll/ۜ᩻۫;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 879
    :cond_3
    invoke-virtual {v1}, Ll/ۖ᩷ܺ;->ᩴ()V

    .line 881
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩻۫;

    .line 882
    iget-object v1, v1, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    invoke-virtual {v1}, Ll/۠᩵ܳ;->ۤ()V

    goto :goto_2

    .line 884
    :cond_4
    invoke-virtual {p1}, Ll/۠ۨܳ;->۟()Ll/ᩴ᩶ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴ᩶ܳ;->᩶()V

    return-void

    :catchall_0
    move-exception p1

    .line 879
    invoke-virtual {v1}, Ll/ۖ᩷ܺ;->ᩴ()V

    .line 880
    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 889
    iget-object v0, p0, Ll/ܿ᩻۫;->᩸:Ll/ۜ᩻۫;

    invoke-virtual {v0}, Ll/ۜ᩻۫;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ll/ۜ᩻۫;->ᩴۙ()Ll/᩸۬ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩸۬ܳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
