.class public final Ll/᩶ᩴۙ;
.super Ljava/lang/Object;
.source "NB2C"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public ֡:I

.field public ۟:I

.field public final ܰ:Landroid/widget/EditText;

.field public ܿ:Ll/᩷᩸ۙ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/᩶ᩴۙ;->ܰ:Landroid/widget/EditText;

    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Ll/᩶ᩴۙ;->᩶:Z

    return-void
.end method

.method public static ۙ(Landroid/widget/EditText;I)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    if-eqz p0, :cond_3

    .line 171
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 172
    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object p0

    .line 174
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    .line 175
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    .line 177
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 1072
    :goto_0
    invoke-virtual {v1, v2, v3, p0}, Ll/֫᩸ۙ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    if-ltz p1, :cond_1

    if-ltz v0, :cond_1

    .line 178
    invoke-static {p0, p1, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    return-void

    :cond_1
    if-ltz p1, :cond_2

    .line 180
    invoke-static {p0, p1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    return-void

    :cond_2
    if-ltz v0, :cond_3

    .line 182
    invoke-static {p0, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .line 90
    iget-object v0, p0, Ll/᩶ᩴۙ;->ܰ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_4

    .line 80
    iget-boolean v1, p0, Ll/᩶ᩴۙ;->᩶:Z

    if-eqz v1, :cond_4

    invoke-static {}, Ll/֫᩸ۙ;->ᩴ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    iget v1, p0, Ll/᩶ᩴۙ;->۟:I

    .line 94
    iget v2, p0, Ll/᩶ᩴۙ;->֡:I

    if-lez v2, :cond_4

    .line 97
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֫᩸ۙ;->ۙ()I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 p1, 0x3

    if-eq v3, p1, :cond_2

    goto :goto_0

    .line 99
    :cond_1
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v0

    add-int/2addr v2, v1

    invoke-virtual {v0, v1, v2, p1}, Ll/֫᩸ۙ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    return-void

    .line 104
    :cond_2
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object p1

    .line 118
    iget-object v1, p0, Ll/᩶ᩴۙ;->ܿ:Ll/᩷᩸ۙ;

    if-nez v1, :cond_3

    .line 119
    new-instance v1, Ll/ܰᩴۙ;

    invoke-direct {v1, v0}, Ll/ܰᩴۙ;-><init>(Landroid/widget/EditText;)V

    iput-object v1, p0, Ll/᩶ᩴۙ;->ܿ:Ll/᩷᩸ۙ;

    .line 121
    :cond_3
    iget-object v0, p0, Ll/᩶ᩴۙ;->ܿ:Ll/᩷᩸ۙ;

    .line 104
    invoke-virtual {p1, v0}, Ll/֫᩸ۙ;->ۙ(Ll/᩷᩸ۙ;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 75
    iput p2, p0, Ll/᩶ᩴۙ;->۟:I

    .line 76
    iput p4, p0, Ll/᩶ᩴۙ;->֡:I

    return-void
.end method

.method public final ۙ(Z)V
    .locals 2

    .line 129
    iget-boolean v0, p0, Ll/᩶ᩴۙ;->᩶:Z

    if-eq v0, p1, :cond_1

    .line 130
    iget-object v0, p0, Ll/᩶ᩴۙ;->ܿ:Ll/᩷᩸ۙ;

    if-eqz v0, :cond_0

    .line 131
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ᩴۙ;->ܿ:Ll/᩷᩸ۙ;

    invoke-virtual {v0, v1}, Ll/֫᩸ۙ;->᩷(Ll/᩷᩸ۙ;)V

    .line 133
    :cond_0
    iput-boolean p1, p0, Ll/᩶ᩴۙ;->᩶:Z

    if-eqz p1, :cond_1

    .line 135
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֫᩸ۙ;->ۙ()I

    move-result p1

    iget-object v0, p0, Ll/᩶ᩴۙ;->ܰ:Landroid/widget/EditText;

    invoke-static {v0, p1}, Ll/᩶ᩴۙ;->ۙ(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Ll/᩶ᩴۙ;->᩶:Z

    return v0
.end method
