.class public final Ll/ᩳ᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "1IY6"


# static fields
.field public static final ᩶:Ll/ᩳ᩸᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Ll/ᩳ᩸᩵;

    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 18
    sput-object v0, Ll/ᩳ᩸᩵;->᩶:Ll/ᩳ᩸᩵;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 21
    sget-object v0, Ll/ᩳ᩸᩵;->᩶:Ll/ᩳ᩸᩵;

    invoke-static {p0, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    return-void
.end method


# virtual methods
.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 2

    .line 26
    instance-of v0, p2, Ll/ۜۖۗ;

    if-eqz v0, :cond_0

    .line 28
    check-cast p2, Ll/ۜۖۗ;

    .line 29
    invoke-virtual {p2}, Ll/ۜۖۗ;->᩻ۙ()V

    return-void

    .line 30
    :cond_0
    instance-of v0, p2, Ll/ܰۖۗ;

    if-eqz v0, :cond_1

    .line 31
    check-cast p2, Ll/ܰۖۗ;

    invoke-static {p1, p2}, Ll/ܰᩴ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰۖۗ;)V

    return-void

    .line 32
    :cond_1
    instance-of p1, p2, Ll/ۨۖۗ;

    if-eqz p1, :cond_6

    .line 33
    check-cast p2, Ll/ۨۖۗ;

    .line 41
    invoke-virtual {p2}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    .line 42
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    .line 0
    invoke-static {p1, v0}, Lcom/umeng/analytics/pro/j$$ExternalSyntheticOutline0;->m(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 45
    check-cast p1, Ll/ۛۡۗ;

    .line 46
    sget-object v0, Ll/ۧ۟ۗ;->۫:Ll/ۧ۟ۗ;

    invoke-interface {p1, v0}, Ll/ۛ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۟ۗ;

    .line 51
    invoke-virtual {v0}, Ll/ᩳ۟ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 54
    :cond_4
    instance-of v1, p1, Ll/᩷ۡۗ;

    if-eqz v1, :cond_5

    .line 55
    check-cast p1, Ll/᩷ۡۗ;

    .line 56
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 57
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Ll/ᩳ۟ۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object p2

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 61
    :cond_5
    new-instance p1, Ll/֡ۡۗ;

    invoke-virtual {v0}, Ll/ᩳ۟ۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/֡ۡۗ;-><init>(Ll/ᩳۡۗ;)V

    invoke-virtual {p2, p1}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    :cond_6
    :goto_0
    return-void
.end method
