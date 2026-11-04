.class public final Ll/ۤ᩷ۨ;
.super Ll/۫ۡ᩵;
.source "5AMS"

# interfaces
.implements Ll/᩺֨᩵;


# instance fields
.field public final synthetic ᩶:Ll/۬ۙۨ;


# direct methods
.method public constructor <init>(Ll/۬ۙۨ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤ᩷ۨ;->᩶:Ll/۬ۙۨ;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ll/۫ۡ᩵;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 24
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ll/ۚۢ᩵;

    .line 25
    invoke-interface {p2}, Ll/ۚۢ᩵;->getKey()Ll/֫ۢ᩵;

    move-result-object v0

    .line 26
    iget-object v1, p0, Ll/ۤ᩷ۨ;->᩶:Ll/۬ۙۨ;

    iget-object v1, v1, Ll/۬ۙۨ;->֡:Ll/ۧۢ᩵;

    invoke-interface {v1, v0}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object v1

    .line 27
    sget-object v2, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    if-eq v0, v2, :cond_1

    if-eq p2, v1, :cond_0

    const/high16 p1, -0x80000000

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 32
    :cond_1
    check-cast v1, Ll/ۡۜ᩵;

    .line 33
    check-cast p2, Ll/ۡۜ᩵;

    :goto_1
    if-nez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_2

    :cond_2
    if-ne p2, v1, :cond_3

    goto :goto_2

    .line 95
    :cond_3
    instance-of v0, p2, Ll/֨᩷ۨ;

    if-nez v0, :cond_6

    :goto_2
    if-ne p2, v1, :cond_5

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 80
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 66
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", expected child of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_6
    invoke-interface {p2}, Ll/ۡۜ᩵;->getParent()Ll/ۡۜ᩵;

    move-result-object p2

    goto :goto_1
.end method
