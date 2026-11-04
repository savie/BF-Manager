.class public abstract Ll/ܺܿۗ;
.super Ljava/lang/Object;
.source "H6H3"

# interfaces
.implements Ll/۫ܿۗ;


# instance fields
.field public final ۙ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺܿۗ;->ۙ:Ljava/util/ArrayList;

    .line 36
    move-object v1, p0

    check-cast v1, Ll/ᩴ᩻᩵;

    .line 51
    new-instance v2, Ll/᩻ܿۗ;

    invoke-direct {v2}, Ll/᩻ܿۗ;-><init>()V

    sget-object v3, Ll/ۧܿۗ;->֡:Ll/ۧܿۗ;

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Boolean;

    .line 53
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 54
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/᩻ܿۗ;->ۙ(Ljava/util/List;)Ll/᩻ܿۗ;

    new-instance v4, Ll/֡ۨᩴ;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Ll/֡ۨᩴ;-><init>(I)V

    .line 55
    invoke-virtual {v2, v4}, Ll/᩻ܿۗ;->ۙ(Ll/֡ۨᩴ;)Ll/᩻ܿۗ;

    new-instance v4, Ll/۟ۨᩴ;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Ll/۟ۨᩴ;-><init>(I)V

    .line 56
    invoke-virtual {v2, v4}, Ll/᩻ܿۗ;->ۙ(Ll/۟ۨᩴ;)Ll/᩻ܿۗ;

    .line 126
    iget-object v4, v1, Ll/ܺܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-virtual {v2}, Ll/᩻ܿۗ;->ۙ()Ll/᩻ܿۗ;

    .line 13
    invoke-virtual {v2}, Ll/᩻ܿۗ;->᩷()Ll/᩻ܿۗ;

    new-instance v4, Ll/ۤ۟ۗ;

    invoke-direct {v4, v3, v1}, Ll/ۤ۟ۗ;-><init>(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {v2, v4}, Ll/᩻ܿۗ;->ۙ(Ll/ۤ۟ۗ;)Ll/᩻ܿۗ;

    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܿۗ;

    .line 38
    invoke-virtual {v1}, Ll/᩻ܿۗ;->ᩴ()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܺܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/util/Map;)V
    .locals 6

    .line 86
    iget-object v0, p0, Ll/ܺܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܿۗ;

    .line 87
    invoke-static {v1}, Ll/᩻ܿۗ;->᩷(Ll/᩻ܿۗ;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, ", value: "

    if-nez v2, :cond_0

    .line 99
    invoke-static {v1}, Ll/᩻ܿۗ;->ۙ(Ll/᩻ܿۗ;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 102
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ll/᩻ܿۗ;->ۤ()Ljava/util/function/Function;

    move-result-object v4

    check-cast v4, Ll/۟ۨᩴ;

    invoke-virtual {v4, v2}, Ll/۟ۨᩴ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 108
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ll/᩻ܿۗ;->᩸()Ljava/util/function/Consumer;

    move-result-object v4

    check-cast v4, Ll/ۤ۟ۗ;

    invoke-virtual {v4, v2}, Ll/ۤ۟ۗ;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 110
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Setter invoke failed for option: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/᩻ܿۗ;->᩷(Ll/᩻ܿۗ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 104
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Parse failed for option: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/᩻ܿۗ;->᩷(Ll/᩻ܿۗ;)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v4, v1, v3, v2}, Ll/ۨ᩹ۧ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 104
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return-void
.end method
