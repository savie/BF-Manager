.class public final Ll/ۢ۟ܳ;
.super Ll/۠۟ܳ;
.source "EIQQ"


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f120778

    .line 9
    invoke-direct {p0, v0}, Ll/۠۟ܳ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ۙ(Lbin/mt/plus/Main;Ll/ۡۚ᩸;)V
    .locals 5

    .line 16
    sget v0, Ll/᩸ۙܳ;->ۚۤ:I

    const v0, 0x7f0d00a8

    .line 83
    invoke-virtual {p1, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0681

    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120778

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0186

    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩹ۖ᩸;

    const v2, 0x7f0a0187

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    const/4 v3, 0x1

    .line 86
    invoke-virtual {v1, v3}, Ll/᩺ۜ᩸;->᩻(Z)V

    invoke-virtual {v2, v3}, Ll/᩺ۜ᩸;->᩻(Z)V

    .line 87
    iget-object v3, p2, Ll/ۡۚ᩸;->ᩴ:Ljava/lang/String;

    iget-object v4, p2, Ll/ۡۚ᩸;->ܳ:Ljava/lang/String;

    invoke-static {v3, v4, v1, v2}, Ll/ۖۚ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    .line 88
    sget v3, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v3, Ll/ۖۖۧ;

    invoke-direct {v3, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 88
    invoke-virtual {v3, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    new-instance v0, Ll/ܺ۬ᩴ;

    invoke-direct {v0, p2, p1, v1, v2}, Ll/ܺ۬ᩴ;-><init>(Ll/ۡۚ᩸;Ll/ܽ֡֫;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    const p1, 0x7f1208c9

    .line 89
    invoke-virtual {v3, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    const/4 v0, 0x0

    .line 100
    invoke-virtual {v3, p1, v0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120313

    .line 101
    invoke-virtual {v3, p1, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v3}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ܽ۬ᩴ;

    invoke-direct {v0, p2, v1, v2}, Ll/ܽ۬ᩴ;-><init>(Ll/ۡۚ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    .line 102
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
