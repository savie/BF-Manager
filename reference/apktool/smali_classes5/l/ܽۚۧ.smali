.class public final synthetic Ll/ܽۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩶ۚܺ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ܿ֫ܺ;
.implements Ll/ܰ᩶᩺;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/֡᩹ۙ;

    .line 6
    check-cast p1, Ll/ۤۗۙ;

    .line 2192
    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ll/֡᩹ۙ;)V

    return-void
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/֨֫ۧ;

    check-cast p1, Ll/ۜܳۤ;

    invoke-static {v0, p1}, Ll/֨֫ۧ;->ۙ(Ll/֨֫ۧ;Ll/ۜܳۤ;)V

    return-void
.end method

.method public ۙ(Ll/ۧܿ᩺;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩴۘ᩺;

    invoke-static {v0, p1}, Ll/ᩴۘ᩺;->ۙ(Ll/ᩴۘ᩺;Ll/ۧܿ᩺;)V

    return-void
.end method

.method public synthetic ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 338
    new-instance v1, Ll/ۡ֡᩻;

    invoke-direct {v1, v0}, Ll/ۡ֡᩻;-><init>(Ll/᩷ۨᩴ;)V

    .line 219
    invoke-static {v1}, Ll/۠֡᩻;->ۙ(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
