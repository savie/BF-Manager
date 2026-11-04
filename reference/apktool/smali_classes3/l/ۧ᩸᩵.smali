.class public final Ll/ۧ᩸᩵;
.super Ljava/lang/Object;
.source "46C7"


# instance fields
.field public final ۙ:Ll/֫ۖۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۧ᩸᩵;->ۙ:Ll/֫ۖۗ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۨᩳۗ;Ll/ۨᩳۗ;Ll/֫᩸᩵;)V
    .locals 4

    .line 21
    instance-of v0, p1, Ll/᩻ۡۗ;

    if-eqz v0, :cond_0

    .line 22
    move-object v0, p1

    check-cast v0, Ll/᩻ۡۗ;

    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p1}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object v0

    .line 25
    :goto_0
    instance-of v1, p2, Ll/᩻ۡۗ;

    if-eqz v1, :cond_1

    .line 26
    check-cast p2, Ll/᩻ۡۗ;

    goto :goto_1

    .line 27
    :cond_1
    invoke-interface {p2}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object p2

    .line 29
    :goto_1
    invoke-virtual {v0, p2}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 78
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v1

    invoke-virtual {p2}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    .line 74
    :cond_2
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰۙ()Ll/۠ۡۗ;

    move-result-object v0

    invoke-virtual {p2}, Ll/᩻ۡۗ;->ܰۙ()Ll/۠ۡۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۠ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    :cond_3
    invoke-interface {p1}, Ll/᩵ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۢᩳۗ;->᩻()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    .line 36
    invoke-interface {p3, p1, p2}, Ll/֫᩸᩵;->ۙ(Ll/᩵ۡۗ;I)V

    .line 69
    :cond_4
    invoke-interface {p1}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object p1

    if-nez p1, :cond_3

    goto/16 :goto_4

    .line 41
    :cond_5
    invoke-interface {p1}, Ll/᩵ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_3

    .line 46
    :cond_6
    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩻()Z

    move-result v1

    iget-object v2, p0, Ll/ۧ᩸᩵;->ۙ:Ll/֫ۖۗ;

    const/4 v3, 0x1

    if-nez v1, :cond_a

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    .line 53
    :cond_7
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 54
    invoke-interface {p1}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 82
    invoke-virtual {v2}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v1

    invoke-virtual {p2}, Ll/᩻ۡۗ;->ܿۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۚ᩸᩵;

    invoke-direct {v2, v0}, Ll/ۚ᩸᩵;-><init>(Ll/᩻ۡۗ;)V

    .line 83
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 56
    :cond_8
    invoke-interface {p3, p1, v3}, Ll/֫᩸᩵;->ۙ(Ll/᩵ۡۗ;I)V

    goto :goto_3

    .line 59
    :cond_9
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not supported"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 47
    :cond_a
    :goto_2
    invoke-interface {p1}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 82
    invoke-virtual {v2}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v1

    invoke-virtual {p2}, Ll/᩻ۡۗ;->ܿۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۚ᩸᩵;

    invoke-direct {v2, v0}, Ll/ۚ᩸᩵;-><init>(Ll/᩻ۡۗ;)V

    .line 83
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v3, 0x4

    .line 52
    :cond_b
    invoke-interface {p3, p1, v3}, Ll/֫᩸᩵;->ۙ(Ll/᩵ۡۗ;I)V

    .line 69
    :cond_c
    :goto_3
    invoke-interface {p1}, Ll/᩵ۡۗ;->getDeclaringClass()Ll/᩻ۡۗ;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_d
    :goto_4
    return-void
.end method
