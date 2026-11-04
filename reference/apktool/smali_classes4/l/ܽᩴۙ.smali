.class public final Ll/ܽᩴۙ;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "ZB20"


# instance fields
.field public final ۙ:Ll/ܺᩴۙ;

.field public final ᩷:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    .line 46
    new-instance v0, Ll/ܺᩴۙ;

    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 55
    invoke-direct {p0, p2, v1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 56
    iput-object p1, p0, Ll/ܽᩴۙ;->᩷:Landroid/widget/TextView;

    .line 57
    iput-object v0, p0, Ll/ܽᩴۙ;->ۙ:Ll/ܺᩴۙ;

    .line 92
    invoke-static {}, Ll/֫᩸ۙ;->ᩴ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 93
    invoke-static {}, Ll/֫᩸ۙ;->᩸()Ll/֫᩸ۙ;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/֫᩸ۙ;->ۙ(Landroid/view/inputmethod/EditorInfo;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final deleteSurroundingText(II)Z
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ܽᩴۙ;->᩷:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    .line 63
    iget-object v1, p0, Ll/ܽᩴۙ;->ۙ:Ll/ܺᩴۙ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 87
    invoke-static {p0, v0, p1, p2, v1}, Ll/֫᩸ۙ;->ۙ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 65
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ܽᩴۙ;->᩷:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    .line 71
    iget-object v1, p0, Ll/ܽᩴۙ;->ۙ:Ll/ܺᩴۙ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 87
    invoke-static {p0, v0, p1, p2, v1}, Ll/֫᩸ۙ;->ۙ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 73
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method
