.class public final synthetic Ll/ۖۙ۫;
.super Ljava/lang/Object;
.source "Y5PI"

# interfaces
.implements Ll/ۚۘܳ;
.implements Ll/ܽۧܺ;
.implements Ll/᩶ۚܺ;
.implements Ll/᩸ۖ;
.implements Ll/֡֨֫;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/ۘۜ;)Ll/ۘۜ;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    sget v1, Ll/۫᩹֫;->ۧ᩷:I

    const/4 v1, 0x1

    .line 166
    invoke-virtual {p2, v1}, Ll/ۘۜ;->ۙ(I)Ll/۫ᩳ;

    move-result-object v1

    const/4 v2, 0x2

    .line 167
    invoke-virtual {p2, v2}, Ll/ۘۜ;->ۙ(I)Ll/۫ᩳ;

    move-result-object v2

    const/16 v3, 0x8

    .line 168
    invoke-virtual {p2, v3}, Ll/ۘۜ;->ۙ(I)Ll/۫ᩳ;

    move-result-object v3

    .line 169
    iget v1, v1, Ll/۫ᩳ;->᩸:I

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 170
    iget v0, v2, Ll/۫ᩳ;->ۙ:I

    iget v1, v3, Ll/۫ᩳ;->ۙ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, v4, v4, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܳ᩷۫;

    invoke-interface {v0, p1}, Ll/ܳ᩷۫;->᩷(I)V

    return-void
.end method

.method public ۙ(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩵ܽۧ;

    invoke-static {v0, p1}, Ll/᩵ܽۧ;->᩷(Ll/᩵ܽۧ;Ljava/lang/String;)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 1736
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ll/ۗ۟ۤ;->ۙ(Ll/۠ۨܳ;[Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۖۙ۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/֨֡᩻;

    .line 95
    invoke-static {v0}, Ll/۠֡᩻;->᩷(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
