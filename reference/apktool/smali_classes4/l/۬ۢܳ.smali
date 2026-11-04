.class public final synthetic Ll/۬ۢܳ;
.super Ljava/lang/Object;
.source "98EM"

# interfaces
.implements Ll/ۤ֨ܳ;
.implements Ll/᩶ܽ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۬ۢܳ;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/۬ۢܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/۬ۢܳ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Landroid/view/View$OnClickListener;

    .line 6
    iget-object v1, p0, Ll/۬ۢܳ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ljava/lang/String;

    .line 500
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/4 v2, 0x5

    .line 501
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    if-nez v0, :cond_0

    .line 503
    invoke-static {p1, v1}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void

    .line 505
    :cond_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 507
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 508
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 509
    invoke-static {p1}, Ll/ܳۤܺ;->᩷(Landroid/widget/TextView;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/۬ۢܳ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/֨ܰ֫;

    iget-object v1, p0, Ll/۬ۢܳ;->᩶:Ljava/lang/Object;

    check-cast v1, Lbin/mt/plugin/api/ui/menu/PluginMenu$OnMenuItemClickListener;

    invoke-static {v0, v1, p1}, Ll/֨ܰ֫;->ۙ(Ll/֨ܰ֫;Lbin/mt/plugin/api/ui/menu/PluginMenu$OnMenuItemClickListener;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
