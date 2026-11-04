.class public final synthetic Ll/᩺ۤۤ;
.super Ljava/lang/Object;
.source "45G7"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۧ۫ۤ;
.implements Ll/ۚۘܳ;
.implements Ll/᩸ۖ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۤۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩺ۤۤ;->ܰ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 725
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/View;Ll/ۘۜ;)Ll/ۘۜ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩺ۤۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩵᩵֫;

    invoke-static {v0, p1, p2}, Ll/᩵᩵֫;->ۙ(Ll/᩵᩵֫;Landroid/view/View;Ll/ۘۜ;)V

    return-object p2
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩺ۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 1636
    invoke-static {v0, p1}, Ll/ۗ۠ᩴ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩺ۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
