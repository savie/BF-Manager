.class public final Ll/ۘᩴ᩵;
.super Ll/ۛ᩸ۨ;
.source "X6IH"


# instance fields
.field public final synthetic ֡:Ll/ܰۖۗ;

.field public final synthetic ܿ:Ll/ۛۡۗ;

.field public final synthetic ᩶:Ll/ܿۧ᩵;


# direct methods
.method public constructor <init>(Ll/ۛۡۗ;Ll/ܿۧ᩵;Ll/ܰۖۗ;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 398
    iput-object p1, p0, Ll/ۘᩴ᩵;->ܿ:Ll/ۛۡۗ;

    iput-object p2, p0, Ll/ۘᩴ᩵;->᩶:Ll/ܿۧ᩵;

    iput-object p3, p0, Ll/ۘᩴ᩵;->֡:Ll/ܰۖۗ;

    return-void
.end method


# virtual methods
.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 2

    .line 402
    iget-object p1, p0, Ll/ۘᩴ᩵;->ܿ:Ll/ۛۡۗ;

    if-ne p2, p1, :cond_0

    goto :goto_0

    .line 406
    :cond_0
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۡۗ;

    .line 407
    instance-of v0, p1, Ll/᩷ۡۗ;

    if-eqz v0, :cond_2

    .line 408
    check-cast p1, Ll/᩷ۡۗ;

    .line 409
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 410
    iget-object v1, p0, Ll/ۘᩴ᩵;->᩶:Ll/ܿۧ᩵;

    invoke-virtual {v1, v0}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 425
    :goto_0
    sget-object p1, Ll/֫۟ۗ;->ܶۙ:Ll/֫۟ۗ;

    invoke-interface {p2, p1}, Ll/ۛ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p2}, Ll/᩵ۧ᩵;->۫(Ll/ۛۡۗ;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 418
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    .line 429
    new-instance p2, Ll/ᩳۡۗ;

    sget-object v0, Ll/᩺ۢۗ;->ᩳ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 430
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 431
    new-instance v0, Ll/ۘᩳۗ;

    iget-object v1, p0, Ll/ۘᩴ᩵;->֡:Ll/ܰۖۗ;

    invoke-direct {v0, v1}, Ll/ۘᩳۗ;-><init>(Ll/ܰۖۗ;)V

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 432
    new-instance v0, Ll/֡ۡۗ;

    invoke-direct {v0, p2}, Ll/֡ۡۗ;-><init>(Ll/ᩳۡۗ;)V

    .line 418
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
