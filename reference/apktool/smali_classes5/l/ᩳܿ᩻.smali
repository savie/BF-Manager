.class public final synthetic Ll/ᩳܿ᩻;
.super Ljava/lang/Object;
.source "P9S5"

# interfaces
.implements Ll/۟᩵ۙ;
.implements Ll/᩶ۚܺ;
.implements Ll/ܶۤۧ;
.implements Ll/ܺ֡᩻;
.implements Ll/ܽۧܺ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܿܶ᩷;

    check-cast p1, Ll/ܶܶ᩷;

    invoke-static {v0, p1}, Ll/ܿܶ᩷;->ۙ(Ll/ܿܶ᩷;Ll/ܶܶ᩷;)V

    return-void
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۘᩴܺ;

    invoke-interface {v0, p1}, Ll/ۘᩴܺ;->ۙ(I)V

    return-void
.end method

.method public ۙ(Landroid/content/Intent;I)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ܽ֡֫;

    invoke-static {p1, p2}, Ll/ܽ֡֫;->ۙ(Ll/ܽ֡֫;I)V

    return-void
.end method

.method public ۙ(Ll/ܽ֡᩻;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ۜܿ᩻;

    invoke-static {p1, p2}, Ll/ۜܿ᩻;->ۙ(Ll/ۜܿ᩻;I)Z

    move-result p1

    return p1
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳܿ᩻;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 267
    invoke-static {v0}, Ll/۠֡᩻;->᩷(Ll/᩷ۨᩴ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
