.class public abstract Ll/ۤܰܽ;
.super Ll/ܽۨܽ;
.source "0B0D"


# instance fields
.field public final ۙ:Ljava/util/List;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 854
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    .line 855
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۤܰܽ;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 5

    .line 864
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    .line 865
    invoke-virtual {p1}, Ll/ۘܰܽ;->۟()V

    const/4 p1, 0x0

    return-object p1

    .line 868
    :cond_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    .line 869
    iget-object v0, p0, Ll/ۤܰܽ;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [J

    .line 870
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    sget-object v3, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    if-eq v2, v3, :cond_2

    .line 871
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v2

    .line 872
    invoke-interface {v0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    .line 874
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܿ()J

    move-result-wide v3

    aput-wide v3, v1, v2

    goto :goto_0

    .line 876
    :cond_1
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 879
    :cond_2
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    .line 880
    invoke-virtual {p0, v1}, Ll/ۤܰܽ;->ۙ([J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۙ([J)Ljava/lang/Object;
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 3

    if-nez p2, :cond_0

    .line 886
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܶ()Ll/᩶ܰܽ;

    return-void

    .line 889
    :cond_0
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    .line 890
    invoke-virtual {p0, p2}, Ll/ۤܰܽ;->ۙ(Ljava/lang/Object;)[J

    move-result-object p2

    const/4 v0, 0x0

    .line 891
    :goto_0
    iget-object v1, p0, Ll/ۤܰܽ;->ۙ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 892
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 893
    aget-wide v1, p2, v0

    invoke-virtual {p1, v1, v2}, Ll/᩶ܰܽ;->᩷(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 895
    :cond_1
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method

.method public abstract ۙ(Ljava/lang/Object;)[J
.end method
