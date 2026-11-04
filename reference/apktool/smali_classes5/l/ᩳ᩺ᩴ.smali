.class public final synthetic Ll/ᩳ᩺ᩴ;
.super Ljava/lang/Object;
.source "313P"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۘܳ;
.implements Ll/᩶ܽ;
.implements Ll/᩶ۚܺ;
.implements Ll/ܰ᩶᩺;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳ᩺ᩴ;->ܰ:I

    iput-object p2, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ll/ܺ᩶ۙ;)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/ᩳ᩺ᩴ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܺ᩶ۙ;

    .line 6
    check-cast p1, Ll/ᩴᩳۙ;

    .line 358
    invoke-interface {p1, v0}, Ll/ᩴᩳۙ;->ۙ(Ll/ܺ᩶ۙ;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ᩴۡܳ;

    invoke-static {v0, p1}, Ll/ᩴۡܳ;->ۙ(Ll/ᩴۡܳ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(Ll/ۧܿ᩺;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܰ᩶᩺;

    invoke-interface {v0, p1}, Ll/ܰ᩶᩺;->ۙ(Ll/ۧܿ᩺;)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 114
    new-instance v1, Ll/ۖۖᩴ;

    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ll/ۖۖᩴ;-><init>(Ll/ܽ֡֫;Ll/᩷ۨᩴ;)V

    invoke-virtual {v1}, Ll/ۖۖᩴ;->ۙ()V

    return-void
.end method

.method public synthetic ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget v0, p0, Ll/ᩳ᩺ᩴ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩷ۨᩴ;

    .line 268
    invoke-static {v0}, Ll/۠֡᩻;->ۙ(Ll/᩷ۨᩴ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/֨֡᩻;

    .line 76
    invoke-static {v0}, Ll/۠֡᩻;->ۙ(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
