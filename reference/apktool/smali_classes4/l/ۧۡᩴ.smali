.class public final Ll/ۧۡᩴ;
.super Ljava/lang/Object;
.source "36IP"

# interfaces
.implements Ljava/util/function/Consumer;
.implements Landroid/text/TextWatcher;


# instance fields
.field public ܰ:I

.field public final ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Ll/᩹ۖ᩸;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 84
    iput v0, p0, Ll/ۧۡᩴ;->ܰ:I

    .line 87
    iput-object p1, p0, Ll/ۧۡᩴ;->᩶:Ll/᩹ۖ᩸;

    .line 88
    invoke-virtual {p1, p0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 89
    new-instance v0, Ll/֫ۡᩴ;

    invoke-direct {v0, p0}, Ll/֫ۡᩴ;-><init>(Ll/ۧۡᩴ;)V

    invoke-virtual {p1, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/ۧ᩷ᩴ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۧۡᩴ;II)V
    .locals 1

    .line 90
    iget v0, p0, Ll/ۧۡᩴ;->ܰ:I

    if-ne p1, v0, :cond_1

    add-int/lit8 v0, v0, 0x1

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 p1, -0x1

    iput p1, p0, Ll/ۧۡᩴ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 82
    check-cast p1, Ljava/lang/String;

    .line 95
    iget-object v0, p0, Ll/ۧۡᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    .line 96
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 97
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 98
    iget v5, p0, Ll/ۧۡᩴ;->ܰ:I

    if-ltz v5, :cond_0

    if-ne v2, v5, :cond_0

    add-int/lit8 v6, v5, 0x1

    if-ne v4, v6, :cond_0

    add-int/lit8 v2, v5, 0x2

    move v4, v2

    :cond_0
    const/4 v5, -0x1

    .line 102
    iput v5, p0, Ll/ۧۡᩴ;->ܰ:I

    .line 103
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 104
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const-string v6, "{N}"

    .line 105
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "{zN}"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    const/4 v3, 0x1

    .line 106
    :cond_2
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v4, 0x4e

    if-eqz v3, :cond_3

    const/16 v6, 0x31

    invoke-virtual {p1, v4, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_3
    move-object v6, p1

    :goto_0
    invoke-interface {v1, v5, v2, v6}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    if-eqz v3, :cond_4

    .line 109
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    add-int/2addr p1, v5

    add-int/lit8 v1, p1, 0x1

    .line 110
    invoke-virtual {v0, p1, v1}, Ll/᩹ۖ᩸;->ۧ(II)V

    .line 111
    iput p1, p0, Ll/ۧۡᩴ;->ܰ:I

    return-void

    .line 113
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v5

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void
.end method

.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    const/4 p1, -0x1

    .line 120
    iput p1, p0, Ll/ۧۡᩴ;->ܰ:I

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
