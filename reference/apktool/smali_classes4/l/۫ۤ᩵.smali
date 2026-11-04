.class public final synthetic Ll/۫ۤ᩵;
.super Ljava/lang/Object;
.source "I6FF"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ֡:Ll/᩷ۡۗ;

.field public final synthetic ܰ:Ll/ۡ᩷᩵;

.field public final synthetic ܿ:Ll/ۡ᩷᩵;

.field public final synthetic ᩶:Ll/᩷ۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩷᩵;Ll/᩷ۡۗ;Ll/ۡ᩷᩵;Ll/᩷ۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۤ᩵;->ܰ:Ll/ۡ᩷᩵;

    iput-object p2, p0, Ll/۫ۤ᩵;->᩶:Ll/᩷ۡۗ;

    iput-object p3, p0, Ll/۫ۤ᩵;->ܿ:Ll/ۡ᩷᩵;

    iput-object p4, p0, Ll/۫ۤ᩵;->֡:Ll/᩷ۡۗ;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    check-cast p1, Ll/֨ۤ᩵;

    .line 56
    invoke-virtual {p1}, Ll/֨ۤ᩵;->ᩴ()Ll/ۡ᩷᩵;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۤ᩵;->ܰ:Ll/ۡ᩷᩵;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    .line 40
    invoke-virtual {p1}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object p1

    iget-object v0, p0, Ll/۫ۤ᩵;->᩶:Ll/᩷ۡۗ;

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 57
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 58
    :cond_2
    invoke-virtual {p1}, Ll/֨ۤ᩵;->ᩴ()Ll/ۡ᩷᩵;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۤ᩵;->ܿ:Ll/ۡ᩷᩵;

    if-ne v0, v1, :cond_5

    .line 40
    invoke-virtual {p1}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    .line 44
    :cond_3
    invoke-virtual {p1}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object p1

    iget-object v0, p0, Ll/۫ۤ᩵;->֡:Ll/᩷ۡۗ;

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v2, 0x0

    .line 59
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 61
    :cond_5
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Unknown global traverser state. Has a global state been duplicated?"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
