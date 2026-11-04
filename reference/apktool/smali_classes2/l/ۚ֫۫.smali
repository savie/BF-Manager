.class public final synthetic Ll/ۚ֫۫;
.super Ljava/lang/Object;
.source "B29A"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/۠ۢᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۢᩴ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۚ֫۫;->ܰ:I

    iput-object p1, p0, Ll/ۚ֫۫;->᩶:Ll/۠ۢᩴ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ۚ֫۫;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۚ֫۫;->᩶:Ll/۠ۢᩴ;

    invoke-virtual {v0, p1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 324
    :pswitch_0
    invoke-static {}, Ll/᩶᩷ۧ;->ܳ()Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 326
    iget-object v0, p0, Ll/ۚ֫۫;->᩶:Ll/۠ۢᩴ;

    invoke-virtual {v0}, Ll/۠ۢᩴ;->ᩴ()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 327
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    .line 328
    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    if-le v1, v2, :cond_0

    move v3, v2

    move v2, v1

    move v1, v3

    .line 334
    :cond_0
    invoke-interface {v0, v1, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 335
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v1

    invoke-static {v0, p1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_0

    :cond_1
    const p1, 0x7f120c48

    .line 337
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
