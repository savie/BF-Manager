.class public final Ll/ۧᩴۙ;
.super Ljava/lang/Object;
.source "7B23"


# instance fields
.field public final ۙ:Landroid/widget/EditText;

.field public final ᩷:Ll/᩶ᩴۙ;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Ll/ۧᩴۙ;->ۙ:Landroid/widget/EditText;

    .line 107
    new-instance v0, Ll/᩶ᩴۙ;

    invoke-direct {v0, p1}, Ll/᩶ᩴۙ;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ll/ۧᩴۙ;->᩷:Ll/᩶ᩴۙ;

    .line 108
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 109
    invoke-static {}, Ll/᩻ᩴۙ;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public static ۙ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 153
    instance-of v0, p0, Ll/᩵ᩴۙ;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 162
    :cond_1
    instance-of v0, p0, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p0

    .line 168
    :cond_2
    new-instance v0, Ll/᩵ᩴۙ;

    invoke-direct {v0, p0}, Ll/᩵ᩴۙ;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method


# virtual methods
.method public final ۙ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 187
    :cond_0
    instance-of v0, p1, Ll/ܽᩴۙ;

    if-eqz v0, :cond_1

    return-object p1

    .line 192
    :cond_1
    new-instance v0, Ll/ܽᩴۙ;

    iget-object v1, p0, Ll/ۧᩴۙ;->ۙ:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, Ll/ܽᩴۙ;-><init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ۧᩴۙ;->᩷:Ll/᩶ᩴۙ;

    invoke-virtual {v0, p1}, Ll/᩶ᩴۙ;->ۙ(Z)V

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ۧᩴۙ;->᩷:Ll/᩶ᩴۙ;

    invoke-virtual {v0}, Ll/᩶ᩴۙ;->ۙ()Z

    move-result v0

    return v0
.end method
