.class public final Ll/۬ۙۨ;
.super Ll/ۛۢ᩵;
.source "GAN8"

# interfaces
.implements Ll/ۗۙۨ;


# instance fields
.field public final ֡:Ll/ۧۢ᩵;

.field public ֨:Ll/ۧۢ᩵;

.field public final ۟:I

.field public ۢ:Ll/ۛۢ᩵;

.field public final ᩳ:Ll/ۗۙۨ;


# direct methods
.method public constructor <init>(Ll/ۗۙۨ;Ll/ۧۢ᩵;)V
    .locals 2

    .line 36
    sget-object v0, Ll/ۖۙۨ;->ܰ:Ll/ۖۙۨ;

    sget-object v1, Ll/᩻ۢ᩵;->ܰ:Ll/᩻ۢ᩵;

    invoke-direct {p0, v0, v1}, Ll/ۛۢ᩵;-><init>(Ll/ۙۢ᩵;Ll/ۧۢ᩵;)V

    .line 34
    iput-object p1, p0, Ll/۬ۙۨ;->ᩳ:Ll/ۗۙۨ;

    .line 35
    iput-object p2, p0, Ll/۬ۙۨ;->֡:Ll/ۧۢ᩵;

    const/4 p1, 0x0

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Ll/ۜۙۨ;->᩶:Ll/ۜۙۨ;

    invoke-interface {p2, p1, v0}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Ll/۬ۙۨ;->۟:I

    return-void
.end method

.method private final ۙ(Ll/ۛۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 104
    invoke-interface {p1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v0

    .line 105
    invoke-static {v0}, Ll/۬ۜ᩵;->ۙ(Ll/ۧۢ᩵;)V

    .line 107
    iget-object v1, p0, Ll/۬ۙۨ;->֨:Ll/ۧۢ᩵;

    if-eq v1, v0, :cond_2

    .line 129
    instance-of v2, v1, Ll/ۡۙۨ;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۤ᩷ۨ;

    invoke-direct {v2, p0}, Ll/ۤ᩷ۨ;-><init>(Ll/۬ۙۨ;)V

    invoke-interface {v0, v1, v2}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 82
    iget v2, p0, Ll/۬ۙۨ;->۟:I

    if-ne v1, v2, :cond_0

    .line 110
    iput-object v0, p0, Ll/۬ۙۨ;->֨:Ll/ۧۢ᩵;

    goto :goto_0

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    iget-object v1, p0, Ll/۬ۙۨ;->֡:Ll/ۧۢ᩵;

    .line 84
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n\t\tbut emission happened in "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 130
    :cond_1
    check-cast v1, Ll/ۡۙۨ;

    .line 161
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    iget-object v1, v1, Ll/ۡۙۨ;->᩶:Ljava/lang/Throwable;

    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", but then emission attempt of value \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 166
    invoke-static {p2}, Ll/֨ۖ᩵;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_2
    :goto_0
    iput-object p1, p0, Ll/۬ۙۨ;->ۢ:Ll/ۛۢ᩵;

    .line 113
    invoke-static {}, Ll/᩷᩷ۨ;->ۙ()Ll/ۘ֨᩵;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    iget-object v1, p0, Ll/۬ۙۨ;->ᩳ:Ll/ۗۙۨ;

    invoke-static {v1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1, p2, p0}, Ll/ۘ֨᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;Ll/۬ۙۨ;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object p2, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    .line 118
    invoke-static {p1, p2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    .line 119
    iput-object p2, p0, Ll/۬ۙۨ;->ۢ:Ll/ۛۢ᩵;

    :cond_3
    return-object p1
.end method


# virtual methods
.method public final getContext()Ll/ۧۢ᩵;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/۬ۙۨ;->֨:Ll/ۧۢ᩵;

    if-nez v0, :cond_0

    sget-object v0, Ll/᩻ۢ᩵;->ܰ:Ll/᩻ۢ᩵;

    :cond_0
    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;Ll/ۛۢ᩵;)Ljava/lang/Object;
    .locals 1

    .line 82
    :try_start_0
    invoke-direct {p0, p2, p1}, Ll/۬ۙۨ;->ۙ(Ll/ۛۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    sget-object p2, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 80
    :cond_0
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p1

    :catchall_0
    move-exception p1

    .line 87
    new-instance v0, Ll/ۡۙۨ;

    invoke-interface {p2}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Ll/ۡۙۨ;-><init>(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    iput-object v0, p0, Ll/۬ۙۨ;->֨:Ll/ۧۢ᩵;

    .line 88
    throw p1
.end method

.method public final ۫()V
    .locals 0

    .line 66
    invoke-super {p0}, Ll/ۛۢ᩵;->۫()V

    return-void
.end method

.method public final ܳ()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 59
    invoke-static {p1}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ll/ۡۙۨ;

    invoke-virtual {p0}, Ll/۬ۙۨ;->getContext()Ll/ۧۢ᩵;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll/ۡۙۨ;-><init>(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    iput-object v1, p0, Ll/۬ۙۨ;->֨:Ll/ۧۢ᩵;

    .line 60
    :cond_0
    iget-object v0, p0, Ll/۬ۙۨ;->ۢ:Ll/ۛۢ᩵;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    .line 57
    :cond_1
    sget-object p1, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    return-object p1
.end method

.method public final ᩷()Ll/᩺ۢ᩵;
    .locals 2

    .line 38
    iget-object v0, p0, Ll/۬ۙۨ;->ۢ:Ll/ۛۢ᩵;

    invoke-static {v0}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
