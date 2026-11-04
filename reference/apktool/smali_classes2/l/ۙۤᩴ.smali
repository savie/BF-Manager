.class public final Ll/ۙۤᩴ;
.super Ljava/lang/Object;
.source "SIRR"


# direct methods
.method public static ۙ(Ll/᩹ۖ᩸;)V
    .locals 3

    .line 20
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    .line 21
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/InputFilter;

    .line 22
    array-length v0, v0

    new-instance v2, Ll/۬᩷ᩴ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    aput-object v2, v1, v0

    .line 25
    invoke-virtual {p0, v1}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    .line 26
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    const v1, 0xc350

    if-le v0, v1, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
