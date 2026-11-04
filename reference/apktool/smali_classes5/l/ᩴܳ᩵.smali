.class public final Ll/ᩴܳ᩵;
.super Ljava/lang/Object;
.source "S6ET"

# interfaces
.implements Ll/ۘܳ᩵;


# instance fields
.field public final ֡:Ll/֫֨ۗ;

.field public ֨:Z

.field public final ۖ:Ll/ۜ۫᩵;

.field public final ۟:Z

.field public final ۡ:Ll/ۢ۫᩵;

.field public ۢ:Z

.field public ܰ:Z

.field public final ܿ:Ljava/util/Iterator;

.field public ᩳ:Ll/ۙۖ۫;

.field public ᩶:Ljava/util/function/Predicate;


# direct methods
.method public constructor <init>(Ll/ۢ۫᩵;Ll/ۜ۫᩵;Ljava/util/List;Ll/֫֨ۗ;Z)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Ll/ᩴܳ᩵;->֨:Z

    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Ll/ᩴܳ᩵;->ܰ:Z

    .line 31
    iput-boolean v0, p0, Ll/ᩴܳ᩵;->ۢ:Z

    .line 35
    iput-object p1, p0, Ll/ᩴܳ᩵;->ۡ:Ll/ۢ۫᩵;

    .line 36
    iput-object p2, p0, Ll/ᩴܳ᩵;->ۖ:Ll/ۜ۫᩵;

    .line 37
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܳ᩵;->ܿ:Ljava/util/Iterator;

    .line 38
    iput-object p4, p0, Ll/ᩴܳ᩵;->֡:Ll/֫֨ۗ;

    .line 39
    iput-boolean p5, p0, Ll/ᩴܳ᩵;->۟:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ArgsListUpdateCallback"

    return-object v0
.end method

.method public final ۙ()Ll/ۙۚ᩵;
    .locals 1

    const/4 v0, 0x1

    .line 80
    iput-boolean v0, p0, Ll/ᩴܳ᩵;->ۢ:Z

    .line 81
    sget-object v0, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    invoke-virtual {p0, v0}, Ll/ᩴܳ᩵;->ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;
    .locals 6

    .line 45
    :cond_0
    iget-boolean v0, p0, Ll/ᩴܳ᩵;->֨:Z

    if-nez v0, :cond_2

    .line 46
    sget-object v0, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    if-ne p1, v0, :cond_2

    .line 97
    iget-object v0, p0, Ll/ᩴܳ᩵;->ᩳ:Ll/ۙۖ۫;

    if-eqz v0, :cond_1

    .line 98
    invoke-virtual {v0, p1}, Ll/ۙۖ۫;->ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;

    :cond_1
    return-object p1

    .line 50
    :cond_2
    sget-object v0, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    .line 51
    iput-boolean v1, p0, Ll/ᩴܳ᩵;->ܰ:Z

    .line 105
    :cond_3
    iget-object p1, p0, Ll/ᩴܳ᩵;->᩶:Ljava/util/function/Predicate;

    .line 107
    :cond_4
    iget-object v0, p0, Ll/ᩴܳ᩵;->ܿ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    move-object v0, v3

    goto :goto_0

    .line 110
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    if-eqz p1, :cond_6

    .line 111
    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_6
    :goto_0
    if-nez v0, :cond_9

    .line 55
    iget-boolean p1, p0, Ll/ᩴܳ᩵;->ܰ:Z

    if-eqz p1, :cond_7

    sget-object p1, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    goto :goto_1

    :cond_7
    sget-object p1, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    .line 97
    :goto_1
    iget-object v0, p0, Ll/ᩴܳ᩵;->ᩳ:Ll/ۙۖ۫;

    if-eqz v0, :cond_8

    .line 98
    invoke-virtual {v0, p1}, Ll/ۙۖ۫;->ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;

    :cond_8
    return-object p1

    .line 67
    :cond_9
    iget-boolean p1, p0, Ll/ᩴܳ᩵;->ۢ:Z

    if-eqz p1, :cond_a

    .line 69
    iput-boolean v1, p0, Ll/ᩴܳ᩵;->ۢ:Z

    move-object p1, p0

    goto :goto_2

    :cond_a
    move-object p1, v3

    .line 73
    :goto_2
    iget-boolean v1, p0, Ll/ᩴܳ᩵;->۟:Z

    iget-object v2, p0, Ll/ᩴܳ᩵;->֡:Ll/֫֨ۗ;

    iget-object v4, p0, Ll/ᩴܳ᩵;->ۖ:Ll/ۜ۫᩵;

    if-eqz v1, :cond_b

    .line 188
    new-instance v1, Ll/۬۫᩵;

    const/4 v5, 0x1

    invoke-direct {v1, v0, v2, v5, p1}, Ll/۬۫᩵;-><init>(Ll/ܺ֨ۗ;Ll/֫֨ۗ;ZLl/ۘܳ᩵;)V

    invoke-virtual {v4, v1}, Ll/ۜ۫᩵;->ۙ(Ll/۬۫᩵;)V

    move-object p1, v3

    goto :goto_3

    .line 76
    :cond_b
    iget-object v1, p0, Ll/ᩴܳ᩵;->ۡ:Ll/ۢ۫᩵;

    invoke-virtual {v1, v4, v0, v2, p1}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    :goto_3
    if-nez p1, :cond_0

    return-object v3
.end method

.method public final ۙ(Ljava/util/function/Predicate;)V
    .locals 0

    .line 89
    iput-object p1, p0, Ll/ᩴܳ᩵;->᩶:Ljava/util/function/Predicate;

    return-void
.end method

.method public final ۙ(Ll/ۙۖ۫;)V
    .locals 0

    .line 85
    iput-object p1, p0, Ll/ᩴܳ᩵;->ᩳ:Ll/ۙۖ۫;

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Ll/ᩴܳ᩵;->֨:Z

    return-void
.end method
