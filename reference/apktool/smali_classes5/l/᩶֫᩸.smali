.class public final synthetic Ll/᩶֫᩸;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩸ۡ᩸;
.implements Ll/ۚۘܳ;
.implements Ll/ܶۤۧ;
.implements Ll/ܰ᩶᩺;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ll/۠᩹ۙ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠᩹ۙ;

    .line 6
    check-cast p1, Ll/ᩴᩳۙ;

    .line 617
    invoke-interface {p1, v0}, Ll/ᩴᩳۙ;->ۙ(Ll/۠᩹ۙ;)V

    return-void
.end method

.method public ۙ(Landroid/content/Intent;I)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ۛ᩷᩻;

    invoke-static {p1}, Ll/ۛ᩷᩻;->ܳ(Ll/ۛ᩷᩻;)V

    return-void
.end method

.method public ۙ(Ll/ۧܿ᩺;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩴܳۘ;

    invoke-static {v0, p1}, Ll/ᩴܳۘ;->ۙ(Ll/ᩴܳۘ;Ll/ۧܿ᩺;)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩶֫᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    const/4 v1, 0x0

    .line 1096
    invoke-static {p1, v0, v1}, Ll/ۗ۟ۤ;->᩸(Ll/᩷ۨᩴ;Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
