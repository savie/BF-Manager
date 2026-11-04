.class public final Ll/ᩴᩴܳ;
.super Ljava/lang/Object;
.source "1599"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ܿ:Ll/ۨ᩷ܳ;

.field public final synthetic ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴᩴܳ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ᩴᩴܳ;->᩶:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/ᩴᩴܳ;->ܿ:Ll/ۨ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 78
    iget-object p1, p0, Ll/ᩴᩴܳ;->ܿ:Ll/ۨ᩷ܳ;

    .line 1234
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->᩸()I

    move-result p1

    .line 78
    iget-object v0, p0, Ll/ᩴᩴܳ;->ܰ:Ll/᩹ۖ᩸;

    iget-object v1, p0, Ll/ᩴᩴܳ;->᩶:Ll/᩹ۖ᩸;

    invoke-static {v0, v1, p1}, Ll/ܳᩴܳ;->ۙ(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;I)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
