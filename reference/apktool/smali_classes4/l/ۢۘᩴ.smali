.class public final synthetic Ll/ۢۘᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ll/᩶ܽ;
.implements Ll/ۤ֨ܳ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢۘᩴ;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢۘᩴ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۢۘᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 6
    iget-object v1, p0, Ll/ۢۘᩴ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Landroid/view/View$OnLongClickListener;

    .line 449
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v2, 0xa

    .line 450
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 451
    invoke-static {p1, v0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_0

    .line 453
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۢۘᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܺۛᩴ;

    .line 6
    iget-object v1, p0, Ll/ۢۘᩴ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/᩵ۘᩴ;

    .line 179
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f120b04

    if-ne p1, v2, :cond_0

    .line 181
    invoke-interface {v0}, Ll/ܺۛᩴ;->ۤ()Landroid/content/ComponentName;

    move-result-object p1

    .line 182
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "dsai"

    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    const p1, 0x7f1208d6

    .line 183
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto :goto_0

    :cond_0
    const v2, 0x7f1208d1

    if-ne p1, v2, :cond_1

    .line 185
    invoke-virtual {v1, v0}, Ll/᩵ۘᩴ;->ۙ(Ll/ܺۛᩴ;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
