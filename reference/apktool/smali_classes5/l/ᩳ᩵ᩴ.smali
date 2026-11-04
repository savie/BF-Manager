.class public final synthetic Ll/ᩳ᩵ᩴ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/֫᩷ᩴ;
.implements Ll/֫ۛᩴ;
.implements Ll/᩶ۚܺ;
.implements Ll/ܽۧܺ;
.implements Ll/۫֨ܳ;
.implements Ll/᩸ۖ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/ۘۜ;)Ll/ۘۜ;
    .locals 4

    .line 2
    iget-object p1, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/ܶ᩹;

    const/16 v0, 0x87

    .line 117
    invoke-virtual {p2, v0}, Ll/ۘۜ;->᩷(I)Ll/۫ᩳ;

    move-result-object v0

    .line 119
    iget v1, v0, Ll/۫ᩳ;->᩷:I

    iget v2, v0, Ll/۫ᩳ;->᩸:I

    iget v0, v0, Ll/۫ᩳ;->ۤ:I

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩻᩹۫;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void
.end method

.method public ۙ(IIII)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/᩻ۡ᩸;

    invoke-static {p1, p2, p3, p4}, Ll/᩻ۡ᩸;->ۙ(Ll/᩻ۡ᩸;III)V

    return-void
.end method

.method public ۙ(Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۡۗܳ;

    .line 90
    invoke-virtual {v0}, Ll/ۡۗܳ;->ᩴ()Landroid/text/SpannableString;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    const/4 p1, 0x4

    .line 91
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۛۚۤ;

    .line 975
    invoke-virtual {p1, v0}, Ll/᩷ۨᩴ;->ۙ(Ll/ۛۚۤ;)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳ᩵ᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ᩳ֡᩻;

    .line 111
    invoke-static {v0}, Ll/۠֡᩻;->ۙ(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
