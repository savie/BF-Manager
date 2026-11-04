.class public final synthetic Ll/ۛۤۤ;
.super Ljava/lang/Object;
.source "45G7"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۧ۫ۤ;
.implements Ll/ۚۘܳ;
.implements Ll/ܰܽ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛۤۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۗۗۙ;

    .line 6
    check-cast p1, Ll/ۤۗۙ;

    .line 1271
    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ll/ۗۗۙ;)V

    return-void
.end method

.method public ۙ(Ll/ܿܽ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۛۤۤ;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ܶۘۧ;

    invoke-static {p1}, Ll/ܶۘۧ;->ۙ(Ll/ܶۘۧ;)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 1633
    invoke-static {v0, p1}, Ll/ۗ۠ᩴ;->᩷(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/HashSet;

    if-eqz p1, :cond_0

    .line 336
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
